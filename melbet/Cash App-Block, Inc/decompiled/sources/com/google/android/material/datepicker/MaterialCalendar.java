package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.TooltipCompat$Api26Impl;
import androidx.core.provider.CallbackWrapper$2;
import androidx.core.util.Pair;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.AdapterHelper;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.tasks.zzb;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.timepicker.ClockFaceView;
import com.google.mlkit.vision.text.internal.zzr;
import com.squareup.cash.support.chat.views.ChatView;
import com.stripe.hcaptcha.HCaptcha;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class MaterialCalendar<S> extends PickerFragment {
    public AccessibilityManager accessibilityManager;
    public CalendarConstraints calendarConstraints;
    public int calendarSelector;
    public HCaptcha calendarStyle;
    public Month current;
    public SingleDateSelector dateSelector;
    public View dayFrame;
    public boolean isFullscreen;
    public MaterialButton monthDropSelect;
    public View monthNext;
    public View monthPrev;
    public PagerSnapHelper pagerSnapHelper;
    public RecyclerView recyclerView;
    public int themeResId;
    public View yearFrame;
    public RecyclerView yearSelector;

    public static boolean access$400(MaterialCalendar materialCalendar, boolean z) {
        Month month;
        if (materialCalendar.isFullscreen) {
            return false;
        }
        RecyclerView recyclerView = materialCalendar.recyclerView;
        if (recyclerView.mScrollState != 0) {
            return true;
        }
        MonthsPagerAdapter monthsPagerAdapter = (MonthsPagerAdapter) recyclerView.mAdapter;
        if (monthsPagerAdapter == null || (month = materialCalendar.current) == null) {
            return false;
        }
        int position = monthsPagerAdapter.getPosition(month) + (z ? 1 : -1);
        if (position < 0 || position >= monthsPagerAdapter.calendarConstraints.monthSpan) {
            return false;
        }
        monthsPagerAdapter.keyboardFocusDirection = z ? 2 : 1;
        materialCalendar.setCurrentMonth(monthsPagerAdapter.getPageMonth(position));
        return true;
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    public final void addOnSelectionChangedListener(MaterialDatePicker.AnonymousClass2 anonymousClass2) {
        this.onSelectionChangedListeners.add(anonymousClass2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.themeResId = bundle.getInt("THEME_RES_ID_KEY");
        this.dateSelector = (SingleDateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.calendarConstraints = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
            this.current = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
        } else {
            a$$ExternalSyntheticBUOutline0.m$1();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        final int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.themeResId);
        this.calendarStyle = new HCaptcha(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.accessibilityManager = (AccessibilityManager) requireContext().getSystemService("accessibility");
        Month month = this.calendarConstraints.start;
        boolean readMaterialCalendarStyleBoolean = MaterialDatePicker.readMaterialCalendarStyleBoolean(contextThemeWrapper, R.attr.windowFullscreen);
        this.isFullscreen = readMaterialCalendarStyleBoolean;
        final int i3 = 0;
        final int i4 = 1;
        if (readMaterialCalendarStyleBoolean) {
            i = com.squareup.cash.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = com.squareup.cash.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.squareup.cash.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.squareup.cash.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.squareup.cash.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.squareup.cash.R.dimen.mtrl_calendar_days_of_week_height);
        int i5 = MonthAdapter.MAXIMUM_WEEKS;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.squareup.cash.R.dimen.mtrl_calendar_month_vertical_padding) * (i5 - 1)) + (resources.getDimensionPixelSize(com.squareup.cash.R.dimen.mtrl_calendar_day_height) * i5) + resources.getDimensionPixelOffset(com.squareup.cash.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(com.squareup.cash.R.id.mtrl_calendar_days_of_week);
        int i6 = 3;
        ViewCompat.setAccessibilityDelegate(gridView, new TextInputLayout.AnonymousClass2(i6));
        int i7 = this.calendarConstraints.firstDayOfWeek;
        gridView.setAdapter((ListAdapter) (i7 > 0 ? new DaysOfWeekAdapter(i7) : new DaysOfWeekAdapter()));
        gridView.setNumColumns(month.daysInWeek);
        gridView.setEnabled(false);
        this.recyclerView = (RecyclerView) inflate.findViewById(com.squareup.cash.R.id.mtrl_calendar_months);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), i2) { // from class: com.google.android.material.datepicker.MaterialCalendar.2
            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public final void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr) {
                int i8 = i2;
                MaterialCalendar materialCalendar = MaterialCalendar.this;
                if (i8 == 0) {
                    iArr[0] = materialCalendar.recyclerView.getWidth();
                    iArr[1] = materialCalendar.recyclerView.getWidth();
                } else {
                    iArr[0] = materialCalendar.recyclerView.getHeight();
                    iArr[1] = materialCalendar.recyclerView.getHeight();
                }
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i8) {
                CarouselLayoutManager.AnonymousClass1 anonymousClass1 = new CarouselLayoutManager.AnonymousClass1(recyclerView.getContext(), 2);
                anonymousClass1.mTargetPosition = i8;
                startSmoothScroll(anonymousClass1);
            }
        });
        this.recyclerView.setTag("MONTHS_VIEW_GROUP_TAG");
        int i8 = 4;
        final MonthsPagerAdapter monthsPagerAdapter = new MonthsPagerAdapter(contextThemeWrapper, this.dateSelector, this.calendarConstraints, new zzb(this, 28), new zzr(this, i8));
        this.recyclerView.setAdapter(monthsPagerAdapter);
        int integer = contextThemeWrapper.getResources().getInteger(com.squareup.cash.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(com.squareup.cash.R.id.mtrl_calendar_year_selector_frame);
        this.yearSelector = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.yearSelector.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.yearSelector.setAdapter(new YearGridAdapter(this));
            this.yearSelector.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.google.android.material.datepicker.MaterialCalendar.6
                public final Calendar startItem = UtcDates.getUtcCalendarOf(null);
                public final Calendar endItem = UtcDates.getUtcCalendarOf(null);

                @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
                public final void onDraw(Canvas canvas, RecyclerView recyclerView2, RecyclerView.State state) {
                    RecyclerView.Adapter adapter = recyclerView2.mAdapter;
                    if (adapter instanceof YearGridAdapter) {
                        RecyclerView.LayoutManager layoutManager = recyclerView2.mLayout;
                        if (layoutManager instanceof GridLayoutManager) {
                            MaterialCalendar materialCalendar = ((YearGridAdapter) adapter).materialCalendar;
                            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                            MaterialCalendar materialCalendar2 = MaterialCalendar.this;
                            materialCalendar2.dateSelector.getClass();
                            Iterator it = new ArrayList().iterator();
                            while (it.hasNext()) {
                                Pair pair = (Pair) it.next();
                                Object obj = pair.first;
                                if (obj != null && pair.second != null) {
                                    long longValue = ((Long) obj).longValue();
                                    Calendar calendar = this.startItem;
                                    calendar.setTimeInMillis(longValue);
                                    long longValue2 = ((Long) pair.second).longValue();
                                    Calendar calendar2 = this.endItem;
                                    calendar2.setTimeInMillis(longValue2);
                                    int i9 = calendar.get(1) - materialCalendar.calendarConstraints.start.year;
                                    int i10 = calendar2.get(1) - materialCalendar.calendarConstraints.start.year;
                                    View findViewByPosition = gridLayoutManager.findViewByPosition(i9);
                                    View findViewByPosition2 = gridLayoutManager.findViewByPosition(i10);
                                    int i11 = gridLayoutManager.mSpanCount;
                                    int i12 = i9 / i11;
                                    int i13 = i10 / i11;
                                    for (int i14 = i12; i14 <= i13; i14++) {
                                        View findViewByPosition3 = gridLayoutManager.findViewByPosition(gridLayoutManager.mSpanCount * i14);
                                        if (findViewByPosition3 != null) {
                                            int top = findViewByPosition3.getTop() + ((Rect) ((AdapterHelper) materialCalendar2.calendarStyle.onFailureListeners).mUpdateOpPool).top;
                                            int bottom = findViewByPosition3.getBottom() - ((Rect) ((AdapterHelper) materialCalendar2.calendarStyle.onFailureListeners).mUpdateOpPool).bottom;
                                            canvas.drawRect((i14 != i12 || findViewByPosition == null) ? 0 : (findViewByPosition.getWidth() / 2) + findViewByPosition.getLeft(), top, (i14 != i13 || findViewByPosition2 == null) ? recyclerView2.getWidth() : (findViewByPosition2.getWidth() / 2) + findViewByPosition2.getLeft(), bottom, (Paint) materialCalendar2.calendarStyle.captchaVerifier);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            });
        }
        if (!this.isFullscreen) {
            PagerSnapHelper pagerSnapHelper = new PagerSnapHelper();
            this.pagerSnapHelper = pagerSnapHelper;
            pagerSnapHelper.attachToRecyclerView(this.recyclerView);
        }
        if (inflate.findViewById(com.squareup.cash.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(com.squareup.cash.R.id.month_navigation_fragment_toggle);
            this.monthDropSelect = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            ViewCompat.setAccessibilityDelegate(this.monthDropSelect, new ClockFaceView.AnonymousClass2(this, i6));
            View findViewById = inflate.findViewById(com.squareup.cash.R.id.month_navigation_previous);
            this.monthPrev = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            TooltipCompat$Api26Impl.setTooltipText(this.monthPrev, getString(com.squareup.cash.R.string.mtrl_picker_prev_month_tooltip));
            View findViewById2 = inflate.findViewById(com.squareup.cash.R.id.month_navigation_next);
            this.monthNext = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            TooltipCompat$Api26Impl.setTooltipText(this.monthNext, getString(com.squareup.cash.R.string.mtrl_picker_next_month_tooltip));
            this.yearFrame = inflate.findViewById(com.squareup.cash.R.id.mtrl_calendar_year_selector_frame);
            this.dayFrame = inflate.findViewById(com.squareup.cash.R.id.mtrl_calendar_day_selector_frame);
            setSelector$1(1);
            this.monthDropSelect.setText(this.current.getLongName());
            this.recyclerView.addOnScrollListener(new ChatView.AnonymousClass31(this, monthsPagerAdapter));
            this.monthDropSelect.setOnClickListener(new Toolbar.AnonymousClass4(this, 9));
            this.monthNext.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.material.datepicker.MaterialCalendar.10
                public final /* synthetic */ MaterialCalendar this$0;

                {
                    this.this$0 = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i9 = i3;
                    MonthsPagerAdapter monthsPagerAdapter2 = monthsPagerAdapter;
                    MaterialCalendar materialCalendar = this.this$0;
                    switch (i9) {
                        case 0:
                            int findFirstVisibleItemPosition = ((LinearLayoutManager) materialCalendar.recyclerView.mLayout).findFirstVisibleItemPosition();
                            monthsPagerAdapter2.keyboardFocusDirection = 2;
                            materialCalendar.setCurrentMonth(monthsPagerAdapter2.getPageMonth(findFirstVisibleItemPosition + 1));
                            break;
                        default:
                            int findLastVisibleItemPosition = ((LinearLayoutManager) materialCalendar.recyclerView.mLayout).findLastVisibleItemPosition();
                            monthsPagerAdapter2.keyboardFocusDirection = 1;
                            materialCalendar.setCurrentMonth(monthsPagerAdapter2.getPageMonth(findLastVisibleItemPosition - 1));
                            break;
                    }
                }
            });
            this.monthPrev.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.material.datepicker.MaterialCalendar.10
                public final /* synthetic */ MaterialCalendar this$0;

                {
                    this.this$0 = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i9 = i4;
                    MonthsPagerAdapter monthsPagerAdapter2 = monthsPagerAdapter;
                    MaterialCalendar materialCalendar = this.this$0;
                    switch (i9) {
                        case 0:
                            int findFirstVisibleItemPosition = ((LinearLayoutManager) materialCalendar.recyclerView.mLayout).findFirstVisibleItemPosition();
                            monthsPagerAdapter2.keyboardFocusDirection = 2;
                            materialCalendar.setCurrentMonth(monthsPagerAdapter2.getPageMonth(findFirstVisibleItemPosition + 1));
                            break;
                        default:
                            int findLastVisibleItemPosition = ((LinearLayoutManager) materialCalendar.recyclerView.mLayout).findLastVisibleItemPosition();
                            monthsPagerAdapter2.keyboardFocusDirection = 1;
                            materialCalendar.setCurrentMonth(monthsPagerAdapter2.getPageMonth(findLastVisibleItemPosition - 1));
                            break;
                    }
                }
            });
            updateNavigationButtonsEnabled(monthsPagerAdapter.getPosition(this.current));
        }
        this.recyclerView.scrollToPosition(monthsPagerAdapter.getPosition(this.current));
        ViewCompat.setAccessibilityDelegate(this.recyclerView, new TextInputLayout.AnonymousClass2(i8));
        updateAccessibilityPaneTitle(inflate);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.themeResId);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.current);
    }

    public final void setCurrentMonth(Month month) {
        MonthsPagerAdapter monthsPagerAdapter = (MonthsPagerAdapter) this.recyclerView.mAdapter;
        int position = monthsPagerAdapter.getPosition(month);
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int position2 = position - monthsPagerAdapter.getPosition(this.current);
            boolean z = Math.abs(position2) > 3;
            boolean z2 = position2 > 0;
            this.current = month;
            int i = 5;
            if (z && z2) {
                this.recyclerView.scrollToPosition(position - 3);
                this.recyclerView.post(new CallbackWrapper$2(this, position, i));
            } else {
                RecyclerView recyclerView = this.recyclerView;
                if (z) {
                    recyclerView.scrollToPosition(position + 3);
                    this.recyclerView.post(new CallbackWrapper$2(this, position, i));
                } else {
                    recyclerView.post(new CallbackWrapper$2(this, position, i));
                }
            }
        } else {
            this.current = month;
            this.recyclerView.scrollToPosition(position);
        }
        updateCurrentVisibleMonth();
        updateNavigationButtonsEnabled(position);
    }

    public final void setSelector$1(int i) {
        this.calendarSelector = i;
        if (i != 2) {
            if (i == 1) {
                this.yearFrame.setVisibility(8);
                this.dayFrame.setVisibility(0);
                this.monthPrev.setVisibility(0);
                this.monthNext.setVisibility(0);
                setCurrentMonth(this.current);
                return;
            }
            return;
        }
        RecyclerView recyclerView = this.yearSelector;
        recyclerView.mLayout.scrollToPosition(this.current.year - ((YearGridAdapter) recyclerView.mAdapter).materialCalendar.calendarConstraints.start.year);
        this.yearFrame.setVisibility(0);
        this.dayFrame.setVisibility(8);
        this.monthPrev.setVisibility(8);
        this.monthNext.setVisibility(8);
    }

    public final void updateAccessibilityPaneTitle(View view) {
        if (view == null) {
            return;
        }
        int i = this.calendarSelector;
        if (i == 2) {
            ViewCompat.setAccessibilityPaneTitle(view, getString(com.squareup.cash.R.string.mtrl_picker_pane_title_year_view));
        } else if (i == 1) {
            ViewCompat.setAccessibilityPaneTitle(view, getString(com.squareup.cash.R.string.mtrl_picker_pane_title_calendar_view));
        }
    }

    public final void updateCurrentVisibleMonth() {
        Month month;
        MonthsPagerAdapter monthsPagerAdapter = (MonthsPagerAdapter) this.recyclerView.mAdapter;
        if (monthsPagerAdapter == null || this.isFullscreen || (month = this.current) == null || month.equals(monthsPagerAdapter.visibleMonth)) {
            return;
        }
        int position = monthsPagerAdapter.getPosition(monthsPagerAdapter.visibleMonth);
        monthsPagerAdapter.visibleMonth = month;
        int position2 = monthsPagerAdapter.getPosition(month);
        monthsPagerAdapter.notifyItemChanged(position);
        monthsPagerAdapter.notifyItemChanged(position2);
    }

    public final void updateNavigationButtonsEnabled(int i) {
        View view = this.monthNext;
        if (view != null) {
            view.setEnabled(i + 1 < this.recyclerView.mAdapter.getItemCount());
        }
        View view2 = this.monthPrev;
        if (view2 != null) {
            view2.setEnabled(i - 1 >= 0);
        }
    }
}

package com.squareup.cash.investing.components.categories;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.foundation.lazy.LazyListState$$ExternalSyntheticLambda3;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.db.EnumListAdapter$encode$1;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda10;
import com.squareup.cash.investing.components.news.NewsArticleAdapter$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.viewmodels.categories.FilterSubFiltersViewEvent;
import com.squareup.cash.investing.viewmodels.categories.FilterSubFiltersViewModel;
import com.squareup.cash.investing.viewmodels.categories.SubFilterViewModel;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.theming.PressKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.OutsideTapCloses;
import com.squareup.cash.ui.drawable.DividerDrawable;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.YInt;
import com.squareup.protos.franklin.common.SyncInvestmentFilterGroup;
import com.squareup.util.Strings;
import com.squareup.wire.ByteArrayProtoReader32;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda39;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InvestingFilterSubFiltersView extends ContourLayout implements OutsideTapCloses, Ui {
    public static final /* synthetic */ int $r8$clinit = 0;
    public Ui.EventReceiver eventReceiver;
    public final LinearLayout optionsView;
    public final MooncakePillButton resetView;
    public final MooncakePillButton submitView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingFilterSubFiltersView(Context context) {
        super(context);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        LinearLayout linearLayout = new LinearLayout(context);
        final int i = 1;
        linearLayout.setOrientation(1);
        linearLayout.setShowDividers(6);
        linearLayout.setDividerDrawable(new DividerDrawable(colorPalette.hairline));
        this.optionsView = linearLayout;
        MooncakePillButton.Size size = MooncakePillButton.Size.LARGE;
        MooncakePillButton mooncakePillButton = new MooncakePillButton(context, null, size, MooncakePillButton.Style.TERTIARY, 2, null);
        final int i2 = 0;
        mooncakePillButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.investing.components.categories.InvestingFilterSubFiltersView$$ExternalSyntheticLambda0
            public final /* synthetic */ InvestingFilterSubFiltersView f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                InvestingFilterSubFiltersView investingFilterSubFiltersView = this.f$0;
                switch (i3) {
                    case 0:
                        Ui.EventReceiver eventReceiver = investingFilterSubFiltersView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(FilterSubFiltersViewEvent.ResetClick.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    default:
                        Ui.EventReceiver eventReceiver2 = investingFilterSubFiltersView.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(FilterSubFiltersViewEvent.SubmitClick.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                }
            }
        });
        this.resetView = mooncakePillButton;
        MooncakePillButton mooncakePillButton2 = new MooncakePillButton(context, null, size, MooncakePillButton.Style.PRIMARY, 2, null);
        mooncakePillButton2.setEnabled(false);
        mooncakePillButton2.setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.investing.components.categories.InvestingFilterSubFiltersView$$ExternalSyntheticLambda0
            public final /* synthetic */ InvestingFilterSubFiltersView f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                InvestingFilterSubFiltersView investingFilterSubFiltersView = this.f$0;
                switch (i3) {
                    case 0:
                        Ui.EventReceiver eventReceiver = investingFilterSubFiltersView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(FilterSubFiltersViewEvent.ResetClick.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    default:
                        Ui.EventReceiver eventReceiver2 = investingFilterSubFiltersView.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(FilterSubFiltersViewEvent.SubmitClick.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                }
            }
        });
        this.submitView = mooncakePillButton2;
        contourHeightOf(new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingFilterSubFiltersView$$ExternalSyntheticLambda2
            public final /* synthetic */ InvestingFilterSubFiltersView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = i2;
                InvestingFilterSubFiltersView investingFilterSubFiltersView = this.f$0;
                switch (i3) {
                    case 0:
                        return new YInt(investingFilterSubFiltersView.getDip(20) + investingFilterSubFiltersView.m3810bottomdBGyhoQ(investingFilterSubFiltersView.submitView));
                    case 1:
                        int i4 = InvestingFilterSubFiltersView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingFilterSubFiltersView.m3814getYdipdBGyhoQ(24) + investingFilterSubFiltersView.m3810bottomdBGyhoQ(investingFilterSubFiltersView.optionsView));
                    default:
                        int i5 = InvestingFilterSubFiltersView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingFilterSubFiltersView.m3814getYdipdBGyhoQ(24) + investingFilterSubFiltersView.m3810bottomdBGyhoQ(investingFilterSubFiltersView.resetView));
                }
            }
        });
        ContourLayout.layoutBy$default(this, linearLayout, ContourLayout.matchParentX(0, 0), ContourLayout.topTo(new NewsArticleAdapter$$ExternalSyntheticLambda1(4)));
        ContourLayout.layoutBy$default(this, mooncakePillButton, ContourLayout.matchParentX(getDip(24), getDip(24)), ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingFilterSubFiltersView$$ExternalSyntheticLambda2
            public final /* synthetic */ InvestingFilterSubFiltersView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = i;
                InvestingFilterSubFiltersView investingFilterSubFiltersView = this.f$0;
                switch (i3) {
                    case 0:
                        return new YInt(investingFilterSubFiltersView.getDip(20) + investingFilterSubFiltersView.m3810bottomdBGyhoQ(investingFilterSubFiltersView.submitView));
                    case 1:
                        int i4 = InvestingFilterSubFiltersView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingFilterSubFiltersView.m3814getYdipdBGyhoQ(24) + investingFilterSubFiltersView.m3810bottomdBGyhoQ(investingFilterSubFiltersView.optionsView));
                    default:
                        int i5 = InvestingFilterSubFiltersView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingFilterSubFiltersView.m3814getYdipdBGyhoQ(24) + investingFilterSubFiltersView.m3810bottomdBGyhoQ(investingFilterSubFiltersView.resetView));
                }
            }
        }));
        final int i3 = 2;
        ContourLayout.layoutBy$default(this, mooncakePillButton2, ContourLayout.matchParentX(getDip(24), getDip(24)), ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.investing.components.categories.InvestingFilterSubFiltersView$$ExternalSyntheticLambda2
            public final /* synthetic */ InvestingFilterSubFiltersView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i3;
                InvestingFilterSubFiltersView investingFilterSubFiltersView = this.f$0;
                switch (i32) {
                    case 0:
                        return new YInt(investingFilterSubFiltersView.getDip(20) + investingFilterSubFiltersView.m3810bottomdBGyhoQ(investingFilterSubFiltersView.submitView));
                    case 1:
                        int i4 = InvestingFilterSubFiltersView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingFilterSubFiltersView.m3814getYdipdBGyhoQ(24) + investingFilterSubFiltersView.m3810bottomdBGyhoQ(investingFilterSubFiltersView.optionsView));
                    default:
                        int i5 = InvestingFilterSubFiltersView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(investingFilterSubFiltersView.m3814getYdipdBGyhoQ(24) + investingFilterSubFiltersView.m3810bottomdBGyhoQ(investingFilterSubFiltersView.resetView));
                }
            }
        }));
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(FilterSubFiltersViewModel filterSubFiltersViewModel) {
        Iterator it;
        int i;
        Object obj;
        ContourLayout investingSubFilterIncremental;
        InvestingFilterSubFiltersView investingFilterSubFiltersView = this;
        filterSubFiltersViewModel.getClass();
        if (filterSubFiltersViewModel instanceof FilterSubFiltersViewModel.Content) {
            FilterSubFiltersViewModel.Content content = (FilterSubFiltersViewModel.Content) filterSubFiltersViewModel;
            List<SubFilterViewModel> list = content.options;
            investingFilterSubFiltersView.resetView.setText(content.resetLabel);
            String str = content.submitLabel;
            MooncakePillButton mooncakePillButton = investingFilterSubFiltersView.submitView;
            mooncakePillButton.setText(str);
            mooncakePillButton.setEnabled(content.submitEnabled);
            LinearLayout linearLayout = investingFilterSubFiltersView.optionsView;
            if (linearLayout.getChildCount() != list.size()) {
                linearLayout.removeAllViews();
                for (SubFilterViewModel subFilterViewModel : list) {
                    if (subFilterViewModel instanceof SubFilterViewModel.SubFilterSelectionViewModel) {
                        Context context = investingFilterSubFiltersView.getContext();
                        context.getClass();
                        investingSubFilterIncremental = new InvestingSubFilterSelection(context);
                    } else if (!(subFilterViewModel instanceof SubFilterViewModel.SubFilterIncrementalViewModel)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    } else {
                        Context context2 = investingFilterSubFiltersView.getContext();
                        context2.getClass();
                        investingSubFilterIncremental = new InvestingSubFilterIncremental(context2);
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                    marginLayoutParams.leftMargin = investingSubFilterIncremental.getDip(24);
                    marginLayoutParams.rightMargin = investingSubFilterIncremental.getDip(24);
                    marginLayoutParams.topMargin = investingSubFilterIncremental.getDip(28);
                    marginLayoutParams.bottomMargin = investingSubFilterIncremental.getDip(33);
                    investingSubFilterIncremental.setLayoutParams(marginLayoutParams);
                    linearLayout.addView(investingSubFilterIncremental);
                }
            }
            Iterator it2 = list.iterator();
            int i2 = 0;
            LinearLayout linearLayout2 = linearLayout;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                SubFilterViewModel subFilterViewModel2 = (SubFilterViewModel) next;
                if (subFilterViewModel2 instanceof SubFilterViewModel.SubFilterIncrementalViewModel) {
                    View childAt = linearLayout2.getChildAt(i2);
                    childAt.getClass();
                    final InvestingSubFilterIncremental investingSubFilterIncremental2 = (InvestingSubFilterIncremental) childAt;
                    SubFilterViewModel.SubFilterIncrementalViewModel subFilterIncrementalViewModel = (SubFilterViewModel.SubFilterIncrementalViewModel) subFilterViewModel2;
                    List list2 = subFilterIncrementalViewModel.options;
                    Ui.EventReceiver eventReceiver = investingFilterSubFiltersView.eventReceiver;
                    if (eventReceiver == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    }
                    EnumListAdapter$encode$1 enumListAdapter$encode$1 = new EnumListAdapter$encode$1(1, eventReceiver, Ui.EventReceiver.class, "sendEvent", "sendEvent(Ljava/lang/Object;)V", 0, 19);
                    ColorPalette colorPalette = investingSubFilterIncremental2.colorPalette;
                    AppCompatTextView appCompatTextView = investingSubFilterIncremental2.selectionView;
                    AppCompatImageButton appCompatImageButton = investingSubFilterIncremental2.incrementButton;
                    AppCompatImageButton appCompatImageButton2 = investingSubFilterIncremental2.decrementButton;
                    ArrayList arrayList = new ArrayList();
                    boolean z = subFilterIncrementalViewModel.incrementButtonEnabled;
                    boolean z2 = subFilterIncrementalViewModel.decrementButtonEnabled;
                    arrayList.addAll(list2);
                    int i4 = subFilterIncrementalViewModel.placeholderIndex;
                    it = it2;
                    String str2 = subFilterIncrementalViewModel.placeholderText;
                    arrayList.add(i4, str2);
                    i = i3;
                    investingSubFilterIncremental2.titleView.setText(subFilterIncrementalViewModel.title);
                    Iterator it3 = list2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it3.next();
                        Iterator it4 = it3;
                        if (Intrinsics.areEqual(((SyncInvestmentFilterGroup.SubfilterOption) obj).token, subFilterIncrementalViewModel.selectedOptionToken)) {
                            break;
                        } else {
                            it3 = it4;
                        }
                    }
                    SyncInvestmentFilterGroup.SubfilterOption subfilterOption = (SyncInvestmentFilterGroup.SubfilterOption) obj;
                    if (subfilterOption != null) {
                        appCompatTextView.setText(subfilterOption.name);
                        appCompatTextView.setTextColor(colorPalette.label);
                        investingSubFilterIncremental2.selectedIndex = Integer.valueOf(arrayList.indexOf(subfilterOption));
                    } else {
                        appCompatTextView.setText(str2);
                        appCompatTextView.setTextColor(colorPalette.placeholderLabel);
                        investingSubFilterIncremental2.selectedIndex = null;
                    }
                    appCompatImageButton2.setEnabled(z2);
                    if (z2) {
                        investingSubFilterIncremental2.decrementOnClick = new InvestingSubFilterIncremental$$ExternalSyntheticLambda14(investingSubFilterIncremental2, subFilterIncrementalViewModel, arrayList, enumListAdapter$encode$1);
                        if (!appCompatImageButton2.hasOnClickListeners()) {
                            final int i5 = 0;
                            appCompatImageButton2.setOnClickListener(new View.OnClickListener() { // from class: com.squareup.cash.investing.components.categories.InvestingSubFilterIncremental$$ExternalSyntheticLambda15
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i6 = i5;
                                    InvestingSubFilterIncremental investingSubFilterIncremental3 = investingSubFilterIncremental2;
                                    switch (i6) {
                                        case 0:
                                            InvestingSubFilterIncremental$$ExternalSyntheticLambda14 investingSubFilterIncremental$$ExternalSyntheticLambda14 = investingSubFilterIncremental3.decrementOnClick;
                                            investingSubFilterIncremental$$ExternalSyntheticLambda14.getClass();
                                            view.getClass();
                                            investingSubFilterIncremental$$ExternalSyntheticLambda14.invoke(view);
                                            break;
                                        default:
                                            InvestingSubFilterIncremental$$ExternalSyntheticLambda14 investingSubFilterIncremental$$ExternalSyntheticLambda142 = investingSubFilterIncremental3.incrementOnClick;
                                            investingSubFilterIncremental$$ExternalSyntheticLambda142.getClass();
                                            view.getClass();
                                            investingSubFilterIncremental$$ExternalSyntheticLambda142.invoke(view);
                                            break;
                                    }
                                }
                            });
                        }
                    } else {
                        appCompatImageButton2.setOnClickListener(null);
                        appCompatImageButton2.setClickable(false);
                        investingSubFilterIncremental2.decrementOnClick = null;
                    }
                    appCompatImageButton.setEnabled(z);
                    if (z) {
                        investingSubFilterIncremental2.incrementOnClick = new InvestingSubFilterIncremental$$ExternalSyntheticLambda14(arrayList, investingSubFilterIncremental2, subFilterIncrementalViewModel, enumListAdapter$encode$1);
                        if (!appCompatImageButton.hasOnClickListeners()) {
                            final int i6 = 1;
                            appCompatImageButton.setOnClickListener(new View.OnClickListener() { // from class: com.squareup.cash.investing.components.categories.InvestingSubFilterIncremental$$ExternalSyntheticLambda15
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i62 = i6;
                                    InvestingSubFilterIncremental investingSubFilterIncremental3 = investingSubFilterIncremental2;
                                    switch (i62) {
                                        case 0:
                                            InvestingSubFilterIncremental$$ExternalSyntheticLambda14 investingSubFilterIncremental$$ExternalSyntheticLambda14 = investingSubFilterIncremental3.decrementOnClick;
                                            investingSubFilterIncremental$$ExternalSyntheticLambda14.getClass();
                                            view.getClass();
                                            investingSubFilterIncremental$$ExternalSyntheticLambda14.invoke(view);
                                            break;
                                        default:
                                            InvestingSubFilterIncremental$$ExternalSyntheticLambda14 investingSubFilterIncremental$$ExternalSyntheticLambda142 = investingSubFilterIncremental3.incrementOnClick;
                                            investingSubFilterIncremental$$ExternalSyntheticLambda142.getClass();
                                            view.getClass();
                                            investingSubFilterIncremental$$ExternalSyntheticLambda142.invoke(view);
                                            break;
                                    }
                                }
                            });
                        }
                    } else {
                        appCompatImageButton.setOnClickListener(null);
                        appCompatImageButton.setClickable(false);
                        investingSubFilterIncremental2.incrementOnClick = null;
                    }
                } else {
                    it = it2;
                    i = i3;
                    if (!(subFilterViewModel2 instanceof SubFilterViewModel.SubFilterSelectionViewModel)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    View childAt2 = linearLayout2.getChildAt(i2);
                    childAt2.getClass();
                    InvestingSubFilterSelection investingSubFilterSelection = (InvestingSubFilterSelection) childAt2;
                    SubFilterViewModel.SubFilterSelectionViewModel subFilterSelectionViewModel = (SubFilterViewModel.SubFilterSelectionViewModel) subFilterViewModel2;
                    Ui.EventReceiver eventReceiver2 = investingFilterSubFiltersView.eventReceiver;
                    if (eventReceiver2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    }
                    EnumListAdapter$encode$1 enumListAdapter$encode$12 = new EnumListAdapter$encode$1(1, eventReceiver2, Ui.EventReceiver.class, "sendEvent", "sendEvent(Ljava/lang/Object;)V", 0, 20);
                    ColorPalette colorPalette2 = investingSubFilterSelection.colorPalette;
                    investingSubFilterSelection.titleView.setText(subFilterSelectionViewModel.title);
                    int i7 = 0;
                    linearLayout2 = linearLayout2;
                    for (Object obj2 : subFilterSelectionViewModel.options) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        SyncInvestmentFilterGroup.SubfilterOption subfilterOption2 = (SyncInvestmentFilterGroup.SubfilterOption) obj2;
                        int i9 = colorPalette2.tint;
                        int i10 = colorPalette2.secondaryButtonBackground;
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(investingSubFilterSelection.getContext());
                        ColorStateList valueOf = ColorStateList.valueOf(PressKt.pressColor$default(ThemeHelpersKt.themeInfo(investingSubFilterSelection), Integer.valueOf(i10), 2));
                        valueOf.getClass();
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setColor(i10);
                        float f = investingSubFilterSelection.density * 24.0f;
                        gradientDrawable.setCornerRadius(f);
                        GradientDrawable gradientDrawable2 = new GradientDrawable();
                        LinearLayout linearLayout3 = linearLayout2;
                        gradientDrawable2.setColor(-16777216);
                        gradientDrawable2.setCornerRadius(f);
                        GradientDrawable gradientDrawable3 = new GradientDrawable();
                        gradientDrawable3.setColor(i10);
                        gradientDrawable3.setCornerRadius(f);
                        gradientDrawable3.setStroke(investingSubFilterSelection.getDip(3), i9);
                        RippleDrawable rippleDrawable = new RippleDrawable(valueOf, gradientDrawable, gradientDrawable2);
                        RippleDrawable rippleDrawable2 = new RippleDrawable(valueOf, gradientDrawable3, gradientDrawable2);
                        StateListDrawable stateListDrawable = new StateListDrawable();
                        stateListDrawable.addState(new int[]{R.attr.state_selected}, rippleDrawable2);
                        stateListDrawable.addState(new int[0], rippleDrawable);
                        appCompatTextView2.setBackground(stateListDrawable);
                        appCompatTextView2.setGravity(17);
                        Strings.applyStyle(appCompatTextView2, TextStyles.smallTitle);
                        appCompatTextView2.setTextColor(colorPalette2.label);
                        appCompatTextView2.setOnClickListener(new BottomSheet$$ExternalSyntheticLambda0(25, investingSubFilterSelection, appCompatTextView2));
                        appCompatTextView2.setText(subfilterOption2.name);
                        appCompatTextView2.setSelected(Intrinsics.areEqual(subfilterOption2.token, subFilterSelectionViewModel.selectedOptionToken));
                        appCompatTextView2.setOnClickListener(new UiScreenRunner$$ExternalSyntheticLambda39(6, enumListAdapter$encode$12, subFilterSelectionViewModel, subfilterOption2));
                        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new LazyListState$$ExternalSyntheticLambda3(i7, investingSubFilterSelection, 12));
                        leftTo.widthOf(1, new GLSceneScope$$ExternalSyntheticLambda10(23, subFilterSelectionViewModel, investingSubFilterSelection));
                        ByteArrayProtoReader32 byteArrayProtoReader32 = ContourLayout.topTo(new InvestingSubFilterSelection$$ExternalSyntheticLambda3(investingSubFilterSelection, 0));
                        byteArrayProtoReader32.heightOf(1, new InvestingSubFilterSelection$$ExternalSyntheticLambda3(investingSubFilterSelection, 1));
                        ContourLayout.layoutBy$default(investingSubFilterSelection, appCompatTextView2, leftTo, byteArrayProtoReader32);
                        i7 = i8;
                        linearLayout2 = linearLayout3;
                    }
                }
                investingFilterSubFiltersView = this;
                it2 = it;
                i2 = i;
                linearLayout2 = linearLayout2;
            }
        }
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.timepicker.TimePickerView;
import com.robinhood.spark.SparkView;
import com.squareup.cash.R;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public class ListPopupWindow implements ShowableListMenu {
    public ListAdapter mAdapter;
    public final Context mContext;
    public View mDropDownAnchorView;
    public int mDropDownGravity;
    public final int mDropDownHeight;
    public int mDropDownHorizontalOffset;
    public DropDownListView mDropDownList;
    public int mDropDownVerticalOffset;
    public boolean mDropDownVerticalOffsetSet;
    public int mDropDownWidth;
    public final int mDropDownWindowLayoutType;
    public Rect mEpicenterBounds;
    public final Handler mHandler;
    public final ListSelectorHider mHideSelector;
    public AdapterView.OnItemClickListener mItemClickListener;
    public AdapterView.OnItemSelectedListener mItemSelectedListener;
    public final int mListItemExpandMaximum;
    public boolean mModal;
    public SparkView.AnonymousClass2 mObserver;
    public boolean mOverlapAnchor;
    public boolean mOverlapAnchorSet;
    public final AppCompatPopupWindow mPopup;
    public final ListSelectorHider mResizePopupRunnable;
    public final PopupScrollListener mScrollListener;
    public final Rect mTempRect;
    public final TimePickerView.AnonymousClass3 mTouchInterceptor;

    public abstract class Api24Impl {
        public static int getMaxAvailableHeight(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }

    public abstract class Api29Impl {
        public static void setEpicenterBounds(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void setIsClippedToScreen(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    public final class ListSelectorHider implements Runnable {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ ListPopupWindow this$0;

        public /* synthetic */ ListSelectorHider(ListPopupWindow listPopupWindow, int i) {
            this.$r8$classId = i;
            this.this$0 = listPopupWindow;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = this.$r8$classId;
            ListPopupWindow listPopupWindow = this.this$0;
            switch (i) {
                case 0:
                    DropDownListView dropDownListView = listPopupWindow.mDropDownList;
                    if (dropDownListView != null) {
                        dropDownListView.mListSelectionHidden = true;
                        dropDownListView.requestLayout();
                        break;
                    }
                    break;
                default:
                    DropDownListView dropDownListView2 = listPopupWindow.mDropDownList;
                    if (dropDownListView2 != null && dropDownListView2.isAttachedToWindow() && listPopupWindow.mDropDownList.getCount() > listPopupWindow.mDropDownList.getChildCount() && listPopupWindow.mDropDownList.getChildCount() <= listPopupWindow.mListItemExpandMaximum) {
                        listPopupWindow.mPopup.setInputMethodMode(2);
                        listPopupWindow.show();
                        break;
                    }
                    break;
            }
        }
    }

    public final class PopupScrollListener implements AbsListView.OnScrollListener {
        public PopupScrollListener() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i) {
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            ListSelectorHider listSelectorHider = listPopupWindow.mResizePopupRunnable;
            AppCompatPopupWindow appCompatPopupWindow = listPopupWindow.mPopup;
            if (i != 1 || appCompatPopupWindow.getInputMethodMode() == 2 || appCompatPopupWindow.getContentView() == null) {
                return;
            }
            listPopupWindow.mHandler.removeCallbacks(listSelectorHider);
            listSelectorHider.run();
        }
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        this.mDropDownHeight = -2;
        this.mDropDownWidth = -2;
        this.mDropDownWindowLayoutType = IptcConstants.IMAGE_RESOURCE_BLOCK_XML_DATA;
        this.mDropDownGravity = 0;
        this.mListItemExpandMaximum = Integer.MAX_VALUE;
        int i3 = 1;
        this.mResizePopupRunnable = new ListSelectorHider(this, i3);
        this.mTouchInterceptor = new TimePickerView.AnonymousClass3(this, i3);
        this.mScrollListener = new PopupScrollListener();
        this.mHideSelector = new ListSelectorHider(this, 0);
        this.mTempRect = new Rect();
        this.mContext = context;
        this.mHandler = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ListPopupWindow, i, i2);
        this.mDropDownHorizontalOffset = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.mDropDownVerticalOffset = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.mDropDownVerticalOffsetSet = true;
        }
        obtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i, i2);
        appCompatPopupWindow.init(context, attributeSet, i, i2);
        this.mPopup = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }

    public DropDownListView createDropDownListView(Context context, boolean z) {
        return new DropDownListView(context, z);
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void dismiss() {
        AppCompatPopupWindow appCompatPopupWindow = this.mPopup;
        appCompatPopupWindow.dismiss();
        appCompatPopupWindow.setContentView(null);
        this.mDropDownList = null;
        this.mHandler.removeCallbacks(this.mResizePopupRunnable);
    }

    public final Drawable getBackground() {
        return this.mPopup.getBackground();
    }

    public final int getHorizontalOffset() {
        return this.mDropDownHorizontalOffset;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final DropDownListView getListView() {
        return this.mDropDownList;
    }

    public final int getVerticalOffset() {
        if (this.mDropDownVerticalOffsetSet) {
            return this.mDropDownVerticalOffset;
        }
        return 0;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final boolean isShowing() {
        return this.mPopup.isShowing();
    }

    public void setAdapter(ListAdapter listAdapter) {
        SparkView.AnonymousClass2 anonymousClass2 = this.mObserver;
        if (anonymousClass2 == null) {
            this.mObserver = new SparkView.AnonymousClass2(this, 1);
        } else {
            ListAdapter listAdapter2 = this.mAdapter;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(anonymousClass2);
            }
        }
        this.mAdapter = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.mObserver);
        }
        DropDownListView dropDownListView = this.mDropDownList;
        if (dropDownListView != null) {
            dropDownListView.setAdapter(this.mAdapter);
        }
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        this.mPopup.setBackgroundDrawable(drawable);
    }

    public final void setContentWidth(int i) {
        Drawable background = this.mPopup.getBackground();
        if (background == null) {
            this.mDropDownWidth = i;
            return;
        }
        Rect rect = this.mTempRect;
        background.getPadding(rect);
        this.mDropDownWidth = rect.left + rect.right + i;
    }

    public final void setHorizontalOffset(int i) {
        this.mDropDownHorizontalOffset = i;
    }

    public final void setVerticalOffset(int i) {
        this.mDropDownVerticalOffset = i;
        this.mDropDownVerticalOffsetSet = true;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void show() {
        int i;
        int paddingBottom;
        DropDownListView dropDownListView;
        DropDownListView dropDownListView2 = this.mDropDownList;
        Context context = this.mContext;
        int i2 = 1;
        AppCompatPopupWindow appCompatPopupWindow = this.mPopup;
        if (dropDownListView2 == null) {
            DropDownListView createDropDownListView = createDropDownListView(context, !this.mModal);
            this.mDropDownList = createDropDownListView;
            createDropDownListView.setAdapter(this.mAdapter);
            this.mDropDownList.setOnItemClickListener(this.mItemClickListener);
            this.mDropDownList.setFocusable(true);
            this.mDropDownList.setFocusableInTouchMode(true);
            this.mDropDownList.setOnItemSelectedListener(new SearchView.AnonymousClass9(this, i2));
            this.mDropDownList.setOnScrollListener(this.mScrollListener);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.mItemSelectedListener;
            if (onItemSelectedListener != null) {
                this.mDropDownList.setOnItemSelectedListener(onItemSelectedListener);
            }
            appCompatPopupWindow.setContentView(this.mDropDownList);
        }
        Drawable background = appCompatPopupWindow.getBackground();
        Rect rect = this.mTempRect;
        if (background != null) {
            background.getPadding(rect);
            int i3 = rect.top;
            i = rect.bottom + i3;
            if (!this.mDropDownVerticalOffsetSet) {
                this.mDropDownVerticalOffset = -i3;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int maxAvailableHeight = Api24Impl.getMaxAvailableHeight(appCompatPopupWindow, this.mDropDownAnchorView, this.mDropDownVerticalOffset, appCompatPopupWindow.getInputMethodMode() == 2);
        int i4 = this.mDropDownHeight;
        if (i4 == -1) {
            paddingBottom = maxAvailableHeight + i;
        } else {
            int i5 = this.mDropDownWidth;
            int measureHeightOfChildrenCompat = this.mDropDownList.measureHeightOfChildrenCompat(i5 != -2 ? i5 != -1 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), PKIFailureInfo.systemUnavail), maxAvailableHeight);
            paddingBottom = measureHeightOfChildrenCompat + (measureHeightOfChildrenCompat > 0 ? this.mDropDownList.getPaddingBottom() + this.mDropDownList.getPaddingTop() + i : 0);
        }
        boolean z = appCompatPopupWindow.getInputMethodMode() == 2;
        appCompatPopupWindow.setWindowLayoutType(this.mDropDownWindowLayoutType);
        if (appCompatPopupWindow.isShowing()) {
            if (this.mDropDownAnchorView.isAttachedToWindow()) {
                int i6 = this.mDropDownWidth;
                if (i6 == -1) {
                    i6 = -1;
                } else if (i6 == -2) {
                    i6 = this.mDropDownAnchorView.getWidth();
                }
                if (i4 == -1) {
                    i4 = z ? paddingBottom : -1;
                    int i7 = this.mDropDownWidth;
                    if (z) {
                        appCompatPopupWindow.setWidth(i7 == -1 ? -1 : 0);
                        appCompatPopupWindow.setHeight(0);
                    } else {
                        appCompatPopupWindow.setWidth(i7 == -1 ? -1 : 0);
                        appCompatPopupWindow.setHeight(-1);
                    }
                } else if (i4 == -2) {
                    i4 = paddingBottom;
                }
                appCompatPopupWindow.setOutsideTouchable(true);
                int i8 = i6;
                View view = this.mDropDownAnchorView;
                int i9 = this.mDropDownHorizontalOffset;
                int i10 = this.mDropDownVerticalOffset;
                int i11 = i8 < 0 ? -1 : i8;
                if (i4 < 0) {
                    i4 = -1;
                }
                appCompatPopupWindow.update(view, i9, i10, i11, i4);
                return;
            }
            return;
        }
        int i12 = this.mDropDownWidth;
        if (i12 == -1) {
            i12 = -1;
        } else if (i12 == -2) {
            i12 = this.mDropDownAnchorView.getWidth();
        }
        if (i4 == -1) {
            i4 = -1;
        } else if (i4 == -2) {
            i4 = paddingBottom;
        }
        appCompatPopupWindow.setWidth(i12);
        appCompatPopupWindow.setHeight(i4);
        Api29Impl.setIsClippedToScreen(appCompatPopupWindow, true);
        appCompatPopupWindow.setOutsideTouchable(true);
        appCompatPopupWindow.setTouchInterceptor(this.mTouchInterceptor);
        if (this.mOverlapAnchorSet) {
            appCompatPopupWindow.setOverlapAnchor(this.mOverlapAnchor);
        }
        Api29Impl.setEpicenterBounds(appCompatPopupWindow, this.mEpicenterBounds);
        appCompatPopupWindow.showAsDropDown(this.mDropDownAnchorView, this.mDropDownHorizontalOffset, this.mDropDownVerticalOffset, this.mDropDownGravity);
        this.mDropDownList.setSelection(-1);
        if ((!this.mModal || this.mDropDownList.isInTouchMode()) && (dropDownListView = this.mDropDownList) != null) {
            dropDownListView.mListSelectionHidden = true;
            dropDownListView.requestLayout();
        }
        if (this.mModal) {
            return;
        }
        this.mHandler.post(this.mHideSelector);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listPopupWindowStyle);
    }
}

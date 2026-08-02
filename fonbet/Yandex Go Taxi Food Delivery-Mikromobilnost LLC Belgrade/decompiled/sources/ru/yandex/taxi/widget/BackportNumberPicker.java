package ru.yandex.taxi.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.material.timepicker.TimeModel;
import com.google.ar.core.ImageMetadata;
import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.aj4;
import defpackage.alp0;
import defpackage.b64;
import defpackage.bj4;
import defpackage.bk;
import defpackage.d4i0;
import defpackage.g8e;
import defpackage.h2r;
import defpackage.mg;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.ri4;
import defpackage.si4;
import defpackage.ti4;
import defpackage.tpt;
import defpackage.ui4;
import defpackage.unr0;
import defpackage.upt;
import defpackage.vdh0;
import defpackage.vi4;
import defpackage.wi4;
import defpackage.xi4;
import defpackage.yi4;
import defpackage.zi4;
import defpackage.zng0;
import java.text.DecimalFormatSymbols;
import java.util.Formatter;
import java.util.Locale;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public class BackportNumberPicker extends FrameLayout {
    private static final int DEFAULT_LAYOUT_RESOURCE_ID = 0;
    private static final long DEFAULT_LONG_PRESS_UPDATE_INTERVAL = 300;
    private static final int SELECTOR_ADJUSTMENT_DURATION_MILLIS = 800;
    private static final int SELECTOR_MAX_FLING_VELOCITY_ADJUSTMENT = 8;
    private static final int SELECTOR_MIDDLE_ITEM_INDEX = 1;
    private static final int SELECTOR_WHEEL_ITEM_COUNT = 3;
    private static final int SIZE_UNSPECIFIED = -1;
    private static final int SNAP_SCROLL_DURATION = 300;
    private static final float TOP_AND_BOTTOM_FADING_EDGE_STRENGTH = 0.9f;
    private static final int UNSCALED_DEFAULT_SELECTION_DIVIDERS_DISTANCE = 48;
    private static final int UNSCALED_DEFAULT_SELECTION_DIVIDER_HEIGHT = 2;
    boolean isSelectorVisible;
    private aj4 mAccessibilityNodeController;
    private final alp0 mAdjustScroller;
    private ti4 mBeginSoftInputOnLongPressCommand;
    private int mBottomSelectionDividerBottom;
    private ui4 mChangeCurrentByOneFromLongPressCommand;
    private final boolean mComputeMaxWidth;
    private int mCurrentScrollOffset;
    private final ImageButton mDecrementButton;
    private boolean mDecrementVirtualButtonPressed;
    private String[] mDisplayedValues;
    private final alp0 mFlingScroller;
    private vi4 mFormatter;
    private final boolean mHasSelectorWheel;
    private boolean mIgnoreMoveEvents;
    private final ImageButton mIncrementButton;
    private boolean mIncrementVirtualButtonPressed;
    private int mInitialScrollOffset;
    private final EditText mInputText;
    private long mLastDownEventTime;
    private float mLastDownEventY;
    private float mLastDownOrMoveEventY;
    private int mLastHandledDownDpadKeyCode;
    private int mLastHoveredChildVirtualViewId;
    private final long mLongPressUpdateInterval;
    private final int mMaxHeight;
    private int mMaxValue;
    private int mMaxWidth;
    private final int mMaximumFlingVelocity;
    private final int mMinHeight;
    private int mMinValue;
    private final int mMinWidth;
    private final int mMinimumFlingVelocity;
    private wi4 mOnScrollListener;
    private xi4 mOnValueChangeListener;
    private final yi4 mPressedStateManager;
    private int mPreviousScrollerY;
    private int mScrollState;
    private final Drawable mSelectionDivider;
    private final int mSelectionDividerHeight;
    private final int mSelectionDividersDistance;
    private int mSelectorElementHeight;
    private final SparseArray<String> mSelectorIndexToStringCache;
    private final int[] mSelectorIndices;
    private int mSelectorTextGapHeight;
    private final Paint mSelectorWheelPaint;
    private zi4 mSetSelectionCommand;
    private boolean mShowSoftInputOnTap;
    private final int mSolidColor;
    private String[] mSpokenValues;
    private final int mTextSize;
    private int mTopSelectionDividerTop;
    private final int mTouchSlop;
    private int mValue;
    private VelocityTracker mVelocityTracker;
    private final Drawable mVirtualButtonPressedDrawable;
    private boolean mWrapSelectorWheel;
    private String selectedValueDescriptionSuffix;
    private float[] selectorCorners;
    private final Paint selectorPaint;
    private final Path selectorPath;
    private final RectF selectorRect;
    private static final bj4 sTwoDigitFormatter = new bj4();
    private static final char[] DIGIT_CHARACTERS = {MoneyInputEditView.DEFAULT_VALUE, '1', '2', '3', '4', '5', '6', '7', '8', '9', 1632, 1633, 1634, 1635, 1636, 1637, 1638, 1639, 1640, 1641, 1776, 1777, 1778, 1779, 1780, 1781, 1782, 1783, 1784, 1785};

    public static class CustomEditText extends EditText {
        public CustomEditText(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.widget.TextView
        public void onEditorAction(int i) {
            super.onEditorAction(i);
            if (i == 6) {
                clearFocus();
            }
        }
    }

    public class InputTextFilter extends NumberKeyListener {
        public InputTextFilter() {
        }

        @Override // android.text.method.NumberKeyListener, android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            if (BackportNumberPicker.this.mDisplayedValues == null) {
                CharSequence filter = super.filter(charSequence, i, i2, spanned, i3, i4);
                if (filter == null) {
                    filter = charSequence.subSequence(i, i2);
                }
                String str = String.valueOf(spanned.subSequence(0, i3)) + ((Object) filter) + ((Object) spanned.subSequence(i4, spanned.length()));
                if ("".equals(str)) {
                    return str;
                }
                if (BackportNumberPicker.this.getSelectedPos(str) <= BackportNumberPicker.this.mMaxValue) {
                    return filter;
                }
            } else {
                String valueOf = String.valueOf(charSequence.subSequence(i, i2));
                if (!TextUtils.isEmpty(valueOf)) {
                    String str2 = String.valueOf(spanned.subSequence(0, i3)) + ((Object) valueOf) + ((Object) spanned.subSequence(i4, spanned.length()));
                    String lowerCase = str2.toLowerCase(Locale.getDefault());
                    for (String str3 : BackportNumberPicker.this.mDisplayedValues) {
                        if (str3.toLowerCase(Locale.getDefault()).startsWith(lowerCase)) {
                            BackportNumberPicker.this.postSetSelectionCommand(str2.length(), str3.length());
                            return str3.subSequence(i3, str3.length());
                        }
                    }
                }
            }
            return "";
        }

        @Override // android.text.method.NumberKeyListener
        public char[] getAcceptedChars() {
            return BackportNumberPicker.DIGIT_CHARACTERS;
        }

        @Override // android.text.method.KeyListener
        public int getInputType() {
            return 1;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public static final class TextAlignment {
        private static final /* synthetic */ TextAlignment[] $VALUES;
        public static final TextAlignment CENTER;
        public static final TextAlignment END;
        public static final TextAlignment START;

        static {
            TextAlignment textAlignment = new TextAlignment("START", 0);
            START = textAlignment;
            TextAlignment textAlignment2 = new TextAlignment("CENTER", 1);
            CENTER = textAlignment2;
            TextAlignment textAlignment3 = new TextAlignment("END", 2);
            END = textAlignment3;
            $VALUES = new TextAlignment[]{textAlignment, textAlignment2, textAlignment3};
        }

        public static TextAlignment valueOf(String str) {
            return (TextAlignment) Enum.valueOf(TextAlignment.class, str);
        }

        public static TextAlignment[] values() {
            return (TextAlignment[]) $VALUES.clone();
        }
    }

    public BackportNumberPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.mLongPressUpdateInterval = 300L;
        this.mSelectorIndexToStringCache = new SparseArray<>();
        int i2 = 3;
        this.mSelectorIndices = new int[3];
        this.mInitialScrollOffset = Integer.MIN_VALUE;
        this.mScrollState = 0;
        this.mLastHandledDownDpadKeyCode = -1;
        this.selectedValueDescriptionSuffix = "";
        this.isSelectorVisible = false;
        Paint paint = new Paint();
        this.selectorPaint = paint;
        this.selectorPath = new Path();
        this.selectorRect = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d4i0.NumberPicker, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(d4i0.NumberPicker_internalLayout, 0);
        boolean z = resourceId != 0;
        this.mHasSelectorWheel = z;
        this.mSolidColor = obtainStyledAttributes.getColor(d4i0.NumberPicker_solidColor, 0);
        this.mSelectionDivider = obtainStyledAttributes.getDrawable(d4i0.NumberPicker_selectionDivider);
        this.mSelectionDividerHeight = obtainStyledAttributes.getDimensionPixelSize(d4i0.NumberPicker_selectionDividerHeight, (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics()));
        this.mSelectionDividersDistance = obtainStyledAttributes.getDimensionPixelSize(d4i0.NumberPicker_selectionDividersDistance, (int) TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics()));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(d4i0.NumberPicker_internalMinHeight, -1);
        this.mMinHeight = dimensionPixelSize;
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(d4i0.NumberPicker_internalMaxHeight, -1);
        this.mMaxHeight = dimensionPixelSize2;
        if (dimensionPixelSize != -1 && dimensionPixelSize2 != -1 && dimensionPixelSize > dimensionPixelSize2) {
            ny61.g("minHeight > maxHeight");
            throw null;
        }
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(d4i0.NumberPicker_internalMinWidth, -1);
        this.mMinWidth = dimensionPixelSize3;
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(d4i0.NumberPicker_internalMaxWidth, -1);
        this.mMaxWidth = dimensionPixelSize4;
        if (dimensionPixelSize3 != -1 && dimensionPixelSize4 != -1 && dimensionPixelSize3 > dimensionPixelSize4) {
            ny61.g("minWidth > maxWidth");
            throw null;
        }
        this.mComputeMaxWidth = dimensionPixelSize4 == -1;
        this.mVirtualButtonPressedDrawable = obtainStyledAttributes.getDrawable(d4i0.NumberPicker_virtualButtonPressedDrawable);
        obtainStyledAttributes.recycle();
        this.mPressedStateManager = new yi4(this);
        setWillNotDraw(!z);
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(resourceId, (ViewGroup) this, true);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: ru.yandex.taxi.widget.BackportNumberPicker.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BackportNumberPicker.this.hideSoftInput();
                BackportNumberPicker.this.mInputText.clearFocus();
                BackportNumberPicker.this.changeValueByOne(view.getId() == vdh0.np__increment);
            }
        };
        View.OnLongClickListener onLongClickListener = new View.OnLongClickListener() { // from class: ru.yandex.taxi.widget.BackportNumberPicker.2
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                BackportNumberPicker.this.hideSoftInput();
                BackportNumberPicker.this.mInputText.clearFocus();
                BackportNumberPicker.this.postChangeCurrentByOneFromLongPress(view.getId() == vdh0.np__increment, 0L);
                return true;
            }
        };
        if (z) {
            this.mIncrementButton = null;
        } else {
            ImageButton imageButton = (ImageButton) findViewById(vdh0.np__increment);
            this.mIncrementButton = imageButton;
            imageButton.setOnClickListener(onClickListener);
            imageButton.setOnLongClickListener(onLongClickListener);
        }
        if (z) {
            this.mDecrementButton = null;
        } else {
            ImageButton imageButton2 = (ImageButton) findViewById(vdh0.np__decrement);
            this.mDecrementButton = imageButton2;
            imageButton2.setOnClickListener(onClickListener);
            imageButton2.setOnLongClickListener(onLongClickListener);
        }
        EditText editText = (EditText) findViewById(vdh0.np__numberpicker_input);
        this.mInputText = editText;
        editText.setOnFocusChangeListener(new bk(i2, this));
        editText.setFilters(new InputFilter[]{new InputTextFilter()});
        editText.setRawInputType(2);
        editText.setImeOptions(6);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        int textSize = (int) editText.getTextSize();
        this.mTextSize = textSize;
        Paint f = unr0.f(true);
        f.setTextAlign(Paint.Align.CENTER);
        f.setTextSize(textSize);
        f.setTypeface(editText.getTypeface());
        f.setColor(editText.getTextColors().getColorForState(FrameLayout.ENABLED_STATE_SET, -1));
        this.mSelectorWheelPaint = f;
        this.mFlingScroller = new alp0(getContext(), null);
        this.mAdjustScroller = new alp0(getContext(), new DecelerateInterpolator(2.5f));
        updateInputTextView();
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        paint.setColor(0);
        paint.setAntiAlias(true);
        this.selectorCorners = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeValueByOne(boolean z) {
        int i = this.mValue;
        scrollTo(z ? i + 1 : i - 1);
    }

    private void decrementSelectorIndices(int[] iArr) {
        for (int length = iArr.length - 1; length > 0; length--) {
            iArr[length] = iArr[length - 1];
        }
        int i = iArr[1] - 1;
        if (this.mWrapSelectorWheel && i < this.mMinValue) {
            i = this.mMaxValue;
        }
        iArr[0] = i;
        ensureCachedScrollSelectorValue(i);
    }

    private void ensureCachedScrollSelectorValue(int i) {
        String str;
        SparseArray<String> sparseArray = this.mSelectorIndexToStringCache;
        if (sparseArray.get(i) != null) {
            return;
        }
        int i2 = this.mMinValue;
        if (i < i2 || i > this.mMaxValue) {
            str = "";
        } else {
            String[] strArr = this.mDisplayedValues;
            str = strArr != null ? strArr[i - i2] : formatNumber(i);
        }
        sparseArray.put(i, str);
    }

    private boolean ensureScrollWheelAdjusted() {
        int i = this.mInitialScrollOffset - this.mCurrentScrollOffset;
        if (i == 0) {
            return false;
        }
        this.mPreviousScrollerY = 0;
        int abs = Math.abs(i);
        int i2 = this.mSelectorElementHeight;
        if (abs > i2 / 2) {
            if (i > 0) {
                i2 = -i2;
            }
            i += i2;
        }
        this.mAdjustScroller.b(i, 800);
        invalidate();
        return true;
    }

    private void fling(int i) {
        this.mPreviousScrollerY = 0;
        alp0 alp0Var = this.mFlingScroller;
        if (i > 0) {
            alp0Var.a(0, i);
        } else {
            alp0Var.a(Integer.MAX_VALUE, i);
        }
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String formatNumber(int i) {
        vi4 vi4Var = this.mFormatter;
        if (vi4Var == null) {
            return formatNumberWithLocale(i);
        }
        bj4 bj4Var = (bj4) vi4Var;
        Formatter formatter = bj4Var.c;
        Object[] objArr = bj4Var.d;
        Locale locale = Locale.getDefault();
        if (bj4Var.b != new DecimalFormatSymbols(locale).getZeroDigit()) {
            bj4Var.b = new DecimalFormatSymbols(locale).getZeroDigit();
        }
        objArr[0] = Integer.valueOf(i);
        StringBuilder sb = bj4Var.a;
        sb.delete(0, sb.length());
        formatter.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, objArr);
        return formatter.toString();
    }

    private static String formatNumberWithLocale(int i) {
        return String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getSelectedPos(String str) {
        try {
            if (this.mDisplayedValues == null) {
                return Integer.parseInt(str);
            }
            for (int i = 0; i < this.mDisplayedValues.length; i++) {
                str = str.toLowerCase(Locale.getDefault());
                if (this.mDisplayedValues[i].toLowerCase(Locale.getDefault()).startsWith(str)) {
                    return this.mMinValue + i;
                }
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return this.mMinValue;
        }
    }

    private aj4 getSupportAccessibilityNodeController() {
        return new aj4(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getVirtualInputTextDescription() {
        CharSequence[] charSequenceArr = this.mSpokenValues;
        StringBuilder sb = new StringBuilder(charSequenceArr == null ? this.mInputText.getText() : charSequenceArr[this.mValue - this.mMinValue]);
        if (!this.selectedValueDescriptionSuffix.isEmpty()) {
            sb.append(Extension.FIX_SPACE);
            sb.append(this.selectedValueDescriptionSuffix);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getWrappedSelectorIndex(int i) {
        int i2 = this.mMaxValue;
        int i3 = this.mMinValue;
        return i > i2 ? (((i - i2) % (i2 - i3)) + i3) - 1 : i < i3 ? (i2 - ((i3 - i) % (i2 - i3))) + 1 : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideSoftInput() {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager == null || !inputMethodManager.isActive(this.mInputText)) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        if (this.mHasSelectorWheel) {
            this.mInputText.setVisibility(4);
        }
    }

    private void incrementSelectorIndices(int[] iArr) {
        int i = 0;
        while (i < iArr.length - 1) {
            int i2 = i + 1;
            iArr[i] = iArr[i2];
            i = i2;
        }
        int i3 = iArr[iArr.length - 2] + 1;
        if (this.mWrapSelectorWheel && i3 > this.mMaxValue) {
            i3 = this.mMinValue;
        }
        iArr[iArr.length - 1] = i3;
        ensureCachedScrollSelectorValue(i3);
    }

    private void initializeFadingEdges() {
        setVerticalFadingEdgeEnabled(true);
        if (this.isSelectorVisible) {
            setFadingEdgeLength(((getBottom() - getTop()) - this.mSelectorElementHeight) / 2);
        } else {
            setFadingEdgeLength(((getBottom() - getTop()) - this.mTextSize) / 2);
        }
    }

    private void initializeSelectorWheel() {
        initializeSelectorWheelIndices();
        int[] iArr = this.mSelectorIndices;
        int bottom = (int) ((((getBottom() - getTop()) - (iArr.length * this.mTextSize)) / iArr.length) + 0.5f);
        this.mSelectorTextGapHeight = bottom;
        this.mSelectorElementHeight = this.mTextSize + bottom;
        int top = (this.mInputText.getTop() + this.mInputText.getBaseline()) - this.mSelectorElementHeight;
        this.mInitialScrollOffset = top;
        this.mCurrentScrollOffset = top;
        updateInputTextView();
    }

    private void initializeSelectorWheelIndices() {
        this.mSelectorIndexToStringCache.clear();
        int[] iArr = this.mSelectorIndices;
        int value = getValue();
        for (int i = 0; i < this.mSelectorIndices.length; i++) {
            int i2 = (i - 1) + value;
            if (this.mWrapSelectorWheel) {
                i2 = getWrappedSelectorIndex(i2);
            }
            iArr[i] = i2;
            ensureCachedScrollSelectorValue(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isAccessibilityManagerEnabled() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    private boolean isLayoutDirectionRtl() {
        return getLayoutDirection() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view, boolean z) {
        EditText editText = this.mInputText;
        if (z) {
            editText.selectAll();
        } else {
            editText.setSelection(0, 0);
            validateInputTextView(view);
        }
    }

    private int makeMeasureSpec(int i, int i2) {
        if (i2 != -1) {
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(Math.min(size, i2), 1073741824);
            }
            if (mode == 0) {
                return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
            }
            if (mode != 1073741824) {
                ny61.g(oyr.i(mode, "Unknown measure mode: "));
                return 0;
            }
        }
        return i;
    }

    private boolean moveToFinalScrollerPosition(alp0 alp0Var) {
        alp0Var.m = true;
        int i = alp0Var.d - alp0Var.g;
        int i2 = this.mInitialScrollOffset - ((this.mCurrentScrollOffset + i) % this.mSelectorElementHeight);
        if (i2 == 0) {
            return false;
        }
        int abs = Math.abs(i2);
        int i3 = this.mSelectorElementHeight;
        if (abs > i3 / 2) {
            i2 = i2 > 0 ? i2 - i3 : i2 + i3;
        }
        scrollBy(0, i + i2);
        return true;
    }

    private void notifyChange(int i, int i2) {
        xi4 xi4Var = this.mOnValueChangeListener;
        if (xi4Var == null || this.mScrollState == 3) {
            return;
        }
        h2r h2rVar = (h2r) xi4Var;
        ((upt) h2rVar.b).onValueChange((GoNumberPicker) h2rVar.c, i, this.mValue, true);
    }

    private void onScrollStateChange(int i) {
        if (this.mScrollState == i) {
            return;
        }
        this.mScrollState = i;
        wi4 wi4Var = this.mOnScrollListener;
        if (wi4Var != null) {
            h2r h2rVar = (h2r) wi4Var;
            ((tpt) h2rVar.b).onScrollStateChange((GoNumberPicker) h2rVar.c, i);
        }
    }

    private void onScrollerFinished(alp0 alp0Var) {
        if (alp0Var == this.mFlingScroller) {
            if (!ensureScrollWheelAdjusted()) {
                updateInputTextView();
            }
            onScrollStateChange(0);
        } else if (this.mScrollState != 1) {
            updateInputTextView();
        }
    }

    private void postBeginSoftInputOnLongPressCommand() {
        ti4 ti4Var = this.mBeginSoftInputOnLongPressCommand;
        if (ti4Var == null) {
            this.mBeginSoftInputOnLongPressCommand = new ti4(this);
        } else {
            removeCallbacks(ti4Var);
        }
        postDelayed(this.mBeginSoftInputOnLongPressCommand, ViewConfiguration.getLongPressTimeout());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postChangeCurrentByOneFromLongPress(boolean z, long j) {
        Runnable runnable = this.mChangeCurrentByOneFromLongPressCommand;
        if (runnable == null) {
            this.mChangeCurrentByOneFromLongPressCommand = new ui4(this);
        } else {
            removeCallbacks(runnable);
        }
        ui4 ui4Var = this.mChangeCurrentByOneFromLongPressCommand;
        ui4Var.a = z;
        postDelayed(ui4Var, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postSetSelectionCommand(int i, int i2) {
        Runnable runnable = this.mSetSelectionCommand;
        if (runnable == null) {
            this.mSetSelectionCommand = new zi4(this);
        } else {
            removeCallbacks(runnable);
        }
        zi4 zi4Var = this.mSetSelectionCommand;
        zi4Var.a = i;
        zi4Var.b = i2;
        post(zi4Var);
    }

    private void removeAllCallbacks() {
        ui4 ui4Var = this.mChangeCurrentByOneFromLongPressCommand;
        if (ui4Var != null) {
            removeCallbacks(ui4Var);
        }
        zi4 zi4Var = this.mSetSelectionCommand;
        if (zi4Var != null) {
            removeCallbacks(zi4Var);
        }
        ti4 ti4Var = this.mBeginSoftInputOnLongPressCommand;
        if (ti4Var != null) {
            removeCallbacks(ti4Var);
        }
        this.mPressedStateManager.a();
    }

    private void removeBeginSoftInputCommand() {
        ti4 ti4Var = this.mBeginSoftInputOnLongPressCommand;
        if (ti4Var != null) {
            removeCallbacks(ti4Var);
        }
    }

    private void removeChangeCurrentByOneFromLongPress() {
        ui4 ui4Var = this.mChangeCurrentByOneFromLongPressCommand;
        if (ui4Var != null) {
            removeCallbacks(ui4Var);
        }
    }

    public static int resolveSizeAndState(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 1073741824) {
                i = size;
            }
        } else if (size < i) {
            i = 16777216 | size;
        }
        return i | ((-16777216) & i3);
    }

    private int resolveSizeAndStateRespectingMinSize(int i, int i2, int i3) {
        return i != -1 ? resolveSizeAndState(Math.max(i, i2), i3, 0) : i2;
    }

    private void scrollTo(int i) {
        int i2 = this.mValue;
        int i3 = i2 - i;
        if (!this.mHasSelectorWheel) {
            setValueInternal(i2 - i3, true);
            return;
        }
        this.mInputText.setVisibility(4);
        if (!moveToFinalScrollerPosition(this.mFlingScroller)) {
            moveToFinalScrollerPosition(this.mAdjustScroller);
        }
        this.mPreviousScrollerY = 0;
        this.mFlingScroller.b(this.mSelectorElementHeight * i3, SNAP_SCROLL_DURATION);
        invalidate();
    }

    private void setValueInternal(int i, boolean z) {
        if (this.mValue == i) {
            return;
        }
        int wrappedSelectorIndex = this.mWrapSelectorWheel ? getWrappedSelectorIndex(i) : Math.min(Math.max(i, this.mMinValue), this.mMaxValue);
        int i2 = this.mValue;
        this.mValue = wrappedSelectorIndex;
        updateInputTextView();
        if (z) {
            notifyChange(i2, wrappedSelectorIndex);
        }
        initializeSelectorWheelIndices();
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showSoftInput() {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            if (this.mHasSelectorWheel) {
                this.mInputText.setVisibility(0);
            }
            this.mInputText.requestFocus();
            inputMethodManager.showSoftInput(this.mInputText, 0);
        }
    }

    private void tryComputeMaxWidth() {
        int i;
        if (this.mComputeMaxWidth) {
            String[] strArr = this.mDisplayedValues;
            int i2 = 0;
            if (strArr == null) {
                float f = 0.0f;
                for (int i3 = 0; i3 <= 9; i3++) {
                    float measureText = this.mSelectorWheelPaint.measureText(formatNumberWithLocale(i3));
                    if (measureText > f) {
                        f = measureText;
                    }
                }
                for (int i4 = this.mMaxValue; i4 > 0; i4 /= 10) {
                    i2++;
                }
                i = (int) (i2 * f);
            } else {
                int length = strArr.length;
                int i5 = 0;
                while (i2 < length) {
                    float measureText2 = this.mSelectorWheelPaint.measureText(this.mDisplayedValues[i2]);
                    if (measureText2 > i5) {
                        i5 = (int) measureText2;
                    }
                    i2++;
                }
                i = i5;
            }
            int paddingRight = this.mInputText.getPaddingRight() + this.mInputText.getPaddingLeft() + i;
            int i6 = this.mMinWidth;
            if (paddingRight <= i6) {
                paddingRight = i6;
            }
            if (this.mMaxWidth != paddingRight) {
                this.mMaxWidth = paddingRight;
                invalidate();
                requestLayout();
            }
        }
    }

    private boolean updateInputTextView() {
        String[] strArr = this.mDisplayedValues;
        int i = this.mValue;
        String formatNumber = strArr == null ? formatNumber(i) : strArr[i - this.mMinValue];
        if (TextUtils.isEmpty(formatNumber) || formatNumber.equals(this.mInputText.getText().toString())) {
            return false;
        }
        this.mInputText.setText(formatNumber);
        return true;
    }

    private void validateInputTextView(View view) {
        String valueOf = String.valueOf(((TextView) view).getText());
        if (TextUtils.isEmpty(valueOf)) {
            updateInputTextView();
        } else {
            setValueInternal(getSelectedPos(valueOf), true);
        }
    }

    public void animateScrollTo(int i) {
        if (i == this.mValue) {
            return;
        }
        onScrollStateChange(3);
        scrollTo(i);
    }

    @Override // android.view.View
    public void computeScroll() {
        alp0 alp0Var = this.mFlingScroller;
        if (alp0Var.m) {
            alp0Var = this.mAdjustScroller;
            if (alp0Var.m) {
                return;
            }
        }
        if (!alp0Var.m) {
            int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - alp0Var.h);
            int i = alp0Var.i;
            if (currentAnimationTimeMillis < i) {
                int i2 = alp0Var.a;
                if (i2 == 0) {
                    float f = currentAnimationTimeMillis * alp0Var.j;
                    Interpolator interpolator = alp0Var.n;
                    float c = interpolator == null ? alp0.c(f) : interpolator.getInterpolation(f);
                    alp0Var.f = Math.round(alp0Var.k * c);
                    alp0Var.g = Math.round(c * alp0Var.l) + alp0Var.b;
                } else if (i2 == 1) {
                    float f2 = currentAnimationTimeMillis / i;
                    int i3 = (int) (f2 * 100.0f);
                    float f3 = i3 / 100.0f;
                    int i4 = i3 + 1;
                    float[] fArr = alp0.v;
                    float f4 = fArr[i3];
                    float b = g8e.b(fArr[i4], f4, (f2 - f3) / ((i4 / 100.0f) - f3), f4);
                    int round = Math.round(alp0Var.c * b);
                    alp0Var.f = round;
                    int min = Math.min(round, 0);
                    alp0Var.f = min;
                    alp0Var.f = Math.max(min, 0);
                    int round2 = Math.round(b * (alp0Var.d - r3)) + alp0Var.b;
                    alp0Var.g = round2;
                    int min2 = Math.min(round2, alp0Var.e);
                    alp0Var.g = min2;
                    int max = Math.max(min2, 0);
                    alp0Var.g = max;
                    if (alp0Var.f == alp0Var.c && max == alp0Var.d) {
                        alp0Var.m = true;
                    }
                }
            } else {
                alp0Var.f = alp0Var.c;
                alp0Var.g = alp0Var.d;
                alp0Var.m = true;
            }
        }
        int i5 = alp0Var.g;
        if (this.mPreviousScrollerY == 0) {
            this.mPreviousScrollerY = alp0Var.b;
        }
        scrollBy(0, i5 - this.mPreviousScrollerY);
        this.mPreviousScrollerY = i5;
        if (alp0Var.m) {
            onScrollerFinished(alp0Var);
        } else {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.mHasSelectorWheel) {
            return super.dispatchHoverEvent(motionEvent);
        }
        if (isAccessibilityManagerEnabled()) {
            int y = (int) motionEvent.getY();
            int i = y < this.mTopSelectionDividerTop ? 3 : y > this.mBottomSelectionDividerBottom ? 1 : 2;
            int action = motionEvent.getAction() & 255;
            aj4 supportAccessibilityNodeController = getSupportAccessibilityNodeController();
            if (action == 7) {
                int i2 = this.mLastHoveredChildVirtualViewId;
                if (i2 != i && i2 != -1) {
                    si4 si4Var = supportAccessibilityNodeController.a;
                    si4 si4Var2 = supportAccessibilityNodeController.a;
                    if (si4Var != null) {
                        si4Var.l(i2, 256);
                    }
                    if (si4Var2 != null) {
                        si4Var2.l(i, 128);
                    }
                    this.mLastHoveredChildVirtualViewId = i;
                    if (si4Var2 != null) {
                        si4Var2.e(i, 64, null);
                    }
                }
            } else if (action == 9) {
                si4 si4Var3 = supportAccessibilityNodeController.a;
                if (si4Var3 != null) {
                    si4Var3.l(i, 128);
                }
                this.mLastHoveredChildVirtualViewId = i;
                si4 si4Var4 = supportAccessibilityNodeController.a;
                if (si4Var4 != null) {
                    si4Var4.e(i, 64, null);
                    return true;
                }
            } else if (action == 10) {
                si4 si4Var5 = supportAccessibilityNodeController.a;
                if (si4Var5 != null) {
                    si4Var5.l(i, 256);
                }
                this.mLastHoveredChildVirtualViewId = -1;
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        requestFocus();
        r5.mLastHandledDownDpadKeyCode = r0;
        removeAllCallbacks();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
    
        if (r5.mFlingScroller.m == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        if (r0 != 20) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005f, code lost:
    
        changeValueByOne(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
    
        return true;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19 || keyCode == 20) {
            if (this.mHasSelectorWheel) {
                int action = keyEvent.getAction();
                if (action != 0) {
                    if (action == 1 && this.mLastHandledDownDpadKeyCode == keyCode) {
                        this.mLastHandledDownDpadKeyCode = -1;
                        return true;
                    }
                } else if (!this.mWrapSelectorWheel) {
                }
            }
        } else if (keyCode == 23 || keyCode == 66) {
            removeAllCallbacks();
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 1 || action == 3) {
            removeAllCallbacks();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 1 || action == 3) {
            removeAllCallbacks();
        }
        return super.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        return TOP_AND_BOTTOM_FADING_EDGE_STRENGTH;
    }

    public final EditText getInputText() {
        return this.mInputText;
    }

    public int getMaxValue() {
        return this.mMaxValue;
    }

    public int getMinValue() {
        return this.mMinValue;
    }

    @Override // android.view.View
    public int getSolidColor() {
        return this.mSolidColor;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        return TOP_AND_BOTTOM_FADING_EDGE_STRENGTH;
    }

    public int getValue() {
        return this.mValue;
    }

    public boolean getWrapSelectorWheel() {
        return this.mWrapSelectorWheel;
    }

    public final void installAccessibilityDelegate() {
        androidx.core.view.b.p(this, new mg(4, this));
    }

    public boolean isIdleScrollState() {
        return this.mScrollState == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeAllCallbacks();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (!this.mHasSelectorWheel) {
            super.onDraw(canvas);
            return;
        }
        if (this.isSelectorVisible) {
            this.selectorRect.set(0.0f, this.mTopSelectionDividerTop, getWidth(), this.mBottomSelectionDividerBottom);
            this.selectorPath.reset();
            this.selectorPath.addRoundRect(this.selectorRect, this.selectorCorners, Path.Direction.CW);
            canvas.drawPath(this.selectorPath, this.selectorPaint);
        }
        int i = ri4.a[this.mSelectorWheelPaint.getTextAlign().ordinal()];
        float width = i != 1 ? i != 2 ? getWidth() / 2 : getWidth() - getPaddingRight() : getPaddingLeft();
        float f = this.mCurrentScrollOffset;
        Drawable drawable = this.mVirtualButtonPressedDrawable;
        if (drawable != null && this.mScrollState == 0) {
            boolean z = this.mDecrementVirtualButtonPressed;
            int[] iArr = FrameLayout.PRESSED_ENABLED_STATE_SET;
            if (z) {
                drawable.setState(iArr);
                this.mVirtualButtonPressedDrawable.setBounds(0, 0, getRight(), this.mTopSelectionDividerTop);
                this.mVirtualButtonPressedDrawable.draw(canvas);
            }
            if (this.mIncrementVirtualButtonPressed) {
                this.mVirtualButtonPressedDrawable.setState(iArr);
                this.mVirtualButtonPressedDrawable.setBounds(0, this.mBottomSelectionDividerBottom, getRight(), getBottom());
                this.mVirtualButtonPressedDrawable.draw(canvas);
            }
        }
        int[] iArr2 = this.mSelectorIndices;
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            String str = this.mSelectorIndexToStringCache.get(iArr2[i2]);
            if (i2 != 1 || this.mInputText.getVisibility() != 0) {
                canvas.drawText(str, width, f, this.mSelectorWheelPaint);
            }
            f += this.mSelectorElementHeight;
        }
        Drawable drawable2 = this.mSelectionDivider;
        if (drawable2 != null) {
            int i3 = this.mTopSelectionDividerTop;
            drawable2.setBounds(0, i3, getRight(), this.mSelectionDividerHeight + i3);
            this.mSelectionDivider.draw(canvas);
            int i4 = this.mBottomSelectionDividerBottom;
            this.mSelectionDivider.setBounds(0, i4 - this.mSelectionDividerHeight, getRight(), i4);
            this.mSelectionDivider.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.mHasSelectorWheel || !isEnabled() || (motionEvent.getAction() & 255) != 0) {
            return false;
        }
        removeAllCallbacks();
        this.mInputText.setVisibility(4);
        float y = motionEvent.getY();
        this.mLastDownEventY = y;
        this.mLastDownOrMoveEventY = y;
        this.mLastDownEventTime = motionEvent.getEventTime();
        this.mIgnoreMoveEvents = false;
        this.mShowSoftInputOnTap = false;
        float f = this.mLastDownEventY;
        if (f < this.mTopSelectionDividerTop) {
            if (this.mScrollState == 0) {
                yi4 yi4Var = this.mPressedStateManager;
                yi4Var.a();
                yi4Var.b = 1;
                yi4Var.a = 2;
                yi4Var.c.postDelayed(yi4Var, ViewConfiguration.getTapTimeout());
            }
        } else if (f > this.mBottomSelectionDividerBottom && this.mScrollState == 0) {
            yi4 yi4Var2 = this.mPressedStateManager;
            yi4Var2.a();
            yi4Var2.b = 1;
            yi4Var2.a = 1;
            yi4Var2.c.postDelayed(yi4Var2, ViewConfiguration.getTapTimeout());
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        alp0 alp0Var = this.mFlingScroller;
        if (!alp0Var.m) {
            alp0Var.m = true;
            this.mAdjustScroller.m = true;
            onScrollStateChange(0);
            return true;
        }
        alp0 alp0Var2 = this.mAdjustScroller;
        if (!alp0Var2.m) {
            alp0Var.m = true;
            alp0Var2.m = true;
            return true;
        }
        float f2 = this.mLastDownEventY;
        if (f2 < this.mTopSelectionDividerTop) {
            hideSoftInput();
            postChangeCurrentByOneFromLongPress(false, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (f2 > this.mBottomSelectionDividerBottom) {
            hideSoftInput();
            postChangeCurrentByOneFromLongPress(true, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        this.mShowSoftInputOnTap = true;
        postBeginSoftInputOnLongPressCommand();
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (!this.mHasSelectorWheel) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredWidth2 = this.mInputText.getMeasuredWidth();
        int measuredHeight2 = this.mInputText.getMeasuredHeight();
        int i5 = (measuredWidth - measuredWidth2) / 2;
        int i6 = (measuredHeight - measuredHeight2) / 2;
        this.mInputText.layout(i5, i6, measuredWidth2 + i5, measuredHeight2 + i6);
        if (z) {
            initializeSelectorWheel();
            initializeFadingEdges();
            int height = getHeight();
            int i7 = this.mSelectionDividersDistance;
            int i8 = this.mSelectionDividerHeight;
            int i9 = ((height - i7) / 2) - i8;
            this.mTopSelectionDividerTop = i9;
            this.mBottomSelectionDividerBottom = b64.b(i8, 2, i9, i7);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (!this.mHasSelectorWheel) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(makeMeasureSpec(i, this.mMaxWidth), makeMeasureSpec(i2, this.mMaxHeight));
            setMeasuredDimension(resolveSizeAndStateRespectingMinSize(this.mMinWidth, getMeasuredWidth(), i), resolveSizeAndStateRespectingMinSize(this.mMinHeight, getMeasuredHeight(), i2));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || !this.mHasSelectorWheel) {
            return false;
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 1) {
            if (action != 2 || this.mIgnoreMoveEvents) {
                return true;
            }
            float y = motionEvent.getY();
            if (this.mScrollState == 1) {
                scrollBy(0, (int) (y - this.mLastDownOrMoveEventY));
                invalidate();
            } else if (((int) Math.abs(y - this.mLastDownEventY)) > this.mTouchSlop) {
                removeAllCallbacks();
                onScrollStateChange(1);
            }
            this.mLastDownOrMoveEventY = y;
            return true;
        }
        removeBeginSoftInputCommand();
        removeChangeCurrentByOneFromLongPress();
        this.mPressedStateManager.a();
        VelocityTracker velocityTracker = this.mVelocityTracker;
        velocityTracker.computeCurrentVelocity(1000, this.mMaximumFlingVelocity);
        int yVelocity = (int) velocityTracker.getYVelocity();
        if (Math.abs(yVelocity) > this.mMinimumFlingVelocity) {
            fling(yVelocity);
            onScrollStateChange(2);
        } else {
            int y2 = (int) motionEvent.getY();
            if (((int) Math.abs(y2 - this.mLastDownEventY)) > this.mTouchSlop) {
                ensureScrollWheelAdjusted();
            } else if (this.mShowSoftInputOnTap) {
                this.mShowSoftInputOnTap = false;
                showSoftInput();
            } else {
                int i = (y2 / this.mSelectorElementHeight) - 1;
                if (i > 0) {
                    changeValueByOne(true);
                    yi4 yi4Var = this.mPressedStateManager;
                    yi4Var.a();
                    yi4Var.b = 2;
                    yi4Var.a = 1;
                    yi4Var.c.post(yi4Var);
                } else if (i < 0) {
                    changeValueByOne(false);
                    yi4 yi4Var2 = this.mPressedStateManager;
                    yi4Var2.a();
                    yi4Var2.b = 2;
                    yi4Var2.a = 2;
                    yi4Var2.c.post(yi4Var2);
                }
            }
            onScrollStateChange(0);
        }
        this.mVelocityTracker.recycle();
        this.mVelocityTracker = null;
        return true;
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        int[] iArr = this.mSelectorIndices;
        boolean z = this.mWrapSelectorWheel;
        if (!z && i2 > 0 && iArr[1] <= this.mMinValue) {
            this.mCurrentScrollOffset = this.mInitialScrollOffset;
            return;
        }
        if (!z && i2 < 0 && iArr[1] >= this.mMaxValue) {
            this.mCurrentScrollOffset = this.mInitialScrollOffset;
            return;
        }
        this.mCurrentScrollOffset += i2;
        while (true) {
            int i3 = this.mCurrentScrollOffset;
            if (i3 - this.mInitialScrollOffset <= this.mSelectorTextGapHeight) {
                break;
            }
            this.mCurrentScrollOffset = i3 - this.mSelectorElementHeight;
            decrementSelectorIndices(iArr);
            setValueInternal(iArr[1], true);
            if (!this.mWrapSelectorWheel && iArr[1] <= this.mMinValue) {
                this.mCurrentScrollOffset = this.mInitialScrollOffset;
            }
        }
        while (true) {
            int i4 = this.mCurrentScrollOffset;
            if (i4 - this.mInitialScrollOffset >= (-this.mSelectorTextGapHeight)) {
                return;
            }
            this.mCurrentScrollOffset = i4 + this.mSelectorElementHeight;
            incrementSelectorIndices(iArr);
            setValueInternal(iArr[1], true);
            if (!this.mWrapSelectorWheel && iArr[1] >= this.mMaxValue) {
                this.mCurrentScrollOffset = this.mInitialScrollOffset;
            }
        }
    }

    public void setDisplayedValues(String[] strArr) {
        if (this.mDisplayedValues == strArr) {
            return;
        }
        this.mDisplayedValues = strArr;
        EditText editText = this.mInputText;
        if (strArr != null) {
            editText.setRawInputType(ImageMetadata.LENS_FILTER_DENSITY);
        } else {
            editText.setRawInputType(2);
        }
        updateInputTextView();
        initializeSelectorWheelIndices();
        tryComputeMaxWidth();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        ImageButton imageButton;
        ImageButton imageButton2;
        super.setEnabled(z);
        if (!this.mHasSelectorWheel && (imageButton2 = this.mIncrementButton) != null) {
            imageButton2.setEnabled(z);
        }
        if (!this.mHasSelectorWheel && (imageButton = this.mDecrementButton) != null) {
            imageButton.setEnabled(z);
        }
        this.mInputText.setEnabled(z);
    }

    public void setFormatter(vi4 vi4Var) {
        if (vi4Var == this.mFormatter) {
            return;
        }
        this.mFormatter = vi4Var;
        initializeSelectorWheelIndices();
        updateInputTextView();
    }

    public void setMaxValue(int i) {
        if (this.mMaxValue == i) {
            return;
        }
        if (i < 0) {
            ny61.g("maxValue must be >= 0");
            return;
        }
        this.mMaxValue = i;
        if (i < this.mValue) {
            this.mValue = i;
        }
        setWrapSelectorWheel(i - this.mMinValue > this.mSelectorIndices.length);
        initializeSelectorWheelIndices();
        updateInputTextView();
        tryComputeMaxWidth();
        invalidate();
    }

    public void setMinValue(int i) {
        if (this.mMinValue == i) {
            return;
        }
        if (i < 0) {
            ny61.g("minValue must be >= 0");
            return;
        }
        this.mMinValue = i;
        if (i > this.mValue) {
            this.mValue = i;
        }
        setWrapSelectorWheel(this.mMaxValue - i > this.mSelectorIndices.length);
        initializeSelectorWheelIndices();
        updateInputTextView();
        tryComputeMaxWidth();
        invalidate();
    }

    public void setOnScrollListener(wi4 wi4Var) {
        this.mOnScrollListener = wi4Var;
    }

    public void setOnValueChangedListener(xi4 xi4Var) {
        this.mOnValueChangeListener = xi4Var;
    }

    public void setSelectedValueDescriptionSuffix(String str) {
        this.selectedValueDescriptionSuffix = str;
    }

    public final void setSelectorBackgroundColor(int i) {
        this.selectorPaint.setColor(i);
    }

    public void setSelectorCornerRadius(float f, float f2, float f3, float f4) {
        this.selectorCorners = new float[]{f, f, f2, f2, f3, f3, f4, f4};
        invalidate();
    }

    public void setSelectorVisible(boolean z) {
        this.isSelectorVisible = z;
        invalidate();
    }

    public void setSpokenValues(String[] strArr) {
        this.mSpokenValues = strArr;
    }

    public void setTextAlignment(TextAlignment textAlignment) {
        boolean isLayoutDirectionRtl = isLayoutDirectionRtl();
        int ordinal = textAlignment.ordinal();
        if (ordinal != 0) {
            Paint paint = this.mSelectorWheelPaint;
            if (ordinal != 2) {
                paint.setTextAlign(Paint.Align.CENTER);
                this.mInputText.setTextAlignment(4);
                this.mInputText.setGravity(17);
            } else {
                paint.setTextAlign(isLayoutDirectionRtl ? Paint.Align.LEFT : Paint.Align.RIGHT);
                this.mInputText.setGravity(8388613);
                this.mInputText.setTextAlignment(6);
            }
        } else {
            this.mSelectorWheelPaint.setTextAlign(isLayoutDirectionRtl ? Paint.Align.RIGHT : Paint.Align.LEFT);
            this.mInputText.setGravity(8388611);
            this.mInputText.setTextAlignment(5);
        }
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        this.mInputText.setTypeface(typeface);
        this.mSelectorWheelPaint.setTypeface(typeface);
    }

    public void setValue(int i) {
        setValueInternal(i, false);
    }

    public void setWrapSelectorWheel(boolean z) {
        boolean z2 = this.mMaxValue - this.mMinValue >= this.mSelectorIndices.length;
        if ((!z || z2) && z != this.mWrapSelectorWheel) {
            this.mWrapSelectorWheel = z;
        }
    }

    public final void syncSelectorWheelPaintColor() {
        this.mSelectorWheelPaint.setColor(this.mInputText.getTextColors().getColorForState(FrameLayout.ENABLED_STATE_SET, -1));
    }

    public BackportNumberPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zng0.numberPickerStyle);
    }

    public BackportNumberPicker(Context context) {
        this(context, null);
    }
}

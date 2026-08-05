package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.internal.BaselineLayout;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class iv extends FrameLayout implements lv {
    public final TextView DK9slbsy;
    public int ESscZ9M1;
    public final FrameLayout Ey6iv0m0;
    public float FXJmAAN1;
    public final TextView FySoLYna;
    public int HdOGZAzC;
    public final ImageView I5GHvsYW;
    public boolean KRabZ4CU;
    public final View KlHjfFWx;
    public int LfKQckgD;
    public boolean LvHlPNBd;
    public ColorStateList MdtA4re8;
    public int Mq3SeTnW;
    public int N8VPGzVC;
    public boolean NCTxEWno;
    public float OnDfzHZD;
    public final LinearLayout OxcuoDLp;
    public int P7K7Inc8;
    public int Qr9iLBAD;
    public final BaselineLayout RXQxj5Oe;
    public int SgZGMMPL;
    public boolean Sjrx9cEN;
    public int TrssYQ34;
    public BaselineLayout U0LaHZX7;
    public int VGmz0ccI;
    public int VgvYg0wo;
    public cs VhgXwMj9;
    public final BaselineLayout WYNAV5pd;
    public Drawable Xkz7p5xa;
    public int ZyZthT5G;
    public ColorStateList aZz0PFXp;
    public final LinearLayout amk52bBQ;
    public int b2ZJblxo;
    public int bvfAo0eO;
    public ColorStateList eIA6dogk;
    public float eVhOlqcC;
    public int euDDoUNr;
    public Drawable fVMzMhyS;
    public t1 g2aRJUAd;
    public final TextView gjV1z5T1;
    public int gmkaJpmS;
    public Rect hGvurcGl;
    public ValueAnimator hzgxAD8d;
    public int i7xS8jrb;
    public float jb9XjC4I;
    public float k3x7lurq;
    public int lDXGDhIF;
    public final TextView lwWCatUu;
    public boolean nSmgoSB5;
    public float ow5vqvCr;
    public boolean pP9Y2m6O;
    public boolean pRiPUEwG;
    public boolean sjUBp5pO;
    public boolean tef3qNMP;
    public Drawable wxUZMvaN;
    public float ygLcUYwZ;
    public int ytu5o6f4;
    public re zCflySGU;
    public static final int[] Wi7iiXC4 = {R.attr.state_checked};
    public static final re QT4Tf9Dt = new re(26);
    public static final hv orhfF2Ya = new hv(26);

    public iv(Context context) {
        super(context);
        this.NCTxEWno = false;
        this.i7xS8jrb = -1;
        this.Mq3SeTnW = 0;
        this.euDDoUNr = 0;
        this.SgZGMMPL = 0;
        this.ytu5o6f4 = 0;
        this.pRiPUEwG = false;
        this.zCflySGU = QT4Tf9Dt;
        this.FXJmAAN1 = 0.0f;
        this.nSmgoSB5 = false;
        this.N8VPGzVC = 0;
        this.HdOGZAzC = 0;
        this.ZyZthT5G = -2;
        this.bvfAo0eO = 0;
        this.KRabZ4CU = false;
        this.gmkaJpmS = 0;
        this.TrssYQ34 = 0;
        this.VGmz0ccI = 0;
        this.LfKQckgD = 49;
        this.pP9Y2m6O = false;
        this.tef3qNMP = false;
        this.Sjrx9cEN = false;
        this.LvHlPNBd = false;
        this.hGvurcGl = new Rect();
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.OxcuoDLp = (LinearLayout) findViewById(com.kolosta.rejin.jilosa.R.id.navigation_bar_item_content_container);
        LinearLayout linearLayout = (LinearLayout) findViewById(com.kolosta.rejin.jilosa.R.id.navigation_bar_item_inner_content_container);
        this.amk52bBQ = linearLayout;
        this.KlHjfFWx = findViewById(com.kolosta.rejin.jilosa.R.id.navigation_bar_item_active_indicator_view);
        this.Ey6iv0m0 = (FrameLayout) findViewById(com.kolosta.rejin.jilosa.R.id.navigation_bar_item_icon_container);
        this.I5GHvsYW = (ImageView) findViewById(com.kolosta.rejin.jilosa.R.id.navigation_bar_item_icon_view);
        BaselineLayout baselineLayout = (BaselineLayout) findViewById(com.kolosta.rejin.jilosa.R.id.navigation_bar_item_labels_group);
        this.RXQxj5Oe = baselineLayout;
        TextView textView = (TextView) findViewById(com.kolosta.rejin.jilosa.R.id.navigation_bar_item_small_label_view);
        this.FySoLYna = textView;
        TextView textView2 = (TextView) findViewById(com.kolosta.rejin.jilosa.R.id.navigation_bar_item_large_label_view);
        this.gjV1z5T1 = textView2;
        float dimension = getResources().getDimension(com.kolosta.rejin.jilosa.R.dimen.default_navigation_text_size);
        float dimension2 = getResources().getDimension(com.kolosta.rejin.jilosa.R.dimen.default_navigation_active_text_size);
        BaselineLayout baselineLayout2 = new BaselineLayout(getContext());
        this.WYNAV5pd = baselineLayout2;
        baselineLayout2.setVisibility(8);
        this.WYNAV5pd.setDuplicateParentStateEnabled(true);
        this.WYNAV5pd.setMeasurePaddingFromBaseline(this.Sjrx9cEN);
        TextView textView3 = new TextView(getContext());
        this.DK9slbsy = textView3;
        textView3.setMaxLines(1);
        TextView textView4 = this.DK9slbsy;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView4.setEllipsize(truncateAt);
        this.DK9slbsy.setDuplicateParentStateEnabled(true);
        this.DK9slbsy.setIncludeFontPadding(false);
        this.DK9slbsy.setGravity(16);
        this.DK9slbsy.setTextSize(dimension);
        TextView textView5 = new TextView(getContext());
        this.lwWCatUu = textView5;
        textView5.setMaxLines(1);
        this.lwWCatUu.setEllipsize(truncateAt);
        this.lwWCatUu.setDuplicateParentStateEnabled(true);
        this.lwWCatUu.setVisibility(4);
        this.lwWCatUu.setIncludeFontPadding(false);
        this.lwWCatUu.setGravity(16);
        this.lwWCatUu.setTextSize(dimension2);
        this.WYNAV5pd.addView(this.DK9slbsy);
        this.WYNAV5pd.addView(this.lwWCatUu);
        this.U0LaHZX7 = baselineLayout;
        setBackgroundResource(getItemBackgroundResId());
        this.VgvYg0wo = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.P7K7Inc8 = baselineLayout.getPaddingBottom();
        this.b2ZJblxo = 0;
        this.Qr9iLBAD = 0;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        this.DK9slbsy.setImportantForAccessibility(2);
        this.lwWCatUu.setImportantForAccessibility(2);
        setFocusable(true);
        NCTxEWno();
        this.bvfAo0eO = getResources().getDimensionPixelSize(com.kolosta.rejin.jilosa.R.dimen.m3_navigation_item_expanded_active_indicator_height_default);
        linearLayout.addOnLayoutChangeListener(new s3(1, (q2) this));
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < indexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof iv) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconWidth() {
        t1 t1Var = this.g2aRJUAd;
        int minimumWidth = t1Var == null ? 0 : t1Var.getMinimumWidth() - this.g2aRJUAd.P7K7Inc8.NCTxEWno.gjV1z5T1.intValue();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.Ey6iv0m0.getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.I5GHvsYW.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    public static void jb9XjC4I(View view, int i, int i2, int i3) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i2;
        layoutParams.gravity = i3;
        view.setLayoutParams(layoutParams);
    }

    private void setLabelPivots(TextView textView) {
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    public final void MdtA4re8() {
        Drawable drawable = this.wxUZMvaN;
        boolean z = true;
        if (this.MdtA4re8 != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.nSmgoSB5 && activeIndicatorDrawable != null) {
                ?? rippleDrawable = new RippleDrawable(q30.NCTxEWno(this.MdtA4re8), null, activeIndicatorDrawable);
                FocusRingDrawable.VgvYg0wo(getContext(), rippleDrawable, activeIndicatorDrawable instanceof tr ? (tr) activeIndicatorDrawable : null);
                r3 = rippleDrawable;
                z = false;
            } else if (drawable == null) {
                ColorStateList colorStateList = this.MdtA4re8;
                int[] iArr = q30.wxUZMvaN;
                int qoPGr6Ce = q30.qoPGr6Ce(colorStateList, q30.MdtA4re8);
                int[] iArr2 = q30.NCTxEWno;
                drawable = new RippleDrawable(new ColorStateList(new int[][]{iArr, iArr2, StateSet.NOTHING}, new int[]{qoPGr6Ce, q30.qoPGr6Ce(colorStateList, iArr2), q30.qoPGr6Ce(colorStateList, q30.qoPGr6Ce)}), null, null);
                Context context = getContext();
                ColorDrawable colorDrawable = FocusRingDrawable.OxcuoDLp;
                if (ra.ytu5o6f4(context.getTheme(), com.kolosta.rejin.jilosa.R.attr.focusRingsEnabled, false)) {
                    drawable = new FocusRingDrawable(context, drawable);
                }
            }
        }
        FrameLayout frameLayout = this.Ey6iv0m0;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setForeground(r3);
        setBackground(drawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z);
        }
    }

    public final void NCTxEWno() {
        float textSize = this.FySoLYna.getTextSize();
        float textSize2 = this.gjV1z5T1.getTextSize();
        this.jb9XjC4I = textSize - textSize2;
        this.eVhOlqcC = (textSize2 * 1.0f) / textSize;
        this.k3x7lurq = (textSize * 1.0f) / textSize2;
        float textSize3 = this.DK9slbsy.getTextSize();
        float textSize4 = this.lwWCatUu.getTextSize();
        this.ow5vqvCr = textSize3 - textSize4;
        this.OnDfzHZD = (textSize4 * 1.0f) / textSize3;
        this.ygLcUYwZ = (textSize3 * 1.0f) / textSize4;
    }

    public final void OnDfzHZD() {
        cs csVar = this.VhgXwMj9;
        if (csVar != null) {
            setVisibility((!csVar.isVisible() || (!this.pP9Y2m6O && this.tef3qNMP)) ? 8 : 0);
        }
    }

    public final void P7K7Inc8(TextView textView, TextView textView2, float f, float f2) {
        jb9XjC4I(this.OxcuoDLp, this.ESscZ9M1 == 0 ? (int) (this.VgvYg0wo + f2) : 0, 0, this.LfKQckgD);
        int i = this.ESscZ9M1;
        jb9XjC4I(this.amk52bBQ, i == 0 ? 0 : this.hGvurcGl.top, i == 0 ? 0 : this.hGvurcGl.bottom, i == 0 ? 17 : 8388627);
        int i2 = this.P7K7Inc8;
        BaselineLayout baselineLayout = this.RXQxj5Oe;
        baselineLayout.setPadding(baselineLayout.getPaddingLeft(), baselineLayout.getPaddingTop(), baselineLayout.getPaddingRight(), i2);
        this.U0LaHZX7.setVisibility(0);
        textView.setScaleX(1.0f);
        textView.setScaleY(1.0f);
        textView.setVisibility(0);
        textView2.setScaleX(f);
        textView2.setScaleY(f);
        textView2.setVisibility(4);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Qr9iLBAD(TextView textView, int i) {
        int i2;
        if (this.LvHlPNBd) {
            textView.setTextAppearance(i);
            return;
        }
        textView.setTextAppearance(i);
        Context context = textView.getContext();
        if (i != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, z00.RXQxj5Oe);
            TypedValue typedValue = new TypedValue();
            boolean value = obtainStyledAttributes.getValue(0, typedValue);
            obtainStyledAttributes.recycle();
            if (value) {
                int complexUnit = typedValue.getComplexUnit();
                int i3 = typedValue.data;
                i2 = complexUnit == 2 ? Math.round(TypedValue.complexToFloat(i3) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(i3, context.getResources().getDisplayMetrics());
                if (i2 == 0) {
                    textView.setTextSize(0, i2);
                    return;
                }
                return;
            }
        }
        i2 = 0;
        if (i2 == 0) {
        }
    }

    public final void VgvYg0wo() {
        int i = this.I5GHvsYW.getLayoutParams().width > 0 ? this.Qr9iLBAD : 0;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.WYNAV5pd.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.rightMargin = getLayoutDirection() == 1 ? i : 0;
            layoutParams.leftMargin = getLayoutDirection() != 1 ? i : 0;
        }
    }

    public final void b2ZJblxo() {
        int i = this.VgvYg0wo;
        jb9XjC4I(this.OxcuoDLp, i, i, this.ESscZ9M1 == 0 ? 17 : this.LfKQckgD);
        jb9XjC4I(this.amk52bBQ, 0, 0, 17);
        BaselineLayout baselineLayout = this.RXQxj5Oe;
        baselineLayout.setPadding(baselineLayout.getPaddingLeft(), baselineLayout.getPaddingTop(), baselineLayout.getPaddingRight(), 0);
        this.U0LaHZX7.setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.nSmgoSB5) {
            this.Ey6iv0m0.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void eVhOlqcC(View view) {
        if (this.g2aRJUAd != null) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                t1 t1Var = this.g2aRJUAd;
                if (t1Var != null) {
                    if (t1Var.wxUZMvaN() != null) {
                        t1Var.wxUZMvaN().setForeground(null);
                    } else {
                        view.getOverlay().remove(t1Var);
                    }
                }
            }
            this.g2aRJUAd = null;
        }
    }

    public Drawable getActiveIndicatorDrawable() {
        return this.KlHjfFWx.getBackground();
    }

    public t1 getBadge() {
        return this.g2aRJUAd;
    }

    public BaselineLayout getExpandedLabelGroup() {
        return this.WYNAV5pd;
    }

    public int getItemBackgroundResId() {
        return com.kolosta.rejin.jilosa.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // defpackage.qs
    public cs getItemData() {
        return this.VhgXwMj9;
    }

    public int getItemDefaultMarginResId() {
        return com.kolosta.rejin.jilosa.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.i7xS8jrb;
    }

    public BaselineLayout getLabelGroup() {
        return this.RXQxj5Oe;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        LinearLayout linearLayout = this.OxcuoDLp;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        return linearLayout.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        if (this.ESscZ9M1 == 1) {
            LinearLayout linearLayout = this.amk52bBQ;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            return linearLayout.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        }
        BaselineLayout baselineLayout = this.RXQxj5Oe;
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) baselineLayout.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), baselineLayout.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
    }

    public final void k3x7lurq(int i) {
        if (i > 0 || getVisibility() != 0) {
            int min = Math.min(this.N8VPGzVC, i - (this.gmkaJpmS * 2));
            int i2 = this.HdOGZAzC;
            if (this.ESscZ9M1 == 1) {
                int i3 = i - (this.TrssYQ34 * 2);
                int i4 = this.ZyZthT5G;
                if (i4 != -1) {
                    i3 = i4 == -2 ? this.OxcuoDLp.getMeasuredWidth() : Math.min(i4, i3);
                }
                min = i3;
                i2 = Math.max(this.bvfAo0eO, this.amk52bBQ.getMeasuredHeight());
            }
            View view = this.KlHjfFWx;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (this.KRabZ4CU && this.lDXGDhIF == 2) {
                i2 = min;
            }
            layoutParams.height = i2;
            layoutParams.width = Math.max(0, min);
            view.setLayoutParams(layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        cs csVar = this.VhgXwMj9;
        if (csVar != null && csVar.isCheckable() && this.VhgXwMj9.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, Wi7iiXC4);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        t1 t1Var = this.g2aRJUAd;
        if (t1Var != null && t1Var.isVisible()) {
            cs csVar = this.VhgXwMj9;
            CharSequence charSequence = csVar.VgvYg0wo;
            if (!TextUtils.isEmpty(csVar.OxcuoDLp)) {
                charSequence = this.VhgXwMj9.OxcuoDLp;
            }
            StringBuilder sb = new StringBuilder();
            sb.append((Object) charSequence);
            sb.append(", ");
            t1 t1Var2 = this.g2aRJUAd;
            w1 w1Var = t1Var2.P7K7Inc8;
            Object obj = null;
            if (t1Var2.isVisible()) {
                v1 v1Var = w1Var.NCTxEWno;
                if (v1Var.k3x7lurq != null) {
                    obj = v1Var.sjUBp5pO;
                    if (obj == null) {
                        obj = t1Var2.P7K7Inc8.NCTxEWno.k3x7lurq;
                    }
                } else if (!t1Var2.b2ZJblxo()) {
                    obj = v1Var.OxcuoDLp;
                } else if (v1Var.amk52bBQ != 0 && (context = (Context) t1Var2.NCTxEWno.get()) != null) {
                    if (t1Var2.jb9XjC4I != -2) {
                        int VgvYg0wo = t1Var2.VgvYg0wo();
                        int i = t1Var2.jb9XjC4I;
                        if (VgvYg0wo > i) {
                            obj = context.getString(v1Var.KlHjfFWx, Integer.valueOf(i));
                        }
                    }
                    obj = context.getResources().getQuantityString(v1Var.amk52bBQ, t1Var2.VgvYg0wo(), Integer.valueOf(t1Var2.VgvYg0wo()));
                }
            }
            sb.append(obj);
            accessibilityNodeInfo.setContentDescription(sb.toString());
        }
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) aZz0PFXp.wxUZMvaN.qoPGr6Ce);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.kolosta.rejin.jilosa.R.string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new g3(i, 2, this));
    }

    public final void ow5vqvCr(TextView textView, int i) {
        if (textView == null) {
            return;
        }
        Qr9iLBAD(textView, i);
        NCTxEWno();
        textView.setMinimumHeight(w30.euDDoUNr(textView.getContext(), i));
        ColorStateList colorStateList = this.eIA6dogk;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        TextView textView2 = this.gjV1z5T1;
        textView2.setTypeface(textView2.getTypeface(), this.pRiPUEwG ? 1 : 0);
        TextView textView3 = this.lwWCatUu;
        textView3.setTypeface(textView3.getTypeface(), this.pRiPUEwG ? 1 : 0);
    }

    @Override // defpackage.qs
    public final void qoPGr6Ce(cs csVar) {
        this.VhgXwMj9 = csVar;
        setCheckable(csVar.isCheckable());
        setChecked(csVar.isChecked());
        setEnabled(csVar.isEnabled());
        setIcon(csVar.getIcon());
        setTitle(csVar.VgvYg0wo);
        setId(csVar.qoPGr6Ce);
        if (!TextUtils.isEmpty(csVar.OxcuoDLp)) {
            setContentDescription(csVar.OxcuoDLp);
        }
        e50.ygLcUYwZ(this, !TextUtils.isEmpty(csVar.amk52bBQ) ? csVar.amk52bBQ : csVar.VgvYg0wo);
        OnDfzHZD();
        this.NCTxEWno = true;
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        this.KlHjfFWx.setBackground(drawable);
        MdtA4re8();
    }

    public void setActiveIndicatorEnabled(boolean z) {
        this.nSmgoSB5 = z;
        MdtA4re8();
        this.KlHjfFWx.setVisibility(z ? 0 : 8);
        requestLayout();
    }

    public void setActiveIndicatorExpandedHeight(int i) {
        this.bvfAo0eO = i;
        k3x7lurq(getWidth());
    }

    public void setActiveIndicatorExpandedMarginHorizontal(int i) {
        this.TrssYQ34 = i;
        if (this.ESscZ9M1 == 1) {
            setPadding(i, 0, i, 0);
        }
        k3x7lurq(getWidth());
    }

    public void setActiveIndicatorExpandedPadding(Rect rect) {
        this.hGvurcGl = rect;
    }

    public void setActiveIndicatorExpandedWidth(int i) {
        this.ZyZthT5G = i;
        k3x7lurq(getWidth());
    }

    public void setActiveIndicatorHeight(int i) {
        this.HdOGZAzC = i;
        k3x7lurq(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i) {
        if (this.b2ZJblxo != i) {
            this.b2ZJblxo = i;
            ((LinearLayout.LayoutParams) this.RXQxj5Oe.getLayoutParams()).topMargin = i;
            BaselineLayout baselineLayout = this.WYNAV5pd;
            if (baselineLayout.getLayoutParams() != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) baselineLayout.getLayoutParams();
                layoutParams.rightMargin = getLayoutDirection() == 1 ? i : 0;
                if (getLayoutDirection() == 1) {
                    i = 0;
                }
                layoutParams.leftMargin = i;
                requestLayout();
            }
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.gmkaJpmS = i;
        k3x7lurq(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.KRabZ4CU = z;
    }

    public void setActiveIndicatorWidth(int i) {
        this.N8VPGzVC = i;
        k3x7lurq(getWidth());
    }

    public void setBadge(t1 t1Var) {
        t1 t1Var2 = this.g2aRJUAd;
        if (t1Var2 == t1Var) {
            return;
        }
        ImageView imageView = this.I5GHvsYW;
        if (t1Var2 != null && imageView != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            eVhOlqcC(imageView);
        }
        this.g2aRJUAd = t1Var;
        int i = this.VGmz0ccI;
        w1 w1Var = t1Var.P7K7Inc8;
        if (w1Var.ow5vqvCr != i) {
            w1Var.ow5vqvCr = i;
            t1Var.eVhOlqcC();
        }
        if (imageView == null || this.g2aRJUAd == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        t1 t1Var3 = this.g2aRJUAd;
        Rect rect = new Rect();
        imageView.getDrawingRect(rect);
        t1Var3.setBounds(rect);
        t1Var3.jb9XjC4I(imageView, null);
        if (t1Var3.wxUZMvaN() != null) {
            t1Var3.wxUZMvaN().setForeground(t1Var3);
        } else {
            imageView.getOverlay().add(t1Var3);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        TextView textView = this.gjV1z5T1;
        setLabelPivots(textView);
        TextView textView2 = this.FySoLYna;
        setLabelPivots(textView2);
        TextView textView3 = this.lwWCatUu;
        setLabelPivots(textView3);
        TextView textView4 = this.DK9slbsy;
        setLabelPivots(textView4);
        float f = z ? 1.0f : 0.0f;
        if (this.nSmgoSB5 && this.NCTxEWno && isAttachedToWindow()) {
            ValueAnimator valueAnimator = this.hzgxAD8d;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.hzgxAD8d = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.FXJmAAN1, f);
            this.hzgxAD8d = ofFloat;
            ofFloat.addUpdateListener(new gv(this, f));
            this.hzgxAD8d.setInterpolator(w30.hzgxAD8d(getContext(), com.kolosta.rejin.jilosa.R.attr.motionEasingEmphasizedInterpolator, yoc1Y4KB.NCTxEWno));
            this.hzgxAD8d.setDuration(ra.eIA6dogk(getContext(), com.kolosta.rejin.jilosa.R.attr.motionDurationLong2, getResources().getInteger(com.kolosta.rejin.jilosa.R.integer.material_motion_duration_long_1)));
            this.hzgxAD8d.start();
        } else {
            wxUZMvaN(f, f);
        }
        float f2 = this.jb9XjC4I;
        float f3 = this.eVhOlqcC;
        float f4 = this.k3x7lurq;
        if (this.ESscZ9M1 == 1) {
            f2 = this.ow5vqvCr;
            f3 = this.OnDfzHZD;
            f4 = this.ygLcUYwZ;
            textView = textView3;
            textView2 = textView4;
        }
        int i = this.lDXGDhIF;
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        b2ZJblxo();
                    }
                } else if (z) {
                    P7K7Inc8(textView, textView2, f3, f2);
                } else {
                    P7K7Inc8(textView2, textView, f4, 0.0f);
                }
            } else if (z) {
                P7K7Inc8(textView, textView2, f3, 0.0f);
            } else {
                b2ZJblxo();
            }
        } else if (this.sjUBp5pO) {
            if (z) {
                P7K7Inc8(textView, textView2, f3, 0.0f);
            } else {
                b2ZJblxo();
            }
        } else if (z) {
            P7K7Inc8(textView, textView2, f3, f2);
        } else {
            P7K7Inc8(textView2, textView, f4, 0.0f);
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.FySoLYna.setEnabled(z);
        this.gjV1z5T1.setEnabled(z);
        this.DK9slbsy.setEnabled(z);
        this.lwWCatUu.setEnabled(z);
        this.I5GHvsYW.setEnabled(z);
    }

    @Override // defpackage.lv
    public void setExpanded(boolean z) {
        this.pP9Y2m6O = z;
        OnDfzHZD();
    }

    public void setHorizontalTextAppearanceActive(int i) {
        this.SgZGMMPL = i;
        if (i == 0) {
            i = this.Mq3SeTnW;
        }
        ow5vqvCr(this.lwWCatUu, i);
    }

    public void setHorizontalTextAppearanceInactive(int i) {
        this.ytu5o6f4 = i;
        if (i == 0) {
            i = this.euDDoUNr;
        }
        TextView textView = this.DK9slbsy;
        if (textView == null) {
            return;
        }
        Qr9iLBAD(textView, i);
        NCTxEWno();
        textView.setMinimumHeight(w30.euDDoUNr(textView.getContext(), i));
        ColorStateList colorStateList = this.eIA6dogk;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.Xkz7p5xa) {
            return;
        }
        this.Xkz7p5xa = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.fVMzMhyS = drawable;
            ColorStateList colorStateList = this.aZz0PFXp;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.I5GHvsYW.setImageDrawable(drawable);
    }

    public void setIconLabelHorizontalSpacing(int i) {
        if (this.Qr9iLBAD != i) {
            this.Qr9iLBAD = i;
            VgvYg0wo();
            requestLayout();
        }
    }

    public void setIconSize(int i) {
        ImageView imageView = this.I5GHvsYW;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        imageView.setLayoutParams(layoutParams);
        VgvYg0wo();
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.aZz0PFXp = colorStateList;
        if (this.VhgXwMj9 == null || (drawable = this.fVMzMhyS) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.fVMzMhyS.invalidateSelf();
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.wxUZMvaN = drawable;
        MdtA4re8();
    }

    public void setItemGravity(int i) {
        this.LfKQckgD = i;
        requestLayout();
    }

    public void setItemIconGravity(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (this.ESscZ9M1 != i) {
            this.ESscZ9M1 = i;
            this.VGmz0ccI = 0;
            BaselineLayout baselineLayout = this.RXQxj5Oe;
            this.U0LaHZX7 = baselineLayout;
            BaselineLayout baselineLayout2 = this.WYNAV5pd;
            LinearLayout linearLayout = this.amk52bBQ;
            int i8 = 8;
            if (i == 1) {
                if (baselineLayout2.getParent() == null) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 17;
                    linearLayout.addView(baselineLayout2, layoutParams);
                    VgvYg0wo();
                }
                Rect rect = this.hGvurcGl;
                int i9 = rect.left;
                int i10 = rect.right;
                int i11 = rect.top;
                i2 = rect.bottom;
                this.VGmz0ccI = 1;
                int i12 = this.TrssYQ34;
                this.U0LaHZX7 = baselineLayout2;
                i6 = i11;
                i5 = i10;
                i4 = i9;
                i3 = i12;
                i7 = 0;
            } else {
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                i6 = 0;
                i7 = 8;
                i8 = 0;
            }
            baselineLayout.setVisibility(i8);
            baselineLayout2.setVisibility(i7);
            ((FrameLayout.LayoutParams) this.OxcuoDLp.getLayoutParams()).gravity = this.LfKQckgD;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams2.leftMargin = i4;
            layoutParams2.rightMargin = i5;
            layoutParams2.topMargin = i6;
            layoutParams2.bottomMargin = i2;
            setPadding(i3, 0, i3, 0);
            k3x7lurq(getWidth());
            MdtA4re8();
        }
    }

    public void setItemPaddingBottom(int i) {
        if (this.P7K7Inc8 != i) {
            this.P7K7Inc8 = i;
            cs csVar = this.VhgXwMj9;
            if (csVar != null) {
                setChecked(csVar.isChecked());
            }
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.VgvYg0wo != i) {
            this.VgvYg0wo = i;
            cs csVar = this.VhgXwMj9;
            if (csVar != null) {
                setChecked(csVar.isChecked());
            }
        }
    }

    public void setItemPosition(int i) {
        this.i7xS8jrb = i;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.MdtA4re8 = colorStateList;
        MdtA4re8();
    }

    public void setLabelFontScalingEnabled(boolean z) {
        this.LvHlPNBd = z;
        setTextAppearanceActive(this.Mq3SeTnW);
        setTextAppearanceInactive(this.euDDoUNr);
        setHorizontalTextAppearanceActive(this.SgZGMMPL);
        setHorizontalTextAppearanceInactive(this.ytu5o6f4);
    }

    public void setLabelMaxLines(int i) {
        TextView textView = this.FySoLYna;
        textView.setMaxLines(i);
        TextView textView2 = this.gjV1z5T1;
        textView2.setMaxLines(i);
        this.DK9slbsy.setMaxLines(i);
        this.lwWCatUu.setMaxLines(i);
        if (Build.VERSION.SDK_INT > 34) {
            textView.setGravity(17);
            textView2.setGravity(17);
        } else if (i > 1) {
            textView.setEllipsize(null);
            textView2.setEllipsize(null);
            textView.setGravity(17);
            textView2.setGravity(17);
        } else {
            textView.setGravity(16);
            textView2.setGravity(16);
        }
        requestLayout();
    }

    public void setLabelVisibilityMode(int i) {
        if (this.lDXGDhIF != i) {
            this.lDXGDhIF = i;
            if (this.KRabZ4CU && i == 2) {
                this.zCflySGU = orhfF2Ya;
            } else {
                this.zCflySGU = QT4Tf9Dt;
            }
            k3x7lurq(getWidth());
            cs csVar = this.VhgXwMj9;
            if (csVar != null) {
                setChecked(csVar.isChecked());
            }
        }
    }

    public void setMeasureBottomPaddingFromLabelBaseline(boolean z) {
        this.Sjrx9cEN = z;
        this.RXQxj5Oe.setMeasurePaddingFromBaseline(z);
        this.FySoLYna.setIncludeFontPadding(z);
        this.gjV1z5T1.setIncludeFontPadding(z);
        this.WYNAV5pd.setMeasurePaddingFromBaseline(z);
        this.DK9slbsy.setIncludeFontPadding(z);
        this.lwWCatUu.setIncludeFontPadding(z);
        requestLayout();
    }

    @Override // defpackage.lv
    public void setOnlyShowWhenExpanded(boolean z) {
        this.tef3qNMP = z;
        OnDfzHZD();
    }

    public void setShifting(boolean z) {
        if (this.sjUBp5pO != z) {
            this.sjUBp5pO = z;
            cs csVar = this.VhgXwMj9;
            if (csVar != null) {
                setChecked(csVar.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i) {
        this.Mq3SeTnW = i;
        ow5vqvCr(this.gjV1z5T1, i);
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z) {
        this.pRiPUEwG = z;
        setTextAppearanceActive(this.Mq3SeTnW);
        setHorizontalTextAppearanceActive(this.SgZGMMPL);
        TextView textView = this.gjV1z5T1;
        textView.setTypeface(textView.getTypeface(), this.pRiPUEwG ? 1 : 0);
        TextView textView2 = this.lwWCatUu;
        textView2.setTypeface(textView2.getTypeface(), this.pRiPUEwG ? 1 : 0);
    }

    public void setTextAppearanceInactive(int i) {
        this.euDDoUNr = i;
        TextView textView = this.FySoLYna;
        if (textView == null) {
            return;
        }
        Qr9iLBAD(textView, i);
        NCTxEWno();
        textView.setMinimumHeight(w30.euDDoUNr(textView.getContext(), i));
        ColorStateList colorStateList = this.eIA6dogk;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.eIA6dogk = colorStateList;
        if (colorStateList != null) {
            this.FySoLYna.setTextColor(colorStateList);
            this.gjV1z5T1.setTextColor(colorStateList);
            this.DK9slbsy.setTextColor(colorStateList);
            this.lwWCatUu.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.FySoLYna.setText(charSequence);
        this.gjV1z5T1.setText(charSequence);
        this.DK9slbsy.setText(charSequence);
        this.lwWCatUu.setText(charSequence);
        cs csVar = this.VhgXwMj9;
        if (csVar == null || TextUtils.isEmpty(csVar.OxcuoDLp)) {
            setContentDescription(charSequence);
        }
        cs csVar2 = this.VhgXwMj9;
        if (csVar2 != null && !TextUtils.isEmpty(csVar2.amk52bBQ)) {
            charSequence = this.VhgXwMj9.amk52bBQ;
        }
        e50.ygLcUYwZ(this, charSequence);
    }

    public final void wxUZMvaN(float f, float f2) {
        re reVar = this.zCflySGU;
        reVar.getClass();
        float qoPGr6Ce = yoc1Y4KB.qoPGr6Ce(0.4f, 1.0f, f);
        View view = this.KlHjfFWx;
        view.setScaleX(qoPGr6Ce);
        view.setScaleY(reVar.NCTxEWno(f));
        view.setAlpha(yoc1Y4KB.NCTxEWno(0.0f, 1.0f, f2 == 0.0f ? 0.8f : 0.0f, f2 == 0.0f ? 1.0f : 0.2f, f));
        this.FXJmAAN1 = f;
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : getContext().getDrawable(i));
    }
}

package H3;

import O.X;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.icefishinggame.icefishinggamemultigames.C5275R;
import java.util.WeakHashMap;
import m.Z;

/* loaded from: classes2.dex */
public final class A extends LinearLayout {

    /* renamed from: A, reason: collision with root package name */
    public ImageView.ScaleType f1085A;

    /* renamed from: B, reason: collision with root package name */
    public View.OnLongClickListener f1086B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1087C;

    /* renamed from: n, reason: collision with root package name */
    public final TextInputLayout f1088n;

    /* renamed from: u, reason: collision with root package name */
    public final Z f1089u;

    /* renamed from: v, reason: collision with root package name */
    public CharSequence f1090v;

    /* renamed from: w, reason: collision with root package name */
    public final CheckableImageButton f1091w;

    /* renamed from: x, reason: collision with root package name */
    public ColorStateList f1092x;

    /* renamed from: y, reason: collision with root package name */
    public PorterDuff.Mode f1093y;

    /* renamed from: z, reason: collision with root package name */
    public int f1094z;

    public A(TextInputLayout textInputLayout, j4.g gVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f1088n = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C5275R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f1091w = checkableImageButton;
        Z z3 = new Z(getContext(), null);
        this.f1089u = z3;
        if (O3.b.y(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f1086B;
        checkableImageButton.setOnClickListener(null);
        t8.g.F(checkableImageButton, onLongClickListener);
        this.f1086B = null;
        checkableImageButton.setOnLongClickListener(null);
        t8.g.F(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) gVar.f38405v;
        if (typedArray.hasValue(69)) {
            this.f1092x = O3.b.n(getContext(), gVar, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f1093y = y3.k.g(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            b(gVar.i(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(C5275R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f1094z) {
            this.f1094z = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType e9 = t8.g.e(typedArray.getInt(68, -1));
            this.f1085A = e9;
            checkableImageButton.setScaleType(e9);
        }
        z3.setVisibility(8);
        z3.setId(C5275R.id.textinput_prefix_text);
        z3.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = X.f2054a;
        z3.setAccessibilityLiveRegion(1);
        z3.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            z3.setTextColor(gVar.h(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f1090v = TextUtils.isEmpty(text2) ? null : text2;
        z3.setText(text2);
        e();
        addView(checkableImageButton);
        addView(z3);
    }

    public final int a() {
        int i;
        CheckableImageButton checkableImageButton = this.f1091w;
        if (checkableImageButton.getVisibility() == 0) {
            i = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i = 0;
        }
        WeakHashMap weakHashMap = X.f2054a;
        return this.f1089u.getPaddingStart() + getPaddingStart() + i;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f1091w;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f1092x;
            PorterDuff.Mode mode = this.f1093y;
            TextInputLayout textInputLayout = this.f1088n;
            t8.g.a(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            t8.g.C(textInputLayout, checkableImageButton, this.f1092x);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.f1086B;
        checkableImageButton.setOnClickListener(null);
        t8.g.F(checkableImageButton, onLongClickListener);
        this.f1086B = null;
        checkableImageButton.setOnLongClickListener(null);
        t8.g.F(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z3) {
        CheckableImageButton checkableImageButton = this.f1091w;
        if ((checkableImageButton.getVisibility() == 0) != z3) {
            checkableImageButton.setVisibility(z3 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        int paddingStart;
        EditText editText = this.f1088n.f36133w;
        if (editText == null) {
            return;
        }
        if (this.f1091w.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = X.f2054a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C5275R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = X.f2054a;
        this.f1089u.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void e() {
        int i = (this.f1090v == null || this.f1087C) ? 8 : 0;
        setVisibility((this.f1091w.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f1089u.setVisibility(i);
        this.f1088n.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i6) {
        super.onMeasure(i, i6);
        d();
    }
}

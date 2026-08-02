package J3;

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
import com.IceFishing.LiveIceFishing.C5248R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import m.Z;

/* loaded from: classes2.dex */
public final class A extends LinearLayout {

    /* renamed from: A, reason: collision with root package name */
    public ImageView.ScaleType f1441A;

    /* renamed from: B, reason: collision with root package name */
    public View.OnLongClickListener f1442B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1443C;

    /* renamed from: n, reason: collision with root package name */
    public final TextInputLayout f1444n;

    /* renamed from: u, reason: collision with root package name */
    public final Z f1445u;

    /* renamed from: v, reason: collision with root package name */
    public CharSequence f1446v;

    /* renamed from: w, reason: collision with root package name */
    public final CheckableImageButton f1447w;

    /* renamed from: x, reason: collision with root package name */
    public ColorStateList f1448x;

    /* renamed from: y, reason: collision with root package name */
    public PorterDuff.Mode f1449y;

    /* renamed from: z, reason: collision with root package name */
    public int f1450z;

    public A(TextInputLayout textInputLayout, l4.g gVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f1444n = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C5248R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f1447w = checkableImageButton;
        Z z6 = new Z(getContext(), null);
        this.f1445u = z6;
        if (com.bumptech.glide.f.n(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f1442B;
        checkableImageButton.setOnClickListener(null);
        com.bumptech.glide.f.t(checkableImageButton, onLongClickListener);
        this.f1442B = null;
        checkableImageButton.setOnLongClickListener(null);
        com.bumptech.glide.f.t(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) gVar.f38917v;
        if (typedArray.hasValue(69)) {
            this.f1448x = com.bumptech.glide.f.k(getContext(), gVar, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f1449y = A3.n.g(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            b(gVar.i(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(C5248R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f1450z) {
            this.f1450z = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType f2 = com.bumptech.glide.f.f(typedArray.getInt(68, -1));
            this.f1441A = f2;
            checkableImageButton.setScaleType(f2);
        }
        z6.setVisibility(8);
        z6.setId(C5248R.id.textinput_prefix_text);
        z6.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = X.f2142a;
        z6.setAccessibilityLiveRegion(1);
        z6.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            z6.setTextColor(gVar.h(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f1446v = TextUtils.isEmpty(text2) ? null : text2;
        z6.setText(text2);
        e();
        addView(checkableImageButton);
        addView(z6);
    }

    public final int a() {
        int i;
        CheckableImageButton checkableImageButton = this.f1447w;
        if (checkableImageButton.getVisibility() == 0) {
            i = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i = 0;
        }
        WeakHashMap weakHashMap = X.f2142a;
        return this.f1445u.getPaddingStart() + getPaddingStart() + i;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f1447w;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f1448x;
            PorterDuff.Mode mode = this.f1449y;
            TextInputLayout textInputLayout = this.f1444n;
            com.bumptech.glide.f.b(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            com.bumptech.glide.f.s(textInputLayout, checkableImageButton, this.f1448x);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.f1442B;
        checkableImageButton.setOnClickListener(null);
        com.bumptech.glide.f.t(checkableImageButton, onLongClickListener);
        this.f1442B = null;
        checkableImageButton.setOnLongClickListener(null);
        com.bumptech.glide.f.t(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z6) {
        CheckableImageButton checkableImageButton = this.f1447w;
        if ((checkableImageButton.getVisibility() == 0) != z6) {
            checkableImageButton.setVisibility(z6 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        int paddingStart;
        EditText editText = this.f1444n.f36900w;
        if (editText == null) {
            return;
        }
        if (this.f1447w.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = X.f2142a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C5248R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = X.f2142a;
        this.f1445u.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void e() {
        int i = (this.f1446v == null || this.f1443C) ? 8 : 0;
        setVisibility((this.f1447w.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f1445u.setVisibility(i);
        this.f1444n.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        d();
    }
}

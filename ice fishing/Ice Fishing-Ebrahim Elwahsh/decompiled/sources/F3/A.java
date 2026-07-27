package F3;

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
import com.icefishing.icefishingliveapp.C5284R;
import java.util.WeakHashMap;
import m.Q0;
import m.Z;

/* loaded from: classes2.dex */
public final class A extends LinearLayout {

    /* renamed from: A, reason: collision with root package name */
    public ImageView.ScaleType f996A;

    /* renamed from: B, reason: collision with root package name */
    public View.OnLongClickListener f997B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f998C;

    /* renamed from: n, reason: collision with root package name */
    public final TextInputLayout f999n;

    /* renamed from: u, reason: collision with root package name */
    public final Z f1000u;

    /* renamed from: v, reason: collision with root package name */
    public CharSequence f1001v;

    /* renamed from: w, reason: collision with root package name */
    public final CheckableImageButton f1002w;

    /* renamed from: x, reason: collision with root package name */
    public ColorStateList f1003x;

    /* renamed from: y, reason: collision with root package name */
    public PorterDuff.Mode f1004y;

    /* renamed from: z, reason: collision with root package name */
    public int f1005z;

    public A(TextInputLayout textInputLayout, Q0 q02) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f999n = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C5284R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f1002w = checkableImageButton;
        Z z8 = new Z(getContext(), null);
        this.f1000u = z8;
        if (com.bumptech.glide.d.u(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f997B;
        checkableImageButton.setOnClickListener(null);
        Z5.c.o(checkableImageButton, onLongClickListener);
        this.f997B = null;
        checkableImageButton.setOnLongClickListener(null);
        Z5.c.o(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) q02.f39326c;
        if (typedArray.hasValue(69)) {
            this.f1003x = com.bumptech.glide.d.p(getContext(), q02, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f1004y = w3.k.g(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            b(q02.g(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(C5284R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f1005z) {
            this.f1005z = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType d2 = Z5.c.d(typedArray.getInt(68, -1));
            this.f996A = d2;
            checkableImageButton.setScaleType(d2);
        }
        z8.setVisibility(8);
        z8.setId(C5284R.id.textinput_prefix_text);
        z8.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = X.f2240a;
        z8.setAccessibilityLiveRegion(1);
        z8.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            z8.setTextColor(q02.f(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f1001v = TextUtils.isEmpty(text2) ? null : text2;
        z8.setText(text2);
        e();
        addView(checkableImageButton);
        addView(z8);
    }

    public final int a() {
        int i;
        CheckableImageButton checkableImageButton = this.f1002w;
        if (checkableImageButton.getVisibility() == 0) {
            i = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i = 0;
        }
        WeakHashMap weakHashMap = X.f2240a;
        return this.f1000u.getPaddingStart() + getPaddingStart() + i;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f1002w;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f1003x;
            PorterDuff.Mode mode = this.f1004y;
            TextInputLayout textInputLayout = this.f999n;
            Z5.c.a(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            Z5.c.n(textInputLayout, checkableImageButton, this.f1003x);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.f997B;
        checkableImageButton.setOnClickListener(null);
        Z5.c.o(checkableImageButton, onLongClickListener);
        this.f997B = null;
        checkableImageButton.setOnLongClickListener(null);
        Z5.c.o(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z8) {
        CheckableImageButton checkableImageButton = this.f1002w;
        if ((checkableImageButton.getVisibility() == 0) != z8) {
            checkableImageButton.setVisibility(z8 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        int paddingStart;
        EditText editText = this.f999n.f36298w;
        if (editText == null) {
            return;
        }
        if (this.f1002w.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = X.f2240a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C5284R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = X.f2240a;
        this.f1000u.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void e() {
        int i = (this.f1001v == null || this.f998C) ? 8 : 0;
        setVisibility((this.f1002w.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f1000u.setVisibility(i);
        this.f999n.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        d();
    }
}

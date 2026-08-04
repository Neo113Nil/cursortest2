package com.gamericefishpro.space.na;

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
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.n.i0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends LinearLayout {
    public ImageView.ScaleType A;
    public View.OnLongClickListener B;
    public boolean C;
    public final TextInputLayout d;
    public final i0 e;
    public CharSequence i;
    public final CheckableImageButton v;
    public ColorStateList w;
    public PorterDuff.Mode y;
    public int z;

    public v(TextInputLayout textInputLayout, com.gamericefishpro.space.a8.c cVar) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.d = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.v = checkableImageButton;
        i0 i0Var = new i0(getContext(), null);
        this.e = i0Var;
        if (com.gamericefishpro.space.hj.c.E(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.B;
        checkableImageButton.setOnClickListener(null);
        d5.X(checkableImageButton, onLongClickListener);
        this.B = null;
        checkableImageButton.setOnLongClickListener(null);
        d5.X(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) cVar.i;
        if (typedArray.hasValue(70)) {
            this.w = com.gamericefishpro.space.hj.c.w(getContext(), cVar, 70);
        }
        if (typedArray.hasValue(71)) {
            this.y = com.gamericefishpro.space.fa.l.f(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            b(cVar.l(67));
            if (typedArray.hasValue(66) && checkableImageButton.getContentDescription() != (text = typedArray.getText(66))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.z) {
            this.z = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(69)) {
            ImageView.ScaleType scaleTypeS = d5.s(typedArray.getInt(69, -1));
            this.A = scaleTypeS;
            checkableImageButton.setScaleType(scaleTypeS);
        }
        i0Var.setVisibility(8);
        i0Var.setId(R.id.textinput_prefix_text);
        i0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        i0Var.setAccessibilityLiveRegion(1);
        i0Var.setTextAppearance(typedArray.getResourceId(61, 0));
        if (typedArray.hasValue(62)) {
            i0Var.setTextColor(cVar.k(62));
        }
        CharSequence text2 = typedArray.getText(60);
        this.i = TextUtils.isEmpty(text2) ? null : text2;
        i0Var.setText(text2);
        e();
        addView(checkableImageButton);
        addView(i0Var);
    }

    public final int a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.v;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        return this.e.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.v;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.w;
            PorterDuff.Mode mode = this.y;
            TextInputLayout textInputLayout = this.d;
            d5.j(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            d5.S(textInputLayout, checkableImageButton, this.w);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.B;
        checkableImageButton.setOnClickListener(null);
        d5.X(checkableImageButton, onLongClickListener);
        this.B = null;
        checkableImageButton.setOnLongClickListener(null);
        d5.X(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z) {
        CheckableImageButton checkableImageButton = this.v;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            checkableImageButton.setVisibility(z ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        EditText editText = this.d.w;
        if (editText == null) {
            return;
        }
        this.e.setPaddingRelative(this.v.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void e() {
        int i = (this.i == null || this.C) ? 8 : 0;
        setVisibility((this.v.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.e.setVisibility(i);
        this.d.s();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        d();
    }
}

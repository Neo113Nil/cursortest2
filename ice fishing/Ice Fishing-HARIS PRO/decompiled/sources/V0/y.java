package V0;

import O.K;
import a.AbstractC0078a;
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
import com.lumenpath.harispro.hrnavigator.R;
import java.util.WeakHashMap;
import m.C0245b0;

/* loaded from: classes.dex */
public final class y extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f1364a;

    /* renamed from: b, reason: collision with root package name */
    public final C0245b0 f1365b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f1366c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f1367d;
    public ColorStateList e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f1368f;

    /* renamed from: g, reason: collision with root package name */
    public int f1369g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView.ScaleType f1370h;
    public View.OnLongClickListener i;
    public boolean j;

    public y(TextInputLayout textInputLayout, M0.h hVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f1364a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f1367d = checkableImageButton;
        C0245b0 c0245b0 = new C0245b0(getContext(), null);
        this.f1365b = c0245b0;
        if (AbstractC0078a.M(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.i;
        checkableImageButton.setOnClickListener(null);
        R.j.l0(checkableImageButton, onLongClickListener);
        this.i = null;
        checkableImageButton.setOnLongClickListener(null);
        R.j.l0(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) hVar.f617c;
        if (typedArray.hasValue(69)) {
            this.e = AbstractC0078a.A(getContext(), hVar, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f1368f = L0.m.i(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            b(hVar.c(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f1369g) {
            this.f1369g = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType o2 = R.j.o(typedArray.getInt(68, -1));
            this.f1370h = o2;
            checkableImageButton.setScaleType(o2);
        }
        c0245b0.setVisibility(8);
        c0245b0.setId(R.id.textinput_prefix_text);
        c0245b0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = K.f747a;
        c0245b0.setAccessibilityLiveRegion(1);
        c0245b0.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            c0245b0.setTextColor(hVar.b(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f1366c = TextUtils.isEmpty(text2) ? null : text2;
        c0245b0.setText(text2);
        e();
        addView(checkableImageButton);
        addView(c0245b0);
    }

    public final int a() {
        int i;
        CheckableImageButton checkableImageButton = this.f1367d;
        if (checkableImageButton.getVisibility() == 0) {
            i = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i = 0;
        }
        WeakHashMap weakHashMap = K.f747a;
        return this.f1365b.getPaddingStart() + getPaddingStart() + i;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f1367d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.e;
            PorterDuff.Mode mode = this.f1368f;
            TextInputLayout textInputLayout = this.f1364a;
            R.j.e(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            R.j.g0(textInputLayout, checkableImageButton, this.e);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.i;
        checkableImageButton.setOnClickListener(null);
        R.j.l0(checkableImageButton, onLongClickListener);
        this.i = null;
        checkableImageButton.setOnLongClickListener(null);
        R.j.l0(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z2) {
        CheckableImageButton checkableImageButton = this.f1367d;
        if ((checkableImageButton.getVisibility() == 0) != z2) {
            checkableImageButton.setVisibility(z2 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        int paddingStart;
        EditText editText = this.f1364a.f2621d;
        if (editText == null) {
            return;
        }
        if (this.f1367d.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = K.f747a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = K.f747a;
        this.f1365b.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void e() {
        int i = (this.f1366c == null || this.j) ? 8 : 0;
        setVisibility((this.f1367d.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f1365b.setVisibility(i);
        this.f1364a.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        d();
    }
}

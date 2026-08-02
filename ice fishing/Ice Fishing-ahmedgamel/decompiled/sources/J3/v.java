package J3;

import O.X;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.IceFishing.LiveIceFishing.C5248R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.Z;
import n3.AbstractC4770a;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f1537A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f1538B;

    /* renamed from: a, reason: collision with root package name */
    public final int f1539a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1540b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1541c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f1542d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f1543e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f1544f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f1545g;

    /* renamed from: h, reason: collision with root package name */
    public final TextInputLayout f1546h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public int f1547j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f1548k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f1549l;

    /* renamed from: m, reason: collision with root package name */
    public final float f1550m;

    /* renamed from: n, reason: collision with root package name */
    public int f1551n;

    /* renamed from: o, reason: collision with root package name */
    public int f1552o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f1553p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1554q;

    /* renamed from: r, reason: collision with root package name */
    public Z f1555r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f1556s;

    /* renamed from: t, reason: collision with root package name */
    public int f1557t;

    /* renamed from: u, reason: collision with root package name */
    public int f1558u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f1559v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f1560w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1561x;

    /* renamed from: y, reason: collision with root package name */
    public Z f1562y;

    /* renamed from: z, reason: collision with root package name */
    public int f1563z;

    public v(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f1545g = context;
        this.f1546h = textInputLayout;
        this.f1550m = context.getResources().getDimensionPixelSize(C5248R.dimen.design_textinput_caption_translate_y);
        this.f1539a = N3.C.R(context, C5248R.attr.motionDurationShort4, 217);
        this.f1540b = N3.C.R(context, C5248R.attr.motionDurationMedium4, 167);
        this.f1541c = N3.C.R(context, C5248R.attr.motionDurationShort4, 167);
        this.f1542d = N3.C.S(context, C5248R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC4770a.f39644d);
        LinearInterpolator linearInterpolator = AbstractC4770a.f39641a;
        this.f1543e = N3.C.S(context, C5248R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f1544f = N3.C.S(context, C5248R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(Z z6, int i) {
        if (this.i == null && this.f1548k == null) {
            Context context = this.f1545g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.f1546h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f1548k = new FrameLayout(context);
            this.i.addView(this.f1548k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.f1548k.setVisibility(0);
            this.f1548k.addView(z6);
        } else {
            this.i.addView(z6, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.f1547j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.f1546h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f1545g;
                boolean n9 = com.bumptech.glide.f.n(context);
                LinearLayout linearLayout = this.i;
                WeakHashMap weakHashMap = X.f2142a;
                int paddingStart = editText.getPaddingStart();
                if (n9) {
                    paddingStart = context.getResources().getDimensionPixelSize(C5248R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(C5248R.dimen.material_helper_text_default_padding_top);
                if (n9) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(C5248R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (n9) {
                    paddingEnd = context.getResources().getDimensionPixelSize(C5248R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f1549l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z6, Z z9, int i, int i4, int i6) {
        if (z9 == null || !z6) {
            return;
        }
        if (i == i6 || i == i4) {
            boolean z10 = i6 == i;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(z9, (Property<Z, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
            int i9 = this.f1541c;
            ofFloat.setDuration(z10 ? this.f1540b : i9);
            ofFloat.setInterpolator(z10 ? this.f1543e : this.f1544f);
            if (i == i6 && i4 != 0) {
                ofFloat.setStartDelay(i9);
            }
            arrayList.add(ofFloat);
            if (i6 != i || i4 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(z9, (Property<Z, Float>) View.TRANSLATION_Y, -this.f1550m, 0.0f);
            ofFloat2.setDuration(this.f1539a);
            ofFloat2.setInterpolator(this.f1542d);
            ofFloat2.setStartDelay(i9);
            arrayList.add(ofFloat2);
        }
    }

    public final TextView e(int i) {
        if (i == 1) {
            return this.f1555r;
        }
        if (i != 2) {
            return null;
        }
        return this.f1562y;
    }

    public final void f() {
        this.f1553p = null;
        c();
        if (this.f1551n == 1) {
            if (!this.f1561x || TextUtils.isEmpty(this.f1560w)) {
                this.f1552o = 0;
            } else {
                this.f1552o = 2;
            }
        }
        i(this.f1551n, this.f1552o, h(this.f1555r, ""));
    }

    public final void g(Z z6, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f1548k) != null) {
            frameLayout.removeView(z6);
        } else {
            linearLayout.removeView(z6);
        }
        int i4 = this.f1547j - 1;
        this.f1547j = i4;
        LinearLayout linearLayout2 = this.i;
        if (i4 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(Z z6, CharSequence charSequence) {
        WeakHashMap weakHashMap = X.f2142a;
        TextInputLayout textInputLayout = this.f1546h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f1552o == this.f1551n && z6 != null && TextUtils.equals(z6.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void i(int i, int i4, boolean z6) {
        TextView e9;
        TextView e10;
        v vVar = this;
        if (i == i4) {
            return;
        }
        if (z6) {
            AnimatorSet animatorSet = new AnimatorSet();
            vVar.f1549l = animatorSet;
            ArrayList arrayList = new ArrayList();
            vVar.d(arrayList, vVar.f1561x, vVar.f1562y, 2, i, i4);
            vVar.d(arrayList, vVar.f1554q, vVar.f1555r, 1, i, i4);
            int size = arrayList.size();
            long j6 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                Animator animator = (Animator) arrayList.get(i6);
                j6 = Math.max(j6, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
            ofInt.setDuration(j6);
            arrayList.add(0, ofInt);
            animatorSet.playTogether(arrayList);
            t tVar = new t(this, i4, e(i), i, vVar.e(i4));
            vVar = this;
            animatorSet.addListener(tVar);
            animatorSet.start();
        } else if (i != i4) {
            if (i4 != 0 && (e10 = vVar.e(i4)) != null) {
                e10.setVisibility(0);
                e10.setAlpha(1.0f);
            }
            if (i != 0 && (e9 = e(i)) != null) {
                e9.setVisibility(4);
                if (i == 1) {
                    e9.setText((CharSequence) null);
                }
            }
            vVar.f1551n = i4;
        }
        TextInputLayout textInputLayout = vVar.f1546h;
        textInputLayout.r();
        textInputLayout.u(z6, false);
        textInputLayout.x();
    }
}

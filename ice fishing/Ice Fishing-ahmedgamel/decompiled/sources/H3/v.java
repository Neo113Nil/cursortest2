package H3;

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
import com.google.android.material.textfield.TextInputLayout;
import com.icefishing.icefishingbigwin.C5275R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l3.AbstractC4661a;
import m.Z;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f1181A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f1182B;

    /* renamed from: a, reason: collision with root package name */
    public final int f1183a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1184b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1185c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f1186d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f1187e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f1188f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f1189g;

    /* renamed from: h, reason: collision with root package name */
    public final TextInputLayout f1190h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public int f1191j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f1192k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f1193l;

    /* renamed from: m, reason: collision with root package name */
    public final float f1194m;

    /* renamed from: n, reason: collision with root package name */
    public int f1195n;

    /* renamed from: o, reason: collision with root package name */
    public int f1196o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f1197p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1198q;

    /* renamed from: r, reason: collision with root package name */
    public Z f1199r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f1200s;

    /* renamed from: t, reason: collision with root package name */
    public int f1201t;

    /* renamed from: u, reason: collision with root package name */
    public int f1202u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f1203v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f1204w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1205x;

    /* renamed from: y, reason: collision with root package name */
    public Z f1206y;

    /* renamed from: z, reason: collision with root package name */
    public int f1207z;

    public v(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f1189g = context;
        this.f1190h = textInputLayout;
        this.f1194m = context.getResources().getDimensionPixelSize(C5275R.dimen.design_textinput_caption_translate_y);
        this.f1183a = t8.g.D(context, C5275R.attr.motionDurationShort4, 217);
        this.f1184b = t8.g.D(context, C5275R.attr.motionDurationMedium4, 167);
        this.f1185c = t8.g.D(context, C5275R.attr.motionDurationShort4, 167);
        this.f1186d = t8.g.E(context, C5275R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC4661a.f38906d);
        LinearInterpolator linearInterpolator = AbstractC4661a.f38903a;
        this.f1187e = t8.g.E(context, C5275R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f1188f = t8.g.E(context, C5275R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(Z z3, int i) {
        if (this.i == null && this.f1192k == null) {
            Context context = this.f1189g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.f1190h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f1192k = new FrameLayout(context);
            this.i.addView(this.f1192k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.f1192k.setVisibility(0);
            this.f1192k.addView(z3);
        } else {
            this.i.addView(z3, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.f1191j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.f1190h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f1189g;
                boolean y7 = O3.b.y(context);
                LinearLayout linearLayout = this.i;
                WeakHashMap weakHashMap = X.f2054a;
                int paddingStart = editText.getPaddingStart();
                if (y7) {
                    paddingStart = context.getResources().getDimensionPixelSize(C5275R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(C5275R.dimen.material_helper_text_default_padding_top);
                if (y7) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(C5275R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (y7) {
                    paddingEnd = context.getResources().getDimensionPixelSize(C5275R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f1193l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z3, Z z6, int i, int i6, int i9) {
        if (z6 == null || !z3) {
            return;
        }
        if (i == i9 || i == i6) {
            boolean z9 = i9 == i;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(z6, (Property<Z, Float>) View.ALPHA, z9 ? 1.0f : 0.0f);
            int i10 = this.f1185c;
            ofFloat.setDuration(z9 ? this.f1184b : i10);
            ofFloat.setInterpolator(z9 ? this.f1187e : this.f1188f);
            if (i == i9 && i6 != 0) {
                ofFloat.setStartDelay(i10);
            }
            arrayList.add(ofFloat);
            if (i9 != i || i6 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(z6, (Property<Z, Float>) View.TRANSLATION_Y, -this.f1194m, 0.0f);
            ofFloat2.setDuration(this.f1183a);
            ofFloat2.setInterpolator(this.f1186d);
            ofFloat2.setStartDelay(i10);
            arrayList.add(ofFloat2);
        }
    }

    public final TextView e(int i) {
        if (i == 1) {
            return this.f1199r;
        }
        if (i != 2) {
            return null;
        }
        return this.f1206y;
    }

    public final void f() {
        this.f1197p = null;
        c();
        if (this.f1195n == 1) {
            if (!this.f1205x || TextUtils.isEmpty(this.f1204w)) {
                this.f1196o = 0;
            } else {
                this.f1196o = 2;
            }
        }
        i(this.f1195n, this.f1196o, h(this.f1199r, ""));
    }

    public final void g(Z z3, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f1192k) != null) {
            frameLayout.removeView(z3);
        } else {
            linearLayout.removeView(z3);
        }
        int i6 = this.f1191j - 1;
        this.f1191j = i6;
        LinearLayout linearLayout2 = this.i;
        if (i6 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(Z z3, CharSequence charSequence) {
        WeakHashMap weakHashMap = X.f2054a;
        TextInputLayout textInputLayout = this.f1190h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f1196o == this.f1195n && z3 != null && TextUtils.equals(z3.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void i(int i, int i6, boolean z3) {
        TextView e9;
        TextView e10;
        v vVar = this;
        if (i == i6) {
            return;
        }
        if (z3) {
            AnimatorSet animatorSet = new AnimatorSet();
            vVar.f1193l = animatorSet;
            ArrayList arrayList = new ArrayList();
            vVar.d(arrayList, vVar.f1205x, vVar.f1206y, 2, i, i6);
            vVar.d(arrayList, vVar.f1198q, vVar.f1199r, 1, i, i6);
            int size = arrayList.size();
            long j6 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                Animator animator = (Animator) arrayList.get(i9);
                j6 = Math.max(j6, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
            ofInt.setDuration(j6);
            arrayList.add(0, ofInt);
            animatorSet.playTogether(arrayList);
            t tVar = new t(this, i6, e(i), i, vVar.e(i6));
            vVar = this;
            animatorSet.addListener(tVar);
            animatorSet.start();
        } else if (i != i6) {
            if (i6 != 0 && (e10 = vVar.e(i6)) != null) {
                e10.setVisibility(0);
                e10.setAlpha(1.0f);
            }
            if (i != 0 && (e9 = e(i)) != null) {
                e9.setVisibility(4);
                if (i == 1) {
                    e9.setText((CharSequence) null);
                }
            }
            vVar.f1195n = i6;
        }
        TextInputLayout textInputLayout = vVar.f1190h;
        textInputLayout.r();
        textInputLayout.u(z3, false);
        textInputLayout.x();
    }
}

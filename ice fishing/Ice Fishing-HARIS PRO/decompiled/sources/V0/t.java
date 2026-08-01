package V0;

import O.K;
import a.AbstractC0078a;
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
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
import com.lumenpath.harispro.hrnavigator.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.C0245b0;
import v0.AbstractC0360a;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f1327A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f1328B;

    /* renamed from: a, reason: collision with root package name */
    public final int f1329a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1330b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1331c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f1332d;
    public final TimeInterpolator e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f1333f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f1334g;

    /* renamed from: h, reason: collision with root package name */
    public final TextInputLayout f1335h;
    public LinearLayout i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f1336k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f1337l;

    /* renamed from: m, reason: collision with root package name */
    public final float f1338m;

    /* renamed from: n, reason: collision with root package name */
    public int f1339n;

    /* renamed from: o, reason: collision with root package name */
    public int f1340o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f1341p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1342q;

    /* renamed from: r, reason: collision with root package name */
    public C0245b0 f1343r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f1344s;

    /* renamed from: t, reason: collision with root package name */
    public int f1345t;

    /* renamed from: u, reason: collision with root package name */
    public int f1346u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f1347v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f1348w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1349x;

    /* renamed from: y, reason: collision with root package name */
    public C0245b0 f1350y;

    /* renamed from: z, reason: collision with root package name */
    public int f1351z;

    public t(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f1334g = context;
        this.f1335h = textInputLayout;
        this.f1338m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f1329a = AbstractC0078a.W(context, R.attr.motionDurationShort4, 217);
        this.f1330b = AbstractC0078a.W(context, R.attr.motionDurationMedium4, 167);
        this.f1331c = AbstractC0078a.W(context, R.attr.motionDurationShort4, 167);
        this.f1332d = AbstractC0078a.X(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC0360a.f4483d);
        LinearInterpolator linearInterpolator = AbstractC0360a.f4480a;
        this.e = AbstractC0078a.X(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f1333f = AbstractC0078a.X(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(C0245b0 c0245b0, int i) {
        if (this.i == null && this.f1336k == null) {
            Context context = this.f1334g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.f1335h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f1336k = new FrameLayout(context);
            this.i.addView(this.f1336k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.f1336k.setVisibility(0);
            this.f1336k.addView(c0245b0);
        } else {
            this.i.addView(c0245b0, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.f1335h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f1334g;
                boolean M2 = AbstractC0078a.M(context);
                LinearLayout linearLayout = this.i;
                WeakHashMap weakHashMap = K.f747a;
                int paddingStart = editText.getPaddingStart();
                if (M2) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (M2) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (M2) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f1337l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z2, C0245b0 c0245b0, int i, int i2, int i3) {
        if (c0245b0 == null || !z2) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z3 = i3 == i;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c0245b0, (Property<C0245b0, Float>) View.ALPHA, z3 ? 1.0f : 0.0f);
            int i4 = this.f1331c;
            ofFloat.setDuration(z3 ? this.f1330b : i4);
            ofFloat.setInterpolator(z3 ? this.e : this.f1333f);
            if (i == i3 && i2 != 0) {
                ofFloat.setStartDelay(i4);
            }
            arrayList.add(ofFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c0245b0, (Property<C0245b0, Float>) View.TRANSLATION_Y, -this.f1338m, RecyclerView.f2111C0);
            ofFloat2.setDuration(this.f1329a);
            ofFloat2.setInterpolator(this.f1332d);
            ofFloat2.setStartDelay(i4);
            arrayList.add(ofFloat2);
        }
    }

    public final TextView e(int i) {
        if (i == 1) {
            return this.f1343r;
        }
        if (i != 2) {
            return null;
        }
        return this.f1350y;
    }

    public final void f() {
        this.f1341p = null;
        c();
        if (this.f1339n == 1) {
            if (!this.f1349x || TextUtils.isEmpty(this.f1348w)) {
                this.f1340o = 0;
            } else {
                this.f1340o = 2;
            }
        }
        i(this.f1339n, this.f1340o, h(this.f1343r, ""));
    }

    public final void g(C0245b0 c0245b0, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f1336k) != null) {
            frameLayout.removeView(c0245b0);
        } else {
            linearLayout.removeView(c0245b0);
        }
        int i2 = this.j - 1;
        this.j = i2;
        LinearLayout linearLayout2 = this.i;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(C0245b0 c0245b0, CharSequence charSequence) {
        WeakHashMap weakHashMap = K.f747a;
        TextInputLayout textInputLayout = this.f1335h;
        return textInputLayout.isLaidOut() && textInputLayout.isEnabled() && !(this.f1340o == this.f1339n && c0245b0 != null && TextUtils.equals(c0245b0.getText(), charSequence));
    }

    public final void i(int i, int i2, boolean z2) {
        TextView e;
        TextView e2;
        if (i == i2) {
            return;
        }
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f1337l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f1349x, this.f1350y, 2, i, i2);
            d(arrayList, this.f1342q, this.f1343r, 1, i, i2);
            int size = arrayList.size();
            long j = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Animator animator = (Animator) arrayList.get(i3);
                j = Math.max(j, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
            ofInt.setDuration(j);
            arrayList.add(0, ofInt);
            animatorSet.playTogether(arrayList);
            animatorSet.addListener(new r(this, i2, e(i), i, e(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (e2 = e(i2)) != null) {
                e2.setVisibility(0);
                e2.setAlpha(1.0f);
            }
            if (i != 0 && (e = e(i)) != null) {
                e.setVisibility(4);
                if (i == 1) {
                    e.setText((CharSequence) null);
                }
            }
            this.f1339n = i2;
        }
        TextInputLayout textInputLayout = this.f1335h;
        textInputLayout.r();
        textInputLayout.u(z2, false);
        textInputLayout.x();
    }
}

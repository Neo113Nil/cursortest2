package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.shape.a;
import java.util.ArrayList;
import java.util.Iterator;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class mjc {
    public static final k5c B = wm0.c;
    public static final int C = R.attr.motionDurationLong2;
    public static final int D = R.attr.motionEasingEmphasizedInterpolator;
    public static final int E = R.attr.motionDurationMedium1;
    public static final int F = R.attr.motionEasingEmphasizedAccelerateInterpolator;
    public static final int[] G = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    public static final int[] H = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] I = {android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] J = {android.R.attr.state_hovered, android.R.attr.state_enabled};
    public static final int[] K = {android.R.attr.state_enabled};
    public static final int[] L = new int[0];
    public eup a;
    public ljc b;
    public RippleDrawable c;
    public yc3 d;
    public RippleDrawable e;
    public boolean f;
    public float h;
    public float i;
    public float j;
    public int k;
    public StateListAnimator l;
    public Animator m;
    public zei n;
    public zei o;
    public int q;
    public ArrayList s;
    public ArrayList t;
    public ArrayList u;
    public final FloatingActionButton v;
    public final g8c w;
    public boolean g = true;
    public float p = 1.0f;
    public int r = 0;
    public final Rect x = new Rect();
    public final RectF y = new RectF();
    public final RectF z = new RectF();
    public final Matrix A = new Matrix();

    public mjc(FloatingActionButton floatingActionButton, g8c g8cVar) {
        this.v = floatingActionButton;
        this.w = g8cVar;
    }

    public final void a(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.v.getDrawable();
        if (drawable == null || this.q == 0) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        RectF rectF = this.y;
        rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        float f2 = this.q;
        RectF rectF2 = this.z;
        rectF2.set(0.0f, 0.0f, f2, f2);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f3 = this.q / 2.0f;
        matrix.postScale(f, f, f3, f3);
    }

    public final AnimatorSet b(zei zeiVar, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f};
        FloatingActionButton floatingActionButton = this.v;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        zeiVar.f("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f2);
        zeiVar.f("scale").a(ofFloat2);
        int i = Build.VERSION.SDK_INT;
        if (i == 26) {
            ofFloat2.setEvaluator(new kjc());
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f2);
        zeiVar.f("scale").a(ofFloat3);
        if (i == 26) {
            ofFloat3.setEvaluator(new kjc());
        }
        arrayList.add(ofFloat3);
        Matrix matrix = this.A;
        a(f3, matrix);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(floatingActionButton, new ss2(), new jjc(this), new Matrix(matrix));
        zeiVar.f("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        fgq.C(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(final float f, final float f2, final float f3, int i, int i2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.v;
        final float alpha = floatingActionButton.getAlpha();
        final float scaleX = floatingActionButton.getScaleX();
        final float scaleY = floatingActionButton.getScaleY();
        final float f4 = this.p;
        final Matrix matrix = new Matrix(this.A);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: hjc
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mjc mjcVar = mjc.this;
                FloatingActionButton floatingActionButton2 = mjcVar.v;
                floatingActionButton2.setAlpha(wm0.b(alpha, f, 0.0f, 0.2f, floatValue));
                float f5 = scaleX;
                float f6 = f2;
                floatingActionButton2.setScaleX(wm0.a(f5, f6, floatValue));
                floatingActionButton2.setScaleY(wm0.a(scaleY, f6, floatValue));
                float f7 = f4;
                float f8 = f3;
                mjcVar.p = wm0.a(f7, f8, floatValue);
                float a = wm0.a(f7, f8, floatValue);
                Matrix matrix2 = matrix;
                mjcVar.a(a, matrix2);
                floatingActionButton2.setImageMatrix(matrix2);
            }
        });
        arrayList.add(ofFloat);
        fgq.C(animatorSet, arrayList);
        animatorSet.setDuration(szf.p0(floatingActionButton.getContext(), i, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(szf.q0(floatingActionButton.getContext(), i2, wm0.b));
        return animatorSet;
    }

    public final AnimatorSet d(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = {f};
        FloatingActionButton floatingActionButton = this.v;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(B);
        return animatorSet;
    }

    public final void e(float f, float f2, float f3) {
        FloatingActionButton floatingActionButton = this.v;
        if (floatingActionButton.getStateListAnimator() == this.l) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(G, d(f, f3));
            stateListAnimator.addState(H, d(f, f2));
            stateListAnimator.addState(I, d(f, f2));
            stateListAnimator.addState(J, d(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f).setDuration(0L));
            if (Build.VERSION.SDK_INT <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(B);
            stateListAnimator.addState(K, animatorSet);
            stateListAnimator.addState(L, d(0.0f, 0.0f));
            this.l = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (((FloatingActionButton) this.w.a).k || (this.f && floatingActionButton.getSizeDimension() < this.k)) {
            i();
        }
    }

    public final void f() {
        ArrayList arrayList = this.u;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                gjc gjcVar = (gjc) it.next();
                efo efoVar = gjcVar.a;
                FloatingActionButton floatingActionButton = gjcVar.b;
                efoVar.getClass();
                BottomAppBar bottomAppBar = (BottomAppBar) efoVar.b;
                bottomAppBar.E0.s((floatingActionButton.getVisibility() == 0 && bottomAppBar.J0 == 1) ? floatingActionButton.getScaleY() : 0.0f);
            }
        }
    }

    public final void g() {
        od3 topEdgeTreatment;
        od3 topEdgeTreatment2;
        od3 topEdgeTreatment3;
        od3 topEdgeTreatment4;
        ArrayList arrayList = this.u;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                gjc gjcVar = (gjc) it.next();
                efo efoVar = gjcVar.a;
                FloatingActionButton floatingActionButton = gjcVar.b;
                efoVar.getClass();
                BottomAppBar bottomAppBar = (BottomAppBar) efoVar.b;
                int i = bottomAppBar.J0;
                a aVar = bottomAppBar.E0;
                if (i == 1) {
                    float translationX = floatingActionButton.getTranslationX();
                    topEdgeTreatment = bottomAppBar.getTopEdgeTreatment();
                    if (topEdgeTreatment.q != translationX) {
                        topEdgeTreatment4 = bottomAppBar.getTopEdgeTreatment();
                        topEdgeTreatment4.q = translationX;
                        aVar.invalidateSelf();
                    }
                    float max = Math.max(0.0f, -floatingActionButton.getTranslationY());
                    topEdgeTreatment2 = bottomAppBar.getTopEdgeTreatment();
                    if (topEdgeTreatment2.p != max) {
                        topEdgeTreatment3 = bottomAppBar.getTopEdgeTreatment();
                        topEdgeTreatment3.b0(max);
                        aVar.invalidateSelf();
                    }
                    aVar.s(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
                }
            }
        }
    }

    public final void h(eup eupVar) {
        this.a = eupVar;
        ljc ljcVar = this.b;
        if (ljcVar != null) {
            ljcVar.setShapeAppearanceModel(eupVar);
        }
        Drawable.Callback callback = this.c;
        if (callback instanceof fvp) {
            ((fvp) callback).setShapeAppearanceModel(eupVar);
        }
        yc3 yc3Var = this.d;
        if (yc3Var != null) {
            yc3Var.o = eupVar;
            yc3Var.invalidateSelf();
        }
    }

    public final void i() {
        g8c g8cVar = this.w;
        FloatingActionButton floatingActionButton = (FloatingActionButton) g8cVar.a;
        FloatingActionButton floatingActionButton2 = (FloatingActionButton) g8cVar.a;
        boolean z = floatingActionButton.k;
        boolean z2 = this.f;
        Rect rect = this.x;
        FloatingActionButton floatingActionButton3 = this.v;
        if (z) {
            int max = z2 ? Math.max((this.k - floatingActionButton3.getSizeDimension()) / 2, 0) : 0;
            int max2 = Math.max(max, (int) Math.ceil(this.g ? floatingActionButton3.getElevation() + this.j : 0.0f));
            int max3 = Math.max(max, (int) Math.ceil(r1 * 1.5f));
            rect.set(max2, max3, max2, max3);
        } else {
            if (z2) {
                int sizeDimension = floatingActionButton3.getSizeDimension();
                int i = this.k;
                if (sizeDimension < i) {
                    int sizeDimension2 = (i - floatingActionButton3.getSizeDimension()) / 2;
                    rect.set(sizeDimension2, sizeDimension2, sizeDimension2, sizeDimension2);
                }
            }
            rect.set(0, 0, 0, 0);
        }
        o5g.w(this.e, "Didn't initialize content background");
        if (((FloatingActionButton) g8cVar.a).k || (this.f && floatingActionButton3.getSizeDimension() < this.k)) {
            super/*android.view.View*/.setBackgroundDrawable(new InsetDrawable((Drawable) this.e, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            RippleDrawable rippleDrawable = this.e;
            if (rippleDrawable != null) {
                super/*android.view.View*/.setBackgroundDrawable(rippleDrawable);
            }
        }
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        floatingActionButton2.l.set(i2, i3, i4, i5);
        int i6 = floatingActionButton2.i;
        floatingActionButton2.setPadding(i2 + i6, i3 + i6, i4 + i6, i5 + i6);
    }
}

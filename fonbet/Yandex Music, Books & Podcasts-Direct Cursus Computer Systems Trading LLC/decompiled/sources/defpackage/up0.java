package defpackage;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.opengl.GLSurfaceView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar;
import com.google.android.material.shape.a;
import com.yandex.passport.internal.entities.j;
import com.yandex.plus.home.animation.e;
import com.yandex.plus.pay.ui.core.mobile.view.confetti.PlusPayConfettiView;
import com.yandex.plus.pay.ui.core.mobile.view.confetti.b;
import java.util.Collection;
import java.util.Iterator;
import kotlin.KotlinVersion;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class up0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ up0(j jVar, PlusPayConfettiView plusPayConfettiView, b bVar) {
        this.a = 7;
        this.b = jVar;
        this.c = plusPayConfettiView;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.List] */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                AppBarLayout appBarLayout = (AppBarLayout) obj2;
                int i2 = AppBarLayout.B;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((a) obj).q(floatValue);
                Drawable drawable = appBarLayout.x;
                if (drawable instanceof a) {
                    ((a) drawable).q(floatValue);
                }
                Iterator it = appBarLayout.r.iterator();
                if (it.hasNext()) {
                    throw hrg.j(it);
                }
                Iterator it2 = appBarLayout.s.iterator();
                while (it2.hasNext()) {
                    fzo fzoVar = (fzo) it2.next();
                    float f = floatValue / appBarLayout.z;
                    SearchBar searchBar = fzoVar.a;
                    ColorStateList colorStateList = searchBar.I0;
                    if (colorStateList != null) {
                        searchBar.U0.r(ColorStateList.valueOf(qgg.W(searchBar.G0, f, colorStateList.getDefaultColor())));
                    }
                }
                return;
            case 1:
                kz7 kz7Var = (kz7) obj2;
                h7g h7gVar = (h7g) obj;
                if (h7gVar.c(true) && h7gVar.m != 0 && kz7Var.isVisible()) {
                    kz7Var.invalidateSelf();
                    return;
                }
                return;
            case 2:
                Rect rect = (Rect) obj;
                rect.right = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ((t8p) obj2).j.setClipBounds(rect);
                return;
            case 3:
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) obj2;
                valueAnimator.getClass();
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                layoutParams.y = ((Integer) animatedValue).intValue();
                ((Window) obj).setAttributes(layoutParams);
                return;
            case 4:
                ((View) ((hpv) ((c5p) obj2).b).d.getParent()).invalidate();
                return;
            case 5:
                valueAnimator.getClass();
                ((GLSurfaceView) obj2).queueEvent(new xlr(20, (Function1) obj, valueAnimator));
                return;
            case 6:
                Matrix matrix = (Matrix) obj;
                valueAnimator.getClass();
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                animatedValue2.getClass();
                matrix.setTranslate(((Float) animatedValue2).floatValue() - r3.f, 0.0f);
                ((e) obj2).d.setLocalMatrix(matrix);
                return;
            default:
                j jVar = (j) obj2;
                PlusPayConfettiView plusPayConfettiView = (PlusPayConfettiView) obj;
                valueAnimator.getClass();
                Object animatedValue3 = valueAnimator.getAnimatedValue();
                animatedValue3.getClass();
                float floatValue2 = ((Float) animatedValue3).floatValue();
                jVar.getClass();
                plusPayConfettiView.e = (int) ((1.0f - floatValue2) * KotlinVersion.MAX_COMPONENT_VALUE);
                int size = ((Collection) jVar.d).size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((PointF) plusPayConfettiView.c.get(i3)).x += ((Point) jVar.d.get(i3)).x;
                    ((PointF) plusPayConfettiView.c.get(i3)).y += ((Point) jVar.d.get(i3)).y;
                    int[] iArr = plusPayConfettiView.d;
                    iArr[i3] = (iArr[i3] + 1) % 360;
                }
                plusPayConfettiView.invalidate();
                return;
        }
    }

    public /* synthetic */ up0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}

package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.animation.DecelerateInterpolator;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import com.yandex.go.shortcuts.impl.analytic.ShortcutAnalyticsImpl$Type;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.tariffs.repository.g;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.mapkit.map.PolylineMapObject;
import defpackage.f4c0;
import defpackage.m58;
import defpackage.n58;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.animation.AnimUtils$AnimationEndListener;
import ru.yandex.taxi.animation.AnimUtils$AnimationStartEndListener;
import ru.yandex.taxi.delivery.interactors.p;
import ru.yandex.taxi.map.utils.a;
import ru.yandex.taxi.order.search.ui.bubbles.PollingBubblesViewImpl;

/* loaded from: classes14.dex */
public final class st0 implements qty {
    public final Object A;
    public final Object B;
    public Object C;
    public Object D;
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object w;
    public final Object x;
    public final Object y;
    public final Object z;

    public st0(z1e0 z1e0Var, xm00 xm00Var, ah00 ah00Var, PollingBubblesViewImpl pollingBubblesViewImpl, ys0 ys0Var, v1e0 v1e0Var) {
        xm00 xm00Var2 = v1e0Var.d;
        this.a = z1e0Var;
        this.b = xm00Var;
        this.c = ah00Var;
        this.w = pollingBubblesViewImpl;
        this.x = ys0Var;
        this.y = v1e0Var;
        this.z = new a3y0(TaxiOrderLogGroup.MAP.getTag(), "PollingAnimationFacade");
        m58 m58Var = z1e0Var.a;
        ValueAnimator duration = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat(CaretView.ALPHA_PROPERTY, 1.0f, 0.0f)).setDuration(600L);
        DecelerateInterpolator decelerateInterpolator = v1e0Var.h;
        duration.setInterpolator(decelerateInterpolator);
        duration.addUpdateListener(new yso(18, m58Var));
        this.A = duration;
        m58 m58Var2 = z1e0Var.a;
        float f = v1e0Var.i;
        ah00 ah00Var2 = v1e0Var.a;
        n58 n58Var = m58Var2.d;
        pb30 pb30Var = m58Var2.b;
        Point point = m58Var2.c;
        if (n58Var != null) {
            n58Var.a(pb30Var);
        } else {
            n58Var = new n58(xm00Var2.r(point), v1e0Var.c, pb30Var, xm00Var2);
        }
        f4c0 f4c0Var = n58Var.a;
        if (f4c0Var != null) {
            f4c0Var.i(n58Var.d.c);
        }
        gh00 gh00Var = (gh00) ah00Var2;
        float j = gh00Var.j();
        es00 es00Var = gh00Var.e;
        n58Var.c(j);
        m58Var2.d = n58Var;
        pb30 pb30Var2 = n58Var.d;
        pb30Var2.c = true;
        ScreenPoint e = es00Var.e(point);
        if (e == null) {
            ny61.r("endScreenPoint not-null is required for car appear animation");
            throw null;
        }
        double d = f;
        double radians = (float) Math.toRadians(pb30Var2.w - 90.0f);
        Point d2 = es00Var.d(new ScreenPoint(e.getX() - ((float) (Math.cos(radians) * d)), e.getY() - ((float) (Math.sin(radians) * d))));
        if (d2 == null) {
            ny61.r("startPoint not-null is required for car appear animation");
            throw null;
        }
        ValueAnimator duration2 = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat("latitude", (float) d2.getLatitude(), (float) point.getLatitude()), PropertyValuesHolder.ofFloat("longitude", (float) d2.getLongitude(), (float) point.getLongitude()), PropertyValuesHolder.ofFloat("opacity", 0.0f, 1.0f)).setDuration(1000L);
        duration2.setInterpolator(decelerateInterpolator);
        duration2.addUpdateListener(new vf2(13, pb30Var2, n58Var));
        this.B = duration2;
    }

    public void a() {
        o370 o370Var = (o370) this.D;
        ArrayList arrayList = (ArrayList) this.C;
        o370Var.n(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u70 u70Var = (u70) it.next();
            int i = u70Var.a;
            if (i == 1) {
                ((wls) this.a).invoke(Integer.valueOf(u70Var.b), Integer.valueOf(u70Var.d));
            } else if (i == 2) {
                ((wls) this.b).invoke(Integer.valueOf(u70Var.b), Integer.valueOf(u70Var.d));
            } else if (i == 8) {
                ((wls) this.c).invoke(Integer.valueOf(u70Var.b), Integer.valueOf(u70Var.d));
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            u70 u70Var2 = (u70) it2.next();
            int i2 = u70Var2.a;
            if (i2 == 1) {
                ((wls) this.z).invoke(Integer.valueOf(u70Var2.b), Integer.valueOf(u70Var2.d));
            } else if (i2 == 2) {
                ((wls) this.y).invoke(Integer.valueOf(u70Var2.b), Integer.valueOf(u70Var2.d));
            } else if (i2 == 4) {
                ((zls) this.w).invoke(Integer.valueOf(u70Var2.b), Integer.valueOf(u70Var2.d), u70Var2.c);
            } else if (i2 == 8) {
                ((wls) this.x).invoke(Integer.valueOf(u70Var2.b), Integer.valueOf(u70Var2.d));
            }
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            u70 u70Var3 = (u70) arrayList.get(i3);
            u70Var3.c = null;
            ((m6e0) this.B).a0(u70Var3);
        }
        arrayList.clear();
    }

    public String b() {
        return (String) this.D;
    }

    public String c() {
        return (String) this.y;
    }

    public String d() {
        return (String) this.C;
    }

    public String e() {
        return (String) this.x;
    }

    public List f() {
        return (List) this.A;
    }

    public List g() {
        return (List) this.z;
    }

    public yyr0 h() {
        return (yyr0) this.b;
    }

    public b52 i() {
        return (b52) this.c;
    }

    public String j() {
        return (String) this.w;
    }

    public List k() {
        return (List) this.B;
    }

    public ShortcutAnalyticsImpl$Type l() {
        return (ShortcutAnalyticsImpl$Type) this.a;
    }

    public u70 m(int i, Object obj, int i2, int i3) {
        u70 u70Var = (u70) ((m6e0) this.B).a();
        if (u70Var == null) {
            return new u70(i, obj, i2, i3);
        }
        u70Var.a = i;
        u70Var.b = i2;
        u70Var.d = i3;
        u70Var.c = obj;
        return u70Var;
    }

    public void n() {
        m58 m58Var = ((z1e0) this.a).a;
        ah00 ah00Var = (ah00) this.c;
        ScreenPoint e = ((gh00) ah00Var).e.e(m58Var.c);
        if (e == null) {
            return;
        }
        ScreenPoint x = a.x(e, 0, -((Number) ((ys0) this.x).invoke()).intValue());
        ((PollingBubblesViewImpl) this.w).translateAt(new ScreenPoint(x.getX(), x.getY()));
    }

    public void o() {
        final v1e0 v1e0Var = (v1e0) this.y;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        z1e0 z1e0Var = (z1e0) this.a;
        boolean z = z1e0Var.c;
        final m58 m58Var = z1e0Var.a;
        a3y0 a3y0Var = (a3y0) this.z;
        if (z) {
            a3y0Var.getClass();
            a3y0.h(new String[]{"startAnimation"});
            hst hstVar = jst.e;
            arrayList2.add((ValueAnimator) this.B);
        } else {
            a3y0Var.getClass();
            a3y0.h(new String[]{"startAnimation"});
            hst hstVar2 = jst.e;
        }
        Iterator it = z1e0Var.b.iterator();
        while (true) {
            final int i = 1;
            final int i2 = 0;
            if (!it.hasNext()) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(arrayList);
                animatorSet.addListener(new AnimUtils$AnimationEndListener(new t1e0(animatorSet, 0)));
                this.D = animatorSet;
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.addListener(new AnimUtils$AnimationEndListener(new s1e0(this, i)));
                animatorSet2.playSequentially(arrayList2);
                animatorSet2.start();
                this.C = animatorSet2;
                return;
            }
            Polyline polyline = (Polyline) it.next();
            int size = polyline.getPoints().size() - 2;
            xm00 xm00Var = (xm00) this.b;
            int size2 = polyline.getPoints().size() - 1;
            final w4e0 s = xm00Var.s(polyline);
            s.v(false);
            s.z(1.0f);
            s.p(2.5f);
            f9p f9pVar = new f9p(size2);
            s.t = f9pVar;
            s.s = null;
            ((PolylineMapObject) s.g).setStrokeColors(f9pVar);
            ValueAnimator ofInt = ValueAnimator.ofInt(0, size);
            ofInt.setDuration(1000L);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: u1e0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i3 = i2;
                    v1e0 v1e0Var2 = v1e0Var;
                    w4e0 w4e0Var = s;
                    switch (i3) {
                        case 0:
                            w4e0Var.A(0, v1e0Var2.f);
                            w4e0Var.r(Collections.singletonList(new Subpolyline(new PolylinePosition(0, 0.0d), new PolylinePosition(((Integer) valueAnimator.getAnimatedValue()).intValue(), valueAnimator.getAnimatedFraction()))));
                            break;
                        default:
                            w4e0Var.A(0, v1e0Var2.f);
                            break;
                    }
                }
            });
            ValueAnimator ofInt2 = ValueAnimator.ofInt(size, 0);
            ArrayList arrayList3 = arrayList2;
            Iterator it2 = it;
            PolylinePosition polylinePosition = new PolylinePosition(0, 0.0d);
            ofInt2.setDuration(1000L);
            s.r(Collections.singletonList(new Subpolyline(polylinePosition, new PolylinePosition(size, 1.0d))));
            ofInt2.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.taxi.order.search.ui.search.polling.PollingAnimatorFactory$createRouteAppearAnimator$$inlined$doOnStart$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    f4c0 f4c0Var;
                    m58 m58Var2 = m58.this;
                    m58Var2.e = s;
                    n58 n58Var = m58Var2.d;
                    if (n58Var == null || (f4c0Var = n58Var.a) == null) {
                        return;
                    }
                    f4c0Var.k(4.0f);
                }
            });
            ofInt2.addUpdateListener(new o8m(4, s, v1e0Var, polylinePosition));
            Point point = m58Var.c;
            ValueAnimator ofInt3 = ValueAnimator.ofInt(0, 1500);
            ofInt3.setDuration(1500L);
            ofInt3.addListener(new AnimUtils$AnimationStartEndListener(new yo90(14, v1e0Var, point), new wnb0(19, v1e0Var)));
            ofInt3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: u1e0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i3 = i;
                    v1e0 v1e0Var2 = v1e0Var;
                    w4e0 w4e0Var = s;
                    switch (i3) {
                        case 0:
                            w4e0Var.A(0, v1e0Var2.f);
                            w4e0Var.r(Collections.singletonList(new Subpolyline(new PolylinePosition(0, 0.0d), new PolylinePosition(((Integer) valueAnimator.getAnimatedValue()).intValue(), valueAnimator.getAnimatedFraction()))));
                            break;
                        default:
                            w4e0Var.A(0, v1e0Var2.f);
                            break;
                    }
                }
            });
            arrayList.add(ofInt2);
            arrayList.add(ofInt3);
            arrayList.add(ofInt);
            arrayList3.add(ofInt2);
            arrayList3.add(ofInt3);
            arrayList3.add(ofInt);
            arrayList2 = arrayList3;
            it = it2;
        }
    }

    @Override // defpackage.qty
    public void onChanged(int i, int i2, Object obj) {
        if (i2 >= 1) {
            ((ArrayList) this.C).add(m(4, obj, i, i2));
        }
    }

    @Override // defpackage.qty
    public void onInserted(int i, int i2) {
        if (i2 >= 1) {
            ((ArrayList) this.C).add(m(1, null, i, i2));
        }
    }

    @Override // defpackage.qty
    public void onMoved(int i, int i2) {
        if (i != i2) {
            ((ArrayList) this.C).add(m(8, null, i, i2));
        }
    }

    @Override // defpackage.qty
    public void onRemoved(int i, int i2) {
        if (i2 >= 1) {
            ((ArrayList) this.C).add(m(2, null, i, i2));
        }
    }

    public void p(sls slsVar) {
        ValueAnimator valueAnimator = (ValueAnimator) this.A;
        AnimatorSet animatorSet = (AnimatorSet) this.C;
        if (animatorSet != null) {
            Iterator<Animator> it = animatorSet.getChildAnimations().iterator();
            while (it.hasNext()) {
                it.next().removeAllListeners();
            }
            animatorSet.removeAllListeners();
            animatorSet.cancel();
            this.C = null;
        }
        AnimatorSet animatorSet2 = (AnimatorSet) this.D;
        if (animatorSet2 != null) {
            Iterator<Animator> it2 = animatorSet2.getChildAnimations().iterator();
            while (it2.hasNext()) {
                it2.next().removeAllListeners();
            }
            animatorSet2.removeAllListeners();
            animatorSet2.cancel();
            this.D = null;
        }
        valueAnimator.addListener(new AnimUtils$AnimationStartEndListener(new s1e0(this, 0), new ijs(25, slsVar)));
        valueAnimator.start();
    }

    public st0(wls wlsVar, wls wlsVar2, wls wlsVar3, zls zlsVar, wls wlsVar4, wls wlsVar5, wls wlsVar6) {
        this.a = wlsVar;
        this.b = wlsVar2;
        this.c = wlsVar3;
        this.w = zlsVar;
        this.x = wlsVar4;
        this.y = wlsVar5;
        this.z = wlsVar6;
        this.A = new nf5(this);
        this.B = new m6e0(30);
        this.C = new ArrayList();
        this.D = new o370(new i4u(this));
    }

    public /* synthetic */ st0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.w = obj4;
        this.x = obj5;
        this.y = obj6;
        this.z = obj7;
        this.A = obj8;
        this.B = obj9;
        this.C = obj10;
        this.D = obj11;
    }

    public st0(xjj0 xjj0Var, jpi jpiVar, p pVar, wiq0 wiq0Var, rqo rqoVar, ynj0 ynj0Var, Activity activity, tt2 tt2Var, Context context, pwy0 pwy0Var, g gVar, cq40 cq40Var, iev0 iev0Var, oep0 oep0Var, pho phoVar) {
        this.a = wiq0Var;
        this.b = rqoVar;
        this.c = ynj0Var;
        this.w = activity;
        this.x = tt2Var;
        this.y = context;
        this.z = pwy0Var;
        this.A = gVar;
        this.B = cq40Var;
        this.C = iev0Var;
        this.D = phoVar;
    }

    public st0(gwf gwfVar, gwf gwfVar2, gwf gwfVar3, xvf0 xvf0Var, mx3 mx3Var, xvf0 xvf0Var2, p4 p4Var, gwf gwfVar4, gwf gwfVar5, gu3 gu3Var, qy3 qy3Var) {
        this.c = gwfVar;
        this.w = gwfVar2;
        this.x = gwfVar3;
        this.a = xvf0Var;
        this.y = mx3Var;
        this.b = xvf0Var2;
        this.z = p4Var;
        this.A = gwfVar4;
        this.B = gwfVar5;
        this.C = gu3Var;
        this.D = qy3Var;
    }

    public st0(fy30 fy30Var, xvf0 xvf0Var, xvf0 xvf0Var2, l5g l5gVar, p5g p5gVar, l5g l5gVar2, l5g l5gVar3, p5g p5gVar2, l5g l5gVar4, l5g l5gVar5, n3w n3wVar) {
        this.c = fy30Var;
        this.a = xvf0Var;
        this.b = xvf0Var2;
        this.w = l5gVar;
        this.x = p5gVar;
        this.y = l5gVar2;
        this.z = l5gVar3;
        this.A = p5gVar2;
        this.B = l5gVar4;
        this.C = l5gVar5;
        this.D = n3wVar;
    }

    public st0(g680 g680Var, xvf0 xvf0Var, xvf0 xvf0Var2, k6g k6gVar, xvf0 xvf0Var3, k6g k6gVar2, k6g k6gVar3, k6g k6gVar4, k6g k6gVar5, xvf0 xvf0Var4, c6g c6gVar) {
        this.x = g680Var;
        this.a = xvf0Var;
        this.b = xvf0Var2;
        this.y = k6gVar;
        this.c = xvf0Var3;
        this.z = k6gVar2;
        this.A = k6gVar3;
        this.B = k6gVar4;
        this.C = k6gVar5;
        this.w = xvf0Var4;
        this.D = c6gVar;
    }

    public st0(h4g h4gVar, xvf0 xvf0Var, pgi pgiVar, oti otiVar, rs0 rs0Var, k4g k4gVar, xvf0 xvf0Var2, xvf0 xvf0Var3, fwc fwcVar, xvf0 xvf0Var4, e840 e840Var) {
        this.a = h4gVar;
        this.b = xvf0Var;
        this.c = pgiVar;
        this.B = otiVar;
        this.C = rs0Var;
        this.w = k4gVar;
        this.x = xvf0Var2;
        this.y = xvf0Var3;
        this.D = fwcVar;
        this.z = xvf0Var4;
        this.A = e840Var;
    }

    public st0(k6g k6gVar, k6g k6gVar2, k6g k6gVar3, xvf0 xvf0Var, k6g k6gVar4, k6g k6gVar5, k6g k6gVar6, k6g k6gVar7, k6g k6gVar8, k6g k6gVar9, xvf0 xvf0Var2) {
        this.c = k6gVar;
        this.w = k6gVar2;
        this.x = k6gVar3;
        this.a = xvf0Var;
        this.y = k6gVar4;
        this.z = k6gVar5;
        this.A = k6gVar6;
        this.B = k6gVar7;
        this.C = k6gVar8;
        this.D = k6gVar9;
        this.b = xvf0Var2;
    }

    public st0(j7g j7gVar, wun0 wun0Var, n3w n3wVar, mam0 mam0Var, j7g j7gVar2, j7g j7gVar3, g3b g3bVar, xvf0 xvf0Var, jzi0 jzi0Var, n7g n7gVar, xvf0 xvf0Var2) {
        this.a = j7gVar;
        this.b = wun0Var;
        this.B = n3wVar;
        this.c = mam0Var;
        this.w = j7gVar2;
        this.x = j7gVar3;
        this.C = g3bVar;
        this.y = xvf0Var;
        this.z = jzi0Var;
        this.A = n7gVar;
        this.D = xvf0Var2;
    }

    public st0(o9g o9gVar, xvf0 xvf0Var, o9g o9gVar2, o9g o9gVar3, o9g o9gVar4, o9g o9gVar5, pst0 pst0Var, eqh eqhVar, eqh eqhVar2, xvf0 xvf0Var2, xvf0 xvf0Var3) {
        this.w = o9gVar;
        this.a = xvf0Var;
        this.x = o9gVar2;
        this.y = o9gVar3;
        this.z = o9gVar4;
        this.A = o9gVar5;
        this.B = pst0Var;
        this.C = eqhVar;
        this.D = eqhVar2;
        this.b = xvf0Var2;
        this.c = xvf0Var3;
    }

    public st0(jpf0 jpf0Var, n3w n3wVar, c6g c6gVar, c6g c6gVar2, xvf0 xvf0Var, c6g c6gVar3, c6g c6gVar4, n3w n3wVar2, c6g c6gVar5, n3w n3wVar3, n3w n3wVar4) {
        this.b = jpf0Var;
        this.c = n3wVar;
        this.w = c6gVar;
        this.x = c6gVar2;
        this.a = xvf0Var;
        this.y = c6gVar3;
        this.z = c6gVar4;
        this.A = n3wVar2;
        this.B = c6gVar5;
        this.C = n3wVar3;
        this.D = n3wVar4;
    }

    public st0(xvf0 xvf0Var, p4 p4Var, js0 js0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, nt0 nt0Var, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8) {
        this.a = xvf0Var;
        this.B = p4Var;
        this.C = js0Var;
        this.b = xvf0Var2;
        this.c = xvf0Var3;
        this.D = nt0Var;
        this.w = xvf0Var4;
        this.x = xvf0Var5;
        this.y = xvf0Var6;
        this.z = xvf0Var7;
        this.A = xvf0Var8;
    }

    public st0(kpp0 kpp0Var, if9 if9Var, fat0 fat0Var, v0g v0gVar, kkt kktVar, x0g x0gVar, u0g u0gVar, n3w n3wVar, vrt0 vrt0Var, w0g w0gVar, xvf0 xvf0Var) {
        this.z = kpp0Var;
        this.A = if9Var;
        this.B = fat0Var;
        this.a = v0gVar;
        this.C = kktVar;
        this.b = x0gVar;
        this.c = u0gVar;
        this.w = n3wVar;
        this.x = vrt0Var;
        this.D = w0gVar;
        this.y = xvf0Var;
    }

    public st0(u3g u3gVar, ys10 ys10Var, xvf0 xvf0Var, zw30 zw30Var, v3g v3gVar, di20 di20Var, bhx bhxVar, xvf0 xvf0Var2, w3g w3gVar, nb11 nb11Var, v3g v3gVar2) {
        this.y = u3gVar;
        this.z = ys10Var;
        this.a = xvf0Var;
        this.A = zw30Var;
        this.b = v3gVar;
        this.B = di20Var;
        this.C = bhxVar;
        this.c = xvf0Var2;
        this.w = w3gVar;
        this.D = nb11Var;
        this.x = v3gVar2;
    }

    public st0(v7g v7gVar, v7g v7gVar2, v7g v7gVar3, v7g v7gVar4, pmn0 pmn0Var, xvf0 xvf0Var, v7g v7gVar5, v7g v7gVar6, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4) {
        this.a = v7gVar;
        this.b = v7gVar2;
        this.c = v7gVar3;
        this.w = v7gVar4;
        this.B = pmn0Var;
        this.x = xvf0Var;
        this.y = v7gVar5;
        this.z = v7gVar6;
        this.A = xvf0Var2;
        this.C = xvf0Var3;
        this.D = xvf0Var4;
    }

    public st0(xvf0 xvf0Var, xvf0 xvf0Var2, c7g c7gVar, c7g c7gVar2, c7g c7gVar3, b7g b7gVar, n3w n3wVar, b7g b7gVar2, n7i0 n7i0Var, cta0 cta0Var, c7g c7gVar4) {
        this.a = xvf0Var;
        this.b = xvf0Var2;
        this.B = c7gVar;
        this.c = c7gVar2;
        this.w = c7gVar3;
        this.x = b7gVar;
        this.y = n3wVar;
        this.z = b7gVar2;
        this.C = n7i0Var;
        this.A = cta0Var;
        this.D = c7gVar4;
    }

    public st0(b3g b3gVar, ret retVar, epf epfVar, epf epfVar2, f3g f3gVar, xvf0 xvf0Var, i020 i020Var, xvf0 xvf0Var2, bhx bhxVar, dt00 dt00Var, qcz0 qcz0Var) {
        this.a = b3gVar;
        this.z = retVar;
        this.A = epfVar;
        this.B = epfVar2;
        this.b = f3gVar;
        this.c = xvf0Var;
        this.C = i020Var;
        this.w = xvf0Var2;
        this.x = bhxVar;
        this.y = dt00Var;
        this.D = qcz0Var;
    }

    public st0(x0z x0zVar, u3g u3gVar, u3g u3gVar2, ret retVar, v3g v3gVar, u3g u3gVar3, d701 d701Var, u3g u3gVar4, xvf0 xvf0Var, xkw xkwVar, zw30 zw30Var) {
        this.y = x0zVar;
        this.z = u3gVar;
        this.a = u3gVar2;
        this.A = retVar;
        this.b = v3gVar;
        this.B = u3gVar3;
        this.C = d701Var;
        this.c = u3gVar4;
        this.w = xvf0Var;
        this.x = xkwVar;
        this.D = zw30Var;
    }

    public st0(eqh eqhVar, vm80 vm80Var, o4g o4gVar, xvf0 xvf0Var, x4g x4gVar, xvf0 xvf0Var2, k4 k4Var, xvf0 xvf0Var3, y4g y4gVar, xvf0 xvf0Var4, y4g y4gVar2) {
        this.a = eqhVar;
        this.B = vm80Var;
        this.b = o4gVar;
        this.c = xvf0Var;
        this.w = x4gVar;
        this.x = xvf0Var2;
        this.y = k4Var;
        this.z = xvf0Var3;
        this.A = y4gVar;
        this.C = xvf0Var4;
        this.D = y4gVar2;
    }

    public st0(xvf0 xvf0Var, n3w n3wVar, taj0 taj0Var, xat xatVar, u0g u0gVar, rbx0 rbx0Var, k4 k4Var, s0g s0gVar, c4 c4Var, b1g b1gVar, rbx0 rbx0Var2) {
        this.a = xvf0Var;
        this.x = n3wVar;
        this.y = taj0Var;
        this.z = xatVar;
        this.b = u0gVar;
        this.A = rbx0Var;
        this.B = k4Var;
        this.c = s0gVar;
        this.C = c4Var;
        this.w = b1gVar;
        this.D = rbx0Var2;
    }

    public st0(j7g j7gVar, g1n0 g1n0Var, xvf0 xvf0Var, z1n0 z1n0Var, l7g l7gVar, qzm0 qzm0Var, n7g n7gVar, m580 m580Var, mbo0 mbo0Var, l7g l7gVar2, jpj0 jpj0Var) {
        this.a = j7gVar;
        this.y = g1n0Var;
        this.b = xvf0Var;
        this.c = z1n0Var;
        this.w = l7gVar;
        this.z = qzm0Var;
        this.A = n7gVar;
        this.B = m580Var;
        this.x = mbo0Var;
        this.C = l7gVar2;
        this.D = jpj0Var;
    }
}

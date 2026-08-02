package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class uu5 {
    public final Object a;
    public final Object b;
    public Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public Object i;
    public Object j;
    public Object k;

    public uu5(Context context, mqs mqsVar, v7f v7fVar, w7f w7fVar, u7f u7fVar) {
        context.getClass();
        mqsVar.getClass();
        this.a = mqsVar;
        this.b = l18.b.b(hag.I(jul.class), true);
        this.c = new rn5(context);
        wqr n = a4g.n();
        dq7 dq7Var = ca8.a;
        tf6 e = gld.e(e.c(n, j5h.a));
        this.d = e;
        this.e = new ArrayList();
        this.f = new HashMap();
        this.g = new LinkedHashSet();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.h = new e4t(applicationContext);
        this.i = v7fVar;
        this.j = w7fVar;
        this.k = u7fVar;
        if (w7fVar != null) {
            BottomSheetBehavior bottomSheetBehavior = ((x7f) w7fVar.a.a).k;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setDraggable(false);
            }
            ((View) w7fVar.d.a(w7f.f[0])).setVisibility(0);
        }
        x97.y(e, null, null, new jmd(this, null, 7), 3);
    }

    public String a(uy5 uy5Var, wy5 wy5Var) {
        Context context = (Context) this.a;
        if (wy5Var == null) {
            wy5Var = (wy5) this.b;
        }
        if (uy5Var == null) {
            String string = context.getString(wy5Var.c);
            string.getClass();
            return string;
        }
        int i = uy5Var.a;
        if (i >= 100000) {
            String string2 = context.getString(wy5Var.b);
            string2.getClass();
            return string2;
        }
        String string3 = context.getString(wy5Var.a, ouj.o(i >= 10000 ? ot0.C(i, (Locale) this.c) : String.valueOf(i), StringUtil.SPACE, uy5Var.c));
        string3.getClass();
        return string3;
    }

    public yab b() {
        return (yab) ((jyr) this.h).getValue();
    }

    public void c() {
        j1t j1tVar = (j1t) this.d;
        j1tVar.dismiss();
        ((qe3) this.e).a(sjb.Remove);
        j1tVar.k((mqs) this.a);
    }

    public void d() {
        ((qe3) this.e).a(sjb.Like);
        yab b = b();
        mqs mqsVar = (mqs) this.a;
        b.getClass();
        mqsVar.getClass();
        b.a().t(mqsVar);
        fx fxVar = fx.a;
        gj gjVar = (gj) this.b;
        if (gjVar != null) {
            ((gx) ((jyr) this.j).getValue()).a(fxVar, mqsVar.a, gjVar);
        }
        j1t j1tVar = (j1t) this.d;
        j1tVar.j(mqsVar);
        j1tVar.c();
    }

    public void e() {
        ((qe3) this.e).a(sjb.SubscribeToPodcast);
        yab b = b();
        mqs mqsVar = (mqs) this.a;
        oq oqVar = mqsVar.t;
        if (oqVar == null) {
            Parcelable.Creator<oq> creator = oq.CREATOR;
            oqVar = cxb.O(mqsVar);
        }
        b.getClass();
        b.a().q(oqVar);
        ((j1t) this.d).c();
    }

    public void f() {
        ((qe3) this.e).a(sjb.UnsubscribeFromPodcast);
        yab b = b();
        mqs mqsVar = (mqs) this.a;
        oq oqVar = mqsVar.t;
        if (oqVar == null) {
            Parcelable.Creator<oq> creator = oq.CREATOR;
            oqVar = cxb.O(mqsVar);
        }
        b.getClass();
        t3g a = b.a();
        a.getClass();
        x97.y(a.a, null, null, new s3g(a, oqVar, null, 1), 3);
        ((j1t) this.d).c();
    }

    public uu5(Context context, wy5 wy5Var, Locale locale, ju5 ju5Var) {
        context.getClass();
        wy5Var.getClass();
        locale.getClass();
        ju5Var.getClass();
        this.a = context;
        this.b = wy5Var;
        this.c = locale;
        this.d = ju5Var;
        this.e = new sld("HH:mm", locale);
        this.f = new sld("E", locale);
        DateTimeFormatter.ofPattern("EEEE", locale);
        this.g = new sld("MMM", locale);
        this.h = new sld("MMMM", locale);
        this.i = new sld("dd MMMM", locale);
        this.j = new sld("EEEE dd MMMM", locale);
        this.k = new sld("dd MMMM, EEEE", locale);
    }

    public uu5(mqs mqsVar, gj gjVar, fvs fvsVar, j1t j1tVar, qe3 qe3Var, n3m n3mVar, final i1t i1tVar) {
        mqsVar.getClass();
        qe3Var.getClass();
        this.a = mqsVar;
        this.b = gjVar;
        this.c = fvsVar;
        this.d = j1tVar;
        this.e = qe3Var;
        this.f = n3mVar;
        this.g = btf.b(new xes(8, i1tVar, this));
        final int i = 0;
        this.h = btf.b(new Function0() { // from class: l1t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return i1tVar.p();
                    case 1:
                        return i1tVar.c();
                    case 2:
                        return i1tVar.j();
                    default:
                        return i1tVar.h();
                }
            }
        });
        final int i2 = 1;
        this.i = btf.b(new Function0() { // from class: l1t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return i1tVar.p();
                    case 1:
                        return i1tVar.c();
                    case 2:
                        return i1tVar.j();
                    default:
                        return i1tVar.h();
                }
            }
        });
        final int i3 = 2;
        this.j = btf.b(new Function0() { // from class: l1t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return i1tVar.p();
                    case 1:
                        return i1tVar.c();
                    case 2:
                        return i1tVar.j();
                    default:
                        return i1tVar.h();
                }
            }
        });
        final int i4 = 3;
        this.k = btf.b(new Function0() { // from class: l1t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return i1tVar.p();
                    case 1:
                        return i1tVar.c();
                    case 2:
                        return i1tVar.j();
                    default:
                        return i1tVar.h();
                }
            }
        });
    }
}

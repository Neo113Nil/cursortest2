package defpackage;

import android.view.View;
import androidx.glance.session.SessionWorker;
import com.yandex.passport.internal.properties.k0;
import com.yandex.passport.internal.report.n5;
import com.yandex.passport.internal.report.reporters.q;
import com.yandex.passport.internal.ui.bouncer.model.f2;
import com.yandex.passport.internal.ui.bouncer.model.y1;
import com.yandex.passport.internal.ui.bouncer.model.z1;
import com.yandex.passport.internal.ui.bouncer.roundabout.a0;
import com.yandex.passport.internal.ui.bouncer.roundabout.items.g0;
import com.yandex.passport.internal.ui.bouncer.roundabout.items.i0;
import com.yandex.passport.internal.ui.bouncer.roundabout.items.x;
import com.yandex.passport.internal.ui.bouncer.roundabout.items.y;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.n1;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.v0;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.z0;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.core.network.request.b;
import com.yandex.plus.core.network.response.a;
import java.util.EnumSet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ck0 extends aur implements Function1 {
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ck0(Object obj, Object obj2, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        this.k = obj;
        this.l = obj2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new ck0((fk0) this.k, this.l, continuation, 0);
            case 1:
                return new ck0((String) this.k, (String) this.l, continuation, 1);
            case 2:
                return new ck0((gjs) this.k, (SessionWorker) this.l, continuation, 2);
            case 3:
                return new ck0((a7q) this.k, (u2q) this.l, continuation, 3);
            case 4:
                return new ck0((k0) this.k, (a0) this.l, continuation, 4);
            case 5:
                return new ck0((x) this.k, (g0) this.l, continuation, 5);
            case 6:
                return new ck0((y) this.k, (i0) this.l, continuation, 6);
            case 7:
                return new ck0((n1) this.k, (com.yandex.passport.internal.ui.challenge.logout.bottomsheet.g0) this.l, continuation, 7);
            default:
                return new ck0((b) this.k, (ukn) this.l, continuation, 8);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((ck0) create(continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        View view;
        z0 z0Var;
        d0o d0oVar;
        int i = this.j;
        Object obj2 = this.l;
        Object obj3 = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                fk0 fk0Var = (fk0) obj3;
                fk0.a(fk0Var);
                Object d = fk0Var.d(obj2);
                fk0Var.c.b.setValue(d);
                fk0Var.e.setValue(d);
                return Unit.a;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                cvl h = new btl().h((String) obj3, (String) obj2);
                return h == null ? new cvl("-1", "unknown", drt.f, 0, 0, false, 0, 0, 0, 0L, 0L, null, 0L, null, null, null, null, null, 0, null, null, null, false, null, false, null, null, 134217720) : h;
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                ((gjs) obj3).b(((SessionWorker) obj2).i.c);
                return Unit.a;
            case 3:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                a7q a7qVar = (a7q) obj3;
                EnumSet enumSet = (EnumSet) a7qVar.m.get();
                kv6 kv6Var = a7qVar.a;
                u2q u2qVar = (u2q) obj2;
                Long l = new Long(kv6Var.J0());
                gy1 gy1Var = u2qVar.c;
                pxs pxsVar = u2qVar.f;
                kv6Var.l1(new iom(u2qVar, l, false, false, gy1Var, pxsVar != null ? o2g.k0(pxsVar) : null, enumSet.contains(g5q.b)));
                x0q x0qVar = ((qzs) ((mzs) ((q5q) a7qVar.k.getValue()).a.d.getValue())).h;
                Unit unit = Unit.a;
                x0qVar.a(unit);
                return unit;
            case 4:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                if (!((k0) obj3).c) {
                    ((a0) obj2).q.a(y1.b);
                }
                return Unit.a;
            case 5:
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                x xVar = (x) obj3;
                q qVar = xVar.m;
                qVar.getClass();
                qVar.p(n5.d);
                xVar.l.a(new z1(((g0) obj2).a));
                return Unit.a;
            case 6:
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                i0 i0Var = (i0) obj2;
                ((y) obj3).m.a(new f2(i0Var.a, i0Var.b));
                return Unit.a;
            case 7:
                com.yandex.passport.internal.ui.challenge.logout.bottomsheet.g0 g0Var = (com.yandex.passport.internal.ui.challenge.logout.bottomsheet.g0) obj2;
                nm6 nm6Var8 = nm6.a;
                qgg.h0(obj);
                c7g c7gVar = ((n1) obj3).o;
                c7gVar.getClass();
                int i2 = 0;
                while (true) {
                    if (i2 < c7gVar.getChildCount()) {
                        int i3 = i2 + 1;
                        view = c7gVar.getChildAt(i2);
                        if (view == null) {
                            rj7.m();
                            return null;
                        }
                        if (!n1.O(view)) {
                            i2 = i3;
                        }
                    } else {
                        view = null;
                    }
                }
                Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
                int id = gdg.z(c7gVar, 0).getId();
                if (valueOf != null && valueOf.intValue() == id) {
                    z0Var = z0.a;
                } else {
                    z0Var = (valueOf != null && valueOf.intValue() == gdg.z(c7gVar, 1).getId()) ? z0.b : null;
                }
                int i4 = z0Var == null ? -1 : v0.a[z0Var.ordinal()];
                if (i4 != -1) {
                    if (i4 == 1) {
                        g0Var.g.invoke();
                    } else {
                        if (i4 != 2) {
                            b6e.s();
                            return null;
                        }
                        g0Var.h.invoke();
                    }
                }
                return Unit.a;
            default:
                nm6 nm6Var9 = nm6.a;
                qgg.h0(obj);
                l3o f = ((ukn) obj2).f(r1.J((b) obj3));
                l3o l3oVar = f.h;
                if (l3oVar == null || (d0oVar = l3oVar.a) == null) {
                    d0oVar = f.a;
                }
                b I = r1.I(d0oVar);
                String str = f.b.a;
                a aVar = a.b;
                if (!str.equals(aVar.a)) {
                    aVar = a.c;
                    if (!str.equals(aVar.a)) {
                        aVar = a.d;
                        if (!str.equals(aVar.a)) {
                            aVar = a.e;
                            if (!str.equals(aVar.a)) {
                                aVar = new a(str);
                            }
                        }
                    }
                }
                return new com.yandex.plus.core.network.response.b(I, aVar, f.d, f.c, u.D(f.f), f.g);
        }
    }
}

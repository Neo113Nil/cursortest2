package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import com.yandex.passport.data.network.l;
import com.yandex.passport.internal.core.accounts.h;
import com.yandex.passport.internal.ui.bouncer.model.middleware.o;
import com.yandex.passport.internal.ui.bouncer.roundabout.n;
import com.yandex.plus.bdui.flex.ui.s;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.core.analytics.logging.e;
import com.yandex.plus.home.dailyquests.feature.internal.domain.b;
import com.yandex.plus.home.dailyquests.feature.internal.model.i;
import com.yandex.plus.home.dailyquests.feature.internal.model.j;
import com.yandex.plus.home.dailyquests.feature.internal.ui.c;
import com.yandex.plus.home.dailyquests.plugin.internal.proxy.a;
import com.yandex.plus.home.dailyquests.plugin.internal.proxy.d;
import com.yandex.plus.home.dailyquests.repository.api.dailyquests.g;
import com.yandex.plus.home.dailyquests.repository.api.dailyquests.k;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.pay.adapter.api.g0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class rjf {
    public boolean a;
    public Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public Object o;
    public Object p;

    public rjf(b bVar, b bVar2, b bVar3, d dVar, a aVar, h hVar, s sVar, l lVar, f fVar, kotlinx.coroutines.a aVar2, boolean z) {
        aVar2.getClass();
        this.c = bVar;
        this.d = bVar2;
        this.e = bVar3;
        this.f = dVar;
        this.g = aVar;
        this.h = hVar;
        this.i = sVar;
        this.j = lVar;
        this.k = fVar;
        this.l = aVar2;
        this.a = z;
        this.m = com.yandex.plus.bdui.flex.ui.a.a();
        View view = (FrameLayout) sVar.b;
        tf6 f = r1.f(view, aVar2);
        this.n = f;
        Continuation continuation = null;
        if (!z) {
            sVar.j(com.yandex.plus.home.dailyquests.feature.internal.model.b.a, null);
            return;
        }
        sVar.j(i.a, null);
        this.b = x97.y(f, null, null, new c(this, continuation, 0), 3);
        com.yandex.plus.bdui.plus.checkout.h hVar2 = new com.yandex.plus.bdui.plus.checkout.h(26, this);
        view.getClass();
        n nVar = (n) fVar.b;
        if (nVar != null) {
            view.removeOnAttachStateChangeListener(nVar);
            WeakHashMap weakHashMap = wdu.a;
            if (view.isAttachedToWindow()) {
                nVar.onViewDetachedFromWindow(view);
            }
        }
        n nVar2 = new n(4, fVar, hVar2);
        fVar.b = nVar2;
        view.addOnAttachStateChangeListener(nVar2);
        WeakHashMap weakHashMap2 = wdu.a;
        if (view.isAttachedToWindow()) {
            nVar2.onViewAttachedToWindow(view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b6, code lost:
    
        if (r11 == r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b8, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0093, code lost:
    
        if (r11 != r2) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        if (r11.R(r3, 0.8f, r1) == r2) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(rjf rjfVar, com.yandex.plus.home.dailyquests.repository.api.dailyquests.l lVar, cg6 cg6Var) {
        com.yandex.plus.home.dailyquests.feature.internal.ui.d dVar;
        int i;
        s sVar = (s) rjfVar.i;
        if (cg6Var instanceof com.yandex.plus.home.dailyquests.feature.internal.ui.d) {
            dVar = (com.yandex.plus.home.dailyquests.feature.internal.ui.d) cg6Var;
            int i2 = dVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.m = i2 - Integer.MIN_VALUE;
                Object obj = dVar.k;
                nm6 nm6Var = nm6.a;
                i = dVar.m;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    if ((lVar instanceof k) && !((k) lVar).c) {
                        jyr jyrVar = e.a;
                        e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.a, "DailyQuestsViewManagerImpl.activateQuestIfNotActive(" + lVar + ')', null);
                        l lVar2 = (l) rjfVar.j;
                        FrameLayout frameLayout = (FrameLayout) sVar.b;
                        dVar.j = lVar;
                        dVar.m = 1;
                    }
                    return Unit.a;
                }
                if (i == 1) {
                    lVar = dVar.j;
                    qgg.h0(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        lVar = dVar.j;
                        qgg.h0(obj);
                        sVar.j((j) obj, new com.yandex.plus.home.dailyquests.feature.internal.ui.b(rjfVar, lVar, 1));
                        return Unit.a;
                    }
                    lVar = dVar.j;
                    qgg.h0(obj);
                    h hVar = (h) rjfVar.h;
                    dVar.j = lVar;
                    dVar.m = 3;
                    ((com.yandex.plus.core.dispatcher.a) ((com.yandex.plus.core.dispatcher.b) hVar.e)).getClass();
                    obj = x97.V(com.yandex.plus.core.dispatcher.a.f, new com.yandex.plus.bdui.ui.b((com.yandex.plus.home.dailyquests.repository.api.dailyquests.l) obj, hVar, continuation, 10), dVar);
                }
                b bVar = (b) rjfVar.c;
                dVar.j = lVar;
                dVar.m = 2;
                obj = bVar.a(dVar);
            }
        }
        dVar = new com.yandex.plus.home.dailyquests.feature.internal.ui.d(rjfVar, cg6Var);
        Object obj2 = dVar.k;
        nm6 nm6Var2 = nm6.a;
        i = dVar.m;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        b bVar2 = (b) rjfVar.c;
        dVar.j = lVar;
        dVar.m = 2;
        obj2 = bVar2.a(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(rjf rjfVar, com.yandex.plus.home.dailyquests.repository.api.dailyquests.l lVar, cg6 cg6Var) {
        com.yandex.plus.home.dailyquests.feature.internal.ui.e eVar;
        int i;
        com.yandex.plus.home.dailyquests.repository.api.dailyquests.l lVar2;
        rjf rjfVar2;
        if (cg6Var instanceof com.yandex.plus.home.dailyquests.feature.internal.ui.e) {
            eVar = (com.yandex.plus.home.dailyquests.feature.internal.ui.e) cg6Var;
            int i2 = eVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.m = i2 - Integer.MIN_VALUE;
                Object obj = eVar.k;
                nm6 nm6Var = nm6.a;
                i = eVar.m;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    h hVar = (h) rjfVar.h;
                    eVar.j = lVar;
                    eVar.m = 1;
                    ((com.yandex.plus.core.dispatcher.a) ((com.yandex.plus.core.dispatcher.b) hVar.e)).getClass();
                    obj = x97.V(com.yandex.plus.core.dispatcher.a.f, new com.yandex.plus.bdui.ui.b(lVar, hVar, continuation, 10), eVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    lVar = eVar.j;
                    qgg.h0(obj);
                }
                lVar2 = lVar;
                ((s) rjfVar.i).j((j) obj, lVar2 == null ? new com.yandex.plus.home.dailyquests.feature.internal.ui.b(rjfVar, lVar2, 0) : null);
                if (lVar2 == null) {
                    rjfVar2 = rjfVar;
                    x97.y((tf6) rjfVar.n, null, null, new com.yandex.plus.home.api.prefetch.j(rjfVar2, lVar2, (com.yandex.plus.home.dailyquests.repository.api.dailyquests.l) rjfVar.p, continuation, 6), 3);
                } else {
                    rjfVar2 = rjfVar;
                }
                rjfVar2.p = lVar2;
                return Unit.a;
            }
        }
        eVar = new com.yandex.plus.home.dailyquests.feature.internal.ui.e(rjfVar, cg6Var);
        Object obj2 = eVar.k;
        nm6 nm6Var2 = nm6.a;
        i = eVar.m;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        lVar2 = lVar;
        ((s) rjfVar.i).j((j) obj2, lVar2 == null ? new com.yandex.plus.home.dailyquests.feature.internal.ui.b(rjfVar, lVar2, 0) : null);
        if (lVar2 == null) {
        }
        rjfVar2.p = lVar2;
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(rjf rjfVar, com.yandex.plus.home.dailyquests.repository.api.dailyquests.l lVar, com.yandex.plus.home.dailyquests.repository.api.dailyquests.l lVar2, cg6 cg6Var) {
        com.yandex.plus.home.dailyquests.feature.internal.ui.f fVar;
        int i;
        String a;
        com.yandex.plus.home.dailyquests.feature.api.a aVar;
        int ordinal;
        nkb nkbVar;
        if (cg6Var instanceof com.yandex.plus.home.dailyquests.feature.internal.ui.f) {
            fVar = (com.yandex.plus.home.dailyquests.feature.internal.ui.f) cg6Var;
            int i2 = fVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.m = i2 - Integer.MIN_VALUE;
                Object obj = fVar.k;
                nm6 nm6Var = nm6.a;
                i = fVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    if (lVar == null || !Intrinsics.d(lVar.getId(), lVar2.getId())) {
                        l lVar3 = (l) rjfVar.j;
                        FrameLayout frameLayout = (FrameLayout) ((s) rjfVar.i).b;
                        fVar.j = lVar2;
                        fVar.m = 1;
                        if (lVar3.R(frameLayout, 0.8f, fVar) == nm6Var) {
                            return nm6Var;
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lVar2 = fVar.j;
                qgg.h0(obj);
                a aVar2 = (a) rjfVar.g;
                String id = lVar2.getId();
                a = lVar2.a();
                if (!(lVar2 instanceof k)) {
                    aVar = com.yandex.plus.home.dailyquests.feature.api.a.a;
                } else {
                    if (!(lVar2 instanceof g)) {
                        b6e.s();
                        return null;
                    }
                    aVar = com.yandex.plus.home.dailyquests.feature.api.a.b;
                }
                id.getClass();
                omb ombVar = aVar2.a;
                if (a == null) {
                    a = "no_value";
                }
                ordinal = aVar.ordinal();
                if (ordinal != 0) {
                    nkbVar = nkb.InProgress;
                } else {
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    nkbVar = nkb.Done;
                }
                ombVar.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("popup_id", a);
                linkedHashMap.put("shortcut_id", id);
                linkedHashMap.put("mission_status", nkbVar.a);
                linkedHashMap.put("_meta", omb.a(1, new HashMap()));
                ombVar.d("DailyMission.Shown", linkedHashMap);
                return Unit.a;
            }
        }
        fVar = new com.yandex.plus.home.dailyquests.feature.internal.ui.f(rjfVar, cg6Var);
        Object obj2 = fVar.k;
        nm6 nm6Var2 = nm6.a;
        i = fVar.m;
        if (i != 0) {
        }
        a aVar22 = (a) rjfVar.g;
        String id2 = lVar2.getId();
        a = lVar2.a();
        if (!(lVar2 instanceof k)) {
        }
        id2.getClass();
        omb ombVar2 = aVar22.a;
        if (a == null) {
        }
        ordinal = aVar.ordinal();
        if (ordinal != 0) {
        }
        ombVar2.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("popup_id", a);
        linkedHashMap2.put("shortcut_id", id2);
        linkedHashMap2.put("mission_status", nkbVar.a);
        linkedHashMap2.put("_meta", omb.a(1, new HashMap()));
        ombVar2.d("DailyMission.Shown", linkedHashMap2);
        return Unit.a;
    }

    public void d() {
        rjf rjfVar;
        um6 um6Var = (um6) this.i;
        xdr xdrVar = (xdr) this.l;
        ime imeVar = (ime) this.c;
        ybf ybfVar = (ybf) imeVar.b;
        c76 c76Var = (c76) this.e;
        if (c76Var != null && ((l5v) this.f) == null && ((Boolean) ((zqj) ybfVar.getValue()).m.getValue()).booleanValue() && !((Boolean) xdrVar.getValue()).booleanValue()) {
            l5v l5vVar = (l5v) c76Var.invoke();
            y8p y8pVar = (y8p) this.n;
            Continuation continuation = null;
            if (((l5v) this.f) != null) {
                Assertions.throwOrSkip$default(new FailedAssertionException("Reattaching view without calling detachView()"), null, 2, null);
                e();
            }
            this.f = l5vVar;
            ((rjq) this.h).g();
            ArrayList arrayList = new ArrayList();
            vqn vqnVar = new vqn();
            l5v l5vVar2 = (l5v) this.f;
            if (l5vVar2 != null) {
                rjfVar = this;
                l5vVar2.setFpsInfoCallback(new ps7(vqnVar, arrayList, (Object) rjfVar, false, 1));
            } else {
                rjfVar = this;
            }
            int i = 0;
            ox6.B(zsd.b0(new zxs(((oq7) y8pVar.b).a.c, y8pVar, i)), um6Var, new qjf(this, i));
            int i2 = 3;
            ox6.B(new u21(10, zsd.b0(new zxs(((oq7) y8pVar.b).a.c, y8pVar, 1)), ((snu) ((jyr) rjfVar.j).getValue()).b, new t81(i2, 8, continuation)), um6Var, new t58(28, this, l5vVar));
            ox6.B(zsd.M0(new njf(((oq7) ((jyr) imeVar.c).getValue()).a.c, imeVar, 0), new tn2(i2, 4, continuation)), um6Var, new otd(16, l5vVar));
            ox6.B(zsd.b0(new ifd(((cjl) rjfVar.d).c, 10)), um6Var, new qjf(this, 1));
            rar rarVar = (rar) rjfVar.b;
            if (rarVar != null) {
                rarVar.g(null);
            }
            rjfVar.b = ox6.B(zsd.M0(zsd.b0(new u21(10, (xdr) rjfVar.m, xdrVar, new ib3(i2, 7, continuation))), new cle(continuation, this, 2)), um6Var, new qjf(this, 4));
            ox6.B(zsd.b0(new u21(10, xdrVar, ((zqj) ybfVar.getValue()).m, new ib3(i2, 6, continuation))), um6Var, new qjf(this, 2));
        }
    }

    public void e() {
        ((rjq) this.h).V();
        ((rjq) this.g).V();
        l5v l5vVar = (l5v) this.f;
        if (l5vVar != null) {
            l5vVar.setFpsInfoCallback(null);
        }
        l5v l5vVar2 = (l5v) this.f;
        if (l5vVar2 != null) {
            l5vVar2.destroy();
        }
        this.f = null;
        this.e = null;
        this.p = null;
    }

    public void f(com.yandex.plus.home.dailyquests.repository.api.dailyquests.l lVar) {
        com.yandex.plus.home.dailyquests.feature.api.a aVar;
        nkb nkbVar;
        x0q x0qVar = (x0q) this.m;
        com.yandex.plus.home.dailyquests.repository.api.dailyquests.c q = lVar.q();
        if (!(q instanceof com.yandex.plus.home.dailyquests.repository.api.dailyquests.a)) {
            if (q instanceof com.yandex.plus.home.dailyquests.repository.api.dailyquests.b) {
                x0qVar.a(com.yandex.plus.home.dailyquests.feature.api.model.b.a);
                return;
            } else {
                b6e.s();
                return;
            }
        }
        a aVar2 = (a) this.g;
        String id = lVar.getId();
        String a = lVar.a();
        if (lVar instanceof k) {
            aVar = com.yandex.plus.home.dailyquests.feature.api.a.a;
        } else {
            if (!(lVar instanceof g)) {
                b6e.s();
                return;
            }
            aVar = com.yandex.plus.home.dailyquests.feature.api.a.b;
        }
        id.getClass();
        omb ombVar = aVar2.a;
        if (a == null) {
            a = "no_value";
        }
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            nkbVar = nkb.InProgress;
        } else {
            if (ordinal != 1) {
                b6e.s();
                return;
            }
            nkbVar = nkb.Done;
        }
        ombVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("popup_id", a);
        linkedHashMap.put("shortcut_id", id);
        linkedHashMap.put("mission_status", nkbVar.a);
        linkedHashMap.put("_meta", omb.a(1, new HashMap()));
        ombVar.d("DailyMission.Clicked", linkedHashMap);
        com.yandex.plus.home.dailyquests.repository.api.dailyquests.a aVar3 = (com.yandex.plus.home.dailyquests.repository.api.dailyquests.a) q;
        x0qVar.a(new com.yandex.plus.home.dailyquests.feature.api.model.a(lVar.a(), aVar3.a));
        x97.y((tf6) this.n, null, null, new com.yandex.plus.bdui.ui.b(this, aVar3, null, 11), 3);
    }

    public void g() {
        xdr xdrVar = (xdr) this.l;
        Boolean bool = Boolean.TRUE;
        xdrVar.getClass();
        xdrVar.m(null, bool);
        l5v l5vVar = (l5v) this.f;
        if (l5vVar != null) {
            l5vVar.a();
        }
        f1e f1eVar = (f1e) this.p;
        if (f1eVar != null) {
            f1eVar.a();
        }
    }

    public void h() {
        xdr xdrVar = (xdr) this.l;
        Boolean bool = Boolean.FALSE;
        xdrVar.getClass();
        xdrVar.m(null, bool);
        d();
    }

    public rjf(com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar, com.yandex.plus.home.plaque.feature.internal.presentation.b bVar, g0 g0Var, o oVar, com.yandex.plus.home.analytics.payment.d dVar, com.yandex.plus.home.analytics.payment.e eVar, com.yandex.plus.home.analytics.payment.b bVar2, com.yandex.plus.home.analytics.payment.c cVar, com.yandex.plus.home.analytics.payment.a aVar2, boolean z, com.yandex.plus.home.auth.f fVar, f fVar2, kotlinx.coroutines.a aVar3, y yVar, com.yandex.plus.acquisition.adapter.internal.processor.b bVar3, f fVar3) {
        aVar.getClass();
        g0Var.getClass();
        dVar.getClass();
        eVar.getClass();
        bVar2.getClass();
        cVar.getClass();
        aVar2.getClass();
        fVar.getClass();
        aVar3.getClass();
        yVar.getClass();
        bVar3.getClass();
        this.c = aVar;
        this.d = bVar;
        this.e = g0Var;
        this.f = oVar;
        this.g = dVar;
        this.h = eVar;
        this.i = bVar2;
        this.j = cVar;
        this.k = aVar2;
        this.a = z;
        this.b = fVar;
        this.l = fVar2;
        this.m = aVar3;
        this.n = yVar;
        this.o = bVar3;
        this.p = fVar3;
    }

    public rjf(ime imeVar) {
        this.c = imeVar;
        l18 l18Var = l18.b;
        bdt I = hag.I(cjl.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        this.d = (cjl) qdcVar.C(I);
        this.g = new rjq(false);
        rjq rjqVar = new rjq(false);
        this.h = rjqVar;
        this.i = hld.s(rjqVar, dm6.b());
        this.j = l18Var.b(hag.I(snu.class), true);
        jyr b = l18Var.b(hag.I(oq7.class), true);
        this.k = l18Var.b(hag.I(xy1.class), true);
        Boolean bool = Boolean.FALSE;
        this.l = ydr.a(bool);
        this.m = ydr.a(bool);
        this.n = new y8p((oq7) b.getValue());
    }
}

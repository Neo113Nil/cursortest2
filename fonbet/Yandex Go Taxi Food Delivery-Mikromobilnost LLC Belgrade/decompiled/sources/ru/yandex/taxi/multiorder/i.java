package ru.yandex.taxi.multiorder;

import com.yandex.mobile.drive.sdk.full.SessionState;
import defpackage.avj0;
import defpackage.bdc;
import defpackage.cfm;
import defpackage.cjm0;
import defpackage.czc0;
import defpackage.fnt;
import defpackage.g18;
import defpackage.g8e;
import defpackage.gci0;
import defpackage.gf4;
import defpackage.gnt;
import defpackage.h2k0;
import defpackage.h980;
import defpackage.hxj0;
import defpackage.if4;
import defpackage.jf4;
import defpackage.kyh0;
import defpackage.l30;
import defpackage.mhf;
import defpackage.nid;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.pwf0;
import defpackage.pzt0;
import defpackage.ren;
import defpackage.sly;
import defpackage.sw40;
import defpackage.t3u0;
import defpackage.tje;
import defpackage.tly;
import defpackage.tse;
import defpackage.u3u0;
import defpackage.u8w;
import defpackage.uw40;
import defpackage.v3u0;
import defpackage.v40;
import defpackage.vcm;
import defpackage.vhz;
import defpackage.w511;
import defpackage.wl40;
import defpackage.xng0;
import defpackage.y3u0;
import defpackage.zuj0;
import defpackage.zxf0;
import defpackage.zy11;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.eats_commons.EatsService;
import ru.yandex.taxi.multiorder.i;
import ru.yandex.taxi.statebar.StateBarViewModel$Type;

/* loaded from: classes6.dex */
public final class i extends ru.yandex.taxi.statebar.controller.c implements jf4 {
    public String A;
    public boolean B;
    public final gci0 C;
    public final hxj0 D;
    public final h2k0 E;
    public final tse j;
    public final uw40 k;
    public final nid l;
    public final u8w m;
    public final h980 n;
    public final cjm0 o;
    public final zuj0 p;
    public final com.yandex.go.superapp.order.multi.old.provider.g q;
    public final mhf r;
    public final vcm s;
    public g18 t;
    public pzt0 u;
    public final CopyOnWriteArrayList v;
    public final h w;
    public com.yandex.go.taxi.order.titles.f x;
    public boolean y;
    public String z;

    public i(tse tseVar, uw40 uw40Var, nid nidVar, u8w u8wVar, h980 h980Var, cjm0 cjm0Var, zuj0 zuj0Var, com.yandex.go.superapp.order.multi.old.provider.g gVar, mhf mhfVar, vcm vcmVar, y3u0 y3u0Var, com.yandex.go.navigation.screen.c cVar, v3u0 v3u0Var) {
        super(cVar, y3u0Var, v3u0Var);
        this.j = tseVar;
        this.k = uw40Var;
        this.l = nidVar;
        this.m = u8wVar;
        this.n = h980Var;
        this.o = cjm0Var;
        this.p = zuj0Var;
        this.q = gVar;
        this.r = mhfVar;
        this.s = vcmVar;
        this.t = g18.u1;
        this.v = new CopyOnWriteArrayList();
        this.w = new h();
        this.C = nidVar.b;
        this.D = new hxj0(2, this);
        this.E = new h2k0(0, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0190, code lost:
    
        if (defpackage.jl40.l(r13 instanceof defpackage.o2y0 ? (defpackage.o2y0) r13 : null, r6) != false) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(i iVar, wl40 wl40Var, Continuation continuation) {
        ReturnWithStateBar$onActiveOrderListChanged$1 returnWithStateBar$onActiveOrderListChanged$1;
        int i;
        wl40 wl40Var2;
        int i2;
        i iVar2;
        tly tlyVar;
        SessionState sessionState;
        String str;
        boolean z;
        h hVar = iVar.w;
        if (continuation instanceof ReturnWithStateBar$onActiveOrderListChanged$1) {
            returnWithStateBar$onActiveOrderListChanged$1 = (ReturnWithStateBar$onActiveOrderListChanged$1) continuation;
            int i3 = returnWithStateBar$onActiveOrderListChanged$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                returnWithStateBar$onActiveOrderListChanged$1.label = i3 - Integer.MIN_VALUE;
                Object obj = returnWithStateBar$onActiveOrderListChanged$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = returnWithStateBar$onActiveOrderListChanged$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int j = wl40Var.j();
                    com.yandex.go.superapp.order.multi.old.provider.g gVar = iVar.q;
                    returnWithStateBar$onActiveOrderListChanged$1.L$0 = wl40Var;
                    returnWithStateBar$onActiveOrderListChanged$1.L$1 = iVar;
                    returnWithStateBar$onActiveOrderListChanged$1.I$0 = j;
                    returnWithStateBar$onActiveOrderListChanged$1.label = 1;
                    Object c = gVar.c(returnWithStateBar$onActiveOrderListChanged$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    wl40Var2 = wl40Var;
                    i2 = j;
                    obj = c;
                    iVar2 = iVar;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = returnWithStateBar$onActiveOrderListChanged$1.I$0;
                    iVar2 = (i) returnWithStateBar$onActiveOrderListChanged$1.L$1;
                    wl40Var2 = (wl40) returnWithStateBar$onActiveOrderListChanged$1.L$0;
                    kotlin.b.b(obj);
                }
                iVar2.B = ((Boolean) obj).booleanValue();
                if (i2 <= 1) {
                    iVar.j();
                    cjm0 cjm0Var = iVar.o;
                    iVar.A = ((avj0) ((zuj0) cjm0Var.b)).h(kyh0.state_bar_active_orders);
                    List list = wl40Var2.a;
                    List list2 = wl40Var2.c;
                    List list3 = wl40Var2.b;
                    List list4 = wl40Var2.d;
                    List list5 = wl40Var2.e;
                    List list6 = wl40Var2.f;
                    zuj0 zuj0Var = (zuj0) cjm0Var.b;
                    StringBuilder sb = new StringBuilder();
                    if (list.isEmpty()) {
                        z = false;
                    } else {
                        sb.append(((avj0) zuj0Var).h(kyh0.state_bar_active_taxis));
                        z = true;
                    }
                    cjm0Var.a(list2, sb, EatsService.EATS);
                    cjm0Var.a(list2, sb, EatsService.GROCERY);
                    cjm0Var.a(list2, sb, EatsService.SHOP);
                    if (!list5.isEmpty()) {
                        if (sb.length() > 0) {
                            sb.append(Extension.FIX_SPACE);
                        }
                        sb.append(((avj0) zuj0Var).h(kyh0.multiorder_state_bar_delivery));
                    }
                    if (!list4.isEmpty()) {
                        if (sb.length() > 0) {
                            sb.append(Extension.FIX_SPACE);
                        }
                        sb.append(((avj0) zuj0Var).h(kyh0.multiorder_state_bar_active_drive_order));
                    }
                    if (!list6.isEmpty()) {
                        if (sb.length() > 0) {
                            sb.append(Extension.FIX_SPACE);
                        }
                        sb.append(((avj0) zuj0Var).h(kyh0.scooters));
                    }
                    if (!z) {
                        List list7 = list3;
                        if (!(list7 instanceof Collection) || !list7.isEmpty()) {
                            Iterator it = list7.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                if (((sly) it.next()).a() != null) {
                                    if (sb.length() > 0) {
                                        sb.append(Extension.FIX_SPACE);
                                    }
                                    sb.append(((avj0) zuj0Var).h(kyh0.state_bar_active_taxis));
                                }
                            }
                        }
                    }
                    iVar.z = sb.toString();
                    hVar.b = null;
                    hVar.c = null;
                    hVar.a = true;
                } else if (i2 == 1) {
                    avj0 avj0Var = (avj0) iVar.p;
                    iVar.A = avj0Var.h(kyh0.state_bar_active_order);
                    boolean z2 = hVar.a;
                    hVar.a = false;
                    List list8 = wl40Var2.a;
                    List list9 = wl40Var2.d;
                    List list10 = wl40Var2.c;
                    List list11 = wl40Var2.e;
                    if (list8.isEmpty()) {
                        iVar.j();
                        if (!list11.isEmpty()) {
                            iVar.z = ((vhz) list11.get(0)).d;
                            hVar.b = ReturnWithStateBar$Product.LOGISTICS;
                            hVar.c = list11.get(0);
                        } else if (!list9.isEmpty()) {
                            vcm vcmVar = iVar.s;
                            fnt fntVar = (fnt) list9.get(0);
                            vcmVar.getClass();
                            switch (gnt.b[fntVar.h.ordinal()]) {
                                case 1:
                                    sessionState = SessionState.reservationFree;
                                    break;
                                case 2:
                                    sessionState = SessionState.reservationPaid;
                                    break;
                                case 3:
                                    sessionState = SessionState.acceptanceFree;
                                    break;
                                case 4:
                                    sessionState = SessionState.acceptancePaid;
                                    break;
                                case 5:
                                    sessionState = SessionState.riding;
                                    break;
                                case 6:
                                    sessionState = SessionState.parking;
                                    break;
                                case 7:
                                    sessionState = SessionState.unrecognized;
                                    break;
                                default:
                                    w511.b();
                                    return null;
                            }
                            switch (cfm.a[sessionState.ordinal()]) {
                                case 1:
                                    str = "Бесплатное ожидание";
                                    break;
                                case 2:
                                case 6:
                                    str = "Ожидание";
                                    break;
                                case 3:
                                case 4:
                                    str = "Осмотр";
                                    break;
                                case 5:
                                    str = "В пути";
                                    break;
                                case 7:
                                    str = "";
                                    break;
                                default:
                                    w511.b();
                                    return null;
                            }
                            iVar.z = g8e.p(str, Extension.COLON_SPACE, fntVar.b);
                            hVar.b = ReturnWithStateBar$Product.DRIVE;
                            hVar.c = null;
                        } else if (list10.isEmpty()) {
                            Iterator it2 = wl40Var2.b.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    tlyVar = null;
                                    break;
                                }
                                tlyVar = ((sly) it2.next()).a();
                                if (tlyVar != null) {
                                    break;
                                }
                            }
                            if (tlyVar != null) {
                                iVar.z = tlyVar.e;
                                hVar.b = ReturnWithStateBar$Product.LINKED;
                                hVar.c = null;
                            }
                            if (!wl40Var2.f.isEmpty()) {
                                iVar.z = avj0Var.h(kyh0.scooters);
                                hVar.b = ReturnWithStateBar$Product.SCOOTERS;
                                hVar.c = null;
                            }
                        } else {
                            iVar.z = ((ren) list10.get(0)).f;
                            hVar.b = ReturnWithStateBar$Product.EATS;
                            hVar.c = list10.get(0);
                        }
                    } else {
                        o2y0 o2y0Var = (o2y0) wl40Var2.a.get(0);
                        if (!z2 && hVar.b == ReturnWithStateBar$Product.TAXI) {
                            Object obj2 = hVar.c;
                        }
                        iVar.j();
                        com.yandex.go.taxi.order.titles.f a = iVar.n.a();
                        a.c(o2y0Var, true, true, true, iVar.E);
                        iVar.x = a;
                        hVar.b = ReturnWithStateBar$Product.TAXI;
                        hVar.c = o2y0Var;
                    }
                }
                if (!iVar.B) {
                    iVar.l.a(false);
                }
                iVar.f();
                return zy11.a;
            }
        }
        returnWithStateBar$onActiveOrderListChanged$1 = new ReturnWithStateBar$onActiveOrderListChanged$1(iVar, continuation);
        Object obj3 = returnWithStateBar$onActiveOrderListChanged$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = returnWithStateBar$onActiveOrderListChanged$1.label;
        if (i != 0) {
        }
        iVar2.B = ((Boolean) obj3).booleanValue();
        if (i2 <= 1) {
        }
        if (!iVar.B) {
        }
        iVar.f();
        return zy11.a;
    }

    @Override // defpackage.jf4
    public final g18 a(gf4 gf4Var) {
        this.v.add(gf4Var);
        return new l30(13, this, gf4Var);
    }

    @Override // ru.yandex.taxi.statebar.controller.c
    public final void b(ru.yandex.taxi.statebar.a aVar) {
        super.b(aVar);
        h hVar = this.w;
        hVar.a = false;
        hVar.b = null;
        hVar.c = null;
        this.t = this.k.e.h((sw40) ((zxf0) pwf0.d(sw40.class, new czc0(2, new sw40() { // from class: i2k0
            @Override // defpackage.sw40
            public final void te() {
                i.this.f();
            }
        }))));
        this.u = tje.N(this.j, null, null, new ReturnWithStateBar$start$$inlined$safeCollectIn$1(this.q.h(), null, this), 3);
    }

    @Override // defpackage.jf4
    public final gci0 c() {
        return this.C;
    }

    @Override // defpackage.jf4
    public final void d(boolean z) {
        this.l.a(z);
    }

    @Override // ru.yandex.taxi.statebar.controller.c
    public final boolean e() {
        return this.y && super.e();
    }

    @Override // ru.yandex.taxi.statebar.controller.c
    public final void f() {
        this.B = this.q.d();
        mhf mhfVar = this.r;
        v40 a = mhfVar.a();
        if ((a instanceof if4) && ((if4) a).canBackToActiveOrderStateBarBeVisible() && this.B && ((Boolean) this.C.a.getValue()).booleanValue()) {
            i(true);
        } else if (mhfVar.a() != null) {
            i(false);
        }
        ru.yandex.taxi.statebar.a aVar = this.i;
        if (aVar != null) {
            boolean z = this.y;
            bdc bdcVar = new bdc(xng0.textMain);
            t3u0 t3u0Var = new t3u0(StateBarViewModel$Type.BACK_TO_ACTIVE_ORDER);
            t3u0Var.b = z;
            t3u0Var.e = this.A;
            t3u0Var.k = bdcVar;
            t3u0Var.l = bdcVar;
            t3u0Var.i = this.D;
            t3u0Var.h = new bdc(xng0.bgMain);
            t3u0Var.g = this.z;
            t3u0Var.j = true;
            aVar.a(new u3u0(t3u0Var));
        }
    }

    public final void i(boolean z) {
        if (this.y == z) {
            return;
        }
        this.y = z;
        if (z) {
            u8w u8wVar = this.m;
            u8wVar.getClass();
            u8wVar.a.a("MultiorderNotification.Shown", new HashMap(), 1, new HashMap());
        }
        g();
    }

    public final void j() {
        com.yandex.go.taxi.order.titles.f fVar = this.x;
        if (fVar != null) {
            fVar.d();
        }
        this.x = null;
    }

    @Override // ru.yandex.taxi.statebar.controller.c
    public final void stop() {
        super.stop();
        this.t.cancel();
        pzt0 pzt0Var = this.u;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        j();
        h hVar = this.w;
        hVar.a = false;
        hVar.b = null;
        hVar.c = null;
    }
}

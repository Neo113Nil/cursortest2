package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import com.yandex.music.shared.relay.common.proto.h;
import com.yandex.music.shared.relay.common.proto.i;
import com.yandex.music.shared.relay.common.proto.j;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.main.MainScreenActivity;

/* loaded from: classes4.dex */
public final class s3 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public s3(rjc rjcVar, n7q n7qVar, kml kmlVar, thl thlVar, g08 g08Var) {
        this.a = 3;
        this.f = rjcVar;
        this.c = n7qVar;
        this.d = kmlVar;
        this.b = thlVar;
        this.e = g08Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|(1:(1:(1:(1:(4:13|14|15|16)(2:19|20))(4:21|22|15|16))(4:24|25|15|16))(4:27|28|15|16))(5:30|(1:32)(1:95)|33|(1:35)(1:94)|(2:37|38)(4:(1:40)(1:93)|41|(8:43|44|(1:46)(1:51)|47|(1:49)|28|15|16)(5:(4:53|(1:55)(1:70)|(1:57)(1:69)|(4:59|(6:61|62|(1:64)(1:68)|65|(1:67)|25)|15|16))|71|(1:73)(1:92)|(1:75)|(8:77|78|(1:80)(1:84)|81|(1:83)|22|15|16)(4:85|86|(1:88)(1:91)|89))|50))))|100|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01be, code lost:
    
        if (r6.d.m(r2, r7) == r8) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0191, code lost:
    
        r1 = defpackage.z7o.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01c4, code lost:
    
        r1 = defpackage.z7o.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0145, code lost:
    
        r1 = defpackage.z7o.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00eb, code lost:
    
        r1 = defpackage.z7o.b;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(d6l d6lVar, Continuation continuation) {
        c4q c4qVar;
        int i;
        boolean d;
        boolean d2;
        AtomicReference atomicReference = (AtomicReference) this.e;
        xqn xqnVar = (xqn) this.d;
        xqn xqnVar2 = (xqn) this.c;
        xqn xqnVar3 = (xqn) this.b;
        ltm ltmVar = (ltm) this.f;
        if (continuation instanceof c4q) {
            c4qVar = (c4q) continuation;
            int i2 = c4qVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4qVar.l = i2 - Integer.MIN_VALUE;
                Object obj = c4qVar.j;
                nm6 nm6Var = nm6.a;
                i = c4qVar.l;
                if (i == 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        r7o r7oVar = z7o.b;
                        return Unit.a;
                    }
                    if (i == 2) {
                        qgg.h0(obj);
                        r7o r7oVar2 = z7o.b;
                        return Unit.a;
                    }
                    if (i == 3) {
                        qgg.h0(obj);
                        r7o r7oVar3 = z7o.b;
                        return Unit.a;
                    }
                    if (i != 4) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    r7o r7oVar4 = z7o.b;
                    return Unit.a;
                }
                qgg.h0(obj);
                n7q n7qVar = d6lVar.a;
                mwk b = n7qVar.b();
                mwk E = gdg.E(n7qVar);
                u3q g = n7qVar.g();
                u3q u3qVar = (u3q) xqnVar3.a;
                mwk mwkVar = (mwk) xqnVar2.a;
                mwk mwkVar2 = (mwk) xqnVar.a;
                rcl rclVar = (rcl) atomicReference.get();
                xqnVar3.a = g;
                xqnVar2.a = E;
                xqnVar.a = b;
                String b2 = b.b();
                String b3 = mwkVar2 != null ? mwkVar2.b() : null;
                boolean z = false;
                if (b3 == null) {
                    d = false;
                } else {
                    AtomicInteger atomicInteger = rwk.b;
                    d = Intrinsics.d(b2, b3);
                }
                if (d) {
                    return Unit.a;
                }
                if (!Intrinsics.d(u3qVar != null ? u3qVar.getId() : null, g.getId())) {
                    ktm ktmVar = (ktm) ltmVar;
                    ktmVar.getClass();
                    r7o r7oVar5 = z7o.b;
                    rwk rwkVar = new rwk(b.b());
                    mqs a = b.a();
                    vat vatVar = new vat(rwkVar, a != null ? a.a : null, b4q.d);
                    c4qVar.l = 1;
                    if (ktmVar.d.m(vatVar, c4qVar) == nm6Var) {
                    }
                    r7o r7oVar6 = z7o.b;
                    return Unit.a;
                }
                if (rclVar != null) {
                    String b4 = rclVar.a.b();
                    String b5 = mwkVar2 != null ? mwkVar2.b() : null;
                    if (b5 == null) {
                        d2 = false;
                    } else {
                        AtomicInteger atomicInteger2 = rwk.b;
                        d2 = Intrinsics.d(b4, b5);
                    }
                    if (d2) {
                        if (rclVar.b) {
                            atomicReference.set(null);
                            ktm ktmVar2 = (ktm) ltmVar;
                            ktmVar2.getClass();
                            r7o r7oVar7 = z7o.b;
                            rwk rwkVar2 = new rwk(b.b());
                            mqs a2 = b.a();
                            vat vatVar2 = new vat(rwkVar2, a2 != null ? a2.a : null, b4q.a);
                            c4qVar.l = 2;
                            if (ktmVar2.d.m(vatVar2, c4qVar) == nm6Var) {
                            }
                            r7o r7oVar22 = z7o.b;
                        }
                        return Unit.a;
                    }
                }
                String b6 = b.b();
                String b7 = mwkVar != null ? mwkVar.b() : null;
                if (b7 != null) {
                    AtomicInteger atomicInteger3 = rwk.b;
                    z = Intrinsics.d(b6, b7);
                }
                if (z) {
                    ktm ktmVar3 = (ktm) ltmVar;
                    ktmVar3.getClass();
                    r7o r7oVar8 = z7o.b;
                    rwk rwkVar3 = new rwk(b.b());
                    mqs a3 = b.a();
                    vat vatVar3 = new vat(rwkVar3, a3 != null ? a3.a : null, b4q.c);
                    c4qVar.l = 3;
                    if (ktmVar3.d.m(vatVar3, c4qVar) == nm6Var) {
                    }
                    r7o r7oVar32 = z7o.b;
                    return Unit.a;
                }
                ktm ktmVar4 = (ktm) ltmVar;
                ktmVar4.getClass();
                r7o r7oVar9 = z7o.b;
                rwk rwkVar4 = new rwk(b.b());
                mqs a4 = b.a();
                vat vatVar4 = new vat(rwkVar4, a4 != null ? a4.a : null, b4q.b);
                c4qVar.l = 4;
                return nm6Var;
            }
        }
        c4qVar = new c4q(this, continuation);
        Object obj2 = c4qVar.j;
        nm6 nm6Var2 = nm6.a;
        i = c4qVar.l;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(nvm nvmVar, Continuation continuation) {
        ntn ntnVar;
        int i;
        if (continuation instanceof ntn) {
            ntnVar = (ntn) continuation;
            int i2 = ntnVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ntnVar.l = i2 - Integer.MIN_VALUE;
                Object obj = ntnVar.j;
                nm6 nm6Var = nm6.a;
                i = ntnVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    long j = nvmVar.b;
                    Long l = nvmVar.c;
                    long longValue = l != null ? l.longValue() : 0L;
                    int ordinal = ((akq) this.c).a.ordinal();
                    char c = 2;
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            c = 3;
                        } else {
                            if (ordinal != 2) {
                                b6e.s();
                                return null;
                            }
                            c = 4;
                        }
                    }
                    ktn ktnVar = (ktn) h.d.createBuilder();
                    ktnVar.d();
                    ((h) ktnVar.b).a = j;
                    ktnVar.d();
                    ((h) ktnVar.b).b = longValue;
                    ktnVar.d();
                    h hVar = (h) ktnVar.b;
                    hVar.getClass();
                    int i3 = 1;
                    if (c != 2) {
                        i3 = 3;
                        if (c == 3) {
                            i3 = 2;
                        } else if (c != 4) {
                            throw null;
                        }
                    }
                    hVar.c = i3;
                    h hVar2 = (h) ktnVar.b();
                    mm6 mm6Var = (ltm) this.d;
                    j l2 = szf.l(true, (i) ((AtomicReference) this.e).getAndSet(null), hVar2);
                    ntnVar.l = 1;
                    if (((oc4) mm6Var).d.m(l2, ntnVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                ((xqn) this.b).a = (n7q) this.f;
                return Unit.a;
            }
        }
        ntnVar = new ntn(this, continuation);
        Object obj2 = ntnVar.j;
        nm6 nm6Var2 = nm6.a;
        i = ntnVar.l;
        if (i != 0) {
        }
        ((xqn) this.b).a = (n7q) this.f;
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        qhl qhlVar;
        int i;
        Object obj2;
        hmb hmbVar;
        int i2 = this.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.b;
        Object obj6 = this.d;
        Object obj7 = this.c;
        switch (i2) {
            case 0:
                j1g j1gVar = (j1g) obj;
                c9j c9jVar = (c9j) ((qj6) obj7).a;
                w3 w3Var = (w3) obj6;
                pyc pycVar = w3Var.f;
                Boolean bool = (Boolean) ((xqn) obj5).a;
                kbj kbjVar = (kbj) pycVar.invoke(c9jVar, j1gVar, Boolean.valueOf(bool != null ? bool.booleanValue() : false));
                xdr xdrVar = w3Var.i;
                n3 n3Var = new n3(w3Var.d.c, kbjVar, c9jVar.getDescription(), c9jVar.a(), (mwk) obj4);
                xdrVar.getClass();
                xdrVar.m(null, n3Var);
                Object emit = ((rjc) obj3).emit(new d73(w3Var.a()), continuation);
                return emit == nm6.a ? emit : Unit.a;
            case 1:
                avm avmVar = (avm) obj;
                vqn vqnVar = (vqn) obj4;
                tqn tqnVar = (tqn) obj7;
                Window window = (Window) obj6;
                xqn xqnVar = (xqn) obj5;
                Object obj8 = xqnVar.a;
                avm avmVar2 = avm.a;
                if (obj8 == avmVar2) {
                    tqnVar.a = c9g.q(window, vyr.StatusBar);
                    vqnVar.a = window.getStatusBarColor();
                }
                if (tqnVar.a) {
                    vyr vyrVar = vyr.StatusBar;
                    avmVar.getClass();
                    avm avmVar3 = avm.c;
                    c9g.u(window, vyrVar, !(avmVar == avmVar3));
                    if (!asq.H((Activity) obj3)) {
                        c9g.u(window, vyr.NavigationBar, true ^ (avmVar == avmVar3));
                    }
                }
                avmVar.getClass();
                int i3 = avmVar == avmVar2 ? vqnVar.a : 0;
                if (i3 != window.getStatusBarColor()) {
                    window.setStatusBarColor(i3);
                }
                xqnVar.a = avmVar;
                return Unit.a;
            case 2:
                dzf viewLifecycleOwner = ((mvj) obj5).getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                ((vvj) obj7).a((sd6) obj, (rvj) obj6, viewLifecycleOwner, (vb8) obj4, (qy2) obj3);
                return Unit.a;
            case 3:
                thl thlVar = (thl) obj5;
                n7q n7qVar = (n7q) obj7;
                if (continuation instanceof qhl) {
                    qhlVar = (qhl) continuation;
                    int i4 = qhlVar.k;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        qhlVar.k = i4 - Integer.MIN_VALUE;
                        Object obj9 = qhlVar.j;
                        nm6 nm6Var = nm6.a;
                        i = qhlVar.k;
                        if (i != 0) {
                            qgg.h0(obj9);
                            rjc rjcVar = (rjc) obj3;
                            n7qVar.getClass();
                            iil iilVar = new iil((kml) obj6, (h5l) wdg.A(n7qVar, oi6.a), (l9n) obj);
                            zil zilVar = zil.f;
                            g08 g08Var = (g08) obj4;
                            boolean z = g08Var instanceof e08;
                            r64 r64Var = r64.a;
                            if (z) {
                                obj2 = ((e08) g08Var).a;
                            } else {
                                if (!(g08Var instanceof f08)) {
                                    b6e.s();
                                    return null;
                                }
                                obj2 = r64Var;
                            }
                            obj2.getClass();
                            mwk b = n7qVar.b();
                            b.getClass();
                            String str = (String) dag.p(b, wvo.f);
                            mwk b2 = n7qVar.b();
                            zlb zlbVar = (zlb) wdg.A(n7qVar, l48.h);
                            ylb ylbVar = (ylb) wdg.A(n7qVar, fs7.h);
                            if (obj2.equals(r64Var)) {
                                hmbVar = hmb.OwnSpeaker;
                            } else if (obj2 instanceof p64) {
                                hmbVar = hmb.Chromecast;
                            } else if (obj2 instanceof q64) {
                                switch (((q64) obj2).c.ordinal()) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                        hmbVar = hmb.YandexStation;
                                        break;
                                    case 6:
                                    case 7:
                                        hmbVar = hmb.YandexTv;
                                        break;
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 14:
                                    case 15:
                                    case 16:
                                        hmbVar = hmb.Unspecified;
                                        break;
                                    case 11:
                                    case 12:
                                    case 13:
                                        hmbVar = hmb.SmartSpeaker;
                                        break;
                                    default:
                                        b6e.s();
                                        return null;
                                }
                            } else {
                                if (!(obj2 instanceof t64)) {
                                    b6e.s();
                                    return null;
                                }
                                switch (((t64) obj2).a.b.ordinal()) {
                                    case 0:
                                        hmbVar = hmb.Ios;
                                        break;
                                    case 1:
                                        hmbVar = hmb.AppleTv;
                                        break;
                                    case 2:
                                        hmbVar = hmb.Android;
                                        break;
                                    case 3:
                                        hmbVar = hmb.AndroidTv;
                                        break;
                                    case 4:
                                        hmbVar = hmb.Web;
                                        break;
                                    case 5:
                                        hmbVar = hmb.WebTv;
                                        break;
                                    case 6:
                                        hmbVar = hmb.WebDesktop;
                                        break;
                                    case 7:
                                        hmbVar = hmb.SmartSpeaker;
                                        break;
                                    case 8:
                                        hmbVar = hmb.AndroidWear;
                                        break;
                                    case 9:
                                        hmbVar = hmb.Unspecified;
                                        break;
                                    default:
                                        b6e.s();
                                        return null;
                                }
                            }
                            le5 le5Var = new le5(iilVar, n7qVar, new ne5(new zil(b2, str, zlbVar, ylbVar, hmbVar), new ime(26, thlVar, iilVar, n7qVar)));
                            qhlVar.k = 1;
                            if (rjcVar.emit(le5Var, qhlVar) == nm6Var) {
                                return nm6Var;
                            }
                        } else {
                            if (i != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj9);
                        }
                        return Unit.a;
                    }
                }
                qhlVar = new qhl(this, continuation);
                Object obj92 = qhlVar.j;
                nm6 nm6Var2 = nm6.a;
                i = qhlVar.k;
                if (i != 0) {
                }
                return Unit.a;
            case 4:
                return c((nvm) obj, continuation);
            case 5:
                return b((d6l) obj, continuation);
            case 6:
                if (c7r.a[((y6r) obj).ordinal()] != 1) {
                    b6e.s();
                    return null;
                }
                ((ViewGroup) obj7).removeView((ComposeView) obj6);
                ((aqd) ((vtm) obj5).a).s();
                MainScreenActivity mainScreenActivity = (MainScreenActivity) ((e7r) obj4).b.b;
                mainScreenActivity.J0 = false;
                ps psVar = mainScreenActivity.K0;
                if (psVar != null) {
                    psVar.invoke();
                }
                mainScreenActivity.K0 = null;
                gld.L((tf6) obj3, null);
                return Unit.a;
            default:
                dzf viewLifecycleOwner2 = ((h7s) obj4).getViewLifecycleOwner();
                viewLifecycleOwner2.getClass();
                ((z7s) obj7).a((rd6) obj, (p7s) obj6, (vb8) obj5, viewLifecycleOwner2, (qy2) ((jyr) obj3).getValue());
                return Unit.a;
        }
    }

    public /* synthetic */ s3(xqn xqnVar, Serializable serializable, Object obj, Serializable serializable2, Object obj2, int i) {
        this.a = i;
        this.b = xqnVar;
        this.c = serializable;
        this.d = obj;
        this.e = serializable2;
        this.f = obj2;
    }

    public s3(akq akqVar, ltm ltmVar, AtomicReference atomicReference, xqn xqnVar, n7q n7qVar) {
        this.a = 4;
        this.c = akqVar;
        this.d = ltmVar;
        this.e = atomicReference;
        this.b = xqnVar;
        this.f = n7qVar;
    }

    public /* synthetic */ s3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.e = obj4;
        this.f = obj5;
    }
}

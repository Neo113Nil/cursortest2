package defpackage;

import android.view.View;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.yandex.music.shared.playback.utils.api.commands.AttractivenessOperationCommand;
import com.yandex.music.shared.player.integration.api.trackrestarter.RestartTrackCommand;
import com.yandex.music.shared.settings.api.explicit.commands.RebuildQueueOnExplicitChangeCommand;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.main.MainScreenActivity;

/* loaded from: classes3.dex */
public final class ryp implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ryp(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(xxq xxqVar, Continuation continuation) {
        qyp qypVar;
        int i;
        xdr xdrVar;
        c0q c0qVar;
        int i2;
        xdr xdrVar2;
        h7q h7qVar;
        int i3;
        xdr xdrVar3;
        l8q l8qVar;
        int i4;
        xdr xdrVar4;
        switch (this.a) {
            case 0:
                if (continuation instanceof qyp) {
                    qypVar = (qyp) continuation;
                    int i5 = qypVar.m;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        qypVar.m = i5 - Integer.MIN_VALUE;
                        Object obj = qypVar.k;
                        nm6 nm6Var = nm6.a;
                        i = qypVar.m;
                        if (i != 0) {
                            qgg.h0(obj);
                            syp sypVar = (syp) this.b;
                            xdr xdrVar5 = sypVar.d;
                            xf2 xf2Var = sypVar.b;
                            qypVar.j = xdrVar5;
                            qypVar.m = 1;
                            obj = x97.V(dm6.b, new qi(xf2Var, xxqVar, (Continuation) null, 13), qypVar);
                            if (obj != nm6Var) {
                                xdrVar = xdrVar5;
                            }
                        } else if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            xdrVar = qypVar.j;
                            qgg.h0(obj);
                        }
                        xdrVar.l(obj);
                        break;
                    }
                }
                qypVar = new qyp(this, continuation);
                Object obj2 = qypVar.k;
                nm6 nm6Var2 = nm6.a;
                i = qypVar.m;
                if (i != 0) {
                }
                xdrVar.l(obj2);
                break;
            case 1:
                if (continuation instanceof c0q) {
                    c0qVar = (c0q) continuation;
                    int i6 = c0qVar.m;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c0qVar.m = i6 - Integer.MIN_VALUE;
                        Object obj3 = c0qVar.k;
                        nm6 nm6Var3 = nm6.a;
                        i2 = c0qVar.m;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            d0q d0qVar = (d0q) this.b;
                            xdr xdrVar6 = d0qVar.d;
                            tu6 tu6Var = d0qVar.b;
                            c0qVar.j = xdrVar6;
                            c0qVar.m = 1;
                            obj3 = x97.V(dm6.b, new nz5(tu6Var, xxqVar, (Continuation) null, 3), c0qVar);
                            if (obj3 != nm6Var3) {
                                xdrVar2 = xdrVar6;
                            }
                        } else if (i2 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            xdrVar2 = c0qVar.j;
                            qgg.h0(obj3);
                        }
                        xdrVar2.l(obj3);
                        break;
                    }
                }
                c0qVar = new c0q(this, continuation);
                Object obj32 = c0qVar.k;
                nm6 nm6Var32 = nm6.a;
                i2 = c0qVar.m;
                if (i2 != 0) {
                }
                xdrVar2.l(obj32);
                break;
            case 9:
                if (continuation instanceof h7q) {
                    h7qVar = (h7q) continuation;
                    int i7 = h7qVar.m;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        h7qVar.m = i7 - Integer.MIN_VALUE;
                        Object obj4 = h7qVar.k;
                        nm6 nm6Var4 = nm6.a;
                        i3 = h7qVar.m;
                        if (i3 != 0) {
                            qgg.h0(obj4);
                            j7q j7qVar = (j7q) this.b;
                            xdr xdrVar7 = j7qVar.d;
                            i6n i6nVar = j7qVar.b;
                            h7qVar.j = xdrVar7;
                            h7qVar.m = 1;
                            obj4 = x97.V(dm6.b, new seg(i6nVar, xxqVar, (Continuation) null, 21), h7qVar);
                            if (obj4 != nm6Var4) {
                                xdrVar3 = xdrVar7;
                            }
                        } else if (i3 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            xdrVar3 = h7qVar.j;
                            qgg.h0(obj4);
                        }
                        xdrVar3.l(obj4);
                        break;
                    }
                }
                h7qVar = new h7q(this, continuation);
                Object obj42 = h7qVar.k;
                nm6 nm6Var42 = nm6.a;
                i3 = h7qVar.m;
                if (i3 != 0) {
                }
                xdrVar3.l(obj42);
                break;
            default:
                if (continuation instanceof l8q) {
                    l8qVar = (l8q) continuation;
                    int i8 = l8qVar.m;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        l8qVar.m = i8 - Integer.MIN_VALUE;
                        Object obj5 = l8qVar.k;
                        nm6 nm6Var5 = nm6.a;
                        i4 = l8qVar.m;
                        if (i4 != 0) {
                            qgg.h0(obj5);
                            m8q m8qVar = (m8q) this.b;
                            xdr xdrVar8 = m8qVar.d;
                            ytp ytpVar = m8qVar.b;
                            String str = xxqVar.a;
                            l8qVar.j = xdrVar8;
                            l8qVar.m = 1;
                            obj5 = ((cup) ytpVar).a(str, l8qVar);
                            if (obj5 != nm6Var5) {
                                xdrVar4 = xdrVar8;
                            }
                        } else if (i4 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            xdrVar4 = l8qVar.j;
                            qgg.h0(obj5);
                        }
                        xdrVar4.l(obj5);
                        break;
                    }
                }
                l8qVar = new l8q(this, continuation);
                Object obj52 = l8qVar.k;
                nm6 nm6Var52 = nm6.a;
                i4 = l8qVar.m;
                if (i4 != 0) {
                }
                xdrVar4.l(obj52);
                break;
        }
        return Unit.a;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        Object obj2;
        vtm vtmVar;
        Object obj3;
        vtm vtmVar2;
        Object obj4;
        vtm vtmVar3;
        Object obj5;
        vtm vtmVar4;
        Object obj6 = null;
        boolean z = false;
        switch (this.a) {
            case 0:
                return b((xxq) obj, continuation);
            case 1:
                return b((xxq) obj, continuation);
            case 2:
                qu1 qu1Var = (qu1) obj;
                c3t c3tVar = a3t.a;
                k1l k1lVar = (k1l) ((toh) this.b).c;
                AttractivenessOperationCommand attractivenessOperationCommand = new AttractivenessOperationCommand(qu1Var);
                int ordinal = qu1Var.ordinal();
                if (ordinal != 0 && ordinal != 1) {
                    if (ordinal == 2) {
                        c3tVar = new b3t("queue_skip");
                    } else if (ordinal != 3) {
                        b6e.s();
                        return null;
                    }
                }
                k1lVar.a(attractivenessOperationCommand, c3tVar);
                return Unit.a;
            case 3:
                ((k1l) ((w3q) this.b).b).a(RebuildQueueOnExplicitChangeCommand.INSTANCE, a3t.a);
                return Unit.a;
            case 4:
                vat vatVar = (vat) obj;
                uol uolVar = (uol) ((w3q) this.b).b;
                String str = ((rwk) vatVar.a).a;
                String str2 = (String) vatVar.b;
                int ordinal2 = ((b4q) vatVar.c).ordinal();
                Continuation continuation2 = null;
                if (ordinal2 == 0) {
                    a7q i = ((z6n) ((uol) uolVar.l.b).a.c).i();
                    if (i == null || (vtmVar = i.u) == null) {
                        obj2 = Unit.a;
                    } else {
                        Object V = x97.V(mal.b(), new y6q((a7q) vtmVar.a, str, str2, continuation2, 0), continuation);
                        Object obj7 = nm6.a;
                        obj2 = V;
                        if (V != obj7) {
                            obj2 = Unit.a;
                        }
                        if (obj2 != obj7) {
                            obj2 = Unit.a;
                        }
                    }
                    Object obj8 = nm6.a;
                    Object obj9 = obj2;
                    if (obj2 != obj8) {
                        obj9 = Unit.a;
                    }
                    Object obj10 = obj9;
                    return obj10 == obj8 ? obj10 : Unit.a;
                }
                if (ordinal2 == 1) {
                    a7q i2 = ((z6n) ((uol) uolVar.l.b).a.c).i();
                    if (i2 == null || (vtmVar2 = i2.u) == null) {
                        obj3 = Unit.a;
                    } else {
                        Object V2 = x97.V(mal.b(), new y6q((a7q) vtmVar2.a, str, str2, continuation2, 2), continuation);
                        Object obj11 = nm6.a;
                        obj3 = V2;
                        if (V2 != obj11) {
                            obj3 = Unit.a;
                        }
                        if (obj3 != obj11) {
                            obj3 = Unit.a;
                        }
                    }
                    Object obj12 = nm6.a;
                    Object obj13 = obj3;
                    if (obj3 != obj12) {
                        obj13 = Unit.a;
                    }
                    Object obj14 = obj13;
                    return obj14 == obj12 ? obj14 : Unit.a;
                }
                if (ordinal2 == 2) {
                    a7q i3 = ((z6n) ((uol) uolVar.l.b).a.c).i();
                    if (i3 == null || (vtmVar3 = i3.u) == null) {
                        obj4 = Unit.a;
                    } else {
                        Object V3 = x97.V(mal.b(), new y6q((a7q) vtmVar3.a, str, str2, continuation2, 3), continuation);
                        Object obj15 = nm6.a;
                        obj4 = V3;
                        if (V3 != obj15) {
                            obj4 = Unit.a;
                        }
                        if (obj4 != obj15) {
                            obj4 = Unit.a;
                        }
                    }
                    Object obj16 = nm6.a;
                    Object obj17 = obj4;
                    if (obj4 != obj16) {
                        obj17 = Unit.a;
                    }
                    Object obj18 = obj17;
                    return obj18 == obj16 ? obj18 : Unit.a;
                }
                if (ordinal2 != 3) {
                    b6e.s();
                    return null;
                }
                a7q i4 = ((z6n) ((uol) uolVar.l.b).a.c).i();
                if (i4 == null || (vtmVar4 = i4.u) == null) {
                    obj5 = Unit.a;
                } else {
                    Object V4 = x97.V(mal.b(), new y6q((a7q) vtmVar4.a, str, str2, continuation2, 1), continuation);
                    Object obj19 = nm6.a;
                    obj5 = V4;
                    if (V4 != obj19) {
                        obj5 = Unit.a;
                    }
                    if (obj5 != obj19) {
                        obj5 = Unit.a;
                    }
                }
                Object obj20 = nm6.a;
                Object obj21 = obj5;
                if (obj5 != obj20) {
                    obj21 = Unit.a;
                }
                Object obj22 = obj21;
                return obj22 == obj20 ? obj22 : Unit.a;
            case 5:
                p8l p8lVar = (p8l) obj;
                t5l t5lVar = (t5l) ((jyr) ((w3q) this.b).c).getValue();
                mwk b = p8lVar.a.b();
                i5l i5lVar = j5l.c;
                float f = p8lVar.b.a;
                i5lVar.getClass();
                Iterator it = j5l.f.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((j5l) next).a == f) {
                            obj6 = next;
                        }
                    }
                }
                j5l j5lVar = (j5l) obj6;
                if (j5lVar == null) {
                    j5lVar = j5l.d;
                }
                Object d = t5lVar.d(b, j5lVar, continuation);
                return d == nm6.a ? d : Unit.a;
            case 6:
                c3t c3tVar2 = (c3t) obj;
                if (c3tVar2 instanceof b3t) {
                    rlw rlwVar = (rlw) ((l4q) this.b).a.getValue();
                    x97.y((mm6) rlwVar.f.getValue(), null, null, new j9w(rlwVar, ((b3t) c3tVar2).a, z ? 1 : 0, 5), 3);
                } else if (!Intrinsics.d(c3tVar2, a3t.a)) {
                    b6e.s();
                    return null;
                }
                return Unit.a;
            case 7:
                ow6 ow6Var = (ow6) this.b;
                synchronized (ow6Var) {
                    ywq ywqVar = ow6Var.b;
                    ywqVar.a.clear();
                    ywqVar.b = -1;
                    ywqVar.c = 0;
                    ywqVar.d = 0;
                    xdr xdrVar = ow6Var.j;
                    h6r h6rVar = new h6r(-1);
                    xdrVar.getClass();
                    xdrVar.m(null, h6rVar);
                }
                return Unit.a;
            case 8:
                Object a = ((e6q) this.b).a(continuation);
                return a == nm6.a ? a : Unit.a;
            case 9:
                return b((xxq) obj, continuation);
            case 10:
                return b((xxq) obj, continuation);
            case 11:
                rcl rclVar = (rcl) obj;
                if (rclVar.c) {
                    return Unit.a;
                }
                ((x0q) ((s8q) this.b).m.c).a(new khn(rclVar.b ? w5j.a : w5j.b));
                return Unit.a;
            case 12:
                xdr xdrVar2 = ((qeq) this.b).a;
                List list = (List) obj;
                list.getClass();
                ArrayList x0 = CollectionsKt.x0(list);
                Collections.shuffle(x0);
                xdrVar2.getClass();
                xdrVar2.m(null, x0);
                return Unit.a;
            case 13:
                gpq gpqVar = (gpq) this.b;
                xdr xdrVar3 = gpqVar.l;
                bpq bpqVar = new bpq((List) obj, gpqVar.r.f());
                xdrVar3.getClass();
                xdrVar3.m(null, bpqVar);
                return Unit.a;
            case 14:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                xdr xdrVar4 = ((npq) this.b).o;
                xdrVar4.getClass();
                xdrVar4.m(null, bool);
                return Unit.a;
            case 15:
                ((avq) this.b).b(((j1g) obj) == j1g.a);
                return Unit.a;
            case 16:
                d85 d85Var = (d85) obj;
                e6r e6rVar = ((z5r) this.b).h;
                if (e6rVar != null) {
                    e6rVar.e.setValue(e6rVar, e6r.g[1], d85Var);
                }
                return Unit.a;
            case 17:
                cwe cweVar = (cwe) obj;
                w6r w6rVar = ((t6r) this.b).c;
                if (Intrinsics.d(cweVar, awe.a)) {
                    ((lhs) w6rVar.b.getValue()).d();
                    ((lhs) w6rVar.c.getValue()).d();
                } else if (Intrinsics.d(cweVar, zve.a)) {
                    ((lhs) w6rVar.c.getValue()).c();
                    ((lhs) w6rVar.b.getValue()).g = -1L;
                } else {
                    if (!(cweVar instanceof bwe)) {
                        b6e.s();
                        return null;
                    }
                    ((lhs) w6rVar.b.getValue()).c();
                    ((lhs) w6rVar.c.getValue()).g = -1L;
                }
                return Unit.a;
            case 18:
                w7r w7rVar = (w7r) obj;
                e8r e8rVar = (e8r) this.b;
                Continuation continuation3 = null;
                if (Intrinsics.d(w7rVar, u7r.a)) {
                    e8rVar.o.a.a("SplashScreen.Loading", null);
                    g8r g8rVar = e8rVar.n;
                    ((lhs) g8rVar.b.getValue()).d();
                    ((lhs) g8rVar.c.getValue()).d();
                } else if (Intrinsics.d(w7rVar, t7r.a)) {
                    e8rVar.o.a.a("SplashScreen.Empty", null);
                    g8r g8rVar2 = e8rVar.n;
                    ((lhs) g8rVar2.c.getValue()).c();
                    ((lhs) g8rVar2.b.getValue()).g = -1L;
                    x97.y(ot0.F(e8rVar), null, null, new mj0(0L, e8rVar, continuation3, 10), 3);
                } else {
                    if (!(w7rVar instanceof v7r)) {
                        b6e.s();
                        return null;
                    }
                    h8r h8rVar = e8rVar.o;
                    String str3 = ((v7r) w7rVar).a.a;
                    h8rVar.getClass();
                    str3.getClass();
                    h8rVar.a.a("SplashScreen.Success", tah.b(new Pair("screenId", str3)));
                    g8r g8rVar3 = e8rVar.n;
                    ((lhs) g8rVar3.b.getValue()).c();
                    ((lhs) g8rVar3.c.getValue()).g = -1L;
                }
                return Unit.a;
            case 19:
                ssg.a(2, "SubscriptionGuardPlugin", "Stopping primary queue due to requirements, playbackState: " + ((e6l) obj), null);
                ((q7l) ((toh) this.b).e).a();
                return Unit.a;
            case 20:
                mns mnsVar = (mns) obj;
                bsr bsrVar = (bsr) this.b;
                if (mnsVar != null) {
                    bsrVar.d().e(mnsVar);
                } else {
                    bsrVar.d().c();
                }
                return Unit.a;
            case 21:
                ((xdr) ((bqi) this.b)).l(obj);
                return Unit.a;
            case 22:
                lxr lxrVar = (lxr) this.b;
                ((exr) lxrVar.m.getValue()).dismissAllowingStateLoss();
                xvr xvrVar = (xvr) lxrVar.k.getValue();
                y supportFragmentManager = xvrVar.a.getSupportFragmentManager();
                supportFragmentManager.getClass();
                supportFragmentManager.e0(cxb.J(), "EntryScreenCloseSyncKey");
                ((vni) xvrVar.b.a).a();
                return Unit.a;
            case 23:
                long longValue = ((Number) obj).longValue();
                t5s t5sVar = (t5s) this.b;
                Object a2 = lmm.a(t5sVar.f, new r5s(t5sVar, longValue, null), continuation);
                nm6 nm6Var = nm6.a;
                if (a2 != nm6Var) {
                    a2 = Unit.a;
                }
                return a2 == nm6Var ? a2 : Unit.a;
            case 24:
                wuo wuoVar = (wuo) obj;
                p7s p7sVar = (p7s) this.b;
                fy3 fy3Var = p7sVar.b;
                if (wuoVar instanceof tuo) {
                    String str4 = ((tuo) wuoVar).a;
                    y supportFragmentManager2 = fy3Var.a.getSupportFragmentManager();
                    supportFragmentManager2.getClass();
                    x2i.a0(supportFragmentManager2, jf0.C(pd.t(new qzm[0]), ru0.DARK), new teb(str4));
                } else if (wuoVar instanceof quo) {
                    w1g.y(fy3Var.a, ((quo) wuoVar).a, true);
                } else if (Intrinsics.d(wuoVar, suo.a)) {
                    t tVar = fy3Var.a;
                    if (!tVar.isFinishing()) {
                        tVar.finish();
                        lhs lhsVar = MainScreenActivity.Q0;
                        tVar.startActivity(imp.J(tVar, null, null, null, 14));
                    }
                } else {
                    if (!Intrinsics.d(wuoVar, ouo.a)) {
                        b6e.s();
                        return null;
                    }
                    p7sVar.b();
                }
                return Unit.a;
            case 25:
                y8s y8sVar = (y8s) this.b;
                y8sVar.d.clear();
                y8sVar.e.clear();
                return Unit.a;
            case 26:
                if (!((Boolean) obj).booleanValue()) {
                    lls llsVar = (lls) this.b;
                    View view = llsVar.getView();
                    if (view != null) {
                        view.setTranslationX(0.0f);
                    }
                    llsVar.z();
                }
                return Unit.a;
            case 27:
                ((sss) this.b).b.a(new RestartTrackCommand(), a3t.a);
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((bus) this.b).G();
                return Unit.a;
            default:
                kxs kxsVar = (kxs) this.b;
                kxsVar.k = -1L;
                kxsVar.l = -1L;
                kxsVar.i.l(null);
                String str5 = ((xxq) obj).a;
                str5.getClass();
                Object b2 = kxs.b(kxsVar, str5, continuation);
                return b2 == nm6.a ? b2 : Unit.a;
        }
    }
}

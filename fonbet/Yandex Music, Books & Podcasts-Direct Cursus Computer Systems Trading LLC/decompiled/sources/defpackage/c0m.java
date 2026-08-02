package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes3.dex */
public final class c0m implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0m b;

    public /* synthetic */ c0m(n0m n0mVar, int i) {
        this.a = i;
        this.b = n0mVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0320, code lost:
    
        if (r1.equals("all") == false) goto L132;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0260 A[LOOP:1: B:81:0x025a->B:83:0x0260, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x029f A[LOOP:2: B:87:0x0299->B:89:0x029f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a4  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        eca h;
        Object obj2;
        String str;
        String str2;
        String str3;
        o1u o1uVar;
        te teVar;
        e4m e4mVar;
        Object yzlVar;
        Iterator it;
        Object obj3;
        String str4;
        String str5;
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                xdr xdrVar = this.b.H;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                break;
            case 1:
                Object emit = this.b.A.emit((Function1) obj, continuation);
                if (emit != nm6.a) {
                    break;
                }
                break;
            case 2:
                v3w.n(((x66) obj).b == u0j.a, this.b.J, null);
                break;
            case 3:
                z0m z0mVar = (z0m) obj;
                n0m n0mVar = this.b;
                if (z0mVar instanceof t0m) {
                    eca ecaVar = eca.d;
                    gf4 gf4Var = ((t0m) z0mVar).e;
                    h = d51.h(gf4Var.a, gf4Var.a());
                } else if (!(z0mVar instanceof y0m)) {
                    b6e.s();
                    break;
                } else {
                    zul zulVar = ((y0m) z0mVar).e;
                    List list = zulVar.b;
                    if (list == null) {
                        ssg.a(7, "PlaylistScreenViewModel", "playlist must be contains tracks", null);
                        xdr xdrVar2 = n0mVar.X;
                        u0m u0mVar = u0m.a;
                        xdrVar2.getClass();
                        xdrVar2.m(null, u0mVar);
                        break;
                    } else {
                        eca ecaVar2 = eca.d;
                        h = d51.h(zulVar.a, list);
                    }
                }
                xdr xdrVar3 = (xdr) n0mVar.s.h;
                xdrVar3.getClass();
                xdrVar3.m(null, h);
                break;
            case 4:
                ndc ndcVar = (ndc) obj;
                n0m n0mVar2 = this.b;
                n0mVar2.E0.l(ndcVar);
                dzl dzlVar = (dzl) n0mVar2.z.getValue();
                dzlVar.getClass();
                ndcVar.getClass();
                if (!ndcVar.equals(jdc.a)) {
                    if (ndcVar instanceof ldc) {
                        r3 = true;
                    } else if (!ndcVar.equals(hdc.a)) {
                        b6e.s();
                        break;
                    }
                    x97.y(dzlVar.a, dm6.b, null, new z11(dzlVar, r3, (Continuation) null, 16), 2);
                }
                break;
            case 5:
                Pair pair = (Pair) obj;
                n0m n0mVar3 = this.b;
                z0m z0mVar2 = (z0m) pair.a;
                ndc ndcVar2 = (ndc) pair.b;
                cvl cvlVar = z0mVar2.a;
                if ((ndcVar2 instanceof ldc) && cvlVar.d() && ivf.I(cvlVar)) {
                    yzk yzkVar = n0mVar3.L;
                    if (yzkVar != null) {
                        ldc ldcVar = (ldc) ndcVar2;
                        List list2 = ldcVar.e;
                        Iterator it2 = ldcVar.a.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj2 = it2.next();
                                if (((hcc) obj2).d) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        hcc hccVar = (hcc) obj2;
                        if (hccVar != null) {
                            str = hccVar.a;
                            break;
                        }
                        str = null;
                        xdr xdrVar4 = yzkVar.e;
                        bzk bzkVar = new bzk(cvlVar, list2, t3q.c(yzkVar.b), str);
                        xdrVar4.getClass();
                        xdrVar4.m(null, bzkVar);
                    }
                } else {
                    yzk yzkVar2 = n0mVar3.L;
                    if (yzkVar2 != null) {
                        List list3 = z0mVar2.d;
                        cvlVar.getClass();
                        list3.getClass();
                        xdr xdrVar5 = yzkVar2.e;
                        bzk bzkVar2 = new bzk(cvlVar, list3, t3q.c(yzkVar2.b), null);
                        xdrVar5.getClass();
                        xdrVar5.m(null, bzkVar2);
                    }
                }
                break;
            default:
                a1m a1mVar = (a1m) obj;
                n0m n0mVar4 = this.b;
                xdr xdrVar6 = n0mVar4.B;
                xdr xdrVar7 = n0mVar4.D0;
                if (Intrinsics.d(a1mVar, u0m.a)) {
                    xdrVar7.l(null);
                    obj3 = tzl.a;
                } else if (Intrinsics.d(a1mVar, v0m.a)) {
                    xdrVar7.l(null);
                    obj3 = uzl.a;
                } else if (a1mVar instanceof w0m) {
                    xdrVar7.l(null);
                    obj3 = new vzl(((w0m) a1mVar).a);
                } else if (!(a1mVar instanceof z0m)) {
                    b6e.s();
                    break;
                } else {
                    xdr xdrVar8 = n0mVar4.E;
                    z0m z0mVar3 = (z0m) a1mVar;
                    cvl cvlVar2 = z0mVar3.a;
                    v3w.n(cvlVar2.B == 7, xdrVar8, null);
                    Integer num = cvlVar2.z;
                    xdr xdrVar9 = n0mVar4.D;
                    if (num != null) {
                        ymk K = zdg.K(Float.valueOf((num.intValue() + 280) % 360));
                        xdrVar9.getClass();
                        xdrVar9.m(null, K);
                    } else {
                        xdrVar9.l(n0mVar4.C.b.invoke());
                    }
                    jyr jyrVar = mvl.a;
                    List list4 = z0mVar3.d;
                    r1u r1uVar = z0mVar3.b;
                    ff ffVar = z0mVar3.c;
                    boolean h2 = n0mVar4.t.h();
                    boolean d = cvlVar2.d();
                    drt drtVar = cvlVar2.c;
                    if (d && ivf.I(cvlVar2)) {
                        str3 = rzf.J(cvlVar2, h2);
                    } else {
                        String str6 = cvlVar2.q;
                        if (str6 == null) {
                            int i = h2 ? cvlVar2.i : cvlVar2.g;
                            String str7 = drtVar.c;
                            if (str7.length() == 0) {
                                str7 = drtVar.b;
                            }
                            str3 = ((Object) str7) + " • \u200f" + rzf.I(i);
                        } else {
                            str2 = str6;
                            if (r1uVar != null && (str4 = r1uVar.a) != null) {
                                str5 = str4.length() <= 0 ? str4 : null;
                                if (str5 != null) {
                                    l18 l18Var = l18.b;
                                    bdt I = hag.I(byb.class);
                                    qdc qdcVar = l18Var.a;
                                    qdcVar.getClass();
                                    String pathForSize = ((ulu) ((byb) qdcVar.C(I)).c(ern.a(ulu.class))).h() ? op7.c(cvlVar2).a.getPathForSize(wct.s()) : r1uVar.c;
                                    String str8 = r1uVar.b;
                                    if (str8 == null) {
                                        str8 = ((skr) mvl.a.getValue()).c(R.string.dialog_action_radio_playlist);
                                    }
                                    o1uVar = jf0.f0(str5, str8, qo6.e, pathForSize, r1uVar.d, r1uVar.e, r1uVar.f);
                                    String str9 = cvlVar2.b;
                                    String t = ouj.t(op7.c(cvlVar2).a);
                                    String pathForSize2 = op7.a(cvlVar2).getPathForSize(frv.b());
                                    pathForSize2.getClass();
                                    if (ffVar != null || ffVar.a.length() <= 0 || ffVar.b.length() <= 0) {
                                        teVar = null;
                                    } else {
                                        String str10 = ffVar.a;
                                        d85 T = pd.T(ffVar.c);
                                        String str11 = ffVar.b;
                                        Boolean bool2 = ffVar.d;
                                        teVar = new te(str10, T, str11, bool2 != null ? bool2.booleanValue() : true);
                                    }
                                    iab iabVar = new iab(str9, str2, t, pathForSize2, null, teVar, o1uVar, cvlVar2.d() ? "https://video-full-screen.s3.yandex.net/mne_nravitsa_vert_motion-2.mp4" : cvlVar2.t, cvlVar2.x);
                                    if (z0mVar3 instanceof t0m) {
                                        xdrVar7.l(null);
                                        eul J = bfg.J(cvlVar2);
                                        StationId k = StationId.k(cvlVar2);
                                        k.getClass();
                                        t0m t0mVar = (t0m) z0mVar3;
                                        List<rf4> list5 = t0mVar.e.b;
                                        ArrayList arrayList = new ArrayList(v75.o(list5, 10));
                                        for (rf4 rf4Var : list5) {
                                            arrayList.add(new jzl(yf4.a(rf4Var), rf4Var.b));
                                        }
                                        yzlVar = new szl(J, k, iabVar, arrayList, t0mVar.e, c5b.a);
                                    } else if (!(z0mVar3 instanceof y0m)) {
                                        b6e.s();
                                        break;
                                    } else {
                                        StationId k2 = StationId.k(cvlVar2);
                                        if (o1uVar != null) {
                                            o1u o1uVar2 = !n0mVar4.k.a.N() ? o1uVar : null;
                                            if (o1uVar2 != null) {
                                                k2.getClass();
                                                e4mVar = new e4m(k2, o1uVar2);
                                                xdrVar7.l(e4mVar);
                                                ((oyl) n0mVar4.y.getValue()).getClass();
                                                if (cvlVar2.d() && ivf.I(cvlVar2)) {
                                                    ncc nccVar = (ncc) n0mVar4.x.getValue();
                                                    HashSet hashSet = new HashSet();
                                                    it = list4.iterator();
                                                    while (it.hasNext()) {
                                                        hashSet.add(((mqs) it.next()).d());
                                                    }
                                                    nccVar.c(hashSet);
                                                }
                                                eul J2 = bfg.J(cvlVar2);
                                                k2.getClass();
                                                ArrayList a = n0mVar4.v.a(list4, (e4m) xdrVar7.getValue());
                                                zul zulVar2 = ((y0m) z0mVar3).e;
                                                List<cvl> list6 = zulVar2.c;
                                                ArrayList arrayList2 = new ArrayList(v75.o(list6, 10));
                                                for (cvl cvlVar3 : list6) {
                                                    arrayList2.add(new avl(avf.B(cvlVar3), cvlVar3));
                                                }
                                                yzlVar = new yzl(J2, k2, iabVar, a, zulVar2, arrayList2);
                                            }
                                        }
                                        e4mVar = null;
                                        xdrVar7.l(e4mVar);
                                        ((oyl) n0mVar4.y.getValue()).getClass();
                                        if (cvlVar2.d()) {
                                            ncc nccVar2 = (ncc) n0mVar4.x.getValue();
                                            HashSet hashSet2 = new HashSet();
                                            it = list4.iterator();
                                            while (it.hasNext()) {
                                            }
                                            nccVar2.c(hashSet2);
                                        }
                                        eul J22 = bfg.J(cvlVar2);
                                        k2.getClass();
                                        ArrayList a2 = n0mVar4.v.a(list4, (e4m) xdrVar7.getValue());
                                        zul zulVar22 = ((y0m) z0mVar3).e;
                                        List<cvl> list62 = zulVar22.c;
                                        ArrayList arrayList22 = new ArrayList(v75.o(list62, 10));
                                        while (r2.hasNext()) {
                                        }
                                        yzlVar = new yzl(J22, k2, iabVar, a2, zulVar22, arrayList22);
                                    }
                                    obj3 = yzlVar;
                                }
                            }
                            o1uVar = null;
                            String str92 = cvlVar2.b;
                            String t2 = ouj.t(op7.c(cvlVar2).a);
                            String pathForSize22 = op7.a(cvlVar2).getPathForSize(frv.b());
                            pathForSize22.getClass();
                            if (ffVar != null) {
                            }
                            teVar = null;
                            iab iabVar2 = new iab(str92, str2, t2, pathForSize22, null, teVar, o1uVar, cvlVar2.d() ? "https://video-full-screen.s3.yandex.net/mne_nravitsa_vert_motion-2.mp4" : cvlVar2.t, cvlVar2.x);
                            if (z0mVar3 instanceof t0m) {
                            }
                            obj3 = yzlVar;
                        }
                    }
                    str2 = str3;
                    if (r1uVar != null) {
                        if (str4.length() <= 0) {
                        }
                        if (str5 != null) {
                        }
                    }
                    o1uVar = null;
                    String str922 = cvlVar2.b;
                    String t22 = ouj.t(op7.c(cvlVar2).a);
                    String pathForSize222 = op7.a(cvlVar2).getPathForSize(frv.b());
                    pathForSize222.getClass();
                    if (ffVar != null) {
                    }
                    teVar = null;
                    iab iabVar22 = new iab(str922, str2, t22, pathForSize222, null, teVar, o1uVar, cvlVar2.d() ? "https://video-full-screen.s3.yandex.net/mne_nravitsa_vert_motion-2.mp4" : cvlVar2.t, cvlVar2.x);
                    if (z0mVar3 instanceof t0m) {
                    }
                    obj3 = yzlVar;
                }
                xdrVar6.getClass();
                xdrVar6.m(null, obj3);
                break;
        }
        return Unit.a;
    }
}

package defpackage;

import android.content.Context;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.yandex.passport.internal.entities.j;
import com.yandex.passport.internal.flags.experiments.p;
import com.yandex.passport.sloth.ui.c;
import com.yandex.plus.bdui.flex.factory.e;
import com.yandex.plus.bdui.flex.ui.s;
import com.yandex.plus.core.analytics.logging.d;
import com.yandex.plus.home.analytics.diagnostic.webview.a;
import com.yandex.plus.home.feature.webviews.internal.accessibility.b;
import com.yandex.plus.home.feature.webviews.internal.stories.i;
import com.yandex.plus.home.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class ce5 implements bcj {
    public Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public Object m;
    public final Object n;
    public Object o;
    public Object p;

    public ce5(tf6 tf6Var, evj evjVar) {
        this.a = btf.b(new akl(tf6Var, 0));
        this.b = btf.b(new ufl(12));
        l18 l18Var = l18.b;
        this.c = l18Var.b(hag.I(ktb.class), true);
        bdt I = hag.I(ijl.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        this.d = new yfx((ijl) qdcVar.C(I));
        bdt I2 = hag.I(z66.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        this.e = (z66) qdcVar2.C(I2);
        n8g b = t75.b();
        b.add(new vjg(new nrf("LOCAL_PLAYER_MAIN_SETTINGS_BUTTONS", "LOCAL_PLAYER_MAIN_SETTINGS_BUTTONS"), null, null, null, null));
        if (!evjVar.a) {
            b.add(new vjg(new nrf("LOCAL_PLAYER_WAVE_BUTTON", "LOCAL_PLAYER_WAVE_BUTTON"), null, null, null, null));
        }
        this.f = t75.a(b);
        this.g = xz0.Y(new String[]{"LOCAL_PLAYER_MAIN_SETTINGS_BUTTONS", "PLAYER_SETTINGS_BUTTONS_MUSIC", "PLAYER_SETTINGS_BUTTONS_NON_MUSIC"});
        this.h = btf.b(new iik(12, evjVar, this));
        this.i = btf.b(new zjl(this, 12));
        int i = 13;
        this.j = btf.b(new ufl(i));
        this.k = new a2h();
        this.l = oo6.a;
        this.m = btf.b(new zjl(this, i));
        this.n = btf.b(new ufl(14));
        this.o = new ufl(15);
        this.p = btf.b(new zjl(this, 14));
    }

    @Override // defpackage.bcj
    public ydj a(mqs mqsVar, int i, u0s u0sVar, jab jabVar, thj thjVar, Context context, mm6 mm6Var, boolean z) {
        mqsVar.getClass();
        context.getClass();
        mm6Var.getClass();
        rmb a = ((tmb) this.g).a(jabVar, u0sVar);
        boolean d = z ? false : Intrinsics.d(((rbj) this.d).e, mqsVar.a);
        fdj fdjVar = (fdj) ((jyr) this.a).getValue();
        be5 be5Var = new be5(z, a, thjVar, this, i);
        fdjVar.getClass();
        return new ydj(fdjVar, mqsVar, d, mm6Var, context, be5Var, null);
    }

    public Integer b(String str) {
        str.getClass();
        List list = (List) ((xdr) this.f).getValue();
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.d(((rnq) it.next()).a().a().a, str)) {
                break;
            }
            i++;
        }
        Integer valueOf = Integer.valueOf(i);
        if (i != -1) {
            return valueOf;
        }
        return null;
    }

    public Integer c(String str) {
        str.getClass();
        List list = (List) ((xdr) this.f).getValue();
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.d(((rnq) it.next()).a().a().b, str)) {
                break;
            }
            i++;
        }
        Integer valueOf = Integer.valueOf(i);
        if (i != -1) {
            return valueOf;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0079, code lost:
    
        if (r7 != null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArrayList d() {
        knq a;
        ArrayList G = ((lum) this.m).G();
        ArrayList arrayList = new ArrayList(v75.o(G, 10));
        Iterator it = G.iterator();
        while (it.hasNext()) {
            arrayList.add(((s63) it.next()).a.a().a);
        }
        ssg.a(3, "SkeletonStateHolder", "Rebuild skeleton: blocks=" + arrayList, null);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = G.iterator();
        while (it2.hasNext()) {
            s63 s63Var = (s63) it2.next();
            drf drfVar = s63Var.a;
            String str = drfVar.a().a;
            HashMap hashMap = (HashMap) this.n;
            rnq rnqVar = (rnq) hashMap.get(str);
            if (rnqVar != null) {
                if (!Intrinsics.d(rnqVar.a(), drfVar)) {
                    rnqVar = null;
                }
            }
            nnq nnqVar = (nnq) this.c;
            nnqVar.getClass();
            prf a2 = nnqVar.a(drfVar.a().b);
            rnqVar = (a2 == null || (a = a2.a()) == null) ? null : a.b(s63Var);
            if (rnqVar != null) {
                hashMap.put(str, rnqVar);
                wmm o = p6g.o(rnqVar);
                if (o != null) {
                    o.k(new kzp(13, this));
                }
                ayd aydVar = rnqVar instanceof ayd ? (ayd) rnqVar : null;
                if (aydVar != null) {
                    Boolean bool = (Boolean) ((Map) this.o).get(str);
                    aydVar.b(bool != null ? bool.booleanValue() : false);
                }
            } else {
                rnqVar = null;
            }
            if (rnqVar != null) {
                arrayList2.add(rnqVar);
            }
        }
        return arrayList2;
    }

    public ktb e() {
        return (ktb) ((jyr) this.c).getValue();
    }

    public boolean f() {
        rnq rnqVar;
        List list = (List) ((xdr) this.e).getValue();
        return (list == null || (rnqVar = (rnq) CollectionsKt.S(list, 0)) == null || (!(rnqVar instanceof tqq) && !(rnqVar instanceof ge))) ? false : true;
    }

    public void g(u0s u0sVar, jab jabVar, thj thjVar) {
        ff ffVar = (ff) this.f;
        String str = ffVar != null ? ffVar.b : null;
        if (str == null || str.length() == 0) {
            oq oqVar = (oq) this.e;
            dfi.r(hrg.s("Acton button url for album ", oqVar.b, " with id = ", oqVar.a, " is null or empty."), "NonMusicScreenPresenter");
            return;
        }
        rmb.k(((tmb) this.g).a(jabVar, u0sVar), str, thjVar, null, 4);
        qbj qbjVar = (qbj) this.c;
        Boolean bool = ffVar.d;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        qbjVar.getClass();
        w1g.y((t) qbjVar.d.b, str, booleanValue);
    }

    public void h() {
        rmb.j((rmb) this.h, wjb.CoverScreen, (thj) this.p, null, 12);
        qbj qbjVar = (qbj) this.c;
        oq oqVar = (oq) this.e;
        qbjVar.getClass();
        oqVar.getClass();
        qbjVar.d.B(oqVar);
    }

    public void i(jab jabVar, u0s u0sVar) {
        rmb.j(((tmb) this.g).a(jabVar, u0sVar), wjb.SummaryScreen, (thj) this.p, null, 12);
        qbj qbjVar = (qbj) this.c;
        oq oqVar = (oq) this.e;
        qbjVar.getClass();
        oqVar.getClass();
        qbjVar.d.H(oqVar);
    }

    public void j() {
        sjb D = irf.D((laa) ((vdr) this.l).getValue());
        if (D != null) {
            rmb.a((rmb) this.h, D, null, null, 14);
        }
        ((icj) this.b).B(new r25(6, this));
    }

    public void k() {
        rmb.a((rmb) this.h, ((Boolean) ((vdr) this.j).getValue()).booleanValue() ? sjb.Unlike : sjb.Like, (thj) this.p, null, 10);
        ((icj) this.b).d();
    }

    public void l(u0s u0sVar, nab nabVar, oq oqVar, thj thjVar) {
        oqVar.getClass();
        rmb.j(((tmb) this.g).a(nabVar, u0sVar), wjb.AlbumScreen, thjVar, null, 12);
        qbj qbjVar = (qbj) this.c;
        qbjVar.getClass();
        t tVar = (t) qbjVar.d.b;
        tVar.startActivity(quj.T(tVar, oqVar, null));
    }

    public void m(u0s u0sVar, nab nabVar, oq oqVar, thj thjVar) {
        oqVar.getClass();
        rmb.j(((tmb) this.g).a(nabVar, u0sVar), wjb.BottomsheetScreen, thjVar, null, 12);
        qbj qbjVar = (qbj) this.c;
        qbjVar.getClass();
        lwg C = g0g.C(oqVar, null);
        y supportFragmentManager = qbjVar.a.getSupportFragmentManager();
        szf.R(supportFragmentManager, vz1.f(supportFragmentManager, C), qbjVar.b);
    }

    public void n(orf orfVar) {
        wmm o;
        wmm o2;
        HashMap hashMap = (HashMap) this.n;
        orfVar.getClass();
        this.a = orfVar;
        Set set = orfVar.b;
        Set set2 = orfVar.c;
        Iterator it = wop.h(set, set2).iterator();
        while (it.hasNext()) {
            rnq rnqVar = (rnq) hashMap.get((String) it.next());
            if (rnqVar != null && (o2 = p6g.o(rnqVar)) != null) {
                o2.l((cq4) this.b);
            }
        }
        Iterator it2 = wop.h(set2, set).iterator();
        while (it2.hasNext()) {
            rnq rnqVar2 = (rnq) hashMap.get((String) it2.next());
            if (rnqVar2 != null && (o = p6g.o(rnqVar2)) != null) {
                o.cancel();
            }
        }
    }

    public void o() {
        orf orfVar;
        wmm o;
        List list = (List) ((xdr) this.e).getValue();
        if (list == null || (orfVar = (orf) this.a) == null) {
            return;
        }
        ype it = orfVar.a.iterator();
        while (it.c) {
            rnq rnqVar = (rnq) CollectionsKt.S(list, it.nextInt());
            if (rnqVar != null && (o = p6g.o(rnqVar)) != null) {
                o.l((cq4) this.b);
            }
        }
    }

    public void p() {
        Iterator it = ((HashMap) this.n).entrySet().iterator();
        while (it.hasNext()) {
            wmm o = p6g.o((rnq) ((Map.Entry) it.next()).getValue());
            if (o != null) {
                o.h();
            }
        }
    }

    public void q(m2s m2sVar, int i) {
        ssg.a(3, "SkeletonStateHolder", "selectTab: index=" + i + " tabsBlock=" + m2sVar.a, null);
        lum lumVar = (lum) this.m;
        lumVar.getClass();
        ((HashMap) lumVar.c).put(m2sVar.a.a, new Pair(m2sVar, Integer.valueOf(i)));
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x021a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object r(cg6 cg6Var, String str, List list) {
        rqq rqqVar;
        int i;
        Integer num;
        Iterator it;
        rar rarVar;
        Iterator it2;
        v2s v2sVar;
        sd sdVar;
        vdr j;
        m2s a;
        Pair pair;
        xdr xdrVar = (xdr) this.g;
        if (cg6Var instanceof rqq) {
            rqqVar = (rqq) cg6Var;
            int i2 = rqqVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rqqVar.n = i2 - Integer.MIN_VALUE;
                Object obj = rqqVar.l;
                nm6 nm6Var = nm6.a;
                i = rqqVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    lum lumVar = (lum) this.m;
                    lumVar.getClass();
                    list.getClass();
                    lum lumVar2 = new lum((String) lumVar.a, list);
                    Collection<Pair> values = ((HashMap) lumVar.c).values();
                    values.getClass();
                    for (Pair pair2 : values) {
                        m2s m2sVar = (m2s) pair2.a;
                        int intValue = ((Number) pair2.b).intValue();
                        m2sVar.getClass();
                        ((HashMap) lumVar2.c).put(m2sVar.a.a, new Pair(m2sVar, Integer.valueOf(intValue)));
                    }
                    this.m = lumVar2;
                    rqqVar.j = list;
                    rqqVar.k = str;
                    rqqVar.n = 1;
                    obj = x97.V(dm6.b, new ya2(this, null), rqqVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = rqqVar.k;
                    list = rqqVar.j;
                    qgg.h0(obj);
                }
                Map map = (Map) obj;
                this.o = map;
                for (Map.Entry entry : map.entrySet()) {
                    rnq rnqVar = (rnq) ((HashMap) this.n).get(entry.getKey());
                    if (rnqVar != null) {
                        ayd aydVar = rnqVar instanceof ayd ? (ayd) rnqVar : null;
                        if (aydVar != null) {
                            aydVar.b(((Boolean) entry.getValue()).booleanValue());
                        }
                    }
                }
                int i3 = 0;
                if (str != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (obj2 instanceof m2s) {
                            arrayList.add(obj2);
                        }
                    }
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            pair = null;
                            break;
                        }
                        m2s m2sVar2 = (m2s) it3.next();
                        Iterator it4 = m2sVar2.c.iterator();
                        int i4 = 0;
                        while (true) {
                            if (!it4.hasNext()) {
                                i4 = -1;
                                break;
                            }
                            if (((r0s) it4.next()).a.equals(str)) {
                                break;
                            }
                            i4++;
                        }
                        Integer valueOf = Integer.valueOf(i4);
                        if (i4 == -1) {
                            valueOf = null;
                        }
                        pair = valueOf != null ? new Pair(m2sVar2, Integer.valueOf(valueOf.intValue())) : null;
                        if (pair != null) {
                            break;
                        }
                    }
                    if (pair != null) {
                        m2s m2sVar3 = (m2s) pair.a;
                        int intValue2 = ((Number) pair.b).intValue();
                        q(m2sVar3, intValue2);
                        num = Integer.valueOf(intValue2);
                        ArrayList d = d();
                        ArrayList arrayList2 = new ArrayList();
                        it = d.iterator();
                        int i5 = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                u75.n();
                                throw null;
                            }
                            rnq rnqVar2 = (rnq) next;
                            v2s v2sVar2 = rnqVar2 instanceof tqq ? new v2s((tqq) rnqVar2, i5) : null;
                            if (v2sVar2 != null) {
                                arrayList2.add(v2sVar2);
                            }
                            i5 = i6;
                        }
                        v2s v2sVar3 = (v2s) CollectionsKt.firstOrNull(arrayList2);
                        ssg.a(3, "SkeletonStateHolder", "attachBlockListeners: tabsBlock=" + ((v2sVar3 != null || (a = v2sVar3.a.a()) == null) ? null : a.a) + " position=" + (v2sVar3 != null ? Integer.valueOf(v2sVar3.b) : null), null);
                        xdrVar.l(v2sVar3);
                        rarVar = (rar) this.p;
                        if (rarVar != null) {
                            rarVar.g(null);
                        }
                        this.p = (v2sVar3 != null || (j = v2sVar3.a.j()) == null) ? null : ox6.B(zsd.d0(j, 1), (cq4) this.b, new jqp(9, this, v2sVar3));
                        ArrayList arrayList3 = new ArrayList();
                        it2 = d.iterator();
                        while (it2.hasNext()) {
                            Object next2 = it2.next();
                            int i7 = i3 + 1;
                            if (i3 < 0) {
                                u75.n();
                                throw null;
                            }
                            rnq rnqVar3 = (rnq) next2;
                            re reVar = rnqVar3 instanceof ge ? new re((ge) rnqVar3, i3) : null;
                            if (reVar != null) {
                                arrayList3.add(reVar);
                            }
                            i3 = i7;
                        }
                        re reVar2 = (re) CollectionsKt.firstOrNull(arrayList3);
                        ssg.a(3, "SkeletonStateHolder", "attachBlockListeners: actionBar=" + ((reVar2 != null || (sdVar = reVar2.a.c) == null) ? null : sdVar.c) + " position=" + (reVar2 != null ? Integer.valueOf(reVar2.b) : null), null);
                        ((xdr) this.i).l(reVar2);
                        xdr xdrVar2 = (xdr) this.e;
                        xdrVar2.getClass();
                        xdrVar2.m(null, d);
                        if (num != null && (v2sVar = (v2s) xdrVar.getValue()) != null) {
                            v2sVar.g(num.intValue());
                        }
                        return Unit.a;
                    }
                }
                num = null;
                ArrayList d2 = d();
                ArrayList arrayList22 = new ArrayList();
                it = d2.iterator();
                int i52 = 0;
                while (it.hasNext()) {
                }
                v2s v2sVar32 = (v2s) CollectionsKt.firstOrNull(arrayList22);
                if (v2sVar32 != null) {
                }
                if (v2sVar32 != null) {
                }
                ssg.a(3, "SkeletonStateHolder", "attachBlockListeners: tabsBlock=" + ((v2sVar32 != null || (a = v2sVar32.a.a()) == null) ? null : a.a) + " position=" + (v2sVar32 != null ? Integer.valueOf(v2sVar32.b) : null), null);
                xdrVar.l(v2sVar32);
                rarVar = (rar) this.p;
                if (rarVar != null) {
                }
                this.p = (v2sVar32 != null || (j = v2sVar32.a.j()) == null) ? null : ox6.B(zsd.d0(j, 1), (cq4) this.b, new jqp(9, this, v2sVar32));
                ArrayList arrayList32 = new ArrayList();
                it2 = d2.iterator();
                while (it2.hasNext()) {
                }
                re reVar22 = (re) CollectionsKt.firstOrNull(arrayList32);
                if (reVar22 != null) {
                }
                if (reVar22 != null) {
                }
                ssg.a(3, "SkeletonStateHolder", "attachBlockListeners: actionBar=" + ((reVar22 != null || (sdVar = reVar22.a.c) == null) ? null : sdVar.c) + " position=" + (reVar22 != null ? Integer.valueOf(reVar22.b) : null), null);
                ((xdr) this.i).l(reVar22);
                xdr xdrVar22 = (xdr) this.e;
                xdrVar22.getClass();
                xdrVar22.m(null, d2);
                if (num != null) {
                    v2sVar.g(num.intValue());
                }
                return Unit.a;
            }
        }
        rqqVar = new rqq(this, cg6Var);
        Object obj3 = rqqVar.l;
        nm6 nm6Var2 = nm6.a;
        i = rqqVar.n;
        if (i != 0) {
        }
        Map map2 = (Map) obj3;
        this.o = map2;
        while (r12.hasNext()) {
        }
        int i32 = 0;
        if (str != null) {
        }
        num = null;
        ArrayList d22 = d();
        ArrayList arrayList222 = new ArrayList();
        it = d22.iterator();
        int i522 = 0;
        while (it.hasNext()) {
        }
        v2s v2sVar322 = (v2s) CollectionsKt.firstOrNull(arrayList222);
        if (v2sVar322 != null) {
        }
        if (v2sVar322 != null) {
        }
        ssg.a(3, "SkeletonStateHolder", "attachBlockListeners: tabsBlock=" + ((v2sVar322 != null || (a = v2sVar322.a.a()) == null) ? null : a.a) + " position=" + (v2sVar322 != null ? Integer.valueOf(v2sVar322.b) : null), null);
        xdrVar.l(v2sVar322);
        rarVar = (rar) this.p;
        if (rarVar != null) {
        }
        this.p = (v2sVar322 != null || (j = v2sVar322.a.j()) == null) ? null : ox6.B(zsd.d0(j, 1), (cq4) this.b, new jqp(9, this, v2sVar322));
        ArrayList arrayList322 = new ArrayList();
        it2 = d22.iterator();
        while (it2.hasNext()) {
        }
        re reVar222 = (re) CollectionsKt.firstOrNull(arrayList322);
        if (reVar222 != null) {
        }
        if (reVar222 != null) {
        }
        ssg.a(3, "SkeletonStateHolder", "attachBlockListeners: actionBar=" + ((reVar222 != null || (sdVar = reVar222.a.c) == null) ? null : sdVar.c) + " position=" + (reVar222 != null ? Integer.valueOf(reVar222.b) : null), null);
        ((xdr) this.i).l(reVar222);
        xdr xdrVar222 = (xdr) this.e;
        xdrVar222.getClass();
        xdrVar222.m(null, d22);
        if (num != null) {
        }
        return Unit.a;
    }

    public ce5(Context context, s sVar, com.yandex.plus.home.feature.webviews.internal.uri.y yVar, com.yandex.plus.home.feature.webviews.internal.uri.y yVar2, b bVar, a aVar, i iVar, com.yandex.plus.resources.core.a aVar2, ci0 ci0Var, com.yandex.plus.home.feature.webviews.internalapi.analytics.a aVar3, kotlinx.coroutines.a aVar4, c cVar, com.yandex.plus.core.network.ssl.a aVar5, com.yandex.plus.home.api.webview.b bVar2, com.yandex.plus.home.feature.webviews.internalapi.animation.animator.a aVar6, d dVar) {
        aVar.getClass();
        aVar2.getClass();
        ci0Var.getClass();
        aVar3.getClass();
        aVar4.getClass();
        cVar.getClass();
        aVar6.getClass();
        dVar.getClass();
        this.b = context;
        this.c = sVar;
        this.d = yVar;
        this.e = yVar2;
        this.f = bVar;
        this.g = aVar;
        this.h = iVar;
        this.i = aVar2;
        this.j = ci0Var;
        this.k = aVar3;
        this.l = aVar4;
        this.m = cVar;
        this.n = aVar5;
        this.o = bVar2;
        this.a = aVar6;
        this.p = dVar;
    }

    public ce5(r rVar, p pVar, com.yandex.plus.home.internal.di.y yVar, com.yandex.plus.home.internal.di.y yVar2, e eVar, com.yandex.plus.home.dailyquests.plugin.internal.proxy.a aVar, com.yandex.plus.home.dailyquests.plugin.internal.proxy.d dVar, com.yandex.plus.home.plaque.feature.api.a aVar2, r rVar2, j jVar, com.yandex.plus.log.api.b bVar, tf6 tf6Var, com.yandex.plus.core.dispatcher.b bVar2) {
        pVar.getClass();
        jVar.getClass();
        bVar2.getClass();
        this.b = rVar;
        this.c = pVar;
        this.d = yVar;
        this.e = yVar2;
        this.f = eVar;
        this.g = aVar;
        this.h = dVar;
        this.i = aVar2;
        this.j = rVar2;
        this.k = jVar;
        this.l = bVar;
        this.m = tf6Var;
        this.n = bVar2;
        this.a = btf.b(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a(10, this));
        com.yandex.plus.home.plaque.feature.internal.a aVar3 = new com.yandex.plus.home.plaque.feature.internal.a(this);
        this.o = aVar3;
        com.yandex.plus.home.plaque.feature.internal.b bVar3 = new com.yandex.plus.home.plaque.feature.internal.b(this);
        this.p = bVar3;
        aVar2.a(aVar3);
        ((HashSet) rVar2.b).add(bVar3);
    }

    public ce5(String str, cq4 cq4Var, nnq nnqVar, l63 l63Var) {
        str.getClass();
        nnqVar.getClass();
        l63Var.getClass();
        this.b = cq4Var;
        this.c = nnqVar;
        this.d = l63Var;
        xdr a = ydr.a(null);
        this.e = a;
        this.f = a;
        xdr a2 = ydr.a(null);
        this.g = a2;
        this.h = a2;
        xdr a3 = ydr.a(null);
        this.i = a3;
        this.j = a3;
        x0q a4 = y0q.a(1, 1, oi3.c);
        this.k = a4;
        this.l = a4;
        this.m = new lum(str, c5b.a);
        this.n = new HashMap();
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        this.o = e5bVar;
    }

    public ce5(icj icjVar, qbj qbjVar, rbj rbjVar, oq oqVar, ff ffVar, tmb tmbVar, rmb rmbVar) {
        icjVar.getClass();
        qbjVar.getClass();
        oqVar.getClass();
        tmbVar.getClass();
        this.b = icjVar;
        this.c = qbjVar;
        this.d = rbjVar;
        this.e = oqVar;
        this.f = ffVar;
        this.g = tmbVar;
        this.h = rmbVar;
        this.i = icjVar.e();
        this.j = icjVar.c();
        this.k = icjVar.t();
        this.l = icjVar.o();
        this.m = icjVar.n();
        this.n = icjVar.h();
        this.o = icjVar.m();
        this.a = l18.b.b(hag.I(fdj.class), true);
        this.p = c3x.w(lxe.B(oqVar), 0, 0);
    }

    public ce5(final cr crVar, final ygh yghVar) {
        bwf bwfVar = bwf.c;
        this.b = btf.a(bwfVar, new e5o(23));
        this.c = btf.a(bwfVar, new qkp(0));
        final int i = 6;
        this.d = btf.a(bwfVar, new Function0(this, yghVar, crVar, i) { // from class: pkp
            public final /* synthetic */ int a;
            public final /* synthetic */ ce5 b;
            public final /* synthetic */ cr c;

            {
                this.a = i;
                this.b = this;
                this.c = crVar;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v12, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v15, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v18, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v21, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v25, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v28, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v32, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v35, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v38, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v44, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v47, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v5, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v8, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v1, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v4, types: [arf, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = this.a;
                cr crVar2 = this.c;
                ce5 ce5Var = this.b;
                switch (i2) {
                    case 0:
                        sb5 sb5Var = new sb5(0);
                        sb5Var.c((alp) ce5Var.f.getValue());
                        sb5Var.d = R.drawable.ic_seek_15_medium_24;
                        sb5Var.f = (String) crVar2.b.getValue();
                        sb5Var.h = true;
                        return sb5Var.a();
                    case 1:
                        sb5 sb5Var2 = new sb5(0);
                        sb5Var2.c((alp) ce5Var.h.getValue());
                        sb5Var2.d = R.drawable.ic_seek_30_medium_24;
                        sb5Var2.f = (String) crVar2.c.getValue();
                        sb5Var2.h = true;
                        return sb5Var2.a();
                    case 2:
                        sb5 sb5Var3 = new sb5(0);
                        sb5Var3.c((alp) ce5Var.j.getValue());
                        sb5Var3.d = R.drawable.ic_dislike_24;
                        sb5Var3.f = (String) crVar2.d.getValue();
                        sb5Var3.h = true;
                        return sb5Var3.a();
                    case 3:
                        sb5 sb5Var4 = new sb5(0);
                        sb5Var4.c((alp) ce5Var.l.getValue());
                        sb5Var4.d = R.drawable.ic_dislike_24;
                        sb5Var4.f = (String) crVar2.e.getValue();
                        sb5Var4.h = true;
                        return sb5Var4.a();
                    case 4:
                        sb5 sb5Var5 = new sb5(0);
                        sb5Var5.c((alp) ce5Var.n.getValue());
                        sb5Var5.d = R.drawable.ic_like_active_24;
                        sb5Var5.f = (String) crVar2.f.getValue();
                        sb5Var5.h = true;
                        return sb5Var5.a();
                    case 5:
                        sb5 sb5Var6 = new sb5(0);
                        sb5Var6.c((alp) ce5Var.a.getValue());
                        sb5Var6.d = R.drawable.ic_like_unactive_24;
                        sb5Var6.f = (String) crVar2.g.getValue();
                        sb5Var6.h = true;
                        return sb5Var6.a();
                    case 6:
                        sb5 sb5Var7 = new sb5(0);
                        sb5Var7.c((alp) ce5Var.b.getValue());
                        sb5Var7.d = R.drawable.ic_blank_24;
                        sb5Var7.f = (String) crVar2.h.getValue();
                        sb5Var7.h = true;
                        sb5Var7.i = new sde(Arrays.copyOf(new int[]{2}, 1));
                        return sb5Var7.a();
                    default:
                        sb5 sb5Var8 = new sb5(0);
                        sb5Var8.c((alp) ce5Var.c.getValue());
                        sb5Var8.d = R.drawable.ic_blank_24;
                        sb5Var8.f = (String) crVar2.i.getValue();
                        sb5Var8.h = true;
                        sb5Var8.i = new sde(Arrays.copyOf(new int[]{3}, 1));
                        return sb5Var8.a();
                }
            }
        });
        final int i2 = 7;
        this.e = btf.a(bwfVar, new Function0(this, yghVar, crVar, i2) { // from class: pkp
            public final /* synthetic */ int a;
            public final /* synthetic */ ce5 b;
            public final /* synthetic */ cr c;

            {
                this.a = i2;
                this.b = this;
                this.c = crVar;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v12, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v15, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v18, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v21, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v25, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v28, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v32, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v35, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v38, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v44, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v47, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v5, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v8, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v1, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v4, types: [arf, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = this.a;
                cr crVar2 = this.c;
                ce5 ce5Var = this.b;
                switch (i22) {
                    case 0:
                        sb5 sb5Var = new sb5(0);
                        sb5Var.c((alp) ce5Var.f.getValue());
                        sb5Var.d = R.drawable.ic_seek_15_medium_24;
                        sb5Var.f = (String) crVar2.b.getValue();
                        sb5Var.h = true;
                        return sb5Var.a();
                    case 1:
                        sb5 sb5Var2 = new sb5(0);
                        sb5Var2.c((alp) ce5Var.h.getValue());
                        sb5Var2.d = R.drawable.ic_seek_30_medium_24;
                        sb5Var2.f = (String) crVar2.c.getValue();
                        sb5Var2.h = true;
                        return sb5Var2.a();
                    case 2:
                        sb5 sb5Var3 = new sb5(0);
                        sb5Var3.c((alp) ce5Var.j.getValue());
                        sb5Var3.d = R.drawable.ic_dislike_24;
                        sb5Var3.f = (String) crVar2.d.getValue();
                        sb5Var3.h = true;
                        return sb5Var3.a();
                    case 3:
                        sb5 sb5Var4 = new sb5(0);
                        sb5Var4.c((alp) ce5Var.l.getValue());
                        sb5Var4.d = R.drawable.ic_dislike_24;
                        sb5Var4.f = (String) crVar2.e.getValue();
                        sb5Var4.h = true;
                        return sb5Var4.a();
                    case 4:
                        sb5 sb5Var5 = new sb5(0);
                        sb5Var5.c((alp) ce5Var.n.getValue());
                        sb5Var5.d = R.drawable.ic_like_active_24;
                        sb5Var5.f = (String) crVar2.f.getValue();
                        sb5Var5.h = true;
                        return sb5Var5.a();
                    case 5:
                        sb5 sb5Var6 = new sb5(0);
                        sb5Var6.c((alp) ce5Var.a.getValue());
                        sb5Var6.d = R.drawable.ic_like_unactive_24;
                        sb5Var6.f = (String) crVar2.g.getValue();
                        sb5Var6.h = true;
                        return sb5Var6.a();
                    case 6:
                        sb5 sb5Var7 = new sb5(0);
                        sb5Var7.c((alp) ce5Var.b.getValue());
                        sb5Var7.d = R.drawable.ic_blank_24;
                        sb5Var7.f = (String) crVar2.h.getValue();
                        sb5Var7.h = true;
                        sb5Var7.i = new sde(Arrays.copyOf(new int[]{2}, 1));
                        return sb5Var7.a();
                    default:
                        sb5 sb5Var8 = new sb5(0);
                        sb5Var8.c((alp) ce5Var.c.getValue());
                        sb5Var8.d = R.drawable.ic_blank_24;
                        sb5Var8.f = (String) crVar2.i.getValue();
                        sb5Var8.h = true;
                        sb5Var8.i = new sde(Arrays.copyOf(new int[]{3}, 1));
                        return sb5Var8.a();
                }
            }
        });
        this.f = btf.a(bwfVar, new e5o(24));
        final int i3 = 0;
        this.g = btf.a(bwfVar, new Function0(this, yghVar, crVar, i3) { // from class: pkp
            public final /* synthetic */ int a;
            public final /* synthetic */ ce5 b;
            public final /* synthetic */ cr c;

            {
                this.a = i3;
                this.b = this;
                this.c = crVar;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v12, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v15, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v18, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v21, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v25, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v28, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v32, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v35, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v38, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v44, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v47, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v5, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v8, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v1, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v4, types: [arf, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = this.a;
                cr crVar2 = this.c;
                ce5 ce5Var = this.b;
                switch (i22) {
                    case 0:
                        sb5 sb5Var = new sb5(0);
                        sb5Var.c((alp) ce5Var.f.getValue());
                        sb5Var.d = R.drawable.ic_seek_15_medium_24;
                        sb5Var.f = (String) crVar2.b.getValue();
                        sb5Var.h = true;
                        return sb5Var.a();
                    case 1:
                        sb5 sb5Var2 = new sb5(0);
                        sb5Var2.c((alp) ce5Var.h.getValue());
                        sb5Var2.d = R.drawable.ic_seek_30_medium_24;
                        sb5Var2.f = (String) crVar2.c.getValue();
                        sb5Var2.h = true;
                        return sb5Var2.a();
                    case 2:
                        sb5 sb5Var3 = new sb5(0);
                        sb5Var3.c((alp) ce5Var.j.getValue());
                        sb5Var3.d = R.drawable.ic_dislike_24;
                        sb5Var3.f = (String) crVar2.d.getValue();
                        sb5Var3.h = true;
                        return sb5Var3.a();
                    case 3:
                        sb5 sb5Var4 = new sb5(0);
                        sb5Var4.c((alp) ce5Var.l.getValue());
                        sb5Var4.d = R.drawable.ic_dislike_24;
                        sb5Var4.f = (String) crVar2.e.getValue();
                        sb5Var4.h = true;
                        return sb5Var4.a();
                    case 4:
                        sb5 sb5Var5 = new sb5(0);
                        sb5Var5.c((alp) ce5Var.n.getValue());
                        sb5Var5.d = R.drawable.ic_like_active_24;
                        sb5Var5.f = (String) crVar2.f.getValue();
                        sb5Var5.h = true;
                        return sb5Var5.a();
                    case 5:
                        sb5 sb5Var6 = new sb5(0);
                        sb5Var6.c((alp) ce5Var.a.getValue());
                        sb5Var6.d = R.drawable.ic_like_unactive_24;
                        sb5Var6.f = (String) crVar2.g.getValue();
                        sb5Var6.h = true;
                        return sb5Var6.a();
                    case 6:
                        sb5 sb5Var7 = new sb5(0);
                        sb5Var7.c((alp) ce5Var.b.getValue());
                        sb5Var7.d = R.drawable.ic_blank_24;
                        sb5Var7.f = (String) crVar2.h.getValue();
                        sb5Var7.h = true;
                        sb5Var7.i = new sde(Arrays.copyOf(new int[]{2}, 1));
                        return sb5Var7.a();
                    default:
                        sb5 sb5Var8 = new sb5(0);
                        sb5Var8.c((alp) ce5Var.c.getValue());
                        sb5Var8.d = R.drawable.ic_blank_24;
                        sb5Var8.f = (String) crVar2.i.getValue();
                        sb5Var8.h = true;
                        sb5Var8.i = new sde(Arrays.copyOf(new int[]{3}, 1));
                        return sb5Var8.a();
                }
            }
        });
        this.h = btf.a(bwfVar, new e5o(25));
        final int i4 = 1;
        this.i = btf.a(bwfVar, new Function0(this, yghVar, crVar, i4) { // from class: pkp
            public final /* synthetic */ int a;
            public final /* synthetic */ ce5 b;
            public final /* synthetic */ cr c;

            {
                this.a = i4;
                this.b = this;
                this.c = crVar;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v12, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v15, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v18, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v21, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v25, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v28, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v32, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v35, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v38, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v44, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v47, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v5, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v8, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v1, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v4, types: [arf, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = this.a;
                cr crVar2 = this.c;
                ce5 ce5Var = this.b;
                switch (i22) {
                    case 0:
                        sb5 sb5Var = new sb5(0);
                        sb5Var.c((alp) ce5Var.f.getValue());
                        sb5Var.d = R.drawable.ic_seek_15_medium_24;
                        sb5Var.f = (String) crVar2.b.getValue();
                        sb5Var.h = true;
                        return sb5Var.a();
                    case 1:
                        sb5 sb5Var2 = new sb5(0);
                        sb5Var2.c((alp) ce5Var.h.getValue());
                        sb5Var2.d = R.drawable.ic_seek_30_medium_24;
                        sb5Var2.f = (String) crVar2.c.getValue();
                        sb5Var2.h = true;
                        return sb5Var2.a();
                    case 2:
                        sb5 sb5Var3 = new sb5(0);
                        sb5Var3.c((alp) ce5Var.j.getValue());
                        sb5Var3.d = R.drawable.ic_dislike_24;
                        sb5Var3.f = (String) crVar2.d.getValue();
                        sb5Var3.h = true;
                        return sb5Var3.a();
                    case 3:
                        sb5 sb5Var4 = new sb5(0);
                        sb5Var4.c((alp) ce5Var.l.getValue());
                        sb5Var4.d = R.drawable.ic_dislike_24;
                        sb5Var4.f = (String) crVar2.e.getValue();
                        sb5Var4.h = true;
                        return sb5Var4.a();
                    case 4:
                        sb5 sb5Var5 = new sb5(0);
                        sb5Var5.c((alp) ce5Var.n.getValue());
                        sb5Var5.d = R.drawable.ic_like_active_24;
                        sb5Var5.f = (String) crVar2.f.getValue();
                        sb5Var5.h = true;
                        return sb5Var5.a();
                    case 5:
                        sb5 sb5Var6 = new sb5(0);
                        sb5Var6.c((alp) ce5Var.a.getValue());
                        sb5Var6.d = R.drawable.ic_like_unactive_24;
                        sb5Var6.f = (String) crVar2.g.getValue();
                        sb5Var6.h = true;
                        return sb5Var6.a();
                    case 6:
                        sb5 sb5Var7 = new sb5(0);
                        sb5Var7.c((alp) ce5Var.b.getValue());
                        sb5Var7.d = R.drawable.ic_blank_24;
                        sb5Var7.f = (String) crVar2.h.getValue();
                        sb5Var7.h = true;
                        sb5Var7.i = new sde(Arrays.copyOf(new int[]{2}, 1));
                        return sb5Var7.a();
                    default:
                        sb5 sb5Var8 = new sb5(0);
                        sb5Var8.c((alp) ce5Var.c.getValue());
                        sb5Var8.d = R.drawable.ic_blank_24;
                        sb5Var8.f = (String) crVar2.i.getValue();
                        sb5Var8.h = true;
                        sb5Var8.i = new sde(Arrays.copyOf(new int[]{3}, 1));
                        return sb5Var8.a();
                }
            }
        });
        this.j = btf.a(bwfVar, new e5o(26));
        final int i5 = 2;
        this.k = btf.a(bwfVar, new Function0(this, yghVar, crVar, i5) { // from class: pkp
            public final /* synthetic */ int a;
            public final /* synthetic */ ce5 b;
            public final /* synthetic */ cr c;

            {
                this.a = i5;
                this.b = this;
                this.c = crVar;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v12, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v15, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v18, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v21, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v25, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v28, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v32, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v35, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v38, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v44, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v47, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v5, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v8, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v1, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v4, types: [arf, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = this.a;
                cr crVar2 = this.c;
                ce5 ce5Var = this.b;
                switch (i22) {
                    case 0:
                        sb5 sb5Var = new sb5(0);
                        sb5Var.c((alp) ce5Var.f.getValue());
                        sb5Var.d = R.drawable.ic_seek_15_medium_24;
                        sb5Var.f = (String) crVar2.b.getValue();
                        sb5Var.h = true;
                        return sb5Var.a();
                    case 1:
                        sb5 sb5Var2 = new sb5(0);
                        sb5Var2.c((alp) ce5Var.h.getValue());
                        sb5Var2.d = R.drawable.ic_seek_30_medium_24;
                        sb5Var2.f = (String) crVar2.c.getValue();
                        sb5Var2.h = true;
                        return sb5Var2.a();
                    case 2:
                        sb5 sb5Var3 = new sb5(0);
                        sb5Var3.c((alp) ce5Var.j.getValue());
                        sb5Var3.d = R.drawable.ic_dislike_24;
                        sb5Var3.f = (String) crVar2.d.getValue();
                        sb5Var3.h = true;
                        return sb5Var3.a();
                    case 3:
                        sb5 sb5Var4 = new sb5(0);
                        sb5Var4.c((alp) ce5Var.l.getValue());
                        sb5Var4.d = R.drawable.ic_dislike_24;
                        sb5Var4.f = (String) crVar2.e.getValue();
                        sb5Var4.h = true;
                        return sb5Var4.a();
                    case 4:
                        sb5 sb5Var5 = new sb5(0);
                        sb5Var5.c((alp) ce5Var.n.getValue());
                        sb5Var5.d = R.drawable.ic_like_active_24;
                        sb5Var5.f = (String) crVar2.f.getValue();
                        sb5Var5.h = true;
                        return sb5Var5.a();
                    case 5:
                        sb5 sb5Var6 = new sb5(0);
                        sb5Var6.c((alp) ce5Var.a.getValue());
                        sb5Var6.d = R.drawable.ic_like_unactive_24;
                        sb5Var6.f = (String) crVar2.g.getValue();
                        sb5Var6.h = true;
                        return sb5Var6.a();
                    case 6:
                        sb5 sb5Var7 = new sb5(0);
                        sb5Var7.c((alp) ce5Var.b.getValue());
                        sb5Var7.d = R.drawable.ic_blank_24;
                        sb5Var7.f = (String) crVar2.h.getValue();
                        sb5Var7.h = true;
                        sb5Var7.i = new sde(Arrays.copyOf(new int[]{2}, 1));
                        return sb5Var7.a();
                    default:
                        sb5 sb5Var8 = new sb5(0);
                        sb5Var8.c((alp) ce5Var.c.getValue());
                        sb5Var8.d = R.drawable.ic_blank_24;
                        sb5Var8.f = (String) crVar2.i.getValue();
                        sb5Var8.h = true;
                        sb5Var8.i = new sde(Arrays.copyOf(new int[]{3}, 1));
                        return sb5Var8.a();
                }
            }
        });
        this.l = btf.a(bwfVar, new e5o(27));
        final int i6 = 3;
        this.m = btf.a(bwfVar, new Function0(this, yghVar, crVar, i6) { // from class: pkp
            public final /* synthetic */ int a;
            public final /* synthetic */ ce5 b;
            public final /* synthetic */ cr c;

            {
                this.a = i6;
                this.b = this;
                this.c = crVar;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v12, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v15, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v18, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v21, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v25, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v28, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v32, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v35, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v38, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v44, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v47, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v5, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v8, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v1, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v4, types: [arf, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = this.a;
                cr crVar2 = this.c;
                ce5 ce5Var = this.b;
                switch (i22) {
                    case 0:
                        sb5 sb5Var = new sb5(0);
                        sb5Var.c((alp) ce5Var.f.getValue());
                        sb5Var.d = R.drawable.ic_seek_15_medium_24;
                        sb5Var.f = (String) crVar2.b.getValue();
                        sb5Var.h = true;
                        return sb5Var.a();
                    case 1:
                        sb5 sb5Var2 = new sb5(0);
                        sb5Var2.c((alp) ce5Var.h.getValue());
                        sb5Var2.d = R.drawable.ic_seek_30_medium_24;
                        sb5Var2.f = (String) crVar2.c.getValue();
                        sb5Var2.h = true;
                        return sb5Var2.a();
                    case 2:
                        sb5 sb5Var3 = new sb5(0);
                        sb5Var3.c((alp) ce5Var.j.getValue());
                        sb5Var3.d = R.drawable.ic_dislike_24;
                        sb5Var3.f = (String) crVar2.d.getValue();
                        sb5Var3.h = true;
                        return sb5Var3.a();
                    case 3:
                        sb5 sb5Var4 = new sb5(0);
                        sb5Var4.c((alp) ce5Var.l.getValue());
                        sb5Var4.d = R.drawable.ic_dislike_24;
                        sb5Var4.f = (String) crVar2.e.getValue();
                        sb5Var4.h = true;
                        return sb5Var4.a();
                    case 4:
                        sb5 sb5Var5 = new sb5(0);
                        sb5Var5.c((alp) ce5Var.n.getValue());
                        sb5Var5.d = R.drawable.ic_like_active_24;
                        sb5Var5.f = (String) crVar2.f.getValue();
                        sb5Var5.h = true;
                        return sb5Var5.a();
                    case 5:
                        sb5 sb5Var6 = new sb5(0);
                        sb5Var6.c((alp) ce5Var.a.getValue());
                        sb5Var6.d = R.drawable.ic_like_unactive_24;
                        sb5Var6.f = (String) crVar2.g.getValue();
                        sb5Var6.h = true;
                        return sb5Var6.a();
                    case 6:
                        sb5 sb5Var7 = new sb5(0);
                        sb5Var7.c((alp) ce5Var.b.getValue());
                        sb5Var7.d = R.drawable.ic_blank_24;
                        sb5Var7.f = (String) crVar2.h.getValue();
                        sb5Var7.h = true;
                        sb5Var7.i = new sde(Arrays.copyOf(new int[]{2}, 1));
                        return sb5Var7.a();
                    default:
                        sb5 sb5Var8 = new sb5(0);
                        sb5Var8.c((alp) ce5Var.c.getValue());
                        sb5Var8.d = R.drawable.ic_blank_24;
                        sb5Var8.f = (String) crVar2.i.getValue();
                        sb5Var8.h = true;
                        sb5Var8.i = new sde(Arrays.copyOf(new int[]{3}, 1));
                        return sb5Var8.a();
                }
            }
        });
        this.n = btf.a(bwfVar, new e5o(28));
        final int i7 = 4;
        this.o = btf.a(bwfVar, new Function0(this, yghVar, crVar, i7) { // from class: pkp
            public final /* synthetic */ int a;
            public final /* synthetic */ ce5 b;
            public final /* synthetic */ cr c;

            {
                this.a = i7;
                this.b = this;
                this.c = crVar;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v12, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v15, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v18, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v21, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v25, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v28, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v32, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v35, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v38, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v44, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v47, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v5, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v8, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v1, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v4, types: [arf, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = this.a;
                cr crVar2 = this.c;
                ce5 ce5Var = this.b;
                switch (i22) {
                    case 0:
                        sb5 sb5Var = new sb5(0);
                        sb5Var.c((alp) ce5Var.f.getValue());
                        sb5Var.d = R.drawable.ic_seek_15_medium_24;
                        sb5Var.f = (String) crVar2.b.getValue();
                        sb5Var.h = true;
                        return sb5Var.a();
                    case 1:
                        sb5 sb5Var2 = new sb5(0);
                        sb5Var2.c((alp) ce5Var.h.getValue());
                        sb5Var2.d = R.drawable.ic_seek_30_medium_24;
                        sb5Var2.f = (String) crVar2.c.getValue();
                        sb5Var2.h = true;
                        return sb5Var2.a();
                    case 2:
                        sb5 sb5Var3 = new sb5(0);
                        sb5Var3.c((alp) ce5Var.j.getValue());
                        sb5Var3.d = R.drawable.ic_dislike_24;
                        sb5Var3.f = (String) crVar2.d.getValue();
                        sb5Var3.h = true;
                        return sb5Var3.a();
                    case 3:
                        sb5 sb5Var4 = new sb5(0);
                        sb5Var4.c((alp) ce5Var.l.getValue());
                        sb5Var4.d = R.drawable.ic_dislike_24;
                        sb5Var4.f = (String) crVar2.e.getValue();
                        sb5Var4.h = true;
                        return sb5Var4.a();
                    case 4:
                        sb5 sb5Var5 = new sb5(0);
                        sb5Var5.c((alp) ce5Var.n.getValue());
                        sb5Var5.d = R.drawable.ic_like_active_24;
                        sb5Var5.f = (String) crVar2.f.getValue();
                        sb5Var5.h = true;
                        return sb5Var5.a();
                    case 5:
                        sb5 sb5Var6 = new sb5(0);
                        sb5Var6.c((alp) ce5Var.a.getValue());
                        sb5Var6.d = R.drawable.ic_like_unactive_24;
                        sb5Var6.f = (String) crVar2.g.getValue();
                        sb5Var6.h = true;
                        return sb5Var6.a();
                    case 6:
                        sb5 sb5Var7 = new sb5(0);
                        sb5Var7.c((alp) ce5Var.b.getValue());
                        sb5Var7.d = R.drawable.ic_blank_24;
                        sb5Var7.f = (String) crVar2.h.getValue();
                        sb5Var7.h = true;
                        sb5Var7.i = new sde(Arrays.copyOf(new int[]{2}, 1));
                        return sb5Var7.a();
                    default:
                        sb5 sb5Var8 = new sb5(0);
                        sb5Var8.c((alp) ce5Var.c.getValue());
                        sb5Var8.d = R.drawable.ic_blank_24;
                        sb5Var8.f = (String) crVar2.i.getValue();
                        sb5Var8.h = true;
                        sb5Var8.i = new sde(Arrays.copyOf(new int[]{3}, 1));
                        return sb5Var8.a();
                }
            }
        });
        this.a = btf.a(bwfVar, new e5o(29));
        final int i8 = 5;
        this.p = btf.a(bwfVar, new Function0(this, yghVar, crVar, i8) { // from class: pkp
            public final /* synthetic */ int a;
            public final /* synthetic */ ce5 b;
            public final /* synthetic */ cr c;

            {
                this.a = i8;
                this.b = this;
                this.c = crVar;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v12, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v15, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v18, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v21, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v25, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v28, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v32, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v35, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v38, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v44, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v47, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v5, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v8, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v1, types: [arf, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v4, types: [arf, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = this.a;
                cr crVar2 = this.c;
                ce5 ce5Var = this.b;
                switch (i22) {
                    case 0:
                        sb5 sb5Var = new sb5(0);
                        sb5Var.c((alp) ce5Var.f.getValue());
                        sb5Var.d = R.drawable.ic_seek_15_medium_24;
                        sb5Var.f = (String) crVar2.b.getValue();
                        sb5Var.h = true;
                        return sb5Var.a();
                    case 1:
                        sb5 sb5Var2 = new sb5(0);
                        sb5Var2.c((alp) ce5Var.h.getValue());
                        sb5Var2.d = R.drawable.ic_seek_30_medium_24;
                        sb5Var2.f = (String) crVar2.c.getValue();
                        sb5Var2.h = true;
                        return sb5Var2.a();
                    case 2:
                        sb5 sb5Var3 = new sb5(0);
                        sb5Var3.c((alp) ce5Var.j.getValue());
                        sb5Var3.d = R.drawable.ic_dislike_24;
                        sb5Var3.f = (String) crVar2.d.getValue();
                        sb5Var3.h = true;
                        return sb5Var3.a();
                    case 3:
                        sb5 sb5Var4 = new sb5(0);
                        sb5Var4.c((alp) ce5Var.l.getValue());
                        sb5Var4.d = R.drawable.ic_dislike_24;
                        sb5Var4.f = (String) crVar2.e.getValue();
                        sb5Var4.h = true;
                        return sb5Var4.a();
                    case 4:
                        sb5 sb5Var5 = new sb5(0);
                        sb5Var5.c((alp) ce5Var.n.getValue());
                        sb5Var5.d = R.drawable.ic_like_active_24;
                        sb5Var5.f = (String) crVar2.f.getValue();
                        sb5Var5.h = true;
                        return sb5Var5.a();
                    case 5:
                        sb5 sb5Var6 = new sb5(0);
                        sb5Var6.c((alp) ce5Var.a.getValue());
                        sb5Var6.d = R.drawable.ic_like_unactive_24;
                        sb5Var6.f = (String) crVar2.g.getValue();
                        sb5Var6.h = true;
                        return sb5Var6.a();
                    case 6:
                        sb5 sb5Var7 = new sb5(0);
                        sb5Var7.c((alp) ce5Var.b.getValue());
                        sb5Var7.d = R.drawable.ic_blank_24;
                        sb5Var7.f = (String) crVar2.h.getValue();
                        sb5Var7.h = true;
                        sb5Var7.i = new sde(Arrays.copyOf(new int[]{2}, 1));
                        return sb5Var7.a();
                    default:
                        sb5 sb5Var8 = new sb5(0);
                        sb5Var8.c((alp) ce5Var.c.getValue());
                        sb5Var8.d = R.drawable.ic_blank_24;
                        sb5Var8.f = (String) crVar2.i.getValue();
                        sb5Var8.h = true;
                        sb5Var8.i = new sde(Arrays.copyOf(new int[]{3}, 1));
                        return sb5Var8.a();
                }
            }
        });
    }
}

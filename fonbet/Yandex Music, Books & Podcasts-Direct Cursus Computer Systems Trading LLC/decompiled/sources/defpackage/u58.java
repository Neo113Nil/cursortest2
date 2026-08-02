package defpackage;

import androidx.fragment.app.t;
import com.yandex.pulse.metrics.o;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.common.media.context.e;

/* loaded from: classes5.dex */
public final class u58 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u58(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(k98 k98Var, Continuation continuation) {
        m98 m98Var;
        int i;
        xdr xdrVar;
        l98 l98Var;
        xdr xdrVar2;
        n98 n98Var = (n98) this.b;
        xdr xdrVar3 = n98Var.m;
        if (continuation instanceof m98) {
            m98Var = (m98) continuation;
            int i2 = m98Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m98Var.m = i2 - Integer.MIN_VALUE;
                Object obj = m98Var.k;
                nm6 nm6Var = nm6.a;
                i = m98Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    List list = k98Var.b;
                    xdrVar2 = xdrVar3;
                    l98Var = k98Var;
                    if (list == null) {
                        if (xdrVar3.getValue() instanceof j98) {
                            xdrVar2 = xdrVar3;
                            l98Var = i98.a;
                        } else {
                            m98Var.j = xdrVar3;
                            m98Var.m = 1;
                            Object emit = n98Var.o.emit(j66.j0(), m98Var);
                            if (emit != nm6Var) {
                                emit = Unit.a;
                            }
                            if (emit == nm6Var) {
                                return nm6Var;
                            }
                            xdrVar = xdrVar3;
                        }
                    }
                    xdrVar2.l(l98Var);
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xdrVar = m98Var.j;
                qgg.h0(obj);
                l98 l98Var2 = (l98) xdrVar3.getValue();
                xdrVar2 = xdrVar;
                l98Var = l98Var2;
                xdrVar2.l(l98Var);
                return Unit.a;
            }
        }
        m98Var = new m98(this, continuation);
        Object obj2 = m98Var.k;
        nm6 nm6Var2 = nm6.a;
        i = m98Var.m;
        if (i != 0) {
        }
        l98 l98Var22 = (l98) xdrVar3.getValue();
        xdrVar2 = xdrVar;
        l98Var = l98Var22;
        xdrVar2.l(l98Var);
        return Unit.a;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        boolean isEmpty;
        int i = 0;
        Continuation continuation2 = null;
        switch (this.a) {
            case 0:
                bw1 bw1Var = (bw1) this.b;
                bw1Var.s(true);
                x97.y(hld.s((rjq) bw1Var.i, dm6.b()), null, null, new ja4(bw1Var, continuation2, 28), 3);
                return Unit.a;
            case 1:
                ((u6k) this.b).i(((Number) obj).intValue());
                return Unit.a;
            case 2:
                return b((k98) obj, continuation);
            case 3:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                vs8 vs8Var = ((bt8) this.b).m;
                if (booleanValue) {
                    vs8Var.a.a("DivCommunication.Fullscreen.DevicePortraitRequested", null);
                } else {
                    if (booleanValue) {
                        b6e.s();
                        return null;
                    }
                    vs8Var.a.a("DivCommunication.Fullscreen.DeviceLandscapeRequested", null);
                }
                return Unit.a;
            case 4:
                Object m = ((aaa) this.b).f.m(hld.j(), continuation);
                nm6 nm6Var = nm6.a;
                if (m != nm6Var) {
                    m = Unit.a;
                }
                return m == nm6Var ? m : Unit.a;
            case 5:
                Object m2 = ((cba) this.b).f.m(hld.j(), continuation);
                nm6 nm6Var2 = nm6.a;
                if (m2 != nm6Var2) {
                    m2 = Unit.a;
                }
                return m2 == nm6Var2 ? m2 : Unit.a;
            case 6:
                x66 x66Var = (x66) obj;
                if (!x66Var.a) {
                    cca ccaVar = (cca) this.b;
                    u0j u0jVar = x66Var.b;
                    String str = cca.k;
                    kij kijVar = (kij) ccaVar.e.getValue();
                    synchronized (kijVar) {
                        isEmpty = kijVar.a.isEmpty();
                    }
                    if (!isEmpty && u0jVar != u0j.a) {
                        yka ykaVar = ((xka) ((yka) ccaVar.a).j.getValue()).a;
                        hld.I(ykaVar.d, (z66) ykaVar.h.getValue());
                    }
                    ((taa) ((raa) ccaVar.d.getValue())).a();
                }
                return Unit.a;
            case 7:
                ((ida) this.b).k.l((mda) obj);
                return Unit.a;
            case 8:
                ((aea) this.b).l.l((dea) obj);
                return Unit.a;
            case 9:
                ((gha) this.b).k.l((kha) obj);
                return Unit.a;
            case 10:
                gia giaVar = (gia) obj;
                fja fjaVar = (fja) this.b;
                qxp qxpVar = fjaVar.d;
                jia jiaVar = giaVar.a;
                kia kiaVar = giaVar.b;
                qxpVar.getClass();
                jiaVar.getClass();
                kiaVar.getClass();
                n8g b = t75.b();
                List list = jiaVar.a;
                if (list != null) {
                    b.add(qxpVar.a(list, yia.a, kiaVar.b.a));
                }
                List list2 = jiaVar.b;
                if (list2 != null) {
                    b.add(qxpVar.a(list2, yia.b, kiaVar.c.a));
                }
                List list3 = jiaVar.c;
                if (list3 != null) {
                    b.add(qxpVar.a(list3, yia.c, kiaVar.d.a));
                }
                List list4 = jiaVar.d;
                if (list4 != null) {
                    b.add(qxpVar.a(list4, yia.d, kiaVar.e.a));
                }
                List list5 = jiaVar.e;
                if (list5 != null) {
                    b.add(qxpVar.a(list5, yia.e, kiaVar.f.a));
                }
                n8g a = t75.a(b);
                boolean isEmpty2 = a.isEmpty();
                xdr xdrVar = fjaVar.h;
                if (isEmpty2) {
                    zia ziaVar = zia.a;
                    xdrVar.getClass();
                    xdrVar.m(null, ziaVar);
                } else {
                    bja bjaVar = new bja(a);
                    xdrVar.getClass();
                    xdrVar.m(null, bjaVar);
                }
                kzp kzpVar = fjaVar.g;
                if (kzpVar != null) {
                    kzpVar.invoke(new d73(fjaVar.a));
                }
                fjaVar.e = true;
                rmb.h(fjaVar.b, a.b, 2);
                return Unit.a;
            case 11:
                wja wjaVar = (wja) obj;
                cka ckaVar = (cka) this.b;
                xdr xdrVar2 = ckaVar.j;
                rmb rmbVar = ckaVar.b;
                xdrVar2.l(wjaVar);
                kzp kzpVar2 = ckaVar.g;
                if (kzpVar2 != null) {
                    kzpVar2.invoke(new d73(ckaVar.a));
                }
                ckaVar.e = true;
                if (!(wjaVar instanceof sja)) {
                    if (wjaVar instanceof tja) {
                        rmb.h(rmbVar, ((tja) wjaVar).d.size(), 2);
                    } else {
                        if (!Intrinsics.d(wjaVar, vja.a)) {
                            b6e.s();
                            return null;
                        }
                        rmb.h(rmbVar, 0, 2);
                    }
                }
                return Unit.a;
            case 12:
                Pair pair = (Pair) obj;
                xxq xxqVar = (xxq) pair.a;
                boolean booleanValue2 = ((Boolean) pair.b).booleanValue();
                uju ujuVar = ((gka) this.b).c;
                String str2 = xxqVar.a;
                str2.getClass();
                ujuVar.b.c(new tju(ujuVar, str2, booleanValue2, i));
                return Unit.a;
            case 13:
                xdr xdrVar3 = ((vla) this.b).m;
                sla slaVar = new sla((List) obj);
                xdrVar3.getClass();
                xdrVar3.m(null, slaVar);
                return Unit.a;
            case 14:
                if (((Boolean) obj).booleanValue()) {
                    ((zwa) this.b).N();
                }
                return Unit.a;
            case 15:
                if (Intrinsics.d((vxa) obj, vxa.a)) {
                    ((nls) this.b).a.setValue(Boolean.FALSE);
                    return Unit.a;
                }
                b6e.s();
                return null;
            case 16:
                hxa hxaVar = (hxa) obj;
                sxa sxaVar = (sxa) this.b;
                if (hxaVar == null) {
                    b6e.s();
                    return null;
                }
                oxa oxaVar = sxaVar.b;
                String str3 = hxaVar.a;
                str3.getClass();
                w1g.y((t) oxaVar.b, str3, true);
                Object emit = sxaVar.d.emit(vxa.a, continuation);
                return emit == nm6.a ? emit : Unit.a;
            case 17:
                ((leb) this.b).k.l((keb) obj);
                return Unit.a;
            case 18:
                Object emit2 = ((j0q) this.b).emit(obj, continuation);
                return emit2 == nm6.a ? emit2 : Unit.a;
            case 19:
                ((ezb) this.b).c.l((yyb) obj);
                return Unit.a;
            case 20:
                Pair pair2 = (Pair) obj;
                boolean booleanValue3 = ((Boolean) pair2.a).booleanValue();
                boolean booleanValue4 = ((Boolean) pair2.b).booleanValue();
                k5r.v("onIsPlayingChanged for one of playbacks, isPlaying=", booleanValue3, 3, "ExternalMediaSignalsCenter", null);
                y1c y1cVar = (y1c) ((eps) this.b).f;
                if (y1cVar == null) {
                    return Unit.a;
                }
                Object d = y1cVar.d(booleanValue3, booleanValue4, continuation);
                return d == nm6.a ? d : Unit.a;
            case 21:
                ((ybc) this.b).k.l((List) obj);
                return Unit.a;
            case 22:
                ncc nccVar = (ncc) this.b;
                nccVar.d = null;
                nccVar.c = null;
                rar rarVar = nccVar.e;
                if (rarVar != null) {
                    rarVar.g(null);
                }
                nccVar.e = null;
                xdr xdrVar4 = nccVar.f;
                pcc pccVar = pcc.a;
                xdrVar4.getClass();
                xdrVar4.m(null, pccVar);
                return Unit.a;
            case 23:
                e73 e73Var = (e73) obj;
                kzp kzpVar3 = ((bnc) this.b).c;
                if (kzpVar3 != null) {
                    kzpVar3.invoke(e73Var);
                }
                e73Var.getClass();
                if (e73Var instanceof c73) {
                    ssg.a(3, ((bnc) this.b).m(), hrg.q("Block load error[", ((bnc) this.b).a().a().a, "]"), null);
                }
                ((bnc) this.b).a = false;
                return Unit.a;
            case 24:
                vat vatVar = (vat) obj;
                wxc wxcVar = (wxc) this.b;
                rhp rhpVar = wxcVar.e;
                yll yllVar = (yll) vatVar.a;
                boolean booleanValue5 = ((Boolean) vatVar.b).booleanValue();
                boolean booleanValue6 = ((Boolean) vatVar.c).booleanValue();
                if (!Intrinsics.d(yllVar, ull.a)) {
                    if (yllVar instanceof wll) {
                        if (!booleanValue5 || !booleanValue6 || ((wll) yllVar).a.f == r2h.TEXT) {
                            r2f b2 = rhpVar.b(wxc.f[0]);
                            if (b2 != null) {
                                b2.g(null);
                            }
                        } else if (!((Boolean) wxcVar.b.getValue()).booleanValue()) {
                            rhpVar.d(wxc.f[0], x97.y(wxcVar.a, null, null, new g68(wxcVar, continuation2, 23), 3));
                        }
                    } else {
                        if (!Intrinsics.d(yllVar, vll.a) && !Intrinsics.d(yllVar, xll.a)) {
                            b6e.s();
                            return null;
                        }
                        wxcVar.a(false);
                    }
                }
                return Unit.a;
            case 25:
                ((q0d) this.b).l();
                return Unit.a;
            case 26:
                ((w0d) this.b).f.invoke();
                return Unit.a;
            case 27:
                ned nedVar = (ned) obj;
                iz7 iz7Var = (iz7) this.b;
                if (!((odd) iz7Var.a).d().a) {
                    ((odd) iz7Var.a).g();
                }
                iz7.l(iz7Var, nedVar, new med[]{med.b});
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                vfd vfdVar = (vfd) this.b;
                dgd dgdVar = (dgd) obj;
                if (dgdVar instanceof bgd) {
                    ced cedVar = ((bgd) dgdVar).c;
                    vfdVar.c.d(new uid(e.e(cedVar.b), cedVar), false, uyk.d);
                    return Unit.a;
                }
                if (!(dgdVar instanceof cgd)) {
                    b6e.s();
                    return null;
                }
                cgd cgdVar = (cgd) dgdVar;
                Object a2 = vfd.a(vfdVar, cgdVar.d, cgdVar.e, cgdVar.f, cgdVar.g, cgdVar.h, continuation);
                return a2 == nm6.a ? a2 : Unit.a;
            default:
                Pair pair3 = (Pair) obj;
                sid sidVar = (sid) this.b;
                um6 um6Var = sidVar.e;
                j1g j1gVar = (j1g) pair3.a;
                m1q m1qVar = (m1q) pair3.b;
                if (!(m1qVar instanceof j1q)) {
                    return Unit.a;
                }
                int ordinal = j1gVar.ordinal();
                Continuation continuation3 = null;
                if (ordinal == 0) {
                    x97.y(um6Var, null, null, new akc(sidVar, e4d.LIKE, ((j1q) m1qVar).d.a, continuation3, 16), 3);
                } else if (ordinal != 1) {
                    if (ordinal != 2) {
                        b6e.s();
                        return null;
                    }
                    x97.y(um6Var, null, null, new akc(sidVar, e4d.DISLIKE, ((j1q) m1qVar).d.a, continuation3, 16), 3);
                }
                return Unit.a;
        }
    }
}

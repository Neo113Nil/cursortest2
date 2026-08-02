package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.gson.GsonBuilder;
import com.yandex.music.shared.wave.screen.wheel.data.dto.response.WheelItemDtoJsonDeserializer;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.common.media.context.e;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes4.dex */
public final /* synthetic */ class siv implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ siv(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int b;
        int b2;
        boolean z;
        boolean z2;
        mjv mjvVar;
        String str;
        int i = 0;
        int i2 = 1;
        switch (this.a) {
            case 0:
                ikv ikvVar = (ikv) obj;
                ikvVar.getClass();
                return ern.a(ikvVar.getClass());
            case 1:
                ekv ekvVar = (ekv) obj;
                ekvVar.getClass();
                if (ekvVar.equals(ckv.a)) {
                    return gkv.a;
                }
                if (!(ekvVar instanceof dkv)) {
                    b6e.s();
                    return null;
                }
                dkv dkvVar = (dkv) ekvVar;
                fhv fhvVar = dkvVar.a;
                List list = fhvVar.b;
                ArrayList arrayList = new ArrayList(v75.o(list, 10));
                int i3 = 0;
                for (Object obj2 : list) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        u75.n();
                        throw null;
                    }
                    bjv bjvVar = (bjv) obj2;
                    String str2 = fhvVar.a;
                    int size = fhvVar.b.size();
                    bjvVar.getClass();
                    c1 c1Var = new c1(str2, size, i3);
                    jjv a = bjvVar.a();
                    if (a instanceof fjv) {
                        z = ((fjv) a).a;
                        b2 = i;
                        z2 = b2;
                    } else {
                        if (Intrinsics.d(a, gjv.a)) {
                            b = p1g.D(bjvVar.b()).a;
                        } else if (Intrinsics.d(a, hjv.a)) {
                            b2 = bjvVar.b();
                            z = i;
                            z2 = 1;
                        } else {
                            if (!Intrinsics.d(a, ijv.a)) {
                                b6e.s();
                                return null;
                            }
                            b = bjvVar.b();
                        }
                        b2 = b;
                        int i5 = i;
                        z2 = i5 == true ? 1 : 0;
                        z = i5;
                    }
                    if (bjvVar instanceof xiv) {
                        xiv xivVar = (xiv) bjvVar;
                        String X = CollectionsKt.X(xivVar.e, ", ", null, null, new phs(6), 30);
                        lt ltVar = xivVar.d;
                        String str3 = ltVar.c;
                        u9b u9bVar = ltVar.e;
                        String o = ouj.o(X, " — ", str3);
                        String e = u9bVar != null ? u9bVar.e(wct.s(), WebPath$Storage.AVATARS) : null;
                        qo6 qo6Var = qo6.b;
                        Integer b0 = (u9bVar == null || (str = u9bVar.b) == null) ? null : y2x.b0(str);
                        jzb jzbVar = ltVar.g;
                        String str4 = xivVar.c;
                        n8g b3 = t75.b();
                        String str5 = xivVar.c;
                        if (str5 != null) {
                            b3.add(str5);
                        }
                        b3.add(o);
                        mjvVar = new mjv(new ljv(e, false, qo6Var, o, b2, b0, jzbVar, z, z2, str4, false, CollectionsKt.X(t75.a(b3), ", ", null, null, null, 62)), c1Var, xivVar);
                    } else if (bjvVar instanceof yiv) {
                        yiv yivVar = (yiv) bjvVar;
                        String str6 = yivVar.e;
                        u9b u9bVar2 = yivVar.h;
                        String e2 = u9bVar2.e(wct.s(), WebPath$Storage.AVATARS);
                        qo6 qo6Var2 = qo6.m;
                        String str7 = u9bVar2.b;
                        Integer b02 = str7 != null ? y2x.b0(str7) : null;
                        String str8 = yivVar.c;
                        n8g b4 = t75.b();
                        String str9 = yivVar.c;
                        if (str9 != null) {
                            b4.add(str9);
                        }
                        b4.add(str6);
                        mjvVar = new mjv(new ljv(e2, true, qo6Var2, str6, b2, b02, null, z, z2, str8, false, CollectionsKt.X(t75.a(b4), ", ", null, null, null, 62)), c1Var, yivVar);
                    } else if (bjvVar instanceof ajv) {
                        ajv ajvVar = (ajv) bjvVar;
                        hlu hluVar = ajvVar.d;
                        dou douVar = hluVar.a;
                        np npVar = hluVar.b;
                        op opVar = npVar.b;
                        String str10 = douVar.c;
                        String str11 = opVar.a;
                        WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS;
                        webPath$Storage.getClass();
                        String pathForSize = etn.B(str11, webPath$Storage).getPathForSize(wct.s());
                        qo6 Q = u1g.Q(npVar.c);
                        Integer b03 = y2x.b0(opVar.b);
                        String str12 = ajvVar.c;
                        boolean z3 = o8g.z(douVar.b);
                        n8g b5 = t75.b();
                        String str13 = ajvVar.c;
                        if (str13 != null) {
                            b5.add(str13);
                        }
                        b5.add(str10);
                        mjvVar = new mjv(new ljv(pathForSize, false, Q, str10, b2, b03, null, z, z2, str12, z3, CollectionsKt.X(t75.a(b5), ", ", null, null, null, 62)), c1Var, ajvVar);
                    } else {
                        if (!(bjvVar instanceof ziv)) {
                            b6e.s();
                            return null;
                        }
                        ziv zivVar = (ziv) bjvVar;
                        String str14 = zivVar.c;
                        u9b u9bVar3 = zivVar.d;
                        String e3 = u9bVar3 != null ? u9bVar3.e(wct.s(), WebPath$Storage.AVATARS) : null;
                        boolean z4 = z2;
                        qo6 qo6Var3 = qo6.m;
                        n8g b6 = t75.b();
                        b6.add(str14);
                        mjvVar = new mjv(new ljv(e3, false, qo6Var3, str14, 0, null, null, z, z4, null, false, CollectionsKt.X(t75.a(b6), ", ", null, null, null, 62)), c1Var, zivVar);
                    }
                    arrayList.add(mjvVar);
                    i3 = i4;
                    i = 0;
                }
                return new hkv(arrayList, dkvVar.b);
            case 2:
                GsonBuilder gsonBuilder = (GsonBuilder) obj;
                gsonBuilder.getClass();
                gsonBuilder.b(cjv.class, new WheelItemDtoJsonDeserializer());
                return Unit.a;
            case 3:
                kkh kkhVar = (kkh) obj;
                kkhVar.getClass();
                kkhVar.b();
                return Unit.a;
            case 4:
                kkh kkhVar2 = (kkh) obj;
                kkhVar2.getClass();
                kkhVar2.K();
                return Unit.a;
            case 5:
                kkh kkhVar3 = (kkh) obj;
                kkhVar3.getClass();
                rre rreVar = gx6.b;
                kkhVar3.k1(new alp(Bundle.EMPTY, "actionLike"));
                return Unit.a;
            case 6:
                kkh kkhVar4 = (kkh) obj;
                kkhVar4.getClass();
                rre rreVar2 = gx6.b;
                kkhVar4.k1(new alp(Bundle.EMPTY, "seekBackward"));
                return Unit.a;
            case 7:
                kkh kkhVar5 = (kkh) obj;
                kkhVar5.getClass();
                kkhVar5.b0();
                return Unit.a;
            case 8:
                kkh kkhVar6 = (kkh) obj;
                kkhVar6.getClass();
                kkhVar6.d();
                return Unit.a;
            case 9:
                kkh kkhVar7 = (kkh) obj;
                kkhVar7.getClass();
                rre rreVar3 = gx6.b;
                kkhVar7.k1(new alp(Bundle.EMPTY, "seekForward"));
                return Unit.a;
            case 10:
                kkh kkhVar8 = (kkh) obj;
                kkhVar8.getClass();
                rre rreVar4 = gx6.b;
                kkhVar8.k1(new alp(Bundle.EMPTY, "actionDislike"));
                return Unit.a;
            case 11:
                kkh kkhVar9 = (kkh) obj;
                kkhVar9.getClass();
                rre rreVar5 = gx6.b;
                kkhVar9.k1(new alp(Bundle.EMPTY, "actionUndoLike"));
                return Unit.a;
            case 12:
                kkh kkhVar10 = (kkh) obj;
                kkhVar10.getClass();
                rre rreVar6 = gx6.b;
                kkhVar10.k1(new alp(Bundle.EMPTY, "actionUndoDislike"));
                return Unit.a;
            case 13:
                ifp ifpVar = (ifp) obj;
                ifpVar.getClass();
                ngg.H(ifpVar, "unlike");
                return Unit.a;
            case 14:
                ifp ifpVar2 = (ifp) obj;
                ifpVar2.getClass();
                ngg.H(ifpVar2, "empty");
                return Unit.a;
            case 15:
                ifp ifpVar3 = (ifp) obj;
                ifpVar3.getClass();
                ngg.H(ifpVar3, "like");
                return Unit.a;
            case 16:
                ifp ifpVar4 = (ifp) obj;
                ifpVar4.getClass();
                ngg.H(ifpVar4, "play");
                return Unit.a;
            case 17:
                ifp ifpVar5 = (ifp) obj;
                ifpVar5.getClass();
                ngg.H(ifpVar5, "pause");
                return Unit.a;
            case 18:
                ifp ifpVar6 = (ifp) obj;
                ifpVar6.getClass();
                ngg.H(ifpVar6, "seek_backward");
                return Unit.a;
            case 19:
                ifp ifpVar7 = (ifp) obj;
                ifpVar7.getClass();
                ngg.H(ifpVar7, "seek_forward");
                return Unit.a;
            case 20:
                ifp ifpVar8 = (ifp) obj;
                ifpVar8.getClass();
                ngg.H(ifpVar8, "skip");
                return Unit.a;
            case 21:
                ifp ifpVar9 = (ifp) obj;
                ifpVar9.getClass();
                ngg.H(ifpVar9, "previous");
                return Unit.a;
            case 22:
                ifp ifpVar10 = (ifp) obj;
                ifpVar10.getClass();
                ngg.H(ifpVar10, "loading");
                return Unit.a;
            case 23:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, vnv.class).E(new siv(24));
                o18Var.b(hag.I(dnv.class)).D(new siv(25));
                o18Var.b(hag.I(cnv.class)).E(new siv(26));
                o18Var.b(hag.I(ukv.class)).E(new siv(27));
                o18Var.b(hag.I(gnv.class)).E(new siv(28));
                o18Var.b(hag.I(aov.class)).E(new siv(29));
                o18Var.b(hag.I(lmv.class)).D(new ulv(i));
                o18Var.b(hag.I(tmv.class)).E(new ulv(i2));
                return Unit.a;
            case 24:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new vnv((Context) l13Var.a.D(hag.I(Context.class), l13Var, l13Var.b), l13Var.b(hag.I(j14.class), true), l13Var.b(hag.I(s14.class), true), l13Var.b(hag.I(zcm.class), true), l13Var.b(hag.I(ch6.class), true), l13Var.b(hag.I(haj.class), true), l13Var.b(hag.I(mg5.class), true));
            case 25:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                return new dnv((Context) l13Var2.a.D(hag.I(Context.class), l13Var2, l13Var2.b));
            case 26:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                bdt I = hag.I(Context.class);
                qdc qdcVar = l13Var3.a;
                Set set = l13Var3.b;
                return new cnv((Context) qdcVar.D(I, l13Var3, set), (zfh) qdcVar.D(hag.I(zfh.class), l13Var3, set), l13Var3.b(hag.I(kbn.class), true));
            case 27:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                jyr b7 = l13Var4.b(hag.I(gnv.class), true);
                jyr b8 = l13Var4.b(hag.I(frt.class), true);
                jyr b9 = l13Var4.b(hag.I(dnv.class), true);
                jyr b10 = l13Var4.b(hag.I(knv.class), true);
                bdt I2 = hag.I(Context.class);
                qdc qdcVar2 = l13Var4.a;
                Set set2 = l13Var4.b;
                return new ukv((Context) qdcVar2.D(I2, l13Var4, set2), b8, b9, b7, b10, (cnv) qdcVar2.D(hag.I(cnv.class), l13Var4, set2));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                xdr a2 = ydr.a(null);
                jyr b11 = btf.b(new hav(3, a2, l13Var5));
                bdt I3 = hag.I(Context.class);
                qdc qdcVar3 = l13Var5.a;
                Set set3 = l13Var5.b;
                return new gnv(new k81((Context) qdcVar3.D(I3, l13Var5, set3), false), new kxi(((knv) qdcVar3.D(hag.I(knv.class), l13Var5, set3)).h, null), new q0v(8, a2), (g0l) qdcVar3.D(hag.I(g0l.class), l13Var5, set3), b11, l13Var5.b(hag.I(z5l.class), true), l13Var5.b(hag.I(e.class), true), l13Var5.b(hag.I(t35.class), true), l13Var5.b(hag.I(mg5.class), true));
            default:
                l13 l13Var6 = (l13) obj;
                l13Var6.getClass();
                return new aov((m9q) l13Var6.a.D(hag.I(m9q.class), l13Var6, l13Var6.b));
        }
    }
}

package defpackage;

import android.content.Context;
import com.appsflyer.internal.k;
import com.yandex.music.shared.player.download2.InternalDownloadException;
import com.yandex.music.shared.player.download2.balancer.RebalancedException;
import com.yandex.music.shared.player.download2.exo.ConnectivityCheckHttpDataSource$NetworkNotAllowedException;
import com.yandex.pulse.metrics.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes3.dex */
public final /* synthetic */ class xga implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ xga(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object kboVar;
        int i = 14;
        int i2 = 27;
        switch (this.a) {
            case 0:
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                cko D0 = xjoVar.D0("SELECT * FROM downloadedPlaylists ORDER BY downloadedTimestamp DESC");
                try {
                    int v = s7g.v(D0, "userUid");
                    int v2 = s7g.v(D0, "userLogin");
                    int v3 = s7g.v(D0, "userName");
                    int v4 = s7g.v(D0, "kind");
                    int v5 = s7g.v(D0, "downloadedTimestamp");
                    ArrayList arrayList = new ArrayList();
                    while (D0.q()) {
                        arrayList.add(new dga(D0.x0(v), D0.x0(v2), D0.isNull(v3) ? null : D0.x0(v3), D0.x0(v4), D0.getLong(v5)));
                    }
                    return arrayList;
                } finally {
                    D0.close();
                }
            case 1:
                List list = (List) obj;
                list.getClass();
                return y5g.A0(list, cyt.a);
            case 2:
                cja cjaVar = (cja) obj;
                cjaVar.getClass();
                return Boolean.valueOf(Intrinsics.d(cjaVar, zia.a));
            case 3:
                vuf vufVar = (vuf) obj;
                vufVar.getClass();
                vufVar.Z(4, null, vsf.v, xee.d);
                return Unit.a;
            case 4:
                wja wjaVar = (wja) obj;
                wjaVar.getClass();
                return Boolean.valueOf(Intrinsics.d(wjaVar, vja.a));
            case 5:
                ija ijaVar = (ija) obj;
                ijaVar.getClass();
                StringBuilder q = k.q("WHEN '", ijaVar.b, ijaVar.a, "' THEN '");
                q.append("'");
                return q.toString();
            case 6:
                InternalDownloadException internalDownloadException = (InternalDownloadException) obj;
                zao zaoVar = zao.c;
                zao zaoVar2 = zao.b;
                internalDownloadException.getClass();
                if (!(internalDownloadException instanceof tte) && !(internalDownloadException instanceof eue) && !(internalDownloadException instanceof yte)) {
                    if ((internalDownloadException instanceof wte) || (internalDownloadException instanceof cue) || (internalDownloadException instanceof due)) {
                        return new kbo(Long.MAX_VALUE, zaoVar);
                    }
                    if (internalDownloadException instanceof bue) {
                        return new fbo(true, zaoVar);
                    }
                    if (internalDownloadException instanceof xte) {
                        return new ibo(ern.a(xte.class), new dcb(i), (Pair[]) Arrays.copyOf(new Pair[]{new Pair(new IntRange(400, 599, 1), zaoVar2)}, 1), zaoVar);
                    }
                    if (internalDownloadException instanceof ute) {
                        return new dbo();
                    }
                    if (!(internalDownloadException instanceof qte) && !(internalDownloadException instanceof rte) && !(internalDownloadException instanceof vte) && !(internalDownloadException instanceof pte) && !(internalDownloadException instanceof ats) && !(internalDownloadException instanceof aue)) {
                        b6e.s();
                        return null;
                    }
                }
                return zaoVar2;
            case 7:
                IOException iOException = (IOException) obj;
                zao zaoVar3 = zao.a;
                zao zaoVar4 = zao.b;
                iOException.getClass();
                if (!(iOException instanceof RebalancedException)) {
                    if (iOException instanceof g6e) {
                        g6e g6eVar = (g6e) iOException;
                        if (!(g6eVar instanceof ConnectivityCheckHttpDataSource$NetworkNotAllowedException)) {
                            if (g6eVar instanceof i6e) {
                                return new ibo(ern.a(i6e.class), new xga(9), (Pair[]) Arrays.copyOf(new Pair[]{new Pair(new IntRange(400, 499, 1), zaoVar4), new Pair(new IntRange(500, 599, 1), new bbo(500, 1000, 2000, 4000, 8000))}, 2), zaoVar4);
                            }
                            kboVar = new kbo(60000L, new bbo(500, 1000, 2000, 4000, 8000));
                            return kboVar;
                        }
                    }
                    return zaoVar4;
                }
                IOException iOException2 = ((RebalancedException) iOException).a;
                if (!(iOException2 instanceof g6e)) {
                    return zaoVar3;
                }
                g6e g6eVar2 = (g6e) iOException2;
                if (!(g6eVar2 instanceof ConnectivityCheckHttpDataSource$NetworkNotAllowedException)) {
                    if (g6eVar2 instanceof i6e) {
                        kboVar = new ibo(ern.a(RebalancedException.class), new oka(0, iOException2), (Pair[]) Arrays.copyOf(new Pair[]{new Pair(new IntRange(400, 499, 1), zaoVar4), new Pair(new IntRange(500, 599, 1), zaoVar3)}, 2), zaoVar4);
                    } else {
                        kboVar = new kbo(60000L, zaoVar3);
                    }
                    return kboVar;
                }
                return zaoVar4;
            case 8:
                ((IOException) obj).getClass();
                return new bbo(100, 500, 1000);
            case 9:
                i6e i6eVar = (i6e) obj;
                i6eVar.getClass();
                return Integer.valueOf(i6eVar.d);
            case 10:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, ela.class).E(new xga(20));
                o18Var.b(hag.I(wka.class)).E(new xga(11));
                o18Var.b(hag.I(s62.class)).E(new xga(12));
                o18Var.b(hag.I(jur.class)).E(new xga(13));
                o18Var.b(hag.I(xba.class)).E(new xga(i));
                o18Var.b(hag.I(crt.class)).E(new xga(15));
                o18Var.b(hag.I(vka.class)).E(new xga(16));
                o18Var.b(hag.I(pi4.class)).E(new xga(17));
                o18Var.b(hag.I(e6q.class)).E(new xga(18));
                o18Var.b(hag.I(uaa.class)).E(new xga(19));
                o18Var.b(hag.I(kij.class)).E(new xga(21));
                o18Var.b(hag.I(raa.class)).E(new xga(22));
                o18Var.b(hag.I(taa.class)).D(new xga(23));
                o18Var.b(hag.I(aaa.class)).E(new xga(24));
                o18Var.b(hag.I(cba.class)).E(new xga(25));
                o18Var.b(hag.I(wca.class)).E(new xga(26));
                o18Var.b(hag.I(sga.class)).E(new xga(i2));
                o18Var.b(hag.I(wyq.class)).E(new xga(28));
                return Unit.a;
            case 11:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                bdt I = hag.I(uws.class);
                qdc qdcVar = l13Var.a;
                Set set = l13Var.b;
                return new yka((uws) qdcVar.D(I, l13Var, set), ((oq7) qdcVar.D(hag.I(oq7.class), l13Var, set)).a, (y5q) qdcVar.D(hag.I(y5q.class), l13Var, set), (Context) qdcVar.D(hag.I(Context.class), l13Var, set), l13Var.b(hag.I(z66.class), true), (j6q) qdcVar.D(hag.I(j6q.class), l13Var, set), (frt) qdcVar.D(hag.I(frt.class), l13Var, set), (i5h) qdcVar.D(hag.I(i5h.class), l13Var, set), (cc7) qdcVar.D(hag.I(cc7.class), l13Var, set), l13Var.b(hag.I(lwc.class), true));
            case 12:
                ((l13) obj).getClass();
                return new s62();
            case 13:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                return new jur((q3t) l13Var2.a.D(hag.I(q3t.class), l13Var2, l13Var2.b));
            case 14:
                ((l13) obj).getClass();
                l18 l18Var = l18.b;
                bdt I2 = hag.I(vka.class);
                qdc qdcVar2 = l18Var.a;
                qdcVar2.getClass();
                return (xba) ((vka) qdcVar2.C(I2)).l.getValue();
            case 15:
                ((l13) obj).getClass();
                l18 l18Var2 = l18.b;
                bdt I3 = hag.I(vka.class);
                qdc qdcVar3 = l18Var2.a;
                qdcVar3.getClass();
                return (crt) ((vka) qdcVar3.C(I3)).q.getValue();
            case 16:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                bdt I4 = hag.I(jur.class);
                qdc qdcVar4 = l13Var3.a;
                Set set2 = l13Var3.b;
                return new vka((jur) qdcVar4.D(I4, l13Var3, set2), (sca) qdcVar4.D(hag.I(sca.class), l13Var3, set2), (oga) qdcVar4.D(hag.I(oga.class), l13Var3, set2), (wka) qdcVar4.D(hag.I(wka.class), l13Var3, set2), (s62) qdcVar4.D(hag.I(s62.class), l13Var3, set2), (hvs) qdcVar4.D(hag.I(hvs.class), l13Var3, set2), (cur) qdcVar4.D(hag.I(cur.class), l13Var3, set2));
            case 17:
                ((l13) obj).getClass();
                l18 l18Var3 = l18.b;
                bdt I5 = hag.I(vka.class);
                qdc qdcVar5 = l18Var3.a;
                qdcVar5.getClass();
                return (pi4) ((vka) qdcVar5.C(I5)).p.getValue();
            case 18:
                ((l13) obj).getClass();
                l18 l18Var4 = l18.b;
                bdt I6 = hag.I(vka.class);
                qdc qdcVar6 = l18Var4.a;
                qdcVar6.getClass();
                return (e6q) ((vka) qdcVar6.C(I6)).d.getValue();
            case 19:
                ((l13) obj).getClass();
                return (uaa) l18.b.c(hag.I(e6q.class));
            case 20:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                return new ela(l13Var4.b(hag.I(vka.class), true));
            case 21:
                ((l13) obj).getClass();
                l18 l18Var5 = l18.b;
                bdt I7 = hag.I(vka.class);
                qdc qdcVar7 = l18Var5.a;
                qdcVar7.getClass();
                return (kij) ((vka) qdcVar7.C(I7)).c.getValue();
            case 22:
                ((l13) obj).getClass();
                l18 l18Var6 = l18.b;
                bdt I8 = hag.I(vka.class);
                qdc qdcVar8 = l18Var6.a;
                qdcVar8.getClass();
                return (raa) ((vka) qdcVar8.C(I8)).k.getValue();
            case 23:
                ((l13) obj).getClass();
                l18 l18Var7 = l18.b;
                bdt I9 = hag.I(vka.class);
                qdc qdcVar9 = l18Var7.a;
                qdcVar9.getClass();
                return (taa) ((vka) qdcVar9.C(I9)).k.getValue();
            case 24:
                ((l13) obj).getClass();
                l18 l18Var8 = l18.b;
                bdt I10 = hag.I(vka.class);
                qdc qdcVar10 = l18Var8.a;
                qdcVar10.getClass();
                return (aaa) ((vka) qdcVar10.C(I10)).i.getValue();
            case 25:
                ((l13) obj).getClass();
                l18 l18Var9 = l18.b;
                bdt I11 = hag.I(vka.class);
                qdc qdcVar11 = l18Var9.a;
                qdcVar11.getClass();
                return (cba) ((vka) qdcVar11.C(I11)).j.getValue();
            case 26:
                ((l13) obj).getClass();
                l18 l18Var10 = l18.b;
                bdt I12 = hag.I(vka.class);
                qdc qdcVar12 = l18Var10.a;
                qdcVar12.getClass();
                return (wca) ((vka) qdcVar12.C(I12)).g.getValue();
            case 27:
                ((l13) obj).getClass();
                l18 l18Var11 = l18.b;
                bdt I13 = hag.I(vka.class);
                qdc qdcVar13 = l18Var11.a;
                qdcVar13.getClass();
                return (sga) ((vka) qdcVar13.C(I13)).h.getValue();
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                qne qneVar = new qne();
                qneVar.b = l13Var5;
                qneVar.a = btf.b(new bv7(i2));
                return new wyq(qneVar);
            default:
                zco zcoVar = (zco) obj;
                zcoVar.getClass();
                float f = 2;
                zcoVar.x((nmq.b(zcoVar.p) / f) + ((-nmq.d(zcoVar.p)) / f));
                zcoVar.j(-90.0f);
                return Unit.a;
        }
    }
}

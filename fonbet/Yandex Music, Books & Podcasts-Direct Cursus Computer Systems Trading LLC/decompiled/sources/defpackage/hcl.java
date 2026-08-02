package defpackage;

import android.content.Context;
import com.google.gson.GsonBuilder;
import com.yandex.music.shared.player.download2.GetFileInfoException;
import com.yandex.music.shared.player.download2.InternalDownloadException;
import com.yandex.music.shared.player.download2.balancer.RebalancedException;
import com.yandex.music.shared.player.download2.exo.ConnectivityCheckHttpDataSource$NetworkNotAllowedException;
import com.yandex.music.shared.player.informer.data.network.PlayerInformersItemDto;
import com.yandex.music.shared.player.informer.data.network.PlayerInformersItemDtoJsonAdapter;
import com.yandex.pulse.metrics.o;
import java.io.IOException;
import java.util.Arrays;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* loaded from: classes6.dex */
public final /* synthetic */ class hcl implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ hcl(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        mqs mqsVar;
        x85 f;
        String str;
        Object kboVar;
        int i = 22;
        int i2 = 21;
        int i3 = 1;
        switch (this.a) {
            case 0:
                ((l13) obj).getClass();
                return new kmd();
            case 1:
                ((l13) obj).getClass();
                msa msaVar = nsa.b;
                return new uhs(yd5.M(30, ssa.MINUTES));
            case 2:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new ktb(l13Var.b(hag.I(dy7.class), true), l13Var.b(hag.I(e0j.class), true), l13Var.b(hag.I(oq7.class), true));
            case 3:
                ((l13) obj).getClass();
                return new icl();
            case 4:
                ((l13) obj).getClass();
                return new ijl();
            case 5:
                ((l13) obj).getClass();
                return new jcl();
            case 6:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                jyr b = l13Var2.b(hag.I(z1h.class), true);
                jyr b2 = l13Var2.b(hag.I(t8q.class), true);
                gs4 gs4Var = new gs4();
                gs4Var.a = b;
                gs4Var.b = b2;
                gs4Var.c = okb.Phone;
                gs4Var.d = btf.b(new ufl(8));
                gs4Var.e = btf.b(new ril(i3, gs4Var));
                return new uil(gs4Var);
            case 7:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                return new lll(new u12(l13Var3));
            case 8:
                jfl jflVar = (jfl) obj;
                jflVar.getClass();
                hfl hflVar = jflVar instanceof hfl ? (hfl) jflVar : null;
                if (hflVar == null || (mqsVar = hflVar.a) == null || (f = mqsVar.f()) == null || (str = f.a) == null) {
                    return null;
                }
                return y2x.b0(str);
            case 9:
                GsonBuilder gsonBuilder = (GsonBuilder) obj;
                gsonBuilder.getClass();
                gsonBuilder.b(PlayerInformersItemDto.class, new PlayerInformersItemDtoJsonAdapter());
                return Unit.a;
            case 10:
                drc drcVar = (drc) obj;
                drcVar.getClass();
                return Boolean.valueOf(drcVar.a);
            case 11:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                return new cur((q3t) l13Var4.a.D(hag.I(q3t.class), l13Var4, l13Var4.b));
            case 12:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                return (mzs) ((u5q) l13Var5.a.D(hag.I(u5q.class), l13Var5, l13Var5.b)).d.getValue();
            case 13:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, cur.class).E(new hcl(11));
                o18Var.b(hag.I(hvs.class)).E(new hcl(15));
                o18Var.b(hag.I(m0t.class)).E(new hcl(16));
                o18Var.b(hag.I(vv1.class)).E(new hcl(17));
                o18Var.b(hag.I(uhr.class)).E(new hcl(18));
                o18Var.b(hag.I(u5q.class)).E(new hcl(19));
                o18Var.b(hag.I(q3t.class)).E(new hcl(20));
                o18Var.b(hag.I(j6q.class)).E(new hcl(i2));
                o18Var.b(hag.I(bal.class)).E(new hcl(i));
                o18Var.b(hag.I(mzs.class)).E(new hcl(12));
                o18Var.b(hag.I(djm.class)).E(new hcl(14));
                return Unit.a;
            case 14:
                l13 l13Var6 = (l13) obj;
                l13Var6.getClass();
                ((u5q) l13Var6.a.D(hag.I(u5q.class), l13Var6, l13Var6.b)).b().s.getClass();
                mej mejVar = new mej();
                c5b.a.getClass();
                ydr.a(new cuk());
                return mejVar;
            case 15:
                l13 l13Var7 = (l13) obj;
                l13Var7.getClass();
                return (hvs) ((u5q) l13Var7.a.D(hag.I(u5q.class), l13Var7, l13Var7.b)).g.getValue();
            case 16:
                l13 l13Var8 = (l13) obj;
                l13Var8.getClass();
                return new m0t();
            case 17:
                l13 l13Var9 = (l13) obj;
                l13Var9.getClass();
                return new vv1((nv1) l13Var9.a.D(hag.I(nv1.class), l13Var9, l13Var9.b));
            case 18:
                l13 l13Var10 = (l13) obj;
                l13Var10.getClass();
                bdt I = hag.I(gni.class);
                qdc qdcVar = l13Var10.a;
                Set set = l13Var10.b;
                vhr vhrVar = (vhr) ((faw) ((gni) qdcVar.D(I, l13Var10, set))).T.getValue();
                return vhrVar == null ? new whr((Context) qdcVar.D(hag.I(Context.class), l13Var10, set), new c76(l13Var10.b(hag.I(frt.class), true), 22)) : vhrVar;
            case 19:
                l13 l13Var11 = (l13) obj;
                l13Var11.getClass();
                bdt I2 = hag.I(fni.class);
                qdc qdcVar2 = l13Var11.a;
                Set set2 = l13Var11.b;
                return new u5q((Context) qdcVar2.D(hag.I(Context.class), l13Var11, set2), new pre((fni) qdcVar2.D(I2, l13Var11, set2), (gni) qdcVar2.D(hag.I(gni.class), l13Var11, set2), (frt) qdcVar2.D(hag.I(frt.class), l13Var11, set2), (z66) qdcVar2.D(hag.I(z66.class), l13Var11, set2), (i0j) qdcVar2.D(hag.I(i0j.class), l13Var11, set2), (uhr) qdcVar2.D(hag.I(uhr.class), l13Var11, set2), (udp) qdcVar2.D(hag.I(udp.class), l13Var11, set2), (vv1) qdcVar2.D(hag.I(vv1.class), l13Var11, set2), (o3t) qdcVar2.D(hag.I(o3t.class), l13Var11, set2), (w62) qdcVar2.D(hag.I(w62.class), l13Var11, set2), l13Var11.b(hag.I(bal.class), true), (v9w) qdcVar2.D(hag.I(v9w.class), l13Var11, set2), (it0) qdcVar2.D(hag.I(it0.class), l13Var11, set2), btf.b(new c76(l13Var11.b(hag.I(oq7.class), true), 21)), l13Var11.b(hag.I(q7l.class), true), l13Var11.b(hag.I(k1l.class), true), l13Var11.b(hag.I(k1l.class), true), (qqs) qdcVar2.D(hag.I(qqs.class), l13Var11, set2), new o(l13Var11.b(hag.I(vfb.class), true))));
            case 20:
                l13 l13Var12 = (l13) obj;
                l13Var12.getClass();
                return (q3t) ((u5q) l13Var12.a.D(hag.I(u5q.class), l13Var12, l13Var12.b)).f.getValue();
            case 21:
                l13 l13Var13 = (l13) obj;
                l13Var13.getClass();
                return (j6q) ((u5q) l13Var13.a.D(hag.I(u5q.class), l13Var13, l13Var13.b)).e.getValue();
            case 22:
                l13 l13Var14 = (l13) obj;
                l13Var14.getClass();
                bdt I3 = hag.I(gni.class);
                qdc qdcVar3 = l13Var14.a;
                Set set3 = l13Var14.b;
                y5q y5qVar = (y5q) ((faw) ((gni) qdcVar3.D(I3, l13Var14, set3))).U.getValue();
                return y5qVar == null ? new z5q((q3t) qdcVar3.D(hag.I(q3t.class), l13Var14, set3)) : y5qVar;
            case 23:
                ((InternalDownloadException) obj).getClass();
                return zao.b;
            case 24:
                GetFileInfoException getFileInfoException = (GetFileInfoException) obj;
                getFileInfoException.getClass();
                if ((getFileInfoException instanceof o8d) || (getFileInfoException instanceof p8d) || (getFileInfoException instanceof q8d)) {
                    return zao.b;
                }
                if (getFileInfoException instanceof n8d) {
                    return new kbo(10000L, new bbo(500, 5000, 10000));
                }
                b6e.s();
                return null;
            case 25:
                IOException iOException = (IOException) obj;
                zao zaoVar = zao.a;
                zao zaoVar2 = zao.b;
                iOException.getClass();
                if (iOException instanceof RebalancedException) {
                    IOException iOException2 = ((RebalancedException) iOException).a;
                    if (!(iOException2 instanceof g6e)) {
                        return zaoVar;
                    }
                    g6e g6eVar = (g6e) iOException2;
                    if (!(g6eVar instanceof ConnectivityCheckHttpDataSource$NetworkNotAllowedException)) {
                        kboVar = g6eVar instanceof i6e ? new ibo(ern.a(RebalancedException.class), new oka(1, iOException2), (Pair[]) Arrays.copyOf(new Pair[]{new Pair(new IntRange(400, 499, 1), zaoVar2), new Pair(new IntRange(500, 599, 1), zaoVar)}, 2), zaoVar2) : new kbo(60000L, jbo.b, zaoVar);
                        return kboVar;
                    }
                    return zaoVar2;
                }
                if (iOException instanceof g6e) {
                    g6e g6eVar2 = (g6e) iOException;
                    if (!(g6eVar2 instanceof ConnectivityCheckHttpDataSource$NetworkNotAllowedException)) {
                        if (g6eVar2 instanceof i6e) {
                            return new ibo(ern.a(i6e.class), new hcl(27), (Pair[]) Arrays.copyOf(new Pair[]{new Pair(new IntRange(400, 499, 1), zaoVar2), new Pair(new IntRange(500, 599, 1), new bbo(500, 1000, 2000, 4000, 8000))}, 2), zaoVar2);
                        }
                        kboVar = new kbo(60000L, jbo.b, new bbo(500, 1000, 2000, 4000, 8000));
                        return kboVar;
                    }
                }
                return zaoVar2;
            case 26:
                ((IOException) obj).getClass();
                return new bbo(100, 500, 1000);
            case 27:
                i6e i6eVar = (i6e) obj;
                i6eVar.getClass();
                return Integer.valueOf(i6eVar.d);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                xte xteVar = (xte) obj;
                xteVar.getClass();
                return Integer.valueOf(xteVar.a);
            default:
                pkl pklVar = (pkl) obj;
                pklVar.getClass();
                return pklVar.d();
        }
    }
}

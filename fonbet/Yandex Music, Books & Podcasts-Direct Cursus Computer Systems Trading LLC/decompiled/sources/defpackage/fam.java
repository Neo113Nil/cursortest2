package defpackage;

import android.database.DatabaseUtils;
import com.yandex.music.shared.player.download2.balancer.RebalancedException;
import com.yandex.music.shared.player.download2.exo.ConnectivityCheckHttpDataSource$NetworkNotAllowedException;
import com.yandex.pulse.metrics.o;
import java.io.IOException;
import java.util.Arrays;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import ru.yandex.music.novelties.podcasts.catalog.PodcastsCatalogHttpApi;

/* loaded from: classes3.dex */
public final /* synthetic */ class fam implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ fam(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object kboVar;
        int i = 14;
        long j = 2000;
        int i2 = 0;
        switch (this.a) {
            case 0:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.t(jfpVar, "non_music_explicit_block");
                return Unit.a;
            case 1:
                ((String) obj).getClass();
                return Boolean.TRUE;
            case 2:
                u0j u0jVar = (u0j) obj;
                u0jVar.getClass();
                return Boolean.valueOf(u0jVar == u0j.a);
            case 3:
                ybm ybmVar = (ybm) obj;
                ybmVar.getClass();
                if (ybmVar instanceof ubm) {
                    j = 0;
                } else if ((ybmVar instanceof wbm) || (ybmVar instanceof xbm)) {
                    j = 200;
                } else if (!Intrinsics.d(ybmVar, sbm.a)) {
                    b6e.s();
                    return null;
                }
                return Long.valueOf(j);
            case 4:
                zt ztVar = (zt) obj;
                ztVar.getClass();
                return ztVar.b;
            case 5:
                String str = (String) obj;
                str.getClass();
                String sqlEscapeString = DatabaseUtils.sqlEscapeString(str);
                sqlEscapeString.getClass();
                return sqlEscapeString;
            case 6:
                t4m t4mVar = (t4m) obj;
                t4mVar.getClass();
                return avf.S(t4mVar, 0);
            case 7:
                return ((xxq) obj).a;
            case 8:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, zcm.class).E(new fam(9));
                o18Var.b(hag.I(edm.class)).E(new fam(10));
                o18Var.b(hag.I(PodcastsCatalogHttpApi.class)).E(new fam(11));
                o18Var.b(hag.I(xaj.class)).E(new fam(12));
                return Unit.a;
            case 9:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                bdt I = hag.I(edm.class);
                qdc qdcVar = l13Var.a;
                Set set = l13Var.b;
                return new zcm((edm) qdcVar.D(I, l13Var, set), (frt) qdcVar.D(hag.I(frt.class), l13Var, set));
            case 10:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                return new edm((PodcastsCatalogHttpApi) l13Var2.a.D(hag.I(PodcastsCatalogHttpApi.class), l13Var2, l13Var2.b));
            case 11:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                return (PodcastsCatalogHttpApi) ((e0j) l13Var3.a.D(hag.I(e0j.class), l13Var3, l13Var3.b)).a.b(PodcastsCatalogHttpApi.class);
            case 12:
                ((l13) obj).getClass();
                return new xaj();
            case 13:
                o18 o18Var2 = (o18) obj;
                vz1.e(o18Var2, wdm.class).E(new fam(i));
                o18Var2.b(hag.I(hdm.class)).E(new fam(15));
                return Unit.a;
            case 14:
                ((l13) obj).getClass();
                return new wdm();
            case 15:
                ((l13) obj).getClass();
                return hdm.a;
            case 16:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.w(jfpVar2);
                return Unit.a;
            case 17:
                ((psf) obj).getClass();
                return new ypd(fgq.o(psf.b));
            case 18:
                ((pte) obj).getClass();
                return new fbo(false, zao.c);
            case 19:
                xte xteVar = (xte) obj;
                zao zaoVar = zao.c;
                xteVar.getClass();
                if (xteVar instanceof bue) {
                    return new fbo(true, zaoVar);
                }
                return new ibo(ern.a(xte.class), new dcb(i), (Pair[]) Arrays.copyOf(new Pair[]{new Pair(new IntRange(400, 499, 1), new fbo(false, zaoVar))}, 1), new abo(2000L, new fam(22)));
            case 20:
                IOException iOException = (IOException) obj;
                zao zaoVar2 = zao.a;
                zao zaoVar3 = zao.b;
                iOException.getClass();
                if (!(iOException instanceof RebalancedException)) {
                    if (iOException instanceof g6e) {
                        g6e g6eVar = (g6e) iOException;
                        if (!(g6eVar instanceof ConnectivityCheckHttpDataSource$NetworkNotAllowedException)) {
                            if (g6eVar instanceof i6e) {
                                return new ibo(ern.a(i6e.class), new fam(23), (Pair[]) Arrays.copyOf(new Pair[]{new Pair(new IntRange(400, 499, 1), zaoVar3), new Pair(new IntRange(500, 599, 1), new bbo(500, 1000, 2000, 4000, 8000))}, 2), zaoVar3);
                            }
                            kboVar = new kbo(60000L, new bbo(500, 1000, 2000, 4000, 8000));
                            return kboVar;
                        }
                    }
                    return zaoVar3;
                }
                IOException iOException2 = ((RebalancedException) iOException).a;
                if (!(iOException2 instanceof g6e)) {
                    return zaoVar2;
                }
                g6e g6eVar2 = (g6e) iOException2;
                if (!(g6eVar2 instanceof ConnectivityCheckHttpDataSource$NetworkNotAllowedException)) {
                    if (g6eVar2 instanceof i6e) {
                        kboVar = new ibo(ern.a(RebalancedException.class), new oka(2, iOException2), (Pair[]) Arrays.copyOf(new Pair[]{new Pair(new IntRange(400, 499, 1), zaoVar3), new Pair(new IntRange(500, 599, 1), zaoVar2)}, 2), zaoVar3);
                    } else {
                        kboVar = new kbo(60000L, zaoVar2);
                    }
                    return kboVar;
                }
                return zaoVar3;
            case 21:
                ((IOException) obj).getClass();
                return new bbo(100, 500, 1000);
            case 22:
                return Double.valueOf(((Long) obj).longValue() * 1.5d);
            case 23:
                i6e i6eVar = (i6e) obj;
                i6eVar.getClass();
                return Integer.valueOf(i6eVar.d);
            case 24:
                return Double.valueOf(((Long) obj).longValue() * 1.5d);
            case 25:
                return Double.valueOf(((Long) obj).longValue() * 1.5d);
            case 26:
                o18 o18Var3 = (o18) obj;
                vz1.e(o18Var3, okm.class).E(new fam(27));
                o18Var3.b(hag.I(elm.class)).E(new fam(28));
                o18Var3.b(hag.I(xjm.class)).E(new fam(29));
                o18Var3.b(hag.I(lkm.class)).D(new gkm(i2));
                return Unit.a;
            case 27:
                ((l13) obj).getClass();
                return new okm();
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                return new elm((e0j) l13Var4.a.D(hag.I(e0j.class), l13Var4, l13Var4.b));
            default:
                ((l13) obj).getClass();
                return new xjm();
        }
    }
}

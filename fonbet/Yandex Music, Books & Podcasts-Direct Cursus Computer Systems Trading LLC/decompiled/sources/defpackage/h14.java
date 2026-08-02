package defpackage;

import android.content.Context;
import com.google.gson.GsonBuilder;
import com.yandex.music.shared.dto.universalentities.UniversalEntityDto;
import com.yandex.music.shared.dto.universalentities.UniversalEntityJsonAdapter;
import com.yandex.pulse.metrics.o;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import ru.yandex.music.chart.catalog.ChartsHttpApi;

/* loaded from: classes4.dex */
public final /* synthetic */ class h14 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ h14(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nrf nrfVar;
        switch (this.a) {
            case 0:
                GsonBuilder gsonBuilder = (GsonBuilder) obj;
                gsonBuilder.getClass();
                gsonBuilder.b(UniversalEntityDto.class, new UniversalEntityJsonAdapter());
                return Unit.a;
            case 1:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.x(jfpVar, 0.0f);
                return Unit.a;
            case 2:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.x(jfpVar2, 0.0f);
                return Unit.a;
            case 3:
                jfp jfpVar3 = (jfp) obj;
                jfpVar3.getClass();
                wfp.x(jfpVar3, 0.0f);
                return Unit.a;
            case 4:
                jfp jfpVar4 = (jfp) obj;
                jfpVar4.getClass();
                wfp.x(jfpVar4, 0.0f);
                return Unit.a;
            case 5:
                ltq ltqVar = (ltq) obj;
                ltqVar.getClass();
                return ltqVar.a;
            case 6:
                vjg vjgVar = (vjg) obj;
                if (vjgVar == null || (nrfVar = vjgVar.a) == null) {
                    return null;
                }
                return new r44(nrfVar, vjgVar.c, 0);
            case 7:
                ((IntRange) obj).getClass();
                return Unit.a;
            case 8:
                jfp jfpVar5 = (jfp) obj;
                jfpVar5.getClass();
                wfp.g(jfpVar5);
                return Unit.a;
            case 9:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, g64.class).E(new h14(10));
                o18Var.b(hag.I(fal.class)).E(new h14(11));
                o18Var.b(hag.I(tya.class)).E(new h14(12));
                o18Var.b(hag.I(k0b.class)).E(new h14(13));
                o18Var.b(hag.I(mza.class)).E(new h14(14));
                return Unit.a;
            case 10:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                bdt I = hag.I(frt.class);
                qdc qdcVar = l13Var.a;
                Set set = l13Var.b;
                return new g64((frt) qdcVar.D(I, l13Var, set), (afw) qdcVar.D(hag.I(afw.class), l13Var, set), (odd) qdcVar.D(hag.I(odd.class), l13Var, set), (dk4) qdcVar.D(hag.I(dk4.class), l13Var, set), (c74) qdcVar.D(hag.I(c74.class), l13Var, set));
            case 11:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                return new fal((g64) l13Var2.a(hag.I(g64.class)), (dk4) l13Var2.a(hag.I(dk4.class)));
            case 12:
                ((l13) obj).getClass();
                return new tya(qld.m());
            case 13:
                ((l13) obj).getClass();
                return new k0b();
            case 14:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                bdt I2 = hag.I(cc7.class);
                qdc qdcVar2 = l13Var3.a;
                Set set2 = l13Var3.b;
                yza yzaVar = new yza((cc7) qdcVar2.D(I2, l13Var3, set2), (frt) qdcVar2.D(hag.I(frt.class), l13Var3, set2));
                return new mza((z66) qdcVar2.D(hag.I(z66.class), l13Var3, set2), new vx6((k0b) qdcVar2.D(hag.I(k0b.class), l13Var3, set2), (frt) qdcVar2.D(hag.I(frt.class), l13Var3, set2), yzaVar), new yza((cc7) qdcVar2.D(hag.I(cc7.class), l13Var3, set2), (frt) qdcVar2.D(hag.I(frt.class), l13Var3, set2)), (tya) qdcVar2.D(hag.I(tya.class), l13Var3, set2), (zzp) qdcVar2.D(hag.I(zzp.class), l13Var3, set2), (zza) qdcVar2.D(hag.I(zza.class), l13Var3, set2));
            case 15:
                jfp jfpVar6 = (jfp) obj;
                jfpVar6.getClass();
                wfp.e(jfpVar6);
                return Unit.a;
            case 16:
                jfp jfpVar7 = (jfp) obj;
                jfpVar7.getClass();
                wfp.r(jfpVar7, true);
                return Unit.a;
            case 17:
                vz1.e((o18) obj, pf4.class).E(new h14(18));
                return Unit.a;
            case 18:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                return new pf4((e0j) l13Var4.a.D(hag.I(e0j.class), l13Var4, l13Var4.b));
            case 19:
                tun tunVar = (tun) obj;
                if (tunVar == null) {
                    return null;
                }
                nrf nrfVar2 = tunVar.a;
                onq onqVar = tunVar.b;
                String str = tunVar.d;
                String str2 = tunVar.e;
                Integer num = onqVar.b;
                if (num == null) {
                    return null;
                }
                if (num.intValue() <= 0) {
                    num = null;
                }
                if (num != null) {
                    return new ag4(nrfVar2, onqVar, str, str2, num.intValue());
                }
                return null;
            case 20:
                ((jfp) obj).getClass();
                return Unit.a;
            case 21:
                o18 o18Var2 = (o18) obj;
                vz1.e(o18Var2, tg4.class).E(new h14(22));
                o18Var2.b(hag.I(yg4.class)).E(new h14(23));
                o18Var2.b(hag.I(ChartsHttpApi.class)).E(new h14(24));
                o18Var2.b(hag.I(zg4.class)).E(new h14(25));
                return Unit.a;
            case 22:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                return new tg4((yg4) l13Var5.a.D(hag.I(yg4.class), l13Var5, l13Var5.b));
            case 23:
                l13 l13Var6 = (l13) obj;
                l13Var6.getClass();
                return new yg4((zg4) l13Var6.a.D(hag.I(zg4.class), l13Var6, l13Var6.b));
            case 24:
                l13 l13Var7 = (l13) obj;
                l13Var7.getClass();
                return (ChartsHttpApi) ((e0j) l13Var7.a.D(hag.I(e0j.class), l13Var7, l13Var7.b)).a.b(ChartsHttpApi.class);
            case 25:
                l13 l13Var8 = (l13) obj;
                l13Var8.getClass();
                return (zg4) ((rci) ((e0j) l13Var8.a.D(hag.I(e0j.class), l13Var8, l13Var8.b)).c.getValue()).a(ern.a(zg4.class), zg4.e);
            case 26:
                o18 o18Var3 = (o18) obj;
                vz1.e(o18Var3, dk4.class).E(new h14(27));
                o18Var3.b(hag.I(jk4.class)).E(new h14(28));
                o18Var3.b(hag.I(nk4.class)).E(new h14(29));
                return Unit.a;
            case 27:
                l13 l13Var9 = (l13) obj;
                l13Var9.getClass();
                return new dk4((Context) l13Var9.a.D(hag.I(Context.class), l13Var9, l13Var9.b));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((l13) obj).getClass();
                return new jk4();
            default:
                ((l13) obj).getClass();
                return new nk4();
        }
    }
}

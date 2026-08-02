package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import com.yandex.music.screen.cards.data.CardsHttpApiOld;
import com.yandex.pulse.metrics.o;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class zj3 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ zj3(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nrf nrfVar;
        int i = 17;
        Continuation continuation = null;
        switch (this.a) {
            case 0:
                ((l13) obj).getClass();
                return new yj3();
            case 1:
                ((l13) obj).getClass();
                l18 l18Var = l18.b;
                bdt I = hag.I(yj3.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return new xj3((yj3) qdcVar.C(I));
            case 2:
                ((l13) obj).getClass();
                return new jk3();
            case 3:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new ik3((jk3) l13Var.a.D(hag.I(jk3.class), l13Var, l13Var.b));
            case 4:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.w(jfpVar);
                wfp.x(jfpVar, 0.0f);
                return Unit.a;
            case 5:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, khr.class).E(new zj3(6));
                o18Var.b(hag.I(fq3.class)).E(new zj3(7));
                o18Var.b(hag.I(ass.class)).D(new zj3(8));
                o18Var.b(hag.I(c72.class)).E(new zj3(9));
                return Unit.a;
            case 6:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                return new khr((Context) l13Var2.a.D(hag.I(Context.class), l13Var2, l13Var2.b));
            case 7:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                bdt I2 = hag.I(khr.class);
                qdc qdcVar2 = l13Var3.a;
                Set set = l13Var3.b;
                fq3 fq3Var = new fq3((khr) qdcVar2.D(I2, l13Var3, set));
                Context context = (Context) qdcVar2.D(hag.I(Context.class), l13Var3, set);
                IntentFilter intentFilter = cih.a;
                ss3 I3 = zsd.I(new zig(context, continuation, 14));
                msa msaVar = nsa.b;
                ox6.B(zsd.Y(I3, yd5.M(1, ssa.SECONDS)), fq3Var.b, new gl(i, context, fq3Var));
                return fq3Var;
            case 8:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                bdt I4 = hag.I(raa.class);
                qdc qdcVar3 = l13Var4.a;
                Set set2 = l13Var4.b;
                return new ass((raa) qdcVar3.D(I4, l13Var4, set2), (z66) qdcVar3.D(hag.I(z66.class), l13Var4, set2), (xba) qdcVar3.D(hag.I(xba.class), l13Var4, set2), (uaa) qdcVar3.D(hag.I(uaa.class), l13Var4, set2));
            case 9:
                ((l13) obj).getClass();
                l18 l18Var2 = l18.b;
                bdt I5 = hag.I(vka.class);
                qdc qdcVar4 = l18Var2.a;
                qdcVar4.getClass();
                return (c72) ((vka) qdcVar4.C(I5)).m.getValue();
            case 10:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                return new dv3((Context) l13Var5.a.D(hag.I(Context.class), l13Var5, l13Var5.b));
            case 11:
                l13 l13Var6 = (l13) obj;
                l13Var6.getClass();
                return new xu3(l13Var6);
            case 12:
                l13 l13Var7 = (l13) obj;
                l13Var7.getClass();
                return new vu3((xu3) l13Var7.a.D(hag.I(xu3.class), l13Var7, l13Var7.b));
            case 13:
                l13 l13Var8 = (l13) obj;
                l13Var8.getClass();
                return (dv3) ((vu3) l13Var8.a.D(hag.I(vu3.class), l13Var8, l13Var8.b)).a.getValue();
            case 14:
                vz1.e((o18) obj, dy3.class).E(new zj3(15));
                return Unit.a;
            case 15:
                ((l13) obj).getClass();
                return new dy3(new gy3());
            case 16:
                o18 o18Var2 = (o18) obj;
                vz1.e(o18Var2, CardsHttpApiOld.class).E(new zj3(i));
                o18Var2.b(hag.I(ay3.class)).E(new zj3(18));
                o18Var2.b(hag.I(cy3.class)).E(new zj3(19));
                return Unit.a;
            case 17:
                l13 l13Var9 = (l13) obj;
                l13Var9.getClass();
                return (CardsHttpApiOld) ((e0j) l13Var9.a.D(hag.I(e0j.class), l13Var9, l13Var9.b)).a.b(CardsHttpApiOld.class);
            case 18:
                l13 l13Var10 = (l13) obj;
                l13Var10.getClass();
                return (ay3) ((rci) i0j.a((i0j) l13Var10.a.D(hag.I(i0j.class), l13Var10, l13Var10.b), null, null, new uf3(5), null, 55).c.getValue()).a(ern.a(ay3.class), ay3.c);
            case 19:
                l13 l13Var11 = (l13) obj;
                l13Var11.getClass();
                bdt I6 = hag.I(ay3.class);
                qdc qdcVar5 = l13Var11.a;
                Set set3 = l13Var11.b;
                return new cy3((ay3) qdcVar5.D(I6, l13Var11, set3), (z66) qdcVar5.D(hag.I(z66.class), l13Var11, set3));
            case 20:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.x(jfpVar2, 2.0f);
                return Unit.a;
            case 21:
                ((jfp) obj).getClass();
                return Unit.a;
            case 22:
                ((jfp) obj).getClass();
                return Unit.a;
            case 23:
                jfp jfpVar3 = (jfp) obj;
                jfpVar3.getClass();
                wfp.w(jfpVar3);
                return Unit.a;
            case 24:
                jfp jfpVar4 = (jfp) obj;
                jfpVar4.getClass();
                wfp.x(jfpVar4, 1.0f);
                return Unit.a;
            case 25:
                jfp jfpVar5 = (jfp) obj;
                jfpVar5.getClass();
                wfp.x(jfpVar5, 3.0f);
                return Unit.a;
            case 26:
                jfp jfpVar6 = (jfp) obj;
                jfpVar6.getClass();
                wfp.x(jfpVar6, 4.0f);
                return Unit.a;
            case 27:
                vjg vjgVar = (vjg) obj;
                if (vjgVar == null || (nrfVar = vjgVar.a) == null) {
                    return null;
                }
                return new hz3(nrfVar, vjgVar.c, 0, false);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                n04 n04Var = (n04) obj;
                n04Var.getClass();
                return Boolean.valueOf(Intrinsics.d(n04Var, k04.a));
            default:
                ((jfp) obj).getClass();
                return Unit.a;
        }
    }
}

package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.gson.GsonBuilder;
import com.yandex.music.shared.bdu.trigger.cache.serialization.CommunicationTriggerDtoJsonAdapter;
import com.yandex.music.shared.bdu.trigger.cache.serialization.InternalCommunicationTriggerJsonAdapter;
import com.yandex.music.shared.bdu.trigger.network.TriggerApi;
import com.yandex.music.shared.bdui.core.impl.a;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

/* loaded from: classes4.dex */
public final /* synthetic */ class pvp implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = 28;
        int i2 = 3;
        switch (this.a) {
            case 0:
                ((l13) obj).getClass();
                return new ovp();
            case 1:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, twp.class).E(new pvp(2));
                o18Var.b(hag.I(swp.class)).D(new pvp(i2));
                return Unit.a;
            case 2:
                ((l13) obj).getClass();
                return new twp();
            case 3:
                ((l13) obj).getClass();
                l18 l18Var = l18.b;
                bdt I = hag.I(twp.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return new swp((twp) qdcVar.C(I));
            case 4:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.g(jfpVar);
                return Unit.a;
            case 5:
                ((jfp) obj).getClass();
                return Unit.a;
            case 6:
                o18 o18Var2 = (o18) obj;
                vz1.e(o18Var2, b39.class).E(new pvp(8));
                o18Var2.b(hag.I(cy2.class)).E(new pvp(9));
                o18Var2.b(hag.I(wyp.class)).E(new pvp(10));
                o18Var2.b(hag.I(czp.class)).E(new pvp(11));
                o18Var2.b(hag.I(q89.class)).E(new pvp(12));
                o18Var2.b(hag.I(we9.class)).E(new pvp(13));
                o18Var2.b(hag.I(zv8.class)).D(new pvp(14));
                o18Var2.b(hag.I(sv8.class)).E(new pvp(15));
                o18Var2.b(hag.I(oy2.class)).E(new pvp(16));
                o18Var2.b(hag.I(qy2.class)).D(new pvp(7));
                return Unit.a;
            case 7:
                return (qy2) ((czp) vz1.l((l13) obj, czp.class)).a.c(hag.I(qy2.class));
            case 8:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                bdt I2 = hag.I(Context.class);
                qdc qdcVar2 = l13Var.a;
                Set set = l13Var.b;
                Context context = (Context) qdcVar2.D(I2, l13Var, set);
                Context context2 = (Context) qdcVar2.D(hag.I(Context.class), l13Var, set);
                z66 z66Var = (z66) qdcVar2.D(hag.I(z66.class), l13Var, set);
                OkHttpClient okHttpClient = ((i0j) qdcVar2.D(hag.I(i0j.class), l13Var, set)).b(new evj(new oao(uah.e(new Pair(jgb.j, hld.B(500, 1000, 2000)), new Pair(igb.j, hld.B(1000, 1000, 1000)), new Pair(new hgb(NetworkRequestException.TOO_MANY_REQUESTS), hld.B(1000, 1000, 1000)), new Pair(new hgb(500), hld.B(1000, 1000, 1000)), new Pair(new hgb(502), hld.B(1000, 1000, 1000)), new Pair(new hgb(503), hld.B(1000, 1000, 1000)), new Pair(new hgb(504), hld.B(1000, 1000, 1000)))), "BduCoil", (ozw) null, (Function1) null, 53)).a;
                mmo mmoVar = new mmo(context2);
                mmoVar.e = new kme(okHttpClient);
                mmoVar.d = btf.b(new vw1(context2, 1));
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                arrayList.add(new dy2(0, z66Var));
                if (Build.VERSION.SDK_INT >= 28) {
                    arrayList5.add(new hbe());
                } else {
                    arrayList5.add(new ncd());
                }
                mmoVar.f = new on5(xee.L(arrayList), xee.L(arrayList2), xee.L(arrayList3), xee.L(arrayList4), xee.L(arrayList5));
                mmoVar.i();
                return new b39(context, mmoVar.k());
            case 9:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                return new cy2(l13Var2.b(hag.I(y60.class), true));
            case 10:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                return new wyp(l13Var3);
            case 11:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                return new czp((wyp) l13Var4.a.D(hag.I(wyp.class), l13Var4, l13Var4.b));
            case 12:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                return (q89) ((czp) l13Var5.a.D(hag.I(czp.class), l13Var5, l13Var5.b)).b.getValue();
            case 13:
                l13 l13Var6 = (l13) obj;
                l13Var6.getClass();
                return (we9) ((czp) l13Var6.a.D(hag.I(czp.class), l13Var6, l13Var6.b)).c.getValue();
            case 14:
                l13 l13Var7 = (l13) obj;
                l13Var7.getClass();
                return (zv8) ((czp) l13Var7.a.D(hag.I(czp.class), l13Var7, l13Var7.b)).d.getValue();
            case 15:
                l13 l13Var8 = (l13) obj;
                l13Var8.getClass();
                return (sv8) ((czp) l13Var8.a.D(hag.I(czp.class), l13Var8, l13Var8.b)).e.getValue();
            case 16:
                l13 l13Var9 = (l13) obj;
                l13Var9.getClass();
                return (oy2) ((czp) l13Var9.a.D(hag.I(czp.class), l13Var9, l13Var9.b)).f.getValue();
            case 17:
                GsonBuilder gsonBuilder = (GsonBuilder) obj;
                gsonBuilder.getClass();
                gsonBuilder.b(mte.class, new InternalCommunicationTriggerJsonAdapter());
                gsonBuilder.b(ej5.class, new CommunicationTriggerDtoJsonAdapter());
                return Unit.a;
            case 18:
                l13 l13Var10 = (l13) obj;
                l13Var10.getClass();
                bdt I3 = hag.I(zj5.class);
                qdc qdcVar3 = l13Var10.a;
                Set set2 = l13Var10.b;
                return new pi5((zj5) qdcVar3.D(I3, l13Var10, set2), l13Var10.b(hag.I(oj5.class), true), (dj5) qdcVar3.D(hag.I(dj5.class), l13Var10, set2), azp.a());
            case 19:
                l13 l13Var11 = (l13) obj;
                l13Var11.getClass();
                return (TriggerApi) ((e0j) l13Var11.a.D(hag.I(e0j.class), l13Var11, l13Var11.b)).a.b(TriggerApi.class);
            case 20:
                l13 l13Var12 = (l13) obj;
                l13Var12.getClass();
                return new hi5(((e0j) l13Var12.a.D(hag.I(e0j.class), l13Var12, l13Var12.b)).b);
            case 21:
                l13 l13Var13 = (l13) obj;
                l13Var13.getClass();
                return new tj5(((e0j) l13Var13.a.D(hag.I(e0j.class), l13Var13, l13Var13.b)).b);
            case 22:
                o18 o18Var3 = (o18) obj;
                vz1.e(o18Var3, gj5.class).E(new pvp(23));
                o18Var3.b(hag.I(ai5.class)).D(new pvp(24));
                o18Var3.b(hag.I(gta.class)).E(new pvp(25));
                o18Var3.b(hag.I(azp.class)).E(new pvp(26));
                o18Var3.b(hag.I(yyp.class)).E(new pvp(27));
                o18Var3.b(hag.I(pi5.class)).E(new pvp(i));
                return Unit.a;
            case 23:
                ((l13) obj).getClass();
                return new gj5();
            case 24:
                ((l13) obj).getClass();
                return new ai5();
            case 25:
                ((l13) obj).getClass();
                return new gta();
            case 26:
                l13 l13Var14 = (l13) obj;
                l13Var14.getClass();
                return new azp(l13Var14);
            case 27:
                l13 l13Var15 = (l13) obj;
                l13Var15.getClass();
                return new yyp((azp) l13Var15.a.D(hag.I(azp.class), l13Var15, l13Var15.b));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                l13 l13Var16 = (l13) obj;
                l13Var16.getClass();
                return (pi5) ((yyp) l13Var16.a.D(hag.I(yyp.class), l13Var16, l13Var16.b)).a.getValue();
            default:
                l13 l13Var17 = (l13) obj;
                l13Var17.getClass();
                bdt I4 = hag.I(fy2.class);
                qdc qdcVar4 = l13Var17.a;
                Set set3 = l13Var17.b;
                return new oy2((fy2) qdcVar4.D(I4, l13Var17, set3), (a) qdcVar4.D(hag.I(a.class), l13Var17, set3), (sv8) qdcVar4.D(hag.I(sv8.class), l13Var17, set3), (zv8) qdcVar4.D(hag.I(zv8.class), l13Var17, set3), (py2) qdcVar4.D(hag.I(py2.class), l13Var17, set3));
        }
    }

    public /* synthetic */ pvp(int i) {
        this.a = i;
    }
}

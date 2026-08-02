package defpackage;

import android.content.Context;
import com.yandex.plus.acquisition.sdk.button.section.ui.api.i;
import com.yandex.plus.home.b;
import com.yandex.plus.home.dailyquests.plugin.internal.proxy.c;
import com.yandex.plus.home.t;
import com.yandex.plus.pay.adapter.api.a;
import com.yandex.pulse.metrics.o;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class k7m implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ k7m(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        b b;
        switch (this.a) {
            case 0:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                t tVar = (t) l13Var.a.D(hag.I(t.class), l13Var, l13Var.b);
                synchronized (tVar) {
                    b = tVar.b(c.class);
                }
                if (b != null) {
                    return new h8n((c) b);
                }
                jj4.h(c.class, " is absent! You must install plugin before using it!", "Plugin ");
                return null;
            case 1:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                return new x87((u7m) l13Var2.a.D(hag.I(u7m.class), l13Var2, l13Var2.b));
            case 2:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                return new a(new h4d(l13Var3, 10), new hv0(l13Var3, null, 25));
            case 3:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                bdt I = hag.I(q7m.class);
                qdc qdcVar = l13Var4.a;
                Set set = l13Var4.b;
                return new j9m();
            case 4:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                bdt I2 = hag.I(com.yandex.plus.acquisition.sdk.common.impl.di.b.class);
                qdc qdcVar2 = l13Var5.a;
                Set set2 = l13Var5.b;
                return new com.yandex.plus.acquisition.sdk.button.section.ui.impl.di.c(new i((com.yandex.plus.acquisition.sdk.common.impl.di.b) qdcVar2.D(I2, l13Var5, set2), (com.yandex.plus.acquisition.sdk.pay.impl.b) qdcVar2.D(hag.I(com.yandex.plus.acquisition.sdk.pay.impl.b.class), l13Var5, set2), (com.yandex.plus.core.imageloader.b) qdcVar2.D(hag.I(com.yandex.plus.core.imageloader.b.class), l13Var5, set2)));
            case 5:
                l13 l13Var6 = (l13) obj;
                l13Var6.getClass();
                bdt I3 = hag.I(com.yandex.plus.acquisition.sdk.button.section.ui.impl.di.c.class);
                qdc qdcVar3 = l13Var6.a;
                Set set3 = l13Var6.b;
                return new com.yandex.plus.acquisition.adapter.api.a((com.yandex.plus.acquisition.sdk.button.section.ui.impl.di.c) qdcVar3.D(I3, l13Var6, set3), (com.yandex.plus.acquisition.sdk.pay.impl.b) qdcVar3.D(hag.I(com.yandex.plus.acquisition.sdk.pay.impl.b.class), l13Var6, set3));
            case 6:
                l13 l13Var7 = (l13) obj;
                l13Var7.getClass();
                return new o7m(l13Var7);
            case 7:
                u0j u0jVar = (u0j) obj;
                u0jVar.getClass();
                return Boolean.valueOf(u0jVar == u0j.a);
            case 8:
                vz1.e((o18) obj, x7m.class).D(new k7m(9));
                return Unit.a;
            case 9:
                ((l13) obj).getClass();
                return new x7m();
            case 10:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, c3n.class).D(new k7m(11));
                o18Var.b(hag.I(wrt.class)).D(new k7m(12));
                return Unit.a;
            case 11:
                l13 l13Var8 = (l13) obj;
                l13Var8.getClass();
                return new c3n(new bml(1, l13Var8.a.D(hag.I(Context.class), l13Var8, l13Var8.b), Context.class, "getString", "getString(I)Ljava/lang/String;", 0, 5));
            case 12:
                ((l13) obj).getClass();
                l18 l18Var = l18.b;
                bdt I4 = hag.I(dqi.class);
                qdc qdcVar4 = l18Var.a;
                qdcVar4.getClass();
                return new wrt((dqi) qdcVar4.C(I4));
            case 13:
                o18 o18Var2 = (o18) obj;
                vz1.e(o18Var2, l8m.class).E(new k7m(15));
                o18Var2.b(hag.I(q8m.class)).E(new k7m(16));
                o18Var2.b(hag.I(s8m.class)).D(new k7m(17));
                o18Var2.b(hag.I(m8m.class)).E(new k7m(18));
                o18Var2.b(hag.I(u8m.class)).E(new k7m(19));
                o18Var2.b(hag.I(n8m.class)).E(new k7m(20));
                o18Var2.b(hag.I(t8m.class)).E(new k7m(21));
                o18Var2.b(hag.I(k8m.class)).D(new k7m(22));
                o18Var2.b(hag.I(o8m.class)).E(new k7m(23));
                o18Var2.b(hag.I(w8m.class)).E(new k7m(14));
                return Unit.a;
            case 14:
                l13 l13Var9 = (l13) obj;
                l13Var9.getClass();
                return new w8m((o8m) l13Var9.a.D(hag.I(o8m.class), l13Var9, l13Var9.b));
            case 15:
                l13 l13Var10 = (l13) obj;
                l13Var10.getClass();
                return new l8m(l13Var10);
            case 16:
                l13 l13Var11 = (l13) obj;
                l13Var11.getClass();
                return new q8m((l8m) l13Var11.a.D(hag.I(l8m.class), l13Var11, l13Var11.b));
            case 17:
                l13 l13Var12 = (l13) obj;
                l13Var12.getClass();
                return new s8m(l13Var12.b(hag.I(mh7.class), true));
            case 18:
                l13 l13Var13 = (l13) obj;
                l13Var13.getClass();
                return new m8m(l13Var13);
            case 19:
                l13 l13Var14 = (l13) obj;
                l13Var14.getClass();
                return new u8m((m8m) l13Var14.a.D(hag.I(m8m.class), l13Var14, l13Var14.b));
            case 20:
                l13 l13Var15 = (l13) obj;
                l13Var15.getClass();
                return new n8m(l13Var15);
            case 21:
                l13 l13Var16 = (l13) obj;
                l13Var16.getClass();
                return new t8m((n8m) l13Var16.a.D(hag.I(n8m.class), l13Var16, l13Var16.b));
            case 22:
                l13 l13Var17 = (l13) obj;
                l13Var17.getClass();
                return new k8m(l13Var17.b(hag.I(sw0.class), true));
            case 23:
                l13 l13Var18 = (l13) obj;
                l13Var18.getClass();
                return new o8m(l13Var18);
            case 24:
                l13 l13Var19 = (l13) obj;
                l13Var19.getClass();
                return new fjk(l13Var19.b(hag.I(com.yandex.plus.pay.a.class), true));
            case 25:
                l13 l13Var20 = (l13) obj;
                l13Var20.getClass();
                return new kik(l13Var20.b(hag.I(com.yandex.plus.pay.ui.core.a.class), true), l13Var20.b(hag.I(c7m.class), true));
            case 26:
                vz1.e((o18) obj, y8m.class).E(new k7m(27));
                return Unit.a;
            case 27:
                ((l13) obj).getClass();
                return new y8m();
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.w(jfpVar);
                wfp.x(jfpVar, -1.0f);
                return Unit.a;
            default:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.t(jfpVar2, "non_music_publisher_block");
                return Unit.a;
        }
    }
}

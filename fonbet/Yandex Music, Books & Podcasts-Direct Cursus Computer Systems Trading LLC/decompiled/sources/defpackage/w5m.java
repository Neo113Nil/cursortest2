package defpackage;

import android.content.Context;
import androidx.core.app.q;
import com.yandex.passport.internal.flags.experiments.p;
import com.yandex.passport.internal.push.x0;
import com.yandex.plus.adapter.auth.api.c;
import com.yandex.plus.adapter.auth.passport750.i;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.r;
import com.yandex.plus.core.analytics.h;
import com.yandex.plus.core.analytics.logging.d;
import com.yandex.plus.core.benchmark.b0;
import com.yandex.plus.core.benchmark.d0;
import com.yandex.plus.core.benchmark.e0;
import com.yandex.plus.core.benchmark.y;
import com.yandex.plus.home.feature.webviews.internal.webview.e;
import com.yandex.plus.home.t;
import com.yandex.plus.metrica.api.b;
import com.yandex.plus.metrica.utils.n;
import com.yandex.plus.pay.internal.a;
import com.yandex.plus.pay.internal.g;
import com.yandex.pulse.metrics.o;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class w5m implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ w5m(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        int i = 13;
        int i2 = 11;
        int i3 = 25;
        int i4 = 22;
        int i5 = 24;
        switch (this.a) {
            case 0:
                ((l13) obj).getClass();
                return new v7m();
            case 1:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                bdt I = hag.I(b7m.class);
                qdc qdcVar = l13Var.a;
                Set set = l13Var.b;
                p3e p3eVar = new p3e(17, (u7m) qdcVar.D(hag.I(u7m.class), l13Var, set), l13Var, (b7m) qdcVar.D(I, l13Var, set));
                a aVar = new a();
                aVar.o = com.yandex.plus.core.strings.a.a;
                aVar.t = new e(13);
                p3eVar.invoke(aVar);
                Context context = aVar.g;
                if (context == null) {
                    b6e.j(33, "Parameter context is required for ", ern.a(a.class));
                    return null;
                }
                String str4 = aVar.a;
                if (str4 == null) {
                    b6e.j(33, "Parameter serviceName is required for ", ern.a(a.class));
                    return null;
                }
                b bVar = aVar.q;
                if (bVar == null) {
                    b6e.j(33, "Parameter metricaProvider is required for ", ern.a(a.class));
                    return null;
                }
                com.yandex.plus.core.config.b bVar2 = aVar.f;
                if (bVar2 == null) {
                    bVar2 = new q(27);
                }
                com.yandex.plus.core.config.a a = bVar2.a();
                x0 x0Var = new x0(context.getApplicationContext(), 4);
                n nVar = new n(0, y.a, y.class, "isBenchmarksNeeded", "isBenchmarksNeeded()Z", 0, 16);
                int ordinal = a.ordinal();
                if (ordinal == 0) {
                    str = "a99f48c7-c89c-497e-89b3-ee0e697a16d4";
                } else {
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    str = "2c129634-4c21-414a-9acd-1890762ce8cf";
                }
                com.yandex.plus.metrica.a a2 = bVar.a(context, str, "PLUSPAYSDKA", "com.yandex.plus.pay", "plus_hq_Payment-SDK", a, x0Var, nVar);
                List h = u75.h(new Pair(new com.yandex.plus.home.benchmark.pulse.a(1), a2.a()), new Pair(new b0("PaySDK"), new d0(new n(0, a2.a(), h.class, "getStatboxReporter", "getStatboxReporter()Lcom/yandex/plus/core/analytics/StatboxReporter;", 0, 15))));
                q qVar = new q(24);
                com.yandex.plus.core.dispatcher.a aVar2 = com.yandex.plus.core.dispatcher.b.a;
                e0 e0Var = new e0(nVar, h, qVar, aVar2);
                tf6 e = gld.e(kotlin.coroutines.e.c(a4g.n(), com.yandex.plus.core.dispatcher.a.e));
                i iVar = aVar.r;
                if (iVar == null) {
                    b6e.j(33, "Parameter authAdapter is required for ", ern.a(a.class));
                    return null;
                }
                c b = com.yandex.plus.bdui.flex.ui.a.b(a);
                int ordinal2 = a.ordinal();
                if (ordinal2 == 0) {
                    str2 = "ihzgHoWQs5rWDMLphyyNrKZz3klJyP18NVDw2HGoHlfSU9axEw7KVsrYmQ+VK6pV";
                } else {
                    if (ordinal2 != 1) {
                        b6e.s();
                        return null;
                    }
                    str2 = "3Ri+ENGXtMqAXsG+h3+M+/mTC8VZfuXV5CfcnQpBL9EbTxbLtAIJW1bl4a/8NeSh";
                }
                String str5 = str2;
                int ordinal3 = a.ordinal();
                if (ordinal3 == 0) {
                    str3 = "0B+zGYCdsp2BCJO7hyjZ+gafClC6lVjqBIY0KjJXvyK0+qpw7XuUHIJMwoubyPv8";
                } else {
                    if (ordinal3 != 1) {
                        b6e.s();
                        return null;
                    }
                    str3 = "3R2/EdiRsMnaW8W9hy3Zr8hD9cu98OBokrOkmJdHqhGGFn625OMnoOSSje4evCMs";
                }
                String str6 = str3;
                jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                d a3 = com.yandex.plus.core.analytics.logging.e.a(com.yandex.plus.core.analytics.logging.b.a);
                bsd bsdVar = com.yandex.plus.core.dispatcher.a.c;
                dq7 dq7Var = com.yandex.plus.core.dispatcher.a.f;
                bsdVar.getClass();
                dq7Var.getClass();
                return (com.yandex.plus.pay.a) r1.R(e0Var, "Initialization", new lbm(aVar, context, str4, bVar2, bVar, a2, new com.yandex.plus.domain.auth.impl.i(iVar, b, str5, str6, a3, e, bsdVar, dq7Var, "pay_sdk"), e0Var, nVar, x0Var, e, aVar2));
            case 2:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                bdt I2 = hag.I(b7m.class);
                qdc qdcVar2 = l13Var2.a;
                Set set2 = l13Var2.b;
                b7m b7mVar = (b7m) qdcVar2.D(I2, l13Var2, set2);
                u7m u7mVar = (u7m) qdcVar2.D(hag.I(u7m.class), l13Var2, set2);
                new com.yandex.plus.home.plaque.plugin.internal.di.c();
                return new com.yandex.plus.paymentsdk.api.a(new com.yandex.plus.home.plaque.plugin.internal.di.c(), new z5m(b7mVar, u7mVar, 0), b7mVar.c(u7mVar.e), com.yandex.plus.core.dispatcher.b.a);
            case 3:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                com.yandex.plus.paymentsdk.api.a aVar3 = (com.yandex.plus.paymentsdk.api.a) l13Var3.a.D(hag.I(com.yandex.plus.paymentsdk.api.a.class), l13Var3, l13Var3.b);
                com.yandex.plus.paymentsdk.internal.a aVar4 = (com.yandex.plus.paymentsdk.internal.a) aVar3.d.getValue();
                com.yandex.plus.paymentsdk.internal.common.a aVar5 = (com.yandex.plus.paymentsdk.internal.common.a) aVar3.c.getValue();
                ((com.yandex.plus.core.dispatcher.a) aVar3.b).getClass();
                return new com.yandex.plus.paymentsdk.internal.method.e(aVar4, aVar5, com.yandex.plus.core.dispatcher.a.e);
            case 4:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                return new com.yandex.plus.coil.b((Context) l13Var4.a.D(hag.I(Context.class), l13Var4, l13Var4.b));
            case 5:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                bdt I3 = hag.I(b7m.class);
                qdc qdcVar3 = l13Var5.a;
                Set set3 = l13Var5.b;
                return new com.yandex.plus.pay.ui.design.plus.api.a(((b7m) qdcVar3.D(I3, l13Var5, set3)).c(((u7m) qdcVar3.D(hag.I(u7m.class), l13Var5, set3)).e));
            case 6:
                l13 l13Var6 = (l13) obj;
                l13Var6.getClass();
                bdt I4 = hag.I(a8m.class);
                qdc qdcVar4 = l13Var6.a;
                Set set4 = l13Var6.b;
                p3e p3eVar2 = new p3e(l13Var6, (a8m) qdcVar4.D(I4, l13Var6, set4), (i8m) qdcVar4.D(hag.I(i8m.class), l13Var6, set4), (e8m) qdcVar4.D(hag.I(e8m.class), l13Var6, set4));
                com.yandex.plus.pay.ui.tarifficator.mobile.bdui.api.a aVar6 = new com.yandex.plus.pay.ui.tarifficator.mobile.bdui.api.a();
                p3eVar2.invoke(aVar6);
                r rVar = aVar6.a;
                if (rVar == null) {
                    b6e.j(33, "Parameter documentEngineFactory is required for ", ern.a(com.yandex.plus.pay.ui.tarifficator.mobile.bdui.api.a.class));
                    return null;
                }
                com.yandex.plus.pay.ui.design.api.api.a aVar7 = aVar6.b;
                if (aVar7 == null) {
                    b6e.j(33, "Parameter designSystem is required for ", ern.a(com.yandex.plus.pay.ui.tarifficator.mobile.bdui.api.a.class));
                    return null;
                }
                com.yandex.plus.paymentsdk.internal.method.e eVar = aVar6.c;
                if (eVar == null) {
                    b6e.j(33, "Parameter paymentMethodsFacade is required for ", ern.a(com.yandex.plus.pay.ui.tarifficator.mobile.bdui.api.a.class));
                    return null;
                }
                com.yandex.plus.home.dailyquests.feature.api.c cVar = new com.yandex.plus.home.dailyquests.feature.api.c(rVar, aVar7, eVar, aVar6.d, aVar6.e, aVar6.f, aVar6.g, new q(24));
                p pVar = new p(25);
                pVar.b = (com.yandex.plus.pay.a) qdcVar4.D(hag.I(com.yandex.plus.pay.a.class), l13Var6, set4);
                pVar.d = cVar;
                pVar.c = (com.yandex.plus.core.imageloader.b) qdcVar4.D(hag.I(com.yandex.plus.core.imageloader.b.class), l13Var6, set4);
                com.yandex.plus.pay.a aVar8 = (com.yandex.plus.pay.a) pVar.b;
                g gVar = aVar8 instanceof g ? (g) aVar8 : null;
                if (gVar == null) {
                    xq0.q("External plusPay instance must implements PlusPayInternal interface!");
                    return null;
                }
                com.yandex.plus.pay.internal.di.r c = gVar.c();
                StringBuilder sb = new StringBuilder("|");
                sb.append(c.a.hashCode());
                sb.append('|');
                sb.append(c.b.hashCode());
                sb.append('|');
                String str7 = c.c;
                sb.append(str7 != null ? str7.hashCode() : 0);
                sb.append('|');
                sb.append(c.d.hashCode());
                sb.append('|');
                sb.append(c.e.hashCode());
                sb.append('|');
                String str8 = c.f;
                sb.append(str8 != null ? str8.hashCode() : 0);
                sb.append('|');
                String str9 = c.g;
                sb.append(str9 != null ? str9.hashCode() : 0);
                sb.append('|');
                sb.append(c.h.name().hashCode());
                sb.append('|');
                sb.append(c.j.hashCode());
                sb.append('|');
                sb.append(c.p.a().name().hashCode());
                sb.append('|');
                sb.append(Boolean.hashCode(false));
                sb.append('|');
                return (com.yandex.plus.pay.ui.core.a) r1.R(c.y, "UI.Initialization", new com.yandex.passport.internal.ui.sloth.ebs.i(i2, sb.toString(), pVar, gVar));
            case 7:
                l13 l13Var7 = (l13) obj;
                l13Var7.getClass();
                bdt I5 = hag.I(q7m.class);
                qdc qdcVar5 = l13Var7.a;
                Set set5 = l13Var7.b;
                return new f8m();
            case 8:
                ((l13) obj).getClass();
                return new b7m(gld.e(dm6.c));
            case 9:
                ((l13) obj).getClass();
                return new g8m();
            case 10:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, m6m.class).E(new w5m(i2));
                o18Var.b(hag.I(k6m.class)).E(new w5m(12));
                o18Var.b(hag.I(d6m.class)).D(new w5m(i));
                return Unit.a;
            case 11:
                ((l13) obj).getClass();
                return new m6m();
            case 12:
                ((l13) obj).getClass();
                cib cibVar = new cib(22, new hvl(8));
                l18 l18Var = l18.b;
                bdt I6 = hag.I(m6m.class);
                qdc qdcVar6 = l18Var.a;
                qdcVar6.getClass();
                return new k6m(cibVar, (m6m) qdcVar6.C(I6));
            case 13:
                l13 l13Var8 = (l13) obj;
                l13Var8.getClass();
                return (d6m) ((k6m) l13Var8.a.D(hag.I(k6m.class), l13Var8, l13Var8.b)).b.getValue();
            case 14:
                l13 l13Var9 = (l13) obj;
                l13Var9.getClass();
                return new z6m(l13Var9.b(hag.I(cc7.class), true), l13Var9.b(hag.I(frt.class), true));
            case 15:
                l13 l13Var10 = (l13) obj;
                l13Var10.getClass();
                return new q9k((jtt) l13Var10.a.D(hag.I(jtt.class), l13Var10, l13Var10.b));
            case 16:
                return (d6m) vz1.l((l13) obj, j6m.class);
            case 17:
                o18 o18Var2 = (o18) obj;
                vz1.e(o18Var2, h7m.class).E(new w5m(18));
                o18Var2.b(hag.I(g7m.class)).E(new w5m(19));
                o18Var2.b(hag.I(h8n.class)).E(new w5m(20));
                o18Var2.b(hag.I(e5c.class)).E(new w5m(21));
                o18Var2.b(hag.I(m7m.class)).E(new w5m(i4));
                o18Var2.b(hag.I(n7m.class)).E(new w5m(23));
                o18Var2.b(hag.I(l7m.class)).E(new w5m(i5));
                o18Var2.b(hag.I(x87.class)).E(new w5m(i3));
                return Unit.a;
            case 18:
                ((l13) obj).getClass();
                return new h7m();
            case 19:
                l13 l13Var11 = (l13) obj;
                l13Var11.getClass();
                return new g7m((h7m) l13Var11.a.D(hag.I(h7m.class), l13Var11, l13Var11.b));
            case 20:
                ((l13) obj).getClass();
                l18 l18Var2 = l18.b;
                bdt I7 = hag.I(g7m.class);
                qdc qdcVar7 = l18Var2.a;
                qdcVar7.getClass();
                return (h8n) ((g7m) qdcVar7.C(I7)).e.getValue();
            case 21:
                ((l13) obj).getClass();
                l18 l18Var3 = l18.b;
                bdt I8 = hag.I(g7m.class);
                qdc qdcVar8 = l18Var3.a;
                qdcVar8.getClass();
                return (e5c) ((g7m) qdcVar8.C(I8)).c.getValue();
            case 22:
                ((l13) obj).getClass();
                l18 l18Var4 = l18.b;
                bdt I9 = hag.I(g7m.class);
                qdc qdcVar9 = l18Var4.a;
                qdcVar9.getClass();
                return (m7m) ((g7m) qdcVar9.C(I9)).b.getValue();
            case 23:
                ((l13) obj).getClass();
                l18 l18Var5 = l18.b;
                bdt I10 = hag.I(g7m.class);
                qdc qdcVar10 = l18Var5.a;
                qdcVar10.getClass();
                return (n7m) ((g7m) qdcVar10.C(I10)).a.getValue();
            case 24:
                ((l13) obj).getClass();
                l18 l18Var6 = l18.b;
                bdt I11 = hag.I(g7m.class);
                qdc qdcVar11 = l18Var6.a;
                qdcVar11.getClass();
                return (l7m) ((g7m) qdcVar11.C(I11)).d.getValue();
            case 25:
                ((l13) obj).getClass();
                l18 l18Var7 = l18.b;
                bdt I12 = hag.I(g7m.class);
                qdc qdcVar12 = l18Var7.a;
                qdcVar12.getClass();
                return (x87) ((g7m) qdcVar12.C(I12)).f.getValue();
            case 26:
                l13 l13Var12 = (l13) obj;
                l13Var12.getClass();
                return new n7m(l13Var12);
            case 27:
                l13 l13Var13 = (l13) obj;
                l13Var13.getClass();
                return new m7m(l13Var13);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                l13 l13Var14 = (l13) obj;
                l13Var14.getClass();
                return new h5c((t) l13Var14.a.D(hag.I(t.class), l13Var14, l13Var14.b));
            default:
                l13 l13Var15 = (l13) obj;
                l13Var15.getClass();
                return new l7m(l13Var15);
        }
    }
}

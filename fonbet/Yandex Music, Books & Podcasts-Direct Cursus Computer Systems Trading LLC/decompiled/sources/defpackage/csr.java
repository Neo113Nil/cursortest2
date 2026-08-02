package defpackage;

import android.app.job.JobInfo;
import android.content.Context;
import com.yandex.messenger.websdk.api.MessengerParams;
import com.yandex.messenger.websdk.api.Notification;
import com.yandex.messenger.websdk.api.WebMessenger;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.AppMetricaYandex;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final /* synthetic */ class csr implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ csr(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, srr.class).E(new csr(1));
                o18Var.b(hag.I(bsr.class)).E(new csr(2));
                return Unit.a;
            case 1:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                Context context = (Context) l13Var.a.D(hag.I(Context.class), l13Var, l13Var.b);
                frt frtVar = (frt) l13Var.a.D(hag.I(frt.class), l13Var, l13Var.b);
                apo apoVar = new apo(context);
                e7o e7oVar = new e7o(21);
                vtm vtmVar = new vtm(frtVar);
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                boolean h = ((gsr) ((byb) qdcVar.C(I)).b(gsr.class)).h();
                if (!woe.d(context)) {
                    return new prr(new WebMessenger(context, new MessengerParams(null, false, false, 524208), new mhm(), new itk(), null));
                }
                WebMessenger webMessenger = new WebMessenger(context, new MessengerParams(AppMetricaYandex.getUuid(context), true, h, 262064), new pd5(context, false), new kpm(12, apoVar), new cuk(e7oVar));
                bdt I2 = hag.I(v3i.class);
                qdc qdcVar2 = l18Var.a;
                qdcVar2.getClass();
                String a = ((v3i) qdcVar2.C(I2)).a();
                if (a != null) {
                    hfj hfjVar = (hfj) ((Notification) webMessenger.b.getValue());
                    qdc qdcVar3 = hfjVar.d;
                    vae vaeVar = hfjVar.c;
                    String str = vaeVar.c;
                    if (!a.equals(str)) {
                        if (StringsKt.U(a)) {
                            qdcVar3.sendEvent("wm_push_set_device_id_error", tah.b(new Pair("reason", "empty new deviceId")));
                        } else {
                            if (str != null) {
                                qdcVar3.sendEvent("wm_push_set_device_id_error", tah.b(new Pair("reason", "current device id not equal with new one")));
                            }
                            vaeVar.c = a;
                            vaeVar.a.edit().putString("DEVICE_ID_KEY", a).apply();
                        }
                    }
                }
                return new rrr(webMessenger, vtmVar);
            case 2:
                ((l13) obj).getClass();
                return new bsr();
            case 3:
                vz1.e((o18) obj, orr.class).E(new csr(4));
                return Unit.a;
            case 4:
                ((l13) obj).getClass();
                l18 l18Var2 = l18.b;
                bdt I3 = hag.I(Context.class);
                qdc qdcVar4 = l18Var2.a;
                qdcVar4.getClass();
                return new orr((Context) qdcVar4.C(I3));
            case 5:
                o18 o18Var2 = (o18) obj;
                vz1.e(o18Var2, eyr.class).E(new csr(6));
                o18Var2.b(hag.I(te2.class)).E(new csr(7));
                o18Var2.b(hag.I(lwr.class)).E(new csr(8));
                return Unit.a;
            case 6:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                return new eyr((Context) l13Var2.a.D(hag.I(Context.class), l13Var2, l13Var2.b));
            case 7:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                return new te2((z66) l13Var3.a.D(hag.I(z66.class), l13Var3, l13Var3.b));
            case 8:
                ((l13) obj).getClass();
                return new lwr();
            case 9:
                tmt tmtVar = (tmt) obj;
                tmtVar.getClass();
                return ern.a(tmtVar.getClass());
            case 10:
                return rf0.a((JobInfo.Builder) obj);
            case 11:
                JobInfo.Builder builder = (JobInfo.Builder) obj;
                builder.getClass();
                builder.setRequiredNetworkType(1);
                builder.setPeriodic(Duration.ofDays(1L).toMillis(), Duration.ofHours(1L).toMillis());
                return Unit.a;
            case 12:
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                cko D0 = xjoVar.D0("SELECT DISTINCT work_spec_id FROM SystemIdInfo");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (D0.q()) {
                        arrayList.add(D0.x0(0));
                    }
                    return arrayList;
                } finally {
                    D0.close();
                }
            case 13:
                np3 np3Var = (np3) obj;
                np3Var.getClass();
                float density = np3Var.getDensity() * 8;
                long i = a4g.i(density, nmq.b(np3Var.a.e()));
                long j = d85.b;
                d85 d85Var = new d85(j);
                long j2 = d85.m;
                return np3Var.b(new ahr(y9w.F(u75.h(d85Var, new d85(j2)), 0.0f, density, 10), i, density, y9w.F(u75.h(new d85(j2), new d85(j)), nmq.d(np3Var.a.e()) - density, 0.0f, 12), 1));
            case 14:
                ((jfp) obj).getClass();
                return Unit.a;
            case 15:
                ((Integer) obj).intValue();
                return Unit.a;
            case 16:
                o18 o18Var3 = (o18) obj;
                vz1.e(o18Var3, u3s.class).E(new csr(17));
                o18Var3.b(hag.I(h3s.class)).D(new csr(18));
                return Unit.a;
            case 17:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                return new u3s((nsl) l13Var4.a.D(hag.I(nsl.class), l13Var4, l13Var4.b));
            case 18:
                ((l13) obj).getClass();
                return h3s.a;
            case 19:
                o18 o18Var4 = (o18) obj;
                vz1.e(o18Var4, o4s.class).E(new csr(20));
                o18Var4.c(h5s.a);
                return Unit.a;
            case 20:
                ((l13) obj).getClass();
                return new o4s();
            case 21:
                o18 o18Var5 = (o18) obj;
                vz1.e(o18Var5, t5s.class).E(new csr(29));
                o18Var5.b(hag.I(vx2.class)).E(new d5s(6));
                o18Var5.b(hag.I(k5s.class)).E(new d5s(7));
                o18Var5.b(hag.I(j5s.class)).E(new csr(22));
                o18Var5.b(hag.I(i5s.class)).E(new csr(23));
                o18Var5.b(hag.I(n4s.class)).E(new csr(24));
                o18Var5.b(hag.I(l4s.class)).E(new csr(25));
                o18Var5.b(hag.I(f5s.class)).E(new csr(26));
                o18Var5.b(hag.I(g5s.class)).E(new csr(27));
                o18Var5.b(hag.I(beq.class)).E(new csr(28));
                o18Var5.b(hag.I(uxd.class)).E(new d5s(0));
                o18Var5.b(hag.I(ieq.class)).E(new d5s(1));
                o18Var5.b(hag.I(qg5.class)).E(new d5s(2));
                o18Var5.b(hag.I(c5s.class)).E(new d5s(3));
                o18Var5.b(hag.I(k4s.class)).E(new d5s(4));
                o18Var5.b(hag.I(m4s.class)).E(new d5s(5));
                return Unit.a;
            case 22:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                return new j5s((Context) l13Var5.a.D(hag.I(Context.class), l13Var5, l13Var5.b));
            case 23:
                l13 l13Var6 = (l13) obj;
                l13Var6.getClass();
                bdt I4 = hag.I(Context.class);
                qdc qdcVar5 = l13Var6.a;
                Set set = l13Var6.b;
                return new i5s((Context) qdcVar5.D(I4, l13Var6, set), (o4s) qdcVar5.D(hag.I(o4s.class), l13Var6, set), (j5s) qdcVar5.D(hag.I(j5s.class), l13Var6, set));
            case 24:
                l13 l13Var7 = (l13) obj;
                l13Var7.getClass();
                bdt I5 = hag.I(Context.class);
                qdc qdcVar6 = l13Var7.a;
                Set set2 = l13Var7.b;
                return new n4s((Context) qdcVar6.D(I5, l13Var7, set2), (o4s) qdcVar6.D(hag.I(o4s.class), l13Var7, set2));
            case 25:
                l13 l13Var8 = (l13) obj;
                l13Var8.getClass();
                bdt I6 = hag.I(xj5.class);
                qdc qdcVar7 = l13Var8.a;
                Set set3 = l13Var8.b;
                return new l4s((xj5) qdcVar7.D(I6, l13Var8, set3), (o4s) qdcVar7.D(hag.I(o4s.class), l13Var8, set3));
            case 26:
                ((l13) obj).getClass();
                return new f5s();
            case 27:
                l13 l13Var9 = (l13) obj;
                l13Var9.getClass();
                return new g5s(l13Var9);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                l13 l13Var10 = (l13) obj;
                l13Var10.getClass();
                bdt I7 = hag.I(Context.class);
                qdc qdcVar8 = l13Var10.a;
                Set set4 = l13Var10.b;
                return new beq((Context) qdcVar8.D(I7, l13Var10, set4), (f7l) qdcVar8.D(hag.I(f7l.class), l13Var10, set4), (f5s) qdcVar8.D(hag.I(f5s.class), l13Var10, set4), (t5s) qdcVar8.D(hag.I(t5s.class), l13Var10, set4), (vx2) qdcVar8.D(hag.I(vx2.class), l13Var10, set4), (o4s) qdcVar8.D(hag.I(o4s.class), l13Var10, set4), (z66) qdcVar8.D(hag.I(z66.class), l13Var10, set4));
            default:
                l13 l13Var11 = (l13) obj;
                l13Var11.getClass();
                bdt I8 = hag.I(cc7.class);
                qdc qdcVar9 = l13Var11.a;
                Set set5 = l13Var11.b;
                return new t5s((cc7) qdcVar9.D(I8, l13Var11, set5), (o4s) qdcVar9.D(hag.I(o4s.class), l13Var11, set5));
        }
    }
}

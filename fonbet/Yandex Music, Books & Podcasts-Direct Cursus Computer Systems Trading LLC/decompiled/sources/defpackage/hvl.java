package defpackage;

import com.appsflyer.AppsFlyerLib;
import com.google.gson.Gson;
import com.yandex.music.payment.screen.promocode.viewmodel.a;
import com.yandex.passport.api.h;
import com.yandex.passport.api.q;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class hvl implements Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: Code restructure failed: missing block: B:43:0x013d, code lost:
    
        if (r0 != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0170, code lost:
    
        if (r0 != false) goto L58;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                return new gpj();
            case 1:
                return new opr();
            case 2:
                return new t6k(0.0f);
            case 3:
                return Unit.a;
            case 4:
                return new oyl();
            case 5:
                return Unit.a;
            case 6:
                return AppsFlyerLib.getInstance();
            case 7:
                l18 l18Var = l18.b;
                bdt I = hag.I(qy7.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return ((qy7) qdcVar.C(I)).a();
            case 8:
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(le7.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                String str = r9k.PRODUCTION.a;
                q qVar = h.b;
                int parseInt = Integer.parseInt(str);
                qVar.getClass();
                h a = q.a(parseInt);
                if (a != null) {
                    return a;
                }
                xq0.x("Required value was null.");
                return null;
            case 9:
                jyr jyrVar = p6m.f;
                l18 l18Var3 = l18.b;
                bdt I3 = hag.I(byb.class);
                qdc qdcVar3 = l18Var3.a;
                qdcVar3.getClass();
                return (p6m) ((byb) qdcVar3.C(I3)).c(ern.a(p6m.class));
            case 10:
                jyr jyrVar2 = p6m.f;
                Boolean a2 = ((jxb) o6m.a().e.getValue()).a("enabled");
                return Boolean.valueOf((a2 != null ? a2.booleanValue() : false) && !Intrinsics.d(o6m.a().b(), "force_disabled"));
            case 11:
                jyr jyrVar3 = p6m.f;
                if (((Boolean) p6m.g.getValue()).booleanValue()) {
                    Boolean a3 = ((jxb) o6m.a().e.getValue()).a("managing_plus_devices_screen_enabled");
                    if (a3 == null) {
                        z = false;
                        break;
                    } else {
                        z = a3.booleanValue();
                        break;
                    }
                }
                r3 = false;
                return Boolean.valueOf(r3);
            case 12:
                jyr jyrVar4 = p6m.f;
                if (o6m.c()) {
                    Boolean a4 = ((jxb) o6m.a().e.getValue()).a("music_launch_prohibited");
                    if (a4 == null) {
                        z2 = false;
                        break;
                    } else {
                        z2 = a4.booleanValue();
                        break;
                    }
                }
                r3 = false;
                return Boolean.valueOf(r3);
            case 13:
                jyr jyrVar5 = p7m.e;
                l18 l18Var4 = l18.b;
                bdt I4 = hag.I(byb.class);
                qdc qdcVar4 = l18Var4.a;
                qdcVar4.getClass();
                return (p7m) ((byb) qdcVar4.C(I4)).c(ern.a(p7m.class));
            case 14:
                return Unit.a;
            case 15:
                return Unit.a;
            case 16:
                return new tam();
            case 17:
                return new cvo(wjb.CollectionPodcastScreen, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60);
            case 18:
                return new t6k(0.0f);
            case 19:
                return Unit.a;
            case 20:
                return new uem();
            case 21:
                return new vem();
            case 22:
                return (aim) l18.b.c(hag.I(aim.class));
            case 23:
                return new njm();
            case 24:
                return (n8q) sk3.I(n8q.class);
            case 25:
                return (frt) sk3.I(frt.class);
            case 26:
                return qld.m();
            case 27:
                return Boolean.valueOf(lxe.l() instanceof c0b);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                l18 l18Var5 = l18.b;
                bdt I5 = hag.I(byb.class);
                qdc qdcVar5 = l18Var5.a;
                qdcVar5.getClass();
                return Boolean.valueOf(((k94) ((byb) qdcVar5.C(I5)).c(ern.a(k94.class))).h());
            default:
                l18 l18Var6 = l18.b;
                bdt I6 = hag.I(uz1.class);
                qdc qdcVar6 = l18Var6.a;
                qdcVar6.getClass();
                uz1 uz1Var = (uz1) qdcVar6.C(I6);
                bdt I7 = hag.I(Gson.class);
                qdc qdcVar7 = l18Var6.a;
                qdcVar7.getClass();
                Gson gson = (Gson) qdcVar7.C(I7);
                bdt I8 = hag.I(ioi.class);
                qdc qdcVar8 = l18Var6.a;
                qdcVar8.getClass();
                ioi ioiVar = (ioi) qdcVar8.C(I8);
                nmb m = qld.m();
                bdt I9 = hag.I(frt.class);
                qdc qdcVar9 = l18Var6.a;
                qdcVar9.getClass();
                frt frtVar = (frt) qdcVar9.C(I9);
                bdt I10 = hag.I(r18.class);
                qdc qdcVar10 = l18Var6.a;
                qdcVar10.getClass();
                return new a(uz1Var, gson, ioiVar, new lum(m, frtVar, (r18) qdcVar10.C(I10)));
        }
    }

    public /* synthetic */ hvl(int i) {
        this.a = i;
    }
}

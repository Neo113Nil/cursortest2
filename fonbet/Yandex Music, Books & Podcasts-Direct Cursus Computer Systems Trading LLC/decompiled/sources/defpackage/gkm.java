package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import com.yandex.music.shared.radio.recommendation.RotorApi;
import com.yandex.passport.api.g;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.payment.pay.PromoCodeWebViewActivity;
import ru.yandex.music.push.update.PushApi;

/* loaded from: classes6.dex */
public final /* synthetic */ class gkm implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ gkm(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = 23;
        int i2 = 18;
        int i3 = 8;
        switch (this.a) {
            case 0:
                ((l13) obj).getClass();
                return new lkm();
            case 1:
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                cko D0 = xjoVar.D0("SELECT * FROM pre_save_operation");
                try {
                    int v = s7g.v(D0, "pre_save_id");
                    int v2 = s7g.v(D0, "artist_id");
                    int v3 = s7g.v(D0, "type");
                    ArrayList arrayList = new ArrayList();
                    while (D0.q()) {
                        arrayList.add(new wkm(D0.x0(v), D0.x0(v2), D0.x0(v3)));
                    }
                    return arrayList;
                } finally {
                    D0.close();
                }
            case 2:
                zco zcoVar = (zco) obj;
                zcoVar.getClass();
                zcoVar.d(1);
                return Unit.a;
            case 3:
                jx7 jx7Var = (jx7) obj;
                jx7Var.getClass();
                float n0 = jx7Var.n0(18);
                float n02 = jx7Var.n0(2);
                return new enj((Float.floatToRawIntBits(n0) << 32) | (Float.floatToRawIntBits(n02) & 4294967295L));
            case 4:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, cx.class).E(new gkm(5));
                o18Var.b(hag.I(gx.class)).E(new gkm(6));
                return Unit.a;
            case 5:
                ((l13) obj).getClass();
                return new cx(new le3(4));
            case 6:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return (gx) ((cx) l13Var.a.D(hag.I(cx.class), l13Var, l13Var.b)).c.getValue();
            case 7:
                int i4 = PromoCodeWebViewActivity.w;
                ((Resources) obj).getClass();
                return Boolean.TRUE;
            case 8:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.q(jfpVar, 0);
                return Unit.a;
            case 9:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.g(jfpVar2);
                return Unit.a;
            case 10:
                ((jfp) obj).getClass();
                return Unit.a;
            case 11:
                o18 o18Var2 = (o18) obj;
                vz1.e(o18Var2, u4n.class).E(new gkm(12));
                o18Var2.b(hag.I(x4n.class)).E(new gkm(13));
                o18Var2.b(hag.I(n9k.class)).E(new gkm(14));
                o18Var2.b(hag.I(p4n.class)).E(new gkm(15));
                return Unit.a;
            case 12:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                SharedPreferences sharedPreferences = ((Context) l13Var2.a.D(hag.I(Context.class), l13Var2, l13Var2.b)).getSharedPreferences("prefs.push.send", 0);
                sharedPreferences.getClass();
                return new u4n(sharedPreferences);
            case 13:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                return new x4n((PushApi) ((e0j) l13Var3.a.D(hag.I(e0j.class), l13Var3, l13Var3.b)).a.b(PushApi.class));
            case 14:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                return new n9k((g) l13Var4.a.D(hag.I(g.class), l13Var4, l13Var4.b));
            case 15:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                mvn mvnVar = new mvn(i);
                bdt I = hag.I(u4n.class);
                qdc qdcVar = l13Var5.a;
                Set set = l13Var5.b;
                return new p4n((u4n) qdcVar.D(I, l13Var5, set), (x4n) qdcVar.D(hag.I(x4n.class), l13Var5, set), mvnVar);
            case 16:
                jfp jfpVar3 = (jfp) obj;
                jfpVar3.getClass();
                wfp.e(jfpVar3);
                return Unit.a;
            case 17:
                jfp jfpVar4 = (jfp) obj;
                jfpVar4.getClass();
                wfp.q(jfpVar4, 0);
                return Unit.a;
            case 18:
                ((jfp) obj).getClass();
                return Unit.a;
            case 19:
                zco zcoVar2 = (zco) obj;
                zcoVar2.getClass();
                zcoVar2.c(false);
                return Unit.a;
            case 20:
                h4q h4qVar = (h4q) obj;
                h4qVar.getClass();
                return Float.valueOf(h4qVar.a);
            case 21:
                n4q n4qVar = (n4q) obj;
                n4qVar.getClass();
                return Float.valueOf(n4qVar.a);
            case 22:
                vz1.e((o18) obj, mfn.class).E(new gkm(i));
                return Unit.a;
            case 23:
                ((l13) obj).getClass();
                l18 l18Var = l18.b;
                bdt I2 = hag.I(i0j.class);
                qdc qdcVar2 = l18Var.a;
                qdcVar2.getClass();
                e0j a = i0j.a((i0j) qdcVar2.C(I2), null, null, new e5o(i3), null, 55);
                RotorApi rotorApi = (RotorApi) a.a.b(RotorApi.class);
                rotorApi.getClass();
                return new mfn(new ofo(rotorApi));
            case 24:
                l13 l13Var6 = (l13) obj;
                l13Var6.getClass();
                bdt I3 = hag.I(fni.class);
                qdc qdcVar3 = l13Var6.a;
                Set set2 = l13Var6.b;
                bhn bhnVar = new bhn(((fni) qdcVar3.D(I3, l13Var6, set2)).d.c);
                mn7 mn7Var = dm6.b;
                i0j i0jVar = (i0j) qdcVar3.D(hag.I(i0j.class), l13Var6, set2);
                mn7Var.getClass();
                y8p y8pVar = (y8p) new z6u(bhnVar, mn7Var, i0jVar).d;
                z6u z6uVar = (z6u) y8pVar.b;
                bhn bhnVar2 = (bhn) y8pVar.c;
                vw5 vw5Var = new vw5(btf.b(new xes(11, z6uVar, bhnVar2)));
                return new sfn(new jtc(new kpm(i2, vw5Var), new y6u(vw5Var, z6uVar, bhnVar2)));
            case 25:
                l13 l13Var7 = (l13) obj;
                l13Var7.getClass();
                e0j a2 = i0j.a((i0j) l13Var7.a.D(hag.I(i0j.class), l13Var7, l13Var7.b), null, null, new e5o(i3), null, 55);
                RotorApi rotorApi2 = (RotorApi) a2.a.b(RotorApi.class);
                rotorApi2.getClass();
                return new ofo(rotorApi2);
            case 26:
                vz1.e((o18) obj, ein.class).E(new gkm(27));
                return Unit.a;
            case 27:
                l13 l13Var8 = (l13) obj;
                l13Var8.getClass();
                bdt I4 = hag.I(Context.class);
                qdc qdcVar4 = l13Var8.a;
                Set set3 = l13Var8.b;
                return new ein((Context) qdcVar4.D(I4, l13Var8, set3), (frt) qdcVar4.D(hag.I(frt.class), l13Var8, set3), (ku0) qdcVar4.D(hag.I(ku0.class), l13Var8, set3), (kij) qdcVar4.D(hag.I(kij.class), l13Var8, set3), (uaa) qdcVar4.D(hag.I(uaa.class), l13Var8, set3));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((jfp) obj).getClass();
                return Unit.a;
            default:
                ((jfp) obj).getClass();
                return Unit.a;
        }
    }
}

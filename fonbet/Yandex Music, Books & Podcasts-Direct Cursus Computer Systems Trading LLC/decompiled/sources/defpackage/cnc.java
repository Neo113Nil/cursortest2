package defpackage;

import com.google.gson.GsonBuilder;
import com.yandex.music.shared.gdpr.data.GdprApi;
import com.yandex.music.shared.generative.FeedbackResponseDto;
import com.yandex.music.shared.generative.data.GenerativeApi;
import com.yandex.pulse.metrics.o;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class cnc implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ cnc(e00 e00Var) {
        this.a = 24;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((jsk) obj).getClass();
                return Unit.a;
            case 1:
                ((jsk) obj).getClass();
                return Unit.a;
            case 2:
                ((jsk) obj).getClass();
                return Unit.a;
            case 3:
                ((jsk) obj).getClass();
                return Unit.a;
            case 4:
                ((jsk) obj).getClass();
                return Unit.a;
            case 5:
                vz1.e((o18) obj, lwc.class).E(new cnc(6));
                return Unit.a;
            case 6:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new lwc(l13Var.b(hag.I(frt.class), true), l13Var.b(hag.I(v1u.class), true), new m88(), (cpr) l13Var.a.D(hag.I(cpr.class), l13Var, l13Var.b));
            case 7:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                return new xwc(l13Var2.b(hag.I(k5m.class), true), l13Var2.b(hag.I(sw0.class), true), l13Var2.b(hag.I(mh7.class), true));
            case 8:
                z0d z0dVar = (z0d) obj;
                z0dVar.getClass();
                return z0d.a(z0dVar, 0, 0, null, z0dVar.e.size() > 1, 95);
            case 9:
                z0d z0dVar2 = (z0d) obj;
                z0dVar2.getClass();
                int size = (z0dVar2.b + 1) % z0dVar2.e.size();
                return z0d.a(z0dVar2, size, size, null, false, 121);
            case 10:
                o18 o18Var = (o18) obj;
                vz1.e(o18Var, h1d.class).E(new cnc(11));
                o18Var.b(hag.I(k1d.class)).E(new cnc(12));
                return Unit.a;
            case 11:
                ((l13) obj).getClass();
                return new h1d();
            case 12:
                ((l13) obj).getClass();
                return new k1d(new fi1(2));
            case 13:
                o18 o18Var2 = (o18) obj;
                vz1.e(o18Var2, q1d.class).E(new cnc(14));
                o18Var2.b(hag.I(r2d.class)).D(new cnc(15));
                o18Var2.b(hag.I(z1d.class)).D(new cnc(16));
                o18Var2.b(hag.I(w1d.class)).E(new cnc(17));
                o18Var2.b(hag.I(q2d.class)).E(new cnc(18));
                o18Var2.b(hag.I(y1d.class)).E(new cnc(19));
                return Unit.a;
            case 14:
                ((l13) obj).getClass();
                return new q1d(1);
            case 15:
                ((l13) obj).getClass();
                return new r2d();
            case 16:
                ((l13) obj).getClass();
                return new z1d();
            case 17:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                return new w1d((z1d) l13Var3.a.D(hag.I(z1d.class), l13Var3, l13Var3.b));
            case 18:
                l13 l13Var4 = (l13) obj;
                l13Var4.getClass();
                return new q2d((r2d) l13Var4.a.D(hag.I(r2d.class), l13Var4, l13Var4.b));
            case 19:
                l13 l13Var5 = (l13) obj;
                l13Var5.getClass();
                return (y1d) ((w1d) l13Var5.a.D(hag.I(w1d.class), l13Var5, l13Var5.b)).b.getValue();
            case 20:
                l13 l13Var6 = (l13) obj;
                l13Var6.getClass();
                return new p2d(l13Var6.b(hag.I(cc7.class), true), l13Var6.b(hag.I(frt.class), true));
            case 21:
                l13 l13Var7 = (l13) obj;
                l13Var7.getClass();
                return new v1d(l13Var7.b(hag.I(t1d.class), true), l13Var7.b(hag.I(p2d.class), true));
            case 22:
                l13 l13Var8 = (l13) obj;
                l13Var8.getClass();
                return new r1d(l13Var8.b(hag.I(q1d.class), true), l13Var8.b(hag.I(v1d.class), true));
            case 23:
                l13 l13Var9 = (l13) obj;
                l13Var9.getClass();
                return new t1d(l13Var9.b(hag.I(GdprApi.class), true));
            case 24:
                ((l13) obj).getClass();
                return pd.t(new qzm[0]);
            case 25:
                vz1.e((o18) obj, v3d.class).E(new cnc(26));
                return Unit.a;
            case 26:
                l13 l13Var10 = (l13) obj;
                l13Var10.getClass();
                bdt I = hag.I(b5d.class);
                qdc qdcVar = l13Var10.a;
                Set set = l13Var10.b;
                return new v3d((b5d) qdcVar.D(I, l13Var10, set), (q4d) qdcVar.D(hag.I(q4d.class), l13Var10, set));
            case 27:
                GsonBuilder gsonBuilder = (GsonBuilder) obj;
                gsonBuilder.getClass();
                gsonBuilder.b(FeedbackResponseDto.class, new FeedbackResponseDto.Deserializer());
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                l13 l13Var11 = (l13) obj;
                l13Var11.getClass();
                return new b5d((GenerativeApi) i0j.a((i0j) l13Var11.a.D(hag.I(i0j.class), l13Var11, l13Var11.b), null, new cnc(27), new htb(18), null, 51).a.b(GenerativeApi.class));
            default:
                l13 l13Var12 = (l13) obj;
                l13Var12.getClass();
                bdt I2 = hag.I(fni.class);
                qdc qdcVar2 = l13Var12.a;
                Set set2 = l13Var12.b;
                return new q4d((udp) qdcVar2.D(hag.I(udp.class), l13Var12, set2));
        }
    }

    public /* synthetic */ cnc(int i) {
        this.a = i;
    }
}

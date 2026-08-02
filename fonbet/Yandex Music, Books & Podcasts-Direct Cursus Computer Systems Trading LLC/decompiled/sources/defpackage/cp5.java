package defpackage;

import android.os.Bundle;
import android.os.Handler;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class cp5 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ cp5(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Unit.a;
            case 1:
                return Unit.a;
            case 2:
                return Float.valueOf(0.0f);
            case 3:
                return Unit.a;
            case 4:
                return Unit.a;
            case 5:
                return Unit.a;
            case 6:
                return Unit.a;
            case 7:
                return new Bundle();
            case 8:
                return new ju5();
            case 9:
                l18 l18Var = l18.b;
                bdt I = hag.I(upq.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return new i06((upq) qdcVar.C(I));
            case 10:
                return new lnq();
            case 11:
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(o36.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                return new vv5((o36) qdcVar2.C(I2), bz5.a());
            case 12:
                az5 az5Var = az5.a;
                return new zz5();
            case 13:
                return new dy5();
            case 14:
                l18 l18Var3 = l18.b;
                bdt I3 = hag.I(byb.class);
                qdc qdcVar3 = l18Var3.a;
                qdcVar3.getClass();
                return Boolean.valueOf(((r36) ((byb) qdcVar3.C(I3)).c(ern.a(r36.class))).h());
            case 15:
                return new n06(new o06(0, 4), new o06(4, -1));
            case 16:
                return null;
            case 17:
                l18 l18Var4 = l18.b;
                bdt I4 = hag.I(byb.class);
                qdc qdcVar4 = l18Var4.a;
                qdcVar4.getClass();
                return Boolean.valueOf(((k94) ((byb) qdcVar4.C(I4)).c(ern.a(k94.class))).h());
            case 18:
                Handler handler = (Handler) d5w.b.getValue();
                int i = csd.a;
                return new bsd(handler, null, false);
            case 19:
                return Float.valueOf(0.89f);
            case 20:
                return Unit.a;
            case 21:
                return Unit.a;
            case 22:
                l18 l18Var5 = l18.b;
                bdt I5 = hag.I(fbw.class);
                qdc qdcVar5 = l18Var5.a;
                qdcVar5.getClass();
                return fbw.a((fbw) qdcVar5.C(I5));
            case 23:
                return new xts();
            case 24:
                return new h3u();
            case 25:
                jyr jyrVar = su6.e;
                return Boolean.valueOf(((su6) ((byb) l18.b.c(hag.I(byb.class))).b(su6.class)).h());
            case 26:
                return Long.valueOf(System.currentTimeMillis());
            case 27:
                w2f p = saf.p();
                p.U(Unit.a);
                p.g(null);
                return p;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new zf6(ern.a(md.class), (t9f) null, new t9f[0]);
            default:
                return Unit.a;
        }
    }

    public /* synthetic */ cp5(int i, Object obj) {
        this.a = i;
    }
}

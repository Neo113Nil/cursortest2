package defpackage;

import android.content.Context;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class ufl implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ ufl(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return asq.K(frc.a.g, new hcl(10));
            case 1:
                return Boolean.valueOf(((q36) ((byb) l18.b.c(hag.I(byb.class))).b(q36.class)).h());
            case 2:
                return new agl();
            case 3:
                return new p2m();
            case 4:
                jyr jyrVar = oil.e;
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return Boolean.valueOf(((oil) ((byb) qdcVar.C(I)).c(ern.a(oil.class))).h());
            case 5:
                dfi.r("Invalid overflow playable type", "PlayerScreenActionsImpl");
                return Unit.a;
            case 6:
                return Unit.a;
            case 7:
                dfi.r("Invalid share playable type", "PlayerScreenActionsImpl");
                return Unit.a;
            case 8:
                return new wil();
            case 9:
                return new u0s("", 1, false);
            case 10:
                return new mnl(new dx5(1));
            case 11:
                ckl cklVar = new ckl();
                l18 l18Var2 = l18.b;
                return new pfr((loq) l18Var2.c(hag.I(loq.class)), cklVar, (moq) l18Var2.c(hag.I(moq.class)), null, null);
            case 12:
                return new dkl();
            case 13:
                return (zpl) l18.b.c(hag.I(zpl.class));
            case 14:
                return new ekl(1);
            case 15:
                Long e = ((opq) ((byb) l18.b.c(hag.I(byb.class))).b(opq.class)).a().e("timeout");
                return Long.valueOf(e != null ? e.longValue() : 600L);
            case 16:
                return new pjl();
            case 17:
                return new fkl();
            case 18:
                return new gkl();
            case 19:
                l18 l18Var3 = l18.b;
                bdt I2 = hag.I(xul.class);
                qdc qdcVar2 = l18Var3.a;
                qdcVar2.getClass();
                return (bdc) ((xul) qdcVar2.C(I2)).b.getValue();
            case 20:
                return szf.g0(null);
            case 21:
                return new p2m();
            case 22:
                return new lnl();
            case 23:
                jyr jyrVar2 = onl.e;
                l18 l18Var4 = l18.b;
                bdt I3 = hag.I(byb.class);
                qdc qdcVar3 = l18Var4.a;
                qdcVar3.getClass();
                return Boolean.valueOf(((onl) ((byb) qdcVar3.C(I3)).c(ern.a(onl.class))).h());
            case 24:
                ov6 ov6Var = orl.a;
                return null;
            case 25:
                return new wbb();
            case 26:
                l18 l18Var5 = l18.b;
                return new vxr((Context) l18Var5.c(hag.I(Context.class)), (z66) l18Var5.c(hag.I(z66.class)));
            case 27:
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return Unit.a;
            default:
                return new m2m();
        }
    }
}

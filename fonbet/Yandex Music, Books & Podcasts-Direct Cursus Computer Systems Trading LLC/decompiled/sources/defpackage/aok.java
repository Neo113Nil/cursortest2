package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.gson.Gson;
import com.yandex.music.shared.player.informer.data.storage.a;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class aok implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ aok(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return "PhonotekaSyncApi";
            case 1:
                jyr jyrVar = iok.e;
                return (iok) ((byb) l18.b.c(hag.I(byb.class))).b(iok.class);
            case 2:
                jyr jyrVar2 = xpk.e;
                return (xpk) ((byb) l18.b.c(hag.I(byb.class))).b(xpk.class);
            case 3:
                return ((g2q) l18.b.c(hag.I(g2q.class))).f;
            case 4:
                return new etk();
            case 5:
                l18 l18Var = l18.b;
                bdt I = hag.I(fbw.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return fbw.a((fbw) qdcVar.C(I));
            case 6:
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(fbw.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                return fbw.a((fbw) qdcVar2.C(I2));
            case 7:
                return new dzs();
            case 8:
                return (gp4) l18.b.c(hag.I(gp4.class));
            case 9:
                return Unit.a;
            case 10:
                return Unit.a;
            case 11:
                return new agn();
            case 12:
                dfi.r("Invalid share playable type", "PlayerActionsImpl");
                return Unit.a;
            case 13:
                return Unit.a;
            case 14:
                dfi.r("Invalid overflow playable type", "PlayerActionsImpl");
                return Boolean.FALSE;
            case 15:
                HandlerThread handlerThread = new HandlerThread("Music:Player", -16);
                handlerThread.start();
                return handlerThread;
            case 16:
                return ((HandlerThread) mal.a.getValue()).getLooper();
            case 17:
                return new Handler(mal.c());
            case 18:
                Handler handler = (Handler) mal.c.getValue();
                int i = csd.a;
                return new bsd(handler, "Music:Player", false);
            case 19:
                return ((bsd) mal.d.getValue()).g;
            case 20:
                return new nnl();
            case 21:
                return new zll();
            case 22:
                ddl ddlVar = jdl.G;
                return new j4l();
            case 23:
                return new Gson();
            case 24:
                return new a();
            case 25:
                return new sfl(new aok(29));
            case 26:
                return new rfl(wct.s());
            case 27:
                return new tfl();
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new vfl();
            default:
                l18 l18Var3 = l18.b;
                bdt I3 = hag.I(byb.class);
                qdc qdcVar3 = l18Var3.a;
                qdcVar3.getClass();
                return Boolean.valueOf(((ub1) ((byb) qdcVar3.C(I3)).b(ub1.class)).e.getValue() instanceof qb1);
        }
    }
}

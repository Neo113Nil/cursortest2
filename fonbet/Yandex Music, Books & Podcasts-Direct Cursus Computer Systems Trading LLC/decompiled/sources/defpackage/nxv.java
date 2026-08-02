package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import com.yandex.music.design.components.button.YandexBooksGradientViewButton;
import com.yandex.passport.api.g;
import com.yandex.pulse.metrics.o;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.YMApplication;

/* loaded from: classes4.dex */
public final /* synthetic */ class nxv implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ nxv(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return "WizardApi";
            case 1:
                return szf.g0(Boolean.FALSE);
            case 2:
                heh hehVar = heh.a;
                oyv oyvVar = new oyv();
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                oyvVar.a = e5bVar;
                return oyvVar;
            case 3:
                return Float.valueOf(Float.POSITIVE_INFINITY);
            case 4:
                return new lhs("WizardMatrix", null == true ? 1 : 0, 30);
            case 5:
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return Boolean.valueOf(((a4q) ((byb) qdcVar.C(I)).c(ern.a(a4q.class))).h());
            case 6:
                throw new IllegalStateException("WizardUiConfig is not initialized");
            case 7:
                return new d0w();
            case 8:
                return u75.h(new Pair(Float.valueOf(0.0f), 1627389951), new Pair(Float.valueOf(0.4f), 1627389951), new Pair(Float.valueOf(0.8f), 1627389951));
            case 9:
                return new kjn(null == true ? 1 : 0);
            case 10:
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
            case 11:
                HandlerThread handlerThread = new HandlerThread("Music:GlobalWorker");
                handlerThread.start();
                return handlerThread;
            case 12:
                return new Handler(((HandlerThread) d5w.a.getValue()).getLooper());
            case 13:
                ju0 ju0Var = YMApplication.d;
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(zza.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                ((zza) qdcVar2.C(I2)).c();
                return Unit.a;
            case 14:
                ju0 ju0Var2 = YMApplication.d;
                return (g) l18.b.c(hag.I(g.class));
            case 15:
                ju0 ju0Var3 = YMApplication.d;
                return (frt) l18.b.c(hag.I(frt.class));
            case 16:
                ju0 ju0Var4 = YMApplication.d;
                l18 l18Var3 = l18.b;
                bdt I3 = hag.I(z66.class);
                qdc qdcVar3 = l18Var3.a;
                qdcVar3.getClass();
                return ((z66) qdcVar3.C(I3)).e();
            case 17:
                int i = YandexBooksGradientViewButton.j;
                return Unit.a;
            case 18:
                return new ocr();
            case 19:
                return new dcr();
            case 20:
                return new tcr();
            case 21:
                return new inf();
            case 22:
                return new enf();
            case 23:
                return new k2a();
            case 24:
                return Boolean.valueOf(Intrinsics.d(((gg0) ((byb) l18.b.c(hag.I(byb.class))).b(gg0.class)).b(), "on_with_logs"));
            case 25:
                return Boolean.valueOf(nfc.e.get());
            case 26:
                l18 l18Var4 = l18.b;
                bdt I4 = hag.I(byb.class);
                qdc qdcVar4 = l18Var4.a;
                qdcVar4.getClass();
                p18 p18Var = (p18) ((byb) qdcVar4.C(I4)).c(ern.a(p18.class));
                return Boolean.valueOf(Intrinsics.d(p18Var.b(), "on_bundle") || Intrinsics.d(p18Var.b(), "on_neg_bundle"));
            case 27:
                return Boolean.valueOf(((gap) ((byb) l18.b.c(hag.I(byb.class))).b(gap.class)).h());
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                jyr jyrVar = su6.e;
                return Boolean.valueOf(vq1.T());
            default:
                return Boolean.valueOf(((i4j) ((byb) l18.b.c(hag.I(byb.class))).b(i4j.class)).h());
        }
    }

    public /* synthetic */ nxv(int i, Object obj) {
        this.a = i;
    }
}

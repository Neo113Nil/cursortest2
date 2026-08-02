package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.kinopoisk.sdk.easylogin.api.EasyLoginApi;
import ru.yandex.music.emergency.EmergencyService;

/* loaded from: classes3.dex */
public final /* synthetic */ class tka implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ tka(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                l18 l18Var = l18.b;
                bdt I = hag.I(cce.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                pkn c = ((cce) qdcVar.C(I)).c();
                if (c != null) {
                    l78 l78Var = c.b;
                    synchronized (l78Var) {
                        try {
                            l78Var.o();
                            for (e78 e78Var : (e78[]) l78Var.f.values().toArray(new e78[0])) {
                                l78Var.P(e78Var);
                            }
                            l78Var.n = false;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return Unit.a;
            case 1:
                throw new uej(null, 1, null);
            case 2:
                return Float.valueOf(0.88f);
            case 3:
                return new lnq();
            case 4:
                return new td(18);
            case 5:
                return new gwa();
            case 6:
                return new gwa();
            case 7:
                return new iva();
            case 8:
                throw new IllegalStateException("DynamicOverlayUiConfig is not initialized");
            case 9:
                return new u0s("", 1, false);
            case 10:
                htr H = swf.H();
                H.getClass();
                htr htrVar = htr.h;
                return H == htrVar ? EasyLoginApi.Language.RU : swf.G() == htrVar ? EasyLoginApi.Language.RU : EasyLoginApi.Language.RU;
            case 11:
                return new lnq();
            case 12:
                return new lnq();
            case 13:
                int i = EmergencyService.b;
                HandlerThread handlerThread = new HandlerThread("waiter");
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            case 14:
                return new q9b(d85.n);
            case 15:
                return qld.m();
            case 16:
                return new leb();
            case 17:
                return new meb();
            case 18:
                return Unit.a;
            case 19:
                return qld.m();
            case 20:
                return qld.m();
            case 21:
                return qld.m();
            case 22:
                return qld.m();
            case 23:
                return qld.m();
            case 24:
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(i0j.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                return ((i0j) qdcVar2.C(I2)).b(new evj((rao) null, (String) null, (ozw) null, (Function1) null, 63)).a;
            case 25:
                jyr jyrVar = osb.e;
                return Boolean.valueOf(((osb) ((byb) l18.b.c(hag.I(byb.class))).b(osb.class)).h());
            case 26:
                return new f3();
            case 27:
                return new yl();
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new jtb();
            default:
                return new rm1();
        }
    }
}

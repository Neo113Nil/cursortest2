package defpackage;

import android.os.Bundle;
import android.os.HandlerThread;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.webview.WebViewScreenActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class h8v implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ h8v(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return ((o3w) ((byb) qdcVar.C(I)).b(o3w.class)).e;
            case 1:
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(byb.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                return (bqi) ((q3w) ((byb) qdcVar2.C(I2)).b(q3w.class)).e.getValue();
            case 2:
                l18 l18Var3 = l18.b;
                bdt I3 = hag.I(byb.class);
                qdc qdcVar3 = l18Var3.a;
                qdcVar3.getClass();
                return (bqi) ((n3w) ((byb) qdcVar3.C(I3)).b(n3w.class)).e.getValue();
            case 3:
                l18 l18Var4 = l18.b;
                bdt I4 = hag.I(byb.class);
                qdc qdcVar4 = l18Var4.a;
                qdcVar4.getClass();
                return (bqi) ((p3w) ((byb) qdcVar4.C(I4)).b(p3w.class)).e.getValue();
            case 4:
                l18 l18Var5 = l18.b;
                bdt I5 = hag.I(byb.class);
                qdc qdcVar5 = l18Var5.a;
                qdcVar5.getClass();
                return (bqi) ((g4v) ((byb) qdcVar5.C(I5)).b(g4v.class)).e.getValue();
            case 5:
                l18 l18Var6 = l18.b;
                bdt I6 = hag.I(byb.class);
                qdc qdcVar6 = l18Var6.a;
                qdcVar6.getClass();
                return (bqi) ((f4v) ((byb) qdcVar6.C(I6)).b(f4v.class)).e.getValue();
            case 6:
                l18 l18Var7 = l18.b;
                bdt I7 = hag.I(byb.class);
                qdc qdcVar7 = l18Var7.a;
                qdcVar7.getClass();
                return (bqi) ((j4v) ((byb) qdcVar7.C(I7)).b(j4v.class)).e.getValue();
            case 7:
                return new y7v();
            case 8:
                return new lnq();
            case 9:
                return null;
            case 10:
                HandlerThread handlerThread = new HandlerThread("Logic");
                handlerThread.start();
                return handlerThread.getLooper();
            case 11:
                return new ote();
            case 12:
                return new imf();
            case 13:
                return new Bundle();
            case 14:
                int i = WebViewScreenActivity.A;
                return dfv.class;
            case 15:
                throw new IllegalStateException("WebViewScreenUiConfig is not initialized");
            case 16:
                l18 l18Var8 = l18.b;
                bdt I8 = hag.I(byb.class);
                qdc qdcVar8 = l18Var8.a;
                qdcVar8.getClass();
                return Boolean.valueOf(((yjv) ((byb) qdcVar8.C(I8)).c(ern.a(yjv.class))).h());
            case 17:
                l18 l18Var9 = l18.b;
                bdt I9 = hag.I(byb.class);
                qdc qdcVar9 = l18Var9.a;
                qdcVar9.getClass();
                return Boolean.valueOf(((a4q) ((byb) qdcVar9.C(I9)).c(ern.a(a4q.class))).h());
            case 18:
                return new qmv();
            case 19:
                return new sai(false);
            case 20:
                return frv.a();
            case 21:
                qs5 qs5Var = irv.a;
                return null;
            case 22:
                return szf.g0(Boolean.TRUE);
            case 23:
                return Unit.a;
            case 24:
                return Unit.a;
            case 25:
                return new lhs("WizardArtistLoading", 60, 24);
            case 26:
                throw new IllegalStateException("WizardContentUiConfig is not initialized");
            case 27:
                l18 l18Var10 = l18.b;
                bdt I10 = hag.I(a6e.class);
                qdc qdcVar10 = l18Var10.a;
                qdcVar10.getClass();
                return a6e.a((a6e) qdcVar10.C(I10));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new iuv();
            default:
                return qld.l;
        }
    }

    public /* synthetic */ h8v(int i, Object obj) {
        this.a = i;
    }
}

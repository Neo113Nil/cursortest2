package defpackage;

import android.net.Uri;
import com.yandex.music.screen.landing.api.header.ui.view.BottomsheetCollapsingTopBar;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;

/* loaded from: classes3.dex */
public final /* synthetic */ class uf3 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ uf3(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                int i = BottomsheetCollapsingTopBar.q;
                return Unit.a;
            case 1:
                return Unit.a;
            case 2:
                Boolean bool = (Boolean) xju.e.getValue();
                bool.booleanValue();
                return bool;
            case 3:
                return new Uri.Builder().scheme("content").authority("androidx.car.app.connection").build();
            case 4:
                return "CardsFragment required params";
            case 5:
                return "CardsApiOld";
            case 6:
                return new a04();
            case 7:
                return new tz3(1);
            case 8:
                return new tz3(0);
            case 9:
                return new by4();
            case 10:
                return new ey4();
            case 11:
                return new n15();
            case 12:
                return new iy4();
            case 13:
                return new q15();
            case 14:
                l18 l18Var = l18.b;
                bdt I = hag.I(p3u.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return new x55((p3u) qdcVar.C(I));
            case 15:
                return new o34();
            case 16:
                return new p34();
            case 17:
                return new j34();
            case 18:
                return qld.m();
            case 19:
                return Unit.a;
            case 20:
                return Unit.a;
            case 21:
                return Unit.a;
            case 22:
                return Unit.a;
            case 23:
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(byb.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                return Boolean.valueOf(((k94) ((byb) qdcVar2.C(I2)).c(ern.a(k94.class))).h());
            case 24:
                return (pf4) sk3.I(pf4.class);
            case 25:
                return Unit.a;
            case 26:
                return Unit.a;
            case 27:
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new dml();
            default:
                return new Regex("bytes (\\d+)-(\\d+)/(\\d+)");
        }
    }

    public /* synthetic */ uf3(int i, Object obj) {
        this.a = i;
    }
}

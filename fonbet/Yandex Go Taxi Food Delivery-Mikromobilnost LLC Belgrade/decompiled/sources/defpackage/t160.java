package defpackage;

import android.content.SharedPreferences;
import com.yandex.feedsdk.di.FeedSdkComponent;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import com.yandex.go.taxi.order.promotions.modal_default.mapper.a;
import com.ybsdk.rconfig.b;
import ru.yandex.taxi.experiments.mainscreen.MainScreenBehavior;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard.e;
import ru.yandex.taxi.widget.c;

/* loaded from: classes12.dex */
public final class t160 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ t160(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    public static t160 a(eqh eqhVar) {
        return new t160(eqhVar, 16);
    }

    public static t160 b(eqh eqhVar) {
        return new t160(eqhVar, 17);
    }

    public static t160 c(eqh eqhVar) {
        return new t160(eqhVar, 18);
    }

    public static t160 d(eqh eqhVar) {
        return new t160(eqhVar, 19);
    }

    public static t160 e(eqh eqhVar) {
        return new t160(eqhVar, 20);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 1;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new s160((uva0) xvf0Var.get());
            case 1:
                return new r360((gd3) xvf0Var.get());
            case 2:
                return new e((j360) xvf0Var.get());
            case 3:
                return new x560((MainScreenBehavior) xvf0Var.get());
            case 4:
                return new q660((zuj0) xvf0Var.get());
            case 5:
                return new agt((FlexAdapter) xvf0Var.get(), i2);
            case 6:
                return new cc60((zuj0) xvf0Var.get());
            case 7:
                return new ld60((SharedPreferences) xvf0Var.get());
            case 8:
                return new kk60((rz10) xvf0Var.get());
            case 9:
                return new xl10((uq1) xvf0Var.get());
            case 10:
                return new sml((sfl0) xvf0Var.get());
            case 11:
                return new car(i2, (h450) xvf0Var.get());
            case 12:
                return new u470((b) xvf0Var.get());
            case 13:
                return new xl10((sfl0) xvf0Var.get());
            case 14:
                return new v4c(7, (tuv0) xvf0Var.get());
            case 15:
                return new x870((sfl0) xvf0Var.get());
            case 16:
                return new do70((pho) xvf0Var.get());
            case 17:
                return new eo70((pho) xvf0Var.get());
            case 18:
                return new fo70((pho) xvf0Var.get());
            case 19:
                return new x770((pho) xvf0Var.get());
            case 20:
                return new u8w((pho) xvf0Var.get());
            case 21:
                return new a((c) xvf0Var.get());
            case 22:
                return new co40((pho) xvf0Var.get());
            case 23:
                return new zm5((com.yandex.div.core.expression.variables.a) xvf0Var.get(), 3);
            case 24:
                return new co40((pho) xvf0Var.get());
            case 25:
                flex.engine.a engine = ((FeedSdkComponent) xvf0Var.get()).getEngine();
                q5z.i(engine);
                return engine;
            case 26:
                d0m b = ((FeedSdkComponent) xvf0Var.get()).b();
                q5z.i(b);
                return b;
            case 27:
                return new qv70((pho) xvf0Var.get());
            case 28:
                return new yj70((ru.yandex.taxi.orderforanother.repository.a) xvf0Var.get());
            default:
                return new h080((zuj0) xvf0Var.get());
        }
    }
}

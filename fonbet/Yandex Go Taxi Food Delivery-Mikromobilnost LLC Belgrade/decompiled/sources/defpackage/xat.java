package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.squareup.moshi.Moshi;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import com.yandex.fintechsdk.data.config.impl.internal.datasources.network.requesters.payment.paymentkit.a;
import com.yandex.go.navigator.domain.o;
import com.ybsdk.feature.banners.impl.domain.interactors.b;
import java.util.Map;

/* loaded from: classes12.dex */
public final class xat implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public xat(vzt vztVar, xvf0 xvf0Var) {
        this.a = 9;
        this.b = xvf0Var;
    }

    public static xat a(eqh eqhVar) {
        return new xat(eqhVar, 23);
    }

    public static xat b(eqh eqhVar) {
        return new xat(eqhVar, 26);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new a((jgs) xvf0Var.get());
            case 1:
                return new me0((Context) xvf0Var.get(), (byte) (objArr == true ? 1 : 0));
            case 2:
                return new com.yandex.fintechsdk.data.personalization.impl.internal.datasources.network.requesters.token.a((kt90) xvf0Var.get());
            case 3:
                return new com.yandex.fintechsdk.data.config.impl.internal.datasources.network.requesters.redirect.a((jgs) xvf0Var.get());
            case 4:
                return new uet();
            case 5:
                return new agt((FlexAdapter) xvf0Var.get(), objArr2 == true ? 1 : 0);
            case 6:
                return new gym((ubx0) xvf0Var.get());
            case 7:
                return new gst((com.yandex.go.places.impl.domain.interactors.a) xvf0Var.get(), objArr3 == true ? 1 : 0);
            case 8:
                return new q4g((zuj0) xvf0Var.get());
            case 9:
                return new uzt((szt) xvf0Var.get());
            case 10:
                return new h2t((b7t) xvf0Var.get());
            case 11:
                return new l4u((o) xvf0Var.get());
            case 12:
                return new b((com.ybsdk.feature.banners.impl.data.a) xvf0Var.get());
            case 13:
                return new a7u((Context) xvf0Var.get());
            case 14:
                return new v9u((yp2) xvf0Var.get());
            case 15:
                return new ehu((rqo) xvf0Var.get(), 0);
            case 16:
                return new q5p((lg5) xvf0Var.get(), 1);
            case 17:
                hju hjuVar = new hju();
                hjuVar.a = (zuj0) xvf0Var.get();
                return hjuVar;
            case 18:
                return new com.yandex.messaging.formatting.a((x4k0) xvf0Var.get());
            case 19:
                return new hdu((mo5) xvf0Var.get());
            case 20:
                return new m4v((vdc) xvf0Var.get());
            case 21:
                return new abe((Context) xvf0Var.get(), objArr5 == true ? 1 : 0, objArr4 == true ? 1 : 0);
            case 22:
                return new b890((x790) xvf0Var.get(), new Handler(Looper.getMainLooper()), 10, 5);
            case 23:
                return new qov((pho) xvf0Var.get());
            case 24:
                return new zov((i650) xvf0Var.get());
            case 25:
                return new ipv((rqo) xvf0Var.get());
            case 26:
                return new npv((pho) xvf0Var.get());
            case 27:
                return new com.ybsdk.screens.initial.a((Map) xvf0Var.get());
            case 28:
                return new reu((Moshi) xvf0Var.get());
            default:
                return new qyv(i2, (zuj0) xvf0Var.get());
        }
    }

    public /* synthetic */ xat(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }
}

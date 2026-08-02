package ru.yandex.taxi.eatskit;

import com.yandex.go.superapp.web.modal.m;
import defpackage.bh41;
import defpackage.cen;
import defpackage.ert0;
import defpackage.fen;
import defpackage.ig41;
import defpackage.ja41;
import defpackage.jg41;
import defpackage.ka41;
import defpackage.kg41;
import defpackage.la41;
import defpackage.na41;
import defpackage.rme;
import defpackage.tx2;
import defpackage.xz4;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ru.yandex.taxi.eatskit.internal.nativeapi.NativeApi;
import ru.yandex.taxi.eatskit.internal.nativeapi.WebNativeApi;

/* loaded from: classes5.dex */
public final class d extends rme {
    public final na41 n;
    public final ert0 o;
    public final WebNativeApi p;
    public final bh41 q;

    public d(fen fenVar, na41 na41Var, ert0 ert0Var, List list) {
        super(fenVar, na41Var);
        this.n = na41Var;
        this.o = ert0Var;
        this.p = new WebNativeApi(new ig41(this), list);
        this.q = new bh41(new cen(this, 1), "webApp");
    }

    @Override // defpackage.rme
    public final void b() {
        Set set = (Set) this.b.b;
        NativeApi f = f();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            f.registerAppSignal((tx2) it.next());
        }
        na41 na41Var = this.n;
        la41 la41Var = na41Var.w;
        WebNativeApi webNativeApi = this.p;
        if (la41Var != null) {
            webNativeApi.addAsyncMethod(WebNativeApi.WebCallMethod.REQUEST_SHARE_URL.getMethodName(), new jg41(1, new jg41(0, la41Var)));
        }
        ja41 ja41Var = na41Var.x;
        if (ja41Var != null) {
            webNativeApi.addAsyncMethod(WebNativeApi.WebCallMethod.SEND_ANALYTICS_EVENT.getMethodName(), new jg41(3, new jg41(2, ja41Var)));
        }
        m mVar = na41Var.c;
        if (mVar != null) {
            webNativeApi.addAsyncMethod(WebNativeApi.WebCallMethod.REQUEST_GOOGLE_PAY_TOKEN.getMethodName(), new b(new WebController$configure$3$1(2, mVar, m.class, "requestGooglePayToken", "requestGooglePayToken(Lru/yandex/taxi/eatskit/dto/RequestGooglePayTokenParams;Lru/yandex/taxi/eatskit/EatsKitCallback;)V", 0), 25));
            webNativeApi.addAsyncMethod(WebNativeApi.WebCallMethod.IS_GOOGLE_PAY_SUPPORTED.getMethodName(), new b(new WebController$configure$3$2(2, mVar, m.class, "isGooglePaySupported", "isGooglePaySupported(Lru/yandex/taxi/eatskit/dto/RequestGooglePaySupportParams;Lru/yandex/taxi/eatskit/EatsKitCallback;)V", 0), 26));
            webNativeApi.addAsyncMethod(WebNativeApi.WebCallMethod.ON_SUCCESS_ORDER.getMethodName(), new jg41(4, new kg41(mVar, 0)));
            webNativeApi.addAsyncMethod(WebNativeApi.WebCallMethod.IS_NFC_SUPPORTED.getMethodName(), new jg41(5, new kg41(mVar, 1)));
        }
        ka41 ka41Var = na41Var.y;
        if (ka41Var != null) {
            webNativeApi.addAsyncMethod(WebNativeApi.WebCallMethod.ENDPOINT_DESCRIPTION.getMethodName(), new b(new WebController$configure$4$1(2, ka41Var, ka41.class, "requestEndpointDescription", "requestEndpointDescription(Lru/yandex/taxi/eatskit/dto/EndpointDescriptionParams;Lru/yandex/taxi/eatskit/EatsKitCallback;)V", 0), 27));
        }
    }

    @Override // defpackage.rme
    public final xz4 e() {
        return this.q;
    }

    @Override // defpackage.rme
    public final NativeApi f() {
        return this.p;
    }

    public final void v(ContentView contentView) {
        ((WebContentView) contentView).init(this, this.a, g(), this.o);
    }
}

package defpackage;

import com.yandex.passport.internal.ui.bouncer.o;
import com.yandex.plus.bdui.plus.webview.e;
import com.yandex.plus.bdui.plus.webview.f;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.b;
import com.yandex.plus.webview.core.d;
import com.yandex.plus.webview.internal.container.a;
import com.yandex.plus.webview.internal.contract.impl.loading.n;

/* loaded from: classes5.dex */
public final class h8e implements n {
    public volatile Object a;

    @Override // com.yandex.plus.webview.internal.contract.impl.loading.n
    public void a(String str, a aVar, d dVar, Exception exc, b bVar) {
        o oVar = (o) this.a;
        if (oVar == null || dVar == null) {
            return;
        }
        oVar.invoke(new e(dVar, exc, bVar));
    }

    @Override // com.yandex.plus.webview.internal.contract.impl.loading.n
    public void b(d dVar) {
        o oVar = (o) this.a;
        if (oVar == null || dVar == null) {
            return;
        }
        oVar.invoke(new f(dVar));
    }

    @Override // com.yandex.plus.webview.internal.contract.impl.loading.n
    public void c() {
    }
}

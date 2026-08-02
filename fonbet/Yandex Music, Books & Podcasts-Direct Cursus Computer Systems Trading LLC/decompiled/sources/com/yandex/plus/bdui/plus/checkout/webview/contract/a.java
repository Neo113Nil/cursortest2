package com.yandex.plus.bdui.plus.checkout.webview.contract;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.yandex.plus.bdui.plus.webview.q;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.j;
import com.yandex.plus.pay.ui.webview.family.ui.c;
import com.yandex.plus.webview.api.contract.e;
import com.yandex.plus.webview.api.contract.f;
import defpackage.btf;
import defpackage.jyr;
import defpackage.mxr;
import defpackage.os;
import defpackage.q5b;
import defpackage.vdr;
import defpackage.vop;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class a implements com.yandex.plus.pay.ui.webview.family.ui.a {
    public final j a;
    public final com.yandex.plus.log.api.b b;
    public final q5b c;
    public final Context d;
    public final jyr e;

    public a(Context context, q qVar, String str, c cVar, com.yandex.plus.pay.ui.webview.family.domain.a aVar, com.yandex.plus.pay.ui.webview.common.diagnostic.a aVar2, j jVar, com.yandex.plus.log.api.b bVar) {
        qVar.getClass();
        bVar.getClass();
        this.a = jVar;
        this.b = bVar;
        this.c = q5b.a;
        this.d = context.getApplicationContext();
        this.e = btf.b(new os(cVar, this, aVar, str, qVar, aVar2));
    }

    @Override // com.yandex.plus.webview.api.a
    public final void b(String str) {
        str.getClass();
        d().b(str);
    }

    public final com.yandex.plus.pay.ui.webview.family.ui.a d() {
        return (com.yandex.plus.pay.ui.webview.family.ui.a) this.e.getValue();
    }

    @Override // com.yandex.plus.webview.api.contract.c
    public final int e(Context context) {
        context.getClass();
        return d().e(context);
    }

    @Override // com.yandex.plus.webview.api.contract.d
    public final Object l(mxr mxrVar) {
        e eVar;
        f fVar = new f(12, "NATIVE_SHARING", "available_features", false);
        f fVar2 = new f(12, "BROADCASTING", "available_features", false);
        com.yandex.plus.bdui.plus.auth.b bVar = (com.yandex.plus.bdui.plus.auth.b) this.a.get();
        if (bVar != null) {
            eVar = new e("Authorization", "OAuth " + bVar.b);
        } else {
            eVar = null;
        }
        return vop.f(fVar, fVar2, eVar);
    }

    @Override // com.yandex.plus.pay.ui.webview.family.ui.a, com.yandex.plus.webview.api.javascript.a
    @JavascriptInterface
    public void onMessage(@NotNull String str) {
        str.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.b;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "FamilyContractWrapper", "onMessage(); message = ".concat(str));
        }
        d().onMessage(str);
    }

    @Override // com.yandex.plus.webview.api.contract.j
    public final vdr q() {
        return d().q();
    }

    @Override // com.yandex.plus.webview.api.contract.d
    public final q5b r() {
        return this.c;
    }

    @Override // com.yandex.plus.webview.api.a
    public final void s(String str) {
        str.getClass();
        d().s(str);
    }

    @Override // com.yandex.plus.webview.api.javascript.b
    @JavascriptInterface
    /* renamed from: sendMessage, reason: merged with bridge method [inline-methods] */
    public void v(@NotNull Unit unit) {
        unit.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.b;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "FamilyContractWrapper", "sendMessage()");
        }
        d().v(unit);
    }

    @Override // com.yandex.plus.webview.api.contract.d
    public final void t(com.yandex.plus.webview.internal.f fVar, com.yandex.passport.legacy.lx.f fVar2) {
        d().t(fVar, fVar2);
    }
}

package com.yandex.plus.home.feature.webviews.internal.simple.contract;

import com.yandex.passport.data.network.l;
import com.yandex.plus.home.feature.webviews.internal.simple.e;
import com.yandex.plus.webview.core.i;
import defpackage.s9f;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class a extends com.yandex.plus.webview.api.contract.b implements com.yandex.plus.webview.api.a, i, com.yandex.plus.webview.api.contract.i {
    public final l b;
    public final com.yandex.plus.log.api.b c;
    public final com.yandex.plus.home.analytics.diagnostic.webview.a d;
    public final com.yandex.plus.home.feature.webviews.internalapi.analytics.a e;
    public final String f;
    public boolean g;

    public a(l lVar, com.yandex.plus.log.api.b bVar, com.yandex.plus.home.analytics.diagnostic.webview.a aVar, com.yandex.plus.home.feature.webviews.internalapi.analytics.a aVar2, String str) {
        lVar.getClass();
        bVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        str.getClass();
        this.b = lVar;
        this.c = bVar;
        this.d = aVar;
        this.e = aVar2;
        this.f = str;
    }

    @Override // com.yandex.plus.webview.api.a
    public final void b(String str) {
        str.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "SimpleWebViewContract", "onPageLoadingFinished() url=".concat(str));
        }
        e eVar = (e) this.b.a;
        s9f[] s9fVarArr = e.s;
        eVar.p();
    }

    @Override // com.yandex.plus.webview.core.i
    public final void d(int i, String str, String str2, String str3, boolean z) {
        if (z) {
            this.b.H("ssl error", str);
        }
        this.d.e(i, str, str2, str3, z);
    }

    @Override // com.yandex.plus.webview.api.contract.i
    public final void i() {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "SimpleWebViewContract", "onReadyTimeout()");
        }
        ((e) this.b.a).a.j0();
    }

    @Override // com.yandex.plus.webview.core.i
    public final void k(int i, String str, String str2, String str3, boolean z) {
        if (z) {
            this.b.H(String.format("connection error, error code = %d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)), str);
        }
        this.d.c(i, str, str2, str3, z);
    }

    @Override // com.yandex.plus.webview.api.contract.i
    public final void onReady() {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "SimpleWebViewContract", "onReady()");
        }
        ((e) this.b.a).a.i0();
        if (this.g) {
            return;
        }
        this.g = true;
        this.e.a(this.f);
    }

    @Override // com.yandex.plus.webview.core.i
    public final void u(int i, String str, String str2, String str3, boolean z) {
        str3.getClass();
        if (z) {
            this.b.H(String.format("http error, status code = %d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)), str);
        }
        this.d.b(i, str, str2, str3, z);
    }
}

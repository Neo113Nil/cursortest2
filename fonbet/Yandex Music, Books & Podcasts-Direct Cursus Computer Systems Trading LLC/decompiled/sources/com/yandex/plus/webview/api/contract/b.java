package com.yandex.plus.webview.api.contract;

import defpackage.mxr;
import defpackage.q5b;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public abstract class b implements d {
    public WeakReference a;

    @Override // com.yandex.plus.webview.api.contract.d
    public Object l(mxr mxrVar) {
        return q5b.a;
    }

    @Override // com.yandex.plus.webview.api.contract.d
    public final q5b r() {
        return q5b.a;
    }

    @Override // com.yandex.plus.webview.api.contract.d
    public void t(com.yandex.plus.webview.internal.f fVar, com.yandex.passport.legacy.lx.f fVar2) {
        this.a = new WeakReference(fVar);
    }

    public final com.yandex.plus.webview.core.d w() {
        WeakReference weakReference = this.a;
        if (weakReference != null) {
            return (com.yandex.plus.webview.core.d) weakReference.get();
        }
        return null;
    }
}

package com.yandex.plus.webview.api.contract.container;

import com.yandex.plus.webview.api.container.b;
import defpackage.q5b;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Set;

/* loaded from: classes5.dex */
public final class a implements com.yandex.plus.webview.api.container.a {
    public final q5b a = q5b.a;
    public final LinkedHashMap b = new LinkedHashMap();

    @Override // com.yandex.plus.webview.api.container.a
    public final void j(b bVar, com.yandex.plus.webview.internal.container.a aVar) {
        this.b.put(bVar, new WeakReference(aVar));
    }

    @Override // com.yandex.plus.webview.api.container.a
    public final Set n() {
        return this.a;
    }
}

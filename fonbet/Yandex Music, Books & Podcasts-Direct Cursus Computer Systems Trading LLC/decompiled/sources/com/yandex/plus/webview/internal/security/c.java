package com.yandex.plus.webview.internal.security;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class c implements com.yandex.plus.webview.api.security.b {
    public final ArrayList a = new ArrayList();

    @Override // com.yandex.plus.webview.api.security.b
    public final void o(com.yandex.plus.webview.core.resource.a aVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((com.yandex.plus.webview.api.security.b) it.next()).o(aVar);
        }
    }

    @Override // com.yandex.plus.webview.api.security.b
    public final void p(com.yandex.plus.webview.core.resource.a aVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((com.yandex.plus.webview.api.security.b) it.next()).p(aVar);
        }
    }
}

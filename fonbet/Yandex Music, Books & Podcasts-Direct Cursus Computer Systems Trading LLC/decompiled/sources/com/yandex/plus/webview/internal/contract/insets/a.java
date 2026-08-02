package com.yandex.plus.webview.internal.contract.insets;

import com.yandex.plus.webview.internal.insets.b;
import com.yandex.plus.webview.internal.insets.c;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public final class a implements c {
    public WeakReference a;

    @Override // com.yandex.plus.webview.internal.insets.c
    public final void m(b bVar) {
        this.a = new WeakReference(bVar);
    }
}

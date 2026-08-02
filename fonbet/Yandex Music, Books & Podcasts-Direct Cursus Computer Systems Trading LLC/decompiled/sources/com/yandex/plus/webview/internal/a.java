package com.yandex.plus.webview.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class a implements com.yandex.plus.webview.api.a {
    public final ArrayList a = new ArrayList();

    @Override // com.yandex.plus.webview.api.a
    public final void b(String str) {
        str.getClass();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((com.yandex.plus.webview.api.a) it.next()).b(str);
        }
    }

    @Override // com.yandex.plus.webview.api.a
    public final void s(String str) {
        str.getClass();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((com.yandex.plus.webview.api.a) it.next()).s(str);
        }
    }
}

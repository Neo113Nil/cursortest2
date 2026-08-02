package com.yandex.plus.home.feature.webviews.internalapi.bridge;

import com.yandex.plus.home.feature.webviews.internal.bridge.f;
import defpackage.t9f;
import defpackage.x3f;

/* loaded from: classes5.dex */
public final class c implements com.yandex.plus.webview.api.message.a {
    public final x3f a;
    public final f b;

    public c(t9f t9fVar, x3f x3fVar, int i) {
        t9fVar.getClass();
        x3fVar.getClass();
        switch (i) {
            case 1:
                this.a = x3fVar;
                this.b = new f(t9fVar);
                break;
            default:
                this.a = x3fVar;
                this.b = new f(t9fVar);
                break;
        }
    }

    @Override // com.yandex.plus.webview.api.message.a
    public Object o(String str) {
        return this.a.b(this.b, str);
    }
}

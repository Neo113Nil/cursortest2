package com.yandex.plus.home.core.network;

import defpackage.i5f;
import defpackage.quj;
import defpackage.x3f;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class d {
    public final i5f a = quj.r(x3f.d, new com.yandex.plus.bdui.plus.webview.navigation.a(20));

    public final c a(String str) {
        if (str == null || StringsKt.U(str)) {
            return null;
        }
        i5f i5fVar = this.a;
        i5fVar.getClass();
        return (c) i5fVar.b(c.Companion.serializer(), str);
    }
}

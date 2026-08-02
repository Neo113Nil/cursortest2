package com.yandex.plus.pay.ui.webview.family.ui;

import com.yandex.plus.home.internal.di.y;
import defpackage.ezc;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class c {
    public final y a;
    public final com.yandex.plus.log.api.b b;
    public final com.yandex.plus.pay.ui.webview.common.diagnostic.a c;
    public final kotlinx.coroutines.a d;
    public final kotlinx.coroutines.a e;
    public final ezc f;

    /* JADX WARN: Multi-variable type inference failed */
    public c(y yVar, com.yandex.plus.log.api.b bVar, com.yandex.plus.pay.ui.webview.common.diagnostic.a aVar, kotlinx.coroutines.a aVar2, kotlinx.coroutines.a aVar3, Function0 function0) {
        bVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        this.a = yVar;
        this.b = bVar;
        this.c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = (ezc) function0;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [ezc, kotlin.jvm.functions.Function0] */
    public final d a(b bVar) {
        return new d(this.b, bVar, new com.yandex.plus.pay.ui.common.internal.web.a(this.c), new com.yandex.plus.webview.api.contract.message.d(new com.yandex.plus.home.plaque.plugin.internal.proxy.a(20, this), this.e), this.d, ((Boolean) this.f.invoke()).booleanValue());
    }
}

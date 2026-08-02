package com.plaid.internal;

import com.plaid.internal.C0095a6;
import com.plaid.internal.F6;
import kotlin.collections.EmptyMap;

/* loaded from: classes5.dex */
public final class R5 implements Runnable {
    public final /* synthetic */ P5 a;

    public R5(P5 p5) {
        this.a = p5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        P5 p5 = this.a;
        p5.b.getClass();
        C0095a6.a.getClass();
        C0095a6.a.a("JS send Link is shown", true);
        p5.loadUrl("javascript:window.SdkJsBridge.send('{\"message_type\": \"open\", \"data\": {}}')");
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        F6.a.b(emptyMap, "JSBridge - sent open");
    }
}

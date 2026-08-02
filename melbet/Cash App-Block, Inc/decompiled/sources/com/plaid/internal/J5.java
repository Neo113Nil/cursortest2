package com.plaid.internal;

import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes5.dex */
public final class J5 {
    public final C0114c5 a;

    public J5(C0114c5 c0114c5) {
        c0114c5.getClass();
        this.a = c0114c5;
    }

    public final void a(String str) {
        str.getClass();
        C0114c5 c0114c5 = this.a;
        c0114c5.getClass();
        JobKt.launch$default(GlobalScope.INSTANCE, null, null, new C0094a5(c0114c5, str, null), 3);
    }
}

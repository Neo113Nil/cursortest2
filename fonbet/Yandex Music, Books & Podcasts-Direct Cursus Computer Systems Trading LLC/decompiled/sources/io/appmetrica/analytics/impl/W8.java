package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public abstract class W8 {
    public final C0374je a;

    public W8() {
        C0374je c0374je = new C0374je(0);
        c0374je.a(X8.b, 0);
        c0374je.a(X8.c, 1);
        c0374je.a(X8.d, 2);
        c0374je.a(X8.e, 3);
        this.a = c0374je;
    }

    @NotNull
    public final C0374je a() {
        return this.a;
    }

    public abstract boolean a(Object obj, Object obj2);
}

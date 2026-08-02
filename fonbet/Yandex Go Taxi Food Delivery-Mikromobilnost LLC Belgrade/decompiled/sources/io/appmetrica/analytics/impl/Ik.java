package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

/* loaded from: classes9.dex */
public final class Ik implements Runnable {
    public final /* synthetic */ ModuleEvent a;
    public final /* synthetic */ Tk b;

    public Ik(Tk tk, ModuleEvent moduleEvent) {
        this.b = tk;
        this.a = moduleEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Tk tk = this.b;
        Tk.a(tk.a, tk.d, tk.e).reportEvent(this.a);
    }
}

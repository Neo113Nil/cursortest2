package io.appmetrica.analytics.impl;

/* loaded from: classes9.dex */
public final class Pk implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Tk c;

    public Pk(Tk tk, String str, String str2) {
        this.c = tk;
        this.a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Tk tk = this.c;
        Tk.a(tk.a, tk.d, tk.e).putAppEnvironmentValue(this.a, this.b);
    }
}

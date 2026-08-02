package io.appmetrica.analytics.impl;

/* loaded from: classes4.dex */
public final class Jk implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ Tk c;

    public Jk(Tk tk, String str, byte[] bArr) {
        this.c = tk;
        this.a = str;
        this.b = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Tk tk = this.c;
        Tk.a(tk.a, tk.d, tk.e).setSessionExtra(this.a, this.b);
    }
}

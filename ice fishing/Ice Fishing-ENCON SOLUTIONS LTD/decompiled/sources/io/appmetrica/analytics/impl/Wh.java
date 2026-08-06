package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Wh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5309a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f5310b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0437gi f5311c;

    public Wh(C0437gi c0437gi, String str, byte[] bArr) {
        this.f5311c = c0437gi;
        this.f5309a = str;
        this.f5310b = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0437gi c0437gi = this.f5311c;
        C0437gi.a(c0437gi.f6082a, c0437gi.f6085d, c0437gi.f6086e).setSessionExtra(this.f5309a, this.f5310b);
    }
}

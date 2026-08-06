package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Gj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4432a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f4433b;

    public Gj(String str, byte[] bArr) {
        this.f4432a = str;
        this.f4433b = bArr;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra) {
        ra.setSessionExtra(this.f4432a, this.f4433b);
    }
}

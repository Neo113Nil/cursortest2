package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Kj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4644a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4645b;

    public Kj(String str, String str2) {
        this.f4644a = str;
        this.f4645b = str2;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra) {
        ra.putAppEnvironmentValue(this.f4644a, this.f4645b);
    }
}

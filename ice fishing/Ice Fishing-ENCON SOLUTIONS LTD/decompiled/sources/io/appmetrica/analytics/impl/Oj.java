package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Oj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4873a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4874b;

    public Oj(String str, String str2) {
        this.f4873a = str;
        this.f4874b = str2;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra) {
        ra.reportEvent(this.f4873a, this.f4874b);
    }
}

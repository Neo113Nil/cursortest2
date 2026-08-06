package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ej implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Tj f4362a;

    public Ej(Tj tj) {
        this.f4362a = tj;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra) {
        Sj a2 = ((C0380ed) this.f4362a).a();
        if (a2 != null) {
            ra.reportEvent(a2.f5063a, a2.f5064b);
        }
    }
}

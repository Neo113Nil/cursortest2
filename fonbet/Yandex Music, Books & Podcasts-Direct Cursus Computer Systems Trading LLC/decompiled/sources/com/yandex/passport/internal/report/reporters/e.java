package com.yandex.passport.internal.report.reporters;

/* loaded from: classes4.dex */
public final class e extends androidx.core.app.n0 {
    public final com.yandex.passport.internal.report.g b;
    public final com.yandex.passport.internal.features.a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.yandex.passport.internal.report.g gVar, com.yandex.passport.internal.features.a aVar) {
        super(gVar);
        gVar.getClass();
        aVar.getClass();
        this.b = gVar;
        this.c = aVar;
    }

    @Override // androidx.core.app.n0
    public final boolean k() {
        com.yandex.passport.internal.features.a aVar = this.c;
        return ((Boolean) aVar.f.getValue(aVar, com.yandex.passport.internal.features.a.J[2])).booleanValue();
    }
}

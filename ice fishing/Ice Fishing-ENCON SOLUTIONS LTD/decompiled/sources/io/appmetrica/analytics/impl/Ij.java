package io.appmetrica.analytics.impl;

import java.util.Map;

/* loaded from: classes.dex */
public final class Ij implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f4554a;

    public Ij(Map map) {
        this.f4554a = map;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra) {
        ra.reportAnr(this.f4554a);
    }
}

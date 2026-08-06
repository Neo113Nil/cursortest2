package io.appmetrica.analytics.impl;

import java.util.Map;

/* loaded from: classes.dex */
public final class Pj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4938a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f4939b;

    public Pj(String str, Map map) {
        this.f4938a = str;
        this.f4939b = map;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra) {
        ra.reportEvent(this.f4938a, this.f4939b);
    }
}

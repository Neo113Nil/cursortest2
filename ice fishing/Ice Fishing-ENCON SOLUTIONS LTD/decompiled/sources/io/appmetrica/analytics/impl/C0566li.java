package io.appmetrica.analytics.impl;

import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.li, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0566li implements InterfaceC0753so {

    /* renamed from: a, reason: collision with root package name */
    public final Map f6463a;

    public C0566li(Map<String, ?> map) {
        this.f6463a = map;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0753so
    public final C0702qo a(String str) {
        if (!this.f6463a.containsKey(str)) {
            return new C0702qo(this, true, "");
        }
        return new C0702qo(this, false, "Failed to activate AppMetrica with provided apiKey ApiKey " + str + " has already been used by another reporter.");
    }
}

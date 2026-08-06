package io.appmetrica.analytics.impl;

import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.tb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0766tb implements Ha {

    /* renamed from: a, reason: collision with root package name */
    public final Ha f6940a;

    public C0766tb(Ha ha) {
        this.f6940a = ha;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final Ha a(String str, String str2) {
        this.f6940a.a(str, str2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final void b() {
        this.f6940a.b();
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final boolean getBoolean(String str, boolean z2) {
        return this.f6940a.getBoolean(str, z2);
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final int getInt(String str, int i2) {
        return this.f6940a.getInt(str, i2);
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final long getLong(String str, long j2) {
        return this.f6940a.getLong(str, j2);
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final String getString(String str, String str2) {
        return this.f6940a.getString(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final Ha remove(String str) {
        this.f6940a.remove(str);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final Ha a(String str, long j2) {
        this.f6940a.a(str, j2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final Ha a(int i2, String str) {
        this.f6940a.a(i2, str);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final Ha a(String str, boolean z2) {
        this.f6940a.a(str, z2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final Ha a(String str, float f2) {
        this.f6940a.a(str, f2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final boolean a(String str) {
        return this.f6940a.a(str);
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final Set a() {
        return this.f6940a.a();
    }
}

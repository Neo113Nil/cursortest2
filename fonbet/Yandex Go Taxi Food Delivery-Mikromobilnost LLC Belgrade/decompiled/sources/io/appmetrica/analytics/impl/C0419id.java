package io.appmetrica.analytics.impl;

import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.id, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0419id implements InterfaceC0418ic {
    public final InterfaceC0418ic a;

    public C0419id(InterfaceC0418ic interfaceC0418ic) {
        this.a = interfaceC0418ic;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0418ic
    public final boolean a(String str) {
        return this.a.a(str);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0418ic
    public final Set b() {
        return this.a.b();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0418ic
    public final void flushAsync() {
        this.a.flushAsync();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0418ic
    public final boolean getBoolean(String str, boolean z) {
        return this.a.getBoolean(str, z);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0418ic
    public final int getInt(String str, int i) {
        return this.a.getInt(str, i);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0418ic
    public final long getLong(String str, long j) {
        return this.a.getLong(str, j);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0418ic
    public final String getString(String str, String str2) {
        return this.a.getString(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0418ic
    public final InterfaceC0418ic remove(String str) {
        this.a.remove(str);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0418ic
    public final InterfaceC0418ic a(String str, long j) {
        this.a.a(str, j);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0418ic
    public final InterfaceC0418ic a(String str, int i) {
        this.a.a(str, i);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0418ic
    public final InterfaceC0418ic a(String str, boolean z) {
        this.a.a(str, z);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0418ic
    public final InterfaceC0418ic a(String str, float f) {
        this.a.a(str, f);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0418ic
    public final InterfaceC0418ic a(String str, String str2) {
        this.a.a(str, str2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0418ic
    public final void a() {
        this.a.a();
    }
}

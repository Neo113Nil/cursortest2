package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;

/* loaded from: classes.dex */
public abstract class D2 implements ModulePreferences {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0802ul f4277a;

    public D2(InterfaceC0802ul interfaceC0802ul) {
        this.f4277a = interfaceC0802ul;
    }

    public abstract String a(String str);

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final boolean getBoolean(String str, boolean z2) {
        return ((AbstractC0898yd) this.f4277a).c(str, z2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final int getInt(String str, int i2) {
        return ((AbstractC0898yd) this.f4277a).c(str, i2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final long getLong(String str, long j2) {
        return ((AbstractC0898yd) this.f4277a).c(a(str), j2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final String getString(String str, String str2) {
        return ((AbstractC0898yd) this.f4277a).c(a(str), str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putBoolean(String str, boolean z2) {
        AbstractC0898yd abstractC0898yd = (AbstractC0898yd) this.f4277a;
        ((Xe) ((InterfaceC0802ul) abstractC0898yd.b(abstractC0898yd.f(a(str)), z2))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putInt(String str, int i2) {
        AbstractC0898yd abstractC0898yd = (AbstractC0898yd) this.f4277a;
        ((Xe) ((InterfaceC0802ul) abstractC0898yd.b(abstractC0898yd.f(str), i2))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putLong(String str, long j2) {
        AbstractC0898yd abstractC0898yd = (AbstractC0898yd) this.f4277a;
        ((Xe) ((InterfaceC0802ul) abstractC0898yd.b(abstractC0898yd.f(a(str)), j2))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putString(String str, String str2) {
        AbstractC0898yd abstractC0898yd = (AbstractC0898yd) this.f4277a;
        ((Xe) ((InterfaceC0802ul) abstractC0898yd.b(abstractC0898yd.f(a(str)), str2))).b();
    }
}

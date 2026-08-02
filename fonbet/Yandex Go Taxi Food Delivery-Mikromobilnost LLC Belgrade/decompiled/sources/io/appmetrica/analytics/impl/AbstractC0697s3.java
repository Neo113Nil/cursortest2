package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;

/* renamed from: io.appmetrica.analytics.impl.s3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0697s3 implements ModulePreferences {
    public final So a;

    public AbstractC0697s3(So so) {
        this.a = so;
    }

    public abstract String a(String str);

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void flushAsync() {
        this.a.flushAsync();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final boolean getBoolean(String str, boolean z) {
        return ((AbstractC0421ig) this.a).a(str, z);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final int getInt(String str, int i) {
        return ((AbstractC0421ig) this.a).a(str, i);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final long getLong(String str, long j) {
        return ((AbstractC0421ig) this.a).a(a(str), j);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final String getString(String str, String str2) {
        return ((AbstractC0421ig) this.a).a(a(str), str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putBoolean(String str, boolean z) {
        AbstractC0421ig abstractC0421ig = (AbstractC0421ig) this.a;
        abstractC0421ig.d(abstractC0421ig.g(a(str)), z);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putInt(String str, int i) {
        AbstractC0421ig abstractC0421ig = (AbstractC0421ig) this.a;
        abstractC0421ig.d(abstractC0421ig.g(str), i);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putLong(String str, long j) {
        AbstractC0421ig abstractC0421ig = (AbstractC0421ig) this.a;
        abstractC0421ig.d(abstractC0421ig.g(a(str)), j);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putString(String str, String str2) {
        AbstractC0421ig abstractC0421ig = (AbstractC0421ig) this.a;
        abstractC0421ig.d(abstractC0421ig.g(a(str)), str2);
    }
}

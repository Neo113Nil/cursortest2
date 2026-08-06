package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModuleDummy;

/* loaded from: classes.dex */
public final class Bd {

    /* renamed from: a, reason: collision with root package name */
    public final Bf f4206a;

    /* renamed from: b, reason: collision with root package name */
    public final NativeCrashClientModule f4207b;

    /* renamed from: c, reason: collision with root package name */
    public final I0 f4208c;

    /* renamed from: d, reason: collision with root package name */
    public H0 f4209d;

    public Bd(Bf bf) {
        this.f4206a = bf;
        NativeCrashClientModule nativeCrashClientModule = (NativeCrashClientModule) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.ndkcrashes.NativeCrashClientModuleImpl", NativeCrashClientModule.class);
        this.f4207b = nativeCrashClientModule == null ? new NativeCrashClientModuleDummy() : nativeCrashClientModule;
        this.f4208c = new I0();
    }
}

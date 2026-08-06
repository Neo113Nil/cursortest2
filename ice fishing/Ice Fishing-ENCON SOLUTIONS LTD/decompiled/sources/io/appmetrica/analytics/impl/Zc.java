package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import java.util.Map;

/* loaded from: classes.dex */
public final class Zc implements ModuleSelfReporter {

    /* renamed from: a, reason: collision with root package name */
    public final Qj f5499a = AbstractC0860x1.a();

    /* renamed from: b, reason: collision with root package name */
    public final int f5500b = 4;

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportError(String str, Throwable th) {
        Qj qj = this.f5499a;
        qj.getClass();
        qj.a(new C0671pj(str, th));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(String str) {
        Qj qj = this.f5499a;
        ModuleEvent build = ModuleEvent.newBuilder(this.f5500b).withName(str).build();
        qj.getClass();
        qj.a(new Fj(build));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportError(String str, String str2) {
        this.f5499a.reportError(str, str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(String str, Map<String, ? extends Object> map) {
        Qj qj = this.f5499a;
        ModuleEvent build = ModuleEvent.newBuilder(this.f5500b).withName(str).withAttributes(map).build();
        qj.getClass();
        qj.a(new Fj(build));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(String str, String str2) {
        Qj qj = this.f5499a;
        ModuleEvent build = ModuleEvent.newBuilder(this.f5500b).withName(str).withValue(str2).build();
        qj.getClass();
        qj.a(new Fj(build));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(int i2, String str, String str2) {
        Qj qj = this.f5499a;
        ModuleEvent build = ModuleEvent.newBuilder(i2).withName(str).withValue(str2).build();
        qj.getClass();
        qj.a(new Fj(build));
    }
}

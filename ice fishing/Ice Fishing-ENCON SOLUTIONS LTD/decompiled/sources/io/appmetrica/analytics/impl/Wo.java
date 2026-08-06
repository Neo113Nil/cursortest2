package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver;

/* loaded from: classes.dex */
public final /* synthetic */ class Wo implements I1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5338a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5339b;

    public /* synthetic */ Wo(int i2, Object obj) {
        this.f5338a = i2;
        this.f5339b = obj;
    }

    @Override // io.appmetrica.analytics.impl.I1
    public final void a(Intent intent) {
        switch (this.f5338a) {
            case 0:
                C0277ad.a((ModuleServiceLifecycleObserver) this.f5339b, intent);
                break;
            case 1:
                C0277ad.b((ModuleServiceLifecycleObserver) this.f5339b, intent);
                break;
            default:
                ((B1) this.f5339b).d(intent);
                break;
        }
    }
}

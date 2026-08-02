package defpackage;

import android.content.Intent;
import io.appmetrica.analytics.impl.C0276g2;
import io.appmetrica.analytics.impl.Ge;
import io.appmetrica.analytics.impl.InterfaceC0507o2;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver;

/* loaded from: classes5.dex */
public final /* synthetic */ class w2d implements InterfaceC0507o2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w2d(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0507o2
    public final void a(Intent intent) {
        switch (this.a) {
            case 0:
                Ge.a((ModuleServiceLifecycleObserver) this.b, intent);
                break;
            case 1:
                Ge.b((ModuleServiceLifecycleObserver) this.b, intent);
                break;
            default:
                ((C0276g2) this.b).d(intent);
                break;
        }
    }
}

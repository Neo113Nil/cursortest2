package defpackage;

import com.yandex.messaging.activity.UiProfileHolder$forEach$$inlined$suspendDisposable$1$1;
import com.yandex.messaging.activity.b;
import com.yandex.messaging.data.SdkPreferenceStore$subscribeCurrentOrganizationChanges$$inlined$suspendDisposable$1$1;
import com.yandex.messaging.data.e;

/* loaded from: classes15.dex */
public final class vpp0 implements e1k {
    public final /* synthetic */ int a = 2;
    public Object b;

    public vpp0(ike ikeVar, b bVar, co3 co3Var) {
        this.b = tje.N(ikeVar, null, null, new UiProfileHolder$forEach$$inlined$suspendDisposable$1$1(co3Var, bVar, null), 3);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                ((pzt0) this.b).a(null);
                break;
            case 1:
                ((pzt0) this.b).a(null);
                break;
            default:
                this.b = null;
                break;
        }
    }

    public /* synthetic */ vpp0() {
    }

    public vpp0(ike ikeVar, e eVar, e9e e9eVar) {
        this.b = tje.N(ikeVar, null, null, new SdkPreferenceStore$subscribeCurrentOrganizationChanges$$inlined$suspendDisposable$1$1(null, eVar, e9eVar), 3);
    }
}

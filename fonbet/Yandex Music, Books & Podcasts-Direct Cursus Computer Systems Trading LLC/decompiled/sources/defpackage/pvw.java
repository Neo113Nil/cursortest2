package defpackage;

import io.appmetrica.analytics.billing.impl.m;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver;
import io.appmetrica.analytics.egress.impl.k;

/* loaded from: classes5.dex */
public final /* synthetic */ class pvw implements ApplicationStateObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pvw(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver
    public final void onApplicationStateChanged(ApplicationState applicationState) {
        switch (this.a) {
            case 0:
                k.a((k) this.b, applicationState);
                break;
            default:
                m.a((m) this.b, applicationState);
                break;
        }
    }
}

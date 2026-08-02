package defpackage;

import android.location.LocationManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.location.impl.r;

/* loaded from: classes5.dex */
public final /* synthetic */ class tvw implements FunctionWithThrowable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ tvw(r rVar, int i) {
        this.a = i;
        this.b = rVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return r.b(this.b, (LocationManager) obj);
            default:
                return r.a(this.b, (LocationManager) obj);
        }
    }
}

package M0;

import android.location.LocationManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.location.impl.r;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements FunctionWithThrowable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1082a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f1083b;

    public /* synthetic */ a(r rVar, int i2) {
        this.f1082a = i2;
        this.f1083b = rVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final Object apply(Object obj) {
        switch (this.f1082a) {
            case 0:
                return r.b(this.f1083b, (LocationManager) obj);
            default:
                return r.a(this.f1083b, (LocationManager) obj);
        }
    }
}

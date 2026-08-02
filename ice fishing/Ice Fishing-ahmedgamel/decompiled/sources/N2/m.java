package N2;

import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f1943a;

    /* renamed from: b, reason: collision with root package name */
    public final l3.h f1944b = new l3.h();

    /* renamed from: c, reason: collision with root package name */
    public final int f1945c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f1946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1947e;

    public m(int i, int i4, Bundle bundle, int i6) {
        this.f1947e = i6;
        this.f1943a = i;
        this.f1945c = i4;
        this.f1946d = bundle;
    }

    public final boolean a() {
        switch (this.f1947e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(n nVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + nVar.toString());
        }
        this.f1944b.a(nVar);
    }

    public final void c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(bundle));
        }
        this.f1944b.b(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.f1945c + " id=" + this.f1943a + " oneWay=" + a() + "}";
    }
}

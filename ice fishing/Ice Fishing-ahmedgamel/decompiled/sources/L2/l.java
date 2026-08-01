package L2;

import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f1653a;

    /* renamed from: b, reason: collision with root package name */
    public final j3.h f1654b = new j3.h();

    /* renamed from: c, reason: collision with root package name */
    public final int f1655c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f1656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1657e;

    public l(int i, int i6, Bundle bundle, int i9) {
        this.f1657e = i9;
        this.f1653a = i;
        this.f1655c = i6;
        this.f1656d = bundle;
    }

    public final boolean a() {
        switch (this.f1657e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(m mVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + mVar.toString());
        }
        this.f1654b.a(mVar);
    }

    public final void c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(bundle));
        }
        this.f1654b.b(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.f1655c + " id=" + this.f1653a + " oneWay=" + a() + "}";
    }
}

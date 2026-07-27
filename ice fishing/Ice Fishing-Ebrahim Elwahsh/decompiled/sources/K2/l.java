package K2;

import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f1598a;

    /* renamed from: b, reason: collision with root package name */
    public final h3.h f1599b = new h3.h();

    /* renamed from: c, reason: collision with root package name */
    public final int f1600c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f1601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1602e;

    public l(int i, int i4, Bundle bundle, int i9) {
        this.f1602e = i9;
        this.f1598a = i;
        this.f1600c = i4;
        this.f1601d = bundle;
    }

    public final boolean a() {
        switch (this.f1602e) {
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
        this.f1599b.a(mVar);
    }

    public final void c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(bundle));
        }
        this.f1599b.b(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.f1600c + " id=" + this.f1598a + " oneWay=" + a() + "}";
    }
}

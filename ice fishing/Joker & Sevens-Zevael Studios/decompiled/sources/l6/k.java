package l6;

import android.os.Bundle;
import android.util.Log;
import d8.r;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f4192a;

    /* renamed from: b, reason: collision with root package name */
    public final g7.h f4193b = new g7.h();

    /* renamed from: c, reason: collision with root package name */
    public final int f4194c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f4195d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4196e;

    public k(int i10, int i11, Bundle bundle, int i12) {
        this.f4196e = i12;
        this.f4192a = i10;
        this.f4194c = i11;
        this.f4195d = bundle;
    }

    public final boolean a() {
        switch (this.f4196e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(r rVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + rVar.toString());
        }
        this.f4193b.f2537a.k(rVar);
    }

    public final void c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(bundle));
        }
        this.f4193b.a(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.f4194c + " id=" + this.f4192a + " oneWay=" + a() + "}";
    }
}

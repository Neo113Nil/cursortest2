package A1;

import android.content.Context;
import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public final class r implements y, P1.i {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f80n;

    /* renamed from: u, reason: collision with root package name */
    public final Context f81u;

    public /* synthetic */ r(Context context, int i) {
        this.f80n = i;
        this.f81u = context;
    }

    @Override // P1.i
    public Object get() {
        return (ConnectivityManager) this.f81u.getSystemService("connectivity");
    }

    @Override // A1.y
    public x j(E e9) {
        switch (this.f80n) {
            case 0:
                return new t(this.f81u, 0);
            default:
                return new t(this.f81u, 1);
        }
    }
}

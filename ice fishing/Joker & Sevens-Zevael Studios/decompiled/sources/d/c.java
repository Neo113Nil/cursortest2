package d;

import android.os.Build;
import android.window.BackEvent;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float f1481a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1482b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1483c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1484d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1485e;

    public c(BackEvent backEvent) {
        float m10 = a.m(backEvent);
        float n7 = a.n(backEvent);
        float i10 = a.i(backEvent);
        int l10 = a.l(backEvent);
        long b2 = Build.VERSION.SDK_INT >= 36 ? b.b(backEvent) : 0L;
        this.f1481a = m10;
        this.f1482b = n7;
        this.f1483c = i10;
        this.f1484d = l10;
        this.f1485e = b2;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f1481a + ", touchY=" + this.f1482b + ", progress=" + this.f1483c + ", swipeEdge=" + this.f1484d + ", frameTimeMillis=" + this.f1485e + '}';
    }
}

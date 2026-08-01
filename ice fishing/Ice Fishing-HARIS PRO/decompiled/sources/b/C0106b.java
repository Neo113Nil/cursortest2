package b;

import android.window.BackEvent;

/* renamed from: b.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0106b {

    /* renamed from: a, reason: collision with root package name */
    public final float f2264a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2265b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2266c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2267d;

    public C0106b(BackEvent backEvent) {
        D1.i.e(backEvent, "backEvent");
        C0105a c0105a = C0105a.f2263a;
        float d2 = c0105a.d(backEvent);
        float e = c0105a.e(backEvent);
        float b2 = c0105a.b(backEvent);
        int c2 = c0105a.c(backEvent);
        this.f2264a = d2;
        this.f2265b = e;
        this.f2266c = b2;
        this.f2267d = c2;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f2264a + ", touchY=" + this.f2265b + ", progress=" + this.f2266c + ", swipeEdge=" + this.f2267d + '}';
    }
}

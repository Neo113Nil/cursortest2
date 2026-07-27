package androidx.activity;

import android.window.BackEvent;

/* renamed from: androidx.activity.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0450b {

    /* renamed from: a, reason: collision with root package name */
    public final float f4437a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4438b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4439c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4440d;

    public C0450b(BackEvent backEvent) {
        float c9 = AbstractC0449a.c(backEvent);
        float d2 = AbstractC0449a.d(backEvent);
        float a9 = AbstractC0449a.a(backEvent);
        int b9 = AbstractC0449a.b(backEvent);
        this.f4437a = c9;
        this.f4438b = d2;
        this.f4439c = a9;
        this.f4440d = b9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.f4437a);
        sb.append(", touchY=");
        sb.append(this.f4438b);
        sb.append(", progress=");
        sb.append(this.f4439c);
        sb.append(", swipeEdge=");
        return D.y.q(sb, this.f4440d, '}');
    }
}

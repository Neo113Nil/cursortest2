package androidx.activity;

import android.window.BackEvent;

/* renamed from: androidx.activity.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0454b {

    /* renamed from: a, reason: collision with root package name */
    public final float f4405a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4406b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4407c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4408d;

    public C0454b(BackEvent backEvent) {
        float c9 = AbstractC0453a.c(backEvent);
        float d9 = AbstractC0453a.d(backEvent);
        float a9 = AbstractC0453a.a(backEvent);
        int b9 = AbstractC0453a.b(backEvent);
        this.f4405a = c9;
        this.f4406b = d9;
        this.f4407c = a9;
        this.f4408d = b9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.f4405a);
        sb.append(", touchY=");
        sb.append(this.f4406b);
        sb.append(", progress=");
        sb.append(this.f4407c);
        sb.append(", swipeEdge=");
        return D.x.n(sb, this.f4408d, '}');
    }
}

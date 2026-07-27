package androidx.activity;

import android.window.BackEvent;

/* renamed from: androidx.activity.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0460b {

    /* renamed from: a, reason: collision with root package name */
    public final float f4552a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4553b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4554c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4555d;

    public C0460b(BackEvent backEvent) {
        float c4 = AbstractC0459a.c(backEvent);
        float d2 = AbstractC0459a.d(backEvent);
        float a9 = AbstractC0459a.a(backEvent);
        int b9 = AbstractC0459a.b(backEvent);
        this.f4552a = c4;
        this.f4553b = d2;
        this.f4554c = a9;
        this.f4555d = b9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.f4552a);
        sb.append(", touchY=");
        sb.append(this.f4553b);
        sb.append(", progress=");
        sb.append(this.f4554c);
        sb.append(", swipeEdge=");
        return D.y.m(sb, this.f4555d, '}');
    }
}

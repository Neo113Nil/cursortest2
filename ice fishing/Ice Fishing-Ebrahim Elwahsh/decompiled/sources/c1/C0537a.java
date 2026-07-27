package c1;

import android.graphics.PointF;

/* renamed from: c1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0537a {

    /* renamed from: a, reason: collision with root package name */
    public final PointF f5654a;

    /* renamed from: b, reason: collision with root package name */
    public final PointF f5655b;

    /* renamed from: c, reason: collision with root package name */
    public final PointF f5656c;

    public C0537a() {
        this.f5654a = new PointF();
        this.f5655b = new PointF();
        this.f5656c = new PointF();
    }

    public final String toString() {
        PointF pointF = this.f5656c;
        Float valueOf = Float.valueOf(pointF.x);
        Float valueOf2 = Float.valueOf(pointF.y);
        PointF pointF2 = this.f5654a;
        Float valueOf3 = Float.valueOf(pointF2.x);
        Float valueOf4 = Float.valueOf(pointF2.y);
        PointF pointF3 = this.f5655b;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", valueOf, valueOf2, valueOf3, valueOf4, Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public C0537a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f5654a = pointF;
        this.f5655b = pointF2;
        this.f5656c = pointF3;
    }
}

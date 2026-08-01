package c1;

import android.graphics.PointF;

/* renamed from: c1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0533a {

    /* renamed from: a, reason: collision with root package name */
    public final PointF f5494a;

    /* renamed from: b, reason: collision with root package name */
    public final PointF f5495b;

    /* renamed from: c, reason: collision with root package name */
    public final PointF f5496c;

    public C0533a() {
        this.f5494a = new PointF();
        this.f5495b = new PointF();
        this.f5496c = new PointF();
    }

    public final String toString() {
        PointF pointF = this.f5496c;
        Float valueOf = Float.valueOf(pointF.x);
        Float valueOf2 = Float.valueOf(pointF.y);
        PointF pointF2 = this.f5494a;
        Float valueOf3 = Float.valueOf(pointF2.x);
        Float valueOf4 = Float.valueOf(pointF2.y);
        PointF pointF3 = this.f5495b;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", valueOf, valueOf2, valueOf3, valueOf4, Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public C0533a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f5494a = pointF;
        this.f5495b = pointF2;
        this.f5496c = pointF3;
    }
}

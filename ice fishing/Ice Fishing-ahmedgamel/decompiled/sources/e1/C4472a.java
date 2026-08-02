package e1;

import android.graphics.PointF;

/* renamed from: e1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4472a {

    /* renamed from: a, reason: collision with root package name */
    public final PointF f37212a;

    /* renamed from: b, reason: collision with root package name */
    public final PointF f37213b;

    /* renamed from: c, reason: collision with root package name */
    public final PointF f37214c;

    public C4472a() {
        this.f37212a = new PointF();
        this.f37213b = new PointF();
        this.f37214c = new PointF();
    }

    public final String toString() {
        PointF pointF = this.f37214c;
        Float valueOf = Float.valueOf(pointF.x);
        Float valueOf2 = Float.valueOf(pointF.y);
        PointF pointF2 = this.f37212a;
        Float valueOf3 = Float.valueOf(pointF2.x);
        Float valueOf4 = Float.valueOf(pointF2.y);
        PointF pointF3 = this.f37213b;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", valueOf, valueOf2, valueOf3, valueOf4, Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public C4472a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f37212a = pointF;
        this.f37213b = pointF2;
        this.f37214c = pointF3;
    }
}

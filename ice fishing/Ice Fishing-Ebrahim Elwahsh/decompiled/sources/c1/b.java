package c1;

import android.graphics.PointF;
import t0.AbstractC5051n;
import u.AbstractC5088e;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f5657a;

    /* renamed from: b, reason: collision with root package name */
    public String f5658b;

    /* renamed from: c, reason: collision with root package name */
    public float f5659c;

    /* renamed from: d, reason: collision with root package name */
    public int f5660d;

    /* renamed from: e, reason: collision with root package name */
    public int f5661e;

    /* renamed from: f, reason: collision with root package name */
    public float f5662f;

    /* renamed from: g, reason: collision with root package name */
    public float f5663g;

    /* renamed from: h, reason: collision with root package name */
    public int f5664h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public float f5665j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5666k;

    /* renamed from: l, reason: collision with root package name */
    public PointF f5667l;

    /* renamed from: m, reason: collision with root package name */
    public PointF f5668m;

    public final int hashCode() {
        int d2 = ((AbstractC5088e.d(this.f5660d) + (((int) (AbstractC5051n.k(this.f5657a.hashCode() * 31, 31, this.f5658b) + this.f5659c)) * 31)) * 31) + this.f5661e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f5662f);
        return (((d2 * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f5664h;
    }
}

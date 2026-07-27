package c1;

import android.graphics.PointF;
import u.AbstractC5049e;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f5497a;

    /* renamed from: b, reason: collision with root package name */
    public String f5498b;

    /* renamed from: c, reason: collision with root package name */
    public float f5499c;

    /* renamed from: d, reason: collision with root package name */
    public int f5500d;

    /* renamed from: e, reason: collision with root package name */
    public int f5501e;

    /* renamed from: f, reason: collision with root package name */
    public float f5502f;

    /* renamed from: g, reason: collision with root package name */
    public float f5503g;

    /* renamed from: h, reason: collision with root package name */
    public int f5504h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public float f5505j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5506k;

    /* renamed from: l, reason: collision with root package name */
    public PointF f5507l;

    /* renamed from: m, reason: collision with root package name */
    public PointF f5508m;

    public final int hashCode() {
        int d2 = ((AbstractC5049e.d(this.f5500d) + (((int) (u1.h.k(this.f5497a.hashCode() * 31, 31, this.f5498b) + this.f5499c)) * 31)) * 31) + this.f5501e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f5502f);
        return (((d2 * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f5504h;
    }
}

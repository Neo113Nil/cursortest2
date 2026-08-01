package k1;

import X0.i;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import e1.c;

/* renamed from: k1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4629a {

    /* renamed from: a, reason: collision with root package name */
    public final i f38551a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f38552b;

    /* renamed from: c, reason: collision with root package name */
    public Object f38553c;

    /* renamed from: d, reason: collision with root package name */
    public final Interpolator f38554d;

    /* renamed from: e, reason: collision with root package name */
    public final Interpolator f38555e;

    /* renamed from: f, reason: collision with root package name */
    public final Interpolator f38556f;

    /* renamed from: g, reason: collision with root package name */
    public final float f38557g;

    /* renamed from: h, reason: collision with root package name */
    public Float f38558h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f38559j;

    /* renamed from: k, reason: collision with root package name */
    public int f38560k;

    /* renamed from: l, reason: collision with root package name */
    public int f38561l;

    /* renamed from: m, reason: collision with root package name */
    public float f38562m;

    /* renamed from: n, reason: collision with root package name */
    public float f38563n;

    /* renamed from: o, reason: collision with root package name */
    public PointF f38564o;

    /* renamed from: p, reason: collision with root package name */
    public PointF f38565p;

    public C4629a(i iVar, Object obj, Object obj2, Interpolator interpolator, float f3, Float f9) {
        this.i = -3987645.8f;
        this.f38559j = -3987645.8f;
        this.f38560k = 784923401;
        this.f38561l = 784923401;
        this.f38562m = Float.MIN_VALUE;
        this.f38563n = Float.MIN_VALUE;
        this.f38564o = null;
        this.f38565p = null;
        this.f38551a = iVar;
        this.f38552b = obj;
        this.f38553c = obj2;
        this.f38554d = interpolator;
        this.f38555e = null;
        this.f38556f = null;
        this.f38557g = f3;
        this.f38558h = f9;
    }

    public final float a() {
        if (this.f38551a == null) {
            return 1.0f;
        }
        if (this.f38563n == Float.MIN_VALUE) {
            if (this.f38558h == null) {
                this.f38563n = 1.0f;
            } else {
                this.f38563n = (float) (b() + ((this.f38558h.floatValue() - this.f38557g) / (r1.f3624m - r1.f3623l)));
            }
        }
        return this.f38563n;
    }

    public final float b() {
        i iVar = this.f38551a;
        if (iVar == null) {
            return 0.0f;
        }
        if (this.f38562m == Float.MIN_VALUE) {
            float f3 = iVar.f3623l;
            this.f38562m = (this.f38557g - f3) / (iVar.f3624m - f3);
        }
        return this.f38562m;
    }

    public final boolean c() {
        return this.f38554d == null && this.f38555e == null && this.f38556f == null;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f38552b + ", endValue=" + this.f38553c + ", startFrame=" + this.f38557g + ", endFrame=" + this.f38558h + ", interpolator=" + this.f38554d + '}';
    }

    public C4629a(i iVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f3) {
        this.i = -3987645.8f;
        this.f38559j = -3987645.8f;
        this.f38560k = 784923401;
        this.f38561l = 784923401;
        this.f38562m = Float.MIN_VALUE;
        this.f38563n = Float.MIN_VALUE;
        this.f38564o = null;
        this.f38565p = null;
        this.f38551a = iVar;
        this.f38552b = obj;
        this.f38553c = obj2;
        this.f38554d = null;
        this.f38555e = interpolator;
        this.f38556f = interpolator2;
        this.f38557g = f3;
        this.f38558h = null;
    }

    public C4629a(i iVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f3, Float f9) {
        this.i = -3987645.8f;
        this.f38559j = -3987645.8f;
        this.f38560k = 784923401;
        this.f38561l = 784923401;
        this.f38562m = Float.MIN_VALUE;
        this.f38563n = Float.MIN_VALUE;
        this.f38564o = null;
        this.f38565p = null;
        this.f38551a = iVar;
        this.f38552b = obj;
        this.f38553c = obj2;
        this.f38554d = interpolator;
        this.f38555e = interpolator2;
        this.f38556f = interpolator3;
        this.f38557g = f3;
        this.f38558h = f9;
    }

    public C4629a(Object obj) {
        this.i = -3987645.8f;
        this.f38559j = -3987645.8f;
        this.f38560k = 784923401;
        this.f38561l = 784923401;
        this.f38562m = Float.MIN_VALUE;
        this.f38563n = Float.MIN_VALUE;
        this.f38564o = null;
        this.f38565p = null;
        this.f38551a = null;
        this.f38552b = obj;
        this.f38553c = obj;
        this.f38554d = null;
        this.f38555e = null;
        this.f38556f = null;
        this.f38557g = Float.MIN_VALUE;
        this.f38558h = Float.valueOf(Float.MAX_VALUE);
    }

    public C4629a(c cVar, c cVar2) {
        this.i = -3987645.8f;
        this.f38559j = -3987645.8f;
        this.f38560k = 784923401;
        this.f38561l = 784923401;
        this.f38562m = Float.MIN_VALUE;
        this.f38563n = Float.MIN_VALUE;
        this.f38564o = null;
        this.f38565p = null;
        this.f38551a = null;
        this.f38552b = cVar;
        this.f38553c = cVar2;
        this.f38554d = null;
        this.f38555e = null;
        this.f38556f = null;
        this.f38557g = Float.MIN_VALUE;
        this.f38558h = Float.valueOf(Float.MAX_VALUE);
    }
}

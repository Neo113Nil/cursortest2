package m1;

import Z0.i;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import g1.c;

/* renamed from: m1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4739a {

    /* renamed from: a, reason: collision with root package name */
    public final i f39340a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f39341b;

    /* renamed from: c, reason: collision with root package name */
    public Object f39342c;

    /* renamed from: d, reason: collision with root package name */
    public final Interpolator f39343d;

    /* renamed from: e, reason: collision with root package name */
    public final Interpolator f39344e;

    /* renamed from: f, reason: collision with root package name */
    public final Interpolator f39345f;

    /* renamed from: g, reason: collision with root package name */
    public final float f39346g;

    /* renamed from: h, reason: collision with root package name */
    public Float f39347h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f39348j;

    /* renamed from: k, reason: collision with root package name */
    public int f39349k;

    /* renamed from: l, reason: collision with root package name */
    public int f39350l;

    /* renamed from: m, reason: collision with root package name */
    public float f39351m;

    /* renamed from: n, reason: collision with root package name */
    public float f39352n;

    /* renamed from: o, reason: collision with root package name */
    public PointF f39353o;

    /* renamed from: p, reason: collision with root package name */
    public PointF f39354p;

    public C4739a(i iVar, Object obj, Object obj2, Interpolator interpolator, float f2, Float f9) {
        this.i = -3987645.8f;
        this.f39348j = -3987645.8f;
        this.f39349k = 784923401;
        this.f39350l = 784923401;
        this.f39351m = Float.MIN_VALUE;
        this.f39352n = Float.MIN_VALUE;
        this.f39353o = null;
        this.f39354p = null;
        this.f39340a = iVar;
        this.f39341b = obj;
        this.f39342c = obj2;
        this.f39343d = interpolator;
        this.f39344e = null;
        this.f39345f = null;
        this.f39346g = f2;
        this.f39347h = f9;
    }

    public final float a() {
        if (this.f39340a == null) {
            return 1.0f;
        }
        if (this.f39352n == Float.MIN_VALUE) {
            if (this.f39347h == null) {
                this.f39352n = 1.0f;
            } else {
                this.f39352n = (float) (b() + ((this.f39347h.floatValue() - this.f39346g) / (r1.f3976m - r1.f3975l)));
            }
        }
        return this.f39352n;
    }

    public final float b() {
        i iVar = this.f39340a;
        if (iVar == null) {
            return 0.0f;
        }
        if (this.f39351m == Float.MIN_VALUE) {
            float f2 = iVar.f3975l;
            this.f39351m = (this.f39346g - f2) / (iVar.f3976m - f2);
        }
        return this.f39351m;
    }

    public final boolean c() {
        return this.f39343d == null && this.f39344e == null && this.f39345f == null;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f39341b + ", endValue=" + this.f39342c + ", startFrame=" + this.f39346g + ", endFrame=" + this.f39347h + ", interpolator=" + this.f39343d + '}';
    }

    public C4739a(i iVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f2) {
        this.i = -3987645.8f;
        this.f39348j = -3987645.8f;
        this.f39349k = 784923401;
        this.f39350l = 784923401;
        this.f39351m = Float.MIN_VALUE;
        this.f39352n = Float.MIN_VALUE;
        this.f39353o = null;
        this.f39354p = null;
        this.f39340a = iVar;
        this.f39341b = obj;
        this.f39342c = obj2;
        this.f39343d = null;
        this.f39344e = interpolator;
        this.f39345f = interpolator2;
        this.f39346g = f2;
        this.f39347h = null;
    }

    public C4739a(i iVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f2, Float f9) {
        this.i = -3987645.8f;
        this.f39348j = -3987645.8f;
        this.f39349k = 784923401;
        this.f39350l = 784923401;
        this.f39351m = Float.MIN_VALUE;
        this.f39352n = Float.MIN_VALUE;
        this.f39353o = null;
        this.f39354p = null;
        this.f39340a = iVar;
        this.f39341b = obj;
        this.f39342c = obj2;
        this.f39343d = interpolator;
        this.f39344e = interpolator2;
        this.f39345f = interpolator3;
        this.f39346g = f2;
        this.f39347h = f9;
    }

    public C4739a(Object obj) {
        this.i = -3987645.8f;
        this.f39348j = -3987645.8f;
        this.f39349k = 784923401;
        this.f39350l = 784923401;
        this.f39351m = Float.MIN_VALUE;
        this.f39352n = Float.MIN_VALUE;
        this.f39353o = null;
        this.f39354p = null;
        this.f39340a = null;
        this.f39341b = obj;
        this.f39342c = obj;
        this.f39343d = null;
        this.f39344e = null;
        this.f39345f = null;
        this.f39346g = Float.MIN_VALUE;
        this.f39347h = Float.valueOf(Float.MAX_VALUE);
    }

    public C4739a(c cVar, c cVar2) {
        this.i = -3987645.8f;
        this.f39348j = -3987645.8f;
        this.f39349k = 784923401;
        this.f39350l = 784923401;
        this.f39351m = Float.MIN_VALUE;
        this.f39352n = Float.MIN_VALUE;
        this.f39353o = null;
        this.f39354p = null;
        this.f39340a = null;
        this.f39341b = cVar;
        this.f39342c = cVar2;
        this.f39343d = null;
        this.f39344e = null;
        this.f39345f = null;
        this.f39346g = Float.MIN_VALUE;
        this.f39347h = Float.valueOf(Float.MAX_VALUE);
    }
}

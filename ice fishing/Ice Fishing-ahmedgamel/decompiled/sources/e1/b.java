package e1;

import android.graphics.PointF;
import u.AbstractC5050e;
import w.AbstractC5128c;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f37215a;

    /* renamed from: b, reason: collision with root package name */
    public String f37216b;

    /* renamed from: c, reason: collision with root package name */
    public float f37217c;

    /* renamed from: d, reason: collision with root package name */
    public int f37218d;

    /* renamed from: e, reason: collision with root package name */
    public int f37219e;

    /* renamed from: f, reason: collision with root package name */
    public float f37220f;

    /* renamed from: g, reason: collision with root package name */
    public float f37221g;

    /* renamed from: h, reason: collision with root package name */
    public int f37222h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public float f37223j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f37224k;

    /* renamed from: l, reason: collision with root package name */
    public PointF f37225l;

    /* renamed from: m, reason: collision with root package name */
    public PointF f37226m;

    public final int hashCode() {
        int d9 = ((AbstractC5050e.d(this.f37218d) + (((int) (AbstractC5128c.a(this.f37215a.hashCode() * 31, 31, this.f37216b) + this.f37217c)) * 31)) * 31) + this.f37219e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f37220f);
        return (((d9 * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f37222h;
    }
}

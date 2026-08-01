package R;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f981a;

    /* renamed from: b, reason: collision with root package name */
    public int f982b;

    /* renamed from: c, reason: collision with root package name */
    public float f983c;

    /* renamed from: d, reason: collision with root package name */
    public float f984d;
    public long e;

    /* renamed from: f, reason: collision with root package name */
    public long f985f;

    /* renamed from: g, reason: collision with root package name */
    public long f986g;

    /* renamed from: h, reason: collision with root package name */
    public float f987h;
    public int i;

    public final float a(long j) {
        if (j < this.e) {
            return RecyclerView.f2111C0;
        }
        long j2 = this.f986g;
        if (j2 < 0 || j < j2) {
            return d.b((j - r0) / this.f981a, RecyclerView.f2111C0, 1.0f) * 0.5f;
        }
        float f2 = this.f987h;
        return (d.b((j - j2) / this.i, RecyclerView.f2111C0, 1.0f) * f2) + (1.0f - f2);
    }
}

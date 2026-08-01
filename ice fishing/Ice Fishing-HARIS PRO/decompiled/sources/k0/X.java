package k0;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public int f3422a;

    /* renamed from: b, reason: collision with root package name */
    public int f3423b;

    /* renamed from: c, reason: collision with root package name */
    public int f3424c;

    /* renamed from: d, reason: collision with root package name */
    public int f3425d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3426f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3427g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3428h;
    public boolean i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3429k;

    /* renamed from: l, reason: collision with root package name */
    public int f3430l;

    /* renamed from: m, reason: collision with root package name */
    public long f3431m;

    /* renamed from: n, reason: collision with root package name */
    public int f3432n;

    public final void a(int i) {
        if ((this.f3425d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f3425d));
    }

    public final int b() {
        return this.f3427g ? this.f3423b - this.f3424c : this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f3422a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f3423b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f3424c + ", mStructureChanged=" + this.f3426f + ", mInPreLayout=" + this.f3427g + ", mRunSimpleAnimations=" + this.j + ", mRunPredictiveAnimations=" + this.f3429k + '}';
    }
}

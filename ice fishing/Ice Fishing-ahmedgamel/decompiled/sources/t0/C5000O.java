package t0;

/* renamed from: t0.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5000O {

    /* renamed from: a, reason: collision with root package name */
    public int f40572a;

    /* renamed from: b, reason: collision with root package name */
    public int f40573b;

    /* renamed from: c, reason: collision with root package name */
    public int f40574c;

    /* renamed from: d, reason: collision with root package name */
    public int f40575d;

    /* renamed from: e, reason: collision with root package name */
    public int f40576e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f40577f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f40578g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f40579h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f40580j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f40581k;

    /* renamed from: l, reason: collision with root package name */
    public int f40582l;

    /* renamed from: m, reason: collision with root package name */
    public long f40583m;

    /* renamed from: n, reason: collision with root package name */
    public int f40584n;

    public final void a(int i) {
        if ((this.f40575d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f40575d));
    }

    public final int b() {
        return this.f40578g ? this.f40573b - this.f40574c : this.f40576e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f40572a + ", mData=null, mItemCount=" + this.f40576e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f40573b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f40574c + ", mStructureChanged=" + this.f40577f + ", mInPreLayout=" + this.f40578g + ", mRunSimpleAnimations=" + this.f40580j + ", mRunPredictiveAnimations=" + this.f40581k + '}';
    }
}

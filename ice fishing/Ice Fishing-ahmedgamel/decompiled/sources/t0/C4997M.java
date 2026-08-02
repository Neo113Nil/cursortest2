package t0;

/* renamed from: t0.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4997M {

    /* renamed from: a, reason: collision with root package name */
    public int f40622a;

    /* renamed from: b, reason: collision with root package name */
    public int f40623b;

    /* renamed from: c, reason: collision with root package name */
    public int f40624c;

    /* renamed from: d, reason: collision with root package name */
    public int f40625d;

    /* renamed from: e, reason: collision with root package name */
    public int f40626e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f40627f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f40628g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f40629h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f40630j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f40631k;

    /* renamed from: l, reason: collision with root package name */
    public int f40632l;

    /* renamed from: m, reason: collision with root package name */
    public long f40633m;

    /* renamed from: n, reason: collision with root package name */
    public int f40634n;

    public final void a(int i) {
        if ((this.f40625d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f40625d));
    }

    public final int b() {
        return this.f40628g ? this.f40623b - this.f40624c : this.f40626e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f40622a + ", mData=null, mItemCount=" + this.f40626e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f40623b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f40624c + ", mStructureChanged=" + this.f40627f + ", mInPreLayout=" + this.f40628g + ", mRunSimpleAnimations=" + this.f40630j + ", mRunPredictiveAnimations=" + this.f40631k + '}';
    }
}

package t0;

/* renamed from: t0.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5029M {

    /* renamed from: a, reason: collision with root package name */
    public int f40594a;

    /* renamed from: b, reason: collision with root package name */
    public int f40595b;

    /* renamed from: c, reason: collision with root package name */
    public int f40596c;

    /* renamed from: d, reason: collision with root package name */
    public int f40597d;

    /* renamed from: e, reason: collision with root package name */
    public int f40598e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f40599f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f40600g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f40601h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f40602j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f40603k;

    /* renamed from: l, reason: collision with root package name */
    public int f40604l;

    /* renamed from: m, reason: collision with root package name */
    public long f40605m;

    /* renamed from: n, reason: collision with root package name */
    public int f40606n;

    public final void a(int i) {
        if ((this.f40597d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f40597d));
    }

    public final int b() {
        return this.f40600g ? this.f40595b - this.f40596c : this.f40598e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f40594a + ", mData=null, mItemCount=" + this.f40598e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f40595b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f40596c + ", mStructureChanged=" + this.f40599f + ", mInPreLayout=" + this.f40600g + ", mRunSimpleAnimations=" + this.f40602j + ", mRunPredictiveAnimations=" + this.f40603k + '}';
    }
}

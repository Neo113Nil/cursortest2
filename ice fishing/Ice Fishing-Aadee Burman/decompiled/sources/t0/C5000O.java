package t0;

/* renamed from: t0.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5000O {

    /* renamed from: a, reason: collision with root package name */
    public int f40569a;

    /* renamed from: b, reason: collision with root package name */
    public int f40570b;

    /* renamed from: c, reason: collision with root package name */
    public int f40571c;

    /* renamed from: d, reason: collision with root package name */
    public int f40572d;

    /* renamed from: e, reason: collision with root package name */
    public int f40573e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f40574f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f40575g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f40576h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f40577j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f40578k;

    /* renamed from: l, reason: collision with root package name */
    public int f40579l;

    /* renamed from: m, reason: collision with root package name */
    public long f40580m;

    /* renamed from: n, reason: collision with root package name */
    public int f40581n;

    public final void a(int i) {
        if ((this.f40572d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f40572d));
    }

    public final int b() {
        return this.f40575g ? this.f40570b - this.f40571c : this.f40573e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f40569a + ", mData=null, mItemCount=" + this.f40573e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f40570b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f40571c + ", mStructureChanged=" + this.f40574f + ", mInPreLayout=" + this.f40575g + ", mRunSimpleAnimations=" + this.f40577j + ", mRunPredictiveAnimations=" + this.f40578k + '}';
    }
}

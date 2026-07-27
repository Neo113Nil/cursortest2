package L;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public int f478a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f479b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f480c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f481d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f482e;

    public final int a() {
        if (this.f480c) {
            return 0 - this.f478a;
        }
        return 0;
    }

    public final String toString() {
        return "State{mTargetPosition=-1, mData=null, mItemCount=0, mIsMeasuring=false, mPreviousLayoutItemCount=0, mDeletedInvisibleItemCountSincePreviousLayout=" + this.f478a + ", mStructureChanged=" + this.f479b + ", mInPreLayout=" + this.f480c + ", mRunSimpleAnimations=" + this.f481d + ", mRunPredictiveAnimations=" + this.f482e + '}';
    }
}

package L;

/* renamed from: L.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0038n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f581a;

    /* renamed from: b, reason: collision with root package name */
    public int f582b;

    /* renamed from: c, reason: collision with root package name */
    public int f583c;

    public String toString() {
        switch (this.f581a) {
            case 0:
                return "LayoutState{mAvailable=0, mCurrentPosition=0, mItemDirection=0, mLayoutDirection=0, mStartLine=" + this.f582b + ", mEndLine=" + this.f583c + '}';
            default:
                return super.toString();
        }
    }

    public C0038n(int i2, int i3) {
        this.f581a = 1;
        this.f582b = i2;
        this.f583c = i3;
    }
}

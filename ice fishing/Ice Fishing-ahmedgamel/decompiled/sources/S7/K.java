package S7;

/* loaded from: classes2.dex */
public final class K extends M {

    /* renamed from: v, reason: collision with root package name */
    public final C0393g f3005v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ O f3006w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(O o4, long j6, C0393g c0393g) {
        super(j6);
        this.f3006w = o4;
        this.f3005v = c0393g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3005v.B(this.f3006w);
    }

    @Override // S7.M
    public final String toString() {
        return super.toString() + this.f3005v;
    }
}

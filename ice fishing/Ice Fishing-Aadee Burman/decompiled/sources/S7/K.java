package S7;

/* loaded from: classes2.dex */
public final class K extends M {

    /* renamed from: v, reason: collision with root package name */
    public final C0389g f2922v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ O f2923w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(O o6, long j6, C0389g c0389g) {
        super(j6);
        this.f2923w = o6;
        this.f2922v = c0389g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2922v.B(this.f2923w);
    }

    @Override // S7.M
    public final String toString() {
        return super.toString() + this.f2922v;
    }
}

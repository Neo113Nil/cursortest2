package Y3;

/* loaded from: classes2.dex */
public final class h implements V3.g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3961a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3962b = false;

    /* renamed from: c, reason: collision with root package name */
    public V3.c f3963c;

    /* renamed from: d, reason: collision with root package name */
    public final f f3964d;

    public h(f fVar) {
        this.f3964d = fVar;
    }

    @Override // V3.g
    public final V3.g d(String str) {
        if (this.f3961a) {
            throw new V3.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f3961a = true;
        this.f3964d.e(this.f3963c, str, this.f3962b);
        return this;
    }

    @Override // V3.g
    public final V3.g e(boolean z3) {
        if (this.f3961a) {
            throw new V3.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f3961a = true;
        this.f3964d.d(this.f3963c, z3 ? 1 : 0, this.f3962b);
        return this;
    }
}

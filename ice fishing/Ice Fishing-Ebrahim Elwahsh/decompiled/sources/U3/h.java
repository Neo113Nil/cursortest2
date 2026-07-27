package U3;

/* loaded from: classes2.dex */
public final class h implements R3.g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3296a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3297b = false;

    /* renamed from: c, reason: collision with root package name */
    public R3.c f3298c;

    /* renamed from: d, reason: collision with root package name */
    public final f f3299d;

    public h(f fVar) {
        this.f3299d = fVar;
    }

    @Override // R3.g
    public final R3.g d(String str) {
        if (this.f3296a) {
            throw new R3.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f3296a = true;
        this.f3299d.e(this.f3298c, str, this.f3297b);
        return this;
    }

    @Override // R3.g
    public final R3.g e(boolean z8) {
        if (this.f3296a) {
            throw new R3.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f3296a = true;
        this.f3299d.d(this.f3298c, z8 ? 1 : 0, this.f3297b);
        return this;
    }
}

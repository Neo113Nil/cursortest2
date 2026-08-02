package a4;

/* loaded from: classes2.dex */
public final class h implements X3.g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4314a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4315b = false;

    /* renamed from: c, reason: collision with root package name */
    public X3.c f4316c;

    /* renamed from: d, reason: collision with root package name */
    public final f f4317d;

    public h(f fVar) {
        this.f4317d = fVar;
    }

    @Override // X3.g
    public final X3.g d(String str) {
        if (this.f4314a) {
            throw new X3.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f4314a = true;
        this.f4317d.e(this.f4316c, str, this.f4315b);
        return this;
    }

    @Override // X3.g
    public final X3.g e(boolean z6) {
        if (this.f4314a) {
            throw new X3.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f4314a = true;
        this.f4317d.d(this.f4316c, z6 ? 1 : 0, this.f4315b);
        return this;
    }
}

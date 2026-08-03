package s7;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h implements p7.g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6469a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6470b = false;

    /* renamed from: c, reason: collision with root package name */
    public p7.c f6471c;

    /* renamed from: d, reason: collision with root package name */
    public final f f6472d;

    public h(f fVar) {
        this.f6472d = fVar;
    }

    @Override // p7.g
    public final p7.g b(String str) {
        if (this.f6469a) {
            throw new p7.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f6469a = true;
        this.f6472d.e(this.f6471c, str, this.f6470b);
        return this;
    }

    @Override // p7.g
    public final p7.g e(boolean z10) {
        if (this.f6469a) {
            throw new p7.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f6469a = true;
        this.f6472d.b(this.f6471c, z10 ? 1 : 0, this.f6470b);
        return this;
    }
}

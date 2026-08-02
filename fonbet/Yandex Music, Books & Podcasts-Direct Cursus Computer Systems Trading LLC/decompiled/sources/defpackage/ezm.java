package defpackage;

/* loaded from: classes3.dex */
public final class ezm implements uwt {
    public boolean a = false;
    public boolean b = false;
    public d9c c;
    public final dzm d;

    public ezm(dzm dzmVar) {
        this.d = dzmVar;
    }

    @Override // defpackage.uwt
    public final uwt b(String str) {
        if (this.a) {
            throw new r6b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.i(this.c, str, this.b);
        return this;
    }

    @Override // defpackage.uwt
    public final uwt c(boolean z) {
        if (this.a) {
            throw new r6b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.c(this.c, z ? 1 : 0, this.b);
        return this;
    }
}

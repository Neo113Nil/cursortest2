package defpackage;

/* loaded from: classes.dex */
public final class hx1 {
    public boolean a;
    public boolean b;
    public boolean c;

    public /* synthetic */ hx1(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public ix1 a() {
        if (this.a || !(this.b || this.c)) {
            return new ix1(this);
        }
        xq0.q("Secondary offload attribute fields are true but primary isFormatSupported is false");
        return null;
    }

    public boolean b() {
        return (this.c || this.b) && this.a;
    }
}

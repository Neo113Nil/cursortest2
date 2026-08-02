package defpackage;

/* loaded from: classes6.dex */
public final class v5n {
    public final fnb a;
    public final jyr b;

    public v5n(fnb fnbVar) {
        fnbVar.getClass();
        this.a = fnbVar;
        this.b = btf.b(new p1n(2));
    }

    public static snb a(p5n p5nVar) {
        int ordinal = p5nVar.ordinal();
        if (ordinal == 0) {
            return snb.LOW;
        }
        if (ordinal == 1) {
            return snb.NORMAL;
        }
        if (ordinal == 2) {
            return snb.LOSSLESS;
        }
        if (ordinal == 3) {
            return snb.NORMAL;
        }
        b6e.s();
        return null;
    }
}

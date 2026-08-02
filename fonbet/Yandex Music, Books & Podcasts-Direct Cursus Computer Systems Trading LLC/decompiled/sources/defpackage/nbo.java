package defpackage;

/* loaded from: classes4.dex */
public final class nbo {
    public final pbo a;

    public nbo(boolean z) {
        lum lumVar = pil.a;
        this.a = new pbo(new gbo(2), new i32(3, z), 12);
    }

    public static lum b(maa maaVar) {
        maaVar.getClass();
        int ordinal = maaVar.ordinal();
        if (ordinal == 0) {
            return pil.a;
        }
        if (ordinal == 1 || ordinal == 2) {
            return cjm.b;
        }
        if (ordinal == 3) {
            return pka.b;
        }
        b6e.s();
        return null;
    }

    public final pbo a(maa maaVar) {
        int ordinal = maaVar.ordinal();
        if (ordinal == 0) {
            return this.a;
        }
        if (ordinal == 1) {
            return cjm.a;
        }
        if (ordinal == 2) {
            return cjm.a;
        }
        if (ordinal == 3) {
            return pka.a;
        }
        b6e.s();
        return null;
    }
}

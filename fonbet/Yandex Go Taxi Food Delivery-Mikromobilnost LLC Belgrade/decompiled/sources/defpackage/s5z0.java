package defpackage;

/* loaded from: classes4.dex */
public final class s5z0 extends o2 implements y1 {
    public b3 a;

    public s5z0(b3 b3Var) {
        if ((b3Var instanceof v3) || (b3Var instanceof g2)) {
            this.a = b3Var;
        } else {
            ny61.g("unknown object passed to Time");
            throw null;
        }
    }

    public static s5z0 m(b3 b3Var) {
        if (b3Var instanceof v3) {
            return new s5z0((v3) b3Var);
        }
        if (b3Var instanceof g2) {
            return new s5z0((g2) b3Var);
        }
        ny61.g("unknown object in factory: ".concat(b3Var.getClass().getName()));
        return null;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        return this.a;
    }
}

package defpackage;

/* loaded from: classes.dex */
public abstract class dih extends sk4 {
    public final long j;

    public dih(db7 db7Var, nb7 nb7Var, dsc dscVar, int i, Object obj, long j, long j2, long j3) {
        super(db7Var, nb7Var, 1, dscVar, i, obj, j, j2);
        dscVar.getClass();
        this.j = j3;
    }

    public long b() {
        long j = this.j;
        if (j != -1) {
            return j + 1;
        }
        return -1L;
    }

    public abstract boolean c();
}

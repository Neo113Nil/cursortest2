package defpackage;

/* loaded from: classes11.dex */
public final class qez0 {
    public static final void a(qez0 qez0Var, long j, int i) {
        qez0Var.getClass();
        if (i < 0 || i >= 1000000000) {
            w511.f(oyr.i(i, "Timestamp nanoseconds out of range: "));
        } else if (-62135596800L > j || j >= 253402300800L) {
            w511.f(qv10.j(j, "Timestamp seconds out of range: "));
        }
    }
}

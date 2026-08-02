package defpackage;

/* loaded from: classes15.dex */
public abstract class uh10 {
    public abstract int a(long j, String str);

    public abstract int b(long j);

    public abstract long c(oh10 oh10Var);

    public void d(long j, String[] strArr, long[] jArr) {
        b(j);
        int i = 0;
        if ((strArr == null) != (jArr == null)) {
            z83.i();
        }
        if (strArr == null || jArr == null) {
            return;
        }
        z83.i();
        int length = strArr.length;
        while (i < length) {
            long j2 = j;
            z83.e(Long.valueOf(c(new oh10(j2, jArr[i], strArr[i]))));
            i++;
            j = j2;
        }
    }
}

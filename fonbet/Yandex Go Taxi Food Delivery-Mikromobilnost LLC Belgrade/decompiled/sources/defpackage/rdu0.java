package defpackage;

import android.database.Cursor;

/* loaded from: classes15.dex */
public abstract class rdu0 {
    public abstract void a();

    public abstract void b();

    public abstract Cursor c();

    public abstract Cursor d();

    public abstract int e(String str);

    public abstract long f(long j, long j2, String str);

    public abstract long g(long j, long j2, String str);

    public abstract long h(long j, long j2, String str);

    public void i(String[] strArr) {
        a();
        b();
        int length = strArr.length;
        int i = 0;
        long j = 0;
        long j2 = 0;
        while (i < length) {
            String str = strArr[i];
            rdu0 rdu0Var = this;
            rdu0Var.f(j, j2, str);
            rdu0Var.g(j, j2, str);
            long j3 = j + 1;
            int e = rdu0Var.e(str);
            long j4 = j2;
            rdu0Var.h(j3, j4, str);
            j = j3 + e;
            j2 = j4 + 1;
            i++;
            this = rdu0Var;
        }
    }
}

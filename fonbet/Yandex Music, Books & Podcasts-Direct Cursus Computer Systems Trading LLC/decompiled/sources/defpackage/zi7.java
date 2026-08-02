package defpackage;

import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zi7 {
    public int c;
    public int d;
    public final boolean a = true;
    public final int b = SQLiteDatabase.OPEN_FULLMUTEX;
    public int e = 0;
    public l60[] f = new l60[100];

    public final synchronized int a() {
        return this.d * this.b;
    }

    public final synchronized void b(int i) {
        boolean z = i < this.c;
        this.c = i;
        if (z) {
            c();
        }
    }

    public final synchronized void c() {
        int max = Math.max(0, dvt.f(this.c, this.b) - this.d);
        int i = this.e;
        if (max >= i) {
            return;
        }
        Arrays.fill(this.f, max, i, (Object) null);
        this.e = max;
    }
}

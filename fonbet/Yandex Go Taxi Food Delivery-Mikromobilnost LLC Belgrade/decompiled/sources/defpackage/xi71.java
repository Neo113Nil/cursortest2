package defpackage;

import java.util.Arrays;

/* loaded from: classes7.dex */
public final class xi71 {
    public int a;
    public int b;
    public int c = 0;
    public j191[] d = new j191[100];

    public final synchronized j191 a() {
        j191 j191Var;
        try {
            int i = this.b + 1;
            this.b = i;
            int i2 = this.c;
            if (i2 > 0) {
                j191[] j191VarArr = this.d;
                int i3 = i2 - 1;
                this.c = i3;
                j191Var = j191VarArr[i3];
                j191Var.getClass();
                this.d[this.c] = null;
            } else {
                j191 j191Var2 = new j191(new byte[65536]);
                j191[] j191VarArr2 = this.d;
                if (i > j191VarArr2.length) {
                    this.d = (j191[]) Arrays.copyOf(j191VarArr2, j191VarArr2.length * 2);
                }
                j191Var = j191Var2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return j191Var;
    }

    public final synchronized void b(int i) {
        boolean z = i < this.a;
        this.a = i;
        if (z) {
            c();
        }
    }

    public final synchronized void c() {
        int i = this.a;
        int i2 = rf71.a;
        int max = Math.max(0, ((i + 65535) / 65536) - this.b);
        int i3 = this.c;
        if (max >= i3) {
            return;
        }
        Arrays.fill(this.d, max, i3, (Object) null);
        this.c = max;
    }
}

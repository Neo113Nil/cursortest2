package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class h8s {
    public int a;
    public boolean b;
    public Object[] c;

    public h8s(int i) {
        switch (i) {
            case 1:
                wdg.a0(4, "initialCapacity");
                this.c = new Object[4];
                this.a = 0;
                break;
            default:
                this.c = null;
                this.b = false;
                this.a = 0;
                break;
        }
    }

    public static q5i a() {
        q5i q5iVar = new q5i();
        q5iVar.a = true;
        q5iVar.b = 0;
        return q5iVar;
    }

    public static int d(int i, int i2) {
        if (i2 < 0) {
            xq0.x("cannot store more than MAX_VALUE elements");
            return 0;
        }
        if (i2 <= i) {
            return i;
        }
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int highestOneBit = Integer.highestOneBit(i2 - 1);
            i3 = highestOneBit + highestOneBit;
        }
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }

    public abstract void b(fo0 fo0Var, i8s i8sVar);

    public void c(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.c;
        int i = this.a;
        this.a = i + 1;
        objArr[i] = obj;
    }

    public void e(int i) {
        int length = this.c.length;
        int d = d(length, this.a + i);
        if (d > length || this.b) {
            this.c = Arrays.copyOf(this.c, d);
            this.b = false;
        }
    }
}

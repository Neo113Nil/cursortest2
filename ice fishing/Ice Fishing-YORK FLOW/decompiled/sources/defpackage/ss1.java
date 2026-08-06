package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ss1 implements java.lang.Comparable, java.io.Serializable {
    public static final defpackage.ss1 QiMR8OkAhezm = new defpackage.ss1(0, 0);
    public final long WDYagTQQm9ns;
    public final long oh71FJcDz6S2;

    public ss1(long j, long j2) {
        this.WDYagTQQm9ns = j;
        this.oh71FJcDz6S2 = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        defpackage.ss1 ss1Var = (defpackage.ss1) obj;
        ss1Var.getClass();
        long j = ss1Var.WDYagTQQm9ns;
        long j2 = this.WDYagTQQm9ns;
        if (j2 != j) {
            return java.lang.Long.compare(j2 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        }
        return java.lang.Long.compare(this.oh71FJcDz6S2 ^ Long.MIN_VALUE, ss1Var.oh71FJcDz6S2 ^ Long.MIN_VALUE);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ss1)) {
            return false;
        }
        defpackage.ss1 ss1Var = (defpackage.ss1) obj;
        return this.WDYagTQQm9ns == ss1Var.WDYagTQQm9ns && this.oh71FJcDz6S2 == ss1Var.oh71FJcDz6S2;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.WDYagTQQm9ns ^ this.oh71FJcDz6S2);
    }

    public final java.lang.String toString() {
        byte[] bArr = new byte[36];
        defpackage.wc1.qjMheFZ0l9kA(this.WDYagTQQm9ns, bArr, 0, 0, 4);
        bArr[8] = 45;
        defpackage.wc1.qjMheFZ0l9kA(this.WDYagTQQm9ns, bArr, 9, 4, 6);
        bArr[13] = 45;
        defpackage.wc1.qjMheFZ0l9kA(this.WDYagTQQm9ns, bArr, 14, 6, 8);
        bArr[18] = 45;
        defpackage.wc1.qjMheFZ0l9kA(this.oh71FJcDz6S2, bArr, 19, 0, 2);
        bArr[23] = 45;
        defpackage.wc1.qjMheFZ0l9kA(this.oh71FJcDz6S2, bArr, 24, 2, 8);
        return new java.lang.String(bArr, defpackage.fe.ZpBGe2uQfcn8);
    }
}

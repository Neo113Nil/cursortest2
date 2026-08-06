package defpackage;

/* loaded from: classes.dex */
public final class fz {
    public int IHQe1A4L2xu;
    public java.lang.Object oh6vYeIP;

    public fz(defpackage.yi1 yi1Var, int i) {
        this.oh6vYeIP = yi1Var;
        this.IHQe1A4L2xu = i;
    }

    public static void r1MBDhnF(java.lang.String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = defpackage.x70.kNAkVymC(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        android.util.Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            android.database.sqlite.SQLiteDatabase.deleteDatabase(new java.io.File(str));
        } catch (java.lang.Exception e) {
            android.util.Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    public void F7NU4MC0GW(defpackage.mz mzVar, int i, int i2) {
        ((defpackage.o21) this.oh6vYeIP).F7NU4MC0GW(new defpackage.md1(mzVar), i, i2);
    }

    public void IHQe1A4L2xu(long j) {
        if (oh6vYeIP(j)) {
            return;
        }
        int i = this.IHQe1A4L2xu;
        long[] jArr = (long[]) this.oh6vYeIP;
        if (i >= jArr.length) {
            jArr = java.util.Arrays.copyOf(jArr, java.lang.Math.max(i + 1, jArr.length * 2));
            this.oh6vYeIP = jArr;
        }
        jArr[i] = j;
        if (i >= this.IHQe1A4L2xu) {
            this.IHQe1A4L2xu = i + 1;
        }
    }

    public void adDC3e2L(long j) {
        int i = this.IHQe1A4L2xu;
        int i2 = 0;
        while (i2 < i) {
            if (j == ((long[]) this.oh6vYeIP)[i2]) {
                int i3 = this.IHQe1A4L2xu - 1;
                while (i2 < i3) {
                    long[] jArr = (long[]) this.oh6vYeIP;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.IHQe1A4L2xu--;
                return;
            }
            i2++;
        }
    }

    public boolean oh6vYeIP(long j) {
        int i = this.IHQe1A4L2xu;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.oh6vYeIP)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public fz(defpackage.o21 o21Var, int i) {
        this.oh6vYeIP = o21Var;
        this.IHQe1A4L2xu = i;
    }
}

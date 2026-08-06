package defpackage;

/* loaded from: classes.dex */
public final class rd1 extends defpackage.sd1 {
    public android.database.Cursor DFo87pBq1E5;
    public int[] EXtogiMhuM;
    public byte[][] JlrlGoKF;
    public double[] SH1y5HwkJhh;
    public java.lang.String[] ez2rX8ReCYw;
    public long[] riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd1(defpackage.mz mzVar, java.lang.String str) {
        super(mzVar, str);
        mzVar.getClass();
        str.getClass();
        this.EXtogiMhuM = new int[0];
        this.riuEU0zW4 = new long[0];
        this.SH1y5HwkJhh = new double[0];
        this.ez2rX8ReCYw = new java.lang.String[0];
        this.JlrlGoKF = new byte[0][];
    }

    public static void riuEU0zW4(android.database.Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            defpackage.a70.SiPhmbmu("column index out of range", 25);
            throw null;
        }
    }

    public final void AARZUJiTa() {
        if (this.DFo87pBq1E5 == null) {
            defpackage.sa1 sa1Var = new defpackage.sa1(3, this);
            defpackage.mz mzVar = this.adDC3e2L;
            mzVar.getClass();
            final defpackage.w2 w2Var = new defpackage.w2(1, sa1Var);
            android.database.Cursor rawQueryWithFactory = mzVar.adDC3e2L.rawQueryWithFactory(new android.database.sqlite.SQLiteDatabase.CursorFactory() { // from class: lz
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final android.database.Cursor newCursor(android.database.sqlite.SQLiteDatabase sQLiteDatabase, android.database.sqlite.SQLiteCursorDriver sQLiteCursorDriver, java.lang.String str, android.database.sqlite.SQLiteQuery sQLiteQuery) {
                    return (android.database.Cursor) defpackage.w2.this.riuEU0zW4(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                }
            }, ((defpackage.rd1) sa1Var.xiZrDbcSW0).xiZrDbcSW0, defpackage.mz.xiZrDbcSW0, null);
            rawQueryWithFactory.getClass();
            this.DFo87pBq1E5 = rawQueryWithFactory;
        }
    }

    public final void F7NU4MC0GW(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.EXtogiMhuM;
        if (iArr.length < i3) {
            this.EXtogiMhuM = java.util.Arrays.copyOf(iArr, i3);
        }
        if (i == 1) {
            long[] jArr = this.riuEU0zW4;
            if (jArr.length < i3) {
                this.riuEU0zW4 = java.util.Arrays.copyOf(jArr, i3);
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.SH1y5HwkJhh;
            if (dArr.length < i3) {
                this.SH1y5HwkJhh = java.util.Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        if (i == 3) {
            java.lang.String[] strArr = this.ez2rX8ReCYw;
            if (strArr.length < i3) {
                this.ez2rX8ReCYw = (java.lang.String[]) java.util.Arrays.copyOf(strArr, i3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.JlrlGoKF;
        if (bArr.length < i3) {
            this.JlrlGoKF = (byte[][]) java.util.Arrays.copyOf(bArr, i3);
        }
    }

    @Override // defpackage.k31
    public final void IHQe1A4L2xu(int i, long j) {
        oh6vYeIP();
        F7NU4MC0GW(1, i);
        this.EXtogiMhuM[i] = 1;
        this.riuEU0zW4[i] = j;
    }

    @Override // defpackage.k31
    public final boolean NHJTzaLwkd() {
        oh6vYeIP();
        AARZUJiTa();
        android.database.Cursor cursor = this.DFo87pBq1E5;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        defpackage.db.AARZUJiTa("Required value was null.");
        return false;
    }

    @Override // defpackage.k31
    public final void adDC3e2L(java.lang.String str, int i) {
        str.getClass();
        oh6vYeIP();
        F7NU4MC0GW(3, i);
        this.EXtogiMhuM[i] = 3;
        this.ez2rX8ReCYw[i] = str;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.AARZUJiTa) {
            r1MBDhnF();
            reset();
        }
        this.AARZUJiTa = true;
    }

    @Override // defpackage.k31
    public final int getColumnCount() {
        oh6vYeIP();
        AARZUJiTa();
        android.database.Cursor cursor = this.DFo87pBq1E5;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // defpackage.k31
    public final java.lang.String getColumnName(int i) {
        oh6vYeIP();
        AARZUJiTa();
        android.database.Cursor cursor = this.DFo87pBq1E5;
        if (cursor == null) {
            defpackage.db.AARZUJiTa("Required value was null.");
            return null;
        }
        riuEU0zW4(cursor, i);
        java.lang.String columnName = cursor.getColumnName(i);
        columnName.getClass();
        return columnName;
    }

    @Override // defpackage.k31
    public final long getLong(int i) {
        oh6vYeIP();
        android.database.Cursor cursor = this.DFo87pBq1E5;
        if (cursor != null) {
            riuEU0zW4(cursor, i);
            return cursor.getLong(i);
        }
        defpackage.a70.SiPhmbmu("no row", 21);
        throw null;
    }

    @Override // defpackage.k31
    public final boolean isNull(int i) {
        oh6vYeIP();
        android.database.Cursor cursor = this.DFo87pBq1E5;
        if (cursor != null) {
            riuEU0zW4(cursor, i);
            return cursor.isNull(i);
        }
        defpackage.a70.SiPhmbmu("no row", 21);
        throw null;
    }

    @Override // defpackage.sd1, defpackage.k31
    public final void r1MBDhnF() {
        oh6vYeIP();
        this.EXtogiMhuM = new int[0];
        this.riuEU0zW4 = new long[0];
        this.SH1y5HwkJhh = new double[0];
        this.ez2rX8ReCYw = new java.lang.String[0];
        this.JlrlGoKF = new byte[0][];
    }

    @Override // defpackage.sd1, defpackage.k31
    public final void reset() {
        oh6vYeIP();
        android.database.Cursor cursor = this.DFo87pBq1E5;
        if (cursor != null) {
            cursor.close();
        }
        this.DFo87pBq1E5 = null;
    }

    @Override // defpackage.k31
    public final java.lang.String xiZrDbcSW0(int i) {
        oh6vYeIP();
        android.database.Cursor cursor = this.DFo87pBq1E5;
        if (cursor == null) {
            defpackage.a70.SiPhmbmu("no row", 21);
            throw null;
        }
        riuEU0zW4(cursor, i);
        java.lang.String string = cursor.getString(i);
        string.getClass();
        return string;
    }
}

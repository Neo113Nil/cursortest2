package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class di1 extends defpackage.ei1 {
    public double[] GE9mJIPrb8gP;
    public java.lang.String[] Ns0WNyEWdPsk;
    public int[] P05cfTpS5W5L;
    public long[] e6mdH7fiFuta;
    public byte[][] fNwYGHIYeJcR;
    public android.database.Cursor h3m55N1URyyK;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di1(defpackage.e10 e10Var, java.lang.String str) {
        super(e10Var, str);
        e10Var.getClass();
        str.getClass();
        this.P05cfTpS5W5L = new int[0];
        this.e6mdH7fiFuta = new long[0];
        this.GE9mJIPrb8gP = new double[0];
        this.Ns0WNyEWdPsk = new java.lang.String[0];
        this.fNwYGHIYeJcR = new byte[0][];
    }

    public static void e6mdH7fiFuta(android.database.Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            defpackage.b80.IBvW5fLsPuHy("column index out of range", 25);
            throw null;
        }
    }

    public final void JhCgjQRTAOCT(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.P05cfTpS5W5L;
        if (iArr.length < i3) {
            this.P05cfTpS5W5L = java.util.Arrays.copyOf(iArr, i3);
        }
        if (i == 1) {
            long[] jArr = this.e6mdH7fiFuta;
            if (jArr.length < i3) {
                this.e6mdH7fiFuta = java.util.Arrays.copyOf(jArr, i3);
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.GE9mJIPrb8gP;
            if (dArr.length < i3) {
                this.GE9mJIPrb8gP = java.util.Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        if (i == 3) {
            java.lang.String[] strArr = this.Ns0WNyEWdPsk;
            if (strArr.length < i3) {
                this.Ns0WNyEWdPsk = (java.lang.String[]) java.util.Arrays.copyOf(strArr, i3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.fNwYGHIYeJcR;
        if (bArr.length < i3) {
            this.fNwYGHIYeJcR = (byte[][]) java.util.Arrays.copyOf(bArr, i3);
        }
    }

    public final void QiMR8OkAhezm() {
        if (this.h3m55N1URyyK == null) {
            defpackage.ci1 ci1Var = new defpackage.ci1(0, this);
            defpackage.e10 e10Var = this.WDYagTQQm9ns;
            e10Var.getClass();
            final defpackage.p2 p2Var = new defpackage.p2(1, ci1Var);
            android.database.Cursor rawQueryWithFactory = e10Var.WDYagTQQm9ns.rawQueryWithFactory(new android.database.sqlite.SQLiteDatabase.CursorFactory() { // from class: d10
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final android.database.Cursor newCursor(android.database.sqlite.SQLiteDatabase sQLiteDatabase, android.database.sqlite.SQLiteCursorDriver sQLiteCursorDriver, java.lang.String str, android.database.sqlite.SQLiteQuery sQLiteQuery) {
                    return (android.database.Cursor) defpackage.p2.this.h3m55N1URyyK(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                }
            }, ((defpackage.di1) ci1Var.oh71FJcDz6S2).oh71FJcDz6S2, defpackage.e10.oh71FJcDz6S2, null);
            rawQueryWithFactory.getClass();
            this.h3m55N1URyyK = rawQueryWithFactory;
        }
    }

    @Override // defpackage.a71
    public final void WDYagTQQm9ns(java.lang.String str, int i) {
        str.getClass();
        giKS3J6vZuNy();
        JhCgjQRTAOCT(3, i);
        this.P05cfTpS5W5L[i] = 3;
        this.Ns0WNyEWdPsk[i] = str;
    }

    @Override // defpackage.a71
    public final void ZpBGe2uQfcn8(int i, long j) {
        giKS3J6vZuNy();
        JhCgjQRTAOCT(1, i);
        this.P05cfTpS5W5L[i] = 1;
        this.e6mdH7fiFuta[i] = j;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.QiMR8OkAhezm) {
            fWTAfUmVKrZq();
            qjMheFZ0l9kA();
        }
        this.QiMR8OkAhezm = true;
    }

    @Override // defpackage.ei1, defpackage.a71
    public final void fWTAfUmVKrZq() {
        giKS3J6vZuNy();
        this.P05cfTpS5W5L = new int[0];
        this.e6mdH7fiFuta = new long[0];
        this.GE9mJIPrb8gP = new double[0];
        this.Ns0WNyEWdPsk = new java.lang.String[0];
        this.fNwYGHIYeJcR = new byte[0][];
    }

    @Override // defpackage.a71
    public final int getColumnCount() {
        giKS3J6vZuNy();
        QiMR8OkAhezm();
        android.database.Cursor cursor = this.h3m55N1URyyK;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // defpackage.a71
    public final java.lang.String getColumnName(int i) {
        giKS3J6vZuNy();
        QiMR8OkAhezm();
        android.database.Cursor cursor = this.h3m55N1URyyK;
        if (cursor == null) {
            defpackage.h7.P05cfTpS5W5L("Required value was null.");
            return null;
        }
        e6mdH7fiFuta(cursor, i);
        java.lang.String columnName = cursor.getColumnName(i);
        columnName.getClass();
        return columnName;
    }

    @Override // defpackage.a71
    public final long getLong(int i) {
        giKS3J6vZuNy();
        android.database.Cursor cursor = this.h3m55N1URyyK;
        if (cursor != null) {
            e6mdH7fiFuta(cursor, i);
            return cursor.getLong(i);
        }
        defpackage.b80.IBvW5fLsPuHy("no row", 21);
        throw null;
    }

    @Override // defpackage.a71
    public final boolean isNull(int i) {
        giKS3J6vZuNy();
        android.database.Cursor cursor = this.h3m55N1URyyK;
        if (cursor != null) {
            e6mdH7fiFuta(cursor, i);
            return cursor.isNull(i);
        }
        defpackage.b80.IBvW5fLsPuHy("no row", 21);
        throw null;
    }

    @Override // defpackage.a71
    public final boolean oCu53ZX2v4Ju() {
        giKS3J6vZuNy();
        QiMR8OkAhezm();
        android.database.Cursor cursor = this.h3m55N1URyyK;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        defpackage.h7.P05cfTpS5W5L("Required value was null.");
        return false;
    }

    @Override // defpackage.a71
    public final java.lang.String oh71FJcDz6S2(int i) {
        giKS3J6vZuNy();
        android.database.Cursor cursor = this.h3m55N1URyyK;
        if (cursor == null) {
            defpackage.b80.IBvW5fLsPuHy("no row", 21);
            throw null;
        }
        e6mdH7fiFuta(cursor, i);
        java.lang.String string = cursor.getString(i);
        string.getClass();
        return string;
    }

    @Override // defpackage.ei1, defpackage.a71
    public final void qjMheFZ0l9kA() {
        giKS3J6vZuNy();
        android.database.Cursor cursor = this.h3m55N1URyyK;
        if (cursor != null) {
            cursor.close();
        }
        this.h3m55N1URyyK = null;
    }
}

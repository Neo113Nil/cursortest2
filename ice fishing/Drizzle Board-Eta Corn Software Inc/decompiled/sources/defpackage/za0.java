package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import java.util.Arrays;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class za0 extends ab0 {
    public long[] P7K7Inc8;
    public String[] Qr9iLBAD;
    public int[] VgvYg0wo;
    public double[] b2ZJblxo;
    public Cursor eVhOlqcC;
    public byte[][] jb9XjC4I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za0(fk fkVar, String str) {
        super(fkVar, str);
        fkVar.getClass();
        str.getClass();
        this.VgvYg0wo = new int[0];
        this.P7K7Inc8 = new long[0];
        this.b2ZJblxo = new double[0];
        this.Qr9iLBAD = new String[0];
        this.jb9XjC4I = new byte[0][];
    }

    public static void eVhOlqcC(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            w30.bvfAo0eO("column index out of range", 25);
            throw null;
        }
    }

    @Override // defpackage.ab0, defpackage.h40
    public final void I5GHvsYW() {
        VgvYg0wo();
        Cursor cursor = this.eVhOlqcC;
        if (cursor != null) {
            cursor.close();
        }
        this.eVhOlqcC = null;
    }

    @Override // defpackage.h40
    public final void MdtA4re8(String str, int i) {
        str.getClass();
        VgvYg0wo();
        P7K7Inc8(3, i);
        this.VgvYg0wo[i] = 3;
        this.Qr9iLBAD[i] = str;
    }

    @Override // defpackage.ab0, defpackage.h40
    public final void NCTxEWno() {
        VgvYg0wo();
        this.VgvYg0wo = new int[0];
        this.P7K7Inc8 = new long[0];
        this.b2ZJblxo = new double[0];
        this.Qr9iLBAD = new String[0];
        this.jb9XjC4I = new byte[0][];
    }

    public final void P7K7Inc8(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.VgvYg0wo;
        if (iArr.length < i3) {
            this.VgvYg0wo = Arrays.copyOf(iArr, i3);
        }
        if (i == 1) {
            long[] jArr = this.P7K7Inc8;
            if (jArr.length < i3) {
                this.P7K7Inc8 = Arrays.copyOf(jArr, i3);
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.b2ZJblxo;
            if (dArr.length < i3) {
                this.b2ZJblxo = Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.Qr9iLBAD;
            if (strArr.length < i3) {
                this.Qr9iLBAD = (String[]) Arrays.copyOf(strArr, i3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.jb9XjC4I;
        if (bArr.length < i3) {
            this.jb9XjC4I = (byte[][]) Arrays.copyOf(bArr, i3);
        }
    }

    public final void Qr9iLBAD() {
        if (this.eVhOlqcC == null) {
            ya0 ya0Var = new ya0(0, this);
            fk fkVar = this.NCTxEWno;
            fkVar.getClass();
            final ck ckVar = new ck(ya0Var);
            Cursor rawQueryWithFactory = fkVar.NCTxEWno.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: dk
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                    ya0 ya0Var2 = ck.this.NCTxEWno;
                    SQLiteCursorDriver sQLiteCursorDriver2 = sQLiteCursorDriver;
                    sQLiteQuery.getClass();
                    lk lkVar = new lk(sQLiteQuery);
                    za0 za0Var = (za0) ya0Var2.MdtA4re8;
                    int length = za0Var.VgvYg0wo.length;
                    for (int i = 1; i < length; i++) {
                        int i2 = za0Var.VgvYg0wo[i];
                        if (i2 == 1) {
                            lkVar.qoPGr6Ce(i, za0Var.P7K7Inc8[i]);
                        } else if (i2 == 2) {
                            lkVar.jb9XjC4I(i, za0Var.b2ZJblxo[i]);
                        } else if (i2 == 3) {
                            String str2 = za0Var.Qr9iLBAD[i];
                            str2.getClass();
                            lkVar.OxcuoDLp(str2, i);
                        } else if (i2 == 4) {
                            byte[] bArr = za0Var.jb9XjC4I[i];
                            bArr.getClass();
                            lkVar.sjUBp5pO(i, bArr);
                        } else if (i2 == 5) {
                            lkVar.b2ZJblxo(i);
                        }
                    }
                    return new SQLiteCursor(sQLiteCursorDriver2, str, sQLiteQuery);
                }
            }, ((za0) ya0Var.MdtA4re8).MdtA4re8, fk.MdtA4re8, null);
            rawQueryWithFactory.getClass();
            this.eVhOlqcC = rawQueryWithFactory;
        }
    }

    @Override // defpackage.h40
    public final boolean amk52bBQ() {
        VgvYg0wo();
        Qr9iLBAD();
        Cursor cursor = this.eVhOlqcC;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        m1.Ey6iv0m0("Required value was null.");
        return false;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.wxUZMvaN) {
            NCTxEWno();
            I5GHvsYW();
        }
        this.wxUZMvaN = true;
    }

    @Override // defpackage.h40
    public final int getColumnCount() {
        VgvYg0wo();
        Qr9iLBAD();
        Cursor cursor = this.eVhOlqcC;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // defpackage.h40
    public final String getColumnName(int i) {
        VgvYg0wo();
        Qr9iLBAD();
        Cursor cursor = this.eVhOlqcC;
        if (cursor == null) {
            m1.Ey6iv0m0("Required value was null.");
            return null;
        }
        eVhOlqcC(cursor, i);
        String columnName = cursor.getColumnName(i);
        columnName.getClass();
        return columnName;
    }

    @Override // defpackage.h40
    public final long getLong(int i) {
        VgvYg0wo();
        Cursor cursor = this.eVhOlqcC;
        if (cursor != null) {
            eVhOlqcC(cursor, i);
            return cursor.getLong(i);
        }
        w30.bvfAo0eO("no row", 21);
        throw null;
    }

    @Override // defpackage.h40
    public final boolean isNull(int i) {
        VgvYg0wo();
        Cursor cursor = this.eVhOlqcC;
        if (cursor != null) {
            eVhOlqcC(cursor, i);
            return cursor.isNull(i);
        }
        w30.bvfAo0eO("no row", 21);
        throw null;
    }

    @Override // defpackage.h40
    public final void qoPGr6Ce(int i, long j) {
        VgvYg0wo();
        P7K7Inc8(1, i);
        this.VgvYg0wo[i] = 1;
        this.P7K7Inc8[i] = j;
    }

    @Override // defpackage.h40
    public final String wxUZMvaN(int i) {
        VgvYg0wo();
        Cursor cursor = this.eVhOlqcC;
        if (cursor == null) {
            w30.bvfAo0eO("no row", 21);
            throw null;
        }
        eVhOlqcC(cursor, i);
        String string = cursor.getString(i);
        string.getClass();
        return string;
    }
}

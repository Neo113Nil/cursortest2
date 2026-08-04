package com.gamericefishpro.space.n9;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends g0 {
    public static final String[] w = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};
    public final l i;
    public boolean v;

    public o0(r1 r1Var) {
        super(r1Var);
        this.i = new l(this, ((r1) this.d).d);
    }

    @Override // com.gamericefishpro.space.n9.g0
    public final boolean u() {
        return false;
    }

    public final void v() {
        int iDelete;
        r1 r1Var = (r1) this.d;
        r();
        try {
            SQLiteDatabase sQLiteDatabaseX = x();
            if (sQLiteDatabaseX == null || (iDelete = sQLiteDatabaseX.delete("messages", null, null)) <= 0) {
                return;
            }
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            v0Var.G.b(Integer.valueOf(iDelete), "Reset local analytics data. records");
        } catch (SQLiteException e) {
            v0 v0Var2 = r1Var.y;
            r1.l(v0Var2);
            v0Var2.y.b(e, "Error resetting local analytics data. error");
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0070 A[PHI: r5
      0x0070: PHI (r5v4 int) = (r5v1 int), (r5v2 int), (r5v1 int) binds: [B:32:0x0081, B:28:0x006e, B:25:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean w() {
        r1 r1Var = (r1) this.d;
        r();
        if (!this.v && r1Var.d.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i = 5;
            for (int i2 = 0; i2 < 5; i2++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabaseX = x();
                        if (sQLiteDatabaseX != null) {
                            sQLiteDatabaseX.beginTransaction();
                            sQLiteDatabaseX.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                            sQLiteDatabaseX.setTransactionSuccessful();
                            sQLiteDatabaseX.endTransaction();
                            sQLiteDatabaseX.close();
                            return true;
                        }
                        this.v = true;
                    } catch (SQLiteException e) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        }
                        v0 v0Var = r1Var.y;
                        r1.l(v0Var);
                        v0Var.y.b(e, "Error deleting app launch break from local database");
                        this.v = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i);
                    i += 20;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteFullException e2) {
                    v0 v0Var2 = r1Var.y;
                    r1.l(v0Var2);
                    v0Var2.y.b(e2, "Error deleting app launch break from local database");
                    this.v = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            v0 v0Var3 = r1Var.y;
            r1.l(v0Var3);
            v0Var3.B.a("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    public final SQLiteDatabase x() {
        if (this.v) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.i.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.v = true;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:73:0x0120 A[Catch: all -> 0x0154, TRY_ENTER, TryCatch #10 {all -> 0x0154, blocks: (B:30:0x0088, B:32:0x008e, B:43:0x00ae, B:45:0x00cf, B:47:0x00d8, B:49:0x00de, B:59:0x00f8, B:73:0x0120, B:75:0x0126, B:76:0x0129, B:93:0x015b, B:83:0x0144), top: B:109:0x0088 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0139  */
    /* JADX WARN: Code duplicated, block: B:86:0x014b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0150 A[PHI: r8 r10 r17
      0x0150: PHI (r8v5 int) = (r8v3 int), (r8v3 int), (r8v6 int) binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x0150: PHI (r10v7 android.database.sqlite.SQLiteDatabase) = 
      (r10v5 android.database.sqlite.SQLiteDatabase)
      (r10v6 android.database.sqlite.SQLiteDatabase)
      (r10v8 android.database.sqlite.SQLiteDatabase)
     binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x0150: PHI (r17v7 boolean) = (r17v4 boolean), (r17v5 boolean), (r17v8 boolean) binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x016a  */
    public final boolean y(int i, byte[] bArr) {
        SQLiteDatabase sQLiteDatabaseX;
        boolean z;
        boolean z2;
        Cursor cursorRawQuery;
        r1 r1Var = (r1) this.d;
        r();
        boolean z3 = false;
        z3 = false;
        if (!this.v) {
            g gVar = r1Var.v;
            v0 v0Var = r1Var.y;
            d0 d0Var = e0.b1;
            Cursor cursor = null;
            cursor = null;
            t4 t4VarV = gVar.B(null, d0Var) ? r1Var.q().v(null) : null;
            ContentValues contentValues = new ContentValues();
            contentValues.put(com.gamericefishpro.space.vd.m.EVENT_TYPE_KEY, Integer.valueOf(i));
            contentValues.put("entry", bArr);
            if (r1Var.v.B(null, d0Var) && t4VarV != null) {
                contentValues.put("app_version", t4VarV.i);
                contentValues.put("app_version_int", Long.valueOf(t4VarV.C));
            }
            int i2 = 5;
            int i3 = 0;
            for (int i4 = 5; i3 < i4; i4 = 5) {
                try {
                    sQLiteDatabaseX = x();
                    if (sQLiteDatabaseX == null) {
                        this.v = true;
                    } else {
                        try {
                            sQLiteDatabaseX.beginTransaction();
                            cursorRawQuery = sQLiteDatabaseX.rawQuery("select count(1) from messages", null);
                            long j = 0;
                            if (cursorRawQuery != null) {
                                try {
                                    try {
                                        if (cursorRawQuery.moveToFirst()) {
                                            j = cursorRawQuery.getLong(z3 ? 1 : 0);
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor = cursorRawQuery;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabaseX != null) {
                                            sQLiteDatabaseX.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteDatabaseLockedException unused) {
                                    z = z3 ? 1 : 0;
                                    SystemClock.sleep(i2);
                                    i2 += 20;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseX != null) {
                                        sQLiteDatabaseX.close();
                                    }
                                    i3++;
                                    z3 = z;
                                } catch (SQLiteFullException e) {
                                    e = e;
                                    z = z3 ? 1 : 0;
                                    r1.l(v0Var);
                                    v0Var.y.b(e, "Error writing entry; local database full");
                                    this.v = true;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseX != null) {
                                        sQLiteDatabaseX.close();
                                    }
                                    i3++;
                                    z3 = z;
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    z = z3 ? 1 : 0;
                                    z2 = true;
                                    if (sQLiteDatabaseX != null) {
                                        sQLiteDatabaseX.endTransaction();
                                    }
                                    r1.l(v0Var);
                                    v0Var.y.b(e, "Error writing entry to local database");
                                    this.v = z2;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseX != null) {
                                        sQLiteDatabaseX.close();
                                    }
                                    i3++;
                                    z3 = z;
                                }
                            }
                            if (j >= 100000) {
                                r1.l(v0Var);
                                v0Var.y.a("Data loss, local db full");
                                long j2 = 100001 - j;
                                long jDelete = sQLiteDatabaseX.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j2)});
                                if (jDelete != j2) {
                                    r1.l(v0Var);
                                    t0 t0Var = v0Var.y;
                                    z = z3 ? 1 : 0;
                                    try {
                                        try {
                                            z2 = true;
                                            try {
                                                t0Var.d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(jDelete), Long.valueOf(j2 - jDelete));
                                            } catch (SQLiteFullException e3) {
                                                e = e3;
                                                r1.l(v0Var);
                                                v0Var.y.b(e, "Error writing entry; local database full");
                                                this.v = true;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseX != null) {
                                                    sQLiteDatabaseX.close();
                                                }
                                                i3++;
                                                z3 = z;
                                            } catch (SQLiteException e4) {
                                                e = e4;
                                                if (sQLiteDatabaseX != null) {
                                                    sQLiteDatabaseX.endTransaction();
                                                }
                                                r1.l(v0Var);
                                                v0Var.y.b(e, "Error writing entry to local database");
                                                this.v = z2;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseX != null) {
                                                    sQLiteDatabaseX.close();
                                                }
                                                i3++;
                                                z3 = z;
                                            }
                                        } catch (SQLiteDatabaseLockedException unused2) {
                                            SystemClock.sleep(i2);
                                            i2 += 20;
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            if (sQLiteDatabaseX != null) {
                                                sQLiteDatabaseX.close();
                                            }
                                            i3++;
                                            z3 = z;
                                        }
                                    } catch (SQLiteFullException e5) {
                                        e = e5;
                                        r1.l(v0Var);
                                        v0Var.y.b(e, "Error writing entry; local database full");
                                        this.v = true;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseX != null) {
                                            sQLiteDatabaseX.close();
                                        }
                                        i3++;
                                        z3 = z;
                                    } catch (SQLiteException e6) {
                                        e = e6;
                                        z2 = true;
                                        if (sQLiteDatabaseX != null && sQLiteDatabaseX.inTransaction()) {
                                            sQLiteDatabaseX.endTransaction();
                                        }
                                        r1.l(v0Var);
                                        v0Var.y.b(e, "Error writing entry to local database");
                                        this.v = z2;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseX != null) {
                                            sQLiteDatabaseX.close();
                                        }
                                        i3++;
                                        z3 = z;
                                    }
                                } else {
                                    z = z3 ? 1 : 0;
                                    z2 = true;
                                }
                            } else {
                                z = z3 ? 1 : 0;
                                z2 = true;
                            }
                            sQLiteDatabaseX.insertOrThrow("messages", null, contentValues);
                            sQLiteDatabaseX.setTransactionSuccessful();
                            sQLiteDatabaseX.endTransaction();
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            sQLiteDatabaseX.close();
                            return z2;
                        } catch (SQLiteDatabaseLockedException unused3) {
                            z = z3 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteFullException e7) {
                            e = e7;
                            z = z3 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteException e8) {
                            e = e8;
                            z = z3 ? 1 : 0;
                            z2 = true;
                            cursorRawQuery = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused4) {
                    z = z3 ? 1 : 0;
                    sQLiteDatabaseX = null;
                    cursorRawQuery = null;
                } catch (SQLiteFullException e9) {
                    e = e9;
                    z = z3 ? 1 : 0;
                    sQLiteDatabaseX = null;
                    cursorRawQuery = null;
                } catch (SQLiteException e10) {
                    e = e10;
                    z = z3 ? 1 : 0;
                    z2 = true;
                    sQLiteDatabaseX = null;
                    cursorRawQuery = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteDatabaseX = null;
                }
            }
            boolean z4 = z3 ? 1 : 0;
            r1.l(v0Var);
            v0Var.G.a("Failed to write entry to local database");
            return z4;
        }
        return z3;
    }
}

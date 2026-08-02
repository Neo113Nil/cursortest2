package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class zzgl extends zzg {
    public static final String[] zza = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};
    public final zzav zzb;
    public boolean zzc;

    public zzgl(zzic zzicVar) {
        super(zzicVar);
        this.zzb = new zzav(this, ((zzic) this.$$delegate_0).zzd);
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zze() {
        return false;
    }

    public final void zzh() {
        int delete;
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzg();
        try {
            SQLiteDatabase zzp = zzp();
            if (zzp == null || (delete = zzp.delete("messages", null, null)) <= 0) {
                return;
            }
            zzgu zzguVar = zzicVar.zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzl.zzb(Integer.valueOf(delete), "Reset local analytics data. records");
        } catch (SQLiteException e) {
            zzgu zzguVar2 = zzicVar.zzi;
            zzic.zzP(zzguVar2);
            zzguVar2.zzd.zzb(e, "Error resetting local analytics data. error");
        }
    }

    public final void zzo() {
        int i;
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzg();
        if (!this.zzc && zzicVar.zzd.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i2 = 5;
            while (i < 5) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase zzp = zzp();
                        if (zzp == null) {
                            this.zzc = true;
                            return;
                        }
                        zzp.beginTransaction();
                        zzp.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        zzp.setTransactionSuccessful();
                        zzp.endTransaction();
                        zzp.close();
                        return;
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
                        zzgu zzguVar = zzicVar.zzi;
                        zzic.zzP(zzguVar);
                        zzguVar.zzd.zzb(e, "Error deleting app launch break from local database");
                        this.zzc = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i2);
                    i2 += 20;
                    i = 0 == 0 ? i + 1 : 0;
                    sQLiteDatabase.close();
                } catch (SQLiteFullException e2) {
                    zzgu zzguVar2 = zzicVar.zzi;
                    zzic.zzP(zzguVar2);
                    zzguVar2.zzd.zzb(e2, "Error deleting app launch break from local database");
                    this.zzc = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                }
            }
            zzgu zzguVar3 = zzicVar.zzi;
            zzic.zzP(zzguVar3);
            zzguVar3.zzg.zza("Error deleting app launch break from local database in reasonable time");
        }
    }

    public final SQLiteDatabase zzp() {
        if (this.zzc) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zzb.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.zzc = true;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0123 A[Catch: all -> 0x0157, TRY_ENTER, TryCatch #11 {all -> 0x0157, blocks: (B:95:0x008a, B:97:0x0090, B:65:0x00b0, B:67:0x00d2, B:70:0x00db, B:73:0x00e1, B:74:0x00fb, B:42:0x0123, B:44:0x0129, B:45:0x012c, B:33:0x015e, B:21:0x0147), top: B:94:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzs(int i, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        boolean z;
        boolean z2;
        Cursor cursor;
        zzic zzicVar = (zzic) this.$$delegate_0;
        zzg();
        boolean z3 = false;
        z3 = false;
        if (!this.zzc) {
            zzal zzalVar = zzicVar.zzg;
            zzgu zzguVar = zzicVar.zzi;
            zzfx zzfxVar = zzfy.zzaW;
            Cursor cursor2 = null;
            zzr zzh = zzalVar.zzp(null, zzfxVar) ? zzicVar.zzv().zzh(null) : null;
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(i));
            contentValues.put("entry", bArr);
            if (zzicVar.zzg.zzp(null, zzfxVar) && zzh != null) {
                contentValues.put("app_version", zzh.zzc);
                contentValues.put("app_version_int", Long.valueOf(zzh.zzj));
            }
            int i2 = 5;
            int i3 = 0;
            for (int i4 = 5; i3 < i4; i4 = 5) {
                try {
                    sQLiteDatabase = zzp();
                    if (sQLiteDatabase == null) {
                        this.zzc = true;
                    } else {
                        try {
                            sQLiteDatabase.beginTransaction();
                            cursor = sQLiteDatabase.rawQuery("select count(1) from messages", null);
                            long j = 0;
                            if (cursor != null) {
                                try {
                                    try {
                                        if (cursor.moveToFirst()) {
                                            j = cursor.getLong(z3 ? 1 : 0);
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor2 = cursor;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteDatabaseLockedException unused) {
                                    z = z3 ? 1 : 0;
                                    SystemClock.sleep(i2);
                                    i2 += 20;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i3++;
                                    z3 = z;
                                } catch (SQLiteFullException e) {
                                    e = e;
                                    z = z3 ? 1 : 0;
                                    zzic.zzP(zzguVar);
                                    zzguVar.zzd.zzb(e, "Error writing entry; local database full");
                                    this.zzc = true;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i3++;
                                    z3 = z;
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    z = z3 ? 1 : 0;
                                    z2 = true;
                                    if (sQLiteDatabase != null) {
                                    }
                                    zzic.zzP(zzguVar);
                                    zzguVar.zzd.zzb(e, "Error writing entry to local database");
                                    this.zzc = z2;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i3++;
                                    z3 = z;
                                }
                            }
                            if (j >= 100000) {
                                zzic.zzP(zzguVar);
                                zzguVar.zzd.zza("Data loss, local db full");
                                long j2 = 100001 - j;
                                long delete = sQLiteDatabase.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j2)});
                                if (delete != j2) {
                                    zzic.zzP(zzguVar);
                                    zzgs zzgsVar = zzguVar.zzd;
                                    z = z3 ? 1 : 0;
                                    try {
                                        try {
                                            z2 = true;
                                        } catch (SQLiteDatabaseLockedException unused2) {
                                            SystemClock.sleep(i2);
                                            i2 += 20;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabase == null) {
                                                i3++;
                                                z3 = z;
                                            }
                                            sQLiteDatabase.close();
                                            i3++;
                                            z3 = z;
                                        }
                                        try {
                                            zzgsVar.zzd("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(delete), Long.valueOf(j2 - delete));
                                            sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                                            sQLiteDatabase.setTransactionSuccessful();
                                            sQLiteDatabase.endTransaction();
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            sQLiteDatabase.close();
                                            return z2;
                                        } catch (SQLiteFullException e3) {
                                            e = e3;
                                            zzic.zzP(zzguVar);
                                            zzguVar.zzd.zzb(e, "Error writing entry; local database full");
                                            this.zzc = true;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabase == null) {
                                                i3++;
                                                z3 = z;
                                            }
                                            sQLiteDatabase.close();
                                            i3++;
                                            z3 = z;
                                        } catch (SQLiteException e4) {
                                            e = e4;
                                            if (sQLiteDatabase != null && sQLiteDatabase.inTransaction()) {
                                                sQLiteDatabase.endTransaction();
                                            }
                                            zzic.zzP(zzguVar);
                                            zzguVar.zzd.zzb(e, "Error writing entry to local database");
                                            this.zzc = z2;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabase == null) {
                                                i3++;
                                                z3 = z;
                                            }
                                            sQLiteDatabase.close();
                                            i3++;
                                            z3 = z;
                                        }
                                    } catch (SQLiteFullException e5) {
                                        e = e5;
                                        zzic.zzP(zzguVar);
                                        zzguVar.zzd.zzb(e, "Error writing entry; local database full");
                                        this.zzc = true;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i3++;
                                        z3 = z;
                                    } catch (SQLiteException e6) {
                                        e = e6;
                                        z2 = true;
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.endTransaction();
                                        }
                                        zzic.zzP(zzguVar);
                                        zzguVar.zzd.zzb(e, "Error writing entry to local database");
                                        this.zzc = z2;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i3++;
                                        z3 = z;
                                    }
                                }
                            }
                            z = z3 ? 1 : 0;
                            z2 = true;
                            sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                            sQLiteDatabase.setTransactionSuccessful();
                            sQLiteDatabase.endTransaction();
                            if (cursor != null) {
                            }
                            sQLiteDatabase.close();
                            return z2;
                        } catch (SQLiteDatabaseLockedException unused3) {
                            z = z3 ? 1 : 0;
                            cursor = null;
                        } catch (SQLiteFullException e7) {
                            e = e7;
                            z = z3 ? 1 : 0;
                            cursor = null;
                        } catch (SQLiteException e8) {
                            e = e8;
                            z = z3 ? 1 : 0;
                            z2 = true;
                            cursor = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused4) {
                    z = z3 ? 1 : 0;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (SQLiteFullException e9) {
                    e = e9;
                    z = z3 ? 1 : 0;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (SQLiteException e10) {
                    e = e10;
                    z = z3 ? 1 : 0;
                    z2 = true;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteDatabase = null;
                }
            }
            boolean z4 = z3 ? 1 : 0;
            zzic.zzP(zzguVar);
            zzguVar.zzl.zza("Failed to write entry to local database");
            return z4;
        }
        return z3;
    }
}

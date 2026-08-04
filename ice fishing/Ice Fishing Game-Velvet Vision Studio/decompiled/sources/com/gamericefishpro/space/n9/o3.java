package com.gamericefishpro.space.n9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o3 extends g0 {
    public final r0 A;
    public final ArrayList B;
    public final k3 C;
    public final n3 i;
    public h0 v;
    public volatile Boolean w;
    public final k3 y;
    public ScheduledExecutorService z;

    public o3(r1 r1Var) {
        super(r1Var);
        this.B = new ArrayList();
        this.A = new r0(r1Var.D);
        this.i = new n3(this);
        this.y = new k3(this, r1Var, 0);
        this.C = new k3(this, r1Var, 1);
    }

    public final boolean A() {
        r();
        s();
        if (!y()) {
            return true;
        }
        r4 r4Var = ((r1) this.d).B;
        r1.j(r4Var);
        return r4Var.X() >= ((Integer) e0.J0.a(null)).intValue();
    }

    public final boolean B() {
        r();
        s();
        if (!y()) {
            return true;
        }
        r4 r4Var = ((r1) this.d).B;
        r1.j(r4Var);
        return r4Var.X() >= 241200;
    }

    public final void C(ComponentName componentName) {
        r();
        if (this.v != null) {
            this.v = null;
            v0 v0Var = ((r1) this.d).y;
            r1.l(v0Var);
            v0Var.G.b(componentName, "Disconnected from device MeasurementService");
            r();
            x();
        }
    }

    public final void D() {
        ((r1) this.d).getClass();
    }

    public final void E() {
        r();
        r0 r0Var = this.A;
        ((com.gamericefishpro.space.z8.a) r0Var.i).getClass();
        r0Var.e = SystemClock.elapsedRealtime();
        ((r1) this.d).getClass();
        this.y.b(((Long) e0.Y.a(null)).longValue());
    }

    public final void F(Runnable runnable) {
        r();
        if (I()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.B;
        long size = arrayList.size();
        r1 r1Var = (r1) this.d;
        r1Var.getClass();
        if (size >= 1000) {
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            v0Var.y.a("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.C.b(60000L);
            x();
        }
    }

    public final void G() {
        r();
        r1 r1Var = (r1) this.d;
        v0 v0Var = r1Var.y;
        r1.l(v0Var);
        t0 t0Var = v0Var.G;
        ArrayList arrayList = this.B;
        t0Var.b(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            try {
                ((Runnable) obj).run();
            } catch (RuntimeException e) {
                v0 v0Var2 = r1Var.y;
                r1.l(v0Var2);
                v0Var2.y.b(e, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.C.c();
    }

    public final t4 H(boolean z) {
        long jAbs;
        Pair pair;
        r1 r1Var = (r1) this.d;
        r1Var.getClass();
        m0 m0VarQ = r1Var.q();
        String strJ = null;
        if (z) {
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            r1 r1Var2 = (r1) v0Var.d;
            f1 f1Var = r1Var2.w;
            r1.j(f1Var);
            if (f1Var.w != null) {
                f1 f1Var2 = r1Var2.w;
                r1.j(f1Var2);
                e1 e1Var = f1Var2.w;
                f1 f1Var3 = (f1) e1Var.e;
                f1Var3.r();
                f1Var3.r();
                long j = ((f1) e1Var.e).v().getLong((String) e1Var.b, 0L);
                if (j == 0) {
                    e1Var.b();
                    jAbs = 0;
                } else {
                    ((r1) f1Var3.d).D.getClass();
                    jAbs = Math.abs(j - System.currentTimeMillis());
                }
                long j2 = e1Var.a;
                if (jAbs < j2) {
                    pair = null;
                } else if (jAbs > j2 + j2) {
                    e1Var.b();
                    pair = null;
                } else {
                    String string = f1Var3.v().getString((String) e1Var.d, null);
                    long j3 = f1Var3.v().getLong((String) e1Var.c, 0L);
                    e1Var.b();
                    pair = (string == null || j3 <= 0) ? f1.S : new Pair(string, Long.valueOf(j3));
                }
                if (pair != null && pair != f1.S) {
                    String strValueOf = String.valueOf(pair.second);
                    String str = (String) pair.first;
                    strJ = com.gamericefishpro.space.m5.a.j(new StringBuilder(strValueOf.length() + 1 + String.valueOf(str).length()), strValueOf, ":", str);
                }
            }
        }
        return m0VarQ.v(strJ);
    }

    public final boolean I() {
        r();
        s();
        return this.v != null;
    }

    /* JADX WARN: Code duplicated, block: B:259:0x0444 A[Catch: all -> 0x0480, TRY_ENTER, TryCatch #59 {all -> 0x0480, blocks: (B:269:0x0470, B:259:0x0444, B:261:0x044a, B:262:0x044d, B:279:0x0491, B:208:0x037b, B:210:0x0385, B:215:0x0396), top: B:420:0x0470 }] */
    /* JADX WARN: Code duplicated, block: B:264:0x045c  */
    /* JADX WARN: Code duplicated, block: B:272:0x0477  */
    /* JADX WARN: Code duplicated, block: B:274:0x047c A[PHI: r5 r6 r24 r25 r27 r37 r38
      0x047c: PHI (r5v15 android.database.sqlite.SQLiteDatabase) = 
      (r5v12 android.database.sqlite.SQLiteDatabase)
      (r5v13 android.database.sqlite.SQLiteDatabase)
      (r5v16 android.database.sqlite.SQLiteDatabase)
     binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
      0x047c: PHI (r6v5 int) = (r6v3 int), (r6v3 int), (r6v6 int) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
      0x047c: PHI (r24v9 int) = (r24v6 int), (r24v7 int), (r24v10 int) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
      0x047c: PHI (r25v9 java.lang.String) = (r25v6 java.lang.String), (r25v7 java.lang.String), (r25v10 java.lang.String) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
      0x047c: PHI (r27v9 java.lang.String) = (r27v6 java.lang.String), (r27v7 java.lang.String), (r27v10 java.lang.String) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
      0x047c: PHI (r37v9 int) = (r37v6 int), (r37v7 int), (r37v10 int) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]
      0x047c: PHI (r38v9 java.lang.String) = (r38v6 java.lang.String), (r38v7 java.lang.String), (r38v10 java.lang.String) binds: [B:265:0x045f, B:282:0x04a3, B:273:0x047a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:281:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:286:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:288:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:293:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:294:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:301:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:303:0x050d  */
    /* JADX WARN: Code duplicated, block: B:305:0x0515  */
    /* JADX WARN: Code duplicated, block: B:308:0x059a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:318:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:323:0x05d4 A[Catch: RemoteException -> 0x0627, TRY_LEAVE, TryCatch #7 {RemoteException -> 0x0627, blocks: (B:321:0x05cf, B:323:0x05d4), top: B:394:0x05cf }] */
    /* JADX WARN: Code duplicated, block: B:332:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:346:0x0629  */
    /* JADX WARN: Code duplicated, block: B:351:0x0640  */
    /* JADX WARN: Code duplicated, block: B:355:0x0648  */
    /* JADX WARN: Code duplicated, block: B:357:0x0669  */
    /* JADX WARN: Code duplicated, block: B:363:0x0687  */
    /* JADX WARN: Code duplicated, block: B:369:0x069e  */
    /* JADX WARN: Code duplicated, block: B:377:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:410:0x059c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x05e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:418:0x0675 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:429:0x068b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:0x04a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:476:0x04a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:478:0x04a6 A[SYNTHETIC] */
    public final void J(h0 h0Var, com.gamericefishpro.space.w8.a aVar, t4 t4Var) throws Throwable {
        ArrayList arrayList;
        r1 r1Var;
        Context context;
        v0 v0Var;
        int i;
        SQLiteDatabase sQLiteDatabaseX;
        int i2;
        int i3;
        Cursor cursor;
        Cursor cursorQuery;
        Cursor cursorQuery2;
        long j;
        String str;
        String[] strArr;
        int i4;
        long j2;
        String string;
        d0 d0Var;
        t tVarCreateFromParcel;
        int i5;
        e eVarCreateFromParcel;
        o4 o4VarCreateFromParcel;
        int size;
        String str2;
        boolean zB;
        int size2;
        int i6;
        n0 n0Var;
        com.gamericefishpro.space.w8.a aVar2;
        d0 d0Var2;
        r1 r1Var2;
        v0 v0Var2;
        int i7;
        String str3;
        long jElapsedRealtime;
        long j3;
        long jCurrentTimeMillis;
        Context context2;
        String str4;
        r();
        s();
        D();
        r1 r1Var3 = (r1) this.d;
        r1Var3.getClass();
        Context context3 = r1Var3.d;
        v0 v0Var3 = r1Var3.y;
        com.gamericefishpro.space.z8.a aVar3 = r1Var3.D;
        g gVar = r1Var3.v;
        t4 t4Var2 = t4Var;
        int i8 = 100;
        int i9 = 0;
        for (int i10 = 100; i9 < 1001 && i8 == i10; i10 = 100) {
            ArrayList arrayList2 = new ArrayList();
            o0 o0VarN = r1Var3.n();
            int i11 = i10;
            String str5 = "entry";
            String str6 = com.gamericefishpro.space.vd.m.EVENT_TYPE_KEY;
            String str7 = "rowid";
            com.gamericefishpro.space.z8.a aVar4 = aVar3;
            r1 r1Var4 = (r1) o0VarN.d;
            o0VarN.r();
            int i12 = i9;
            if (o0VarN.v) {
                r1Var = r1Var3;
                context = context3;
                v0Var = v0Var3;
            } else {
                arrayList = new ArrayList();
                r1Var = r1Var3;
                if (((r1) o0VarN.d).d.getDatabasePath("google_app_measurement_local.db").exists()) {
                    int i13 = 5;
                    context = context3;
                    v0Var = v0Var3;
                    int i14 = 0;
                    int i15 = 5;
                    while (true) {
                        if (i14 < i13) {
                            try {
                                sQLiteDatabaseX = o0VarN.x();
                                if (sQLiteDatabaseX == null) {
                                    try {
                                        try {
                                            o0VarN.v = true;
                                        } catch (Throwable th) {
                                            th = th;
                                            sQLiteDatabaseX = sQLiteDatabaseX;
                                            cursor = null;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabaseX != null) {
                                                sQLiteDatabaseX.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteDatabaseLockedException unused) {
                                        i2 = i14;
                                        i3 = 5;
                                        str6 = str6;
                                        cursorQuery = null;
                                        try {
                                            SystemClock.sleep(i15);
                                            i15 += 20;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            if (sQLiteDatabaseX != null) {
                                                sQLiteDatabaseX.close();
                                            }
                                            i14 = i2 + 1;
                                            i13 = i3;
                                            str6 = str6;
                                            str5 = str5;
                                            str7 = str7;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor = cursorQuery;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabaseX != null) {
                                                sQLiteDatabaseX.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteFullException e) {
                                        e = e;
                                        i2 = i14;
                                        i3 = 5;
                                        str6 = str6;
                                        cursorQuery = null;
                                        v0 v0Var4 = r1Var4.y;
                                        r1.l(v0Var4);
                                        v0Var4.y.b(e, "Error reading entries from local database");
                                        o0VarN.v = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseX != null) {
                                            sQLiteDatabaseX.close();
                                        }
                                        i14 = i2 + 1;
                                        i13 = i3;
                                        str6 = str6;
                                        str5 = str5;
                                        str7 = str7;
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        i2 = i14;
                                        i3 = 5;
                                        str6 = str6;
                                        cursorQuery = null;
                                        if (sQLiteDatabaseX != null) {
                                            sQLiteDatabaseX.endTransaction();
                                        }
                                        v0 v0Var5 = r1Var4.y;
                                        r1.l(v0Var5);
                                        v0Var5.y.b(e, "Error reading entries from local database");
                                        o0VarN.v = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseX != null) {
                                            sQLiteDatabaseX.close();
                                        }
                                        i14 = i2 + 1;
                                        i13 = i3;
                                        str6 = str6;
                                        str5 = str5;
                                        str7 = str7;
                                    }
                                } else {
                                    sQLiteDatabaseX.beginTransaction();
                                    try {
                                        cursorQuery2 = sQLiteDatabaseX.query("messages", new String[]{str7}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                                        try {
                                            long j4 = -1;
                                            if (cursorQuery2.moveToFirst()) {
                                                i2 = i14;
                                                try {
                                                    j = cursorQuery2.getLong(0);
                                                    try {
                                                        cursorQuery2.close();
                                                    } catch (SQLiteDatabaseLockedException unused2) {
                                                        i3 = 5;
                                                        str6 = str6;
                                                        cursorQuery = null;
                                                        SystemClock.sleep(i15);
                                                        i15 += 20;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseX != null) {
                                                            sQLiteDatabaseX.close();
                                                        }
                                                        i14 = i2 + 1;
                                                        i13 = i3;
                                                        str6 = str6;
                                                        str5 = str5;
                                                        str7 = str7;
                                                    } catch (SQLiteFullException e3) {
                                                        e = e3;
                                                        i3 = 5;
                                                        str6 = str6;
                                                        cursorQuery = null;
                                                        v0 v0Var6 = r1Var4.y;
                                                        r1.l(v0Var6);
                                                        v0Var6.y.b(e, "Error reading entries from local database");
                                                        o0VarN.v = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseX != null) {
                                                            sQLiteDatabaseX.close();
                                                        }
                                                        i14 = i2 + 1;
                                                        i13 = i3;
                                                        str6 = str6;
                                                        str5 = str5;
                                                        str7 = str7;
                                                    } catch (SQLiteException e4) {
                                                        e = e4;
                                                        i3 = 5;
                                                        str6 = str6;
                                                        cursorQuery = null;
                                                        if (sQLiteDatabaseX != null) {
                                                            sQLiteDatabaseX.endTransaction();
                                                        }
                                                        v0 v0Var7 = r1Var4.y;
                                                        r1.l(v0Var7);
                                                        v0Var7.y.b(e, "Error reading entries from local database");
                                                        o0VarN.v = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseX != null) {
                                                            sQLiteDatabaseX.close();
                                                        }
                                                        i14 = i2 + 1;
                                                        i13 = i3;
                                                        str6 = str6;
                                                        str5 = str5;
                                                        str7 = str7;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    i3 = 5;
                                                    if (cursorQuery2 != null) {
                                                        try {
                                                            cursorQuery2.close();
                                                        } catch (SQLiteDatabaseLockedException unused3) {
                                                            cursorQuery = null;
                                                            SystemClock.sleep(i15);
                                                            i15 += 20;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseX != null) {
                                                                sQLiteDatabaseX.close();
                                                            }
                                                            i14 = i2 + 1;
                                                            i13 = i3;
                                                            str6 = str6;
                                                            str5 = str5;
                                                            str7 = str7;
                                                        } catch (SQLiteFullException e5) {
                                                            e = e5;
                                                            cursorQuery = null;
                                                            v0 v0Var8 = r1Var4.y;
                                                            r1.l(v0Var8);
                                                            v0Var8.y.b(e, "Error reading entries from local database");
                                                            o0VarN.v = true;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseX != null) {
                                                                sQLiteDatabaseX.close();
                                                            }
                                                            i14 = i2 + 1;
                                                            i13 = i3;
                                                            str6 = str6;
                                                            str5 = str5;
                                                            str7 = str7;
                                                        } catch (SQLiteException e6) {
                                                            e = e6;
                                                            cursorQuery = null;
                                                            if (sQLiteDatabaseX != null) {
                                                                sQLiteDatabaseX.endTransaction();
                                                            }
                                                            v0 v0Var9 = r1Var4.y;
                                                            r1.l(v0Var9);
                                                            v0Var9.y.b(e, "Error reading entries from local database");
                                                            o0VarN.v = true;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseX != null) {
                                                                sQLiteDatabaseX.close();
                                                            }
                                                            i14 = i2 + 1;
                                                            i13 = i3;
                                                            str6 = str6;
                                                            str5 = str5;
                                                            str7 = str7;
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            cursor = null;
                                                            if (cursor != null) {
                                                                cursor.close();
                                                            }
                                                            if (sQLiteDatabaseX != null) {
                                                                sQLiteDatabaseX.close();
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                i2 = i14;
                                                cursorQuery2.close();
                                                j = -1;
                                            }
                                            if (j != -1) {
                                                str = "rowid<?";
                                                strArr = new String[]{String.valueOf(j)};
                                            } else {
                                                str = null;
                                                strArr = null;
                                            }
                                            try {
                                                String[] strArr2 = {str7, str6, str5};
                                                g gVar2 = r1Var4.v;
                                                d0 d0Var3 = e0.b1;
                                                str7 = str7;
                                                try {
                                                    try {
                                                        int i16 = 4;
                                                        int i17 = 3;
                                                        if (gVar2.B(null, d0Var3)) {
                                                            i4 = 5;
                                                            try {
                                                                strArr2 = new String[]{str7, str6, str5, "app_version", "app_version_int"};
                                                            } catch (SQLiteDatabaseLockedException unused4) {
                                                                i3 = 5;
                                                                str6 = str6;
                                                                cursorQuery = null;
                                                                SystemClock.sleep(i15);
                                                                i15 += 20;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseX != null) {
                                                                    sQLiteDatabaseX.close();
                                                                }
                                                                i14 = i2 + 1;
                                                                i13 = i3;
                                                                str6 = str6;
                                                                str5 = str5;
                                                                str7 = str7;
                                                            } catch (SQLiteFullException e7) {
                                                                e = e7;
                                                                i3 = 5;
                                                                str6 = str6;
                                                                cursorQuery = null;
                                                                v0 v0Var10 = r1Var4.y;
                                                                r1.l(v0Var10);
                                                                v0Var10.y.b(e, "Error reading entries from local database");
                                                                o0VarN.v = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseX != null) {
                                                                    sQLiteDatabaseX.close();
                                                                }
                                                                i14 = i2 + 1;
                                                                i13 = i3;
                                                                str6 = str6;
                                                                str5 = str5;
                                                                str7 = str7;
                                                            } catch (SQLiteException e8) {
                                                                e = e8;
                                                                i3 = 5;
                                                                str6 = str6;
                                                                cursorQuery = null;
                                                                if (sQLiteDatabaseX != null) {
                                                                    sQLiteDatabaseX.endTransaction();
                                                                }
                                                                v0 v0Var11 = r1Var4.y;
                                                                r1.l(v0Var11);
                                                                v0Var11.y.b(e, "Error reading entries from local database");
                                                                o0VarN.v = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseX != null) {
                                                                    sQLiteDatabaseX.close();
                                                                }
                                                                i14 = i2 + 1;
                                                                i13 = i3;
                                                                str6 = str6;
                                                                str5 = str5;
                                                                str7 = str7;
                                                            }
                                                        } else {
                                                            i4 = 5;
                                                        }
                                                        try {
                                                            cursorQuery = sQLiteDatabaseX.query("messages", strArr2, str, strArr, null, null, "rowid asc", Integer.toString(i11));
                                                            while (cursorQuery.moveToNext()) {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            j4 = cursorQuery.getLong(0);
                                                                            try {
                                                                                int i18 = cursorQuery.getInt(1);
                                                                                str6 = str6;
                                                                                try {
                                                                                    byte[] blob = cursorQuery.getBlob(2);
                                                                                    str5 = str5;
                                                                                    try {
                                                                                        if (r1Var4.v.B(null, d0Var3)) {
                                                                                            try {
                                                                                                string = cursorQuery.getString(i17);
                                                                                                j2 = cursorQuery.getLong(i16);
                                                                                            } catch (SQLiteDatabaseLockedException unused5) {
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseX = sQLiteDatabaseX;
                                                                                                i3 = 5;
                                                                                                SystemClock.sleep(i15);
                                                                                                i15 += 20;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseX != null) {
                                                                                                    sQLiteDatabaseX.close();
                                                                                                }
                                                                                                i14 = i2 + 1;
                                                                                                i13 = i3;
                                                                                                str6 = str6;
                                                                                                str5 = str5;
                                                                                                str7 = str7;
                                                                                            } catch (SQLiteFullException e9) {
                                                                                                e = e9;
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseX = sQLiteDatabaseX;
                                                                                                i3 = 5;
                                                                                                v0 v0Var12 = r1Var4.y;
                                                                                                r1.l(v0Var12);
                                                                                                v0Var12.y.b(e, "Error reading entries from local database");
                                                                                                o0VarN.v = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseX != null) {
                                                                                                    sQLiteDatabaseX.close();
                                                                                                }
                                                                                                i14 = i2 + 1;
                                                                                                i13 = i3;
                                                                                                str6 = str6;
                                                                                                str5 = str5;
                                                                                                str7 = str7;
                                                                                            } catch (SQLiteException e10) {
                                                                                                e = e10;
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseX = sQLiteDatabaseX;
                                                                                                i3 = 5;
                                                                                                if (sQLiteDatabaseX != null) {
                                                                                                    sQLiteDatabaseX.endTransaction();
                                                                                                }
                                                                                                v0 v0Var13 = r1Var4.y;
                                                                                                r1.l(v0Var13);
                                                                                                v0Var13.y.b(e, "Error reading entries from local database");
                                                                                                o0VarN.v = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseX != null) {
                                                                                                    sQLiteDatabaseX.close();
                                                                                                }
                                                                                                i14 = i2 + 1;
                                                                                                i13 = i3;
                                                                                                str6 = str6;
                                                                                                str5 = str5;
                                                                                                str7 = str7;
                                                                                            }
                                                                                        } else {
                                                                                            j2 = 0;
                                                                                            string = null;
                                                                                        }
                                                                                        if (i18 == 0) {
                                                                                            d0Var = d0Var3;
                                                                                            try {
                                                                                                try {
                                                                                                    Parcel parcelObtain = Parcel.obtain();
                                                                                                    try {
                                                                                                        try {
                                                                                                            parcelObtain.unmarshall(blob, 0, blob.length);
                                                                                                            parcelObtain.setDataPosition(0);
                                                                                                            u uVarCreateFromParcel = u.CREATOR.createFromParcel(parcelObtain);
                                                                                                            parcelObtain.recycle();
                                                                                                            if (uVarCreateFromParcel != null) {
                                                                                                                arrayList.add(new n0(uVarCreateFromParcel, string, j2));
                                                                                                            }
                                                                                                        } catch (com.gamericefishpro.space.w8.b unused6) {
                                                                                                            v0 v0Var14 = r1Var4.y;
                                                                                                            r1.l(v0Var14);
                                                                                                            v0Var14.y.a("Failed to load event from local database");
                                                                                                            parcelObtain.recycle();
                                                                                                        }
                                                                                                    } catch (Throwable th5) {
                                                                                                        parcelObtain.recycle();
                                                                                                        throw th5;
                                                                                                    }
                                                                                                } catch (Throwable th6) {
                                                                                                    th = th6;
                                                                                                    sQLiteDatabaseX = sQLiteDatabaseX;
                                                                                                    cursor = cursorQuery;
                                                                                                    if (cursor != null) {
                                                                                                        cursor.close();
                                                                                                    }
                                                                                                    if (sQLiteDatabaseX != null) {
                                                                                                        sQLiteDatabaseX.close();
                                                                                                    }
                                                                                                    throw th;
                                                                                                }
                                                                                            } catch (SQLiteDatabaseLockedException unused7) {
                                                                                                sQLiteDatabaseX = sQLiteDatabaseX;
                                                                                                i3 = 5;
                                                                                                SystemClock.sleep(i15);
                                                                                                i15 += 20;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseX != null) {
                                                                                                    sQLiteDatabaseX.close();
                                                                                                }
                                                                                                i14 = i2 + 1;
                                                                                                i13 = i3;
                                                                                                str6 = str6;
                                                                                                str5 = str5;
                                                                                                str7 = str7;
                                                                                            } catch (SQLiteFullException e11) {
                                                                                                e = e11;
                                                                                                sQLiteDatabaseX = sQLiteDatabaseX;
                                                                                                i3 = 5;
                                                                                                v0 v0Var15 = r1Var4.y;
                                                                                                r1.l(v0Var15);
                                                                                                v0Var15.y.b(e, "Error reading entries from local database");
                                                                                                o0VarN.v = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseX != null) {
                                                                                                    sQLiteDatabaseX.close();
                                                                                                }
                                                                                                i14 = i2 + 1;
                                                                                                i13 = i3;
                                                                                                str6 = str6;
                                                                                                str5 = str5;
                                                                                                str7 = str7;
                                                                                            } catch (SQLiteException e12) {
                                                                                                e = e12;
                                                                                                sQLiteDatabaseX = sQLiteDatabaseX;
                                                                                                i3 = 5;
                                                                                                if (sQLiteDatabaseX != null && sQLiteDatabaseX.inTransaction()) {
                                                                                                    sQLiteDatabaseX.endTransaction();
                                                                                                }
                                                                                                v0 v0Var16 = r1Var4.y;
                                                                                                r1.l(v0Var16);
                                                                                                v0Var16.y.b(e, "Error reading entries from local database");
                                                                                                o0VarN.v = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseX != null) {
                                                                                                    sQLiteDatabaseX.close();
                                                                                                }
                                                                                                i14 = i2 + 1;
                                                                                                i13 = i3;
                                                                                                str6 = str6;
                                                                                                str5 = str5;
                                                                                                str7 = str7;
                                                                                            }
                                                                                        } else {
                                                                                            d0Var = d0Var3;
                                                                                            if (i18 == 1) {
                                                                                                Parcel parcelObtain2 = Parcel.obtain();
                                                                                                try {
                                                                                                    try {
                                                                                                        parcelObtain2.unmarshall(blob, 0, blob.length);
                                                                                                        parcelObtain2.setDataPosition(0);
                                                                                                        o4VarCreateFromParcel = o4.CREATOR.createFromParcel(parcelObtain2);
                                                                                                        parcelObtain2.recycle();
                                                                                                    } catch (Throwable th7) {
                                                                                                        parcelObtain2.recycle();
                                                                                                        throw th7;
                                                                                                    }
                                                                                                } catch (com.gamericefishpro.space.w8.b unused8) {
                                                                                                    v0 v0Var17 = r1Var4.y;
                                                                                                    r1.l(v0Var17);
                                                                                                    v0Var17.y.a("Failed to load user property from local database");
                                                                                                    parcelObtain2.recycle();
                                                                                                    o4VarCreateFromParcel = null;
                                                                                                }
                                                                                                if (o4VarCreateFromParcel != null) {
                                                                                                    arrayList.add(new n0(o4VarCreateFromParcel, string, j2));
                                                                                                }
                                                                                            } else {
                                                                                                if (i18 == 2) {
                                                                                                    Parcel parcelObtain3 = Parcel.obtain();
                                                                                                    try {
                                                                                                        try {
                                                                                                            parcelObtain3.unmarshall(blob, 0, blob.length);
                                                                                                            parcelObtain3.setDataPosition(0);
                                                                                                            eVarCreateFromParcel = e.CREATOR.createFromParcel(parcelObtain3);
                                                                                                            parcelObtain3.recycle();
                                                                                                        } catch (com.gamericefishpro.space.w8.b unused9) {
                                                                                                            v0 v0Var18 = r1Var4.y;
                                                                                                            r1.l(v0Var18);
                                                                                                            v0Var18.y.a("Failed to load conditional user property from local database");
                                                                                                            parcelObtain3.recycle();
                                                                                                            eVarCreateFromParcel = null;
                                                                                                        }
                                                                                                        if (eVarCreateFromParcel != null) {
                                                                                                            arrayList.add(new n0(eVarCreateFromParcel, string, j2));
                                                                                                        }
                                                                                                    } catch (Throwable th8) {
                                                                                                        parcelObtain3.recycle();
                                                                                                        throw th8;
                                                                                                    }
                                                                                                } else if (i18 == 4) {
                                                                                                    try {
                                                                                                        Parcel parcelObtain4 = Parcel.obtain();
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    parcelObtain4.unmarshall(blob, 0, blob.length);
                                                                                                                    parcelObtain4.setDataPosition(0);
                                                                                                                    tVarCreateFromParcel = t.CREATOR.createFromParcel(parcelObtain4);
                                                                                                                    try {
                                                                                                                        parcelObtain4.recycle();
                                                                                                                        if (tVarCreateFromParcel != null) {
                                                                                                                            arrayList.add(new n0(tVarCreateFromParcel, string, j2));
                                                                                                                        }
                                                                                                                        i5 = 3;
                                                                                                                    } catch (SQLiteDatabaseLockedException unused10) {
                                                                                                                        sQLiteDatabaseX = sQLiteDatabaseX;
                                                                                                                        i3 = 5;
                                                                                                                        SystemClock.sleep(i15);
                                                                                                                        i15 += 20;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseX != null) {
                                                                                                                            sQLiteDatabaseX.close();
                                                                                                                        }
                                                                                                                        i14 = i2 + 1;
                                                                                                                        i13 = i3;
                                                                                                                        str6 = str6;
                                                                                                                        str5 = str5;
                                                                                                                        str7 = str7;
                                                                                                                    } catch (SQLiteFullException e13) {
                                                                                                                        e = e13;
                                                                                                                        sQLiteDatabaseX = sQLiteDatabaseX;
                                                                                                                        i3 = 5;
                                                                                                                        v0 v0Var19 = r1Var4.y;
                                                                                                                        r1.l(v0Var19);
                                                                                                                        v0Var19.y.b(e, "Error reading entries from local database");
                                                                                                                        o0VarN.v = true;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseX != null) {
                                                                                                                            sQLiteDatabaseX.close();
                                                                                                                        }
                                                                                                                        i14 = i2 + 1;
                                                                                                                        i13 = i3;
                                                                                                                        str6 = str6;
                                                                                                                        str5 = str5;
                                                                                                                        str7 = str7;
                                                                                                                    } catch (SQLiteException e14) {
                                                                                                                        e = e14;
                                                                                                                        sQLiteDatabaseX = sQLiteDatabaseX;
                                                                                                                        i3 = 5;
                                                                                                                        if (sQLiteDatabaseX != null) {
                                                                                                                            sQLiteDatabaseX.endTransaction();
                                                                                                                        }
                                                                                                                        v0 v0Var110 = r1Var4.y;
                                                                                                                        r1.l(v0Var110);
                                                                                                                        v0Var110.y.b(e, "Error reading entries from local database");
                                                                                                                        o0VarN.v = true;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseX != null) {
                                                                                                                            sQLiteDatabaseX.close();
                                                                                                                        }
                                                                                                                        i14 = i2 + 1;
                                                                                                                        i13 = i3;
                                                                                                                        str6 = str6;
                                                                                                                        str5 = str5;
                                                                                                                        str7 = str7;
                                                                                                                    }
                                                                                                                } catch (Throwable th9) {
                                                                                                                    th = th9;
                                                                                                                    parcelObtain4.recycle();
                                                                                                                    throw th;
                                                                                                                }
                                                                                                            } catch (com.gamericefishpro.space.w8.b unused11) {
                                                                                                                v0 v0Var20 = r1Var4.y;
                                                                                                                r1.l(v0Var20);
                                                                                                                v0Var20.y.a("Failed to load default event parameters from local database");
                                                                                                                parcelObtain4.recycle();
                                                                                                                tVarCreateFromParcel = null;
                                                                                                            }
                                                                                                        } catch (com.gamericefishpro.space.w8.b unused12) {
                                                                                                        } catch (Throwable th10) {
                                                                                                            th = th10;
                                                                                                        }
                                                                                                    } catch (SQLiteDatabaseLockedException unused13) {
                                                                                                        sQLiteDatabaseX = sQLiteDatabaseX;
                                                                                                        i3 = 5;
                                                                                                        SystemClock.sleep(i15);
                                                                                                        i15 += 20;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseX != null) {
                                                                                                            sQLiteDatabaseX.close();
                                                                                                        }
                                                                                                        i14 = i2 + 1;
                                                                                                        i13 = i3;
                                                                                                        str6 = str6;
                                                                                                        str5 = str5;
                                                                                                        str7 = str7;
                                                                                                    } catch (SQLiteFullException e15) {
                                                                                                        e = e15;
                                                                                                        sQLiteDatabaseX = sQLiteDatabaseX;
                                                                                                        i3 = 5;
                                                                                                        v0 v0Var111 = r1Var4.y;
                                                                                                        r1.l(v0Var111);
                                                                                                        v0Var111.y.b(e, "Error reading entries from local database");
                                                                                                        o0VarN.v = true;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseX != null) {
                                                                                                            sQLiteDatabaseX.close();
                                                                                                        }
                                                                                                        i14 = i2 + 1;
                                                                                                        i13 = i3;
                                                                                                        str6 = str6;
                                                                                                        str5 = str5;
                                                                                                        str7 = str7;
                                                                                                    } catch (SQLiteException e16) {
                                                                                                        e = e16;
                                                                                                        sQLiteDatabaseX = sQLiteDatabaseX;
                                                                                                        i3 = 5;
                                                                                                        if (sQLiteDatabaseX != null) {
                                                                                                            sQLiteDatabaseX.endTransaction();
                                                                                                        }
                                                                                                        v0 v0Var112 = r1Var4.y;
                                                                                                        r1.l(v0Var112);
                                                                                                        v0Var112.y.b(e, "Error reading entries from local database");
                                                                                                        o0VarN.v = true;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseX != null) {
                                                                                                            sQLiteDatabaseX.close();
                                                                                                        }
                                                                                                        i14 = i2 + 1;
                                                                                                        i13 = i3;
                                                                                                        str6 = str6;
                                                                                                        str5 = str5;
                                                                                                        str7 = str7;
                                                                                                    }
                                                                                                } else {
                                                                                                    i5 = 3;
                                                                                                    if (i18 == 3) {
                                                                                                        v0 v0Var21 = r1Var4.y;
                                                                                                        r1.l(v0Var21);
                                                                                                        v0Var21.G.a("Skipping app launch break");
                                                                                                    } else {
                                                                                                        v0 v0Var22 = r1Var4.y;
                                                                                                        r1.l(v0Var22);
                                                                                                        v0Var22.y.a("Unknown record type in local database");
                                                                                                    }
                                                                                                }
                                                                                                i17 = i5;
                                                                                                str6 = str6;
                                                                                                str5 = str5;
                                                                                                cursorQuery = cursorQuery;
                                                                                                d0Var3 = d0Var;
                                                                                                i16 = 4;
                                                                                            }
                                                                                        }
                                                                                        i5 = 3;
                                                                                        i17 = i5;
                                                                                        str6 = str6;
                                                                                        str5 = str5;
                                                                                        cursorQuery = cursorQuery;
                                                                                        d0Var3 = d0Var;
                                                                                        i16 = 4;
                                                                                    } catch (SQLiteDatabaseLockedException unused14) {
                                                                                        cursorQuery = cursorQuery;
                                                                                    } catch (SQLiteFullException e17) {
                                                                                        e = e17;
                                                                                        cursorQuery = cursorQuery;
                                                                                    } catch (SQLiteException e18) {
                                                                                        e = e18;
                                                                                        cursorQuery = cursorQuery;
                                                                                    }
                                                                                } catch (SQLiteDatabaseLockedException unused15) {
                                                                                    str5 = str5;
                                                                                    sQLiteDatabaseX = sQLiteDatabaseX;
                                                                                    i3 = 5;
                                                                                    SystemClock.sleep(i15);
                                                                                    i15 += 20;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseX != null) {
                                                                                        sQLiteDatabaseX.close();
                                                                                    }
                                                                                    i14 = i2 + 1;
                                                                                    i13 = i3;
                                                                                    str6 = str6;
                                                                                    str5 = str5;
                                                                                    str7 = str7;
                                                                                } catch (SQLiteFullException e19) {
                                                                                    e = e19;
                                                                                    str5 = str5;
                                                                                    sQLiteDatabaseX = sQLiteDatabaseX;
                                                                                    i3 = 5;
                                                                                    v0 v0Var113 = r1Var4.y;
                                                                                    r1.l(v0Var113);
                                                                                    v0Var113.y.b(e, "Error reading entries from local database");
                                                                                    o0VarN.v = true;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseX != null) {
                                                                                        sQLiteDatabaseX.close();
                                                                                    }
                                                                                    i14 = i2 + 1;
                                                                                    i13 = i3;
                                                                                    str6 = str6;
                                                                                    str5 = str5;
                                                                                    str7 = str7;
                                                                                } catch (SQLiteException e20) {
                                                                                    e = e20;
                                                                                    str5 = str5;
                                                                                    sQLiteDatabaseX = sQLiteDatabaseX;
                                                                                    i3 = 5;
                                                                                    if (sQLiteDatabaseX != null) {
                                                                                        sQLiteDatabaseX.endTransaction();
                                                                                    }
                                                                                    v0 v0Var114 = r1Var4.y;
                                                                                    r1.l(v0Var114);
                                                                                    v0Var114.y.b(e, "Error reading entries from local database");
                                                                                    o0VarN.v = true;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseX != null) {
                                                                                        sQLiteDatabaseX.close();
                                                                                    }
                                                                                    i14 = i2 + 1;
                                                                                    i13 = i3;
                                                                                    str6 = str6;
                                                                                    str5 = str5;
                                                                                    str7 = str7;
                                                                                }
                                                                            } catch (SQLiteDatabaseLockedException unused16) {
                                                                                str6 = str6;
                                                                            } catch (SQLiteFullException e21) {
                                                                                e = e21;
                                                                                str6 = str6;
                                                                            } catch (SQLiteException e22) {
                                                                                e = e22;
                                                                                str6 = str6;
                                                                            }
                                                                        } catch (SQLiteDatabaseLockedException unused17) {
                                                                            cursorQuery = cursorQuery;
                                                                            str6 = str6;
                                                                            str5 = str5;
                                                                        } catch (SQLiteFullException e23) {
                                                                            e = e23;
                                                                            cursorQuery = cursorQuery;
                                                                            str6 = str6;
                                                                            str5 = str5;
                                                                        } catch (SQLiteException e24) {
                                                                            e = e24;
                                                                            cursorQuery = cursorQuery;
                                                                            str6 = str6;
                                                                            str5 = str5;
                                                                        }
                                                                    } catch (Throwable th11) {
                                                                        th = th11;
                                                                        cursorQuery = cursorQuery;
                                                                    }
                                                                } catch (SQLiteDatabaseLockedException unused18) {
                                                                    cursorQuery = cursorQuery;
                                                                    str6 = str6;
                                                                    str5 = str5;
                                                                } catch (SQLiteFullException e25) {
                                                                    e = e25;
                                                                    cursorQuery = cursorQuery;
                                                                    str6 = str6;
                                                                    str5 = str5;
                                                                } catch (SQLiteException e26) {
                                                                    e = e26;
                                                                    cursorQuery = cursorQuery;
                                                                    str6 = str6;
                                                                    str5 = str5;
                                                                }
                                                            }
                                                            cursorQuery = cursorQuery;
                                                            str6 = str6;
                                                            str5 = str5;
                                                            i = 0;
                                                            sQLiteDatabaseX = sQLiteDatabaseX;
                                                            try {
                                                                if (sQLiteDatabaseX.delete("messages", "rowid <= ?", new String[]{Long.toString(j4)}) < arrayList.size()) {
                                                                    v0 v0Var23 = r1Var4.y;
                                                                    r1.l(v0Var23);
                                                                    v0Var23.y.a("Fewer entries removed from local database than expected");
                                                                }
                                                                sQLiteDatabaseX.setTransactionSuccessful();
                                                                sQLiteDatabaseX.endTransaction();
                                                                cursorQuery.close();
                                                                sQLiteDatabaseX.close();
                                                            } catch (SQLiteDatabaseLockedException unused19) {
                                                                i3 = 5;
                                                                SystemClock.sleep(i15);
                                                                i15 += 20;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseX != null) {
                                                                    sQLiteDatabaseX.close();
                                                                }
                                                                i14 = i2 + 1;
                                                                i13 = i3;
                                                                str6 = str6;
                                                                str5 = str5;
                                                                str7 = str7;
                                                            } catch (SQLiteFullException e27) {
                                                                e = e27;
                                                                i3 = 5;
                                                                v0 v0Var115 = r1Var4.y;
                                                                r1.l(v0Var115);
                                                                v0Var115.y.b(e, "Error reading entries from local database");
                                                                o0VarN.v = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseX != null) {
                                                                    sQLiteDatabaseX.close();
                                                                }
                                                                i14 = i2 + 1;
                                                                i13 = i3;
                                                                str6 = str6;
                                                                str5 = str5;
                                                                str7 = str7;
                                                            } catch (SQLiteException e28) {
                                                                e = e28;
                                                                i3 = 5;
                                                                if (sQLiteDatabaseX != null) {
                                                                    sQLiteDatabaseX.endTransaction();
                                                                }
                                                                v0 v0Var116 = r1Var4.y;
                                                                r1.l(v0Var116);
                                                                v0Var116.y.b(e, "Error reading entries from local database");
                                                                o0VarN.v = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseX != null) {
                                                                    sQLiteDatabaseX.close();
                                                                }
                                                                i14 = i2 + 1;
                                                                i13 = i3;
                                                                str6 = str6;
                                                                str5 = str5;
                                                                str7 = str7;
                                                            }
                                                        } catch (SQLiteDatabaseLockedException unused20) {
                                                            str5 = str5;
                                                            sQLiteDatabaseX = sQLiteDatabaseX;
                                                            str6 = str6;
                                                            i3 = i4;
                                                            cursorQuery = null;
                                                            SystemClock.sleep(i15);
                                                            i15 += 20;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseX != null) {
                                                                sQLiteDatabaseX.close();
                                                            }
                                                            i14 = i2 + 1;
                                                            i13 = i3;
                                                            str6 = str6;
                                                            str5 = str5;
                                                            str7 = str7;
                                                        }
                                                    } catch (SQLiteDatabaseLockedException unused21) {
                                                        str5 = str5;
                                                        sQLiteDatabaseX = sQLiteDatabaseX;
                                                        str6 = str6;
                                                        i3 = 5;
                                                        cursorQuery = null;
                                                        SystemClock.sleep(i15);
                                                        i15 += 20;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseX != null) {
                                                            sQLiteDatabaseX.close();
                                                        }
                                                        i14 = i2 + 1;
                                                        i13 = i3;
                                                        str6 = str6;
                                                        str5 = str5;
                                                        str7 = str7;
                                                    }
                                                } catch (SQLiteFullException e29) {
                                                    e = e29;
                                                    str5 = str5;
                                                    sQLiteDatabaseX = sQLiteDatabaseX;
                                                    str6 = str6;
                                                    i3 = 5;
                                                    cursorQuery = null;
                                                    v0 v0Var117 = r1Var4.y;
                                                    r1.l(v0Var117);
                                                    v0Var117.y.b(e, "Error reading entries from local database");
                                                    o0VarN.v = true;
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    if (sQLiteDatabaseX != null) {
                                                        sQLiteDatabaseX.close();
                                                    }
                                                    i14 = i2 + 1;
                                                    i13 = i3;
                                                    str6 = str6;
                                                    str5 = str5;
                                                    str7 = str7;
                                                } catch (SQLiteException e30) {
                                                    e = e30;
                                                    str5 = str5;
                                                    sQLiteDatabaseX = sQLiteDatabaseX;
                                                    str6 = str6;
                                                    i3 = 5;
                                                    cursorQuery = null;
                                                    if (sQLiteDatabaseX != null) {
                                                        sQLiteDatabaseX.endTransaction();
                                                    }
                                                    v0 v0Var118 = r1Var4.y;
                                                    r1.l(v0Var118);
                                                    v0Var118.y.b(e, "Error reading entries from local database");
                                                    o0VarN.v = true;
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    if (sQLiteDatabaseX != null) {
                                                        sQLiteDatabaseX.close();
                                                    }
                                                    i14 = i2 + 1;
                                                    i13 = i3;
                                                    str6 = str6;
                                                    str5 = str5;
                                                    str7 = str7;
                                                }
                                            } catch (SQLiteDatabaseLockedException unused22) {
                                                str7 = str7;
                                            } catch (SQLiteFullException e31) {
                                                e = e31;
                                                str7 = str7;
                                            } catch (SQLiteException e32) {
                                                e = e32;
                                                str7 = str7;
                                            }
                                        } catch (Throwable th12) {
                                            th = th12;
                                            i2 = i14;
                                        }
                                    } catch (Throwable th13) {
                                        th = th13;
                                        i2 = i14;
                                        i3 = 5;
                                        cursorQuery2 = null;
                                    }
                                }
                            } catch (SQLiteDatabaseLockedException unused23) {
                                str7 = str7;
                                i2 = i14;
                                str6 = str6;
                                str5 = str5;
                                i3 = 5;
                                sQLiteDatabaseX = null;
                            } catch (SQLiteFullException e33) {
                                e = e33;
                                str7 = str7;
                                i2 = i14;
                                str6 = str6;
                                str5 = str5;
                                i3 = 5;
                                sQLiteDatabaseX = null;
                            } catch (SQLiteException e34) {
                                e = e34;
                                str7 = str7;
                                i2 = i14;
                                str6 = str6;
                                str5 = str5;
                                i3 = 5;
                                sQLiteDatabaseX = null;
                            } catch (Throwable th14) {
                                th = th14;
                                sQLiteDatabaseX = null;
                            }
                        } else {
                            i = 0;
                            v0 v0Var24 = r1Var4.y;
                            r1.l(v0Var24);
                            v0Var24.B.a("Failed to read events from database in reasonable time");
                            arrayList = null;
                        }
                        i14 = i2 + 1;
                        i13 = i3;
                        str6 = str6;
                        str5 = str5;
                        str7 = str7;
                    }
                } else {
                    context = context3;
                    v0Var = v0Var3;
                    i = 0;
                }
                if (arrayList != null) {
                    arrayList2.addAll(arrayList);
                    size = arrayList.size();
                } else {
                    size = i;
                }
                if (aVar != 0 && size < i11) {
                    arrayList2.add(new n0(aVar, t4Var2.i, t4Var2.C));
                }
                str2 = null;
                zB = gVar.B(null, e0.O0);
                size2 = arrayList2.size();
                i6 = i;
                while (i6 < size2) {
                    n0Var = (n0) arrayList2.get(i6);
                    aVar2 = n0Var.a;
                    d0Var2 = e0.b1;
                    if (gVar.B(str2, d0Var2)) {
                        str4 = n0Var.b;
                        if (!TextUtils.isEmpty(str4)) {
                            t4Var2 = new t4(t4Var2.d, t4Var2.e, str4, n0Var.c, t4Var2.v, t4Var2.w, t4Var2.y, t4Var2.z, t4Var2.A, t4Var2.B, t4Var2.D, t4Var2.E, t4Var2.F, t4Var2.G, t4Var2.H, t4Var2.I, t4Var2.J, t4Var2.K, t4Var2.L, t4Var2.M, t4Var2.N, t4Var2.O, t4Var2.P, t4Var2.Q, t4Var2.R, t4Var2.S, t4Var2.T, t4Var2.U, t4Var2.V, t4Var2.W, t4Var2.X);
                        }
                    }
                    if (aVar2 instanceof u) {
                        if (zB) {
                            try {
                                aVar4.getClass();
                                jCurrentTimeMillis = System.currentTimeMillis();
                                try {
                                    aVar4.getClass();
                                    j3 = jCurrentTimeMillis;
                                    jElapsedRealtime = SystemClock.elapsedRealtime();
                                } catch (RemoteException e35) {
                                    e = e35;
                                    j3 = jCurrentTimeMillis;
                                    jElapsedRealtime = 0;
                                    r1Var2 = r1Var;
                                    context2 = context;
                                    v0Var2 = v0Var;
                                    i7 = size;
                                    r1.l(v0Var2);
                                    v0Var2.y.b(e, "Failed to send event to the service");
                                    if (zB) {
                                        if (com.gamericefishpro.space.a8.c.w == null) {
                                            com.gamericefishpro.space.a8.c.w = new com.gamericefishpro.space.a8.c(context2, r1Var2);
                                        }
                                        com.gamericefishpro.space.a8.c cVar = com.gamericefishpro.space.a8.c.w;
                                        aVar4.getClass();
                                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                                        aVar4.getClass();
                                        cVar.L(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j3, jCurrentTimeMillis2);
                                    }
                                    context = context2;
                                    str3 = null;
                                    i6++;
                                    r1Var = r1Var2;
                                    str2 = str3;
                                    size = i7;
                                    v0Var = v0Var2;
                                }
                            } catch (RemoteException e36) {
                                e = e36;
                                jElapsedRealtime = 0;
                                j3 = 0;
                            }
                        } else {
                            jElapsedRealtime = 0;
                            j3 = 0;
                        }
                        try {
                            try {
                                h0Var.v((u) aVar2, t4Var2);
                                if (zB) {
                                    r1.l(v0Var);
                                    v0Var2 = v0Var;
                                    try {
                                        v0Var2.G.a("Logging telemetry for logEvent from database");
                                        if (com.gamericefishpro.space.a8.c.w == null) {
                                            try {
                                                r1Var2 = r1Var;
                                                context2 = context;
                                                try {
                                                    com.gamericefishpro.space.a8.c.w = new com.gamericefishpro.space.a8.c(context2, r1Var2);
                                                } catch (RemoteException e37) {
                                                    e = e37;
                                                    i7 = size;
                                                    r1.l(v0Var2);
                                                    v0Var2.y.b(e, "Failed to send event to the service");
                                                    if (zB && j3 != 0) {
                                                        if (com.gamericefishpro.space.a8.c.w == null) {
                                                            com.gamericefishpro.space.a8.c.w = new com.gamericefishpro.space.a8.c(context2, r1Var2);
                                                        }
                                                        com.gamericefishpro.space.a8.c cVar2 = com.gamericefishpro.space.a8.c.w;
                                                        aVar4.getClass();
                                                        long jCurrentTimeMillis3 = System.currentTimeMillis();
                                                        aVar4.getClass();
                                                        cVar2.L(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j3, jCurrentTimeMillis3);
                                                    }
                                                    context = context2;
                                                    str3 = null;
                                                    i6++;
                                                    r1Var = r1Var2;
                                                    str2 = str3;
                                                    size = i7;
                                                    v0Var = v0Var2;
                                                }
                                            } catch (RemoteException e38) {
                                                e = e38;
                                                r1Var2 = r1Var;
                                                context2 = context;
                                            }
                                        } else {
                                            r1Var2 = r1Var;
                                            context2 = context;
                                        }
                                        com.gamericefishpro.space.a8.c cVar3 = com.gamericefishpro.space.a8.c.w;
                                        aVar4.getClass();
                                        long jCurrentTimeMillis4 = System.currentTimeMillis();
                                        aVar4.getClass();
                                        i7 = size;
                                        try {
                                            cVar3.L(0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j3, jCurrentTimeMillis4);
                                        } catch (RemoteException e39) {
                                            e = e39;
                                            r1.l(v0Var2);
                                            v0Var2.y.b(e, "Failed to send event to the service");
                                            if (zB) {
                                                if (com.gamericefishpro.space.a8.c.w == null) {
                                                    com.gamericefishpro.space.a8.c.w = new com.gamericefishpro.space.a8.c(context2, r1Var2);
                                                }
                                                com.gamericefishpro.space.a8.c cVar4 = com.gamericefishpro.space.a8.c.w;
                                                aVar4.getClass();
                                                long jCurrentTimeMillis5 = System.currentTimeMillis();
                                                aVar4.getClass();
                                                cVar4.L(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j3, jCurrentTimeMillis5);
                                            }
                                        }
                                    } catch (RemoteException e40) {
                                        e = e40;
                                        i7 = size;
                                        r1Var2 = r1Var;
                                        context2 = context;
                                    }
                                    context = context2;
                                } else {
                                    r1Var2 = r1Var;
                                    v0Var2 = v0Var;
                                    i7 = size;
                                }
                            } catch (RemoteException e41) {
                                e = e41;
                                r1Var2 = r1Var;
                                context2 = context;
                                v0Var2 = v0Var;
                                i7 = size;
                                r1.l(v0Var2);
                                v0Var2.y.b(e, "Failed to send event to the service");
                                if (zB) {
                                    if (com.gamericefishpro.space.a8.c.w == null) {
                                        com.gamericefishpro.space.a8.c.w = new com.gamericefishpro.space.a8.c(context2, r1Var2);
                                    }
                                    com.gamericefishpro.space.a8.c cVar5 = com.gamericefishpro.space.a8.c.w;
                                    aVar4.getClass();
                                    long jCurrentTimeMillis6 = System.currentTimeMillis();
                                    aVar4.getClass();
                                    cVar5.L(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j3, jCurrentTimeMillis6);
                                }
                                context = context2;
                                str3 = null;
                                i6++;
                                r1Var = r1Var2;
                                str2 = str3;
                                size = i7;
                                v0Var = v0Var2;
                            }
                        } catch (RemoteException e42) {
                            e = e42;
                        }
                    } else {
                        r1Var2 = r1Var;
                        v0Var2 = v0Var;
                        i7 = size;
                        if (aVar2 instanceof o4) {
                            try {
                                h0Var.i((o4) aVar2, t4Var2);
                            } catch (RemoteException e43) {
                                r1.l(v0Var2);
                                v0Var2.y.b(e43, "Failed to send user property to the service");
                            }
                        } else {
                            if (aVar2 instanceof e) {
                                try {
                                    h0Var.r((e) aVar2, t4Var2);
                                } catch (RemoteException e44) {
                                    r1.l(v0Var2);
                                    v0Var2.y.b(e44, "Failed to send conditional user property to the service");
                                }
                            } else {
                                str3 = null;
                                if (gVar.B(null, d0Var2) || !(aVar2 instanceof t)) {
                                    r1.l(v0Var2);
                                    v0Var2.y.a("Discarding data. Unrecognized parcel type.");
                                } else {
                                    try {
                                        h0Var.u(((t) aVar2).f(), t4Var2);
                                    } catch (RemoteException e45) {
                                        r1.l(v0Var2);
                                        v0Var2.y.b(e45, "Failed to send default event parameters to the service");
                                    }
                                }
                            }
                            i6++;
                            r1Var = r1Var2;
                            str2 = str3;
                            size = i7;
                            v0Var = v0Var2;
                        }
                    }
                    str3 = null;
                    i6++;
                    r1Var = r1Var2;
                    str2 = str3;
                    size = i7;
                    v0Var = v0Var2;
                }
                i9 = i12 + 1;
                v0Var3 = v0Var;
                r1Var3 = r1Var;
                aVar3 = aVar4;
                context3 = context;
                i8 = size;
            }
            i = 0;
            arrayList = null;
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
                size = arrayList.size();
            } else {
                size = i;
            }
            if (aVar != 0) {
                arrayList2.add(new n0(aVar, t4Var2.i, t4Var2.C));
            }
            str2 = null;
            zB = gVar.B(null, e0.O0);
            size2 = arrayList2.size();
            i6 = i;
            while (i6 < size2) {
                n0Var = (n0) arrayList2.get(i6);
                aVar2 = n0Var.a;
                d0Var2 = e0.b1;
                if (gVar.B(str2, d0Var2)) {
                    str4 = n0Var.b;
                    if (!TextUtils.isEmpty(str4)) {
                        t4Var2 = new t4(t4Var2.d, t4Var2.e, str4, n0Var.c, t4Var2.v, t4Var2.w, t4Var2.y, t4Var2.z, t4Var2.A, t4Var2.B, t4Var2.D, t4Var2.E, t4Var2.F, t4Var2.G, t4Var2.H, t4Var2.I, t4Var2.J, t4Var2.K, t4Var2.L, t4Var2.M, t4Var2.N, t4Var2.O, t4Var2.P, t4Var2.Q, t4Var2.R, t4Var2.S, t4Var2.T, t4Var2.U, t4Var2.V, t4Var2.W, t4Var2.X);
                    }
                }
                if (aVar2 instanceof u) {
                    if (zB) {
                        aVar4.getClass();
                        jCurrentTimeMillis = System.currentTimeMillis();
                        aVar4.getClass();
                        j3 = jCurrentTimeMillis;
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                    } else {
                        jElapsedRealtime = 0;
                        j3 = 0;
                    }
                    h0Var.v((u) aVar2, t4Var2);
                    if (zB) {
                        r1.l(v0Var);
                        v0Var2 = v0Var;
                        v0Var2.G.a("Logging telemetry for logEvent from database");
                        if (com.gamericefishpro.space.a8.c.w == null) {
                            r1Var2 = r1Var;
                            context2 = context;
                            com.gamericefishpro.space.a8.c.w = new com.gamericefishpro.space.a8.c(context2, r1Var2);
                        } else {
                            r1Var2 = r1Var;
                            context2 = context;
                        }
                        com.gamericefishpro.space.a8.c cVar6 = com.gamericefishpro.space.a8.c.w;
                        aVar4.getClass();
                        long jCurrentTimeMillis7 = System.currentTimeMillis();
                        aVar4.getClass();
                        i7 = size;
                        cVar6.L(0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j3, jCurrentTimeMillis7);
                        context = context2;
                    } else {
                        r1Var2 = r1Var;
                        v0Var2 = v0Var;
                        i7 = size;
                    }
                } else {
                    r1Var2 = r1Var;
                    v0Var2 = v0Var;
                    i7 = size;
                    if (aVar2 instanceof o4) {
                        h0Var.i((o4) aVar2, t4Var2);
                    } else {
                        if (aVar2 instanceof e) {
                            h0Var.r((e) aVar2, t4Var2);
                        } else {
                            str3 = null;
                            if (gVar.B(null, d0Var2)) {
                                r1.l(v0Var2);
                                v0Var2.y.a("Discarding data. Unrecognized parcel type.");
                            } else {
                                r1.l(v0Var2);
                                v0Var2.y.a("Discarding data. Unrecognized parcel type.");
                            }
                        }
                        i6++;
                        r1Var = r1Var2;
                        str2 = str3;
                        size = i7;
                        v0Var = v0Var2;
                    }
                }
                str3 = null;
                i6++;
                r1Var = r1Var2;
                str2 = str3;
                size = i7;
                v0Var = v0Var2;
            }
            i9 = i12 + 1;
            v0Var3 = v0Var;
            r1Var3 = r1Var;
            aVar3 = aVar4;
            context3 = context;
            i8 = size;
        }
    }

    public final void K(e eVar) {
        boolean zY;
        r();
        s();
        r1 r1Var = (r1) this.d;
        r1Var.getClass();
        o0 o0VarN = r1Var.n();
        r1 r1Var2 = (r1) o0VarN.d;
        r1.j(r1Var2.B);
        byte[] bArrV = r4.V(eVar);
        if (bArrV.length > 131072) {
            v0 v0Var = r1Var2.y;
            r1.l(v0Var);
            v0Var.z.a("Conditional user property too long for local database. Sending directly to service");
            zY = false;
        } else {
            zY = o0VarN.y(2, bArrV);
        }
        F(new i3(this, H(true), zY, new e(eVar)));
    }

    @Override // com.gamericefishpro.space.n9.g0
    public final boolean u() {
        return false;
    }

    public final void v(AtomicReference atomicReference) {
        r();
        s();
        F(new com.gamericefishpro.space.m6.e(this, atomicReference, H(false)));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:14:0x0059  */
    public final void w(Bundle bundle) {
        boolean z;
        boolean zY;
        r();
        s();
        t tVar = new t(bundle);
        D();
        r1 r1Var = (r1) this.d;
        if (r1Var.v.B(null, e0.b1)) {
            o0 o0VarN = r1Var.n();
            r1 r1Var2 = (r1) o0VarN.d;
            r4 r4Var = r1Var2.B;
            v0 v0Var = r1Var2.y;
            r1.j(r4Var);
            byte[] bArrV = r4.V(tVar);
            if (bArrV == null) {
                r1.l(v0Var);
                v0Var.z.a("Null default event parameters; not writing to database");
            } else {
                if (bArrV.length > 131072) {
                    r1.l(v0Var);
                    v0Var.z.a("Default event parameters too long for local database. Sending directly to service");
                } else {
                    zY = o0VarN.y(4, bArrV);
                }
                if (zY) {
                    z = true;
                } else {
                    z = false;
                }
            }
            zY = false;
            if (zY) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        F(new k2(this, H(false), z, tVar, bundle));
    }

    public final void x() {
        r();
        s();
        if (I()) {
            return;
        }
        if (y()) {
            n3 n3Var = this.i;
            o3 o3Var = n3Var.i;
            o3Var.r();
            Context context = ((r1) o3Var.d).d;
            synchronized (n3Var) {
                try {
                    if (n3Var.d) {
                        v0 v0Var = ((r1) n3Var.i.d).y;
                        r1.l(v0Var);
                        v0Var.G.a("Connection attempt already in progress");
                        return;
                    } else {
                        if (n3Var.e != null && (n3Var.e.g() || n3Var.e.a())) {
                            v0 v0Var2 = ((r1) n3Var.i.d).y;
                            r1.l(v0Var2);
                            v0Var2.G.a("Already awaiting connection attempt");
                            return;
                        }
                        n3Var.e = new q0(context, Looper.getMainLooper(), com.gamericefishpro.space.v8.n0.a(context), com.gamericefishpro.space.s8.f.b, 93, n3Var, n3Var, null);
                        v0 v0Var3 = ((r1) n3Var.i.d).y;
                        r1.l(v0Var3);
                        v0Var3.G.a("Connecting to remote service");
                        n3Var.d = true;
                        com.gamericefishpro.space.v8.c0.g(n3Var.e);
                        n3Var.e.o();
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        r1 r1Var = (r1) this.d;
        if (r1Var.v.u()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = r1Var.d.getPackageManager().queryIntentServices(new Intent().setClassName(r1Var.d, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            v0 v0Var4 = r1Var.y;
            r1.l(v0Var4);
            v0Var4.y.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(r1Var.d, "com.google.android.gms.measurement.AppMeasurementService"));
        n3 n3Var2 = this.i;
        o3 o3Var2 = n3Var2.i;
        o3Var2.r();
        Context context2 = ((r1) o3Var2.d).d;
        com.gamericefishpro.space.y8.a aVarB = com.gamericefishpro.space.y8.a.b();
        synchronized (n3Var2) {
            try {
                if (n3Var2.d) {
                    v0 v0Var5 = ((r1) n3Var2.i.d).y;
                    r1.l(v0Var5);
                    v0Var5.G.a("Connection attempt already in progress");
                } else {
                    o3 o3Var3 = n3Var2.i;
                    v0 v0Var6 = ((r1) o3Var3.d).y;
                    r1.l(v0Var6);
                    v0Var6.G.a("Using local app measurement service");
                    n3Var2.d = true;
                    aVarB.a(context2, intent, o3Var3.i, 129);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean y() {
        r();
        s();
        if (this.w == null) {
            r();
            s();
            r1 r1Var = (r1) this.d;
            f1 f1Var = r1Var.w;
            r1.j(f1Var);
            f1Var.r();
            boolean z = false;
            Boolean boolValueOf = !f1Var.v().contains("use_service") ? null : Boolean.valueOf(f1Var.v().getBoolean("use_service", false));
            boolean z2 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                m0 m0VarQ = ((r1) this.d).q();
                m0VarQ.s();
                if (m0VarQ.F == 1) {
                    z = true;
                } else {
                    v0 v0Var = r1Var.y;
                    r1.l(v0Var);
                    v0Var.G.a("Checking service availability");
                    r4 r4Var = r1Var.B;
                    r1.j(r4Var);
                    int iB = com.gamericefishpro.space.s8.f.b.b(((r1) r4Var.d).d, 12451000);
                    if (iB == 0) {
                        v0 v0Var2 = r1Var.y;
                        r1.l(v0Var2);
                        v0Var2.G.a("Service available");
                    } else if (iB == 1) {
                        v0 v0Var3 = r1Var.y;
                        r1.l(v0Var3);
                        v0Var3.G.a("Service missing");
                    } else if (iB != 2) {
                        if (iB == 3) {
                            v0 v0Var4 = r1Var.y;
                            r1.l(v0Var4);
                            v0Var4.B.a("Service disabled");
                        } else if (iB == 9) {
                            v0 v0Var5 = r1Var.y;
                            r1.l(v0Var5);
                            v0Var5.B.a("Service invalid");
                        } else if (iB != 18) {
                            v0 v0Var6 = r1Var.y;
                            r1.l(v0Var6);
                            v0Var6.B.b(Integer.valueOf(iB), "Unexpected service status");
                        } else {
                            v0 v0Var7 = r1Var.y;
                            r1.l(v0Var7);
                            v0Var7.B.a("Service updating");
                        }
                        z2 = false;
                    } else {
                        v0 v0Var8 = r1Var.y;
                        r1.l(v0Var8);
                        v0Var8.F.a("Service container out of date");
                        r4 r4Var2 = r1Var.B;
                        r1.j(r4Var2);
                        if (r4Var2.X() >= 17443) {
                            z = boolValueOf == null;
                            z2 = false;
                        }
                    }
                    z = true;
                }
                if (!z && r1Var.v.u()) {
                    v0 v0Var9 = r1Var.y;
                    r1.l(v0Var9);
                    v0Var9.y.a("No way to upload. Consider using the full version of Analytics");
                } else if (z2) {
                    f1 f1Var2 = r1Var.w;
                    r1.j(f1Var2);
                    f1Var2.r();
                    SharedPreferences.Editor editorEdit = f1Var2.v().edit();
                    editorEdit.putBoolean("use_service", z);
                    editorEdit.apply();
                }
                z2 = z;
            }
            this.w = Boolean.valueOf(z2);
        }
        return this.w.booleanValue();
    }

    public final void z() {
        r();
        s();
        n3 n3Var = this.i;
        if (n3Var.e != null && (n3Var.e.a() || n3Var.e.g())) {
            n3Var.e.l();
        }
        n3Var.e = null;
        try {
            com.gamericefishpro.space.y8.a.b().c(((r1) this.d).d, n3Var);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.v = null;
    }
}

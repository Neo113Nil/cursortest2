package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.z5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0826z5 extends DatabaseScript {
    public final int a = 2000;
    public final String b = "number";
    public final String c = "global_number";
    public final String d = "number_of_type";
    public final String e = "name";
    public final String f = Constants.KEY_VALUE;
    public final String g = "type";
    public final String h = "time";
    public final String i = "session_id";
    public final String j = "error_environment";
    public final String k = "session_type";
    public final String l = "app_environment";
    public final String m = "app_environment_revision";
    public final String n = "truncated";
    public final String o = "custom_type";
    public final String p = "encrypting_mode";
    public final String q = "profile_id";
    public final String r = "first_occurrence_status";
    public final String s = "source";
    public final String t = "attribution_id_changed";
    public final String u = "open_id";
    public final String v = "extras";
    public final String w = "reports";
    public final Y7 x = new Y7(null, 1, 0 == true ? 1 : 0);

    /* JADX WARN: Can't wrap try/catch for region: R(19:2|3|(2:57|(1:59)(15:60|6|(2:50|(1:52)(2:53|(1:55)(12:56|9|10|11|(2:43|(1:45)(2:46|47))|13|14|15|(2:38|(3:40|18|19))|17|18|19)))|8|9|10|11|(0)|13|14|15|(0)|17|18|19))|5|6|(0)|8|9|10|11|(0)|13|14|15|(0)|17|18|19|(3:(9:21|22|23|24|25|(1:27)(1:33)|28|29|30)|(0)|(5:25|(0)(0)|28|29|30))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x012d, code lost:
    
        if (r32.getInt(r32.getColumnIndexOrThrow(r31.t)) != 1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0120, code lost:
    
        r4 = io.appmetrica.analytics.impl.EnumC0688ua.NATIVE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0104, code lost:
    
        r3 = io.appmetrica.analytics.impl.EnumC0458mb.UNKNOWN;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0150 A[Catch: all -> 0x0167, TryCatch #4 {all -> 0x0167, blocks: (B:3:0x0005, B:6:0x002a, B:9:0x00e0, B:22:0x0131, B:25:0x0141, B:28:0x0156, B:33:0x0150, B:42:0x0120, B:49:0x0104, B:50:0x00d4, B:53:0x00d9, B:57:0x0024, B:15:0x0107, B:38:0x0118, B:11:0x00ea, B:43:0x00fb, B:46:0x0100), top: B:2:0x0005, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0118 A[Catch: all -> 0x0120, TRY_LEAVE, TryCatch #2 {all -> 0x0120, blocks: (B:15:0x0107, B:38:0x0118), top: B:14:0x0107, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fb A[Catch: all -> 0x0104, TryCatch #3 {all -> 0x0104, blocks: (B:11:0x00ea, B:43:0x00fb, B:46:0x0100), top: B:10:0x00ea, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4 A[Catch: all -> 0x0167, TryCatch #4 {all -> 0x0167, blocks: (B:3:0x0005, B:6:0x002a, B:9:0x00e0, B:22:0x0131, B:25:0x0141, B:28:0x0156, B:33:0x0150, B:42:0x0120, B:49:0x0104, B:50:0x00d4, B:53:0x00d9, B:57:0x0024, B:15:0x0107, B:38:0x0118, B:11:0x00ea, B:43:0x00fb, B:46:0x0100), top: B:2:0x0005, inners: #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final X7 a(Cursor cursor) {
        Xn xn;
        int i;
        Q9 q9;
        EnumC0688ua enumC0688ua;
        int i2;
        int i3;
        int i4;
        try {
            Long valueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.i)));
            int i5 = cursor.getInt(cursor.getColumnIndexOrThrow(this.k));
            Xn xn2 = Xn.FOREGROUND;
            boolean z = true;
            try {
                if (i5 != 0) {
                    xn2 = Xn.BACKGROUND;
                    if (i5 != 1) {
                        xn = null;
                        Long valueOf2 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.b)));
                        EnumC0603rc a = EnumC0603rc.a(cursor.getInt(cursor.getColumnIndexOrThrow(this.g)));
                        Long valueOf3 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.c)));
                        Long valueOf4 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.h)));
                        Integer valueOf5 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.o)));
                        String string = cursor.getString(cursor.getColumnIndexOrThrow(this.e));
                        String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.f));
                        Long valueOf6 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.d)));
                        String string3 = cursor.getString(cursor.getColumnIndexOrThrow(this.j));
                        String string4 = cursor.getString(cursor.getColumnIndexOrThrow(this.l));
                        Long valueOf7 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.m)));
                        Integer valueOf8 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.n)));
                        i = cursor.getInt(cursor.getColumnIndexOrThrow(this.p));
                        Q9 q92 = Q9.NONE;
                        if (i != 0) {
                            q92 = Q9.AES_VALUE_ENCRYPTION;
                            if (i != 2) {
                                q92 = Q9.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER;
                                if (i != 1) {
                                    q9 = null;
                                    String string5 = cursor.getString(cursor.getColumnIndexOrThrow(this.q));
                                    i4 = cursor.getInt(cursor.getColumnIndexOrThrow(this.r));
                                    EnumC0458mb enumC0458mb = EnumC0458mb.FIRST_OCCURRENCE;
                                    if (i4 != 1) {
                                        enumC0458mb = EnumC0458mb.NON_FIRST_OCCURENCE;
                                        if (i4 != 2) {
                                            EnumC0458mb enumC0458mb2 = EnumC0458mb.UNKNOWN;
                                            enumC0458mb = enumC0458mb2;
                                        }
                                    }
                                    EnumC0458mb enumC0458mb3 = enumC0458mb;
                                    i3 = cursor.getInt(cursor.getColumnIndexOrThrow(this.s));
                                    EnumC0688ua enumC0688ua2 = EnumC0688ua.NATIVE;
                                    if (i3 != 0) {
                                        enumC0688ua2 = EnumC0688ua.JS;
                                        if (i3 != 1) {
                                            enumC0688ua = null;
                                        }
                                    }
                                    enumC0688ua = enumC0688ua2;
                                }
                            }
                        }
                        q9 = q92;
                        String string52 = cursor.getString(cursor.getColumnIndexOrThrow(this.q));
                        i4 = cursor.getInt(cursor.getColumnIndexOrThrow(this.r));
                        EnumC0458mb enumC0458mb4 = EnumC0458mb.FIRST_OCCURRENCE;
                        if (i4 != 1) {
                        }
                        EnumC0458mb enumC0458mb32 = enumC0458mb4;
                        i3 = cursor.getInt(cursor.getColumnIndexOrThrow(this.s));
                        EnumC0688ua enumC0688ua22 = EnumC0688ua.NATIVE;
                        if (i3 != 0) {
                        }
                        enumC0688ua = enumC0688ua22;
                    }
                }
            } catch (Throwable unused) {
            }
            xn = xn2;
            Long valueOf22 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.b)));
            EnumC0603rc a2 = EnumC0603rc.a(cursor.getInt(cursor.getColumnIndexOrThrow(this.g)));
            Long valueOf32 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.c)));
            Long valueOf42 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.h)));
            Integer valueOf52 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.o)));
            String string6 = cursor.getString(cursor.getColumnIndexOrThrow(this.e));
            String string22 = cursor.getString(cursor.getColumnIndexOrThrow(this.f));
            Long valueOf62 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.d)));
            String string32 = cursor.getString(cursor.getColumnIndexOrThrow(this.j));
            String string42 = cursor.getString(cursor.getColumnIndexOrThrow(this.l));
            Long valueOf72 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.m)));
            Integer valueOf82 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.n)));
            i = cursor.getInt(cursor.getColumnIndexOrThrow(this.p));
            Q9 q922 = Q9.NONE;
            if (i != 0) {
            }
            q9 = q922;
            String string522 = cursor.getString(cursor.getColumnIndexOrThrow(this.q));
            i4 = cursor.getInt(cursor.getColumnIndexOrThrow(this.r));
            EnumC0458mb enumC0458mb42 = EnumC0458mb.FIRST_OCCURRENCE;
            if (i4 != 1) {
            }
            EnumC0458mb enumC0458mb322 = enumC0458mb42;
            i3 = cursor.getInt(cursor.getColumnIndexOrThrow(this.s));
            EnumC0688ua enumC0688ua222 = EnumC0688ua.NATIVE;
            if (i3 != 0) {
            }
            enumC0688ua = enumC0688ua222;
            z = false;
            Boolean valueOf9 = Boolean.valueOf(z);
            try {
                i2 = cursor.getInt(cursor.getColumnIndexOrThrow(this.u));
            } catch (Throwable unused2) {
                i2 = -1;
            }
            Integer valueOf10 = Integer.valueOf(i2);
            int columnIndex = cursor.getColumnIndex(this.v);
            return new X7(valueOf, xn, valueOf22, a2, valueOf32, valueOf42, new W7(valueOf52, string6, string22, valueOf62, null, string32, string42, valueOf72, valueOf82, null, null, q9, string522, enumC0458mb322, enumC0688ua, valueOf9, valueOf10, columnIndex >= 0 ? null : cursor.getBlob(columnIndex)));
            Integer valueOf102 = Integer.valueOf(i2);
            int columnIndex2 = cursor.getColumnIndex(this.v);
            return new X7(valueOf, xn, valueOf22, a2, valueOf32, valueOf42, new W7(valueOf52, string6, string22, valueOf62, null, string32, string42, valueOf72, valueOf82, null, null, q9, string522, enumC0458mb322, enumC0688ua, valueOf9, valueOf102, columnIndex2 >= 0 ? null : cursor.getBlob(columnIndex2)));
        } catch (Throwable unused3) {
            return null;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(@NotNull SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursor;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY,session_id INTEGER,session_type INTEGER,number_in_session INTEGER,type INTEGER,global_number INTEGER,time INTEGER,event_description BLOB )");
        Cursor cursor2 = null;
        try {
            sQLiteDatabase2 = sQLiteDatabase;
            try {
                cursor = sQLiteDatabase2.query(this.w, null, null, null, null, null, null, String.valueOf(this.a));
                while (cursor.moveToNext()) {
                    try {
                        X7 a = a(cursor);
                        if (a != null && a(a)) {
                            try {
                                sQLiteDatabase2.insertOrThrow("events", null, this.x.fromModel(a));
                            } catch (Throwable unused) {
                            }
                        }
                    } catch (Throwable unused2) {
                        cursor2 = cursor;
                        if (cursor2 != null) {
                            cursor = cursor2;
                            cursor.close();
                        }
                        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS " + this.w);
                    }
                }
            } catch (Throwable unused3) {
            }
        } catch (Throwable unused4) {
            sQLiteDatabase2 = sQLiteDatabase;
        }
        cursor.close();
        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS " + this.w);
    }

    public static boolean a(X7 x7) {
        Long l;
        EnumC0603rc enumC0603rc;
        Long l2;
        Long l3;
        Long l4 = x7.a;
        if (l4 == null || l4.longValue() < 10000000000L || x7.b == null || (l = x7.c) == null || l.longValue() < 0 || (enumC0603rc = x7.d) == null || enumC0603rc == EnumC0603rc.EVENT_TYPE_UNDEFINED || (l2 = x7.e) == null || l2.longValue() < 0 || (l3 = x7.f) == null || l3.longValue() < 0) {
            return false;
        }
        Long l5 = x7.g.d;
        if (l5 != null && l5.longValue() < 0) {
            return false;
        }
        Integer num = x7.g.i;
        return num == null || num.intValue() >= 0;
    }
}

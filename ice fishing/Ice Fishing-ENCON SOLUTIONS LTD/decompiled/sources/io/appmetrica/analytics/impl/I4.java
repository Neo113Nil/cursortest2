package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;

/* loaded from: classes.dex */
public final class I4 extends DatabaseScript {

    /* renamed from: a, reason: collision with root package name */
    public final int f4507a = 2000;

    /* renamed from: b, reason: collision with root package name */
    public final String f4508b = "number";

    /* renamed from: c, reason: collision with root package name */
    public final String f4509c = "global_number";

    /* renamed from: d, reason: collision with root package name */
    public final String f4510d = "number_of_type";

    /* renamed from: e, reason: collision with root package name */
    public final String f4511e = "name";

    /* renamed from: f, reason: collision with root package name */
    public final String f4512f = "value";

    /* renamed from: g, reason: collision with root package name */
    public final String f4513g = "type";

    /* renamed from: h, reason: collision with root package name */
    public final String f4514h = "time";

    /* renamed from: i, reason: collision with root package name */
    public final String f4515i = "session_id";

    /* renamed from: j, reason: collision with root package name */
    public final String f4516j = "error_environment";

    /* renamed from: k, reason: collision with root package name */
    public final String f4517k = "session_type";

    /* renamed from: l, reason: collision with root package name */
    public final String f4518l = "app_environment";

    /* renamed from: m, reason: collision with root package name */
    public final String f4519m = "app_environment_revision";

    /* renamed from: n, reason: collision with root package name */
    public final String f4520n = "truncated";

    /* renamed from: o, reason: collision with root package name */
    public final String f4521o = "custom_type";

    /* renamed from: p, reason: collision with root package name */
    public final String f4522p = "encrypting_mode";

    /* renamed from: q, reason: collision with root package name */
    public final String f4523q = "profile_id";

    /* renamed from: r, reason: collision with root package name */
    public final String f4524r = "first_occurrence_status";

    /* renamed from: s, reason: collision with root package name */
    public final String f4525s = AdRevenueConstants.SOURCE_KEY;
    public final String t = "attribution_id_changed";

    /* renamed from: u, reason: collision with root package name */
    public final String f4526u = "open_id";

    /* renamed from: v, reason: collision with root package name */
    public final String f4527v = "extras";

    /* renamed from: w, reason: collision with root package name */
    public final String f4528w = "reports";

    /* renamed from: x, reason: collision with root package name */
    public final C0400f7 f4529x = new C0400f7(null, 1, 0 == true ? 1 : 0);

    public static boolean a(C0374e7 c0374e7) {
        Long l2;
        EnumC0301bb enumC0301bb;
        Long l3;
        Long l4;
        Long l5;
        Integer num;
        Long l6 = c0374e7.f5868a;
        return (l6 == null || l6.longValue() < 10000000000L || c0374e7.f5869b == null || (l2 = c0374e7.f5870c) == null || l2.longValue() < 0 || (enumC0301bb = c0374e7.f5871d) == null || enumC0301bb == EnumC0301bb.EVENT_TYPE_UNDEFINED || (l3 = c0374e7.f5872e) == null || l3.longValue() < 0 || (l4 = c0374e7.f5873f) == null || l4.longValue() < 0 || ((l5 = c0374e7.f5874g.f5791d) != null && l5.longValue() < 0) || ((num = c0374e7.f5874g.f5796i) != null && num.intValue() < 0)) ? false : true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY,session_id INTEGER,session_type INTEGER,number_in_session INTEGER,type INTEGER,global_number INTEGER,time INTEGER,event_description BLOB )");
        Cursor cursor2 = null;
        try {
            cursor = sQLiteDatabase.query(this.f4528w, null, null, null, null, null, null, String.valueOf(this.f4507a));
            while (cursor.moveToNext()) {
                try {
                    C0374e7 a2 = a(cursor);
                    if (a2 != null && a(a2)) {
                        try {
                            sQLiteDatabase.insertOrThrow("events", null, this.f4529x.fromModel(a2));
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable unused2) {
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor = cursor2;
                        cursor.close();
                    }
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + this.f4528w);
                }
            }
        } catch (Throwable unused3) {
        }
        cursor.close();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + this.f4528w);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:2|3|(3:(2:58|(1:60)(15:61|6|(2:51|(1:53)(2:54|(1:56)(12:57|9|10|11|(2:44|(1:46)(8:47|48|14|15|(2:38|(3:40|18|19))|17|18|19))|13|14|15|(0)|17|18|19)))|8|9|10|11|(0)|13|14|15|(0)|17|18|19))|18|19)|5|6|(0)|8|9|10|11|(0)|13|14|15|(0)|17|(3:(0)|(9:21|22|23|24|25|(1:27)(1:33)|28|29|30)|(5:25|(0)(0)|28|29|30))) */
    /* JADX WARN: Can't wrap try/catch for region: R(19:2|3|(2:58|(1:60)(15:61|6|(2:51|(1:53)(2:54|(1:56)(12:57|9|10|11|(2:44|(1:46)(8:47|48|14|15|(2:38|(3:40|18|19))|17|18|19))|13|14|15|(0)|17|18|19)))|8|9|10|11|(0)|13|14|15|(0)|17|18|19))|5|6|(0)|8|9|10|11|(0)|13|14|15|(0)|17|18|19|(3:(0)|(9:21|22|23|24|25|(1:27)(1:33)|28|29|30)|(5:25|(0)(0)|28|29|30))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x012e, code lost:
    
        if (r32.getInt(r32.getColumnIndexOrThrow(r31.t)) == 1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0122, code lost:
    
        r27 = io.appmetrica.analytics.impl.EnumC0583m9.NATIVE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0103, code lost:
    
        r3 = io.appmetrica.analytics.impl.EnumC0352da.UNKNOWN;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0151 A[Catch: all -> 0x016b, TryCatch #4 {all -> 0x016b, blocks: (B:3:0x0005, B:6:0x002a, B:9:0x00e0, B:22:0x0132, B:25:0x0142, B:28:0x0157, B:33:0x0151, B:42:0x0120, B:50:0x0103, B:51:0x00d4, B:54:0x00d9, B:58:0x0024, B:15:0x0107, B:38:0x0118, B:11:0x00ea, B:44:0x00fb, B:47:0x0100), top: B:2:0x0005, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0118 A[Catch: all -> 0x0120, TRY_LEAVE, TryCatch #0 {all -> 0x0120, blocks: (B:15:0x0107, B:38:0x0118), top: B:14:0x0107, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fb A[Catch: all -> 0x0103, TryCatch #3 {all -> 0x0103, blocks: (B:11:0x00ea, B:44:0x00fb, B:47:0x0100), top: B:10:0x00ea, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d4 A[Catch: all -> 0x016b, TryCatch #4 {all -> 0x016b, blocks: (B:3:0x0005, B:6:0x002a, B:9:0x00e0, B:22:0x0132, B:25:0x0142, B:28:0x0157, B:33:0x0151, B:42:0x0120, B:50:0x0103, B:51:0x00d4, B:54:0x00d9, B:58:0x0024, B:15:0x0107, B:38:0x0118, B:11:0x00ea, B:44:0x00fb, B:47:0x0100), top: B:2:0x0005, inners: #0, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0374e7 a(Cursor cursor) {
        Vk vk;
        int i2;
        I8 i8;
        EnumC0352da enumC0352da;
        EnumC0583m9 enumC0583m9;
        int i3;
        int i4;
        int i5;
        try {
            Long valueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f4515i)));
            int i6 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f4517k));
            Vk vk2 = Vk.FOREGROUND;
            boolean z2 = true;
            try {
                if (i6 != 0) {
                    vk2 = Vk.BACKGROUND;
                    if (i6 != 1) {
                        vk = null;
                        Long valueOf2 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f4508b)));
                        EnumC0301bb a2 = EnumC0301bb.a(cursor.getInt(cursor.getColumnIndexOrThrow(this.f4513g)));
                        Long valueOf3 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f4509c)));
                        Long valueOf4 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f4514h)));
                        Integer valueOf5 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f4521o)));
                        String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f4511e));
                        String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.f4512f));
                        Long valueOf6 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f4510d)));
                        String string3 = cursor.getString(cursor.getColumnIndexOrThrow(this.f4516j));
                        String string4 = cursor.getString(cursor.getColumnIndexOrThrow(this.f4518l));
                        Long valueOf7 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f4519m)));
                        Integer valueOf8 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f4520n)));
                        i2 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f4522p));
                        I8 i82 = I8.NONE;
                        if (i2 != 0) {
                            i82 = I8.AES_VALUE_ENCRYPTION;
                            if (i2 != 2) {
                                i82 = I8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER;
                                if (i2 != 1) {
                                    i8 = null;
                                    String string5 = cursor.getString(cursor.getColumnIndexOrThrow(this.f4523q));
                                    i5 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f4524r));
                                    EnumC0352da enumC0352da2 = EnumC0352da.FIRST_OCCURRENCE;
                                    if (i5 != 1) {
                                        enumC0352da2 = EnumC0352da.NON_FIRST_OCCURENCE;
                                        if (i5 != 2) {
                                            EnumC0352da enumC0352da3 = EnumC0352da.UNKNOWN;
                                            enumC0352da = enumC0352da3;
                                            i4 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f4525s));
                                            EnumC0583m9 enumC0583m92 = EnumC0583m9.NATIVE;
                                            if (i4 != 0) {
                                                enumC0583m92 = EnumC0583m9.JS;
                                                if (i4 != 1) {
                                                    enumC0583m9 = null;
                                                }
                                            }
                                            enumC0583m9 = enumC0583m92;
                                        }
                                    }
                                    enumC0352da = enumC0352da2;
                                    i4 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f4525s));
                                    EnumC0583m9 enumC0583m922 = EnumC0583m9.NATIVE;
                                    if (i4 != 0) {
                                    }
                                    enumC0583m9 = enumC0583m922;
                                }
                            }
                        }
                        i8 = i82;
                        String string52 = cursor.getString(cursor.getColumnIndexOrThrow(this.f4523q));
                        i5 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f4524r));
                        EnumC0352da enumC0352da22 = EnumC0352da.FIRST_OCCURRENCE;
                        if (i5 != 1) {
                        }
                        enumC0352da = enumC0352da22;
                        i4 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f4525s));
                        EnumC0583m9 enumC0583m9222 = EnumC0583m9.NATIVE;
                        if (i4 != 0) {
                        }
                        enumC0583m9 = enumC0583m9222;
                    }
                }
            } catch (Throwable unused) {
            }
            vk = vk2;
            Long valueOf22 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f4508b)));
            EnumC0301bb a22 = EnumC0301bb.a(cursor.getInt(cursor.getColumnIndexOrThrow(this.f4513g)));
            Long valueOf32 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f4509c)));
            Long valueOf42 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f4514h)));
            Integer valueOf52 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f4521o)));
            String string6 = cursor.getString(cursor.getColumnIndexOrThrow(this.f4511e));
            String string22 = cursor.getString(cursor.getColumnIndexOrThrow(this.f4512f));
            Long valueOf62 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f4510d)));
            String string32 = cursor.getString(cursor.getColumnIndexOrThrow(this.f4516j));
            String string42 = cursor.getString(cursor.getColumnIndexOrThrow(this.f4518l));
            Long valueOf72 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f4519m)));
            Integer valueOf82 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f4520n)));
            i2 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f4522p));
            I8 i822 = I8.NONE;
            if (i2 != 0) {
            }
            i8 = i822;
            String string522 = cursor.getString(cursor.getColumnIndexOrThrow(this.f4523q));
            i5 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f4524r));
            EnumC0352da enumC0352da222 = EnumC0352da.FIRST_OCCURRENCE;
            if (i5 != 1) {
            }
            enumC0352da = enumC0352da222;
            i4 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f4525s));
            EnumC0583m9 enumC0583m92222 = EnumC0583m9.NATIVE;
            if (i4 != 0) {
            }
            enumC0583m9 = enumC0583m92222;
            z2 = false;
            Boolean valueOf9 = Boolean.valueOf(z2);
            try {
                i3 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f4526u));
            } catch (Throwable unused2) {
                i3 = -1;
            }
            Integer valueOf10 = Integer.valueOf(i3);
            int columnIndex = cursor.getColumnIndex(this.f4527v);
            return new C0374e7(valueOf, vk, valueOf22, a22, valueOf32, valueOf42, new C0349d7(valueOf52, string6, string22, valueOf62, null, string32, string42, valueOf72, valueOf82, null, null, i8, string522, enumC0352da, enumC0583m9, valueOf9, valueOf10, columnIndex >= 0 ? null : cursor.getBlob(columnIndex)));
            Integer valueOf102 = Integer.valueOf(i3);
            int columnIndex2 = cursor.getColumnIndex(this.f4527v);
            return new C0374e7(valueOf, vk, valueOf22, a22, valueOf32, valueOf42, new C0349d7(valueOf52, string6, string22, valueOf62, null, string32, string42, valueOf72, valueOf82, null, null, i8, string522, enumC0352da, enumC0583m9, valueOf9, valueOf102, columnIndex2 >= 0 ? null : cursor.getBlob(columnIndex2)));
        } catch (Throwable unused3) {
            return null;
        }
    }
}

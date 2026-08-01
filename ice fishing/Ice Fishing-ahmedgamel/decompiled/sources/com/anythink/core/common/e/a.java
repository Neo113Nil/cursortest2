package com.anythink.core.common.e;

import android.content.ContentValues;
import android.database.Cursor;
import android.provider.BaseColumns;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: classes.dex */
public class a extends c<com.anythink.core.common.h.f> {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12885a = "1";

    /* renamed from: b, reason: collision with root package name */
    public static final String f12886b = "2";

    /* renamed from: c, reason: collision with root package name */
    public static final String f12887c = "3";

    /* renamed from: d, reason: collision with root package name */
    public static final String f12888d = "4";

    /* renamed from: g, reason: collision with root package name */
    private static volatile a f12889g;

    /* renamed from: f, reason: collision with root package name */
    private final String f12890f;

    /* renamed from: com.anythink.core.common.e.a$a, reason: collision with other inner class name */
    public static class C0077a implements BaseColumns {

        /* renamed from: a, reason: collision with root package name */
        public static final String f12903a = "ad_frequency";

        /* renamed from: b, reason: collision with root package name */
        public static final String f12904b = "event_type";

        /* renamed from: c, reason: collision with root package name */
        public static final String f12905c = "app";

        /* renamed from: d, reason: collision with root package name */
        public static final String f12906d = "format";

        /* renamed from: e, reason: collision with root package name */
        public static final String f12907e = "network_id";

        /* renamed from: f, reason: collision with root package name */
        public static final String f12908f = "network_format";

        /* renamed from: g, reason: collision with root package name */
        public static final String f12909g = "placement_id";

        /* renamed from: h, reason: collision with root package name */
        public static final String f12910h = "source_id";
        public static final String i = "extra";

        /* renamed from: j, reason: collision with root package name */
        public static final String f12911j = "month";

        /* renamed from: k, reason: collision with root package name */
        public static final String f12912k = "day";

        /* renamed from: l, reason: collision with root package name */
        public static final String f12913l = "hour";

        /* renamed from: m, reason: collision with root package name */
        public static final String f12914m = "time_stamp";

        /* renamed from: n, reason: collision with root package name */
        public static final String f12915n = "req_num";

        /* renamed from: o, reason: collision with root package name */
        public static final String f12916o = "rule_id";

        /* renamed from: p, reason: collision with root package name */
        public static final String f12917p = "fail_count";

        /* renamed from: q, reason: collision with root package name */
        public static final String f12918q = "next_req_timestamp";

        /* renamed from: r, reason: collision with root package name */
        public static final String f12919r = "CREATE TABLE IF NOT EXISTS ad_frequency(_id INTEGER PRIMARY KEY AUTOINCREMENT ,event_type TEXT ,app TEXT ,network_id TEXT ,format TEXT ,network_format TEXT ,placement_id TEXT ,source_id TEXT ,extra TEXT ,month INTEGER ,day INTEGER ,hour INTEGER , req_num INTEGER , time_stamp INTEGER)";

        /* renamed from: s, reason: collision with root package name */
        public static final String f12920s = "ALTER TABLE ad_frequency ADD COLUMN rule_id INTEGER;";

        /* renamed from: t, reason: collision with root package name */
        public static final String f12921t = "ALTER TABLE ad_frequency ADD COLUMN fail_count INTEGER;";

        /* renamed from: u, reason: collision with root package name */
        public static final String f12922u = "ALTER TABLE ad_frequency ADD COLUMN next_req_timestamp INTEGER;";
    }

    private a(d dVar) {
        super(dVar);
        this.f12890f = "AdFrequencyDao";
    }

    public static a a(d dVar) {
        if (f12889g == null) {
            synchronized (a.class) {
                try {
                    if (f12889g == null) {
                        f12889g = new a(dVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12889g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r4 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.anythink.core.common.h.f c(String str, String str2) {
        com.anythink.core.common.h.f fVar;
        Cursor cursor;
        synchronized (this) {
            try {
                cursor = c().rawQuery(String.format("select * from ad_frequency where event_type = '2' and %s = '" + str + "' order by time_stamp DESC limit 1", str2), null);
            } catch (Throwable th) {
                th = th;
                cursor = null;
            }
            try {
                List<com.anythink.core.common.h.f> a9 = a(cursor);
                fVar = a9.isEmpty() ? null : a9.get(0);
            } catch (Throwable th2) {
                th = th2;
                try {
                    th.printStackTrace();
                } finally {
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            }
        }
        return fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007b A[Catch: all -> 0x006a, TRY_ENTER, TryCatch #3 {, blocks: (B:16:0x0066, B:17:0x007f, B:26:0x007b, B:32:0x0085, B:33:0x0088, B:24:0x0076), top: B:4:0x0004, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.anythink.core.common.h.f d(String str, String str2) {
        Throwable th;
        com.anythink.core.common.h.f fVar;
        com.anythink.core.common.h.f fVar2;
        synchronized (this) {
            Cursor cursor = null;
            fVar2 = null;
            try {
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                Cursor query = c().query(C0077a.f12903a, null, "event_type = ? and " + str2 + " = ?", new String[]{"1", str}, null, null, null, "1");
                while (query.moveToNext()) {
                    try {
                        String str3 = str2;
                        fVar2 = new com.anythink.core.common.h.f(query.getString(query.getColumnIndex(C0077a.f12904b)), query.getString(query.getColumnIndex(str2)), str3, query.getLong(query.getColumnIndex(C0077a.f12914m)), query.getInt(query.getColumnIndex(C0077a.f12915n)));
                        str2 = str3;
                    } catch (Throwable th3) {
                        th = th3;
                        com.anythink.core.common.h.f fVar3 = fVar2;
                        cursor = query;
                        fVar = fVar3;
                        try {
                            th.printStackTrace();
                            if (cursor != null) {
                                cursor.close();
                            }
                            fVar2 = fVar;
                            return fVar2;
                        } finally {
                        }
                    }
                }
                query.close();
            } catch (Throwable th4) {
                th = th4;
                fVar = null;
                th.printStackTrace();
                if (cursor != null) {
                }
                fVar2 = fVar;
                return fVar2;
            }
        }
        return fVar2;
    }

    public final void e(String str, String str2) {
        synchronized (this) {
            try {
            } finally {
            }
            if (d() == null) {
                return;
            }
            d().delete(C0077a.f12903a, "event_type = ? and month != ? or day != ?", new String[]{"2", str, str2});
        }
    }

    public final void b(com.anythink.core.common.h.f fVar) {
        synchronized (this) {
            try {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(C0077a.f12904b, "2");
                    contentValues.put("app", fVar.j());
                    contentValues.put("placement_id", fVar.d());
                    contentValues.put("network_id", fVar.b());
                    contentValues.put("format", fVar.c());
                    contentValues.put(C0077a.f12908f, fVar.k());
                    contentValues.put(C0077a.f12910h, fVar.e());
                    contentValues.put(C0077a.f12911j, Integer.valueOf(fVar.f()));
                    contentValues.put(C0077a.f12912k, Integer.valueOf(fVar.g()));
                    contentValues.put(C0077a.f12913l, Integer.valueOf(fVar.h()));
                    contentValues.put(C0077a.f12914m, Long.valueOf(fVar.i()));
                    d().insert(C0077a.f12903a, null, contentValues);
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(final com.anythink.core.common.h.f fVar) {
        try {
            com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.e.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.b(fVar);
                }
            }, 2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r13 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        r13.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (r13 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<com.anythink.core.common.h.f> a(String str, String str2) {
        List<com.anythink.core.common.h.f> list;
        Throwable th;
        Cursor cursor;
        synchronized (this) {
            Date date = new Date();
            list = null;
            try {
                try {
                    cursor = c().query(C0077a.f12903a, null, "event_type = ? and " + str2 + " = ? and month = ? and day = ?", new String[]{"2", str, com.anythink.core.a.b.a(date), com.anythink.core.a.b.b(date)}, null, null, null);
                    try {
                        list = a(cursor);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            th.printStackTrace();
                        } finally {
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor = null;
                    th.printStackTrace();
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        return list;
    }

    public final void c(String str, String str2, int i, long j6) {
        char c9;
        synchronized (this) {
            try {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(C0077a.f12904b, "1");
                    contentValues.put(C0077a.f12915n, Integer.valueOf(i));
                    contentValues.put(C0077a.f12914m, Long.valueOf(j6));
                    switch (str2.hashCode()) {
                        case -1928631512:
                            if (str2.equals(C0077a.f12908f)) {
                                c9 = 3;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1698410561:
                            if (str2.equals(C0077a.f12910h)) {
                                c9 = 5;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -1268779017:
                            if (str2.equals("format")) {
                                c9 = 1;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case -478232372:
                            if (str2.equals("network_id")) {
                                c9 = 2;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 96801:
                            if (str2.equals("app")) {
                                c9 = 0;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 1224358069:
                            if (str2.equals("placement_id")) {
                                c9 = 4;
                                break;
                            }
                            c9 = 65535;
                            break;
                        default:
                            c9 = 65535;
                            break;
                    }
                    if (c9 == 0) {
                        contentValues.put("app", str);
                    } else if (c9 == 1) {
                        contentValues.put("format", str);
                    } else if (c9 == 2) {
                        contentValues.put("network_id", str);
                    } else if (c9 == 3) {
                        contentValues.put(C0077a.f12908f, str);
                    } else if (c9 == 4) {
                        contentValues.put("placement_id", str);
                    } else if (c9 == 5) {
                        contentValues.put(C0077a.f12910h, str);
                    }
                    d().insert(C0077a.f12903a, null, contentValues);
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void d(com.anythink.core.common.h.f fVar) {
        synchronized (this) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(C0077a.f12914m, Long.valueOf(fVar.i()));
                contentValues.put(C0077a.f12918q, Long.valueOf(fVar.n()));
                contentValues.put(C0077a.f12917p, Integer.valueOf(fVar.m()));
                contentValues.put(C0077a.f12915n, Integer.valueOf(fVar.f13944a));
                if (d().update(C0077a.f12903a, contentValues, "event_type = ? and source_id = ? and rule_id = ?", new String[]{fVar.a(), fVar.e(), String.valueOf(fVar.l())}) < 0) {
                    fVar.e();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        if (r13 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        r13.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        if (r13 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<com.anythink.core.common.h.f> b(String str, String str2) {
        List<com.anythink.core.common.h.f> list;
        Throwable th;
        Cursor cursor;
        synchronized (this) {
            Date date = new Date();
            list = null;
            try {
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                cursor = c().query(C0077a.f12903a, null, "event_type = ? and " + str2 + " = ? and month = ? and day = ? and hour = ?", new String[]{"2", str, com.anythink.core.a.b.a(date), com.anythink.core.a.b.b(date), com.anythink.core.a.b.c(date)}, null, null, null);
                try {
                    list = a(cursor);
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        th.printStackTrace();
                    } finally {
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                cursor = null;
                th.printStackTrace();
            }
        }
        return list;
    }

    private static List<com.anythink.core.common.h.f> a(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        if (cursor != null) {
            while (cursor.moveToNext()) {
                try {
                    arrayList.add(new com.anythink.core.common.h.f(cursor.getString(cursor.getColumnIndex(C0077a.f12904b)), cursor.getString(cursor.getColumnIndex("app")), cursor.getString(cursor.getColumnIndex("network_id")), cursor.getString(cursor.getColumnIndex("format")), cursor.getString(cursor.getColumnIndex(C0077a.f12908f)), cursor.getString(cursor.getColumnIndex("placement_id")), cursor.getString(cursor.getColumnIndex(C0077a.f12910h)), cursor.getInt(cursor.getColumnIndex(C0077a.f12911j)), cursor.getInt(cursor.getColumnIndex(C0077a.f12912k)), cursor.getInt(cursor.getColumnIndex(C0077a.f12913l)), cursor.getLong(cursor.getColumnIndex(C0077a.f12914m))));
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    private void c(com.anythink.core.common.h.f fVar) {
        synchronized (this) {
            try {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(C0077a.f12904b, fVar.a());
                    contentValues.put(C0077a.f12916o, Integer.valueOf(fVar.l()));
                    contentValues.put(C0077a.f12910h, fVar.e());
                    contentValues.put(C0077a.f12914m, Long.valueOf(fVar.i()));
                    contentValues.put(C0077a.f12918q, Long.valueOf(fVar.n()));
                    contentValues.put(C0077a.f12917p, Integer.valueOf(fVar.m()));
                    contentValues.put(C0077a.f12915n, Integer.valueOf(fVar.f13944a));
                    if (d().insert(C0077a.f12903a, null, contentValues) < 0) {
                        fVar.e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Throwable unused) {
                fVar.e();
            }
        }
    }

    public final void b(final String str, final String str2, final int i, final long j6) {
        try {
            com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.e.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (a.this.d(str, str2) != null) {
                        a.this.a(str, str2, i, j6);
                    } else {
                        a.this.c(str, str2, i, j6);
                    }
                }
            }, 2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static /* synthetic */ void b(a aVar, com.anythink.core.common.h.f fVar) {
        synchronized (aVar) {
            try {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(C0077a.f12904b, fVar.a());
                    contentValues.put(C0077a.f12916o, Integer.valueOf(fVar.l()));
                    contentValues.put(C0077a.f12910h, fVar.e());
                    contentValues.put(C0077a.f12914m, Long.valueOf(fVar.i()));
                    contentValues.put(C0077a.f12918q, Long.valueOf(fVar.n()));
                    contentValues.put(C0077a.f12917p, Integer.valueOf(fVar.m()));
                    contentValues.put(C0077a.f12915n, Integer.valueOf(fVar.f13944a));
                    if (aVar.d().insert(C0077a.f12903a, null, contentValues) < 0) {
                        fVar.e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Throwable unused) {
                fVar.e();
            }
        }
    }

    public final void a(String str, String str2, int i, long j6) {
        synchronized (this) {
            try {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(C0077a.f12915n, Integer.valueOf(i));
                    contentValues.put(C0077a.f12914m, Long.valueOf(j6));
                    d().update(C0077a.f12903a, contentValues, "event_type = ? and " + str2 + " = ?", new String[]{"1", str});
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Pair<String, String[]> c(List<Pair<String, String>> list) {
        String[] strArr;
        StringBuilder sb = new StringBuilder();
        if (list == null || list.isEmpty()) {
            strArr = null;
        } else {
            strArr = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                Pair<String, String> pair = list.get(i);
                sb.append((String) pair.first);
                if (i != list.size() - 1) {
                    sb.append(" and ");
                }
                strArr[i] = (String) pair.second;
            }
        }
        return new Pair<>(sb.toString(), strArr);
    }

    public final void a(final com.anythink.core.common.h.f fVar, final boolean z3) {
        if (fVar == null) {
            return;
        }
        try {
            com.anythink.core.common.v.b.b.a().c(new Runnable() { // from class: com.anythink.core.common.e.a.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (z3) {
                        a.a(a.this, fVar);
                    } else {
                        a.b(a.this, fVar);
                    }
                }
            }, 13);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a7, code lost:
    
        if (r12 == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<com.anythink.core.common.h.f> a(List<Pair<String, String>> list, int i) {
        Cursor cursor;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Pair<String, String[]> c9 = c(list);
                cursor = i > 0 ? c().query(C0077a.f12903a, null, (String) c9.first, (String[]) c9.second, null, null, "time_stamp DESC", String.valueOf(i)) : c().query(C0077a.f12903a, null, (String) c9.first, (String[]) c9.second, null, null, "time_stamp DESC", null);
                while (cursor.moveToNext()) {
                    try {
                        String string = cursor.getString(cursor.getColumnIndex(C0077a.f12904b));
                        long j6 = cursor.getLong(cursor.getColumnIndex(C0077a.f12914m));
                        int i6 = cursor.getInt(cursor.getColumnIndex(C0077a.f12915n));
                        String string2 = cursor.getString(cursor.getColumnIndex(C0077a.f12910h));
                        int i9 = cursor.getInt(cursor.getColumnIndex(C0077a.f12916o));
                        int i10 = cursor.getInt(cursor.getColumnIndex(C0077a.f12917p));
                        long j9 = cursor.getLong(cursor.getColumnIndex(C0077a.f12918q));
                        com.anythink.core.common.h.f fVar = new com.anythink.core.common.h.f(string, string2, C0077a.f12910h, j6, i6);
                        fVar.a(i9);
                        fVar.b(i10);
                        fVar.b(j9);
                        arrayList.add(fVar);
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable unused2) {
                cursor = null;
            }
            try {
                cursor.close();
            } catch (Throwable unused3) {
            }
        }
        return arrayList;
    }

    public final void a(final List<Pair<String, String>> list) {
        com.anythink.core.common.v.b.b.a().c(new Runnable() { // from class: com.anythink.core.common.e.a.4
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (this) {
                    try {
                        Pair c9 = a.c((List<Pair<String, String>>) list);
                        a.this.d().delete(C0077a.f12903a, (String) c9.first, (String[]) c9.second);
                    } catch (Throwable unused) {
                    }
                }
            }
        }, 13);
    }

    public static /* synthetic */ void a(a aVar, com.anythink.core.common.h.f fVar) {
        synchronized (aVar) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(C0077a.f12914m, Long.valueOf(fVar.i()));
                contentValues.put(C0077a.f12918q, Long.valueOf(fVar.n()));
                contentValues.put(C0077a.f12917p, Integer.valueOf(fVar.m()));
                contentValues.put(C0077a.f12915n, Integer.valueOf(fVar.f13944a));
                if (aVar.d().update(C0077a.f12903a, contentValues, "event_type = ? and source_id = ? and rule_id = ?", new String[]{fVar.a(), fVar.e(), String.valueOf(fVar.l())}) < 0) {
                    fVar.e();
                }
            } catch (Throwable unused) {
            }
        }
    }
}

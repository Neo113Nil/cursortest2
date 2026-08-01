package com.anythink.core.common.e;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.ad;
import com.anythink.core.common.h.af;
import com.anythink.core.common.h.bg;

/* loaded from: classes.dex */
public class o extends c<com.anythink.core.common.a.m> {

    /* renamed from: b, reason: collision with root package name */
    private static volatile o f13063b;

    /* renamed from: a, reason: collision with root package name */
    private final String f13064a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f13065a = "offer_data_cache";

        /* renamed from: b, reason: collision with root package name */
        public static final String f13066b = "placement_id";

        /* renamed from: c, reason: collision with root package name */
        public static final String f13067c = "bid_id";

        /* renamed from: d, reason: collision with root package name */
        public static final String f13068d = "adsource_id";

        /* renamed from: e, reason: collision with root package name */
        public static final String f13069e = "network_firm_id";

        /* renamed from: f, reason: collision with root package name */
        public static final String f13070f = "bid_result";

        /* renamed from: g, reason: collision with root package name */
        public static final String f13071g = "offer_data";

        /* renamed from: h, reason: collision with root package name */
        public static final String f13072h = "out_date_timestamp";
        public static final String i = "vast_parse_result";

        /* renamed from: j, reason: collision with root package name */
        public static final String f13073j = "CREATE TABLE IF NOT EXISTS offer_data_cache(placement_id TEXT ,bid_id TEXT ,adsource_id TEXT ,network_firm_id INTEGER ,bid_result TEXT ,offer_data TEXT ,out_date_timestamp INTEGER ,vast_parse_result TEXT)";
    }

    private o(d dVar) {
        super(dVar);
        this.f13064a = o.class.getName();
    }

    public static o a(d dVar) {
        if (f13063b == null) {
            synchronized (o.class) {
                try {
                    if (f13063b == null) {
                        f13063b = new o(dVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13063b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        if (r9 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized boolean e(String str) {
        Cursor cursor;
        try {
            cursor = c().query(a.f13065a, new String[]{"offer_data"}, "bid_id=?", new String[]{str}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.getCount() > 0) {
                        cursor.close();
                        cursor.close();
                        return true;
                    }
                } catch (Throwable unused) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return false;
                }
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
    }

    public final synchronized af b(String str) {
        af afVar;
        Cursor cursor;
        afVar = new af();
        try {
            cursor = c().query(a.f13065a, new String[]{"placement_id", "adsource_id", a.f13070f}, "out_date_timestamp>? AND placement_id=?", new String[]{String.valueOf(System.currentTimeMillis()), str}, null, null, null);
            while (cursor.moveToNext()) {
                try {
                    String string = cursor.getString(cursor.getColumnIndex("adsource_id"));
                    ad a9 = ad.a(cursor.getString(cursor.getColumnIndex(a.f13070f)));
                    if (a9 != null) {
                        afVar.a(string, a9);
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Throwable unused3) {
            }
        }
        return afVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0042, code lost:
    
        if (r10 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized bg c(String str) {
        Cursor cursor;
        try {
            cursor = c().query(a.f13065a, new String[]{"offer_data", a.f13072h}, "bid_id=?", new String[]{str}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.getCount() > 0) {
                        cursor.moveToNext();
                        bg bgVar = new bg(cursor.getString(0), cursor.getLong(1));
                        cursor.close();
                        cursor.close();
                        return bgVar;
                    }
                } catch (Throwable unused) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0039, code lost:
    
        if (r10 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized String d(String str) {
        Cursor cursor;
        try {
            cursor = c().query(a.f13065a, new String[]{a.i}, "bid_id=?", new String[]{str}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.getCount() > 0) {
                        cursor.moveToNext();
                        String string = cursor.getString(0);
                        cursor.close();
                        string.length();
                        cursor.close();
                        return string;
                    }
                } catch (Throwable unused) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
    }

    public final synchronized void a(String str) {
        try {
            d().delete(a.f13065a, "bid_id = ? ", new String[]{str});
        } catch (Throwable th) {
            com.anythink.core.common.u.e.b("Error_SQL_DELETE", th.getMessage(), t.b().r());
        }
    }

    public final synchronized long a(String str, ad adVar) {
        try {
            if (d() == null || adVar == null) {
                return -1L;
            }
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("placement_id", str);
                contentValues.put("adsource_id", adVar.f13428k);
                contentValues.put("network_firm_id", Integer.valueOf(adVar.f13422d));
                contentValues.put(a.f13067c, adVar.token);
                contentValues.put(a.f13070f, adVar.b());
                contentValues.put(a.f13072h, Long.valueOf(adVar.f13424f));
                if (!TextUtils.isEmpty(adVar.i)) {
                    contentValues.put("offer_data", adVar.i);
                }
                if (e(adVar.token)) {
                    return d().update(a.f13065a, contentValues, "bid_id = ? ", new String[]{adVar.token});
                }
                return d().insert(a.f13065a, null, contentValues);
            } catch (Exception unused) {
                return -1L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized int a(ad adVar) {
        if (e(adVar.token)) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(a.f13070f, adVar.b());
                return d().update(a.f13065a, contentValues, "bid_id = ? ", new String[]{adVar.token});
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    public final synchronized long a(String str, String str2, String str3) {
        if (d() == null) {
            return -1L;
        }
        try {
            new ContentValues().put("offer_data", str3);
            if (!e(str2)) {
                return -1L;
            }
            return d().update(a.f13065a, r5, "bid_id = ? ", new String[]{str2});
        } catch (Exception unused) {
            return -1L;
        }
    }

    public final synchronized long a(String str, String str2) {
        if (d() == null) {
            return -1L;
        }
        try {
            new ContentValues().put(a.i, str2);
            if (e(str)) {
                str2.length();
                return d().update(a.f13065a, r0, "bid_id = ? ", new String[]{str});
            }
            str2.length();
            return -1L;
        } catch (Exception unused) {
            return -1L;
        }
    }
}

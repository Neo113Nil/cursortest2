package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

/* renamed from: com.google.android.gms.internal.ads.Vp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2834Vp extends AbstractC3337hx {

    /* renamed from: n, reason: collision with root package name */
    public final Context f28309n;

    /* renamed from: u, reason: collision with root package name */
    public final C3157eg f28310u;

    public C2834Vp(Context context, C3157eg c3157eg) {
        super(context, "AdMobOfflineBufferedPings.db", ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.A9)).intValue());
        this.f28309n = context;
        this.f28310u = c3157eg;
    }

    public static void i(SQLiteDatabase sQLiteDatabase, u2.l lVar) {
        SQLiteDatabase sQLiteDatabase2;
        String sb;
        sQLiteDatabase.beginTransaction();
        try {
            String[] strArr = {com.anythink.expressad.foundation.d.d.f18754u, "url"};
            StringBuilder sb2 = new StringBuilder(15);
            sb2.append("event_state = 1");
            String sb3 = sb2.toString();
            sQLiteDatabase2 = sQLiteDatabase;
            try {
                Cursor query = sQLiteDatabase2.query("offline_buffered_pings", strArr, sb3, null, null, null, "timestamp ASC", null);
                int count = query.getCount();
                String[] strArr2 = new String[count];
                int i = 0;
                while (query.moveToNext()) {
                    int columnIndex = query.getColumnIndex(com.anythink.expressad.foundation.d.d.f18754u);
                    int columnIndex2 = query.getColumnIndex("url");
                    if (columnIndex2 != -1) {
                        long j9 = query.getLong(columnIndex);
                        String string = query.getString(columnIndex2);
                        if (string == null) {
                            sb = "";
                        } else {
                            Uri parse = Uri.parse(string);
                            p2.j.f39798C.f39810k.getClass();
                            long currentTimeMillis = System.currentTimeMillis() - j9;
                            String encodedQuery = parse.getEncodedQuery();
                            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                            clearQuery.appendQueryParameter(com.anythink.expressad.foundation.g.a.f19226P, Long.toString(currentTimeMillis));
                            String valueOf = String.valueOf(clearQuery.build());
                            StringBuilder sb4 = new StringBuilder(valueOf.length() + 1 + String.valueOf(encodedQuery).length());
                            sb4.append(valueOf);
                            sb4.append("&");
                            sb4.append(encodedQuery);
                            sb = sb4.toString();
                        }
                        strArr2[i] = sb;
                    }
                    i++;
                }
                query.close();
                sQLiteDatabase2.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
                sQLiteDatabase2.setTransactionSuccessful();
                sQLiteDatabase2.endTransaction();
                for (int i4 = 0; i4 < count; i4++) {
                    lVar.a(null, strArr2[i4]);
                }
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                sQLiteDatabase2.endTransaction();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase2 = sQLiteDatabase;
        }
    }

    public final void a(Gu gu) {
        CallableC3454k7 callableC3454k7 = new CallableC3454k7(6, this);
        C3157eg c3157eg = this.f28310u;
        J3.a b9 = c3157eg.b(callableC3454k7);
        b9.c(new MD(0, b9, new C3562m7(this, gu)), c3157eg);
    }

    public final void g(String str) {
        a(new LE(str, 7));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i4) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i4) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.Tp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2821Tp extends AbstractC3347hx {

    /* renamed from: n, reason: collision with root package name */
    public final Context f28593n;

    /* renamed from: u, reason: collision with root package name */
    public final C3383ig f28594u;

    public C2821Tp(Context context, C3383ig c3383ig) {
        super(context, "AdMobOfflineBufferedPings.db", ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.A9)).intValue());
        this.f28593n = context;
        this.f28594u = c3383ig;
    }

    public static void j(SQLiteDatabase sQLiteDatabase, x2.l lVar) {
        SQLiteDatabase sQLiteDatabase2;
        String sb;
        sQLiteDatabase.beginTransaction();
        try {
            String[] strArr = {com.anythink.expressad.foundation.d.d.f19383u, "url"};
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
                    int columnIndex = query.getColumnIndex(com.anythink.expressad.foundation.d.d.f19383u);
                    int columnIndex2 = query.getColumnIndex("url");
                    if (columnIndex2 != -1) {
                        long j6 = query.getLong(columnIndex);
                        String string = query.getString(columnIndex2);
                        if (string == null) {
                            sb = "";
                        } else {
                            Uri parse = Uri.parse(string);
                            C4906k.f40186C.f40198k.getClass();
                            long currentTimeMillis = System.currentTimeMillis() - j6;
                            String encodedQuery = parse.getEncodedQuery();
                            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                            clearQuery.appendQueryParameter(com.anythink.expressad.foundation.g.a.f19855P, Long.toString(currentTimeMillis));
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

    public final void a(Eu eu) {
        CallableC3572m7 callableC3572m7 = new CallableC3572m7(6, this);
        C3383ig c3383ig = this.f28594u;
        P3.a b9 = c3383ig.b(callableC3572m7);
        b9.a(new LD(0, b9, new C3680o7(this, eu)), c3383ig);
    }

    public final void i(String str) {
        a(new FE(str, 8));
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

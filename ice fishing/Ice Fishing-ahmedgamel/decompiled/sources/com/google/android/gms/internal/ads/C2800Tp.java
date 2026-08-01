package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.Tp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2800Tp extends AbstractC3324hx {

    /* renamed from: n, reason: collision with root package name */
    public final Context f27796n;

    /* renamed from: u, reason: collision with root package name */
    public final C3360ig f27797u;

    public C2800Tp(Context context, C3360ig c3360ig) {
        super(context, "AdMobOfflineBufferedPings.db", ((Integer) q2.r.f40207e.f40210c.a(AbstractC3569ma.A9)).intValue());
        this.f27796n = context;
        this.f27797u = c3360ig;
    }

    public static void j(SQLiteDatabase sQLiteDatabase, v2.l lVar) {
        SQLiteDatabase sQLiteDatabase2;
        String sb;
        sQLiteDatabase.beginTransaction();
        try {
            String[] strArr = {com.anythink.expressad.foundation.d.d.f18596u, "url"};
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
                    int columnIndex = query.getColumnIndex(com.anythink.expressad.foundation.d.d.f18596u);
                    int columnIndex2 = query.getColumnIndex("url");
                    if (columnIndex2 != -1) {
                        long j6 = query.getLong(columnIndex);
                        String string = query.getString(columnIndex2);
                        if (string == null) {
                            sb = "";
                        } else {
                            Uri parse = Uri.parse(string);
                            C4835j.f39733C.f39745k.getClass();
                            long currentTimeMillis = System.currentTimeMillis() - j6;
                            String encodedQuery = parse.getEncodedQuery();
                            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                            clearQuery.appendQueryParameter(com.anythink.expressad.foundation.g.a.f19068P, Long.toString(currentTimeMillis));
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
                for (int i6 = 0; i6 < count; i6++) {
                    lVar.a(null, strArr2[i6]);
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
        CallableC3549m7 callableC3549m7 = new CallableC3549m7(6, this);
        C3360ig c3360ig = this.f27797u;
        N3.a b9 = c3360ig.b(callableC3549m7);
        b9.a(new LD(0, b9, new C3657o7(this, eu)), c3360ig);
    }

    public final void i(String str) {
        a(new FE(str, 8));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i6) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i6) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }
}

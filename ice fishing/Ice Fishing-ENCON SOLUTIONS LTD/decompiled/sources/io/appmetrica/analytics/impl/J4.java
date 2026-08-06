package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class J4 extends DatabaseScript {

    /* renamed from: a, reason: collision with root package name */
    public final String f4569a = "sessions";

    /* renamed from: b, reason: collision with root package name */
    public final int f4570b = 200;

    /* renamed from: c, reason: collision with root package name */
    public final String f4571c = "id";

    /* renamed from: d, reason: collision with root package name */
    public final String f4572d = "start_time";

    /* renamed from: e, reason: collision with root package name */
    public final String f4573e = "report_request_parameters";

    /* renamed from: f, reason: collision with root package name */
    public final String f4574f = "server_time_offset";

    /* renamed from: g, reason: collision with root package name */
    public final String f4575g = "type";

    /* renamed from: h, reason: collision with root package name */
    public final String f4576h = "obtained_before_first_sync";

    /* renamed from: i, reason: collision with root package name */
    public final C0762t7 f4577i = new C0762t7(null, 1, 0 == true ? 1 : 0);

    public final C0736s7 a(Cursor cursor) {
        try {
            Long valueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f4571c)));
            int i2 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f4575g));
            Vk vk = Vk.FOREGROUND;
            boolean z2 = true;
            if (i2 != 0) {
                vk = Vk.BACKGROUND;
                if (i2 != 1) {
                    vk = null;
                }
            }
            String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f4573e));
            Long valueOf2 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f4572d)));
            Long valueOf3 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f4574f)));
            if (cursor.getInt(cursor.getColumnIndexOrThrow(this.f4576h)) != 1) {
                z2 = false;
            }
            return new C0736s7(valueOf, vk, string, new C0710r7(valueOf2, valueOf3, Boolean.valueOf(z2)));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x005b, code lost:
    
        if (r2 == null) goto L28;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void runScript(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor;
        Long l2;
        String str;
        Long l3;
        ArrayList arrayList = new ArrayList();
        try {
            cursor = sQLiteDatabase.query(this.f4569a, null, null, null, null, null, null, String.valueOf(this.f4570b));
            while (cursor.moveToNext()) {
                try {
                    C0736s7 a2 = a(cursor);
                    if (a2 != null && (l2 = a2.f6883a) != null && l2.longValue() >= 0 && a2.f6884b != null && (str = a2.f6885c) != null && str.length() != 0 && (l3 = a2.f6886d.f6812a) != null && l3.longValue() > 0) {
                        arrayList.add(this.f4577i.fromModel(a2));
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        cursor.close();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + this.f4569a);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS sessions (id INTEGER,type INTEGER,report_request_parameters TEXT,session_description BLOB )");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                sQLiteDatabase.insertOrThrow("sessions", null, (ContentValues) it.next());
            } catch (Throwable unused3) {
            }
        }
    }
}

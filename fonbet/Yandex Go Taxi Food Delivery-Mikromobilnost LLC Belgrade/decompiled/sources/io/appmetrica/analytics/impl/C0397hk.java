package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreutils.internal.db.DBUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* renamed from: io.appmetrica.analytics.impl.hk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0397hk {
    public final I7 a;
    public final C0574no b;
    public final as c;

    public C0397hk(S5 s5) {
        this.a = s5.j();
        this.b = s5.t();
        this.c = s5.v();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List a(LinkedHashMap linkedHashMap) {
        Cursor cursor;
        SQLiteDatabase readableDatabase;
        I7 i7 = this.a;
        i7.a.lock();
        try {
            readableDatabase = i7.c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            String a = I7.a(linkedHashMap);
            ArrayList arrayList = new ArrayList(Arrays.asList(Long.toString(0L)));
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add((String) ((Map.Entry) it.next()).getValue());
            }
            cursor = readableDatabase.query("sessions", null, a, (String[]) arrayList.toArray(new String[0]), null, null, "id ASC", null);
            i7.a.unlock();
            if (cursor != null) {
                return EmptyList.a;
            }
            ArrayList arrayList2 = new ArrayList();
            while (cursor.moveToNext()) {
                try {
                    try {
                        ContentValues contentValues = new ContentValues();
                        DBUtils.cursorRowToContentValues(cursor, contentValues);
                        arrayList2.add(new C0645q8(null, 1, null).toModel(contentValues));
                    } finally {
                    }
                } catch (Throwable unused2) {
                }
            }
            cursor.close();
            return arrayList2;
        }
        cursor = null;
        i7.a.unlock();
        if (cursor != null) {
        }
    }

    public final int a() {
        int optInt;
        as asVar = this.c;
        synchronized (asVar) {
            optInt = asVar.a.a().optInt("report_request_id", -1);
        }
        return optInt + 1;
    }
}

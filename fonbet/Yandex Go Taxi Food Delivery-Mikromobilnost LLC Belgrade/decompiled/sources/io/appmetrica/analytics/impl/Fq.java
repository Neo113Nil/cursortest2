package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class Fq implements Eq {
    public final HashMap a;

    public Fq(String str, HashMap<String, List<String>> hashMap) {
        this.a = hashMap;
    }

    @Override // io.appmetrica.analytics.impl.Eq
    public final boolean a(SQLiteDatabase sQLiteDatabase) {
        try {
            boolean z = true;
            for (Map.Entry entry : this.a.entrySet()) {
                try {
                    SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
                    Cursor query = sQLiteDatabase2.query((String) entry.getKey(), null, null, null, null, null, null);
                    if (query == null) {
                        Or.a(query);
                        return false;
                    }
                    List list = (List) entry.getValue();
                    List asList = Arrays.asList(query.getColumnNames());
                    Collections.sort(asList);
                    z &= list.equals(asList);
                    Or.a(query);
                    sQLiteDatabase = sQLiteDatabase2;
                } catch (Throwable th) {
                    Or.a((Cursor) null);
                    throw th;
                }
            }
            return z;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final HashMap<String, List<String>> a() {
        return this.a;
    }
}

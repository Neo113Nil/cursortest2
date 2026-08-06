package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.kn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0545kn implements InterfaceC0519jn {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6407a;

    public C0545kn(String str, HashMap<String, List<String>> hashMap) {
        this.f6407a = hashMap;
    }

    public final HashMap<String, List<String>> a() {
        return this.f6407a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0519jn
    public final boolean a(SQLiteDatabase sQLiteDatabase) {
        try {
            boolean z2 = true;
            for (Map.Entry entry : this.f6407a.entrySet()) {
                try {
                    Cursor query = sQLiteDatabase.query((String) entry.getKey(), null, null, null, null, null, null);
                    if (query == null) {
                        AbstractC0572lo.a(query);
                        return false;
                    }
                    List list = (List) entry.getValue();
                    List asList = Arrays.asList(query.getColumnNames());
                    Collections.sort(asList);
                    z2 &= list.equals(asList);
                    AbstractC0572lo.a(query);
                } catch (Throwable th) {
                    AbstractC0572lo.a((Cursor) null);
                    throw th;
                }
            }
            return z2;
        } catch (Throwable unused) {
            return false;
        }
    }
}

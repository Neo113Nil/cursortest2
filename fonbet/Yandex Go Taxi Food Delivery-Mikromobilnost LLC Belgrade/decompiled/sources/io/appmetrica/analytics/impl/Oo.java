package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes9.dex */
public final class Oo implements InterfaceC0817w7 {
    public final V7 a;

    public Oo(V7 v7) {
        this.a = v7;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0817w7
    public final SQLiteDatabase a() {
        try {
            return this.a.getWritableDatabase();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0817w7
    public final void a(SQLiteDatabase sQLiteDatabase) {
    }
}

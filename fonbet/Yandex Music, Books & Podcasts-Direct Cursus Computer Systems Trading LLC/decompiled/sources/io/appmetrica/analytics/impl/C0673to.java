package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: io.appmetrica.analytics.impl.to, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0673to implements InterfaceC0598r7 {
    public final R7 a;

    public C0673to(R7 r7) {
        this.a = r7;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0598r7
    public final SQLiteDatabase a() {
        try {
            return this.a.getWritableDatabase();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0598r7
    public final void a(SQLiteDatabase sQLiteDatabase) {
    }
}

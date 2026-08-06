package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: io.appmetrica.analytics.impl.ql, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0699ql implements InterfaceC0891y6 {

    /* renamed from: a, reason: collision with root package name */
    public final Y6 f6789a;

    public C0699ql(Y6 y6) {
        this.f6789a = y6;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0891y6
    public final void a(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0891y6
    public final SQLiteDatabase a() {
        try {
            return this.f6789a.getWritableDatabase();
        } catch (Throwable unused) {
            return null;
        }
    }
}

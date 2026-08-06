package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;

/* loaded from: classes.dex */
public final class K4 extends DatabaseScript {

    /* renamed from: a, reason: collision with root package name */
    public final J4 f4623a = new J4();

    /* renamed from: b, reason: collision with root package name */
    public final I4 f4624b = new I4();

    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(SQLiteDatabase sQLiteDatabase) {
        this.f4623a.runScript(sQLiteDatabase);
        this.f4624b.runScript(sQLiteDatabase);
    }
}

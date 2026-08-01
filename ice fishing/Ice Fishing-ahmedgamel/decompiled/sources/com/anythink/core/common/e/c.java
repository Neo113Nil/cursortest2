package com.anythink.core.common.e;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public class c<T> {

    /* renamed from: e, reason: collision with root package name */
    protected d f12933e;

    public c(d dVar) {
        this.f12933e = dVar;
    }

    public final synchronized SQLiteDatabase c() {
        return this.f12933e.a();
    }

    public final synchronized SQLiteDatabase d() {
        return this.f12933e.b();
    }
}

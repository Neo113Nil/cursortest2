package com.anythink.core.common.e;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public class c<T> {

    /* renamed from: e, reason: collision with root package name */
    protected d f13719e;

    public c(d dVar) {
        this.f13719e = dVar;
    }

    public final synchronized SQLiteDatabase c() {
        return this.f13719e.a();
    }

    public final synchronized SQLiteDatabase d() {
        return this.f13719e.b();
    }
}

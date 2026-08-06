package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class Zb implements InterfaceC0891y6 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5494a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5495b;

    /* renamed from: c, reason: collision with root package name */
    public final C0493in f5496c;

    /* renamed from: d, reason: collision with root package name */
    public final Y9 f5497d;

    /* renamed from: e, reason: collision with root package name */
    public Y6 f5498e;

    public Zb(Context context, String str, C0493in c0493in) {
        this(context, str, new Y9(str), c0493in);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0891y6
    public final synchronized SQLiteDatabase a() {
        Y6 y6;
        try {
            this.f5497d.a();
            y6 = new Y6(this.f5494a, this.f5495b, this.f5496c, PublicLogger.getAnonymousInstance());
            this.f5498e = y6;
        } catch (Throwable unused) {
            return null;
        }
        return y6.getWritableDatabase();
    }

    public Zb(Context context, String str, Y9 y9, C0493in c0493in) {
        this.f5494a = context;
        this.f5495b = str;
        this.f5497d = y9;
        this.f5496c = c0493in;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0891y6
    public final synchronized void a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Throwable unused) {
            }
        }
        AbstractC0572lo.a((Closeable) this.f5498e);
        this.f5497d.b();
        this.f5498e = null;
    }
}

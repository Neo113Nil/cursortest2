package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;

/* loaded from: classes9.dex */
public final class Pd implements InterfaceC0817w7 {
    public final Context a;
    public final String b;
    public final Dq c;
    public final C0619pb d;
    public V7 e;

    public Pd(Context context, String str, C0619pb c0619pb, Dq dq) {
        this.a = context;
        this.b = str;
        this.d = c0619pb;
        this.c = dq;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0817w7
    public final synchronized SQLiteDatabase a() {
        V7 v7;
        try {
            this.d.a();
            v7 = new V7(this.a, this.b, this.c, PublicLogger.getAnonymousInstance());
            this.e = v7;
        } catch (Throwable unused) {
            return null;
        }
        return v7.getWritableDatabase();
    }

    public Pd(Context context, String str, Dq dq) {
        this(context, str, new C0619pb(str), dq);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0817w7
    public final synchronized void a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Throwable unused) {
            }
        }
        Or.a((Closeable) this.e);
        this.d.b();
        this.e = null;
    }
}

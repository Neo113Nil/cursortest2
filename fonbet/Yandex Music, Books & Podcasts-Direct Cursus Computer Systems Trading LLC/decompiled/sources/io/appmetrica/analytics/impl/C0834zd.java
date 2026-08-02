package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;

/* renamed from: io.appmetrica.analytics.impl.zd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0834zd implements InterfaceC0598r7 {
    public final Context a;
    public final String b;
    public final C0473mq c;
    public final C0285gb d;
    public R7 e;

    public C0834zd(@NonNull Context context, @NonNull String str, @NonNull C0285gb c0285gb, @NonNull C0473mq c0473mq) {
        this.a = context;
        this.b = str;
        this.d = c0285gb;
        this.c = c0473mq;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0598r7
    public final synchronized SQLiteDatabase a() {
        R7 r7;
        try {
            this.d.a();
            r7 = new R7(this.a, this.b, this.c, PublicLogger.getAnonymousInstance());
            this.e = r7;
        } catch (Throwable unused) {
            return null;
        }
        return r7.getWritableDatabase();
    }

    public C0834zd(Context context, String str, @NonNull C0473mq c0473mq) {
        this(context, str, new C0285gb(str), c0473mq);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0598r7
    public final synchronized void a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Throwable unused) {
            }
        }
        AbstractC0734vr.a((Closeable) this.e);
        this.d.b();
        this.e = null;
    }
}

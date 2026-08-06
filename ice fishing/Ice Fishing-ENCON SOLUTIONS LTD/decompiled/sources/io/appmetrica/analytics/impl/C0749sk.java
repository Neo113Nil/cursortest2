package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.sk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0749sk implements Ic {
    public static final boolean a(SQLiteDatabase sQLiteDatabase) {
        return true;
    }

    public static void b(Context context) {
        Y6 y6;
        C0723rk c0723rk = new C0723rk();
        C0698qk c0698qk = new C0698qk();
        C0493in c0493in = new C0493in(c0698qk, c0698qk, new C0662pa(false), new H0.b(18));
        C0905yk B2 = C0610na.f6575I.B();
        synchronized (B2) {
            C0271a7 c0271a7 = B2.f7241a;
            y6 = new Y6(context, new Z6(c0271a7.f5559a, c0271a7.f5560b, false).a(context, c0723rk), c0493in, PublicLogger.getAnonymousInstance());
        }
        byte[] bArr = new S2(new C0699ql(y6), "binary_data").get("auto_inapp_collecting_info_data");
        if (bArr != null) {
            C0610na.f6575I.B().c(context).insert("auto_inapp_collecting_info_data", bArr);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ic
    public final void a(Context context) {
        Rm rm = (Rm) Pm.a(C0518jm.class);
        ProtobufStateStorage<Object> a2 = rm.a(context, rm.b(context));
        C0518jm c0518jm = (C0518jm) a2.read();
        C0492im a3 = c0518jm.a(c0518jm.f6318m);
        a3.f6217o = 0L;
        a2.save(new C0518jm(a3));
        b(context);
    }
}

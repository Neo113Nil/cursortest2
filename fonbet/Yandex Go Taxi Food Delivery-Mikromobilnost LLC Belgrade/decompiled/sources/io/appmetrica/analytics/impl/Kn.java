package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import defpackage.kbs;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes9.dex */
public final class Kn implements De {
    public static void b(Context context) {
        V7 v7;
        Jn jn = new Jn();
        In in = new In();
        Dq dq = new Dq(in, in, new Ob(false), new kbs(26));
        Rn B = Jb.I.B();
        synchronized (B) {
            X7 x7 = B.a;
            v7 = new V7(context, new W7(x7.a, x7.b, false).a(context, jn), dq, PublicLogger.getAnonymousInstance());
        }
        byte[] bArr = new H3(new Oo(v7), "binary_data").get("auto_inapp_collecting_info_data");
        if (bArr != null) {
            Jb.I.B().c(context).insert("auto_inapp_collecting_info_data", bArr);
        }
    }

    @Override // io.appmetrica.analytics.impl.De
    public final void a(Context context) {
        AbstractC0576nq abstractC0576nq = (AbstractC0576nq) C0518lq.a(Fp.class);
        ProtobufStateStorage<Object> a = abstractC0576nq.a(context, abstractC0576nq.b(context));
        Fp fp = (Fp) a.read();
        Ep a2 = fp.a(fp.m);
        a2.o = 0L;
        a.save(new Fp(a2));
        b(context);
    }

    public static final boolean a(SQLiteDatabase sQLiteDatabase) {
        return true;
    }
}

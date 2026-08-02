package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import defpackage.tiu;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.sn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0643sn implements InterfaceC0519oe {
    public static void b(Context context) {
        R7 r7;
        C0614rn c0614rn = new C0614rn();
        C0586qn c0586qn = new C0586qn();
        C0473mq c0473mq = new C0473mq(c0586qn, c0586qn, new C0804yb(false), new tiu(20));
        C0844zn B = C0747wb.I.B();
        synchronized (B) {
            T7 t7 = B.a;
            r7 = new R7(context, new S7(t7.a, t7.b, false).a(context, c0614rn), c0473mq, PublicLogger.getAnonymousInstance());
        }
        byte[] bArr = new H3(new C0673to(r7), "binary_data").get("auto_inapp_collecting_info_data");
        if (bArr != null) {
            C0747wb.I.B().c(context).insert("auto_inapp_collecting_info_data", bArr);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0519oe
    public final void a(@NotNull Context context) {
        Vp vp = (Vp) Tp.a(C0501np.class);
        ProtobufStateStorage<Object> a = vp.a(context, vp.b(context));
        C0501np c0501np = (C0501np) a.read();
        C0472mp a2 = c0501np.a(c0501np.m);
        a2.o = 0L;
        a.save(new C0501np(a2));
        b(context);
    }

    public static final boolean a(SQLiteDatabase sQLiteDatabase) {
        return true;
    }
}

package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.on, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0528on implements InterfaceC0519oe {
    public final Gr a;
    public final String b = "startup_state";
    public final AESEncrypter c;

    public C0528on(@NotNull Gr gr) {
        this.a = gr;
        C0100a c0100a = new C0100a(C0747wb.k().g());
        this.c = new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c0100a.b(), c0100a.a());
    }

    public final Zc a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor;
        try {
            cursor = sQLiteDatabase.query("binary_data", new String[]{Constants.KEY_VALUE}, "data_key = ?", new String[]{this.b}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.getCount() == 1 && cursor.moveToFirst()) {
                        Zc zc = (Zc) MessageNano.mergeFrom(new Zc(), this.c.decrypt(cursor.getBlob(cursor.getColumnIndexOrThrow(Constants.KEY_VALUE))));
                        CloseableUtilsKt.closeSafely(cursor);
                        return zc;
                    }
                } catch (Throwable unused) {
                }
            }
            if (cursor != null) {
                cursor.getCount();
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        CloseableUtilsKt.closeSafely(cursor);
        return null;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0519oe
    public final void a(@NotNull Context context) {
        SQLiteDatabase readableDatabase = C0747wb.I.B().f(context).getReadableDatabase();
        if (readableDatabase != null) {
            try {
                Zc a = a(readableDatabase);
                C0472mp c0472mp = new C0472mp(new C0164c5(new C0106a5()));
                if (a != null) {
                    a(this.a, c0472mp, a);
                    c0472mp.p = a.c;
                    c0472mp.r = a.b;
                }
                C0501np c0501np = new C0501np(c0472mp);
                Vp vp = (Vp) Tp.a(C0501np.class);
                vp.a(context, vp.b(context)).save(c0501np);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(Gr gr, C0472mp c0472mp, Zc zc) {
        String optStringOrNull;
        synchronized (gr) {
            optStringOrNull = JsonUtils.optStringOrNull(gr.a.a(), "device_id");
        }
        if (TextUtils.isEmpty(optStringOrNull)) {
            if (!TextUtils.isEmpty(zc.d)) {
                gr.a(zc.d);
            }
            if (!TextUtils.isEmpty(zc.e)) {
                gr.b(zc.e);
            }
            if (TextUtils.isEmpty(zc.a)) {
                return;
            }
            c0472mp.a = zc.a;
        }
    }
}

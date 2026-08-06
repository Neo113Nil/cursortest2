package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.ok, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0646ok implements Ic {

    /* renamed from: a, reason: collision with root package name */
    public final C0857wo f6690a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6691b = "startup_state";

    /* renamed from: c, reason: collision with root package name */
    public final AESEncrypter f6692c;

    public C0646ok(C0857wo c0857wo) {
        this.f6690a = c0857wo;
        C0263a c0263a = new C0263a(C0610na.k().g());
        this.f6692c = new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c0263a.b(), c0263a.a());
    }

    public static void a(C0857wo c0857wo, C0492im c0492im, Ab ab) {
        String optStringOrNull;
        synchronized (c0857wo) {
            optStringOrNull = JsonUtils.optStringOrNull(c0857wo.f7161a.a(), "device_id");
        }
        if (TextUtils.isEmpty(optStringOrNull)) {
            if (!TextUtils.isEmpty(ab.f4140d)) {
                c0857wo.a(ab.f4140d);
            }
            if (!TextUtils.isEmpty(ab.f4141e)) {
                c0857wo.b(ab.f4141e);
            }
            if (TextUtils.isEmpty(ab.f4137a)) {
                return;
            }
            c0492im.f6203a = ab.f4137a;
        }
    }

    @Override // io.appmetrica.analytics.impl.Ic
    public final void a(Context context) {
        SQLiteDatabase readableDatabase = C0610na.f6575I.B().f(context).getReadableDatabase();
        if (readableDatabase != null) {
            try {
                Ab a2 = a(readableDatabase);
                C0492im c0492im = new C0492im(new C0552l4(new C0500j4()));
                if (a2 != null) {
                    a(this.f6690a, c0492im, a2);
                    c0492im.f6218p = a2.f4139c;
                    c0492im.f6220r = a2.f4138b;
                }
                C0518jm c0518jm = new C0518jm(c0492im);
                Rm rm = (Rm) Pm.a(C0518jm.class);
                rm.a(context, rm.b(context)).save(c0518jm);
            } catch (Throwable unused) {
            }
        }
    }

    public final Ab a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor;
        try {
            cursor = sQLiteDatabase.query("binary_data", new String[]{"value"}, "data_key = ?", new String[]{this.f6691b}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.getCount() == 1 && cursor.moveToFirst()) {
                        Ab ab = (Ab) MessageNano.mergeFrom(new Ab(), this.f6692c.decrypt(cursor.getBlob(cursor.getColumnIndexOrThrow("value"))));
                        CloseableUtilsKt.closeSafely(cursor);
                        return ab;
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
}

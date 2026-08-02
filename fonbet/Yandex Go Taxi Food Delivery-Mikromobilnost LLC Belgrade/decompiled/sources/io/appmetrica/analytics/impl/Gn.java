package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.io.CloseableUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes9.dex */
public final class Gn implements De {
    public final Zr a;
    public final String b = "startup_state";
    public final AESEncrypter c;

    public Gn(Zr zr) {
        this.a = zr;
        C0174a c0174a = new C0174a(Jb.k().g());
        this.c = new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c0174a.b(), c0174a.a());
    }

    public final C0621pd a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor;
        try {
            cursor = sQLiteDatabase.query("binary_data", new String[]{"value"}, "data_key = ?", new String[]{this.b}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.getCount() == 1 && cursor.moveToFirst()) {
                        C0621pd c0621pd = (C0621pd) MessageNano.mergeFrom(new C0621pd(), this.c.decrypt(cursor.getBlob(cursor.getColumnIndexOrThrow("value"))));
                        CloseableUtils.closeSafely(cursor);
                        return c0621pd;
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
        CloseableUtils.closeSafely(cursor);
        return null;
    }

    @Override // io.appmetrica.analytics.impl.De
    public final void a(Context context) {
        SQLiteDatabase readableDatabase = Jb.I.B().f(context).getReadableDatabase();
        if (readableDatabase != null) {
            try {
                C0621pd a = a(readableDatabase);
                Ep ep = new Ep(new C0353g5(new C0295e5()));
                if (a != null) {
                    a(this.a, ep, a);
                    ep.p = a.c;
                    ep.r = a.b;
                }
                Fp fp = new Fp(ep);
                AbstractC0576nq abstractC0576nq = (AbstractC0576nq) C0518lq.a(Fp.class);
                abstractC0576nq.a(context, abstractC0576nq.b(context)).save(fp);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(Zr zr, Ep ep, C0621pd c0621pd) {
        String optStringOrNull;
        synchronized (zr) {
            optStringOrNull = JsonUtils.optStringOrNull(zr.a.a(), MetaDataField.DEVICE_ID_FIELD);
        }
        if (TextUtils.isEmpty(optStringOrNull)) {
            if (!TextUtils.isEmpty(c0621pd.d)) {
                zr.a(c0621pd.d);
            }
            if (!TextUtils.isEmpty(c0621pd.e)) {
                zr.b(c0621pd.e);
            }
            if (TextUtils.isEmpty(c0621pd.a)) {
                return;
            }
            ep.a = c0621pd.a;
        }
    }
}

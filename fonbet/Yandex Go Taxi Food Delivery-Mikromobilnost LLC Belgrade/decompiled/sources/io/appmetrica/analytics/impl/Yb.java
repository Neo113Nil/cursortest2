package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import defpackage.bo31;
import defpackage.evu0;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;

/* loaded from: classes4.dex */
public final class Yb implements InterfaceC0194aj {
    public final Context a;
    public final String b = "huawei";

    public Yb(Context context) {
        this.a = context;
    }

    public static final void a(Wi wi, Yb yb) {
        InterfaceC0309ej c0252cj;
        Cursor query;
        Context context = yb.a;
        try {
            query = context.getContentResolver().query(Uri.parse("content://com.huawei.appmarket.commondata/item/5"), null, null, new String[]{context.getPackageName()}, null);
        } catch (Throwable th) {
            c0252cj = new C0252cj("Failed to get referrer from huawei content provider", th);
        }
        if (query == null) {
            throw new IllegalStateException("Not found content provider");
        }
        try {
            if (!query.moveToFirst()) {
                throw new IllegalStateException("Cursor is empty");
            }
            String string = query.getString(0);
            if (string == null || evu0.J(string)) {
                throw new IllegalStateException("Referrer is empty");
            }
            c0252cj = new C0281dj(new Ui(string, query.getLong(1), query.getLong(2), 3));
            query.close();
            wi.a(c0252cj);
        } finally {
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0194aj
    public final String a() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0194aj
    public final void a(Wi wi) {
        Bn bn = Jb.I.d;
        bo31 bo31Var = new bo31(14, wi, this);
        bn.a.getClass();
        new InterruptionSafeThread(bo31Var, "IAA-SHMSR-" + ThreadFactoryC0450jg.a.incrementAndGet()).start();
    }
}

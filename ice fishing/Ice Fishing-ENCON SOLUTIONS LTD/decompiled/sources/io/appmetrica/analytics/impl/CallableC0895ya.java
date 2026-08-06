package io.appmetrica.analytics.impl;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* renamed from: io.appmetrica.analytics.impl.ya, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC0895ya implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0921za f7230a;

    public CallableC0895ya(C0921za c0921za) {
        this.f7230a = c0921za;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Uri parse = Uri.parse("content://com.huawei.appmarket.commondata/item/5");
        ContentResolver contentResolver = this.f7230a.f7273a.getContentResolver();
        C0921za c0921za = this.f7230a;
        c0921za.f7274b = contentResolver.query(parse, null, null, new String[]{c0921za.f7273a.getPackageName()}, null);
        Cursor cursor = this.f7230a.f7274b;
        if (cursor != null && cursor.moveToFirst()) {
            String string = this.f7230a.f7274b.getString(0);
            if (!TextUtils.isEmpty(string)) {
                return new C0616ng(string, this.f7230a.f7274b.getLong(1), this.f7230a.f7274b.getLong(2), EnumC0590mg.f6521d);
            }
        }
        return null;
    }
}

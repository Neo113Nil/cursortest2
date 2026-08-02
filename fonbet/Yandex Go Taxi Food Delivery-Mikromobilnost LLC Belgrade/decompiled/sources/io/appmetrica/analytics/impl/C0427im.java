package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import java.util.LinkedHashMap;

/* renamed from: io.appmetrica.analytics.impl.im, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0427im implements InterfaceC0456jm {
    public final Context a;
    public final String b = "content://" + a() + "/clids";
    public final String c = "clid_key";
    public final String d = "clid_value";

    public C0427im(Context context) {
        this.a = context;
    }

    public final String a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0456jm, defpackage.sls
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0467k4 invoke() {
        Throwable th;
        Cursor cursor;
        if (!PackageManagerUtils.hasContentProvider(this.a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
            AbstractC0774um.a("Satellite content provider with clids was not found.", new Object[0]);
            return null;
        }
        try {
            cursor = this.a.getContentResolver().query(Uri.parse(this.b), null, null, null, null);
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
        try {
        } catch (Throwable th3) {
            th = th3;
            try {
                ImportantLogger.INSTANCE.info("AppMetrica-Attribution", "Error while getting satellite clids\n" + StringUtils.throwableToString(th), new Object[0]);
                return null;
            } finally {
                Or.a(cursor);
            }
        }
        if (cursor == null) {
            AbstractC0774um.a("No Satellite content provider found", new Object[0]);
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursor.moveToNext()) {
            try {
                String string = cursor.getString(cursor.getColumnIndexOrThrow(this.c));
                String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.d));
                if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                    AbstractC0774um.a("Invalid clid {%s : %s}", string, string2);
                } else {
                    linkedHashMap.put(string, string2);
                }
            } catch (Throwable unused) {
            }
        }
        AbstractC0774um.a("Clids from satellite: %s", linkedHashMap);
        return new C0467k4(linkedHashMap, EnumC0271d9.e);
    }
}

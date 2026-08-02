package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class Vh implements InterfaceC0456jm {
    public final Context a;
    public final String b = "content://" + a() + "/preload_info";
    public final String c = "tracking_id";
    public final String d = "additional_parameters";

    public Vh(Context context) {
        this.a = context;
    }

    public final String a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0456jm, defpackage.sls
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0251ci invoke() {
        Cursor cursor;
        JSONObject jSONObject;
        if (!PackageManagerUtils.hasContentProvider(this.a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
            AbstractC0774um.a("Satellite content provider with preload info was not found.", new Object[0]);
            return null;
        }
        try {
            cursor = this.a.getContentResolver().query(Uri.parse(this.b), null, null, null, null);
            try {
                if (cursor == null) {
                    AbstractC0774um.a("No Satellite content provider found", new Object[0]);
                } else {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(cursor.getColumnIndexOrThrow(this.c));
                        String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.d));
                        if (string2 != null) {
                            try {
                            } catch (Throwable unused) {
                                jSONObject = new JSONObject();
                            }
                            if (string2.length() != 0) {
                                jSONObject = new JSONObject(string2);
                                JSONObject jSONObject2 = jSONObject;
                                if (!TextUtils.isEmpty(string) && ParseUtils.parseLong(string) == null) {
                                    AbstractC0774um.a("Tracking id from Satellite is not a number.", new Object[0]);
                                }
                                AbstractC0774um.a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject2);
                                C0251ci c0251ci = new C0251ci(string, jSONObject2, !TextUtils.isEmpty(string), false, EnumC0271d9.e);
                                Or.a(cursor);
                                return c0251ci;
                            }
                        }
                        jSONObject = new JSONObject();
                        JSONObject jSONObject22 = jSONObject;
                        if (!TextUtils.isEmpty(string)) {
                            AbstractC0774um.a("Tracking id from Satellite is not a number.", new Object[0]);
                        }
                        AbstractC0774um.a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject22);
                        C0251ci c0251ci2 = new C0251ci(string, jSONObject22, !TextUtils.isEmpty(string), false, EnumC0271d9.e);
                        Or.a(cursor);
                        return c0251ci2;
                    }
                    AbstractC0774um.a("No Preload Info data in Satellite content provider", new Object[0]);
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
            cursor = null;
        }
        Or.a(cursor);
        return null;
    }
}

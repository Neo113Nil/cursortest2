package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.jf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0511jf implements Ui {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6282a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6283b = "content://" + a() + "/preload_info";

    /* renamed from: c, reason: collision with root package name */
    public final String f6284c = "tracking_id";

    /* renamed from: d, reason: collision with root package name */
    public final String f6285d = "additional_parameters";

    public C0511jf(Context context) {
        this.f6282a = context;
    }

    public final String a() {
        return "com.yandex.preinstallsatellite.appmetrica.provider";
    }

    @Override // io.appmetrica.analytics.impl.Ui, t1.InterfaceC1046a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0693qf invoke() {
        Cursor cursor;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (!PackageManagerUtils.hasContentProvider(this.f6282a, "com.yandex.preinstallsatellite.appmetrica.provider")) {
            AbstractC0412fj.a("Satellite content provider with preload info was not found.", new Object[0]);
            return null;
        }
        try {
            cursor = this.f6282a.getContentResolver().query(Uri.parse(this.f6283b), null, null, null, null);
            try {
                if (cursor == null) {
                    AbstractC0412fj.a("No Satellite content provider found", new Object[0]);
                } else {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f6284c));
                        String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.f6285d));
                        if (string2 != null) {
                            try {
                            } catch (Throwable unused) {
                                jSONObject = new JSONObject();
                            }
                            if (string2.length() != 0) {
                                jSONObject2 = new JSONObject(string2);
                                if (!TextUtils.isEmpty(string) && ParseUtils.parseLong(string) == null) {
                                    AbstractC0412fj.a("Tracking id from Satellite is not a number.", new Object[0]);
                                }
                                AbstractC0412fj.a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject2);
                                C0693qf c0693qf = new C0693qf(string, jSONObject2, !TextUtils.isEmpty(string), false, S7.f5046d);
                                AbstractC0572lo.a(cursor);
                                return c0693qf;
                            }
                        }
                        jSONObject = new JSONObject();
                        jSONObject2 = jSONObject;
                        if (!TextUtils.isEmpty(string)) {
                            AbstractC0412fj.a("Tracking id from Satellite is not a number.", new Object[0]);
                        }
                        AbstractC0412fj.a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject2);
                        C0693qf c0693qf2 = new C0693qf(string, jSONObject2, !TextUtils.isEmpty(string), false, S7.f5046d);
                        AbstractC0572lo.a(cursor);
                        return c0693qf2;
                    }
                    AbstractC0412fj.a("No Preload Info data in Satellite content provider", new Object[0]);
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
            cursor = null;
        }
        AbstractC0572lo.a(cursor);
        return null;
    }
}

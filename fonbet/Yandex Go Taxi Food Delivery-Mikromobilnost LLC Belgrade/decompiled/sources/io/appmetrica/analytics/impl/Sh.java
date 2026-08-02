package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class Sh implements InterfaceC0729t6 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0729t6, defpackage.tls
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0251ci invoke(ContentValues contentValues) {
        String asString = contentValues.getAsString("tracking_id");
        if (StringUtils.isNullOrEmpty(asString)) {
            AbstractC0774um.a("Tracking id is empty", new Object[0]);
            return null;
        }
        if (ParseUtils.parseLong(asString) == null) {
            AbstractC0774um.a("Tracking id from preload info content provider is not a number", new Object[0]);
            return null;
        }
        try {
            String asString2 = contentValues.getAsString("additional_params");
            if (StringUtils.isNullOrEmpty(asString2)) {
                AbstractC0774um.a("No additional params", new Object[0]);
                return null;
            }
            JSONObject jSONObject = new JSONObject(asString2);
            if (jSONObject.length() == 0) {
                AbstractC0774um.a("Additional params are empty", new Object[0]);
                return null;
            }
            AbstractC0774um.a("Successfully parsed preload info. Tracking id = %s, additionalParams = %s", asString, jSONObject);
            return new C0251ci(asString, jSONObject, true, false, EnumC0271d9.f);
        } catch (Throwable th) {
            ImportantLogger.INSTANCE.info("AppMetrica-Attribution", "Could not parse additional parameters\n" + StringUtils.throwableToString(th), new Object[0]);
            return null;
        }
    }
}

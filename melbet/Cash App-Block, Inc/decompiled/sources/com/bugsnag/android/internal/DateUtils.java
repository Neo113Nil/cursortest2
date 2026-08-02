package com.bugsnag.android.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.dynamite.zze;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public abstract class DateUtils {
    public static final zze iso8601Holder = new zze(2);

    public static final Date fromIso8601(String str) {
        try {
            Object obj = iso8601Holder.get();
            if (obj == null) {
                throw new IllegalArgumentException("Unable to find valid dateformatter");
            }
            Date parse = ((DateFormat) obj).parse(str);
            if (parse != null) {
                return parse;
            }
            throw new ParseException("DateFormat.parse returned null", 0);
        } catch (ParseException e) {
            Handlers$$ExternalSyntheticBUOutline0.m("Failed to parse timestamp", e);
            return null;
        }
    }

    public static final String toIso8601(Date date) {
        Object obj = iso8601Holder.get();
        if (obj != null) {
            return ((DateFormat) obj).format(date);
        }
        a$$ExternalSyntheticBUOutline0.m$3("Unable to find valid dateformatter");
        return null;
    }
}

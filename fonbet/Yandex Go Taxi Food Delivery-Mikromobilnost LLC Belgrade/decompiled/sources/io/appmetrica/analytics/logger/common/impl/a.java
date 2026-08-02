package io.appmetrica.analytics.logger.common.impl;

import android.util.Log;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.x4e;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class a {
    public static String a(String str, String str2, Object... objArr) {
        StringBuilder v = oyr.v(str, " ");
        if (str2 == null) {
            str2 = "";
        } else if (objArr != null && objArr.length != 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (Throwable th) {
                StringBuilder x = unr0.x("Attention!!! Invalid log format. See exception details above. Message: ", str2, "; arguments: ");
                x.append(Arrays.toString(objArr));
                str2 = x.toString();
                Log.e("[LogMessageConstructor]", str2, th);
            }
        }
        Locale locale = Locale.US;
        StringBuilder k = x4e.k("[", Thread.currentThread().getId(), "-", Thread.currentThread().getName());
        k.append("] ");
        k.append(str2);
        v.append(k.toString());
        return v.toString();
    }
}

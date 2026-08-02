package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.f1d;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class Fb {
    public final String a;

    public Fb(Context context) {
        this.a = context.getPackageName();
    }

    public final String a(String str) {
        String replace = str.replace(this.a, "").replace(StringUtils.PROCESS_POSTFIX_DELIMITER, "");
        if (replace.isEmpty()) {
            replace = "Main";
        }
        if (Character.isLowerCase(replace.charAt(0))) {
            String substring = replace.substring(0, 1);
            replace = replace.replaceFirst(substring, substring.toUpperCase(Locale.US));
        }
        return f1d.g("Process", replace);
    }
}

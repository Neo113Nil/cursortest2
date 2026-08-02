package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.g8e;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class Vb {
    public final String a;

    public Vb(Context context) {
        this.a = context.getPackageName();
    }

    public final String a(String str) {
        String replace = str.replace(this.a, "").replace(":", "");
        if (replace.isEmpty()) {
            replace = "Main";
        }
        if (Character.isLowerCase(replace.charAt(0))) {
            String substring = replace.substring(0, 1);
            replace = replace.replaceFirst(substring, substring.toUpperCase(Locale.US));
        }
        return g8e.o("Process", replace);
    }
}

package com.yandex.passport.internal.util;

import android.os.Build;
import android.webkit.WebView;
import com.yandex.passport.internal.push.w0;
import defpackage.btf;
import defpackage.jyr;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public abstract class q {
    public static final jyr a = btf.b(new w0(22));

    public static boolean a(String str) {
        str.getClass();
        return ((Pattern) a.getValue()).matcher(str).find();
    }

    public static final void b() {
        if (Build.VERSION.SDK_INT >= 28) {
            WebView.setDataDirectorySuffix("passport");
        }
    }
}

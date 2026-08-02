package com.yandex.passport.sloth.ui;

import android.webkit.JavascriptInterface;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class e {
    public final Function1 a;

    public e(Function1 function1) {
        function1.getClass();
        this.a = function1;
    }

    @JavascriptInterface
    public final void send(String str) {
        if (str != null) {
            this.a.invoke(str);
        }
    }
}

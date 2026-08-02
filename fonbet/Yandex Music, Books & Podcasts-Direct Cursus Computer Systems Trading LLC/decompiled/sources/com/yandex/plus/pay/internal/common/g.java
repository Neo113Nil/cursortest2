package com.yandex.plus.pay.internal.common;

import defpackage.b6e;
import defpackage.xz0;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes5.dex */
public final class g implements com.yandex.plus.core.locale.a {
    public static final Set c = xz0.Y(new String[]{"ru", "en", "ar", "az", "iw", "hy", "ka", "kk", "ro", "uk", "uz"});
    public final com.yandex.plus.core.strings.a a;
    public final com.yandex.plus.core.locale.a b;

    public g(com.yandex.plus.core.strings.a aVar, com.yandex.plus.core.locale.a aVar2) {
        aVar.getClass();
        this.a = aVar;
        this.b = aVar2;
    }

    @Override // com.yandex.plus.core.locale.a
    public final Locale a() {
        Locale a = this.b.a();
        if (c.contains(a.getLanguage())) {
            return a;
        }
        int ordinal = this.a.ordinal();
        if (ordinal == 0) {
            return new Locale("ru");
        }
        if (ordinal == 1) {
            return new Locale("en");
        }
        b6e.s();
        return null;
    }
}

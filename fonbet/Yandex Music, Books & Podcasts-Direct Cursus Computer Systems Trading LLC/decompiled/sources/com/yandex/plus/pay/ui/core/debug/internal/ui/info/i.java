package com.yandex.plus.pay.ui.core.debug.internal.ui.info;

import android.os.Build;
import defpackage.bfu;
import defpackage.xdr;
import defpackage.ydr;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class i extends bfu {
    public final com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.b k;
    public final xdr l;

    public i(com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar, com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.b bVar) {
        bVar.getClass();
        this.k = bVar;
        com.yandex.plus.pay.ui.core.debug.api.a aVar2 = (com.yandex.plus.pay.ui.core.debug.api.a) aVar.b;
        String valueOf = String.valueOf(aVar2.a);
        String valueOf2 = String.valueOf(aVar2.b);
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        str2.getClass();
        str.getClass();
        if (!kotlin.text.c.v(str2, str, false)) {
            StringBuilder sb = new StringBuilder();
            if (str.length() > 0) {
                StringBuilder sb2 = new StringBuilder();
                String valueOf3 = String.valueOf(str.charAt(0));
                valueOf3.getClass();
                String upperCase = valueOf3.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                sb2.append((Object) upperCase);
                sb2.append(str.substring(1));
                str = sb2.toString();
            }
            sb.append(str);
            sb.append(' ');
            sb.append(str2);
            str2 = sb.toString();
        } else if (str2.length() > 0) {
            StringBuilder sb3 = new StringBuilder();
            String valueOf4 = String.valueOf(str2.charAt(0));
            valueOf4.getClass();
            String upperCase2 = valueOf4.toUpperCase(Locale.ROOT);
            upperCase2.getClass();
            sb3.append((Object) upperCase2);
            sb3.append(str2.substring(1));
            str2 = sb3.toString();
        }
        String str3 = str2;
        Build.VERSION.RELEASE.getClass();
        this.l = ydr.a(new h(new com.yandex.plus.pay.ui.core.debug.internal.domain.info.a(valueOf, valueOf2, str3, aVar2.c, aVar2.d, aVar2.e, aVar2.f, aVar2.g)));
    }
}

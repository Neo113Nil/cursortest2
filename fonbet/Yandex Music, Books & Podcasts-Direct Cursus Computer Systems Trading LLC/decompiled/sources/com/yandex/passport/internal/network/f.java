package com.yandex.passport.internal.network;

import defpackage.b6e;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class f implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.yandex.passport.common.core.b b;
    public final /* synthetic */ Long c;

    public /* synthetic */ f(h hVar, com.yandex.passport.common.core.b bVar, Long l, int i) {
        this.a = i;
        this.b = bVar;
        this.c = l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        switch (this.a) {
            case 0:
                com.yandex.passport.common.util.b G = com.yandex.passport.internal.ui.a.G(this.c);
                com.yandex.passport.common.core.b bVar = this.b;
                int ordinal = bVar.ordinal();
                if (ordinal == 0) {
                    int ordinal2 = G.ordinal();
                    if (ordinal2 == 0) {
                        str = "https://mobileproxy.passport.yandex.net";
                    } else if (ordinal2 == 1) {
                        str = String.format("https://mobileproxy.passport.yandex.%s", Arrays.copyOf(new Object[]{"fi"}, 1));
                    } else {
                        if (ordinal2 != 2) {
                            b6e.s();
                            return null;
                        }
                        str = String.format("https://mobileproxy.passport.yandex.%s", Arrays.copyOf(new Object[]{"kz"}, 1));
                    }
                    return new com.yandex.passport.common.url.b(str);
                }
                if (ordinal == 1) {
                    str = "https://mobileproxy-yateam.passport.yandex.net";
                } else if (ordinal == 2) {
                    int ordinal3 = G.ordinal();
                    if (ordinal3 == 0) {
                        str = "https://mobileproxy-test.passport.yandex.net";
                    } else if (ordinal3 == 1) {
                        str = String.format("https://mobileproxy-test-%s.passport.yandex.net", Arrays.copyOf(new Object[]{"fi"}, 1));
                    } else {
                        if (ordinal3 != 2) {
                            b6e.s();
                            return null;
                        }
                        str = String.format("https://mobileproxy-test-%s.passport.yandex.net", Arrays.copyOf(new Object[]{"kz"}, 1));
                    }
                } else if (ordinal == 3) {
                    str = "https://mobileproxy-yateam-test.passport.yandex.net";
                } else {
                    if (ordinal != 4) {
                        b6e.l(bVar, "Unknown environment: ");
                        return null;
                    }
                    str = "https://mobileproxy-rc.passport.yandex.net";
                }
                return new com.yandex.passport.common.url.b(str);
            default:
                return new com.yandex.passport.common.url.b(h.n(this.b, this.c, "/am"));
        }
    }
}

package com.yandex.passport.internal.util;

import com.yandex.passport.internal.push.w0;
import defpackage.btf;
import defpackage.jyr;
import defpackage.uah;
import kotlin.Pair;

/* loaded from: classes4.dex */
public abstract class m {
    public static final Object a;
    public static final jyr b;

    static {
        com.yandex.passport.api.impl.b bVar = com.yandex.passport.api.impl.b.c;
        Pair pair = new Pair("passport.yandex.%s", bVar);
        com.yandex.passport.api.impl.b bVar2 = com.yandex.passport.api.impl.b.e;
        a = uah.e(pair, new Pair("passport-test.yandex.%s", bVar2), new Pair("passport-rc.yandex.%s", com.yandex.passport.api.impl.b.g), new Pair("passport.yandex-team.ru", com.yandex.passport.api.impl.b.d), new Pair("passport-test.yandex-team.ru", com.yandex.passport.api.impl.b.f), new Pair("sandbox.pay.yandex.ru", bVar), new Pair("test.pay.yandex.ru", bVar2), new Pair("pay.yandex.ru", bVar));
        b = btf.b(new w0(21));
    }
}

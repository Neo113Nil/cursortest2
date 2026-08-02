package com.yandex.plus.pay.internal.benchmark.tarifficator;

import com.yandex.plus.pay.data.mb.dto.c1;
import com.yandex.plus.pay.reporter.api.f;
import defpackage.btf;
import defpackage.gld;
import defpackage.hld;
import defpackage.jyr;
import defpackage.tf6;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class b implements com.yandex.plus.pay.internal.benchmark.a {
    public static final jyr g = btf.b(new c1(28));
    public final String a;
    public final com.yandex.plus.core.strings.a b;
    public final Function0 c;
    public final f d;
    public final com.yandex.plus.home.common.utils.f e;
    public final tf6 f;

    public b(String str, com.yandex.plus.core.strings.a aVar, Function0 function0, Function1 function1, f fVar, kotlinx.coroutines.a aVar2) {
        str.getClass();
        aVar.getClass();
        fVar.getClass();
        aVar2.getClass();
        this.a = str;
        this.b = aVar;
        this.c = function0;
        this.d = fVar;
        this.e = new com.yandex.plus.home.common.utils.f(hld.j(), new AtomicBoolean(false), function1);
        this.f = gld.e(aVar2);
    }
}

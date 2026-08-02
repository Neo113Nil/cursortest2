package com.yandex.plus.core.templating.render;

import defpackage.ezc;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class l extends ezc implements Function1 {
    public static final l a = new l(1, o.class, "<init>", "constructor-impl(Ljava/util/List;)Ljava/util/List;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list = (List) obj;
        list.getClass();
        return new o(list);
    }
}

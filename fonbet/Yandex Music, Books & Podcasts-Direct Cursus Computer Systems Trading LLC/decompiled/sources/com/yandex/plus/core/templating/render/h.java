package com.yandex.plus.core.templating.render;

import defpackage.ezc;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class h extends ezc implements Function1 {
    public static final h a = new h(1, t.class, "<init>", "constructor-impl(I)I", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new t(((Number) obj).intValue());
    }
}

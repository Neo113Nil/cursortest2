package com.yandex.plus.core.templating.render;

import defpackage.ezc;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class k extends ezc implements Function1 {
    public static final k a = new k(1, r.class, "<init>", "constructor-impl(D)D", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new r(((Number) obj).doubleValue());
    }
}

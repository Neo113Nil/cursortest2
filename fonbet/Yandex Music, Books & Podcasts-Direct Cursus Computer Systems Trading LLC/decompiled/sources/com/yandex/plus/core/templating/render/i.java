package com.yandex.plus.core.templating.render;

import defpackage.ezc;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class i extends ezc implements Function1 {
    public static final i a = new i(1, u.class, "<init>", "constructor-impl(J)J", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new u(((Number) obj).longValue());
    }
}

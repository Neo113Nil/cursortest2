package com.yandex.passport.internal.flags;

import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class j extends g {
    @Override // com.yandex.passport.internal.flags.g
    public final Object a(String str) {
        Integer intOrNull = StringsKt.toIntOrNull(str);
        return Integer.valueOf(intOrNull != null ? intOrNull.intValue() : ((Number) this.b).intValue());
    }
}

package com.yandex.passport.internal.flags;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* loaded from: classes4.dex */
public final class a extends g {
    @Override // com.yandex.passport.internal.flags.g
    public final Object a(String str) {
        return Boolean.valueOf(str.equals(CommonUrlParts.Values.FALSE_INTEGER) ? false : str.equals("1") ? true : ((Boolean) this.b).booleanValue());
    }
}

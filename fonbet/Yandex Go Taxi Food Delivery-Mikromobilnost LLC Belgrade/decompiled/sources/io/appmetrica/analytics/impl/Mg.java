package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes9.dex */
public final class Mg implements Vr {
    public final String a;

    public Mg(String str) {
        this.a = str;
    }

    @Override // io.appmetrica.analytics.impl.Vr
    public final Tr a(String str) {
        return StringUtils.isNullOrEmpty(str) ? new Tr(this, false, AbstractC0748tp.a(new StringBuilder(), this.a, " is empty.")) : new Tr(this, true, "");
    }
}

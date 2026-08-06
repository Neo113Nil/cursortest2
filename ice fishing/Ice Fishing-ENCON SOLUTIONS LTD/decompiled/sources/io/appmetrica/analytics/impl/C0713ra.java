package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.ra, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0713ra extends C0688qa {
    public C0713ra(int i2, int i3) {
        this(i2, new C0739sa(i3));
    }

    public final int a(String str) {
        return StringUtils.getUTF8Bytes(str).length;
    }

    @Override // io.appmetrica.analytics.impl.C0688qa
    public final int b(Object obj) {
        return StringUtils.getUTF8Bytes((String) obj).length;
    }

    public C0713ra(int i2, C0739sa c0739sa) {
        super(i2, c0739sa);
    }
}

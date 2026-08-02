package ru.yandex.taxi.locationsdk.processor_on_jump_or_divergence.internal.processor.utils;

import defpackage.e3n;
import defpackage.g92;
import defpackage.rol0;
import defpackage.tpr;

/* loaded from: classes5.dex */
public abstract class a {
    public static final tpr a(long j) {
        return e3n.j(j) ? new rol0(new TimeoutFlagKt$timeoutFlagFlow$1(j, null)) : new g92(2, Boolean.TRUE);
    }
}

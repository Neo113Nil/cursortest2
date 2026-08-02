package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ka, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0473ka extends AbstractC0502la {
    public final List a;

    public C0473ka(List<Object> list) {
        this.a = CollectionUtils.unmodifiableListCopy(list);
    }

    public final List<Object> a() {
        return this.a;
    }
}

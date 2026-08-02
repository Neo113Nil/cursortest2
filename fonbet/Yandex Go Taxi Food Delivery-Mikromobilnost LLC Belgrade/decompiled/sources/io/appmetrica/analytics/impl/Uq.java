package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class Uq {
    public final String a;
    public final int b;
    public final long c;
    public final String d;
    public final Integer e;
    public final List f;

    public Uq(String str, int i, long j, String str2, Integer num, List list) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = str2;
        this.e = num;
        this.f = list == null ? Collections.EMPTY_LIST : CollectionUtils.unmodifiableListCopy(list);
    }
}

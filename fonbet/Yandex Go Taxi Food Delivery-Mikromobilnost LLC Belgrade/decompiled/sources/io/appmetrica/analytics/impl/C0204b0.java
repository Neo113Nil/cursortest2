package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.b0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0204b0 {
    public final Uq a;
    public final List b;
    public final String c;

    public C0204b0(Uq uq, ArrayList arrayList, String str) {
        this.a = uq;
        this.b = arrayList == null ? Collections.EMPTY_LIST : CollectionUtils.unmodifiableListCopy(arrayList);
        this.c = str;
    }
}

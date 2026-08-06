package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final C0856wn f5187a;

    /* renamed from: b, reason: collision with root package name */
    public final List f5188b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5189c;

    public V(C0856wn c0856wn, ArrayList arrayList, String str) {
        this.f5187a = c0856wn;
        this.f5188b = arrayList == null ? Collections.emptyList() : CollectionUtils.unmodifiableListCopy(arrayList);
        this.f5189c = str;
    }
}

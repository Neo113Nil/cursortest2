package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.wn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0856wn {

    /* renamed from: a, reason: collision with root package name */
    public final String f7155a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7156b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7157c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7158d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f7159e;

    /* renamed from: f, reason: collision with root package name */
    public final List f7160f;

    public C0856wn(String str, int i2, long j2, String str2, Integer num, List list) {
        this.f7155a = str;
        this.f7156b = i2;
        this.f7157c = j2;
        this.f7158d = str2;
        this.f7159e = num;
        this.f7160f = list == null ? Collections.emptyList() : CollectionUtils.unmodifiableListCopy(list);
    }
}

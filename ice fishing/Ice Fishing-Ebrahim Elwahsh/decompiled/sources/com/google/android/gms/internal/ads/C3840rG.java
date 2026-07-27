package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.rG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3840rG implements Iterable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ List f34005n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ List f34006u;

    public C3840rG(C3948tG c3948tG, List list, List list2) {
        this.f34005n = list;
        this.f34006u = list2;
        Objects.requireNonNull(c3948tG);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C3894sG(this.f34005n.iterator(), this.f34006u.iterator());
    }
}

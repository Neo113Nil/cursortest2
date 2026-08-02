package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.nG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3635nG implements Iterable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ List f33492n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ List f33493u;

    public C3635nG(C3743pG c3743pG, List list, List list2) {
        this.f33492n = list;
        this.f33493u = list2;
        Objects.requireNonNull(c3743pG);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C3689oG(this.f33492n.iterator(), this.f33493u.iterator());
    }
}

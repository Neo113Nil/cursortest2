package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.nG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3612nG implements Iterable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ List f32714n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ List f32715u;

    public C3612nG(C3720pG c3720pG, List list, List list2) {
        this.f32714n = list;
        this.f32715u = list2;
        Objects.requireNonNull(c3720pG);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C3666oG(this.f32714n.iterator(), this.f32715u.iterator());
    }
}

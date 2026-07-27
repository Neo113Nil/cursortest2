package com.google.android.gms.internal.ads;

import java.util.HashSet;
import java.util.Set;
import x2.InterfaceC5190d;

/* renamed from: com.google.android.gms.internal.ads.yd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4219yd implements InterfaceC5190d {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f35175a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f35176b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35177c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f35178d;

    public C4219yd(HashSet hashSet, boolean z3, int i, boolean z6) {
        this.f35175a = hashSet;
        this.f35176b = z3;
        this.f35177c = i;
        this.f35178d = z6;
    }

    @Override // x2.InterfaceC5190d
    public final int a() {
        return this.f35177c;
    }

    @Override // x2.InterfaceC5190d
    public final boolean b() {
        return this.f35178d;
    }

    @Override // x2.InterfaceC5190d
    public final boolean c() {
        return this.f35176b;
    }

    @Override // x2.InterfaceC5190d
    public final Set d() {
        return this.f35175a;
    }
}

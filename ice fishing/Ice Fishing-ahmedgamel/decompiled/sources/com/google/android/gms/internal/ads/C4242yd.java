package com.google.android.gms.internal.ads;

import java.util.HashSet;
import java.util.Set;
import z2.InterfaceC5227d;

/* renamed from: com.google.android.gms.internal.ads.yd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4242yd implements InterfaceC5227d {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f35965a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f35966b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35967c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f35968d;

    public C4242yd(HashSet hashSet, boolean z6, int i, boolean z9) {
        this.f35965a = hashSet;
        this.f35966b = z6;
        this.f35967c = i;
        this.f35968d = z9;
    }

    @Override // z2.InterfaceC5227d
    public final int a() {
        return this.f35967c;
    }

    @Override // z2.InterfaceC5227d
    public final boolean b() {
        return this.f35968d;
    }

    @Override // z2.InterfaceC5227d
    public final boolean c() {
        return this.f35966b;
    }

    @Override // z2.InterfaceC5227d
    public final Set d() {
        return this.f35965a;
    }
}

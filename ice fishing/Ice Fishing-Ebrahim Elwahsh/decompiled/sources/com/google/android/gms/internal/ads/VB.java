package com.google.android.gms.internal.ads;

import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class VB {

    /* renamed from: a, reason: collision with root package name */
    public final Object f28218a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f28219b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f28220c;

    public VB(Object obj, Object obj2, Object obj3) {
        this.f28218a = obj;
        this.f28219b = obj2;
        this.f28220c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f28218a;
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(this.f28219b);
        String valueOf3 = String.valueOf(obj);
        String valueOf4 = String.valueOf(this.f28220c);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        StringBuilder sb = new StringBuilder(length + 33 + length2 + 5 + valueOf3.length() + 1 + valueOf4.length());
        AbstractC5051n.j(sb, "Multiple entries with same key: ", valueOf, "=", valueOf2);
        return new IllegalArgumentException(com.anythink.basead.b.c.i.q(sb, " and ", valueOf3, "=", valueOf4));
    }
}

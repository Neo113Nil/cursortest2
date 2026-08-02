package com.google.android.gms.internal.ads;

import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class SB {

    /* renamed from: a, reason: collision with root package name */
    public final Object f28133a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f28134b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f28135c;

    public SB(Object obj, Object obj2, Object obj3) {
        this.f28133a = obj;
        this.f28134b = obj2;
        this.f28135c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f28133a;
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(this.f28134b);
        String valueOf3 = String.valueOf(obj);
        String valueOf4 = String.valueOf(this.f28135c);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        StringBuilder sb = new StringBuilder(length + 33 + length2 + 5 + valueOf3.length() + 1 + valueOf4.length());
        AbstractC5128c.h(sb, "Multiple entries with same key: ", valueOf, "=", valueOf2);
        return new IllegalArgumentException(com.IceFishing.LiveIceFishing.k.r(sb, " and ", valueOf3, "=", valueOf4));
    }
}

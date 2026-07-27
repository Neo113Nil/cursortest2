package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class SB {

    /* renamed from: a, reason: collision with root package name */
    public final Object f27419a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f27420b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f27421c;

    public SB(Object obj, Object obj2, Object obj3) {
        this.f27419a = obj;
        this.f27420b = obj2;
        this.f27421c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f27419a;
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(this.f27420b);
        String valueOf3 = String.valueOf(obj);
        String valueOf4 = String.valueOf(this.f27421c);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        StringBuilder sb = new StringBuilder(length + 33 + length2 + 5 + valueOf3.length() + 1 + valueOf4.length());
        u1.h.i(sb, "Multiple entries with same key: ", valueOf, "=", valueOf2);
        return new IllegalArgumentException(com.anythink.basead.exoplayer.f.f.o(sb, " and ", valueOf3, "=", valueOf4));
    }
}

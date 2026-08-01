package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.b2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2954b2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f29184a;

    /* renamed from: b, reason: collision with root package name */
    public final L0 f29185b;

    /* renamed from: c, reason: collision with root package name */
    public final C4135x0 f29186c;

    /* renamed from: d, reason: collision with root package name */
    public final C3062d3 f29187d;

    /* renamed from: e, reason: collision with root package name */
    public final C f29188e;

    static {
        PB pb = RB.f27177u;
        C3500lC c3500lC = C3500lC.f31745x;
        List list = Collections.EMPTY_LIST;
        C3812r1 c3812r1 = C3812r1.f33455a;
        new C();
        C3062d3 c3062d3 = C3062d3.f29665C;
        String str = AbstractC3159eu.f29993a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ C2954b2(String str, C c9, L0 l02, C4135x0 c4135x0, C3062d3 c3062d3) {
        C3812r1 c3812r1 = C3812r1.f33455a;
        this.f29184a = str;
        this.f29185b = l02;
        this.f29186c = c4135x0;
        this.f29187d = c3062d3;
        this.f29188e = c9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2954b2)) {
            return false;
        }
        C2954b2 c2954b2 = (C2954b2) obj;
        if (!this.f29184a.equals(c2954b2.f29184a) || !this.f29188e.equals(c2954b2.f29188e) || !Objects.equals(this.f29185b, c2954b2.f29185b) || !this.f29186c.equals(c2954b2.f29186c) || !Objects.equals(this.f29187d, c2954b2.f29187d)) {
            return false;
        }
        C3812r1 c3812r1 = C3812r1.f33455a;
        return c3812r1.equals(c3812r1);
    }

    public final int hashCode() {
        int hashCode = this.f29184a.hashCode() * 31;
        L0 l02 = this.f29185b;
        return (this.f29187d.hashCode() + ((this.f29188e.hashCode() + ((this.f29186c.hashCode() + ((hashCode + (l02 != null ? l02.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
    }
}

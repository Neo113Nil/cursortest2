package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.b2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2977b2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f29972a;

    /* renamed from: b, reason: collision with root package name */
    public final L0 f29973b;

    /* renamed from: c, reason: collision with root package name */
    public final C4158x0 f29974c;

    /* renamed from: d, reason: collision with root package name */
    public final C3085d3 f29975d;

    /* renamed from: e, reason: collision with root package name */
    public final C f29976e;

    static {
        PB pb = RB.f27933u;
        C3523lC c3523lC = C3523lC.f32525x;
        List list = Collections.EMPTY_LIST;
        C3835r1 c3835r1 = C3835r1.f34222a;
        new C();
        C3085d3 c3085d3 = C3085d3.f30437C;
        String str = AbstractC3182eu.f30782a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ C2977b2(String str, C c9, L0 l02, C4158x0 c4158x0, C3085d3 c3085d3) {
        C3835r1 c3835r1 = C3835r1.f34222a;
        this.f29972a = str;
        this.f29973b = l02;
        this.f29974c = c4158x0;
        this.f29975d = c3085d3;
        this.f29976e = c9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2977b2)) {
            return false;
        }
        C2977b2 c2977b2 = (C2977b2) obj;
        if (!this.f29972a.equals(c2977b2.f29972a) || !this.f29976e.equals(c2977b2.f29976e) || !Objects.equals(this.f29973b, c2977b2.f29973b) || !this.f29974c.equals(c2977b2.f29974c) || !Objects.equals(this.f29975d, c2977b2.f29975d)) {
            return false;
        }
        C3835r1 c3835r1 = C3835r1.f34222a;
        return c3835r1.equals(c3835r1);
    }

    public final int hashCode() {
        int hashCode = this.f29972a.hashCode() * 31;
        L0 l02 = this.f29973b;
        return (this.f29975d.hashCode() + ((this.f29976e.hashCode() + ((this.f29974c.hashCode() + ((hashCode + (l02 != null ? l02.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
    }
}

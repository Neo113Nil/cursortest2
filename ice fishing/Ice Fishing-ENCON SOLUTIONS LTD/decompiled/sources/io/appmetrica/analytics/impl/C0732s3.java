package io.appmetrica.analytics.impl;

import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.s3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0732s3 implements Q7 {

    /* renamed from: a, reason: collision with root package name */
    public final C0706r3 f6880a;

    /* renamed from: b, reason: collision with root package name */
    public final List f6881b;

    public C0732s3(C0706r3 c0706r3, List<C0706r3> list) {
        this.f6880a = c0706r3;
        this.f6881b = list;
    }

    public final C0732s3 a(C0706r3 c0706r3, List<C0706r3> list) {
        return new C0732s3(c0706r3, list);
    }

    @Override // io.appmetrica.analytics.impl.Q7
    public final Object b() {
        return this.f6880a;
    }

    public final C0706r3 c() {
        return this.f6880a;
    }

    public final List<C0706r3> d() {
        return this.f6881b;
    }

    public final C0706r3 e() {
        return this.f6880a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0732s3)) {
            return false;
        }
        C0732s3 c0732s3 = (C0732s3) obj;
        return kotlin.jvm.internal.i.a(this.f6880a, c0732s3.f6880a) && kotlin.jvm.internal.i.a(this.f6881b, c0732s3.f6881b);
    }

    public final int hashCode() {
        return this.f6881b.hashCode() + (this.f6880a.hashCode() * 31);
    }

    public final String toString() {
        return "ClidsInfo(chosen=" + this.f6880a + ", candidates=" + this.f6881b + ')';
    }

    public static C0732s3 a(C0732s3 c0732s3, C0706r3 c0706r3, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            c0706r3 = c0732s3.f6880a;
        }
        if ((i2 & 2) != 0) {
            list = c0732s3.f6881b;
        }
        c0732s3.getClass();
        return new C0732s3(c0706r3, list);
    }

    @Override // io.appmetrica.analytics.impl.Q7
    public final List<C0706r3> a() {
        return this.f6881b;
    }
}

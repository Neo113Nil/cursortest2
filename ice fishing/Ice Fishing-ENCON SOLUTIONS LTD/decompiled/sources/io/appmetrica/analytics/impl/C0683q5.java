package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.q5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0683q5 implements Rc {

    /* renamed from: a, reason: collision with root package name */
    public final String f6767a;

    public C0683q5(String str) {
        this.f6767a = str;
    }

    public final C0683q5 a(String str) {
        return new C0683q5(str);
    }

    public final String b() {
        return this.f6767a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0683q5) && kotlin.jvm.internal.i.a(this.f6767a, ((C0683q5) obj).f6767a);
    }

    public final int hashCode() {
        return this.f6767a.hashCode();
    }

    public final String toString() {
        return "ConstantModuleEntryPointProvider(className=" + this.f6767a + ')';
    }

    public static C0683q5 a(C0683q5 c0683q5, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c0683q5.f6767a;
        }
        c0683q5.getClass();
        return new C0683q5(str);
    }

    @Override // io.appmetrica.analytics.impl.Rc
    public final String a() {
        return this.f6767a;
    }
}

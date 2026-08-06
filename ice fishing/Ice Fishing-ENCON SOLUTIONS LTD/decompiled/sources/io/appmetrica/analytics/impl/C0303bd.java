package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.bd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0303bd {

    /* renamed from: a, reason: collision with root package name */
    public final String f5667a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5668b;

    public C0303bd(String str, boolean z2) {
        this.f5667a = str;
        this.f5668b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0303bd)) {
            return false;
        }
        C0303bd c0303bd = (C0303bd) obj;
        return kotlin.jvm.internal.i.a(this.f5667a, c0303bd.f5667a) && this.f5668b == c0303bd.f5668b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f5667a.hashCode() * 31;
        boolean z2 = this.f5668b;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ModuleStatus(moduleName=" + this.f5667a + ", loaded=" + this.f5668b + ')';
    }
}

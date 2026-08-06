package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Z3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f5463a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f5464b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5465c;

    public Z3(String str, Integer num, String str2) {
        this.f5463a = str;
        this.f5464b = num;
        this.f5465c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Z3.class != obj.getClass()) {
            return false;
        }
        Z3 z3 = (Z3) obj;
        if (!this.f5463a.equals(z3.f5463a)) {
            return false;
        }
        Integer num = this.f5464b;
        if (num == null ? z3.f5464b != null : !num.equals(z3.f5464b)) {
            return false;
        }
        String str = this.f5465c;
        String str2 = z3.f5465c;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public final int hashCode() {
        int hashCode = this.f5463a.hashCode() * 31;
        Integer num = this.f5464b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.f5465c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }
}

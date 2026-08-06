package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;

/* loaded from: classes.dex */
public class Q4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4950a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4951b;

    public Q4(String str, String str2) {
        this.f4950a = str;
        this.f4951b = str2;
    }

    public final String a() {
        return ApiKeyUtils.createPartialApiKey(this.f4951b);
    }

    public final String b() {
        return this.f4951b;
    }

    public final String c() {
        return this.f4950a;
    }

    public boolean d() {
        return false;
    }

    public String e() {
        return this.f4950a + "_" + ApiKeyUtils.createPartialApiKey(this.f4951b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Q4 q4 = (Q4) obj;
        String str = this.f4950a;
        if (str == null ? q4.f4950a != null : !str.equals(q4.f4950a)) {
            return false;
        }
        String str2 = this.f4951b;
        String str3 = q4.f4951b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public final int hashCode() {
        String str = this.f4950a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f4951b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return this.f4950a + "_" + this.f4951b;
    }
}

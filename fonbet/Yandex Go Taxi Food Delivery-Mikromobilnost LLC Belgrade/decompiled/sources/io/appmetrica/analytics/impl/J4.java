package io.appmetrica.analytics.impl;

import defpackage.unr0;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* loaded from: classes9.dex */
public final class J4 {
    public final String a;
    public final String b;
    public final Integer c;
    public final String d;
    public final CounterConfigurationReporterType e;

    public J4(String str, String str2, Integer num, String str3, CounterConfigurationReporterType counterConfigurationReporterType) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = str3;
        this.e = counterConfigurationReporterType;
    }

    public static J4 a(B4 b4) {
        return new J4(b4.b.getApiKey(), b4.a.a.getAsString("PROCESS_CFG_PACKAGE_NAME"), b4.a.a.getAsInteger("PROCESS_CFG_PROCESS_ID"), b4.a.a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), b4.b.getReporterType());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && J4.class == obj.getClass()) {
            J4 j4 = (J4) obj;
            String str = this.a;
            String str2 = j4.a;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            if (!this.b.equals(j4.b)) {
                return false;
            }
            Integer num = this.c;
            Integer num2 = j4.c;
            if (num == null ? num2 != null : !num.equals(num2)) {
                return false;
            }
            String str3 = this.d;
            String str4 = j4.d;
            if (str3 == null ? str4 != null : !str3.equals(str4)) {
                return false;
            }
            if (this.e == j4.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int b = unr0.b((str != null ? str.hashCode() : 0) * 31, 31, this.b);
        Integer num = this.c;
        int hashCode = (b + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.d;
        return this.e.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ClientDescription{mApiKey='" + this.a + "', mPackageName='" + this.b + "', mProcessID=" + this.c + ", mProcessSessionID='" + this.d + "', mReporterType=" + this.e + '}';
    }
}

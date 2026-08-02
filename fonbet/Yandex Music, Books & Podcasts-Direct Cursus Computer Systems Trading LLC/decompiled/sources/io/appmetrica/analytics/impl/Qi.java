package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes5.dex */
public final class Qi {
    public final String a;
    public final long b;
    public final long c;
    public final Pi d;

    public Qi(byte[] bArr) {
        Ri a = Ri.a(bArr);
        this.a = a.a;
        this.b = a.c;
        this.c = a.b;
        this.d = a(a.d);
    }

    public final byte[] a() {
        Ri ri = new Ri();
        ri.a = this.a;
        ri.c = this.b;
        ri.b = this.c;
        int ordinal = this.d.ordinal();
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 0;
            }
        }
        ri.d = i;
        return MessageNano.toByteArray(ri);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Qi.class == obj.getClass()) {
            Qi qi = (Qi) obj;
            if (this.b == qi.b && this.c == qi.c && this.a.equals(qi.a) && this.d == qi.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        long j = this.b;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        return this.d.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final String toString() {
        return "ReferrerInfo{installReferrer='" + this.a + "', referrerClickTimestampSeconds=" + this.b + ", installBeginTimestampSeconds=" + this.c + ", source=" + this.d + '}';
    }

    public Qi(String str, long j, long j2, Pi pi) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = pi;
    }

    public static Pi a(int i) {
        if (i == 1) {
            return Pi.c;
        }
        if (i != 2) {
            return Pi.b;
        }
        return Pi.d;
    }
}

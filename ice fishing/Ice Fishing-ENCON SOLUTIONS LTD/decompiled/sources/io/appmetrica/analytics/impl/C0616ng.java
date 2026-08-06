package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.ng, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0616ng {

    /* renamed from: a, reason: collision with root package name */
    public final String f6624a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6625b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6626c;

    /* renamed from: d, reason: collision with root package name */
    public final EnumC0590mg f6627d;

    public C0616ng(byte[] bArr) {
        C0642og a2 = C0642og.a(bArr);
        this.f6624a = a2.f6683a;
        this.f6625b = a2.f6685c;
        this.f6626c = a2.f6684b;
        this.f6627d = a(a2.f6686d);
    }

    public final byte[] a() {
        C0642og c0642og = new C0642og();
        c0642og.f6683a = this.f6624a;
        c0642og.f6685c = this.f6625b;
        c0642og.f6684b = this.f6626c;
        int ordinal = this.f6627d.ordinal();
        int i2 = 1;
        if (ordinal != 1) {
            i2 = 2;
            if (ordinal != 2) {
                i2 = 0;
            }
        }
        c0642og.f6686d = i2;
        return MessageNano.toByteArray(c0642og);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0616ng.class != obj.getClass()) {
            return false;
        }
        C0616ng c0616ng = (C0616ng) obj;
        return this.f6625b == c0616ng.f6625b && this.f6626c == c0616ng.f6626c && this.f6624a.equals(c0616ng.f6624a) && this.f6627d == c0616ng.f6627d;
    }

    public final int hashCode() {
        int hashCode = this.f6624a.hashCode() * 31;
        long j2 = this.f6625b;
        int i2 = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f6626c;
        return this.f6627d.hashCode() + ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31);
    }

    public final String toString() {
        return "ReferrerInfo{installReferrer='" + this.f6624a + "', referrerClickTimestampSeconds=" + this.f6625b + ", installBeginTimestampSeconds=" + this.f6626c + ", source=" + this.f6627d + '}';
    }

    public C0616ng(String str, long j2, long j3, EnumC0590mg enumC0590mg) {
        this.f6624a = str;
        this.f6625b = j2;
        this.f6626c = j3;
        this.f6627d = enumC0590mg;
    }

    public static EnumC0590mg a(int i2) {
        if (i2 == 1) {
            return EnumC0590mg.f6520c;
        }
        if (i2 != 2) {
            return EnumC0590mg.f6519b;
        }
        return EnumC0590mg.f6521d;
    }
}

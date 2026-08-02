package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes4.dex */
public final class Ui {
    public final String a;
    public final long b;
    public final long c;
    public final int d;

    public Ui(byte[] bArr) {
        Vi a = Vi.a(bArr);
        this.a = a.a;
        this.b = a.c;
        this.c = a.b;
        this.d = a(a.d);
    }

    public final byte[] a() {
        Vi vi = new Vi();
        vi.a = this.a;
        vi.c = this.b;
        vi.b = this.c;
        int a = I8.a(this.d);
        int i = 1;
        if (a != 1) {
            i = 2;
            if (a != 2) {
                i = 3;
                if (a != 3) {
                    i = 0;
                }
            }
        }
        vi.d = i;
        return MessageNano.toByteArray(vi);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Ui.class == obj.getClass()) {
            Ui ui = (Ui) obj;
            if (this.b == ui.b && this.c == ui.c && this.a.equals(ui.a) && this.d == ui.d) {
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
        return I8.a(this.d) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final String toString() {
        return "ReferrerInfo{installReferrer='" + this.a + "', referrerClickTimestampSeconds=" + this.b + ", installBeginTimestampSeconds=" + this.c + ", source=" + Ti.b(this.d) + '}';
    }

    public Ui(String str, long j, long j2, int i) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = i;
    }

    public static int a(int i) {
        if (i != 1) {
            if (i != 2) {
                return i != 3 ? 1 : 4;
            }
            return 3;
        }
        return 2;
    }
}

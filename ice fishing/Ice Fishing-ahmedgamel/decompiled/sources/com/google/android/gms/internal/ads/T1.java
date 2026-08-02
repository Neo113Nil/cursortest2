package com.google.android.gms.internal.ads;

import java.util.Objects;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class T1 implements InterfaceC3945t3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f28455a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28456b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28457c;

    /* renamed from: d, reason: collision with root package name */
    public final String f28458d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f28459e;

    /* renamed from: f, reason: collision with root package name */
    public final int f28460f;

    public T1(int i, int i4, String str, String str2, String str3, boolean z6) {
        boolean z9 = true;
        if (i4 != -1 && i4 <= 0) {
            z9 = false;
        }
        AbstractC2792Sd.i(z9);
        this.f28455a = i;
        this.f28456b = str;
        this.f28457c = str2;
        this.f28458d = str3;
        this.f28459e = z6;
        this.f28460f = i4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3945t3
    public final void a(M2 m22) {
        String str = this.f28457c;
        if (str != null) {
            m22.f27025y = str;
        }
        String str2 = this.f28456b;
        if (str2 != null) {
            m22.f27024x = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && T1.class == obj.getClass()) {
            T1 t12 = (T1) obj;
            if (this.f28455a == t12.f28455a && Objects.equals(this.f28456b, t12.f28456b) && Objects.equals(this.f28457c, t12.f28457c) && Objects.equals(this.f28458d, t12.f28458d) && this.f28459e == t12.f28459e && this.f28460f == t12.f28460f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f28456b;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f28457c;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i = ((this.f28455a + 527) * 31) + hashCode;
        String str3 = this.f28458d;
        return (((((((i * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f28459e ? 1 : 0)) * 31) + this.f28460f;
    }

    public final String toString() {
        String str = this.f28457c;
        int length = String.valueOf(str).length();
        String str2 = this.f28456b;
        int length2 = String.valueOf(str2).length();
        int i = this.f28455a;
        int length3 = String.valueOf(i).length();
        int i4 = this.f28460f;
        StringBuilder sb = new StringBuilder(length + 28 + length2 + 11 + length3 + 19 + String.valueOf(i4).length());
        AbstractC5128c.h(sb, "IcyHeaders: name=\"", str, "\", genre=\"", str2);
        return D.x.o(sb, "\", bitrate=", i, ", metadataInterval=", i4);
    }
}

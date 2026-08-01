package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class T1 implements InterfaceC3922t3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f27672a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27673b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27674c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27675d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f27676e;

    /* renamed from: f, reason: collision with root package name */
    public final int f27677f;

    public T1(int i, int i6, String str, String str2, String str3, boolean z3) {
        boolean z6 = true;
        if (i6 != -1 && i6 <= 0) {
            z6 = false;
        }
        AbstractC2772Sd.i(z6);
        this.f27672a = i;
        this.f27673b = str;
        this.f27674c = str2;
        this.f27675d = str3;
        this.f27676e = z3;
        this.f27677f = i6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3922t3
    public final void a(M2 m22) {
        String str = this.f27674c;
        if (str != null) {
            m22.f26234y = str;
        }
        String str2 = this.f27673b;
        if (str2 != null) {
            m22.f26233x = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && T1.class == obj.getClass()) {
            T1 t12 = (T1) obj;
            if (this.f27672a == t12.f27672a && Objects.equals(this.f27673b, t12.f27673b) && Objects.equals(this.f27674c, t12.f27674c) && Objects.equals(this.f27675d, t12.f27675d) && this.f27676e == t12.f27676e && this.f27677f == t12.f27677f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f27673b;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f27674c;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i = ((this.f27672a + 527) * 31) + hashCode;
        String str3 = this.f27675d;
        return (((((((i * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f27676e ? 1 : 0)) * 31) + this.f27677f;
    }

    public final String toString() {
        String str = this.f27674c;
        int length = String.valueOf(str).length();
        String str2 = this.f27673b;
        int length2 = String.valueOf(str2).length();
        int i = this.f27672a;
        int length3 = String.valueOf(i).length();
        int i6 = this.f27677f;
        StringBuilder sb = new StringBuilder(length + 28 + length2 + 11 + length3 + 19 + String.valueOf(i6).length());
        u1.h.i(sb, "IcyHeaders: name=\"", str, "\", genre=\"", str2);
        return D.y.r(sb, "\", bitrate=", i, ", metadataInterval=", i6);
    }
}

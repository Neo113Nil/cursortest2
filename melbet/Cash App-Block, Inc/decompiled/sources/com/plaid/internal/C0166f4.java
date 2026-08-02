package com.plaid.internal;

import android.net.NetworkCapabilities;

/* renamed from: com.plaid.internal.f4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0166f4 {
    public final EnumC0202j4 a;
    public final EnumC0340z b;
    public final EnumC0340z c;
    public final EnumC0340z d;

    public C0166f4(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.hasTransport(0)) {
            this.a = EnumC0202j4.CELLULAR;
        } else if (networkCapabilities.hasTransport(1)) {
            this.a = EnumC0202j4.WIFI;
        } else if (networkCapabilities.hasTransport(3)) {
            this.a = EnumC0202j4.WIRED;
        } else {
            this.a = EnumC0202j4.OTHER;
        }
        this.c = networkCapabilities.hasCapability(12) ? EnumC0340z.YES : EnumC0340z.NO;
        this.b = networkCapabilities.hasCapability(19) ? EnumC0340z.YES : EnumC0340z.NO;
        this.d = networkCapabilities.hasCapability(16) ? EnumC0340z.YES : EnumC0340z.NO;
    }

    public final String toString() {
        return "type=" + this.a.name() + ", foreground=" + this.b + ", internet capable=" + this.c + ", validated=" + this.d;
    }
}

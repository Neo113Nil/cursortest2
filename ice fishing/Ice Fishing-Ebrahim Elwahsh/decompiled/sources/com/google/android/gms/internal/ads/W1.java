package com.google.android.gms.internal.ads;

import java.util.Objects;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class W1 extends Y1 {

    /* renamed from: b, reason: collision with root package name */
    public final String f28344b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28345c;

    /* renamed from: d, reason: collision with root package name */
    public final String f28346d;

    public W1(String str, String str2, String str3) {
        super(com.anythink.basead.exoplayer.g.b.e.f7455a);
        this.f28344b = str;
        this.f28345c = str2;
        this.f28346d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && W1.class == obj.getClass()) {
            W1 w12 = (W1) obj;
            if (Objects.equals(this.f28345c, w12.f28345c) && Objects.equals(this.f28344b, w12.f28344b) && Objects.equals(this.f28346d, w12.f28346d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f28345c.hashCode() + ((this.f28344b.hashCode() + 527) * 31);
        String str = this.f28346d;
        return (hashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.Y1
    public final String toString() {
        String str = this.f28771a;
        int length = String.valueOf(str).length();
        String str2 = this.f28346d;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f28344b;
        int a9 = AbstractC5051n.a(length + 11, 14, str3);
        String str4 = this.f28345c;
        StringBuilder sb = new StringBuilder(str4.length() + a9 + 7 + length2);
        AbstractC5051n.j(sb, str, ": language=", str3, ", description=");
        return D.y.o(sb, str4, ", text=", str2);
    }
}

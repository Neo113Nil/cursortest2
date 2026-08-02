package com.google.android.gms.internal.ads;

import java.util.Objects;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class Y1 extends AbstractC2923a2 {

    /* renamed from: b, reason: collision with root package name */
    public final String f29410b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29411c;

    /* renamed from: d, reason: collision with root package name */
    public final String f29412d;

    public Y1(String str, String str2, String str3) {
        super(com.anythink.basead.exoplayer.g.b.e.f8084a);
        this.f29410b = str;
        this.f29411c = str2;
        this.f29412d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Y1.class == obj.getClass()) {
            Y1 y12 = (Y1) obj;
            if (Objects.equals(this.f29411c, y12.f29411c) && Objects.equals(this.f29410b, y12.f29410b) && Objects.equals(this.f29412d, y12.f29412d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f29411c.hashCode() + ((this.f29410b.hashCode() + 527) * 31);
        String str = this.f29412d;
        return (hashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2923a2
    public final String toString() {
        String str = this.f29779a;
        int length = String.valueOf(str).length();
        String str2 = this.f29412d;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f29410b;
        int j6 = AbstractC5128c.j(length + 11, 14, str3);
        String str4 = this.f29411c;
        StringBuilder sb = new StringBuilder(str4.length() + j6 + 7 + length2);
        AbstractC5128c.h(sb, str, ": language=", str3, ", description=");
        return D.x.p(sb, str4, ", text=", str2);
    }
}

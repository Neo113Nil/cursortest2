package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.d2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3061d2 extends AbstractC2900a2 {

    /* renamed from: b, reason: collision with root package name */
    public final String f29662b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29663c;

    /* renamed from: d, reason: collision with root package name */
    public final String f29664d;

    public C3061d2(String str, String str2, String str3) {
        super(com.anythink.basead.exoplayer.g.b.i.f7327a);
        this.f29662b = str;
        this.f29663c = str2;
        this.f29664d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3061d2.class == obj.getClass()) {
            C3061d2 c3061d2 = (C3061d2) obj;
            if (Objects.equals(this.f29663c, c3061d2.f29663c) && Objects.equals(this.f29662b, c3061d2.f29662b) && Objects.equals(this.f29664d, c3061d2.f29664d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f29664d.hashCode() + ((this.f29663c.hashCode() + ((this.f29662b.hashCode() + 527) * 31)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2900a2
    public final String toString() {
        String str = this.f29009a;
        int length = String.valueOf(str).length() + 9;
        String str2 = this.f29662b;
        int a9 = u1.h.a(length, 14, str2);
        String str3 = this.f29663c;
        StringBuilder sb = new StringBuilder(str3.length() + a9);
        u1.h.i(sb, str, ": domain=", str2, ", description=");
        sb.append(str3);
        return sb.toString();
    }
}

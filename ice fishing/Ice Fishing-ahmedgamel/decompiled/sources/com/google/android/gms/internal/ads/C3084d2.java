package com.google.android.gms.internal.ads;

import java.util.Objects;
import w.AbstractC5128c;

/* renamed from: com.google.android.gms.internal.ads.d2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3084d2 extends AbstractC2923a2 {

    /* renamed from: b, reason: collision with root package name */
    public final String f30434b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30435c;

    /* renamed from: d, reason: collision with root package name */
    public final String f30436d;

    public C3084d2(String str, String str2, String str3) {
        super(com.anythink.basead.exoplayer.g.b.i.f8113a);
        this.f30434b = str;
        this.f30435c = str2;
        this.f30436d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3084d2.class == obj.getClass()) {
            C3084d2 c3084d2 = (C3084d2) obj;
            if (Objects.equals(this.f30435c, c3084d2.f30435c) && Objects.equals(this.f30434b, c3084d2.f30434b) && Objects.equals(this.f30436d, c3084d2.f30436d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f30436d.hashCode() + ((this.f30435c.hashCode() + ((this.f30434b.hashCode() + 527) * 31)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2923a2
    public final String toString() {
        String str = this.f29779a;
        int length = String.valueOf(str).length() + 9;
        String str2 = this.f30434b;
        int j6 = AbstractC5128c.j(length, 14, str2);
        String str3 = this.f30435c;
        StringBuilder sb = new StringBuilder(str3.length() + j6);
        AbstractC5128c.h(sb, str, ": domain=", str2, ", description=");
        sb.append(str3);
        return sb.toString();
    }
}

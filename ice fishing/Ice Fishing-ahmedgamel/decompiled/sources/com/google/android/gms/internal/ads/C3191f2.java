package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.f2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3191f2 extends AbstractC2923a2 {

    /* renamed from: b, reason: collision with root package name */
    public final String f30802b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f30803c;

    public C3191f2(String str, byte[] bArr) {
        super(com.anythink.basead.exoplayer.g.b.j.f8117a);
        this.f30802b = str;
        this.f30803c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3191f2.class == obj.getClass()) {
            C3191f2 c3191f2 = (C3191f2) obj;
            if (Objects.equals(this.f30802b, c3191f2.f30802b) && Arrays.equals(this.f30803c, c3191f2.f30803c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f30803c) + ((this.f30802b.hashCode() + 527) * 31);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2923a2
    public final String toString() {
        String str = this.f29779a;
        int length = String.valueOf(str).length() + 8;
        String str2 = this.f30802b;
        return D.x.p(new StringBuilder(str2.length() + length), str, ": owner=", str2);
    }
}

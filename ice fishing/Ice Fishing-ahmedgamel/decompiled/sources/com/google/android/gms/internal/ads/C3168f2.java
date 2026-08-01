package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.f2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3168f2 extends AbstractC2900a2 {

    /* renamed from: b, reason: collision with root package name */
    public final String f30015b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f30016c;

    public C3168f2(String str, byte[] bArr) {
        super(com.anythink.basead.exoplayer.g.b.j.f7331a);
        this.f30015b = str;
        this.f30016c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3168f2.class == obj.getClass()) {
            C3168f2 c3168f2 = (C3168f2) obj;
            if (Objects.equals(this.f30015b, c3168f2.f30015b) && Arrays.equals(this.f30016c, c3168f2.f30016c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f30016c) + ((this.f30015b.hashCode() + 527) * 31);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2900a2
    public final String toString() {
        String str = this.f29009a;
        int length = String.valueOf(str).length() + 8;
        String str2 = this.f30015b;
        return D.y.s(new StringBuilder(str2.length() + length), str, ": owner=", str2);
    }
}

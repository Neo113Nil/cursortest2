package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class V1 extends AbstractC2923a2 {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f28860b;

    public V1(String str, byte[] bArr) {
        super(str);
        this.f28860b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && V1.class == obj.getClass()) {
            V1 v12 = (V1) obj;
            if (this.f29779a.equals(v12.f29779a) && Arrays.equals(this.f28860b, v12.f28860b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f28860b) + ((this.f29779a.hashCode() + 527) * 31);
    }
}

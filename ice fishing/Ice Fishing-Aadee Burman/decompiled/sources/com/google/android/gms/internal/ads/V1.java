package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class V1 extends AbstractC2900a2 {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f28063b;

    public V1(String str, byte[] bArr) {
        super(str);
        this.f28063b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && V1.class == obj.getClass()) {
            V1 v12 = (V1) obj;
            if (this.f29009a.equals(v12.f29009a) && Arrays.equals(this.f28063b, v12.f28063b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f28063b) + ((this.f29009a.hashCode() + 527) * 31);
    }
}

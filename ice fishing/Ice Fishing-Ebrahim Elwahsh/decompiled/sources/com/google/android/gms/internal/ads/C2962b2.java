package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.b2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2962b2 extends Y1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f29381b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29382c;

    /* renamed from: d, reason: collision with root package name */
    public final int f29383d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f29384e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f29385f;

    public C2962b2(int i, int i4, int i9, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f29381b = i;
        this.f29382c = i4;
        this.f29383d = i9;
        this.f29384e = iArr;
        this.f29385f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2962b2.class == obj.getClass()) {
            C2962b2 c2962b2 = (C2962b2) obj;
            if (this.f29381b == c2962b2.f29381b && this.f29382c == c2962b2.f29382c && this.f29383d == c2962b2.f29383d && Arrays.equals(this.f29384e, c2962b2.f29384e) && Arrays.equals(this.f29385f, c2962b2.f29385f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f29385f) + ((Arrays.hashCode(this.f29384e) + ((((((this.f29381b + 527) * 31) + this.f29382c) * 31) + this.f29383d) * 31)) * 31);
    }
}

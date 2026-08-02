package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class X1 extends AbstractC2923a2 {

    /* renamed from: b, reason: collision with root package name */
    public final String f29246b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f29247c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f29248d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f29249e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC2923a2[] f29250f;

    public X1(String str, boolean z6, boolean z9, String[] strArr, AbstractC2923a2[] abstractC2923a2Arr) {
        super(com.anythink.basead.exoplayer.g.b.d.f8078a);
        this.f29246b = str;
        this.f29247c = z6;
        this.f29248d = z9;
        this.f29249e = strArr;
        this.f29250f = abstractC2923a2Arr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && X1.class == obj.getClass()) {
            X1 x12 = (X1) obj;
            if (this.f29247c == x12.f29247c && this.f29248d == x12.f29248d && Objects.equals(this.f29246b, x12.f29246b) && Arrays.equals(this.f29249e, x12.f29249e) && Arrays.equals(this.f29250f, x12.f29250f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f29246b.hashCode() + (((((this.f29247c ? 1 : 0) + 527) * 31) + (this.f29248d ? 1 : 0)) * 31);
    }
}

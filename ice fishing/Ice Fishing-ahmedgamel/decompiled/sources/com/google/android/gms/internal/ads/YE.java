package com.google.android.gms.internal.ads;

import java.util.Objects;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class YE extends AbstractC4280zE {

    /* renamed from: a, reason: collision with root package name */
    public final String f29437a;

    /* renamed from: b, reason: collision with root package name */
    public final C3902sE f29438b;

    public YE(String str, C3902sE c3902sE) {
        this.f29437a = str;
        this.f29438b = c3902sE;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3848rE
    public final boolean a() {
        return this.f29438b != C3902sE.f34685l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof YE)) {
            return false;
        }
        YE ye = (YE) obj;
        return ye.f29437a.equals(this.f29437a) && ye.f29438b.equals(this.f29438b);
    }

    public final int hashCode() {
        return Objects.hash(YE.class, this.f29437a, this.f29438b);
    }

    public final String toString() {
        String str = this.f29438b.f34696b;
        String str2 = this.f29437a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 45 + str.length() + 1);
        AbstractC5128c.h(sb, "LegacyKmsAead Parameters (keyUri: ", str2, ", variant: ", str);
        sb.append(")");
        return sb.toString();
    }
}

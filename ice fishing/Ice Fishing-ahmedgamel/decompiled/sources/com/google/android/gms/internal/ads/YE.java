package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class YE extends AbstractC4257zE {

    /* renamed from: a, reason: collision with root package name */
    public final String f28660a;

    /* renamed from: b, reason: collision with root package name */
    public final C3879sE f28661b;

    public YE(String str, C3879sE c3879sE) {
        this.f28660a = str;
        this.f28661b = c3879sE;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3825rE
    public final boolean a() {
        return this.f28661b != C3879sE.f33917l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof YE)) {
            return false;
        }
        YE ye = (YE) obj;
        return ye.f28660a.equals(this.f28660a) && ye.f28661b.equals(this.f28661b);
    }

    public final int hashCode() {
        return Objects.hash(YE.class, this.f28660a, this.f28661b);
    }

    public final String toString() {
        String str = this.f28661b.f33928b;
        String str2 = this.f28660a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 45 + str.length() + 1);
        u1.h.i(sb, "LegacyKmsAead Parameters (keyUri: ", str2, ", variant: ", str);
        sb.append(")");
        return sb.toString();
    }
}

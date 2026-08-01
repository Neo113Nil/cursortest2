package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class H2 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC4307c2 f35525a;

    /* renamed from: b, reason: collision with root package name */
    public final String f35526b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f35527c;

    /* renamed from: d, reason: collision with root package name */
    public final int f35528d;

    public H2(AbstractC4307c2 abstractC4307c2, String str, Object[] objArr) {
        this.f35525a = abstractC4307c2;
        this.f35526b = str;
        this.f35527c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f35528d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i6 = 13;
        int i9 = 1;
        while (true) {
            int i10 = i9 + 1;
            char charAt2 = str.charAt(i9);
            if (charAt2 < 55296) {
                this.f35528d = i | (charAt2 << i6);
                return;
            } else {
                i |= (charAt2 & 8191) << i6;
                i6 += 13;
                i9 = i10;
            }
        }
    }

    public final int a() {
        int i = this.f35528d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}

package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class H2 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC4320c2 f35688a;

    /* renamed from: b, reason: collision with root package name */
    public final String f35689b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f35690c;

    /* renamed from: d, reason: collision with root package name */
    public final int f35691d;

    public H2(AbstractC4320c2 abstractC4320c2, String str, Object[] objArr) {
        this.f35688a = abstractC4320c2;
        this.f35689b = str;
        this.f35690c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f35691d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i4 = 13;
        int i9 = 1;
        while (true) {
            int i10 = i9 + 1;
            char charAt2 = str.charAt(i9);
            if (charAt2 < 55296) {
                this.f35691d = i | (charAt2 << i4);
                return;
            } else {
                i |= (charAt2 & 8191) << i4;
                i4 += 13;
                i9 = i10;
            }
        }
    }

    public final int a() {
        int i = this.f35691d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}

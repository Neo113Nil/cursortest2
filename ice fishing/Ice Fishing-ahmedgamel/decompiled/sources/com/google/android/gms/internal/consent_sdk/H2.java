package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes2.dex */
public final class H2 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC4330c2 f36294a;

    /* renamed from: b, reason: collision with root package name */
    public final String f36295b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f36296c;

    /* renamed from: d, reason: collision with root package name */
    public final int f36297d;

    public H2(AbstractC4330c2 abstractC4330c2, String str, Object[] objArr) {
        this.f36294a = abstractC4330c2;
        this.f36295b = str;
        this.f36296c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f36297d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i4 = 13;
        int i6 = 1;
        while (true) {
            int i9 = i6 + 1;
            char charAt2 = str.charAt(i6);
            if (charAt2 < 55296) {
                this.f36297d = i | (charAt2 << i4);
                return;
            } else {
                i |= (charAt2 & 8191) << i4;
                i4 += 13;
                i6 = i9;
            }
        }
    }

    public final int a() {
        int i = this.f36297d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}

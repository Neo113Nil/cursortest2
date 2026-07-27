package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4264zL {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC4263zK f35314a;

    /* renamed from: b, reason: collision with root package name */
    public final String f35315b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f35316c;

    /* renamed from: d, reason: collision with root package name */
    public final int f35317d;

    public C4264zL(AbstractC4263zK abstractC4263zK, String str, Object[] objArr) {
        this.f35314a = abstractC4263zK;
        this.f35315b = str;
        this.f35316c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f35317d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i6 = 13;
        int i9 = 1;
        while (true) {
            int i10 = i9 + 1;
            char charAt2 = str.charAt(i9);
            if (charAt2 < 55296) {
                this.f35317d = i | (charAt2 << i6);
                return;
            } else {
                i |= (charAt2 & 8191) << i6;
                i6 += 13;
                i9 = i10;
            }
        }
    }

    public final int a() {
        int i = this.f35317d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}

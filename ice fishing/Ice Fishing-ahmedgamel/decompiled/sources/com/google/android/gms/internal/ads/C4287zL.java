package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4287zL {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC4286zK f36098a;

    /* renamed from: b, reason: collision with root package name */
    public final String f36099b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f36100c;

    /* renamed from: d, reason: collision with root package name */
    public final int f36101d;

    public C4287zL(AbstractC4286zK abstractC4286zK, String str, Object[] objArr) {
        this.f36098a = abstractC4286zK;
        this.f36099b = str;
        this.f36100c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f36101d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i4 = 13;
        int i6 = 1;
        while (true) {
            int i9 = i6 + 1;
            char charAt2 = str.charAt(i6);
            if (charAt2 < 55296) {
                this.f36101d = i | (charAt2 << i4);
                return;
            } else {
                i |= (charAt2 & 8191) << i4;
                i4 += 13;
                i6 = i9;
            }
        }
    }

    public final int a() {
        int i = this.f36101d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}

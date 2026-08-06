package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0122w f2351a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2352b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f2353c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2354d;

    public V(AbstractC0122w abstractC0122w, String str, Object[] objArr) {
        this.f2351a = abstractC0122w;
        this.f2352b = str;
        this.f2353c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f2354d = charAt;
            return;
        }
        int i2 = charAt & 8191;
        int i3 = 1;
        int i4 = 13;
        while (true) {
            int i5 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.f2354d = i2 | (charAt2 << i4);
                return;
            } else {
                i2 |= (charAt2 & 8191) << i4;
                i4 += 13;
                i3 = i5;
            }
        }
    }

    public final AbstractC0101a a() {
        return this.f2351a;
    }

    public final Object[] b() {
        return this.f2353c;
    }

    public final String c() {
        return this.f2352b;
    }

    public final int d() {
        int i2 = this.f2354d;
        if ((i2 & 1) != 0) {
            return 1;
        }
        return (i2 & 4) == 4 ? 3 : 2;
    }
}

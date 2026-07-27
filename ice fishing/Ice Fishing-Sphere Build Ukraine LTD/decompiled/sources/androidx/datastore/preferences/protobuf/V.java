package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0092w f1399a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1400b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f1401c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1402d;

    public V(AbstractC0092w abstractC0092w, String str, Object[] objArr) {
        this.f1399a = abstractC0092w;
        this.f1400b = str;
        this.f1401c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f1402d = charAt;
            return;
        }
        int i2 = charAt & 8191;
        int i3 = 1;
        int i4 = 13;
        while (true) {
            int i5 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.f1402d = i2 | (charAt2 << i4);
                return;
            } else {
                i2 |= (charAt2 & 8191) << i4;
                i4 += 13;
                i3 = i5;
            }
        }
    }

    public final AbstractC0071a a() {
        return this.f1399a;
    }

    public final Object[] b() {
        return this.f1401c;
    }

    public final String c() {
        return this.f1400b;
    }

    public final int d() {
        int i2 = this.f1402d;
        if ((i2 & 1) != 0) {
            return 1;
        }
        return (i2 & 4) == 4 ? 3 : 2;
    }
}

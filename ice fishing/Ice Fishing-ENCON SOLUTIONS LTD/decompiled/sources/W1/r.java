package W1;

import i1.AbstractC0251h;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f1898a;

    /* renamed from: b, reason: collision with root package name */
    public int f1899b;

    /* renamed from: c, reason: collision with root package name */
    public int f1900c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1901d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1902e;

    /* renamed from: f, reason: collision with root package name */
    public r f1903f;

    /* renamed from: g, reason: collision with root package name */
    public r f1904g;

    public r() {
        this.f1898a = new byte[8192];
        this.f1902e = true;
        this.f1901d = false;
    }

    public final r a() {
        r rVar = this.f1903f;
        if (rVar == this) {
            rVar = null;
        }
        r rVar2 = this.f1904g;
        kotlin.jvm.internal.i.b(rVar2);
        rVar2.f1903f = this.f1903f;
        r rVar3 = this.f1903f;
        kotlin.jvm.internal.i.b(rVar3);
        rVar3.f1904g = this.f1904g;
        this.f1903f = null;
        this.f1904g = null;
        return rVar;
    }

    public final void b(r segment) {
        kotlin.jvm.internal.i.e(segment, "segment");
        segment.f1904g = this;
        segment.f1903f = this.f1903f;
        r rVar = this.f1903f;
        kotlin.jvm.internal.i.b(rVar);
        rVar.f1904g = segment;
        this.f1903f = segment;
    }

    public final r c() {
        this.f1901d = true;
        return new r(this.f1898a, this.f1899b, this.f1900c, true);
    }

    public final void d(r sink, int i2) {
        kotlin.jvm.internal.i.e(sink, "sink");
        if (!sink.f1902e) {
            throw new IllegalStateException("only owner can write");
        }
        int i3 = sink.f1900c;
        int i4 = i3 + i2;
        byte[] bArr = sink.f1898a;
        if (i4 > 8192) {
            if (sink.f1901d) {
                throw new IllegalArgumentException();
            }
            int i5 = sink.f1899b;
            if (i4 - i5 > 8192) {
                throw new IllegalArgumentException();
            }
            AbstractC0251h.M(0, i5, i3, bArr, bArr);
            sink.f1900c -= sink.f1899b;
            sink.f1899b = 0;
        }
        int i6 = sink.f1900c;
        int i7 = this.f1899b;
        AbstractC0251h.M(i6, i7, i7 + i2, this.f1898a, bArr);
        sink.f1900c += i2;
        this.f1899b += i2;
    }

    public r(byte[] data, int i2, int i3, boolean z2) {
        kotlin.jvm.internal.i.e(data, "data");
        this.f1898a = data;
        this.f1899b = i2;
        this.f1900c = i3;
        this.f1901d = z2;
        this.f1902e = false;
    }
}

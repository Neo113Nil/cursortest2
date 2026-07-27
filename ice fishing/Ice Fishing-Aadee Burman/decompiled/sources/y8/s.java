package y8;

import v7.AbstractC5128i;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f41984a;

    /* renamed from: b, reason: collision with root package name */
    public int f41985b;

    /* renamed from: c, reason: collision with root package name */
    public int f41986c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f41987d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f41988e;

    /* renamed from: f, reason: collision with root package name */
    public s f41989f;

    /* renamed from: g, reason: collision with root package name */
    public s f41990g;

    public s() {
        this.f41984a = new byte[8192];
        this.f41988e = true;
        this.f41987d = false;
    }

    public final s a() {
        s sVar = this.f41989f;
        if (sVar == this) {
            sVar = null;
        }
        s sVar2 = this.f41990g;
        kotlin.jvm.internal.h.b(sVar2);
        sVar2.f41989f = this.f41989f;
        s sVar3 = this.f41989f;
        kotlin.jvm.internal.h.b(sVar3);
        sVar3.f41990g = this.f41990g;
        this.f41989f = null;
        this.f41990g = null;
        return sVar;
    }

    public final void b(s segment) {
        kotlin.jvm.internal.h.e(segment, "segment");
        segment.f41990g = this;
        segment.f41989f = this.f41989f;
        s sVar = this.f41989f;
        kotlin.jvm.internal.h.b(sVar);
        sVar.f41990g = segment;
        this.f41989f = segment;
    }

    public final s c() {
        this.f41987d = true;
        return new s(this.f41984a, this.f41985b, this.f41986c, true);
    }

    public final void d(s sink, int i) {
        kotlin.jvm.internal.h.e(sink, "sink");
        if (!sink.f41988e) {
            throw new IllegalStateException("only owner can write");
        }
        int i6 = sink.f41986c;
        int i9 = i6 + i;
        byte[] bArr = sink.f41984a;
        if (i9 > 8192) {
            if (sink.f41987d) {
                throw new IllegalArgumentException();
            }
            int i10 = sink.f41985b;
            if (i9 - i10 > 8192) {
                throw new IllegalArgumentException();
            }
            AbstractC5128i.s(bArr, 0, bArr, i10, i6);
            sink.f41986c -= sink.f41985b;
            sink.f41985b = 0;
        }
        int i11 = sink.f41986c;
        int i12 = this.f41985b;
        AbstractC5128i.s(this.f41984a, i11, bArr, i12, i12 + i);
        sink.f41986c += i;
        this.f41985b += i;
    }

    public s(byte[] data, int i, int i6, boolean z3) {
        kotlin.jvm.internal.h.e(data, "data");
        this.f41984a = data;
        this.f41985b = i;
        this.f41986c = i6;
        this.f41987d = z3;
        this.f41988e = false;
    }
}

package u8;

import r7.AbstractC4978i;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f41311a;

    /* renamed from: b, reason: collision with root package name */
    public int f41312b;

    /* renamed from: c, reason: collision with root package name */
    public int f41313c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f41314d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f41315e;

    /* renamed from: f, reason: collision with root package name */
    public s f41316f;

    /* renamed from: g, reason: collision with root package name */
    public s f41317g;

    public s() {
        this.f41311a = new byte[8192];
        this.f41315e = true;
        this.f41314d = false;
    }

    public final s a() {
        s sVar = this.f41316f;
        if (sVar == this) {
            sVar = null;
        }
        s sVar2 = this.f41317g;
        kotlin.jvm.internal.h.b(sVar2);
        sVar2.f41316f = this.f41316f;
        s sVar3 = this.f41316f;
        kotlin.jvm.internal.h.b(sVar3);
        sVar3.f41317g = this.f41317g;
        this.f41316f = null;
        this.f41317g = null;
        return sVar;
    }

    public final void b(s segment) {
        kotlin.jvm.internal.h.e(segment, "segment");
        segment.f41317g = this;
        segment.f41316f = this.f41316f;
        s sVar = this.f41316f;
        kotlin.jvm.internal.h.b(sVar);
        sVar.f41317g = segment;
        this.f41316f = segment;
    }

    public final s c() {
        this.f41314d = true;
        return new s(this.f41311a, this.f41312b, this.f41313c, true);
    }

    public final void d(s sink, int i) {
        kotlin.jvm.internal.h.e(sink, "sink");
        if (!sink.f41315e) {
            throw new IllegalStateException("only owner can write");
        }
        int i4 = sink.f41313c;
        int i9 = i4 + i;
        byte[] bArr = sink.f41311a;
        if (i9 > 8192) {
            if (sink.f41314d) {
                throw new IllegalArgumentException();
            }
            int i10 = sink.f41312b;
            if (i9 - i10 > 8192) {
                throw new IllegalArgumentException();
            }
            AbstractC4978i.J(bArr, 0, bArr, i10, i4);
            sink.f41313c -= sink.f41312b;
            sink.f41312b = 0;
        }
        int i11 = sink.f41313c;
        int i12 = this.f41312b;
        AbstractC4978i.J(this.f41311a, i11, bArr, i12, i12 + i);
        sink.f41313c += i;
        this.f41312b += i;
    }

    public s(byte[] data, int i, int i4, boolean z8) {
        kotlin.jvm.internal.h.e(data, "data");
        this.f41311a = data;
        this.f41312b = i;
        this.f41313c = i4;
        this.f41314d = z8;
        this.f41315e = false;
    }
}

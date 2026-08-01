package y8;

import v7.AbstractC5128i;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f41987a;

    /* renamed from: b, reason: collision with root package name */
    public int f41988b;

    /* renamed from: c, reason: collision with root package name */
    public int f41989c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f41990d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f41991e;

    /* renamed from: f, reason: collision with root package name */
    public s f41992f;

    /* renamed from: g, reason: collision with root package name */
    public s f41993g;

    public s() {
        this.f41987a = new byte[8192];
        this.f41991e = true;
        this.f41990d = false;
    }

    public final s a() {
        s sVar = this.f41992f;
        if (sVar == this) {
            sVar = null;
        }
        s sVar2 = this.f41993g;
        kotlin.jvm.internal.h.b(sVar2);
        sVar2.f41992f = this.f41992f;
        s sVar3 = this.f41992f;
        kotlin.jvm.internal.h.b(sVar3);
        sVar3.f41993g = this.f41993g;
        this.f41992f = null;
        this.f41993g = null;
        return sVar;
    }

    public final void b(s segment) {
        kotlin.jvm.internal.h.e(segment, "segment");
        segment.f41993g = this;
        segment.f41992f = this.f41992f;
        s sVar = this.f41992f;
        kotlin.jvm.internal.h.b(sVar);
        sVar.f41993g = segment;
        this.f41992f = segment;
    }

    public final s c() {
        this.f41990d = true;
        return new s(this.f41987a, this.f41988b, this.f41989c, true);
    }

    public final void d(s sink, int i) {
        kotlin.jvm.internal.h.e(sink, "sink");
        if (!sink.f41991e) {
            throw new IllegalStateException("only owner can write");
        }
        int i6 = sink.f41989c;
        int i9 = i6 + i;
        byte[] bArr = sink.f41987a;
        if (i9 > 8192) {
            if (sink.f41990d) {
                throw new IllegalArgumentException();
            }
            int i10 = sink.f41988b;
            if (i9 - i10 > 8192) {
                throw new IllegalArgumentException();
            }
            AbstractC5128i.s(bArr, 0, bArr, i10, i6);
            sink.f41989c -= sink.f41988b;
            sink.f41988b = 0;
        }
        int i11 = sink.f41989c;
        int i12 = this.f41988b;
        AbstractC5128i.s(this.f41987a, i11, bArr, i12, i12 + i);
        sink.f41989c += i;
        this.f41988b += i;
    }

    public s(byte[] data, int i, int i6, boolean z3) {
        kotlin.jvm.internal.h.e(data, "data");
        this.f41987a = data;
        this.f41988b = i;
        this.f41989c = i6;
        this.f41990d = z3;
        this.f41991e = false;
    }
}

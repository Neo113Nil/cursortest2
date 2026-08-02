package y8;

import v7.AbstractC5118i;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f41958a;

    /* renamed from: b, reason: collision with root package name */
    public int f41959b;

    /* renamed from: c, reason: collision with root package name */
    public int f41960c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f41961d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f41962e;

    /* renamed from: f, reason: collision with root package name */
    public s f41963f;

    /* renamed from: g, reason: collision with root package name */
    public s f41964g;

    public s() {
        this.f41958a = new byte[8192];
        this.f41962e = true;
        this.f41961d = false;
    }

    public final s a() {
        s sVar = this.f41963f;
        if (sVar == this) {
            sVar = null;
        }
        s sVar2 = this.f41964g;
        kotlin.jvm.internal.h.b(sVar2);
        sVar2.f41963f = this.f41963f;
        s sVar3 = this.f41963f;
        kotlin.jvm.internal.h.b(sVar3);
        sVar3.f41964g = this.f41964g;
        this.f41963f = null;
        this.f41964g = null;
        return sVar;
    }

    public final void b(s segment) {
        kotlin.jvm.internal.h.e(segment, "segment");
        segment.f41964g = this;
        segment.f41963f = this.f41963f;
        s sVar = this.f41963f;
        kotlin.jvm.internal.h.b(sVar);
        sVar.f41964g = segment;
        this.f41963f = segment;
    }

    public final s c() {
        this.f41961d = true;
        return new s(this.f41958a, this.f41959b, this.f41960c, true);
    }

    public final void d(s sink, int i) {
        kotlin.jvm.internal.h.e(sink, "sink");
        if (!sink.f41962e) {
            throw new IllegalStateException("only owner can write");
        }
        int i4 = sink.f41960c;
        int i6 = i4 + i;
        byte[] bArr = sink.f41958a;
        if (i6 > 8192) {
            if (sink.f41961d) {
                throw new IllegalArgumentException();
            }
            int i9 = sink.f41959b;
            if (i6 - i9 > 8192) {
                throw new IllegalArgumentException();
            }
            AbstractC5118i.v(bArr, 0, bArr, i9, i4);
            sink.f41960c -= sink.f41959b;
            sink.f41959b = 0;
        }
        int i10 = sink.f41960c;
        int i11 = this.f41959b;
        AbstractC5118i.v(this.f41958a, i10, bArr, i11, i11 + i);
        sink.f41960c += i;
        this.f41959b += i;
    }

    public s(byte[] data, int i, int i4, boolean z6) {
        kotlin.jvm.internal.h.e(data, "data");
        this.f41958a = data;
        this.f41959b = i;
        this.f41960c = i4;
        this.f41961d = z6;
        this.f41962e = false;
    }
}

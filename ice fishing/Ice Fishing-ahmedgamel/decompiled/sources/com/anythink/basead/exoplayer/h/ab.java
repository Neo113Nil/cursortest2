package com.anythink.basead.exoplayer.h;

import com.anythink.basead.exoplayer.ae;

/* loaded from: classes.dex */
public final class ab extends com.anythink.basead.exoplayer.ae {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f8248b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final long f8249c;

    /* renamed from: d, reason: collision with root package name */
    private final long f8250d;

    /* renamed from: e, reason: collision with root package name */
    private final long f8251e;

    /* renamed from: f, reason: collision with root package name */
    private final long f8252f;

    /* renamed from: g, reason: collision with root package name */
    private final long f8253g;

    /* renamed from: h, reason: collision with root package name */
    private final long f8254h;
    private final boolean i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f8255j;

    /* renamed from: k, reason: collision with root package name */
    private final Object f8256k;

    private ab(long j6, boolean z6, boolean z9) {
        this(j6, z6, z9, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r1 > r4) goto L13;
     */
    @Override // com.anythink.basead.exoplayer.ae
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ae.b a(int i, ae.b bVar, boolean z6, long j6) {
        long j9;
        com.anythink.basead.exoplayer.k.a.a(i, 1);
        Object obj = z6 ? this.f8256k : null;
        long j10 = this.f8254h;
        boolean z9 = this.f8255j;
        if (z9 && j6 != 0) {
            long j11 = this.f8252f;
            if (j11 != com.anythink.basead.exoplayer.b.f7168b) {
                j10 += j6;
            }
            j9 = -9223372036854775807L;
            return bVar.a(obj, this.f8249c, this.f8250d, this.i, z9, j9, this.f8252f, this.f8253g);
        }
        j9 = j10;
        return bVar.a(obj, this.f8249c, this.f8250d, this.i, z9, j9, this.f8252f, this.f8253g);
    }

    @Override // com.anythink.basead.exoplayer.ae
    public final int b() {
        return 1;
    }

    @Override // com.anythink.basead.exoplayer.ae
    public final int c() {
        return 1;
    }

    public ab(long j6, boolean z6, boolean z9, Object obj) {
        this(j6, j6, z6, z9, obj, (byte) 0);
    }

    private ab(long j6, long j9, boolean z6, boolean z9, Object obj, byte b9) {
        this(j6, j9, z6, z9, obj);
    }

    private ab(long j6, long j9, boolean z6, boolean z9, Object obj) {
        this.f8249c = com.anythink.basead.exoplayer.b.f7168b;
        this.f8250d = com.anythink.basead.exoplayer.b.f7168b;
        this.f8251e = j6;
        this.f8252f = j9;
        this.f8253g = 0L;
        this.f8254h = 0L;
        this.i = z6;
        this.f8255j = z9;
        this.f8256k = obj;
    }

    @Override // com.anythink.basead.exoplayer.ae
    public final ae.a a(int i, ae.a aVar, boolean z6) {
        com.anythink.basead.exoplayer.k.a.a(i, 1);
        return aVar.a(null, z6 ? f8248b : null, this.f8251e, -this.f8253g);
    }

    @Override // com.anythink.basead.exoplayer.ae
    public final int a(Object obj) {
        return f8248b.equals(obj) ? 0 : -1;
    }
}

package com.anythink.basead.exoplayer.h;

import com.anythink.basead.exoplayer.ae;

/* loaded from: classes.dex */
public final class ab extends com.anythink.basead.exoplayer.ae {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f7462b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final long f7463c;

    /* renamed from: d, reason: collision with root package name */
    private final long f7464d;

    /* renamed from: e, reason: collision with root package name */
    private final long f7465e;

    /* renamed from: f, reason: collision with root package name */
    private final long f7466f;

    /* renamed from: g, reason: collision with root package name */
    private final long f7467g;

    /* renamed from: h, reason: collision with root package name */
    private final long f7468h;
    private final boolean i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f7469j;

    /* renamed from: k, reason: collision with root package name */
    private final Object f7470k;

    private ab(long j6, boolean z3, boolean z6) {
        this(j6, z3, z6, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r1 > r4) goto L13;
     */
    @Override // com.anythink.basead.exoplayer.ae
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ae.b a(int i, ae.b bVar, boolean z3, long j6) {
        long j9;
        com.anythink.basead.exoplayer.k.a.a(i, 1);
        Object obj = z3 ? this.f7470k : null;
        long j10 = this.f7468h;
        boolean z6 = this.f7469j;
        if (z6 && j6 != 0) {
            long j11 = this.f7466f;
            if (j11 != com.anythink.basead.exoplayer.b.f6382b) {
                j10 += j6;
            }
            j9 = -9223372036854775807L;
            return bVar.a(obj, this.f7463c, this.f7464d, this.i, z6, j9, this.f7466f, this.f7467g);
        }
        j9 = j10;
        return bVar.a(obj, this.f7463c, this.f7464d, this.i, z6, j9, this.f7466f, this.f7467g);
    }

    @Override // com.anythink.basead.exoplayer.ae
    public final int b() {
        return 1;
    }

    @Override // com.anythink.basead.exoplayer.ae
    public final int c() {
        return 1;
    }

    public ab(long j6, boolean z3, boolean z6, Object obj) {
        this(j6, j6, z3, z6, obj, (byte) 0);
    }

    private ab(long j6, long j9, boolean z3, boolean z6, Object obj, byte b9) {
        this(j6, j9, z3, z6, obj);
    }

    private ab(long j6, long j9, boolean z3, boolean z6, Object obj) {
        this.f7463c = com.anythink.basead.exoplayer.b.f6382b;
        this.f7464d = com.anythink.basead.exoplayer.b.f6382b;
        this.f7465e = j6;
        this.f7466f = j9;
        this.f7467g = 0L;
        this.f7468h = 0L;
        this.i = z3;
        this.f7469j = z6;
        this.f7470k = obj;
    }

    @Override // com.anythink.basead.exoplayer.ae
    public final ae.a a(int i, ae.a aVar, boolean z3) {
        com.anythink.basead.exoplayer.k.a.a(i, 1);
        return aVar.a(null, z3 ? f7462b : null, this.f7465e, -this.f7467g);
    }

    @Override // com.anythink.basead.exoplayer.ae
    public final int a(Object obj) {
        return f7462b.equals(obj) ? 0 : -1;
    }
}

package com.anythink.basead.exoplayer.h;

import com.anythink.basead.exoplayer.ae;
import com.anythink.basead.exoplayer.k.C0544a;

/* loaded from: classes.dex */
public final class ab extends com.anythink.basead.exoplayer.ae {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f7619b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final long f7620c;

    /* renamed from: d, reason: collision with root package name */
    private final long f7621d;

    /* renamed from: e, reason: collision with root package name */
    private final long f7622e;

    /* renamed from: f, reason: collision with root package name */
    private final long f7623f;

    /* renamed from: g, reason: collision with root package name */
    private final long f7624g;

    /* renamed from: h, reason: collision with root package name */
    private final long f7625h;
    private final boolean i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f7626j;

    /* renamed from: k, reason: collision with root package name */
    private final Object f7627k;

    private ab(long j9, boolean z8, boolean z9) {
        this(j9, z8, z9, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r1 > r4) goto L13;
     */
    @Override // com.anythink.basead.exoplayer.ae
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ae.b a(int i, ae.b bVar, boolean z8, long j9) {
        long j10;
        C0544a.a(i, 1);
        Object obj = z8 ? this.f7627k : null;
        long j11 = this.f7625h;
        boolean z9 = this.f7626j;
        if (z9 && j9 != 0) {
            long j12 = this.f7623f;
            if (j12 != com.anythink.basead.exoplayer.b.f6539b) {
                j11 += j9;
            }
            j10 = -9223372036854775807L;
            return bVar.a(obj, this.f7620c, this.f7621d, this.i, z9, j10, this.f7623f, this.f7624g);
        }
        j10 = j11;
        return bVar.a(obj, this.f7620c, this.f7621d, this.i, z9, j10, this.f7623f, this.f7624g);
    }

    @Override // com.anythink.basead.exoplayer.ae
    public final int b() {
        return 1;
    }

    @Override // com.anythink.basead.exoplayer.ae
    public final int c() {
        return 1;
    }

    public ab(long j9, boolean z8, boolean z9, Object obj) {
        this(j9, j9, z8, z9, obj, (byte) 0);
    }

    private ab(long j9, long j10, boolean z8, boolean z9, Object obj, byte b9) {
        this(j9, j10, z8, z9, obj);
    }

    private ab(long j9, long j10, boolean z8, boolean z9, Object obj) {
        this.f7620c = com.anythink.basead.exoplayer.b.f6539b;
        this.f7621d = com.anythink.basead.exoplayer.b.f6539b;
        this.f7622e = j9;
        this.f7623f = j10;
        this.f7624g = 0L;
        this.f7625h = 0L;
        this.i = z8;
        this.f7626j = z9;
        this.f7627k = obj;
    }

    @Override // com.anythink.basead.exoplayer.ae
    public final ae.a a(int i, ae.a aVar, boolean z8) {
        C0544a.a(i, 1);
        return aVar.a(null, z8 ? f7619b : null, this.f7622e, -this.f7624g);
    }

    @Override // com.anythink.basead.exoplayer.ae
    public final int a(Object obj) {
        return f7619b.equals(obj) ? 0 : -1;
    }
}

package com.anythink.basead.exoplayer.j;

import android.net.Uri;

/* loaded from: classes.dex */
public final class z implements h {

    /* renamed from: a, reason: collision with root package name */
    private final h f8277a;

    /* renamed from: b, reason: collision with root package name */
    private final g f8278b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8279c;

    /* renamed from: d, reason: collision with root package name */
    private long f8280d;

    public z(h hVar, g gVar) {
        this.f8277a = (h) com.anythink.basead.exoplayer.k.a.a(hVar);
        this.f8278b = (g) com.anythink.basead.exoplayer.k.a.a(gVar);
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final long a(k kVar) {
        long a9 = this.f8277a.a(kVar);
        this.f8280d = a9;
        if (a9 == 0) {
            return 0L;
        }
        if (kVar.f8141g == -1 && a9 != -1) {
            kVar = new k(kVar.f8137c, kVar.f8139e, kVar.f8140f, a9, kVar.f8142h, kVar.i);
        }
        this.f8279c = true;
        this.f8278b.a(kVar);
        return this.f8280d;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final void b() {
        try {
            this.f8277a.b();
        } finally {
            if (this.f8279c) {
                this.f8279c = false;
                this.f8278b.a();
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final int a(byte[] bArr, int i, int i6) {
        if (this.f8280d == 0) {
            return -1;
        }
        int a9 = this.f8277a.a(bArr, i, i6);
        if (a9 > 0) {
            this.f8278b.a(bArr, i, a9);
            long j6 = this.f8280d;
            if (j6 != -1) {
                this.f8280d = j6 - a9;
            }
        }
        return a9;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final Uri a() {
        return this.f8277a.a();
    }
}

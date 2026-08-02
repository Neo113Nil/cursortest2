package com.anythink.basead.exoplayer.j;

import android.net.Uri;

/* loaded from: classes.dex */
public final class z implements h {

    /* renamed from: a, reason: collision with root package name */
    private final h f9063a;

    /* renamed from: b, reason: collision with root package name */
    private final g f9064b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9065c;

    /* renamed from: d, reason: collision with root package name */
    private long f9066d;

    public z(h hVar, g gVar) {
        this.f9063a = (h) com.anythink.basead.exoplayer.k.a.a(hVar);
        this.f9064b = (g) com.anythink.basead.exoplayer.k.a.a(gVar);
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final long a(k kVar) {
        long a9 = this.f9063a.a(kVar);
        this.f9066d = a9;
        if (a9 == 0) {
            return 0L;
        }
        if (kVar.f8927g == -1 && a9 != -1) {
            kVar = new k(kVar.f8923c, kVar.f8925e, kVar.f8926f, a9, kVar.f8928h, kVar.i);
        }
        this.f9065c = true;
        this.f9064b.a(kVar);
        return this.f9066d;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final void b() {
        try {
            this.f9063a.b();
        } finally {
            if (this.f9065c) {
                this.f9065c = false;
                this.f9064b.a();
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final int a(byte[] bArr, int i, int i4) {
        if (this.f9066d == 0) {
            return -1;
        }
        int a9 = this.f9063a.a(bArr, i, i4);
        if (a9 > 0) {
            this.f9064b.a(bArr, i, a9);
            long j6 = this.f9066d;
            if (j6 != -1) {
                this.f9066d = j6 - a9;
            }
        }
        return a9;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final Uri a() {
        return this.f9063a.a();
    }
}

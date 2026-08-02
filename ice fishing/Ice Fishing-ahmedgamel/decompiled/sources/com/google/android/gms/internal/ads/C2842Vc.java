package com.google.android.gms.internal.ads;

import android.util.Log;
import h.C4543G;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import u1.InterfaceC5063b;
import u1.InterfaceC5066e;
import y1.C5201b;
import y1.InterfaceC5200a;

/* renamed from: com.google.android.gms.internal.ads.Vc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2842Vc implements InterfaceC5200a {

    /* renamed from: a, reason: collision with root package name */
    public final long f29005a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f29006b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f29007c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f29008d;

    /* renamed from: e, reason: collision with root package name */
    public Object f29009e;

    public /* synthetic */ C2842Vc(g7.m mVar, ArrayList arrayList, long j6, C2874Xc c2874Xc, C2740Pc c2740Pc) {
        this.f29006b = mVar;
        this.f29007c = arrayList;
        this.f29005a = j6;
        this.f29008d = c2874Xc;
        this.f29009e = c2740Pc;
    }

    @Override // y1.InterfaceC5200a
    public File a(InterfaceC5066e interfaceC5066e) {
        String e9 = ((WP) this.f29006b).e(interfaceC5066e);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + e9 + " for for Key: " + interfaceC5066e);
        }
        try {
            C4543G l9 = c().l(e9);
            if (l9 != null) {
                return ((File[]) l9.f37843n)[0];
            }
            return null;
        } catch (IOException e10) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e10);
            return null;
        }
    }

    @Override // y1.InterfaceC5200a
    public void b(InterfaceC5066e interfaceC5066e, l4.g gVar) {
        C5201b c5201b;
        s1.c c9;
        boolean z6;
        String e9 = ((WP) this.f29006b).e(interfaceC5066e);
        LP lp = (LP) this.f29008d;
        synchronized (lp) {
            c5201b = (C5201b) ((HashMap) lp.f26916u).get(e9);
            if (c5201b == null) {
                H1.a aVar = (H1.a) lp.f26917v;
                synchronized (aVar.f1188a) {
                    c5201b = (C5201b) aVar.f1188a.poll();
                }
                if (c5201b == null) {
                    c5201b = new C5201b();
                }
                ((HashMap) lp.f26916u).put(e9, c5201b);
            }
            c5201b.f41890b++;
        }
        c5201b.f41889a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + e9 + " for for Key: " + interfaceC5066e);
            }
            try {
                c9 = c();
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e10);
                }
            }
            if (c9.l(e9) != null) {
                return;
            }
            com.bumptech.glide.manager.n j6 = c9.j(e9);
            if (j6 == null) {
                throw new IllegalStateException("Had two simultaneous puts for: ".concat(e9));
            }
            try {
                if (((InterfaceC5063b) gVar.f38916u).c(gVar.f38917v, j6.c(), (u1.h) gVar.f38918w)) {
                    s1.c.a((s1.c) j6.f24251w, j6, true);
                    j6.f24248n = true;
                }
                if (!z6) {
                    try {
                        j6.a();
                    } catch (IOException unused) {
                    }
                }
            } finally {
                if (!j6.f24248n) {
                    try {
                        j6.a();
                    } catch (IOException unused2) {
                    }
                }
            }
        } finally {
            ((LP) this.f29008d).j(e9);
        }
    }

    public synchronized s1.c c() {
        try {
            if (((s1.c) this.f29009e) == null) {
                this.f29009e = s1.c.A((File) this.f29007c, this.f29005a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (s1.c) this.f29009e;
    }

    public C2842Vc(File file) {
        this.f29008d = new LP(7);
        this.f29007c = file;
        this.f29005a = 262144000L;
        this.f29006b = new WP(7);
    }
}

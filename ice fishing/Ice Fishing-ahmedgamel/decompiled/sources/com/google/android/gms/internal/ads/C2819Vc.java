package com.google.android.gms.internal.ads;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import s1.InterfaceC4967b;
import s1.InterfaceC4970e;
import w1.C5144b;
import w1.InterfaceC5143a;

/* renamed from: com.google.android.gms.internal.ads.Vc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2819Vc implements InterfaceC5143a {

    /* renamed from: n, reason: collision with root package name */
    public final long f28208n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f28209u;

    /* renamed from: v, reason: collision with root package name */
    public final Serializable f28210v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f28211w;

    /* renamed from: x, reason: collision with root package name */
    public Object f28212x;

    public /* synthetic */ C2819Vc(g7.m mVar, ArrayList arrayList, long j6, C2851Xc c2851Xc, C2720Pc c2720Pc) {
        this.f28209u = mVar;
        this.f28210v = arrayList;
        this.f28208n = j6;
        this.f28211w = c2851Xc;
        this.f28212x = c2720Pc;
    }

    public synchronized q1.c a() {
        try {
            if (((q1.c) this.f28212x) == null) {
                this.f28212x = q1.c.A((File) this.f28210v, this.f28208n);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (q1.c) this.f28212x;
    }

    @Override // w1.InterfaceC5143a
    public void b(InterfaceC4970e interfaceC4970e, j4.g gVar) {
        C5144b c5144b;
        q1.c a9;
        boolean z3;
        String b9 = ((k8.b) this.f28209u).b(interfaceC4970e);
        m8.i iVar = (m8.i) this.f28211w;
        synchronized (iVar) {
            c5144b = (C5144b) ((HashMap) iVar.f39362n).get(b9);
            if (c5144b == null) {
                t2.n nVar = (t2.n) iVar.f39363u;
                synchronized (((ArrayDeque) nVar.f40859a)) {
                    c5144b = (C5144b) ((ArrayDeque) nVar.f40859a).poll();
                }
                if (c5144b == null) {
                    c5144b = new C5144b();
                }
                ((HashMap) iVar.f39362n).put(b9, c5144b);
            }
            c5144b.f41650b++;
        }
        c5144b.f41649a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + b9 + " for for Key: " + interfaceC4970e);
            }
            try {
                a9 = a();
            } catch (IOException e9) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e9);
                }
            }
            if (a9.l(b9) != null) {
                return;
            }
            com.bumptech.glide.manager.o j6 = a9.j(b9);
            if (j6 == null) {
                throw new IllegalStateException("Had two simultaneous puts for: ".concat(b9));
            }
            try {
                if (((InterfaceC4967b) gVar.f38404u).d(gVar.f38405v, j6.c(), (s1.h) gVar.f38406w)) {
                    q1.c.a((q1.c) j6.f23466w, j6, true);
                    j6.f23463n = true;
                }
                if (!z3) {
                    try {
                        j6.a();
                    } catch (IOException unused) {
                    }
                }
            } finally {
                if (!j6.f23463n) {
                    try {
                        j6.a();
                    } catch (IOException unused2) {
                    }
                }
            }
        } finally {
            ((m8.i) this.f28211w).g(b9);
        }
    }

    @Override // w1.InterfaceC5143a
    public File m(InterfaceC4970e interfaceC4970e) {
        String b9 = ((k8.b) this.f28209u).b(interfaceC4970e);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + b9 + " for for Key: " + interfaceC4970e);
        }
        try {
            F1.a l9 = a().l(b9);
            if (l9 != null) {
                return ((File[]) l9.f903u)[0];
            }
            return null;
        } catch (IOException e9) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e9);
            return null;
        }
    }

    public C2819Vc(File file) {
        this.f28211w = new m8.i();
        this.f28210v = file;
        this.f28208n = 262144000L;
        this.f28209u = new k8.b(5);
    }
}

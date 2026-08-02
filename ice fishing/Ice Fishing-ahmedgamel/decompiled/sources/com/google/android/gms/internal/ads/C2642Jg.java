package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.Jg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2642Jg implements InterfaceC3636nH {

    /* renamed from: A, reason: collision with root package name */
    public Uri f26469A;

    /* renamed from: B, reason: collision with root package name */
    public volatile X8 f26470B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f26471C = false;

    /* renamed from: D, reason: collision with root package name */
    public boolean f26472D = false;

    /* renamed from: E, reason: collision with root package name */
    public C2994bJ f26473E;

    /* renamed from: n, reason: collision with root package name */
    public final Context f26474n;

    /* renamed from: u, reason: collision with root package name */
    public final C3962tK f26475u;

    /* renamed from: v, reason: collision with root package name */
    public final String f26476v;

    /* renamed from: w, reason: collision with root package name */
    public final int f26477w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f26478x;

    /* renamed from: y, reason: collision with root package name */
    public InputStream f26479y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f26480z;

    public C2642Jg(Context context, C3962tK c3962tK, String str, int i) {
        this.f26474n = context;
        this.f26475u = c3962tK;
        this.f26476v = str;
        this.f26477w = i;
        new AtomicLong(-1L);
        this.f26478x = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33188x2)).booleanValue();
    }

    public final boolean a() {
        if (!this.f26478x) {
            return false;
        }
        C3324ha c3324ha = AbstractC3592ma.f33090m5;
        s2.r rVar = s2.r.f40506e;
        if (!((Boolean) rVar.f40509c.a(c3324ha)).booleanValue() || this.f26471C) {
            return ((Boolean) rVar.f40509c.a(AbstractC3592ma.f33100n5)).booleanValue() && !this.f26472D;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3636nH
    public final long b(C2994bJ c2994bJ) {
        if (this.f26480z) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.f26480z = true;
        Uri uri = c2994bJ.f30067a;
        this.f26469A = uri;
        this.f26473E = c2994bJ;
        this.f26470B = X8.a(uri);
        C3324ha c3324ha = AbstractC3592ma.f33062j5;
        s2.r rVar = s2.r.f40506e;
        U8 u82 = null;
        if (!((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            if (this.f26470B != null) {
                this.f26470B.f29273A = c2994bJ.f30069c;
                X8 x82 = this.f26470B;
                String str = this.f26476v;
                x82.f29274B = str != null ? str : "";
                this.f26470B.f29275C = this.f26477w;
                u82 = C4906k.f40186C.f40197j.k(this.f26470B);
            }
            if (u82 != null && u82.a()) {
                this.f26471C = u82.d();
                this.f26472D = u82.c();
                if (!a()) {
                    this.f26479y = u82.b();
                    return -1L;
                }
            }
        } else if (this.f26470B != null) {
            this.f26470B.f29273A = c2994bJ.f30069c;
            X8 x83 = this.f26470B;
            String str2 = this.f26476v;
            x83.f29274B = str2 != null ? str2 : "";
            this.f26470B.f29275C = this.f26477w;
            long longValue = (this.f26470B.f29282z ? (Long) rVar.f40509c.a(AbstractC3592ma.f33081l5) : (Long) rVar.f40509c.a(AbstractC3592ma.f33071k5)).longValue();
            C4906k.f40186C.f40198k.getClass();
            SystemClock.elapsedRealtime();
            Z8 o4 = V2.o(this.f26474n, this.f26470B);
            try {
                try {
                    try {
                        C2984b9 c2984b9 = (C2984b9) o4.f32256n.get(longValue, TimeUnit.MILLISECONDS);
                        c2984b9.getClass();
                        this.f26471C = c2984b9.f30018c;
                        this.f26472D = c2984b9.f30020e;
                        if (!a()) {
                            this.f26479y = c2984b9.f30016a;
                        }
                    } catch (InterruptedException unused) {
                        o4.cancel(false);
                        Thread.currentThread().interrupt();
                    }
                } catch (ExecutionException | TimeoutException unused2) {
                    o4.cancel(false);
                }
            } catch (Throwable unused3) {
            }
            C4906k.f40186C.f40198k.getClass();
            SystemClock.elapsedRealtime();
            throw null;
        }
        if (this.f26470B != null) {
            Map map = c2994bJ.f30068b;
            long j6 = c2994bJ.f30069c;
            long j9 = c2994bJ.f30070d;
            int i = c2994bJ.f30071e;
            Uri parse = Uri.parse(this.f26470B.f29276n);
            AbstractC2792Sd.J(parse, "The uri must be set.");
            this.f26473E = new C2994bJ(parse, map, j6, j9, i);
        }
        return this.f26475u.b(this.f26473E);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3636nH
    public final Uri i() {
        return this.f26469A;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3636nH
    public final void m(InterfaceC3750pN interfaceC3750pN) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3636nH
    public final void o() {
        if (!this.f26480z) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.f26480z = false;
        this.f26469A = null;
        InputStream inputStream = this.f26479y;
        if (inputStream == null) {
            this.f26475u.o();
        } else {
            V2.b.c(inputStream);
            this.f26479y = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4073vN
    public final int r(byte[] bArr, int i, int i4) {
        if (!this.f26480z) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.f26479y;
        return inputStream != null ? inputStream.read(bArr, i, i4) : this.f26475u.r(bArr, i, i4);
    }
}

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

/* renamed from: com.google.android.gms.internal.ads.fh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3223fh extends AbstractC3580mF {

    /* renamed from: A, reason: collision with root package name */
    public final String f31075A;

    /* renamed from: B, reason: collision with root package name */
    public final int f31076B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f31077C;

    /* renamed from: D, reason: collision with root package name */
    public InputStream f31078D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f31079E;

    /* renamed from: F, reason: collision with root package name */
    public Uri f31080F;

    /* renamed from: G, reason: collision with root package name */
    public volatile X8 f31081G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f31082H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f31083I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f31084K;

    /* renamed from: L, reason: collision with root package name */
    public long f31085L;

    /* renamed from: M, reason: collision with root package name */
    public P3.a f31086M;

    /* renamed from: N, reason: collision with root package name */
    public final AtomicLong f31087N;

    /* renamed from: x, reason: collision with root package name */
    public final Context f31088x;

    /* renamed from: y, reason: collision with root package name */
    public final InterfaceC3636nH f31089y;

    /* renamed from: z, reason: collision with root package name */
    public final Ux f31090z;

    public C3223fh(Context context, InterfaceC3636nH interfaceC3636nH, String str, int i, InterfaceC3750pN interfaceC3750pN, Ux ux) {
        super(false);
        this.f31088x = context;
        this.f31089y = interfaceC3636nH;
        this.f31090z = ux;
        this.f31075A = str;
        this.f31076B = i;
        this.f31082H = false;
        this.f31083I = false;
        this.J = false;
        this.f31084K = false;
        this.f31085L = 0L;
        this.f31087N = new AtomicLong(-1L);
        this.f31086M = null;
        this.f31077C = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33188x2)).booleanValue();
        m(interfaceC3750pN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0244  */
    /* JADX WARN: Type inference failed for: r5v19, types: [r2.k] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    @Override // com.google.android.gms.internal.ads.InterfaceC3636nH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(C2994bJ c2994bJ) {
        U8 u82;
        boolean z6;
        long j6;
        boolean z9;
        boolean z10;
        long elapsedRealtime;
        C2984b9 c2984b9;
        C2994bJ c2994bJ2 = c2994bJ;
        String str = "ms";
        if (this.f31079E) {
            throw new IOException("Attempt to open an already open GcacheDataSource.");
        }
        boolean z11 = true;
        this.f31079E = true;
        Uri uri = c2994bJ2.f30067a;
        this.f31080F = uri;
        boolean z12 = this.f31077C;
        if (!z12) {
            c(c2994bJ);
        }
        this.f31081G = X8.a(uri);
        C3324ha c3324ha = AbstractC3592ma.f33062j5;
        s2.r rVar = s2.r.f40506e;
        if (!((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            if (this.f31081G != null) {
                this.f31081G.f29273A = c2994bJ2.f30069c;
                X8 x82 = this.f31081G;
                String str2 = this.f31075A;
                x82.f29274B = str2 != null ? str2 : "";
                this.f31081G.f29275C = this.f31076B;
                u82 = C4906k.f40186C.f40197j.k(this.f31081G);
            } else {
                u82 = null;
            }
            if (u82 != null && u82.a()) {
                synchronized (u82) {
                    z6 = u82.f28702u;
                }
                this.f31082H = z6;
                this.J = u82.d();
                this.f31084K = u82.c();
                synchronized (u82) {
                    j6 = u82.f28704w;
                }
                this.f31085L = j6;
                this.f31083I = true;
                if (!f()) {
                    this.f31078D = u82.b();
                    if (this.f31077C) {
                        c(c2994bJ);
                    }
                    return -1L;
                }
            }
        } else if (this.f31081G != null) {
            this.f31081G.f29273A = c2994bJ2.f30069c;
            X8 x83 = this.f31081G;
            String str3 = this.f31075A;
            x83.f29274B = str3 != null ? str3 : "";
            this.f31081G.f29275C = this.f31076B;
            long longValue = (this.f31081G.f29282z ? (Long) rVar.f40509c.a(AbstractC3592ma.f33081l5) : (Long) rVar.f40509c.a(AbstractC3592ma.f33071k5)).longValue();
            ?? r52 = C4906k.f40186C;
            r52.f40198k.getClass();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            Z8 o4 = V2.o(this.f31088x, this.f31081G);
            try {
                try {
                    c2984b9 = (C2984b9) o4.f32256n.get(longValue, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    th = th;
                    z11 = r52;
                }
                try {
                    this.f31082H = c2984b9.f30017b;
                    this.J = c2984b9.f30018c;
                    this.f31084K = c2984b9.f30020e;
                    this.f31085L = c2984b9.f30019d;
                } catch (InterruptedException unused) {
                    z10 = true;
                    o4.cancel(true);
                    Thread.currentThread().interrupt();
                    C4906k.f40186C.f40198k.getClass();
                    elapsedRealtime = SystemClock.elapsedRealtime() - elapsedRealtime2;
                    InterfaceC4191xg interfaceC4191xg = ((C3437jh) this.f31090z.f28847u).f32067C;
                    if (interfaceC4191xg != null) {
                        interfaceC4191xg.r(elapsedRealtime, z10);
                    }
                    this.f31083I = z10;
                    r52 = new StringBuilder(String.valueOf(elapsedRealtime).length() + 24);
                    r52.append("Cache connection took ");
                    r52.append(elapsedRealtime);
                    r52.append("ms");
                    str = r52.toString();
                    w2.z.k(str);
                    this.f31083I = false;
                    if (this.f31081G != null) {
                    }
                    return this.f31089y.b(c2994bJ2);
                } catch (ExecutionException | TimeoutException unused2) {
                    z9 = true;
                    o4.cancel(true);
                    C4906k.f40186C.f40198k.getClass();
                    elapsedRealtime = SystemClock.elapsedRealtime() - elapsedRealtime2;
                    InterfaceC4191xg interfaceC4191xg2 = ((C3437jh) this.f31090z.f28847u).f32067C;
                    if (interfaceC4191xg2 != null) {
                        interfaceC4191xg2.r(elapsedRealtime, z9);
                    }
                    this.f31083I = z9;
                    r52 = new StringBuilder(String.valueOf(elapsedRealtime).length() + 24);
                    r52.append("Cache connection took ");
                    r52.append(elapsedRealtime);
                    r52.append("ms");
                    str = r52.toString();
                    w2.z.k(str);
                    this.f31083I = false;
                    if (this.f31081G != null) {
                    }
                    return this.f31089y.b(c2994bJ2);
                } catch (Throwable th2) {
                    th = th2;
                    C4906k.f40186C.f40198k.getClass();
                    long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime2;
                    InterfaceC4191xg interfaceC4191xg3 = ((C3437jh) this.f31090z.f28847u).f32067C;
                    if (interfaceC4191xg3 != null) {
                        interfaceC4191xg3.r(elapsedRealtime3, z11);
                    }
                    this.f31083I = z11;
                    StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime3).length() + 24);
                    sb.append("Cache connection took ");
                    sb.append(elapsedRealtime3);
                    sb.append(str);
                    w2.z.k(sb.toString());
                    throw th;
                }
            } catch (InterruptedException unused3) {
                z10 = false;
            } catch (ExecutionException | TimeoutException unused4) {
                z9 = false;
            } catch (Throwable th3) {
                th = th3;
                z11 = false;
            }
            if (!f()) {
                this.f31078D = c2984b9.f30016a;
                if (z12) {
                    c(c2994bJ);
                }
                r52.f40198k.getClass();
                long elapsedRealtime4 = SystemClock.elapsedRealtime() - elapsedRealtime2;
                InterfaceC4191xg interfaceC4191xg4 = ((C3437jh) this.f31090z.f28847u).f32067C;
                if (interfaceC4191xg4 != null) {
                    interfaceC4191xg4.r(elapsedRealtime4, true);
                }
                this.f31083I = true;
                StringBuilder sb2 = new StringBuilder(String.valueOf(elapsedRealtime4).length() + 24);
                sb2.append("Cache connection took ");
                sb2.append(elapsedRealtime4);
                sb2.append("ms");
                w2.z.k(sb2.toString());
                return -1L;
            }
            r52.f40198k.getClass();
            long elapsedRealtime5 = SystemClock.elapsedRealtime() - elapsedRealtime2;
            InterfaceC4191xg interfaceC4191xg5 = ((C3437jh) this.f31090z.f28847u).f32067C;
            if (interfaceC4191xg5 != null) {
                interfaceC4191xg5.r(elapsedRealtime5, true);
            }
            this.f31083I = true;
            StringBuilder sb3 = new StringBuilder(String.valueOf(elapsedRealtime5).length() + 24);
            sb3.append("Cache connection took ");
            sb3.append(elapsedRealtime5);
            sb3.append("ms");
            str = sb3.toString();
            w2.z.k(str);
        }
        this.f31083I = false;
        if (this.f31081G != null) {
            Map map = c2994bJ2.f30068b;
            long j9 = c2994bJ2.f30069c;
            long j10 = c2994bJ2.f30070d;
            int i = c2994bJ2.f30071e;
            Uri parse = Uri.parse(this.f31081G.f29276n);
            AbstractC2792Sd.J(parse, "The uri must be set.");
            c2994bJ2 = new C2994bJ(parse, map, j9, j10, i);
        }
        return this.f31089y.b(c2994bJ2);
    }

    public final boolean f() {
        if (!this.f31077C) {
            return false;
        }
        C3324ha c3324ha = AbstractC3592ma.f33090m5;
        s2.r rVar = s2.r.f40506e;
        if (!((Boolean) rVar.f40509c.a(c3324ha)).booleanValue() || this.J) {
            return ((Boolean) rVar.f40509c.a(AbstractC3592ma.f33100n5)).booleanValue() && !this.f31084K;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3636nH
    public final Uri i() {
        return this.f31080F;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3636nH
    public final void o() {
        if (!this.f31079E) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.f31079E = false;
        this.f31080F = null;
        boolean z6 = (this.f31077C && this.f31078D == null) ? false : true;
        InputStream inputStream = this.f31078D;
        if (inputStream != null) {
            V2.b.c(inputStream);
            this.f31078D = null;
        } else {
            this.f31089y.o();
        }
        if (z6) {
            e();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4073vN
    public final int r(byte[] bArr, int i, int i4) {
        if (!this.f31079E) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.f31078D;
        int read = inputStream != null ? inputStream.read(bArr, i, i4) : this.f31089y.r(bArr, i, i4);
        if (this.f31077C && this.f31078D == null) {
            return read;
        }
        d(read);
        return read;
    }
}

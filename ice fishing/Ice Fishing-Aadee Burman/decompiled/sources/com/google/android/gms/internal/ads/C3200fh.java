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
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.fh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3200fh extends AbstractC3557mF {

    /* renamed from: A, reason: collision with root package name */
    public final String f30287A;

    /* renamed from: B, reason: collision with root package name */
    public final int f30288B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f30289C;

    /* renamed from: D, reason: collision with root package name */
    public InputStream f30290D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f30291E;

    /* renamed from: F, reason: collision with root package name */
    public Uri f30292F;

    /* renamed from: G, reason: collision with root package name */
    public volatile X8 f30293G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f30294H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f30295I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f30296K;

    /* renamed from: L, reason: collision with root package name */
    public long f30297L;

    /* renamed from: M, reason: collision with root package name */
    public N3.a f30298M;

    /* renamed from: N, reason: collision with root package name */
    public final AtomicLong f30299N;

    /* renamed from: x, reason: collision with root package name */
    public final Context f30300x;

    /* renamed from: y, reason: collision with root package name */
    public final InterfaceC3613nH f30301y;

    /* renamed from: z, reason: collision with root package name */
    public final Ux f30302z;

    public C3200fh(Context context, InterfaceC3613nH interfaceC3613nH, String str, int i, InterfaceC3727pN interfaceC3727pN, Ux ux) {
        super(false);
        this.f30300x = context;
        this.f30301y = interfaceC3613nH;
        this.f30302z = ux;
        this.f30287A = str;
        this.f30288B = i;
        this.f30294H = false;
        this.f30295I = false;
        this.J = false;
        this.f30296K = false;
        this.f30297L = 0L;
        this.f30299N = new AtomicLong(-1L);
        this.f30298M = null;
        this.f30289C = ((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32409x2)).booleanValue();
        k(interfaceC3727pN);
    }

    public final boolean e() {
        if (!this.f30289C) {
            return false;
        }
        C3301ha c3301ha = AbstractC3569ma.f32310m5;
        q2.r rVar = q2.r.f40204e;
        if (!((Boolean) rVar.f40207c.a(c3301ha)).booleanValue() || this.J) {
            return ((Boolean) rVar.f40207c.a(AbstractC3569ma.f32319n5)).booleanValue() && !this.f30296K;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0244  */
    /* JADX WARN: Type inference failed for: r5v19, types: [p2.j] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    @Override // com.google.android.gms.internal.ads.InterfaceC3613nH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long g(C2971bJ c2971bJ) {
        U8 u82;
        boolean z3;
        long j6;
        boolean z6;
        boolean z9;
        long elapsedRealtime;
        C2961b9 c2961b9;
        C2971bJ c2971bJ2 = c2971bJ;
        String str = "ms";
        if (this.f30291E) {
            throw new IOException("Attempt to open an already open GcacheDataSource.");
        }
        boolean z10 = true;
        this.f30291E = true;
        Uri uri = c2971bJ2.f29279a;
        this.f30292F = uri;
        boolean z11 = this.f30289C;
        if (!z11) {
            b(c2971bJ);
        }
        this.f30293G = X8.a(uri);
        C3301ha c3301ha = AbstractC3569ma.f32283j5;
        q2.r rVar = q2.r.f40204e;
        if (!((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
            if (this.f30293G != null) {
                this.f30293G.f28493A = c2971bJ2.f29281c;
                X8 x82 = this.f30293G;
                String str2 = this.f30287A;
                x82.f28494B = str2 != null ? str2 : "";
                this.f30293G.f28495C = this.f30288B;
                u82 = C4835j.f39730C.f39741j.k(this.f30293G);
            } else {
                u82 = null;
            }
            if (u82 != null && u82.a()) {
                synchronized (u82) {
                    z3 = u82.f27905u;
                }
                this.f30294H = z3;
                this.J = u82.d();
                this.f30296K = u82.c();
                synchronized (u82) {
                    j6 = u82.f27907w;
                }
                this.f30297L = j6;
                this.f30295I = true;
                if (!e()) {
                    this.f30290D = u82.b();
                    if (this.f30289C) {
                        b(c2971bJ);
                    }
                    return -1L;
                }
            }
        } else if (this.f30293G != null) {
            this.f30293G.f28493A = c2971bJ2.f29281c;
            X8 x83 = this.f30293G;
            String str3 = this.f30287A;
            x83.f28494B = str3 != null ? str3 : "";
            this.f30293G.f28495C = this.f30288B;
            long longValue = (this.f30293G.f28502z ? (Long) rVar.f40207c.a(AbstractC3569ma.f32302l5) : (Long) rVar.f40207c.a(AbstractC3569ma.f32292k5)).longValue();
            ?? r52 = C4835j.f39730C;
            r52.f39742k.getClass();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            Z8 o6 = V2.o(this.f30300x, this.f30293G);
            try {
                try {
                    c2961b9 = (C2961b9) o6.f31479n.get(longValue, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    th = th;
                    z10 = r52;
                }
                try {
                    this.f30294H = c2961b9.f29229b;
                    this.J = c2961b9.f29230c;
                    this.f30296K = c2961b9.f29232e;
                    this.f30297L = c2961b9.f29231d;
                } catch (InterruptedException unused) {
                    z9 = true;
                    o6.cancel(true);
                    Thread.currentThread().interrupt();
                    C4835j.f39730C.f39742k.getClass();
                    elapsedRealtime = SystemClock.elapsedRealtime() - elapsedRealtime2;
                    InterfaceC4168xg interfaceC4168xg = ((C3414jh) this.f30302z.f28050u).f31280C;
                    if (interfaceC4168xg != null) {
                        interfaceC4168xg.r(elapsedRealtime, z9);
                    }
                    this.f30295I = z9;
                    r52 = new StringBuilder(String.valueOf(elapsedRealtime).length() + 24);
                    r52.append("Cache connection took ");
                    r52.append(elapsedRealtime);
                    r52.append("ms");
                    str = r52.toString();
                    u2.z.k(str);
                    this.f30295I = false;
                    if (this.f30293G != null) {
                    }
                    return this.f30301y.g(c2971bJ2);
                } catch (ExecutionException | TimeoutException unused2) {
                    z6 = true;
                    o6.cancel(true);
                    C4835j.f39730C.f39742k.getClass();
                    elapsedRealtime = SystemClock.elapsedRealtime() - elapsedRealtime2;
                    InterfaceC4168xg interfaceC4168xg2 = ((C3414jh) this.f30302z.f28050u).f31280C;
                    if (interfaceC4168xg2 != null) {
                        interfaceC4168xg2.r(elapsedRealtime, z6);
                    }
                    this.f30295I = z6;
                    r52 = new StringBuilder(String.valueOf(elapsedRealtime).length() + 24);
                    r52.append("Cache connection took ");
                    r52.append(elapsedRealtime);
                    r52.append("ms");
                    str = r52.toString();
                    u2.z.k(str);
                    this.f30295I = false;
                    if (this.f30293G != null) {
                    }
                    return this.f30301y.g(c2971bJ2);
                } catch (Throwable th2) {
                    th = th2;
                    C4835j.f39730C.f39742k.getClass();
                    long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime2;
                    InterfaceC4168xg interfaceC4168xg3 = ((C3414jh) this.f30302z.f28050u).f31280C;
                    if (interfaceC4168xg3 != null) {
                        interfaceC4168xg3.r(elapsedRealtime3, z10);
                    }
                    this.f30295I = z10;
                    StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime3).length() + 24);
                    sb.append("Cache connection took ");
                    sb.append(elapsedRealtime3);
                    sb.append(str);
                    u2.z.k(sb.toString());
                    throw th;
                }
            } catch (InterruptedException unused3) {
                z9 = false;
            } catch (ExecutionException | TimeoutException unused4) {
                z6 = false;
            } catch (Throwable th3) {
                th = th3;
                z10 = false;
            }
            if (!e()) {
                this.f30290D = c2961b9.f29228a;
                if (z11) {
                    b(c2971bJ);
                }
                r52.f39742k.getClass();
                long elapsedRealtime4 = SystemClock.elapsedRealtime() - elapsedRealtime2;
                InterfaceC4168xg interfaceC4168xg4 = ((C3414jh) this.f30302z.f28050u).f31280C;
                if (interfaceC4168xg4 != null) {
                    interfaceC4168xg4.r(elapsedRealtime4, true);
                }
                this.f30295I = true;
                StringBuilder sb2 = new StringBuilder(String.valueOf(elapsedRealtime4).length() + 24);
                sb2.append("Cache connection took ");
                sb2.append(elapsedRealtime4);
                sb2.append("ms");
                u2.z.k(sb2.toString());
                return -1L;
            }
            r52.f39742k.getClass();
            long elapsedRealtime5 = SystemClock.elapsedRealtime() - elapsedRealtime2;
            InterfaceC4168xg interfaceC4168xg5 = ((C3414jh) this.f30302z.f28050u).f31280C;
            if (interfaceC4168xg5 != null) {
                interfaceC4168xg5.r(elapsedRealtime5, true);
            }
            this.f30295I = true;
            StringBuilder sb3 = new StringBuilder(String.valueOf(elapsedRealtime5).length() + 24);
            sb3.append("Cache connection took ");
            sb3.append(elapsedRealtime5);
            sb3.append("ms");
            str = sb3.toString();
            u2.z.k(str);
        }
        this.f30295I = false;
        if (this.f30293G != null) {
            Map map = c2971bJ2.f29280b;
            long j9 = c2971bJ2.f29281c;
            long j10 = c2971bJ2.f29282d;
            int i = c2971bJ2.f29283e;
            Uri parse = Uri.parse(this.f30293G.f28496n);
            AbstractC2772Sd.J(parse, "The uri must be set.");
            c2971bJ2 = new C2971bJ(parse, map, j9, j10, i);
        }
        return this.f30301y.g(c2971bJ2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3613nH
    public final Uri i() {
        return this.f30292F;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4050vN
    public final int m(byte[] bArr, int i, int i6) {
        if (!this.f30291E) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.f30290D;
        int read = inputStream != null ? inputStream.read(bArr, i, i6) : this.f30301y.m(bArr, i, i6);
        if (this.f30289C && this.f30290D == null) {
            return read;
        }
        c(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3613nH
    public final void o() {
        if (!this.f30291E) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.f30291E = false;
        this.f30292F = null;
        boolean z3 = (this.f30289C && this.f30290D == null) ? false : true;
        InputStream inputStream = this.f30290D;
        if (inputStream != null) {
            T2.b.c(inputStream);
            this.f30290D = null;
        } else {
            this.f30301y.o();
        }
        if (z3) {
            d();
        }
    }
}

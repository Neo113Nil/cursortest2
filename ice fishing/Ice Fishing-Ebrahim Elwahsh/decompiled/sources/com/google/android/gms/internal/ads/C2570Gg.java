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

/* renamed from: com.google.android.gms.internal.ads.Gg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2570Gg implements InterfaceC3572mH {

    /* renamed from: A, reason: collision with root package name */
    public Uri f25189A;

    /* renamed from: B, reason: collision with root package name */
    public volatile U8 f25190B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f25191C = false;

    /* renamed from: D, reason: collision with root package name */
    public boolean f25192D = false;

    /* renamed from: E, reason: collision with root package name */
    public C3197fJ f25193E;

    /* renamed from: n, reason: collision with root package name */
    public final Context f25194n;

    /* renamed from: u, reason: collision with root package name */
    public final AK f25195u;

    /* renamed from: v, reason: collision with root package name */
    public final String f25196v;

    /* renamed from: w, reason: collision with root package name */
    public final int f25197w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f25198x;

    /* renamed from: y, reason: collision with root package name */
    public InputStream f25199y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f25200z;

    public C2570Gg(Context context, AK ak, String str, int i) {
        this.f25194n = context;
        this.f25195u = ak;
        this.f25196v = str;
        this.f25197w = i;
        new AtomicLong(-1L);
        this.f25198x = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31828x2)).booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572mH
    public final long F(C3197fJ c3197fJ) {
        if (this.f25200z) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.f25200z = true;
        Uri uri = c3197fJ.f30686a;
        this.f25189A = uri;
        this.f25193E = c3197fJ;
        this.f25190B = U8.a(uri);
        C3151ea c3151ea = AbstractC3368ia.f31702j5;
        q2.r rVar = q2.r.f40116e;
        R8 r82 = null;
        if (!((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            if (this.f25190B != null) {
                this.f25190B.f27931A = c3197fJ.f30688c;
                U8 u82 = this.f25190B;
                String str = this.f25196v;
                u82.f27932B = str != null ? str : "";
                this.f25190B.f27933C = this.f25197w;
                r82 = p2.j.f39798C.f39809j.j(this.f25190B);
            }
            if (r82 != null && r82.a()) {
                this.f25191C = r82.d();
                this.f25192D = r82.c();
                if (!b()) {
                    this.f25199y = r82.b();
                    return -1L;
                }
            }
        } else if (this.f25190B != null) {
            this.f25190B.f27931A = c3197fJ.f30688c;
            U8 u83 = this.f25190B;
            String str2 = this.f25196v;
            u83.f27932B = str2 != null ? str2 : "";
            this.f25190B.f27933C = this.f25197w;
            long longValue = (this.f25190B.f27940z ? (Long) rVar.f40119c.a(AbstractC3368ia.f31721l5) : (Long) rVar.f40119c.a(AbstractC3368ia.f31712k5)).longValue();
            p2.j.f39798C.f39810k.getClass();
            SystemClock.elapsedRealtime();
            W8 o9 = T2.o(this.f25194n, this.f25190B);
            try {
                try {
                    try {
                        Y8 y8 = (Y8) o9.f31242n.get(longValue, TimeUnit.MILLISECONDS);
                        y8.getClass();
                        this.f25191C = y8.f28807c;
                        this.f25192D = y8.f28809e;
                        if (!b()) {
                            this.f25199y = y8.f28805a;
                        }
                    } catch (InterruptedException unused) {
                        o9.cancel(false);
                        Thread.currentThread().interrupt();
                    }
                } catch (ExecutionException | TimeoutException unused2) {
                    o9.cancel(false);
                }
            } catch (Throwable unused3) {
            }
            p2.j.f39798C.f39810k.getClass();
            SystemClock.elapsedRealtime();
            throw null;
        }
        if (this.f25190B != null) {
            Map map = c3197fJ.f30687b;
            long j9 = c3197fJ.f30688c;
            long j10 = c3197fJ.f30689d;
            int i = c3197fJ.f30690e;
            Uri parse = Uri.parse(this.f25190B.f27934n);
            PA.X(parse, "The uri must be set.");
            this.f25193E = new C3197fJ(parse, map, j9, j10, i);
        }
        return this.f25195u.F(this.f25193E);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572mH
    public final void a(DN dn) {
    }

    public final boolean b() {
        if (!this.f25198x) {
            return false;
        }
        C3151ea c3151ea = AbstractC3368ia.f31730m5;
        q2.r rVar = q2.r.f40116e;
        if (!((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() || this.f25191C) {
            return ((Boolean) rVar.f40119c.a(AbstractC3368ia.f31738n5)).booleanValue() && !this.f25192D;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572mH
    public final Uri i() {
        return this.f25189A;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3572mH
    public final void o() {
        if (!this.f25200z) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.f25200z = false;
        this.f25189A = null;
        InputStream inputStream = this.f25199y;
        if (inputStream == null) {
            this.f25195u.o();
        } else {
            S2.b.c(inputStream);
            this.f25199y = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.JN
    public final int z(byte[] bArr, int i, int i4) {
        if (!this.f25200z) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.f25199y;
        return inputStream != null ? inputStream.read(bArr, i, i4) : this.f25195u.z(bArr, i, i4);
    }
}

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

/* renamed from: com.google.android.gms.internal.ads.Jg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2622Jg implements InterfaceC3613nH {

    /* renamed from: A, reason: collision with root package name */
    public Uri f25715A;

    /* renamed from: B, reason: collision with root package name */
    public volatile X8 f25716B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f25717C = false;

    /* renamed from: D, reason: collision with root package name */
    public boolean f25718D = false;

    /* renamed from: E, reason: collision with root package name */
    public C2971bJ f25719E;

    /* renamed from: n, reason: collision with root package name */
    public final Context f25720n;

    /* renamed from: u, reason: collision with root package name */
    public final C3939tK f25721u;

    /* renamed from: v, reason: collision with root package name */
    public final String f25722v;

    /* renamed from: w, reason: collision with root package name */
    public final int f25723w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f25724x;

    /* renamed from: y, reason: collision with root package name */
    public InputStream f25725y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f25726z;

    public C2622Jg(Context context, C3939tK c3939tK, String str, int i) {
        this.f25720n = context;
        this.f25721u = c3939tK;
        this.f25722v = str;
        this.f25723w = i;
        new AtomicLong(-1L);
        this.f25724x = ((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32409x2)).booleanValue();
    }

    public final boolean a() {
        if (!this.f25724x) {
            return false;
        }
        C3301ha c3301ha = AbstractC3569ma.f32310m5;
        q2.r rVar = q2.r.f40204e;
        if (!((Boolean) rVar.f40207c.a(c3301ha)).booleanValue() || this.f25717C) {
            return ((Boolean) rVar.f40207c.a(AbstractC3569ma.f32319n5)).booleanValue() && !this.f25718D;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3613nH
    public final long g(C2971bJ c2971bJ) {
        if (this.f25726z) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.f25726z = true;
        Uri uri = c2971bJ.f29279a;
        this.f25715A = uri;
        this.f25719E = c2971bJ;
        this.f25716B = X8.a(uri);
        C3301ha c3301ha = AbstractC3569ma.f32283j5;
        q2.r rVar = q2.r.f40204e;
        U8 u82 = null;
        if (!((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
            if (this.f25716B != null) {
                this.f25716B.f28493A = c2971bJ.f29281c;
                X8 x82 = this.f25716B;
                String str = this.f25722v;
                x82.f28494B = str != null ? str : "";
                this.f25716B.f28495C = this.f25723w;
                u82 = C4835j.f39730C.f39741j.k(this.f25716B);
            }
            if (u82 != null && u82.a()) {
                this.f25717C = u82.d();
                this.f25718D = u82.c();
                if (!a()) {
                    this.f25725y = u82.b();
                    return -1L;
                }
            }
        } else if (this.f25716B != null) {
            this.f25716B.f28493A = c2971bJ.f29281c;
            X8 x83 = this.f25716B;
            String str2 = this.f25722v;
            x83.f28494B = str2 != null ? str2 : "";
            this.f25716B.f28495C = this.f25723w;
            long longValue = (this.f25716B.f28502z ? (Long) rVar.f40207c.a(AbstractC3569ma.f32302l5) : (Long) rVar.f40207c.a(AbstractC3569ma.f32292k5)).longValue();
            C4835j.f39730C.f39742k.getClass();
            SystemClock.elapsedRealtime();
            Z8 o6 = V2.o(this.f25720n, this.f25716B);
            try {
                try {
                    try {
                        C2961b9 c2961b9 = (C2961b9) o6.f31479n.get(longValue, TimeUnit.MILLISECONDS);
                        c2961b9.getClass();
                        this.f25717C = c2961b9.f29230c;
                        this.f25718D = c2961b9.f29232e;
                        if (!a()) {
                            this.f25725y = c2961b9.f29228a;
                        }
                    } catch (InterruptedException unused) {
                        o6.cancel(false);
                        Thread.currentThread().interrupt();
                    }
                } catch (ExecutionException | TimeoutException unused2) {
                    o6.cancel(false);
                }
            } catch (Throwable unused3) {
            }
            C4835j.f39730C.f39742k.getClass();
            SystemClock.elapsedRealtime();
            throw null;
        }
        if (this.f25716B != null) {
            Map map = c2971bJ.f29280b;
            long j6 = c2971bJ.f29281c;
            long j9 = c2971bJ.f29282d;
            int i = c2971bJ.f29283e;
            Uri parse = Uri.parse(this.f25716B.f28496n);
            AbstractC2772Sd.J(parse, "The uri must be set.");
            this.f25719E = new C2971bJ(parse, map, j6, j9, i);
        }
        return this.f25721u.g(this.f25719E);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3613nH
    public final Uri i() {
        return this.f25715A;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3613nH
    public final void k(InterfaceC3727pN interfaceC3727pN) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4050vN
    public final int m(byte[] bArr, int i, int i6) {
        if (!this.f25726z) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.f25725y;
        return inputStream != null ? inputStream.read(bArr, i, i6) : this.f25721u.m(bArr, i, i6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3613nH
    public final void o() {
        if (!this.f25726z) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.f25726z = false;
        this.f25715A = null;
        InputStream inputStream = this.f25725y;
        if (inputStream == null) {
            this.f25721u.o();
        } else {
            T2.b.c(inputStream);
            this.f25725y = null;
        }
    }
}

package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Build;
import com.google.android.gms.internal.consent_sdk.C4323b;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.jP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3428jP {

    /* renamed from: o, reason: collision with root package name */
    public static final Object f32032o = new Object();

    /* renamed from: p, reason: collision with root package name */
    public static ScheduledExecutorService f32033p;

    /* renamed from: q, reason: collision with root package name */
    public static int f32034q;

    /* renamed from: a, reason: collision with root package name */
    public final AudioTrack f32035a;

    /* renamed from: b, reason: collision with root package name */
    public final VO f32036b;

    /* renamed from: c, reason: collision with root package name */
    public final C4042ut f32037c;

    /* renamed from: d, reason: collision with root package name */
    public ME f32038d;

    /* renamed from: e, reason: collision with root package name */
    public final C3482kP f32039e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f32040f;

    /* renamed from: g, reason: collision with root package name */
    public final int f32041g;

    /* renamed from: h, reason: collision with root package name */
    public final C3504ku f32042h;
    public final C3553lp i = new C3553lp(Thread.currentThread());

    /* renamed from: j, reason: collision with root package name */
    public boolean f32043j;

    /* renamed from: k, reason: collision with root package name */
    public long f32044k;

    /* renamed from: l, reason: collision with root package name */
    public long f32045l;

    /* renamed from: m, reason: collision with root package name */
    public int f32046m;

    /* renamed from: n, reason: collision with root package name */
    public int f32047n;

    public C3428jP(AudioTrack audioTrack, VO vo, C4042ut c4042ut, V2 v22) {
        this.f32035a = audioTrack;
        this.f32036b = vo;
        this.f32037c = c4042ut;
        int i = vo.f28987a;
        boolean d9 = AbstractC3182eu.d(i);
        this.f32040f = d9;
        if (d9) {
            this.f32041g = AbstractC3182eu.f(i) * Integer.bitCount(vo.f28989c);
        } else {
            this.f32041g = -1;
        }
        this.f32039e = new C3482kP(new C3128du(this), v22, audioTrack, vo.f28987a, this.f32041g, vo.f28990d);
        if (c4042ut != null) {
            this.f32038d = new ME(audioTrack, c4042ut);
        }
        this.f32042h = b() ? new C3504ku(this) : null;
    }

    public final boolean a(int i, ByteBuffer byteBuffer) {
        boolean z6;
        C4042ut c4042ut;
        boolean z9 = this.f32040f;
        if (!z9 && this.f32046m == 0) {
            this.f32046m = C3859rP.c(this.f32036b.f28987a, byteBuffer);
        }
        C3553lp c3553lp = this.i;
        c3553lp.getClass();
        boolean z10 = Thread.currentThread() == c3553lp.f32631a;
        AudioTrack audioTrack = this.f32035a;
        if (z10) {
            c();
            int underrunCount = audioTrack.getUnderrunCount();
            int i4 = this.f32047n;
            this.f32047n = underrunCount;
            if (underrunCount > i4) {
                c3553lp.c(-1, C3107dP.f30542u);
                c3553lp.d();
            }
        }
        int remaining = byteBuffer.remaining();
        int write = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        if (write >= 0) {
            z6 = write == remaining;
            if (z9) {
                this.f32044k += write;
                return z6;
            }
            if (z6) {
                this.f32045l = (this.f32046m * i) + this.f32045l;
            }
            return z6;
        }
        z6 = write == -6 || write == -32;
        if (z6 && (c4042ut = this.f32037c) != null) {
            C4323b c4323b = (C4323b) c4042ut.f35366u;
            C2521Ce c2521Ce = (C2521Ce) c4323b.f36422f;
            if (c2521Ce != null) {
                KO ko = KO.f26668f;
                c4323b.f36421e = ko;
                c2521Ce.k(ko);
            }
        }
        throw new PO(write, z6);
    }

    public final boolean b() {
        boolean isOffloadedPlayback;
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        isOffloadedPlayback = this.f32035a.isOffloadedPlayback();
        return isOffloadedPlayback;
    }

    public final long c() {
        if (!this.f32040f) {
            return this.f32045l;
        }
        long j6 = this.f32044k;
        String str = AbstractC3182eu.f30782a;
        return ((j6 + r2) - 1) / this.f32041g;
    }
}

package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Build;
import com.google.android.gms.internal.consent_sdk.C4300b;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.jP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3405jP {

    /* renamed from: o, reason: collision with root package name */
    public static final Object f31245o = new Object();

    /* renamed from: p, reason: collision with root package name */
    public static ScheduledExecutorService f31246p;

    /* renamed from: q, reason: collision with root package name */
    public static int f31247q;

    /* renamed from: a, reason: collision with root package name */
    public final AudioTrack f31248a;

    /* renamed from: b, reason: collision with root package name */
    public final VO f31249b;

    /* renamed from: c, reason: collision with root package name */
    public final C4019ut f31250c;

    /* renamed from: d, reason: collision with root package name */
    public ME f31251d;

    /* renamed from: e, reason: collision with root package name */
    public final C3459kP f31252e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f31253f;

    /* renamed from: g, reason: collision with root package name */
    public final int f31254g;

    /* renamed from: h, reason: collision with root package name */
    public final C3481ku f31255h;
    public final C3530lp i = new C3530lp(Thread.currentThread());

    /* renamed from: j, reason: collision with root package name */
    public boolean f31256j;

    /* renamed from: k, reason: collision with root package name */
    public long f31257k;

    /* renamed from: l, reason: collision with root package name */
    public long f31258l;

    /* renamed from: m, reason: collision with root package name */
    public int f31259m;

    /* renamed from: n, reason: collision with root package name */
    public int f31260n;

    public C3405jP(AudioTrack audioTrack, VO vo, C4019ut c4019ut, V2 v22) {
        this.f31248a = audioTrack;
        this.f31249b = vo;
        this.f31250c = c4019ut;
        int i = vo.f28191a;
        boolean d2 = AbstractC3159eu.d(i);
        this.f31253f = d2;
        if (d2) {
            this.f31254g = AbstractC3159eu.f(i) * Integer.bitCount(vo.f28193c);
        } else {
            this.f31254g = -1;
        }
        this.f31252e = new C3459kP(new C3105du(this), v22, audioTrack, vo.f28191a, this.f31254g, vo.f28194d);
        if (c4019ut != null) {
            this.f31251d = new ME(audioTrack, c4019ut);
        }
        this.f31255h = b() ? new C3481ku(this) : null;
    }

    public final boolean a(int i, ByteBuffer byteBuffer) {
        boolean z3;
        C4019ut c4019ut;
        boolean z6 = this.f31253f;
        if (!z6 && this.f31259m == 0) {
            this.f31259m = C3836rP.c(this.f31249b.f28191a, byteBuffer);
        }
        C3530lp c3530lp = this.i;
        c3530lp.getClass();
        boolean z9 = Thread.currentThread() == c3530lp.f31851a;
        AudioTrack audioTrack = this.f31248a;
        if (z9) {
            c();
            int underrunCount = audioTrack.getUnderrunCount();
            int i6 = this.f31260n;
            this.f31260n = underrunCount;
            if (underrunCount > i6) {
                c3530lp.c(-1, C3084dP.f29770u);
                c3530lp.d();
            }
        }
        int remaining = byteBuffer.remaining();
        int write = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        if (write >= 0) {
            z3 = write == remaining;
            if (z6) {
                this.f31257k += write;
                return z3;
            }
            if (z3) {
                this.f31258l = (this.f31259m * i) + this.f31258l;
            }
            return z3;
        }
        z3 = write == -6 || write == -32;
        if (z3 && (c4019ut = this.f31250c) != null) {
            C4300b c4300b = (C4300b) c4019ut.f34603u;
            C2501Ce c2501Ce = (C2501Ce) c4300b.f35653f;
            if (c2501Ce != null) {
                KO ko = KO.f25916f;
                c4300b.f35652e = ko;
                c2501Ce.k(ko);
            }
        }
        throw new PO(write, z3);
    }

    public final boolean b() {
        boolean isOffloadedPlayback;
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        isOffloadedPlayback = this.f31248a.isOffloadedPlayback();
        return isOffloadedPlayback;
    }

    public final long c() {
        if (!this.f31253f) {
            return this.f31258l;
        }
        long j6 = this.f31257k;
        String str = AbstractC3159eu.f29993a;
        return ((j6 + r2) - 1) / this.f31254g;
    }
}

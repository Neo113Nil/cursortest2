package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.dP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3084dP implements InterfaceC3529lo, VP, InterfaceC2992bn {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29776n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C3084dP f29770u = new C3084dP(0);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C3084dP f29771v = new C3084dP(1);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ C3084dP f29772w = new C3084dP(2);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ C3084dP f29773x = new C3084dP(3);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ C3084dP f29774y = new C3084dP(4);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ C3084dP f29775z = new C3084dP(5);

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ C3084dP f29768A = new C3084dP(6);

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ C3084dP f29769B = new C3084dP(9);

    public /* synthetic */ C3084dP(int i) {
        this.f29776n = i;
    }

    @Override // com.google.android.gms.internal.ads.VP
    public /* synthetic */ int a(Object obj) {
        HashMap hashMap = WP.f28354a;
        String str = ((OP) obj).f26604a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3529lo
    /* renamed from: a */
    public void mo1a(Object obj) {
        long j6;
        C3649o c3649o;
        switch (this.f29776n) {
            case 0:
                C3567mP c3567mP = (C3567mP) obj;
                C3836rP c3836rP = c3567mP.f31967b;
                if (c3567mP.equals(c3836rP.f33620h) && c3836rP.f33623l != null) {
                    C3675oP c3675oP = c3836rP.f33625n;
                    int i = c3675oP.f32898b;
                    if (i != -1) {
                        long j9 = ((VO) c3675oP.f32901e).f28194d / i;
                        C3405jP c3405jP = c3836rP.f33629r;
                        c3405jP.getClass();
                        j6 = AbstractC3159eu.v(c3405jP.f31248a.getSampleRate(), j9);
                    } else {
                        j6 = com.anythink.basead.exoplayer.b.f6382b;
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime() - c3836rP.f33608T;
                    C3534lt c3534lt = c3836rP.f33623l;
                    VO vo = (VO) c3836rP.f33625n.f32901e;
                    S0.l lVar = ((C3944tP) c3534lt.f31863u).f34279l1;
                    long t6 = AbstractC3159eu.t(j6);
                    Handler handler = (Handler) lVar.f2797u;
                    if (handler != null) {
                        handler.post(new WO(lVar, vo.f28194d, t6, elapsedRealtime));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                C3567mP c3567mP2 = (C3567mP) obj;
                C3836rP c3836rP2 = c3567mP2.f31967b;
                if (c3567mP2.equals(c3836rP2.f33620h) && c3836rP2.f33600L) {
                    c3836rP2.f33601M = true;
                    return;
                }
                return;
            case 2:
                ((C3567mP) obj).a();
                return;
            case 3:
                ((C3567mP) obj).a();
                return;
            case 4:
                C3534lt c3534lt2 = ((C3729pP) obj).f33070a.f33623l;
                if (c3534lt2 != null) {
                    C3944tP c3944tP = (C3944tP) c3534lt2.f31863u;
                    synchronized (c3944tP.f27264n) {
                        c3649o = c3944tP.f27226L;
                    }
                    if (c3649o != null) {
                        synchronized (c3649o.f32825c) {
                            c3649o.f32827e.getClass();
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ((GQ) obj).getClass();
                return;
        }
    }
}

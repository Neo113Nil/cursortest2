package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.dP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3107dP implements InterfaceC3606mo, XP, InterfaceC3068cn {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f30548n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C3107dP f30542u = new C3107dP(0);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C3107dP f30543v = new C3107dP(1);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ C3107dP f30544w = new C3107dP(2);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ C3107dP f30545x = new C3107dP(3);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ C3107dP f30546y = new C3107dP(4);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ C3107dP f30547z = new C3107dP(5);

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ C3107dP f30540A = new C3107dP(6);

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ C3107dP f30541B = new C3107dP(9);

    public /* synthetic */ C3107dP(int i) {
        this.f30548n = i;
    }

    @Override // com.google.android.gms.internal.ads.XP
    public /* synthetic */ int a(Object obj) {
        HashMap hashMap = ZP.f29665a;
        String str = ((PP) obj).f27597a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3606mo
    /* renamed from: a */
    public void mo5a(Object obj) {
        long j6;
        C3672o c3672o;
        switch (this.f30548n) {
            case 0:
                C3590mP c3590mP = (C3590mP) obj;
                C3859rP c3859rP = c3590mP.f32747b;
                if (c3590mP.equals(c3859rP.f34388h) && c3859rP.f34391l != null) {
                    C3698oP c3698oP = c3859rP.f34393n;
                    int i = c3698oP.f33685b;
                    if (i != -1) {
                        long j9 = ((VO) c3698oP.f33688e).f28990d / i;
                        C3428jP c3428jP = c3859rP.f34397r;
                        c3428jP.getClass();
                        j6 = AbstractC3182eu.v(c3428jP.f32035a.getSampleRate(), j9);
                    } else {
                        j6 = com.anythink.basead.exoplayer.b.f7168b;
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime() - c3859rP.f34376T;
                    C3557lt c3557lt = c3859rP.f34391l;
                    VO vo = (VO) c3859rP.f34393n.f33688e;
                    S0.l lVar = ((C3967tP) c3557lt.f32643u).f35065g1;
                    long t6 = AbstractC3182eu.t(j6);
                    Handler handler = (Handler) lVar.f2926u;
                    if (handler != null) {
                        handler.post(new WO(lVar, vo.f28990d, t6, elapsedRealtime));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                C3590mP c3590mP2 = (C3590mP) obj;
                C3859rP c3859rP2 = c3590mP2.f32747b;
                if (c3590mP2.equals(c3859rP2.f34388h) && c3859rP2.f34368L) {
                    c3859rP2.f34369M = true;
                    return;
                }
                return;
            case 2:
                ((C3590mP) obj).a();
                return;
            case 3:
                ((C3590mP) obj).a();
                return;
            case 4:
                C3557lt c3557lt2 = ((C3752pP) obj).f33860a.f34391l;
                if (c3557lt2 != null) {
                    C3967tP c3967tP = (C3967tP) c3557lt2.f32643u;
                    synchronized (c3967tP.f28253n) {
                        c3672o = c3967tP.f28216L;
                    }
                    if (c3672o != null) {
                        synchronized (c3672o.f33612c) {
                            c3672o.f33614e.getClass();
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ((JQ) obj).getClass();
                return;
        }
    }
}

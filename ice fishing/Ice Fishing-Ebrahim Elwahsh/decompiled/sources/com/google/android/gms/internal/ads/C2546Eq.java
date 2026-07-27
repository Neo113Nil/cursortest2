package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.ArrayDeque;
import s2.C4997e;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.Eq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2546Eq implements CD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24823a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24824b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24825c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f24827e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f24828f;

    public /* synthetic */ C2546Eq(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f24823a = i;
        this.f24824b = obj;
        this.f24825c = obj2;
        this.f24826d = obj3;
        this.f24827e = obj4;
        this.f24828f = obj5;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    @Override // com.google.android.gms.internal.ads.CD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final J3.a b(Object obj) {
        C3173ew c3173ew;
        boolean z8;
        YC yc;
        InterfaceC4195xu interfaceC4195xu;
        switch (this.f24823a) {
            case 0:
                Uri uri = (Uri) this.f24825c;
                C2953au c2953au = (C2953au) this.f24826d;
                Ut ut = (Ut) this.f24827e;
                Wt wt = (Wt) this.f24828f;
                C2563Fq c2563Fq = (C2563Fq) this.f24824b;
                c2563Fq.getClass();
                try {
                    Intent intent = (Intent) new com.bumptech.glide.manager.n().b().f2910u;
                    intent.setData(uri);
                    C4997e c4997e = new C4997e(intent, null);
                    C3320hg c3320hg = new C3320hg();
                    C3644ni c3644ni = (C3644ni) c2563Fq.f25029c;
                    C3590mi c3590mi = new C3590mi(c3644ni.f32930b, c3644ni.f32933c, new C3602mu(c2953au, ut, (String) null), new C2881Yl(27, new C3602mu(c2563Fq, c3320hg, ut), (Object) null));
                    c3320hg.a(new AdOverlayInfoParcel(c4997e, null, (C2727Pk) c3590mi.f32718N0.d(), null, new C5107a(0, 0, false, false), null, null, wt.f28491b));
                    ((Tt) c2563Fq.f25031e).c(2, 3);
                    return C3686oN.c(c3590mi.L());
                } catch (Throwable th) {
                    int i = t2.C.f40822b;
                    u2.i.d("Error in CustomTabsAdRenderer", th);
                    throw th;
                }
            default:
                Q8 q82 = (Q8) this.f24824b;
                C2593Hm c2593Hm = (C2593Hm) this.f24825c;
                C3870rt c3870rt = (C3870rt) this.f24826d;
                At at = (At) this.f24827e;
                InterfaceC3592mk interfaceC3592mk = (InterfaceC3592mk) this.f24828f;
                C3978tt c3978tt = (C3978tt) obj;
                if (c3978tt != null) {
                    q82.getClass();
                    At at2 = c3870rt.f34130a;
                    C2593Hm c2593Hm2 = c3870rt.f34131b;
                    q2.d1 d1Var = c3870rt.f34132c;
                    String str = c3870rt.f34133d;
                    SD sd = c3870rt.f34134e;
                    q2.j1 j1Var = c3870rt.f34135f;
                    InterfaceC4195xu interfaceC4195xu2 = c3978tt.f34489a;
                    C3870rt c3870rt2 = new C3870rt(at2, c2593Hm2, d1Var, str, sd, j1Var, interfaceC4195xu2);
                    C4141wu c4141wu = c3978tt.f34491c;
                    if (c4141wu != null) {
                        q82.f27123x = null;
                        C3877s c3877s = (C3877s) q82.f27121v;
                        synchronized (c3877s) {
                            ((ArrayDeque) c3877s.f34152w).add(c3870rt2);
                        }
                        return q82.m(c4141wu, c2593Hm);
                    }
                    C3877s c3877s2 = (C3877s) q82.f27121v;
                    synchronized (c3877s2) {
                        c3877s2.f34149n = 2;
                        synchronized (c3877s2) {
                            try {
                                c3173ew = (C3173ew) c3877s2.f34153x;
                                z8 = c3173ew == null;
                            } finally {
                            }
                        }
                        if (yc == null) {
                            q82.f27123x = null;
                            return C3686oN.y(yc, new C3907sc(11, q82), (SD) q82.f27124y);
                        }
                        synchronized (c3877s2) {
                            ((ArrayDeque) c3877s2.f34152w).add(c3870rt2);
                        }
                        c2593Hm = new C2593Hm((InterfaceC4302zt) c2593Hm.f25416u, c3978tt.f34490b, 15, false);
                    }
                    if (z8) {
                        yc = null;
                    } else {
                        synchronized (c3173ew) {
                            try {
                                if (!c3173ew.f30555b && !c3173ew.f30554a && (interfaceC4195xu = ((C3870rt) c3173ew.f30556c).f34136g) != null && interfaceC4195xu.equals(interfaceC4195xu2)) {
                                    c3173ew.f30554a = true;
                                    yc = (YC) c3173ew.f30557d;
                                }
                                yc = null;
                            } finally {
                            }
                        }
                    }
                    if (yc == null) {
                    }
                }
                J3.a g9 = ((C2593Hm) q82.f27119n).g(c2593Hm, at, interfaceC3592mk);
                q82.f27123x = interfaceC3592mk;
                return g9;
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.Jq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2631Jq implements InterfaceC2779Sl {

    /* renamed from: A, reason: collision with root package name */
    public final Object f25819A;

    /* renamed from: B, reason: collision with root package name */
    public Object f25820B;

    /* renamed from: C, reason: collision with root package name */
    public Object f25821C;

    /* renamed from: n, reason: collision with root package name */
    public boolean f25822n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f25823u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f25824v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f25825w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f25826x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f25827y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f25828z;

    public C2631Jq(Context context, C5107a c5107a, C3320hg c3320hg, Ut ut, InterfaceC3858rh interfaceC3858rh, C3226fu c3226fu, boolean z8, C3153ec c3153ec, BinderC2949aq binderC2949aq, C3165eo c3165eo) {
        this.f25823u = context;
        this.f25824v = c5107a;
        this.f25825w = c3320hg;
        this.f25826x = ut;
        this.f25827y = interfaceC3858rh;
        this.f25828z = c3226fu;
        this.f25819A = c3153ec;
        this.f25822n = z8;
        this.f25820B = binderC2949aq;
        this.f25821C = c3165eo;
    }

    public void a(Runnable runnable) {
        ((Handler) ((InterfaceC3404jB) this.f25824v).a()).post(new LA(this, runnable, 1));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2779Sl
    public Ut d() {
        return (Ut) this.f25826x;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0052  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2779Sl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(boolean z8, Context context, C4293zk c4293zk) {
        boolean z9;
        boolean z10;
        boolean z11;
        float f6;
        boolean z12;
        C3590mi c3590mi = (C3590mi) C3686oN.I((C3320hg) this.f25825w);
        InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) this.f25827y;
        interfaceC3858rh.d1(true);
        C3153ec c3153ec = (C3153ec) this.f25819A;
        boolean z13 = this.f25822n;
        boolean z14 = false;
        boolean a9 = z13 ? c3153ec.a(false) : false;
        t2.G g9 = p2.j.f39798C.f39803c;
        boolean i = t2.G.i((Context) this.f25823u);
        if (z13) {
            synchronized (c3153ec) {
                z12 = c3153ec.f30442b;
            }
            if (!z12) {
                z9 = a9;
                z10 = i;
                z11 = false;
                z14 = true;
                if (z14) {
                    f6 = 0.0f;
                } else {
                    synchronized (c3153ec) {
                        f6 = c3153ec.f30443c;
                    }
                }
                float f9 = f6;
                Ut ut = (Ut) this.f25826x;
                p2.f fVar = new p2.f(z9, z10, z11, f9, z8, ut.f28128O, false);
                if (c4293zk != null) {
                    c4293zk.v1();
                }
                C2745Ql c2745Ql = (C2745Ql) c3590mi.f32724S0.d();
                Yt yt = ut.f28173s;
                L2.i.y(context, new AdOverlayInfoParcel(c2745Ql, interfaceC3858rh, ut.f28130Q, (C5107a) this.f25824v, ut.f28109B, fVar, yt.f28907b, yt.f28906a, ((C3226fu) this.f25828z).f30904g, c4293zk, !ut.b() ? (BinderC2949aq) this.f25820B : null, interfaceC3858rh.p()), true, (C3165eo) this.f25821C);
            }
            z14 = true;
        }
        z9 = a9;
        z10 = i;
        z11 = z14;
        if (z14) {
        }
        float f92 = f6;
        Ut ut2 = (Ut) this.f25826x;
        p2.f fVar2 = new p2.f(z9, z10, z11, f92, z8, ut2.f28128O, false);
        if (c4293zk != null) {
        }
        C2745Ql c2745Ql2 = (C2745Ql) c3590mi.f32724S0.d();
        Yt yt2 = ut2.f28173s;
        L2.i.y(context, new AdOverlayInfoParcel(c2745Ql2, interfaceC3858rh, ut2.f28130Q, (C5107a) this.f25824v, ut2.f28109B, fVar2, yt2.f28907b, yt2.f28906a, ((C3226fu) this.f25828z).f30904g, c4293zk, !ut2.b() ? (BinderC2949aq) this.f25820B : null, interfaceC3858rh.p()), true, (C3165eo) this.f25821C);
    }

    public C2631Jq() {
        this.f25823u = new HashMap();
        this.f25824v = new HashMap();
        this.f25825w = new HashMap();
        this.f25826x = new HashSet();
        this.f25827y = new HashSet();
        this.f25828z = new HashSet();
        this.f25819A = new HashMap();
        this.f25820B = new HashSet();
        this.f25821C = new WeakHashMap();
    }

    public C2631Jq(Context context, HE he, Intent intent) {
        this.f25827y = new ArrayList();
        this.f25823u = context;
        this.f25825w = he;
        this.f25826x = "OverlayDisplayService";
        this.f25828z = intent;
        this.f25824v = AbstractC3035cL.e(new Dr((byte) 0, 17));
        this.f25819A = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.KA
            @Override // android.os.IBinder.DeathRecipient
            public final /* synthetic */ void binderDied() {
                C2631Jq c2631Jq = C2631Jq.this;
                ((HE) c2631Jq.f25825w).a("%s : Binder has died.", (String) c2631Jq.f25826x);
                ArrayList arrayList = (ArrayList) c2631Jq.f25827y;
                synchronized (arrayList) {
                    arrayList.clear();
                }
            }
        };
    }
}

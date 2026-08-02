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
import r2.C4902g;
import r2.C4906k;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.Hq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2618Hq implements InterfaceC2883Xl {

    /* renamed from: A, reason: collision with root package name */
    public final Object f26129A;

    /* renamed from: B, reason: collision with root package name */
    public Object f26130B;

    /* renamed from: C, reason: collision with root package name */
    public Object f26131C;

    /* renamed from: n, reason: collision with root package name */
    public boolean f26132n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f26133u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f26134v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f26135w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f26136x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f26137y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f26138z;

    public C2618Hq(Context context, C5189a c5189a, C3490kg c3490kg, St st, InterfaceC4084vh interfaceC4084vh, C3075cu c3075cu, boolean z6, C3380ic c3380ic, BinderC2903Yp binderC2903Yp, C3230fo c3230fo) {
        this.f26133u = context;
        this.f26134v = c5189a;
        this.f26135w = c3490kg;
        this.f26136x = st;
        this.f26137y = interfaceC4084vh;
        this.f26138z = c3075cu;
        this.f26129A = c3380ic;
        this.f26132n = z6;
        this.f26130B = binderC2903Yp;
        this.f26131C = c3230fo;
    }

    public void a(Runnable runnable) {
        ((Handler) ((InterfaceC3254gB) this.f26134v).mo14c()).post(new IA(this, runnable, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0052  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2883Xl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(boolean z6, Context context, C2493Ak c2493Ak) {
        boolean z9;
        boolean z10;
        boolean z11;
        float f2;
        boolean z12;
        C3762pi c3762pi = (C3762pi) QC.w((C3490kg) this.f26135w);
        InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) this.f26137y;
        interfaceC4084vh.g1(true);
        C3380ic c3380ic = (C3380ic) this.f26129A;
        boolean z13 = this.f26132n;
        boolean z14 = false;
        boolean a9 = z13 ? c3380ic.a(false) : false;
        w2.D d9 = C4906k.f40186C.f40191c;
        boolean i = w2.D.i((Context) this.f26133u);
        if (z13) {
            synchronized (c3380ic) {
                z12 = c3380ic.f31825b;
            }
            if (!z12) {
                z9 = a9;
                z10 = i;
                z11 = false;
                z14 = true;
                if (z14) {
                    f2 = 0.0f;
                } else {
                    synchronized (c3380ic) {
                        f2 = c3380ic.f31826c;
                    }
                }
                float f9 = f2;
                St st = (St) this.f26136x;
                C4902g c4902g = new C4902g(z9, z10, z11, f9, z6, st.f28378O, false);
                if (c2493Ak != null) {
                    c2493Ak.R1();
                }
                C2834Ul c2834Ul = (C2834Ul) c3762pi.f33883Q0.f();
                Wt wt = st.f28423s;
                c4.e.q(context, new AdOverlayInfoParcel(c2834Ul, interfaceC4084vh, st.f28380Q, (C5189a) this.f26134v, st.f28359B, c4902g, wt.f29209b, wt.f29208a, ((C3075cu) this.f26138z).f30396g, c2493Ak, !st.b() ? (BinderC2903Yp) this.f26130B : null, interfaceC4084vh.p()), true, (C3230fo) this.f26131C);
            }
            z14 = true;
        }
        z9 = a9;
        z10 = i;
        z11 = z14;
        if (z14) {
        }
        float f92 = f2;
        St st2 = (St) this.f26136x;
        C4902g c4902g2 = new C4902g(z9, z10, z11, f92, z6, st2.f28378O, false);
        if (c2493Ak != null) {
        }
        C2834Ul c2834Ul2 = (C2834Ul) c3762pi.f33883Q0.f();
        Wt wt2 = st2.f28423s;
        c4.e.q(context, new AdOverlayInfoParcel(c2834Ul2, interfaceC4084vh, st2.f28380Q, (C5189a) this.f26134v, st2.f28359B, c4902g2, wt2.f29209b, wt2.f29208a, ((C3075cu) this.f26138z).f30396g, c2493Ak, !st2.b() ? (BinderC2903Yp) this.f26130B : null, interfaceC4084vh.p()), true, (C3230fo) this.f26131C);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2883Xl
    public St f() {
        return (St) this.f26136x;
    }

    public C2618Hq() {
        this.f26133u = new HashMap();
        this.f26134v = new HashMap();
        this.f26135w = new HashMap();
        this.f26136x = new HashSet();
        this.f26137y = new HashSet();
        this.f26138z = new HashSet();
        this.f26129A = new HashMap();
        this.f26130B = new HashSet();
        this.f26131C = new WeakHashMap();
    }

    public C2618Hq(Context context, C3956tE c3956tE, Intent intent) {
        this.f26137y = new ArrayList();
        this.f26133u = context;
        this.f26135w = c3956tE;
        this.f26136x = "OverlayDisplayService";
        this.f26138z = intent;
        this.f26134v = AbstractC3066cl.e(new C3609mr((byte) 0, 18));
        this.f26129A = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.HA
            @Override // android.os.IBinder.DeathRecipient
            public final /* synthetic */ void binderDied() {
                C2618Hq c2618Hq = C2618Hq.this;
                ((C3956tE) c2618Hq.f26135w).a("%s : Binder has died.", (String) c2618Hq.f26136x);
                ArrayList arrayList = (ArrayList) c2618Hq.f26137y;
                synchronized (arrayList) {
                    arrayList.clear();
                }
            }
        };
    }
}

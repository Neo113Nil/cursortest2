package com.google.android.gms.internal.ads;

import B2.C0280n;
import O2.InterfaceC0365b;
import O2.InterfaceC0366c;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import q2.C4927z0;
import q2.InterfaceC4900l0;

/* loaded from: classes2.dex */
public final class r implements InterfaceC3612n3, p2.d, LD, InterfaceC0365b, InterfaceC0366c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33918n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f33919u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f33920v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f33921w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f33922x;

    /* renamed from: y, reason: collision with root package name */
    public Object f33923y;

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f33918n = i;
        this.f33919u = obj;
        this.f33920v = obj2;
        this.f33921w = obj3;
        this.f33922x = obj4;
        this.f33923y = obj5;
    }

    public static D6 f() {
        C3830r6 C0 = D6.C0();
        C0.n(32768L);
        return (D6) C0.j();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3612n3
    public int a() {
        return ((long[]) this.f33920v).length;
    }

    public J3.a b(String str) {
        u2.k kVar = u2.k.f41245u;
        if (str != null) {
            if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31668g)).booleanValue() || !str.isEmpty()) {
                try {
                    return g(1, 0L, str);
                } catch (NullPointerException | RejectedExecutionException unused) {
                    return C3686oN.c(kVar);
                }
            }
        }
        return C3686oN.c(kVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3612n3
    public ArrayList c(long j9) {
        J3 j32 = (J3) this.f33919u;
        ArrayList arrayList = new ArrayList();
        String str = j32.f25723h;
        j32.g(j9, str, arrayList);
        TreeMap treeMap = new TreeMap();
        j32.h(j9, false, str, treeMap);
        HashMap hashMap = (HashMap) this.f33922x;
        j32.j(j9, (Map) this.f33921w, hashMap, str, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            String str2 = (String) ((HashMap) this.f33923y).get(pair.second);
            if (str2 != null) {
                byte[] decode = Base64.decode(str2, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                M3 m32 = (M3) hashMap.get(pair.first);
                m32.getClass();
                arrayList2.add(new C2522Dj(null, null, null, decodeByteArray, m32.f26296c, 0, m32.f26298e, m32.f26295b, 0, Integer.MIN_VALUE, -3.4028235E38f, m32.f26299f, m32.f26300g, m32.f26302j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            M3 m33 = (M3) hashMap.get(entry.getKey());
            m33.getClass();
            C3914sj c3914sj = (C3914sj) entry.getValue();
            CharSequence charSequence = c3914sj.f34261a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (H3 h32 : (H3[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), H3.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(h32), spannableStringBuilder.getSpanEnd(h32), (CharSequence) "");
            }
            int i4 = 0;
            while (i4 < spannableStringBuilder.length()) {
                int i9 = i4 + 1;
                if (spannableStringBuilder.charAt(i4) == ' ') {
                    int i10 = i9;
                    while (i10 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i10) == ' ') {
                        i10++;
                    }
                    int i11 = i10 - i9;
                    if (i11 > 0) {
                        spannableStringBuilder.delete(i4, i11 + i4);
                    }
                }
                i4 = i9;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i12 = 0;
            while (i12 < spannableStringBuilder.length() - 1) {
                int i13 = i12 + 1;
                if (spannableStringBuilder.charAt(i12) == '\n' && spannableStringBuilder.charAt(i13) == ' ') {
                    spannableStringBuilder.delete(i13, i12 + 2);
                }
                i12 = i13;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i14 = 0;
            while (i14 < spannableStringBuilder.length() - 1) {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i14) == ' ' && spannableStringBuilder.charAt(i15) == '\n') {
                    spannableStringBuilder.delete(i14, i15);
                }
                i14 = i15;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            c3914sj.f34265e = m33.f26296c;
            c3914sj.f34266f = m33.f26297d;
            c3914sj.f34267g = m33.f26298e;
            c3914sj.f34268h = m33.f26295b;
            c3914sj.f34271l = m33.f26299f;
            c3914sj.f34270k = m33.i;
            c3914sj.f34269j = m33.f26301h;
            c3914sj.f34273n = m33.f26302j;
            arrayList2.add(c3914sj.a());
        }
        return arrayList2;
    }

    @Override // p2.d
    public void d() {
        switch (this.f33918n) {
            case 5:
                break;
            default:
                Rw rw = (Rw) this.f33919u;
                if (rw != null) {
                    if (rw.j() || rw.d()) {
                        rw.h();
                        break;
                    }
                }
                break;
        }
    }

    public J3.a g(final int i, final long j9, final String str) {
        final String str2;
        u2.h hVar = (u2.h) this.f33919u;
        if (i > hVar.f41239a) {
            C4250yv c4250yv = (C4250yv) this.f33922x;
            if (c4250yv == null || !hVar.f41242d) {
                return C3686oN.c(u2.k.f41246v);
            }
            p2.j.f39798C.f39810k.getClass();
            C3614n5 c3614n5 = new C3614n5("", str, 2, System.currentTimeMillis());
            C2834Vp c2834Vp = c4250yv.f35424a;
            c2834Vp.getClass();
            c2834Vp.a(new C2593Hm(9, c2834Vp, c3614n5));
            return C3686oN.c(u2.k.f41247w);
        }
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.L9)).booleanValue()) {
            Uri parse = Uri.parse(str);
            String encodedQuery = parse.getEncodedQuery();
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            clearQuery.appendQueryParameter("pa", Integer.toString(i));
            String valueOf = String.valueOf(clearQuery.build());
            str2 = D.y.o(new StringBuilder(valueOf.length() + 1 + String.valueOf(encodedQuery).length()), valueOf, "&", encodedQuery);
        } else {
            str2 = str;
        }
        CD cd = new CD() { // from class: com.google.android.gms.internal.ads.xv
            @Override // com.google.android.gms.internal.ads.CD
            public final J3.a b(Object obj) {
                u2.k kVar = (u2.k) obj;
                u2.k kVar2 = u2.k.f41246v;
                r rVar = r.this;
                if (kVar != kVar2) {
                    rVar.getClass();
                    return C3686oN.c(kVar);
                }
                u2.h hVar2 = (u2.h) rVar.f33919u;
                long j10 = hVar2.f41240b;
                int i4 = i;
                if (i4 != 1) {
                    j10 = (long) (hVar2.f41241c * j9);
                }
                return rVar.g(i4 + 1, j10, str);
            }
        };
        Executor executor = (TD) this.f33921w;
        if (j9 == 0) {
            final int i4 = 1;
            return C3686oN.y(((C3157eg) executor).b(new Callable(this) { // from class: com.google.android.gms.internal.ads.wv

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ r f35090b;

                {
                    this.f35090b = this;
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    switch (i4) {
                    }
                    return this.f35090b.h(str2);
                }
            }), cd, executor);
        }
        final int i9 = 0;
        Callable callable = new Callable(this) { // from class: com.google.android.gms.internal.ads.wv

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f35090b;

            {
                this.f35090b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i9) {
                }
                return this.f35090b.h(str2);
            }
        };
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        XD xd = (XD) executor;
        xd.getClass();
        RunnableFutureC3083dE runnableFutureC3083dE = new RunnableFutureC3083dE(callable);
        return C3686oN.y(new VD(runnableFutureC3083dE, xd.f28620v.schedule(runnableFutureC3083dE, j9, timeUnit)), cd, xd);
    }

    public u2.k h(String str) {
        C2775Sh c2775Sh;
        C3151ea c3151ea = AbstractC3368ia.da;
        q2.r rVar = q2.r.f40116e;
        boolean booleanValue = ((Boolean) rVar.f40119c.a(c3151ea)).booleanValue();
        u2.l lVar = (u2.l) this.f33920v;
        if (booleanValue && (c2775Sh = (C2775Sh) this.f33923y) != null) {
            p2.j jVar = p2.j.f39798C;
            if (jVar.f39803c.F(str) || jVar.f39803c.G(str)) {
                C3256gN c3256gN = c2775Sh.f27588c;
                String encodeToString = c3256gN != null ? Base64.encodeToString(c3256gN.b(), 10) : null;
                HashMap hashMap = new HashMap();
                if (encodeToString != null) {
                    hashMap.put((String) rVar.f40119c.a(AbstractC3368ia.ea), encodeToString);
                }
                return lVar.a(hashMap, str);
            }
        }
        return lVar.a(null, str);
    }

    @Override // O2.InterfaceC0365b
    public void j() {
        Uw uw;
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) this.f33922x;
        HandlerThread handlerThread = (HandlerThread) this.f33923y;
        try {
            uw = (Uw) ((Rw) this.f33919u).u();
        } catch (DeadObjectException | IllegalStateException unused) {
            uw = null;
        }
        if (uw != null) {
            try {
                try {
                    Sw sw = new Sw(1, (String) this.f33920v, (String) this.f33921w);
                    Parcel A02 = uw.A0();
                    AbstractC3241g8.c(A02, sw);
                    Parcel D02 = uw.D0(A02, 1);
                    Tw tw = (Tw) AbstractC3241g8.b(D02, Tw.CREATOR);
                    D02.recycle();
                    if (tw.f27879u == null) {
                        try {
                            byte[] bArr = tw.f27880v;
                            YK yk = YK.f28820a;
                            int i = KK.f25952a;
                            tw.f27879u = D6.B0(bArr, YK.f28821b);
                            tw.f27880v = null;
                        } catch (C3845rL | NullPointerException e6) {
                            throw new IllegalStateException(e6);
                        }
                    }
                    tw.a();
                    linkedBlockingQueue.put(tw.f27879u);
                } catch (Throwable unused2) {
                    linkedBlockingQueue.put(f());
                }
            } catch (InterruptedException unused3) {
            } catch (Throwable th) {
                d();
                handlerThread.quit();
                throw th;
            }
            d();
            handlerThread.quit();
        }
    }

    @Override // com.google.android.gms.internal.ads.LD
    /* renamed from: l */
    public void mo7l(Object obj) {
        Yu yu;
        Yu yu2;
        Yu yu3;
        Yu yu4;
        switch (this.f33918n) {
            case 6:
                Q8 q82 = (Q8) this.f33923y;
                AbstractC2539Ej abstractC2539Ej = (AbstractC2539Ej) obj;
                synchronized (q82) {
                    if (abstractC2539Ej != null) {
                        try {
                            abstractC2539Ej.b();
                        } finally {
                        }
                    }
                    ((C2999bl) abstractC2539Ej.f24809g.f29564n.f33523u).f29565u = (Fr) ((C3602mu) q82.f27121v).f32775v;
                    ((C3761pr) this.f33919u).u(abstractC2539Ej);
                    ((C3214fi) q82.f27120u).b().execute(new RunnableC2641Kj(this, 1));
                    if (!((Boolean) AbstractC2547Fa.f24966c.r()).booleanValue() || (yu = (Yu) this.f33920v) == null) {
                        Zu zu = (Zu) q82.f27122w;
                        Vu vu = (Vu) this.f33921w;
                        vu.j(abstractC2539Ej.f24803a.f29349b);
                        vu.p0(abstractC2539Ej.f24808f.f33484n);
                        vu.b(true);
                        zu.b(vu.m());
                    } else {
                        yu.e(abstractC2539Ej.f24803a.f29349b);
                        yu.g(abstractC2539Ej.f24808f.f33484n);
                        Vu vu2 = (Vu) this.f33921w;
                        vu2.b(true);
                        yu.a(vu2);
                        yu.h();
                    }
                }
                return;
            case 7:
                C3493kt c3493kt = (C3493kt) this.f33923y;
                AbstractC2539Ej abstractC2539Ej2 = (AbstractC2539Ej) obj;
                synchronized (c3493kt) {
                    if (abstractC2539Ej2 != null) {
                        try {
                            abstractC2539Ej2.b();
                        } finally {
                        }
                    }
                    c3493kt.f32484j = null;
                    if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.q9)).booleanValue()) {
                        ((C2999bl) abstractC2539Ej2.f24809g.f29564n.f33523u).f29567w = c3493kt.f32479d;
                    }
                    ((Kr) this.f33919u).u(abstractC2539Ej2);
                    if (!((Boolean) AbstractC2547Fa.f24966c.r()).booleanValue() || (yu2 = (Yu) this.f33920v) == null) {
                        Zu zu2 = c3493kt.f32483h;
                        Vu vu3 = (Vu) this.f33921w;
                        vu3.j(abstractC2539Ej2.f24803a.f29349b);
                        vu3.p0(abstractC2539Ej2.f24808f.f33484n);
                        vu3.b(true);
                        zu2.b(vu3.m());
                    } else {
                        yu2.e(abstractC2539Ej2.f24803a.f29349b);
                        yu2.g(abstractC2539Ej2.f24808f.f33484n);
                        Vu vu4 = (Vu) this.f33921w;
                        vu4.b(true);
                        yu2.a(vu4);
                        yu2.h();
                    }
                }
                return;
            case 8:
                Gt gt = (Gt) this.f33923y;
                C2660Ll c2660Ll = (C2660Ll) obj;
                synchronized (gt) {
                    if (c2660Ll != null) {
                        try {
                            c2660Ll.b();
                        } finally {
                        }
                    }
                    gt.i = null;
                    C3151ea c3151ea = AbstractC3368ia.r9;
                    q2.r rVar = q2.r.f40116e;
                    if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                        C3761pr c3761pr = c2660Ll.f24809g.f29564n;
                        Fr fr = gt.f25237d;
                        C2999bl c2999bl = (C2999bl) c3761pr.f33523u;
                        c2999bl.f29565u = fr;
                        c2999bl.f29568x = gt.f25238e;
                    }
                    ((Kr) this.f33919u).u(c2660Ll);
                    if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                        final int i = 1;
                        gt.f25235b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.Et

                            /* renamed from: u, reason: collision with root package name */
                            public final /* synthetic */ r f24841u;

                            {
                                this.f24841u = this;
                            }

                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                switch (i) {
                                    case 0:
                                        ((Gt) this.f24841u.f33923y).f25238e.e();
                                        break;
                                    default:
                                        ((Gt) this.f24841u.f33923y).f25237d.e();
                                        break;
                                }
                            }
                        });
                        final int i4 = 0;
                        gt.f25235b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.Et

                            /* renamed from: u, reason: collision with root package name */
                            public final /* synthetic */ r f24841u;

                            {
                                this.f24841u = this;
                            }

                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                switch (i4) {
                                    case 0:
                                        ((Gt) this.f24841u.f33923y).f25238e.e();
                                        break;
                                    default:
                                        ((Gt) this.f24841u.f33923y).f25237d.e();
                                        break;
                                }
                            }
                        });
                    }
                    if (!((Boolean) AbstractC2547Fa.f24966c.r()).booleanValue() || (yu3 = (Yu) this.f33920v) == null) {
                        Zu zu3 = gt.f25240g;
                        Vu vu5 = (Vu) this.f33921w;
                        vu5.j(c2660Ll.f24803a.f29349b);
                        vu5.p0(c2660Ll.f24808f.f33484n);
                        vu5.b(true);
                        zu3.b(vu5.m());
                    } else {
                        yu3.e(c2660Ll.f24803a.f29349b);
                        yu3.g(c2660Ll.f24808f.f33484n);
                        Vu vu6 = (Vu) this.f33921w;
                        vu6.b(true);
                        yu3.a(vu6);
                        yu3.h();
                    }
                }
                return;
            default:
                Pt pt = (Pt) this.f33923y;
                C2492Bn c2492Bn = (C2492Bn) obj;
                synchronized (pt) {
                    if (c2492Bn != null) {
                        try {
                            c2492Bn.b();
                        } finally {
                        }
                    }
                    ((C2999bl) c2492Bn.f24809g.f29564n.f33523u).f29568x = pt.f27073d;
                    ((Kr) this.f33919u).u(c2492Bn);
                    Executor executor = pt.f27071b;
                    Jt jt = pt.f27073d;
                    Objects.requireNonNull(jt);
                    executor.execute(new RunnableC3376ij(25, jt));
                    pt.f27073d.d();
                    if (!((Boolean) AbstractC2547Fa.f24966c.r()).booleanValue() || (yu4 = (Yu) this.f33920v) == null) {
                        Zu zu4 = pt.f27076g;
                        Vu vu7 = (Vu) this.f33921w;
                        vu7.j(c2492Bn.f24803a.f29349b);
                        vu7.p0(c2492Bn.f24808f.f33484n);
                        vu7.b(true);
                        zu4.b(vu7.m());
                    } else {
                        yu4.e(c2492Bn.f24803a.f29349b);
                        yu4.g(c2492Bn.f24808f.f33484n);
                        Vu vu8 = (Vu) this.f33921w;
                        vu8.b(true);
                        yu4.a(vu8);
                        yu4.h();
                    }
                }
                return;
        }
    }

    @Override // O2.InterfaceC0366c
    public void onConnectionFailed(L2.b bVar) {
        try {
            ((LinkedBlockingQueue) this.f33922x).put(f());
        } catch (InterruptedException unused) {
        }
    }

    @Override // O2.InterfaceC0365b
    public void onConnectionSuspended(int i) {
        try {
            ((LinkedBlockingQueue) this.f33922x).put(f());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.LD
    public void q(Throwable th) {
        Yu yu;
        Yu yu2;
        Yu yu3;
        Yu yu4;
        switch (this.f33918n) {
            case 6:
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31463I6)).booleanValue()) {
                    t2.C.l("Native ad failed to load", th);
                }
                C3105di c3105di = (C3105di) this.f33922x;
                C4927z0 w9 = AbstractC3217fl.w(th, ((C2709Oj) c3105di.f30173v0.d()).f26747l);
                ((C4077vk) c3105di.f30165r0.d()).v(w9);
                Q8 q82 = (Q8) this.f33923y;
                ((C3214fi) q82.f27120u).b().execute(new RunnableC3329hp(6, this, w9));
                AbstractC2655Lg.i(w9.f40122n, "NativeAdLoader.onFailure", th);
                ((C3761pr) this.f33919u).mo4a();
                boolean booleanValue = ((Boolean) AbstractC2547Fa.f24966c.r()).booleanValue();
                Vu vu = (Vu) this.f33921w;
                if (!booleanValue || (yu = (Yu) this.f33920v) == null) {
                    vu.g(w9);
                    vu.c(th);
                    vu.b(false);
                    ((Zu) q82.f27122w).b(vu.m());
                    return;
                }
                yu.f(w9);
                vu.c(th);
                vu.b(false);
                yu.a(vu);
                yu.h();
                return;
            case 7:
                C3151ea c3151ea = AbstractC3368ia.f31463I6;
                q2.r rVar = q2.r.f40116e;
                if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                    t2.C.l("App open ad failed to load", th);
                }
                C3493kt c3493kt = (C3493kt) this.f33923y;
                C3375ii c3375ii = (C3375ii) c3493kt.f32480e.o();
                C4927z0 w10 = c3375ii == null ? AbstractC3217fl.w(th, null) : AbstractC3217fl.w(th, c3375ii.a().f26747l);
                synchronized (c3493kt) {
                    try {
                        c3493kt.f32484j = null;
                        if (c3375ii != null) {
                            ((C4077vk) c3375ii.f31986y0.d()).v(w10);
                            if (((Boolean) rVar.f40119c.a(AbstractC3368ia.q9)).booleanValue()) {
                                c3493kt.f32477b.execute(new RunnableC3329hp(7, this, w10));
                            }
                        } else {
                            c3493kt.f32479d.v(w10);
                            c3493kt.b((C3279gt) this.f33922x).a().a().f26742f.q();
                        }
                        AbstractC2655Lg.i(w10.f40122n, "AppOpenAdLoader.onFailure", th);
                        ((Kr) this.f33919u).mo0a();
                        if (!((Boolean) AbstractC2547Fa.f24966c.r()).booleanValue() || (yu2 = (Yu) this.f33920v) == null) {
                            Zu zu = c3493kt.f32483h;
                            Vu vu2 = (Vu) this.f33921w;
                            vu2.g(w10);
                            vu2.c(th);
                            vu2.b(false);
                            zu.b(vu2.m());
                        } else {
                            yu2.f(w10);
                            Vu vu3 = (Vu) this.f33921w;
                            vu3.c(th);
                            vu3.b(false);
                            yu2.a(vu3);
                            yu2.h();
                        }
                    } finally {
                    }
                }
                return;
            case 8:
                C3151ea c3151ea2 = AbstractC3368ia.f31463I6;
                q2.r rVar2 = q2.r.f40116e;
                if (((Boolean) rVar2.f40119c.a(c3151ea2)).booleanValue()) {
                    t2.C.l("Interstitial ad failed to load", th);
                }
                C3644ni c3644ni = (C3644ni) this.f33922x;
                final C4927z0 w11 = AbstractC3217fl.w(th, ((C2709Oj) c3644ni.f32884D0.d()).f26747l);
                Gt gt = (Gt) this.f33923y;
                synchronized (gt) {
                    try {
                        gt.i = null;
                        ((C4077vk) c3644ni.f32975s0.d()).v(w11);
                        if (((Boolean) rVar2.f40119c.a(AbstractC3368ia.r9)).booleanValue()) {
                            final int i = 0;
                            gt.f25235b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.Ft

                                /* renamed from: u, reason: collision with root package name */
                                public final /* synthetic */ r f25047u;

                                {
                                    this.f25047u = this;
                                }

                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    switch (i) {
                                        case 0:
                                            ((Gt) this.f25047u.f33923y).f25237d.v(w11);
                                            break;
                                        default:
                                            ((Gt) this.f25047u.f33923y).f25238e.v(w11);
                                            break;
                                    }
                                }
                            });
                            final int i4 = 1;
                            gt.f25235b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.Ft

                                /* renamed from: u, reason: collision with root package name */
                                public final /* synthetic */ r f25047u;

                                {
                                    this.f25047u = this;
                                }

                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    switch (i4) {
                                        case 0:
                                            ((Gt) this.f25047u.f33923y).f25237d.v(w11);
                                            break;
                                        default:
                                            ((Gt) this.f25047u.f33923y).f25238e.v(w11);
                                            break;
                                    }
                                }
                            });
                        }
                        AbstractC2655Lg.i(w11.f40122n, "InterstitialAdLoader.onFailure", th);
                        ((Kr) this.f33919u).mo0a();
                        if (!((Boolean) AbstractC2547Fa.f24966c.r()).booleanValue() || (yu3 = (Yu) this.f33920v) == null) {
                            Zu zu2 = gt.f25240g;
                            Vu vu4 = (Vu) this.f33921w;
                            vu4.g(w11);
                            vu4.c(th);
                            vu4.b(false);
                            zu2.b(vu4.m());
                        } else {
                            yu3.f(w11);
                            Vu vu5 = (Vu) this.f33921w;
                            vu5.c(th);
                            vu5.b(false);
                            yu3.a(vu5);
                            yu3.h();
                        }
                    } finally {
                    }
                }
                return;
            default:
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31463I6)).booleanValue()) {
                    t2.C.l("Rewarded ad failed to load", th);
                }
                Pt pt = (Pt) this.f33923y;
                C3806qi c3806qi = (C3806qi) pt.f27074e.o();
                C4927z0 w12 = c3806qi == null ? AbstractC3217fl.w(th, null) : AbstractC3217fl.w(th, c3806qi.a().f26747l);
                synchronized (pt) {
                    try {
                        if (c3806qi != null) {
                            ((C4077vk) c3806qi.f33741A0.d()).v(w12);
                            pt.f27071b.execute(new RunnableC3329hp(9, this, w12));
                        } else {
                            pt.f27073d.v(w12);
                            pt.b((Nt) this.f33922x).b().a().f26742f.q();
                        }
                        AbstractC2655Lg.i(w12.f40122n, "RewardedAdLoader.onFailure", th);
                        ((Kr) this.f33919u).mo0a();
                        if (!((Boolean) AbstractC2547Fa.f24966c.r()).booleanValue() || (yu4 = (Yu) this.f33920v) == null) {
                            Zu zu3 = pt.f27076g;
                            Vu vu6 = (Vu) this.f33921w;
                            vu6.g(w12);
                            vu6.c(th);
                            vu6.b(false);
                            zu3.b(vu6.m());
                        } else {
                            yu4.f(w12);
                            Vu vu7 = (Vu) this.f33921w;
                            vu7.c(th);
                            vu7.b(false);
                            yu4.a(vu7);
                            yu4.h();
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3612n3
    public long t(int i) {
        return ((long[]) this.f33920v)[i];
    }

    @Override // p2.d
    public void v(View view) {
        C2478Aq c2478Aq = (C2478Aq) ((C3599mr) this.f33923y).f32767e;
        Ut ut = (Ut) this.f33921w;
        C2509Cn c2509Cn = new C2509Cn(new C3562m7(c2478Aq, ut), null, 1);
        C3602mu c3602mu = new C3602mu((C2953au) this.f33920v, ut, (String) null);
        C3644ni c3644ni = (C3644ni) c2478Aq.f23905u;
        C3590mi c3590mi = new C3590mi(c3644ni.f32930b, c3644ni.f32933c, c3602mu, c2509Cn);
        C3761pr c3761pr = new C3761pr(c2478Aq, c3590mi);
        C3868rr c3868rr = (C3868rr) this.f33922x;
        synchronized (c3868rr) {
            c3868rr.f34122n = c3761pr;
        }
        ((C3320hg) this.f33919u).a(c3590mi.L());
    }

    public r(int[] iArr, C3041cR[] c3041cRArr, int[] iArr2, int[][][] iArr3, C3041cR c3041cR) {
        this.f33918n = 0;
        this.f33919u = iArr;
        this.f33921w = c3041cRArr;
        this.f33922x = iArr3;
        this.f33920v = iArr2;
        this.f33923y = c3041cR;
    }

    public r(Context context, C2486Bh c2486Bh, C2486Bh c2486Bh2, C3165eo c3165eo) {
        this.f33918n = 3;
        this.f33919u = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f33921w = c2486Bh;
        this.f33920v = c2486Bh2;
        this.f33923y = null;
        this.f33922x = c3165eo;
    }

    public r(Context context, String str, String str2) {
        this.f33918n = 11;
        this.f33920v = str;
        this.f33921w = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f33923y = handlerThread;
        handlerThread.start();
        Rw rw = new Rw(context, handlerThread.getLooper(), this, this, 9200000);
        this.f33919u = rw;
        this.f33922x = new LinkedBlockingQueue();
        rw.o();
    }

    public r(J3 j32, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f33918n = 1;
        this.f33919u = j32;
        this.f33922x = hashMap2;
        this.f33923y = hashMap3;
        this.f33921w = Collections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        j32.f(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.f33920v = jArr;
    }

    public r(Q8 q82, C3761pr c3761pr, Yu yu, Vu vu, C3105di c3105di) {
        this.f33918n = 6;
        this.f33919u = c3761pr;
        this.f33920v = yu;
        this.f33921w = vu;
        this.f33922x = c3105di;
        Objects.requireNonNull(q82);
        this.f33923y = q82;
    }

    public r(InterfaceC2667Mb interfaceC2667Mb) {
        InterfaceC3637nb interfaceC3637nb;
        IBinder iBinder;
        this.f33918n = 2;
        this.f33920v = new ArrayList();
        this.f33922x = new k2.v();
        this.f33923y = new ArrayList();
        this.f33919u = interfaceC2667Mb;
        C3691ob c3691ob = null;
        try {
            List f6 = interfaceC2667Mb.f();
            if (f6 != null) {
                for (Object obj : f6) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        interfaceC3637nb = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        interfaceC3637nb = queryLocalInterface instanceof InterfaceC3637nb ? (InterfaceC3637nb) queryLocalInterface : new C3583mb(iBinder);
                    }
                    if (interfaceC3637nb != null) {
                        ((ArrayList) this.f33920v).add(new C3691ob(interfaceC3637nb));
                    }
                }
            }
        } catch (RemoteException e6) {
            u2.i.d("", e6);
        }
        try {
            List R8 = ((InterfaceC2667Mb) this.f33919u).R();
            if (R8 != null) {
                for (Object obj2 : R8) {
                    InterfaceC4900l0 G32 = obj2 instanceof IBinder ? q2.L0.G3((IBinder) obj2) : null;
                    if (G32 != null) {
                        ((ArrayList) this.f33923y).add(new C0280n(G32));
                    }
                }
            }
        } catch (RemoteException e9) {
            u2.i.d("", e9);
        }
        try {
            InterfaceC3637nb g9 = ((InterfaceC2667Mb) this.f33919u).g();
            if (g9 != null) {
                c3691ob = new C3691ob(g9);
            }
        } catch (RemoteException e10) {
            u2.i.d("", e10);
        }
        this.f33921w = c3691ob;
        try {
            if (((InterfaceC2667Mb) this.f33919u).n() != null) {
                new C3761pr(((InterfaceC2667Mb) this.f33919u).n());
            }
        } catch (RemoteException e11) {
            u2.i.d("", e11);
        }
    }

    private final void e() {
    }

    @Override // p2.d
    public void i() {
    }

    public r(C3599mr c3599mr, C3320hg c3320hg, C2953au c2953au, Ut ut, C3868rr c3868rr) {
        this.f33918n = 5;
        this.f33919u = c3320hg;
        this.f33920v = c2953au;
        this.f33921w = ut;
        this.f33922x = c3868rr;
        Objects.requireNonNull(c3599mr);
        this.f33923y = c3599mr;
    }

    public r(C3493kt c3493kt, Kr kr, Yu yu, Vu vu, C3279gt c3279gt) {
        this.f33918n = 7;
        this.f33919u = kr;
        this.f33920v = yu;
        this.f33921w = vu;
        this.f33922x = c3279gt;
        Objects.requireNonNull(c3493kt);
        this.f33923y = c3493kt;
    }

    public r(Gt gt, Kr kr, Yu yu, Vu vu, C3644ni c3644ni) {
        this.f33918n = 8;
        this.f33919u = kr;
        this.f33920v = yu;
        this.f33921w = vu;
        this.f33922x = c3644ni;
        Objects.requireNonNull(gt);
        this.f33923y = gt;
    }

    public r(Pt pt, Kr kr, Yu yu, Vu vu, Nt nt) {
        this.f33918n = 9;
        this.f33919u = kr;
        this.f33920v = yu;
        this.f33921w = vu;
        this.f33922x = nt;
        Objects.requireNonNull(pt);
        this.f33923y = pt;
    }
}

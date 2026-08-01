package com.google.android.gms.internal.ads;

import C2.C0281n;
import P2.InterfaceC0372b;
import P2.InterfaceC0373c;
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
import p2.C4835j;
import p2.InterfaceC4829d;
import q2.C4920z0;
import q2.InterfaceC4893l0;

/* renamed from: com.google.android.gms.internal.ads.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3864s implements InterfaceC3707p3, InterfaceC4829d, KD, InterfaceC0372b, InterfaceC0373c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33785n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f33786u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f33787v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f33788w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f33789x;

    /* renamed from: y, reason: collision with root package name */
    public Object f33790y;

    public /* synthetic */ C3864s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f33785n = i;
        this.f33786u = obj;
        this.f33787v = obj2;
        this.f33788w = obj3;
        this.f33789x = obj4;
        this.f33790y = obj5;
    }

    public static H6 g() {
        C3979u6 C0 = H6.C0();
        C0.n(32768L);
        return (H6) C0.j();
    }

    public N3.a a(String str) {
        v2.k kVar = v2.k.f41419u;
        if (str != null) {
            if (!((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32250g)).booleanValue() || !str.isEmpty()) {
                try {
                    return h(1, 0L, str);
                } catch (NullPointerException | RejectedExecutionException unused) {
                    return QC.c(kVar);
                }
            }
        }
        return QC.c(kVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3707p3
    public ArrayList b(long j6) {
        L3 l32 = (L3) this.f33786u;
        ArrayList arrayList = new ArrayList();
        String str = l32.f26053h;
        l32.g(j6, str, arrayList);
        TreeMap treeMap = new TreeMap();
        l32.h(j6, false, str, treeMap);
        HashMap hashMap = (HashMap) this.f33789x;
        l32.j(j6, (Map) this.f33788w, hashMap, str, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            String str2 = (String) ((HashMap) this.f33790y).get(pair.second);
            if (str2 != null) {
                byte[] decode = Base64.decode(str2, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                P3 p32 = (P3) hashMap.get(pair.first);
                p32.getClass();
                arrayList2.add(new C4279zj(null, null, null, decodeByteArray, p32.f26731c, 0, p32.f26733e, p32.f26730b, 0, Integer.MIN_VALUE, -3.4028235E38f, p32.f26734f, p32.f26735g, p32.f26737j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            P3 p33 = (P3) hashMap.get(entry.getKey());
            p33.getClass();
            C3901sj c3901sj = (C3901sj) entry.getValue();
            CharSequence charSequence = c3901sj.f34119a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (J3 j32 : (J3[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), J3.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(j32), spannableStringBuilder.getSpanEnd(j32), (CharSequence) "");
            }
            int i6 = 0;
            while (i6 < spannableStringBuilder.length()) {
                int i9 = i6 + 1;
                if (spannableStringBuilder.charAt(i6) == ' ') {
                    int i10 = i9;
                    while (i10 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i10) == ' ') {
                        i10++;
                    }
                    int i11 = i10 - i9;
                    if (i11 > 0) {
                        spannableStringBuilder.delete(i6, i11 + i6);
                    }
                }
                i6 = i9;
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
            c3901sj.f34123e = p33.f26731c;
            c3901sj.f34124f = p33.f26732d;
            c3901sj.f34125g = p33.f26733e;
            c3901sj.f34126h = p33.f26730b;
            c3901sj.f34129l = p33.f26734f;
            c3901sj.f34128k = p33.i;
            c3901sj.f34127j = p33.f26736h;
            c3901sj.f34131n = p33.f26737j;
            arrayList2.add(c3901sj.a());
        }
        return arrayList2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3707p3
    public int c() {
        return ((long[]) this.f33787v).length;
    }

    @Override // p2.InterfaceC4829d
    public void e(View view) {
        C4178xq c4178xq = (C4178xq) ((C3424jr) this.f33790y).f31332e;
        St st = (St) this.f33788w;
        C2493Bn c2493Bn = new C2493Bn(new C3657o7(c4178xq, st), null, 1);
        C3481ku c3481ku = new C3481ku((Yt) this.f33787v, st, (String) null);
        C3793qi c3793qi = (C3793qi) c4178xq.f35055u;
        C3739pi c3739pi = new C3739pi(c3793qi.f33311b, c3793qi.f33314c, c3481ku, c2493Bn);
        C3694or c3694or = new C3694or(c4178xq, c3739pi);
        C3802qr c3802qr = (C3802qr) this.f33789x;
        synchronized (c3802qr) {
            c3802qr.f33428n = c3694or;
        }
        ((C3467kg) this.f33786u).b(c3739pi.T());
    }

    @Override // p2.InterfaceC4829d
    public void f() {
        switch (this.f33785n) {
            case 5:
                break;
            default:
                Qw qw = (Qw) this.f33786u;
                if (qw != null) {
                    if (qw.i() || qw.e()) {
                        qw.h();
                        break;
                    }
                }
                break;
        }
    }

    public N3.a h(final int i, final long j6, final String str) {
        final String str2;
        v2.h hVar = (v2.h) this.f33786u;
        if (i > hVar.f41413a) {
            C4129wv c4129wv = (C4129wv) this.f33789x;
            if (c4129wv == null || !hVar.f41416d) {
                return QC.c(v2.k.f41420v);
            }
            C4835j.f39733C.f39745k.getClass();
            C3709p5 c3709p5 = new C3709p5("", str, 2, System.currentTimeMillis());
            C2800Tp c2800Tp = c4129wv.f34903a;
            c2800Tp.getClass();
            c2800Tp.a(new S0.l(14, c2800Tp, c3709p5));
            return QC.c(v2.k.f41421w);
        }
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.L9)).booleanValue()) {
            Uri parse = Uri.parse(str);
            String encodedQuery = parse.getEncodedQuery();
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            clearQuery.appendQueryParameter("pa", Integer.toString(i));
            String valueOf = String.valueOf(clearQuery.build());
            str2 = D.y.s(new StringBuilder(valueOf.length() + 1 + String.valueOf(encodedQuery).length()), valueOf, "&", encodedQuery);
        } else {
            str2 = str;
        }
        BD bd = new BD() { // from class: com.google.android.gms.internal.ads.vv
            @Override // com.google.android.gms.internal.ads.BD
            public final N3.a a(Object obj) {
                v2.k kVar = (v2.k) obj;
                v2.k kVar2 = v2.k.f41420v;
                C3864s c3864s = C3864s.this;
                if (kVar != kVar2) {
                    c3864s.getClass();
                    return QC.c(kVar);
                }
                v2.h hVar2 = (v2.h) c3864s.f33786u;
                long j9 = hVar2.f41414b;
                int i6 = i;
                if (i6 != 1) {
                    j9 = (long) (hVar2.f41415c * j6);
                }
                return c3864s.h(i6 + 1, j9, str);
            }
        };
        Executor executor = (SD) this.f33788w;
        if (j6 == 0) {
            final int i6 = 1;
            return QC.t(((C3360ig) executor).b(new Callable(this) { // from class: com.google.android.gms.internal.ads.uv

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C3864s f34609b;

                {
                    this.f34609b = this;
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    switch (i6) {
                    }
                    return this.f34609b.j(str2);
                }
            }), bd, executor);
        }
        final int i9 = 0;
        Callable callable = new Callable(this) { // from class: com.google.android.gms.internal.ads.uv

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C3864s f34609b;

            {
                this.f34609b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i9) {
                }
                return this.f34609b.j(str2);
            }
        };
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        WD wd = (WD) executor;
        wd.getClass();
        RunnableFutureC2966bE runnableFutureC2966bE = new RunnableFutureC2966bE(callable);
        return QC.t(new UD(runnableFutureC2966bE, wd.f28325v.schedule(runnableFutureC2966bE, j6, timeUnit)), bd, wd);
    }

    public v2.k j(String str) {
        C2824Vh c2824Vh;
        C3301ha c3301ha = AbstractC3569ma.da;
        q2.r rVar = q2.r.f40207e;
        boolean booleanValue = ((Boolean) rVar.f40210c.a(c3301ha)).booleanValue();
        v2.l lVar = (v2.l) this.f33787v;
        if (booleanValue && (c2824Vh = (C2824Vh) this.f33790y) != null) {
            C4835j c4835j = C4835j.f39733C;
            if (c4835j.f39738c.F(str) || c4835j.f39738c.G(str)) {
                TM tm = c2824Vh.f28224c;
                String encodeToString = tm != null ? Base64.encodeToString(tm.b(), 10) : null;
                HashMap hashMap = new HashMap();
                if (encodeToString != null) {
                    hashMap.put((String) rVar.f40210c.a(AbstractC3569ma.ea), encodeToString);
                }
                return lVar.a(hashMap, str);
            }
        }
        return lVar.a(null, str);
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public void mo11n(Object obj) {
        Vu vu;
        Vu vu2;
        Vu vu3;
        Vu vu4;
        switch (this.f33785n) {
            case 6:
                T8 t82 = (T8) this.f33790y;
                AbstractC2557Fj abstractC2557Fj = (AbstractC2557Fj) obj;
                synchronized (t82) {
                    if (abstractC2557Fj != null) {
                        try {
                            abstractC2557Fj.b();
                        } finally {
                        }
                    }
                    ((C3097dl) abstractC2557Fj.f24839g.f29838n.f32954u).f29839u = (Dr) ((C3481ku) t82.f27697v).f31664v;
                    ((C3694or) this.f33786u).s(abstractC2557Fj);
                    ((C3309hi) t82.f27696u).b().execute(new RunnableC2642Kj(this, 1));
                    if (!((Boolean) AbstractC2633Ka.f25928c.r()).booleanValue() || (vu = (Vu) this.f33787v) == null) {
                        Wu wu = (Wu) t82.f27698w;
                        Su su = (Su) this.f33788w;
                        su.j(abstractC2557Fj.f24833a.f28754b);
                        su.m(abstractC2557Fj.f24838f.f33698n);
                        su.a(true);
                        wu.b(su.q());
                    } else {
                        vu.e(abstractC2557Fj.f24833a.f28754b);
                        vu.g(abstractC2557Fj.f24838f.f33698n);
                        Su su2 = (Su) this.f33788w;
                        su2.a(true);
                        vu.a(su2);
                        vu.h();
                    }
                }
                return;
            case 7:
                C3426jt c3426jt = (C3426jt) this.f33790y;
                AbstractC2557Fj abstractC2557Fj2 = (AbstractC2557Fj) obj;
                synchronized (c3426jt) {
                    if (abstractC2557Fj2 != null) {
                        try {
                            abstractC2557Fj2.b();
                        } finally {
                        }
                    }
                    c3426jt.f31343j = null;
                    if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.q9)).booleanValue()) {
                        ((C3097dl) abstractC2557Fj2.f24839g.f29838n.f32954u).f29841w = c3426jt.f31338d;
                    }
                    ((Ir) this.f33786u).s(abstractC2557Fj2);
                    if (!((Boolean) AbstractC2633Ka.f25928c.r()).booleanValue() || (vu2 = (Vu) this.f33787v) == null) {
                        Wu wu2 = c3426jt.f31342h;
                        Su su3 = (Su) this.f33788w;
                        su3.j(abstractC2557Fj2.f24833a.f28754b);
                        su3.m(abstractC2557Fj2.f24838f.f33698n);
                        su3.a(true);
                        wu2.b(su3.q());
                    } else {
                        vu2.e(abstractC2557Fj2.f24833a.f28754b);
                        vu2.g(abstractC2557Fj2.f24838f.f33698n);
                        Su su4 = (Su) this.f33788w;
                        su4.a(true);
                        vu2.a(su4);
                        vu2.h();
                    }
                }
                return;
            case 8:
                Gt gt = (Gt) this.f33790y;
                C2695Nl c2695Nl = (C2695Nl) obj;
                synchronized (gt) {
                    if (c2695Nl != null) {
                        try {
                            c2695Nl.b();
                        } finally {
                        }
                    }
                    gt.i = null;
                    C3301ha c3301ha = AbstractC3569ma.r9;
                    q2.r rVar = q2.r.f40207e;
                    if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
                        C3694or c3694or = c2695Nl.f24839g.f29838n;
                        Dr dr = gt.f25153d;
                        C3097dl c3097dl = (C3097dl) c3694or.f32954u;
                        c3097dl.f29839u = dr;
                        c3097dl.f29842x = gt.f25154e;
                    }
                    ((Ir) this.f33786u).s(c2695Nl);
                    if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
                        final int i = 1;
                        gt.f25151b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.Et

                            /* renamed from: u, reason: collision with root package name */
                            public final /* synthetic */ C3864s f24672u;

                            {
                                this.f24672u = this;
                            }

                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                switch (i) {
                                    case 0:
                                        ((Gt) this.f24672u.f33790y).f25154e.h();
                                        break;
                                    default:
                                        ((Gt) this.f24672u.f33790y).f25153d.h();
                                        break;
                                }
                            }
                        });
                        final int i6 = 0;
                        gt.f25151b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.Et

                            /* renamed from: u, reason: collision with root package name */
                            public final /* synthetic */ C3864s f24672u;

                            {
                                this.f24672u = this;
                            }

                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                switch (i6) {
                                    case 0:
                                        ((Gt) this.f24672u.f33790y).f25154e.h();
                                        break;
                                    default:
                                        ((Gt) this.f24672u.f33790y).f25153d.h();
                                        break;
                                }
                            }
                        });
                    }
                    if (!((Boolean) AbstractC2633Ka.f25928c.r()).booleanValue() || (vu3 = (Vu) this.f33787v) == null) {
                        Wu wu3 = gt.f25156g;
                        Su su5 = (Su) this.f33788w;
                        su5.j(c2695Nl.f24833a.f28754b);
                        su5.m(c2695Nl.f24838f.f33698n);
                        su5.a(true);
                        wu3.b(su5.q());
                    } else {
                        vu3.e(c2695Nl.f24833a.f28754b);
                        vu3.g(c2695Nl.f24838f.f33698n);
                        Su su6 = (Su) this.f33788w;
                        su6.a(true);
                        vu3.a(su6);
                        vu3.h();
                    }
                }
                return;
            default:
                Mt mt = (Mt) this.f33790y;
                C2476An c2476An = (C2476An) obj;
                synchronized (mt) {
                    if (c2476An != null) {
                        try {
                            c2476An.b();
                        } finally {
                        }
                    }
                    ((C3097dl) c2476An.f24839g.f29838n.f32954u).f29842x = mt.f26365d;
                    ((Ir) this.f33786u).s(c2476An);
                    Executor executor = mt.f26363b;
                    Jt jt = mt.f26365d;
                    Objects.requireNonNull(jt);
                    executor.execute(new RunnableC3470kj(25, jt));
                    mt.f26365d.c();
                    if (!((Boolean) AbstractC2633Ka.f25928c.r()).booleanValue() || (vu4 = (Vu) this.f33787v) == null) {
                        Wu wu4 = mt.f26368g;
                        Su su7 = (Su) this.f33788w;
                        su7.j(c2476An.f24833a.f28754b);
                        su7.m(c2476An.f24838f.f33698n);
                        su7.a(true);
                        wu4.b(su7.q());
                    } else {
                        vu4.e(c2476An.f24833a.f28754b);
                        vu4.g(c2476An.f24838f.f33698n);
                        Su su8 = (Su) this.f33788w;
                        su8.a(true);
                        vu4.a(su8);
                        vu4.h();
                    }
                }
                return;
        }
    }

    @Override // P2.InterfaceC0373c
    public void onConnectionFailed(M2.b bVar) {
        try {
            ((LinkedBlockingQueue) this.f33789x).put(g());
        } catch (InterruptedException unused) {
        }
    }

    @Override // P2.InterfaceC0372b
    public void onConnectionSuspended(int i) {
        try {
            ((LinkedBlockingQueue) this.f33789x).put(g());
        } catch (InterruptedException unused) {
        }
    }

    @Override // P2.InterfaceC0372b
    public void r() {
        Tw tw;
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) this.f33789x;
        HandlerThread handlerThread = (HandlerThread) this.f33790y;
        try {
            tw = (Tw) ((Qw) this.f33786u).u();
        } catch (DeadObjectException | IllegalStateException unused) {
            tw = null;
        }
        if (tw != null) {
            try {
                try {
                    Rw rw = new Rw(1, (String) this.f33787v, (String) this.f33788w);
                    Parcel H02 = tw.H0();
                    AbstractC3388j8.c(H02, rw);
                    Parcel M02 = tw.M0(H02, 1);
                    Sw sw = (Sw) AbstractC3388j8.b(M02, Sw.CREATOR);
                    M02.recycle();
                    if (sw.f27660u == null) {
                        try {
                            byte[] bArr = sw.f27661v;
                            PK pk = PK.f26757a;
                            int i = BK.f23877a;
                            sw.f27660u = H6.B0(bArr, PK.f26758b);
                            sw.f27661v = null;
                        } catch (C3295hL | NullPointerException e9) {
                            throw new IllegalStateException(e9);
                        }
                    }
                    sw.a();
                    linkedBlockingQueue.put(sw.f27660u);
                } catch (Throwable unused2) {
                    linkedBlockingQueue.put(g());
                }
            } catch (InterruptedException unused3) {
            } catch (Throwable th) {
                f();
                handlerThread.quit();
                throw th;
            }
            f();
            handlerThread.quit();
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        Vu vu;
        Vu vu2;
        Vu vu3;
        Vu vu4;
        switch (this.f33785n) {
            case 6:
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32045I6)).booleanValue()) {
                    u2.z.l("Native ad failed to load", th);
                }
                C3201fi c3201fi = (C3201fi) this.f33789x;
                C4920z0 t6 = SK.t(th, ((C2710Oj) c3201fi.f30400v0.f()).f26649l);
                ((C4118wk) c3201fi.f30392r0.f()).v(t6);
                T8 t82 = (T8) this.f33790y;
                ((C3309hi) t82.f27696u).b().execute(new RunnableC3048cq(5, this, t6));
                AbstractC2968bG.h(t6.f40213n, "NativeAdLoader.onFailure", th);
                ((C3694or) this.f33786u).mo8c();
                boolean booleanValue = ((Boolean) AbstractC2633Ka.f25928c.r()).booleanValue();
                Su su = (Su) this.f33788w;
                if (!booleanValue || (vu = (Vu) this.f33787v) == null) {
                    su.h(t6);
                    su.d(th);
                    su.a(false);
                    ((Wu) t82.f27698w).b(su.q());
                    return;
                }
                vu.f(t6);
                su.d(th);
                su.a(false);
                vu.a(su);
                vu.h();
                return;
            case 7:
                C3301ha c3301ha = AbstractC3569ma.f32045I6;
                q2.r rVar = q2.r.f40207e;
                if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
                    u2.z.l("App open ad failed to load", th);
                }
                C3426jt c3426jt = (C3426jt) this.f33790y;
                C3469ki c3469ki = (C3469ki) c3426jt.f31339e.o();
                C4920z0 t9 = c3469ki == null ? SK.t(th, null) : SK.t(th, c3469ki.c().f26649l);
                synchronized (c3426jt) {
                    try {
                        c3426jt.f31343j = null;
                        if (c3469ki != null) {
                            ((C4118wk) c3469ki.f31588y0.f()).v(t9);
                            if (((Boolean) rVar.f40210c.a(AbstractC3569ma.q9)).booleanValue()) {
                                c3426jt.f31336b.execute(new RunnableC3048cq(6, this, t9));
                            }
                        } else {
                            c3426jt.f31338d.v(t9);
                            c3426jt.b((C3158et) this.f33789x).a().c().f26644f.E();
                        }
                        AbstractC2968bG.h(t9.f40213n, "AppOpenAdLoader.onFailure", th);
                        ((Ir) this.f33786u).mo12c();
                        if (!((Boolean) AbstractC2633Ka.f25928c.r()).booleanValue() || (vu2 = (Vu) this.f33787v) == null) {
                            Wu wu = c3426jt.f31342h;
                            Su su2 = (Su) this.f33788w;
                            su2.h(t9);
                            su2.d(th);
                            su2.a(false);
                            wu.b(su2.q());
                        } else {
                            vu2.f(t9);
                            Su su3 = (Su) this.f33788w;
                            su3.d(th);
                            su3.a(false);
                            vu2.a(su3);
                            vu2.h();
                        }
                    } finally {
                    }
                }
                return;
            case 8:
                C3301ha c3301ha2 = AbstractC3569ma.f32045I6;
                q2.r rVar2 = q2.r.f40207e;
                if (((Boolean) rVar2.f40210c.a(c3301ha2)).booleanValue()) {
                    u2.z.l("Interstitial ad failed to load", th);
                }
                C3793qi c3793qi = (C3793qi) this.f33789x;
                final C4920z0 t10 = SK.t(th, ((C2710Oj) c3793qi.C0.f()).f26649l);
                Gt gt = (Gt) this.f33790y;
                synchronized (gt) {
                    try {
                        gt.i = null;
                        ((C4118wk) c3793qi.f33356s0.f()).v(t10);
                        if (((Boolean) rVar2.f40210c.a(AbstractC3569ma.r9)).booleanValue()) {
                            final int i = 0;
                            gt.f25151b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.Ft

                                /* renamed from: u, reason: collision with root package name */
                                public final /* synthetic */ C3864s f24860u;

                                {
                                    this.f24860u = this;
                                }

                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    switch (i) {
                                        case 0:
                                            ((Gt) this.f24860u.f33790y).f25153d.v(t10);
                                            break;
                                        default:
                                            ((Gt) this.f24860u.f33790y).f25154e.v(t10);
                                            break;
                                    }
                                }
                            });
                            final int i6 = 1;
                            gt.f25151b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.Ft

                                /* renamed from: u, reason: collision with root package name */
                                public final /* synthetic */ C3864s f24860u;

                                {
                                    this.f24860u = this;
                                }

                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    switch (i6) {
                                        case 0:
                                            ((Gt) this.f24860u.f33790y).f25153d.v(t10);
                                            break;
                                        default:
                                            ((Gt) this.f24860u.f33790y).f25154e.v(t10);
                                            break;
                                    }
                                }
                            });
                        }
                        AbstractC2968bG.h(t10.f40213n, "InterstitialAdLoader.onFailure", th);
                        ((Ir) this.f33786u).mo12c();
                        if (!((Boolean) AbstractC2633Ka.f25928c.r()).booleanValue() || (vu3 = (Vu) this.f33787v) == null) {
                            Wu wu2 = gt.f25156g;
                            Su su4 = (Su) this.f33788w;
                            su4.h(t10);
                            su4.d(th);
                            su4.a(false);
                            wu2.b(su4.q());
                        } else {
                            vu3.f(t10);
                            Su su5 = (Su) this.f33788w;
                            su5.d(th);
                            su5.a(false);
                            vu3.a(su5);
                            vu3.h();
                        }
                    } finally {
                    }
                }
                return;
            default:
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32045I6)).booleanValue()) {
                    u2.z.l("Rewarded ad failed to load", th);
                }
                Mt mt = (Mt) this.f33790y;
                C3900si c3900si = (C3900si) mt.f26366e.o();
                C4920z0 t11 = c3900si == null ? SK.t(th, null) : SK.t(th, c3900si.c().f26649l);
                synchronized (mt) {
                    try {
                        if (c3900si != null) {
                            ((C4118wk) c3900si.f34007A0.f()).v(t11);
                            mt.f26363b.execute(new RunnableC3048cq(8, this, t11));
                        } else {
                            mt.f26365d.v(t11);
                            mt.b((Lt) this.f33789x).b().c().f26644f.E();
                        }
                        AbstractC2968bG.h(t11.f40213n, "RewardedAdLoader.onFailure", th);
                        ((Ir) this.f33786u).mo12c();
                        if (!((Boolean) AbstractC2633Ka.f25928c.r()).booleanValue() || (vu4 = (Vu) this.f33787v) == null) {
                            Wu wu3 = mt.f26368g;
                            Su su6 = (Su) this.f33788w;
                            su6.h(t11);
                            su6.d(th);
                            su6.a(false);
                            wu3.b(su6.q());
                        } else {
                            vu4.f(t11);
                            Su su7 = (Su) this.f33788w;
                            su7.d(th);
                            su7.a(false);
                            vu4.a(su7);
                            vu4.h();
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3707p3
    public long x(int i) {
        return ((long[]) this.f33787v)[i];
    }

    public C3864s(int[] iArr, PQ[] pqArr, int[] iArr2, int[][][] iArr3, PQ pq) {
        this.f33785n = 0;
        this.f33786u = iArr;
        this.f33788w = pqArr;
        this.f33789x = iArr3;
        this.f33787v = iArr2;
        this.f33790y = pq;
    }

    public C3864s(Context context, C2555Fh c2555Fh, C2555Fh c2555Fh2, C3153eo c3153eo) {
        this.f33785n = 3;
        this.f33786u = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f33788w = c2555Fh;
        this.f33787v = c2555Fh2;
        this.f33790y = null;
        this.f33789x = c3153eo;
    }

    public C3864s(Context context, String str, String str2) {
        this.f33785n = 11;
        this.f33787v = str;
        this.f33788w = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f33790y = handlerThread;
        handlerThread.start();
        Qw qw = new Qw(context, handlerThread.getLooper(), this, this, 9200000);
        this.f33786u = qw;
        this.f33789x = new LinkedBlockingQueue();
        qw.o();
    }

    public C3864s(L3 l32, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f33785n = 1;
        this.f33786u = l32;
        this.f33789x = hashMap2;
        this.f33790y = hashMap3;
        this.f33788w = Collections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        l32.f(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.f33787v = jArr;
    }

    public C3864s(T8 t82, C3694or c3694or, Vu vu, Su su, C3201fi c3201fi) {
        this.f33785n = 6;
        this.f33786u = c3694or;
        this.f33787v = vu;
        this.f33788w = su;
        this.f33789x = c3201fi;
        Objects.requireNonNull(t82);
        this.f33790y = t82;
    }

    public C3864s(InterfaceC2736Qb interfaceC2736Qb) {
        InterfaceC3839rb interfaceC3839rb;
        IBinder iBinder;
        this.f33785n = 2;
        this.f33787v = new ArrayList();
        this.f33789x = new k2.v();
        this.f33790y = new ArrayList();
        this.f33786u = interfaceC2736Qb;
        C3893sb c3893sb = null;
        try {
            List e9 = interfaceC2736Qb.e();
            if (e9 != null) {
                for (Object obj : e9) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        interfaceC3839rb = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        interfaceC3839rb = queryLocalInterface instanceof InterfaceC3839rb ? (InterfaceC3839rb) queryLocalInterface : new C3786qb(iBinder);
                    }
                    if (interfaceC3839rb != null) {
                        ((ArrayList) this.f33787v).add(new C3893sb(interfaceC3839rb));
                    }
                }
            }
        } catch (RemoteException e10) {
            v2.i.d("", e10);
        }
        try {
            List u3 = ((InterfaceC2736Qb) this.f33786u).u();
            if (u3 != null) {
                for (Object obj2 : u3) {
                    InterfaceC4893l0 U3 = obj2 instanceof IBinder ? q2.L0.U3((IBinder) obj2) : null;
                    if (U3 != null) {
                        ((ArrayList) this.f33790y).add(new C0281n(U3));
                    }
                }
            }
        } catch (RemoteException e11) {
            v2.i.d("", e11);
        }
        try {
            InterfaceC3839rb g4 = ((InterfaceC2736Qb) this.f33786u).g();
            if (g4 != null) {
                c3893sb = new C3893sb(g4);
            }
        } catch (RemoteException e12) {
            v2.i.d("", e12);
        }
        this.f33788w = c3893sb;
        try {
            if (((InterfaceC2736Qb) this.f33786u).m() != null) {
                new C3694or(((InterfaceC2736Qb) this.f33786u).m());
            }
        } catch (RemoteException e13) {
            v2.i.d("", e13);
        }
    }

    private final void d() {
    }

    @Override // p2.InterfaceC4829d
    public void i() {
    }

    public C3864s(C3424jr c3424jr, C3467kg c3467kg, Yt yt, St st, C3802qr c3802qr) {
        this.f33785n = 5;
        this.f33786u = c3467kg;
        this.f33787v = yt;
        this.f33788w = st;
        this.f33789x = c3802qr;
        Objects.requireNonNull(c3424jr);
        this.f33790y = c3424jr;
    }

    public C3864s(C3426jt c3426jt, Ir ir, Vu vu, Su su, C3158et c3158et) {
        this.f33785n = 7;
        this.f33786u = ir;
        this.f33787v = vu;
        this.f33788w = su;
        this.f33789x = c3158et;
        Objects.requireNonNull(c3426jt);
        this.f33790y = c3426jt;
    }

    public C3864s(Gt gt, Ir ir, Vu vu, Su su, C3793qi c3793qi) {
        this.f33785n = 8;
        this.f33786u = ir;
        this.f33787v = vu;
        this.f33788w = su;
        this.f33789x = c3793qi;
        Objects.requireNonNull(gt);
        this.f33790y = gt;
    }

    public C3864s(Mt mt, Ir ir, Vu vu, Su su, Lt lt) {
        this.f33785n = 9;
        this.f33786u = ir;
        this.f33787v = vu;
        this.f33788w = su;
        this.f33789x = lt;
        Objects.requireNonNull(mt);
        this.f33790y = mt;
    }
}

package com.google.android.gms.internal.ads;

import R2.InterfaceC0376b;
import R2.InterfaceC0377c;
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
import r2.C4906k;
import r2.InterfaceC4899d;
import s2.C4969z0;
import s2.InterfaceC4942l0;

/* renamed from: com.google.android.gms.internal.ads.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3887s implements InterfaceC3730p3, InterfaceC4899d, KD, InterfaceC0376b, InterfaceC0377c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f34553n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f34554u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f34555v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f34556w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f34557x;

    /* renamed from: y, reason: collision with root package name */
    public Object f34558y;

    public /* synthetic */ C3887s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f34553n = i;
        this.f34554u = obj;
        this.f34555v = obj2;
        this.f34556w = obj3;
        this.f34557x = obj4;
        this.f34558y = obj5;
    }

    public static H6 g() {
        C4002u6 C0 = H6.C0();
        C0.n(32768L);
        return (H6) C0.j();
    }

    public P3.a a(String str) {
        x2.k kVar = x2.k.f41873u;
        if (str != null) {
            if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33030g)).booleanValue() || !str.isEmpty()) {
                try {
                    return h(1, 0L, str);
                } catch (NullPointerException | RejectedExecutionException unused) {
                    return QC.c(kVar);
                }
            }
        }
        return QC.c(kVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3730p3
    public ArrayList b(long j6) {
        L3 l32 = (L3) this.f34554u;
        ArrayList arrayList = new ArrayList();
        String str = l32.f26853h;
        l32.g(j6, str, arrayList);
        TreeMap treeMap = new TreeMap();
        l32.h(j6, false, str, treeMap);
        HashMap hashMap = (HashMap) this.f34557x;
        l32.j(j6, (Map) this.f34556w, hashMap, str, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            String str2 = (String) ((HashMap) this.f34558y).get(pair.second);
            if (str2 != null) {
                byte[] decode = Base64.decode(str2, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                P3 p32 = (P3) hashMap.get(pair.first);
                p32.getClass();
                arrayList2.add(new C4302zj(null, null, null, decodeByteArray, p32.f27514c, 0, p32.f27516e, p32.f27513b, 0, Integer.MIN_VALUE, -3.4028235E38f, p32.f27517f, p32.f27518g, p32.f27520j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            P3 p33 = (P3) hashMap.get(entry.getKey());
            p33.getClass();
            C3924sj c3924sj = (C3924sj) entry.getValue();
            CharSequence charSequence = c3924sj.f34886a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (J3 j32 : (J3[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), J3.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(j32), spannableStringBuilder.getSpanEnd(j32), (CharSequence) "");
            }
            int i4 = 0;
            while (i4 < spannableStringBuilder.length()) {
                int i6 = i4 + 1;
                if (spannableStringBuilder.charAt(i4) == ' ') {
                    int i9 = i6;
                    while (i9 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i9) == ' ') {
                        i9++;
                    }
                    int i10 = i9 - i6;
                    if (i10 > 0) {
                        spannableStringBuilder.delete(i4, i10 + i4);
                    }
                }
                i4 = i6;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i11 = 0;
            while (i11 < spannableStringBuilder.length() - 1) {
                int i12 = i11 + 1;
                if (spannableStringBuilder.charAt(i11) == '\n' && spannableStringBuilder.charAt(i12) == ' ') {
                    spannableStringBuilder.delete(i12, i11 + 2);
                }
                i11 = i12;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i13 = 0;
            while (i13 < spannableStringBuilder.length() - 1) {
                int i14 = i13 + 1;
                if (spannableStringBuilder.charAt(i13) == ' ' && spannableStringBuilder.charAt(i14) == '\n') {
                    spannableStringBuilder.delete(i13, i14);
                }
                i13 = i14;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            c3924sj.f34890e = p33.f27514c;
            c3924sj.f34891f = p33.f27515d;
            c3924sj.f34892g = p33.f27516e;
            c3924sj.f34893h = p33.f27513b;
            c3924sj.f34896l = p33.f27517f;
            c3924sj.f34895k = p33.i;
            c3924sj.f34894j = p33.f27519h;
            c3924sj.f34898n = p33.f27520j;
            arrayList2.add(c3924sj.a());
        }
        return arrayList2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3730p3
    public int c() {
        return ((long[]) this.f34555v).length;
    }

    @Override // r2.InterfaceC4899d
    public void e(View view) {
        C4201xq c4201xq = (C4201xq) ((C3447jr) this.f34558y).f32111e;
        St st = (St) this.f34556w;
        C2530Cn c2530Cn = new C2530Cn(new C3680o7(c4201xq, st), null, 1);
        C3504ku c3504ku = new C3504ku((Yt) this.f34555v, st, (String) null);
        C3816qi c3816qi = (C3816qi) c4201xq.f35841u;
        C3762pi c3762pi = new C3762pi(c3816qi.f34093b, c3816qi.f34096c, c3504ku, c2530Cn);
        C3717or c3717or = new C3717or(c4201xq, c3762pi);
        C3825qr c3825qr = (C3825qr) this.f34557x;
        synchronized (c3825qr) {
            c3825qr.f34195n = c3717or;
        }
        ((C3490kg) this.f34554u).b(c3762pi.T());
    }

    @Override // r2.InterfaceC4899d
    public void f() {
        switch (this.f34553n) {
            case 5:
                break;
            default:
                Qw qw = (Qw) this.f34554u;
                if (qw != null) {
                    if (qw.h() || qw.d()) {
                        qw.g();
                        break;
                    }
                }
                break;
        }
    }

    public P3.a h(final int i, final long j6, final String str) {
        final String str2;
        x2.h hVar = (x2.h) this.f34554u;
        if (i > hVar.f41867a) {
            C4152wv c4152wv = (C4152wv) this.f34557x;
            if (c4152wv == null || !hVar.f41870d) {
                return QC.c(x2.k.f41874v);
            }
            C4906k.f40186C.f40198k.getClass();
            C3732p5 c3732p5 = new C3732p5("", str, 2, System.currentTimeMillis());
            C2821Tp c2821Tp = c4152wv.f35684a;
            c2821Tp.getClass();
            c2821Tp.a(new S0.l(17, c2821Tp, c3732p5));
            return QC.c(x2.k.f41875w);
        }
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.L9)).booleanValue()) {
            Uri parse = Uri.parse(str);
            String encodedQuery = parse.getEncodedQuery();
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            clearQuery.appendQueryParameter("pa", Integer.toString(i));
            String valueOf = String.valueOf(clearQuery.build());
            str2 = D.x.p(new StringBuilder(valueOf.length() + 1 + String.valueOf(encodedQuery).length()), valueOf, "&", encodedQuery);
        } else {
            str2 = str;
        }
        BD bd = new BD() { // from class: com.google.android.gms.internal.ads.vv
            @Override // com.google.android.gms.internal.ads.BD
            public final P3.a a(Object obj) {
                x2.k kVar = (x2.k) obj;
                x2.k kVar2 = x2.k.f41874v;
                C3887s c3887s = C3887s.this;
                if (kVar != kVar2) {
                    c3887s.getClass();
                    return QC.c(kVar);
                }
                x2.h hVar2 = (x2.h) c3887s.f34554u;
                long j9 = hVar2.f41868b;
                int i4 = i;
                if (i4 != 1) {
                    j9 = (long) (hVar2.f41869c * j6);
                }
                return c3887s.h(i4 + 1, j9, str);
            }
        };
        Executor executor = (SD) this.f34556w;
        if (j6 == 0) {
            final int i4 = 1;
            return QC.t(((C3383ig) executor).b(new Callable(this) { // from class: com.google.android.gms.internal.ads.uv

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C3887s f35372b;

                {
                    this.f35372b = this;
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    switch (i4) {
                    }
                    return this.f35372b.j(str2);
                }
            }), bd, executor);
        }
        final int i6 = 0;
        Callable callable = new Callable(this) { // from class: com.google.android.gms.internal.ads.uv

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C3887s f35372b;

            {
                this.f35372b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i6) {
                }
                return this.f35372b.j(str2);
            }
        };
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        WD wd = (WD) executor;
        wd.getClass();
        RunnableFutureC2989bE runnableFutureC2989bE = new RunnableFutureC2989bE(callable);
        return QC.t(new UD(runnableFutureC2989bE, wd.f29123v.schedule(runnableFutureC2989bE, j6, timeUnit)), bd, wd);
    }

    public x2.k j(String str) {
        C2847Vh c2847Vh;
        C3324ha c3324ha = AbstractC3592ma.da;
        s2.r rVar = s2.r.f40506e;
        boolean booleanValue = ((Boolean) rVar.f40509c.a(c3324ha)).booleanValue();
        x2.l lVar = (x2.l) this.f34555v;
        if (booleanValue && (c2847Vh = (C2847Vh) this.f34558y) != null) {
            C4906k c4906k = C4906k.f40186C;
            if (c4906k.f40191c.F(str) || c4906k.f40191c.G(str)) {
                TM tm = c2847Vh.f29021c;
                String encodeToString = tm != null ? Base64.encodeToString(tm.b(), 10) : null;
                HashMap hashMap = new HashMap();
                if (encodeToString != null) {
                    hashMap.put((String) rVar.f40509c.a(AbstractC3592ma.ea), encodeToString);
                }
                return lVar.a(hashMap, str);
            }
        }
        return lVar.a(null, str);
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public void mo10n(Object obj) {
        Vu vu;
        Vu vu2;
        Vu vu3;
        Vu vu4;
        switch (this.f34553n) {
            case 6:
                T8 t82 = (T8) this.f34558y;
                AbstractC2577Fj abstractC2577Fj = (AbstractC2577Fj) obj;
                synchronized (t82) {
                    if (abstractC2577Fj != null) {
                        try {
                            abstractC2577Fj.b();
                        } finally {
                        }
                    }
                    ((C3120dl) abstractC2577Fj.f25628g.f30611n.f33740u).f30612u = (Dr) ((C3504ku) t82.f28480v).f32446v;
                    ((C3717or) this.f34554u).s(abstractC2577Fj);
                    ((C3332hi) t82.f28479u).b().execute(new RunnableC2662Kj(this, 1));
                    if (!((Boolean) AbstractC2653Ka.f26706c.r()).booleanValue() || (vu = (Vu) this.f34555v) == null) {
                        Wu wu = (Wu) t82.f28481w;
                        Su su = (Su) this.f34556w;
                        su.g(abstractC2577Fj.f25622a.f29533b);
                        su.m(abstractC2577Fj.f25627f.f34470n);
                        su.a(true);
                        wu.b(su.q());
                    } else {
                        vu.e(abstractC2577Fj.f25622a.f29533b);
                        vu.g(abstractC2577Fj.f25627f.f34470n);
                        Su su2 = (Su) this.f34556w;
                        su2.a(true);
                        vu.a(su2);
                        vu.h();
                    }
                }
                return;
            case 7:
                C3449jt c3449jt = (C3449jt) this.f34558y;
                AbstractC2577Fj abstractC2577Fj2 = (AbstractC2577Fj) obj;
                synchronized (c3449jt) {
                    if (abstractC2577Fj2 != null) {
                        try {
                            abstractC2577Fj2.b();
                        } finally {
                        }
                    }
                    c3449jt.f32122j = null;
                    if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.q9)).booleanValue()) {
                        ((C3120dl) abstractC2577Fj2.f25628g.f30611n.f33740u).f30614w = c3449jt.f32117d;
                    }
                    ((Ir) this.f34554u).s(abstractC2577Fj2);
                    if (!((Boolean) AbstractC2653Ka.f26706c.r()).booleanValue() || (vu2 = (Vu) this.f34555v) == null) {
                        Wu wu2 = c3449jt.f32121h;
                        Su su3 = (Su) this.f34556w;
                        su3.g(abstractC2577Fj2.f25622a.f29533b);
                        su3.m(abstractC2577Fj2.f25627f.f34470n);
                        su3.a(true);
                        wu2.b(su3.q());
                    } else {
                        vu2.e(abstractC2577Fj2.f25622a.f29533b);
                        vu2.g(abstractC2577Fj2.f25627f.f34470n);
                        Su su4 = (Su) this.f34556w;
                        su4.a(true);
                        vu2.a(su4);
                        vu2.h();
                    }
                }
                return;
            case 8:
                Gt gt = (Gt) this.f34558y;
                C2732Ol c2732Ol = (C2732Ol) obj;
                synchronized (gt) {
                    if (c2732Ol != null) {
                        try {
                            c2732Ol.b();
                        } finally {
                        }
                    }
                    gt.i = null;
                    C3324ha c3324ha = AbstractC3592ma.r9;
                    s2.r rVar = s2.r.f40506e;
                    if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                        C3717or c3717or = c2732Ol.f25628g.f30611n;
                        Dr dr = gt.f25925d;
                        C3120dl c3120dl = (C3120dl) c3717or.f33740u;
                        c3120dl.f30612u = dr;
                        c3120dl.f30615x = gt.f25926e;
                    }
                    ((Ir) this.f34554u).s(c2732Ol);
                    if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                        final int i = 1;
                        gt.f25923b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.Et

                            /* renamed from: u, reason: collision with root package name */
                            public final /* synthetic */ C3887s f25428u;

                            {
                                this.f25428u = this;
                            }

                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                switch (i) {
                                    case 0:
                                        ((Gt) this.f25428u.f34558y).f25926e.h();
                                        break;
                                    default:
                                        ((Gt) this.f25428u.f34558y).f25925d.h();
                                        break;
                                }
                            }
                        });
                        final int i4 = 0;
                        gt.f25923b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.Et

                            /* renamed from: u, reason: collision with root package name */
                            public final /* synthetic */ C3887s f25428u;

                            {
                                this.f25428u = this;
                            }

                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                switch (i4) {
                                    case 0:
                                        ((Gt) this.f25428u.f34558y).f25926e.h();
                                        break;
                                    default:
                                        ((Gt) this.f25428u.f34558y).f25925d.h();
                                        break;
                                }
                            }
                        });
                    }
                    if (!((Boolean) AbstractC2653Ka.f26706c.r()).booleanValue() || (vu3 = (Vu) this.f34555v) == null) {
                        Wu wu3 = gt.f25928g;
                        Su su5 = (Su) this.f34556w;
                        su5.g(c2732Ol.f25622a.f29533b);
                        su5.m(c2732Ol.f25627f.f34470n);
                        su5.a(true);
                        wu3.b(su5.q());
                    } else {
                        vu3.e(c2732Ol.f25622a.f29533b);
                        vu3.g(c2732Ol.f25627f.f34470n);
                        Su su6 = (Su) this.f34556w;
                        su6.a(true);
                        vu3.a(su6);
                        vu3.h();
                    }
                }
                return;
            default:
                Mt mt = (Mt) this.f34558y;
                C2513Bn c2513Bn = (C2513Bn) obj;
                synchronized (mt) {
                    if (c2513Bn != null) {
                        try {
                            c2513Bn.b();
                        } finally {
                        }
                    }
                    ((C3120dl) c2513Bn.f25628g.f30611n.f33740u).f30615x = mt.f27150d;
                    ((Ir) this.f34554u).s(c2513Bn);
                    Executor executor = mt.f27148b;
                    Jt jt = mt.f27150d;
                    Objects.requireNonNull(jt);
                    executor.execute(new RunnableC3493kj(25, jt));
                    mt.f27150d.a();
                    if (!((Boolean) AbstractC2653Ka.f26706c.r()).booleanValue() || (vu4 = (Vu) this.f34555v) == null) {
                        Wu wu4 = mt.f27153g;
                        Su su7 = (Su) this.f34556w;
                        su7.g(c2513Bn.f25622a.f29533b);
                        su7.m(c2513Bn.f25627f.f34470n);
                        su7.a(true);
                        wu4.b(su7.q());
                    } else {
                        vu4.e(c2513Bn.f25622a.f29533b);
                        vu4.g(c2513Bn.f25627f.f34470n);
                        Su su8 = (Su) this.f34556w;
                        su8.a(true);
                        vu4.a(su8);
                        vu4.h();
                    }
                }
                return;
        }
    }

    @Override // R2.InterfaceC0377c
    public void onConnectionFailed(O2.b bVar) {
        try {
            ((LinkedBlockingQueue) this.f34557x).put(g());
        } catch (InterruptedException unused) {
        }
    }

    @Override // R2.InterfaceC0376b
    public void onConnectionSuspended(int i) {
        try {
            ((LinkedBlockingQueue) this.f34557x).put(g());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    public void w(Throwable th) {
        Vu vu;
        Vu vu2;
        Vu vu3;
        Vu vu4;
        switch (this.f34553n) {
            case 6:
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32825I6)).booleanValue()) {
                    w2.z.l("Native ad failed to load", th);
                }
                C3224fi c3224fi = (C3224fi) this.f34557x;
                C4969z0 t6 = SK.t(th, ((C2730Oj) c3224fi.f31188v0.f()).f27425l);
                ((C4141wk) c3224fi.f31180r0.f()).I(t6);
                T8 t82 = (T8) this.f34558y;
                ((C3332hi) t82.f28479u).b().execute(new RunnableC3071cq(5, this, t6));
                AbstractC2991bG.h(t6.f40512n, "NativeAdLoader.onFailure", th);
                ((C3717or) this.f34554u).mo7c();
                boolean booleanValue = ((Boolean) AbstractC2653Ka.f26706c.r()).booleanValue();
                Su su = (Su) this.f34556w;
                if (!booleanValue || (vu = (Vu) this.f34555v) == null) {
                    su.h(t6);
                    su.d(th);
                    su.a(false);
                    ((Wu) t82.f28481w).b(su.q());
                    return;
                }
                vu.f(t6);
                su.d(th);
                su.a(false);
                vu.a(su);
                vu.h();
                return;
            case 7:
                C3324ha c3324ha = AbstractC3592ma.f32825I6;
                s2.r rVar = s2.r.f40506e;
                if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                    w2.z.l("App open ad failed to load", th);
                }
                C3449jt c3449jt = (C3449jt) this.f34558y;
                C3492ki c3492ki = (C3492ki) c3449jt.f32118e.o();
                C4969z0 t9 = c3492ki == null ? SK.t(th, null) : SK.t(th, c3492ki.c().f27425l);
                synchronized (c3449jt) {
                    try {
                        c3449jt.f32122j = null;
                        if (c3492ki != null) {
                            ((C4141wk) c3492ki.f32365y0.f()).I(t9);
                            if (((Boolean) rVar.f40509c.a(AbstractC3592ma.q9)).booleanValue()) {
                                c3449jt.f32115b.execute(new RunnableC3071cq(6, this, t9));
                            }
                        } else {
                            c3449jt.f32117d.I(t9);
                            c3449jt.b((C3181et) this.f34557x).a().c().f27420f.E();
                        }
                        AbstractC2991bG.h(t9.f40512n, "AppOpenAdLoader.onFailure", th);
                        ((Ir) this.f34554u).mo11c();
                        if (!((Boolean) AbstractC2653Ka.f26706c.r()).booleanValue() || (vu2 = (Vu) this.f34555v) == null) {
                            Wu wu = c3449jt.f32121h;
                            Su su2 = (Su) this.f34556w;
                            su2.h(t9);
                            su2.d(th);
                            su2.a(false);
                            wu.b(su2.q());
                        } else {
                            vu2.f(t9);
                            Su su3 = (Su) this.f34556w;
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
                C3324ha c3324ha2 = AbstractC3592ma.f32825I6;
                s2.r rVar2 = s2.r.f40506e;
                if (((Boolean) rVar2.f40509c.a(c3324ha2)).booleanValue()) {
                    w2.z.l("Interstitial ad failed to load", th);
                }
                C3816qi c3816qi = (C3816qi) this.f34557x;
                final C4969z0 t10 = SK.t(th, ((C2730Oj) c3816qi.C0.f()).f27425l);
                Gt gt = (Gt) this.f34558y;
                synchronized (gt) {
                    try {
                        gt.i = null;
                        ((C4141wk) c3816qi.f34138s0.f()).I(t10);
                        if (((Boolean) rVar2.f40509c.a(AbstractC3592ma.r9)).booleanValue()) {
                            final int i = 0;
                            gt.f25923b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.Ft

                                /* renamed from: u, reason: collision with root package name */
                                public final /* synthetic */ C3887s f25650u;

                                {
                                    this.f25650u = this;
                                }

                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    switch (i) {
                                        case 0:
                                            ((Gt) this.f25650u.f34558y).f25925d.I(t10);
                                            break;
                                        default:
                                            ((Gt) this.f25650u.f34558y).f25926e.I(t10);
                                            break;
                                    }
                                }
                            });
                            final int i4 = 1;
                            gt.f25923b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.Ft

                                /* renamed from: u, reason: collision with root package name */
                                public final /* synthetic */ C3887s f25650u;

                                {
                                    this.f25650u = this;
                                }

                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    switch (i4) {
                                        case 0:
                                            ((Gt) this.f25650u.f34558y).f25925d.I(t10);
                                            break;
                                        default:
                                            ((Gt) this.f25650u.f34558y).f25926e.I(t10);
                                            break;
                                    }
                                }
                            });
                        }
                        AbstractC2991bG.h(t10.f40512n, "InterstitialAdLoader.onFailure", th);
                        ((Ir) this.f34554u).mo11c();
                        if (!((Boolean) AbstractC2653Ka.f26706c.r()).booleanValue() || (vu3 = (Vu) this.f34555v) == null) {
                            Wu wu2 = gt.f25928g;
                            Su su4 = (Su) this.f34556w;
                            su4.h(t10);
                            su4.d(th);
                            su4.a(false);
                            wu2.b(su4.q());
                        } else {
                            vu3.f(t10);
                            Su su5 = (Su) this.f34556w;
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
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32825I6)).booleanValue()) {
                    w2.z.l("Rewarded ad failed to load", th);
                }
                Mt mt = (Mt) this.f34558y;
                C3923si c3923si = (C3923si) mt.f27151e.o();
                C4969z0 t11 = c3923si == null ? SK.t(th, null) : SK.t(th, c3923si.c().f27425l);
                synchronized (mt) {
                    try {
                        if (c3923si != null) {
                            ((C4141wk) c3923si.f34773A0.f()).I(t11);
                            mt.f27148b.execute(new RunnableC3071cq(8, this, t11));
                        } else {
                            mt.f27150d.I(t11);
                            mt.b((Lt) this.f34557x).b().c().f27420f.E();
                        }
                        AbstractC2991bG.h(t11.f40512n, "RewardedAdLoader.onFailure", th);
                        ((Ir) this.f34554u).mo11c();
                        if (!((Boolean) AbstractC2653Ka.f26706c.r()).booleanValue() || (vu4 = (Vu) this.f34555v) == null) {
                            Wu wu3 = mt.f27153g;
                            Su su6 = (Su) this.f34556w;
                            su6.h(t11);
                            su6.d(th);
                            su6.a(false);
                            wu3.b(su6.q());
                        } else {
                            vu4.f(t11);
                            Su su7 = (Su) this.f34556w;
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

    @Override // com.google.android.gms.internal.ads.InterfaceC3730p3
    public long x(int i) {
        return ((long[]) this.f34555v)[i];
    }

    @Override // R2.InterfaceC0376b
    public void z() {
        Tw tw;
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) this.f34557x;
        HandlerThread handlerThread = (HandlerThread) this.f34558y;
        try {
            tw = (Tw) ((Qw) this.f34554u).u();
        } catch (DeadObjectException | IllegalStateException unused) {
            tw = null;
        }
        if (tw != null) {
            try {
                try {
                    Rw rw = new Rw(1, (String) this.f34555v, (String) this.f34556w);
                    Parcel F02 = tw.F0();
                    AbstractC3411j8.c(F02, rw);
                    Parcel K02 = tw.K0(F02, 1);
                    Sw sw = (Sw) AbstractC3411j8.b(K02, Sw.CREATOR);
                    K02.recycle();
                    if (sw.f28443u == null) {
                        try {
                            byte[] bArr = sw.f28444v;
                            PK pk = PK.f27540a;
                            int i = BK.f24648a;
                            sw.f28443u = H6.B0(bArr, PK.f27541b);
                            sw.f28444v = null;
                        } catch (C3318hL | NullPointerException e9) {
                            throw new IllegalStateException(e9);
                        }
                    }
                    sw.a();
                    linkedBlockingQueue.put(sw.f28443u);
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

    public C3887s(int[] iArr, SQ[] sqArr, int[] iArr2, int[][][] iArr3, SQ sq) {
        this.f34553n = 0;
        this.f34554u = iArr;
        this.f34556w = sqArr;
        this.f34557x = iArr3;
        this.f34555v = iArr2;
        this.f34558y = sq;
    }

    public C3887s(Context context, C2575Fh c2575Fh, C2575Fh c2575Fh2, C3230fo c3230fo) {
        this.f34553n = 3;
        this.f34554u = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f34556w = c2575Fh;
        this.f34555v = c2575Fh2;
        this.f34558y = null;
        this.f34557x = c3230fo;
    }

    public C3887s(Context context, String str, String str2) {
        this.f34553n = 11;
        this.f34555v = str;
        this.f34556w = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f34558y = handlerThread;
        handlerThread.start();
        Qw qw = new Qw(context, handlerThread.getLooper(), this, this, 9200000);
        this.f34554u = qw;
        this.f34557x = new LinkedBlockingQueue();
        qw.o();
    }

    public C3887s(L3 l32, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f34553n = 1;
        this.f34554u = l32;
        this.f34557x = hashMap2;
        this.f34558y = hashMap3;
        this.f34556w = Collections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        l32.f(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.f34555v = jArr;
    }

    public C3887s(T8 t82, C3717or c3717or, Vu vu, Su su, C3224fi c3224fi) {
        this.f34553n = 6;
        this.f34554u = c3717or;
        this.f34555v = vu;
        this.f34556w = su;
        this.f34557x = c3224fi;
        Objects.requireNonNull(t82);
        this.f34558y = t82;
    }

    public C3887s(InterfaceC2756Qb interfaceC2756Qb) {
        InterfaceC3862rb interfaceC3862rb;
        IBinder iBinder;
        this.f34553n = 2;
        this.f34555v = new ArrayList();
        this.f34557x = new m2.v();
        this.f34558y = new ArrayList();
        this.f34554u = interfaceC2756Qb;
        C3916sb c3916sb = null;
        try {
            List e9 = interfaceC2756Qb.e();
            if (e9 != null) {
                for (Object obj : e9) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        interfaceC3862rb = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        interfaceC3862rb = queryLocalInterface instanceof InterfaceC3862rb ? (InterfaceC3862rb) queryLocalInterface : new C3809qb(iBinder);
                    }
                    if (interfaceC3862rb != null) {
                        ((ArrayList) this.f34555v).add(new C3916sb(interfaceC3862rb));
                    }
                }
            }
        } catch (RemoteException e10) {
            x2.i.d("", e10);
        }
        try {
            List u6 = ((InterfaceC2756Qb) this.f34554u).u();
            if (u6 != null) {
                for (Object obj2 : u6) {
                    InterfaceC4942l0 U32 = obj2 instanceof IBinder ? s2.L0.U3((IBinder) obj2) : null;
                    if (U32 != null) {
                        ((ArrayList) this.f34558y).add(new F2.b(U32));
                    }
                }
            }
        } catch (RemoteException e11) {
            x2.i.d("", e11);
        }
        try {
            InterfaceC3862rb g9 = ((InterfaceC2756Qb) this.f34554u).g();
            if (g9 != null) {
                c3916sb = new C3916sb(g9);
            }
        } catch (RemoteException e12) {
            x2.i.d("", e12);
        }
        this.f34556w = c3916sb;
        try {
            if (((InterfaceC2756Qb) this.f34554u).m() != null) {
                new C3717or(((InterfaceC2756Qb) this.f34554u).m());
            }
        } catch (RemoteException e13) {
            x2.i.d("", e13);
        }
    }

    private final void d() {
    }

    @Override // r2.InterfaceC4899d
    public void i() {
    }

    public C3887s(C3447jr c3447jr, C3490kg c3490kg, Yt yt, St st, C3825qr c3825qr) {
        this.f34553n = 5;
        this.f34554u = c3490kg;
        this.f34555v = yt;
        this.f34556w = st;
        this.f34557x = c3825qr;
        Objects.requireNonNull(c3447jr);
        this.f34558y = c3447jr;
    }

    public C3887s(C3449jt c3449jt, Ir ir, Vu vu, Su su, C3181et c3181et) {
        this.f34553n = 7;
        this.f34554u = ir;
        this.f34555v = vu;
        this.f34556w = su;
        this.f34557x = c3181et;
        Objects.requireNonNull(c3449jt);
        this.f34558y = c3449jt;
    }

    public C3887s(Gt gt, Ir ir, Vu vu, Su su, C3816qi c3816qi) {
        this.f34553n = 8;
        this.f34554u = ir;
        this.f34555v = vu;
        this.f34556w = su;
        this.f34557x = c3816qi;
        Objects.requireNonNull(gt);
        this.f34558y = gt;
    }

    public C3887s(Mt mt, Ir ir, Vu vu, Su su, Lt lt) {
        this.f34553n = 9;
        this.f34554u = ir;
        this.f34555v = vu;
        this.f34556w = su;
        this.f34557x = lt;
        Objects.requireNonNull(mt);
        this.f34558y = mt;
    }
}

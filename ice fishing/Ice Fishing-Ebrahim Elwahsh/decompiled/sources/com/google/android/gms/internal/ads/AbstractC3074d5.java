package com.google.android.gms.internal.ads;

import O.C0357t;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.d5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3074d5 implements Comparable {

    /* renamed from: A, reason: collision with root package name */
    public S0.q f29788A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f29789B;

    /* renamed from: C, reason: collision with root package name */
    public T4 f29790C;

    /* renamed from: D, reason: collision with root package name */
    public C2518Df f29791D;

    /* renamed from: E, reason: collision with root package name */
    public final C0357t f29792E;

    /* renamed from: n, reason: collision with root package name */
    public final C3292h5 f29793n;

    /* renamed from: u, reason: collision with root package name */
    public final int f29794u;

    /* renamed from: v, reason: collision with root package name */
    public final String f29795v;

    /* renamed from: w, reason: collision with root package name */
    public final int f29796w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f29797x;

    /* renamed from: y, reason: collision with root package name */
    public final InterfaceC3128e5 f29798y;

    /* renamed from: z, reason: collision with root package name */
    public Integer f29799z;

    public AbstractC3074d5(int i, String str, InterfaceC3128e5 interfaceC3128e5) {
        Uri parse;
        String host;
        this.f29793n = C3292h5.f31143c ? new C3292h5() : null;
        this.f29797x = new Object();
        int i4 = 0;
        this.f29789B = false;
        this.f29790C = null;
        this.f29794u = i;
        this.f29795v = str;
        this.f29798y = interfaceC3128e5;
        C0357t c0357t = new C0357t();
        c0357t.f2319a = com.anythink.basead.exoplayer.d.f6921c;
        this.f29792E = c0357t;
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i4 = host.hashCode();
        }
        this.f29796w = i4;
    }

    public final void a(String str) {
        if (C3292h5.f31143c) {
            this.f29793n.a(str, Thread.currentThread().getId());
        }
    }

    public final void b(String str) {
        S0.q qVar = this.f29788A;
        if (qVar != null) {
            HashSet hashSet = (HashSet) qVar.f2940b;
            synchronized (hashSet) {
                hashSet.remove(this);
            }
            ArrayList arrayList = (ArrayList) qVar.i;
            synchronized (arrayList) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
            qVar.p();
        }
        if (C3292h5.f31143c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new RunnableC3878s0(this, str, id));
                return;
            }
            C3292h5 c3292h5 = this.f29793n;
            c3292h5.a(str, id);
            c3292h5.b(toString());
        }
    }

    public final void c() {
        S0.q qVar = this.f29788A;
        if (qVar != null) {
            qVar.p();
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f29799z.intValue() - ((AbstractC3074d5) obj).f29799z.intValue();
    }

    public final String d() {
        int i = this.f29794u;
        String str = this.f29795v;
        if (i == 0) {
            return str;
        }
        String num = Integer.toString(1);
        return D.y.o(new StringBuilder(String.valueOf(num).length() + 1 + String.valueOf(str).length()), num, "-", str);
    }

    public Map e() {
        return Collections.EMPTY_MAP;
    }

    public byte[] f() {
        return null;
    }

    public final boolean g() {
        boolean z8;
        synchronized (this.f29797x) {
            z8 = this.f29789B;
        }
        return z8;
    }

    public abstract com.bumptech.glide.manager.n h(C2965b5 c2965b5);

    public abstract void i(Object obj);

    public final void j(com.bumptech.glide.manager.n nVar) {
        C2518Df c2518Df;
        List list;
        synchronized (this.f29797x) {
            c2518Df = this.f29791D;
        }
        if (c2518Df != null) {
            T4 t42 = (T4) nVar.f23619v;
            if (t42 != null) {
                if (t42.f27713e >= System.currentTimeMillis()) {
                    String d2 = d();
                    synchronized (c2518Df) {
                        list = (List) ((HashMap) c2518Df.f24453u).remove(d2);
                    }
                    if (list != null) {
                        if (AbstractC3346i5.f31315a) {
                            AbstractC3346i5.a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), d2);
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((Vx) c2518Df.f24456x).n((AbstractC3074d5) it.next(), nVar, null);
                        }
                        return;
                    }
                    return;
                }
            }
            c2518Df.s(this);
        }
    }

    public final void k() {
        C2518Df c2518Df;
        synchronized (this.f29797x) {
            c2518Df = this.f29791D;
        }
        if (c2518Df != null) {
            c2518Df.s(this);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.f29796w));
        synchronized (this.f29797x) {
        }
        Integer num = this.f29799z;
        String str = this.f29795v;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(num).length();
        String concat = "0x".concat(valueOf);
        StringBuilder sb = new StringBuilder(concat.length() + length + 5 + 8 + length2);
        AbstractC5051n.j(sb, "[ ] ", str, " ", concat);
        sb.append(" NORMAL ");
        sb.append(num);
        return sb.toString();
    }
}

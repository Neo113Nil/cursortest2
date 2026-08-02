package com.google.android.gms.internal.ads;

import O.C0349t;
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
import w.AbstractC5128c;

/* renamed from: com.google.android.gms.internal.ads.f5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3194f5 implements Comparable {

    /* renamed from: A, reason: collision with root package name */
    public S0.q f30824A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f30825B;

    /* renamed from: C, reason: collision with root package name */
    public W4 f30826C;

    /* renamed from: D, reason: collision with root package name */
    public C2590Gf f30827D;

    /* renamed from: E, reason: collision with root package name */
    public final C0349t f30828E;

    /* renamed from: n, reason: collision with root package name */
    public final C3408j5 f30829n;

    /* renamed from: u, reason: collision with root package name */
    public final int f30830u;

    /* renamed from: v, reason: collision with root package name */
    public final String f30831v;

    /* renamed from: w, reason: collision with root package name */
    public final int f30832w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f30833x;

    /* renamed from: y, reason: collision with root package name */
    public final InterfaceC3248g5 f30834y;

    /* renamed from: z, reason: collision with root package name */
    public Integer f30835z;

    public AbstractC3194f5(int i, String str, InterfaceC3248g5 interfaceC3248g5) {
        Uri parse;
        String host;
        this.f30829n = C3408j5.f31953c ? new C3408j5() : null;
        this.f30833x = new Object();
        int i4 = 0;
        this.f30825B = false;
        this.f30826C = null;
        this.f30830u = i;
        this.f30831v = str;
        this.f30834y = interfaceC3248g5;
        C0349t c0349t = new C0349t();
        c0349t.f2221a = com.anythink.basead.exoplayer.d.f7550c;
        this.f30828E = c0349t;
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i4 = host.hashCode();
        }
        this.f30832w = i4;
    }

    public final void a(String str) {
        if (C3408j5.f31953c) {
            this.f30829n.a(str, Thread.currentThread().getId());
        }
    }

    public final void b(String str) {
        S0.q qVar = this.f30824A;
        if (qVar != null) {
            HashSet hashSet = (HashSet) qVar.f2957b;
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
        if (C3408j5.f31953c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new RunnableC4050v0(this, str, id));
                return;
            }
            C3408j5 c3408j5 = this.f30829n;
            c3408j5.a(str, id);
            c3408j5.b(toString());
        }
    }

    public final void c() {
        S0.q qVar = this.f30824A;
        if (qVar != null) {
            qVar.p();
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f30835z.intValue() - ((AbstractC3194f5) obj).f30835z.intValue();
    }

    public final String d() {
        int i = this.f30830u;
        String str = this.f30831v;
        if (i == 0) {
            return str;
        }
        String num = Integer.toString(1);
        return D.x.p(new StringBuilder(String.valueOf(num).length() + 1 + String.valueOf(str).length()), num, "-", str);
    }

    public Map e() {
        return Collections.EMPTY_MAP;
    }

    public byte[] f() {
        return null;
    }

    public final boolean g() {
        boolean z6;
        synchronized (this.f30833x) {
            z6 = this.f30825B;
        }
        return z6;
    }

    public abstract com.bumptech.glide.manager.n h(C3087d5 c3087d5);

    public abstract void i(Object obj);

    public final void j(com.bumptech.glide.manager.n nVar) {
        C2590Gf c2590Gf;
        List list;
        synchronized (this.f30833x) {
            c2590Gf = this.f30827D;
        }
        if (c2590Gf != null) {
            W4 w42 = (W4) nVar.f24250v;
            if (w42 != null) {
                if (w42.f29115e >= System.currentTimeMillis()) {
                    String d9 = d();
                    synchronized (c2590Gf) {
                        list = (List) ((HashMap) c2590Gf.f25830u).remove(d9);
                    }
                    if (list != null) {
                        if (AbstractC3462k5.f32156a) {
                            AbstractC3462k5.a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), d9);
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((Ux) c2590Gf.f25833x).m((AbstractC3194f5) it.next(), nVar, null);
                        }
                        return;
                    }
                    return;
                }
            }
            c2590Gf.p(this);
        }
    }

    public final void k() {
        C2590Gf c2590Gf;
        synchronized (this.f30833x) {
            c2590Gf = this.f30827D;
        }
        if (c2590Gf != null) {
            c2590Gf.p(this);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.f30832w));
        synchronized (this.f30833x) {
        }
        Integer num = this.f30835z;
        String str = this.f30831v;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(num).length();
        String concat = "0x".concat(valueOf);
        StringBuilder sb = new StringBuilder(concat.length() + length + 5 + 8 + length2);
        AbstractC5128c.h(sb, "[ ] ", str, " ", concat);
        sb.append(" NORMAL ");
        sb.append(num);
        return sb.toString();
    }
}

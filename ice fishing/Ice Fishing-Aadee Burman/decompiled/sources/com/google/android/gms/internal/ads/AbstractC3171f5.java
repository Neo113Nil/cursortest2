package com.google.android.gms.internal.ads;

import O.C0344t;
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

/* renamed from: com.google.android.gms.internal.ads.f5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3171f5 implements Comparable {

    /* renamed from: A, reason: collision with root package name */
    public S0.q f30037A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f30038B;

    /* renamed from: C, reason: collision with root package name */
    public W4 f30039C;

    /* renamed from: D, reason: collision with root package name */
    public C2570Gf f30040D;

    /* renamed from: E, reason: collision with root package name */
    public final C0344t f30041E;

    /* renamed from: n, reason: collision with root package name */
    public final C3385j5 f30042n;

    /* renamed from: u, reason: collision with root package name */
    public final int f30043u;

    /* renamed from: v, reason: collision with root package name */
    public final String f30044v;

    /* renamed from: w, reason: collision with root package name */
    public final int f30045w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f30046x;

    /* renamed from: y, reason: collision with root package name */
    public final InterfaceC3225g5 f30047y;

    /* renamed from: z, reason: collision with root package name */
    public Integer f30048z;

    public AbstractC3171f5(int i, String str, InterfaceC3225g5 interfaceC3225g5) {
        Uri parse;
        String host;
        this.f30042n = C3385j5.f31166c ? new C3385j5() : null;
        this.f30046x = new Object();
        int i6 = 0;
        this.f30038B = false;
        this.f30039C = null;
        this.f30043u = i;
        this.f30044v = str;
        this.f30047y = interfaceC3225g5;
        C0344t c0344t = new C0344t();
        c0344t.f2133a = com.anythink.basead.exoplayer.d.f6764c;
        this.f30041E = c0344t;
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i6 = host.hashCode();
        }
        this.f30045w = i6;
    }

    public final void a(String str) {
        if (C3385j5.f31166c) {
            this.f30042n.a(str, Thread.currentThread().getId());
        }
    }

    public final void b(String str) {
        S0.q qVar = this.f30037A;
        if (qVar != null) {
            HashSet hashSet = (HashSet) qVar.f2828b;
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
        if (C3385j5.f31166c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new RunnableC4027v0(this, str, id));
                return;
            }
            C3385j5 c3385j5 = this.f30042n;
            c3385j5.a(str, id);
            c3385j5.b(toString());
        }
    }

    public final void c() {
        S0.q qVar = this.f30037A;
        if (qVar != null) {
            qVar.p();
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f30048z.intValue() - ((AbstractC3171f5) obj).f30048z.intValue();
    }

    public final String d() {
        int i = this.f30043u;
        String str = this.f30044v;
        if (i == 0) {
            return str;
        }
        String num = Integer.toString(1);
        return D.y.s(new StringBuilder(String.valueOf(num).length() + 1 + String.valueOf(str).length()), num, "-", str);
    }

    public Map e() {
        return Collections.EMPTY_MAP;
    }

    public byte[] f() {
        return null;
    }

    public final boolean g() {
        boolean z3;
        synchronized (this.f30046x) {
            z3 = this.f30038B;
        }
        return z3;
    }

    public abstract com.bumptech.glide.manager.o h(C3064d5 c3064d5);

    public abstract void i(Object obj);

    public final void j(com.bumptech.glide.manager.o oVar) {
        C2570Gf c2570Gf;
        List list;
        synchronized (this.f30046x) {
            c2570Gf = this.f30040D;
        }
        if (c2570Gf != null) {
            W4 w42 = (W4) oVar.f23465v;
            if (w42 != null) {
                if (w42.f28317e >= System.currentTimeMillis()) {
                    String d2 = d();
                    synchronized (c2570Gf) {
                        list = (List) ((HashMap) c2570Gf.f25042u).remove(d2);
                    }
                    if (list != null) {
                        if (AbstractC3439k5.f31377a) {
                            AbstractC3439k5.a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), d2);
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((Ux) c2570Gf.f25045x).l((AbstractC3171f5) it.next(), oVar, null);
                        }
                        return;
                    }
                    return;
                }
            }
            c2570Gf.q(this);
        }
    }

    public final void k() {
        C2570Gf c2570Gf;
        synchronized (this.f30046x) {
            c2570Gf = this.f30040D;
        }
        if (c2570Gf != null) {
            c2570Gf.q(this);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.f30045w));
        synchronized (this.f30046x) {
        }
        Integer num = this.f30048z;
        String str = this.f30044v;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(num).length();
        String concat = "0x".concat(valueOf);
        StringBuilder sb = new StringBuilder(concat.length() + length + 5 + 8 + length2);
        u1.h.i(sb, "[ ] ", str, " ", concat);
        sb.append(" NORMAL ");
        sb.append(num);
        return sb.toString();
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.Wg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2862Wg {

    /* renamed from: n, reason: collision with root package name */
    public final Context f29166n;

    /* renamed from: u, reason: collision with root package name */
    public final String f29167u;

    /* renamed from: v, reason: collision with root package name */
    public final WeakReference f29168v;

    public AbstractC2862Wg(InterfaceC4084vh interfaceC4084vh) {
        Context context = interfaceC4084vh.getContext();
        this.f29166n = context;
        this.f29167u = C4906k.f40186C.f40191c.E(context, interfaceC4084vh.C().f41845n);
        this.f29168v = new WeakReference(interfaceC4084vh);
    }

    public void a() {
    }

    public abstract boolean b(String str);

    public boolean d(String str, String[] strArr) {
        return b(str);
    }

    public boolean f(String str, String[] strArr, C2727Og c2727Og) {
        return b(str);
    }

    public void g(int i) {
    }

    public void h(int i) {
    }

    public void j(int i) {
    }

    public abstract void k();

    public final void m(String str, String str2, String str3, String str4) {
        x2.d.f41852b.post(new RunnableC2846Vg(this, str, str2, str3, str4));
    }

    public final /* synthetic */ void n(HashMap hashMap) {
        InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) this.f29168v.get();
        if (interfaceC4084vh != null) {
            interfaceC4084vh.d("onPrecacheEvent", hashMap);
        }
    }

    public void i(int i) {
    }
}

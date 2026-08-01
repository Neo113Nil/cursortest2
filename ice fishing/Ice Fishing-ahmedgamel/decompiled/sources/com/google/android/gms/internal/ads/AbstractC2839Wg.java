package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.Wg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2839Wg {

    /* renamed from: n, reason: collision with root package name */
    public final Context f28367n;

    /* renamed from: u, reason: collision with root package name */
    public final String f28368u;

    /* renamed from: v, reason: collision with root package name */
    public final WeakReference f28369v;

    public AbstractC2839Wg(InterfaceC4061vh interfaceC4061vh) {
        Context context = interfaceC4061vh.getContext();
        this.f28367n = context;
        this.f28368u = C4835j.f39733C.f39738c.E(context, interfaceC4061vh.C().f41391n);
        this.f28369v = new WeakReference(interfaceC4061vh);
    }

    public void a() {
    }

    public abstract boolean b(String str);

    public boolean d(String str, String[] strArr) {
        return b(str);
    }

    public boolean f(String str, String[] strArr, C2707Og c2707Og) {
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
        v2.d.f41398b.post(new RunnableC2823Vg(this, str, str2, str3, str4));
    }

    public final /* synthetic */ void n(HashMap hashMap) {
        InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) this.f28369v.get();
        if (interfaceC4061vh != null) {
            interfaceC4061vh.d("onPrecacheEvent", hashMap);
        }
    }

    public void i(int i) {
    }
}

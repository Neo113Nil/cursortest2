package com.bumptech.glide.manager;

import androidx.lifecycle.AbstractC0498p;
import androidx.lifecycle.C0505x;
import androidx.lifecycle.D;
import androidx.lifecycle.EnumC0496n;
import androidx.lifecycle.EnumC0497o;
import androidx.lifecycle.InterfaceC0502u;
import androidx.lifecycle.InterfaceC0503v;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
final class LifecycleLifecycle implements g, InterfaceC0502u {

    /* renamed from: n, reason: collision with root package name */
    public final HashSet f23446n = new HashSet();

    /* renamed from: u, reason: collision with root package name */
    public final AbstractC0498p f23447u;

    public LifecycleLifecycle(AbstractC0498p abstractC0498p) {
        this.f23447u = abstractC0498p;
        abstractC0498p.a(this);
    }

    @Override // com.bumptech.glide.manager.g
    public final void c(h hVar) {
        this.f23446n.add(hVar);
        EnumC0497o enumC0497o = ((C0505x) this.f23447u).f5178d;
        if (enumC0497o == EnumC0497o.f5164n) {
            hVar.onDestroy();
        } else if (enumC0497o.compareTo(EnumC0497o.f5167w) >= 0) {
            hVar.onStart();
        } else {
            hVar.onStop();
        }
    }

    @Override // com.bumptech.glide.manager.g
    public final void g(h hVar) {
        this.f23446n.remove(hVar);
    }

    @D(EnumC0496n.ON_DESTROY)
    public void onDestroy(InterfaceC0503v interfaceC0503v) {
        Iterator it = N1.p.e(this.f23446n).iterator();
        while (it.hasNext()) {
            ((h) it.next()).onDestroy();
        }
        interfaceC0503v.getLifecycle().b(this);
    }

    @D(EnumC0496n.ON_START)
    public void onStart(InterfaceC0503v interfaceC0503v) {
        Iterator it = N1.p.e(this.f23446n).iterator();
        while (it.hasNext()) {
            ((h) it.next()).onStart();
        }
    }

    @D(EnumC0496n.ON_STOP)
    public void onStop(InterfaceC0503v interfaceC0503v) {
        Iterator it = N1.p.e(this.f23446n).iterator();
        while (it.hasNext()) {
            ((h) it.next()).onStop();
        }
    }
}

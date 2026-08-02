package com.bumptech.glide.manager;

import androidx.lifecycle.AbstractC0502p;
import androidx.lifecycle.C0509x;
import androidx.lifecycle.D;
import androidx.lifecycle.EnumC0500n;
import androidx.lifecycle.EnumC0501o;
import androidx.lifecycle.InterfaceC0506u;
import androidx.lifecycle.InterfaceC0507v;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
final class LifecycleLifecycle implements g, InterfaceC0506u {

    /* renamed from: n, reason: collision with root package name */
    public final HashSet f24233n = new HashSet();

    /* renamed from: u, reason: collision with root package name */
    public final AbstractC0502p f24234u;

    public LifecycleLifecycle(AbstractC0502p abstractC0502p) {
        this.f24234u = abstractC0502p;
        abstractC0502p.a(this);
    }

    @Override // com.bumptech.glide.manager.g
    public final void h(h hVar) {
        this.f24233n.add(hVar);
        EnumC0501o enumC0501o = ((C0509x) this.f24234u).f5145d;
        if (enumC0501o == EnumC0501o.f5131n) {
            hVar.onDestroy();
        } else if (enumC0501o.compareTo(EnumC0501o.f5134w) >= 0) {
            hVar.onStart();
        } else {
            hVar.onStop();
        }
    }

    @Override // com.bumptech.glide.manager.g
    public final void i(h hVar) {
        this.f24233n.remove(hVar);
    }

    @D(EnumC0500n.ON_DESTROY)
    public void onDestroy(InterfaceC0507v interfaceC0507v) {
        Iterator it = P1.p.e(this.f24233n).iterator();
        while (it.hasNext()) {
            ((h) it.next()).onDestroy();
        }
        interfaceC0507v.getLifecycle().b(this);
    }

    @D(EnumC0500n.ON_START)
    public void onStart(InterfaceC0507v interfaceC0507v) {
        Iterator it = P1.p.e(this.f24233n).iterator();
        while (it.hasNext()) {
            ((h) it.next()).onStart();
        }
    }

    @D(EnumC0500n.ON_STOP)
    public void onStop(InterfaceC0507v interfaceC0507v) {
        Iterator it = P1.p.e(this.f24233n).iterator();
        while (it.hasNext()) {
            ((h) it.next()).onStop();
        }
    }
}

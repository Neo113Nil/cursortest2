package com.bumptech.glide.manager;

import androidx.lifecycle.AbstractC0508p;
import androidx.lifecycle.C0515x;
import androidx.lifecycle.D;
import androidx.lifecycle.EnumC0506n;
import androidx.lifecycle.EnumC0507o;
import androidx.lifecycle.InterfaceC0512u;
import androidx.lifecycle.InterfaceC0513v;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
final class LifecycleLifecycle implements g, InterfaceC0512u {

    /* renamed from: n, reason: collision with root package name */
    public final HashSet f23602n = new HashSet();

    /* renamed from: u, reason: collision with root package name */
    public final AbstractC0508p f23603u;

    public LifecycleLifecycle(AbstractC0508p abstractC0508p) {
        this.f23603u = abstractC0508p;
        abstractC0508p.a(this);
    }

    @Override // com.bumptech.glide.manager.g
    public final void b(h hVar) {
        this.f23602n.add(hVar);
        EnumC0507o enumC0507o = ((C0515x) this.f23603u).f5290d;
        if (enumC0507o == EnumC0507o.f5276n) {
            hVar.onDestroy();
        } else if (enumC0507o.compareTo(EnumC0507o.f5279w) >= 0) {
            hVar.onStart();
        } else {
            hVar.onStop();
        }
    }

    @Override // com.bumptech.glide.manager.g
    public final void c(h hVar) {
        this.f23602n.remove(hVar);
    }

    @D(EnumC0506n.ON_DESTROY)
    public void onDestroy(InterfaceC0513v interfaceC0513v) {
        Iterator it = N1.p.e(this.f23602n).iterator();
        while (it.hasNext()) {
            ((h) it.next()).onDestroy();
        }
        interfaceC0513v.getLifecycle().b(this);
    }

    @D(EnumC0506n.ON_START)
    public void onStart(InterfaceC0513v interfaceC0513v) {
        Iterator it = N1.p.e(this.f23602n).iterator();
        while (it.hasNext()) {
            ((h) it.next()).onStart();
        }
    }

    @D(EnumC0506n.ON_STOP)
    public void onStop(InterfaceC0513v interfaceC0513v) {
        Iterator it = N1.p.e(this.f23602n).iterator();
        while (it.hasNext()) {
            ((h) it.next()).onStop();
        }
    }
}

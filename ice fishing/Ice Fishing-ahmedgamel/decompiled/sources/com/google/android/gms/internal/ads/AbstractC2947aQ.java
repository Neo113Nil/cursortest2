package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.gms.internal.ads.aQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2947aQ {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f29825a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f29826b = new HashSet(1);

    /* renamed from: c, reason: collision with root package name */
    public final AP f29827c;

    /* renamed from: d, reason: collision with root package name */
    public final AP f29828d;

    /* renamed from: e, reason: collision with root package name */
    public Looper f29829e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC3627n8 f29830f;

    /* renamed from: g, reason: collision with root package name */
    public IO f29831g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC4211y f29832h;

    public AbstractC2947aQ() {
        C3860rQ c3860rQ = null;
        this.f29827c = new AP(new CopyOnWriteArrayList(), c3860rQ);
        this.f29828d = new AP(new CopyOnWriteArrayList(), c3860rQ);
    }

    public abstract void a(C2977b2 c2977b2);

    public abstract void b(InterfaceC3807qQ interfaceC3807qQ);

    public abstract InterfaceC3807qQ c(C3860rQ c3860rQ, InterfaceC4049v interfaceC4049v, long j6);

    public abstract C2977b2 f();

    public void g() {
    }

    public abstract void h(B b9);

    public void i() {
    }

    public abstract void j();

    public final void k(AbstractC3627n8 abstractC3627n8) {
        this.f29830f = abstractC3627n8;
        ArrayList arrayList = this.f29825a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC3914sQ) arrayList.get(i)).a(this, abstractC3627n8);
        }
    }

    public final void l(InterfaceC4022uQ interfaceC4022uQ) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f29827c.f24456b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C3968tQ c3968tQ = (C3968tQ) it.next();
            if (c3968tQ.f35079b == interfaceC4022uQ) {
                copyOnWriteArrayList.remove(c3968tQ);
            }
        }
    }

    public final void m(BP bp) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f29828d.f24456b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C4291zP c4291zP = (C4291zP) it.next();
            if (c4291zP.f36115a == bp) {
                copyOnWriteArrayList.remove(c4291zP);
            }
        }
    }

    public final void n(InterfaceC3914sQ interfaceC3914sQ, IO io, InterfaceC4211y interfaceC4211y) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f29829e;
        boolean z6 = true;
        if (looper != null && looper != myLooper) {
            z6 = false;
        }
        AbstractC2792Sd.i(z6);
        this.f29831g = io;
        this.f29832h = interfaceC4211y;
        AbstractC3627n8 abstractC3627n8 = this.f29830f;
        this.f29825a.add(interfaceC3914sQ);
        if (this.f29829e != null) {
            if (abstractC3627n8 != null) {
                o(interfaceC3914sQ);
                interfaceC3914sQ.a(this, abstractC3627n8);
                return;
            }
            return;
        }
        this.f29829e = myLooper;
        this.f29826b.add(interfaceC3914sQ);
        B b9 = (B) interfaceC4211y;
        b9.getClass();
        h(b9);
    }

    public final void o(InterfaceC3914sQ interfaceC3914sQ) {
        this.f29829e.getClass();
        HashSet hashSet = this.f29826b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(interfaceC3914sQ);
        if (isEmpty) {
            g();
        }
    }

    public final void p(InterfaceC3914sQ interfaceC3914sQ) {
        HashSet hashSet = this.f29826b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(interfaceC3914sQ);
        if (isEmpty || !hashSet.isEmpty()) {
            return;
        }
        i();
    }

    public final void q(InterfaceC3914sQ interfaceC3914sQ) {
        ArrayList arrayList = this.f29825a;
        arrayList.remove(interfaceC3914sQ);
        if (!arrayList.isEmpty()) {
            p(interfaceC3914sQ);
            return;
        }
        this.f29829e = null;
        this.f29830f = null;
        this.f29831g = null;
        this.f29826b.clear();
        j();
    }

    public abstract void r();

    public void d() {
    }

    public void e() {
    }
}

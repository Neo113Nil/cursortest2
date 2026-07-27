package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public abstract class XP {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f28524a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f28525b = new HashSet(1);

    /* renamed from: c, reason: collision with root package name */
    public final AP f28526c;

    /* renamed from: d, reason: collision with root package name */
    public final AP f28527d;

    /* renamed from: e, reason: collision with root package name */
    public Looper f28528e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC3604n8 f28529f;

    /* renamed from: g, reason: collision with root package name */
    public IO f28530g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC4188y f28531h;

    public XP() {
        C3676oQ c3676oQ = null;
        this.f28526c = new AP(new CopyOnWriteArrayList(), c3676oQ);
        this.f28527d = new AP(new CopyOnWriteArrayList(), c3676oQ);
    }

    public abstract void a(C2954b2 c2954b2);

    public abstract void b(InterfaceC3622nQ interfaceC3622nQ);

    public abstract InterfaceC3622nQ c(C3676oQ c3676oQ, InterfaceC4026v interfaceC4026v, long j6);

    public abstract C2954b2 f();

    public void g() {
    }

    public abstract void h(B b9);

    public void i() {
    }

    public abstract void j();

    public final void k(AbstractC3604n8 abstractC3604n8) {
        this.f28529f = abstractC3604n8;
        ArrayList arrayList = this.f28524a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC3730pQ) arrayList.get(i)).a(this, abstractC3604n8);
        }
    }

    public final void l(InterfaceC3837rQ interfaceC3837rQ) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f28526c.f23676b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C3784qQ c3784qQ = (C3784qQ) it.next();
            if (c3784qQ.f33242b == interfaceC3837rQ) {
                copyOnWriteArrayList.remove(c3784qQ);
            }
        }
    }

    public final void m(BP bp) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f28527d.f23676b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C4268zP c4268zP = (C4268zP) it.next();
            if (c4268zP.f35331a == bp) {
                copyOnWriteArrayList.remove(c4268zP);
            }
        }
    }

    public final void n(InterfaceC3730pQ interfaceC3730pQ, IO io, InterfaceC4188y interfaceC4188y) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f28528e;
        boolean z3 = true;
        if (looper != null && looper != myLooper) {
            z3 = false;
        }
        AbstractC2772Sd.i(z3);
        this.f28530g = io;
        this.f28531h = interfaceC4188y;
        AbstractC3604n8 abstractC3604n8 = this.f28529f;
        this.f28524a.add(interfaceC3730pQ);
        if (this.f28528e != null) {
            if (abstractC3604n8 != null) {
                o(interfaceC3730pQ);
                interfaceC3730pQ.a(this, abstractC3604n8);
                return;
            }
            return;
        }
        this.f28528e = myLooper;
        this.f28525b.add(interfaceC3730pQ);
        B b9 = (B) interfaceC4188y;
        b9.getClass();
        h(b9);
    }

    public final void o(InterfaceC3730pQ interfaceC3730pQ) {
        this.f28528e.getClass();
        HashSet hashSet = this.f28525b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(interfaceC3730pQ);
        if (isEmpty) {
            g();
        }
    }

    public final void p(InterfaceC3730pQ interfaceC3730pQ) {
        HashSet hashSet = this.f28525b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(interfaceC3730pQ);
        if (isEmpty || !hashSet.isEmpty()) {
            return;
        }
        i();
    }

    public final void q(InterfaceC3730pQ interfaceC3730pQ) {
        ArrayList arrayList = this.f28524a;
        arrayList.remove(interfaceC3730pQ);
        if (!arrayList.isEmpty()) {
            p(interfaceC3730pQ);
            return;
        }
        this.f28528e = null;
        this.f28529f = null;
        this.f28530g = null;
        this.f28525b.clear();
        j();
    }

    public abstract void r();

    public void d() {
    }

    public void e() {
    }
}

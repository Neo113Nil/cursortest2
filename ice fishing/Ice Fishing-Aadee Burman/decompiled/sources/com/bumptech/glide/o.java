package com.bumptech.glide;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class o implements com.bumptech.glide.manager.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.manager.p f23485a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f23486b;

    public o(p pVar, com.bumptech.glide.manager.p pVar2) {
        this.f23486b = pVar;
        this.f23485a = pVar2;
    }

    @Override // com.bumptech.glide.manager.a
    public final void a(boolean z3) {
        if (z3) {
            synchronized (this.f23486b) {
                com.bumptech.glide.manager.p pVar = this.f23485a;
                Iterator it = N1.p.e((Set) pVar.f23470v).iterator();
                while (it.hasNext()) {
                    J1.c cVar = (J1.c) it.next();
                    if (!cVar.j() && !cVar.h()) {
                        cVar.clear();
                        if (pVar.f23469u) {
                            ((HashSet) pVar.f23471w).add(cVar);
                        } else {
                            cVar.i();
                        }
                    }
                }
            }
        }
    }
}

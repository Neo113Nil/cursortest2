package com.bumptech.glide;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class o implements com.bumptech.glide.manager.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.manager.o f24270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f24271b;

    public o(p pVar, com.bumptech.glide.manager.o oVar) {
        this.f24271b = pVar;
        this.f24270a = oVar;
    }

    @Override // com.bumptech.glide.manager.a
    public final void a(boolean z6) {
        if (z6) {
            synchronized (this.f24271b) {
                com.bumptech.glide.manager.o oVar = this.f24270a;
                Iterator it = P1.p.e((Set) oVar.f24255v).iterator();
                while (it.hasNext()) {
                    L1.c cVar = (L1.c) it.next();
                    if (!cVar.j() && !cVar.h()) {
                        cVar.clear();
                        if (oVar.f24254u) {
                            ((HashSet) oVar.f24256w).add(cVar);
                        } else {
                            cVar.i();
                        }
                    }
                }
            }
        }
    }
}

package com.bumptech.glide;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class o implements com.bumptech.glide.manager.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.manager.o f23639a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f23640b;

    public o(p pVar, com.bumptech.glide.manager.o oVar) {
        this.f23640b = pVar;
        this.f23639a = oVar;
    }

    @Override // com.bumptech.glide.manager.a
    public final void a(boolean z8) {
        if (z8) {
            synchronized (this.f23640b) {
                com.bumptech.glide.manager.o oVar = this.f23639a;
                Iterator it = N1.p.e((Set) oVar.f23624v).iterator();
                while (it.hasNext()) {
                    J1.c cVar = (J1.c) it.next();
                    if (!cVar.j() && !cVar.h()) {
                        cVar.clear();
                        if (oVar.f23623u) {
                            ((HashSet) oVar.f23625w).add(cVar);
                        } else {
                            cVar.i();
                        }
                    }
                }
            }
        }
    }
}

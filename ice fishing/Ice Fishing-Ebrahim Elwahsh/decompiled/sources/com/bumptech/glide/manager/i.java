package com.bumptech.glide.manager;

import androidx.lifecycle.AbstractC0508p;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC0508p f23610n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ S0.c f23611u;

    public i(S0.c cVar, AbstractC0508p abstractC0508p) {
        this.f23611u = cVar;
        this.f23610n = abstractC0508p;
    }

    @Override // com.bumptech.glide.manager.h
    public final void onDestroy() {
        ((HashMap) this.f23611u.f2886u).remove(this.f23610n);
    }

    @Override // com.bumptech.glide.manager.h
    public final void onStart() {
    }

    @Override // com.bumptech.glide.manager.h
    public final void onStop() {
    }
}

package com.bumptech.glide.manager;

import S0.s;
import androidx.lifecycle.AbstractC0502p;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC0502p f24241n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ s f24242u;

    public i(s sVar, AbstractC0502p abstractC0502p) {
        this.f24242u = sVar;
        this.f24241n = abstractC0502p;
    }

    @Override // com.bumptech.glide.manager.h
    public final void onDestroy() {
        ((HashMap) this.f24242u.f2969u).remove(this.f24241n);
    }

    @Override // com.bumptech.glide.manager.h
    public final void onStart() {
    }

    @Override // com.bumptech.glide.manager.h
    public final void onStop() {
    }
}

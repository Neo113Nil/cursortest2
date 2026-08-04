package com.gamericefishpro.space.u8;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends e0 {
    public final WeakReference a;

    public t(u uVar) {
        this.a = new WeakReference(uVar);
    }

    @Override // com.gamericefishpro.space.u8.e0
    public final void a() {
        u uVar = (u) this.a.get();
        if (uVar == null) {
            return;
        }
        u.f(uVar);
    }
}

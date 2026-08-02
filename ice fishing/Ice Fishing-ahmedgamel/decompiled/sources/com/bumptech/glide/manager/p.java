package com.bumptech.glide.manager;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class p implements h {

    /* renamed from: n, reason: collision with root package name */
    public final Set f24257n = Collections.newSetFromMap(new WeakHashMap());

    @Override // com.bumptech.glide.manager.h
    public final void onDestroy() {
        Iterator it = P1.p.e(this.f24257n).iterator();
        while (it.hasNext()) {
            ((M1.c) it.next()).onDestroy();
        }
    }

    @Override // com.bumptech.glide.manager.h
    public final void onStart() {
        Iterator it = P1.p.e(this.f24257n).iterator();
        while (it.hasNext()) {
            ((M1.c) it.next()).onStart();
        }
    }

    @Override // com.bumptech.glide.manager.h
    public final void onStop() {
        Iterator it = P1.p.e(this.f24257n).iterator();
        while (it.hasNext()) {
            ((M1.c) it.next()).onStop();
        }
    }
}

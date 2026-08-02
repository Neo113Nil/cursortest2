package com.bumptech.glide.manager;

import android.view.View;
import androidx.fragment.app.AbstractActivityC0484x;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class e implements f {

    /* renamed from: n, reason: collision with root package name */
    public final Set f24239n = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f24240u;

    @Override // com.bumptech.glide.manager.f
    public final void h(AbstractActivityC0484x abstractActivityC0484x) {
        if (!this.f24240u && this.f24239n.add(abstractActivityC0484x)) {
            View decorView = abstractActivityC0484x.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new d(this, decorView));
        }
    }
}

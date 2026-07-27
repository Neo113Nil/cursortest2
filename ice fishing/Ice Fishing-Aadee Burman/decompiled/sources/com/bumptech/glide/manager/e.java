package com.bumptech.glide.manager;

import android.view.View;
import androidx.fragment.app.AbstractActivityC0480x;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class e implements f {

    /* renamed from: n, reason: collision with root package name */
    public final Set f23452n = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f23453u;

    @Override // com.bumptech.glide.manager.f
    public final void l(AbstractActivityC0480x abstractActivityC0480x) {
        if (!this.f23453u && this.f23452n.add(abstractActivityC0480x)) {
            View decorView = abstractActivityC0480x.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new d(this, decorView));
        }
    }
}

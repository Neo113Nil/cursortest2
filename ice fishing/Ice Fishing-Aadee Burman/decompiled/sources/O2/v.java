package O2;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class v extends com.bumptech.glide.g {

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f2294b;

    public v(w wVar) {
        this.f2294b = new WeakReference(wVar);
    }

    @Override // com.bumptech.glide.g
    public final void j() {
        w wVar = (w) this.f2294b.get();
        if (wVar == null) {
            return;
        }
        w.c(wVar);
    }
}

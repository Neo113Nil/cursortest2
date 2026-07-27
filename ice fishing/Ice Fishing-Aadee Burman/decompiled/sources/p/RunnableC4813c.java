package p;

import android.os.Bundle;

/* renamed from: p.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4813c implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39675n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f39676u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Bundle f39677v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BinderC4815e f39678w;

    public /* synthetic */ RunnableC4813c(BinderC4815e binderC4815e, String str, Bundle bundle, int i) {
        this.f39675n = i;
        this.f39678w = binderC4815e;
        this.f39676u = str;
        this.f39677v = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39675n) {
            case 0:
                this.f39678w.f39685u.a(this.f39676u, this.f39677v);
                break;
            default:
                this.f39678w.f39685u.f(this.f39676u, this.f39677v);
                break;
        }
    }
}

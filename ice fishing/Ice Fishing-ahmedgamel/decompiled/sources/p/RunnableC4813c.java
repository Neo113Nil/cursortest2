package p;

import android.os.Bundle;

/* renamed from: p.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4813c implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39678n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f39679u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Bundle f39680v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BinderC4815e f39681w;

    public /* synthetic */ RunnableC4813c(BinderC4815e binderC4815e, String str, Bundle bundle, int i) {
        this.f39678n = i;
        this.f39681w = binderC4815e;
        this.f39679u = str;
        this.f39680v = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39678n) {
            case 0:
                this.f39681w.f39688u.a(this.f39679u, this.f39680v);
                break;
            default:
                this.f39681w.f39688u.f(this.f39679u, this.f39680v);
                break;
        }
    }
}

package p;

import android.net.Uri;
import android.os.Bundle;

/* renamed from: p.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4814d implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39679n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Uri f39680u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f39681v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Bundle f39682w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ BinderC4815e f39683x;

    public RunnableC4814d(BinderC4815e binderC4815e, int i, Uri uri, boolean z3, Bundle bundle) {
        this.f39683x = binderC4815e;
        this.f39679n = i;
        this.f39680u = uri;
        this.f39681v = z3;
        this.f39682w = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f39683x.f39685u.g(this.f39679n, this.f39680u, this.f39681v, this.f39682w);
    }
}

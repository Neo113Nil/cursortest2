package p;

import android.net.Uri;
import android.os.Bundle;

/* renamed from: p.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4814d implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39682n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Uri f39683u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f39684v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Bundle f39685w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ BinderC4815e f39686x;

    public RunnableC4814d(BinderC4815e binderC4815e, int i, Uri uri, boolean z3, Bundle bundle) {
        this.f39686x = binderC4815e;
        this.f39682n = i;
        this.f39683u = uri;
        this.f39684v = z3;
        this.f39685w = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f39686x.f39688u.g(this.f39682n, this.f39683u, this.f39684v, this.f39685w);
    }
}

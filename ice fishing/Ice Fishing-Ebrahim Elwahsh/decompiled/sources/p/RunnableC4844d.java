package p;

import android.net.Uri;
import android.os.Bundle;

/* renamed from: p.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4844d implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39747n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Uri f39748u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f39749v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Bundle f39750w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ BinderC4845e f39751x;

    public RunnableC4844d(BinderC4845e binderC4845e, int i, Uri uri, boolean z8, Bundle bundle) {
        this.f39751x = binderC4845e;
        this.f39747n = i;
        this.f39748u = uri;
        this.f39749v = z8;
        this.f39750w = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f39751x.f39753u.g(this.f39747n, this.f39748u, this.f39749v, this.f39750w);
    }
}

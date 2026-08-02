package p;

import android.net.Uri;
import android.os.Bundle;

/* renamed from: p.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4818d implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39790n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Uri f39791u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f39792v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Bundle f39793w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ BinderC4819e f39794x;

    public RunnableC4818d(BinderC4819e binderC4819e, int i, Uri uri, boolean z6, Bundle bundle) {
        this.f39794x = binderC4819e;
        this.f39790n = i;
        this.f39791u = uri;
        this.f39792v = z6;
        this.f39793w = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f39794x.f39796u.g(this.f39790n, this.f39791u, this.f39792v, this.f39793w);
    }
}

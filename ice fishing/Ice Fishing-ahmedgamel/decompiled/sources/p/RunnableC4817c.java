package p;

import android.os.Bundle;

/* renamed from: p.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4817c implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39786n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f39787u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Bundle f39788v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BinderC4819e f39789w;

    public /* synthetic */ RunnableC4817c(BinderC4819e binderC4819e, String str, Bundle bundle, int i) {
        this.f39786n = i;
        this.f39789w = binderC4819e;
        this.f39787u = str;
        this.f39788v = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39786n) {
            case 0:
                this.f39789w.f39796u.a(this.f39787u, this.f39788v);
                break;
            default:
                this.f39789w.f39796u.f(this.f39787u, this.f39788v);
                break;
        }
    }
}

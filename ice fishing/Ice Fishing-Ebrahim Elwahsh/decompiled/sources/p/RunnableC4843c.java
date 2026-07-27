package p;

import android.os.Bundle;

/* renamed from: p.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4843c implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39743n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f39744u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Bundle f39745v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BinderC4845e f39746w;

    public /* synthetic */ RunnableC4843c(BinderC4845e binderC4845e, String str, Bundle bundle, int i) {
        this.f39743n = i;
        this.f39746w = binderC4845e;
        this.f39744u = str;
        this.f39745v = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39743n) {
            case 0:
                this.f39746w.f39753u.a(this.f39744u, this.f39745v);
                break;
            default:
                this.f39746w.f39753u.f(this.f39744u, this.f39745v);
                break;
        }
    }
}

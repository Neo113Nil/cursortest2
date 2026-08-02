package p;

import android.os.Bundle;

/* renamed from: p.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4816b implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39784n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ BinderC4819e f39785u;

    public /* synthetic */ RunnableC4816b(BinderC4819e binderC4819e, Bundle bundle, int i) {
        this.f39784n = i;
        this.f39785u = binderC4819e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39784n) {
            case 0:
                this.f39785u.f39796u.getClass();
                break;
            case 1:
                this.f39785u.f39796u.getClass();
                break;
            case 2:
                this.f39785u.f39796u.getClass();
                break;
            default:
                this.f39785u.f39796u.getClass();
                break;
        }
    }

    public RunnableC4816b(BinderC4819e binderC4819e, int i, int i4, int i6, int i9, int i10, Bundle bundle) {
        this.f39784n = 2;
        this.f39785u = binderC4819e;
    }
}

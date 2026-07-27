package p;

import android.os.Bundle;

/* renamed from: p.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4842b implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39741n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ BinderC4845e f39742u;

    public /* synthetic */ RunnableC4842b(BinderC4845e binderC4845e, Bundle bundle, int i) {
        this.f39741n = i;
        this.f39742u = binderC4845e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39741n) {
            case 0:
                this.f39742u.f39753u.getClass();
                break;
            case 1:
                this.f39742u.f39753u.getClass();
                break;
            case 2:
                this.f39742u.f39753u.getClass();
                break;
            default:
                this.f39742u.f39753u.getClass();
                break;
        }
    }

    public RunnableC4842b(BinderC4845e binderC4845e, int i, int i4, int i9, int i10, int i11, Bundle bundle) {
        this.f39741n = 2;
        this.f39742u = binderC4845e;
    }
}

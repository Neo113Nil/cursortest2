package p;

import android.os.Bundle;

/* renamed from: p.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4812b implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39673n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ BinderC4815e f39674u;

    public /* synthetic */ RunnableC4812b(BinderC4815e binderC4815e, Bundle bundle, int i) {
        this.f39673n = i;
        this.f39674u = binderC4815e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39673n) {
            case 0:
                this.f39674u.f39685u.getClass();
                break;
            case 1:
                this.f39674u.f39685u.getClass();
                break;
            case 2:
                this.f39674u.f39685u.getClass();
                break;
            default:
                this.f39674u.f39685u.getClass();
                break;
        }
    }

    public RunnableC4812b(BinderC4815e binderC4815e, int i, int i6, int i9, int i10, int i11, Bundle bundle) {
        this.f39673n = 2;
        this.f39674u = binderC4815e;
    }
}

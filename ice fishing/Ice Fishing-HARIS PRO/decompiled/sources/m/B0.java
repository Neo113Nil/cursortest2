package m;

import android.database.DataSetObserver;

/* loaded from: classes.dex */
public final class B0 extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E0 f3792a;

    public B0(E0 e02) {
        this.f3792a = e02;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        E0 e02 = this.f3792a;
        if (e02.f3828z.isShowing()) {
            e02.c();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f3792a.dismiss();
    }
}

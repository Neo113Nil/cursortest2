package defpackage;

import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes14.dex */
public final class rvu0 implements ylr {
    public final /* synthetic */ svu0 a;

    public rvu0(svu0 svu0Var) {
        this.a = svu0Var;
    }

    @Override // defpackage.ylr
    public final void addScrollListener(RecyclerView.g gVar) {
    }

    @Override // defpackage.ylr
    public final View asView() {
        return new ViewStub(this.a.a);
    }

    @Override // defpackage.ylr
    public final boolean interceptOnBackPressed() {
        return false;
    }

    @Override // defpackage.ylr
    public final void removeScrollListener(RecyclerView.g gVar) {
    }
}

package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes13.dex */
public final class rwu0 implements ylr {
    public final /* synthetic */ bac0 a;

    public rwu0(bac0 bac0Var) {
        this.a = bac0Var;
    }

    @Override // defpackage.ylr
    public final void addScrollListener(RecyclerView.g gVar) {
    }

    @Override // defpackage.ylr
    public final View asView() {
        return new ViewStub((Context) this.a.b);
    }

    @Override // defpackage.ylr
    public final boolean interceptOnBackPressed() {
        return false;
    }

    @Override // defpackage.ylr
    public final void removeScrollListener(RecyclerView.g gVar) {
    }
}

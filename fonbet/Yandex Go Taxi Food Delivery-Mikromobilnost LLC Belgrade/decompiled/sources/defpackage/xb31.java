package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.ui.error.HubErrorView;

/* loaded from: classes14.dex */
public final class xb31 implements zo31 {
    public final GoConstraintLayout a;
    public final View b;
    public final HubErrorView c;
    public final RecyclerView d;
    public final View e;

    public xb31(GoConstraintLayout goConstraintLayout, View view, HubErrorView hubErrorView, RecyclerView recyclerView, View view2) {
        this.a = goConstraintLayout;
        this.b = view;
        this.c = hubErrorView;
        this.d = recyclerView;
        this.e = view2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}

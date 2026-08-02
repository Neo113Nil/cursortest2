package defpackage;

import android.view.View;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d0;
import com.yandex.messaging.internal.view.timeline.i;
import com.yandex.messaging.support.view.timeline.TimelineLayoutManager;

/* loaded from: classes15.dex */
public final /* synthetic */ class sbb implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ sbb(i iVar, int i) {
        this.a = i;
        this.b = iVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        i iVar = this.b;
        switch (i) {
            case 0:
                TimelineLayoutManager timelineLayoutManager = iVar.M;
                d0 d0Var = timelineLayoutManager.J;
                View C1 = timelineLayoutManager.d0() == 0 ? null : timelineLayoutManager.C1((d0Var.g() + d0Var.k()) / 2);
                return Integer.valueOf(C1 != null ? ((RecyclerView.LayoutParams) C1.getLayoutParams()).getViewLayoutPosition() : -1);
            default:
                RecyclerView recyclerView = iVar.L;
                Toast.makeText(recyclerView.getContext(), recyclerView.getContext().getString(oyh0.messenger_max_limit_length_exceeded_error, 1024), 0).show();
                return zy11.a;
        }
    }
}

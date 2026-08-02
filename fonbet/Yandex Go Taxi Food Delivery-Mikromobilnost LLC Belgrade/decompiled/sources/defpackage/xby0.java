package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;

/* loaded from: classes12.dex */
public final /* synthetic */ class xby0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zby0 b;

    public /* synthetic */ xby0(zby0 zby0Var, int i) {
        this.a = i;
        this.b = zby0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.a;
        zby0 zby0Var = this.b;
        switch (i9) {
            case 0:
                zby0Var.c((RecyclerView) view);
                break;
            default:
                View findViewById = view.findViewById(nch0.flexsdk_recycler_view_id);
                if (findViewById instanceof RecyclerView) {
                    RecyclerView recyclerView = (RecyclerView) findViewById;
                    xby0 xby0Var = zby0Var.y;
                    yby0 yby0Var = zby0Var.z;
                    WeakReference weakReference = zby0Var.w;
                    RecyclerView recyclerView2 = weakReference != null ? (RecyclerView) weakReference.get() : null;
                    if (recyclerView2 != recyclerView) {
                        if (recyclerView2 != null) {
                            recyclerView2.removeOnScrollListener(yby0Var);
                        }
                        if (recyclerView2 != null) {
                            recyclerView2.removeOnLayoutChangeListener(xby0Var);
                        }
                        zby0Var.w = new WeakReference(recyclerView);
                        recyclerView.addOnScrollListener(yby0Var);
                        recyclerView.addOnLayoutChangeListener(xby0Var);
                        zby0Var.c(recyclerView);
                        break;
                    }
                }
                break;
        }
    }
}

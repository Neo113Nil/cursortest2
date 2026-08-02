package defpackage;

import android.view.View;
import androidx.core.view.b;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.qgr0;
import java.util.WeakHashMap;

/* loaded from: classes13.dex */
public final class qgr0 {
    public final RecyclerView a;
    public final zxs0 b;
    public final yln c;
    public final gk1 d;
    public boolean e;

    public qgr0(final RecyclerView recyclerView, zxs0 zxs0Var) {
        this.a = recyclerView;
        this.b = zxs0Var;
        yln ylnVar = new yln(26, this);
        this.c = ylnVar;
        gk1 gk1Var = new gk1(8, this);
        this.d = gk1Var;
        this.e = true;
        WeakHashMap weakHashMap = b.a;
        if (recyclerView.isAttachedToWindow()) {
            recyclerView.addOnLayoutChangeListener(ylnVar);
            recyclerView.setOnScrollChangeListener(gk1Var);
            a();
        } else {
            recyclerView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.go.places.impl.ui.common.shadow.ShadowOnScrollHandler$special$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    recyclerView.removeOnAttachStateChangeListener(this);
                    qgr0 qgr0Var = this;
                    RecyclerView recyclerView2 = qgr0Var.a;
                    recyclerView2.addOnLayoutChangeListener(qgr0Var.c);
                    recyclerView2.setOnScrollChangeListener(qgr0Var.d);
                    this.a();
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                }
            });
        }
        if (recyclerView.isAttachedToWindow()) {
            recyclerView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.go.places.impl.ui.common.shadow.ShadowOnScrollHandler$special$$inlined$doOnDetach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    recyclerView.removeOnAttachStateChangeListener(this);
                    qgr0 qgr0Var = this;
                    RecyclerView recyclerView2 = qgr0Var.a;
                    recyclerView2.removeOnLayoutChangeListener(qgr0Var.c);
                    recyclerView2.setOnScrollChangeListener(null);
                }
            });
        } else {
            recyclerView.removeOnLayoutChangeListener(ylnVar);
            recyclerView.setOnScrollChangeListener(null);
        }
    }

    public final void a() {
        boolean canScrollVertically = this.a.canScrollVertically(1);
        boolean z = this.e;
        zxs0 zxs0Var = this.b;
        if (canScrollVertically) {
            if (z) {
                return;
            }
            zxs0Var.o(true);
            this.e = true;
            return;
        }
        if (z) {
            zxs0Var.o(false);
            this.e = false;
        }
    }
}

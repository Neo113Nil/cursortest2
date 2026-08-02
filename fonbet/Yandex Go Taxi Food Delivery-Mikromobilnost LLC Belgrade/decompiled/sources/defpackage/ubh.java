package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.flex.common.ui.DefaultFlexPopupModalView;

/* loaded from: classes12.dex */
public final class ubh extends kah {
    public final /* synthetic */ DefaultFlexPopupModalView a;

    public ubh(DefaultFlexPopupModalView defaultFlexPopupModalView) {
        this.a = defaultFlexPopupModalView;
    }

    @Override // defpackage.i3m
    public final void onRenderingFinished(l1o l1oVar, u1m u1mVar, ywl ywlVar, long j) {
        ykr ykrVar;
        zkr binding;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        DefaultFlexPopupModalView defaultFlexPopupModalView = this.a;
        ykrVar = defaultFlexPopupModalView.configuration;
        if (ykrVar.a) {
            return;
        }
        binding = defaultFlexPopupModalView.getBinding();
        View childAt = binding.b.getChildAt(0);
        ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
        if (viewGroup == null) {
            return;
        }
        View childAt2 = viewGroup.getChildAt(0);
        ViewGroup viewGroup2 = childAt2 instanceof ViewGroup ? (ViewGroup) childAt2 : null;
        if (viewGroup2 == null) {
            return;
        }
        View childAt3 = viewGroup2.getChildAt(0);
        RecyclerView recyclerView3 = childAt3 instanceof RecyclerView ? (RecyclerView) childAt3 : null;
        if (recyclerView3 == null) {
            return;
        }
        defaultFlexPopupModalView.recycler = recyclerView3;
        recyclerView = defaultFlexPopupModalView.recycler;
        defaultFlexPopupModalView.refreshNestedScrollView(recyclerView);
        recyclerView2 = defaultFlexPopupModalView.recycler;
        if (recyclerView2 != null) {
            recyclerView2.addOnChildAttachStateChangeListener(new tbh(defaultFlexPopupModalView, 0));
        }
    }

    @Override // defpackage.kah, defpackage.i3m
    public final void onRenderingStarted(l1o l1oVar, u1m u1mVar, ywl ywlVar) {
    }
}

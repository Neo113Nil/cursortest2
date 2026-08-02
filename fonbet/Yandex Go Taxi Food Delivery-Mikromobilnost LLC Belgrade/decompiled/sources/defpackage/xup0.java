package defpackage;

import android.graphics.drawable.Drawable;
import com.yandex.go.places.impl.ui.search.SearchModalView;
import java.util.Collections;
import kotlin.collections.a;

/* loaded from: classes13.dex */
public final class xup0 implements bvp0 {
    public final /* synthetic */ SearchModalView a;

    public xup0(SearchModalView searchModalView) {
        this.a = searchModalView;
    }

    @Override // defpackage.bvp0
    public final void hideKeyboard() {
        this.a.hideKeyboard();
    }

    @Override // defpackage.bvp0
    public final void l(Drawable drawable) {
        cvw.c0(SearchModalView.access$getBinding(this.a).d, drawable);
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        gtp0 gtp0Var;
        int searchHeaderPx;
        gtp0 gtp0Var2;
        int searchHeaderPx2;
        gtp0 gtp0Var3;
        int searchHeaderPx3;
        nwp0 nwp0Var = (nwp0) obj;
        boolean z = nwp0Var instanceof kwp0;
        SearchModalView searchModalView = this.a;
        if (z) {
            gtp0Var3 = searchModalView.adapter;
            searchHeaderPx3 = searchModalView.getSearchHeaderPx();
            kwp0 kwp0Var = (kwp0) nwp0Var;
            gtp0Var3.submitList(a.m0(kwp0Var.b.a, Collections.singletonList(new ier(searchHeaderPx3))), null);
            SearchModalView.access$getBinding(searchModalView).f.scrollToPosition(kwp0Var.c);
            searchModalView.processRecyclerViewScrollState();
            cma1.J(SearchModalView.access$getBinding(searchModalView).f);
            cma1.L(SearchModalView.access$getBinding(searchModalView).c.b);
            return;
        }
        if (nwp0Var instanceof lwp0) {
            gtp0Var2 = searchModalView.adapter;
            searchHeaderPx2 = searchModalView.getSearchHeaderPx();
            gtp0Var2.submitList(Collections.singletonList(new ier(searchHeaderPx2)), null);
            cma1.L(SearchModalView.access$getBinding(searchModalView).f);
            cma1.J(SearchModalView.access$getBinding(searchModalView).c.b);
            return;
        }
        if (!(nwp0Var instanceof mwp0)) {
            w511.b();
            return;
        }
        gtp0Var = searchModalView.adapter;
        searchHeaderPx = searchModalView.getSearchHeaderPx();
        gtp0Var.submitList(a.m0(((mwp0) nwp0Var).b.a, Collections.singletonList(new ier(searchHeaderPx))), null);
        cma1.J(SearchModalView.access$getBinding(searchModalView).f);
        cma1.L(SearchModalView.access$getBinding(searchModalView).c.b);
    }

    @Override // defpackage.bvp0
    public final void showKeyboard() {
        this.a.showKeyboard();
    }

    @Override // defpackage.bvp0
    public final void y(CharSequence charSequence, boolean z) {
        SearchModalView searchModalView = this.a;
        if (z) {
            SearchModalView.access$getBinding(searchModalView).e.setText(charSequence);
        } else {
            SearchModalView.access$getBinding(searchModalView).e.setTextWithoutNotifying(charSequence);
        }
        SearchModalView.access$getBinding(searchModalView).e.placeCursorAtEnd();
    }
}

package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.service_catalog.analytics.ServiceCatalogAnalytics$ServiceCatalogScreenLoadingState;
import defpackage.tje;
import defpackage.xuq0;

/* loaded from: classes13.dex */
public final class xuq0 extends pjm0 {
    public final tse a;
    public final wgr b;
    public final puq0 c;
    public nzm w;

    public xuq0(tse tseVar, wgr wgrVar, puq0 puq0Var) {
        this.a = tseVar;
        this.b = wgrVar;
        this.c = puq0Var;
    }

    @Override // defpackage.pjm0
    public final ViewGroup a(View view) {
        nzm nzmVar = this.w;
        if (nzmVar != null) {
            return (GoFrameLayout) nzmVar.c;
        }
        ny61.g("Required value was null.");
        return null;
    }

    @Override // defpackage.ws11
    public final View onCreateView(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(ckh0.service_catalog_scaffold_preview, viewGroup, false);
        int i = s7h0.contentContainer;
        GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i, inflate);
        if (goFrameLayout != null) {
            GoFrameLayout goFrameLayout2 = (GoFrameLayout) inflate;
            int i2 = s7h0.top_view;
            View O = cma1.O(i2, inflate);
            if (O != null) {
                zuq0 o = zuq0.o(O);
                this.w = new nzm(goFrameLayout2, goFrameLayout, o);
                o.c.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.go.service_catalog.flex.sdk.scaffold.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        xuq0 xuq0Var = xuq0.this;
                        xuq0Var.c.a(ServiceCatalogAnalytics$ServiceCatalogScreenLoadingState.Loading);
                        tje.N(xuq0Var.a, null, null, new ServiceCatalogPreviewScaffoldController$onCreateView$1$1(xuq0Var, null), 3);
                    }
                });
                nzm nzmVar = this.w;
                if (nzmVar != null) {
                    return (GoFrameLayout) nzmVar.b;
                }
                ny61.g("Required value was null.");
                return null;
            }
            i = i2;
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.ws11
    public final void onDestroyView(View view) {
        this.w = null;
    }

    @Override // defpackage.ws11
    public final /* bridge */ /* synthetic */ void onUpdateState(Object obj) {
    }
}

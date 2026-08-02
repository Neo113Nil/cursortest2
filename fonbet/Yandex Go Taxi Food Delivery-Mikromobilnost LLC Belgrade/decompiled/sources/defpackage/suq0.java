package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.service_catalog.analytics.ServiceCatalogAnalytics$ServiceCatalogScreenLoadingState;
import com.yandex.go.service_catalog.router.a;
import com.yandex.go.service_catalog.router.b;
import java.util.HashMap;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class suq0 extends mao {
    public final a a;
    public final zuj0 b;
    public final puq0 c;
    public final boolean w;
    public m2y x;

    public suq0(a aVar, zuj0 zuj0Var, puq0 puq0Var, boolean z) {
        this.a = aVar;
        this.b = zuj0Var;
        this.c = puq0Var;
        this.w = z;
    }

    public final m2y a() {
        m2y m2yVar = this.x;
        if (m2yVar != null) {
            return m2yVar;
        }
        ny61.g("Required value was null.");
        return null;
    }

    @Override // defpackage.ws11
    public final View onCreateView(ViewGroup viewGroup) {
        View O;
        GoConstraintLayout goConstraintLayout;
        final int i = 0;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(ckh0.service_catalog_error_placeholder, viewGroup, false);
        int i2 = s7h0.icon;
        if (((GoImageView) cma1.O(i2, inflate)) != null) {
            i2 = s7h0.reload_button;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i2, inflate);
            if (buttonComponent != null) {
                i2 = s7h0.title;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, inflate);
                if (robotoTextView != null && (O = cma1.O((i2 = s7h0.top_view), inflate)) != null) {
                    this.x = new m2y((GoConstraintLayout) inflate, buttonComponent, robotoTextView, zuq0.o(O), 7);
                    RobotoTextView robotoTextView2 = (RobotoTextView) a().b;
                    int i3 = kyh0.service_catalog_loading_error;
                    avj0 avj0Var = (avj0) this.b;
                    robotoTextView2.setText(avj0Var.h(i3));
                    ((ButtonComponent) a().d).setText(avj0Var.h(kyh0.service_catalog_reload_button_title));
                    ButtonComponent buttonComponent2 = (ButtonComponent) a().d;
                    final a aVar = this.a;
                    buttonComponent2.setDebounceClickListener(new Runnable() { // from class: ruq0
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i4 = i;
                            a aVar2 = aVar;
                            switch (i4) {
                                case 0:
                                    aVar2.a();
                                    break;
                                default:
                                    b bVar = aVar2.c;
                                    bVar.K.a(ServiceCatalogAnalytics$ServiceCatalogScreenLoadingState.Failed);
                                    bVar.r(new qu(9));
                                    break;
                            }
                        }
                    });
                    final int i4 = 1;
                    ((zuq0) a().e).c.setDebounceClickListener(new Runnable() { // from class: ruq0
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i42 = i4;
                            a aVar2 = aVar;
                            switch (i42) {
                                case 0:
                                    aVar2.a();
                                    break;
                                default:
                                    b bVar = aVar2.c;
                                    bVar.K.a(ServiceCatalogAnalytics$ServiceCatalogScreenLoadingState.Failed);
                                    bVar.r(new qu(9));
                                    break;
                            }
                        }
                    });
                    tje.k(this.w ? 112 : 80, (GoConstraintLayout) a().c);
                    m2y m2yVar = this.x;
                    if (m2yVar != null && (goConstraintLayout = (GoConstraintLayout) m2yVar.c) != null) {
                        OneShotPreDrawListener.add(goConstraintLayout, new ci(goConstraintLayout, 5));
                    }
                    return (GoConstraintLayout) a().c;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // defpackage.ws11
    public final void onDestroyView(View view) {
        this.x = null;
    }

    @Override // defpackage.mao
    public final void onDocumentError(azl azlVar) {
        GoConstraintLayout goConstraintLayout;
        m2y m2yVar = this.x;
        if (m2yVar != null && (goConstraintLayout = (GoConstraintLayout) m2yVar.c) != null) {
            OneShotPreDrawListener.add(goConstraintLayout, new ci(goConstraintLayout, 5));
        }
        puq0 puq0Var = this.c;
        puq0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("endpoint", "bdui/v1/superapp/service-catalog");
        puq0Var.a.a("ServiceCatalog.LoadingFailed", hashMap, 1, new HashMap());
    }

    @Override // defpackage.ws11
    public final /* bridge */ /* synthetic */ void onUpdateState(Object obj) {
    }
}

package defpackage;

import com.yandex.go.scooters.offers.v2.components.options.ScootersCardOptionsListComponent;
import com.yandex.go.scooters.preselection.loading.v2.ScootersPreselectionLoadingV2ModalView;

/* loaded from: classes13.dex */
public final class zlo0 implements cmo0 {
    public final /* synthetic */ ScootersPreselectionLoadingV2ModalView a;

    public zlo0(ScootersPreselectionLoadingV2ModalView scootersPreselectionLoadingV2ModalView) {
        this.a = scootersPreselectionLoadingV2ModalView;
    }

    @Override // defpackage.cmo0
    public final void Q6(boolean z) {
        ScootersCardOptionsListComponent scootersCardOptionsListComponent;
        scootersCardOptionsListComponent = this.a.optionsListComponent;
        scootersCardOptionsListComponent.loading(z);
    }

    @Override // defpackage.cmo0
    public final void s9(Throwable th) {
        tls tlsVar;
        tlsVar = this.a.onErrorHappenedListener;
        tlsVar.invoke(th);
    }
}

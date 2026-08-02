package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.go.payments.cards.nfc.experiments.NfcScanCardExperiment;

/* loaded from: classes9.dex */
public final class sup implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("scan_card_by_nfc", NfcScanCardExperiment.class, new stp(5), ExperimentSource.LAUNCH, true);
    }
}

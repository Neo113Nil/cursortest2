package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.fpspay.presentation.FpsPayEnrollFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.pull.TransferMe2MeConfirmPullFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.Me2MeDebitResultFragment;

/* loaded from: classes3.dex */
public final class uas implements v7p {
    public final /* synthetic */ int a;
    public final n3w b;
    public final rbg c;

    public /* synthetic */ uas(n3w n3wVar, rbg rbgVar, int i) {
        this.a = i;
        this.b = n3wVar;
        this.c = rbgVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        rbg rbgVar = this.c;
        n3w n3wVar = this.b;
        switch (i) {
            case 0:
                return new FpsPayEnrollFragment((zas) n3wVar.a, (hu01) rbgVar.get());
            case 1:
                return new Me2MeDebitResultFragment((l910) n3wVar.a, (hu01) rbgVar.get());
            default:
                return new TransferMe2MeConfirmPullFragment((fm01) n3wVar.a, (hu01) rbgVar.get());
        }
    }
}

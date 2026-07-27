package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.versionedparcelable.LunarNodeCoordinatorResponseC8VCPH0p4yyjCMiQrO32513792729102;
import androidx.versionedparcelable.RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996;
import androidx.versionedparcelable.XenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692;
import androidx.versionedparcelable.YellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends CloudMessagingReceiver {
    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    public final void AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(Bundle bundle) {
        Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (XenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692.YellowLoopEncoderRouterINqff2SYTbtqZyuhu243435970216181(putExtras)) {
            XenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503("_nd", putExtras.getExtras());
        }
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    public final int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(Context context, LunarNodeCoordinatorResponseC8VCPH0p4yyjCMiQrO32513792729102 lunarNodeCoordinatorResponseC8VCPH0p4yyjCMiQrO32513792729102) {
        try {
            return ((Integer) RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(new YellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412(context, 1).UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541(lunarNodeCoordinatorResponseC8VCPH0p4yyjCMiQrO32513792729102.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867))).intValue();
        } catch (InterruptedException | ExecutionException unused) {
            return 500;
        }
    }
}

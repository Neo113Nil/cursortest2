package defpackage;

import com.yandex.payment.common.sbp.SbpOperation;
import com.yandex.payment.sdk.ui.payment.sbp.SbpFragment;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class rgm0 {
    public static SbpFragment a(String str, SbpOperation sbpOperation, boolean z) {
        SbpFragment sbpFragment = new SbpFragment();
        sbpFragment.setArguments(wwg.g(new Pair("ARG_EMAIL", str), new Pair("ARG_BIND_SBP_TOKEN", sbpOperation), new Pair("ARG_CAN_GO_BACK", Boolean.valueOf(z)), new Pair("ARG_SELECTED_BANK_SCHEME", null)));
        return sbpFragment;
    }
}

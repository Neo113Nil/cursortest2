package defpackage;

import com.yandex.payment.common.data.TextRes;
import com.yandex.payment.common.result.ResultScreenIdentifier;
import com.yandex.payment.common.result.ResultType;
import com.yandex.payment.common.sbp.SbpOperation;
import com.yandex.payment.divkit.challenger.DKChallengerFragment;
import com.yandex.payment.divkit.preselect.DKPreselectFragment;
import com.yandex.payment.divkit.results.DKResultFragment;
import com.yandex.payment.divkit.sbp.DKSbpFragment;
import com.yandex.payment.divkit.select.DKSelectFragment;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.core.data.SbpChallengeInfo;
import com.yandex.payment.sdk.ui.challenger.SbpChallengerActivity;
import kotlin.Pair;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes2.dex */
public final class xsf implements wsf {
    public final DKChallengerFragment b(SbpChallengeInfo sbpChallengeInfo, PaymentMethod.SbpToken sbpToken) {
        DKChallengerFragment.Companion.getClass();
        DKChallengerFragment dKChallengerFragment = new DKChallengerFragment();
        dKChallengerFragment.setArguments(wwg.g(new Pair(SbpChallengerActivity.EXTRA_CHALLENGE_INFO_DATA, sbpChallengeInfo), new Pair(SbpChallengerActivity.EXTRA_SBP_TOKEN_DATA, sbpToken)));
        return dKChallengerFragment;
    }

    public final DKResultFragment c(boolean z, boolean z2, TextRes.IntRes intRes, TextRes.IntRes intRes2, TextRes.IntRes intRes3, ResultScreenIdentifier resultScreenIdentifier) {
        DKResultFragment.Companion.getClass();
        DKResultFragment dKResultFragment = new DKResultFragment();
        dKResultFragment.setArguments(wwg.g(new Pair("ARG_RESULT_TYPE", new ResultType.Loading(null, z, z2, intRes, intRes2, null, intRes3, null, resultScreenIdentifier, HProv.PP_SECURITY_LEVEL, null))));
        return dKResultFragment;
    }

    public final DKPreselectFragment d(String str, boolean z, Double d) {
        ktf ktfVar = DKPreselectFragment.Companion;
        String valueOf = d != null ? String.valueOf(d.doubleValue()) : null;
        ktfVar.getClass();
        DKPreselectFragment dKPreselectFragment = new DKPreselectFragment();
        dKPreselectFragment.setArguments(wwg.g(new Pair("START_PAYMENT_AFTER_SELECT", Boolean.valueOf(z)), new Pair("DEFAULT_PAYMENT_METHOD_ID", str), new Pair("ORDER_AMOUNT", valueOf)));
        return dKPreselectFragment;
    }

    public final DKResultFragment e(TextRes.IntRes intRes, TextRes.IntRes intRes2, long j, ResultScreenIdentifier resultScreenIdentifier) {
        DKResultFragment.Companion.getClass();
        DKResultFragment dKResultFragment = new DKResultFragment();
        dKResultFragment.setArguments(wwg.g(new Pair("ARG_RESULT_TYPE", new ResultType.Success(null, false, false, intRes, null, intRes2, null, null, j, resultScreenIdentifier, HProv.PP_CONTAINER_DEFAULT, null))));
        return dKResultFragment;
    }

    public final DKSbpFragment f(String str, SbpOperation sbpOperation, boolean z) {
        DKSbpFragment.Companion.getClass();
        DKSbpFragment dKSbpFragment = new DKSbpFragment();
        dKSbpFragment.setArguments(wwg.g(new Pair("ARG_EMAIL", str), new Pair("ARG_BIND_SBP_TOKEN", sbpOperation), new Pair("ARG_CAN_GO_BACK", Boolean.valueOf(z)), new Pair("ARG_SELECTED_BANK_SCHEME", null)));
        return dKSbpFragment;
    }

    public final DKSelectFragment g(PaymentMethod paymentMethod, String str, boolean z) {
        DKSelectFragment.Companion.getClass();
        DKSelectFragment dKSelectFragment = new DKSelectFragment();
        dKSelectFragment.setArguments(wwg.g(new Pair("ARG_PREFERRED_METHOD", paymentMethod), new Pair("ARG_META_JSON", str), new Pair("ARG_DK_SELECT_VIEW_MODEL_REFACTORING_ENABLED", Boolean.valueOf(z))));
        return dKSelectFragment;
    }
}

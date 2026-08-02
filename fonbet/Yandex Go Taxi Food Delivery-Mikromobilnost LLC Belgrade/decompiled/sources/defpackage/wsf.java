package defpackage;

import com.yandex.payment.common.data.TextRes;
import com.yandex.payment.common.result.ResultScreenIdentifier;
import com.yandex.payment.common.result.ResultType;
import com.yandex.payment.divkit.results.DKResultFragment;
import kotlin.Pair;

/* loaded from: classes2.dex */
public interface wsf {
    static DKResultFragment a(xsf xsfVar, TextRes textRes, TextRes.IntRes intRes, TextRes.IntRes intRes2, TextRes.IntRes intRes3, long j, ResultScreenIdentifier resultScreenIdentifier) {
        DKResultFragment.Companion.getClass();
        DKResultFragment dKResultFragment = new DKResultFragment();
        dKResultFragment.setArguments(wwg.g(new Pair("ARG_RESULT_TYPE", new ResultType.Failure(null, false, false, textRes, intRes2, intRes, intRes3, null, j, null, resultScreenIdentifier, 647, null))));
        return dKResultFragment;
    }
}

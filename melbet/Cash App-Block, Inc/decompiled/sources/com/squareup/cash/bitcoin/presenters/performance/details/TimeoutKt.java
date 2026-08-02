package com.squareup.cash.bitcoin.presenters.performance.details;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import com.squareup.cash.blockers.presenters.SsnPresenter$models$2$2;
import com.squareup.cash.crypto.backend.performance.BitcoinPerformanceSummary;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes4.dex */
public abstract class TimeoutKt {
    public static final long STALE_TIMEOUT_DURATION;

    static {
        Duration.Companion companion = Duration.Companion;
        STALE_TIMEOUT_DURATION = DurationKt.toDuration(5, DurationUnit.SECONDS);
    }

    public static final MutableState produceStaleTimeoutState(BitcoinPerformanceSummary bitcoinPerformanceSummary, GapComposer gapComposer) {
        Boolean bool = Boolean.FALSE;
        boolean changedInstance = gapComposer.changedInstance(bitcoinPerformanceSummary);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new SsnPresenter$models$2$2(bitcoinPerformanceSummary, null, 3);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return Updater.produceState(bool, bitcoinPerformanceSummary, (Function2) rememberedValue, gapComposer, 6);
    }
}

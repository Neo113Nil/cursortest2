package com.squareup.cash.payments.backend.api;

import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$31$$inlined$map$1;
import com.squareup.cash.mosaic.resources.api.v2.ReleaseState;
import com.squareup.cash.music.presenters.MusicPresenter$models$3$1;
import com.squareup.cash.payments.presenters.RealPersonalizePaymentManager$markViewed$1;
import com.squareup.cash.profile.views.RingtoneView$playRingtone$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public interface PersonalizationRepository {
    Object cacheTopResources(ReleaseState releaseState, MusicPresenter$models$3$1 musicPresenter$models$3$1);

    MoneyTabPresenter$models$lambda$31$$inlined$map$1 loadBackgrounds(boolean z);

    Object loadCachedBackgrounds(RingtoneView$playRingtone$1 ringtoneView$playRingtone$1);

    Object loadCachedStickers(RingtoneView$playRingtone$1 ringtoneView$playRingtone$1);

    Flow loadPersonalizedTransaction(String str);

    MoneyTabPresenter$models$lambda$31$$inlined$map$1 loadStickers();

    Object markPaymentPersonalizationRead(String str, RealPersonalizePaymentManager$markViewed$1 realPersonalizePaymentManager$markViewed$1);

    Object refreshPersonalizationResources(ContinuationImpl continuationImpl);
}

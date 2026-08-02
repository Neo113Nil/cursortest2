package com.squareup.cash.offers.backend.real;

import com.google.android.gms.internal.mlkit_genai_prompt.zzmo;
import com.squareup.cash.boost.backend.RealBoostRepository;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.music.presenters.MusicPresenter$models$3$1;
import com.squareup.cash.treehouse.activity.OffersRepositoryService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.JobKt;
import okio.ByteString;

/* loaded from: classes.dex */
public final class RealOffersRepositoryService implements OffersRepositoryService {
    public final RealBoostRepository boostRepository;
    public final CoroutineContext ioDispatcher;
    public final RealOffersTabRepository offersTabRepository;

    public RealOffersRepositoryService(RealOffersTabRepository realOffersTabRepository, RealBoostRepository realBoostRepository, CoroutineContext coroutineContext) {
        this.offersTabRepository = realOffersTabRepository;
        this.boostRepository = realBoostRepository;
        this.ioDispatcher = coroutineContext;
    }

    @Override // com.squareup.cash.treehouse.activity.OffersRepositoryService
    public final Object getActiveOfferMerchantTokens(zzmo zzmoVar) {
        return JobKt.withContext(this.ioDispatcher, new MusicPresenter$models$3$1(this, null, 7), zzmoVar);
    }

    @Override // com.squareup.cash.treehouse.activity.OffersRepositoryService
    public final Object saveSheetPreload(ByteString byteString, Continuation continuation) {
        Object withContext = JobKt.withContext(this.ioDispatcher, new MusicPresenter$models$2$1(this, byteString, null, 27), continuation);
        return withContext == CoroutineSingletons.COROUTINE_SUSPENDED ? withContext : Unit.INSTANCE;
    }
}

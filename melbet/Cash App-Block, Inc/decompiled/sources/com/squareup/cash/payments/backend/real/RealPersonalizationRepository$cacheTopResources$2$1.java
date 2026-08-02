package com.squareup.cash.payments.backend.real;

import app.cash.local.db.LocalTabContentQueries;
import app.cash.zipline.loader.internal.cache.PinsQueries;
import com.squareup.cash.db.SessionQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.ExpressivePaymentsBackgroundConfigQueries$loadCacheableBackgrounds$2;
import com.squareup.cash.db2.ExpressivePaymentsStickerConfigQueries$loadCacheableStickers$2;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.LoadCacheableBackgrounds;
import com.squareup.cash.db2.LoadCacheableStickers;
import com.squareup.cash.mosaic.resources.api.v2.ReleaseState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealPersonalizationRepository$cacheTopResources$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ReleaseState $releaseState;
    public final /* synthetic */ RealPersonalizationRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealPersonalizationRepository$cacheTopResources$2$1(RealPersonalizationRepository realPersonalizationRepository, ReleaseState releaseState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realPersonalizationRepository;
        this.$releaseState = releaseState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        ReleaseState releaseState = this.$releaseState;
        RealPersonalizationRepository realPersonalizationRepository = this.this$0;
        switch (i) {
            case 0:
                return new RealPersonalizationRepository$cacheTopResources$2$1(realPersonalizationRepository, releaseState, continuation, 0);
            default:
                return new RealPersonalizationRepository$cacheTopResources$2$1(realPersonalizationRepository, releaseState, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealPersonalizationRepository$cacheTopResources$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        ReleaseState releaseState = this.$releaseState;
        RealPersonalizationRepository realPersonalizationRepository = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocalTabContentQueries localTabContentQueries = realPersonalizationRepository.backgroundQueries;
                localTabContentQueries.getClass();
                releaseState.getClass();
                ExpressivePaymentsBackgroundConfigQueries$loadCacheableBackgrounds$2 expressivePaymentsBackgroundConfigQueries$loadCacheableBackgrounds$2 = ExpressivePaymentsBackgroundConfigQueries$loadCacheableBackgrounds$2.INSTANCE;
                for (LoadCacheableBackgrounds loadCacheableBackgrounds : new PinsQueries.Get_pinQuery(localTabContentQueries, releaseState, new SessionQueries$$ExternalSyntheticLambda1(26, false)).executeAsList()) {
                    RealPersonalizationRepository.access$cacheImage(realPersonalizationRepository, loadCacheableBackgrounds.main_url);
                    RealPersonalizationRepository.access$cacheImage(realPersonalizationRepository, loadCacheableBackgrounds.preview_url);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                InstrumentQueries instrumentQueries = realPersonalizationRepository.stickerQueries;
                instrumentQueries.getClass();
                releaseState.getClass();
                ExpressivePaymentsStickerConfigQueries$loadCacheableStickers$2 expressivePaymentsStickerConfigQueries$loadCacheableStickers$2 = ExpressivePaymentsStickerConfigQueries$loadCacheableStickers$2.INSTANCE;
                for (LoadCacheableStickers loadCacheableStickers : new PinsQueries.Get_pinQuery(instrumentQueries, releaseState, new SessionQueries$$ExternalSyntheticLambda1(29, false)).executeAsList()) {
                    RealPersonalizationRepository.access$cacheImage(realPersonalizationRepository, loadCacheableStickers.main_url);
                    RealPersonalizationRepository.access$cacheImage(realPersonalizationRepository, loadCacheableStickers.preview_url);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

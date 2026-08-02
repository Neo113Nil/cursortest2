package com.squareup.cash.card.onboarding;

import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import com.squareup.cash.bitcoin.presenters.transfer.BitcoinTransferPresenter$special$$inlined$map$1$2;
import com.squareup.cash.card.onboarding.CardModelView$cardHeat$$inlined$map$1;
import com.squareup.cash.crypto.backend.value.RealCryptoValueRepo$special$$inlined$map$1$2;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$map$1;
import com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes6.dex */
public final class CardModelView$lighting$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 $this_unsafeTransform$inlined;

    public /* synthetic */ CardModelView$lighting$$inlined$map$1(RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = realBadger2$setup$lambda$0$$inlined$mapNotNull$1;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        int i2 = 6;
        int i3 = 4;
        RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = realBadger2$setup$lambda$0$$inlined$mapNotNull$1.collect(new CardModelView$cardHeat$$inlined$map$1.AnonymousClass2(flowCollector, 16), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = realBadger2$setup$lambda$0$$inlined$mapNotNull$1.collect(new BitcoinTransferPresenter$special$$inlined$map$1$2(flowCollector, 28), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object collect3 = realBadger2$setup$lambda$0$$inlined$mapNotNull$1.collect(new BitcoinTransferPresenter$special$$inlined$map$1$2(flowCollector, 29), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object collect4 = realBadger2$setup$lambda$0$$inlined$mapNotNull$1.collect(new CardModelView$cardHeat$$inlined$map$1.AnonymousClass2(flowCollector, i3), continuation);
                if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object collect5 = realBadger2$setup$lambda$0$$inlined$mapNotNull$1.collect(new CardModelView$cardHeat$$inlined$map$1.AnonymousClass2(flowCollector, 5), continuation);
                if (collect5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object collect6 = realBadger2$setup$lambda$0$$inlined$mapNotNull$1.collect(new CardModelView$cardHeat$$inlined$map$1.AnonymousClass2(flowCollector, i2), continuation);
                if (collect6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object collect7 = realBadger2$setup$lambda$0$$inlined$mapNotNull$1.collect(new CardModelView$cardHeat$$inlined$map$1.AnonymousClass2(flowCollector, 7), continuation);
                if (collect7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object collect8 = realBadger2$setup$lambda$0$$inlined$mapNotNull$1.collect(new CardModelView$cardHeat$$inlined$map$1.AnonymousClass2(flowCollector, 8), continuation);
                if (collect8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object collect9 = realBadger2$setup$lambda$0$$inlined$mapNotNull$1.collect(new CardModelView$cardHeat$$inlined$map$1.AnonymousClass2(flowCollector, 9), continuation);
                if (collect9 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object collect10 = realBadger2$setup$lambda$0$$inlined$mapNotNull$1.collect(new CardModelView$cardHeat$$inlined$map$1.AnonymousClass2(flowCollector, 10), continuation);
                if (collect10 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object collect11 = realBadger2$setup$lambda$0$$inlined$mapNotNull$1.collect(new CardModelView$cardHeat$$inlined$map$1.AnonymousClass2(flowCollector, 11), continuation);
                if (collect11 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object collect12 = realBadger2$setup$lambda$0$$inlined$mapNotNull$1.collect(new CardModelView$cardHeat$$inlined$map$1.AnonymousClass2(flowCollector, 12), continuation);
                if (collect12 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object collect13 = realBadger2$setup$lambda$0$$inlined$mapNotNull$1.collect(new RealCryptoValueRepo$special$$inlined$map$1$2(flowCollector, 15), continuation);
                if (collect13 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object collect14 = realBadger2$setup$lambda$0$$inlined$mapNotNull$1.collect(new RealCryptoValueRepo$special$$inlined$map$1$2(flowCollector, 21), continuation);
                if (collect14 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object collect15 = realBadger2$setup$lambda$0$$inlined$mapNotNull$1.collect(new RealGooglePayer$createWallet$$inlined$map$1.AnonymousClass2(flowCollector, i2), continuation);
                if (collect15 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect16 = realBadger2$setup$lambda$0$$inlined$mapNotNull$1.collect(new RealDrawerOpener$getDrawerScreen$$inlined$map$1.AnonymousClass2(flowCollector, i3), continuation);
                if (collect16 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

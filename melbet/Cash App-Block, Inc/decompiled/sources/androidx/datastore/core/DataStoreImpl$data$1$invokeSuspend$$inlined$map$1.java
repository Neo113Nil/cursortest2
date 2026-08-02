package androidx.datastore.core;

import androidx.compose.material.SwipeableState$special$$inlined$filter$1;
import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import app.cash.badging.backend.RealBadger2$scheduleBadgeClearingWork$$inlined$map$1;
import app.cash.local.store.real.RealLocalInstalledStore$hideBrands$$inlined$map$1;
import app.cash.local.store.real.RealLocalInstalledStore$showGeoTab$$inlined$map$1$2;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import com.squareup.cash.activity.presenters.ActivityTabPresenter$special$$inlined$map$1;
import com.squareup.cash.amountslider.AmountPickerCondensedView$events$$inlined$map$1$2;
import com.squareup.cash.banking.real.RealDisclosureProvider$special$$inlined$map$1;
import com.squareup.cash.bitcoin.presenters.BitcoinDepositsPresenter$special$$inlined$filter$1;
import com.squareup.cash.bitcoin.presenters.transfer.BitcoinTransferPresenter$special$$inlined$map$1$2;
import com.squareup.cash.borrow.backend.BorrowDataReadUtilsKt$allEntryPoints$$inlined$map$1;
import com.squareup.cash.borrow.backend.BorrowDataReadUtilsKt$hasBorrowData$$inlined$map$1$2;
import com.squareup.cash.card.onboarding.CardModelView$cardHeat$$inlined$map$1;
import com.squareup.cash.card.onboarding.CardModelView$iconTexture$$inlined$map$1;
import com.squareup.cash.crypto.backend.value.RealCryptoValueRepo$special$$inlined$map$1$2;
import com.squareup.cash.data.db.RealAppConfigManager$cashLiteConfig$$inlined$map$1;
import com.squareup.cash.data.transfers.RealTransferManager$addCash$$inlined$map$1;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$filter$1;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$17$$inlined$map$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.ReadonlyStateFlow;

/* loaded from: classes3.dex */
public final class DataStoreImpl$data$1$invokeSuspend$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Flow $this_unsafeTransform$inlined;

    public /* synthetic */ DataStoreImpl$data$1$invokeSuspend$$inlined$map$1(Flow flow, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        int i2 = 17;
        int i3 = 21;
        int i4 = 2;
        int i5 = 22;
        int i6 = 6;
        int i7 = 19;
        int i8 = 1;
        Flow flow = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = ((FlowKt__MergeKt$flatMapConcat$$inlined$map$1) flow).collect(new SwipeableState$special$$inlined$filter$1.AnonymousClass2(flowCollector, i4), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = ((RealLocalInstalledStore$hideBrands$$inlined$map$1) flow).collect(new SwipeableState$special$$inlined$filter$1.AnonymousClass2(flowCollector, i2), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object collect3 = ((RealLocalInstalledStore$hideBrands$$inlined$map$1) flow).collect(new SwipeableState$special$$inlined$filter$1.AnonymousClass2(flowCollector, i7), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object collect4 = ((RealLocalInstalledStore$hideBrands$$inlined$map$1) flow).collect(new SwipeableState$special$$inlined$filter$1.AnonymousClass2(flowCollector, i3), continuation);
                if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object collect5 = ((RealLocalInstalledStore$hideBrands$$inlined$map$1) flow).collect(new SwipeableState$special$$inlined$filter$1.AnonymousClass2(flowCollector, i5), continuation);
                if (collect5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object collect6 = ((RealLocalInstalledStore$hideBrands$$inlined$map$1) flow).collect(new RealLocalInstalledStore$showGeoTab$$inlined$map$1$2(flowCollector, i7), continuation);
                if (collect6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object collect7 = ((BitcoinDepositsPresenter$special$$inlined$filter$1) flow).collect(new RealLocalInstalledStore$showGeoTab$$inlined$map$1$2(flowCollector, 26), continuation);
                if (collect7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object collect8 = ((BitcoinDepositsPresenter$special$$inlined$filter$1) flow).collect(new RealLocalInstalledStore$showGeoTab$$inlined$map$1$2(flowCollector, 28), continuation);
                if (collect8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object collect9 = ((BitcoinDepositsPresenter$special$$inlined$filter$1) flow).collect(new AmountPickerCondensedView$events$$inlined$map$1$2(flowCollector, i8), continuation);
                if (collect9 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object collect10 = ((ActivityTabPresenter$special$$inlined$map$1) flow).collect(new AmountPickerCondensedView$events$$inlined$map$1$2(flowCollector, 3), continuation);
                if (collect10 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object collect11 = ((BitcoinDepositsPresenter$special$$inlined$filter$1) flow).collect(new AmountPickerCondensedView$events$$inlined$map$1$2(flowCollector, i6), continuation);
                if (collect11 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object collect12 = ((RealBadger2$scheduleBadgeClearingWork$$inlined$map$1) flow).collect(new AmountPickerCondensedView$events$$inlined$map$1$2(flowCollector, i2), continuation);
                if (collect12 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object collect13 = ((BitcoinDepositsPresenter$special$$inlined$filter$1) flow).collect(new AmountPickerCondensedView$events$$inlined$map$1$2(flowCollector, i3), continuation);
                if (collect13 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object collect14 = ((RealBadger2$scheduleBadgeClearingWork$$inlined$map$1) flow).collect(new AmountPickerCondensedView$events$$inlined$map$1$2(flowCollector, 24), continuation);
                if (collect14 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object collect15 = ((MoneyTabPresenter$models$lambda$17$$inlined$map$1) flow).collect(new RealDisclosureProvider$special$$inlined$map$1.AnonymousClass2(flowCollector, i8), continuation);
                if (collect15 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object collect16 = ((SwipeableState$special$$inlined$filter$1) flow).collect(new RealDisclosureProvider$special$$inlined$map$1.AnonymousClass2(flowCollector, 5), continuation);
                if (collect16 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object collect17 = ((BitcoinDepositsPresenter$special$$inlined$filter$1) flow).collect(new RealDisclosureProvider$special$$inlined$map$1.AnonymousClass2(flowCollector, 15), continuation);
                if (collect17 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object collect18 = ((BitcoinDepositsPresenter$special$$inlined$filter$1) flow).collect(new BitcoinTransferPresenter$special$$inlined$map$1$2(flowCollector, i4), continuation);
                if (collect18 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object collect19 = ((CardModelView$iconTexture$$inlined$map$1) flow).collect(new BitcoinTransferPresenter$special$$inlined$map$1$2(flowCollector, 7), continuation);
                if (collect19 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object collect20 = ((CardModelView$cardHeat$$inlined$map$1) flow).collect(new BitcoinTransferPresenter$special$$inlined$map$1$2(flowCollector, 16), continuation);
                if (collect20 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object collect21 = ((RealTransferManager$addCash$$inlined$map$1) flow).collect(new BitcoinTransferPresenter$special$$inlined$map$1$2(flowCollector, i5), continuation);
                if (collect21 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object collect22 = ((BorrowDataReadUtilsKt$allEntryPoints$$inlined$map$1) flow).collect(new BorrowDataReadUtilsKt$hasBorrowData$$inlined$map$1$2(flowCollector, i6), continuation);
                if (collect22 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object collect23 = ((AppLockMonitor$special$$inlined$map$2) flow).collect(new BorrowDataReadUtilsKt$hasBorrowData$$inlined$map$1$2(flowCollector, 29), continuation);
                if (collect23 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object collect24 = ((RealAppConfigManager$cashLiteConfig$$inlined$map$1) flow).collect(new RealCryptoValueRepo$special$$inlined$map$1$2(flowCollector, i8), continuation);
                if (collect24 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object collect25 = ((CardModelView$iconTexture$$inlined$map$1) flow).collect(new RealCryptoValueRepo$special$$inlined$map$1$2(flowCollector, 9), continuation);
                if (collect25 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object collect26 = ((RealGooglePayer$createWallet$$inlined$filter$1) flow).collect(new RealCryptoValueRepo$special$$inlined$map$1$2(flowCollector, 10), continuation);
                if (collect26 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object collect27 = ((CardModelView$cardHeat$$inlined$map$1) flow).collect(new RealCryptoValueRepo$special$$inlined$map$1$2(flowCollector, i7), continuation);
                if (collect27 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object collect28 = ((RealGooglePayer$createWallet$$inlined$filter$1) flow).collect(new RealCryptoValueRepo$special$$inlined$map$1$2(flowCollector, 25), continuation);
                if (collect28 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object collect29 = ((FlowUtil$createFlow$$inlined$map$1) flow).collect(new RealAppConfigManager$cashLiteConfig$$inlined$map$1.AnonymousClass2(flowCollector, i8), continuation);
                if (collect29 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect30 = ((ReadonlyStateFlow) flow).$$delegate_0.collect(new RealAppConfigManager$cashLiteConfig$$inlined$map$1.AnonymousClass2(flowCollector, 12), continuation);
                if (collect30 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

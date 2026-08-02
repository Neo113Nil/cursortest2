package androidx.compose.foundation.gestures;

import androidx.compose.ui.text.android.CanvasCompatO;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.backend.real.BuyerIntentSyncManager;
import app.cash.local.primitives.FulfillmentConfiguration;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.appmessages.overlay.RealOverlayAppMessageReader;
import com.squareup.cash.crypto.backend.balance.CryptoBalance$BitcoinBalance;
import com.squareup.cash.crypto.backend.balance.RestrictedBalance;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.payments.backend.api.P2pSettingsManager$P2pSettings;
import com.squareup.cash.wallet.data.CashAppTag;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import papa.SafeTrace;
import squareup.cash.paychecks.UiState;

/* loaded from: classes3.dex */
public final class AnchoredDraggableKt$snapTo$2 extends SuspendLambda implements Function4 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$snapTo$2() {
        super(4, null);
        this.$r8$classId = 3;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 4;
        switch (this.$r8$classId) {
            case 0:
                AnchoredDraggableKt$snapTo$2 anchoredDraggableKt$snapTo$2 = new AnchoredDraggableKt$snapTo$2(i, (Continuation) obj4, 0);
                anchoredDraggableKt$snapTo$2.L$0 = (AnchoredDraggableState$anchoredDragScope$1) obj;
                anchoredDraggableKt$snapTo$2.L$1 = (DefaultDraggableAnchors) obj2;
                anchoredDraggableKt$snapTo$2.L$2 = obj3;
                return anchoredDraggableKt$snapTo$2.invokeSuspend(Unit.INSTANCE);
            case 1:
                AnchoredDraggableKt$snapTo$2 anchoredDraggableKt$snapTo$22 = new AnchoredDraggableKt$snapTo$2(i, (Continuation) obj4, 1);
                anchoredDraggableKt$snapTo$22.L$0 = (List) obj;
                anchoredDraggableKt$snapTo$22.L$1 = (List) obj2;
                anchoredDraggableKt$snapTo$22.L$2 = (FulfillmentConfiguration) obj3;
                return anchoredDraggableKt$snapTo$22.invokeSuspend(Unit.INSTANCE);
            case 2:
                AnchoredDraggableKt$snapTo$2 anchoredDraggableKt$snapTo$23 = new AnchoredDraggableKt$snapTo$2(i, (Continuation) obj4, 2);
                anchoredDraggableKt$snapTo$23.L$0 = (RealOverlayAppMessageReader.MessageSearchResult) obj;
                anchoredDraggableKt$snapTo$23.L$1 = (RealOverlayAppMessageReader.MessageSearchResult) obj2;
                anchoredDraggableKt$snapTo$23.L$2 = (RealOverlayAppMessageReader.MessageSearchResult) obj3;
                return anchoredDraggableKt$snapTo$23.invokeSuspend(Unit.INSTANCE);
            case 3:
                AnchoredDraggableKt$snapTo$2 anchoredDraggableKt$snapTo$24 = new AnchoredDraggableKt$snapTo$2(i, (Continuation) obj4, 3);
                anchoredDraggableKt$snapTo$24.L$0 = (Money) obj;
                anchoredDraggableKt$snapTo$24.L$1 = (Money) obj2;
                anchoredDraggableKt$snapTo$24.L$2 = (RestrictedBalance) obj3;
                return anchoredDraggableKt$snapTo$24.invokeSuspend(Unit.INSTANCE);
            case 4:
                AnchoredDraggableKt$snapTo$2 anchoredDraggableKt$snapTo$25 = new AnchoredDraggableKt$snapTo$2(i, (Continuation) obj4, i);
                anchoredDraggableKt$snapTo$25.L$0 = (P2pSettingsManager$P2pSettings) obj;
                anchoredDraggableKt$snapTo$25.L$1 = (FamilyProfile) obj2;
                anchoredDraggableKt$snapTo$25.L$2 = (UiState) obj3;
                return anchoredDraggableKt$snapTo$25.invokeSuspend(Unit.INSTANCE);
            case 5:
                AnchoredDraggableKt$snapTo$2 anchoredDraggableKt$snapTo$26 = new AnchoredDraggableKt$snapTo$2(i, (Continuation) obj4, 5);
                anchoredDraggableKt$snapTo$26.L$0 = (BalanceSnapshot) obj;
                anchoredDraggableKt$snapTo$26.L$1 = (CryptoBalance$BitcoinBalance) obj2;
                anchoredDraggableKt$snapTo$26.L$2 = (List) obj3;
                return anchoredDraggableKt$snapTo$26.invokeSuspend(Unit.INSTANCE);
            default:
                AnchoredDraggableKt$snapTo$2 anchoredDraggableKt$snapTo$27 = new AnchoredDraggableKt$snapTo$2(i, (Continuation) obj4, 6);
                anchoredDraggableKt$snapTo$27.L$0 = (List) obj;
                anchoredDraggableKt$snapTo$27.L$1 = (Boolean) obj2;
                anchoredDraggableKt$snapTo$27.L$2 = (Set) obj3;
                return anchoredDraggableKt$snapTo$27.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Money money;
        Long l;
        Long l2;
        boolean z = false;
        switch (this.$r8$classId) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1 = (AnchoredDraggableState$anchoredDragScope$1) this.L$0;
                float positionOf = ((DefaultDraggableAnchors) this.L$1).positionOf(this.L$2);
                if (!Float.isNaN(positionOf)) {
                    anchoredDraggableState$anchoredDragScope$1.dragTo(positionOf, RecyclerView.DECELERATION_RATE);
                }
                return Unit.INSTANCE;
            case 1:
                List list = (List) this.L$0;
                List list2 = (List) this.L$1;
                FulfillmentConfiguration fulfillmentConfiguration = (FulfillmentConfiguration) this.L$2;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (fulfillmentConfiguration != null) {
                    return new BuyerIntentSyncManager.Combination(list, list2, fulfillmentConfiguration);
                }
                return null;
            case 2:
                RealOverlayAppMessageReader.MessageSearchResult messageSearchResult = (RealOverlayAppMessageReader.MessageSearchResult) this.L$0;
                RealOverlayAppMessageReader.MessageSearchResult messageSearchResult2 = (RealOverlayAppMessageReader.MessageSearchResult) this.L$1;
                RealOverlayAppMessageReader.MessageSearchResult messageSearchResult3 = (RealOverlayAppMessageReader.MessageSearchResult) this.L$2;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (messageSearchResult == null && messageSearchResult2 == null) {
                    return messageSearchResult3;
                }
                if (messageSearchResult == null && messageSearchResult3 == null) {
                    return messageSearchResult2;
                }
                if (messageSearchResult2 == null && messageSearchResult3 == null) {
                    return messageSearchResult;
                }
                List filterNotNull = ArraysKt___ArraysKt.filterNotNull(new RealOverlayAppMessageReader.MessageSearchResult[]{messageSearchResult, messageSearchResult2, messageSearchResult3});
                if (!filterNotNull.isEmpty()) {
                    Iterator it = filterNotNull.iterator();
                    while (it.hasNext()) {
                        if (((RealOverlayAppMessageReader.MessageSearchResult) it.next()).priority != ((RealOverlayAppMessageReader.MessageSearchResult) ((ArrayList) filterNotNull).get(0)).priority) {
                            Iterator it2 = filterNotNull.iterator();
                            if (!it2.hasNext()) {
                                a$$ExternalSyntheticBUOutline0.m();
                                return null;
                            }
                            int i = ((RealOverlayAppMessageReader.MessageSearchResult) it2.next()).priority;
                            while (it2.hasNext()) {
                                int i2 = ((RealOverlayAppMessageReader.MessageSearchResult) it2.next()).priority;
                                if (i < i2) {
                                    i = i2;
                                }
                            }
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : filterNotNull) {
                                if (((RealOverlayAppMessageReader.MessageSearchResult) obj2).priority == i) {
                                    arrayList.add(obj2);
                                }
                            }
                            Iterator it3 = arrayList.iterator();
                            if (!it3.hasNext()) {
                                a$$ExternalSyntheticBUOutline0.m();
                                return null;
                            }
                            Object next = it3.next();
                            if (!it3.hasNext()) {
                                return next;
                            }
                            Instant instant = ((RealOverlayAppMessageReader.MessageSearchResult) next).insertedAtUtc;
                            do {
                                Object next2 = it3.next();
                                Instant instant2 = ((RealOverlayAppMessageReader.MessageSearchResult) next2).insertedAtUtc;
                                if (instant.compareTo(instant2) > 0) {
                                    next = next2;
                                    instant = instant2;
                                }
                            } while (it3.hasNext());
                            return next;
                        }
                    }
                }
                Iterator it4 = filterNotNull.iterator();
                if (!it4.hasNext()) {
                    a$$ExternalSyntheticBUOutline0.m();
                    return null;
                }
                Object next3 = it4.next();
                if (!it4.hasNext()) {
                    return next3;
                }
                Instant instant3 = ((RealOverlayAppMessageReader.MessageSearchResult) next3).insertedAtUtc;
                do {
                    Object next4 = it4.next();
                    Instant instant4 = ((RealOverlayAppMessageReader.MessageSearchResult) next4).insertedAtUtc;
                    if (instant3.compareTo(instant4) > 0) {
                        next3 = next4;
                        instant3 = instant4;
                    }
                } while (it4.hasNext());
                return next3;
            case 3:
                Money money2 = (Money) this.L$0;
                Money money3 = (Money) this.L$1;
                RestrictedBalance restrictedBalance = (RestrictedBalance) this.L$2;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Long l3 = money2.amount;
                long longValue = l3 != null ? l3.longValue() : 0L;
                return new Money(new Long(Math.min(longValue, Math.max(0L, (((restrictedBalance == null || (money = restrictedBalance.amount) == null || (l = money.amount) == null) ? 0L : l.longValue()) + longValue) - ((money3 == null || (l2 = money3.amount) == null) ? 0L : l2.longValue())))), CurrencyCode.USD, 4);
            case 4:
                P2pSettingsManager$P2pSettings p2pSettingsManager$P2pSettings = (P2pSettingsManager$P2pSettings) this.L$0;
                FamilyProfile familyProfile = (FamilyProfile) this.L$1;
                UiState uiState = (UiState) this.L$2;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!(p2pSettingsManager$P2pSettings != null ? CanvasCompatO.isRatePlanBusiness(p2pSettingsManager$P2pSettings) : false) && !(familyProfile instanceof FamilyProfile.ManagedAccount)) {
                    if (!(uiState != null ? Intrinsics.areEqual(uiState.customer_is_denylisted, Boolean.TRUE) : false)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 5:
                BalanceSnapshot balanceSnapshot = (BalanceSnapshot) this.L$0;
                CryptoBalance$BitcoinBalance cryptoBalance$BitcoinBalance = (CryptoBalance$BitcoinBalance) this.L$1;
                List list3 = (List) this.L$2;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ArrayList arrayList2 = new ArrayList();
                if (balanceSnapshot != null) {
                    arrayList2.add(balanceSnapshot.token);
                }
                if (cryptoBalance$BitcoinBalance != null) {
                    arrayList2.add(cryptoBalance$BitcoinBalance.instrumentToken);
                }
                Iterator it5 = list3.iterator();
                while (it5.hasNext()) {
                    arrayList2.add(((Instrument) it5.next()).token);
                }
                return arrayList2;
            default:
                List<CashAppTag> list4 = (List) this.L$0;
                Boolean bool = (Boolean) this.L$1;
                Set set = (Set) this.L$2;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ArrayList arrayList3 = new ArrayList();
                for (CashAppTag cashAppTag : list4) {
                    String str = cashAppTag.deviceId;
                    Pair pair = str != null ? new Pair(str, cashAppTag.isLocked) : null;
                    if (pair != null) {
                        arrayList3.add(pair);
                    }
                }
                return new Triple(MapsKt__MapsKt.toMap(arrayList3), bool, set);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnchoredDraggableKt$snapTo$2(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.$r8$classId = i2;
    }
}

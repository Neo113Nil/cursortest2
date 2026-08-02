package app.cash.local.backend;

import app.cash.badging.api.Badger2;
import app.cash.badging.backend.RealBadger2;
import app.cash.local.backend.real.RealMarketingMessageRepository;
import app.cash.local.primitives.MarketingMessageBadging;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class RefreshMarketingMessages {
    public final Badger2 badger2;
    public final RealMarketingMessageRepository repository;

    public RefreshMarketingMessages(RealMarketingMessageRepository realMarketingMessageRepository, Badger2 badger2) {
        this.repository = realMarketingMessageRepository;
        this.badger2 = badger2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0094, code lost:
    
        if (r5 != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0067, code lost:
    
        if (r11 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(ContinuationImpl continuationImpl) {
        RefreshMarketingMessages$invoke$1 refreshMarketingMessages$invoke$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object refresh;
        List list;
        boolean booleanValue;
        Object first;
        boolean z;
        if (continuationImpl instanceof RefreshMarketingMessages$invoke$1) {
            refreshMarketingMessages$invoke$1 = (RefreshMarketingMessages$invoke$1) continuationImpl;
            int i2 = refreshMarketingMessages$invoke$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                refreshMarketingMessages$invoke$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = refreshMarketingMessages$invoke$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = refreshMarketingMessages$invoke$1.label;
                RealMarketingMessageRepository realMarketingMessageRepository = this.repository;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 marketingMessages = realMarketingMessageRepository.getMarketingMessages();
                    refreshMarketingMessages$invoke$1.label = 1;
                    obj = FlowKt.first(marketingMessages, refreshMarketingMessages$invoke$1);
                } else if (i == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            z = refreshMarketingMessages$invoke$1.Z$0;
                            List list2 = refreshMarketingMessages$invoke$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                            booleanValue = z;
                            return Boolean.valueOf(booleanValue);
                        }
                        boolean z2 = refreshMarketingMessages$invoke$1.Z$0;
                        List list3 = refreshMarketingMessages$invoke$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        first = obj;
                        booleanValue = z2;
                        list = list3;
                        List list4 = (List) first;
                        if (booleanValue && list != null && !RefreshMarketingMessagesKt.access$unreadMessageTokens(list).equals(RefreshMarketingMessagesKt.access$unreadMessageTokens(list4))) {
                            ArrayList arrayList = MarketingMessageBadging.GROUP_NAMES;
                            refreshMarketingMessages$invoke$1.L$0 = null;
                            refreshMarketingMessages$invoke$1.Z$0 = booleanValue;
                            refreshMarketingMessages$invoke$1.label = 4;
                            if (((RealBadger2) this.badger2).refreshCounts(arrayList, refreshMarketingMessages$invoke$1) != coroutineSingletons) {
                                z = booleanValue;
                                booleanValue = z;
                            }
                            return coroutineSingletons;
                        }
                        return Boolean.valueOf(booleanValue);
                    }
                    list = refreshMarketingMessages$invoke$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    booleanValue = ((Boolean) obj).booleanValue();
                    FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 marketingMessages2 = realMarketingMessageRepository.getMarketingMessages();
                    refreshMarketingMessages$invoke$1.L$0 = list;
                    refreshMarketingMessages$invoke$1.Z$0 = booleanValue;
                    refreshMarketingMessages$invoke$1.label = 3;
                    first = FlowKt.first(marketingMessages2, refreshMarketingMessages$invoke$1);
                }
                List list5 = (List) obj;
                refreshMarketingMessages$invoke$1.L$0 = list5;
                refreshMarketingMessages$invoke$1.label = 2;
                refresh = realMarketingMessageRepository.refresh(refreshMarketingMessages$invoke$1);
                if (refresh != coroutineSingletons) {
                    list = list5;
                    obj = refresh;
                    booleanValue = ((Boolean) obj).booleanValue();
                    FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 marketingMessages22 = realMarketingMessageRepository.getMarketingMessages();
                    refreshMarketingMessages$invoke$1.L$0 = list;
                    refreshMarketingMessages$invoke$1.Z$0 = booleanValue;
                    refreshMarketingMessages$invoke$1.label = 3;
                    first = FlowKt.first(marketingMessages22, refreshMarketingMessages$invoke$1);
                }
                return coroutineSingletons;
            }
        }
        refreshMarketingMessages$invoke$1 = new RefreshMarketingMessages$invoke$1(this, continuationImpl);
        Object obj2 = refreshMarketingMessages$invoke$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = refreshMarketingMessages$invoke$1.label;
        RealMarketingMessageRepository realMarketingMessageRepository2 = this.repository;
        if (i != 0) {
        }
        List list52 = (List) obj2;
        refreshMarketingMessages$invoke$1.L$0 = list52;
        refreshMarketingMessages$invoke$1.label = 2;
        refresh = realMarketingMessageRepository2.refresh(refreshMarketingMessages$invoke$1);
        if (refresh != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}

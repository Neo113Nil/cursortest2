package com.squareup.cash.payments.presenters;

import android.content.Context;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientsync.models.SyncTrigger;
import com.squareup.cash.clientsync.pipeline.SyncScope;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.payments.backend.api.PersonalizationRepository;
import com.squareup.cash.recipients.data.RealRecipientRepository;
import com.squareup.preferences.KeyValue;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealPersonalizePaymentManager {
    public final KeyValue animationCounter;
    public final RealClientSyncer clientSyncer;
    public final Context context;
    public final PersonalizationRepository personalizationRepository;
    public final RealRecipientRepository recipientRepository;
    public final KeyValue showTooltip;

    public RealPersonalizePaymentManager(KeyValue keyValue, KeyValue keyValue2, PersonalizationRepository personalizationRepository, RealRecipientRepository realRecipientRepository, RealClientSyncer realClientSyncer, Context context) {
        this.showTooltip = keyValue;
        this.animationCounter = keyValue2;
        this.personalizationRepository = personalizationRepository;
        this.recipientRepository = realRecipientRepository;
        this.clientSyncer = realClientSyncer;
        this.context = context;
    }

    public final int getAnimationCounter(PersonalizePaymentManager$PaymentFlow personalizePaymentManager$PaymentFlow) {
        Integer num = (Integer) ((Map) this.animationCounter.blockingGet()).get(personalizePaymentManager$PaymentFlow.name());
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final void markPersonalizePaymentTooltipAsSeen(PersonalizePaymentManager$PaymentFlow personalizePaymentManager$PaymentFlow) {
        KeyValue keyValue = this.showTooltip;
        Object obj = ((Map) keyValue.blockingGet()).get(personalizePaymentManager$PaymentFlow.name());
        Boolean bool = Boolean.FALSE;
        if (Intrinsics.areEqual(obj, bool)) {
            return;
        }
        LinkedHashMap mutableMap = MapsKt__MapsKt.toMutableMap((Map) keyValue.blockingGet());
        mutableMap.put(personalizePaymentManager$PaymentFlow.name(), bool);
        keyValue.blockingSet(mutableMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object markViewed(String str, ContinuationImpl continuationImpl) {
        RealPersonalizePaymentManager$markViewed$1 realPersonalizePaymentManager$markViewed$1;
        int i;
        if (continuationImpl instanceof RealPersonalizePaymentManager$markViewed$1) {
            realPersonalizePaymentManager$markViewed$1 = (RealPersonalizePaymentManager$markViewed$1) continuationImpl;
            int i2 = realPersonalizePaymentManager$markViewed$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPersonalizePaymentManager$markViewed$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realPersonalizePaymentManager$markViewed$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPersonalizePaymentManager$markViewed$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realPersonalizePaymentManager$markViewed$1.label = 1;
                    if (this.personalizationRepository.markPaymentPersonalizationRead(str, realPersonalizePaymentManager$markViewed$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                this.clientSyncer.sync(SyncTrigger.BLOCKING_USER_ACTION, SyncScope.Global.INSTANCE);
                return Unit.INSTANCE;
            }
        }
        realPersonalizePaymentManager$markViewed$1 = new RealPersonalizePaymentManager$markViewed$1(this, continuationImpl);
        Object obj2 = realPersonalizePaymentManager$markViewed$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPersonalizePaymentManager$markViewed$1.label;
        if (i != 0) {
        }
        this.clientSyncer.sync(SyncTrigger.BLOCKING_USER_ACTION, SyncScope.Global.INSTANCE);
        return Unit.INSTANCE;
    }

    public final void updatePersonalizePaymentButtonAnimationTracker(PersonalizePaymentManager$PaymentFlow personalizePaymentManager$PaymentFlow) {
        KeyValue keyValue = this.animationCounter;
        LinkedHashMap mutableMap = MapsKt__MapsKt.toMutableMap((Map) keyValue.blockingGet());
        String name = personalizePaymentManager$PaymentFlow.name();
        Integer num = (Integer) mutableMap.get(personalizePaymentManager$PaymentFlow.name());
        mutableMap.put(name, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
        keyValue.blockingSet(mutableMap);
    }
}

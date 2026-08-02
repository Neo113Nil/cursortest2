package com.squareup.cash.bitcoin.presenters.map;

import com.squareup.cash.bitcoin.viewmodels.applet.widget.BitcoinWidget;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class RealBitcoinMapEligibilityManager$isEligible$1 extends SuspendLambda implements Function4 {
    public final /* synthetic */ boolean $mapEnabledForNY;
    public /* synthetic */ Set L$0;
    public /* synthetic */ boolean Z$0;
    public /* synthetic */ boolean Z$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBitcoinMapEligibilityManager$isEligible$1(boolean z, Continuation continuation) {
        super(4, continuation);
        this.$mapEnabledForNY = z;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        RealBitcoinMapEligibilityManager$isEligible$1 realBitcoinMapEligibilityManager$isEligible$1 = new RealBitcoinMapEligibilityManager$isEligible$1(this.$mapEnabledForNY, (Continuation) obj4);
        realBitcoinMapEligibilityManager$isEligible$1.Z$0 = booleanValue;
        realBitcoinMapEligibilityManager$isEligible$1.Z$1 = booleanValue2;
        realBitcoinMapEligibilityManager$isEligible$1.L$0 = (Set) obj3;
        return realBitcoinMapEligibilityManager$isEligible$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        Set set = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        if (!set.contains(BitcoinWidget.BITCOIN_MAP_CARD) || z) {
            z2 = false;
        } else if (this.$mapEnabledForNY) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }
}

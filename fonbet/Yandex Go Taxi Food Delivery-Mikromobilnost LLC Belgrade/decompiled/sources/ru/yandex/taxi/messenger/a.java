package ru.yandex.taxi.messenger;

import defpackage.h120;
import defpackage.i120;
import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class a {
    public final i120 a;

    public a(i120 i120Var) {
        this.a = i120Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        MessengerAvailabilityProviderImpl$isAvailableSuspend$1 messengerAvailabilityProviderImpl$isAvailableSuspend$1;
        int i;
        if (continuationImpl instanceof MessengerAvailabilityProviderImpl$isAvailableSuspend$1) {
            messengerAvailabilityProviderImpl$isAvailableSuspend$1 = (MessengerAvailabilityProviderImpl$isAvailableSuspend$1) continuationImpl;
            int i2 = messengerAvailabilityProviderImpl$isAvailableSuspend$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                messengerAvailabilityProviderImpl$isAvailableSuspend$1.label = i2 - Integer.MIN_VALUE;
                Object obj = messengerAvailabilityProviderImpl$isAvailableSuspend$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = messengerAvailabilityProviderImpl$isAvailableSuspend$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    messengerAvailabilityProviderImpl$isAvailableSuspend$1.label = 1;
                    obj = this.a.a.b(messengerAvailabilityProviderImpl$isAvailableSuspend$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return Boolean.valueOf(((h120) obj).b);
            }
        }
        messengerAvailabilityProviderImpl$isAvailableSuspend$1 = new MessengerAvailabilityProviderImpl$isAvailableSuspend$1(this, continuationImpl);
        Object obj2 = messengerAvailabilityProviderImpl$isAvailableSuspend$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = messengerAvailabilityProviderImpl$isAvailableSuspend$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((h120) obj2).b);
    }
}

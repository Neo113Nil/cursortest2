package com.squareup.cash.account.components;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.account.settings.viewmodels.AccountViewEvent;
import com.squareup.cash.qrcodes.viewmodels.QrCodeProfileViewEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class AccountUiViewKt$QrCode$1$1$1$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $backgroundColor;
    public final /* synthetic */ int $imageSize;
    public final /* synthetic */ int $logoColor;
    public final /* synthetic */ Function1 $onEvent;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccountUiViewKt$QrCode$1$1$1$1$1(Function1 function1, int i, int i2, int i3, Continuation continuation, int i4) {
        super(2, continuation);
        this.$r8$classId = i4;
        this.$onEvent = function1;
        this.$backgroundColor = i;
        this.$logoColor = i2;
        this.$imageSize = i3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new AccountUiViewKt$QrCode$1$1$1$1$1(this.$onEvent, this.$backgroundColor, this.$logoColor, this.$imageSize, continuation, 0);
            case 1:
                return new AccountUiViewKt$QrCode$1$1$1$1$1(this.$onEvent, this.$backgroundColor, this.$logoColor, this.$imageSize, continuation, 1);
            default:
                return new AccountUiViewKt$QrCode$1$1$1$1$1(this.$onEvent, this.$backgroundColor, this.$logoColor, this.$imageSize, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((AccountUiViewKt$QrCode$1$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        int i2 = this.$imageSize;
        int i3 = this.$logoColor;
        int i4 = this.$backgroundColor;
        Function1 function1 = this.$onEvent;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(new AccountViewEvent.QrCodeBoxMeasured(i4, i3, i2));
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                final Integer num = new Integer(i4);
                final Integer num2 = new Integer(i3);
                final Integer num3 = new Integer(i2);
                function1.invoke(new Object(num, num2, num3) { // from class: com.squareup.cash.family.familyhub.viewmodels.ManagedAccountLoginQrCodeProviderViewEvent$Loaded
                    public final Integer backgroundColor;
                    public final Integer logoColor;
                    public final Integer size;

                    {
                        this.backgroundColor = num;
                        this.logoColor = num2;
                        this.size = num3;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        if (!(obj2 instanceof ManagedAccountLoginQrCodeProviderViewEvent$Loaded)) {
                            return false;
                        }
                        ManagedAccountLoginQrCodeProviderViewEvent$Loaded managedAccountLoginQrCodeProviderViewEvent$Loaded = (ManagedAccountLoginQrCodeProviderViewEvent$Loaded) obj2;
                        return this.backgroundColor.equals(managedAccountLoginQrCodeProviderViewEvent$Loaded.backgroundColor) && this.logoColor.equals(managedAccountLoginQrCodeProviderViewEvent$Loaded.logoColor) && this.size.equals(managedAccountLoginQrCodeProviderViewEvent$Loaded.size);
                    }

                    public final int hashCode() {
                        return this.size.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.backgroundColor.hashCode() * 31, 31, this.logoColor);
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("Loaded(backgroundColor=");
                        sb.append(this.backgroundColor);
                        sb.append(", logoColor=");
                        sb.append(this.logoColor);
                        sb.append(", size=");
                        return NavAction$$ExternalSyntheticOutline0.m(sb, this.size, ")");
                    }
                });
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(new QrCodeProfileViewEvent.Loaded(new Integer(i4), new Integer(i3), new Integer(i2)));
                break;
        }
        return Unit.INSTANCE;
    }
}

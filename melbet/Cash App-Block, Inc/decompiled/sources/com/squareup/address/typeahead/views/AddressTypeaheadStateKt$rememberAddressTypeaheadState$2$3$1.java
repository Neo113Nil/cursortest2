package com.squareup.address.typeahead.views;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.address.typeahead.backend.real.PlacesAddressSearcher;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class AddressTypeaheadStateKt$rememberAddressTypeaheadState$2$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ AddressTypeaheadState $it;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PlacesAddressSearcher $searcher;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddressTypeaheadStateKt$rememberAddressTypeaheadState$2$3$1(AddressTypeaheadState addressTypeaheadState, PlacesAddressSearcher placesAddressSearcher, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$it = addressTypeaheadState;
        this.$searcher = placesAddressSearcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        PlacesAddressSearcher placesAddressSearcher = this.$searcher;
        AddressTypeaheadState addressTypeaheadState = this.$it;
        switch (i) {
            case 0:
                return new AddressTypeaheadStateKt$rememberAddressTypeaheadState$2$3$1(addressTypeaheadState, placesAddressSearcher, continuation, 0);
            default:
                return new AddressTypeaheadStateKt$rememberAddressTypeaheadState$2$3$1(addressTypeaheadState, placesAddressSearcher, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((AddressTypeaheadStateKt$rememberAddressTypeaheadState$2$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        PlacesAddressSearcher placesAddressSearcher = this.$searcher;
        AddressTypeaheadState addressTypeaheadState = this.$it;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (addressTypeaheadState.setSearcher$views(placesAddressSearcher, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (addressTypeaheadState.setSearcher$views(placesAddressSearcher, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

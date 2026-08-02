package com.squareup.address.typeahead.views;

import com.squareup.address.typeahead.views.AddressTypeaheadState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes5.dex */
public final /* synthetic */ class AddressTypeaheadKt$$ExternalSyntheticLambda5 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AddressTypeaheadState f$0;
    public final /* synthetic */ CoroutineScope f$1;

    public /* synthetic */ AddressTypeaheadKt$$ExternalSyntheticLambda5(AddressTypeaheadState addressTypeaheadState, CoroutineScope coroutineScope, int i) {
        this.$r8$classId = i;
        this.f$0 = addressTypeaheadState;
        this.f$1 = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        CoroutineScope coroutineScope = this.f$1;
        AddressTypeaheadState addressTypeaheadState = this.f$0;
        String str = (String) obj;
        switch (i) {
            case 0:
                str.getClass();
                addressTypeaheadState.getClass();
                coroutineScope.getClass();
                addressTypeaheadState.streetAddressLine1$delegate.setValue(str);
                addressTypeaheadState.setManuallyEdited(true);
                if (((AddressTypeaheadState.SearcherState) addressTypeaheadState.searcherState$delegate.getValue()) instanceof AddressTypeaheadState.SearcherState.Available) {
                    addressTypeaheadState.searchIn(str, coroutineScope);
                }
                break;
            default:
                str.getClass();
                addressTypeaheadState.getClass();
                coroutineScope.getClass();
                addressTypeaheadState.searchInput$delegate.setValue(str);
                addressTypeaheadState.cityAddress$delegate.setValue(null);
                addressTypeaheadState.searchIn(str, coroutineScope);
                break;
        }
        return Unit.INSTANCE;
    }
}

package com.braze;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusOwnerImpl;
import coil3.RealImageLoader$execute$2;
import com.braze.models.outgoing.BrazeProperties;
import com.squareup.address.typeahead.backend.api.AddressSearchResult;
import com.squareup.address.typeahead.views.AddressTypeaheadState;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes5.dex */
public final /* synthetic */ class Braze$$ExternalSyntheticLambda132 implements Function0 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ int f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;

    public /* synthetic */ Braze$$ExternalSyntheticLambda132(int i, FocusOwnerImpl focusOwnerImpl, CoroutineScope coroutineScope, MutableState mutableState, AddressTypeaheadState addressTypeaheadState, AddressSearchResult addressSearchResult) {
        this.f$3 = i;
        this.f$0 = focusOwnerImpl;
        this.f$1 = coroutineScope;
        this.f$2 = mutableState;
        this.f$4 = addressTypeaheadState;
        this.f$5 = addressSearchResult;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit logPurchase$lambda$1;
        int i = this.$r8$classId;
        Object obj = this.f$5;
        Object obj2 = this.f$4;
        Object obj3 = this.f$2;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                logPurchase$lambda$1 = Braze.logPurchase$lambda$1((String) obj5, (String) obj4, (BigDecimal) obj3, this.f$3, (Braze) obj2, (BrazeProperties) obj);
                return logPurchase$lambda$1;
            default:
                MutableState mutableState = (MutableState) obj3;
                mutableState.setValue(Integer.valueOf(this.f$3));
                ((FocusOwnerImpl) obj5).clearFocus(false);
                JobKt.launch$default((CoroutineScope) obj4, null, null, new RealImageLoader$execute$2((AddressTypeaheadState) obj2, (AddressSearchResult) obj, mutableState, null, 28), 3);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ Braze$$ExternalSyntheticLambda132(String str, String str2, BigDecimal bigDecimal, int i, Braze braze, BrazeProperties brazeProperties) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = bigDecimal;
        this.f$3 = i;
        this.f$4 = braze;
        this.f$5 = brazeProperties;
    }
}

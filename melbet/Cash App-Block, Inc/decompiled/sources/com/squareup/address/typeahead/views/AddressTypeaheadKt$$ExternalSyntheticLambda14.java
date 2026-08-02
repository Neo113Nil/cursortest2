package com.squareup.address.typeahead.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.address.typeahead.views.AddressModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class AddressTypeaheadKt$$ExternalSyntheticLambda14 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AddressModel.Expanded f$1;
    public final /* synthetic */ AddressTypeaheadState f$2;
    public final /* synthetic */ Modifier f$3;
    public final /* synthetic */ boolean f$4;
    public final /* synthetic */ int f$5;

    public /* synthetic */ AddressTypeaheadKt$$ExternalSyntheticLambda14(AddressModel.Expanded expanded, AddressTypeaheadState addressTypeaheadState, Modifier modifier, boolean z, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = expanded;
        this.f$2 = addressTypeaheadState;
        this.f$3 = modifier;
        this.f$4 = z;
        this.f$5 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                AddressTypeaheadKt.PostalCodeField(this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, Updater.updateChangedFlags(this.f$5 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                AddressTypeaheadKt.StateField(this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, Updater.updateChangedFlags(this.f$5 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}

package com.squareup.cash.genericelements.components.base;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class GenericArcadeButtonKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ GenericBaseViewModel.ArcadeButtonViewModel f$0;
    public final /* synthetic */ Modifier f$1;
    public final /* synthetic */ Function1 f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ GenericArcadeButtonKt$$ExternalSyntheticLambda3(GenericBaseViewModel.ArcadeButtonViewModel arcadeButtonViewModel, Modifier modifier, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = arcadeButtonViewModel;
        this.f$1 = modifier;
        this.f$2 = function1;
        this.f$3 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                CameraUpdateFactory.ToCompactButton(this.f$0, this.f$1, this.f$2, composer, Updater.updateChangedFlags(this.f$3 | 1));
                break;
            case 1:
                CameraUpdateFactory.ToCtaButton(this.f$0, this.f$1, this.f$2, composer, Updater.updateChangedFlags(this.f$3 | 1));
                break;
            default:
                CameraUpdateFactory.ToDefaultButton(this.f$0, this.f$1, this.f$2, composer, Updater.updateChangedFlags(this.f$3 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}

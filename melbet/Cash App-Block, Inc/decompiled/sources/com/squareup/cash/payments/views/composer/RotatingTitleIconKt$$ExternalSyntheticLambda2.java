package com.squareup.cash.payments.views.composer;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.formview.components.arcade.ArcadeFormTextInputGroupViewKt;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class RotatingTitleIconKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId = 2;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ Modifier f$1;
    public final /* synthetic */ boolean f$2;

    public /* synthetic */ RotatingTitleIconKt$$ExternalSyntheticLambda2(Modifier modifier, boolean z, Function0 function0, int i) {
        this.f$1 = modifier;
        this.f$2 = z;
        this.f$0 = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ErrorKt.RotatingTitleIcon(Updater.updateChangedFlags(1), composer, this.f$1, this.f$0, this.f$2);
                break;
            case 1:
                ArcadeFormTextInputGroupViewKt.PasswordObfuscationToggleButton(Updater.updateChangedFlags(1), composer, this.f$1, this.f$0, this.f$2);
                break;
            default:
                InstitutionPickerScreenKt.ManualEntryRow(Updater.updateChangedFlags(7), composer, this.f$1, this.f$0, this.f$2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ RotatingTitleIconKt$$ExternalSyntheticLambda2(Function0 function0, Modifier modifier, boolean z, int i) {
        this.f$0 = function0;
        this.f$1 = modifier;
        this.f$2 = z;
    }

    public /* synthetic */ RotatingTitleIconKt$$ExternalSyntheticLambda2(boolean z, Function0 function0, Modifier modifier, int i) {
        this.f$2 = z;
        this.f$0 = function0;
        this.f$1 = modifier;
    }
}

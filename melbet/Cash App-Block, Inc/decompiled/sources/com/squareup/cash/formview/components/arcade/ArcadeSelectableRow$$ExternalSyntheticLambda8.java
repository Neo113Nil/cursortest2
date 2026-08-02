package com.squareup.cash.formview.components.arcade;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class ArcadeSelectableRow$$ExternalSyntheticLambda8 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ArcadeSelectableRow f$0;
    public final /* synthetic */ SelectableRowViewModel f$1;
    public final /* synthetic */ Modifier f$2;
    public final /* synthetic */ Function0 f$3;

    public /* synthetic */ ArcadeSelectableRow$$ExternalSyntheticLambda8(ArcadeSelectableRow arcadeSelectableRow, SelectableRowViewModel selectableRowViewModel, Modifier modifier, Function0 function0, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = arcadeSelectableRow;
        this.f$1 = selectableRowViewModel;
        this.f$2 = modifier;
        this.f$3 = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(49);
                this.f$0.SmallIconSelectableRow(this.f$1, this.f$2, this.f$3, (Composer) obj, updateChangedFlags);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(49);
                this.f$0.AvatarSelectableRow(this.f$1, this.f$2, this.f$3, (Composer) obj, updateChangedFlags2);
                break;
        }
        return Unit.INSTANCE;
    }
}

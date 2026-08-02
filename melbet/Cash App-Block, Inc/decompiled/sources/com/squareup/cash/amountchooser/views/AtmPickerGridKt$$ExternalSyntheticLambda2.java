package com.squareup.cash.amountchooser.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.deposits.physical.view.map.PaperMoneyDepositMapViewKt;
import com.squareup.cash.earningstracker.views.components.LoadingErrorKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import string.TrimMode;

/* loaded from: classes10.dex */
public final /* synthetic */ class AtmPickerGridKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ List f$1;
    public final /* synthetic */ Function1 f$2;
    public final /* synthetic */ int f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ AtmPickerGridKt$$ExternalSyntheticLambda2(Modifier modifier, List list, Function1 function1, int i, int i2) {
        this.$r8$classId = 0;
        this.f$0 = modifier;
        this.f$1 = list;
        this.f$2 = function1;
        this.f$3 = i;
        this.f$4 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                TrimMode.AtmPickerGrid(Updater.updateChangedFlags(this.f$3 | 1), this.f$4, (Composer) obj, this.f$0, this.f$1, this.f$2);
                break;
            case 1:
                ((Integer) obj2).getClass();
                PaperMoneyDepositMapViewKt.DepositFilters(Updater.updateChangedFlags(this.f$3 | 1), this.f$4, (Composer) obj, this.f$0, this.f$1, this.f$2);
                break;
            default:
                ((Integer) obj2).getClass();
                LoadingErrorKt.TopCustomersSection(Updater.updateChangedFlags(this.f$3 | 1), this.f$4, (Composer) obj, this.f$0, this.f$1, this.f$2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AtmPickerGridKt$$ExternalSyntheticLambda2(List list, Function1 function1, Modifier modifier, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$1 = list;
        this.f$2 = function1;
        this.f$0 = modifier;
        this.f$3 = i;
        this.f$4 = i2;
    }
}

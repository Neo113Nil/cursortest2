package com.squareup.cash.cashapppay.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.cashapppay.viewmodels.GrantViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class GrantSheetKt$$ExternalSyntheticLambda10 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ GrantViewModel.Main f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ GrantSheetKt$$ExternalSyntheticLambda10(GrantViewModel.Main main, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = main;
        this.f$1 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                GrantSheetKt.Body(this.f$0, composer, Updater.updateChangedFlags(this.f$1 | 1));
                break;
            default:
                GrantScreenKt.Body(this.f$0, composer, Updater.updateChangedFlags(this.f$1 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}

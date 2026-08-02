package com.squareup.cash.arcade.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.room.util.DBUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class SpacerKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ SpacerKt$$ExternalSyntheticLambda3(Modifier modifier, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = modifier;
        this.f$1 = i;
        this.f$2 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                DBUtil.SpacerBetweenSectionLarge(Updater.updateChangedFlags(this.f$1 | 1), this.f$2, composer, this.f$0);
                break;
            default:
                DBUtil.SpacerWithinSectionMedium(Updater.updateChangedFlags(this.f$1 | 1), this.f$2, composer, this.f$0);
                break;
        }
        return Unit.INSTANCE;
    }
}

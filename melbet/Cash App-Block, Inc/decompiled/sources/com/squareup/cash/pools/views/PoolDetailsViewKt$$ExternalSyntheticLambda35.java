package com.squareup.cash.pools.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.KTypesJvm;

/* loaded from: classes6.dex */
public final /* synthetic */ class PoolDetailsViewKt$$ExternalSyntheticLambda35 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ PoolDetailsViewKt$$ExternalSyntheticLambda35(Modifier modifier, String str, String str2, int i) {
        this.f$0 = modifier;
        this.f$1 = str;
        this.f$2 = str2;
        this.f$3 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                PoolToastKt.HeaderText(Updater.updateChangedFlags(this.f$3 | 1), (Composer) obj, this.f$0, this.f$1, this.f$2);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(1);
                KTypesJvm.m4140StatViewxkNWiIY(this.f$1, this.f$2, this.f$0, this.f$3, (Composer) obj, updateChangedFlags);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ PoolDetailsViewKt$$ExternalSyntheticLambda35(String str, String str2, Modifier modifier, int i, int i2) {
        this.f$1 = str;
        this.f$2 = str2;
        this.f$0 = modifier;
        this.f$3 = i;
    }
}

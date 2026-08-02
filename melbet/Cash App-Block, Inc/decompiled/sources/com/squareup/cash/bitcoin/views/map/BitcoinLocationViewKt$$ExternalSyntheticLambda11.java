package com.squareup.cash.bitcoin.views.map;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import app.cash.local.views.brand.menu.LocalCaloriesTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class BitcoinLocationViewKt$$ExternalSyntheticLambda11 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Modifier f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ BitcoinLocationViewKt$$ExternalSyntheticLambda11(Modifier modifier, String str, boolean z, int i, int i2) {
        this.f$1 = modifier;
        this.f$0 = str;
        this.f$2 = z;
        this.f$3 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(1);
                BitcoinMapViewKt.ExpandableText(this.f$3, updateChangedFlags, (Composer) obj, this.f$1, this.f$0, this.f$2);
                break;
            default:
                ((Integer) obj2).getClass();
                LocalCaloriesTextKt.ModifierListSubtitleText(Updater.updateChangedFlags(1), this.f$3, (Composer) obj, this.f$1, this.f$0, this.f$2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ BitcoinLocationViewKt$$ExternalSyntheticLambda11(String str, Modifier modifier, boolean z, int i, int i2) {
        this.f$0 = str;
        this.f$1 = modifier;
        this.f$2 = z;
        this.f$3 = i;
    }
}

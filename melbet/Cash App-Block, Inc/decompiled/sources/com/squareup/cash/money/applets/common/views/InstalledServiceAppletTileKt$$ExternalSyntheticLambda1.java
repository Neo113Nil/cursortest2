package com.squareup.cash.money.applets.common.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class InstalledServiceAppletTileKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ List f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ InstalledServiceAppletTileLayoutConfig f$2;
    public final /* synthetic */ Function2 f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ InstalledServiceAppletTileKt$$ExternalSyntheticLambda1(List list, Function2 function2, boolean z, InstalledServiceAppletTileLayoutConfig installedServiceAppletTileLayoutConfig, int i) {
        this.f$0 = list;
        this.f$3 = function2;
        this.f$1 = z;
        this.f$2 = installedServiceAppletTileLayoutConfig;
        this.f$4 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$4;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                SharedUIKt.SharedVisualServiceLayout(Updater.updateChangedFlags(i2 | 1), (Composer) obj, this.f$2, this.f$0, this.f$3, this.f$1);
                break;
            default:
                ((Integer) obj2).intValue();
                SharedUIKt.DefaultServiceLayout(Updater.updateChangedFlags(i2 | 1), (Composer) obj, this.f$2, this.f$0, this.f$3, this.f$1);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ InstalledServiceAppletTileKt$$ExternalSyntheticLambda1(List list, boolean z, InstalledServiceAppletTileLayoutConfig installedServiceAppletTileLayoutConfig, Function2 function2, int i) {
        this.f$0 = list;
        this.f$1 = z;
        this.f$2 = installedServiceAppletTileLayoutConfig;
        this.f$3 = function2;
        this.f$4 = i;
    }
}

package com.squareup.cash.money.applets.common.views;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class LoadingBalanceAppletTileKt$$ExternalSyntheticLambda5 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LoadingAppletTileLayoutConfig f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ LoadingBalanceAppletTileKt$$ExternalSyntheticLambda5(LoadingAppletTileLayoutConfig loadingAppletTileLayoutConfig, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = loadingAppletTileLayoutConfig;
        this.f$1 = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        boolean z = this.f$1;
        LoadingAppletTileLayoutConfig loadingAppletTileLayoutConfig = this.f$0;
        ColumnScope columnScope = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                columnScope.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    SharedUIKt.LoadingBalanceAppletTileContent(loadingAppletTileLayoutConfig, z, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                columnScope.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    SharedUIKt.LoadingServiceAppletTileContent(loadingAppletTileLayoutConfig, z, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

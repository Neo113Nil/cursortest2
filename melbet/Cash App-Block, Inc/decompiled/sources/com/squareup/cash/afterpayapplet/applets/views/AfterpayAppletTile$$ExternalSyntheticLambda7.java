package com.squareup.cash.afterpayapplet.applets.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.squareup.cash.afterpayapplet.applets.viewmodels.AfterpayAppletTileViewModel;
import com.squareup.cash.earningstracker.views.components.EarningsCellDefaultShimmerContentKt;
import com.squareup.cash.family.applets.views.FamilyAppletTile;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class AfterpayAppletTile$$ExternalSyntheticLambda7 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ boolean f$3;
    public final /* synthetic */ int f$4;
    public final /* synthetic */ int f$5;

    public /* synthetic */ AfterpayAppletTile$$ExternalSyntheticLambda7(float f, Modifier modifier, Dp dp, boolean z, int i, int i2) {
        this.$r8$classId = 1;
        this.f$2 = f;
        this.f$0 = modifier;
        this.f$1 = dp;
        this.f$3 = z;
        this.f$4 = i;
        this.f$5 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$4;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((FamilyAppletTile) obj4).m3526AllocationSegmentedCircleuFdPcIQ((AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow) obj3, this.f$2, this.f$3, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$5);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                float f = this.f$2;
                EarningsCellDefaultShimmerContentKt.m3525EarningsCellDefaultShimmerContentt4AYKoY(f, (Modifier) obj4, (Dp) obj3, this.f$3, (Composer) obj, updateChangedFlags, this.f$5);
                break;
            default:
                ((Integer) obj2).getClass();
                SharedUIKt.m3606LoadingServiceAppletTile942rkJo((String) obj4, (Function0) obj3, this.f$2, this.f$3, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$5);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AfterpayAppletTile$$ExternalSyntheticLambda7(Object obj, Object obj2, float f, boolean z, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = f;
        this.f$3 = z;
        this.f$4 = i;
        this.f$5 = i2;
    }
}

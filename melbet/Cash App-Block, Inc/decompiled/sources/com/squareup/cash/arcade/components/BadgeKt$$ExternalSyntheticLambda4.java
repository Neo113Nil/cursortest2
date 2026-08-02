package com.squareup.cash.arcade.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.room.Room;
import com.squareup.cash.charting.components.BarChartKt;
import com.squareup.cash.investing.components.custom.order.CustomOrderGraphKt;
import com.squareup.cash.pools.applets.views.PoolsAppletTileKt;
import com.stripe.android.uicore.elements.OTPElementUIKt;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes8.dex */
public final /* synthetic */ class BadgeKt$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ float f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ BadgeKt$$ExternalSyntheticLambda4(int i, float f, Modifier modifier, int i2) {
        this.$r8$classId = 1;
        this.f$2 = i;
        this.f$0 = f;
        this.f$1 = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        float f = this.f$0;
        int i2 = this.f$2;
        Object obj3 = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                Room.m1162BadgeSmallBaseorJrPs(f, updateChangedFlags, (Composer) obj, (Modifier) obj3);
                break;
            case 1:
                ((Integer) obj2).getClass();
                BarChartKt.m3448HorizontalLinesrAjV9yQ(i2, f, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                OTPElementUIKt.DisconnectedAlertIconAgsl(f, updateChangedFlags2, (Composer) obj, (Modifier) obj3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i2 | 1);
                CustomOrderGraphKt.SelectedPriceLine(f, updateChangedFlags3, (Composer) obj, (Modifier) obj3);
                break;
            default:
                ((Integer) obj2).getClass();
                PoolsAppletTileKt.m3715PoolsSharedVisualTDGSqEk((ArrayList) obj3, i2, f, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ BadgeKt$$ExternalSyntheticLambda4(float f, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = f;
        this.f$1 = modifier;
        this.f$2 = i;
    }

    public /* synthetic */ BadgeKt$$ExternalSyntheticLambda4(Modifier modifier, float f, int i) {
        this.$r8$classId = 3;
        this.f$1 = modifier;
        this.f$0 = f;
        this.f$2 = i;
    }

    public /* synthetic */ BadgeKt$$ExternalSyntheticLambda4(ArrayList arrayList, int i, float f, int i2) {
        this.$r8$classId = 4;
        this.f$1 = arrayList;
        this.f$2 = i;
        this.f$0 = f;
    }
}

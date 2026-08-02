package com.squareup.cash.charting.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.moneybot.views.plugins.TextCardKt;
import com.stripe.android.financialconnections.features.consent.ui.ConsentLogoHeaderKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class ChartWithYAxisKt$$ExternalSyntheticLambda6 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ List f$0;
    public final /* synthetic */ float f$1;

    public /* synthetic */ ChartWithYAxisKt$$ExternalSyntheticLambda6(List list, float f, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = list;
        this.f$1 = f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                BarChartKt.m3450YAxisziNgDLE(this.f$0, this.f$1, composer, Updater.updateChangedFlags(1));
                break;
            case 1:
                TextCardKt.StackedBubbles(this.f$0, this.f$1, composer, Updater.updateChangedFlags(1));
                break;
            default:
                ConsentLogoHeaderKt.m4016ForegroundRowziNgDLE(this.f$0, this.f$1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }
}

package com.squareup.cash.offers.views.details;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.unit.Dp;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class OffersLoadingKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ float f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ int f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ OffersLoadingKt$$ExternalSyntheticLambda0(Modifier modifier, float f, Object obj, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = modifier;
        this.f$1 = f;
        this.f$2 = obj;
        this.f$3 = i;
        this.f$4 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                OffersLoadingKt.m3679OffersLoadingCt2sIOU(this.f$0, this.f$1, (Dp) this.f$2, (Composer) obj, Updater.updateChangedFlags(this.f$3 | 1), this.f$4);
                break;
            default:
                ((Integer) obj2).getClass();
                ListItemKt.m4014LoadingSpinneruFdPcIQ(this.f$0, this.f$1, (Brush) this.f$2, (Composer) obj, Updater.updateChangedFlags(this.f$3 | 1), this.f$4);
                break;
        }
        return Unit.INSTANCE;
    }
}

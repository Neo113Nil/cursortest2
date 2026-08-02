package com.squareup.cash.fidesmo.views;

import androidx.compose.foundation.text.AndroidCursorHandle_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.fidesmo.viewmodels.ScanningStarPlacement;
import com.squareup.cash.investing.components.custom.order.CustomOrderGraphKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class FidesmoProvisioningViewKt$$ExternalSyntheticLambda71 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ long f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ FidesmoProvisioningViewKt$$ExternalSyntheticLambda71(long j, ScanningStarPlacement scanningStarPlacement, int i, Function1 function1, int i2) {
        this.f$0 = j;
        this.f$1 = scanningStarPlacement;
        this.f$2 = i;
        this.f$3 = function1;
        this.f$4 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).intValue();
                FidesmoProvisioningViewKt.m3536PositionedDisconnectedAlertIconzTRF_AQ(this.f$0, (ScanningStarPlacement) this.f$1, this.f$2, (Function1) this.f$3, (Composer) obj, Updater.updateChangedFlags(this.f$4 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AndroidCursorHandle_androidKt.m343CursorHandleUSBMPiE((OffsetProvider) this.f$1, (Modifier) this.f$3, this.f$0, (Composer) obj, Updater.updateChangedFlags(this.f$2 | 1), this.f$4);
                break;
            default:
                ((Integer) obj2).getClass();
                CustomOrderGraphKt.m3581Line3IgeMak((Modifier) this.f$1, this.f$0, (Function1) this.f$3, (Composer) obj, Updater.updateChangedFlags(this.f$2 | 1), this.f$4);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ FidesmoProvisioningViewKt$$ExternalSyntheticLambda71(OffsetProvider offsetProvider, Modifier modifier, long j, int i, int i2) {
        this.f$1 = offsetProvider;
        this.f$3 = modifier;
        this.f$0 = j;
        this.f$2 = i;
        this.f$4 = i2;
    }

    public /* synthetic */ FidesmoProvisioningViewKt$$ExternalSyntheticLambda71(Modifier modifier, long j, Function1 function1, int i, int i2) {
        this.f$1 = modifier;
        this.f$0 = j;
        this.f$3 = function1;
        this.f$2 = i;
        this.f$4 = i2;
    }
}

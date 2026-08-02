package com.squareup.cash.avatar.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.fidesmo.views.ScanningShapePulseKt;
import com.squareup.cash.taptopay.views.components.TapToPayButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class AvatarKt$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ AvatarKt$$ExternalSyntheticLambda5(int i, long j, Modifier modifier, int i2) {
        this.$r8$classId = 1;
        this.f$3 = i;
        this.f$2 = j;
        this.f$0 = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                AvatarKt.m3407PlaceholderAvatarFNF3uiM(Updater.updateChangedFlags(this.f$3 | 1), this.f$2, (Composer) obj, this.f$0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(1);
                VisibleKt.m3495OverflowAvatar3IgeMak(this.f$3, updateChangedFlags, this.f$2, (Composer) obj, this.f$0);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(1);
                VisibleKt.m3490IconXOJAsU(this.f$3, updateChangedFlags2, this.f$2, (Composer) obj, this.f$0);
                break;
            case 3:
                ((Integer) obj2).getClass();
                ScanningShapePulseKt.m3540HeartFillLayer3JVO9M(Updater.updateChangedFlags(this.f$3 | 1), this.f$2, (Composer) obj, this.f$0);
                break;
            case 4:
                ((Integer) obj2).getClass();
                ScanningShapePulseKt.m3549StarFillLayer3JVO9M(Updater.updateChangedFlags(this.f$3 | 1), this.f$2, (Composer) obj, this.f$0);
                break;
            case 5:
                ((Integer) obj2).getClass();
                ScanningShapePulseKt.m3542MiniCardFillLayer3JVO9M(Updater.updateChangedFlags(this.f$3 | 1), this.f$2, (Composer) obj, this.f$0);
                break;
            default:
                ((Integer) obj2).getClass();
                TapToPayButtonKt.m3762TapToPayTapSurface3JVO9M(Updater.updateChangedFlags(this.f$3 | 1), this.f$2, (Composer) obj, this.f$0);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AvatarKt$$ExternalSyntheticLambda5(long j, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$2 = j;
        this.f$0 = modifier;
        this.f$3 = i;
    }

    public /* synthetic */ AvatarKt$$ExternalSyntheticLambda5(Modifier modifier, int i, long j, int i2) {
        this.$r8$classId = 2;
        this.f$0 = modifier;
        this.f$3 = i;
        this.f$2 = j;
    }

    public /* synthetic */ AvatarKt$$ExternalSyntheticLambda5(Modifier modifier, long j, int i) {
        this.$r8$classId = 0;
        this.f$0 = modifier;
        this.f$2 = j;
        this.f$3 = i;
    }
}

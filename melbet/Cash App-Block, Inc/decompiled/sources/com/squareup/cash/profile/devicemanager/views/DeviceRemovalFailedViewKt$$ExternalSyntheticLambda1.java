package com.squareup.cash.profile.devicemanager.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceRemovalFailedViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class DeviceRemovalFailedViewKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DeviceRemovalFailedViewModel f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ DeviceRemovalFailedViewKt$$ExternalSyntheticLambda1(DeviceRemovalFailedViewModel deviceRemovalFailedViewModel, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = deviceRemovalFailedViewModel;
        this.f$1 = function1;
        this.f$2 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                DeviceManagerListViewKt.DeviceRemovalFailedFullScreenContent(this.f$0, this.f$1, composer, Updater.updateChangedFlags(this.f$2 | 1));
                break;
            case 1:
                DeviceManagerListViewKt.DeviceRemovalFailedHalfSheetScreen(this.f$0, this.f$1, composer, Updater.updateChangedFlags(this.f$2 | 1));
                break;
            default:
                DeviceManagerListViewKt.DeviceRemovalFailedHalfSheet(this.f$0, this.f$1, composer, Updater.updateChangedFlags(this.f$2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}

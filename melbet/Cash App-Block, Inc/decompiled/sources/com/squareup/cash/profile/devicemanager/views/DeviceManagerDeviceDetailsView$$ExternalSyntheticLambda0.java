package com.squareup.cash.profile.devicemanager.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.pools.views.PoolsListViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceManagerDeviceDetailViewModel;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda1;
import com.squareup.util.Strings;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class DeviceManagerDeviceDetailsView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DeviceManagerDeviceDetailViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ DeviceManagerDeviceDetailsView$$ExternalSyntheticLambda0(DeviceManagerDeviceDetailViewModel deviceManagerDeviceDetailViewModel, Function1 function1, int i) {
        this.$r8$classId = 2;
        this.f$0 = deviceManagerDeviceDetailViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        DeviceManagerDeviceDetailViewModel deviceManagerDeviceDetailViewModel = this.f$0;
        boolean z = false;
        Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    DeviceManagerListViewKt.DeviceDetailsView(deviceManagerDeviceDetailViewModel, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, colors.semantic.background.f1047app, ColorKt.RectangleShape);
                    DeviceManagerDeviceDetailViewModel deviceManagerDeviceDetailViewModel2 = this.f$0;
                    boolean z2 = !(deviceManagerDeviceDetailViewModel2 instanceof DeviceManagerDeviceDetailViewModel.Loaded);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new PoolsListViewKt$$ExternalSyntheticLambda6(29);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    Strings.m3984LoadableSheetContentosbwsH8(deviceManagerDeviceDetailViewModel2, z2, 550.0f, m177backgroundbw27NRU, (Function1) rememberedValue, Expect_jvmKt.rememberComposableLambda(-1778548035, new HeroCardViewKt$$ExternalSyntheticLambda1(function1, z, 17), gapComposer2), gapComposer2, 221568, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                DeviceManagerListViewKt.DeviceDetailsView(deviceManagerDeviceDetailViewModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ DeviceManagerDeviceDetailsView$$ExternalSyntheticLambda0(DeviceManagerDeviceDetailViewModel deviceManagerDeviceDetailViewModel, Function1 function1, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = deviceManagerDeviceDetailViewModel;
        this.f$1 = function1;
    }
}

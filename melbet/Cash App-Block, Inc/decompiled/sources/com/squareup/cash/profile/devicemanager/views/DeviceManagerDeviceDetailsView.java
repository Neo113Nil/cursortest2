package com.squareup.cash.profile.devicemanager.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.navigation.Navigation;
import app.cash.broadway.ui.compose.ComposeUiView;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceManagerDeviceDetailViewModel;
import com.squareup.cash.profile.views.ErrorView$$ExternalSyntheticLambda1;
import com.squareup.cash.ui.BottomSheetConfig;
import com.squareup.cash.ui.BottomSheetStyle;
import com.squareup.cash.ui.OutsideTapCloses;
import com.squareup.util.android.Views;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt__MathJVMKt;

/* loaded from: classes7.dex */
public final class DeviceManagerDeviceDetailsView extends ComposeUiView implements BottomSheetConfig, OutsideTapCloses {
    public final RealImageLoader imageLoader;
    public final int initialHeight;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceManagerDeviceDetailsView(Context context, RealImageLoader realImageLoader) {
        super(context);
        context.getClass();
        this.imageLoader = realImageLoader;
        this.initialHeight = MathKt__MathJVMKt.roundToInt(Views.dip(context, 550.0f));
    }

    public final void Content(DeviceManagerDeviceDetailViewModel deviceManagerDeviceDetailViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1198249642);
        int i2 = (gapComposer.changedInstance(deviceManagerDeviceDetailViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (deviceManagerDeviceDetailViewModel != null) {
            gapComposer.startReplaceGroup(1582035204);
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(this.imageLoader), Expect_jvmKt.rememberComposableLambda(-1499790459, new DeviceManagerDeviceDetailsView$$ExternalSyntheticLambda0(deviceManagerDeviceDetailViewModel, function1, 0, (byte) 0), gapComposer), gapComposer, 56);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(1582177432);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorView$$ExternalSyntheticLambda1(this, deviceManagerDeviceDetailViewModel, function1, i, 14);
        }
    }

    @Override // com.squareup.cash.ui.BottomSheetConfig
    public final BottomSheetStyle getBottomSheetStyle() {
        return Navigation.ArcadeBottomSheetStyle(this);
    }

    @Override // com.squareup.cash.ui.BottomSheetConfig
    public final int getInitialHeight() {
        return this.initialHeight;
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((DeviceManagerDeviceDetailViewModel) obj, function1, gapComposer, 0);
    }
}

package app.cash.local.views.instore;

import android.content.Context;
import android.util.Size;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.Preview;
import androidx.camera.core.RotationProvider;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.lifecycle.LifecycleCamera;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import app.cash.badging.backend.RealBadger2$$ExternalSyntheticLambda0;
import app.cash.local.viewmodels.instore.CameraState;
import com.mikepenz.markdown.compose.MarkdownKt$$ExternalSyntheticLambda2;
import com.squareup.cash.ui.util.RealCashVibrator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public final class TableQrCodeCameraViewFinderManager {
    public static final Size CAMERAX_ANALYSIS_TARGET_RESOLUTION = new Size(1200, 1600);
    public final ExecutorService analyzerExecutor;
    public LifecycleCamera camera;
    public final TableQrCodeCameraViewFinderManager$cameraLifecycleOwner$1 cameraLifecycleOwner;
    public final Context context;
    public final ImageAnalysis imageAnalysis;
    public final RotationProvider.AnonymousClass1 orientationEventListener;
    public final Preview preview;
    public final RealCashVibrator vibrator;

    public TableQrCodeCameraViewFinderManager(Context context, RealCashVibrator realCashVibrator) {
        context.getClass();
        this.context = context;
        this.vibrator = realCashVibrator;
        this.preview = new Preview.Builder(0).m102build();
        this.orientationEventListener = new RotationProvider.AnonymousClass1(context);
        this.analyzerExecutor = Executors.newSingleThreadExecutor();
        Preview.Builder builder = new Preview.Builder(1);
        builder.mMutableConfig.insertOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, CAMERAX_ANALYSIS_TARGET_RESOLUTION);
        builder.setBackpressureStrategy();
        this.imageAnalysis = builder.build();
        this.cameraLifecycleOwner = new TableQrCodeCameraViewFinderManager$cameraLifecycleOwner$1();
    }

    public final void HandleState(TableQrCodeCameraViewFinderState tableQrCodeCameraViewFinderState, Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-521648431);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(tableQrCodeCameraViewFinderState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(this) ? 256 : 128;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Boolean bool = (Boolean) tableQrCodeCameraViewFinderState.flashAvailable$delegate.getValue();
            bool.booleanValue();
            Boolean bool2 = (Boolean) tableQrCodeCameraViewFinderState.flashEnabled$delegate.getValue();
            bool2.booleanValue();
            int i4 = i2 & 14;
            boolean changedInstance = (i4 == 4) | gapComposer.changedInstance(this);
            Object rememberedValue = gapComposer.rememberedValue();
            Continuation continuation = null;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new TableQrCodeCameraViewFinderManager$HandleState$1$1(tableQrCodeCameraViewFinderState, this, continuation, i3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(bool, bool2, (Function2) rememberedValue, gapComposer);
            CameraState cameraState = (CameraState) tableQrCodeCameraViewFinderState.cameraState$delegate.getValue();
            boolean changedInstance2 = (i4 == 4) | gapComposer.changedInstance(this);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new TableQrCodeCameraViewFinderManager$HandleState$1$1(tableQrCodeCameraViewFinderState, this, continuation, r10);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, cameraState, (Function2) rememberedValue2);
            Boolean bool3 = (Boolean) tableQrCodeCameraViewFinderState.processImages$delegate.getValue();
            bool3.booleanValue();
            boolean changedInstance3 = ((i2 & 112) == 32) | (i4 == 4) | gapComposer.changedInstance(this);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance3 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new TableQrCodeCameraViewFinderManager$$ExternalSyntheticLambda0(tableQrCodeCameraViewFinderState, this, function1, i3);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Updater.DisposableEffect(bool3, (Function1) rememberedValue3, gapComposer);
            Unit unit = Unit.INSTANCE;
            int i5 = (gapComposer.changedInstance(this) ? 1 : 0) | (i4 != 4 ? 0 : 1);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (i5 != 0 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new RealBadger2$$ExternalSyntheticLambda0(27, this, tableQrCodeCameraViewFinderState);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            Updater.DisposableEffect(unit, (Function1) rememberedValue4, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownKt$$ExternalSyntheticLambda2(this, tableQrCodeCameraViewFinderState, function1, i, 6);
        }
    }
}

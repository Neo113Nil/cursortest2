package androidx.compose.foundation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.util.Log;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.Result3A;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.UseCase;
import androidx.camera.video.Recorder;
import androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceHolder;
import androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1;
import androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceState;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class BorderKt$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ BorderKt$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewfinderExternalSurfaceHolder viewfinderExternalSurfaceHolder;
        Context context = null;
        switch (this.$r8$classId) {
            case 0:
                ((LayoutNodeDrawScope) obj).drawContent();
                break;
            case 1:
                Resources resources = (Resources) obj;
                resources.getClass();
                break;
            case 2:
                PersistentCompositionLocalHashMap persistentCompositionLocalHashMap = (PersistentCompositionLocalHashMap) obj;
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = AndroidCompositionLocals_androidKt.LocalContext;
                persistentCompositionLocalHashMap.getClass();
                Context context2 = (Context) Updater.read(persistentCompositionLocalHashMap, staticProvidableCompositionLocal);
                while (true) {
                    if (context2 instanceof ContextWrapper) {
                        if (context2 instanceof Activity) {
                            context = context2;
                        } else {
                            context2 = ((ContextWrapper) context2).getBaseContext();
                        }
                    }
                }
                break;
            case 3:
                ((FrameInfo) obj).getClass();
                break;
            case 4:
                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    Log.d("CXCP", "setTorchIfRequired: torch control completed");
                }
                break;
            case 5:
                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    Log.d("CXCP", "setExternalFlashAeModeAsync: state3AControl.updateSignal completed");
                }
                break;
            case 6:
                ((Result3A) obj).getClass();
                break;
            case 7:
                if (!(obj instanceof Object[])) {
                    break;
                } else {
                    break;
                }
            case 8:
                ((List) obj).getClass();
                break;
            case 9:
                ((SurfaceRequest) obj).willNotProvideSurface();
                break;
            case 10:
                UseCase useCase = (UseCase) obj;
                useCase.getClass();
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                ViewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1 viewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1 = (ViewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1) obj;
                ViewfinderExternalSurfaceState viewfinderExternalSurfaceState = viewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1.attachedState;
                if (viewfinderExternalSurfaceState != null && (viewfinderExternalSurfaceHolder = viewfinderExternalSurfaceState.viewfinderSurfaceHolder) != null && !viewfinderExternalSurfaceHolder.isDetached) {
                    ((Recorder.AnonymousClass6) viewfinderExternalSurfaceHolder.surfaceControl).detach();
                    viewfinderExternalSurfaceHolder.refCountedSurface.release();
                    viewfinderExternalSurfaceHolder.isDetached = true;
                }
                viewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1.setAttachedState(null);
                break;
            case 15:
                break;
            case 16:
                SemanticsPropertiesKt.setProgressBarRangeInfo((SemanticsPropertyReceiver) obj, ProgressBarRangeInfo.Indeterminate);
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                ((Integer) obj).getClass();
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                ((Long) obj).longValue();
                break;
            case 28:
                ((Float) obj).floatValue();
                break;
            default:
                break;
        }
        return Unit.INSTANCE;
    }
}

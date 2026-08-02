package androidx.camera.core;

import android.util.Size;
import androidx.camera.camera2.impl.MeteringRepeating;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.AutoValue_StreamSpec;
import androidx.camera.core.impl.ImageAnalysisConfig;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.Threads;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class ImageAnalysis$$ExternalSyntheticLambda2 implements SessionConfig.ErrorListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ UseCase f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ImageAnalysis$$ExternalSyntheticLambda2(UseCase useCase, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = useCase;
        this.f$1 = obj;
    }

    @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
    public final void onError(SessionConfig sessionConfig) {
        int i = this.$r8$classId;
        Object obj = this.f$1;
        UseCase useCase = this.f$0;
        switch (i) {
            case 0:
                ImageAnalysis imageAnalysis = (ImageAnalysis) useCase;
                ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer = (ImageAnalysisAbstractAnalyzer) obj;
                if (imageAnalysis.getCamera() != null) {
                    Threads.checkMainThread();
                    SessionConfig.CloseableErrorListener closeableErrorListener = imageAnalysis.mCloseableErrorListener;
                    if (closeableErrorListener != null) {
                        closeableErrorListener.close();
                        imageAnalysis.mCloseableErrorListener = null;
                    }
                    SurfaceRequest.AnonymousClass2 anonymousClass2 = imageAnalysis.mDeferrableSurface;
                    if (anonymousClass2 != null) {
                        anonymousClass2.close();
                        imageAnalysis.mDeferrableSurface = null;
                    }
                    imageAnalysisAbstractAnalyzer.clearCache();
                    imageAnalysis.getCameraId();
                    ImageAnalysisConfig imageAnalysisConfig = (ImageAnalysisConfig) imageAnalysis.mCurrentConfig;
                    AutoValue_StreamSpec autoValue_StreamSpec = imageAnalysis.mAttachedStreamSpec;
                    autoValue_StreamSpec.getClass();
                    SessionConfig.Builder createPipeline = imageAnalysis.createPipeline(imageAnalysisConfig, autoValue_StreamSpec);
                    imageAnalysis.mSessionConfigBuilder = createPipeline;
                    Object[] objArr = {createPipeline.build()};
                    ArrayList arrayList = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList.add(obj2);
                    imageAnalysis.updateSessionConfig(Collections.unmodifiableList(arrayList));
                    imageAnalysis.notifyReset();
                    break;
                }
                break;
            default:
                MeteringRepeating meteringRepeating = (MeteringRepeating) useCase;
                sessionConfig.getClass();
                meteringRepeating.updateSessionConfig(CollectionsKt__CollectionsJVMKt.listOf(meteringRepeating.createPipeline((Size) obj).build()));
                meteringRepeating.notifyReset();
                break;
        }
    }
}

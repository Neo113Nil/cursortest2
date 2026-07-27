package androidx.versionedparcelable;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class DeltaSignalBufferAttributeAJSClqBYgHDxJv8VhK98211822228082 implements YellowLoopOverloadingTokenPusXHFugLlgRS8Op2Q20000579559455, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
    public static long ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
    public long NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480;
    public final View RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public boolean UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339;
    public boolean YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
    public final PriorityQueue LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = new PriorityQueue(11, new YellowLoopRouterGatewayX9KDdmXLKIznEB7XMr82691421508617(0));
    public final Choreographer TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = Choreographer.getInstance();
    public final ArcticBytePrimitiveHashmapYiXKSYIFVZNq70AeRD38533972144357 BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = new ArcticBytePrimitiveHashmapYiXKSYIFVZNq70AeRD38533972144357();

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
    
        if (r0 >= 30.0f) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DeltaSignalBufferAttributeAJSClqBYgHDxJv8VhK98211822228082(View view) {
        float f;
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = view;
        if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050 == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                f = display.getRefreshRate();
            }
            f = 60.0f;
            ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050 = (long) (1.0E9f / f);
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339 = true;
        }
    }

    public final boolean AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365() {
        ArcticBytePrimitiveHashmapYiXKSYIFVZNq70AeRD38533972144357 arcticBytePrimitiveHashmapYiXKSYIFVZNq70AeRD38533972144357 = this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
        long ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = arcticBytePrimitiveHashmapYiXKSYIFVZNq70AeRD38533972144357.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
        RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996.IronMatrixPipelineVectorCmhq21DucJNfG3zCVW67482589553900("compose:lazy:prefetch:available_time_nanos", ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
        boolean z = true;
        if (ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 > 0) {
            PriorityQueue priorityQueue = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
            Object peek = priorityQueue.peek();
            peek.getClass();
            if (!((HeliosRuntimeBinaryConnectorSmSgjVIXjLa7BIWIM563809846705148) peek).AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(arcticBytePrimitiveHashmapYiXKSYIFVZNq70AeRD38533972144357)) {
                priorityQueue.poll();
                z = false;
            }
            arcticBytePrimitiveHashmapYiXKSYIFVZNq70AeRD38533972144357.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = false;
        }
        return z;
    }

    @Override // androidx.versionedparcelable.YellowLoopOverloadingTokenPusXHFugLlgRS8Op2Q20000579559455
    public final void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(FrostBridgeInheritanceCryptographyNFI4INE9APBQrGi4pC26289083541682 frostBridgeInheritanceCryptographyNFI4INE9APBQrGi4pC26289083541682) {
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.add(new HeliosRuntimeBinaryConnectorSmSgjVIXjLa7BIWIM563809846705148(1, frostBridgeInheritanceCryptographyNFI4INE9APBQrGi4pC26289083541682));
        if (this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170) {
            return;
        }
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = true;
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.post(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339) {
            this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480 = j;
            this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339 = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339 = false;
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.removeCallbacks(this);
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        if (!priorityQueue.isEmpty() && this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 && this.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339) {
            View view = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z = System.nanoTime() > (2 * ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050) + nanos;
                ArcticBytePrimitiveHashmapYiXKSYIFVZNq70AeRD38533972144357 arcticBytePrimitiveHashmapYiXKSYIFVZNq70AeRD38533972144357 = this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
                arcticBytePrimitiveHashmapYiXKSYIFVZNq70AeRD38533972144357.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = z;
                arcticBytePrimitiveHashmapYiXKSYIFVZNq70AeRD38533972144357.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = Math.max(this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480, nanos) + ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
                boolean z2 = false;
                while (!priorityQueue.isEmpty() && !z2) {
                    if (arcticBytePrimitiveHashmapYiXKSYIFVZNq70AeRD38533972144357.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            z2 = AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365();
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        z2 = AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365();
                    }
                }
                if (z2) {
                    this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.postFrameCallback(this);
                } else {
                    this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = false;
                }
                RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996.IronMatrixPipelineVectorCmhq21DucJNfG3zCVW67482589553900("compose:lazy:prefetch:available_time_nanos", 0L);
                return;
            }
        }
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = false;
    }
}

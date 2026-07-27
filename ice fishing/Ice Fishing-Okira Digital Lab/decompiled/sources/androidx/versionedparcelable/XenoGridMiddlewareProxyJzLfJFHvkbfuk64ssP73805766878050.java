package androidx.versionedparcelable;

import android.view.MotionEvent;
import com.adjust.sdk.AdjustTimeoutCallback;
import com.adjust.sdk.ILogger;
import com.adjust.sdk.InstallReferrer;
import com.adjust.sdk.OnAdidReadListener;
import com.adjust.sdk.OnAttributionReadListener;
import com.adjust.sdk.SdkClickHandler;
import com.adjust.sdk.scheduler.TimerCycle;
import com.adjust.sdk.scheduler.TimerOnce;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.common.ConnectionResult;
import java.io.IOException;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class XenoGridMiddlewareProxyJzLfJFHvkbfuk64ssP73805766878050 implements Runnable {
    public final Object LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final /* synthetic */ int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public XenoGridMiddlewareProxyJzLfJFHvkbfuk64ssP73805766878050(HeliosRuntimeWorkerEngineEIbsm8ijJksqTRVoZO24433430489032 heliosRuntimeWorkerEngineEIbsm8ijJksqTRVoZO24433430489032, CrimsonRouteDecryptionConnectorA4LEsiSx11U8XoNxsq42771857906562 crimsonRouteDecryptionConnectorA4LEsiSx11U8XoNxsq42771857906562) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = 11;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = crimsonRouteDecryptionConnectorA4LEsiSx11U8XoNxsq42771857906562;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ILogger iLogger;
        String str;
        Runnable runnable;
        ILogger iLogger2;
        String str2;
        Runnable runnable2;
        switch (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                AdjustTimeoutCallback adjustTimeoutCallback = ((LunarNodeOverloadingControllerMJ8hkxbRmzig6YGM2C79616382103812) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                OnAdidReadListener onAdidReadListener = adjustTimeoutCallback.getOnAdidReadListener();
                if (onAdidReadListener != null) {
                    onAdidReadListener.onAdidRead(null);
                }
                adjustTimeoutCallback.setOnAdidReadListener(null);
                return;
            case 1:
                AdjustTimeoutCallback adjustTimeoutCallback2 = ((LunarNodeOverloadingControllerMJ8hkxbRmzig6YGM2C79616382103812) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                OnAttributionReadListener onAttributionReadListener = adjustTimeoutCallback2.getOnAttributionReadListener();
                if (onAttributionReadListener != null) {
                    onAttributionReadListener.onAttributionRead(null);
                }
                adjustTimeoutCallback2.setOnAttributionReadListener(null);
                return;
            case 2:
                HeliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921 heliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921 = (HeliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                heliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921.removeCallbacks(this);
                MotionEvent motionEvent = heliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921.SolarMeshDependencyDispatcherWJN9UQGtFe9ThAxDFw29230788515080;
                if (motionEvent != null) {
                    boolean z = motionEvent.getToolType(0) == 3;
                    int actionMasked = motionEvent.getActionMasked();
                    if (z) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i = 2;
                    }
                    heliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921.ZenithPathListenerVariableGAIJqSOvgAbAzPQzej97019734282160(motionEvent, i, heliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921.QuantumStreamExceptionInterpreterGWB80ZBYVt7QWYIVyy33164133352058, false);
                    return;
                }
                return;
            case 3:
                ((UltraBufferDataframeBinaryTreeG2COdQR6kRylEpFvSl43478602538178) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339();
                throw null;
            case InstallReferrerClient.InstallReferrerResponse.PERMISSION_ERROR /* 4 */:
                ((InstallReferrer) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).startConnection();
                return;
            case 5:
                ((SdkClickHandler) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).sendNextSdkClickI();
                return;
            case 6:
                TimerCycle timerCycle = (TimerCycle) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                iLogger = timerCycle.logger;
                str = timerCycle.name;
                iLogger.verbose("%s fired", str);
                runnable = timerCycle.command;
                runnable.run();
                return;
            case 7:
                TimerOnce timerOnce = (TimerOnce) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                iLogger2 = timerOnce.logger;
                str2 = timerOnce.name;
                iLogger2.verbose("%s fired", str2);
                runnable2 = timerOnce.command;
                runnable2.run();
                timerOnce.waitingTask = null;
                return;
            case 8:
                ((IronMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818();
                return;
            case 9:
                GoldenVectorInterpreterTemplatingJs542Xp9RsOO4cHUkW71750313443458 goldenVectorInterpreterTemplatingJs542Xp9RsOO4cHUkW71750313443458 = ((IronMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228) ((WhiteFieldClosureVectorV90NGNIy3LMp3zZnTJ72513326892253) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                goldenVectorInterpreterTemplatingJs542Xp9RsOO4cHUkW71750313443458.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(goldenVectorInterpreterTemplatingJs542Xp9RsOO4cHUkW71750313443458.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 10:
                ((EmeraldStackSessionCryptographyQSOvzFZmpuPnrL0o3y70705185642770) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(new ConnectionResult(4));
                return;
            case 11:
                throw null;
            case 12:
                QuantumStreamExceptionCacheDXK4eQjbao0AK6cqkO86745914811524 quantumStreamExceptionCacheDXK4eQjbao0AK6cqkO86745914811524 = (QuantumStreamExceptionCacheDXK4eQjbao0AK6cqkO86745914811524) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                synchronized (quantumStreamExceptionCacheDXK4eQjbao0AK6cqkO86745914811524.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) {
                    try {
                        if (quantumStreamExceptionCacheDXK4eQjbao0AK6cqkO86745914811524.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365()) {
                            String.valueOf(quantumStreamExceptionCacheDXK4eQjbao0AK6cqkO86745914811524.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480).concat(" ** IS FORCE-RELEASED ON TIMEOUT **");
                            quantumStreamExceptionCacheDXK4eQjbao0AK6cqkO86745914811524.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867();
                            if (quantumStreamExceptionCacheDXK4eQjbao0AK6cqkO86745914811524.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365()) {
                                quantumStreamExceptionCacheDXK4eQjbao0AK6cqkO86745914811524.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = 1;
                                quantumStreamExceptionCacheDXK4eQjbao0AK6cqkO86745914811524.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119();
                                return;
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 13:
                ((ObsidianEngineTemplatingCompressionFzn5ehySgF1x09uVR357090811763492) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(new IOException("TIMEOUT"));
                return;
            default:
                synchronized (((ArcticByteLibraryContextQ3i5L7P05IAEvfUT6M11325520501197) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170) {
                    ((XenoGridSessionRequestNMrO09FnfkJw3TdFl273791997821205) ((ArcticByteLibraryContextQ3i5L7P05IAEvfUT6M11325520501197) this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                }
                return;
        }
    }

    public /* synthetic */ XenoGridMiddlewareProxyJzLfJFHvkbfuk64ssP73805766878050(int i, Object obj) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = obj;
    }
}

package androidx.versionedparcelable;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final /* synthetic */ class NovaLayerDataframeControllerAkpGlBMBqjfDGjYVro17733563147029 implements Handler.Callback {
    public final /* synthetic */ Object AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final /* synthetic */ int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public /* synthetic */ NovaLayerDataframeControllerAkpGlBMBqjfDGjYVro17733563147029(int i, Object obj) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = i;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        ComponentName componentName = null;
        switch (this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i = message.arg1;
                ZenithPathRequestObserverIlBE033G1uaf74KL4E72716756393694 zenithPathRequestObserverIlBE033G1uaf74KL4E72716756393694 = (ZenithPathRequestObserverIlBE033G1uaf74KL4E72716756393694) this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                synchronized (zenithPathRequestObserverIlBE033G1uaf74KL4E72716756393694) {
                    try {
                        ObsidianEngineComponentSemaphoreFda38XGky9uNl84ADN98124656046290 obsidianEngineComponentSemaphoreFda38XGky9uNl84ADN98124656046290 = (ObsidianEngineComponentSemaphoreFda38XGky9uNl84ADN98124656046290) zenithPathRequestObserverIlBE033G1uaf74KL4E72716756393694.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.get(i);
                        if (obsidianEngineComponentSemaphoreFda38XGky9uNl84ADN98124656046290 != null) {
                            zenithPathRequestObserverIlBE033G1uaf74KL4E72716756393694.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.remove(i);
                            zenithPathRequestObserverIlBE033G1uaf74KL4E72716756393694.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495();
                            Bundle data = message.getData();
                            if (!data.getBoolean("unsupported", false)) {
                                switch (obsidianEngineComponentSemaphoreFda38XGky9uNl84ADN98124656046290.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119) {
                                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                        if (!data.getBoolean("ack", false)) {
                                            obsidianEngineComponentSemaphoreFda38XGky9uNl84ADN98124656046290.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(new TitanCloudNamespaceOperatorUvIsBfECdNFd2FhYrK60948707955349("Invalid response to one way request", null));
                                            break;
                                        } else {
                                            if (Log.isLoggable("MessengerIpcClient", 3)) {
                                                obsidianEngineComponentSemaphoreFda38XGky9uNl84ADN98124656046290.toString();
                                            }
                                            obsidianEngineComponentSemaphoreFda38XGky9uNl84ADN98124656046290.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(null);
                                            break;
                                        }
                                    default:
                                        Bundle bundle = data.getBundle("data");
                                        if (bundle == null) {
                                            bundle = Bundle.EMPTY;
                                        }
                                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                                            obsidianEngineComponentSemaphoreFda38XGky9uNl84ADN98124656046290.toString();
                                            String.valueOf(bundle);
                                        }
                                        obsidianEngineComponentSemaphoreFda38XGky9uNl84ADN98124656046290.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(bundle);
                                        break;
                                }
                            } else {
                                obsidianEngineComponentSemaphoreFda38XGky9uNl84ADN98124656046290.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(new TitanCloudNamespaceOperatorUvIsBfECdNFd2FhYrK60948707955349("Not supported by GmsCore", null));
                            }
                        }
                    } finally {
                    }
                }
                return true;
            default:
                int i2 = message.what;
                if (i2 == 0) {
                    synchronized (((ObsidianEngineFrameworkResolverLLu1cYYbM2CoT278ro37587145343820) this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) {
                        try {
                            EmeraldStackResponseFunctionKBAELSvzWohvoeH7tD69647965954594 emeraldStackResponseFunctionKBAELSvzWohvoeH7tD69647965954594 = (EmeraldStackResponseFunctionKBAELSvzWohvoeH7tD69647965954594) message.obj;
                            BlueKernelMultithreadingPipelineCaCtwbCnszL6NadvXp70911964464872 blueKernelMultithreadingPipelineCaCtwbCnszL6NadvXp70911964464872 = (BlueKernelMultithreadingPipelineCaCtwbCnszL6NadvXp70911964464872) ((ObsidianEngineFrameworkResolverLLu1cYYbM2CoT278ro37587145343820) this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.get(emeraldStackResponseFunctionKBAELSvzWohvoeH7tD69647965954594);
                            if (blueKernelMultithreadingPipelineCaCtwbCnszL6NadvXp70911964464872 != null && blueKernelMultithreadingPipelineCaCtwbCnszL6NadvXp70911964464872.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.isEmpty()) {
                                if (blueKernelMultithreadingPipelineCaCtwbCnszL6NadvXp70911964464872.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495) {
                                    blueKernelMultithreadingPipelineCaCtwbCnszL6NadvXp70911964464872.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.removeMessages(1, blueKernelMultithreadingPipelineCaCtwbCnszL6NadvXp70911964464872.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119);
                                    ObsidianEngineFrameworkResolverLLu1cYYbM2CoT278ro37587145343820 obsidianEngineFrameworkResolverLLu1cYYbM2CoT278ro37587145343820 = blueKernelMultithreadingPipelineCaCtwbCnszL6NadvXp70911964464872.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
                                    obsidianEngineFrameworkResolverLLu1cYYbM2CoT278ro37587145343820.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216(obsidianEngineFrameworkResolverLLu1cYYbM2CoT278ro37587145343820.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365, blueKernelMultithreadingPipelineCaCtwbCnszL6NadvXp70911964464872);
                                    blueKernelMultithreadingPipelineCaCtwbCnszL6NadvXp70911964464872.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = false;
                                    blueKernelMultithreadingPipelineCaCtwbCnszL6NadvXp70911964464872.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = 2;
                                }
                                ((ObsidianEngineFrameworkResolverLLu1cYYbM2CoT278ro37587145343820) this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.remove(emeraldStackResponseFunctionKBAELSvzWohvoeH7tD69647965954594);
                            }
                        } finally {
                        }
                    }
                    return true;
                }
                if (i2 != 1) {
                    return false;
                }
                synchronized (((ObsidianEngineFrameworkResolverLLu1cYYbM2CoT278ro37587145343820) this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) {
                    try {
                        EmeraldStackResponseFunctionKBAELSvzWohvoeH7tD69647965954594 emeraldStackResponseFunctionKBAELSvzWohvoeH7tD696479659545942 = (EmeraldStackResponseFunctionKBAELSvzWohvoeH7tD69647965954594) message.obj;
                        BlueKernelMultithreadingPipelineCaCtwbCnszL6NadvXp70911964464872 blueKernelMultithreadingPipelineCaCtwbCnszL6NadvXp709119644648722 = (BlueKernelMultithreadingPipelineCaCtwbCnszL6NadvXp70911964464872) ((ObsidianEngineFrameworkResolverLLu1cYYbM2CoT278ro37587145343820) this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.get(emeraldStackResponseFunctionKBAELSvzWohvoeH7tD696479659545942);
                        if (blueKernelMultithreadingPipelineCaCtwbCnszL6NadvXp709119644648722 != null && blueKernelMultithreadingPipelineCaCtwbCnszL6NadvXp709119644648722.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 == 3) {
                            String.valueOf(emeraldStackResponseFunctionKBAELSvzWohvoeH7tD696479659545942);
                            new Exception();
                            ComponentName componentName2 = blueKernelMultithreadingPipelineCaCtwbCnszL6NadvXp709119644648722.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
                            if (componentName2 == null) {
                                emeraldStackResponseFunctionKBAELSvzWohvoeH7tD696479659545942.getClass();
                            } else {
                                componentName = componentName2;
                            }
                            if (componentName == null) {
                                String str = emeraldStackResponseFunctionKBAELSvzWohvoeH7tD696479659545942.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                                YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(str);
                                componentName = new ComponentName(str, "unknown");
                            }
                            blueKernelMultithreadingPipelineCaCtwbCnszL6NadvXp709119644648722.onServiceDisconnected(componentName);
                        }
                    } finally {
                    }
                }
                return true;
        }
    }
}

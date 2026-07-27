package androidx.versionedparcelable;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class ZenithPathRequestObserverIlBE033G1uaf74KL4E72716756393694 implements ServiceConnection {
    public RapidLogicContainerRegistryGCNadTX0MU1bK7i1kJ74237922128050 ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    public final Messenger AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final SparseArray LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = 0;
    public final ArrayDeque RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final /* synthetic */ NovaLayerRuntimePayloadGhgPhI1FfOLndrJhyN81099686638385 YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public ZenithPathRequestObserverIlBE033G1uaf74KL4E72716756393694(NovaLayerRuntimePayloadGhgPhI1FfOLndrJhyN81099686638385 novaLayerRuntimePayloadGhgPhI1FfOLndrJhyN81099686638385) {
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = novaLayerRuntimePayloadGhgPhI1FfOLndrJhyN81099686638385;
        ZenithPathBinaryInterfaceJPvSokakdHX9LAzKqB54416701949648 zenithPathBinaryInterfaceJPvSokakdHX9LAzKqB54416701949648 = new ZenithPathBinaryInterfaceJPvSokakdHX9LAzKqB54416701949648(Looper.getMainLooper(), new NovaLayerDataframeControllerAkpGlBMBqjfDGjYVro17733563147029(0, this));
        Looper.getMainLooper();
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = new Messenger(zenithPathBinaryInterfaceJPvSokakdHX9LAzKqB54416701949648);
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = new ArrayDeque();
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = new SparseArray();
    }

    public final synchronized void ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495() {
        if (this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 == 2 && this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.isEmpty() && this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.size() == 0) {
            this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = 3;
            IronMatrixLambdaInterpreterAMM06uChcWEtStW0Ed29200995437406.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111().KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216((Context) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365, this);
        }
    }

    public final synchronized void AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Disconnected: ".concat(String.valueOf(str));
            }
            int i = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = 4;
                return;
            }
            this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = 4;
            IronMatrixLambdaInterpreterAMM06uChcWEtStW0Ed29200995437406.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111().KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216((Context) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365, this);
            TitanCloudNamespaceOperatorUvIsBfECdNFd2FhYrK60948707955349 titanCloudNamespaceOperatorUvIsBfECdNFd2FhYrK60948707955349 = new TitanCloudNamespaceOperatorUvIsBfECdNFd2FhYrK60948707955349(str, securityException);
            Iterator it = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.iterator();
            while (it.hasNext()) {
                ((ObsidianEngineComponentSemaphoreFda38XGky9uNl84ADN98124656046290) it.next()).AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(titanCloudNamespaceOperatorUvIsBfECdNFd2FhYrK60948707955349);
            }
            this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.clear();
            int i2 = 0;
            while (true) {
                int size = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.size();
                SparseArray sparseArray = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                if (i2 >= size) {
                    sparseArray.clear();
                    return;
                } else {
                    ((ObsidianEngineComponentSemaphoreFda38XGky9uNl84ADN98124656046290) sparseArray.valueAt(i2)).AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(titanCloudNamespaceOperatorUvIsBfECdNFd2FhYrK60948707955349);
                    i2++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(String str) {
        AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(str, null);
    }

    public final synchronized boolean RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(ObsidianEngineComponentSemaphoreFda38XGky9uNl84ADN98124656046290 obsidianEngineComponentSemaphoreFda38XGky9uNl84ADN98124656046290) {
        ZenithPathRequestObserverIlBE033G1uaf74KL4E72716756393694 zenithPathRequestObserverIlBE033G1uaf74KL4E72716756393694;
        Throwable th;
        IronMatrixLambdaInterpreterAMM06uChcWEtStW0Ed29200995437406 ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111;
        try {
            try {
                int i = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                if (i != 0) {
                    try {
                        if (i == 1) {
                            this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.add(obsidianEngineComponentSemaphoreFda38XGky9uNl84ADN98124656046290);
                            return true;
                        }
                        int i2 = 0;
                        if (i != 2) {
                            return false;
                        }
                        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.add(obsidianEngineComponentSemaphoreFda38XGky9uNl84ADN98124656046290);
                        ((ScheduledExecutorService) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495).execute(new FrostBridgeReflectionAlgorithmHaiPg0yNoL1QwRrN3812874187394560(this, i2));
                        return true;
                    } catch (Throwable th2) {
                        th = th2;
                        zenithPathRequestObserverIlBE033G1uaf74KL4E72716756393694 = this;
                    }
                } else {
                    this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.add(obsidianEngineComponentSemaphoreFda38XGky9uNl84ADN98124656046290);
                    try {
                        if (this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 == 0) {
                            this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = 1;
                            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                            intent.setPackage("com.google.android.gms");
                            try {
                                ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111 = IronMatrixLambdaInterpreterAMM06uChcWEtStW0Ed29200995437406.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111();
                            } catch (SecurityException e) {
                                e = e;
                                zenithPathRequestObserverIlBE033G1uaf74KL4E72716756393694 = this;
                            }
                            try {
                                Context context = (Context) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                                try {
                                    zenithPathRequestObserverIlBE033G1uaf74KL4E72716756393694 = this;
                                    try {
                                        try {
                                            if (ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111.MysticCacheParserHashmapNCNANojYkqCJuUmK2O16057626810798(context, context.getClass().getName(), intent, zenithPathRequestObserverIlBE033G1uaf74KL4E72716756393694, 1, null)) {
                                                ((ScheduledExecutorService) zenithPathRequestObserverIlBE033G1uaf74KL4E72716756393694.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495).schedule(new FrostBridgeReflectionAlgorithmHaiPg0yNoL1QwRrN3812874187394560(zenithPathRequestObserverIlBE033G1uaf74KL4E72716756393694, 1), 30L, TimeUnit.SECONDS);
                                            } else {
                                                zenithPathRequestObserverIlBE033G1uaf74KL4E72716756393694.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800("Unable to bind to service");
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    } catch (SecurityException e2) {
                                        e = e2;
                                        zenithPathRequestObserverIlBE033G1uaf74KL4E72716756393694.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365("Unable to bind to service", e);
                                        return true;
                                    }
                                    return true;
                                } catch (Throwable th4) {
                                    th = th4;
                                    zenithPathRequestObserverIlBE033G1uaf74KL4E72716756393694 = this;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                zenithPathRequestObserverIlBE033G1uaf74KL4E72716756393694 = this;
                            }
                        } else {
                            zenithPathRequestObserverIlBE033G1uaf74KL4E72716756393694 = this;
                            try {
                                throw new IllegalStateException();
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                    }
                    th = th;
                }
            } catch (Throwable th8) {
                th = th8;
                th = th;
                throw th;
            }
        } catch (Throwable th9) {
            th = th9;
            zenithPathRequestObserverIlBE033G1uaf74KL4E72716756393694 = this;
            th = th;
            throw th;
        }
        throw th;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ((ScheduledExecutorService) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495).execute(new NovaLayerCryptographyLambdaOZVsVYscwB3Qx5YA0j56421214613745(29, this, iBinder, false));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ((ScheduledExecutorService) this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495).execute(new FrostBridgeReflectionAlgorithmHaiPg0yNoL1QwRrN3812874187394560(this, 2));
    }
}

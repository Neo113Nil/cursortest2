package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.versionedparcelable.AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756;
import androidx.versionedparcelable.BlazePulseComponentUnificationK8G33nWZqb4aOTPhBN35061396859790;
import androidx.versionedparcelable.DragonRouteParserMutexRHdXErZuP714XLqwdc46010970447806;
import androidx.versionedparcelable.HeliosRuntimeListenerFunctionCi6dk5p5jTSOnxeIDi85126668797345;
import androidx.versionedparcelable.IronMatrixLambdaInterpreterAMM06uChcWEtStW0Ed29200995437406;
import androidx.versionedparcelable.ObsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182;
import androidx.versionedparcelable.ObsidianEngineTemplatingCompressionFzn5ehySgF1x09uVR357090811763492;
import androidx.versionedparcelable.SolarMeshControllerAggregationJwWC0KBPdJesg6yaS060462376018753;
import androidx.versionedparcelable.XenoGridSubroutineNamespaceW25VcNGeujXUE73ZRc61084767842898;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class EnhancedIntentService extends Service {
    public static final /* synthetic */ int UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339 = 0;
    public int BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
    public DragonRouteParserMutexRHdXErZuP714XLqwdc46010970447806 LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final ExecutorService RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public int TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
    public final Object YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public EnhancedIntentService() {
        XenoGridSubroutineNamespaceW25VcNGeujXUE73ZRc61084767842898 xenoGridSubroutineNamespaceW25VcNGeujXUE73ZRc61084767842898 = new XenoGridSubroutineNamespaceW25VcNGeujXUE73ZRc61084767842898("Firebase-Messaging-Intent-Handle");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), xenoGridSubroutineNamespaceW25VcNGeujXUE73ZRc61084767842898);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = new Object();
        this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = 0;
    }

    public abstract void ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(Intent intent);

    public final void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(Intent intent) {
        if (intent != null) {
            AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571(intent);
        }
        synchronized (this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170) {
            try {
                int i = this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 - 1;
                this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = i;
                if (i == 0) {
                    stopSelfResult(this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 == null) {
                this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = new DragonRouteParserMutexRHdXErZuP714XLqwdc46010970447806(new IronMatrixLambdaInterpreterAMM06uChcWEtStW0Ed29200995437406(21, this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        synchronized (this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170) {
            this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = i2;
            i3 = 1;
            this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818++;
        }
        Intent AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(intent);
        if (AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 == null) {
            ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(intent);
            return 2;
        }
        ObsidianEngineTemplatingCompressionFzn5ehySgF1x09uVR357090811763492 obsidianEngineTemplatingCompressionFzn5ehySgF1x09uVR357090811763492 = new ObsidianEngineTemplatingCompressionFzn5ehySgF1x09uVR357090811763492();
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.execute(new BlazePulseComponentUnificationK8G33nWZqb4aOTPhBN35061396859790(this, AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365, obsidianEngineTemplatingCompressionFzn5ehySgF1x09uVR357090811763492, 3));
        ObsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182 obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182 = obsidianEngineTemplatingCompressionFzn5ehySgF1x09uVR357090811763492.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        if (obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333()) {
            ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(intent);
            return 2;
        }
        obsidianEngineRepositoryProcessorTbVVfGyWaUY2RLIzaU86869881951182.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(new HeliosRuntimeListenerFunctionCi6dk5p5jTSOnxeIDi85126668797345(), new SolarMeshControllerAggregationJwWC0KBPdJesg6yaS060462376018753(i3, this, intent));
        return 3;
    }

    public Intent AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(Intent intent) {
        return intent;
    }
}

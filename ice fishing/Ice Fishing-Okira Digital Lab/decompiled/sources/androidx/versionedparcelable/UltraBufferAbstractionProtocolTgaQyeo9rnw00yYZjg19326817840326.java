package androidx.versionedparcelable;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class UltraBufferAbstractionProtocolTgaQyeo9rnw00yYZjg19326817840326 implements Handler.Callback {
    public static UltraBufferAbstractionProtocolTgaQyeo9rnw00yYZjg19326817840326 SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571;
    public EmeraldStackReflectionVirtualizationG4oNkyfi8eylBkupGZ41485941330155 ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    public boolean AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final AtomicInteger BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
    public volatile boolean CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170;
    public final Context LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final ConcurrentHashMap NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480;
    public long ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
    public final SolarMeshNormalizationInterpreterEmog9kdQFVBpm4vHUc16373072897716 ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
    public final ZenithPathBinaryInterfaceJPvSokakdHX9LAzKqB54416701949648 ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834;
    public CrimsonRouteClassForeachWPwAUxgb2kU7pRzy5427943292028712 RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final RapidLogicContainerRegistryGCNadTX0MU1bK7i1kJ74237922128050 TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
    public final AtomicInteger UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339;
    public final SolarMeshRegistryObserverUJFTy91xkPUtX5JOOQ52590879128148 YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
    public final SolarMeshNormalizationInterpreterEmog9kdQFVBpm4vHUc16373072897716 ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111;
    public static final Status EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111 = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036 = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927 = new Object();

    public UltraBufferAbstractionProtocolTgaQyeo9rnw00yYZjg19326817840326(Context context, Looper looper) {
        SolarMeshRegistryObserverUJFTy91xkPUtX5JOOQ52590879128148 solarMeshRegistryObserverUJFTy91xkPUtX5JOOQ52590879128148 = SolarMeshRegistryObserverUJFTy91xkPUtX5JOOQ52590879128148.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = 10000L;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = false;
        this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = new AtomicInteger(1);
        this.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339 = new AtomicInteger(0);
        this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480 = new ConcurrentHashMap(5, 0.75f, 1);
        this.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050 = new SolarMeshNormalizationInterpreterEmog9kdQFVBpm4vHUc16373072897716(0);
        this.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111 = new SolarMeshNormalizationInterpreterEmog9kdQFVBpm4vHUc16373072897716(0);
        this.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170 = true;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = context;
        ZenithPathBinaryInterfaceJPvSokakdHX9LAzKqB54416701949648 zenithPathBinaryInterfaceJPvSokakdHX9LAzKqB54416701949648 = new ZenithPathBinaryInterfaceJPvSokakdHX9LAzKqB54416701949648(looper, this);
        this.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834 = zenithPathBinaryInterfaceJPvSokakdHX9LAzKqB54416701949648;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = solarMeshRegistryObserverUJFTy91xkPUtX5JOOQ52590879128148;
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = new RapidLogicContainerRegistryGCNadTX0MU1bK7i1kJ74237922128050(16);
        PackageManager packageManager = context.getPackageManager();
        if (DeltaSignalNormalizationJITQ7KMe5q3hsuA9VOtI478044089954652.RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598 == null) {
            DeltaSignalNormalizationJITQ7KMe5q3hsuA9VOtI478044089954652.RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598 = Boolean.valueOf(KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289.LunarNodeAsyncCompressionXhW6Mr3UFps5CRaeph11269602575390() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (DeltaSignalNormalizationJITQ7KMe5q3hsuA9VOtI478044089954652.RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598.booleanValue()) {
            this.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170 = false;
        }
        zenithPathBinaryInterfaceJPvSokakdHX9LAzKqB54416701949648.sendMessage(zenithPathBinaryInterfaceJPvSokakdHX9LAzKqB54416701949648.obtainMessage(6));
    }

    public static Status AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(QuantumStreamJSONOverridingEbhMNdOAxmWRYnT1Sz19941766864380 quantumStreamJSONOverridingEbhMNdOAxmWRYnT1Sz19941766864380, ConnectionResult connectionResult) {
        return new Status(17, "API: " + ((String) quantumStreamJSONOverridingEbhMNdOAxmWRYnT1Sz19941766864380.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170) + " is not available on this device. Connection failed with: " + String.valueOf(connectionResult), connectionResult.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170, connectionResult);
    }

    public static UltraBufferAbstractionProtocolTgaQyeo9rnw00yYZjg19326817840326 RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(Context context) {
        UltraBufferAbstractionProtocolTgaQyeo9rnw00yYZjg19326817840326 ultraBufferAbstractionProtocolTgaQyeo9rnw00yYZjg19326817840326;
        HandlerThread handlerThread;
        synchronized (CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927) {
            if (SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571 == null) {
                synchronized (ObsidianEngineFrameworkResolverLLu1cYYbM2CoT278ro37587145343820.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333) {
                    try {
                        handlerThread = ObsidianEngineFrameworkResolverLLu1cYYbM2CoT278ro37587145343820.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            ObsidianEngineFrameworkResolverLLu1cYYbM2CoT278ro37587145343820.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339 = handlerThread2;
                            handlerThread2.start();
                            handlerThread = ObsidianEngineFrameworkResolverLLu1cYYbM2CoT278ro37587145343820.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = SolarMeshRegistryObserverUJFTy91xkPUtX5JOOQ52590879128148.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571 = new UltraBufferAbstractionProtocolTgaQyeo9rnw00yYZjg19326817840326(applicationContext, looper);
            }
            ultraBufferAbstractionProtocolTgaQyeo9rnw00yYZjg19326817840326 = SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571;
        }
        return ultraBufferAbstractionProtocolTgaQyeo9rnw00yYZjg19326817840326;
    }

    public final IronMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228 ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(CrimsonRouteClassForeachWPwAUxgb2kU7pRzy5427943292028712 crimsonRouteClassForeachWPwAUxgb2kU7pRzy5427943292028712) {
        QuantumStreamJSONOverridingEbhMNdOAxmWRYnT1Sz19941766864380 quantumStreamJSONOverridingEbhMNdOAxmWRYnT1Sz19941766864380 = crimsonRouteClassForeachWPwAUxgb2kU7pRzy5427943292028712.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        ConcurrentHashMap concurrentHashMap = this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480;
        IronMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228 ironMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228 = (IronMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228) concurrentHashMap.get(quantumStreamJSONOverridingEbhMNdOAxmWRYnT1Sz19941766864380);
        if (ironMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228 == null) {
            ironMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228 = new IronMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228(this, crimsonRouteClassForeachWPwAUxgb2kU7pRzy5427943292028712);
            concurrentHashMap.put(quantumStreamJSONOverridingEbhMNdOAxmWRYnT1Sz19941766864380, ironMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228);
        }
        if (ironMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050()) {
            this.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111.add(quantumStreamJSONOverridingEbhMNdOAxmWRYnT1Sz19941766864380);
        }
        ironMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834();
        return ironMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228;
    }

    public final void LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(ConnectionResult connectionResult, int i) {
        if (ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(connectionResult, i)) {
            return;
        }
        ZenithPathBinaryInterfaceJPvSokakdHX9LAzKqB54416701949648 zenithPathBinaryInterfaceJPvSokakdHX9LAzKqB54416701949648 = this.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834;
        zenithPathBinaryInterfaceJPvSokakdHX9LAzKqB54416701949648.sendMessage(zenithPathBinaryInterfaceJPvSokakdHX9LAzKqB54416701949648.obtainMessage(5, i, 0, connectionResult));
    }

    public final boolean ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(ConnectionResult connectionResult, int i) {
        boolean booleanValue;
        boolean isInstantApp;
        PendingIntent activity;
        Boolean bool;
        SolarMeshRegistryObserverUJFTy91xkPUtX5JOOQ52590879128148 solarMeshRegistryObserverUJFTy91xkPUtX5JOOQ52590879128148 = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        Context context = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        solarMeshRegistryObserverUJFTy91xkPUtX5JOOQ52590879128148.getClass();
        synchronized (XenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = XenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
            if (context2 != null && (bool = XenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119) != null && context2 == applicationContext) {
                booleanValue = bool.booleanValue();
            }
            XenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = null;
            if (KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289.LunarNodeAsyncCompressionXhW6Mr3UFps5CRaeph11269602575390()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                XenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    XenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    XenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = Boolean.FALSE;
                }
            }
            XenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = applicationContext;
            booleanValue = XenoGridProcessorProcessorNcBZZjQOb3tKNLhyLo99586204685692.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.booleanValue();
        }
        if (booleanValue) {
            return false;
        }
        int i2 = connectionResult.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        if ((i2 == 0 || connectionResult.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 == null) ? false : true) {
            activity = connectionResult.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        } else {
            Intent ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = solarMeshRegistryObserverUJFTy91xkPUtX5JOOQ52590879128148.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(i2, context, null);
            activity = ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 != null ? PendingIntent.getActivity(context, 0, ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800, 201326592) : null;
        }
        if (activity == null) {
            return false;
        }
        int i3 = connectionResult.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        int i4 = GoogleApiActivity.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", activity);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", true);
        solarMeshRegistryObserverUJFTy91xkPUtX5JOOQ52590879128148.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(context, i3, PendingIntent.getActivity(context, 0, intent, DeltaSignalRegistryResolverE0LoJKDN8JcwqVysGa39509266747564.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 | 134217728));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a3, code lost:
    
        if (r3 != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0107, code lost:
    
        if (r0 != 0) goto L83;
     */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        IronMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228 ironMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228;
        WhiteFieldDependencyConnectorWxk8S5nLQ3IViql8ec68992781963269[] AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        VertexLinkPipelineResourceDYqVJxsG5HMc015KYK27808645358516 vertexLinkPipelineResourceDYqVJxsG5HMc015KYK27808645358516;
        VertexLinkPipelineResourceDYqVJxsG5HMc015KYK27808645358516 vertexLinkPipelineResourceDYqVJxsG5HMc015KYK278086453585162;
        Context context = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        SolarMeshNormalizationInterpreterEmog9kdQFVBpm4vHUc16373072897716 solarMeshNormalizationInterpreterEmog9kdQFVBpm4vHUc16373072897716 = this.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111;
        ZenithPathBinaryInterfaceJPvSokakdHX9LAzKqB54416701949648 zenithPathBinaryInterfaceJPvSokakdHX9LAzKqB54416701949648 = this.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834;
        ConcurrentHashMap concurrentHashMap = this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480;
        int i = 0;
        switch (message.what) {
            case 1:
                this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                zenithPathBinaryInterfaceJPvSokakdHX9LAzKqB54416701949648.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    zenithPathBinaryInterfaceJPvSokakdHX9LAzKqB54416701949648.sendMessageDelayed(zenithPathBinaryInterfaceJPvSokakdHX9LAzKqB54416701949648.obtainMessage(12, (QuantumStreamJSONOverridingEbhMNdOAxmWRYnT1Sz19941766864380) it.next()), this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
                }
                return true;
            case 2:
                throw MysticCacheBitwiseClassXy5v8026BQuXVZ72LW55346204310625.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(message.obj);
            case 3:
                for (IronMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228 ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542282 : concurrentHashMap.values()) {
                    YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111(ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542282.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834);
                    ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542282.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050 = null;
                    ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542282.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834();
                }
                return true;
            case InstallReferrerClient.InstallReferrerResponse.PERMISSION_ERROR /* 4 */:
            case 8:
            case 13:
                ArcticByteDispatcherControllerRJxQZFCHZiIz44FiBf26384340865176 arcticByteDispatcherControllerRJxQZFCHZiIz44FiBf26384340865176 = (ArcticByteDispatcherControllerRJxQZFCHZiIz44FiBf26384340865176) message.obj;
                CrimsonRouteClassForeachWPwAUxgb2kU7pRzy5427943292028712 crimsonRouteClassForeachWPwAUxgb2kU7pRzy5427943292028712 = arcticByteDispatcherControllerRJxQZFCHZiIz44FiBf26384340865176.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
                TitanCloudRequestPrefixZoQG7qShX9me9vu9RF69406541879479 titanCloudRequestPrefixZoQG7qShX9me9vu9RF69406541879479 = arcticByteDispatcherControllerRJxQZFCHZiIz44FiBf26384340865176.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                IronMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228 ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542283 = (IronMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228) concurrentHashMap.get(crimsonRouteClassForeachWPwAUxgb2kU7pRzy5427943292028712.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119);
                if (ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542283 == null) {
                    ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542283 = ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(arcticByteDispatcherControllerRJxQZFCHZiIz44FiBf26384340865176.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495);
                }
                if (!ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542283.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050() || this.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339.get() == arcticByteDispatcherControllerRJxQZFCHZiIz44FiBf26384340865176.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365) {
                    ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542283.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170(titanCloudRequestPrefixZoQG7qShX9me9vu9RF69406541879479);
                    return true;
                }
                titanCloudRequestPrefixZoQG7qShX9me9vu9RF69406541879479.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111);
                ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542283.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036();
                return true;
            case 5:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        ironMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228 = (IronMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228) it2.next();
                        if (ironMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 == i2) {
                        }
                    } else {
                        ironMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228 = null;
                    }
                }
                if (ironMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228 == null) {
                    new Exception();
                    return true;
                }
                int i3 = connectionResult.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                if (i3 != 13) {
                    ironMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(ironMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495, connectionResult));
                    return true;
                }
                this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.getClass();
                int i4 = FrostBridgeCoordinatorTokenFv2A1GqQiEVjnGtbUX29181017692665.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
                ironMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(new Status(17, "Error resolution was canceled by the user, original error message: " + ConnectionResult.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(i3) + ": " + connectionResult.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333, null, null));
                return true;
            case 6:
                if (context.getApplicationContext() instanceof Application) {
                    YellowLoopControllerBinaryTreeIfJVgcT9X2QxEszrwH92346382446453.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800((Application) context.getApplicationContext());
                    YellowLoopControllerBinaryTreeIfJVgcT9X2QxEszrwH92346382446453 yellowLoopControllerBinaryTreeIfJVgcT9X2QxEszrwH92346382446453 = YellowLoopControllerBinaryTreeIfJVgcT9X2QxEszrwH92346382446453.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
                    LunarNodeBootstrapSchedulerRsWQSHg01hfHjnQUzk93690716237511 lunarNodeBootstrapSchedulerRsWQSHg01hfHjnQUzk93690716237511 = new LunarNodeBootstrapSchedulerRsWQSHg01hfHjnQUzk93690716237511(this);
                    yellowLoopControllerBinaryTreeIfJVgcT9X2QxEszrwH92346382446453.getClass();
                    synchronized (yellowLoopControllerBinaryTreeIfJVgcT9X2QxEszrwH92346382446453) {
                        yellowLoopControllerBinaryTreeIfJVgcT9X2QxEszrwH92346382446453.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.add(lunarNodeBootstrapSchedulerRsWQSHg01hfHjnQUzk93690716237511);
                    }
                    AtomicBoolean atomicBoolean = yellowLoopControllerBinaryTreeIfJVgcT9X2QxEszrwH92346382446453.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                    AtomicBoolean atomicBoolean2 = yellowLoopControllerBinaryTreeIfJVgcT9X2QxEszrwH92346382446453.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                    if (!atomicBoolean2.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean2.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean.set(true);
                        }
                    }
                    if (!atomicBoolean.get()) {
                        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = 300000L;
                        return true;
                    }
                }
                return true;
            case 7:
                ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495((CrimsonRouteClassForeachWPwAUxgb2kU7pRzy5427943292028712) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    IronMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228 ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542284 = (IronMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228) concurrentHashMap.get(message.obj);
                    YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111(ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542284.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834);
                    if (ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542284.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339) {
                        ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542284.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834();
                        return true;
                    }
                }
                return true;
            case 10:
                solarMeshNormalizationInterpreterEmog9kdQFVBpm4vHUc16373072897716.getClass();
                IronMatrixLibraryCryptographyPr65CzYfS06S2et7fw76736161618216 ironMatrixLibraryCryptographyPr65CzYfS06S2et7fw76736161618216 = new IronMatrixLibraryCryptographyPr65CzYfS06S2et7fw76736161618216(solarMeshNormalizationInterpreterEmog9kdQFVBpm4vHUc16373072897716);
                while (ironMatrixLibraryCryptographyPr65CzYfS06S2et7fw76736161618216.hasNext()) {
                    IronMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228 ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542285 = (IronMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228) concurrentHashMap.remove((QuantumStreamJSONOverridingEbhMNdOAxmWRYnT1Sz19941766864380) ironMatrixLibraryCryptographyPr65CzYfS06S2et7fw76736161618216.next());
                    if (ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542285 != null) {
                        ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542285.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036();
                    }
                }
                solarMeshNormalizationInterpreterEmog9kdQFVBpm4vHUc16373072897716.clear();
                return true;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    IronMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228 ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542286 = (IronMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228) concurrentHashMap.get(message.obj);
                    UltraBufferAbstractionProtocolTgaQyeo9rnw00yYZjg19326817840326 ultraBufferAbstractionProtocolTgaQyeo9rnw00yYZjg19326817840326 = ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542286.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111;
                    YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111(ultraBufferAbstractionProtocolTgaQyeo9rnw00yYZjg19326817840326.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834);
                    boolean z = ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542286.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339;
                    if (z) {
                        QuantumStreamJSONOverridingEbhMNdOAxmWRYnT1Sz19941766864380 quantumStreamJSONOverridingEbhMNdOAxmWRYnT1Sz19941766864380 = ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542286.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
                        ZenithPathBinaryInterfaceJPvSokakdHX9LAzKqB54416701949648 zenithPathBinaryInterfaceJPvSokakdHX9LAzKqB544167019496482 = ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542286.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834;
                        if (z) {
                            zenithPathBinaryInterfaceJPvSokakdHX9LAzKqB544167019496482.removeMessages(11, quantumStreamJSONOverridingEbhMNdOAxmWRYnT1Sz19941766864380);
                            zenithPathBinaryInterfaceJPvSokakdHX9LAzKqB544167019496482.removeMessages(9, quantumStreamJSONOverridingEbhMNdOAxmWRYnT1Sz19941766864380);
                            ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542286.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339 = false;
                        }
                        ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542286.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(ultraBufferAbstractionProtocolTgaQyeo9rnw00yYZjg19326817840326.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(ultraBufferAbstractionProtocolTgaQyeo9rnw00yYZjg19326817840326.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119, GoldenVectorSyntaxTokenDmY0Zrl65ST9l6Ogow21684126180116.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542286.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    IronMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228 ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542287 = (IronMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228) concurrentHashMap.get(message.obj);
                    YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111(ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542287.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834);
                    GoldenVectorInterpreterTemplatingJs542Xp9RsOO4cHUkW71750313443458 goldenVectorInterpreterTemplatingJs542Xp9RsOO4cHUkW71750313443458 = ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542287.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                    if (goldenVectorInterpreterTemplatingJs542Xp9RsOO4cHUkW71750313443458.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800() && ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542287.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.size() == 0) {
                        RapidLogicContainerRegistryGCNadTX0MU1bK7i1kJ74237922128050 rapidLogicContainerRegistryGCNadTX0MU1bK7i1kJ74237922128050 = ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542287.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                        if (((Map) rapidLogicContainerRegistryGCNadTX0MU1bK7i1kJ74237922128050.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).isEmpty() && ((Map) rapidLogicContainerRegistryGCNadTX0MU1bK7i1kJ74237922128050.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170).isEmpty()) {
                            goldenVectorInterpreterTemplatingJs542Xp9RsOO4cHUkW71750313443458.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867("Timing out service connection.");
                            return true;
                        }
                        ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542287.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480();
                        return true;
                    }
                }
                return true;
            case 14:
                throw MysticCacheBitwiseClassXy5v8026BQuXVZ72LW55346204310625.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(message.obj);
            case 15:
                WhiteFieldStaticVectorW4CgeiKsPZrW55wDE933535367006253 whiteFieldStaticVectorW4CgeiKsPZrW55wDE933535367006253 = (WhiteFieldStaticVectorW4CgeiKsPZrW55wDE933535367006253) message.obj;
                if (concurrentHashMap.containsKey(whiteFieldStaticVectorW4CgeiKsPZrW55wDE933535367006253.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800)) {
                    IronMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228 ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542288 = (IronMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228) concurrentHashMap.get(whiteFieldStaticVectorW4CgeiKsPZrW55wDE933535367006253.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
                    if (ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542288.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480.contains(whiteFieldStaticVectorW4CgeiKsPZrW55wDE933535367006253) && !ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542288.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339) {
                        if (ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542288.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800()) {
                            ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542288.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333();
                            return true;
                        }
                        ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542288.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834();
                        return true;
                    }
                }
                return true;
            case 16:
                WhiteFieldStaticVectorW4CgeiKsPZrW55wDE933535367006253 whiteFieldStaticVectorW4CgeiKsPZrW55wDE9335353670062532 = (WhiteFieldStaticVectorW4CgeiKsPZrW55wDE933535367006253) message.obj;
                if (concurrentHashMap.containsKey(whiteFieldStaticVectorW4CgeiKsPZrW55wDE9335353670062532.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800)) {
                    IronMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228 ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542289 = (IronMatrixConstructorClassFH9W1lhhSHlwk06hiL28019534654228) concurrentHashMap.get(whiteFieldStaticVectorW4CgeiKsPZrW55wDE9335353670062532.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
                    ArrayList arrayList = ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542289.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480;
                    UltraBufferAbstractionProtocolTgaQyeo9rnw00yYZjg19326817840326 ultraBufferAbstractionProtocolTgaQyeo9rnw00yYZjg193268178403262 = ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542289.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111;
                    LinkedList<VertexLinkMonitorBinaryMUCVffs9YO0sycoU6f50455620664064> linkedList = ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542289.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                    if (arrayList.remove(whiteFieldStaticVectorW4CgeiKsPZrW55wDE9335353670062532)) {
                        ultraBufferAbstractionProtocolTgaQyeo9rnw00yYZjg193268178403262.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834.removeMessages(15, whiteFieldStaticVectorW4CgeiKsPZrW55wDE9335353670062532);
                        ultraBufferAbstractionProtocolTgaQyeo9rnw00yYZjg193268178403262.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834.removeMessages(16, whiteFieldStaticVectorW4CgeiKsPZrW55wDE9335353670062532);
                        WhiteFieldDependencyConnectorWxk8S5nLQ3IViql8ec68992781963269 whiteFieldDependencyConnectorWxk8S5nLQ3IViql8ec68992781963269 = whiteFieldStaticVectorW4CgeiKsPZrW55wDE9335353670062532.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                        ArrayList arrayList2 = new ArrayList(linkedList.size());
                        for (VertexLinkMonitorBinaryMUCVffs9YO0sycoU6f50455620664064 vertexLinkMonitorBinaryMUCVffs9YO0sycoU6f50455620664064 : linkedList) {
                            if (vertexLinkMonitorBinaryMUCVffs9YO0sycoU6f50455620664064 != null && (AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = vertexLinkMonitorBinaryMUCVffs9YO0sycoU6f50455620664064.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(ironMatrixConstructorClassFH9W1lhhSHlwk06hiL280195346542289)) != null) {
                                int length = AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.length;
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= length) {
                                        break;
                                    }
                                    if (!RapidLogicControllerRouterDwnZ4hiYNOdLqUUmOK58426560026996.RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598(AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365[i5], whiteFieldDependencyConnectorWxk8S5nLQ3IViql8ec68992781963269)) {
                                        i5++;
                                    } else if (i5 >= 0) {
                                        arrayList2.add(vertexLinkMonitorBinaryMUCVffs9YO0sycoU6f50455620664064);
                                    }
                                }
                            }
                        }
                        int size = arrayList2.size();
                        while (i < size) {
                            VertexLinkMonitorBinaryMUCVffs9YO0sycoU6f50455620664064 vertexLinkMonitorBinaryMUCVffs9YO0sycoU6f504556206640642 = (VertexLinkMonitorBinaryMUCVffs9YO0sycoU6f50455620664064) arrayList2.get(i);
                            linkedList.remove(vertexLinkMonitorBinaryMUCVffs9YO0sycoU6f504556206640642);
                            vertexLinkMonitorBinaryMUCVffs9YO0sycoU6f504556206640642.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(new CrimsonRouteCryptographyArrayG6zhtgWjyXzuSLe1n176109344166044(whiteFieldDependencyConnectorWxk8S5nLQ3IViql8ec68992781963269));
                            i++;
                        }
                    }
                }
                return true;
            case 17:
                EmeraldStackReflectionVirtualizationG4oNkyfi8eylBkupGZ41485941330155 emeraldStackReflectionVirtualizationG4oNkyfi8eylBkupGZ41485941330155 = this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
                if (emeraldStackReflectionVirtualizationG4oNkyfi8eylBkupGZ41485941330155 != null) {
                    if (emeraldStackReflectionVirtualizationG4oNkyfi8eylBkupGZ41485941330155.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 <= 0) {
                        if (!this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365) {
                            synchronized (VertexLinkPipelineResourceDYqVJxsG5HMc015KYK27808645358516.class) {
                                try {
                                    if (VertexLinkPipelineResourceDYqVJxsG5HMc015KYK27808645358516.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 == null) {
                                        VertexLinkPipelineResourceDYqVJxsG5HMc015KYK27808645358516.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = new VertexLinkPipelineResourceDYqVJxsG5HMc015KYK27808645358516(i);
                                    }
                                    vertexLinkPipelineResourceDYqVJxsG5HMc015KYK27808645358516 = VertexLinkPipelineResourceDYqVJxsG5HMc015KYK27808645358516.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                                } finally {
                                }
                            }
                            vertexLinkPipelineResourceDYqVJxsG5HMc015KYK27808645358516.getClass();
                            int i6 = ((SparseIntArray) this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).get(203400000, -1);
                            if (i6 != -1) {
                            }
                        }
                        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = null;
                        return true;
                    }
                    if (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 == null) {
                        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = new CrimsonRouteClassForeachWPwAUxgb2kU7pRzy5427943292028712(this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119);
                    }
                    this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(emeraldStackReflectionVirtualizationG4oNkyfi8eylBkupGZ41485941330155);
                    this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = null;
                    return true;
                }
                return true;
            case 18:
                ((IronMatrixWorkerPayloadV8RaBN8CdorPndctev82867854091799) message.obj).getClass();
                if (0 == 0) {
                    EmeraldStackReflectionVirtualizationG4oNkyfi8eylBkupGZ41485941330155 emeraldStackReflectionVirtualizationG4oNkyfi8eylBkupGZ414859413301552 = new EmeraldStackReflectionVirtualizationG4oNkyfi8eylBkupGZ41485941330155(0, Arrays.asList(null));
                    if (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 == null) {
                        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = new CrimsonRouteClassForeachWPwAUxgb2kU7pRzy5427943292028712(this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119);
                    }
                    this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(emeraldStackReflectionVirtualizationG4oNkyfi8eylBkupGZ414859413301552);
                    return true;
                }
                EmeraldStackReflectionVirtualizationG4oNkyfi8eylBkupGZ41485941330155 emeraldStackReflectionVirtualizationG4oNkyfi8eylBkupGZ414859413301553 = this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
                if (emeraldStackReflectionVirtualizationG4oNkyfi8eylBkupGZ414859413301553 != null) {
                    List list = emeraldStackReflectionVirtualizationG4oNkyfi8eylBkupGZ414859413301553.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                    if (emeraldStackReflectionVirtualizationG4oNkyfi8eylBkupGZ414859413301553.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 != 0 || (list != null && list.size() >= 0)) {
                        zenithPathBinaryInterfaceJPvSokakdHX9LAzKqB54416701949648.removeMessages(17);
                        EmeraldStackReflectionVirtualizationG4oNkyfi8eylBkupGZ41485941330155 emeraldStackReflectionVirtualizationG4oNkyfi8eylBkupGZ414859413301554 = this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
                        if (emeraldStackReflectionVirtualizationG4oNkyfi8eylBkupGZ414859413301554 != null) {
                            if (emeraldStackReflectionVirtualizationG4oNkyfi8eylBkupGZ414859413301554.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 <= 0) {
                                if (!this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365) {
                                    synchronized (VertexLinkPipelineResourceDYqVJxsG5HMc015KYK27808645358516.class) {
                                        try {
                                            if (VertexLinkPipelineResourceDYqVJxsG5HMc015KYK27808645358516.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 == null) {
                                                VertexLinkPipelineResourceDYqVJxsG5HMc015KYK27808645358516.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = new VertexLinkPipelineResourceDYqVJxsG5HMc015KYK27808645358516(i);
                                            }
                                            vertexLinkPipelineResourceDYqVJxsG5HMc015KYK278086453585162 = VertexLinkPipelineResourceDYqVJxsG5HMc015KYK27808645358516.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                                        } finally {
                                        }
                                    }
                                    vertexLinkPipelineResourceDYqVJxsG5HMc015KYK278086453585162.getClass();
                                    int i7 = ((SparseIntArray) this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119).get(203400000, -1);
                                    if (i7 != -1) {
                                    }
                                }
                                this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = null;
                            }
                            if (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 == null) {
                                this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = new CrimsonRouteClassForeachWPwAUxgb2kU7pRzy5427943292028712(this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119);
                            }
                            this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(emeraldStackReflectionVirtualizationG4oNkyfi8eylBkupGZ414859413301554);
                            this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = null;
                        }
                    } else {
                        EmeraldStackReflectionVirtualizationG4oNkyfi8eylBkupGZ41485941330155 emeraldStackReflectionVirtualizationG4oNkyfi8eylBkupGZ414859413301555 = this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
                        if (emeraldStackReflectionVirtualizationG4oNkyfi8eylBkupGZ414859413301555.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 == null) {
                            emeraldStackReflectionVirtualizationG4oNkyfi8eylBkupGZ414859413301555.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = new ArrayList();
                        }
                        emeraldStackReflectionVirtualizationG4oNkyfi8eylBkupGZ414859413301555.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.add(null);
                    }
                }
                if (this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 == null) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(null);
                    this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = new EmeraldStackReflectionVirtualizationG4oNkyfi8eylBkupGZ41485941330155(0, arrayList3);
                    zenithPathBinaryInterfaceJPvSokakdHX9LAzKqB54416701949648.sendMessageDelayed(zenithPathBinaryInterfaceJPvSokakdHX9LAzKqB54416701949648.obtainMessage(17), 0L);
                    return true;
                }
                return true;
            case 19:
                this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = false;
                return true;
            default:
                return false;
        }
    }
}

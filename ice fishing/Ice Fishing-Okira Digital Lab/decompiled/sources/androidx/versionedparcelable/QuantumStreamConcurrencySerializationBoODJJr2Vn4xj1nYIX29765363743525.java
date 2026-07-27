package androidx.versionedparcelable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public class QuantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525 implements IronMatrixRegistryAnnotationPTCrz7YE1QOIWmeEiY66110510415163 {
    public final int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;
    public static final /* synthetic */ AtomicLongFieldUpdater LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = AtomicLongFieldUpdater.newUpdater(QuantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = AtomicLongFieldUpdater.newUpdater(QuantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = AtomicLongFieldUpdater.newUpdater(QuantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = AtomicLongFieldUpdater.newUpdater(QuantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339 = AtomicReferenceFieldUpdater.newUpdater(QuantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480 = AtomicReferenceFieldUpdater.newUpdater(QuantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050 = AtomicReferenceFieldUpdater.newUpdater(QuantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111 = AtomicReferenceFieldUpdater.newUpdater(QuantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834 = AtomicReferenceFieldUpdater.newUpdater(QuantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525.class, Object.class, "closeHandler$volatile");

    public QuantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525(int i) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        if (i < 0) {
            CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170("Invalid channel capacity: ", i, ", should be >=0");
            throw null;
        }
        CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 = TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.get(this);
        CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922 = new CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792(0L, null, this, 3);
        this.sendSegment$volatile = crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922;
        this.receiveSegment$volatile = crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922;
        if (CosmicForgeResolverDataframeXWDcbZzy0pzi2voCnW56344202290983()) {
            crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922 = TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
            crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922.getClass();
        }
        this.bufferEndSegment$volatile = crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922;
        this._closeCause$volatile = TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598;
    }

    public static final void ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(QuantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525 quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525, Object obj, ArcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514 arcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514) {
        arcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(new PhotonFrameOverloadingEngineWw7n8FB5ih6HWZQ8dp81198068058588(quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571()));
    }

    public static final CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(QuantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525 quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525, long j, CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792) {
        Object LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764;
        QuantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525 quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX297653637435252;
        CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922 = TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        BlazePulseContainerContainerBVHT4CC1ckAzIOerQW97105348977940 blazePulseContainerContainerBVHT4CC1ckAzIOerQW97105348977940 = BlazePulseContainerContainerBVHT4CC1ckAzIOerQW97105348977940.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
        loop0: while (true) {
            LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764 = QuantumStreamDecoderSchedulerZuSI41Fu32QAmywXDr40521088394502.LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764(crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792, j, blazePulseContainerContainerBVHT4CC1ckAzIOerQW97105348977940);
            if (!FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.IronMatrixPipelineVectorCmhq21DucJNfG3zCVW67482589553900(LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764)) {
                ArcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585 GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178 = FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178(LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339;
                    ArcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585 arcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585 = (ArcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585) atomicReferenceFieldUpdater.get(quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525);
                    if (arcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 >= GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495) {
                        break loop0;
                    }
                    if (!GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525, arcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585, GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178)) {
                        if (atomicReferenceFieldUpdater.get(quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525) != arcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585) {
                            if (GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119()) {
                                GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867();
                            }
                        }
                    }
                    if (arcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119()) {
                        arcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867();
                    }
                }
            } else {
                break;
            }
        }
        boolean IronMatrixPipelineVectorCmhq21DucJNfG3zCVW67482589553900 = FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.IronMatrixPipelineVectorCmhq21DucJNfG3zCVW67482589553900(LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764);
        AtomicLongFieldUpdater atomicLongFieldUpdater = YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        if (IronMatrixPipelineVectorCmhq21DucJNfG3zCVW67482589553900) {
            quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480();
            if (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 * TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 < atomicLongFieldUpdater.get(quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525)) {
                crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                return null;
            }
        } else {
            CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507923 = (CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792) FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178(LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764);
            long j2 = crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507923.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
            if (j2 <= j) {
                return crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507923;
            }
            long j3 = TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 * j2;
            while (true) {
                long j4 = LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.get(quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525);
                long j5 = 1152921504606846975L & j4;
                if (j5 >= j3) {
                    quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX297653637435252 = quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525;
                    break;
                }
                quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX297653637435252 = quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525;
                if (LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.compareAndSet(quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX297653637435252, j4, (((int) (j4 >> 60)) << 60) + j5)) {
                    break;
                }
                quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525 = quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX297653637435252;
            }
            if (j2 * TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 < atomicLongFieldUpdater.get(quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX297653637435252)) {
                crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507923.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
            }
        }
        return null;
    }

    public static boolean MysticCacheParserHashmapNCNANojYkqCJuUmK2O16057626810798(Object obj) {
        if (!(obj instanceof IronMatrixRequestJITLWxPCrPK8pMEZFgnSH66194039498579)) {
            GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(obj, "Unexpected waiter: ");
            return false;
        }
        IronMatrixRequestJITLWxPCrPK8pMEZFgnSH66194039498579 ironMatrixRequestJITLWxPCrPK8pMEZFgnSH66194039498579 = (IronMatrixRequestJITLWxPCrPK8pMEZFgnSH66194039498579) obj;
        CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 = TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        ZenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528 ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S803082287011112 = ironMatrixRequestJITLWxPCrPK8pMEZFgnSH66194039498579.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111(AxiomCoreResolverAbstractionEJ1gjjFA6j8B9UV1YX42911071710133.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800, null);
        if (ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S803082287011112 == null) {
            return false;
        }
        ironMatrixRequestJITLWxPCrPK8pMEZFgnSH66194039498579.PhotonFrameRuntimeKeyValueRxsctdJg5CGmXPHjuh15556138883942(ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S803082287011112);
        return true;
    }

    public static final int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(QuantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525 quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525, CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792, int i, Object obj, long j, Object obj2, boolean z) {
        crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834(i, obj);
        if (z) {
            return quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792, i, obj, j, obj2, z);
        }
        Object ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502 = crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(i);
        if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502 == null) {
            if (quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(j)) {
                if (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(i, null, TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502 instanceof ZenithPathObjectBinaryZiZzREPQmNc7DC1FCF23765079342024) {
            crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834(i, null);
            if (quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525.WhiteFieldUnificationOverridingEBdwjF0noilpOVdrsu81945136372121(ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502, obj)) {
                crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170(i, TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339);
                return 0;
            }
            ZenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528 zenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528 = TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
            if (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.getAndSet((i * 2) + 1, zenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528) == zenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528) {
                return 5;
            }
            crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111(i, true);
            return 5;
        }
        return quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792, i, obj, j, obj2, z);
    }

    public static void XenoGridVectorHashmapRiVZttryRmb3kjjndT78819484033195(QuantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525 quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
        if ((atomicLongFieldUpdater.addAndGet(quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
    
        r1 = (androidx.versionedparcelable.CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792) ((androidx.versionedparcelable.KryptonFlowSessionAbstractionGyCBk5Bzm9usjHtuUr95214496022037) androidx.versionedparcelable.KryptonFlowSessionAbstractionGyCBk5Bzm9usjHtuUr95214496022037.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(long j) {
        Object obj;
        long j2;
        Object obj2 = ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050.get(this);
        CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 = (CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792) UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339.get(this);
        if (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 > ((CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792) obj2).ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495) {
            obj2 = crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792;
        }
        CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922 = (CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792) NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480.get(this);
        if (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 > ((CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792) obj2).ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495) {
            obj2 = crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922;
        }
        KryptonFlowSessionAbstractionGyCBk5Bzm9usjHtuUr95214496022037 kryptonFlowSessionAbstractionGyCBk5Bzm9usjHtuUr95214496022037 = (KryptonFlowSessionAbstractionGyCBk5Bzm9usjHtuUr95214496022037) obj2;
        loop0: while (true) {
            kryptonFlowSessionAbstractionGyCBk5Bzm9usjHtuUr95214496022037.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = KryptonFlowSessionAbstractionGyCBk5Bzm9usjHtuUr95214496022037.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
            Object obj3 = atomicReferenceFieldUpdater.get(kryptonFlowSessionAbstractionGyCBk5Bzm9usjHtuUr95214496022037);
            ZenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528 zenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528 = QuantumStreamDecoderSchedulerZuSI41Fu32QAmywXDr40521088394502.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
            obj = null;
            if (obj3 == zenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528) {
                break;
            }
            KryptonFlowSessionAbstractionGyCBk5Bzm9usjHtuUr95214496022037 kryptonFlowSessionAbstractionGyCBk5Bzm9usjHtuUr952144960220372 = (KryptonFlowSessionAbstractionGyCBk5Bzm9usjHtuUr95214496022037) obj3;
            if (kryptonFlowSessionAbstractionGyCBk5Bzm9usjHtuUr952144960220372 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(kryptonFlowSessionAbstractionGyCBk5Bzm9usjHtuUr95214496022037, null, zenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528)) {
                    if (atomicReferenceFieldUpdater.get(kryptonFlowSessionAbstractionGyCBk5Bzm9usjHtuUr95214496022037) != null) {
                        break;
                    }
                }
                break loop0;
            }
            kryptonFlowSessionAbstractionGyCBk5Bzm9usjHtuUr95214496022037 = kryptonFlowSessionAbstractionGyCBk5Bzm9usjHtuUr952144960220372;
        }
        CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507923 = (CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792) kryptonFlowSessionAbstractionGyCBk5Bzm9usjHtuUr95214496022037;
        if (PhotonFrameRuntimeKeyValueRxsctdJg5CGmXPHjuh15556138883942()) {
            CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507924 = crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507923;
            loop2: do {
                int i = TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 - 1;
                while (true) {
                    if (-1 >= i) {
                        break;
                    }
                    j2 = (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507924.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 * TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365) + i;
                    if (j2 < YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502 = crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507924.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(i);
                        if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502 != null && ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502 != TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119) {
                            if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502 == TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
                                break loop2;
                            }
                        } else {
                            if (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507924.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(i, ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502, TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111)) {
                                crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507924.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818();
                                break;
                            }
                        }
                    }
                    i--;
                }
            } while (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507924 != null);
            j2 = -1;
            if (j2 != -1) {
                ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(j2);
            }
        }
        loop5: for (CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507925 = crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507923; crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507925 != null; crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507925 = (CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792) ((KryptonFlowSessionAbstractionGyCBk5Bzm9usjHtuUr95214496022037) KryptonFlowSessionAbstractionGyCBk5Bzm9usjHtuUr95214496022037.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.get(crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507925))) {
            for (int i2 = TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 - 1; -1 < i2; i2--) {
                if ((crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507925.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 * TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365) + i2 < j) {
                    break loop5;
                }
                while (true) {
                    Object ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503 = crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507925.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(i2);
                    if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503 != null && ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503 != TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119) {
                        if (!(ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503 instanceof MysticCacheEventLoopLibraryU6R6VVBOVPDgHjf97H57190158477616)) {
                            if (!(ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503 instanceof ZenithPathObjectBinaryZiZzREPQmNc7DC1FCF23765079342024)) {
                                break;
                            }
                            if (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507925.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(i2, ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503, TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111)) {
                                obj = AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252(obj, ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503);
                                crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507925.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111(i2, true);
                                break;
                            }
                        } else {
                            if (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507925.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(i2, ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503, TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111)) {
                                obj = AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252(obj, ((MysticCacheEventLoopLibraryU6R6VVBOVPDgHjf97H57190158477616) ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
                                crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507925.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111(i2, true);
                                break;
                            }
                        }
                    } else {
                        if (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507925.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(i2, ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503, TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111)) {
                            crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507925.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216((ZenithPathObjectBinaryZiZzREPQmNc7DC1FCF23765079342024) obj, true);
                return crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507923;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216((ZenithPathObjectBinaryZiZzREPQmNc7DC1FCF23765079342024) arrayList.get(size), true);
            }
        }
        return crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507923;
    }

    public final Throwable CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927() {
        Throwable CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170 = CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170();
        return CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170 == null ? new CosmicForgeFunctionModuleQkMolxjxxzojv0xqmn18923766512016("Channel was closed") : CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170;
    }

    public final Throwable CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170() {
        return (Throwable) ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111.get(this);
    }

    public final boolean CosmicForgeResolverDataframeXWDcbZzy0pzi2voCnW56344202290983() {
        long j = TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    @Override // androidx.versionedparcelable.IronMatrixRegistryAnnotationPTCrz7YE1QOIWmeEiY66110510415163
    public final Object EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111() {
        CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792;
        YellowLoopLambdaGatewayI8rOY0uaJRcqZZxgWZ93385490235259 yellowLoopLambdaGatewayI8rOY0uaJRcqZZxgWZ93385490235259 = DeltaSignalNormalizationJITQ7KMe5q3hsuA9VOtI478044089954652.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        AtomicLongFieldUpdater atomicLongFieldUpdater = YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        long j = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        long j2 = atomicLongFieldUpdater2.get(this);
        if (UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541(j2, true)) {
            return new SolarMeshDecryptionAliasSe1x3UBEv3hmAMU1in90260259628131(CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170());
        }
        if (j >= (j2 & 1152921504606846975L)) {
            return yellowLoopLambdaGatewayI8rOY0uaJRcqZZxgWZ93385490235259;
        }
        Object obj = TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
        CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922 = (CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792) NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480.get(this);
        while (!this.UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541(atomicLongFieldUpdater2.get(this), true)) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
            long j4 = andIncrement / j3;
            int i = (int) (andIncrement % j3);
            if (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 != j4) {
                CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i274750438328342 = this.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834(j4, crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922);
                if (ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i274750438328342 == null) {
                    continue;
                } else {
                    crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 = ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i274750438328342;
                }
            } else {
                crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 = crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922;
            }
            QuantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525 quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525 = this;
            Object GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178 = quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525.GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178(crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792, i, andIncrement, obj);
            crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922 = crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792;
            if (GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178 == TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834) {
                ZenithPathObjectBinaryZiZzREPQmNc7DC1FCF23765079342024 zenithPathObjectBinaryZiZzREPQmNc7DC1FCF23765079342024 = obj instanceof ZenithPathObjectBinaryZiZzREPQmNc7DC1FCF23765079342024 ? (ZenithPathObjectBinaryZiZzREPQmNc7DC1FCF23765079342024) obj : null;
                if (zenithPathObjectBinaryZiZzREPQmNc7DC1FCF23765079342024 != null) {
                    zenithPathObjectBinaryZiZzREPQmNc7DC1FCF23765079342024.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922, i);
                }
                quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525.IronMatrixPipelineVectorCmhq21DucJNfG3zCVW67482589553900(andIncrement);
                crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818();
                return yellowLoopLambdaGatewayI8rOY0uaJRcqZZxgWZ93385490235259;
            }
            if (GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178 != TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111) {
                if (GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178 != TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170) {
                    crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                    return GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178;
                }
                GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("unexpected");
                return null;
            }
            if (andIncrement < quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525.RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598()) {
                crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
            }
            this = quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525;
        }
        return new SolarMeshDecryptionAliasSe1x3UBEv3hmAMU1in90260259628131(this.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170());
    }

    public final Object GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178(CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792, int i, long j, Object obj) {
        AtomicReferenceArray atomicReferenceArray = crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        Object ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502 = crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(i);
        AtomicLongFieldUpdater atomicLongFieldUpdater = LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502 == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170;
                }
                if (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(i, ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502, obj)) {
                    ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111();
                    return TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834;
                }
            }
        } else if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502 == TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 && crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(i, ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502, TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339)) {
            ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111();
            Object obj2 = atomicReferenceArray.get(i * 2);
            crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834(i, null);
            return obj2;
        }
        while (true) {
            Object ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503 = crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(i);
            if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503 == null || ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503 == TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(i, ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503, TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818)) {
                        ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111();
                        return TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111;
                    }
                } else {
                    if (obj == null) {
                        return TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170;
                    }
                    if (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(i, ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503, obj)) {
                        ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111();
                        return TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834;
                    }
                }
            } else if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503 != TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
                ZenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528 zenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528 = TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480;
                if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503 == zenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528) {
                    return TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111;
                }
                if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503 == TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818) {
                    return TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111;
                }
                if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503 == TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111) {
                    ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111();
                    return TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111;
                }
                if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503 != TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 && crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(i, ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503, TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170)) {
                    boolean z = ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503 instanceof MysticCacheEventLoopLibraryU6R6VVBOVPDgHjf97H57190158477616;
                    if (z) {
                        ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503 = ((MysticCacheEventLoopLibraryU6R6VVBOVPDgHjf97H57190158477616) ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                    }
                    if (MysticCacheParserHashmapNCNANojYkqCJuUmK2O16057626810798(ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503)) {
                        crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170(i, TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339);
                        ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834(i, null);
                        return obj3;
                    }
                    crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170(i, zenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528);
                    crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818();
                    if (z) {
                        ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111();
                    }
                    return TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111;
                }
            } else if (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(i, ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503, TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339)) {
                ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111();
                Object obj4 = atomicReferenceArray.get(i * 2);
                crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834(i, null);
                return obj4;
            }
        }
    }

    public final void IronMatrixPipelineVectorCmhq21DucJNfG3zCVW67482589553900(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        QuantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525 quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525 = this;
        if (quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525.CosmicForgeResolverDataframeXWDcbZzy0pzi2voCnW56344202290983()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
            if (atomicLongFieldUpdater.get(quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525) > j) {
                break;
            } else {
                quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525 = this;
            }
        }
        int i = TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
            if (i2 < i) {
                long j2 = atomicLongFieldUpdater.get(quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525);
                if (j2 == (4611686018427387903L & atomicLongFieldUpdater2.get(quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525)) && j2 == atomicLongFieldUpdater.get(quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525)) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    long j3 = atomicLongFieldUpdater2.get(quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525);
                    if (atomicLongFieldUpdater2.compareAndSet(quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525 = this;
                    }
                }
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525);
                    long j5 = atomicLongFieldUpdater2.get(quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525)) {
                        break;
                    }
                    if (z) {
                        quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525 = this;
                    } else {
                        quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525 = this;
                        atomicLongFieldUpdater2.compareAndSet(quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525, j5, 4611686018427387904L + j6);
                    }
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525);
                    if (atomicLongFieldUpdater2.compareAndSet(quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525, j7, j7 & 4611686018427387903L)) {
                        return;
                    } else {
                        quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525 = this;
                    }
                }
            }
        }
    }

    public final void KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216(ZenithPathObjectBinaryZiZzREPQmNc7DC1FCF23765079342024 zenithPathObjectBinaryZiZzREPQmNc7DC1FCF23765079342024, boolean z) {
        if (zenithPathObjectBinaryZiZzREPQmNc7DC1FCF23765079342024 instanceof IronMatrixRequestJITLWxPCrPK8pMEZFgnSH66194039498579) {
            ((BlueKernelFrameworkFilterQxEeFq9MSyNZAHuMag79391056798063) zenithPathObjectBinaryZiZzREPQmNc7DC1FCF23765079342024).TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(new PhotonFrameOverloadingEngineWw7n8FB5ih6HWZQ8dp81198068058588(z ? CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927() : SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571()));
            return;
        }
        if (!(zenithPathObjectBinaryZiZzREPQmNc7DC1FCF23765079342024 instanceof IronMatrixUnificationDebuggerUQlZe2CzGVdVYkhLpV93398978278471)) {
            GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(zenithPathObjectBinaryZiZzREPQmNc7DC1FCF23765079342024, "Unexpected waiter: ");
            return;
        }
        IronMatrixUnificationDebuggerUQlZe2CzGVdVYkhLpV93398978278471 ironMatrixUnificationDebuggerUQlZe2CzGVdVYkhLpV93398978278471 = (IronMatrixUnificationDebuggerUQlZe2CzGVdVYkhLpV93398978278471) zenithPathObjectBinaryZiZzREPQmNc7DC1FCF23765079342024;
        ArcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514 arcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514 = ironMatrixUnificationDebuggerUQlZe2CzGVdVYkhLpV93398978278471.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        arcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514.getClass();
        ironMatrixUnificationDebuggerUQlZe2CzGVdVYkhLpV93398978278471.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = null;
        ironMatrixUnificationDebuggerUQlZe2CzGVdVYkhLpV93398978278471.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111;
        Throwable CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170 = ironMatrixUnificationDebuggerUQlZe2CzGVdVYkhLpV93398978278471.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170();
        if (CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170 == null) {
            arcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(Boolean.FALSE);
        } else {
            arcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(new PhotonFrameOverloadingEngineWw7n8FB5ih6HWZQ8dp81198068058588(CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170));
        }
    }

    public final Object LunarNodeAsyncCompressionXhW6Mr3UFps5CRaeph11269602575390(BlueKernelFrameworkFilterQxEeFq9MSyNZAHuMag79391056798063 blueKernelFrameworkFilterQxEeFq9MSyNZAHuMag79391056798063, Object obj) {
        ArcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514 arcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514 = new ArcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514(1, FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(blueKernelFrameworkFilterQxEeFq9MSyNZAHuMag79391056798063));
        arcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514.RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598();
        arcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(new PhotonFrameOverloadingEngineWw7n8FB5ih6HWZQ8dp81198068058588(SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571()));
        Object SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571 = arcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571();
        return SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571 == BlazePulseBuilderIteratorPBZI8aDyzrDZbG6CQq54561361173102.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 ? SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571 : AxiomCoreResolverAbstractionEJ1gjjFA6j8B9UV1YX42911071710133.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0144 A[RETURN] */
    @Override // androidx.versionedparcelable.DeltaSignalManagerProxySIlgzqyeplNf8cgPtO69630180813878
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(BlueKernelFrameworkFilterQxEeFq9MSyNZAHuMag79391056798063 blueKernelFrameworkFilterQxEeFq9MSyNZAHuMag79391056798063, Object obj) {
        AxiomCoreResolverAbstractionEJ1gjjFA6j8B9UV1YX42911071710133 axiomCoreResolverAbstractionEJ1gjjFA6j8B9UV1YX42911071710133;
        Object SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339;
        CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 = (CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541 = UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541(andIncrement, false);
            int i = TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            long j4 = crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
            BlazePulseBuilderIteratorPBZI8aDyzrDZbG6CQq54561361173102 blazePulseBuilderIteratorPBZI8aDyzrDZbG6CQq54561361173102 = BlazePulseBuilderIteratorPBZI8aDyzrDZbG6CQq54561361173102.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
            axiomCoreResolverAbstractionEJ1gjjFA6j8B9UV1YX42911071710133 = AxiomCoreResolverAbstractionEJ1gjjFA6j8B9UV1YX42911071710133.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
            if (j4 != j3) {
                CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(this, j3, crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792);
                if (AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 != null) {
                    crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 = AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                } else if (UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541) {
                    Object LunarNodeAsyncCompressionXhW6Mr3UFps5CRaeph11269602575390 = LunarNodeAsyncCompressionXhW6Mr3UFps5CRaeph11269602575390(blueKernelFrameworkFilterQxEeFq9MSyNZAHuMag79391056798063, obj);
                    if (LunarNodeAsyncCompressionXhW6Mr3UFps5CRaeph11269602575390 == blazePulseBuilderIteratorPBZI8aDyzrDZbG6CQq54561361173102) {
                        return LunarNodeAsyncCompressionXhW6Mr3UFps5CRaeph11269602575390;
                    }
                }
            }
            int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(this, crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792, i2, obj, j, null, UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541);
            if (RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 == 0) {
                crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                return axiomCoreResolverAbstractionEJ1gjjFA6j8B9UV1YX42911071710133;
            }
            if (RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 == 1) {
                break;
            }
            if (RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
                if (RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 == 3) {
                    ArcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514 WhiteFieldUnificationOverridingEBdwjF0noilpOVdrsu81945136372121 = FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.WhiteFieldUnificationOverridingEBdwjF0noilpOVdrsu81945136372121(FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(blueKernelFrameworkFilterQxEeFq9MSyNZAHuMag79391056798063));
                    try {
                        int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj895146911938672 = RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(this, crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792, i2, obj, j, WhiteFieldUnificationOverridingEBdwjF0noilpOVdrsu81945136372121, false);
                        if (RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj895146911938672 == 0) {
                            crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                        } else if (RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj895146911938672 != 1) {
                            if (RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj895146911938672 != 2) {
                                if (RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj895146911938672 != 4) {
                                    String str = "unexpected";
                                    if (RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj895146911938672 != 5) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                                    CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922 = (CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792) atomicReferenceFieldUpdater.get(this);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                        long j5 = andIncrement2 & 1152921504606846975L;
                                        boolean UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo988031659995412 = UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541(andIncrement2, false);
                                        int i3 = TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                                        long j6 = i3;
                                        String str2 = str;
                                        long j7 = j5 / j6;
                                        int i4 = (int) (j5 % j6);
                                        if (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 != j7) {
                                            CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet424254952273652 = AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(this, j7, crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922);
                                            if (AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet424254952273652 != null) {
                                                crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922 = AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet424254952273652;
                                            } else {
                                                if (UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo988031659995412) {
                                                    break;
                                                }
                                                str = str2;
                                            }
                                        }
                                        int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj895146911938673 = RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(this, crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922, i4, obj, j5, WhiteFieldUnificationOverridingEBdwjF0noilpOVdrsu81945136372121, UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo988031659995412);
                                        if (RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj895146911938673 == 0) {
                                            crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                                            break;
                                        }
                                        if (RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj895146911938673 == 1) {
                                            break;
                                        }
                                        if (RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj895146911938673 != 2) {
                                            if (RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj895146911938673 == 3) {
                                                throw new IllegalStateException(str2);
                                            }
                                            if (RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj895146911938673 != 4) {
                                                if (RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj895146911938673 == 5) {
                                                    crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                                                }
                                                str = str2;
                                            } else if (j5 < atomicLongFieldUpdater2.get(this)) {
                                                crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                                            }
                                        } else if (UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo988031659995412) {
                                            crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818();
                                        } else {
                                            WhiteFieldUnificationOverridingEBdwjF0noilpOVdrsu81945136372121.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922, i4 + i3);
                                        }
                                    }
                                } else if (j < atomicLongFieldUpdater2.get(this)) {
                                    crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                                }
                                ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(this, obj, WhiteFieldUnificationOverridingEBdwjF0noilpOVdrsu81945136372121);
                            } else {
                                WhiteFieldUnificationOverridingEBdwjF0noilpOVdrsu81945136372121.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792, i2 + i);
                            }
                            SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571 = WhiteFieldUnificationOverridingEBdwjF0noilpOVdrsu81945136372121.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571();
                            if (SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571 != blazePulseBuilderIteratorPBZI8aDyzrDZbG6CQq54561361173102) {
                                SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571 = axiomCoreResolverAbstractionEJ1gjjFA6j8B9UV1YX42911071710133;
                            }
                            if (SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571 != blazePulseBuilderIteratorPBZI8aDyzrDZbG6CQq54561361173102) {
                                return SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571;
                            }
                        }
                        WhiteFieldUnificationOverridingEBdwjF0noilpOVdrsu81945136372121.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(axiomCoreResolverAbstractionEJ1gjjFA6j8B9UV1YX42911071710133);
                        SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571 = WhiteFieldUnificationOverridingEBdwjF0noilpOVdrsu81945136372121.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571();
                        if (SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571 != blazePulseBuilderIteratorPBZI8aDyzrDZbG6CQq54561361173102) {
                        }
                        if (SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571 != blazePulseBuilderIteratorPBZI8aDyzrDZbG6CQq54561361173102) {
                            break;
                        }
                    } catch (Throwable th) {
                        WhiteFieldUnificationOverridingEBdwjF0noilpOVdrsu81945136372121.MysticCacheParserHashmapNCNANojYkqCJuUmK2O16057626810798();
                        throw th;
                    }
                } else if (RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 == 4) {
                    if (j < atomicLongFieldUpdater2.get(this)) {
                        crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                    }
                    Object LunarNodeAsyncCompressionXhW6Mr3UFps5CRaeph112696025753902 = LunarNodeAsyncCompressionXhW6Mr3UFps5CRaeph11269602575390(blueKernelFrameworkFilterQxEeFq9MSyNZAHuMag79391056798063, obj);
                    if (LunarNodeAsyncCompressionXhW6Mr3UFps5CRaeph112696025753902 == blazePulseBuilderIteratorPBZI8aDyzrDZbG6CQq54561361173102) {
                        return LunarNodeAsyncCompressionXhW6Mr3UFps5CRaeph112696025753902;
                    }
                } else if (RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 == 5) {
                    crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                }
            } else if (UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541) {
                crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818();
                Object LunarNodeAsyncCompressionXhW6Mr3UFps5CRaeph112696025753903 = LunarNodeAsyncCompressionXhW6Mr3UFps5CRaeph11269602575390(blueKernelFrameworkFilterQxEeFq9MSyNZAHuMag79391056798063, obj);
                if (LunarNodeAsyncCompressionXhW6Mr3UFps5CRaeph112696025753903 == blazePulseBuilderIteratorPBZI8aDyzrDZbG6CQq54561361173102) {
                    return LunarNodeAsyncCompressionXhW6Mr3UFps5CRaeph112696025753903;
                }
            }
        }
        return axiomCoreResolverAbstractionEJ1gjjFA6j8B9UV1YX42911071710133;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764(long j, CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792) {
        CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922;
        CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507923;
        while (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 < j && (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507923 = (CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792) crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365()) != null) {
            crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 = crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507923;
        }
        while (true) {
            if (!crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495() || (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922 = (CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792) crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
                    ArcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585 arcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585 = (ArcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585) atomicReferenceFieldUpdater.get(this);
                    if (arcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 >= crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495) {
                        return;
                    }
                    if (!crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, arcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585, crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792)) {
                        if (atomicReferenceFieldUpdater.get(this) != arcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585) {
                            if (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119()) {
                                crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867();
                            }
                        }
                    }
                    if (arcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119()) {
                        arcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867();
                        return;
                    }
                    return;
                }
            }
            crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 = crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922;
        }
    }

    public final void NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480() {
        UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541(LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.get(this), false);
    }

    @Override // androidx.versionedparcelable.IronMatrixRegistryAnnotationPTCrz7YE1QOIWmeEiY66110510415163
    public final void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(cancellationException, true);
    }

    public final void ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(long j) {
        CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 = (CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792) NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 + j2, TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.get(this))) {
                return;
            }
            QuantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525 quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525 = this;
            if (atomicLongFieldUpdater.compareAndSet(quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525, j2, 1 + j2)) {
                long j3 = TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 != j4) {
                    CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i274750438328342 = quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834(j4, crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792);
                    if (ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i274750438328342 != null) {
                        crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 = ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i274750438328342;
                    }
                }
                CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922 = crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792;
                if (quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525.GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178(crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922, i, j2, null) != TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111) {
                    crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                } else if (j2 < quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525.RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598()) {
                    crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                }
                this = quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525;
                crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 = crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922;
            }
            this = quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525;
        }
    }

    public final CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834(long j, CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792) {
        Object LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764;
        QuantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525 quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525;
        CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922 = TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        BlazePulseContainerContainerBVHT4CC1ckAzIOerQW97105348977940 blazePulseContainerContainerBVHT4CC1ckAzIOerQW97105348977940 = BlazePulseContainerContainerBVHT4CC1ckAzIOerQW97105348977940.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
        loop0: while (true) {
            LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764 = QuantumStreamDecoderSchedulerZuSI41Fu32QAmywXDr40521088394502.LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764(crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792, j, blazePulseContainerContainerBVHT4CC1ckAzIOerQW97105348977940);
            if (!FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.IronMatrixPipelineVectorCmhq21DucJNfG3zCVW67482589553900(LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764)) {
                ArcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585 GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178 = FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178(LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480;
                    ArcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585 arcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585 = (ArcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585) atomicReferenceFieldUpdater.get(this);
                    if (arcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 >= GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495) {
                        break loop0;
                    }
                    if (!GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, arcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585, GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178)) {
                        if (atomicReferenceFieldUpdater.get(this) != arcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585) {
                            if (GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119()) {
                                GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867();
                            }
                        }
                    }
                    if (arcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119()) {
                        arcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867();
                    }
                }
            } else {
                break;
            }
        }
        if (FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.IronMatrixPipelineVectorCmhq21DucJNfG3zCVW67482589553900(LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764)) {
            NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480();
            if (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 * TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 < RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598()) {
                crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                return null;
            }
        } else {
            CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507923 = (CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792) FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178(LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764);
            long j2 = crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507923.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
            if (!CosmicForgeResolverDataframeXWDcbZzy0pzi2voCnW56344202290983() && j <= TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.get(this) / TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
                    ArcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585 arcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC470891795835852 = (ArcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585) atomicReferenceFieldUpdater2.get(this);
                    if (arcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC470891795835852.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 >= j2 || !crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507923.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, arcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC470891795835852, crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507923)) {
                        if (atomicReferenceFieldUpdater2.get(this) != arcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC470891795835852) {
                            if (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507923.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119()) {
                                crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507923.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867();
                            }
                        }
                    }
                    if (arcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC470891795835852.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119()) {
                        arcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC470891795835852.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867();
                    }
                }
            }
            if (j2 <= j) {
                return crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507923;
            }
            long j3 = j2 * TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
            while (true) {
                long j4 = YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.get(this);
                if (j4 >= j3) {
                    quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525 = this;
                    break;
                }
                quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525 = this;
                if (YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.compareAndSet(quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525, j4, j3)) {
                    break;
                }
                this = quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525;
            }
            if (j2 * TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 < quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525.RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598()) {
                crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507923.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
            }
        }
        return null;
    }

    @Override // androidx.versionedparcelable.DeltaSignalManagerProxySIlgzqyeplNf8cgPtO69630180813878
    public Object PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(Object obj) {
        YellowLoopLambdaGatewayI8rOY0uaJRcqZZxgWZ93385490235259 yellowLoopLambdaGatewayI8rOY0uaJRcqZZxgWZ93385490235259 = DeltaSignalNormalizationJITQ7KMe5q3hsuA9VOtI478044089954652.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        AtomicLongFieldUpdater atomicLongFieldUpdater = LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        boolean z = false;
        long j = 1152921504606846975L;
        if (UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541(atomicLongFieldUpdater.get(this), false) ? false : !YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(r1 & 1152921504606846975L)) {
            return yellowLoopLambdaGatewayI8rOY0uaJRcqZZxgWZ93385490235259;
        }
        CosmicForgeContextEventLoopW5Zz8rBeKkSifdZZp417206059617413 cosmicForgeContextEventLoopW5Zz8rBeKkSifdZZp417206059617413 = TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480;
        CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 = (CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792) UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = andIncrement & j;
            boolean UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541 = UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541(andIncrement, z);
            int i = TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
            long j3 = i;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            if (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 != j4) {
                CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(this, j4, crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792);
                if (AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 != null) {
                    crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 = AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                } else {
                    if (UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541) {
                        return new SolarMeshDecryptionAliasSe1x3UBEv3hmAMU1in90260259628131(SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571());
                    }
                    z = false;
                    j = 1152921504606846975L;
                }
            }
            int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(this, crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792, i2, obj, j2, cosmicForgeContextEventLoopW5Zz8rBeKkSifdZZp417206059617413, UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541);
            AxiomCoreResolverAbstractionEJ1gjjFA6j8B9UV1YX42911071710133 axiomCoreResolverAbstractionEJ1gjjFA6j8B9UV1YX42911071710133 = AxiomCoreResolverAbstractionEJ1gjjFA6j8B9UV1YX42911071710133.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
            if (RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 == 0) {
                crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                return axiomCoreResolverAbstractionEJ1gjjFA6j8B9UV1YX42911071710133;
            }
            if (RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 == 1) {
                return axiomCoreResolverAbstractionEJ1gjjFA6j8B9UV1YX42911071710133;
            }
            if (RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 == 2) {
                if (UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541) {
                    crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818();
                    return new SolarMeshDecryptionAliasSe1x3UBEv3hmAMU1in90260259628131(SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571());
                }
                ZenithPathObjectBinaryZiZzREPQmNc7DC1FCF23765079342024 zenithPathObjectBinaryZiZzREPQmNc7DC1FCF23765079342024 = cosmicForgeContextEventLoopW5Zz8rBeKkSifdZZp417206059617413 instanceof ZenithPathObjectBinaryZiZzREPQmNc7DC1FCF23765079342024 ? (ZenithPathObjectBinaryZiZzREPQmNc7DC1FCF23765079342024) cosmicForgeContextEventLoopW5Zz8rBeKkSifdZZp417206059617413 : null;
                if (zenithPathObjectBinaryZiZzREPQmNc7DC1FCF23765079342024 != null) {
                    zenithPathObjectBinaryZiZzREPQmNc7DC1FCF23765079342024.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792, i2 + i);
                }
                crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818();
                return yellowLoopLambdaGatewayI8rOY0uaJRcqZZxgWZ93385490235259;
            }
            if (RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 == 3) {
                GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("unexpected");
                return null;
            }
            if (RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 == 4) {
                if (j2 < YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.get(this)) {
                    crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                }
                return new SolarMeshDecryptionAliasSe1x3UBEv3hmAMU1in90260259628131(SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571());
            }
            if (RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 == 5) {
                crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
            }
            z = false;
            j = 1152921504606846975L;
        }
    }

    public boolean PhotonFrameRuntimeKeyValueRxsctdJg5CGmXPHjuh15556138883942() {
        return false;
    }

    public final long RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598() {
        return LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.get(this) & 1152921504606846975L;
    }

    public final Throwable SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571() {
        Throwable CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170 = CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170();
        return CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170 == null ? new QuantumStreamContainerCallbackZMk3ahQSLQCJZi5XZY63343993187795("Channel was closed") : CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170;
    }

    public final boolean TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(Throwable th, boolean z) {
        QuantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525 quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525;
        boolean z2;
        long j;
        long j2;
        Object obj;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        if (z) {
            while (true) {
                long j4 = atomicLongFieldUpdater.get(this);
                if (((int) (j4 >> 60)) != 0) {
                    break;
                }
                CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 = TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525 = this;
                if (atomicLongFieldUpdater.compareAndSet(quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525, j4, (j4 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                this = quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525;
            }
        }
        quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525 = this;
        ZenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528 zenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528 = TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111;
            if (atomicReferenceFieldUpdater.compareAndSet(quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525, zenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528, th)) {
                z2 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525) != zenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                j3 = atomicLongFieldUpdater.get(quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525);
            } while (!atomicLongFieldUpdater.compareAndSet(quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525, j3, 3458764513820540928L + (j3 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = (j & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = (j & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525, j, j2));
        }
        quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480();
        if (z2) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834;
                obj = atomicReferenceFieldUpdater2.get(quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525);
                ZenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528 zenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr662982519815282 = obj == null ? TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927 : TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571;
                while (!atomicReferenceFieldUpdater2.compareAndSet(quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525, obj, zenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr662982519815282)) {
                    if (atomicReferenceFieldUpdater2.get(quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                ArcticByteTranspilerShimPkeEGSmyI8du3jPV6f71089746714531.EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111(1, obj);
                ((DragonRouteMultithreadingControllerJZnCtXJgzUmpVbAfL848868216870865) obj).UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(quantumStreamConcurrencySerializationBoODJJr2Vn4xj1nYIX29765363743525.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170());
                return z2;
            }
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a2, code lost:
    
        r0 = (androidx.versionedparcelable.CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792) ((androidx.versionedparcelable.KryptonFlowSessionAbstractionGyCBk5Bzm9usjHtuUr95214496022037) androidx.versionedparcelable.KryptonFlowSessionAbstractionGyCBk5Bzm9usjHtuUr95214496022037.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541(long j, boolean z) {
        int i = (int) (j >> 60);
        if (i != 0 && i != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
            if (i == 2) {
                BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(1152921504606846975L & j);
                if (z) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480;
                        CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 = (CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792) atomicReferenceFieldUpdater.get(this);
                        long j2 = atomicLongFieldUpdater.get(this);
                        if (RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598() <= j2) {
                            break;
                        }
                        long j3 = TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                        long j4 = j2 / j3;
                        if (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 != j4 && (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 = ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834(j4, crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792)) == null) {
                            if (((CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792) atomicReferenceFieldUpdater.get(this)).ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 < j4) {
                                break;
                            }
                        } else {
                            crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                            int i2 = (int) (j2 % j3);
                            while (true) {
                                Object ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502 = crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(i2);
                                if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502 == null || ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502 == TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119) {
                                    if (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(i2, ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502, TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818)) {
                                        ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111();
                                        break;
                                    }
                                } else {
                                    if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502 == TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
                                        break;
                                    }
                                    if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502 != TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480) {
                                        if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502 != TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111) {
                                            if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502 != TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339) {
                                                if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502 != TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818) {
                                                    if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502 == TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333) {
                                                        break;
                                                    }
                                                    if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502 != TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 && j2 == atomicLongFieldUpdater.get(this)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.compareAndSet(this, j2, j2 + 1);
                        }
                    }
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException(MysticCacheBitwiseClassXy5v8026BQuXVZ72LW55346204310625.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339("unexpected close status: ", i).toString());
                }
                CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg226082128698182 = BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(1152921504606846975L & j);
                Object obj = null;
                loop0: do {
                    int i3 = TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 - 1;
                    while (true) {
                        if (-1 >= i3) {
                            break;
                        }
                        long j5 = (BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg226082128698182.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 * TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365) + i3;
                        while (true) {
                            Object ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503 = BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg226082128698182.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(i3);
                            if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503 == TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339) {
                                break loop0;
                            }
                            if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503 == TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
                                if (j5 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg226082128698182.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(i3, ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503, TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111)) {
                                    BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg226082128698182.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834(i3, null);
                                    BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg226082128698182.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818();
                                    break;
                                }
                            } else if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503 != TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 && ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503 != null) {
                                if (!(ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503 instanceof ZenithPathObjectBinaryZiZzREPQmNc7DC1FCF23765079342024) && !(ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503 instanceof MysticCacheEventLoopLibraryU6R6VVBOVPDgHjf97H57190158477616)) {
                                    ZenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528 zenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528 = TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
                                    if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503 == zenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528 || ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503 == TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170) {
                                        break loop0;
                                    }
                                    if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503 != zenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528) {
                                        break;
                                    }
                                } else {
                                    if (j5 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    ZenithPathObjectBinaryZiZzREPQmNc7DC1FCF23765079342024 zenithPathObjectBinaryZiZzREPQmNc7DC1FCF23765079342024 = ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503 instanceof MysticCacheEventLoopLibraryU6R6VVBOVPDgHjf97H57190158477616 ? ((MysticCacheEventLoopLibraryU6R6VVBOVPDgHjf97H57190158477616) ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 : (ZenithPathObjectBinaryZiZzREPQmNc7DC1FCF23765079342024) ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503;
                                    if (BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg226082128698182.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(i3, ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503, TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111)) {
                                        obj = AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252(obj, zenithPathObjectBinaryZiZzREPQmNc7DC1FCF23765079342024);
                                        BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg226082128698182.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834(i3, null);
                                        BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg226082128698182.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818();
                                        break;
                                    }
                                }
                            } else if (BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg226082128698182.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(i3, ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503, TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111)) {
                                BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg226082128698182.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818();
                                break;
                            }
                        }
                        i3--;
                    }
                } while (BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg226082128698182 != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216((ZenithPathObjectBinaryZiZzREPQmNc7DC1FCF23765079342024) arrayList.get(size), false);
                        }
                    } else {
                        KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216((ZenithPathObjectBinaryZiZzREPQmNc7DC1FCF23765079342024) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // androidx.versionedparcelable.IronMatrixRegistryAnnotationPTCrz7YE1QOIWmeEiY66110510415163
    public final Object UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(BlueKernelFrameworkFilterQxEeFq9MSyNZAHuMag79391056798063 blueKernelFrameworkFilterQxEeFq9MSyNZAHuMag79391056798063) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480;
        CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 = (CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
            boolean z = true;
            if (UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541(atomicLongFieldUpdater.get(this), true)) {
                Throwable CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927 = CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927();
                int i = TitanCloudBitfieldResourceFMAky2rR3QwRkyTkH753422638608209.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                throw CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(this);
            long j = TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
            long j2 = andIncrement / j;
            int i2 = (int) (andIncrement % j);
            if (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 != j2) {
                CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i274750438328342 = ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834(j2, crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792);
                if (ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i274750438328342 == null) {
                    continue;
                } else {
                    crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 = ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i274750438328342;
                }
            }
            Object GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178 = GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178(crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792, i2, andIncrement, null);
            Object obj = TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834;
            if (GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178 == obj) {
                GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("unexpected");
                return null;
            }
            Object obj2 = TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111;
            if (GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178 != obj2) {
                if (GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178 != TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170) {
                    crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                    return GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178;
                }
                ArcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514 WhiteFieldUnificationOverridingEBdwjF0noilpOVdrsu81945136372121 = FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.WhiteFieldUnificationOverridingEBdwjF0noilpOVdrsu81945136372121(FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(blueKernelFrameworkFilterQxEeFq9MSyNZAHuMag79391056798063));
                try {
                    Object GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG497442425181782 = GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178(crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792, i2, andIncrement, WhiteFieldUnificationOverridingEBdwjF0noilpOVdrsu81945136372121);
                    if (GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG497442425181782 == obj) {
                        WhiteFieldUnificationOverridingEBdwjF0noilpOVdrsu81945136372121.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792, i2);
                    } else if (GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG497442425181782 == obj2) {
                        if (andIncrement < RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598()) {
                            crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                        }
                        CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922 = (CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792) atomicReferenceFieldUpdater.get(this);
                        while (true) {
                            if (UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541(atomicLongFieldUpdater.get(this), z)) {
                                WhiteFieldUnificationOverridingEBdwjF0noilpOVdrsu81945136372121.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(new PhotonFrameOverloadingEngineWw7n8FB5ih6HWZQ8dp81198068058588(CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927()));
                                break;
                            }
                            long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(this);
                            long j3 = TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                            long j4 = andIncrement2 / j3;
                            int i3 = (int) (andIncrement2 % j3);
                            if (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 != j4) {
                                CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i274750438328343 = ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834(j4, crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922);
                                if (ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i274750438328343 == null) {
                                    continue;
                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                    z = true;
                                } else {
                                    crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922 = ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i274750438328343;
                                }
                            }
                            Object GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG497442425181783 = GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178(crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922, i3, andIncrement2, WhiteFieldUnificationOverridingEBdwjF0noilpOVdrsu81945136372121);
                            if (GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG497442425181783 == TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834) {
                                WhiteFieldUnificationOverridingEBdwjF0noilpOVdrsu81945136372121.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922, i3);
                                break;
                            }
                            if (GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG497442425181783 == TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.EmeraldStackInterfaceRequestBY5AOpJzA3NBvb5ccp93821256879111) {
                                if (andIncrement2 < RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598()) {
                                    crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                                }
                                atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                z = true;
                            } else {
                                if (GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG497442425181783 == TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170) {
                                    throw new IllegalStateException("unexpected");
                                }
                                crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                                WhiteFieldUnificationOverridingEBdwjF0noilpOVdrsu81945136372121.GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178(GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG497442425181783, null);
                            }
                        }
                    } else {
                        crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                        WhiteFieldUnificationOverridingEBdwjF0noilpOVdrsu81945136372121.GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178(GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG497442425181782, null);
                    }
                    return WhiteFieldUnificationOverridingEBdwjF0noilpOVdrsu81945136372121.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571();
                } catch (Throwable th) {
                    WhiteFieldUnificationOverridingEBdwjF0noilpOVdrsu81945136372121.MysticCacheParserHashmapNCNANojYkqCJuUmK2O16057626810798();
                    throw th;
                }
            }
            if (andIncrement < RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598()) {
                crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
            }
        }
    }

    public final int UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502 = crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(i);
            if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502 == null) {
                if (!YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(j) || z) {
                    if (z) {
                        if (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(i, null, TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480)) {
                            crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(i, null, TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867)) {
                    break;
                }
            } else {
                if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502 != TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119) {
                    ZenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528 zenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528 = TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
                    if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502 == zenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528) {
                        crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834(i, null);
                        return 5;
                    }
                    if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502 == TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818) {
                        crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834(i, null);
                        return 5;
                    }
                    if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502 == TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111) {
                        crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834(i, null);
                        NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480();
                        return 4;
                    }
                    crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834(i, null);
                    if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502 instanceof MysticCacheEventLoopLibraryU6R6VVBOVPDgHjf97H57190158477616) {
                        ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502 = ((MysticCacheEventLoopLibraryU6R6VVBOVPDgHjf97H57190158477616) ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                    }
                    if (WhiteFieldUnificationOverridingEBdwjF0noilpOVdrsu81945136372121(ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502, obj)) {
                        crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170(i, TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339);
                        return 0;
                    }
                    if (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.getAndSet((i * 2) + 1, zenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528) != zenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528) {
                        crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111(i, true);
                    }
                    return 5;
                }
                if (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(i, ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502, TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final boolean WhiteFieldUnificationOverridingEBdwjF0noilpOVdrsu81945136372121(Object obj, Object obj2) {
        if (!(obj instanceof IronMatrixUnificationDebuggerUQlZe2CzGVdVYkhLpV93398978278471)) {
            if (!(obj instanceof IronMatrixRequestJITLWxPCrPK8pMEZFgnSH66194039498579)) {
                GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(obj, "Unexpected receiver type: ");
                return false;
            }
            IronMatrixRequestJITLWxPCrPK8pMEZFgnSH66194039498579 ironMatrixRequestJITLWxPCrPK8pMEZFgnSH66194039498579 = (IronMatrixRequestJITLWxPCrPK8pMEZFgnSH66194039498579) obj;
            CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 = TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
            ZenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528 ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S803082287011112 = ironMatrixRequestJITLWxPCrPK8pMEZFgnSH66194039498579.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111(obj2, null);
            if (ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S803082287011112 == null) {
                return false;
            }
            ironMatrixRequestJITLWxPCrPK8pMEZFgnSH66194039498579.PhotonFrameRuntimeKeyValueRxsctdJg5CGmXPHjuh15556138883942(ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S803082287011112);
            return true;
        }
        IronMatrixUnificationDebuggerUQlZe2CzGVdVYkhLpV93398978278471 ironMatrixUnificationDebuggerUQlZe2CzGVdVYkhLpV93398978278471 = (IronMatrixUnificationDebuggerUQlZe2CzGVdVYkhLpV93398978278471) obj;
        ArcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514 arcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514 = ironMatrixUnificationDebuggerUQlZe2CzGVdVYkhLpV93398978278471.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        arcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514.getClass();
        ironMatrixUnificationDebuggerUQlZe2CzGVdVYkhLpV93398978278471.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = null;
        ironMatrixUnificationDebuggerUQlZe2CzGVdVYkhLpV93398978278471.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = obj2;
        Boolean bool = Boolean.TRUE;
        ironMatrixUnificationDebuggerUQlZe2CzGVdVYkhLpV93398978278471.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.getClass();
        CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922 = TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        ZenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528 ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S803082287011113 = arcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111(bool, null);
        if (ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S803082287011113 == null) {
            return false;
        }
        arcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514.PhotonFrameRuntimeKeyValueRxsctdJg5CGmXPHjuh15556138883942(ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S803082287011113);
        return true;
    }

    public final boolean YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(long j) {
        return j < TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.get(this) || j < YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.get(this) + ((long) this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867);
    }

    public final void ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111() {
        Object LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764;
        if (CosmicForgeResolverDataframeXWDcbZzy0pzi2voCnW56344202290983()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
        CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 = (CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.getAndIncrement(this);
            long j = andIncrement / TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
            if (RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598() <= andIncrement) {
                if (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 < j && crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365() != null) {
                    LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764(j, crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792);
                }
                XenoGridVectorHashmapRiVZttryRmb3kjjndT78819484033195(this);
                return;
            }
            if (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 != j) {
                BlazePulseContainerContainerBVHT4CC1ckAzIOerQW97105348977940 blazePulseContainerContainerBVHT4CC1ckAzIOerQW97105348977940 = BlazePulseContainerContainerBVHT4CC1ckAzIOerQW97105348977940.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
                while (true) {
                    LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764 = QuantumStreamDecoderSchedulerZuSI41Fu32QAmywXDr40521088394502.LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764(crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792, j, blazePulseContainerContainerBVHT4CC1ckAzIOerQW97105348977940);
                    if (!FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.IronMatrixPipelineVectorCmhq21DucJNfG3zCVW67482589553900(LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764)) {
                        ArcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585 GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178 = FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178(LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764);
                        while (true) {
                            ArcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585 arcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585 = (ArcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585) atomicReferenceFieldUpdater.get(this);
                            if (arcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 >= GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495) {
                                break;
                            }
                            if (!GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, arcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585, GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178)) {
                                if (atomicReferenceFieldUpdater.get(this) != arcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585) {
                                    if (GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119()) {
                                        GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867();
                                    }
                                }
                            }
                            if (arcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119()) {
                                arcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867();
                            }
                        }
                    } else {
                        break;
                    }
                }
                CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922 = null;
                if (FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.IronMatrixPipelineVectorCmhq21DucJNfG3zCVW67482589553900(LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764)) {
                    NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480();
                    LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764(j, crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792);
                    XenoGridVectorHashmapRiVZttryRmb3kjjndT78819484033195(this);
                } else {
                    CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507923 = (CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792) FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178(LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764);
                    long j2 = crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507923.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
                    if (j2 > j) {
                        long j3 = j2 * TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                        if (TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.compareAndSet(this, 1 + andIncrement, j3)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
                            if ((atomicLongFieldUpdater.addAndGet(this, j3 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            XenoGridVectorHashmapRiVZttryRmb3kjjndT78819484033195(this);
                        }
                    } else {
                        crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922 = crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507923;
                    }
                }
                if (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922 == null) {
                    continue;
                } else {
                    crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 = crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N562277399507922;
                }
            }
            int i = (int) (andIncrement % TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
            Object ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502 = crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(i);
            boolean z = ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502 instanceof ZenithPathObjectBinaryZiZzREPQmNc7DC1FCF23765079342024;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
            if (!z || andIncrement < atomicLongFieldUpdater2.get(this) || !crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(i, ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502, TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333)) {
                while (true) {
                    Object ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503 = crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(i);
                    if (!(ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503 instanceof ZenithPathObjectBinaryZiZzREPQmNc7DC1FCF23765079342024)) {
                        if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503 != TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480) {
                            if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503 != null) {
                                if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503 == TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 || ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503 == TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 || ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503 == TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339 || ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503 == TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050 || ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503 == TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111) {
                                    break loop0;
                                } else if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503 != TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170) {
                                    GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503, "Unexpected cell state: ");
                                    return;
                                }
                            } else if (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(i, ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503, TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(i, ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503, new MysticCacheEventLoopLibraryU6R6VVBOVPDgHjf97H57190158477616((ZenithPathObjectBinaryZiZzREPQmNc7DC1FCF23765079342024) ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503))) {
                            break loop0;
                        }
                    } else if (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480(i, ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503, TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333)) {
                        if (MysticCacheParserHashmapNCNANojYkqCJuUmK2O16057626810798(ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710503)) {
                            crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170(i, TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867);
                            break;
                        } else {
                            crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170(i, TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480);
                            crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818();
                        }
                    }
                }
            } else if (MysticCacheParserHashmapNCNANojYkqCJuUmK2O16057626810798(ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502)) {
                crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170(i, TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867);
                break;
            } else {
                crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170(i, TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480);
                crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818();
                XenoGridVectorHashmapRiVZttryRmb3kjjndT78819484033195(this);
            }
        }
        XenoGridVectorHashmapRiVZttryRmb3kjjndT78819484033195(this);
    }

    @Override // androidx.versionedparcelable.IronMatrixRegistryAnnotationPTCrz7YE1QOIWmeEiY66110510415163
    public final IronMatrixUnificationDebuggerUQlZe2CzGVdVYkhLpV93398978278471 iterator() {
        return new IronMatrixUnificationDebuggerUQlZe2CzGVdVYkhLpV93398978278471(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x018b, code lost:
    
        r3 = (androidx.versionedparcelable.CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792) r3.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0192, code lost:
    
        if (r3 != null) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = (int) (LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.get(this) >> 60);
        if (i == 2) {
            sb.append("closed,");
        } else if (i == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 + ',');
        sb.append("data=[");
        int i2 = 0;
        List MysticCacheManagerKeyValueImUQudc509DcNu7NkN69464633328808 = ObsidianEngineTranspilerWorkerEHoOsrsySnsoA9iWxm35468870095129.MysticCacheManagerKeyValueImUQudc509DcNu7NkN69464633328808(NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480.get(this), UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339.get(this), ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : MysticCacheManagerKeyValueImUQudc509DcNu7NkN69464633328808) {
            if (((CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792) obj) != TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792) next).ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
            do {
                Object next2 = it.next();
                long j2 = ((CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792) next2).ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792 = (CrimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792) next;
        long j3 = YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.get(this);
        long RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598 = RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598();
        loop2: while (true) {
            int i3 = TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
            int i4 = i2;
            while (true) {
                if (i4 >= i3) {
                    break;
                }
                long j4 = (crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 * TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365) + i4;
                if (j4 >= RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598 && j4 >= j3) {
                    break loop2;
                }
                Object ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502 = crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(i4);
                Object obj2 = crimsonRouteBinaryResolverLkJltUgr31BuEWcU7N56227739950792.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.get(i4 * 2);
                if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502 instanceof IronMatrixRequestJITLWxPCrPK8pMEZFgnSH66194039498579) {
                    str = (j4 >= j3 || j4 < RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598) ? (j4 >= RapidLogicStorageAnnotationHOiHqBJG1x2ry2gvMq67606915343598 || j4 < j3) ? "cont" : "send" : "receive";
                } else if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502 instanceof MysticCacheEventLoopLibraryU6R6VVBOVPDgHjf97H57190158477616) {
                    str = "EB(" + ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502 + ')';
                } else if (YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502, TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170) || YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502, TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333)) {
                    str = "resuming_sender";
                } else {
                    if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502 != null && !ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502.equals(TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119) && !ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502.equals(TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339) && !ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502.equals(TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818) && !ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502.equals(TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050) && !ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502.equals(TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480) && !ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502.equals(TitanCloudControllerRuntimeD8Sm4xDlRopCIvgDqy54717081108484.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111)) {
                        str = ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB681473604710502.toString();
                    }
                    i4++;
                }
                if (obj2 != null) {
                    sb.append("(" + str + ',' + obj2 + "),");
                } else {
                    sb.append(str + ',');
                }
                i4++;
            }
            i2 = 0;
        }
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1).getClass();
        }
        sb.append("]");
        return sb.toString();
    }
}

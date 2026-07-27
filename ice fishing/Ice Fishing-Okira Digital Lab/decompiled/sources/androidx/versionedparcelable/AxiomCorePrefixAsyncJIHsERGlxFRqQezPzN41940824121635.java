package androidx.versionedparcelable;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public class AxiomCorePrefixAsyncJIHsERGlxFRqQezPzN41940824121635 {
    public final DeltaSignalTransportRegistryKMRwq5hoVXAhqfNIjf24104862278828 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = AtomicReferenceFieldUpdater.newUpdater(AxiomCorePrefixAsyncJIHsERGlxFRqQezPzN41940824121635.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = AtomicLongFieldUpdater.newUpdater(AxiomCorePrefixAsyncJIHsERGlxFRqQezPzN41940824121635.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = AtomicReferenceFieldUpdater.newUpdater(AxiomCorePrefixAsyncJIHsERGlxFRqQezPzN41940824121635.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = AtomicLongFieldUpdater.newUpdater(AxiomCorePrefixAsyncJIHsERGlxFRqQezPzN41940824121635.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = AtomicIntegerFieldUpdater.newUpdater(AxiomCorePrefixAsyncJIHsERGlxFRqQezPzN41940824121635.class, "_availablePermits$volatile");

    public AxiomCorePrefixAsyncJIHsERGlxFRqQezPzN41940824121635() {
        YellowLoopDebuggerLambdaRrKu0ctJrJGwCf4doJ39405634898623 yellowLoopDebuggerLambdaRrKu0ctJrJGwCf4doJ39405634898623 = new YellowLoopDebuggerLambdaRrKu0ctJrJGwCf4doJ39405634898623(0L, null, 2);
        this.head$volatile = yellowLoopDebuggerLambdaRrKu0ctJrJGwCf4doJ39405634898623;
        this.tail$volatile = yellowLoopDebuggerLambdaRrKu0ctJrJGwCf4doJ39405634898623;
        this._availablePermits$volatile = 1;
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = new DeltaSignalTransportRegistryKMRwq5hoVXAhqfNIjf24104862278828(4, this);
    }

    public final void AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365() {
        boolean z;
        int i;
        Object LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z = true;
            if (andIncrement >= 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
            YellowLoopDebuggerLambdaRrKu0ctJrJGwCf4doJ39405634898623 yellowLoopDebuggerLambdaRrKu0ctJrJGwCf4doJ39405634898623 = (YellowLoopDebuggerLambdaRrKu0ctJrJGwCf4doJ39405634898623) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.getAndIncrement(this);
            long j = andIncrement2 / CosmicForgeOverloadingAsyncKzbHa1dpKvrQII7aGy23648060416915.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
            TitanCloudStorageContextX4XRmWqDcFmEDE76RD36615036230011 titanCloudStorageContextX4XRmWqDcFmEDE76RD36615036230011 = TitanCloudStorageContextX4XRmWqDcFmEDE76RD36615036230011.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
            while (true) {
                LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764 = QuantumStreamDecoderSchedulerZuSI41Fu32QAmywXDr40521088394502.LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764(yellowLoopDebuggerLambdaRrKu0ctJrJGwCf4doJ39405634898623, j, titanCloudStorageContextX4XRmWqDcFmEDE76RD36615036230011);
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
            YellowLoopDebuggerLambdaRrKu0ctJrJGwCf4doJ39405634898623 yellowLoopDebuggerLambdaRrKu0ctJrJGwCf4doJ394056348986232 = (YellowLoopDebuggerLambdaRrKu0ctJrJGwCf4doJ39405634898623) FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178(LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764);
            AtomicReferenceArray atomicReferenceArray = yellowLoopDebuggerLambdaRrKu0ctJrJGwCf4doJ394056348986232.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
            yellowLoopDebuggerLambdaRrKu0ctJrJGwCf4doJ394056348986232.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
            boolean z2 = false;
            if (yellowLoopDebuggerLambdaRrKu0ctJrJGwCf4doJ394056348986232.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 <= j) {
                int i2 = (int) (andIncrement2 % CosmicForgeOverloadingAsyncKzbHa1dpKvrQII7aGy23648060416915.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
                Object andSet = atomicReferenceArray.getAndSet(i2, CosmicForgeOverloadingAsyncKzbHa1dpKvrQII7aGy23648060416915.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
                if (andSet == null) {
                    int i3 = CosmicForgeOverloadingAsyncKzbHa1dpKvrQII7aGy23648060416915.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            ZenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528 zenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528 = CosmicForgeOverloadingAsyncKzbHa1dpKvrQII7aGy23648060416915.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                            ZenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528 zenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr662982519815282 = CosmicForgeOverloadingAsyncKzbHa1dpKvrQII7aGy23648060416915.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i2, zenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528, zenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr662982519815282)) {
                                    z2 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i2) != zenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528) {
                                    break;
                                }
                            }
                            z = true ^ z2;
                        } else if (atomicReferenceArray.get(i2) == CosmicForgeOverloadingAsyncKzbHa1dpKvrQII7aGy23648060416915.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                } else if (andSet != CosmicForgeOverloadingAsyncKzbHa1dpKvrQII7aGy23648060416915.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119) {
                    if (!(andSet instanceof IronMatrixRequestJITLWxPCrPK8pMEZFgnSH66194039498579)) {
                        GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(andSet, "unexpected: ");
                        return;
                    }
                    IronMatrixRequestJITLWxPCrPK8pMEZFgnSH66194039498579 ironMatrixRequestJITLWxPCrPK8pMEZFgnSH66194039498579 = (IronMatrixRequestJITLWxPCrPK8pMEZFgnSH66194039498579) andSet;
                    ZenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528 ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111 = ironMatrixRequestJITLWxPCrPK8pMEZFgnSH66194039498579.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111(AxiomCoreResolverAbstractionEJ1gjjFA6j8B9UV1YX42911071710133.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800, this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
                    if (ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111 != null) {
                        ironMatrixRequestJITLWxPCrPK8pMEZFgnSH66194039498579.PhotonFrameRuntimeKeyValueRxsctdJg5CGmXPHjuh15556138883942(ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111);
                    }
                }
            }
            z = false;
        } while (!z);
    }

    public final void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(LunarNodeWildcardKeyValueIV91Dz0OgsdPJ00pn864939134961857 lunarNodeWildcardKeyValueIV91Dz0OgsdPJ00pn864939134961857) {
        Object LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764;
        YellowLoopDebuggerLambdaRrKu0ctJrJGwCf4doJ39405634898623 yellowLoopDebuggerLambdaRrKu0ctJrJGwCf4doJ39405634898623;
        ArcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514 arcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514 = lunarNodeWildcardKeyValueIV91Dz0OgsdPJ00pn864939134961857.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        RapidLogicConnectorGenericJilgsTVslAeqjuW65B99759970293178 rapidLogicConnectorGenericJilgsTVslAeqjuW65B99759970293178 = lunarNodeWildcardKeyValueIV91Dz0OgsdPJ00pn864939134961857.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        while (true) {
            int andDecrement = YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.getAndDecrement(this);
            if (andDecrement <= 1) {
                int i = 0;
                int i2 = 17;
                AxiomCoreResolverAbstractionEJ1gjjFA6j8B9UV1YX42911071710133 axiomCoreResolverAbstractionEJ1gjjFA6j8B9UV1YX42911071710133 = AxiomCoreResolverAbstractionEJ1gjjFA6j8B9UV1YX42911071710133.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                if (andDecrement > 0) {
                    RapidLogicConnectorGenericJilgsTVslAeqjuW65B99759970293178.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.set(rapidLogicConnectorGenericJilgsTVslAeqjuW65B99759970293178, null);
                    arcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(axiomCoreResolverAbstractionEJ1gjjFA6j8B9UV1YX42911071710133, arcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170, new DeltaSignalTransportRegistryKMRwq5hoVXAhqfNIjf24104862278828(i, new MysticCacheResolverResponseFlOGfgK4VLsm4SiGMh61721050159942(i2, rapidLogicConnectorGenericJilgsTVslAeqjuW65B99759970293178, lunarNodeWildcardKeyValueIV91Dz0OgsdPJ00pn864939134961857)));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                YellowLoopDebuggerLambdaRrKu0ctJrJGwCf4doJ39405634898623 yellowLoopDebuggerLambdaRrKu0ctJrJGwCf4doJ394056348986232 = (YellowLoopDebuggerLambdaRrKu0ctJrJGwCf4doJ39405634898623) atomicReferenceFieldUpdater.get(this);
                long andIncrement = LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.getAndIncrement(this);
                SolarMeshHeuristicServicePBDxhdobkbpkHTBJDw17179724459711 solarMeshHeuristicServicePBDxhdobkbpkHTBJDw17179724459711 = SolarMeshHeuristicServicePBDxhdobkbpkHTBJDw17179724459711.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050;
                long j = andIncrement / CosmicForgeOverloadingAsyncKzbHa1dpKvrQII7aGy23648060416915.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
                while (true) {
                    LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764 = QuantumStreamDecoderSchedulerZuSI41Fu32QAmywXDr40521088394502.LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764(yellowLoopDebuggerLambdaRrKu0ctJrJGwCf4doJ394056348986232, j, solarMeshHeuristicServicePBDxhdobkbpkHTBJDw17179724459711);
                    if (!FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.IronMatrixPipelineVectorCmhq21DucJNfG3zCVW67482589553900(LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764)) {
                        ArcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585 GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178 = FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178(LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764);
                        while (true) {
                            ArcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585 arcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585 = (ArcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585) atomicReferenceFieldUpdater.get(this);
                            yellowLoopDebuggerLambdaRrKu0ctJrJGwCf4doJ39405634898623 = yellowLoopDebuggerLambdaRrKu0ctJrJGwCf4doJ394056348986232;
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
                                    yellowLoopDebuggerLambdaRrKu0ctJrJGwCf4doJ394056348986232 = yellowLoopDebuggerLambdaRrKu0ctJrJGwCf4doJ39405634898623;
                                }
                            }
                            if (arcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119()) {
                                arcticByteAnnotationTransportPr2JvfAxaYtwJPtxxC47089179583585.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867();
                            }
                        }
                    } else {
                        break;
                    }
                    yellowLoopDebuggerLambdaRrKu0ctJrJGwCf4doJ394056348986232 = yellowLoopDebuggerLambdaRrKu0ctJrJGwCf4doJ39405634898623;
                }
                YellowLoopDebuggerLambdaRrKu0ctJrJGwCf4doJ39405634898623 yellowLoopDebuggerLambdaRrKu0ctJrJGwCf4doJ394056348986233 = (YellowLoopDebuggerLambdaRrKu0ctJrJGwCf4doJ39405634898623) FrostBridgeEncoderKeyValueYxK8vgqxL64ZCoF7R598699436254235.GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178(LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764);
                AtomicReferenceArray atomicReferenceArray = yellowLoopDebuggerLambdaRrKu0ctJrJGwCf4doJ394056348986233.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
                int i3 = (int) (andIncrement % CosmicForgeOverloadingAsyncKzbHa1dpKvrQII7aGy23648060416915.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170);
                while (!atomicReferenceArray.compareAndSet(i3, null, lunarNodeWildcardKeyValueIV91Dz0OgsdPJ00pn864939134961857)) {
                    if (atomicReferenceArray.get(i3) != null) {
                        ZenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528 zenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528 = CosmicForgeOverloadingAsyncKzbHa1dpKvrQII7aGy23648060416915.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                        ZenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528 zenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr662982519815282 = CosmicForgeOverloadingAsyncKzbHa1dpKvrQII7aGy23648060416915.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
                        while (!atomicReferenceArray.compareAndSet(i3, zenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528, zenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr662982519815282)) {
                            if (atomicReferenceArray.get(i3) != zenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528) {
                                break;
                            }
                        }
                        RapidLogicConnectorGenericJilgsTVslAeqjuW65B99759970293178.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.set(rapidLogicConnectorGenericJilgsTVslAeqjuW65B99759970293178, null);
                        arcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514.UltraBufferRepositoryHandlerYQBOEcfJ7PEfKEXa2P32463876231503(axiomCoreResolverAbstractionEJ1gjjFA6j8B9UV1YX42911071710133, arcticByteRequestKeyValueV79VHzJlpMRG4Itq5w98101914719514.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170, new DeltaSignalTransportRegistryKMRwq5hoVXAhqfNIjf24104862278828(0, new MysticCacheResolverResponseFlOGfgK4VLsm4SiGMh61721050159942(17, rapidLogicConnectorGenericJilgsTVslAeqjuW65B99759970293178, lunarNodeWildcardKeyValueIV91Dz0OgsdPJ00pn864939134961857)));
                        return;
                    }
                }
                lunarNodeWildcardKeyValueIV91Dz0OgsdPJ00pn864939134961857.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(yellowLoopDebuggerLambdaRrKu0ctJrJGwCf4doJ394056348986233, i3);
                return;
            }
        }
    }
}

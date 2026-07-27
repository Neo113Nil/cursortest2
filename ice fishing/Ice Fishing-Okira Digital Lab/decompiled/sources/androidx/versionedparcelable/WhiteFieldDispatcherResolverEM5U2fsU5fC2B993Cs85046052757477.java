package androidx.versionedparcelable;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class WhiteFieldDispatcherResolverEM5U2fsU5fC2B993Cs85046052757477 implements Executor, Closeable {
    public final ZenithPathJITClassMPaW5tBKE1GT2E0Ruk20108758879409 BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
    public final int LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final BlazePulseLoaderMacroYgqALak68JdSXfPbn564201541892724 NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480;
    public final int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final String TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
    public final ZenithPathJITClassMPaW5tBKE1GT2E0Ruk20108758879409 UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339;
    public final long YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;
    public static final /* synthetic */ AtomicLongFieldUpdater ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050 = AtomicLongFieldUpdater.newUpdater(WhiteFieldDispatcherResolverEM5U2fsU5fC2B993Cs85046052757477.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111 = AtomicLongFieldUpdater.newUpdater(WhiteFieldDispatcherResolverEM5U2fsU5fC2B993Cs85046052757477.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834 = AtomicIntegerFieldUpdater.newUpdater(WhiteFieldDispatcherResolverEM5U2fsU5fC2B993Cs85046052757477.class, "_isTerminated$volatile");
    public static final ZenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528 CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170 = new ZenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528("NOT_IN_STACK", 1);

    public WhiteFieldDispatcherResolverEM5U2fsU5fC2B993Cs85046052757477(int i, int i2, long j, String str) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = i2;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = j;
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = str;
        if (i < 1) {
            CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170("Core pool size ", i, " should be at least 1");
            throw null;
        }
        if (i2 < i) {
            throw new IllegalArgumentException(MysticCacheBitwiseClassXy5v8026BQuXVZ72LW55346204310625.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480("Max pool size ", i2, " should be greater than or equals to core pool size ", i).toString());
        }
        if (i2 > 2097150) {
            CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150");
            throw null;
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = new ZenithPathJITClassMPaW5tBKE1GT2E0Ruk20108758879409();
        this.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339 = new ZenithPathJITClassMPaW5tBKE1GT2E0Ruk20108758879409();
        this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480 = new BlazePulseLoaderMacroYgqALak68JdSXfPbn564201541892724((i + 1) * 2);
        this.controlState$volatile = i << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(WhiteFieldDispatcherResolverEM5U2fsU5fC2B993Cs85046052757477 whiteFieldDispatcherResolverEM5U2fsU5fC2B993Cs85046052757477, Runnable runnable, int i) {
        whiteFieldDispatcherResolverEM5U2fsU5fC2B993Cs85046052757477.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(runnable, false, (i & 4) == 0);
    }

    public final void AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(Runnable runnable, boolean z, boolean z2) {
        PhotonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328 quantumStreamNamespaceResponseYzcxBOHRQ2aTfv877H39720415791338;
        EmeraldStackMultithreadingInterpreterXCcqeCFZucBSetwftz64953642582377 emeraldStackMultithreadingInterpreterXCcqeCFZucBSetwftz64953642582377;
        ZenithPathFactoryDelegateEho10cscQk9NbgdEAP95327785877302.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof PhotonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328) {
            quantumStreamNamespaceResponseYzcxBOHRQ2aTfv877H39720415791338 = (PhotonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328) runnable;
            quantumStreamNamespaceResponseYzcxBOHRQ2aTfv877H39720415791338.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = nanoTime;
            quantumStreamNamespaceResponseYzcxBOHRQ2aTfv877H39720415791338.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = z;
        } else {
            quantumStreamNamespaceResponseYzcxBOHRQ2aTfv877H39720415791338 = new QuantumStreamNamespaceResponseYzcxBOHRQ2aTfv877H39720415791338(runnable, nanoTime, z);
        }
        boolean z3 = quantumStreamNamespaceResponseYzcxBOHRQ2aTfv877H39720415791338.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111;
        long addAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        MysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671 mysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671 = currentThread instanceof MysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671 ? (MysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671) currentThread : null;
        if (mysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671 == null || mysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050 != this) {
            mysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671 = null;
        }
        if (mysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671 != null && (emeraldStackMultithreadingInterpreterXCcqeCFZucBSetwftz64953642582377 = mysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170) != EmeraldStackMultithreadingInterpreterXCcqeCFZucBSetwftz64953642582377.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 && (quantumStreamNamespaceResponseYzcxBOHRQ2aTfv877H39720415791338.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 || emeraldStackMultithreadingInterpreterXCcqeCFZucBSetwftz64953642582377 != EmeraldStackMultithreadingInterpreterXCcqeCFZucBSetwftz64953642582377.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119)) {
            mysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480 = true;
            HeliosRuntimeAnnotationJITCi0hy3qgVJzi0eNQfB38154420983127 heliosRuntimeAnnotationJITCi0hy3qgVJzi0eNQfB38154420983127 = mysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
            if (z2) {
                quantumStreamNamespaceResponseYzcxBOHRQ2aTfv877H39720415791338 = heliosRuntimeAnnotationJITCi0hy3qgVJzi0eNQfB38154420983127.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(quantumStreamNamespaceResponseYzcxBOHRQ2aTfv877H39720415791338);
            } else {
                heliosRuntimeAnnotationJITCi0hy3qgVJzi0eNQfB38154420983127.getClass();
                PhotonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328 photonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328 = (PhotonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328) HeliosRuntimeAnnotationJITCi0hy3qgVJzi0eNQfB38154420983127.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.getAndSet(heliosRuntimeAnnotationJITCi0hy3qgVJzi0eNQfB38154420983127, quantumStreamNamespaceResponseYzcxBOHRQ2aTfv877H39720415791338);
                quantumStreamNamespaceResponseYzcxBOHRQ2aTfv877H39720415791338 = photonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328 == null ? null : heliosRuntimeAnnotationJITCi0hy3qgVJzi0eNQfB38154420983127.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(photonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328);
            }
        }
        if (quantumStreamNamespaceResponseYzcxBOHRQ2aTfv877H39720415791338 != null) {
            if (!(quantumStreamNamespaceResponseYzcxBOHRQ2aTfv877H39720415791338.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 ? this.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(quantumStreamNamespaceResponseYzcxBOHRQ2aTfv877H39720415791338) : this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(quantumStreamNamespaceResponseYzcxBOHRQ2aTfv877H39720415791338))) {
                throw new RejectedExecutionException(this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 + " was terminated");
            }
        }
        boolean z4 = z2 && mysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671 != null;
        if (z3) {
            if (z4 || YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170() || LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(addAndGet)) {
                return;
            }
            YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170();
            return;
        }
        if (z4 || YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170() || LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(atomicLongFieldUpdater.get(this))) {
            return;
        }
        YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170();
    }

    public final boolean LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        if (i < i2) {
            int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
            if (ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 == 1 && i2 > 1) {
                ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
            }
            if (ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 > 0) {
                return true;
            }
        }
        return false;
    }

    public final int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800() {
        synchronized (this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480) {
            try {
                if (ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
                    return 0;
                }
                if (i >= this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                MysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671 mysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671 = new MysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671(this, i3);
                this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(i3, mysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                mysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(MysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671 mysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671, int i, int i2) {
        while (true) {
            long j = ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = mysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495();
                    while (true) {
                        if (ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 == CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170) {
                            i3 = -1;
                            break;
                        }
                        if (ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 == null) {
                            i3 = 0;
                            break;
                        }
                        MysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671 mysticCacheJITProcessorKVhkioNiuyXjzOFjKy656662992866712 = (MysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671) ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
                        int AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = mysticCacheJITProcessorKVhkioNiuyXjzOFjKy656662992866712.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365();
                        if (AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 != 0) {
                            i3 = AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                            break;
                        }
                        ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = mysticCacheJITProcessorKVhkioNiuyXjzOFjKy656662992866712.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                WhiteFieldDispatcherResolverEM5U2fsU5fC2B993Cs85046052757477 whiteFieldDispatcherResolverEM5U2fsU5fC2B993Cs85046052757477 = this;
                if (ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050.compareAndSet(whiteFieldDispatcherResolverEM5U2fsU5fC2B993Cs85046052757477, j, i3 | j2)) {
                    return;
                } else {
                    this = whiteFieldDispatcherResolverEM5U2fsU5fC2B993Cs85046052757477;
                }
            }
        }
    }

    public final boolean YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170() {
        WhiteFieldDispatcherResolverEM5U2fsU5fC2B993Cs85046052757477 whiteFieldDispatcherResolverEM5U2fsU5fC2B993Cs85046052757477;
        ZenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528 zenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528;
        int i;
        while (true) {
            long j = ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050.get(this);
            MysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671 mysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671 = (MysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671) this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365((int) (2097151 & j));
            if (mysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671 == null) {
                mysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671 = null;
                whiteFieldDispatcherResolverEM5U2fsU5fC2B993Cs85046052757477 = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = mysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495();
                while (true) {
                    zenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528 = CosmicForgeLambdaPrimitiveYEpIvDzOQ3Qs7wr2vn11323896047170;
                    if (ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 == zenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528) {
                        i = -1;
                        break;
                    }
                    if (ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 == null) {
                        i = 0;
                        break;
                    }
                    MysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671 mysticCacheJITProcessorKVhkioNiuyXjzOFjKy656662992866712 = (MysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671) ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
                    i = mysticCacheJITProcessorKVhkioNiuyXjzOFjKy656662992866712.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365();
                    if (i != 0) {
                        break;
                    }
                    ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = mysticCacheJITProcessorKVhkioNiuyXjzOFjKy656662992866712.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495();
                    j = j;
                }
                if (i >= 0) {
                    WhiteFieldDispatcherResolverEM5U2fsU5fC2B993Cs85046052757477 whiteFieldDispatcherResolverEM5U2fsU5fC2B993Cs850460527574772 = this;
                    boolean compareAndSet = ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050.compareAndSet(whiteFieldDispatcherResolverEM5U2fsU5fC2B993Cs850460527574772, j, i | j2);
                    whiteFieldDispatcherResolverEM5U2fsU5fC2B993Cs85046052757477 = whiteFieldDispatcherResolverEM5U2fsU5fC2B993Cs850460527574772;
                    if (compareAndSet) {
                        mysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(zenithPathCoroutineFloatingPointCvMj9NrNitkJWNmuqr66298251981528);
                    }
                    this = whiteFieldDispatcherResolverEM5U2fsU5fC2B993Cs85046052757477;
                } else {
                    continue;
                }
            }
            if (mysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671 == null) {
                return false;
            }
            if (MysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671.ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111.compareAndSet(mysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671, -1, 0)) {
                LockSupport.unpark(mysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671);
                return true;
            }
            this = whiteFieldDispatcherResolverEM5U2fsU5fC2B993Cs85046052757477;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
    
        if (r1 == null) goto L38;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i;
        PhotonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328 photonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328;
        if (ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            MysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671 mysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671 = currentThread instanceof MysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671 ? (MysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671) currentThread : null;
            if (mysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671 == null || mysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050 != this) {
                mysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671 = null;
            }
            synchronized (this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480) {
                i = (int) (ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(i2);
                    AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.getClass();
                    MysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671 mysticCacheJITProcessorKVhkioNiuyXjzOFjKy656662992866712 = (MysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671) AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                    if (mysticCacheJITProcessorKVhkioNiuyXjzOFjKy656662992866712 != mysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671) {
                        while (mysticCacheJITProcessorKVhkioNiuyXjzOFjKy656662992866712.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(mysticCacheJITProcessorKVhkioNiuyXjzOFjKy656662992866712);
                            mysticCacheJITProcessorKVhkioNiuyXjzOFjKy656662992866712.join(10000L);
                        }
                        HeliosRuntimeAnnotationJITCi0hy3qgVJzi0eNQfB38154420983127 heliosRuntimeAnnotationJITCi0hy3qgVJzi0eNQfB38154420983127 = mysticCacheJITProcessorKVhkioNiuyXjzOFjKy656662992866712.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                        ZenithPathJITClassMPaW5tBKE1GT2E0Ruk20108758879409 zenithPathJITClassMPaW5tBKE1GT2E0Ruk20108758879409 = this.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339;
                        heliosRuntimeAnnotationJITCi0hy3qgVJzi0eNQfB38154420983127.getClass();
                        PhotonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328 photonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm687881739193282 = (PhotonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328) HeliosRuntimeAnnotationJITCi0hy3qgVJzi0eNQfB38154420983127.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.getAndSet(heliosRuntimeAnnotationJITCi0hy3qgVJzi0eNQfB38154420983127, null);
                        if (photonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm687881739193282 != null) {
                            zenithPathJITClassMPaW5tBKE1GT2E0Ruk20108758879409.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(photonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm687881739193282);
                        }
                        while (true) {
                            PhotonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328 AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet424254952273652 = heliosRuntimeAnnotationJITCi0hy3qgVJzi0eNQfB38154420983127.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365();
                            if (AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet424254952273652 == null) {
                                break;
                            } else {
                                zenithPathJITClassMPaW5tBKE1GT2E0Ruk20108758879409.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet424254952273652);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365();
            this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365();
            while (true) {
                if (mysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671 != null) {
                    photonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328 = mysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(true);
                }
                photonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328 = (PhotonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328) this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867();
                if (photonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328 == null && (photonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328 = (PhotonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328) this.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867()) == null) {
                    break;
                }
                try {
                    photonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (mysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671 != null) {
                mysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(EmeraldStackMultithreadingInterpreterXCcqeCFZucBSetwftz64953642582377.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818);
            }
            ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050.set(this, 0L);
            ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(this, runnable, 6);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BlazePulseLoaderMacroYgqALak68JdSXfPbn564201541892724 blazePulseLoaderMacroYgqALak68JdSXfPbn564201541892724 = this.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480;
        int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = blazePulseLoaderMacroYgqALak68JdSXfPbn564201541892724.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800; i6++) {
            MysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671 mysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671 = (MysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671) blazePulseLoaderMacroYgqALak68JdSXfPbn564201541892724.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(i6);
            if (mysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671 != null) {
                HeliosRuntimeAnnotationJITCi0hy3qgVJzi0eNQfB38154420983127 heliosRuntimeAnnotationJITCi0hy3qgVJzi0eNQfB38154420983127 = mysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                heliosRuntimeAnnotationJITCi0hy3qgVJzi0eNQfB38154420983127.getClass();
                int i7 = HeliosRuntimeAnnotationJITCi0hy3qgVJzi0eNQfB38154420983127.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.get(heliosRuntimeAnnotationJITCi0hy3qgVJzi0eNQfB38154420983127) != null ? (HeliosRuntimeAnnotationJITCi0hy3qgVJzi0eNQfB38154420983127.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.get(heliosRuntimeAnnotationJITCi0hy3qgVJzi0eNQfB38154420983127) - HeliosRuntimeAnnotationJITCi0hy3qgVJzi0eNQfB38154420983127.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.get(heliosRuntimeAnnotationJITCi0hy3qgVJzi0eNQfB38154420983127)) + 1 : HeliosRuntimeAnnotationJITCi0hy3qgVJzi0eNQfB38154420983127.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.get(heliosRuntimeAnnotationJITCi0hy3qgVJzi0eNQfB38154420983127) - HeliosRuntimeAnnotationJITCi0hy3qgVJzi0eNQfB38154420983127.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.get(heliosRuntimeAnnotationJITCi0hy3qgVJzi0eNQfB38154420983127);
                int ordinal = mysticCacheJITProcessorKVhkioNiuyXjzOFjKy65666299286671.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.ordinal();
                if (ordinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i3++;
                } else if (ordinal == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (ordinal != 4) {
                        CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = ZenithPathAsyncProxyYsuqZe7hEIApTFZo9S80308228701111.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333);
        sb4.append('@');
        sb4.append(DeltaSignalNormalizationJITQ7KMe5q3hsuA9VOtI478044089954652.WhiteFieldUnificationOverridingEBdwjF0noilpOVdrsu81945136372121(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        sb4.append(i8);
        sb4.append(", max = ");
        sb4.append(this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}

package androidx.versionedparcelable;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class HeliosRuntimeAnnotationJITCi0hy3qgVJzi0eNQfB38154420983127 {
    public final AtomicReferenceArray ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = AtomicReferenceFieldUpdater.newUpdater(HeliosRuntimeAnnotationJITCi0hy3qgVJzi0eNQfB38154420983127.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = AtomicIntegerFieldUpdater.newUpdater(HeliosRuntimeAnnotationJITCi0hy3qgVJzi0eNQfB38154420983127.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = AtomicIntegerFieldUpdater.newUpdater(HeliosRuntimeAnnotationJITCi0hy3qgVJzi0eNQfB38154420983127.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = AtomicIntegerFieldUpdater.newUpdater(HeliosRuntimeAnnotationJITCi0hy3qgVJzi0eNQfB38154420983127.class, "blockingTasksInBuffer$volatile");

    public final PhotonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328 ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        PhotonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328 photonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328 = (PhotonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328) atomicReferenceArray.get(i2);
        if (photonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328 != null && photonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 == z) {
            while (!atomicReferenceArray.compareAndSet(i2, photonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328, null)) {
                if (atomicReferenceArray.get(i2) != photonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328) {
                }
            }
            if (z) {
                LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.decrementAndGet(this);
            }
            return photonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328;
        }
        return null;
    }

    public final PhotonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328 AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365() {
        PhotonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328 photonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (photonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328 = (PhotonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328) this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.getAndSet(i2, null)) != null) {
                if (photonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119) {
                    LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.decrementAndGet(this);
                }
                return photonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328;
            }
        }
    }

    public final PhotonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(PhotonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328 photonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
        if (atomicIntegerFieldUpdater.get(this) - RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.get(this) == 127) {
            return photonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328;
        }
        if (photonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119) {
            LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, photonFrameFactoryBinaryTreeBQUu7bDIRIir6mElDm68788173919328);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }
}

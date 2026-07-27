package androidx.versionedparcelable;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class BlazePulseAttributePayloadOhATDRoBElE1rGKjTK69793734165372 implements DeltaSignalDataframeConstructorZnrGpuGFtkbsbqSYk269612560892944 {
    public final DeltaSignalOverridingOverloadingCfBFhkQKVrwHgIAxld28348697448301 RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public static final /* synthetic */ AtomicIntegerFieldUpdater LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = AtomicIntegerFieldUpdater.newUpdater(BlazePulseAttributePayloadOhATDRoBElE1rGKjTK69793734165372.class, "_isCompleting$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = AtomicReferenceFieldUpdater.newUpdater(BlazePulseAttributePayloadOhATDRoBElE1rGKjTK69793734165372.class, Object.class, "_rootCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = AtomicReferenceFieldUpdater.newUpdater(BlazePulseAttributePayloadOhATDRoBElE1rGKjTK69793734165372.class, Object.class, "_exceptionsHolder$volatile");

    public BlazePulseAttributePayloadOhATDRoBElE1rGKjTK69793734165372(DeltaSignalOverridingOverloadingCfBFhkQKVrwHgIAxld28348697448301 deltaSignalOverridingOverloadingCfBFhkQKVrwHgIAxld28348697448301, Throwable th) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = deltaSignalOverridingOverloadingCfBFhkQKVrwHgIAxld28348697448301;
        this._rootCause$volatile = th;
    }

    public final Throwable ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495() {
        return (Throwable) YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.get(this);
    }

    @Override // androidx.versionedparcelable.DeltaSignalDataframeConstructorZnrGpuGFtkbsbqSYk269612560892944
    public final boolean AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365() {
        return ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495() == null;
    }

    public final boolean LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119() {
        return ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495() != null;
    }

    public final void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(Throwable th) {
        Throwable ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495();
        if (ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 == null) {
            YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170.set(this, th);
            return;
        }
        if (th == ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(obj, "State is ");
                return;
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    @Override // androidx.versionedparcelable.DeltaSignalDataframeConstructorZnrGpuGFtkbsbqSYk269612560892944
    public final DeltaSignalOverridingOverloadingCfBFhkQKVrwHgIAxld28348697448301 RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867() {
        return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    }

    public final ArrayList YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                GoldenVectorBitwiseWorkerV4G0Yk8psAfnUgbBlF71709461005246.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(obj, "State is ");
                return null;
            }
            arrayList = (ArrayList) obj;
        }
        Throwable ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495();
        if (ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 != null) {
            arrayList.add(0, ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495);
        }
        if (th != null && !th.equals(ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119);
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119());
        sb.append(", completing=");
        sb.append(LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.get(this) != 0);
        sb.append(", rootCause=");
        sb.append(ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495());
        sb.append(", exceptions=");
        sb.append(TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.get(this));
        sb.append(", list=");
        sb.append(this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867);
        sb.append(']');
        return sb.toString();
    }
}

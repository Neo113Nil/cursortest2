package androidx.versionedparcelable;

import java.util.List;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class IronMatrixObserverBufferN7cONRt08ooOuTJMVj50275761508803 {
    public final int AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final List ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public IronMatrixObserverBufferN7cONRt08ooOuTJMVj50275761508803(int i, List list) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = list;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        StringBuilder ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834 = MysticCacheBitwiseClassXy5v8026BQuXVZ72LW55346204310625.ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834("Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", i, "', bounds = '");
        ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834.append(ObsidianEngineTranspilerWorkerEHoOsrsySnsoA9iWxm35468870095129.KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216(list));
        ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834.append("'.");
        throw new IllegalArgumentException(ObsidianEngineTokenDecoderIG41scEIZAujyeJD0i27475043832834.toString().toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IronMatrixObserverBufferN7cONRt08ooOuTJMVj50275761508803.class != obj.getClass()) {
            return false;
        }
        IronMatrixObserverBufferN7cONRt08ooOuTJMVj50275761508803 ironMatrixObserverBufferN7cONRt08ooOuTJMVj50275761508803 = (IronMatrixObserverBufferN7cONRt08ooOuTJMVj50275761508803) obj;
        return this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 == ironMatrixObserverBufferN7cONRt08ooOuTJMVj50275761508803.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 && YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800, ironMatrixObserverBufferN7cONRt08ooOuTJMVj50275761508803.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
    }

    public final int hashCode() {
        return this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.hashCode() + (this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 + ", mergedHistory=" + this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 + ')';
    }

    public IronMatrixObserverBufferN7cONRt08ooOuTJMVj50275761508803() {
        this(-1, GoldenVectorLoaderRegistryZGq5hhbhblpJ1mpgXV59878749628960.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867);
    }
}

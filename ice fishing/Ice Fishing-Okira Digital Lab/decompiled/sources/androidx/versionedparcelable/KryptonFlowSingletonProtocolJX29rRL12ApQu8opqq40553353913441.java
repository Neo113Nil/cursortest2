package androidx.versionedparcelable;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class KryptonFlowSingletonProtocolJX29rRL12ApQu8opqq40553353913441 {
    public final long ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    public final int AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
    public final long RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public KryptonFlowSingletonProtocolJX29rRL12ApQu8opqq40553353913441(int i, int i2, long j, long j2) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = i;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = i2;
        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = j;
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = j2;
    }

    public static KryptonFlowSingletonProtocolJX29rRL12ApQu8opqq40553353913441 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            KryptonFlowSingletonProtocolJX29rRL12ApQu8opqq40553353913441 kryptonFlowSingletonProtocolJX29rRL12ApQu8opqq40553353913441 = new KryptonFlowSingletonProtocolJX29rRL12ApQu8opqq40553353913441(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return kryptonFlowSingletonProtocolJX29rRL12ApQu8opqq40553353913441;
        } finally {
        }
    }

    public final void AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
            dataOutputStream.writeInt(this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
            dataOutputStream.writeLong(this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495);
            dataOutputStream.writeLong(this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof KryptonFlowSingletonProtocolJX29rRL12ApQu8opqq40553353913441)) {
            KryptonFlowSingletonProtocolJX29rRL12ApQu8opqq40553353913441 kryptonFlowSingletonProtocolJX29rRL12ApQu8opqq40553353913441 = (KryptonFlowSingletonProtocolJX29rRL12ApQu8opqq40553353913441) obj;
            if (this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 == kryptonFlowSingletonProtocolJX29rRL12ApQu8opqq40553353913441.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 && this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 == kryptonFlowSingletonProtocolJX29rRL12ApQu8opqq40553353913441.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 && this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 == kryptonFlowSingletonProtocolJX29rRL12ApQu8opqq40553353913441.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 && this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 == kryptonFlowSingletonProtocolJX29rRL12ApQu8opqq40553353913441.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365), Long.valueOf(this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495), Integer.valueOf(this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800), Long.valueOf(this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867));
    }
}

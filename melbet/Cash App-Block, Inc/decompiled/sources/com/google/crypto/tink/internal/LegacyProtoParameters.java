package com.google.crypto.tink.internal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.work.impl.WorkLauncherImpl;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.util.Bytes;
import java.util.Objects;

/* loaded from: classes.dex */
public final class LegacyProtoParameters extends Parameters {
    public final WorkLauncherImpl serialization;

    public LegacyProtoParameters(WorkLauncherImpl workLauncherImpl) {
        this.serialization = workLauncherImpl;
    }

    public final boolean equals(Object obj) {
        KeyTemplate keyTemplate = (KeyTemplate) this.serialization.workTaskExecutor;
        if (!(obj instanceof LegacyProtoParameters)) {
            return false;
        }
        WorkLauncherImpl workLauncherImpl = ((LegacyProtoParameters) obj).serialization;
        OutputPrefixType outputPrefixType = keyTemplate.getOutputPrefixType();
        KeyTemplate keyTemplate2 = (KeyTemplate) workLauncherImpl.workTaskExecutor;
        return outputPrefixType.equals(keyTemplate2.getOutputPrefixType()) && keyTemplate.getTypeUrl().equals(keyTemplate2.getTypeUrl()) && keyTemplate.getValue().equals(keyTemplate2.getValue());
    }

    @Override // com.google.crypto.tink.Parameters
    public final boolean hasIdRequirement() {
        return ((KeyTemplate) this.serialization.workTaskExecutor).getOutputPrefixType() != OutputPrefixType.RAW;
    }

    public final int hashCode() {
        WorkLauncherImpl workLauncherImpl = this.serialization;
        return Objects.hash((KeyTemplate) workLauncherImpl.workTaskExecutor, (Bytes) workLauncherImpl.processor);
    }

    public final String toString() {
        KeyTemplate keyTemplate = (KeyTemplate) this.serialization.workTaskExecutor;
        String typeUrl = keyTemplate.getTypeUrl();
        int ordinal = keyTemplate.getOutputPrefixType().ordinal();
        return Boxes$$ExternalSyntheticOutline1.m("(typeUrl=", typeUrl, ", outputPrefixType=", ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
    }
}

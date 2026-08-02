package com.google.crypto.tink.internal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.util.Bytes;

/* loaded from: classes.dex */
public final class LegacyProtoKey extends TransactorKt {
    public final ProtoKeySerialization serialization;

    /* loaded from: classes4.dex */
    public final class LegacyProtoParametersNotForCreation extends Parameters {
        public final OutputPrefixType outputPrefixType;
        public final String typeUrl;

        public LegacyProtoParametersNotForCreation(String str, OutputPrefixType outputPrefixType) {
            this.typeUrl = str;
            this.outputPrefixType = outputPrefixType;
        }

        @Override // com.google.crypto.tink.Parameters
        public final boolean hasIdRequirement() {
            return this.outputPrefixType != OutputPrefixType.RAW;
        }

        public final String toString() {
            int ordinal = this.outputPrefixType.ordinal();
            return Boxes$$ExternalSyntheticOutline1.m("(typeUrl=", this.typeUrl, ", outputPrefixType=", ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
        }
    }

    public LegacyProtoKey(ProtoKeySerialization protoKeySerialization) {
        protoKeySerialization.keyMaterialType.ordinal();
        this.serialization = protoKeySerialization;
    }

    public static void throwIfMissingAccess(ProtoKeySerialization protoKeySerialization) {
        protoKeySerialization.keyMaterialType.ordinal();
    }

    @Override // androidx.room.TransactorKt
    public final Integer getIdRequirementOrNull() {
        return this.serialization.idRequirement;
    }

    public final Bytes getOutputPrefix() {
        ProtoKeySerialization protoKeySerialization = this.serialization;
        OutputPrefixType outputPrefixType = protoKeySerialization.outputPrefixType;
        Integer num = protoKeySerialization.idRequirement;
        if (outputPrefixType.equals(OutputPrefixType.RAW)) {
            return Bytes.copyFrom(new byte[0]);
        }
        if (outputPrefixType.equals(OutputPrefixType.TINK)) {
            return OutputPrefixUtil.getTinkOutputPrefix(num.intValue());
        }
        if (outputPrefixType.equals(OutputPrefixType.LEGACY) || outputPrefixType.equals(OutputPrefixType.CRUNCHY)) {
            return OutputPrefixUtil.getLegacyOutputPrefix(num.intValue());
        }
        a$$ExternalSyntheticBUOutline0.m$6("Unknown output prefix type");
        return null;
    }

    @Override // androidx.room.TransactorKt
    public final Parameters getParameters() {
        ProtoKeySerialization protoKeySerialization = this.serialization;
        return new LegacyProtoParametersNotForCreation(protoKeySerialization.typeUrl, protoKeySerialization.outputPrefixType);
    }
}

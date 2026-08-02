package com.google.crypto.tink.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.util.Bytes;

/* loaded from: classes.dex */
public final class ProtoKeySerialization implements Serialization {
    public final Integer idRequirement;
    public final KeyData.KeyMaterialType keyMaterialType;
    public final Bytes objectIdentifier;
    public final OutputPrefixType outputPrefixType;
    public final String typeUrl;
    public final ByteString value;

    public ProtoKeySerialization(String str, Bytes bytes, ByteString byteString, KeyData.KeyMaterialType keyMaterialType, OutputPrefixType outputPrefixType, Integer num) {
        this.typeUrl = str;
        this.objectIdentifier = bytes;
        this.value = byteString;
        this.keyMaterialType = keyMaterialType;
        this.outputPrefixType = outputPrefixType;
        this.idRequirement = num;
    }

    public static ProtoKeySerialization create(String str, ByteString byteString, KeyData.KeyMaterialType keyMaterialType, OutputPrefixType outputPrefixType, Integer num) {
        if (outputPrefixType == OutputPrefixType.RAW) {
            if (num != null) {
                a$$ExternalSyntheticBUOutline0.m$6("Keys with output prefix type raw should not have an id requirement.");
                return null;
            }
        } else if (num == null) {
            a$$ExternalSyntheticBUOutline0.m$6("Keys with output prefix type different from raw should have an id requirement.");
            return null;
        }
        return new ProtoKeySerialization(str, Util.checkedToBytesFromPrintableAscii(str), byteString, keyMaterialType, outputPrefixType, num);
    }
}

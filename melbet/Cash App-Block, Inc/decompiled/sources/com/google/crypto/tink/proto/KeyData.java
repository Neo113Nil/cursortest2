package com.google.crypto.tink.proto;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.Internal;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
import com.google.crypto.tink.shaded.protobuf.Parser;
import com.google.crypto.tink.shaded.protobuf.RawMessageInfo;

/* loaded from: classes.dex */
public final class KeyData extends GeneratedMessageLite {
    private static final KeyData DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile Parser PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private ByteString value_ = ByteString.EMPTY;

    public final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        public final /* bridge */ /* synthetic */ Object clone() {
            return clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public final GeneratedMessageLite getDefaultInstanceForType() {
            return this.defaultInstance;
        }
    }

    public enum KeyMaterialType implements Internal.EnumLite {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);

        public final int value;

        KeyMaterialType(int i) {
            this.value = i;
        }
    }

    static {
        KeyData keyData = new KeyData();
        DEFAULT_INSTANCE = keyData;
        GeneratedMessageLite.registerDefaultInstance(KeyData.class, keyData);
    }

    public static void access$100(KeyData keyData, String str) {
        keyData.getClass();
        str.getClass();
        keyData.typeUrl_ = str;
    }

    public static void access$400(KeyData keyData, ByteString byteString) {
        keyData.getClass();
        byteString.getClass();
        keyData.value_ = byteString;
    }

    public static void access$700(KeyData keyData, KeyMaterialType keyMaterialType) {
        keyData.getClass();
        if (keyMaterialType != KeyMaterialType.UNRECOGNIZED) {
            keyData.keyMaterialType_ = keyMaterialType.value;
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
        }
    }

    public static KeyData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(int i) {
        Parser parser;
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i);
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
        }
        if (ordinal == 3) {
            return new KeyData();
        }
        if (ordinal == 4) {
            return new Builder(DEFAULT_INSTANCE);
        }
        if (ordinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (ordinal != 6) {
            throw null;
        }
        Parser parser2 = PARSER;
        if (parser2 != null) {
            return parser2;
        }
        synchronized (KeyData.class) {
            try {
                parser = PARSER;
                if (parser == null) {
                    parser = new GeneratedMessageLite.DefaultInstanceBasedParser();
                    PARSER = parser;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return parser;
    }

    public final KeyMaterialType getKeyMaterialType() {
        int i = this.keyMaterialType_;
        KeyMaterialType keyMaterialType = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : KeyMaterialType.REMOTE : KeyMaterialType.ASYMMETRIC_PUBLIC : KeyMaterialType.ASYMMETRIC_PRIVATE : KeyMaterialType.SYMMETRIC : KeyMaterialType.UNKNOWN_KEYMATERIAL;
        return keyMaterialType == null ? KeyMaterialType.UNRECOGNIZED : keyMaterialType;
    }

    public final String getTypeUrl() {
        return this.typeUrl_;
    }

    public final ByteString getValue() {
        return this.value_;
    }
}

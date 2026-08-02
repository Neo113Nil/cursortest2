package com.google.crypto.tink.proto;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
import com.google.crypto.tink.shaded.protobuf.Parser;
import com.google.crypto.tink.shaded.protobuf.RawMessageInfo;

/* loaded from: classes.dex */
public final class XChaCha20Poly1305Key extends GeneratedMessageLite {
    private static final XChaCha20Poly1305Key DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile Parser PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.EMPTY;
    private int version_;

    /* loaded from: classes4.dex */
    public final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        public Builder() {
            super(XChaCha20Poly1305Key.DEFAULT_INSTANCE);
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            return clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public final GeneratedMessageLite getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        public final void setKeyValue$10(ByteString.LiteralByteString literalByteString) {
            copyOnWrite();
            XChaCha20Poly1305Key.access$300((XChaCha20Poly1305Key) this.instance, literalByteString);
        }
    }

    static {
        XChaCha20Poly1305Key xChaCha20Poly1305Key = new XChaCha20Poly1305Key();
        DEFAULT_INSTANCE = xChaCha20Poly1305Key;
        GeneratedMessageLite.registerDefaultInstance(XChaCha20Poly1305Key.class, xChaCha20Poly1305Key);
    }

    public static void access$300(XChaCha20Poly1305Key xChaCha20Poly1305Key, ByteString.LiteralByteString literalByteString) {
        xChaCha20Poly1305Key.getClass();
        xChaCha20Poly1305Key.keyValue_ = literalByteString;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static XChaCha20Poly1305Key parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (XChaCha20Poly1305Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(int i) {
        Parser parser;
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i);
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
        }
        if (ordinal == 3) {
            return new XChaCha20Poly1305Key();
        }
        if (ordinal == 4) {
            return new Builder();
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
        synchronized (XChaCha20Poly1305Key.class) {
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

    public final ByteString getKeyValue() {
        return this.keyValue_;
    }

    public final int getVersion() {
        return this.version_;
    }
}

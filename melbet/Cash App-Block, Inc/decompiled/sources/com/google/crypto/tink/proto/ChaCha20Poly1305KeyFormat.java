package com.google.crypto.tink.proto;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.google.crypto.tink.proto.KeyTypeEntry;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.Parser;
import com.google.crypto.tink.shaded.protobuf.RawMessageInfo;

/* loaded from: classes4.dex */
public final class ChaCha20Poly1305KeyFormat extends GeneratedMessageLite {
    private static final ChaCha20Poly1305KeyFormat DEFAULT_INSTANCE;
    private static volatile Parser PARSER;

    static {
        ChaCha20Poly1305KeyFormat chaCha20Poly1305KeyFormat = new ChaCha20Poly1305KeyFormat();
        DEFAULT_INSTANCE = chaCha20Poly1305KeyFormat;
        GeneratedMessageLite.registerDefaultInstance(ChaCha20Poly1305KeyFormat.class, chaCha20Poly1305KeyFormat);
    }

    public static ChaCha20Poly1305KeyFormat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static void parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(int i) {
        Parser parser;
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i);
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
        }
        if (ordinal == 3) {
            return new ChaCha20Poly1305KeyFormat();
        }
        if (ordinal == 4) {
            return new KeyTypeEntry.Builder(DEFAULT_INSTANCE, 1);
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
        synchronized (ChaCha20Poly1305KeyFormat.class) {
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
}

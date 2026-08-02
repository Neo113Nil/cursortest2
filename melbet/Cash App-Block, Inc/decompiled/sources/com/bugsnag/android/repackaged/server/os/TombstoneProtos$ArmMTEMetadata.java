package com.bugsnag.android.repackaged.server.os;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class TombstoneProtos$ArmMTEMetadata extends GeneratedMessageLite<TombstoneProtos$ArmMTEMetadata, Builder> implements MessageLiteOrBuilder {
    private static final TombstoneProtos$ArmMTEMetadata DEFAULT_INSTANCE;
    public static final int MEMORY_TAGS_FIELD_NUMBER = 1;
    private static volatile Parser<TombstoneProtos$ArmMTEMetadata> PARSER;
    private ByteString memoryTags_ = ByteString.EMPTY;

    public final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    }

    static {
        TombstoneProtos$ArmMTEMetadata tombstoneProtos$ArmMTEMetadata = new TombstoneProtos$ArmMTEMetadata();
        DEFAULT_INSTANCE = tombstoneProtos$ArmMTEMetadata;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$ArmMTEMetadata.class, tombstoneProtos$ArmMTEMetadata);
    }

    private TombstoneProtos$ArmMTEMetadata() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMemoryTags() {
        this.memoryTags_ = getDefaultInstance().getMemoryTags();
    }

    public static TombstoneProtos$ArmMTEMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$ArmMTEMetadata parseDelimitedFrom(InputStream inputStream) {
        return (TombstoneProtos$ArmMTEMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$ArmMTEMetadata parseFrom(ByteBuffer byteBuffer) {
        return (TombstoneProtos$ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TombstoneProtos$ArmMTEMetadata> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMemoryTags(ByteString byteString) {
        byteString.getClass();
        this.memoryTags_ = byteString;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (TombstoneProtos$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new TombstoneProtos$ArmMTEMetadata();
            case 2:
                return new Builder(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"memoryTags_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TombstoneProtos$ArmMTEMetadata> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (TombstoneProtos$ArmMTEMetadata.class) {
                    try {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            default:
                OptionalProvider$$ExternalSyntheticLambda0.m();
            case 7:
                return null;
        }
    }

    public ByteString getMemoryTags() {
        return this.memoryTags_;
    }

    public static Builder newBuilder(TombstoneProtos$ArmMTEMetadata tombstoneProtos$ArmMTEMetadata) {
        return DEFAULT_INSTANCE.createBuilder(tombstoneProtos$ArmMTEMetadata);
    }

    public static TombstoneProtos$ArmMTEMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$ArmMTEMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TombstoneProtos$ArmMTEMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TombstoneProtos$ArmMTEMetadata parseFrom(ByteString byteString) {
        return (TombstoneProtos$ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TombstoneProtos$ArmMTEMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TombstoneProtos$ArmMTEMetadata parseFrom(byte[] bArr) {
        return (TombstoneProtos$ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$ArmMTEMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TombstoneProtos$ArmMTEMetadata parseFrom(InputStream inputStream) {
        return (TombstoneProtos$ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$ArmMTEMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TombstoneProtos$ArmMTEMetadata parseFrom(CodedInputStream codedInputStream) {
        return (TombstoneProtos$ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$ArmMTEMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

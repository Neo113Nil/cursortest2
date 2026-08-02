package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class Common$AutoLoginOpenOptions extends GeneratedMessageLite<Common$AutoLoginOpenOptions, a> implements MessageLiteOrBuilder {
    private static final Common$AutoLoginOpenOptions DEFAULT_INSTANCE;
    public static final int DELAY_MS_FIELD_NUMBER = 1;
    private static volatile Parser<Common$AutoLoginOpenOptions> PARSER;
    private int delayMs_;

    public static final class a extends GeneratedMessageLite.Builder<Common$AutoLoginOpenOptions, a> implements MessageLiteOrBuilder {
        public a() {
            super(Common$AutoLoginOpenOptions.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$AutoLoginOpenOptions common$AutoLoginOpenOptions = new Common$AutoLoginOpenOptions();
        DEFAULT_INSTANCE = common$AutoLoginOpenOptions;
        GeneratedMessageLite.registerDefaultInstance(Common$AutoLoginOpenOptions.class, common$AutoLoginOpenOptions);
    }

    private Common$AutoLoginOpenOptions() {
    }

    private void clearDelayMs() {
        this.delayMs_ = 0;
    }

    public static Common$AutoLoginOpenOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$AutoLoginOpenOptions parseDelimitedFrom(InputStream inputStream) {
        return (Common$AutoLoginOpenOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$AutoLoginOpenOptions parseFrom(ByteString byteString) {
        return (Common$AutoLoginOpenOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$AutoLoginOpenOptions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDelayMs(int i) {
        this.delayMs_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (C0127j.a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$AutoLoginOpenOptions();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"delayMs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$AutoLoginOpenOptions> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (Common$AutoLoginOpenOptions.class) {
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

    public int getDelayMs() {
        return this.delayMs_;
    }

    public static a newBuilder(Common$AutoLoginOpenOptions common$AutoLoginOpenOptions) {
        return DEFAULT_INSTANCE.createBuilder(common$AutoLoginOpenOptions);
    }

    public static Common$AutoLoginOpenOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AutoLoginOpenOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$AutoLoginOpenOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AutoLoginOpenOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$AutoLoginOpenOptions parseFrom(CodedInputStream codedInputStream) {
        return (Common$AutoLoginOpenOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$AutoLoginOpenOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AutoLoginOpenOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$AutoLoginOpenOptions parseFrom(InputStream inputStream) {
        return (Common$AutoLoginOpenOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$AutoLoginOpenOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AutoLoginOpenOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$AutoLoginOpenOptions parseFrom(ByteBuffer byteBuffer) {
        return (Common$AutoLoginOpenOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$AutoLoginOpenOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AutoLoginOpenOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$AutoLoginOpenOptions parseFrom(byte[] bArr) {
        return (Common$AutoLoginOpenOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$AutoLoginOpenOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AutoLoginOpenOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}

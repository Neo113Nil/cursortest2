package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class Configuration$EmbeddedLinkTokenConfigurationWrapper extends GeneratedMessageLite<Configuration$EmbeddedLinkTokenConfigurationWrapper, a> implements MessageLiteOrBuilder {
    private static final Configuration$EmbeddedLinkTokenConfigurationWrapper DEFAULT_INSTANCE;
    public static final int EMBEDDED_LINK_TOKEN_CONFIGURATION_FIELD_NUMBER = 1;
    private static volatile Parser<Configuration$EmbeddedLinkTokenConfigurationWrapper> PARSER;
    private int bitField0_;
    private Configuration$EmbeddedLinkTokenConfiguration embeddedLinkTokenConfiguration_;

    public static final class a extends GeneratedMessageLite.Builder<Configuration$EmbeddedLinkTokenConfigurationWrapper, a> implements MessageLiteOrBuilder {
        public a() {
            super(Configuration$EmbeddedLinkTokenConfigurationWrapper.DEFAULT_INSTANCE);
        }
    }

    static {
        Configuration$EmbeddedLinkTokenConfigurationWrapper configuration$EmbeddedLinkTokenConfigurationWrapper = new Configuration$EmbeddedLinkTokenConfigurationWrapper();
        DEFAULT_INSTANCE = configuration$EmbeddedLinkTokenConfigurationWrapper;
        GeneratedMessageLite.registerDefaultInstance(Configuration$EmbeddedLinkTokenConfigurationWrapper.class, configuration$EmbeddedLinkTokenConfigurationWrapper);
    }

    private Configuration$EmbeddedLinkTokenConfigurationWrapper() {
    }

    private void clearEmbeddedLinkTokenConfiguration() {
        this.embeddedLinkTokenConfiguration_ = null;
        this.bitField0_ &= -2;
    }

    public static Configuration$EmbeddedLinkTokenConfigurationWrapper getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeEmbeddedLinkTokenConfiguration(Configuration$EmbeddedLinkTokenConfiguration configuration$EmbeddedLinkTokenConfiguration) {
        configuration$EmbeddedLinkTokenConfiguration.getClass();
        Configuration$EmbeddedLinkTokenConfiguration configuration$EmbeddedLinkTokenConfiguration2 = this.embeddedLinkTokenConfiguration_;
        if (configuration$EmbeddedLinkTokenConfiguration2 == null || configuration$EmbeddedLinkTokenConfiguration2 == Configuration$EmbeddedLinkTokenConfiguration.getDefaultInstance()) {
            this.embeddedLinkTokenConfiguration_ = configuration$EmbeddedLinkTokenConfiguration;
        } else {
            this.embeddedLinkTokenConfiguration_ = Configuration$EmbeddedLinkTokenConfiguration.newBuilder(this.embeddedLinkTokenConfiguration_).mergeFrom((Configuration$EmbeddedLinkTokenConfiguration.a) configuration$EmbeddedLinkTokenConfiguration).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Configuration$EmbeddedLinkTokenConfigurationWrapper parseDelimitedFrom(InputStream inputStream) {
        return (Configuration$EmbeddedLinkTokenConfigurationWrapper) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$EmbeddedLinkTokenConfigurationWrapper parseFrom(ByteBuffer byteBuffer) {
        return (Configuration$EmbeddedLinkTokenConfigurationWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Configuration$EmbeddedLinkTokenConfigurationWrapper> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setEmbeddedLinkTokenConfiguration(Configuration$EmbeddedLinkTokenConfiguration configuration$EmbeddedLinkTokenConfiguration) {
        configuration$EmbeddedLinkTokenConfiguration.getClass();
        this.embeddedLinkTokenConfiguration_ = configuration$EmbeddedLinkTokenConfiguration;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (e.a[methodToInvoke.ordinal()]) {
            case 1:
                return new Configuration$EmbeddedLinkTokenConfigurationWrapper();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "embeddedLinkTokenConfiguration_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Configuration$EmbeddedLinkTokenConfigurationWrapper> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (Configuration$EmbeddedLinkTokenConfigurationWrapper.class) {
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

    public Configuration$EmbeddedLinkTokenConfiguration getEmbeddedLinkTokenConfiguration() {
        Configuration$EmbeddedLinkTokenConfiguration configuration$EmbeddedLinkTokenConfiguration = this.embeddedLinkTokenConfiguration_;
        return configuration$EmbeddedLinkTokenConfiguration == null ? Configuration$EmbeddedLinkTokenConfiguration.getDefaultInstance() : configuration$EmbeddedLinkTokenConfiguration;
    }

    public boolean hasEmbeddedLinkTokenConfiguration() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(Configuration$EmbeddedLinkTokenConfigurationWrapper configuration$EmbeddedLinkTokenConfigurationWrapper) {
        return DEFAULT_INSTANCE.createBuilder(configuration$EmbeddedLinkTokenConfigurationWrapper);
    }

    public static Configuration$EmbeddedLinkTokenConfigurationWrapper parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$EmbeddedLinkTokenConfigurationWrapper) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$EmbeddedLinkTokenConfigurationWrapper parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$EmbeddedLinkTokenConfigurationWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Configuration$EmbeddedLinkTokenConfigurationWrapper parseFrom(ByteString byteString) {
        return (Configuration$EmbeddedLinkTokenConfigurationWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Configuration$EmbeddedLinkTokenConfigurationWrapper parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$EmbeddedLinkTokenConfigurationWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Configuration$EmbeddedLinkTokenConfigurationWrapper parseFrom(byte[] bArr) {
        return (Configuration$EmbeddedLinkTokenConfigurationWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Configuration$EmbeddedLinkTokenConfigurationWrapper parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$EmbeddedLinkTokenConfigurationWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Configuration$EmbeddedLinkTokenConfigurationWrapper parseFrom(InputStream inputStream) {
        return (Configuration$EmbeddedLinkTokenConfigurationWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$EmbeddedLinkTokenConfigurationWrapper parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$EmbeddedLinkTokenConfigurationWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$EmbeddedLinkTokenConfigurationWrapper parseFrom(CodedInputStream codedInputStream) {
        return (Configuration$EmbeddedLinkTokenConfigurationWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Configuration$EmbeddedLinkTokenConfigurationWrapper parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$EmbeddedLinkTokenConfigurationWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

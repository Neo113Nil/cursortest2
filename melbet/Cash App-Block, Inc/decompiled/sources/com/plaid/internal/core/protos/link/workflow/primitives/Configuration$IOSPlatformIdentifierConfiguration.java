package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class Configuration$IOSPlatformIdentifierConfiguration extends GeneratedMessageLite<Configuration$IOSPlatformIdentifierConfiguration, a> implements MessageLiteOrBuilder {
    private static final Configuration$IOSPlatformIdentifierConfiguration DEFAULT_INSTANCE;
    public static final int IOS_VENDOR_IDENTIFIER_FIELD_NUMBER = 1;
    private static volatile Parser<Configuration$IOSPlatformIdentifierConfiguration> PARSER;
    private String iosVendorIdentifier_ = "";

    public static final class a extends GeneratedMessageLite.Builder<Configuration$IOSPlatformIdentifierConfiguration, a> implements MessageLiteOrBuilder {
        public a() {
            super(Configuration$IOSPlatformIdentifierConfiguration.DEFAULT_INSTANCE);
        }
    }

    static {
        Configuration$IOSPlatformIdentifierConfiguration configuration$IOSPlatformIdentifierConfiguration = new Configuration$IOSPlatformIdentifierConfiguration();
        DEFAULT_INSTANCE = configuration$IOSPlatformIdentifierConfiguration;
        GeneratedMessageLite.registerDefaultInstance(Configuration$IOSPlatformIdentifierConfiguration.class, configuration$IOSPlatformIdentifierConfiguration);
    }

    private Configuration$IOSPlatformIdentifierConfiguration() {
    }

    private void clearIosVendorIdentifier() {
        this.iosVendorIdentifier_ = getDefaultInstance().getIosVendorIdentifier();
    }

    public static Configuration$IOSPlatformIdentifierConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Configuration$IOSPlatformIdentifierConfiguration parseDelimitedFrom(InputStream inputStream) {
        return (Configuration$IOSPlatformIdentifierConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$IOSPlatformIdentifierConfiguration parseFrom(ByteBuffer byteBuffer) {
        return (Configuration$IOSPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Configuration$IOSPlatformIdentifierConfiguration> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setIosVendorIdentifier(String str) {
        str.getClass();
        this.iosVendorIdentifier_ = str;
    }

    private void setIosVendorIdentifierBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.iosVendorIdentifier_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (e.a[methodToInvoke.ordinal()]) {
            case 1:
                return new Configuration$IOSPlatformIdentifierConfiguration();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"iosVendorIdentifier_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Configuration$IOSPlatformIdentifierConfiguration> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (Configuration$IOSPlatformIdentifierConfiguration.class) {
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

    public String getIosVendorIdentifier() {
        return this.iosVendorIdentifier_;
    }

    public ByteString getIosVendorIdentifierBytes() {
        return ByteString.copyFromUtf8(this.iosVendorIdentifier_);
    }

    public static a newBuilder(Configuration$IOSPlatformIdentifierConfiguration configuration$IOSPlatformIdentifierConfiguration) {
        return DEFAULT_INSTANCE.createBuilder(configuration$IOSPlatformIdentifierConfiguration);
    }

    public static Configuration$IOSPlatformIdentifierConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$IOSPlatformIdentifierConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$IOSPlatformIdentifierConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$IOSPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Configuration$IOSPlatformIdentifierConfiguration parseFrom(ByteString byteString) {
        return (Configuration$IOSPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Configuration$IOSPlatformIdentifierConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$IOSPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Configuration$IOSPlatformIdentifierConfiguration parseFrom(byte[] bArr) {
        return (Configuration$IOSPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Configuration$IOSPlatformIdentifierConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$IOSPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Configuration$IOSPlatformIdentifierConfiguration parseFrom(InputStream inputStream) {
        return (Configuration$IOSPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$IOSPlatformIdentifierConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$IOSPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$IOSPlatformIdentifierConfiguration parseFrom(CodedInputStream codedInputStream) {
        return (Configuration$IOSPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Configuration$IOSPlatformIdentifierConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$IOSPlatformIdentifierConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

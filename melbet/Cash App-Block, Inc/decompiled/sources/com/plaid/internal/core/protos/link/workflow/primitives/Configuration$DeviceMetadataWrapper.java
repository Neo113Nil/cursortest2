package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class Configuration$DeviceMetadataWrapper extends GeneratedMessageLite<Configuration$DeviceMetadataWrapper, a> implements MessageLiteOrBuilder {
    private static final Configuration$DeviceMetadataWrapper DEFAULT_INSTANCE;
    public static final int DEVICE_METADATA_FIELD_NUMBER = 1;
    private static volatile Parser<Configuration$DeviceMetadataWrapper> PARSER;
    private int bitField0_;
    private Configuration$DeviceMetadata deviceMetadata_;

    public static final class a extends GeneratedMessageLite.Builder<Configuration$DeviceMetadataWrapper, a> implements MessageLiteOrBuilder {
        public a() {
            super(Configuration$DeviceMetadataWrapper.DEFAULT_INSTANCE);
        }
    }

    static {
        Configuration$DeviceMetadataWrapper configuration$DeviceMetadataWrapper = new Configuration$DeviceMetadataWrapper();
        DEFAULT_INSTANCE = configuration$DeviceMetadataWrapper;
        GeneratedMessageLite.registerDefaultInstance(Configuration$DeviceMetadataWrapper.class, configuration$DeviceMetadataWrapper);
    }

    private Configuration$DeviceMetadataWrapper() {
    }

    private void clearDeviceMetadata() {
        this.deviceMetadata_ = null;
        this.bitField0_ &= -2;
    }

    public static Configuration$DeviceMetadataWrapper getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeDeviceMetadata(Configuration$DeviceMetadata configuration$DeviceMetadata) {
        configuration$DeviceMetadata.getClass();
        Configuration$DeviceMetadata configuration$DeviceMetadata2 = this.deviceMetadata_;
        if (configuration$DeviceMetadata2 == null || configuration$DeviceMetadata2 == Configuration$DeviceMetadata.getDefaultInstance()) {
            this.deviceMetadata_ = configuration$DeviceMetadata;
        } else {
            this.deviceMetadata_ = Configuration$DeviceMetadata.newBuilder(this.deviceMetadata_).mergeFrom((Configuration$DeviceMetadata.a) configuration$DeviceMetadata).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Configuration$DeviceMetadataWrapper parseDelimitedFrom(InputStream inputStream) {
        return (Configuration$DeviceMetadataWrapper) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$DeviceMetadataWrapper parseFrom(ByteBuffer byteBuffer) {
        return (Configuration$DeviceMetadataWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Configuration$DeviceMetadataWrapper> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDeviceMetadata(Configuration$DeviceMetadata configuration$DeviceMetadata) {
        configuration$DeviceMetadata.getClass();
        this.deviceMetadata_ = configuration$DeviceMetadata;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (e.a[methodToInvoke.ordinal()]) {
            case 1:
                return new Configuration$DeviceMetadataWrapper();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "deviceMetadata_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Configuration$DeviceMetadataWrapper> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (Configuration$DeviceMetadataWrapper.class) {
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

    public Configuration$DeviceMetadata getDeviceMetadata() {
        Configuration$DeviceMetadata configuration$DeviceMetadata = this.deviceMetadata_;
        return configuration$DeviceMetadata == null ? Configuration$DeviceMetadata.getDefaultInstance() : configuration$DeviceMetadata;
    }

    public boolean hasDeviceMetadata() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(Configuration$DeviceMetadataWrapper configuration$DeviceMetadataWrapper) {
        return DEFAULT_INSTANCE.createBuilder(configuration$DeviceMetadataWrapper);
    }

    public static Configuration$DeviceMetadataWrapper parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$DeviceMetadataWrapper) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$DeviceMetadataWrapper parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$DeviceMetadataWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Configuration$DeviceMetadataWrapper parseFrom(ByteString byteString) {
        return (Configuration$DeviceMetadataWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Configuration$DeviceMetadataWrapper parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$DeviceMetadataWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Configuration$DeviceMetadataWrapper parseFrom(byte[] bArr) {
        return (Configuration$DeviceMetadataWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Configuration$DeviceMetadataWrapper parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$DeviceMetadataWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Configuration$DeviceMetadataWrapper parseFrom(InputStream inputStream) {
        return (Configuration$DeviceMetadataWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$DeviceMetadataWrapper parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$DeviceMetadataWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$DeviceMetadataWrapper parseFrom(CodedInputStream codedInputStream) {
        return (Configuration$DeviceMetadataWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Configuration$DeviceMetadataWrapper parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$DeviceMetadataWrapper) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

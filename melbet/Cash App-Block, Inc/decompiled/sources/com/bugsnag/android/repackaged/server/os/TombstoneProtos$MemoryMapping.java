package com.bugsnag.android.repackaged.server.os;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class TombstoneProtos$MemoryMapping extends GeneratedMessageLite<TombstoneProtos$MemoryMapping, Builder> implements TombstoneProtos$MemoryMappingOrBuilder {
    public static final int BEGIN_ADDRESS_FIELD_NUMBER = 1;
    public static final int BUILD_ID_FIELD_NUMBER = 8;
    private static final TombstoneProtos$MemoryMapping DEFAULT_INSTANCE;
    public static final int END_ADDRESS_FIELD_NUMBER = 2;
    public static final int EXECUTE_FIELD_NUMBER = 6;
    public static final int LOAD_BIAS_FIELD_NUMBER = 9;
    public static final int MAPPING_NAME_FIELD_NUMBER = 7;
    public static final int OFFSET_FIELD_NUMBER = 3;
    private static volatile Parser<TombstoneProtos$MemoryMapping> PARSER = null;
    public static final int READ_FIELD_NUMBER = 4;
    public static final int WRITE_FIELD_NUMBER = 5;
    private long beginAddress_;
    private long endAddress_;
    private boolean execute_;
    private long loadBias_;
    private long offset_;
    private boolean read_;
    private boolean write_;
    private String mappingName_ = "";
    private String buildId_ = "";

    public final class Builder extends GeneratedMessageLite.Builder implements TombstoneProtos$MemoryMappingOrBuilder {
    }

    static {
        TombstoneProtos$MemoryMapping tombstoneProtos$MemoryMapping = new TombstoneProtos$MemoryMapping();
        DEFAULT_INSTANCE = tombstoneProtos$MemoryMapping;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$MemoryMapping.class, tombstoneProtos$MemoryMapping);
    }

    private TombstoneProtos$MemoryMapping() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBeginAddress() {
        this.beginAddress_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBuildId() {
        this.buildId_ = getDefaultInstance().getBuildId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndAddress() {
        this.endAddress_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExecute() {
        this.execute_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLoadBias() {
        this.loadBias_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMappingName() {
        this.mappingName_ = getDefaultInstance().getMappingName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOffset() {
        this.offset_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRead() {
        this.read_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWrite() {
        this.write_ = false;
    }

    public static TombstoneProtos$MemoryMapping getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$MemoryMapping parseDelimitedFrom(InputStream inputStream) {
        return (TombstoneProtos$MemoryMapping) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$MemoryMapping parseFrom(ByteBuffer byteBuffer) {
        return (TombstoneProtos$MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TombstoneProtos$MemoryMapping> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBeginAddress(long j) {
        this.beginAddress_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildId(String str) {
        str.getClass();
        this.buildId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.buildId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndAddress(long j) {
        this.endAddress_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExecute(boolean z) {
        this.execute_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoadBias(long j) {
        this.loadBias_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMappingName(String str) {
        str.getClass();
        this.mappingName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMappingNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.mappingName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOffset(long j) {
        this.offset_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRead(boolean z) {
        this.read_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWrite(boolean z) {
        this.write_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (TombstoneProtos$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new TombstoneProtos$MemoryMapping();
            case 2:
                return new Builder(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0003\u0002\u0003\u0003\u0003\u0004\u0007\u0005\u0007\u0006\u0007\u0007Ȉ\bȈ\t\u0003", new Object[]{"beginAddress_", "endAddress_", "offset_", "read_", "write_", "execute_", "mappingName_", "buildId_", "loadBias_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TombstoneProtos$MemoryMapping> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (TombstoneProtos$MemoryMapping.class) {
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

    public long getBeginAddress() {
        return this.beginAddress_;
    }

    public String getBuildId() {
        return this.buildId_;
    }

    public ByteString getBuildIdBytes() {
        return ByteString.copyFromUtf8(this.buildId_);
    }

    public long getEndAddress() {
        return this.endAddress_;
    }

    public boolean getExecute() {
        return this.execute_;
    }

    public long getLoadBias() {
        return this.loadBias_;
    }

    public String getMappingName() {
        return this.mappingName_;
    }

    public ByteString getMappingNameBytes() {
        return ByteString.copyFromUtf8(this.mappingName_);
    }

    public long getOffset() {
        return this.offset_;
    }

    public boolean getRead() {
        return this.read_;
    }

    public boolean getWrite() {
        return this.write_;
    }

    public static Builder newBuilder(TombstoneProtos$MemoryMapping tombstoneProtos$MemoryMapping) {
        return DEFAULT_INSTANCE.createBuilder(tombstoneProtos$MemoryMapping);
    }

    public static TombstoneProtos$MemoryMapping parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$MemoryMapping) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TombstoneProtos$MemoryMapping parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TombstoneProtos$MemoryMapping parseFrom(ByteString byteString) {
        return (TombstoneProtos$MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TombstoneProtos$MemoryMapping parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TombstoneProtos$MemoryMapping parseFrom(byte[] bArr) {
        return (TombstoneProtos$MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$MemoryMapping parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TombstoneProtos$MemoryMapping parseFrom(InputStream inputStream) {
        return (TombstoneProtos$MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$MemoryMapping parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TombstoneProtos$MemoryMapping parseFrom(CodedInputStream codedInputStream) {
        return (TombstoneProtos$MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$MemoryMapping parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

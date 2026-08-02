package com.bugsnag.android.repackaged.server.os;

import com.bugsnag.android.repackaged.server.os.TombstoneProtos$ArmMTEMetadata;
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
public final class TombstoneProtos$MemoryDump extends GeneratedMessageLite<TombstoneProtos$MemoryDump, Builder> implements TombstoneProtos$MemoryDumpOrBuilder {
    public static final int ARM_MTE_METADATA_FIELD_NUMBER = 6;
    public static final int BEGIN_ADDRESS_FIELD_NUMBER = 3;
    private static final TombstoneProtos$MemoryDump DEFAULT_INSTANCE;
    public static final int MAPPING_NAME_FIELD_NUMBER = 2;
    public static final int MEMORY_FIELD_NUMBER = 4;
    private static volatile Parser<TombstoneProtos$MemoryDump> PARSER = null;
    public static final int REGISTER_NAME_FIELD_NUMBER = 1;
    private long beginAddress_;
    private Object metadata_;
    private int metadataCase_ = 0;
    private String registerName_ = "";
    private String mappingName_ = "";
    private ByteString memory_ = ByteString.EMPTY;

    public final class Builder extends GeneratedMessageLite.Builder implements TombstoneProtos$MemoryDumpOrBuilder {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class MetadataCase {
        public static final /* synthetic */ MetadataCase[] $VALUES;
        public static final MetadataCase ARM_MTE_METADATA;
        public static final MetadataCase METADATA_NOT_SET;

        static {
            MetadataCase metadataCase = new MetadataCase("ARM_MTE_METADATA", 0);
            ARM_MTE_METADATA = metadataCase;
            MetadataCase metadataCase2 = new MetadataCase("METADATA_NOT_SET", 1);
            METADATA_NOT_SET = metadataCase2;
            $VALUES = new MetadataCase[]{metadataCase, metadataCase2};
        }

        public static MetadataCase valueOf(String str) {
            return (MetadataCase) Enum.valueOf(MetadataCase.class, str);
        }

        public static MetadataCase[] values() {
            return (MetadataCase[]) $VALUES.clone();
        }
    }

    static {
        TombstoneProtos$MemoryDump tombstoneProtos$MemoryDump = new TombstoneProtos$MemoryDump();
        DEFAULT_INSTANCE = tombstoneProtos$MemoryDump;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$MemoryDump.class, tombstoneProtos$MemoryDump);
    }

    private TombstoneProtos$MemoryDump() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArmMteMetadata() {
        if (this.metadataCase_ == 6) {
            this.metadataCase_ = 0;
            this.metadata_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBeginAddress() {
        this.beginAddress_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMappingName() {
        this.mappingName_ = getDefaultInstance().getMappingName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMemory() {
        this.memory_ = getDefaultInstance().getMemory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadataCase_ = 0;
        this.metadata_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegisterName() {
        this.registerName_ = getDefaultInstance().getRegisterName();
    }

    public static TombstoneProtos$MemoryDump getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeArmMteMetadata(TombstoneProtos$ArmMTEMetadata tombstoneProtos$ArmMTEMetadata) {
        tombstoneProtos$ArmMTEMetadata.getClass();
        if (this.metadataCase_ != 6 || this.metadata_ == TombstoneProtos$ArmMTEMetadata.getDefaultInstance()) {
            this.metadata_ = tombstoneProtos$ArmMTEMetadata;
        } else {
            this.metadata_ = ((TombstoneProtos$ArmMTEMetadata.Builder) TombstoneProtos$ArmMTEMetadata.newBuilder((TombstoneProtos$ArmMTEMetadata) this.metadata_).mergeFrom((TombstoneProtos$ArmMTEMetadata.Builder) tombstoneProtos$ArmMTEMetadata)).buildPartial();
        }
        this.metadataCase_ = 6;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$MemoryDump parseDelimitedFrom(InputStream inputStream) {
        return (TombstoneProtos$MemoryDump) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$MemoryDump parseFrom(ByteBuffer byteBuffer) {
        return (TombstoneProtos$MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TombstoneProtos$MemoryDump> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArmMteMetadata(TombstoneProtos$ArmMTEMetadata tombstoneProtos$ArmMTEMetadata) {
        tombstoneProtos$ArmMTEMetadata.getClass();
        this.metadata_ = tombstoneProtos$ArmMTEMetadata;
        this.metadataCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBeginAddress(long j) {
        this.beginAddress_ = j;
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
    public void setMemory(ByteString byteString) {
        byteString.getClass();
        this.memory_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegisterName(String str) {
        str.getClass();
        this.registerName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegisterNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.registerName_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (TombstoneProtos$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new TombstoneProtos$MemoryDump();
            case 2:
                return new Builder(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0003\u0004\n\u0006<\u0000", new Object[]{"metadata_", "metadataCase_", "registerName_", "mappingName_", "beginAddress_", "memory_", TombstoneProtos$ArmMTEMetadata.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TombstoneProtos$MemoryDump> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (TombstoneProtos$MemoryDump.class) {
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

    public TombstoneProtos$ArmMTEMetadata getArmMteMetadata() {
        return this.metadataCase_ == 6 ? (TombstoneProtos$ArmMTEMetadata) this.metadata_ : TombstoneProtos$ArmMTEMetadata.getDefaultInstance();
    }

    public long getBeginAddress() {
        return this.beginAddress_;
    }

    public String getMappingName() {
        return this.mappingName_;
    }

    public ByteString getMappingNameBytes() {
        return ByteString.copyFromUtf8(this.mappingName_);
    }

    public ByteString getMemory() {
        return this.memory_;
    }

    public MetadataCase getMetadataCase() {
        int i = this.metadataCase_;
        if (i == 0) {
            return MetadataCase.METADATA_NOT_SET;
        }
        if (i != 6) {
            return null;
        }
        return MetadataCase.ARM_MTE_METADATA;
    }

    public String getRegisterName() {
        return this.registerName_;
    }

    public ByteString getRegisterNameBytes() {
        return ByteString.copyFromUtf8(this.registerName_);
    }

    public boolean hasArmMteMetadata() {
        return this.metadataCase_ == 6;
    }

    public static Builder newBuilder(TombstoneProtos$MemoryDump tombstoneProtos$MemoryDump) {
        return DEFAULT_INSTANCE.createBuilder(tombstoneProtos$MemoryDump);
    }

    public static TombstoneProtos$MemoryDump parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$MemoryDump) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TombstoneProtos$MemoryDump parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TombstoneProtos$MemoryDump parseFrom(ByteString byteString) {
        return (TombstoneProtos$MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TombstoneProtos$MemoryDump parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TombstoneProtos$MemoryDump parseFrom(byte[] bArr) {
        return (TombstoneProtos$MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$MemoryDump parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TombstoneProtos$MemoryDump parseFrom(InputStream inputStream) {
        return (TombstoneProtos$MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$MemoryDump parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TombstoneProtos$MemoryDump parseFrom(CodedInputStream codedInputStream) {
        return (TombstoneProtos$MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$MemoryDump parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

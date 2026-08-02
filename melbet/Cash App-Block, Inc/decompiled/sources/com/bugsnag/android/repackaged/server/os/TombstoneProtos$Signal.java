package com.bugsnag.android.repackaged.server.os;

import com.bugsnag.android.repackaged.server.os.TombstoneProtos$MemoryDump;
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

/* loaded from: classes4.dex */
public final class TombstoneProtos$Signal extends GeneratedMessageLite<TombstoneProtos$Signal, Builder> implements MessageLiteOrBuilder {
    public static final int CODE_FIELD_NUMBER = 3;
    public static final int CODE_NAME_FIELD_NUMBER = 4;
    private static final TombstoneProtos$Signal DEFAULT_INSTANCE;
    public static final int FAULT_ADDRESS_FIELD_NUMBER = 9;
    public static final int FAULT_ADJACENT_METADATA_FIELD_NUMBER = 10;
    public static final int HAS_FAULT_ADDRESS_FIELD_NUMBER = 8;
    public static final int HAS_SENDER_FIELD_NUMBER = 5;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int NUMBER_FIELD_NUMBER = 1;
    private static volatile Parser<TombstoneProtos$Signal> PARSER = null;
    public static final int SENDER_PID_FIELD_NUMBER = 7;
    public static final int SENDER_UID_FIELD_NUMBER = 6;
    private int bitField0_;
    private int code_;
    private long faultAddress_;
    private TombstoneProtos$MemoryDump faultAdjacentMetadata_;
    private boolean hasFaultAddress_;
    private boolean hasSender_;
    private int number_;
    private int senderPid_;
    private int senderUid_;
    private String name_ = "";
    private String codeName_ = "";

    public final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    }

    static {
        TombstoneProtos$Signal tombstoneProtos$Signal = new TombstoneProtos$Signal();
        DEFAULT_INSTANCE = tombstoneProtos$Signal;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$Signal.class, tombstoneProtos$Signal);
    }

    private TombstoneProtos$Signal() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.code_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCodeName() {
        this.codeName_ = getDefaultInstance().getCodeName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFaultAddress() {
        this.faultAddress_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFaultAdjacentMetadata() {
        this.faultAdjacentMetadata_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasFaultAddress() {
        this.hasFaultAddress_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasSender() {
        this.hasSender_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumber() {
        this.number_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSenderPid() {
        this.senderPid_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSenderUid() {
        this.senderUid_ = 0;
    }

    public static TombstoneProtos$Signal getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFaultAdjacentMetadata(TombstoneProtos$MemoryDump tombstoneProtos$MemoryDump) {
        tombstoneProtos$MemoryDump.getClass();
        TombstoneProtos$MemoryDump tombstoneProtos$MemoryDump2 = this.faultAdjacentMetadata_;
        if (tombstoneProtos$MemoryDump2 == null || tombstoneProtos$MemoryDump2 == TombstoneProtos$MemoryDump.getDefaultInstance()) {
            this.faultAdjacentMetadata_ = tombstoneProtos$MemoryDump;
        } else {
            this.faultAdjacentMetadata_ = (TombstoneProtos$MemoryDump) ((TombstoneProtos$MemoryDump.Builder) TombstoneProtos$MemoryDump.newBuilder(this.faultAdjacentMetadata_).mergeFrom((TombstoneProtos$MemoryDump.Builder) tombstoneProtos$MemoryDump)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$Signal parseDelimitedFrom(InputStream inputStream) {
        return (TombstoneProtos$Signal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$Signal parseFrom(ByteBuffer byteBuffer) {
        return (TombstoneProtos$Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TombstoneProtos$Signal> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(int i) {
        this.code_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCodeName(String str) {
        str.getClass();
        this.codeName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCodeNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.codeName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFaultAddress(long j) {
        this.faultAddress_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFaultAdjacentMetadata(TombstoneProtos$MemoryDump tombstoneProtos$MemoryDump) {
        tombstoneProtos$MemoryDump.getClass();
        this.faultAdjacentMetadata_ = tombstoneProtos$MemoryDump;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasFaultAddress(boolean z) {
        this.hasFaultAddress_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasSender(boolean z) {
        this.hasSender_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumber(int i) {
        this.number_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSenderPid(int i) {
        this.senderPid_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSenderUid(int i) {
        this.senderUid_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (TombstoneProtos$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new TombstoneProtos$Signal();
            case 2:
                return new Builder(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003\u0004\u0004Ȉ\u0005\u0007\u0006\u0004\u0007\u0004\b\u0007\t\u0003\nဉ\u0000", new Object[]{"bitField0_", "number_", "name_", "code_", "codeName_", "hasSender_", "senderUid_", "senderPid_", "hasFaultAddress_", "faultAddress_", "faultAdjacentMetadata_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TombstoneProtos$Signal> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (TombstoneProtos$Signal.class) {
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

    public int getCode() {
        return this.code_;
    }

    public String getCodeName() {
        return this.codeName_;
    }

    public ByteString getCodeNameBytes() {
        return ByteString.copyFromUtf8(this.codeName_);
    }

    public long getFaultAddress() {
        return this.faultAddress_;
    }

    public TombstoneProtos$MemoryDump getFaultAdjacentMetadata() {
        TombstoneProtos$MemoryDump tombstoneProtos$MemoryDump = this.faultAdjacentMetadata_;
        return tombstoneProtos$MemoryDump == null ? TombstoneProtos$MemoryDump.getDefaultInstance() : tombstoneProtos$MemoryDump;
    }

    public boolean getHasFaultAddress() {
        return this.hasFaultAddress_;
    }

    public boolean getHasSender() {
        return this.hasSender_;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public int getNumber() {
        return this.number_;
    }

    public int getSenderPid() {
        return this.senderPid_;
    }

    public int getSenderUid() {
        return this.senderUid_;
    }

    public boolean hasFaultAdjacentMetadata() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(TombstoneProtos$Signal tombstoneProtos$Signal) {
        return DEFAULT_INSTANCE.createBuilder(tombstoneProtos$Signal);
    }

    public static TombstoneProtos$Signal parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$Signal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TombstoneProtos$Signal parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TombstoneProtos$Signal parseFrom(ByteString byteString) {
        return (TombstoneProtos$Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TombstoneProtos$Signal parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TombstoneProtos$Signal parseFrom(byte[] bArr) {
        return (TombstoneProtos$Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$Signal parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TombstoneProtos$Signal parseFrom(InputStream inputStream) {
        return (TombstoneProtos$Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$Signal parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TombstoneProtos$Signal parseFrom(CodedInputStream codedInputStream) {
        return (TombstoneProtos$Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$Signal parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

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
public final class TombstoneProtos$BacktraceFrame extends GeneratedMessageLite<TombstoneProtos$BacktraceFrame, Builder> implements TombstoneProtos$BacktraceFrameOrBuilder {
    public static final int BUILD_ID_FIELD_NUMBER = 8;
    private static final TombstoneProtos$BacktraceFrame DEFAULT_INSTANCE;
    public static final int FILE_MAP_OFFSET_FIELD_NUMBER = 7;
    public static final int FILE_NAME_FIELD_NUMBER = 6;
    public static final int FUNCTION_NAME_FIELD_NUMBER = 4;
    public static final int FUNCTION_OFFSET_FIELD_NUMBER = 5;
    private static volatile Parser<TombstoneProtos$BacktraceFrame> PARSER = null;
    public static final int PC_FIELD_NUMBER = 2;
    public static final int REL_PC_FIELD_NUMBER = 1;
    public static final int SP_FIELD_NUMBER = 3;
    private long fileMapOffset_;
    private long functionOffset_;
    private long pc_;
    private long relPc_;
    private long sp_;
    private String functionName_ = "";
    private String fileName_ = "";
    private String buildId_ = "";

    public final class Builder extends GeneratedMessageLite.Builder implements TombstoneProtos$BacktraceFrameOrBuilder {
    }

    static {
        TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame = new TombstoneProtos$BacktraceFrame();
        DEFAULT_INSTANCE = tombstoneProtos$BacktraceFrame;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$BacktraceFrame.class, tombstoneProtos$BacktraceFrame);
    }

    private TombstoneProtos$BacktraceFrame() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBuildId() {
        this.buildId_ = getDefaultInstance().getBuildId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileMapOffset() {
        this.fileMapOffset_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileName() {
        this.fileName_ = getDefaultInstance().getFileName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFunctionName() {
        this.functionName_ = getDefaultInstance().getFunctionName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFunctionOffset() {
        this.functionOffset_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPc() {
        this.pc_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRelPc() {
        this.relPc_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSp() {
        this.sp_ = 0L;
    }

    public static TombstoneProtos$BacktraceFrame getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$BacktraceFrame parseDelimitedFrom(InputStream inputStream) {
        return (TombstoneProtos$BacktraceFrame) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$BacktraceFrame parseFrom(ByteBuffer byteBuffer) {
        return (TombstoneProtos$BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TombstoneProtos$BacktraceFrame> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setFileMapOffset(long j) {
        this.fileMapOffset_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileName(String str) {
        str.getClass();
        this.fileName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fileName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFunctionName(String str) {
        str.getClass();
        this.functionName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFunctionNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.functionName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFunctionOffset(long j) {
        this.functionOffset_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPc(long j) {
        this.pc_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRelPc(long j) {
        this.relPc_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSp(long j) {
        this.sp_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (TombstoneProtos$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new TombstoneProtos$BacktraceFrame();
            case 2:
                return new Builder(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0003\u0002\u0003\u0003\u0003\u0004Ȉ\u0005\u0003\u0006Ȉ\u0007\u0003\bȈ", new Object[]{"relPc_", "pc_", "sp_", "functionName_", "functionOffset_", "fileName_", "fileMapOffset_", "buildId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TombstoneProtos$BacktraceFrame> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (TombstoneProtos$BacktraceFrame.class) {
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

    public String getBuildId() {
        return this.buildId_;
    }

    public ByteString getBuildIdBytes() {
        return ByteString.copyFromUtf8(this.buildId_);
    }

    public long getFileMapOffset() {
        return this.fileMapOffset_;
    }

    public String getFileName() {
        return this.fileName_;
    }

    public ByteString getFileNameBytes() {
        return ByteString.copyFromUtf8(this.fileName_);
    }

    public String getFunctionName() {
        return this.functionName_;
    }

    public ByteString getFunctionNameBytes() {
        return ByteString.copyFromUtf8(this.functionName_);
    }

    public long getFunctionOffset() {
        return this.functionOffset_;
    }

    public long getPc() {
        return this.pc_;
    }

    public long getRelPc() {
        return this.relPc_;
    }

    public long getSp() {
        return this.sp_;
    }

    public static Builder newBuilder(TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame) {
        return DEFAULT_INSTANCE.createBuilder(tombstoneProtos$BacktraceFrame);
    }

    public static TombstoneProtos$BacktraceFrame parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$BacktraceFrame) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TombstoneProtos$BacktraceFrame parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TombstoneProtos$BacktraceFrame parseFrom(ByteString byteString) {
        return (TombstoneProtos$BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TombstoneProtos$BacktraceFrame parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TombstoneProtos$BacktraceFrame parseFrom(byte[] bArr) {
        return (TombstoneProtos$BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$BacktraceFrame parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TombstoneProtos$BacktraceFrame parseFrom(InputStream inputStream) {
        return (TombstoneProtos$BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$BacktraceFrame parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TombstoneProtos$BacktraceFrame parseFrom(CodedInputStream codedInputStream) {
        return (TombstoneProtos$BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$BacktraceFrame parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

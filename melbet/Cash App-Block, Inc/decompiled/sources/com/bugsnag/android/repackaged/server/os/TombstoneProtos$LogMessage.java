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
public final class TombstoneProtos$LogMessage extends GeneratedMessageLite<TombstoneProtos$LogMessage, Builder> implements TombstoneProtos$LogMessageOrBuilder {
    private static final TombstoneProtos$LogMessage DEFAULT_INSTANCE;
    public static final int MESSAGE_FIELD_NUMBER = 6;
    private static volatile Parser<TombstoneProtos$LogMessage> PARSER = null;
    public static final int PID_FIELD_NUMBER = 2;
    public static final int PRIORITY_FIELD_NUMBER = 4;
    public static final int TAG_FIELD_NUMBER = 5;
    public static final int TID_FIELD_NUMBER = 3;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private int pid_;
    private int priority_;
    private int tid_;
    private String timestamp_ = "";
    private String tag_ = "";
    private String message_ = "";

    public final class Builder extends GeneratedMessageLite.Builder implements TombstoneProtos$LogMessageOrBuilder {
    }

    static {
        TombstoneProtos$LogMessage tombstoneProtos$LogMessage = new TombstoneProtos$LogMessage();
        DEFAULT_INSTANCE = tombstoneProtos$LogMessage;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$LogMessage.class, tombstoneProtos$LogMessage);
    }

    private TombstoneProtos$LogMessage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.message_ = getDefaultInstance().getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPid() {
        this.pid_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriority() {
        this.priority_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTag() {
        this.tag_ = getDefaultInstance().getTag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTid() {
        this.tid_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = getDefaultInstance().getTimestamp();
    }

    public static TombstoneProtos$LogMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$LogMessage parseDelimitedFrom(InputStream inputStream) {
        return (TombstoneProtos$LogMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$LogMessage parseFrom(ByteBuffer byteBuffer) {
        return (TombstoneProtos$LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TombstoneProtos$LogMessage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        str.getClass();
        this.message_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.message_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPid(int i) {
        this.pid_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriority(int i) {
        this.priority_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTag(String str) {
        str.getClass();
        this.tag_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTagBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.tag_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTid(int i) {
        this.tid_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(String str) {
        str.getClass();
        this.timestamp_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestampBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.timestamp_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (TombstoneProtos$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new TombstoneProtos$LogMessage();
            case 2:
                return new Builder(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003\u000b\u0004\u000b\u0005Ȉ\u0006Ȉ", new Object[]{"timestamp_", "pid_", "tid_", "priority_", "tag_", "message_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TombstoneProtos$LogMessage> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (TombstoneProtos$LogMessage.class) {
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

    public String getMessage() {
        return this.message_;
    }

    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.message_);
    }

    public int getPid() {
        return this.pid_;
    }

    public int getPriority() {
        return this.priority_;
    }

    public String getTag() {
        return this.tag_;
    }

    public ByteString getTagBytes() {
        return ByteString.copyFromUtf8(this.tag_);
    }

    public int getTid() {
        return this.tid_;
    }

    public String getTimestamp() {
        return this.timestamp_;
    }

    public ByteString getTimestampBytes() {
        return ByteString.copyFromUtf8(this.timestamp_);
    }

    public static Builder newBuilder(TombstoneProtos$LogMessage tombstoneProtos$LogMessage) {
        return DEFAULT_INSTANCE.createBuilder(tombstoneProtos$LogMessage);
    }

    public static TombstoneProtos$LogMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$LogMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TombstoneProtos$LogMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TombstoneProtos$LogMessage parseFrom(ByteString byteString) {
        return (TombstoneProtos$LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TombstoneProtos$LogMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TombstoneProtos$LogMessage parseFrom(byte[] bArr) {
        return (TombstoneProtos$LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$LogMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TombstoneProtos$LogMessage parseFrom(InputStream inputStream) {
        return (TombstoneProtos$LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$LogMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TombstoneProtos$LogMessage parseFrom(CodedInputStream codedInputStream) {
        return (TombstoneProtos$LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$LogMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$LogMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

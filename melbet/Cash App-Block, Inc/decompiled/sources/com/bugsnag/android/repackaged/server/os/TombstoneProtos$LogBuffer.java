package com.bugsnag.android.repackaged.server.os;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes4.dex */
public final class TombstoneProtos$LogBuffer extends GeneratedMessageLite<TombstoneProtos$LogBuffer, Builder> implements TombstoneProtos$LogBufferOrBuilder {
    private static final TombstoneProtos$LogBuffer DEFAULT_INSTANCE;
    public static final int LOGS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<TombstoneProtos$LogBuffer> PARSER;
    private String name_ = "";
    private Internal.ProtobufList<TombstoneProtos$LogMessage> logs_ = GeneratedMessageLite.emptyProtobufList();

    public final class Builder extends GeneratedMessageLite.Builder implements TombstoneProtos$LogBufferOrBuilder {
    }

    static {
        TombstoneProtos$LogBuffer tombstoneProtos$LogBuffer = new TombstoneProtos$LogBuffer();
        DEFAULT_INSTANCE = tombstoneProtos$LogBuffer;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$LogBuffer.class, tombstoneProtos$LogBuffer);
    }

    private TombstoneProtos$LogBuffer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLogs(Iterable<? extends TombstoneProtos$LogMessage> iterable) {
        ensureLogsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.logs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLogs(TombstoneProtos$LogMessage tombstoneProtos$LogMessage) {
        tombstoneProtos$LogMessage.getClass();
        ensureLogsIsMutable();
        this.logs_.add(tombstoneProtos$LogMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogs() {
        this.logs_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    private void ensureLogsIsMutable() {
        Internal.ProtobufList<TombstoneProtos$LogMessage> protobufList = this.logs_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.logs_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static TombstoneProtos$LogBuffer getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$LogBuffer parseDelimitedFrom(InputStream inputStream) {
        return (TombstoneProtos$LogBuffer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$LogBuffer parseFrom(ByteBuffer byteBuffer) {
        return (TombstoneProtos$LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TombstoneProtos$LogBuffer> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLogs(int i) {
        ensureLogsIsMutable();
        this.logs_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogs(int i, TombstoneProtos$LogMessage tombstoneProtos$LogMessage) {
        tombstoneProtos$LogMessage.getClass();
        ensureLogsIsMutable();
        this.logs_.set(i, tombstoneProtos$LogMessage);
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

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (TombstoneProtos$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new TombstoneProtos$LogBuffer();
            case 2:
                return new Builder(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"name_", "logs_", TombstoneProtos$LogMessage.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TombstoneProtos$LogBuffer> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (TombstoneProtos$LogBuffer.class) {
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

    public TombstoneProtos$LogMessage getLogs(int i) {
        return this.logs_.get(i);
    }

    public int getLogsCount() {
        return this.logs_.size();
    }

    public List<TombstoneProtos$LogMessage> getLogsList() {
        return this.logs_;
    }

    public TombstoneProtos$LogMessageOrBuilder getLogsOrBuilder(int i) {
        return this.logs_.get(i);
    }

    public List<? extends TombstoneProtos$LogMessageOrBuilder> getLogsOrBuilderList() {
        return this.logs_;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public static Builder newBuilder(TombstoneProtos$LogBuffer tombstoneProtos$LogBuffer) {
        return DEFAULT_INSTANCE.createBuilder(tombstoneProtos$LogBuffer);
    }

    public static TombstoneProtos$LogBuffer parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$LogBuffer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TombstoneProtos$LogBuffer parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TombstoneProtos$LogBuffer parseFrom(ByteString byteString) {
        return (TombstoneProtos$LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TombstoneProtos$LogBuffer parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLogs(int i, TombstoneProtos$LogMessage tombstoneProtos$LogMessage) {
        tombstoneProtos$LogMessage.getClass();
        ensureLogsIsMutable();
        this.logs_.add(i, tombstoneProtos$LogMessage);
    }

    public static TombstoneProtos$LogBuffer parseFrom(byte[] bArr) {
        return (TombstoneProtos$LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$LogBuffer parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TombstoneProtos$LogBuffer parseFrom(InputStream inputStream) {
        return (TombstoneProtos$LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$LogBuffer parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TombstoneProtos$LogBuffer parseFrom(CodedInputStream codedInputStream) {
        return (TombstoneProtos$LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$LogBuffer parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$LogBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

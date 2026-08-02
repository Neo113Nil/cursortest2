package com.bugsnag.android.repackaged.server.os;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes4.dex */
public final class TombstoneProtos$HeapObject extends GeneratedMessageLite<TombstoneProtos$HeapObject, Builder> implements MessageLiteOrBuilder {
    public static final int ADDRESS_FIELD_NUMBER = 1;
    public static final int ALLOCATION_BACKTRACE_FIELD_NUMBER = 4;
    public static final int ALLOCATION_TID_FIELD_NUMBER = 3;
    public static final int DEALLOCATION_BACKTRACE_FIELD_NUMBER = 6;
    public static final int DEALLOCATION_TID_FIELD_NUMBER = 5;
    private static final TombstoneProtos$HeapObject DEFAULT_INSTANCE;
    private static volatile Parser<TombstoneProtos$HeapObject> PARSER = null;
    public static final int SIZE_FIELD_NUMBER = 2;
    private long address_;
    private long allocationTid_;
    private long deallocationTid_;
    private long size_;
    private Internal.ProtobufList<TombstoneProtos$BacktraceFrame> allocationBacktrace_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<TombstoneProtos$BacktraceFrame> deallocationBacktrace_ = GeneratedMessageLite.emptyProtobufList();

    public final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    }

    static {
        TombstoneProtos$HeapObject tombstoneProtos$HeapObject = new TombstoneProtos$HeapObject();
        DEFAULT_INSTANCE = tombstoneProtos$HeapObject;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$HeapObject.class, tombstoneProtos$HeapObject);
    }

    private TombstoneProtos$HeapObject() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAllocationBacktrace(Iterable<? extends TombstoneProtos$BacktraceFrame> iterable) {
        ensureAllocationBacktraceIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.allocationBacktrace_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDeallocationBacktrace(Iterable<? extends TombstoneProtos$BacktraceFrame> iterable) {
        ensureDeallocationBacktraceIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.deallocationBacktrace_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllocationBacktrace(TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame) {
        tombstoneProtos$BacktraceFrame.getClass();
        ensureAllocationBacktraceIsMutable();
        this.allocationBacktrace_.add(tombstoneProtos$BacktraceFrame);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDeallocationBacktrace(TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame) {
        tombstoneProtos$BacktraceFrame.getClass();
        ensureDeallocationBacktraceIsMutable();
        this.deallocationBacktrace_.add(tombstoneProtos$BacktraceFrame);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddress() {
        this.address_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllocationBacktrace() {
        this.allocationBacktrace_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllocationTid() {
        this.allocationTid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeallocationBacktrace() {
        this.deallocationBacktrace_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeallocationTid() {
        this.deallocationTid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSize() {
        this.size_ = 0L;
    }

    private void ensureAllocationBacktraceIsMutable() {
        Internal.ProtobufList<TombstoneProtos$BacktraceFrame> protobufList = this.allocationBacktrace_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.allocationBacktrace_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureDeallocationBacktraceIsMutable() {
        Internal.ProtobufList<TombstoneProtos$BacktraceFrame> protobufList = this.deallocationBacktrace_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.deallocationBacktrace_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static TombstoneProtos$HeapObject getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$HeapObject parseDelimitedFrom(InputStream inputStream) {
        return (TombstoneProtos$HeapObject) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$HeapObject parseFrom(ByteBuffer byteBuffer) {
        return (TombstoneProtos$HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TombstoneProtos$HeapObject> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAllocationBacktrace(int i) {
        ensureAllocationBacktraceIsMutable();
        this.allocationBacktrace_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDeallocationBacktrace(int i) {
        ensureDeallocationBacktraceIsMutable();
        this.deallocationBacktrace_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddress(long j) {
        this.address_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllocationBacktrace(int i, TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame) {
        tombstoneProtos$BacktraceFrame.getClass();
        ensureAllocationBacktraceIsMutable();
        this.allocationBacktrace_.set(i, tombstoneProtos$BacktraceFrame);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllocationTid(long j) {
        this.allocationTid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeallocationBacktrace(int i, TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame) {
        tombstoneProtos$BacktraceFrame.getClass();
        ensureDeallocationBacktraceIsMutable();
        this.deallocationBacktrace_.set(i, tombstoneProtos$BacktraceFrame);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeallocationTid(long j) {
        this.deallocationTid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSize(long j) {
        this.size_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (TombstoneProtos$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new TombstoneProtos$HeapObject();
            case 2:
                return new Builder(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0003\u0002\u0003\u0003\u0003\u0004\u001b\u0005\u0003\u0006\u001b", new Object[]{"address_", "size_", "allocationTid_", "allocationBacktrace_", TombstoneProtos$BacktraceFrame.class, "deallocationTid_", "deallocationBacktrace_", TombstoneProtos$BacktraceFrame.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TombstoneProtos$HeapObject> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (TombstoneProtos$HeapObject.class) {
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

    public long getAddress() {
        return this.address_;
    }

    public TombstoneProtos$BacktraceFrame getAllocationBacktrace(int i) {
        return this.allocationBacktrace_.get(i);
    }

    public int getAllocationBacktraceCount() {
        return this.allocationBacktrace_.size();
    }

    public List<TombstoneProtos$BacktraceFrame> getAllocationBacktraceList() {
        return this.allocationBacktrace_;
    }

    public TombstoneProtos$BacktraceFrameOrBuilder getAllocationBacktraceOrBuilder(int i) {
        return this.allocationBacktrace_.get(i);
    }

    public List<? extends TombstoneProtos$BacktraceFrameOrBuilder> getAllocationBacktraceOrBuilderList() {
        return this.allocationBacktrace_;
    }

    public long getAllocationTid() {
        return this.allocationTid_;
    }

    public TombstoneProtos$BacktraceFrame getDeallocationBacktrace(int i) {
        return this.deallocationBacktrace_.get(i);
    }

    public int getDeallocationBacktraceCount() {
        return this.deallocationBacktrace_.size();
    }

    public List<TombstoneProtos$BacktraceFrame> getDeallocationBacktraceList() {
        return this.deallocationBacktrace_;
    }

    public TombstoneProtos$BacktraceFrameOrBuilder getDeallocationBacktraceOrBuilder(int i) {
        return this.deallocationBacktrace_.get(i);
    }

    public List<? extends TombstoneProtos$BacktraceFrameOrBuilder> getDeallocationBacktraceOrBuilderList() {
        return this.deallocationBacktrace_;
    }

    public long getDeallocationTid() {
        return this.deallocationTid_;
    }

    public long getSize() {
        return this.size_;
    }

    public static Builder newBuilder(TombstoneProtos$HeapObject tombstoneProtos$HeapObject) {
        return DEFAULT_INSTANCE.createBuilder(tombstoneProtos$HeapObject);
    }

    public static TombstoneProtos$HeapObject parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$HeapObject) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TombstoneProtos$HeapObject parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TombstoneProtos$HeapObject parseFrom(ByteString byteString) {
        return (TombstoneProtos$HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TombstoneProtos$HeapObject parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllocationBacktrace(int i, TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame) {
        tombstoneProtos$BacktraceFrame.getClass();
        ensureAllocationBacktraceIsMutable();
        this.allocationBacktrace_.add(i, tombstoneProtos$BacktraceFrame);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDeallocationBacktrace(int i, TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame) {
        tombstoneProtos$BacktraceFrame.getClass();
        ensureDeallocationBacktraceIsMutable();
        this.deallocationBacktrace_.add(i, tombstoneProtos$BacktraceFrame);
    }

    public static TombstoneProtos$HeapObject parseFrom(byte[] bArr) {
        return (TombstoneProtos$HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$HeapObject parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TombstoneProtos$HeapObject parseFrom(InputStream inputStream) {
        return (TombstoneProtos$HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$HeapObject parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TombstoneProtos$HeapObject parseFrom(CodedInputStream codedInputStream) {
        return (TombstoneProtos$HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$HeapObject parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

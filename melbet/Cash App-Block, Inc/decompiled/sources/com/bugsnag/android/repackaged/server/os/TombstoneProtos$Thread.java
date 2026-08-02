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
public final class TombstoneProtos$Thread extends GeneratedMessageLite<TombstoneProtos$Thread, Builder> implements MessageLiteOrBuilder {
    public static final int BACKTRACE_NOTE_FIELD_NUMBER = 7;
    public static final int CURRENT_BACKTRACE_FIELD_NUMBER = 4;
    private static final TombstoneProtos$Thread DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int MEMORY_DUMP_FIELD_NUMBER = 5;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int PAC_ENABLED_KEYS_FIELD_NUMBER = 8;
    private static volatile Parser<TombstoneProtos$Thread> PARSER = null;
    public static final int REGISTERS_FIELD_NUMBER = 3;
    public static final int TAGGED_ADDR_CTRL_FIELD_NUMBER = 6;
    public static final int UNREADABLE_ELF_FILES_FIELD_NUMBER = 9;
    private int id_;
    private long pacEnabledKeys_;
    private long taggedAddrCtrl_;
    private String name_ = "";
    private Internal.ProtobufList<TombstoneProtos$Register> registers_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> backtraceNote_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> unreadableElfFiles_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<TombstoneProtos$BacktraceFrame> currentBacktrace_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<TombstoneProtos$MemoryDump> memoryDump_ = GeneratedMessageLite.emptyProtobufList();

    public final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    }

    static {
        TombstoneProtos$Thread tombstoneProtos$Thread = new TombstoneProtos$Thread();
        DEFAULT_INSTANCE = tombstoneProtos$Thread;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$Thread.class, tombstoneProtos$Thread);
    }

    private TombstoneProtos$Thread() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBacktraceNote(Iterable<String> iterable) {
        ensureBacktraceNoteIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.backtraceNote_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCurrentBacktrace(Iterable<? extends TombstoneProtos$BacktraceFrame> iterable) {
        ensureCurrentBacktraceIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.currentBacktrace_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMemoryDump(Iterable<? extends TombstoneProtos$MemoryDump> iterable) {
        ensureMemoryDumpIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.memoryDump_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRegisters(Iterable<? extends TombstoneProtos$Register> iterable) {
        ensureRegistersIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.registers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUnreadableElfFiles(Iterable<String> iterable) {
        ensureUnreadableElfFilesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.unreadableElfFiles_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBacktraceNote(String str) {
        str.getClass();
        ensureBacktraceNoteIsMutable();
        this.backtraceNote_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBacktraceNoteBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureBacktraceNoteIsMutable();
        this.backtraceNote_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCurrentBacktrace(TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame) {
        tombstoneProtos$BacktraceFrame.getClass();
        ensureCurrentBacktraceIsMutable();
        this.currentBacktrace_.add(tombstoneProtos$BacktraceFrame);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMemoryDump(TombstoneProtos$MemoryDump tombstoneProtos$MemoryDump) {
        tombstoneProtos$MemoryDump.getClass();
        ensureMemoryDumpIsMutable();
        this.memoryDump_.add(tombstoneProtos$MemoryDump);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRegisters(TombstoneProtos$Register tombstoneProtos$Register) {
        tombstoneProtos$Register.getClass();
        ensureRegistersIsMutable();
        this.registers_.add(tombstoneProtos$Register);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUnreadableElfFiles(String str) {
        str.getClass();
        ensureUnreadableElfFilesIsMutable();
        this.unreadableElfFiles_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUnreadableElfFilesBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureUnreadableElfFilesIsMutable();
        this.unreadableElfFiles_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBacktraceNote() {
        this.backtraceNote_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentBacktrace() {
        this.currentBacktrace_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMemoryDump() {
        this.memoryDump_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPacEnabledKeys() {
        this.pacEnabledKeys_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegisters() {
        this.registers_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTaggedAddrCtrl() {
        this.taggedAddrCtrl_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnreadableElfFiles() {
        this.unreadableElfFiles_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureBacktraceNoteIsMutable() {
        Internal.ProtobufList<String> protobufList = this.backtraceNote_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.backtraceNote_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureCurrentBacktraceIsMutable() {
        Internal.ProtobufList<TombstoneProtos$BacktraceFrame> protobufList = this.currentBacktrace_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.currentBacktrace_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureMemoryDumpIsMutable() {
        Internal.ProtobufList<TombstoneProtos$MemoryDump> protobufList = this.memoryDump_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.memoryDump_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureRegistersIsMutable() {
        Internal.ProtobufList<TombstoneProtos$Register> protobufList = this.registers_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.registers_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureUnreadableElfFilesIsMutable() {
        Internal.ProtobufList<String> protobufList = this.unreadableElfFiles_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.unreadableElfFiles_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static TombstoneProtos$Thread getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$Thread parseDelimitedFrom(InputStream inputStream) {
        return (TombstoneProtos$Thread) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$Thread parseFrom(ByteBuffer byteBuffer) {
        return (TombstoneProtos$Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TombstoneProtos$Thread> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCurrentBacktrace(int i) {
        ensureCurrentBacktraceIsMutable();
        this.currentBacktrace_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMemoryDump(int i) {
        ensureMemoryDumpIsMutable();
        this.memoryDump_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRegisters(int i) {
        ensureRegistersIsMutable();
        this.registers_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBacktraceNote(int i, String str) {
        str.getClass();
        ensureBacktraceNoteIsMutable();
        this.backtraceNote_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentBacktrace(int i, TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame) {
        tombstoneProtos$BacktraceFrame.getClass();
        ensureCurrentBacktraceIsMutable();
        this.currentBacktrace_.set(i, tombstoneProtos$BacktraceFrame);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(int i) {
        this.id_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMemoryDump(int i, TombstoneProtos$MemoryDump tombstoneProtos$MemoryDump) {
        tombstoneProtos$MemoryDump.getClass();
        ensureMemoryDumpIsMutable();
        this.memoryDump_.set(i, tombstoneProtos$MemoryDump);
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
    public void setPacEnabledKeys(long j) {
        this.pacEnabledKeys_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegisters(int i, TombstoneProtos$Register tombstoneProtos$Register) {
        tombstoneProtos$Register.getClass();
        ensureRegistersIsMutable();
        this.registers_.set(i, tombstoneProtos$Register);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTaggedAddrCtrl(long j) {
        this.taggedAddrCtrl_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnreadableElfFiles(int i, String str) {
        str.getClass();
        ensureUnreadableElfFilesIsMutable();
        this.unreadableElfFiles_.set(i, str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (TombstoneProtos$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new TombstoneProtos$Thread();
            case 2:
                return new Builder(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0005\u0000\u0001\u0004\u0002Ȉ\u0003\u001b\u0004\u001b\u0005\u001b\u0006\u0002\u0007Ț\b\u0002\tȚ", new Object[]{"id_", "name_", "registers_", TombstoneProtos$Register.class, "currentBacktrace_", TombstoneProtos$BacktraceFrame.class, "memoryDump_", TombstoneProtos$MemoryDump.class, "taggedAddrCtrl_", "backtraceNote_", "pacEnabledKeys_", "unreadableElfFiles_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TombstoneProtos$Thread> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (TombstoneProtos$Thread.class) {
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

    public String getBacktraceNote(int i) {
        return this.backtraceNote_.get(i);
    }

    public ByteString getBacktraceNoteBytes(int i) {
        return ByteString.copyFromUtf8(this.backtraceNote_.get(i));
    }

    public int getBacktraceNoteCount() {
        return this.backtraceNote_.size();
    }

    public List<String> getBacktraceNoteList() {
        return this.backtraceNote_;
    }

    public TombstoneProtos$BacktraceFrame getCurrentBacktrace(int i) {
        return this.currentBacktrace_.get(i);
    }

    public int getCurrentBacktraceCount() {
        return this.currentBacktrace_.size();
    }

    public List<TombstoneProtos$BacktraceFrame> getCurrentBacktraceList() {
        return this.currentBacktrace_;
    }

    public TombstoneProtos$BacktraceFrameOrBuilder getCurrentBacktraceOrBuilder(int i) {
        return this.currentBacktrace_.get(i);
    }

    public List<? extends TombstoneProtos$BacktraceFrameOrBuilder> getCurrentBacktraceOrBuilderList() {
        return this.currentBacktrace_;
    }

    public int getId() {
        return this.id_;
    }

    public TombstoneProtos$MemoryDump getMemoryDump(int i) {
        return this.memoryDump_.get(i);
    }

    public int getMemoryDumpCount() {
        return this.memoryDump_.size();
    }

    public List<TombstoneProtos$MemoryDump> getMemoryDumpList() {
        return this.memoryDump_;
    }

    public TombstoneProtos$MemoryDumpOrBuilder getMemoryDumpOrBuilder(int i) {
        return this.memoryDump_.get(i);
    }

    public List<? extends TombstoneProtos$MemoryDumpOrBuilder> getMemoryDumpOrBuilderList() {
        return this.memoryDump_;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public long getPacEnabledKeys() {
        return this.pacEnabledKeys_;
    }

    public TombstoneProtos$Register getRegisters(int i) {
        return this.registers_.get(i);
    }

    public int getRegistersCount() {
        return this.registers_.size();
    }

    public List<TombstoneProtos$Register> getRegistersList() {
        return this.registers_;
    }

    public TombstoneProtos$RegisterOrBuilder getRegistersOrBuilder(int i) {
        return this.registers_.get(i);
    }

    public List<? extends TombstoneProtos$RegisterOrBuilder> getRegistersOrBuilderList() {
        return this.registers_;
    }

    public long getTaggedAddrCtrl() {
        return this.taggedAddrCtrl_;
    }

    public String getUnreadableElfFiles(int i) {
        return this.unreadableElfFiles_.get(i);
    }

    public ByteString getUnreadableElfFilesBytes(int i) {
        return ByteString.copyFromUtf8(this.unreadableElfFiles_.get(i));
    }

    public int getUnreadableElfFilesCount() {
        return this.unreadableElfFiles_.size();
    }

    public List<String> getUnreadableElfFilesList() {
        return this.unreadableElfFiles_;
    }

    public static Builder newBuilder(TombstoneProtos$Thread tombstoneProtos$Thread) {
        return DEFAULT_INSTANCE.createBuilder(tombstoneProtos$Thread);
    }

    public static TombstoneProtos$Thread parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$Thread) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TombstoneProtos$Thread parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TombstoneProtos$Thread parseFrom(ByteString byteString) {
        return (TombstoneProtos$Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TombstoneProtos$Thread parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCurrentBacktrace(int i, TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame) {
        tombstoneProtos$BacktraceFrame.getClass();
        ensureCurrentBacktraceIsMutable();
        this.currentBacktrace_.add(i, tombstoneProtos$BacktraceFrame);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMemoryDump(int i, TombstoneProtos$MemoryDump tombstoneProtos$MemoryDump) {
        tombstoneProtos$MemoryDump.getClass();
        ensureMemoryDumpIsMutable();
        this.memoryDump_.add(i, tombstoneProtos$MemoryDump);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRegisters(int i, TombstoneProtos$Register tombstoneProtos$Register) {
        tombstoneProtos$Register.getClass();
        ensureRegistersIsMutable();
        this.registers_.add(i, tombstoneProtos$Register);
    }

    public static TombstoneProtos$Thread parseFrom(byte[] bArr) {
        return (TombstoneProtos$Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$Thread parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TombstoneProtos$Thread parseFrom(InputStream inputStream) {
        return (TombstoneProtos$Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$Thread parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TombstoneProtos$Thread parseFrom(CodedInputStream codedInputStream) {
        return (TombstoneProtos$Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$Thread parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$Thread) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

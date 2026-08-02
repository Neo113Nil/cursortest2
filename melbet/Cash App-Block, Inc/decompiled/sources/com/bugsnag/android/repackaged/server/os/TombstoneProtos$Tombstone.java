package com.bugsnag.android.repackaged.server.os;

import com.bugsnag.android.repackaged.server.os.TombstoneProtos$Signal;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class TombstoneProtos$Tombstone extends GeneratedMessageLite<TombstoneProtos$Tombstone, Builder> implements MessageLiteOrBuilder {
    public static final int ABORT_MESSAGE_FIELD_NUMBER = 14;
    public static final int ARCH_FIELD_NUMBER = 1;
    public static final int BUILD_FINGERPRINT_FIELD_NUMBER = 2;
    public static final int CAUSES_FIELD_NUMBER = 15;
    public static final int COMMAND_LINE_FIELD_NUMBER = 9;
    private static final TombstoneProtos$Tombstone DEFAULT_INSTANCE;
    public static final int LOG_BUFFERS_FIELD_NUMBER = 18;
    public static final int MEMORY_MAPPINGS_FIELD_NUMBER = 17;
    public static final int OPEN_FDS_FIELD_NUMBER = 19;
    private static volatile Parser<TombstoneProtos$Tombstone> PARSER = null;
    public static final int PID_FIELD_NUMBER = 5;
    public static final int PROCESS_UPTIME_FIELD_NUMBER = 20;
    public static final int REVISION_FIELD_NUMBER = 3;
    public static final int SELINUX_LABEL_FIELD_NUMBER = 8;
    public static final int SIGNAL_INFO_FIELD_NUMBER = 10;
    public static final int THREADS_FIELD_NUMBER = 16;
    public static final int TID_FIELD_NUMBER = 6;
    public static final int TIMESTAMP_FIELD_NUMBER = 4;
    public static final int UID_FIELD_NUMBER = 7;
    private int arch_;
    private int bitField0_;
    private int pid_;
    private int processUptime_;
    private TombstoneProtos$Signal signalInfo_;
    private int tid_;
    private int uid_;
    private MapFieldLite<Integer, TombstoneProtos$Thread> threads_ = MapFieldLite.emptyMapField();
    private String buildFingerprint_ = "";
    private String revision_ = "";
    private String timestamp_ = "";
    private String selinuxLabel_ = "";
    private Internal.ProtobufList<String> commandLine_ = GeneratedMessageLite.emptyProtobufList();
    private String abortMessage_ = "";
    private Internal.ProtobufList<TombstoneProtos$Cause> causes_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<TombstoneProtos$MemoryMapping> memoryMappings_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<TombstoneProtos$LogBuffer> logBuffers_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<TombstoneProtos$FD> openFds_ = GeneratedMessageLite.emptyProtobufList();

    public final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    }

    public abstract class ThreadsDefaultEntryHolder {
        public static final MapEntryLite defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.MESSAGE, TombstoneProtos$Thread.getDefaultInstance());
    }

    static {
        TombstoneProtos$Tombstone tombstoneProtos$Tombstone = new TombstoneProtos$Tombstone();
        DEFAULT_INSTANCE = tombstoneProtos$Tombstone;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$Tombstone.class, tombstoneProtos$Tombstone);
    }

    private TombstoneProtos$Tombstone() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCauses(Iterable<? extends TombstoneProtos$Cause> iterable) {
        ensureCausesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.causes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCommandLine(Iterable<String> iterable) {
        ensureCommandLineIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.commandLine_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLogBuffers(Iterable<? extends TombstoneProtos$LogBuffer> iterable) {
        ensureLogBuffersIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.logBuffers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMemoryMappings(Iterable<? extends TombstoneProtos$MemoryMapping> iterable) {
        ensureMemoryMappingsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.memoryMappings_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOpenFds(Iterable<? extends TombstoneProtos$FD> iterable) {
        ensureOpenFdsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.openFds_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCauses(TombstoneProtos$Cause tombstoneProtos$Cause) {
        tombstoneProtos$Cause.getClass();
        ensureCausesIsMutable();
        this.causes_.add(tombstoneProtos$Cause);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCommandLine(String str) {
        str.getClass();
        ensureCommandLineIsMutable();
        this.commandLine_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCommandLineBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureCommandLineIsMutable();
        this.commandLine_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLogBuffers(TombstoneProtos$LogBuffer tombstoneProtos$LogBuffer) {
        tombstoneProtos$LogBuffer.getClass();
        ensureLogBuffersIsMutable();
        this.logBuffers_.add(tombstoneProtos$LogBuffer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMemoryMappings(TombstoneProtos$MemoryMapping tombstoneProtos$MemoryMapping) {
        tombstoneProtos$MemoryMapping.getClass();
        ensureMemoryMappingsIsMutable();
        this.memoryMappings_.add(tombstoneProtos$MemoryMapping);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOpenFds(TombstoneProtos$FD tombstoneProtos$FD) {
        tombstoneProtos$FD.getClass();
        ensureOpenFdsIsMutable();
        this.openFds_.add(tombstoneProtos$FD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAbortMessage() {
        this.abortMessage_ = getDefaultInstance().getAbortMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArch() {
        this.arch_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBuildFingerprint() {
        this.buildFingerprint_ = getDefaultInstance().getBuildFingerprint();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCauses() {
        this.causes_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCommandLine() {
        this.commandLine_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogBuffers() {
        this.logBuffers_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMemoryMappings() {
        this.memoryMappings_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOpenFds() {
        this.openFds_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPid() {
        this.pid_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProcessUptime() {
        this.processUptime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRevision() {
        this.revision_ = getDefaultInstance().getRevision();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelinuxLabel() {
        this.selinuxLabel_ = getDefaultInstance().getSelinuxLabel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSignalInfo() {
        this.signalInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTid() {
        this.tid_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = getDefaultInstance().getTimestamp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUid() {
        this.uid_ = 0;
    }

    private void ensureCausesIsMutable() {
        Internal.ProtobufList<TombstoneProtos$Cause> protobufList = this.causes_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.causes_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureCommandLineIsMutable() {
        Internal.ProtobufList<String> protobufList = this.commandLine_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.commandLine_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureLogBuffersIsMutable() {
        Internal.ProtobufList<TombstoneProtos$LogBuffer> protobufList = this.logBuffers_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.logBuffers_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureMemoryMappingsIsMutable() {
        Internal.ProtobufList<TombstoneProtos$MemoryMapping> protobufList = this.memoryMappings_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.memoryMappings_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureOpenFdsIsMutable() {
        Internal.ProtobufList<TombstoneProtos$FD> protobufList = this.openFds_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.openFds_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static TombstoneProtos$Tombstone getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<Integer, TombstoneProtos$Thread> getMutableThreadsMap() {
        return internalGetMutableThreads();
    }

    private MapFieldLite<Integer, TombstoneProtos$Thread> internalGetMutableThreads() {
        if (!this.threads_.isMutable()) {
            this.threads_ = this.threads_.mutableCopy();
        }
        return this.threads_;
    }

    private MapFieldLite<Integer, TombstoneProtos$Thread> internalGetThreads() {
        return this.threads_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSignalInfo(TombstoneProtos$Signal tombstoneProtos$Signal) {
        tombstoneProtos$Signal.getClass();
        TombstoneProtos$Signal tombstoneProtos$Signal2 = this.signalInfo_;
        if (tombstoneProtos$Signal2 == null || tombstoneProtos$Signal2 == TombstoneProtos$Signal.getDefaultInstance()) {
            this.signalInfo_ = tombstoneProtos$Signal;
        } else {
            this.signalInfo_ = (TombstoneProtos$Signal) ((TombstoneProtos$Signal.Builder) TombstoneProtos$Signal.newBuilder(this.signalInfo_).mergeFrom((TombstoneProtos$Signal.Builder) tombstoneProtos$Signal)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$Tombstone parseDelimitedFrom(InputStream inputStream) {
        return (TombstoneProtos$Tombstone) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$Tombstone parseFrom(ByteBuffer byteBuffer) {
        return (TombstoneProtos$Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TombstoneProtos$Tombstone> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCauses(int i) {
        ensureCausesIsMutable();
        this.causes_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLogBuffers(int i) {
        ensureLogBuffersIsMutable();
        this.logBuffers_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMemoryMappings(int i) {
        ensureMemoryMappingsIsMutable();
        this.memoryMappings_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOpenFds(int i) {
        ensureOpenFdsIsMutable();
        this.openFds_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAbortMessage(String str) {
        str.getClass();
        this.abortMessage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAbortMessageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.abortMessage_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArch(TombstoneProtos$Architecture tombstoneProtos$Architecture) {
        this.arch_ = tombstoneProtos$Architecture.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArchValue(int i) {
        this.arch_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildFingerprint(String str) {
        str.getClass();
        this.buildFingerprint_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildFingerprintBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.buildFingerprint_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCauses(int i, TombstoneProtos$Cause tombstoneProtos$Cause) {
        tombstoneProtos$Cause.getClass();
        ensureCausesIsMutable();
        this.causes_.set(i, tombstoneProtos$Cause);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommandLine(int i, String str) {
        str.getClass();
        ensureCommandLineIsMutable();
        this.commandLine_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogBuffers(int i, TombstoneProtos$LogBuffer tombstoneProtos$LogBuffer) {
        tombstoneProtos$LogBuffer.getClass();
        ensureLogBuffersIsMutable();
        this.logBuffers_.set(i, tombstoneProtos$LogBuffer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMemoryMappings(int i, TombstoneProtos$MemoryMapping tombstoneProtos$MemoryMapping) {
        tombstoneProtos$MemoryMapping.getClass();
        ensureMemoryMappingsIsMutable();
        this.memoryMappings_.set(i, tombstoneProtos$MemoryMapping);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpenFds(int i, TombstoneProtos$FD tombstoneProtos$FD) {
        tombstoneProtos$FD.getClass();
        ensureOpenFdsIsMutable();
        this.openFds_.set(i, tombstoneProtos$FD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPid(int i) {
        this.pid_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProcessUptime(int i) {
        this.processUptime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRevision(String str) {
        str.getClass();
        this.revision_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRevisionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.revision_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelinuxLabel(String str) {
        str.getClass();
        this.selinuxLabel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelinuxLabelBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.selinuxLabel_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSignalInfo(TombstoneProtos$Signal tombstoneProtos$Signal) {
        tombstoneProtos$Signal.getClass();
        this.signalInfo_ = tombstoneProtos$Signal;
        this.bitField0_ |= 1;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setUid(int i) {
        this.uid_ = i;
    }

    public boolean containsThreads(int i) {
        return internalGetThreads().containsKey(Integer.valueOf(i));
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (TombstoneProtos$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new TombstoneProtos$Tombstone();
            case 2:
                return new Builder(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0000\u0001\u0001\u0014\u0011\u0001\u0005\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u000b\u0006\u000b\u0007\u000b\bȈ\tȚ\nဉ\u0000\u000eȈ\u000f\u001b\u00102\u0011\u001b\u0012\u001b\u0013\u001b\u0014\u000b", new Object[]{"bitField0_", "arch_", "buildFingerprint_", "revision_", "timestamp_", "pid_", "tid_", "uid_", "selinuxLabel_", "commandLine_", "signalInfo_", "abortMessage_", "causes_", TombstoneProtos$Cause.class, "threads_", ThreadsDefaultEntryHolder.defaultEntry, "memoryMappings_", TombstoneProtos$MemoryMapping.class, "logBuffers_", TombstoneProtos$LogBuffer.class, "openFds_", TombstoneProtos$FD.class, "processUptime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TombstoneProtos$Tombstone> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (TombstoneProtos$Tombstone.class) {
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

    public String getAbortMessage() {
        return this.abortMessage_;
    }

    public ByteString getAbortMessageBytes() {
        return ByteString.copyFromUtf8(this.abortMessage_);
    }

    public TombstoneProtos$Architecture getArch() {
        int i = this.arch_;
        TombstoneProtos$Architecture tombstoneProtos$Architecture = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : TombstoneProtos$Architecture.RISCV64 : TombstoneProtos$Architecture.X86_64 : TombstoneProtos$Architecture.X86 : TombstoneProtos$Architecture.ARM64 : TombstoneProtos$Architecture.ARM32;
        return tombstoneProtos$Architecture == null ? TombstoneProtos$Architecture.UNRECOGNIZED : tombstoneProtos$Architecture;
    }

    public int getArchValue() {
        return this.arch_;
    }

    public String getBuildFingerprint() {
        return this.buildFingerprint_;
    }

    public ByteString getBuildFingerprintBytes() {
        return ByteString.copyFromUtf8(this.buildFingerprint_);
    }

    public TombstoneProtos$Cause getCauses(int i) {
        return this.causes_.get(i);
    }

    public int getCausesCount() {
        return this.causes_.size();
    }

    public List<TombstoneProtos$Cause> getCausesList() {
        return this.causes_;
    }

    public TombstoneProtos$CauseOrBuilder getCausesOrBuilder(int i) {
        return this.causes_.get(i);
    }

    public List<? extends TombstoneProtos$CauseOrBuilder> getCausesOrBuilderList() {
        return this.causes_;
    }

    public String getCommandLine(int i) {
        return this.commandLine_.get(i);
    }

    public ByteString getCommandLineBytes(int i) {
        return ByteString.copyFromUtf8(this.commandLine_.get(i));
    }

    public int getCommandLineCount() {
        return this.commandLine_.size();
    }

    public List<String> getCommandLineList() {
        return this.commandLine_;
    }

    public TombstoneProtos$LogBuffer getLogBuffers(int i) {
        return this.logBuffers_.get(i);
    }

    public int getLogBuffersCount() {
        return this.logBuffers_.size();
    }

    public List<TombstoneProtos$LogBuffer> getLogBuffersList() {
        return this.logBuffers_;
    }

    public TombstoneProtos$LogBufferOrBuilder getLogBuffersOrBuilder(int i) {
        return this.logBuffers_.get(i);
    }

    public List<? extends TombstoneProtos$LogBufferOrBuilder> getLogBuffersOrBuilderList() {
        return this.logBuffers_;
    }

    public TombstoneProtos$MemoryMapping getMemoryMappings(int i) {
        return this.memoryMappings_.get(i);
    }

    public int getMemoryMappingsCount() {
        return this.memoryMappings_.size();
    }

    public List<TombstoneProtos$MemoryMapping> getMemoryMappingsList() {
        return this.memoryMappings_;
    }

    public TombstoneProtos$MemoryMappingOrBuilder getMemoryMappingsOrBuilder(int i) {
        return this.memoryMappings_.get(i);
    }

    public List<? extends TombstoneProtos$MemoryMappingOrBuilder> getMemoryMappingsOrBuilderList() {
        return this.memoryMappings_;
    }

    public TombstoneProtos$FD getOpenFds(int i) {
        return this.openFds_.get(i);
    }

    public int getOpenFdsCount() {
        return this.openFds_.size();
    }

    public List<TombstoneProtos$FD> getOpenFdsList() {
        return this.openFds_;
    }

    public TombstoneProtos$FDOrBuilder getOpenFdsOrBuilder(int i) {
        return this.openFds_.get(i);
    }

    public List<? extends TombstoneProtos$FDOrBuilder> getOpenFdsOrBuilderList() {
        return this.openFds_;
    }

    public int getPid() {
        return this.pid_;
    }

    public int getProcessUptime() {
        return this.processUptime_;
    }

    public String getRevision() {
        return this.revision_;
    }

    public ByteString getRevisionBytes() {
        return ByteString.copyFromUtf8(this.revision_);
    }

    public String getSelinuxLabel() {
        return this.selinuxLabel_;
    }

    public ByteString getSelinuxLabelBytes() {
        return ByteString.copyFromUtf8(this.selinuxLabel_);
    }

    public TombstoneProtos$Signal getSignalInfo() {
        TombstoneProtos$Signal tombstoneProtos$Signal = this.signalInfo_;
        return tombstoneProtos$Signal == null ? TombstoneProtos$Signal.getDefaultInstance() : tombstoneProtos$Signal;
    }

    @Deprecated
    public Map<Integer, TombstoneProtos$Thread> getThreads() {
        return getThreadsMap();
    }

    public int getThreadsCount() {
        return internalGetThreads().size();
    }

    public Map<Integer, TombstoneProtos$Thread> getThreadsMap() {
        return Collections.unmodifiableMap(internalGetThreads());
    }

    public TombstoneProtos$Thread getThreadsOrDefault(int i, TombstoneProtos$Thread tombstoneProtos$Thread) {
        MapFieldLite<Integer, TombstoneProtos$Thread> internalGetThreads = internalGetThreads();
        return internalGetThreads.containsKey(Integer.valueOf(i)) ? internalGetThreads.get(Integer.valueOf(i)) : tombstoneProtos$Thread;
    }

    public TombstoneProtos$Thread getThreadsOrThrow(int i) {
        MapFieldLite<Integer, TombstoneProtos$Thread> internalGetThreads = internalGetThreads();
        if (internalGetThreads.containsKey(Integer.valueOf(i))) {
            return internalGetThreads.get(Integer.valueOf(i));
        }
        Path$$ExternalSyntheticBUOutline0.m$3();
        return null;
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

    public int getUid() {
        return this.uid_;
    }

    public boolean hasSignalInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(TombstoneProtos$Tombstone tombstoneProtos$Tombstone) {
        return DEFAULT_INSTANCE.createBuilder(tombstoneProtos$Tombstone);
    }

    public static TombstoneProtos$Tombstone parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$Tombstone) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TombstoneProtos$Tombstone parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TombstoneProtos$Tombstone parseFrom(ByteString byteString) {
        return (TombstoneProtos$Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TombstoneProtos$Tombstone parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCauses(int i, TombstoneProtos$Cause tombstoneProtos$Cause) {
        tombstoneProtos$Cause.getClass();
        ensureCausesIsMutable();
        this.causes_.add(i, tombstoneProtos$Cause);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLogBuffers(int i, TombstoneProtos$LogBuffer tombstoneProtos$LogBuffer) {
        tombstoneProtos$LogBuffer.getClass();
        ensureLogBuffersIsMutable();
        this.logBuffers_.add(i, tombstoneProtos$LogBuffer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMemoryMappings(int i, TombstoneProtos$MemoryMapping tombstoneProtos$MemoryMapping) {
        tombstoneProtos$MemoryMapping.getClass();
        ensureMemoryMappingsIsMutable();
        this.memoryMappings_.add(i, tombstoneProtos$MemoryMapping);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOpenFds(int i, TombstoneProtos$FD tombstoneProtos$FD) {
        tombstoneProtos$FD.getClass();
        ensureOpenFdsIsMutable();
        this.openFds_.add(i, tombstoneProtos$FD);
    }

    public static TombstoneProtos$Tombstone parseFrom(byte[] bArr) {
        return (TombstoneProtos$Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$Tombstone parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TombstoneProtos$Tombstone parseFrom(InputStream inputStream) {
        return (TombstoneProtos$Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$Tombstone parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TombstoneProtos$Tombstone parseFrom(CodedInputStream codedInputStream) {
        return (TombstoneProtos$Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$Tombstone parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$Tombstone) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

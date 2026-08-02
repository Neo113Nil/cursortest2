package defpackage;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes8.dex */
public final class rd20 extends GeneratedMessageLite implements zt10 {
    public static final int CLIENT_ID_FIELD_NUMBER = 4;
    private static final rd20 DEFAULT_INSTANCE;
    public static final int INITIAL_LOG_QUEUE_FIELD_NUMBER = 2;
    public static final int ONGOING_LOG_QUEUE_FIELD_NUMBER = 3;
    private static volatile of90 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int STABILITY_FIELD_NUMBER = 5;
    private int bitField0_;
    private int sessionId_;
    private td20 stability_;
    private oqw initialLogQueue_ = GeneratedMessageLite.emptyProtobufList();
    private oqw ongoingLogQueue_ = GeneratedMessageLite.emptyProtobufList();
    private String clientId_ = "";

    static {
        rd20 rd20Var = new rd20();
        DEFAULT_INSTANCE = rd20Var;
        GeneratedMessageLite.registerDefaultInstance(rd20.class, rd20Var);
    }

    private rd20() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllInitialLogQueue(Iterable<? extends od20> iterable) {
        ensureInitialLogQueueIsMutable();
        b.addAll(iterable, this.initialLogQueue_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOngoingLogQueue(Iterable<? extends od20> iterable) {
        ensureOngoingLogQueueIsMutable();
        b.addAll(iterable, this.ongoingLogQueue_);
    }

    private void addInitialLogQueue(od20 od20Var) {
        od20Var.getClass();
        ensureInitialLogQueueIsMutable();
        this.initialLogQueue_.add(od20Var);
    }

    private void addOngoingLogQueue(od20 od20Var) {
        od20Var.getClass();
        ensureOngoingLogQueueIsMutable();
        this.ongoingLogQueue_.add(od20Var);
    }

    private void clearClientId() {
        this.bitField0_ &= -3;
        this.clientId_ = getDefaultInstance().getClientId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInitialLogQueue() {
        this.initialLogQueue_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOngoingLogQueue() {
        this.ongoingLogQueue_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearSessionId() {
        this.bitField0_ &= -2;
        this.sessionId_ = 0;
    }

    private void clearStability() {
        this.stability_ = null;
        this.bitField0_ &= -5;
    }

    private void ensureInitialLogQueueIsMutable() {
        oqw oqwVar = this.initialLogQueue_;
        if (((p9) oqwVar).a) {
            return;
        }
        this.initialLogQueue_ = GeneratedMessageLite.mutableCopy(oqwVar);
    }

    private void ensureOngoingLogQueueIsMutable() {
        oqw oqwVar = this.ongoingLogQueue_;
        if (((p9) oqwVar).a) {
            return;
        }
        this.ongoingLogQueue_ = GeneratedMessageLite.mutableCopy(oqwVar);
    }

    public static rd20 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeStability(td20 td20Var) {
        td20Var.getClass();
        td20 td20Var2 = this.stability_;
        if (td20Var2 == null || td20Var2 == td20.getDefaultInstance()) {
            this.stability_ = td20Var;
        } else {
            this.stability_ = (td20) ((sd20) td20.newBuilder(this.stability_).mergeFrom((GeneratedMessageLite) td20Var)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    public static qd20 newBuilder() {
        return (qd20) DEFAULT_INSTANCE.createBuilder();
    }

    public static rd20 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (rd20) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static rd20 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (rd20) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static of90 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeInitialLogQueue(int i) {
        ensureInitialLogQueueIsMutable();
        this.initialLogQueue_.remove(i);
    }

    private void removeOngoingLogQueue(int i) {
        ensureOngoingLogQueueIsMutable();
        this.ongoingLogQueue_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientId(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.clientId_ = str;
    }

    private void setClientIdBytes(ByteString byteString) {
        this.clientId_ = byteString.r();
        this.bitField0_ |= 2;
    }

    private void setInitialLogQueue(int i, od20 od20Var) {
        od20Var.getClass();
        ensureInitialLogQueueIsMutable();
        this.initialLogQueue_.set(i, od20Var);
    }

    private void setOngoingLogQueue(int i, od20 od20Var) {
        od20Var.getClass();
        ensureOngoingLogQueueIsMutable();
        this.ongoingLogQueue_.set(i, od20Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(int i) {
        this.bitField0_ |= 1;
        this.sessionId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStability(td20 td20Var) {
        td20Var.getClass();
        this.stability_ = td20Var;
        this.bitField0_ |= 4;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        of90 of90Var;
        switch (md20.a[methodToInvoke.ordinal()]) {
            case 1:
                return new rd20();
            case 2:
                return new qd20(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဈ\u0001\u0005ဉ\u0002", new Object[]{"bitField0_", "sessionId_", "initialLogQueue_", od20.class, "ongoingLogQueue_", od20.class, "clientId_", "stability_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                of90 of90Var2 = PARSER;
                if (of90Var2 != null) {
                    return of90Var2;
                }
                synchronized (rd20.class) {
                    try {
                        of90Var = PARSER;
                        if (of90Var == null) {
                            of90Var = new oxs(DEFAULT_INSTANCE);
                            PARSER = of90Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return of90Var;
            case 6:
                return (byte) 1;
            default:
                w511.u();
            case 7:
                return null;
        }
    }

    public String getClientId() {
        return this.clientId_;
    }

    public ByteString getClientIdBytes() {
        return ByteString.g(this.clientId_);
    }

    public od20 getInitialLogQueue(int i) {
        return (od20) this.initialLogQueue_.get(i);
    }

    public int getInitialLogQueueCount() {
        return this.initialLogQueue_.size();
    }

    public List<od20> getInitialLogQueueList() {
        return this.initialLogQueue_;
    }

    public pd20 getInitialLogQueueOrBuilder(int i) {
        return (pd20) this.initialLogQueue_.get(i);
    }

    public List<? extends pd20> getInitialLogQueueOrBuilderList() {
        return this.initialLogQueue_;
    }

    public od20 getOngoingLogQueue(int i) {
        return (od20) this.ongoingLogQueue_.get(i);
    }

    public int getOngoingLogQueueCount() {
        return this.ongoingLogQueue_.size();
    }

    public List<od20> getOngoingLogQueueList() {
        return this.ongoingLogQueue_;
    }

    public pd20 getOngoingLogQueueOrBuilder(int i) {
        return (pd20) this.ongoingLogQueue_.get(i);
    }

    public List<? extends pd20> getOngoingLogQueueOrBuilderList() {
        return this.ongoingLogQueue_;
    }

    public int getSessionId() {
        return this.sessionId_;
    }

    public td20 getStability() {
        td20 td20Var = this.stability_;
        return td20Var == null ? td20.getDefaultInstance() : td20Var;
    }

    public boolean hasClientId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSessionId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasStability() {
        return (this.bitField0_ & 4) != 0;
    }

    public static qd20 newBuilder(rd20 rd20Var) {
        return (qd20) DEFAULT_INSTANCE.createBuilder(rd20Var);
    }

    public static rd20 parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (rd20) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static rd20 parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
        return (rd20) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
    }

    public static rd20 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (rd20) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static rd20 parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
        return (rd20) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
    }

    private void addInitialLogQueue(int i, od20 od20Var) {
        od20Var.getClass();
        ensureInitialLogQueueIsMutable();
        this.initialLogQueue_.add(i, od20Var);
    }

    private void addOngoingLogQueue(int i, od20 od20Var) {
        od20Var.getClass();
        ensureOngoingLogQueueIsMutable();
        this.ongoingLogQueue_.add(i, od20Var);
    }

    public static rd20 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (rd20) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static rd20 parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
        return (rd20) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
    }

    public static rd20 parseFrom(InputStream inputStream) throws IOException {
        return (rd20) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static rd20 parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (rd20) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static rd20 parseFrom(eac eacVar) throws IOException {
        return (rd20) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
    }

    public static rd20 parseFrom(eac eacVar, pyo pyoVar) throws IOException {
        return (rd20) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
    }
}

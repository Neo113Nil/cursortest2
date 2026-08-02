package com.yandex.pulse.metrics;

import defpackage.a5i;
import defpackage.b5i;
import defpackage.bye;
import defpackage.c5i;
import defpackage.c8;
import defpackage.j3d;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.nn3;
import defpackage.o3d;
import defpackage.qr4;
import defpackage.rse;
import defpackage.u8;
import defpackage.xzh;
import defpackage.z0c;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes5.dex */
public final class l extends o3d implements xzh {
    public static final int CLIENT_ID_FIELD_NUMBER = 4;
    private static final l DEFAULT_INSTANCE;
    public static final int INITIAL_LOG_QUEUE_FIELD_NUMBER = 2;
    public static final int ONGOING_LOG_QUEUE_FIELD_NUMBER = 3;
    private static volatile n7k PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int STABILITY_FIELD_NUMBER = 5;
    private int bitField0_;
    private int sessionId_;
    private m stability_;
    private rse initialLogQueue_ = o3d.emptyProtobufList();
    private rse ongoingLogQueue_ = o3d.emptyProtobufList();
    private String clientId_ = "";

    static {
        l lVar = new l();
        DEFAULT_INSTANCE = lVar;
        o3d.registerDefaultInstance(l.class, lVar);
    }

    private l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllInitialLogQueue(Iterable<? extends k> iterable) {
        ensureInitialLogQueueIsMutable();
        c8.addAll(iterable, this.initialLogQueue_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOngoingLogQueue(Iterable<? extends k> iterable) {
        ensureOngoingLogQueueIsMutable();
        c8.addAll(iterable, this.ongoingLogQueue_);
    }

    private void addInitialLogQueue(k kVar) {
        kVar.getClass();
        ensureInitialLogQueueIsMutable();
        this.initialLogQueue_.add(kVar);
    }

    private void addOngoingLogQueue(k kVar) {
        kVar.getClass();
        ensureOngoingLogQueueIsMutable();
        this.ongoingLogQueue_.add(kVar);
    }

    private void clearClientId() {
        this.bitField0_ &= -3;
        this.clientId_ = getDefaultInstance().getClientId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInitialLogQueue() {
        this.initialLogQueue_ = o3d.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOngoingLogQueue() {
        this.ongoingLogQueue_ = o3d.emptyProtobufList();
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
        rse rseVar = this.initialLogQueue_;
        if (((u8) rseVar).a) {
            return;
        }
        this.initialLogQueue_ = o3d.mutableCopy(rseVar);
    }

    private void ensureOngoingLogQueueIsMutable() {
        rse rseVar = this.ongoingLogQueue_;
        if (((u8) rseVar).a) {
            return;
        }
        this.ongoingLogQueue_ = o3d.mutableCopy(rseVar);
    }

    public static l getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeStability(m mVar) {
        mVar.getClass();
        m mVar2 = this.stability_;
        if (mVar2 == null || mVar2 == m.getDefaultInstance()) {
            this.stability_ = mVar;
        } else {
            c5i newBuilder = m.newBuilder(this.stability_);
            newBuilder.e(mVar);
            this.stability_ = (m) newBuilder.c();
        }
        this.bitField0_ |= 4;
    }

    public static b5i newBuilder() {
        return (b5i) DEFAULT_INSTANCE.createBuilder();
    }

    public static l parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (l) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static l parseFrom(ByteBuffer byteBuffer) throws bye {
        return (l) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static n7k parser() {
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

    private void setClientIdBytes(nn3 nn3Var) {
        this.clientId_ = nn3Var.y();
        this.bitField0_ |= 2;
    }

    private void setInitialLogQueue(int i, k kVar) {
        kVar.getClass();
        ensureInitialLogQueueIsMutable();
        this.initialLogQueue_.set(i, kVar);
    }

    private void setOngoingLogQueue(int i, k kVar) {
        kVar.getClass();
        ensureOngoingLogQueueIsMutable();
        this.ongoingLogQueue_.set(i, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(int i) {
        this.bitField0_ |= 1;
        this.sessionId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStability(m mVar) {
        mVar.getClass();
        this.stability_ = mVar;
        this.bitField0_ |= 4;
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        switch (n3dVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဈ\u0001\u0005ဉ\u0002", new Object[]{"bitField0_", "sessionId_", "initialLogQueue_", k.class, "ongoingLogQueue_", k.class, "clientId_", "stability_"});
            case 3:
                return new l();
            case 4:
                return new b5i(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                n7k n7kVar2 = PARSER;
                if (n7kVar2 != null) {
                    return n7kVar2;
                }
                synchronized (l.class) {
                    try {
                        n7kVar = PARSER;
                        if (n7kVar == null) {
                            n7kVar = new j3d(DEFAULT_INSTANCE);
                            PARSER = n7kVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return n7kVar;
            default:
                androidx.core.app.q.i();
                return null;
        }
    }

    public String getClientId() {
        return this.clientId_;
    }

    public nn3 getClientIdBytes() {
        return nn3.o(this.clientId_);
    }

    public k getInitialLogQueue(int i) {
        return (k) this.initialLogQueue_.get(i);
    }

    public int getInitialLogQueueCount() {
        return this.initialLogQueue_.size();
    }

    public List<k> getInitialLogQueueList() {
        return this.initialLogQueue_;
    }

    public a5i getInitialLogQueueOrBuilder(int i) {
        return (a5i) this.initialLogQueue_.get(i);
    }

    public List<? extends a5i> getInitialLogQueueOrBuilderList() {
        return this.initialLogQueue_;
    }

    public k getOngoingLogQueue(int i) {
        return (k) this.ongoingLogQueue_.get(i);
    }

    public int getOngoingLogQueueCount() {
        return this.ongoingLogQueue_.size();
    }

    public List<k> getOngoingLogQueueList() {
        return this.ongoingLogQueue_;
    }

    public a5i getOngoingLogQueueOrBuilder(int i) {
        return (a5i) this.ongoingLogQueue_.get(i);
    }

    public List<? extends a5i> getOngoingLogQueueOrBuilderList() {
        return this.ongoingLogQueue_;
    }

    public int getSessionId() {
        return this.sessionId_;
    }

    public m getStability() {
        m mVar = this.stability_;
        return mVar == null ? m.getDefaultInstance() : mVar;
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

    public static b5i newBuilder(l lVar) {
        return (b5i) DEFAULT_INSTANCE.createBuilder(lVar);
    }

    public static l parseDelimitedFrom(InputStream inputStream, z0c z0cVar) throws IOException {
        return (l) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
    }

    public static l parseFrom(ByteBuffer byteBuffer, z0c z0cVar) throws bye {
        return (l) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer, z0cVar);
    }

    public static l parseFrom(nn3 nn3Var) throws bye {
        return (l) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var);
    }

    public static l parseFrom(nn3 nn3Var, z0c z0cVar) throws bye {
        return (l) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var, z0cVar);
    }

    private void addInitialLogQueue(int i, k kVar) {
        kVar.getClass();
        ensureInitialLogQueueIsMutable();
        this.initialLogQueue_.add(i, kVar);
    }

    private void addOngoingLogQueue(int i, k kVar) {
        kVar.getClass();
        ensureOngoingLogQueueIsMutable();
        this.ongoingLogQueue_.add(i, kVar);
    }

    public static l parseFrom(byte[] bArr) throws bye {
        return (l) o3d.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static l parseFrom(byte[] bArr, z0c z0cVar) throws bye {
        return (l) o3d.parseFrom(DEFAULT_INSTANCE, bArr, z0cVar);
    }

    public static l parseFrom(InputStream inputStream) throws IOException {
        return (l) o3d.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static l parseFrom(InputStream inputStream, z0c z0cVar) throws IOException {
        return (l) o3d.parseFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
    }

    public static l parseFrom(qr4 qr4Var) throws IOException {
        return (l) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var);
    }

    public static l parseFrom(qr4 qr4Var, z0c z0cVar) throws IOException {
        return (l) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var, z0cVar);
    }
}

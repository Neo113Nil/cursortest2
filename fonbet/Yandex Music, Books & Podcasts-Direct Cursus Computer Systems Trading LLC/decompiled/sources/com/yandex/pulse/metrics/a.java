package com.yandex.pulse.metrics;

import defpackage.bye;
import defpackage.c8;
import defpackage.j3d;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.nn3;
import defpackage.o3d;
import defpackage.pk4;
import defpackage.qr4;
import defpackage.rse;
import defpackage.rxf;
import defpackage.u8;
import defpackage.xzh;
import defpackage.z0c;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes5.dex */
public final class a extends o3d implements xzh {
    public static final int CLIENT_ID_FIELD_NUMBER = 1;
    private static final a DEFAULT_INSTANCE;
    public static final int HISTOGRAM_EVENT_FIELD_NUMBER = 6;
    public static final int LIBRARY_METRICS_FIELD_NUMBER = 1000;
    private static volatile n7k PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 2;
    public static final int SYSTEM_PROFILE_FIELD_NUMBER = 3;
    private int bitField0_;
    private long clientId_;
    private rse histogramEvent_ = o3d.emptyProtobufList();
    private rse libraryMetrics_ = o3d.emptyProtobufList();
    private int sessionId_;
    private o systemProfile_;

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        o3d.registerDefaultInstance(a.class, aVar);
    }

    private a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllHistogramEvent(Iterable<? extends c> iterable) {
        ensureHistogramEventIsMutable();
        c8.addAll(iterable, this.histogramEvent_);
    }

    private void addAllLibraryMetrics(Iterable<? extends f> iterable) {
        ensureLibraryMetricsIsMutable();
        c8.addAll(iterable, this.libraryMetrics_);
    }

    private void addHistogramEvent(c cVar) {
        cVar.getClass();
        ensureHistogramEventIsMutable();
        this.histogramEvent_.add(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLibraryMetrics(f fVar) {
        fVar.getClass();
        ensureLibraryMetricsIsMutable();
        this.libraryMetrics_.add(fVar);
    }

    private void clearClientId() {
        this.bitField0_ &= -2;
        this.clientId_ = 0L;
    }

    private void clearHistogramEvent() {
        this.histogramEvent_ = o3d.emptyProtobufList();
    }

    private void clearLibraryMetrics() {
        this.libraryMetrics_ = o3d.emptyProtobufList();
    }

    private void clearSessionId() {
        this.bitField0_ &= -3;
        this.sessionId_ = 0;
    }

    private void clearSystemProfile() {
        this.systemProfile_ = null;
        this.bitField0_ &= -5;
    }

    private void ensureHistogramEventIsMutable() {
        rse rseVar = this.histogramEvent_;
        if (((u8) rseVar).a) {
            return;
        }
        this.histogramEvent_ = o3d.mutableCopy(rseVar);
    }

    private void ensureLibraryMetricsIsMutable() {
        rse rseVar = this.libraryMetrics_;
        if (((u8) rseVar).a) {
            return;
        }
        this.libraryMetrics_ = o3d.mutableCopy(rseVar);
    }

    public static a getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeSystemProfile(o oVar) {
        oVar.getClass();
        o oVar2 = this.systemProfile_;
        if (oVar2 == null || oVar2 == o.getDefaultInstance()) {
            this.systemProfile_ = oVar;
        } else {
            p newBuilder = o.newBuilder(this.systemProfile_);
            newBuilder.e(oVar);
            this.systemProfile_ = (o) newBuilder.c();
        }
        this.bitField0_ |= 4;
    }

    public static pk4 newBuilder() {
        return (pk4) DEFAULT_INSTANCE.createBuilder();
    }

    public static a parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (a) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static a parseFrom(ByteBuffer byteBuffer) throws bye {
        return (a) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static n7k parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeHistogramEvent(int i) {
        ensureHistogramEventIsMutable();
        this.histogramEvent_.remove(i);
    }

    private void removeLibraryMetrics(int i) {
        ensureLibraryMetricsIsMutable();
        this.libraryMetrics_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientId(long j) {
        this.bitField0_ |= 1;
        this.clientId_ = j;
    }

    private void setHistogramEvent(int i, c cVar) {
        cVar.getClass();
        ensureHistogramEventIsMutable();
        this.histogramEvent_.set(i, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLibraryMetrics(int i, f fVar) {
        fVar.getClass();
        ensureLibraryMetricsIsMutable();
        this.libraryMetrics_.set(i, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(int i) {
        this.bitField0_ |= 2;
        this.sessionId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemProfile(o oVar) {
        oVar.getClass();
        this.systemProfile_ = oVar;
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
                return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001Ϩ\u0005\u0000\u0002\u0000\u0001စ\u0000\u0002င\u0001\u0003ဉ\u0002\u0006\u001bϨ\u001b", new Object[]{"bitField0_", "clientId_", "sessionId_", "systemProfile_", "histogramEvent_", c.class, "libraryMetrics_", f.class});
            case 3:
                return new a();
            case 4:
                return new pk4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                n7k n7kVar2 = PARSER;
                if (n7kVar2 != null) {
                    return n7kVar2;
                }
                synchronized (a.class) {
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

    public long getClientId() {
        return this.clientId_;
    }

    public c getHistogramEvent(int i) {
        return (c) this.histogramEvent_.get(i);
    }

    public int getHistogramEventCount() {
        return this.histogramEvent_.size();
    }

    public List<c> getHistogramEventList() {
        return this.histogramEvent_;
    }

    public e getHistogramEventOrBuilder(int i) {
        return (e) this.histogramEvent_.get(i);
    }

    public List<? extends e> getHistogramEventOrBuilderList() {
        return this.histogramEvent_;
    }

    public f getLibraryMetrics(int i) {
        return (f) this.libraryMetrics_.get(i);
    }

    public int getLibraryMetricsCount() {
        return this.libraryMetrics_.size();
    }

    public List<f> getLibraryMetricsList() {
        return this.libraryMetrics_;
    }

    public rxf getLibraryMetricsOrBuilder(int i) {
        return (rxf) this.libraryMetrics_.get(i);
    }

    public List<? extends rxf> getLibraryMetricsOrBuilderList() {
        return this.libraryMetrics_;
    }

    public int getSessionId() {
        return this.sessionId_;
    }

    public o getSystemProfile() {
        o oVar = this.systemProfile_;
        return oVar == null ? o.getDefaultInstance() : oVar;
    }

    public boolean hasClientId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSessionId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSystemProfile() {
        return (this.bitField0_ & 4) != 0;
    }

    public static pk4 newBuilder(a aVar) {
        return (pk4) DEFAULT_INSTANCE.createBuilder(aVar);
    }

    public static a parseDelimitedFrom(InputStream inputStream, z0c z0cVar) throws IOException {
        return (a) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
    }

    public static a parseFrom(ByteBuffer byteBuffer, z0c z0cVar) throws bye {
        return (a) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer, z0cVar);
    }

    public static a parseFrom(nn3 nn3Var) throws bye {
        return (a) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var);
    }

    public static a parseFrom(nn3 nn3Var, z0c z0cVar) throws bye {
        return (a) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var, z0cVar);
    }

    private void addHistogramEvent(int i, c cVar) {
        cVar.getClass();
        ensureHistogramEventIsMutable();
        this.histogramEvent_.add(i, cVar);
    }

    private void addLibraryMetrics(int i, f fVar) {
        fVar.getClass();
        ensureLibraryMetricsIsMutable();
        this.libraryMetrics_.add(i, fVar);
    }

    public static a parseFrom(byte[] bArr) throws bye {
        return (a) o3d.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static a parseFrom(byte[] bArr, z0c z0cVar) throws bye {
        return (a) o3d.parseFrom(DEFAULT_INSTANCE, bArr, z0cVar);
    }

    public static a parseFrom(InputStream inputStream) throws IOException {
        return (a) o3d.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static a parseFrom(InputStream inputStream, z0c z0cVar) throws IOException {
        return (a) o3d.parseFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
    }

    public static a parseFrom(qr4 qr4Var) throws IOException {
        return (a) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var);
    }

    public static a parseFrom(qr4 qr4Var, z0c z0cVar) throws IOException {
        return (a) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var, z0cVar);
    }
}

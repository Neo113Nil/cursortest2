package com.yandex.pulse.metrics;

import defpackage.bye;
import defpackage.c8;
import defpackage.j3d;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.nn3;
import defpackage.o3d;
import defpackage.qr4;
import defpackage.qxf;
import defpackage.rse;
import defpackage.rxf;
import defpackage.u8;
import defpackage.z0c;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes5.dex */
public final class f extends o3d implements rxf {
    private static final f DEFAULT_INSTANCE;
    public static final int HISTOGRAM_EVENT_FIELD_NUMBER = 2;
    public static final int LIBRARY_PROFILE_FIELD_NUMBER = 1;
    private static volatile n7k PARSER;
    private int bitField0_;
    private rse histogramEvent_ = o3d.emptyProtobufList();
    private i libraryProfile_;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        o3d.registerDefaultInstance(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllHistogramEvent(Iterable<? extends c> iterable) {
        ensureHistogramEventIsMutable();
        c8.addAll(iterable, this.histogramEvent_);
    }

    private void addHistogramEvent(c cVar) {
        cVar.getClass();
        ensureHistogramEventIsMutable();
        this.histogramEvent_.add(cVar);
    }

    private void clearHistogramEvent() {
        this.histogramEvent_ = o3d.emptyProtobufList();
    }

    private void clearLibraryProfile() {
        this.libraryProfile_ = null;
        this.bitField0_ &= -2;
    }

    private void ensureHistogramEventIsMutable() {
        rse rseVar = this.histogramEvent_;
        if (((u8) rseVar).a) {
            return;
        }
        this.histogramEvent_ = o3d.mutableCopy(rseVar);
    }

    public static f getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeLibraryProfile(i iVar) {
        iVar.getClass();
        i iVar2 = this.libraryProfile_;
        if (iVar2 == null || iVar2 == i.getDefaultInstance()) {
            this.libraryProfile_ = iVar;
        } else {
            g newBuilder = i.newBuilder(this.libraryProfile_);
            newBuilder.e(iVar);
            this.libraryProfile_ = (i) newBuilder.c();
        }
        this.bitField0_ |= 1;
    }

    public static qxf newBuilder() {
        return (qxf) DEFAULT_INSTANCE.createBuilder();
    }

    public static f parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (f) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static f parseFrom(ByteBuffer byteBuffer) throws bye {
        return (f) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static n7k parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeHistogramEvent(int i) {
        ensureHistogramEventIsMutable();
        this.histogramEvent_.remove(i);
    }

    private void setHistogramEvent(int i, c cVar) {
        cVar.getClass();
        ensureHistogramEventIsMutable();
        this.histogramEvent_.set(i, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLibraryProfile(i iVar) {
        iVar.getClass();
        this.libraryProfile_ = iVar;
        this.bitField0_ |= 1;
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
                return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "libraryProfile_", "histogramEvent_", c.class});
            case 3:
                return new f();
            case 4:
                return new qxf(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                n7k n7kVar2 = PARSER;
                if (n7kVar2 != null) {
                    return n7kVar2;
                }
                synchronized (f.class) {
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

    public i getLibraryProfile() {
        i iVar = this.libraryProfile_;
        return iVar == null ? i.getDefaultInstance() : iVar;
    }

    public boolean hasLibraryProfile() {
        return (this.bitField0_ & 1) != 0;
    }

    public static qxf newBuilder(f fVar) {
        return (qxf) DEFAULT_INSTANCE.createBuilder(fVar);
    }

    public static f parseDelimitedFrom(InputStream inputStream, z0c z0cVar) throws IOException {
        return (f) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
    }

    public static f parseFrom(ByteBuffer byteBuffer, z0c z0cVar) throws bye {
        return (f) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer, z0cVar);
    }

    public static f parseFrom(nn3 nn3Var) throws bye {
        return (f) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var);
    }

    public static f parseFrom(nn3 nn3Var, z0c z0cVar) throws bye {
        return (f) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var, z0cVar);
    }

    private void addHistogramEvent(int i, c cVar) {
        cVar.getClass();
        ensureHistogramEventIsMutable();
        this.histogramEvent_.add(i, cVar);
    }

    public static f parseFrom(byte[] bArr) throws bye {
        return (f) o3d.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static f parseFrom(byte[] bArr, z0c z0cVar) throws bye {
        return (f) o3d.parseFrom(DEFAULT_INSTANCE, bArr, z0cVar);
    }

    public static f parseFrom(InputStream inputStream) throws IOException {
        return (f) o3d.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static f parseFrom(InputStream inputStream, z0c z0cVar) throws IOException {
        return (f) o3d.parseFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
    }

    public static f parseFrom(qr4 qr4Var) throws IOException {
        return (f) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var);
    }

    public static f parseFrom(qr4 qr4Var, z0c z0cVar) throws IOException {
        return (f) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var, z0cVar);
    }
}

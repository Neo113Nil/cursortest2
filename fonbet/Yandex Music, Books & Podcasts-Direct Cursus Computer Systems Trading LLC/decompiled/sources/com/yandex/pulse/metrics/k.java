package com.yandex.pulse.metrics;

import defpackage.a5i;
import defpackage.bye;
import defpackage.j3d;
import defpackage.kn3;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.nn3;
import defpackage.o3d;
import defpackage.qr4;
import defpackage.z0c;
import defpackage.z4i;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class k extends o3d implements a5i {
    public static final int COMPRESSED_LOG_DATA_FIELD_NUMBER = 1;
    private static final k DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 2;
    private static volatile n7k PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 3;
    private int bitField0_;
    private nn3 compressedLogData_;
    private nn3 hash_;
    private long timestamp_;

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        o3d.registerDefaultInstance(k.class, kVar);
    }

    private k() {
        kn3 kn3Var = nn3.b;
        this.compressedLogData_ = kn3Var;
        this.hash_ = kn3Var;
    }

    private void clearCompressedLogData() {
        this.bitField0_ &= -2;
        this.compressedLogData_ = getDefaultInstance().getCompressedLogData();
    }

    private void clearHash() {
        this.bitField0_ &= -3;
        this.hash_ = getDefaultInstance().getHash();
    }

    private void clearTimestamp() {
        this.bitField0_ &= -5;
        this.timestamp_ = 0L;
    }

    public static k getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static z4i newBuilder() {
        return (z4i) DEFAULT_INSTANCE.createBuilder();
    }

    public static k parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (k) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static k parseFrom(ByteBuffer byteBuffer) throws bye {
        return (k) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static n7k parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCompressedLogData(nn3 nn3Var) {
        nn3Var.getClass();
        this.bitField0_ |= 1;
        this.compressedLogData_ = nn3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHash(nn3 nn3Var) {
        nn3Var.getClass();
        this.bitField0_ |= 2;
        this.hash_ = nn3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(long j) {
        this.bitField0_ |= 4;
        this.timestamp_ = j;
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
                return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003စ\u0002", new Object[]{"bitField0_", "compressedLogData_", "hash_", "timestamp_"});
            case 3:
                return new k();
            case 4:
                return new z4i(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                n7k n7kVar2 = PARSER;
                if (n7kVar2 != null) {
                    return n7kVar2;
                }
                synchronized (k.class) {
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

    public nn3 getCompressedLogData() {
        return this.compressedLogData_;
    }

    public nn3 getHash() {
        return this.hash_;
    }

    public long getTimestamp() {
        return this.timestamp_;
    }

    public boolean hasCompressedLogData() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasHash() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTimestamp() {
        return (this.bitField0_ & 4) != 0;
    }

    public static z4i newBuilder(k kVar) {
        return (z4i) DEFAULT_INSTANCE.createBuilder(kVar);
    }

    public static k parseDelimitedFrom(InputStream inputStream, z0c z0cVar) throws IOException {
        return (k) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
    }

    public static k parseFrom(ByteBuffer byteBuffer, z0c z0cVar) throws bye {
        return (k) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer, z0cVar);
    }

    public static k parseFrom(nn3 nn3Var) throws bye {
        return (k) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var);
    }

    public static k parseFrom(nn3 nn3Var, z0c z0cVar) throws bye {
        return (k) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var, z0cVar);
    }

    public static k parseFrom(byte[] bArr) throws bye {
        return (k) o3d.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static k parseFrom(byte[] bArr, z0c z0cVar) throws bye {
        return (k) o3d.parseFrom(DEFAULT_INSTANCE, bArr, z0cVar);
    }

    public static k parseFrom(InputStream inputStream) throws IOException {
        return (k) o3d.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static k parseFrom(InputStream inputStream, z0c z0cVar) throws IOException {
        return (k) o3d.parseFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
    }

    public static k parseFrom(qr4 qr4Var) throws IOException {
        return (k) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var);
    }

    public static k parseFrom(qr4 qr4Var, z0c z0cVar) throws IOException {
        return (k) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var, z0cVar);
    }
}

package com.yandex.pulse.metrics;

import defpackage.bye;
import defpackage.c8;
import defpackage.j3d;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.nn3;
import defpackage.o3d;
import defpackage.qr4;
import defpackage.rse;
import defpackage.syd;
import defpackage.u8;
import defpackage.z0c;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes5.dex */
public final class c extends o3d implements e {
    public static final int BUCKET_FIELD_NUMBER = 3;
    private static final c DEFAULT_INSTANCE;
    public static final int FINITE_SUM_FIELD_NUMBER = 1001;
    public static final int NAME_FIELD_NUMBER = 1000;
    public static final int NAME_HASH_FIELD_NUMBER = 1;
    private static volatile n7k PARSER = null;
    public static final int SUM_FIELD_NUMBER = 2;
    private int bitField0_;
    private long finiteSum_;
    private long nameHash_;
    private long sum_;
    private rse bucket_ = o3d.emptyProtobufList();
    private String name_ = "";

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        o3d.registerDefaultInstance(c.class, cVar);
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBucket(Iterable<? extends a> iterable) {
        ensureBucketIsMutable();
        c8.addAll(iterable, this.bucket_);
    }

    private void addBucket(a aVar) {
        aVar.getClass();
        ensureBucketIsMutable();
        this.bucket_.add(aVar);
    }

    private void clearBucket() {
        this.bucket_ = o3d.emptyProtobufList();
    }

    private void clearFiniteSum() {
        this.bitField0_ &= -9;
        this.finiteSum_ = 0L;
    }

    private void clearName() {
        this.bitField0_ &= -5;
        this.name_ = getDefaultInstance().getName();
    }

    private void clearNameHash() {
        this.bitField0_ &= -2;
        this.nameHash_ = 0L;
    }

    private void clearSum() {
        this.bitField0_ &= -3;
        this.sum_ = 0L;
    }

    private void ensureBucketIsMutable() {
        rse rseVar = this.bucket_;
        if (((u8) rseVar).a) {
            return;
        }
        this.bucket_ = o3d.mutableCopy(rseVar);
    }

    public static c getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static d newBuilder() {
        return (d) DEFAULT_INSTANCE.createBuilder();
    }

    public static c parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (c) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static c parseFrom(ByteBuffer byteBuffer) throws bye {
        return (c) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static n7k parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeBucket(int i) {
        ensureBucketIsMutable();
        this.bucket_.remove(i);
    }

    private void setBucket(int i, a aVar) {
        aVar.getClass();
        ensureBucketIsMutable();
        this.bucket_.set(i, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFiniteSum(long j) {
        this.bitField0_ |= 8;
        this.finiteSum_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.name_ = str;
    }

    private void setNameBytes(nn3 nn3Var) {
        this.name_ = nn3Var.y();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameHash(long j) {
        this.bitField0_ |= 1;
        this.nameHash_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSum(long j) {
        this.bitField0_ |= 2;
        this.sum_ = j;
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
                return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001ϩ\u0005\u0000\u0001\u0000\u0001စ\u0000\u0002ဂ\u0001\u0003\u001bϨဈ\u0002ϩဂ\u0003", new Object[]{"bitField0_", "nameHash_", "sum_", "bucket_", a.class, "name_", "finiteSum_"});
            case 3:
                return new c();
            case 4:
                return new d(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                n7k n7kVar2 = PARSER;
                if (n7kVar2 != null) {
                    return n7kVar2;
                }
                synchronized (c.class) {
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

    public a getBucket(int i) {
        return (a) this.bucket_.get(i);
    }

    public int getBucketCount() {
        return this.bucket_.size();
    }

    public List<a> getBucketList() {
        return this.bucket_;
    }

    public syd getBucketOrBuilder(int i) {
        return (syd) this.bucket_.get(i);
    }

    public List<? extends syd> getBucketOrBuilderList() {
        return this.bucket_;
    }

    public long getFiniteSum() {
        return this.finiteSum_;
    }

    public String getName() {
        return this.name_;
    }

    public nn3 getNameBytes() {
        return nn3.o(this.name_);
    }

    public long getNameHash() {
        return this.nameHash_;
    }

    public long getSum() {
        return this.sum_;
    }

    public boolean hasFiniteSum() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasNameHash() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSum() {
        return (this.bitField0_ & 2) != 0;
    }

    public static final class a extends o3d implements syd {
        public static final int COUNT_FIELD_NUMBER = 4;
        private static final a DEFAULT_INSTANCE;
        public static final int MAX_FIELD_NUMBER = 2;
        public static final int MIN_FIELD_NUMBER = 1;
        private static volatile n7k PARSER;
        private int bitField0_;
        private long count_ = 1;
        private long max_;
        private long min_;

        static {
            a aVar = new a();
            DEFAULT_INSTANCE = aVar;
            o3d.registerDefaultInstance(a.class, aVar);
        }

        private a() {
        }

        private void clearCount() {
            this.bitField0_ &= -5;
            this.count_ = 1L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMax() {
            this.bitField0_ &= -3;
            this.max_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMin() {
            this.bitField0_ &= -2;
            this.min_ = 0L;
        }

        public static a getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static b newBuilder() {
            return (b) DEFAULT_INSTANCE.createBuilder();
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

        /* JADX INFO: Access modifiers changed from: private */
        public void setCount(long j) {
            this.bitField0_ |= 4;
            this.count_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMax(long j) {
            this.bitField0_ |= 2;
            this.max_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMin(long j) {
            this.bitField0_ |= 1;
            this.min_ = j;
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
                    return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0004ဂ\u0002", new Object[]{"bitField0_", "min_", "max_", "count_"});
                case 3:
                    return new a();
                case 4:
                    return new b(DEFAULT_INSTANCE);
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

        public long getCount() {
            return this.count_;
        }

        public long getMax() {
            return this.max_;
        }

        public long getMin() {
            return this.min_;
        }

        public boolean hasCount() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasMax() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasMin() {
            return (this.bitField0_ & 1) != 0;
        }

        public static b newBuilder(a aVar) {
            return (b) DEFAULT_INSTANCE.createBuilder(aVar);
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

    public static d newBuilder(c cVar) {
        return (d) DEFAULT_INSTANCE.createBuilder(cVar);
    }

    public static c parseDelimitedFrom(InputStream inputStream, z0c z0cVar) throws IOException {
        return (c) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
    }

    public static c parseFrom(ByteBuffer byteBuffer, z0c z0cVar) throws bye {
        return (c) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer, z0cVar);
    }

    public static c parseFrom(nn3 nn3Var) throws bye {
        return (c) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var);
    }

    public static c parseFrom(nn3 nn3Var, z0c z0cVar) throws bye {
        return (c) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var, z0cVar);
    }

    private void addBucket(int i, a aVar) {
        aVar.getClass();
        ensureBucketIsMutable();
        this.bucket_.add(i, aVar);
    }

    public static c parseFrom(byte[] bArr) throws bye {
        return (c) o3d.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static c parseFrom(byte[] bArr, z0c z0cVar) throws bye {
        return (c) o3d.parseFrom(DEFAULT_INSTANCE, bArr, z0cVar);
    }

    public static c parseFrom(InputStream inputStream) throws IOException {
        return (c) o3d.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static c parseFrom(InputStream inputStream, z0c z0cVar) throws IOException {
        return (c) o3d.parseFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
    }

    public static c parseFrom(qr4 qr4Var) throws IOException {
        return (c) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var);
    }

    public static c parseFrom(qr4 qr4Var, z0c z0cVar) throws IOException {
        return (c) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var, z0cVar);
    }
}

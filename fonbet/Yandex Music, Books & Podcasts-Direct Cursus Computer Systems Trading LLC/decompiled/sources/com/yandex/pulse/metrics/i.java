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
import defpackage.sxf;
import defpackage.txf;
import defpackage.u8;
import defpackage.uxf;
import defpackage.xzh;
import defpackage.z0c;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes5.dex */
public final class i extends o3d implements xzh {
    public static final int APP_PACKAGE_NAME_FIELD_NUMBER = 1;
    public static final int APP_VERSION_FIELD_NUMBER = 2;
    public static final int CHANNEL_FIELD_NUMBER = 3;
    private static final i DEFAULT_INSTANCE;
    public static final int FIELD_TRIAL_FIELD_NUMBER = 4;
    private static volatile n7k PARSER = null;
    public static final int YA_FIELD_NUMBER = 5;
    private int bitField0_;
    private int channel_;
    private b ya_;
    private String appPackageName_ = "";
    private String appVersion_ = "";
    private rse fieldTrial_ = o3d.emptyProtobufList();

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        o3d.registerDefaultInstance(i.class, iVar);
    }

    private i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFieldTrial(Iterable<? extends a> iterable) {
        ensureFieldTrialIsMutable();
        c8.addAll(iterable, this.fieldTrial_);
    }

    private void addFieldTrial(a aVar) {
        aVar.getClass();
        ensureFieldTrialIsMutable();
        this.fieldTrial_.add(aVar);
    }

    private void clearAppPackageName() {
        this.bitField0_ &= -2;
        this.appPackageName_ = getDefaultInstance().getAppPackageName();
    }

    private void clearAppVersion() {
        this.bitField0_ &= -3;
        this.appVersion_ = getDefaultInstance().getAppVersion();
    }

    private void clearChannel() {
        this.bitField0_ &= -5;
        this.channel_ = 0;
    }

    private void clearFieldTrial() {
        this.fieldTrial_ = o3d.emptyProtobufList();
    }

    private void clearYa() {
        this.ya_ = null;
        this.bitField0_ &= -9;
    }

    private void ensureFieldTrialIsMutable() {
        rse rseVar = this.fieldTrial_;
        if (((u8) rseVar).a) {
            return;
        }
        this.fieldTrial_ = o3d.mutableCopy(rseVar);
    }

    public static i getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeYa(b bVar) {
        bVar.getClass();
        b bVar2 = this.ya_;
        if (bVar2 == null || bVar2 == b.getDefaultInstance()) {
            this.ya_ = bVar;
        } else {
            j newBuilder = b.newBuilder(this.ya_);
            newBuilder.e(bVar);
            this.ya_ = (b) newBuilder.c();
        }
        this.bitField0_ |= 8;
    }

    public static g newBuilder() {
        return (g) DEFAULT_INSTANCE.createBuilder();
    }

    public static i parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (i) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static i parseFrom(ByteBuffer byteBuffer) throws bye {
        return (i) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static n7k parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeFieldTrial(int i) {
        ensureFieldTrialIsMutable();
        this.fieldTrial_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppPackageName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.appPackageName_ = str;
    }

    private void setAppPackageNameBytes(nn3 nn3Var) {
        this.appPackageName_ = nn3Var.y();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppVersion(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.appVersion_ = str;
    }

    private void setAppVersionBytes(nn3 nn3Var) {
        this.appVersion_ = nn3Var.y();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChannel(txf txfVar) {
        this.channel_ = txfVar.a;
        this.bitField0_ |= 4;
    }

    private void setFieldTrial(int i, a aVar) {
        aVar.getClass();
        ensureFieldTrialIsMutable();
        this.fieldTrial_.set(i, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setYa(b bVar) {
        bVar.getClass();
        this.ya_ = bVar;
        this.bitField0_ |= 8;
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
                return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004\u001b\u0005ဉ\u0003", new Object[]{"bitField0_", "appPackageName_", "appVersion_", "channel_", sxf.b, "fieldTrial_", a.class, "ya_"});
            case 3:
                return new i();
            case 4:
                return new g(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                n7k n7kVar2 = PARSER;
                if (n7kVar2 != null) {
                    return n7kVar2;
                }
                synchronized (i.class) {
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

    public String getAppPackageName() {
        return this.appPackageName_;
    }

    public nn3 getAppPackageNameBytes() {
        return nn3.o(this.appPackageName_);
    }

    public String getAppVersion() {
        return this.appVersion_;
    }

    public nn3 getAppVersionBytes() {
        return nn3.o(this.appVersion_);
    }

    public txf getChannel() {
        txf b2 = txf.b(this.channel_);
        return b2 == null ? txf.CHANNEL_UNKNOWN : b2;
    }

    public a getFieldTrial(int i) {
        return (a) this.fieldTrial_.get(i);
    }

    public int getFieldTrialCount() {
        return this.fieldTrial_.size();
    }

    public List<a> getFieldTrialList() {
        return this.fieldTrial_;
    }

    public uxf getFieldTrialOrBuilder(int i) {
        return (uxf) this.fieldTrial_.get(i);
    }

    public List<? extends uxf> getFieldTrialOrBuilderList() {
        return this.fieldTrial_;
    }

    public b getYa() {
        b bVar = this.ya_;
        return bVar == null ? b.getDefaultInstance() : bVar;
    }

    public boolean hasAppPackageName() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasAppVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasChannel() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasYa() {
        return (this.bitField0_ & 8) != 0;
    }

    public static final class a extends o3d implements uxf {
        private static final a DEFAULT_INSTANCE;
        public static final int GROUP_ID_FIELD_NUMBER = 2;
        public static final int NAME_ID_FIELD_NUMBER = 1;
        private static volatile n7k PARSER;
        private int bitField0_;
        private int groupId_;
        private int nameId_;

        static {
            a aVar = new a();
            DEFAULT_INSTANCE = aVar;
            o3d.registerDefaultInstance(a.class, aVar);
        }

        private a() {
        }

        private void clearGroupId() {
            this.bitField0_ &= -3;
            this.groupId_ = 0;
        }

        private void clearNameId() {
            this.bitField0_ &= -2;
            this.nameId_ = 0;
        }

        public static a getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static h newBuilder() {
            return (h) DEFAULT_INSTANCE.createBuilder();
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
        public void setGroupId(int i) {
            this.bitField0_ |= 2;
            this.groupId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameId(int i) {
            this.bitField0_ |= 1;
            this.nameId_ = i;
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
                    return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဆ\u0000\u0002ဆ\u0001", new Object[]{"bitField0_", "nameId_", "groupId_"});
                case 3:
                    return new a();
                case 4:
                    return new h(DEFAULT_INSTANCE);
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

        public int getGroupId() {
            return this.groupId_;
        }

        public int getNameId() {
            return this.nameId_;
        }

        public boolean hasGroupId() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasNameId() {
            return (this.bitField0_ & 1) != 0;
        }

        public static h newBuilder(a aVar) {
            return (h) DEFAULT_INSTANCE.createBuilder(aVar);
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

    public static final class b extends o3d implements xzh {
        private static final b DEFAULT_INSTANCE;
        public static final int METRICA_API_KEY_FIELD_NUMBER = 1;
        private static volatile n7k PARSER;
        private int bitField0_;
        private String metricaApiKey_ = "";

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            o3d.registerDefaultInstance(b.class, bVar);
        }

        private b() {
        }

        private void clearMetricaApiKey() {
            this.bitField0_ &= -2;
            this.metricaApiKey_ = getDefaultInstance().getMetricaApiKey();
        }

        public static b getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static j newBuilder() {
            return (j) DEFAULT_INSTANCE.createBuilder();
        }

        public static b parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (b) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static b parseFrom(ByteBuffer byteBuffer) throws bye {
            return (b) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static n7k parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMetricaApiKey(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.metricaApiKey_ = str;
        }

        private void setMetricaApiKeyBytes(nn3 nn3Var) {
            this.metricaApiKey_ = nn3Var.y();
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
                    return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "metricaApiKey_"});
                case 3:
                    return new b();
                case 4:
                    return new j(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    n7k n7kVar2 = PARSER;
                    if (n7kVar2 != null) {
                        return n7kVar2;
                    }
                    synchronized (b.class) {
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

        public String getMetricaApiKey() {
            return this.metricaApiKey_;
        }

        public nn3 getMetricaApiKeyBytes() {
            return nn3.o(this.metricaApiKey_);
        }

        public boolean hasMetricaApiKey() {
            return (this.bitField0_ & 1) != 0;
        }

        public static j newBuilder(b bVar) {
            return (j) DEFAULT_INSTANCE.createBuilder(bVar);
        }

        public static b parseDelimitedFrom(InputStream inputStream, z0c z0cVar) throws IOException {
            return (b) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
        }

        public static b parseFrom(ByteBuffer byteBuffer, z0c z0cVar) throws bye {
            return (b) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer, z0cVar);
        }

        public static b parseFrom(nn3 nn3Var) throws bye {
            return (b) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var);
        }

        public static b parseFrom(nn3 nn3Var, z0c z0cVar) throws bye {
            return (b) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var, z0cVar);
        }

        public static b parseFrom(byte[] bArr) throws bye {
            return (b) o3d.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static b parseFrom(byte[] bArr, z0c z0cVar) throws bye {
            return (b) o3d.parseFrom(DEFAULT_INSTANCE, bArr, z0cVar);
        }

        public static b parseFrom(InputStream inputStream) throws IOException {
            return (b) o3d.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static b parseFrom(InputStream inputStream, z0c z0cVar) throws IOException {
            return (b) o3d.parseFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
        }

        public static b parseFrom(qr4 qr4Var) throws IOException {
            return (b) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var);
        }

        public static b parseFrom(qr4 qr4Var, z0c z0cVar) throws IOException {
            return (b) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var, z0cVar);
        }
    }

    public static g newBuilder(i iVar) {
        return (g) DEFAULT_INSTANCE.createBuilder(iVar);
    }

    public static i parseDelimitedFrom(InputStream inputStream, z0c z0cVar) throws IOException {
        return (i) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
    }

    public static i parseFrom(ByteBuffer byteBuffer, z0c z0cVar) throws bye {
        return (i) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer, z0cVar);
    }

    public static i parseFrom(nn3 nn3Var) throws bye {
        return (i) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var);
    }

    public static i parseFrom(nn3 nn3Var, z0c z0cVar) throws bye {
        return (i) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var, z0cVar);
    }

    private void addFieldTrial(int i, a aVar) {
        aVar.getClass();
        ensureFieldTrialIsMutable();
        this.fieldTrial_.add(i, aVar);
    }

    public static i parseFrom(byte[] bArr) throws bye {
        return (i) o3d.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static i parseFrom(byte[] bArr, z0c z0cVar) throws bye {
        return (i) o3d.parseFrom(DEFAULT_INSTANCE, bArr, z0cVar);
    }

    public static i parseFrom(InputStream inputStream) throws IOException {
        return (i) o3d.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static i parseFrom(InputStream inputStream, z0c z0cVar) throws IOException {
        return (i) o3d.parseFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
    }

    public static i parseFrom(qr4 qr4Var) throws IOException {
        return (i) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var);
    }

    public static i parseFrom(qr4 qr4Var, z0c z0cVar) throws IOException {
        return (i) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var, z0cVar);
    }
}

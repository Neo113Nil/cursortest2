package com.yandex.pulse.metrics;

import defpackage.bye;
import defpackage.c5i;
import defpackage.j3d;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.nn3;
import defpackage.o3d;
import defpackage.qr4;
import defpackage.xzh;
import defpackage.z0c;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class m extends o3d implements xzh {
    public static final int AFTER_CRASH_RESUME_COUNT_FIELD_NUMBER = 3;
    public static final int CLEAN_RESUME_COUNT_FIELD_NUMBER = 2;
    private static final m DEFAULT_INSTANCE;
    public static final int IS_EXITED_CLEANLY_FIELD_NUMBER = 1;
    private static volatile n7k PARSER;
    private int afterCrashResumeCount_;
    private int bitField0_;
    private int cleanResumeCount_;
    private boolean isExitedCleanly_;

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        o3d.registerDefaultInstance(m.class, mVar);
    }

    private m() {
    }

    private void clearAfterCrashResumeCount() {
        this.bitField0_ &= -5;
        this.afterCrashResumeCount_ = 0;
    }

    private void clearCleanResumeCount() {
        this.bitField0_ &= -3;
        this.cleanResumeCount_ = 0;
    }

    private void clearIsExitedCleanly() {
        this.bitField0_ &= -2;
        this.isExitedCleanly_ = false;
    }

    public static m getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static c5i newBuilder() {
        return (c5i) DEFAULT_INSTANCE.createBuilder();
    }

    public static m parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (m) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static m parseFrom(ByteBuffer byteBuffer) throws bye {
        return (m) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static n7k parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAfterCrashResumeCount(int i) {
        this.bitField0_ |= 4;
        this.afterCrashResumeCount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCleanResumeCount(int i) {
        this.bitField0_ |= 2;
        this.cleanResumeCount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsExitedCleanly(boolean z) {
        this.bitField0_ |= 1;
        this.isExitedCleanly_ = z;
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
                return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"bitField0_", "isExitedCleanly_", "cleanResumeCount_", "afterCrashResumeCount_"});
            case 3:
                return new m();
            case 4:
                return new c5i(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                n7k n7kVar2 = PARSER;
                if (n7kVar2 != null) {
                    return n7kVar2;
                }
                synchronized (m.class) {
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

    public int getAfterCrashResumeCount() {
        return this.afterCrashResumeCount_;
    }

    public int getCleanResumeCount() {
        return this.cleanResumeCount_;
    }

    public boolean getIsExitedCleanly() {
        return this.isExitedCleanly_;
    }

    public boolean hasAfterCrashResumeCount() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasCleanResumeCount() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasIsExitedCleanly() {
        return (this.bitField0_ & 1) != 0;
    }

    public static c5i newBuilder(m mVar) {
        return (c5i) DEFAULT_INSTANCE.createBuilder(mVar);
    }

    public static m parseDelimitedFrom(InputStream inputStream, z0c z0cVar) throws IOException {
        return (m) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
    }

    public static m parseFrom(ByteBuffer byteBuffer, z0c z0cVar) throws bye {
        return (m) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer, z0cVar);
    }

    public static m parseFrom(nn3 nn3Var) throws bye {
        return (m) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var);
    }

    public static m parseFrom(nn3 nn3Var, z0c z0cVar) throws bye {
        return (m) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var, z0cVar);
    }

    public static m parseFrom(byte[] bArr) throws bye {
        return (m) o3d.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static m parseFrom(byte[] bArr, z0c z0cVar) throws bye {
        return (m) o3d.parseFrom(DEFAULT_INSTANCE, bArr, z0cVar);
    }

    public static m parseFrom(InputStream inputStream) throws IOException {
        return (m) o3d.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static m parseFrom(InputStream inputStream, z0c z0cVar) throws IOException {
        return (m) o3d.parseFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
    }

    public static m parseFrom(qr4 qr4Var) throws IOException {
        return (m) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var);
    }

    public static m parseFrom(qr4 qr4Var, z0c z0cVar) throws IOException {
        return (m) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var, z0cVar);
    }
}

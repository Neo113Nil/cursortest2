package defpackage;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public final class td20 extends GeneratedMessageLite implements zt10 {
    public static final int AFTER_CRASH_RESUME_COUNT_FIELD_NUMBER = 3;
    public static final int CLEAN_RESUME_COUNT_FIELD_NUMBER = 2;
    private static final td20 DEFAULT_INSTANCE;
    public static final int IS_EXITED_CLEANLY_FIELD_NUMBER = 1;
    private static volatile of90 PARSER;
    private int afterCrashResumeCount_;
    private int bitField0_;
    private int cleanResumeCount_;
    private boolean isExitedCleanly_;

    static {
        td20 td20Var = new td20();
        DEFAULT_INSTANCE = td20Var;
        GeneratedMessageLite.registerDefaultInstance(td20.class, td20Var);
    }

    private td20() {
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

    public static td20 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static sd20 newBuilder() {
        return (sd20) DEFAULT_INSTANCE.createBuilder();
    }

    public static td20 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (td20) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static td20 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (td20) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static of90 parser() {
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

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        of90 of90Var;
        switch (md20.a[methodToInvoke.ordinal()]) {
            case 1:
                return new td20();
            case 2:
                return new sd20(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"bitField0_", "isExitedCleanly_", "cleanResumeCount_", "afterCrashResumeCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                of90 of90Var2 = PARSER;
                if (of90Var2 != null) {
                    return of90Var2;
                }
                synchronized (td20.class) {
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

    public static sd20 newBuilder(td20 td20Var) {
        return (sd20) DEFAULT_INSTANCE.createBuilder(td20Var);
    }

    public static td20 parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (td20) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static td20 parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
        return (td20) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
    }

    public static td20 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (td20) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static td20 parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
        return (td20) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
    }

    public static td20 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (td20) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static td20 parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
        return (td20) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
    }

    public static td20 parseFrom(InputStream inputStream) throws IOException {
        return (td20) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static td20 parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (td20) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static td20 parseFrom(eac eacVar) throws IOException {
        return (td20) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
    }

    public static td20 parseFrom(eac eacVar, pyo pyoVar) throws IOException {
        return (td20) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
    }
}

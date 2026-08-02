package defpackage;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.k;

/* loaded from: classes.dex */
public final class qou extends GeneratedMessageLite implements yt10 {
    private static final qou DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile nf90 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private wou params_;
    private int version_;

    static {
        qou qouVar = new qou();
        DEFAULT_INSTANCE = qouVar;
        GeneratedMessageLite.t(qou.class, qouVar);
    }

    public static pou C() {
        return (pou) DEFAULT_INSTANCE.h();
    }

    public static qou D(ByteString byteString, oyo oyoVar) {
        return (qou) GeneratedMessageLite.r(DEFAULT_INSTANCE, byteString, oyoVar);
    }

    public static void x(qou qouVar, wou wouVar) {
        qouVar.getClass();
        qouVar.params_ = wouVar;
    }

    public static void y(qou qouVar, int i) {
        qouVar.keySize_ = i;
    }

    public static qou z() {
        return DEFAULT_INSTANCE;
    }

    public final int A() {
        return this.keySize_;
    }

    public final wou B() {
        wou wouVar = this.params_;
        return wouVar == null ? wou.z() : wouVar;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, defpackage.yt10
    public final /* bridge */ /* synthetic */ GeneratedMessageLite getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object i(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        nf90 nf90Var;
        switch (oou.a[methodToInvoke.ordinal()]) {
            case 1:
                return new qou();
            case 2:
                return new pou(DEFAULT_INSTANCE);
            case 3:
                return new t9i0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                nf90 nf90Var2 = PARSER;
                if (nf90Var2 != null) {
                    return nf90Var2;
                }
                synchronized (qou.class) {
                    try {
                        nf90Var = PARSER;
                        if (nf90Var == null) {
                            nf90Var = new nxs(DEFAULT_INSTANCE);
                            PARSER = nf90Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return nf90Var;
            case 6:
                return (byte) 1;
            default:
                w511.u();
            case 7:
                return null;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, defpackage.vt10
    public final /* bridge */ /* synthetic */ k newBuilderForType() {
        return newBuilderForType();
    }
}

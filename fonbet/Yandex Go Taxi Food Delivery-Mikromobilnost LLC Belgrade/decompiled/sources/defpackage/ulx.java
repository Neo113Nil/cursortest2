package defpackage;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.k;

/* loaded from: classes.dex */
public final class ulx extends GeneratedMessageLite implements yt10 {
    private static final ulx DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile nf90 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private xlx params_;
    private int version_;

    static {
        ulx ulxVar = new ulx();
        DEFAULT_INSTANCE = ulxVar;
        GeneratedMessageLite.t(ulx.class, ulxVar);
    }

    public static tlx B() {
        return (tlx) DEFAULT_INSTANCE.h();
    }

    public static ulx C(ByteString byteString, oyo oyoVar) {
        return (ulx) GeneratedMessageLite.r(DEFAULT_INSTANCE, byteString, oyoVar);
    }

    public static void x(ulx ulxVar) {
        ulxVar.version_ = 0;
    }

    public static void y(ulx ulxVar, xlx xlxVar) {
        ulxVar.getClass();
        xlxVar.getClass();
        ulxVar.params_ = xlxVar;
    }

    public final int A() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, defpackage.yt10
    public final /* bridge */ /* synthetic */ GeneratedMessageLite getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object i(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        nf90 nf90Var;
        switch (slx.a[methodToInvoke.ordinal()]) {
            case 1:
                return new ulx();
            case 2:
                return new tlx(0);
            case 3:
                return new t9i0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                nf90 nf90Var2 = PARSER;
                if (nf90Var2 != null) {
                    return nf90Var2;
                }
                synchronized (ulx.class) {
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

    public final xlx z() {
        xlx xlxVar = this.params_;
        return xlxVar == null ? xlx.x() : xlxVar;
    }
}

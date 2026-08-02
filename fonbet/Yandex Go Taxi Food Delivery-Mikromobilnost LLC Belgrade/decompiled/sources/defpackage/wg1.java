package defpackage;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.k;

/* loaded from: classes.dex */
public final class wg1 extends GeneratedMessageLite implements yt10 {
    private static final wg1 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile nf90 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.a;
    private eh1 params_;
    private int version_;

    static {
        wg1 wg1Var = new wg1();
        DEFAULT_INSTANCE = wg1Var;
        GeneratedMessageLite.t(wg1.class, wg1Var);
    }

    public static vg1 D() {
        return (vg1) DEFAULT_INSTANCE.h();
    }

    public static wg1 E(ByteString byteString, oyo oyoVar) {
        return (wg1) GeneratedMessageLite.r(DEFAULT_INSTANCE, byteString, oyoVar);
    }

    public static void x(wg1 wg1Var) {
        wg1Var.version_ = 0;
    }

    public static void y(wg1 wg1Var, eh1 eh1Var) {
        wg1Var.getClass();
        eh1Var.getClass();
        wg1Var.params_ = eh1Var;
    }

    public static void z(wg1 wg1Var, ByteString byteString) {
        wg1Var.getClass();
        wg1Var.keyValue_ = byteString;
    }

    public final ByteString A() {
        return this.keyValue_;
    }

    public final eh1 B() {
        eh1 eh1Var = this.params_;
        return eh1Var == null ? eh1.y() : eh1Var;
    }

    public final int C() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, defpackage.yt10
    public final /* bridge */ /* synthetic */ GeneratedMessageLite getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object i(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        nf90 nf90Var;
        switch (ug1.a[methodToInvoke.ordinal()]) {
            case 1:
                return new wg1();
            case 2:
                return new vg1(0);
            case 3:
                return new t9i0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                nf90 nf90Var2 = PARSER;
                if (nf90Var2 != null) {
                    return nf90Var2;
                }
                synchronized (wg1.class) {
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

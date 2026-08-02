package defpackage;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.k;

/* loaded from: classes.dex */
public final class z79 extends GeneratedMessageLite implements yt10 {
    private static final z79 DEFAULT_INSTANCE;
    private static volatile nf90 PARSER;

    static {
        z79 z79Var = new z79();
        DEFAULT_INSTANCE = z79Var;
        GeneratedMessageLite.t(z79.class, z79Var);
    }

    public static z79 x() {
        return DEFAULT_INSTANCE;
    }

    public static z79 y(ByteString byteString, oyo oyoVar) {
        return (z79) GeneratedMessageLite.r(DEFAULT_INSTANCE, byteString, oyoVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, defpackage.yt10
    public final /* bridge */ /* synthetic */ GeneratedMessageLite getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object i(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        nf90 nf90Var;
        switch (x79.a[methodToInvoke.ordinal()]) {
            case 1:
                return new z79();
            case 2:
                return new y79(0);
            case 3:
                return new t9i0(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                nf90 nf90Var2 = PARSER;
                if (nf90Var2 != null) {
                    return nf90Var2;
                }
                synchronized (z79.class) {
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

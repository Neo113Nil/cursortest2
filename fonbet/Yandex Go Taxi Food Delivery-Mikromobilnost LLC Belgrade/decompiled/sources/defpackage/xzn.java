package defpackage;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.e;
import com.google.crypto.tink.shaded.protobuf.k;
import java.io.ByteArrayInputStream;

/* loaded from: classes.dex */
public final class xzn extends GeneratedMessageLite implements yt10 {
    private static final xzn DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile nf90 PARSER;
    private ByteString encryptedKeyset_ = ByteString.a;
    private plx keysetInfo_;

    static {
        xzn xznVar = new xzn();
        DEFAULT_INSTANCE = xznVar;
        GeneratedMessageLite.t(xzn.class, xznVar);
    }

    public static wzn A() {
        return (wzn) DEFAULT_INSTANCE.h();
    }

    public static xzn B(ByteArrayInputStream byteArrayInputStream, oyo oyoVar) {
        GeneratedMessageLite s = GeneratedMessageLite.s(DEFAULT_INSTANCE, new e(byteArrayInputStream), oyoVar);
        GeneratedMessageLite.g(s);
        return (xzn) s;
    }

    public static void x(xzn xznVar, ByteString byteString) {
        xznVar.getClass();
        xznVar.encryptedKeyset_ = byteString;
    }

    public static void y(xzn xznVar, plx plxVar) {
        xznVar.getClass();
        xznVar.keysetInfo_ = plxVar;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, defpackage.yt10
    public final /* bridge */ /* synthetic */ GeneratedMessageLite getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object i(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        nf90 nf90Var;
        switch (vzn.a[methodToInvoke.ordinal()]) {
            case 1:
                return new xzn();
            case 2:
                return new wzn(DEFAULT_INSTANCE);
            case 3:
                return new t9i0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                nf90 nf90Var2 = PARSER;
                if (nf90Var2 != null) {
                    return nf90Var2;
                }
                synchronized (xzn.class) {
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

    public final ByteString z() {
        return this.encryptedKeyset_;
    }
}

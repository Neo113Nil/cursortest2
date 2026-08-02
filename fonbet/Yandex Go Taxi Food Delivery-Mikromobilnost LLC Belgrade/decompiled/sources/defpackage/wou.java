package defpackage;

import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.k;

/* loaded from: classes.dex */
public final class wou extends GeneratedMessageLite implements yt10 {
    private static final wou DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile nf90 PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    static {
        wou wouVar = new wou();
        DEFAULT_INSTANCE = wouVar;
        GeneratedMessageLite.t(wou.class, wouVar);
    }

    public static vou C() {
        return (vou) DEFAULT_INSTANCE.h();
    }

    public static void x(wou wouVar, HashType hashType) {
        wouVar.getClass();
        wouVar.hash_ = hashType.a();
    }

    public static void y(wou wouVar, int i) {
        wouVar.tagSize_ = i;
    }

    public static wou z() {
        return DEFAULT_INSTANCE;
    }

    public final HashType A() {
        int i = this.hash_;
        HashType hashType = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : HashType.SHA224 : HashType.SHA512 : HashType.SHA256 : HashType.SHA384 : HashType.SHA1 : HashType.UNKNOWN_HASH;
        return hashType == null ? HashType.UNRECOGNIZED : hashType;
    }

    public final int B() {
        return this.tagSize_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, defpackage.yt10
    public final /* bridge */ /* synthetic */ GeneratedMessageLite getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    public final Object i(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        nf90 nf90Var;
        switch (uou.a[methodToInvoke.ordinal()]) {
            case 1:
                return new wou();
            case 2:
                return new vou(DEFAULT_INSTANCE);
            case 3:
                return new t9i0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                nf90 nf90Var2 = PARSER;
                if (nf90Var2 != null) {
                    return nf90Var2;
                }
                synchronized (wou.class) {
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

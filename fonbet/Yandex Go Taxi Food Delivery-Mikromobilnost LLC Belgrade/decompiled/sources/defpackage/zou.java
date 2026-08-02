package defpackage;

import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.OutputPrefixType;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class zou {
    public static final md90 a;
    public static final ld90 b;
    public static final bjx c;
    public static final qix d;

    static {
        u77 b2 = rw21.b("type.googleapis.com/google.crypto.tink.HmacKey");
        a = new md90(tou.class);
        b = new ld90(b2);
        c = new bjx(nou.class);
        d = new qix(b2, new kbs(11));
    }

    public static ag1 a(HashType hashType) {
        int i = you.a[hashType.ordinal()];
        if (i == 1) {
            return ag1.m;
        }
        if (i == 2) {
            return ag1.n;
        }
        if (i == 3) {
            return ag1.o;
        }
        if (i == 4) {
            return ag1.p;
        }
        if (i == 5) {
            return ag1.q;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + hashType.a());
    }

    public static bg1 b(OutputPrefixType outputPrefixType) {
        int i = you.b[outputPrefixType.ordinal()];
        if (i == 1) {
            return bg1.D;
        }
        if (i == 2) {
            return bg1.E;
        }
        if (i == 3) {
            return bg1.F;
        }
        if (i == 4) {
            return bg1.G;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.b());
    }
}

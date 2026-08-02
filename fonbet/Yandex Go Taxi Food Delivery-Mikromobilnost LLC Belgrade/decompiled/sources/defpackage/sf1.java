package defpackage;

import com.google.crypto.tink.proto.OutputPrefixType;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class sf1 {
    public static final md90 a;
    public static final ld90 b;
    public static final bjx c;
    public static final qix d;

    static {
        u77 b2 = rw21.b("type.googleapis.com/google.crypto.tink.AesCmacKey");
        a = new md90(nf1.class);
        b = new ld90(b2);
        c = new bjx(ff1.class);
        d = new qix(b2, new xfo(12));
    }

    public static mf1 a(OutputPrefixType outputPrefixType) {
        int i = rf1.a[outputPrefixType.ordinal()];
        if (i == 1) {
            return mf1.c;
        }
        if (i == 2) {
            return mf1.w;
        }
        if (i == 3) {
            return mf1.x;
        }
        if (i == 4) {
            return mf1.y;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.b());
    }
}

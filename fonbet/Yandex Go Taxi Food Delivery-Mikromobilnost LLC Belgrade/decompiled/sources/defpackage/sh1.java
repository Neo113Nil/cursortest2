package defpackage;

import com.google.crypto.tink.proto.OutputPrefixType;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class sh1 {
    public static final md90 a;
    public static final ld90 b;
    public static final bjx c;
    public static final qix d;

    static {
        u77 b2 = rw21.b("type.googleapis.com/google.crypto.tink.AesGcmKey");
        a = new md90(qh1.class);
        b = new ld90(b2);
        c = new bjx(lh1.class);
        d = new qix(b2, new xfo(15));
    }

    public static ph1 a(OutputPrefixType outputPrefixType) {
        int i = rh1.a[outputPrefixType.ordinal()];
        if (i == 1) {
            return ph1.c;
        }
        if (i == 2 || i == 3) {
            return ph1.d;
        }
        if (i == 4) {
            return ph1.e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.b());
    }
}

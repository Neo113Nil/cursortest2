package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class w79 extends xe1 {
    public static w79 a(bg1 bg1Var, va90 va90Var, Integer num) {
        u77 u77Var = (u77) va90Var.a;
        bg1 bg1Var2 = bg1.A;
        if (bg1Var != bg1Var2 && num == null) {
            yci0.u("For given Variant ", bg1Var, " the value of idRequirement must be non-null");
            return null;
        }
        if (bg1Var == bg1Var2 && num != null) {
            kbs.v("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (u77Var.a.length != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + u77Var.a.length);
        }
        bg1 bg1Var3 = new a89(bg1Var).a;
        if (bg1Var3 == bg1Var2) {
            u77.a(new byte[0]);
        } else if (bg1Var3 == bg1.z) {
            u77.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (bg1Var3 != bg1.y) {
                yci0.k(bg1Var3, "Unknown Variant: ");
                return null;
            }
            u77.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new w79();
    }
}

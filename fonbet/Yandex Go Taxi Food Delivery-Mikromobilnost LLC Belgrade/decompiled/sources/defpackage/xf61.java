package defpackage;

import java.util.logging.Logger;

/* loaded from: classes4.dex */
public abstract class xf61 {
    public static final Logger a = Logger.getLogger("okio.Okio");

    public static final boolean b(AssertionError assertionError) {
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? evu0.y(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }
}

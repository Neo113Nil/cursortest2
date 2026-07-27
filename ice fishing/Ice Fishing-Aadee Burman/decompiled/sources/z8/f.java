package z8;

import Q7.j;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f42282a = Logger.getLogger("okio.Okio");

    public static final boolean a(AssertionError assertionError) {
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? j.U(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }
}

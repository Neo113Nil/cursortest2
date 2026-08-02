package defpackage;

import com.yandex.passport.api.i;
import com.ybsdk.core.utils.dto.common.FailDataException;

/* loaded from: classes3.dex */
public abstract class uja1 {
    public static boolean a;

    public static final un90 a(i iVar) {
        return new un90(iVar);
    }

    public static final boolean b(int i) {
        return i != 0;
    }

    public static final o8p c(Throwable th) {
        FailDataException failDataException = th instanceof FailDataException ? (FailDataException) th : null;
        if (failDataException != null) {
            return new o8p(failDataException.getError(), failDataException.getDescription(), failDataException.getSupportUrl(), failDataException.getTechInfo(), failDataException);
        }
        return null;
    }
}

package defpackage;

import androidx.camera.core.e;
import java.util.UUID;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class xt7 {
    public final yy40 a;

    public xt7() {
        yy40 b = yy40.b();
        this.a = b;
        x34 x34Var = max0.f4;
        Class cls = (Class) b.g(x34Var, null);
        if (cls != null && !cls.equals(e.class)) {
            w511.l("Invalid target class configuration for ", this, Extension.COLON_SPACE, cls);
            throw null;
        }
        b.w(x34Var, e.class);
        x34 x34Var2 = max0.e4;
        if (b.g(x34Var2, null) == null) {
            b.w(x34Var2, e.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }
}

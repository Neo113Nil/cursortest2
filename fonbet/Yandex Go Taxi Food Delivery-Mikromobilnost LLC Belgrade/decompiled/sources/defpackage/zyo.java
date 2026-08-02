package defpackage;

import androidx.camera.extensions.impl.ExtensionVersionImpl;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class zyo extends azo {
    public static ExtensionVersionImpl c;
    public final c94 b;

    public zyo() {
        if (c == null) {
            c = new ExtensionVersionImpl();
        }
        ExtensionVersionImpl extensionVersionImpl = c;
        a3c a3cVar = a3c.b;
        c94 c2 = c94.c(extensionVersionImpl.checkApiVersion(a3cVar.a.toString()));
        if (c2 != null && a3cVar.a.a == c2.a) {
            this.b = c2;
        }
        Objects.toString(this.b);
        sgb1.g(3, "ExtenderVersion");
    }

    @Override // defpackage.azo
    public final c94 c() {
        return this.b;
    }

    @Override // defpackage.azo
    public final boolean d() {
        try {
            return c.isAdvancedExtenderImplemented();
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }
}

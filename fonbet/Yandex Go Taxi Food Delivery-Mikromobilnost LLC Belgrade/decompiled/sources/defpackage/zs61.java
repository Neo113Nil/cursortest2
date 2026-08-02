package defpackage;

import java.security.CodeSource;
import java.security.PrivilegedAction;
import ru.CryptoPro.Install.ShellInstaller;

/* loaded from: classes4.dex */
public final class zs61 implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public final Object run() {
        CodeSource codeSource = ShellInstaller.class.getProtectionDomain().getCodeSource();
        if (codeSource != null) {
            return codeSource.getLocation();
        }
        return null;
    }
}

package defpackage;

import java.security.PrivilegedAction;
import java.util.Calendar;
import java.util.Date;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import ru.CryptoPro.JCP.tools.JarTools;

/* loaded from: classes4.dex */
public final class qr61 implements PrivilegedAction {
    public final /* synthetic */ int a;
    public final /* synthetic */ Class b;

    public /* synthetic */ qr61(int i, Class cls) {
        this.a = i;
        this.b = cls;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        int i = this.a;
        Class cls = this.b;
        switch (i) {
            case 0:
                return cls.getProtectionDomain().getCodeSource().getLocation();
            default:
                try {
                    JarFile jar = JarTools.getJAR(cls);
                    if (jar != null) {
                        JarEntry nextElement = jar.entries().nextElement();
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(new Date(nextElement.getTime()));
                        return String.valueOf(calendar.get(1));
                    }
                } catch (Exception unused) {
                }
                return "2010";
        }
    }
}

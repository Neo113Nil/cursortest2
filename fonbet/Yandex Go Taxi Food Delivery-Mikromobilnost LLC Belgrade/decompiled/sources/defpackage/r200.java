package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class r200 implements r2f0 {
    public static final Logger a = Logger.getLogger(r200.class.getName());
    public static final byte[] b = {0};
    public static final r200 c = new r200();

    @Override // defpackage.r2f0
    public final Class a() {
        return m200.class;
    }

    @Override // defpackage.r2f0
    public final Class b() {
        return m200.class;
    }

    @Override // defpackage.r2f0
    public final Object c(jb7 jb7Var) {
        Iterator it = ((ConcurrentMap) jb7Var.b).values().iterator();
        while (it.hasNext()) {
            for (p2f0 p2f0Var : (List) it.next()) {
                lhx lhxVar = p2f0Var.h;
                if (lhxVar instanceof o200) {
                    o200 o200Var = (o200) lhxVar;
                    byte[] bArr = p2f0Var.c;
                    u77 a2 = u77.a(bArr == null ? null : Arrays.copyOf(bArr, bArr.length));
                    if (!a2.equals(o200Var.a())) {
                        StringBuilder sb = new StringBuilder("Mac Key with parameters ");
                        sb.append(o200Var.b());
                        u77 a3 = o200Var.a();
                        sb.append(" has wrong output prefix (");
                        sb.append(a3);
                        sb.append(") instead of (");
                        sb.append(a2);
                        sb.append(Extension.C_BRAKE);
                        throw new GeneralSecurityException(sb.toString());
                    }
                }
            }
        }
        return new q200(jb7Var);
    }
}

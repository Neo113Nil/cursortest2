package yads;

import defpackage.sls;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import kotlin.jvm.internal.Lambda;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public final class f73 extends Lambda implements sls {
    public static final f73 w = new f73();

    public f73() {
        super(0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        try {
            return CertificateFactory.getInstance(JCP.CERTIFICATE_FACTORY_NAME);
        } catch (CertificateException unused) {
            return null;
        }
    }
}

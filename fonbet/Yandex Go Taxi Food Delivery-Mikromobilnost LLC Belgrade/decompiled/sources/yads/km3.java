package yads;

import defpackage.sls;
import java.security.cert.CertificateFactory;
import kotlin.jvm.internal.Lambda;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes7.dex */
public final class km3 extends Lambda implements sls {
    public static final /* synthetic */ int w = 0;

    static {
        new km3();
    }

    public km3() {
        super(0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return CertificateFactory.getInstance(JCP.CERTIFICATE_FACTORY_NAME);
    }
}

package defpackage;

import com.objsys.asn1j.runtime.Asn1Exception;
import java.io.IOException;
import java.security.PrivilegedExceptionAction;
import ru.CryptoPro.JCP.Key.PrivateKeyInterface;
import ru.CryptoPro.JCP.Key.PrivateKeySpec;
import ru.CryptoPro.JCP.KeyStore.CPKeyContainer;
import ru.CryptoPro.JCP.KeyStore.ContainerEncoder;

/* loaded from: classes4.dex */
public final class ww61 implements PrivilegedExceptionAction {
    public final /* synthetic */ CPKeyContainer a;
    public final /* synthetic */ char[] b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ CPKeyContainer d;

    public ww61(CPKeyContainer cPKeyContainer, CPKeyContainer cPKeyContainer2, char[] cArr, boolean z) {
        this.d = cPKeyContainer;
        this.a = cPKeyContainer2;
        this.b = cArr;
        this.c = z;
    }

    @Override // java.security.PrivilegedExceptionAction
    public final Object run() {
        CPKeyContainer cPKeyContainer = this.d;
        ContainerEncoder containerEncoder = cPKeyContainer.i;
        PrivateKeyInterface[] privateKeyInterfaceArr = cPKeyContainer.a;
        CPKeyContainer cPKeyContainer2 = this.a;
        char[] cArr = this.b;
        PrivateKeySpec.read(cPKeyContainer2, cArr, privateKeyInterfaceArr);
        cPKeyContainer.f = false;
        try {
            if (!this.c) {
                return null;
            }
            if (cPKeyContainer.d == 2) {
                cPKeyContainer.b.keyContainerContent.containerSecurityLevel.value = 1L;
                cPKeyContainer.i(cArr);
                containerEncoder.storeHeaderV2(cPKeyContainer.b);
            } else {
                cPKeyContainer.c.tbsCProKeyHeader.containerSecurityLevel.value = 1L;
                cPKeyContainer.i(cArr);
                containerEncoder.storeHeaderV4(cPKeyContainer.c);
            }
            containerEncoder.storeName(cPKeyContainer.e);
            return null;
        } catch (Asn1Exception e) {
            throw j6a1.b(e);
        } catch (IOException e2) {
            throw j6a1.b(e2);
        }
    }
}

package defpackage;

import java.security.PrivilegedAction;
import java.util.HashMap;
import java.util.LinkedHashMap;
import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import ru.CryptoPro.Crypto.CryptoProvider;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.AbstractLicense;

/* loaded from: classes4.dex */
public final class yq61 implements PrivilegedAction {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public yq61(String str, String str2) {
        this.a = 4;
        this.b = str;
        this.c = str2;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                HashMap hashMap = (HashMap) obj2;
                ((CryptoProvider) obj).putAll(hashMap);
                return hashMap;
            case 1:
                ((JCP) obj).putAll((LinkedHashMap) obj2);
                return null;
            case 2:
                AbstractLicense abstractLicense = (AbstractLicense) obj;
                abstractLicense.getSpecialNode().put(abstractLicense.getInstDatePrefName(), (String) obj2);
                return null;
            case 3:
                ((HandshakeCompletedListener) obj2).handshakeCompleted((HandshakeCompletedEvent) ((cbv) obj).c);
                return null;
            default:
                String str = (String) obj;
                System.setProperty((String) obj2, str);
                return str;
        }
    }

    public /* synthetic */ yq61(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}

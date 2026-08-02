package defpackage;

import java.lang.reflect.Field;
import java.util.Hashtable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;

/* loaded from: classes3.dex */
public final class fko implements ns1 {
    public Hashtable a;

    @Override // defpackage.ns1
    public final void a(SSLEngine sSLEngine, pr1 pr1Var, String str, int i) {
        String canonicalName = sSLEngine.getClass().getCanonicalName();
        Hashtable hashtable = this.a;
        eko ekoVar = (eko) hashtable.get(canonicalName);
        if (ekoVar == null) {
            Class<?> cls = sSLEngine.getClass();
            ekoVar = new eko();
            try {
                Field declaredField = cls.getSuperclass().getDeclaredField("peerHost");
                ekoVar.a = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = cls.getSuperclass().getDeclaredField("peerPort");
                ekoVar.b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("sslParameters");
                ekoVar.c = declaredField3;
                declaredField3.setAccessible(true);
                Field declaredField4 = declaredField3.getType().getDeclaredField("useSni");
                ekoVar.d = declaredField4;
                declaredField4.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            hashtable.put(canonicalName, ekoVar);
        }
        ekoVar.a(sSLEngine, pr1Var, str, i);
    }

    @Override // defpackage.ns1
    public final SSLEngine b(SSLContext sSLContext, String str, int i) {
        "GmsCore_OpenSSL".equals(sSLContext.getProvider().getName());
        return sSLContext.createSSLEngine(str, i);
    }
}

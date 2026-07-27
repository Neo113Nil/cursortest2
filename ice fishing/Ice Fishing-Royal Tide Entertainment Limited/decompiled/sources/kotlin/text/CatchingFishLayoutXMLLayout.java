package kotlin.text;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes.dex */
public final class CatchingFishLayoutXMLLayout extends CatchingFishGsonCardView {
    public final Object CatchingFishCoroutineFlow;
    public final Method CatchingFishDaggerHiltFAB;

    public CatchingFishLayoutXMLLayout(Object obj, Method method) {
        this.CatchingFishCoroutineFlow = obj;
        this.CatchingFishDaggerHiltFAB = method;
    }

    @Override // kotlin.text.CatchingFishGsonCardView
    public final List CatchingFishEspressoTesting(String str, List list) {
        try {
            return (List) this.CatchingFishDaggerHiltFAB.invoke(this.CatchingFishCoroutineFlow, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException.initCause(e2);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return obj instanceof CatchingFishLayoutXMLLayout;
    }

    public final int hashCode() {
        return 0;
    }
}

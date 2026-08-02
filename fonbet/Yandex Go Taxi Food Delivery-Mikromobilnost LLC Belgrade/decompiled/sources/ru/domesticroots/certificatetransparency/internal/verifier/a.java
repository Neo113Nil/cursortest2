package ru.domesticroots.certificatetransparency.internal.verifier;

import defpackage.i3y;
import defpackage.jih;
import defpackage.jpg;
import defpackage.sls;
import defpackage.unr0;
import defpackage.w511;
import java.security.KeyStore;
import java.util.Iterator;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import ru.domesticroots.certificatetransparency.chaincleaner.CertificateChainCleaner;

/* loaded from: classes9.dex */
public abstract class a {
    public final Set a;
    public final i3y b;
    public final jpg c;
    public final jih d;

    public a(Set set, Set set2, final X509TrustManager x509TrustManager, ru.domesticroots.certificatetransparency.loglist.a aVar, ru.domesticroots.certificatetransparency.cache.a aVar2) {
        this.a = set2;
        Iterator it = set.iterator();
        if (it.hasNext()) {
            throw unr0.i(it);
        }
        this.b = kotlin.a.a(new sls() { // from class: ru.domesticroots.certificatetransparency.internal.verifier.CertificateTransparencyBase$cleaner$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                X509TrustManager x509TrustManager2 = x509TrustManager;
                if (x509TrustManager2 == null) {
                    TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                    trustManagerFactory.init((KeyStore) null);
                    for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                        if (trustManager instanceof X509TrustManager) {
                            x509TrustManager2 = (X509TrustManager) trustManager;
                        }
                    }
                    w511.i("Array contains no element matching the predicate.");
                    return null;
                }
                this.getClass();
                return CertificateChainCleaner.INSTANCE.get(x509TrustManager2);
            }
        });
        this.c = ru.domesticroots.certificatetransparency.loglist.b.a(aVar, aVar2);
        this.d = new jih();
    }
}

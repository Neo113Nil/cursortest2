package ru.domesticroots.certificatetransparency.chaincleaner;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.arf;
import defpackage.btf;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lru/domesticroots/certificatetransparency/chaincleaner/CertificateChainCleaner;", "", "clean", "", "Ljava/security/cert/X509Certificate;", "chain", "hostname", "", "Companion", "domesticroots-certificatetransparency_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public interface CertificateChainCleaner {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/domesticroots/certificatetransparency/chaincleaner/CertificateChainCleaner$Companion;", "", "<init>", "()V", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lru/domesticroots/certificatetransparency/chaincleaner/CertificateChainCleaner;", "get", "(Ljavax/net/ssl/X509TrustManager;)Lru/domesticroots/certificatetransparency/chaincleaner/CertificateChainCleaner;", "Lru/domesticroots/certificatetransparency/chaincleaner/CertificateChainCleanerFactory;", "androidCertificateChainCleanerFactory$delegate", "Larf;", "getAndroidCertificateChainCleanerFactory", "()Lru/domesticroots/certificatetransparency/chaincleaner/CertificateChainCleanerFactory;", "androidCertificateChainCleanerFactory", "domesticroots-certificatetransparency_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* renamed from: androidCertificateChainCleanerFactory$delegate, reason: from kotlin metadata */
        @NotNull
        private static final arf androidCertificateChainCleanerFactory = btf.b(CertificateChainCleaner$Companion$androidCertificateChainCleanerFactory$2.INSTANCE);

        private Companion() {
        }

        private final CertificateChainCleanerFactory getAndroidCertificateChainCleanerFactory() {
            return (CertificateChainCleanerFactory) androidCertificateChainCleanerFactory.getValue();
        }

        @NotNull
        public final CertificateChainCleaner get(@NotNull X509TrustManager trustManager) {
            CertificateChainCleaner certificateChainCleaner;
            trustManager.getClass();
            CertificateChainCleanerFactory androidCertificateChainCleanerFactory2 = getAndroidCertificateChainCleanerFactory();
            return (androidCertificateChainCleanerFactory2 == null || (certificateChainCleaner = androidCertificateChainCleanerFactory2.get(trustManager)) == null) ? new BasicCertificateChainCleaner(trustManager) : certificateChainCleaner;
        }
    }

    @NotNull
    List<X509Certificate> clean(@NotNull List<? extends X509Certificate> chain, @NotNull String hostname);
}

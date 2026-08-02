package ru.domesticroots.certificatetransparency.chaincleaner;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.uif;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import ru.domesticroots.certificatetransparency.chaincleaner.AndroidCertificateChainCleaner;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/domesticroots/certificatetransparency/chaincleaner/CertificateChainCleanerFactory;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class CertificateChainCleaner$Companion$androidCertificateChainCleanerFactory$2 extends uif implements Function0<CertificateChainCleanerFactory> {
    public static final CertificateChainCleaner$Companion$androidCertificateChainCleanerFactory$2 INSTANCE = new CertificateChainCleaner$Companion$androidCertificateChainCleanerFactory$2();

    public CertificateChainCleaner$Companion$androidCertificateChainCleanerFactory$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final CertificateChainCleanerFactory invoke() {
        try {
            Object newInstance = AndroidCertificateChainCleaner.Factory.class.getDeclaredConstructor(null).newInstance(null);
            newInstance.getClass();
            return (CertificateChainCleanerFactory) newInstance;
        } catch (Exception unused) {
            return null;
        }
    }
}

package app.cash.trifle;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0007\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lapp/cash/trifle/TrifleErrors;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "CSRMismatch", "ExpiredCertificate", "InvalidCertPath", "InvalidSignature", "NoTrustAnchor", "NotValidYetCertificate", "UnspecifiedFailure", "Lapp/cash/trifle/TrifleErrors$CSRMismatch;", "Lapp/cash/trifle/TrifleErrors$ExpiredCertificate;", "Lapp/cash/trifle/TrifleErrors$InvalidCertPath;", "Lapp/cash/trifle/TrifleErrors$InvalidSignature;", "Lapp/cash/trifle/TrifleErrors$NoTrustAnchor;", "Lapp/cash/trifle/TrifleErrors$NotValidYetCertificate;", "Lapp/cash/trifle/TrifleErrors$UnspecifiedFailure;", "common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class TrifleErrors extends Exception {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/cash/trifle/TrifleErrors$CSRMismatch;", "Lapp/cash/trifle/TrifleErrors;", "common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CSRMismatch extends TrifleErrors {
        static {
            new CSRMismatch("Trifle certificate does not match CSR", null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/cash/trifle/TrifleErrors$ExpiredCertificate;", "Lapp/cash/trifle/TrifleErrors;", "common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ExpiredCertificate extends TrifleErrors {
        public static final ExpiredCertificate INSTANCE = new ExpiredCertificate("Expired Trifle certificate", null);
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/cash/trifle/TrifleErrors$InvalidCertPath;", "Lapp/cash/trifle/TrifleErrors;", "common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class InvalidCertPath extends TrifleErrors {
        public static final InvalidCertPath INSTANCE = new InvalidCertPath("Invalid Trifle certificate path found", null);
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/cash/trifle/TrifleErrors$InvalidSignature;", "Lapp/cash/trifle/TrifleErrors;", "common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class InvalidSignature extends TrifleErrors {
        public static final InvalidSignature INSTANCE = new InvalidSignature("Invalid Trifle signature", null);
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/cash/trifle/TrifleErrors$NoTrustAnchor;", "Lapp/cash/trifle/TrifleErrors;", "common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NoTrustAnchor extends TrifleErrors {
        public static final NoTrustAnchor INSTANCE = new NoTrustAnchor("No acceptable Trifle trust anchor found", null);
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/cash/trifle/TrifleErrors$NotValidYetCertificate;", "Lapp/cash/trifle/TrifleErrors;", "common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NotValidYetCertificate extends TrifleErrors {
        public static final NotValidYetCertificate INSTANCE = new NotValidYetCertificate("Trifle certificate is not valid yet", null);
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/cash/trifle/TrifleErrors$UnspecifiedFailure;", "Lapp/cash/trifle/TrifleErrors;", "common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UnspecifiedFailure extends TrifleErrors {
    }
}

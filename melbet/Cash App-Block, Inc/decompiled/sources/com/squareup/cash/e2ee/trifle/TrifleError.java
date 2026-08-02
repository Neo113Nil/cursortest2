package com.squareup.cash.e2ee.trifle;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/squareup/cash/e2ee/trifle/TrifleError;", "", "CertificateValidationFailed", "CertificateFetchingFailed", "MobileCertificateRequestGenerationFailed", "SigningFailed", "InvalidCertificateFetched", "NotValidYetCertificate", "KeyHandleDeletionFailed", "KeyHandleGenerationFailed", "SigningInfoValidationFailed", "SigningInfoLoadingFailed", "SigningInfoDeletingFailed", "SigningInfoSavingFailed", "Lcom/squareup/cash/e2ee/trifle/TrifleError$CertificateFetchingFailed;", "Lcom/squareup/cash/e2ee/trifle/TrifleError$CertificateValidationFailed;", "Lcom/squareup/cash/e2ee/trifle/TrifleError$InvalidCertificateFetched;", "Lcom/squareup/cash/e2ee/trifle/TrifleError$KeyHandleDeletionFailed;", "Lcom/squareup/cash/e2ee/trifle/TrifleError$KeyHandleGenerationFailed;", "Lcom/squareup/cash/e2ee/trifle/TrifleError$MobileCertificateRequestGenerationFailed;", "Lcom/squareup/cash/e2ee/trifle/TrifleError$NotValidYetCertificate;", "Lcom/squareup/cash/e2ee/trifle/TrifleError$SigningFailed;", "Lcom/squareup/cash/e2ee/trifle/TrifleError$SigningInfoDeletingFailed;", "Lcom/squareup/cash/e2ee/trifle/TrifleError$SigningInfoLoadingFailed;", "Lcom/squareup/cash/e2ee/trifle/TrifleError$SigningInfoSavingFailed;", "Lcom/squareup/cash/e2ee/trifle/TrifleError$SigningInfoValidationFailed;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class TrifleError extends Throwable {
    public final String description;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/e2ee/trifle/TrifleError$CertificateFetchingFailed;", "Lcom/squareup/cash/e2ee/trifle/TrifleError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CertificateFetchingFailed extends TrifleError {
        public static final CertificateFetchingFailed INSTANCE = new CertificateFetchingFailed("Error fetching certificate from server.");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CertificateFetchingFailed);
        }

        public final int hashCode() {
            return 2118570839;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "CertificateFetchingFailed";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/e2ee/trifle/TrifleError$CertificateValidationFailed;", "Lcom/squareup/cash/e2ee/trifle/TrifleError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CertificateValidationFailed extends TrifleError {
        public static final CertificateValidationFailed INSTANCE = new CertificateValidationFailed("Error validating fetched certificate.");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CertificateValidationFailed);
        }

        public final int hashCode() {
            return 1953976232;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "CertificateValidationFailed";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/e2ee/trifle/TrifleError$InvalidCertificateFetched;", "Lcom/squareup/cash/e2ee/trifle/TrifleError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InvalidCertificateFetched extends TrifleError {
        public static final InvalidCertificateFetched INSTANCE = new InvalidCertificateFetched("Certificate validation (in the client) returned false.");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InvalidCertificateFetched);
        }

        public final int hashCode() {
            return -1823964620;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "InvalidCertificateFetched";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/e2ee/trifle/TrifleError$KeyHandleDeletionFailed;", "Lcom/squareup/cash/e2ee/trifle/TrifleError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class KeyHandleDeletionFailed extends TrifleError {
        public static final KeyHandleDeletionFailed INSTANCE = new KeyHandleDeletionFailed("Error deleting Trifle KeyHandle.");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof KeyHandleDeletionFailed);
        }

        public final int hashCode() {
            return -618576307;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "KeyHandleDeletionFailed";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/e2ee/trifle/TrifleError$KeyHandleGenerationFailed;", "Lcom/squareup/cash/e2ee/trifle/TrifleError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class KeyHandleGenerationFailed extends TrifleError {
        public static final KeyHandleGenerationFailed INSTANCE = new KeyHandleGenerationFailed("Error generating Trifle KeyHandle.");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof KeyHandleGenerationFailed);
        }

        public final int hashCode() {
            return 1079561111;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "KeyHandleGenerationFailed";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/e2ee/trifle/TrifleError$MobileCertificateRequestGenerationFailed;", "Lcom/squareup/cash/e2ee/trifle/TrifleError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MobileCertificateRequestGenerationFailed extends TrifleError {
        public static final MobileCertificateRequestGenerationFailed INSTANCE = new MobileCertificateRequestGenerationFailed("Error generating CSR.");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MobileCertificateRequestGenerationFailed);
        }

        public final int hashCode() {
            return -2059149612;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "MobileCertificateRequestGenerationFailed";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/e2ee/trifle/TrifleError$NotValidYetCertificate;", "Lcom/squareup/cash/e2ee/trifle/TrifleError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NotValidYetCertificate extends TrifleError {
        public static final NotValidYetCertificate INSTANCE = new NotValidYetCertificate("Certificate is not valid yet (in the client).");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NotValidYetCertificate);
        }

        public final int hashCode() {
            return -1295815651;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "NotValidYetCertificate";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/e2ee/trifle/TrifleError$SigningFailed;", "Lcom/squareup/cash/e2ee/trifle/TrifleError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SigningFailed extends TrifleError {
        public static final SigningFailed INSTANCE = new SigningFailed("Error while signing data.");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SigningFailed);
        }

        public final int hashCode() {
            return -1338243395;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "SigningFailed";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/e2ee/trifle/TrifleError$SigningInfoDeletingFailed;", "Lcom/squareup/cash/e2ee/trifle/TrifleError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SigningInfoDeletingFailed extends TrifleError {
        public static final SigningInfoDeletingFailed INSTANCE = new SigningInfoDeletingFailed("Error deleting SigningInfo from storage.");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SigningInfoDeletingFailed);
        }

        public final int hashCode() {
            return -434036525;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "SigningInfoDeletingFailed";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/e2ee/trifle/TrifleError$SigningInfoLoadingFailed;", "Lcom/squareup/cash/e2ee/trifle/TrifleError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SigningInfoLoadingFailed extends TrifleError {
        public static final SigningInfoLoadingFailed INSTANCE = new SigningInfoLoadingFailed("Error loading SigningInfo from storage.");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SigningInfoLoadingFailed);
        }

        public final int hashCode() {
            return 39245835;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "SigningInfoLoadingFailed";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/e2ee/trifle/TrifleError$SigningInfoSavingFailed;", "Lcom/squareup/cash/e2ee/trifle/TrifleError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SigningInfoSavingFailed extends TrifleError {
        public static final SigningInfoSavingFailed INSTANCE = new SigningInfoSavingFailed("Error saving SigningInfo to storage.");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SigningInfoSavingFailed);
        }

        public final int hashCode() {
            return -1037253083;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "SigningInfoSavingFailed";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/e2ee/trifle/TrifleError$SigningInfoValidationFailed;", "Lcom/squareup/cash/e2ee/trifle/TrifleError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SigningInfoValidationFailed extends TrifleError {
        public static final SigningInfoValidationFailed INSTANCE = new SigningInfoValidationFailed("Error validating SigningInfo.");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SigningInfoValidationFailed);
        }

        public final int hashCode() {
            return -408131228;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "SigningInfoValidationFailed";
        }
    }

    public TrifleError(String str) {
        this.description = str;
    }

    public final String getDescription() {
        return this.description;
    }
}

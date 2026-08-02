package com.squareup.cash.e2ee.trifle;

/* loaded from: classes6.dex */
public enum TrifleAction {
    Sign("Signing."),
    GenerateKeyHandle("Generating new Trifle Key Handle."),
    DeleteKeyHandle("Deleting Trifle Key Handle."),
    GenerateCertificate("Generating new certificate."),
    GenerateMobileCertificateRequest("Generating CSR."),
    FetchCertificate("Sending CSR and fetching response from server."),
    ValidateCertificate("Validating fetched certificate."),
    ValidateSigningInfo("Validating SigningInfo."),
    SaveSigningInfo("Saving SigningInfo."),
    DeleteSigningInfo("Deleting SigningInfo."),
    LoadSigningInfo("Loading SigningInfo.");

    public final String description;

    TrifleAction(String str) {
        this.description = str;
    }
}

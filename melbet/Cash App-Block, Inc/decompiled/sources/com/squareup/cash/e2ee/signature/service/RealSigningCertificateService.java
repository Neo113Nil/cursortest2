package com.squareup.cash.e2ee.signature.service;

import com.squareup.cash.braze.RealBrazeManager$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.deviceintegritly.api.GetSignedCertificateRequest;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import retrofit2.Retrofit;

/* loaded from: classes.dex */
public final class RealSigningCertificateService implements SigningCertificateService {
    public final Lazy delegate$delegate;

    public RealSigningCertificateService(Retrofit retrofit) {
        this.delegate$delegate = LazyKt.lazy(new RealBrazeManager$$ExternalSyntheticLambda0(retrofit, 16));
    }

    @Override // com.squareup.cash.e2ee.signature.service.SigningCertificateService
    public final Object getSignedCertificate(GetSignedCertificateRequest getSignedCertificateRequest, Continuation continuation) {
        return ((SigningCertificateService) this.delegate$delegate.getValue()).getSignedCertificate(getSignedCertificateRequest, continuation);
    }
}

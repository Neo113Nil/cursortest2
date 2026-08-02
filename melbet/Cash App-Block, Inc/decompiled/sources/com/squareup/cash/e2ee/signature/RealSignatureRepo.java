package com.squareup.cash.e2ee.signature;

import androidx.datastore.core.SimpleActor;
import com.squareup.cash.e2ee.signature.generator.SignatureDeleter;
import com.squareup.cash.e2ee.signature.local.RealLocalSignatureStore;
import com.squareup.cash.e2ee.signature.validator.SignatureValidator;
import com.squareup.cash.e2ee.trifle.RealTrifleLogger;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class RealSignatureRepo {
    public final CoroutineContext ioDispatcher;
    public final RealLocalSignatureStore localSignatureStore;
    public final SignatureDeleter signatureDeleter;
    public final SimpleActor signatureGenerator;
    public final SignatureValidator signatureValidator;
    public final RealTrifleLogger trifleLogger;

    public RealSignatureRepo(SimpleActor simpleActor, SignatureDeleter signatureDeleter, SignatureValidator signatureValidator, RealTrifleLogger realTrifleLogger, RealLocalSignatureStore realLocalSignatureStore, CoroutineContext coroutineContext) {
        this.signatureGenerator = simpleActor;
        this.signatureDeleter = signatureDeleter;
        this.signatureValidator = signatureValidator;
        this.trifleLogger = realTrifleLogger;
        this.localSignatureStore = realLocalSignatureStore;
        this.ioDispatcher = coroutineContext;
    }
}

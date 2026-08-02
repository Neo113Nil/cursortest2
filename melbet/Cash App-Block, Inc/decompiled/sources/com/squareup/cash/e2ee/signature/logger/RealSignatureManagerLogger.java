package com.squareup.cash.e2ee.signature.logger;

import com.squareup.cash.e2ee.signature.SignatureFetch;
import com.squareup.cash.observability.types.ErrorReporter;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealSignatureManagerLogger {
    public final ErrorReporter errorReporter;

    public final class MetroFactory implements Factory {
        public final Provider errorReporter;

        public MetroFactory(LambdaProvider lambdaProvider) {
            this.errorReporter = lambdaProvider;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ErrorReporter errorReporter = (ErrorReporter) this.errorReporter.invoke();
            errorReporter.getClass();
            return new RealSignatureManagerLogger(errorReporter);
        }
    }

    public RealSignatureManagerLogger(ErrorReporter errorReporter) {
        this.errorReporter = errorReporter;
    }

    public final void logDeleteSignatureFailure(Exception exc) {
        this.errorReporter.report(new SignatureError(exc, "deleteSignature"), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
    }

    public final void logGenerateSignatureFailure(Exception exc, SignatureFetch.Failure failure) {
        failure.getClass();
        Timber.Forest.w("SignatureManager: reason for generating signature: " + failure, new Object[0]);
        this.errorReporter.report(new SignatureError(exc, "generateSignature"), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
    }
}

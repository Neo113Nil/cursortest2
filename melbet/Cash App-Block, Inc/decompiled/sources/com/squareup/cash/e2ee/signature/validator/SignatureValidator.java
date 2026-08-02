package com.squareup.cash.e2ee.signature.validator;

import com.squareup.cash.e2ee.trifle.RealTrifleLogger;
import com.squareup.cash.e2ee.trifle.TrifleService;

/* loaded from: classes.dex */
public final class SignatureValidator {
    public final RealTrifleLogger trifleLogger;
    public final TrifleService trifleService;

    public SignatureValidator(TrifleService trifleService, RealTrifleLogger realTrifleLogger) {
        this.trifleService = trifleService;
        this.trifleLogger = realTrifleLogger;
    }
}

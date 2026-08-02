package com.squareup.cash.google.pay;

import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningCompletionData;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public interface GooglePayProvisioningGateway {
    Object complete(BlockersScreens.ProvisionGooglePayScreen provisionGooglePayScreen, DigitalWalletTokenProvisioningCompletionData.ProvisioningResult provisioningResult, ContinuationImpl continuationImpl);

    Object provision(BlockersScreens.ProvisionGooglePayScreen provisionGooglePayScreen, String str, String str2, Continuation continuation);
}

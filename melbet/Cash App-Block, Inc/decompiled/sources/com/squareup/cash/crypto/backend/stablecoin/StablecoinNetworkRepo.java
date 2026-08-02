package com.squareup.cash.crypto.backend.stablecoin;

import com.squareup.protos.cash.blockstable.api.v1.InputSource;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public interface StablecoinNetworkRepo {
    Object getDepositOptions(boolean z, ContinuationImpl continuationImpl);

    Object getWithdrawalOptions(String str, InputSource inputSource, ContinuationImpl continuationImpl);
}

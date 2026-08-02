package com.squareup.cash.crypto.backend.idv;

import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public final class LiteCryptoIdvStatusRepo implements CryptoIdvStatusRepo {
    @Override // com.squareup.cash.crypto.backend.idv.CryptoIdvStatusRepo
    public final Flow idvStatus() {
        return new AppLockMonitor$special$$inlined$map$2(CryptoIdvStatus.VERIFIED, 19);
    }
}

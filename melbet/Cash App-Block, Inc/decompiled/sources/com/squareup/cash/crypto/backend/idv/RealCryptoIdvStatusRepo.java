package com.squareup.cash.crypto.backend.idv;

import com.squareup.cash.crypto.backend.eligibility.BitcoinEligibility;
import com.squareup.cash.crypto.backend.eligibility.RealBitcoinEligibilityRepo;
import com.squareup.cash.data.transfers.RealTransferManager$addCash$$inlined$map$1;
import kotlin.Lazy;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;

/* loaded from: classes6.dex */
public final class RealCryptoIdvStatusRepo implements CryptoIdvStatusRepo {
    public final RealBitcoinEligibilityRepo bitcoinEligibilityRepo;

    public RealCryptoIdvStatusRepo(RealBitcoinEligibilityRepo realBitcoinEligibilityRepo) {
        this.bitcoinEligibilityRepo = realBitcoinEligibilityRepo;
    }

    @Override // com.squareup.cash.crypto.backend.idv.CryptoIdvStatusRepo
    public final Flow idvStatus() {
        BitcoinEligibility bitcoinEligibility = BitcoinEligibility.WITHDRAW;
        Lazy lazy = this.bitcoinEligibilityRepo.statusProvider$delegate;
        return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(new RealTransferManager$addCash$$inlined$map$1((Flow) lazy.getValue(), bitcoinEligibility, 17), new RealTransferManager$addCash$$inlined$map$1((Flow) lazy.getValue(), BitcoinEligibility.DEPOSIT, 17), new RealCryptoIdvStatusRepo$idvStatus$1(3, 4, RealCryptoIdvStatusRepo.class, this, "mapToIdvStatus", "mapToIdvStatus(Lcom/squareup/cash/crypto/backend/eligibility/BitcoinEligibilityStatus;Lcom/squareup/cash/crypto/backend/eligibility/BitcoinEligibilityStatus;)Lcom/squareup/cash/crypto/backend/idv/CryptoIdvStatus;"), 0);
    }
}

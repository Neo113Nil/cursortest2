package com.squareup.cash.clientsync.readers;

import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.protos.cryptoinvestflow.CryptoPayrollPreference;
import com.squareup.protos.document.DocumentCategoryEntity;
import com.squareup.protos.document.DocumentEntity;
import com.squareup.protos.franklin.common.SyncBusinessGrant;
import com.squareup.protos.franklin.common.SyncCryptoPayrollPreference;
import com.squareup.protos.franklin.common.SyncCustomer;
import com.squareup.protos.franklin.common.SyncEntity;
import com.squareup.protos.franklin.common.SyncInvestmentCategory;
import com.squareup.protos.franklin.common.SyncInvestmentEntity;
import com.squareup.protos.franklin.common.SyncInvestmentEntityRanking;
import com.squareup.protos.franklin.common.SyncInvestmentFilterGroup;
import com.squareup.protos.franklin.common.SyncInvestmentHolding;
import com.squareup.protos.franklin.common.SyncInvitation;
import com.squareup.protos.franklin.common.SyncLoyaltyAccount;
import com.squareup.protos.franklin.common.SyncLoyaltyProgram;
import com.squareup.protos.franklin.common.SyncPayment;
import com.squareup.protos.franklin.common.SyncReceiptEntity;
import com.squareup.protos.franklin.common.SyncRecurringPreference;
import com.squareup.protos.franklin.common.SyncRewardSelection;

/* loaded from: classes.dex */
public final class AndroidSyncEntitySpecs$Payment$1 {
    public final /* synthetic */ int $r8$classId;
    public final SyncEntityType entityType;

    public AndroidSyncEntitySpecs$Payment$1(SyncEntityType syncEntityType, int i) {
        this.$r8$classId = i;
        this.entityType = syncEntityType;
    }

    public final Object getPayload(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                SyncEntity syncEntity = (SyncEntity) obj;
                syncEntity.getClass();
                SyncPayment syncPayment = syncEntity.payment;
                syncPayment.getClass();
                return syncPayment;
            case 1:
                SyncEntity syncEntity2 = (SyncEntity) obj;
                syncEntity2.getClass();
                SyncBusinessGrant syncBusinessGrant = syncEntity2.business_grant;
                syncBusinessGrant.getClass();
                return syncBusinessGrant;
            case 2:
                SyncEntity syncEntity3 = (SyncEntity) obj;
                syncEntity3.getClass();
                SyncCryptoPayrollPreference syncCryptoPayrollPreference = syncEntity3.crypto_payroll_preference;
                syncCryptoPayrollPreference.getClass();
                CryptoPayrollPreference cryptoPayrollPreference = syncCryptoPayrollPreference.preference;
                cryptoPayrollPreference.getClass();
                return cryptoPayrollPreference;
            case 3:
                SyncEntity syncEntity4 = (SyncEntity) obj;
                syncEntity4.getClass();
                SyncCustomer syncCustomer = syncEntity4.customer;
                syncCustomer.getClass();
                return syncCustomer;
            case 4:
                SyncEntity syncEntity5 = (SyncEntity) obj;
                syncEntity5.getClass();
                DocumentCategoryEntity documentCategoryEntity = syncEntity5.document_category_entity;
                documentCategoryEntity.getClass();
                return documentCategoryEntity;
            case 5:
                SyncEntity syncEntity6 = (SyncEntity) obj;
                syncEntity6.getClass();
                DocumentEntity documentEntity = syncEntity6.document_entity;
                documentEntity.getClass();
                return documentEntity;
            case 6:
                SyncEntity syncEntity7 = (SyncEntity) obj;
                syncEntity7.getClass();
                SyncInvestmentCategory syncInvestmentCategory = syncEntity7.investment_category;
                syncInvestmentCategory.getClass();
                return syncInvestmentCategory;
            case 7:
                SyncEntity syncEntity8 = (SyncEntity) obj;
                syncEntity8.getClass();
                SyncInvestmentEntity syncInvestmentEntity = syncEntity8.investment_entity;
                syncInvestmentEntity.getClass();
                return syncInvestmentEntity;
            case 8:
                SyncEntity syncEntity9 = (SyncEntity) obj;
                syncEntity9.getClass();
                SyncInvestmentEntityRanking syncInvestmentEntityRanking = syncEntity9.investment_entity_ranking;
                syncInvestmentEntityRanking.getClass();
                return syncInvestmentEntityRanking;
            case 9:
                SyncEntity syncEntity10 = (SyncEntity) obj;
                syncEntity10.getClass();
                SyncInvestmentFilterGroup syncInvestmentFilterGroup = syncEntity10.investment_filter_group;
                syncInvestmentFilterGroup.getClass();
                return syncInvestmentFilterGroup;
            case 10:
                SyncEntity syncEntity11 = (SyncEntity) obj;
                syncEntity11.getClass();
                SyncInvestmentHolding syncInvestmentHolding = syncEntity11.investment_holding;
                syncInvestmentHolding.getClass();
                return syncInvestmentHolding;
            case 11:
                SyncEntity syncEntity12 = (SyncEntity) obj;
                syncEntity12.getClass();
                SyncInvitation syncInvitation = syncEntity12.invitation;
                syncInvitation.getClass();
                return syncInvitation;
            case 12:
                SyncEntity syncEntity13 = (SyncEntity) obj;
                syncEntity13.getClass();
                SyncPayment syncPayment2 = syncEntity13.payment;
                syncPayment2.getClass();
                return syncPayment2;
            case 13:
                SyncEntity syncEntity14 = (SyncEntity) obj;
                syncEntity14.getClass();
                SyncLoyaltyAccount syncLoyaltyAccount = syncEntity14.loyalty_account;
                syncLoyaltyAccount.getClass();
                return syncLoyaltyAccount;
            case 14:
                SyncEntity syncEntity15 = (SyncEntity) obj;
                syncEntity15.getClass();
                SyncLoyaltyProgram syncLoyaltyProgram = syncEntity15.loyalty_program;
                syncLoyaltyProgram.getClass();
                return syncLoyaltyProgram;
            case 15:
                SyncEntity syncEntity16 = (SyncEntity) obj;
                syncEntity16.getClass();
                SyncCustomer syncCustomer2 = syncEntity16.customer;
                syncCustomer2.getClass();
                return syncCustomer2;
            case 16:
                SyncEntity syncEntity17 = (SyncEntity) obj;
                syncEntity17.getClass();
                SyncReceiptEntity syncReceiptEntity = syncEntity17.receipt_entity;
                syncReceiptEntity.getClass();
                return syncReceiptEntity;
            case 17:
                SyncEntity syncEntity18 = (SyncEntity) obj;
                syncEntity18.getClass();
                SyncRecurringPreference syncRecurringPreference = syncEntity18.recurring_preference;
                syncRecurringPreference.getClass();
                return syncRecurringPreference;
            case 18:
                SyncEntity syncEntity19 = (SyncEntity) obj;
                syncEntity19.getClass();
                SyncRewardSelection syncRewardSelection = syncEntity19.reward_selection;
                syncRewardSelection.getClass();
                return syncRewardSelection;
            case 19:
                SyncEntity syncEntity20 = (SyncEntity) obj;
                syncEntity20.getClass();
                SyncPayment syncPayment3 = syncEntity20.payment;
                syncPayment3.getClass();
                return syncPayment3;
            case 20:
                SyncEntity syncEntity21 = (SyncEntity) obj;
                syncEntity21.getClass();
                SyncPayment syncPayment4 = syncEntity21.payment;
                syncPayment4.getClass();
                return syncPayment4;
            default:
                SyncEntity syncEntity22 = (SyncEntity) obj;
                syncEntity22.getClass();
                SyncPayment syncPayment5 = syncEntity22.payment;
                syncPayment5.getClass();
                return syncPayment5;
        }
    }
}

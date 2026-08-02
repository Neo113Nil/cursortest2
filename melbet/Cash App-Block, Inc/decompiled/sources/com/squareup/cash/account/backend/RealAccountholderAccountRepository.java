package com.squareup.cash.account.backend;

import androidx.datastore.core.DataStoreImpl$data$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.account.backend.AccountholderAccountRepository$GetAccountResult;
import com.squareup.cash.account.backend.AccountholderAccountRepository$LoadAccountsResult;
import com.squareup.cash.cdf.account.AccountSwitchAccountFetchAccountsError;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.protos.cash.janus.syncvalues.FullAccount;
import com.squareup.protos.cash.janus.syncvalues.SyncValueAccounts;
import com.squareup.util.coroutines.FirstOrNullOnTimeoutKt;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealAccountholderAccountRepository {
    public final RealAccountSwitchAnalytics accountSwitchAnalytics;
    public final SyncValueReader syncValueReader;

    public RealAccountholderAccountRepository(RealAccountSwitchAnalytics realAccountSwitchAnalytics, SyncValueReader syncValueReader) {
        syncValueReader.getClass();
        this.accountSwitchAnalytics = realAccountSwitchAnalytics;
        this.syncValueReader = syncValueReader;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getAccountBySwitchingIdentifier(String str, ContinuationImpl continuationImpl) {
        RealAccountholderAccountRepository$getAccountBySwitchingIdentifier$1 realAccountholderAccountRepository$getAccountBySwitchingIdentifier$1;
        int i;
        List list;
        if (continuationImpl instanceof RealAccountholderAccountRepository$getAccountBySwitchingIdentifier$1) {
            realAccountholderAccountRepository$getAccountBySwitchingIdentifier$1 = (RealAccountholderAccountRepository$getAccountBySwitchingIdentifier$1) continuationImpl;
            int i2 = realAccountholderAccountRepository$getAccountBySwitchingIdentifier$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realAccountholderAccountRepository$getAccountBySwitchingIdentifier$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realAccountholderAccountRepository$getAccountBySwitchingIdentifier$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realAccountholderAccountRepository$getAccountBySwitchingIdentifier$1.label;
                Object obj3 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realAccountholderAccountRepository$getAccountBySwitchingIdentifier$1.L$0 = str;
                    realAccountholderAccountRepository$getAccountBySwitchingIdentifier$1.label = 1;
                    obj = loadAccountsFromSyncValue(realAccountholderAccountRepository$getAccountBySwitchingIdentifier$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = realAccountholderAccountRepository$getAccountBySwitchingIdentifier$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                list = (List) obj;
                if (list != null) {
                    for (Object obj4 : list) {
                        FullAccount fullAccount = (FullAccount) obj4;
                        if (Intrinsics.areEqual(fullAccount.switching_identifier, str) || Intrinsics.areEqual(fullAccount.account_id, str)) {
                            obj3 = obj4;
                            break;
                        }
                    }
                    FullAccount fullAccount2 = (FullAccount) obj3;
                    if (fullAccount2 != null) {
                        return new AccountholderAccountRepository$GetAccountResult.Successful(fullAccount2);
                    }
                }
                return AccountholderAccountRepository$GetAccountResult.NotFound.INSTANCE;
            }
        }
        realAccountholderAccountRepository$getAccountBySwitchingIdentifier$1 = new RealAccountholderAccountRepository$getAccountBySwitchingIdentifier$1(this, continuationImpl);
        Object obj5 = realAccountholderAccountRepository$getAccountBySwitchingIdentifier$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAccountholderAccountRepository$getAccountBySwitchingIdentifier$1.label;
        Object obj32 = null;
        if (i != 0) {
        }
        list = (List) obj5;
        if (list != null) {
        }
        return AccountholderAccountRepository$GetAccountResult.NotFound.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadAccounts(ContinuationImpl continuationImpl) {
        RealAccountholderAccountRepository$loadAccounts$1 realAccountholderAccountRepository$loadAccounts$1;
        int i;
        if (continuationImpl instanceof RealAccountholderAccountRepository$loadAccounts$1) {
            realAccountholderAccountRepository$loadAccounts$1 = (RealAccountholderAccountRepository$loadAccounts$1) continuationImpl;
            int i2 = realAccountholderAccountRepository$loadAccounts$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realAccountholderAccountRepository$loadAccounts$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realAccountholderAccountRepository$loadAccounts$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realAccountholderAccountRepository$loadAccounts$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realAccountholderAccountRepository$loadAccounts$1.label = 1;
                    obj = loadAccountsFromSyncValue(realAccountholderAccountRepository$loadAccounts$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                List list = (List) obj;
                return list != null ? AccountholderAccountRepository$LoadAccountsResult.Failure.INSTANCE : new AccountholderAccountRepository$LoadAccountsResult.Successful(list);
            }
        }
        realAccountholderAccountRepository$loadAccounts$1 = new RealAccountholderAccountRepository$loadAccounts$1(this, continuationImpl);
        Object obj3 = realAccountholderAccountRepository$loadAccounts$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAccountholderAccountRepository$loadAccounts$1.label;
        if (i != 0) {
        }
        List list2 = (List) obj3;
        if (list2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadAccountsFromSyncValue(ContinuationImpl continuationImpl) {
        RealAccountholderAccountRepository$loadAccountsFromSyncValue$1 realAccountholderAccountRepository$loadAccountsFromSyncValue$1;
        int i;
        SyncValueAccounts syncValueAccounts;
        Analytics analytics = this.accountSwitchAnalytics.analytics;
        if (continuationImpl instanceof RealAccountholderAccountRepository$loadAccountsFromSyncValue$1) {
            realAccountholderAccountRepository$loadAccountsFromSyncValue$1 = (RealAccountholderAccountRepository$loadAccountsFromSyncValue$1) continuationImpl;
            int i2 = realAccountholderAccountRepository$loadAccountsFromSyncValue$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realAccountholderAccountRepository$loadAccountsFromSyncValue$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realAccountholderAccountRepository$loadAccountsFromSyncValue$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realAccountholderAccountRepository$loadAccountsFromSyncValue$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    StateFlow singleValue = this.syncValueReader.getSingleValue(AndroidSyncValueSpecs.Accounts);
                    DataStoreImpl$data$1.AnonymousClass2 anonymousClass2 = new DataStoreImpl$data$1.AnonymousClass2(9);
                    realAccountholderAccountRepository$loadAccountsFromSyncValue$1.label = 1;
                    obj = FirstOrNullOnTimeoutKt.firstOrNullWithTimeout(singleValue, anonymousClass2, realAccountholderAccountRepository$loadAccountsFromSyncValue$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                syncValueAccounts = (SyncValueAccounts) obj;
                if (syncValueAccounts != null) {
                    analytics.track(new AccountSwitchAccountFetchAccountsError("SyncValue for accounts wasn't found", String.valueOf(1)), null);
                    return null;
                }
                List list = syncValueAccounts.accounts;
                if (list.isEmpty()) {
                    analytics.track(new AccountSwitchAccountFetchAccountsError("SyncValue for accounts had an empty accountsArray", String.valueOf(2)), null);
                }
                return list;
            }
        }
        realAccountholderAccountRepository$loadAccountsFromSyncValue$1 = new RealAccountholderAccountRepository$loadAccountsFromSyncValue$1(this, continuationImpl);
        Object obj2 = realAccountholderAccountRepository$loadAccountsFromSyncValue$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAccountholderAccountRepository$loadAccountsFromSyncValue$1.label;
        if (i != 0) {
        }
        syncValueAccounts = (SyncValueAccounts) obj2;
        if (syncValueAccounts != null) {
        }
    }
}

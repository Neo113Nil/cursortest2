package com.squareup.cash.blockers.presenters;

import app.cash.paraphrase.FormattedResource;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.account.backend.AccountholderAccountRepository$LoadAccountsResult;
import com.squareup.cash.account.backend.RealAccountholderAccountRepository;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class RealPinScreensTitleGenerator {
    public static final long DATA_READ_TIMEOUT;
    public final RealAccountholderAccountRepository accountholderAccountRepository;
    public final RealP2pSettingsManager p2pSettingsManager;
    public final RealProfileManager profileManager;
    public final AndroidStringManager stringManager;
    public final TitleTemplates titleTemplates;

    static {
        Duration.Companion companion = Duration.Companion;
        DATA_READ_TIMEOUT = DurationKt.toDuration(100, DurationUnit.MILLISECONDS);
    }

    public RealPinScreensTitleGenerator(RealP2pSettingsManager realP2pSettingsManager, RealProfileManager realProfileManager, AndroidStringManager androidStringManager, RealAccountholderAccountRepository realAccountholderAccountRepository, TitleTemplates titleTemplates) {
        this.p2pSettingsManager = realP2pSettingsManager;
        this.profileManager = realProfileManager;
        this.stringManager = androidStringManager;
        this.accountholderAccountRepository = realAccountholderAccountRepository;
        this.titleTemplates = titleTemplates;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0056, code lost:
    
        if (r13 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object generateTitle(String str, ContinuationImpl continuationImpl) {
        RealPinScreensTitleGenerator$generateTitle$1 realPinScreensTitleGenerator$generateTitle$1;
        int i;
        AccountholderAccountRepository$LoadAccountsResult accountholderAccountRepository$LoadAccountsResult;
        int i2;
        String str2;
        int i3;
        Object m4185withTimeoutOrNullKLykuaI;
        String str3;
        String str4;
        if (continuationImpl instanceof RealPinScreensTitleGenerator$generateTitle$1) {
            realPinScreensTitleGenerator$generateTitle$1 = (RealPinScreensTitleGenerator$generateTitle$1) continuationImpl;
            int i4 = realPinScreensTitleGenerator$generateTitle$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                realPinScreensTitleGenerator$generateTitle$1.label = i4 - PKIFailureInfo.systemUnavail;
                Object obj = realPinScreensTitleGenerator$generateTitle$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPinScreensTitleGenerator$generateTitle$1.label;
                Continuation continuation = null;
                long j = DATA_READ_TIMEOUT;
                int i5 = 1;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realPinScreensTitleGenerator$generateTitle$1.L$0 = str;
                    realPinScreensTitleGenerator$generateTitle$1.label = 1;
                    obj = this.accountholderAccountRepository.loadAccounts(realPinScreensTitleGenerator$generateTitle$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            str3 = realPinScreensTitleGenerator$generateTitle$1.L$1;
                            str4 = realPinScreensTitleGenerator$generateTitle$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                            Boolean bool = (Boolean) obj;
                            if (str3 != null || bool == null) {
                                return str4;
                            }
                            TitleTemplates titleTemplates = this.titleTemplates;
                            return this.stringManager.getString(bool.booleanValue() ? (FormattedResource) titleTemplates.businessAccountTitleTemplate.invoke(str4, str3) : (FormattedResource) titleTemplates.personalAccountTitleTemplate.invoke(str4, str3));
                        }
                        i3 = realPinScreensTitleGenerator$generateTitle$1.I$0;
                        str2 = realPinScreensTitleGenerator$generateTitle$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        String str5 = (String) obj;
                        RealPinScreensTitleGenerator$generateTitle$cashtag$1 realPinScreensTitleGenerator$generateTitle$cashtag$1 = new RealPinScreensTitleGenerator$generateTitle$cashtag$1(this, continuation, i5);
                        realPinScreensTitleGenerator$generateTitle$1.L$0 = str2;
                        realPinScreensTitleGenerator$generateTitle$1.L$1 = str5;
                        realPinScreensTitleGenerator$generateTitle$1.I$0 = i3;
                        realPinScreensTitleGenerator$generateTitle$1.label = 3;
                        m4185withTimeoutOrNullKLykuaI = JobKt.m4185withTimeoutOrNullKLykuaI(j, realPinScreensTitleGenerator$generateTitle$cashtag$1, realPinScreensTitleGenerator$generateTitle$1);
                        if (m4185withTimeoutOrNullKLykuaI != coroutineSingletons) {
                            obj = m4185withTimeoutOrNullKLykuaI;
                            str3 = str5;
                            str4 = str2;
                            Boolean bool2 = (Boolean) obj;
                            if (str3 != null) {
                            }
                            return str4;
                        }
                        return coroutineSingletons;
                    }
                    str = realPinScreensTitleGenerator$generateTitle$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                accountholderAccountRepository$LoadAccountsResult = (AccountholderAccountRepository$LoadAccountsResult) obj;
                int i6 = 0;
                if (!(accountholderAccountRepository$LoadAccountsResult instanceof AccountholderAccountRepository$LoadAccountsResult.Successful)) {
                    i2 = ((AccountholderAccountRepository$LoadAccountsResult.Successful) accountholderAccountRepository$LoadAccountsResult).accounts.size();
                } else {
                    if (!(accountholderAccountRepository$LoadAccountsResult instanceof AccountholderAccountRepository$LoadAccountsResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    i2 = 0;
                }
                if (i2 > 1) {
                    return str;
                }
                RealPinScreensTitleGenerator$generateTitle$cashtag$1 realPinScreensTitleGenerator$generateTitle$cashtag$12 = new RealPinScreensTitleGenerator$generateTitle$cashtag$1(this, continuation, i6);
                realPinScreensTitleGenerator$generateTitle$1.L$0 = str;
                realPinScreensTitleGenerator$generateTitle$1.I$0 = i2;
                realPinScreensTitleGenerator$generateTitle$1.label = 2;
                Object m4185withTimeoutOrNullKLykuaI2 = JobKt.m4185withTimeoutOrNullKLykuaI(j, realPinScreensTitleGenerator$generateTitle$cashtag$12, realPinScreensTitleGenerator$generateTitle$1);
                if (m4185withTimeoutOrNullKLykuaI2 != coroutineSingletons) {
                    str2 = str;
                    i3 = i2;
                    obj = m4185withTimeoutOrNullKLykuaI2;
                    String str52 = (String) obj;
                    RealPinScreensTitleGenerator$generateTitle$cashtag$1 realPinScreensTitleGenerator$generateTitle$cashtag$13 = new RealPinScreensTitleGenerator$generateTitle$cashtag$1(this, continuation, i5);
                    realPinScreensTitleGenerator$generateTitle$1.L$0 = str2;
                    realPinScreensTitleGenerator$generateTitle$1.L$1 = str52;
                    realPinScreensTitleGenerator$generateTitle$1.I$0 = i3;
                    realPinScreensTitleGenerator$generateTitle$1.label = 3;
                    m4185withTimeoutOrNullKLykuaI = JobKt.m4185withTimeoutOrNullKLykuaI(j, realPinScreensTitleGenerator$generateTitle$cashtag$13, realPinScreensTitleGenerator$generateTitle$1);
                    if (m4185withTimeoutOrNullKLykuaI != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        realPinScreensTitleGenerator$generateTitle$1 = new RealPinScreensTitleGenerator$generateTitle$1(this, continuationImpl);
        Object obj2 = realPinScreensTitleGenerator$generateTitle$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPinScreensTitleGenerator$generateTitle$1.label;
        Continuation continuation2 = null;
        long j2 = DATA_READ_TIMEOUT;
        int i52 = 1;
        if (i != 0) {
        }
        accountholderAccountRepository$LoadAccountsResult = (AccountholderAccountRepository$LoadAccountsResult) obj2;
        int i62 = 0;
        if (!(accountholderAccountRepository$LoadAccountsResult instanceof AccountholderAccountRepository$LoadAccountsResult.Successful)) {
        }
        if (i2 > 1) {
        }
    }
}

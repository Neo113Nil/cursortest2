package com.squareup.cash.profile.repo.real;

import app.cash.api.ApiResult;
import app.cash.local.primitives.math.LocalMoneysKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.api.AsyncResult;
import com.squareup.cash.data.contacts.ContactsStatus;
import com.squareup.cash.data.contacts.RealContactRepository;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.contacts.ContactQueries;
import com.squareup.cash.db2.profile.LocalContactProfile;
import com.squareup.cash.multiplatform.accentcolors.AccentColorsKt;
import com.squareup.cash.pools.presenters.PoolsListPresenter$models$2$2;
import com.squareup.cash.profile.repo.api.CustomerProfileData;
import com.squareup.cash.profile.repo.api.CustomerProfileDetails;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.screens.Redacted;
import com.squareup.protos.cash.cashface.api.CashFaceClientService;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsContext;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsResponse;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsResponse$EntityData$CustomerData;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsResponse$EntityData$MerchantData;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.util.cash.ColorsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealProfileRepo {
    public final CashFaceClientService appService;
    public final Map categoryNameMap;
    public final RealContactRepository contactRepository;
    public final ContactQueries customerProfileQueries;
    public final InstrumentQueries extendedProfileDetailsQueries;
    public final CoroutineContext ioDispatcher;

    public RealProfileRepo(CashFaceClientService cashFaceClientService, RealContactRepository realContactRepository, CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineContext coroutineContext, Map map) {
        this.appService = cashFaceClientService;
        this.contactRepository = realContactRepository;
        this.ioDispatcher = coroutineContext;
        this.categoryNameMap = map;
        this.customerProfileQueries = cashAccountDatabaseImpl.customerProfileQueries;
        this.extendedProfileDetailsQueries = cashAccountDatabaseImpl.extendedProfileDetailsQueries;
    }

    public static SafeFlow customerDetails$default(RealProfileRepo realProfileRepo, ProfileScreens.ProfileScreen.Customer customer, boolean z, GetProfileDetailsContext getProfileDetailsContext, boolean z2) {
        customer.getClass();
        getProfileDetailsContext.getClass();
        return new SafeFlow(new RealProfileRepo$customerDetails$1(customer, realProfileRepo, getProfileDetailsContext, z, z2, null));
    }

    public static CustomerProfileData toCustomerProfileData(LocalContactProfile localContactProfile) {
        return new CustomerProfileData((String) null, localContactProfile.lookup_key, localContactProfile.display_name, (String) null, localContactProfile.email, localContactProfile.sms, (Image) null, false, ContactsStatus.IN_CONTACTS, false, false, (Color) null, (Region) null, (Long) null, (BlockState) null, false, (String) null, (Boolean) null, (Boolean) null, (String) null, 2096841);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object customerData(ProfileScreens.ProfileScreen.Customer customer, boolean z, GetProfileDetailsContext getProfileDetailsContext, ContinuationImpl continuationImpl) {
        RealProfileRepo$customerData$1 realProfileRepo$customerData$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        ProfileScreens.ProfileScreen.Customer customer2;
        ProfileScreens.ProfileScreen.Customer customer3;
        boolean z2;
        CustomerProfileDetails customerProfileDetails;
        CustomerProfileData customerProfileData;
        CustomerProfileData customerProfileData2;
        CustomerProfileData customerProfileData3;
        ProfileScreens.ProfileScreen.Customer customer4;
        boolean z3;
        int i2;
        CustomerProfileData customerProfileData4;
        Boolean bool;
        ContactsStatus contactsStatus;
        LocalContactProfile localContactProfile;
        CustomerProfileData customerProfileData5;
        Redacted redacted;
        Redacted redacted2;
        if (continuationImpl instanceof RealProfileRepo$customerData$1) {
            realProfileRepo$customerData$1 = (RealProfileRepo$customerData$1) continuationImpl;
            int i3 = realProfileRepo$customerData$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                realProfileRepo$customerData$1.label = i3 - PKIFailureInfo.systemUnavail;
                RealProfileRepo$customerData$1 realProfileRepo$customerData$12 = realProfileRepo$customerData$1;
                obj = realProfileRepo$customerData$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realProfileRepo$customerData$12.label;
                RealContactRepository realContactRepository = this.contactRepository;
                ?? r13 = 0;
                String str = 0;
                r5 = null;
                ProfileScreens.ProfileScreen.Customer customer5 = null;
                str = 0;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    boolean z4 = customer instanceof ProfileScreens.ProfileScreen.Customer.CashCustomer;
                    CoroutineContext coroutineContext = this.ioDispatcher;
                    if (z4) {
                        realProfileRepo$customerData$12.L$0 = customer;
                        realProfileRepo$customerData$12.Z$0 = z;
                        realProfileRepo$customerData$12.label = 1;
                        PoolsListPresenter$models$2$2 poolsListPresenter$models$2$2 = new PoolsListPresenter$models$2$2((ProfileScreens.ProfileScreen.Customer.CashCustomer) customer, this, getProfileDetailsContext, (Continuation) str, 17);
                        customer5 = null;
                        obj = JobKt.withContext(coroutineContext, poolsListPresenter$models$2$2, realProfileRepo$customerData$12);
                        if (obj != coroutineSingletons) {
                            customer3 = customer;
                            z2 = z;
                            customerProfileDetails = (CustomerProfileDetails) obj;
                            if (customerProfileDetails != null) {
                            }
                            Exception exc = new Exception("Cash customer not found");
                            new ApiResult.Failure.NetworkFailure(exc);
                            return new AsyncResult.Failure(exc);
                        }
                    } else {
                        if (!(customer instanceof ProfileScreens.ProfileScreen.Customer.NonCashCustomer)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        RealProfileRepo$customerData$profile$1 realProfileRepo$customerData$profile$1 = new RealProfileRepo$customerData$profile$1(this, customer, str, r13 == true ? 1 : 0);
                        realProfileRepo$customerData$12.L$0 = customer;
                        realProfileRepo$customerData$12.Z$0 = z;
                        realProfileRepo$customerData$12.label = 4;
                        obj = JobKt.withContext(coroutineContext, realProfileRepo$customerData$profile$1, realProfileRepo$customerData$12);
                        if (obj != coroutineSingletons) {
                            customer2 = customer;
                            localContactProfile = (LocalContactProfile) obj;
                            if (localContactProfile == null) {
                            }
                            new ApiResult.Success(customerProfileData5);
                            return new AsyncResult.Success(customerProfileData5);
                        }
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    z2 = realProfileRepo$customerData$12.Z$0;
                    customer3 = realProfileRepo$customerData$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                    customerProfileDetails = (CustomerProfileDetails) obj;
                    if (customerProfileDetails != null || (customerProfileData = customerProfileDetails.customerProfileData) == null) {
                        Exception exc2 = new Exception("Cash customer not found");
                        new ApiResult.Failure.NetworkFailure(exc2);
                        return new AsyncResult.Failure(exc2);
                    }
                    if (z2) {
                        Flow shouldShowConfirm = realContactRepository.shouldShowConfirm(customerProfileData.toRecipient());
                        realProfileRepo$customerData$12.L$0 = customer3;
                        realProfileRepo$customerData$12.L$2 = customerProfileData;
                        realProfileRepo$customerData$12.Z$0 = z2;
                        realProfileRepo$customerData$12.label = 2;
                        Object firstOrNull = FlowKt.firstOrNull(shouldShowConfirm, realProfileRepo$customerData$12);
                        if (firstOrNull != coroutineSingletons) {
                            ProfileScreens.ProfileScreen.Customer customer6 = customer3;
                            customerProfileData3 = customerProfileData;
                            obj = firstOrNull;
                            customer4 = customer6;
                            bool = (Boolean) obj;
                            if (bool == null) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    customerProfileData2 = customerProfileData;
                    z3 = z2;
                    i2 = 0;
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            i2 = realProfileRepo$customerData$12.I$0;
                            customerProfileData4 = realProfileRepo$customerData$12.L$2;
                            SafeTrace.throwOnFailure(obj);
                            contactsStatus = (ContactsStatus) obj;
                            if (contactsStatus == null) {
                                contactsStatus = ContactsStatus.NOT_IN_CONTACTS;
                            }
                            CustomerProfileData copy$default = CustomerProfileData.copy$default(customerProfileData4, contactsStatus, i2 != 0);
                            new ApiResult.Success(copy$default);
                            return new AsyncResult.Success(copy$default);
                        }
                        if (i != 4) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        customer2 = realProfileRepo$customerData$12.L$0;
                        SafeTrace.throwOnFailure(obj);
                        localContactProfile = (LocalContactProfile) obj;
                        if (localContactProfile == null) {
                            customerProfileData5 = toCustomerProfileData(localContactProfile);
                        } else {
                            ProfileScreens.ProfileScreen.Customer.NonCashCustomer.WithEmail withEmail = customer2 instanceof ProfileScreens.ProfileScreen.Customer.NonCashCustomer.WithEmail ? (ProfileScreens.ProfileScreen.Customer.NonCashCustomer.WithEmail) customer2 : null;
                            String str2 = (withEmail == null || (redacted2 = withEmail.alias) == null) ? null : (String) redacted2.getValue();
                            ProfileScreens.ProfileScreen.Customer.NonCashCustomer.WithPhoneNumber withPhoneNumber = customer2 instanceof ProfileScreens.ProfileScreen.Customer.NonCashCustomer.WithPhoneNumber ? (ProfileScreens.ProfileScreen.Customer.NonCashCustomer.WithPhoneNumber) customer2 : null;
                            if (withPhoneNumber != null && (redacted = withPhoneNumber.alias) != null) {
                                str = (String) redacted.getValue();
                            }
                            customerProfileData5 = new CustomerProfileData((String) null, (String) null, (String) null, (String) null, str2, str, (Image) null, false, (ContactsStatus) null, false, false, (Color) null, (Region) null, (Long) null, (BlockState) null, false, (String) null, (Boolean) null, (Boolean) null, (String) null, 2097103);
                        }
                        new ApiResult.Success(customerProfileData5);
                        return new AsyncResult.Success(customerProfileData5);
                    }
                    z2 = realProfileRepo$customerData$12.Z$0;
                    customerProfileData3 = realProfileRepo$customerData$12.L$2;
                    customer4 = realProfileRepo$customerData$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                    bool = (Boolean) obj;
                    if (bool == null) {
                        boolean z5 = z2;
                        i2 = bool.booleanValue() ? 1 : 0;
                        z3 = z5;
                        ProfileScreens.ProfileScreen.Customer customer7 = customer4;
                        customerProfileData2 = customerProfileData3;
                        customer3 = customer7;
                    } else {
                        ProfileScreens.ProfileScreen.Customer customer8 = customer4;
                        customerProfileData2 = customerProfileData3;
                        customer3 = customer8;
                        z3 = z2;
                        i2 = 0;
                    }
                }
                Flow contactsStatusForCustomer = realContactRepository.contactsStatusForCustomer((String) ((ProfileScreens.ProfileScreen.Customer.CashCustomer) customer3).customerId.getValue());
                realProfileRepo$customerData$12.L$0 = customer5;
                realProfileRepo$customerData$12.L$2 = customerProfileData2;
                realProfileRepo$customerData$12.Z$0 = z3;
                realProfileRepo$customerData$12.I$0 = i2;
                realProfileRepo$customerData$12.label = 3;
                obj = FlowKt.firstOrNull(contactsStatusForCustomer, realProfileRepo$customerData$12);
                if (obj != coroutineSingletons) {
                    customerProfileData4 = customerProfileData2;
                    contactsStatus = (ContactsStatus) obj;
                    if (contactsStatus == null) {
                    }
                    CustomerProfileData copy$default2 = CustomerProfileData.copy$default(customerProfileData4, contactsStatus, i2 != 0);
                    new ApiResult.Success(copy$default2);
                    return new AsyncResult.Success(copy$default2);
                }
                return coroutineSingletons;
            }
        }
        realProfileRepo$customerData$1 = new RealProfileRepo$customerData$1(this, continuationImpl);
        RealProfileRepo$customerData$1 realProfileRepo$customerData$122 = realProfileRepo$customerData$1;
        obj = realProfileRepo$customerData$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realProfileRepo$customerData$122.label;
        RealContactRepository realContactRepository2 = this.contactRepository;
        ?? r132 = 0;
        String str3 = 0;
        customer5 = null;
        ProfileScreens.ProfileScreen.Customer customer52 = null;
        str3 = 0;
        if (i != 0) {
        }
        Flow contactsStatusForCustomer2 = realContactRepository2.contactsStatusForCustomer((String) ((ProfileScreens.ProfileScreen.Customer.CashCustomer) customer3).customerId.getValue());
        realProfileRepo$customerData$122.L$0 = customer52;
        realProfileRepo$customerData$122.L$2 = customerProfileData2;
        realProfileRepo$customerData$122.Z$0 = z3;
        realProfileRepo$customerData$122.I$0 = i2;
        realProfileRepo$customerData$122.label = 3;
        obj = FlowKt.firstOrNull(contactsStatusForCustomer2, realProfileRepo$customerData$122);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public final CustomerProfileData customerProfileData(GetProfileDetailsResponse getProfileDetailsResponse, String str, String str2, String str3, ContactsStatus contactsStatus) {
        getProfileDetailsResponse.getClass();
        LocalMoneysKt localMoneysKt = getProfileDetailsResponse.entity_data;
        if (localMoneysKt instanceof GetProfileDetailsResponse$EntityData$MerchantData) {
            if (str != null) {
                GetProfileDetailsResponse.MerchantData merchantData = ((GetProfileDetailsResponse$EntityData$MerchantData) localMoneysKt).value;
                String str4 = merchantData.merchant_token;
                String str5 = str4 == null ? str : str4;
                String str6 = merchantData.name;
                GetProfileDetailsResponse.MerchantData.MerchantProfileImage merchantProfileImage = merchantData.merchant_logo_url;
                Image image = merchantProfileImage != null ? new Image(merchantProfileImage.light_url, merchantProfileImage.dark_url, 4) : null;
                Color color = merchantData.brand_color;
                Map map = this.categoryNameMap;
                String str7 = merchantData.canonical_category;
                return new CustomerProfileData(str5, (String) null, str6, (String) null, str3, str2, image, false, contactsStatus == null ? ContactsStatus.NOT_IN_CONTACTS : contactsStatus, false, false, color, (Region) null, (Long) null, (BlockState) null, true, (String) map.getOrDefault(str7, str7), merchantData.should_colorize_avatar, Boolean.FALSE, (String) null, 1143434);
            }
        } else if (localMoneysKt instanceof GetProfileDetailsResponse$EntityData$CustomerData) {
            if (str != null) {
                GetProfileDetailsResponse.CustomerData customerData = ((GetProfileDetailsResponse$EntityData$CustomerData) localMoneysKt).value;
                customerData.getClass();
                String str8 = customerData.display_name;
                String str9 = customerData.cashtag;
                Image image2 = customerData.photo;
                ContactsStatus contactsStatus2 = contactsStatus == null ? ContactsStatus.NOT_IN_CONTACTS : contactsStatus;
                Boolean bool = customerData.is_cash_customer;
                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                Boolean bool2 = customerData.is_business;
                boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                Boolean bool3 = customerData.is_verified;
                return new CustomerProfileData(str, (String) null, str8, str9, str3, str2, image2, booleanValue, contactsStatus2, booleanValue2, bool3 != null ? bool3.booleanValue() : false, ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(1, null, str, customerData.display_name, str2, str3)), customerData.region, customerData.credit_card_bps_fee_override != null ? Long.valueOf(r5.intValue()) : null, customerData.blocked_state, false, (String) null, (Boolean) null, customerData.can_accept_payments, customerData.business_category, 65538);
            }
        } else if (localMoneysKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        return null;
    }
}

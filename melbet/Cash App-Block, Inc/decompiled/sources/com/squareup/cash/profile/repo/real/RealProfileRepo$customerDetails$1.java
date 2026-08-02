package com.squareup.cash.profile.repo.real;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.api.AsyncResult;
import com.squareup.cash.data.contacts.ContactsStatus;
import com.squareup.cash.db2.profile.ExtendedProfileDetails;
import com.squareup.cash.db2.profile.LocalContactProfile;
import com.squareup.cash.pools.presenters.PoolsListPresenter$models$2$2;
import com.squareup.cash.profile.repo.api.CustomerProfileData;
import com.squareup.cash.profile.repo.api.CustomerProfileDetails;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.views.ProfileCropView;
import com.squareup.cash.profile.views.RingtoneView;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.storage.AndroidFileSaver$save$2;
import com.squareup.protos.cash.cashface.api.CashFaceClientService;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsContext;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsRequest;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsResponse;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.ui.BlockState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealProfileRepo$customerDetails$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ boolean $confirmRecipient;
    public final /* synthetic */ ProfileScreens.ProfileScreen.Customer $customer;
    public final /* synthetic */ boolean $loadInitialDetailsFromCache;
    public final /* synthetic */ GetProfileDetailsContext $originContext;
    public int I$0;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Ref$ObjectRef L$3;
    public Object L$4;
    public Object L$5;
    public Object L$7;
    public CustomerProfileData L$8;
    public int label;
    public final /* synthetic */ RealProfileRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealProfileRepo$customerDetails$1(ProfileScreens.ProfileScreen.Customer customer, RealProfileRepo realProfileRepo, GetProfileDetailsContext getProfileDetailsContext, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.$customer = customer;
        this.this$0 = realProfileRepo;
        this.$originContext = getProfileDetailsContext;
        this.$confirmRecipient = z;
        this.$loadInitialDetailsFromCache = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RealProfileRepo$customerDetails$1 realProfileRepo$customerDetails$1 = new RealProfileRepo$customerDetails$1(this.$customer, this.this$0, this.$originContext, this.$confirmRecipient, this.$loadInitialDetailsFromCache, continuation);
        realProfileRepo$customerDetails$1.L$0 = obj;
        return realProfileRepo$customerDetails$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealProfileRepo$customerDetails$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x02e7, code lost:
    
        if (r8.emit(r2, r42) == r9) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x04b3, code lost:
    
        if (r8.emit(r1, r42) == r9) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x01d0, code lost:
    
        if (r4 == r9) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0234, code lost:
    
        if (r8.emit(r3, r42) == r9) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0253, code lost:
    
        if (r2 == r9) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0177, code lost:
    
        if (r8.emit(r14, r42) == r9) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x04ed, code lost:
    
        if (r8.emit(r14, r42) == r9) goto L183;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0314 A[Catch: IllegalStateException -> 0x034f, TRY_LEAVE, TryCatch #0 {IllegalStateException -> 0x034f, blocks: (B:98:0x0310, B:100:0x0314), top: B:97:0x0310 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0340 A[Catch: IllegalStateException -> 0x0343, TryCatch #3 {IllegalStateException -> 0x0343, blocks: (B:72:0x033c, B:74:0x0340, B:75:0x0347), top: B:71:0x033c }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0358 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.coroutines.Continuation, kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.coroutines.Continuation, kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v69 */
    /* JADX WARN: Type inference failed for: r1v70 */
    /* JADX WARN: Type inference failed for: r1v9, types: [kotlin.coroutines.Continuation, kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20, types: [com.squareup.cash.profile.screens.ProfileScreens$ProfileScreen$Customer$NonCashCustomer$WithEmail] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22, types: [com.squareup.cash.profile.screens.ProfileScreens$ProfileScreen$Customer$NonCashCustomer$WithPhoneNumber] */
    /* JADX WARN: Type inference failed for: r5v26, types: [com.squareup.cash.profile.screens.ProfileScreens$ProfileScreen$Customer$NonCashCustomer$WithPhoneNumber] */
    /* JADX WARN: Type inference failed for: r5v30, types: [com.squareup.cash.profile.screens.ProfileScreens$ProfileScreen$Customer$NonCashCustomer$WithEmail] */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v62, types: [java.lang.Object, kotlin.coroutines.Continuation, kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r5v68, types: [com.squareup.cash.profile.repo.api.CustomerProfileData, java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r5v72 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Ref$ObjectRef ref$ObjectRef;
        ProfileScreens.ProfileScreen.Customer customer;
        RealProfileRepo realProfileRepo;
        CustomerProfileDetails customerProfileDetails;
        Object withContext;
        ProfileScreens.ProfileScreen.Customer customer2;
        ?? r1;
        Object withContext2;
        Ref$ObjectRef ref$ObjectRef2;
        CustomerProfileDetails customerProfileDetails2;
        CustomerProfileData customerProfileData;
        CustomerProfileData customerProfileData2;
        int i;
        Object withContext3;
        ?? r12;
        Object withContext4;
        Ref$ObjectRef ref$ObjectRef3;
        boolean z;
        boolean z2;
        CustomerProfileData copy$default;
        CustomerProfileDetails customerProfileDetails3;
        ?? r13;
        CustomerProfileData customerProfileData3;
        String str;
        Object withContext5;
        Ref$ObjectRef ref$ObjectRef4;
        Redacted redacted;
        Redacted redacted2;
        String str2;
        CustomerProfileDetails customerProfileDetails4;
        ExtendedProfileDetails extendedProfileDetails;
        ExtendedProfileDetails extendedProfileDetails2;
        Object firstOrNull;
        Ref$ObjectRef ref$ObjectRef5;
        CustomerProfileDetails customerProfileDetails5;
        ExtendedProfileDetails extendedProfileDetails3;
        ExtendedProfileDetails extendedProfileDetails4;
        CoroutineContext coroutineContext;
        boolean z3;
        AsyncResult.Loading loading;
        ?? r7;
        String str3;
        ExtendedProfileDetails extendedProfileDetails5;
        Ref$ObjectRef ref$ObjectRef6;
        CustomerProfileDetails customerProfileDetails6;
        CustomerProfileData customerProfileData4;
        String str4;
        Ref$ObjectRef ref$ObjectRef7;
        CustomerProfileData customerProfileData5;
        CustomerProfileDetails customerProfileDetails7;
        ExtendedProfileDetails extendedProfileDetails6;
        ContactsStatus contactsStatus;
        int ordinal;
        com.squareup.protos.cash.cashface.api.ContactsStatus contactsStatus2;
        Object profileDetails;
        CustomerProfileData customerProfileData6;
        CustomerProfileDetails customerProfileDetails8;
        String str5;
        ApiResult apiResult;
        AsyncResult success;
        Object failure;
        ?? r5;
        CustomerProfileData customerProfileData7;
        AsyncResult asyncResult;
        boolean z4;
        RealProfileRepo realProfileRepo2 = this.this$0;
        CoroutineContext coroutineContext2 = realProfileRepo2.ioDispatcher;
        FlowCollector flowCollector = (FlowCollector) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        int i3 = 5;
        boolean z5 = this.$loadInitialDetailsFromCache;
        AsyncResult.Loading loading2 = AsyncResult.Loading.INSTANCE;
        ProfileScreens.ProfileScreen.Customer customer3 = this.$customer;
        switch (i2) {
            case 0:
                obj2 = null;
                SafeTrace.throwOnFailure(obj);
                this.L$0 = flowCollector;
                this.label = 1;
                break;
            case 1:
                obj2 = null;
                SafeTrace.throwOnFailure(obj);
                ref$ObjectRef = new Ref$ObjectRef();
                ref$ObjectRef.element = ContactsStatus.NOT_IN_CONTACTS;
                if (customer3 instanceof ProfileScreens.ProfileScreen.Customer.CashCustomer) {
                    ProfileScreens.ProfileScreen.Customer.CashCustomer cashCustomer = (ProfileScreens.ProfileScreen.Customer.CashCustomer) customer3;
                    this.L$0 = flowCollector;
                    this.L$1 = ref$ObjectRef;
                    this.label = 2;
                    realProfileRepo = realProfileRepo2;
                    customer2 = customer3;
                    r1 = 0;
                    withContext2 = JobKt.withContext(coroutineContext2, new PoolsListPresenter$models$2$2(cashCustomer, realProfileRepo, this.$originContext, (Continuation) null, 17), this);
                    if (withContext2 != coroutineSingletons) {
                        ref$ObjectRef2 = ref$ObjectRef;
                        customerProfileDetails2 = (CustomerProfileDetails) withContext2;
                        if (customerProfileDetails2 != null) {
                            Exception exc = new Exception("Cash customer not found");
                            new ApiResult.Failure.NetworkFailure(exc);
                            AsyncResult.Failure failure2 = new AsyncResult.Failure(exc);
                            this.L$0 = r1;
                            this.L$1 = r1;
                            this.L$2 = r1;
                            this.label = 3;
                            break;
                        } else {
                            customerProfileData = customerProfileDetails2.customerProfileData;
                            if (this.$confirmRecipient) {
                                RingtoneView.AnonymousClass1 anonymousClass1 = new RingtoneView.AnonymousClass1(realProfileRepo, customerProfileData, r1, 23);
                                this.L$0 = flowCollector;
                                this.L$1 = customerProfileDetails2;
                                this.L$2 = ref$ObjectRef2;
                                this.L$3 = r1;
                                this.L$4 = customerProfileData;
                                this.label = 4;
                                withContext3 = JobKt.withContext(coroutineContext2, anonymousClass1, this);
                                z = r1;
                                break;
                            } else {
                                customerProfileData2 = customerProfileData;
                                i = 0;
                                r12 = r1;
                                RingtoneView.AnonymousClass1 anonymousClass12 = new RingtoneView.AnonymousClass1(realProfileRepo, customer2, r12, 22);
                                this.L$0 = flowCollector;
                                this.L$1 = customerProfileDetails2;
                                this.L$2 = ref$ObjectRef2;
                                this.L$3 = r12;
                                this.L$4 = customerProfileData2;
                                this.L$5 = ref$ObjectRef2;
                                this.I$0 = i;
                                this.label = 5;
                                withContext4 = JobKt.withContext(coroutineContext2, anonymousClass12, this);
                                if (withContext4 != coroutineSingletons) {
                                    ref$ObjectRef3 = ref$ObjectRef2;
                                    z2 = r12;
                                    ref$ObjectRef2.element = withContext4;
                                    copy$default = CustomerProfileData.copy$default(customerProfileData2, (ContactsStatus) ref$ObjectRef3.element, i == 0);
                                    customerProfileDetails3 = customerProfileDetails2;
                                    ref$ObjectRef = ref$ObjectRef3;
                                    r13 = z2;
                                    customerProfileData3 = copy$default;
                                    if ((customerProfileDetails3 != null ? customerProfileDetails3.customerDetailsProto : r13) != null) {
                                        AsyncResult.Success success2 = new AsyncResult.Success(customerProfileDetails3);
                                        this.L$0 = r13;
                                        this.L$1 = r13;
                                        this.L$2 = r13;
                                        this.L$3 = r13;
                                        this.L$4 = r13;
                                        this.L$5 = r13;
                                        this.label = 7;
                                        break;
                                    } else {
                                        str = customerProfileData3.customerId;
                                        ExtendedProfileDetails extendedProfileDetails7 = r13;
                                        if (str != null) {
                                            try {
                                                ProfileCropView.AnonymousClass3 anonymousClass3 = new ProfileCropView.AnonymousClass3(realProfileRepo, str, r13, i3);
                                                this.L$0 = flowCollector;
                                                this.L$1 = customerProfileDetails3;
                                                this.L$2 = customerProfileData3;
                                                this.L$3 = ref$ObjectRef;
                                                this.L$4 = str;
                                                this.L$5 = r13;
                                                this.label = 8;
                                                withContext5 = JobKt.withContext(coroutineContext2, anonymousClass3, this);
                                            } catch (IllegalStateException unused) {
                                                ref$ObjectRef4 = ref$ObjectRef;
                                                customerProfileDetails5 = customerProfileDetails3;
                                                ref$ObjectRef = ref$ObjectRef4;
                                                extendedProfileDetails3 = r13;
                                                extendedProfileDetails4 = r13;
                                                if (extendedProfileDetails3 == null) {
                                                }
                                                coroutineContext = coroutineContext2;
                                                z3 = z5;
                                                loading = loading2;
                                                r7 = extendedProfileDetails4;
                                                realProfileRepo2 = realProfileRepo;
                                                str3 = str;
                                                extendedProfileDetails5 = extendedProfileDetails3;
                                                ref$ObjectRef6 = ref$ObjectRef;
                                                customerProfileDetails6 = customerProfileDetails5;
                                                customerProfileData4 = customerProfileData3;
                                                CashFaceClientService cashFaceClientService = realProfileRepo2.appService;
                                                ordinal = customerProfileData4.isInContacts.ordinal();
                                                if (ordinal != 0) {
                                                }
                                                GetProfileDetailsRequest getProfileDetailsRequest = new GetProfileDetailsRequest(contactsStatus2, str3, this.$originContext, (String) null, 16);
                                                this.L$0 = flowCollector;
                                                this.L$1 = customerProfileDetails6;
                                                this.L$2 = customerProfileData4;
                                                this.L$3 = ref$ObjectRef6;
                                                this.L$4 = str3;
                                                this.L$5 = extendedProfileDetails5;
                                                this.L$7 = r7;
                                                this.label = 11;
                                                profileDetails = cashFaceClientService.getProfileDetails(getProfileDetailsRequest, this);
                                                if (profileDetails != coroutineSingletons) {
                                                }
                                                return coroutineSingletons;
                                            }
                                            if (withContext5 != coroutineSingletons) {
                                                ref$ObjectRef4 = ref$ObjectRef;
                                                r13 = r13;
                                                try {
                                                    extendedProfileDetails2 = (ExtendedProfileDetails) withContext5;
                                                } catch (IllegalStateException unused2) {
                                                    customerProfileDetails5 = customerProfileDetails3;
                                                    ref$ObjectRef = ref$ObjectRef4;
                                                    extendedProfileDetails3 = r13;
                                                    extendedProfileDetails4 = r13;
                                                    if (extendedProfileDetails3 == null) {
                                                    }
                                                    coroutineContext = coroutineContext2;
                                                    z3 = z5;
                                                    loading = loading2;
                                                    r7 = extendedProfileDetails4;
                                                    realProfileRepo2 = realProfileRepo;
                                                    str3 = str;
                                                    extendedProfileDetails5 = extendedProfileDetails3;
                                                    ref$ObjectRef6 = ref$ObjectRef;
                                                    customerProfileDetails6 = customerProfileDetails5;
                                                    customerProfileData4 = customerProfileData3;
                                                    CashFaceClientService cashFaceClientService2 = realProfileRepo2.appService;
                                                    ordinal = customerProfileData4.isInContacts.ordinal();
                                                    if (ordinal != 0) {
                                                    }
                                                    GetProfileDetailsRequest getProfileDetailsRequest2 = new GetProfileDetailsRequest(contactsStatus2, str3, this.$originContext, (String) null, 16);
                                                    this.L$0 = flowCollector;
                                                    this.L$1 = customerProfileDetails6;
                                                    this.L$2 = customerProfileData4;
                                                    this.L$3 = ref$ObjectRef6;
                                                    this.L$4 = str3;
                                                    this.L$5 = extendedProfileDetails5;
                                                    this.L$7 = r7;
                                                    this.label = 11;
                                                    profileDetails = cashFaceClientService2.getProfileDetails(getProfileDetailsRequest2, this);
                                                    if (profileDetails != coroutineSingletons) {
                                                    }
                                                    return coroutineSingletons;
                                                }
                                                if (extendedProfileDetails2 == null) {
                                                    Flow contactsStatusForCustomer = realProfileRepo.contactRepository.contactsStatusForCustomer(str);
                                                    this.L$0 = flowCollector;
                                                    this.L$1 = customerProfileDetails3;
                                                    this.L$2 = customerProfileData3;
                                                    this.L$3 = ref$ObjectRef4;
                                                    this.L$4 = str;
                                                    this.L$5 = extendedProfileDetails2;
                                                    this.L$7 = ref$ObjectRef4;
                                                    this.I$0 = 0;
                                                    this.label = 9;
                                                    firstOrNull = FlowKt.firstOrNull(contactsStatusForCustomer, this);
                                                    if (firstOrNull != coroutineSingletons) {
                                                        ref$ObjectRef = ref$ObjectRef4;
                                                        str2 = str;
                                                        customerProfileDetails4 = customerProfileDetails3;
                                                        extendedProfileDetails = extendedProfileDetails2;
                                                        ref$ObjectRef5 = ref$ObjectRef;
                                                        r13 = r13;
                                                        try {
                                                            contactsStatus = (ContactsStatus) firstOrNull;
                                                            if (contactsStatus == null) {
                                                                contactsStatus = ContactsStatus.NOT_IN_CONTACTS;
                                                            }
                                                            ref$ObjectRef5.element = contactsStatus;
                                                            extendedProfileDetails6 = r13;
                                                            customerProfileDetails5 = customerProfileDetails4;
                                                            str = str2;
                                                            extendedProfileDetails3 = extendedProfileDetails;
                                                            extendedProfileDetails4 = extendedProfileDetails6;
                                                        } catch (IllegalStateException unused3) {
                                                            customerProfileDetails3 = customerProfileDetails4;
                                                            str = str2;
                                                            ref$ObjectRef4 = ref$ObjectRef;
                                                            customerProfileDetails5 = customerProfileDetails3;
                                                            ref$ObjectRef = ref$ObjectRef4;
                                                            extendedProfileDetails3 = r13;
                                                            extendedProfileDetails4 = r13;
                                                            if (extendedProfileDetails3 == null) {
                                                            }
                                                            coroutineContext = coroutineContext2;
                                                            z3 = z5;
                                                            loading = loading2;
                                                            r7 = extendedProfileDetails4;
                                                            realProfileRepo2 = realProfileRepo;
                                                            str3 = str;
                                                            extendedProfileDetails5 = extendedProfileDetails3;
                                                            ref$ObjectRef6 = ref$ObjectRef;
                                                            customerProfileDetails6 = customerProfileDetails5;
                                                            customerProfileData4 = customerProfileData3;
                                                            CashFaceClientService cashFaceClientService22 = realProfileRepo2.appService;
                                                            ordinal = customerProfileData4.isInContacts.ordinal();
                                                            if (ordinal != 0) {
                                                            }
                                                            GetProfileDetailsRequest getProfileDetailsRequest22 = new GetProfileDetailsRequest(contactsStatus2, str3, this.$originContext, (String) null, 16);
                                                            this.L$0 = flowCollector;
                                                            this.L$1 = customerProfileDetails6;
                                                            this.L$2 = customerProfileData4;
                                                            this.L$3 = ref$ObjectRef6;
                                                            this.L$4 = str3;
                                                            this.L$5 = extendedProfileDetails5;
                                                            this.L$7 = r7;
                                                            this.label = 11;
                                                            profileDetails = cashFaceClientService22.getProfileDetails(getProfileDetailsRequest22, this);
                                                            if (profileDetails != coroutineSingletons) {
                                                            }
                                                            return coroutineSingletons;
                                                        }
                                                        if (extendedProfileDetails3 == null && z5) {
                                                            realProfileRepo2 = realProfileRepo;
                                                            str4 = str;
                                                            loading = loading2;
                                                            z3 = z5;
                                                            coroutineContext = coroutineContext2;
                                                            r7 = null;
                                                            CustomerProfileData customerProfileData8 = realProfileRepo2.customerProfileData(extendedProfileDetails3.get_profile_details_response, str4, customerProfileData3.sms, customerProfileData3.email, (ContactsStatus) ref$ObjectRef.element);
                                                            if (customerProfileData8 == null) {
                                                                customerProfileData8 = customerProfileData3;
                                                            }
                                                            AsyncResult.Success success3 = new AsyncResult.Success(new CustomerProfileDetails(customerProfileData8, extendedProfileDetails3.get_profile_details_response));
                                                            this.L$0 = flowCollector;
                                                            this.L$1 = customerProfileDetails5;
                                                            this.L$2 = customerProfileData3;
                                                            this.L$3 = ref$ObjectRef;
                                                            this.L$4 = str4;
                                                            this.L$5 = extendedProfileDetails3;
                                                            this.L$7 = null;
                                                            this.label = 10;
                                                            if (flowCollector.emit(success3, this) != coroutineSingletons) {
                                                                extendedProfileDetails5 = extendedProfileDetails3;
                                                                ref$ObjectRef7 = ref$ObjectRef;
                                                                customerProfileData5 = customerProfileData3;
                                                                customerProfileDetails7 = customerProfileDetails5;
                                                                str3 = str4;
                                                                ref$ObjectRef6 = ref$ObjectRef7;
                                                                customerProfileData4 = customerProfileData5;
                                                                customerProfileDetails6 = customerProfileDetails7;
                                                                CashFaceClientService cashFaceClientService222 = realProfileRepo2.appService;
                                                                ordinal = customerProfileData4.isInContacts.ordinal();
                                                                if (ordinal != 0) {
                                                                }
                                                                GetProfileDetailsRequest getProfileDetailsRequest222 = new GetProfileDetailsRequest(contactsStatus2, str3, this.$originContext, (String) null, 16);
                                                                this.L$0 = flowCollector;
                                                                this.L$1 = customerProfileDetails6;
                                                                this.L$2 = customerProfileData4;
                                                                this.L$3 = ref$ObjectRef6;
                                                                this.L$4 = str3;
                                                                this.L$5 = extendedProfileDetails5;
                                                                this.L$7 = r7;
                                                                this.label = 11;
                                                                profileDetails = cashFaceClientService222.getProfileDetails(getProfileDetailsRequest222, this);
                                                                if (profileDetails != coroutineSingletons) {
                                                                }
                                                            }
                                                        } else {
                                                            coroutineContext = coroutineContext2;
                                                            z3 = z5;
                                                            loading = loading2;
                                                            r7 = extendedProfileDetails4;
                                                            realProfileRepo2 = realProfileRepo;
                                                            str3 = str;
                                                            extendedProfileDetails5 = extendedProfileDetails3;
                                                            ref$ObjectRef6 = ref$ObjectRef;
                                                            customerProfileDetails6 = customerProfileDetails5;
                                                            customerProfileData4 = customerProfileData3;
                                                            CashFaceClientService cashFaceClientService2222 = realProfileRepo2.appService;
                                                            ordinal = customerProfileData4.isInContacts.ordinal();
                                                            if (ordinal != 0) {
                                                                contactsStatus2 = com.squareup.protos.cash.cashface.api.ContactsStatus.IN_CONTACTS;
                                                            } else if (ordinal == 1) {
                                                                contactsStatus2 = com.squareup.protos.cash.cashface.api.ContactsStatus.NOT_IN_CONTACTS;
                                                            } else {
                                                                if (ordinal != 2) {
                                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                    return obj2;
                                                                }
                                                                contactsStatus2 = com.squareup.protos.cash.cashface.api.ContactsStatus.CONTACTS_DISABLED;
                                                            }
                                                            GetProfileDetailsRequest getProfileDetailsRequest2222 = new GetProfileDetailsRequest(contactsStatus2, str3, this.$originContext, (String) null, 16);
                                                            this.L$0 = flowCollector;
                                                            this.L$1 = customerProfileDetails6;
                                                            this.L$2 = customerProfileData4;
                                                            this.L$3 = ref$ObjectRef6;
                                                            this.L$4 = str3;
                                                            this.L$5 = extendedProfileDetails5;
                                                            this.L$7 = r7;
                                                            this.label = 11;
                                                            profileDetails = cashFaceClientService2222.getProfileDetails(getProfileDetailsRequest2222, this);
                                                            if (profileDetails != coroutineSingletons) {
                                                                customerProfileData6 = customerProfileData4;
                                                                customerProfileDetails8 = customerProfileDetails6;
                                                                str5 = str3;
                                                                apiResult = (ApiResult) profileDetails;
                                                                apiResult.getClass();
                                                                if (!(apiResult instanceof ApiResult.Failure.HttpFailure)) {
                                                                    success = new AsyncResult.Failure(new Exception(String.valueOf(((ApiResult.Failure.HttpFailure) apiResult).code)));
                                                                } else if (apiResult instanceof ApiResult.Failure.NetworkFailure) {
                                                                    success = new AsyncResult.Failure(((ApiResult.Failure.NetworkFailure) apiResult).error);
                                                                } else {
                                                                    if (!(apiResult instanceof ApiResult.Success)) {
                                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                        return obj2;
                                                                    }
                                                                    success = new AsyncResult.Success(((ApiResult.Success) apiResult).response);
                                                                }
                                                                if (success instanceof AsyncResult.Success) {
                                                                    Ref$ObjectRef ref$ObjectRef8 = r7;
                                                                    if (extendedProfileDetails5 == null) {
                                                                        if (success instanceof AsyncResult.Loading) {
                                                                            failure = loading;
                                                                        } else {
                                                                            if (!(success instanceof AsyncResult.Failure)) {
                                                                                OptionalProvider$$ExternalSyntheticLambda0.m$1(success, "Unexpected result: ");
                                                                                return obj2;
                                                                            }
                                                                            failure = (!z3 || customerProfileDetails8 == null) ? new AsyncResult.Failure(((AsyncResult.Failure) success).error) : new AsyncResult.Success(customerProfileDetails8);
                                                                        }
                                                                        this.L$0 = ref$ObjectRef8;
                                                                        this.L$1 = ref$ObjectRef8;
                                                                        this.L$2 = ref$ObjectRef8;
                                                                        this.L$3 = ref$ObjectRef8;
                                                                        this.L$4 = ref$ObjectRef8;
                                                                        this.L$5 = ref$ObjectRef8;
                                                                        this.L$7 = ref$ObjectRef8;
                                                                        this.label = 14;
                                                                        break;
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                                AsyncResult.Success success4 = (AsyncResult.Success) success;
                                                                CustomerProfileData customerProfileData9 = realProfileRepo2.customerProfileData((GetProfileDetailsResponse) success4.response, str5, customerProfileData6.sms, customerProfileData6.email, (ContactsStatus) ref$ObjectRef6.element);
                                                                if (customerProfileData9 != null) {
                                                                    customerProfileData6 = customerProfileData9;
                                                                }
                                                                if (str5 != null) {
                                                                    ?? r52 = r7;
                                                                    AndroidFileSaver$save$2 androidFileSaver$save$2 = new AndroidFileSaver$save$2(realProfileRepo2, str5, success4, r52, 16);
                                                                    this.L$0 = flowCollector;
                                                                    this.L$1 = r52;
                                                                    this.L$2 = r52;
                                                                    this.L$3 = r52;
                                                                    this.L$4 = r52;
                                                                    this.L$5 = r52;
                                                                    this.L$7 = success;
                                                                    this.L$8 = customerProfileData6;
                                                                    this.label = 12;
                                                                    if (JobKt.withContext(coroutineContext, androidFileSaver$save$2, this) != coroutineSingletons) {
                                                                        customerProfileData7 = customerProfileData6;
                                                                        asyncResult = success;
                                                                        z4 = r52;
                                                                        customerProfileData6 = customerProfileData7;
                                                                        success = asyncResult;
                                                                        r5 = z4;
                                                                        AsyncResult.Success success5 = new AsyncResult.Success(new CustomerProfileDetails(customerProfileData6, (GetProfileDetailsResponse) ((AsyncResult.Success) success).response));
                                                                        this.L$0 = r5;
                                                                        this.L$1 = r5;
                                                                        this.L$2 = r5;
                                                                        this.L$3 = r5;
                                                                        this.L$4 = r5;
                                                                        this.L$5 = r5;
                                                                        this.L$7 = r5;
                                                                        this.L$8 = r5;
                                                                        this.label = 13;
                                                                        break;
                                                                    }
                                                                } else {
                                                                    r5 = r7;
                                                                    AsyncResult.Success success52 = new AsyncResult.Success(new CustomerProfileDetails(customerProfileData6, (GetProfileDetailsResponse) ((AsyncResult.Success) success).response));
                                                                    this.L$0 = r5;
                                                                    this.L$1 = r5;
                                                                    this.L$2 = r5;
                                                                    this.L$3 = r5;
                                                                    this.L$4 = r5;
                                                                    this.L$5 = r5;
                                                                    this.L$7 = r5;
                                                                    this.L$8 = r5;
                                                                    this.label = 13;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    ref$ObjectRef = ref$ObjectRef4;
                                                    extendedProfileDetails7 = r13;
                                                }
                                            }
                                        }
                                        str2 = str;
                                        customerProfileDetails4 = customerProfileDetails3;
                                        extendedProfileDetails = extendedProfileDetails7;
                                        extendedProfileDetails6 = extendedProfileDetails7;
                                        customerProfileDetails5 = customerProfileDetails4;
                                        str = str2;
                                        extendedProfileDetails3 = extendedProfileDetails;
                                        extendedProfileDetails4 = extendedProfileDetails6;
                                        if (extendedProfileDetails3 == null) {
                                        }
                                        coroutineContext = coroutineContext2;
                                        z3 = z5;
                                        loading = loading2;
                                        r7 = extendedProfileDetails4;
                                        realProfileRepo2 = realProfileRepo;
                                        str3 = str;
                                        extendedProfileDetails5 = extendedProfileDetails3;
                                        ref$ObjectRef6 = ref$ObjectRef;
                                        customerProfileDetails6 = customerProfileDetails5;
                                        customerProfileData4 = customerProfileData3;
                                        CashFaceClientService cashFaceClientService22222 = realProfileRepo2.appService;
                                        ordinal = customerProfileData4.isInContacts.ordinal();
                                        if (ordinal != 0) {
                                        }
                                        GetProfileDetailsRequest getProfileDetailsRequest22222 = new GetProfileDetailsRequest(contactsStatus2, str3, this.$originContext, (String) null, 16);
                                        this.L$0 = flowCollector;
                                        this.L$1 = customerProfileDetails6;
                                        this.L$2 = customerProfileData4;
                                        this.L$3 = ref$ObjectRef6;
                                        this.L$4 = str3;
                                        this.L$5 = extendedProfileDetails5;
                                        this.L$7 = r7;
                                        this.label = 11;
                                        profileDetails = cashFaceClientService22222.getProfileDetails(getProfileDetailsRequest22222, this);
                                        if (profileDetails != coroutineSingletons) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    customer = customer3;
                    realProfileRepo = realProfileRepo2;
                    customerProfileDetails = null;
                    boolean z6 = false;
                    if (!(customer instanceof ProfileScreens.ProfileScreen.Customer.NonCashCustomer)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return obj2;
                    }
                    RealProfileRepo$customerData$profile$1 realProfileRepo$customerData$profile$1 = new RealProfileRepo$customerData$profile$1(realProfileRepo, customer, z6 ? 1 : 0, 1);
                    this.L$0 = flowCollector;
                    this.L$1 = ref$ObjectRef;
                    this.label = 6;
                    withContext = JobKt.withContext(coroutineContext2, realProfileRepo$customerData$profile$1, this);
                    break;
                }
                return coroutineSingletons;
            case 2:
                obj2 = null;
                Ref$ObjectRef ref$ObjectRef9 = (Ref$ObjectRef) this.L$1;
                SafeTrace.throwOnFailure(obj);
                ref$ObjectRef2 = ref$ObjectRef9;
                customer2 = customer3;
                withContext2 = obj;
                realProfileRepo = realProfileRepo2;
                r1 = 0;
                customerProfileDetails2 = (CustomerProfileDetails) withContext2;
                if (customerProfileDetails2 != null) {
                }
                return coroutineSingletons;
            case 3:
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 4:
                obj2 = null;
                customerProfileData = (CustomerProfileData) this.L$4;
                ref$ObjectRef2 = (Ref$ObjectRef) this.L$2;
                customerProfileDetails2 = (CustomerProfileDetails) this.L$1;
                SafeTrace.throwOnFailure(obj);
                customer2 = customer3;
                withContext3 = obj;
                realProfileRepo = realProfileRepo2;
                z = false;
                boolean booleanValue = ((Boolean) withContext3).booleanValue();
                customerProfileData2 = customerProfileData;
                i = booleanValue ? 1 : 0;
                r12 = z;
                RingtoneView.AnonymousClass1 anonymousClass122 = new RingtoneView.AnonymousClass1(realProfileRepo, customer2, r12, 22);
                this.L$0 = flowCollector;
                this.L$1 = customerProfileDetails2;
                this.L$2 = ref$ObjectRef2;
                this.L$3 = r12;
                this.L$4 = customerProfileData2;
                this.L$5 = ref$ObjectRef2;
                this.I$0 = i;
                this.label = 5;
                withContext4 = JobKt.withContext(coroutineContext2, anonymousClass122, this);
                if (withContext4 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 5:
                i = this.I$0;
                Ref$ObjectRef ref$ObjectRef10 = (Ref$ObjectRef) this.L$5;
                CustomerProfileData customerProfileData10 = (CustomerProfileData) this.L$4;
                Ref$ObjectRef ref$ObjectRef11 = (Ref$ObjectRef) this.L$2;
                obj2 = null;
                CustomerProfileDetails customerProfileDetails9 = (CustomerProfileDetails) this.L$1;
                SafeTrace.throwOnFailure(obj);
                customerProfileData2 = customerProfileData10;
                ref$ObjectRef3 = ref$ObjectRef11;
                customerProfileDetails2 = customerProfileDetails9;
                withContext4 = obj;
                ref$ObjectRef2 = ref$ObjectRef10;
                realProfileRepo = realProfileRepo2;
                z2 = false;
                ref$ObjectRef2.element = withContext4;
                copy$default = CustomerProfileData.copy$default(customerProfileData2, (ContactsStatus) ref$ObjectRef3.element, i == 0);
                customerProfileDetails3 = customerProfileDetails2;
                ref$ObjectRef = ref$ObjectRef3;
                r13 = z2;
                customerProfileData3 = copy$default;
                if ((customerProfileDetails3 != null ? customerProfileDetails3.customerDetailsProto : r13) != null) {
                }
                return coroutineSingletons;
            case 6:
                Ref$ObjectRef ref$ObjectRef12 = (Ref$ObjectRef) this.L$1;
                SafeTrace.throwOnFailure(obj);
                customer = customer3;
                obj2 = null;
                realProfileRepo = realProfileRepo2;
                ref$ObjectRef = ref$ObjectRef12;
                customerProfileDetails = null;
                withContext = obj;
                LocalContactProfile localContactProfile = (LocalContactProfile) withContext;
                if (localContactProfile != null) {
                    copy$default = RealProfileRepo.toCustomerProfileData(localContactProfile);
                } else {
                    ?? r53 = customer instanceof ProfileScreens.ProfileScreen.Customer.NonCashCustomer.WithEmail ? (ProfileScreens.ProfileScreen.Customer.NonCashCustomer.WithEmail) customer : customerProfileDetails;
                    ?? r24 = (r53 == null || (redacted2 = r53.alias) == null) ? customerProfileDetails : (String) redacted2.getValue();
                    ?? r54 = customer instanceof ProfileScreens.ProfileScreen.Customer.NonCashCustomer.WithPhoneNumber ? (ProfileScreens.ProfileScreen.Customer.NonCashCustomer.WithPhoneNumber) customer : customerProfileDetails;
                    copy$default = new CustomerProfileData((String) null, (String) null, (String) null, (String) null, (String) r24, (String) ((r54 == null || (redacted = r54.alias) == null) ? customerProfileDetails : (String) redacted.getValue()), (Image) null, false, (ContactsStatus) null, false, false, (Color) null, (Region) null, (Long) null, (BlockState) null, false, (String) null, (Boolean) null, (Boolean) null, (String) null, 2097103);
                }
                customerProfileDetails3 = customerProfileDetails;
                r13 = customerProfileDetails;
                customerProfileData3 = copy$default;
                if ((customerProfileDetails3 != null ? customerProfileDetails3.customerDetailsProto : r13) != null) {
                }
                return coroutineSingletons;
            case 7:
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 8:
                str = (String) this.L$4;
                ref$ObjectRef4 = this.L$3;
                CustomerProfileData customerProfileData11 = (CustomerProfileData) this.L$2;
                customerProfileDetails3 = (CustomerProfileDetails) this.L$1;
                try {
                    SafeTrace.throwOnFailure(obj);
                    realProfileRepo = realProfileRepo2;
                    customerProfileData3 = customerProfileData11;
                    obj2 = null;
                    r13 = 0;
                    withContext5 = obj;
                    extendedProfileDetails2 = (ExtendedProfileDetails) withContext5;
                    if (extendedProfileDetails2 == null) {
                    }
                } catch (IllegalStateException unused4) {
                    realProfileRepo = realProfileRepo2;
                    customerProfileData3 = customerProfileData11;
                    obj2 = null;
                    r13 = 0;
                    customerProfileDetails5 = customerProfileDetails3;
                    ref$ObjectRef = ref$ObjectRef4;
                    extendedProfileDetails3 = r13;
                    extendedProfileDetails4 = r13;
                    if (extendedProfileDetails3 == null) {
                    }
                    coroutineContext = coroutineContext2;
                    z3 = z5;
                    loading = loading2;
                    r7 = extendedProfileDetails4;
                    realProfileRepo2 = realProfileRepo;
                    str3 = str;
                    extendedProfileDetails5 = extendedProfileDetails3;
                    ref$ObjectRef6 = ref$ObjectRef;
                    customerProfileDetails6 = customerProfileDetails5;
                    customerProfileData4 = customerProfileData3;
                    CashFaceClientService cashFaceClientService222222 = realProfileRepo2.appService;
                    ordinal = customerProfileData4.isInContacts.ordinal();
                    if (ordinal != 0) {
                    }
                    GetProfileDetailsRequest getProfileDetailsRequest222222 = new GetProfileDetailsRequest(contactsStatus2, str3, this.$originContext, (String) null, 16);
                    this.L$0 = flowCollector;
                    this.L$1 = customerProfileDetails6;
                    this.L$2 = customerProfileData4;
                    this.L$3 = ref$ObjectRef6;
                    this.L$4 = str3;
                    this.L$5 = extendedProfileDetails5;
                    this.L$7 = r7;
                    this.label = 11;
                    profileDetails = cashFaceClientService222222.getProfileDetails(getProfileDetailsRequest222222, this);
                    if (profileDetails != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                break;
            case 9:
                ref$ObjectRef5 = (Ref$ObjectRef) this.L$7;
                ExtendedProfileDetails extendedProfileDetails8 = (ExtendedProfileDetails) this.L$5;
                str = (String) this.L$4;
                ref$ObjectRef4 = this.L$3;
                customerProfileData3 = (CustomerProfileData) this.L$2;
                customerProfileDetails3 = (CustomerProfileDetails) this.L$1;
                try {
                    SafeTrace.throwOnFailure(obj);
                    firstOrNull = obj;
                    obj2 = null;
                    ref$ObjectRef = ref$ObjectRef4;
                    str2 = str;
                    customerProfileDetails4 = customerProfileDetails3;
                    extendedProfileDetails = extendedProfileDetails8;
                    realProfileRepo = realProfileRepo2;
                    r13 = 0;
                    contactsStatus = (ContactsStatus) firstOrNull;
                    if (contactsStatus == null) {
                    }
                    ref$ObjectRef5.element = contactsStatus;
                    extendedProfileDetails6 = r13;
                    customerProfileDetails5 = customerProfileDetails4;
                    str = str2;
                    extendedProfileDetails3 = extendedProfileDetails;
                    extendedProfileDetails4 = extendedProfileDetails6;
                } catch (IllegalStateException unused5) {
                    realProfileRepo = realProfileRepo2;
                    obj2 = null;
                    r13 = 0;
                    customerProfileDetails5 = customerProfileDetails3;
                    ref$ObjectRef = ref$ObjectRef4;
                    extendedProfileDetails3 = r13;
                    extendedProfileDetails4 = r13;
                    if (extendedProfileDetails3 == null) {
                    }
                    coroutineContext = coroutineContext2;
                    z3 = z5;
                    loading = loading2;
                    r7 = extendedProfileDetails4;
                    realProfileRepo2 = realProfileRepo;
                    str3 = str;
                    extendedProfileDetails5 = extendedProfileDetails3;
                    ref$ObjectRef6 = ref$ObjectRef;
                    customerProfileDetails6 = customerProfileDetails5;
                    customerProfileData4 = customerProfileData3;
                    CashFaceClientService cashFaceClientService2222222 = realProfileRepo2.appService;
                    ordinal = customerProfileData4.isInContacts.ordinal();
                    if (ordinal != 0) {
                    }
                    GetProfileDetailsRequest getProfileDetailsRequest2222222 = new GetProfileDetailsRequest(contactsStatus2, str3, this.$originContext, (String) null, 16);
                    this.L$0 = flowCollector;
                    this.L$1 = customerProfileDetails6;
                    this.L$2 = customerProfileData4;
                    this.L$3 = ref$ObjectRef6;
                    this.L$4 = str3;
                    this.L$5 = extendedProfileDetails5;
                    this.L$7 = r7;
                    this.label = 11;
                    profileDetails = cashFaceClientService2222222.getProfileDetails(getProfileDetailsRequest2222222, this);
                    if (profileDetails != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (extendedProfileDetails3 == null) {
                }
                coroutineContext = coroutineContext2;
                z3 = z5;
                loading = loading2;
                r7 = extendedProfileDetails4;
                realProfileRepo2 = realProfileRepo;
                str3 = str;
                extendedProfileDetails5 = extendedProfileDetails3;
                ref$ObjectRef6 = ref$ObjectRef;
                customerProfileDetails6 = customerProfileDetails5;
                customerProfileData4 = customerProfileData3;
                CashFaceClientService cashFaceClientService22222222 = realProfileRepo2.appService;
                ordinal = customerProfileData4.isInContacts.ordinal();
                if (ordinal != 0) {
                }
                GetProfileDetailsRequest getProfileDetailsRequest22222222 = new GetProfileDetailsRequest(contactsStatus2, str3, this.$originContext, (String) null, 16);
                this.L$0 = flowCollector;
                this.L$1 = customerProfileDetails6;
                this.L$2 = customerProfileData4;
                this.L$3 = ref$ObjectRef6;
                this.L$4 = str3;
                this.L$5 = extendedProfileDetails5;
                this.L$7 = r7;
                this.label = 11;
                profileDetails = cashFaceClientService22222222.getProfileDetails(getProfileDetailsRequest22222222, this);
                if (profileDetails != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 10:
                extendedProfileDetails5 = (ExtendedProfileDetails) this.L$5;
                str4 = (String) this.L$4;
                ref$ObjectRef7 = this.L$3;
                customerProfileData5 = (CustomerProfileData) this.L$2;
                customerProfileDetails7 = (CustomerProfileDetails) this.L$1;
                SafeTrace.throwOnFailure(obj);
                coroutineContext = coroutineContext2;
                obj2 = null;
                z3 = z5;
                loading = loading2;
                r7 = null;
                str3 = str4;
                ref$ObjectRef6 = ref$ObjectRef7;
                customerProfileData4 = customerProfileData5;
                customerProfileDetails6 = customerProfileDetails7;
                CashFaceClientService cashFaceClientService222222222 = realProfileRepo2.appService;
                ordinal = customerProfileData4.isInContacts.ordinal();
                if (ordinal != 0) {
                }
                GetProfileDetailsRequest getProfileDetailsRequest222222222 = new GetProfileDetailsRequest(contactsStatus2, str3, this.$originContext, (String) null, 16);
                this.L$0 = flowCollector;
                this.L$1 = customerProfileDetails6;
                this.L$2 = customerProfileData4;
                this.L$3 = ref$ObjectRef6;
                this.L$4 = str3;
                this.L$5 = extendedProfileDetails5;
                this.L$7 = r7;
                this.label = 11;
                profileDetails = cashFaceClientService222222222.getProfileDetails(getProfileDetailsRequest222222222, this);
                if (profileDetails != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 11:
                extendedProfileDetails5 = (ExtendedProfileDetails) this.L$5;
                str5 = (String) this.L$4;
                ref$ObjectRef6 = this.L$3;
                CustomerProfileData customerProfileData12 = (CustomerProfileData) this.L$2;
                CustomerProfileDetails customerProfileDetails10 = (CustomerProfileDetails) this.L$1;
                SafeTrace.throwOnFailure(obj);
                customerProfileData6 = customerProfileData12;
                customerProfileDetails8 = customerProfileDetails10;
                profileDetails = obj;
                coroutineContext = coroutineContext2;
                obj2 = null;
                z3 = z5;
                loading = loading2;
                r7 = null;
                apiResult = (ApiResult) profileDetails;
                apiResult.getClass();
                if (!(apiResult instanceof ApiResult.Failure.HttpFailure)) {
                }
                if (success instanceof AsyncResult.Success) {
                }
                return coroutineSingletons;
            case 12:
                customerProfileData7 = this.L$8;
                asyncResult = (AsyncResult) this.L$7;
                SafeTrace.throwOnFailure(obj);
                z4 = false;
                customerProfileData6 = customerProfileData7;
                success = asyncResult;
                r5 = z4;
                AsyncResult.Success success522 = new AsyncResult.Success(new CustomerProfileDetails(customerProfileData6, (GetProfileDetailsResponse) ((AsyncResult.Success) success).response));
                this.L$0 = r5;
                this.L$1 = r5;
                this.L$2 = r5;
                this.L$3 = r5;
                this.L$4 = r5;
                this.L$5 = r5;
                this.L$7 = r5;
                this.L$8 = r5;
                this.label = 13;
                break;
            case 13:
            case 14:
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            default:
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}

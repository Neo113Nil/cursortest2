package com.squareup.cash.shopping.backend.real;

import app.cash.api.ApiResult;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.shopping.backend.api.ShippingAddressRepository$ShippingAddressResult;
import com.squareup.cash.shopping.web.ShoppingWebBridge$loadUrl$1;
import com.squareup.protos.cash.grantly.api.ShippingAddress;
import com.squareup.protos.cash.grantly.app.RetrieveDefaultShippingAddressRequest;
import com.squareup.protos.cash.grantly.app.RetrieveDefaultShippingAddressResponse;
import com.squareup.protos.cash.grantly.app.ShippingAddressService;
import com.squareup.protos.franklin.common.SyncShippingAddress;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealShippingAddressRepository {
    public final CoroutineContext ioContext;
    public final CoroutineScope scope;
    public final SessionManager sessionManager;
    public final ShippingAddressService shippingAddressService;
    public final SyncValueReader syncValueReader;

    public RealShippingAddressRepository(SyncValueReader syncValueReader, SessionManager sessionManager, ShippingAddressService shippingAddressService, CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        this.syncValueReader = syncValueReader;
        this.sessionManager = sessionManager;
        this.shippingAddressService = shippingAddressService;
        this.scope = coroutineScope;
        this.ioContext = coroutineContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchDefaultShippingAddressFromServer(ContinuationImpl continuationImpl) {
        RealShippingAddressRepository$fetchDefaultShippingAddressFromServer$1 realShippingAddressRepository$fetchDefaultShippingAddressFromServer$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealShippingAddressRepository$fetchDefaultShippingAddressFromServer$1) {
            realShippingAddressRepository$fetchDefaultShippingAddressFromServer$1 = (RealShippingAddressRepository$fetchDefaultShippingAddressFromServer$1) continuationImpl;
            int i2 = realShippingAddressRepository$fetchDefaultShippingAddressFromServer$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realShippingAddressRepository$fetchDefaultShippingAddressFromServer$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realShippingAddressRepository$fetchDefaultShippingAddressFromServer$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realShippingAddressRepository$fetchDefaultShippingAddressFromServer$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RetrieveDefaultShippingAddressRequest retrieveDefaultShippingAddressRequest = new RetrieveDefaultShippingAddressRequest(PlatformKt.activeAccountToken(this.sessionManager));
                    realShippingAddressRepository$fetchDefaultShippingAddressFromServer$1.label = 1;
                    obj = this.shippingAddressService.retrieveDefaultShippingAddress(retrieveDefaultShippingAddressRequest, realShippingAddressRepository$fetchDefaultShippingAddressFromServer$1);
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
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    return new ShippingAddressRepository$ShippingAddressResult.Success(((RetrieveDefaultShippingAddressResponse) ((ApiResult.Success) apiResult).response).shipping_address);
                }
                if (apiResult instanceof ApiResult.Failure) {
                    return ShippingAddressRepository$ShippingAddressResult.Failure.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        realShippingAddressRepository$fetchDefaultShippingAddressFromServer$1 = new RealShippingAddressRepository$fetchDefaultShippingAddressFromServer$1(this, continuationImpl);
        Object obj2 = realShippingAddressRepository$fetchDefaultShippingAddressFromServer$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realShippingAddressRepository$fetchDefaultShippingAddressFromServer$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0046, code lost:
    
        if (r8 == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getShippingAddress(ContinuationImpl continuationImpl) {
        RealShippingAddressRepository$getShippingAddress$1 realShippingAddressRepository$getShippingAddress$1;
        Object obj;
        int i;
        List list;
        Object obj2;
        if (continuationImpl instanceof RealShippingAddressRepository$getShippingAddress$1) {
            realShippingAddressRepository$getShippingAddress$1 = (RealShippingAddressRepository$getShippingAddress$1) continuationImpl;
            int i2 = realShippingAddressRepository$getShippingAddress$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realShippingAddressRepository$getShippingAddress$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj3 = realShippingAddressRepository$getShippingAddress$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realShippingAddressRepository$getShippingAddress$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj3);
                    StateFlow allValues = this.syncValueReader.getAllValues(AndroidSyncValueSpecs.ShippingAddress);
                    realShippingAddressRepository$getShippingAddress$1.label = 1;
                    obj3 = FlowKt.firstOrNull(allValues, realShippingAddressRepository$getShippingAddress$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj3);
                            return obj3;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj3);
                }
                List list2 = (List) obj3;
                list = list2;
                if (list != null || list.isEmpty()) {
                    realShippingAddressRepository$getShippingAddress$1.label = 2;
                    Object fetchDefaultShippingAddressFromServer = fetchDefaultShippingAddressFromServer(realShippingAddressRepository$getShippingAddress$1);
                    return fetchDefaultShippingAddressFromServer != obj ? obj : fetchDefaultShippingAddressFromServer;
                }
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    ShippingAddress shippingAddress = ((SyncShippingAddress) obj2).shipping_address;
                    if (shippingAddress != null ? Intrinsics.areEqual(shippingAddress.is_default, Boolean.TRUE) : false) {
                        break;
                    }
                }
                SyncShippingAddress syncShippingAddress = (SyncShippingAddress) obj2;
                if (syncShippingAddress == null) {
                    syncShippingAddress = (SyncShippingAddress) CollectionsKt.first(list2);
                }
                ShippingAddress shippingAddress2 = syncShippingAddress.shipping_address;
                if (shippingAddress2 != null ? Intrinsics.areEqual(shippingAddress2.is_default, Boolean.FALSE) : false) {
                    String str = shippingAddress2.id;
                    str.getClass();
                    JobKt.launch$default(this.scope, this.ioContext, null, new ShoppingWebBridge$loadUrl$1(this, str, null, 9), 2);
                }
                return new ShippingAddressRepository$ShippingAddressResult.Success(shippingAddress2);
            }
        }
        realShippingAddressRepository$getShippingAddress$1 = new RealShippingAddressRepository$getShippingAddress$1(this, continuationImpl);
        Object obj32 = realShippingAddressRepository$getShippingAddress$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realShippingAddressRepository$getShippingAddress$1.label;
        if (i != 0) {
        }
        List list22 = (List) obj32;
        list = list22;
        if (list != null) {
        }
        realShippingAddressRepository$getShippingAddress$1.label = 2;
        Object fetchDefaultShippingAddressFromServer2 = fetchDefaultShippingAddressFromServer(realShippingAddressRepository$getShippingAddress$1);
        if (fetchDefaultShippingAddressFromServer2 != obj) {
        }
    }
}

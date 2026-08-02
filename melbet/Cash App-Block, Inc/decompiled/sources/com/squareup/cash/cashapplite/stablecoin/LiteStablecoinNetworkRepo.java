package com.squareup.cash.cashapplite.stablecoin;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.crypto.address.StablecoinDepositOption;
import com.squareup.cash.crypto.address.StablecoinNetwork;
import com.squareup.cash.crypto.backend.stablecoin.StablecoinNetworkRepo;
import com.squareup.cash.crypto.backend.stablecoin.StablecoinNetworksResult;
import com.squareup.protos.cash.blockstable.api.v1.InputSource;
import com.squareup.protos.cash.cashliteflow.api.v1.CashLiteFlowClientService;
import com.squareup.protos.cash.cashliteflow.api.v1.GetWalletAddressesRequest;
import com.squareup.protos.cash.cashliteflow.api.v1.GetWalletAddressesResponse;
import com.squareup.protos.cash.cashliteflow.api.v1.WalletAddress;
import com.squareup.protos.cash.cashliteflow.api.v1.WalletAddressAsset;
import com.squareup.protos.cash.cashliteflow.api.v1.WalletAddressChain;
import com.squareup.protos.cash.ui.Image;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class LiteStablecoinNetworkRepo implements StablecoinNetworkRepo {
    public ArrayList cachedDepositOptions;
    public final CashLiteFlowClientService cashLiteFlowClientService;

    public LiteStablecoinNetworkRepo(CashLiteFlowClientService cashLiteFlowClientService) {
        this.cashLiteFlowClientService = cashLiteFlowClientService;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0032  */
    @Override // com.squareup.cash.crypto.backend.stablecoin.StablecoinNetworkRepo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getDepositOptions(boolean z, ContinuationImpl continuationImpl) {
        LiteStablecoinNetworkRepo$getDepositOptions$1 liteStablecoinNetworkRepo$getDepositOptions$1;
        int i;
        ArrayList arrayList;
        ApiResult apiResult;
        if (continuationImpl instanceof LiteStablecoinNetworkRepo$getDepositOptions$1) {
            liteStablecoinNetworkRepo$getDepositOptions$1 = (LiteStablecoinNetworkRepo$getDepositOptions$1) continuationImpl;
            int i2 = liteStablecoinNetworkRepo$getDepositOptions$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                liteStablecoinNetworkRepo$getDepositOptions$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = liteStablecoinNetworkRepo$getDepositOptions$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = liteStablecoinNetworkRepo$getDepositOptions$1.label;
                String str = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!z && (arrayList = this.cachedDepositOptions) != null) {
                        return new StablecoinNetworksResult.Success(arrayList);
                    }
                    GetWalletAddressesRequest getWalletAddressesRequest = new GetWalletAddressesRequest(ByteString.EMPTY);
                    liteStablecoinNetworkRepo$getDepositOptions$1.label = 1;
                    obj = this.cashLiteFlowClientService.getWalletAddresses(getWalletAddressesRequest, liteStablecoinNetworkRepo$getDepositOptions$1);
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
                if (!(apiResult instanceof ApiResult.Failure)) {
                    return new StablecoinNetworksResult.Error();
                }
                if (!(apiResult instanceof ApiResult.Success)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                List list = ((GetWalletAddressesResponse) ((ApiResult.Success) apiResult).response).wallet_addresses;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    WalletAddress walletAddress = (WalletAddress) it.next();
                    WalletAddressChain walletAddressChain = walletAddress.chain;
                    if (walletAddressChain == null) {
                        String str2 = str;
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return str2;
                    }
                    WalletAddressAsset walletAddressAsset = walletAddress.asset;
                    if (walletAddressAsset == null) {
                        String str3 = str;
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return str3;
                    }
                    Image image = walletAddressChain.icon;
                    if (image == null) {
                        String str4 = str;
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return str4;
                    }
                    Image image2 = walletAddressAsset.icon;
                    String str5 = walletAddress.address;
                    if (str5 == null) {
                        String str6 = str;
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return str6;
                    }
                    String str7 = walletAddress.truncated_address;
                    if (str7 == null) {
                        String str8 = str;
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return str8;
                    }
                    String str9 = walletAddressChain.chain;
                    if (str9 == null) {
                        String str10 = str;
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return str10;
                    }
                    String str11 = walletAddressChain.display_name;
                    if (str11 == null) {
                        String str12 = str;
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return str12;
                    }
                    String str13 = walletAddressAsset.asset;
                    if (str13 == null) {
                        String str14 = str;
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return str14;
                    }
                    String str15 = walletAddressAsset.display_name;
                    String str16 = str;
                    if (str15 == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return str16;
                    }
                    String str17 = image.light_url;
                    if (str17 == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return str16;
                    }
                    String str18 = image.dark_url;
                    if (str18 == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return str16;
                    }
                    Iterator it2 = it;
                    StablecoinNetwork stablecoinNetwork = new StablecoinNetwork(str5, str7, str9, str11, str13, str15, str17, str18, image2 != null ? image2.light_url : str16, image2 != null ? image2.dark_url : str16);
                    String str19 = walletAddress.qr_code_url;
                    if (str19 == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return str16;
                    }
                    arrayList2.add(new StablecoinDepositOption(stablecoinNetwork, str19));
                    it = it2;
                    str = str16;
                }
                this.cachedDepositOptions = arrayList2;
                return new StablecoinNetworksResult.Success(arrayList2);
            }
        }
        liteStablecoinNetworkRepo$getDepositOptions$1 = new LiteStablecoinNetworkRepo$getDepositOptions$1(this, continuationImpl);
        Object obj2 = liteStablecoinNetworkRepo$getDepositOptions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = liteStablecoinNetworkRepo$getDepositOptions$1.label;
        String str20 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
    }

    @Override // com.squareup.cash.crypto.backend.stablecoin.StablecoinNetworkRepo
    public final Object getWithdrawalOptions(String str, InputSource inputSource, ContinuationImpl continuationImpl) {
        return new StablecoinNetworksResult.Error();
    }
}

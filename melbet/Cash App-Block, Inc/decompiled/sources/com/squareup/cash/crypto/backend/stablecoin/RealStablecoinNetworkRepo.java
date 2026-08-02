package com.squareup.cash.crypto.backend.stablecoin;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.crypto.address.StablecoinDepositOption;
import com.squareup.cash.crypto.address.StablecoinNetwork;
import com.squareup.cash.crypto.address.StablecoinWithdrawalOption;
import com.squareup.cash.crypto.backend.stablecoin.StablecoinNetworksResult;
import com.squareup.protos.cash.blockstable.api.v1.Asset;
import com.squareup.protos.cash.blockstable.api.v1.AvailableNetwork;
import com.squareup.protos.cash.blockstable.api.v1.BlockStableService;
import com.squareup.protos.cash.blockstable.api.v1.Chain;
import com.squareup.protos.cash.blockstable.api.v1.GetAvailableNetworksRequest;
import com.squareup.protos.cash.blockstable.api.v1.GetAvailableNetworksResponse;
import com.squareup.protos.cash.blockstable.api.v1.GetWalletAddressesRequest;
import com.squareup.protos.cash.blockstable.api.v1.GetWalletAddressesResponse;
import com.squareup.protos.cash.blockstable.api.v1.InputSource;
import com.squareup.protos.cash.blockstable.api.v1.WalletAddress;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.common.ResponseContext;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealStablecoinNetworkRepo implements StablecoinNetworkRepo {
    public final BlockStableService blockStableService;
    public ArrayList cachedDepositOptions;
    public final Set supportedAssets = SetsKt__SetsJVMKt.setOf("USDC");

    public RealStablecoinNetworkRepo(BlockStableService blockStableService) {
        this.blockStableService = blockStableService;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.squareup.cash.crypto.backend.stablecoin.StablecoinNetworkRepo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getDepositOptions(boolean z, ContinuationImpl continuationImpl) {
        RealStablecoinNetworkRepo$getDepositOptions$1 realStablecoinNetworkRepo$getDepositOptions$1;
        int i;
        ArrayList arrayList;
        ApiResult apiResult;
        if (continuationImpl instanceof RealStablecoinNetworkRepo$getDepositOptions$1) {
            realStablecoinNetworkRepo$getDepositOptions$1 = (RealStablecoinNetworkRepo$getDepositOptions$1) continuationImpl;
            int i2 = realStablecoinNetworkRepo$getDepositOptions$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realStablecoinNetworkRepo$getDepositOptions$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realStablecoinNetworkRepo$getDepositOptions$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realStablecoinNetworkRepo$getDepositOptions$1.label;
                String str = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!z && (arrayList = this.cachedDepositOptions) != null) {
                        return new StablecoinNetworksResult.Success(arrayList);
                    }
                    GetWalletAddressesRequest getWalletAddressesRequest = new GetWalletAddressesRequest(null, ByteString.EMPTY);
                    realStablecoinNetworkRepo$getDepositOptions$1.label = 1;
                    obj = this.blockStableService.getWalletAddresses(getWalletAddressesRequest, realStablecoinNetworkRepo$getDepositOptions$1);
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
                GetWalletAddressesResponse getWalletAddressesResponse = (GetWalletAddressesResponse) ((ApiResult.Success) apiResult).response;
                List list = getWalletAddressesResponse.wallet_addresses;
                ResponseContext responseContext = getWalletAddressesResponse.response_context;
                if (list.isEmpty() && responseContext != null) {
                    return new StablecoinNetworksResult.NeedsPlasmaFlow(responseContext);
                }
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    WalletAddress walletAddress = (WalletAddress) it.next();
                    Chain chain = walletAddress.chain;
                    if (chain == null) {
                        String str2 = str;
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return str2;
                    }
                    Asset asset = walletAddress.asset;
                    if (asset == null) {
                        String str3 = str;
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return str3;
                    }
                    Image image = chain.icon;
                    if (image == null) {
                        String str4 = str;
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return str4;
                    }
                    Image image2 = asset.icon;
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
                    String str9 = chain.chain;
                    if (str9 == null) {
                        String str10 = str;
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return str10;
                    }
                    String str11 = chain.display_name;
                    if (str11 == null) {
                        String str12 = str;
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return str12;
                    }
                    String str13 = asset.asset;
                    if (str13 == null) {
                        String str14 = str;
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return str14;
                    }
                    String str15 = asset.display_name;
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
        realStablecoinNetworkRepo$getDepositOptions$1 = new RealStablecoinNetworkRepo$getDepositOptions$1(this, continuationImpl);
        Object obj2 = realStablecoinNetworkRepo$getDepositOptions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realStablecoinNetworkRepo$getDepositOptions$1.label;
        String str20 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.squareup.cash.crypto.backend.stablecoin.StablecoinNetworkRepo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getWithdrawalOptions(String str, InputSource inputSource, ContinuationImpl continuationImpl) {
        RealStablecoinNetworkRepo$getWithdrawalOptions$1 realStablecoinNetworkRepo$getWithdrawalOptions$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealStablecoinNetworkRepo$getWithdrawalOptions$1) {
            realStablecoinNetworkRepo$getWithdrawalOptions$1 = (RealStablecoinNetworkRepo$getWithdrawalOptions$1) continuationImpl;
            int i2 = realStablecoinNetworkRepo$getWithdrawalOptions$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realStablecoinNetworkRepo$getWithdrawalOptions$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realStablecoinNetworkRepo$getWithdrawalOptions$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realStablecoinNetworkRepo$getWithdrawalOptions$1.label;
                String str2 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetAvailableNetworksRequest getAvailableNetworksRequest = new GetAvailableNetworksRequest(StringsKt.trim(str).toString(), inputSource, null, ByteString.EMPTY);
                    realStablecoinNetworkRepo$getWithdrawalOptions$1.label = 1;
                    obj = this.blockStableService.getAvailableNetworks(getAvailableNetworksRequest, realStablecoinNetworkRepo$getWithdrawalOptions$1);
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
                GetAvailableNetworksResponse getAvailableNetworksResponse = (GetAvailableNetworksResponse) ((ApiResult.Success) apiResult).response;
                List list = getAvailableNetworksResponse.available_networks;
                ResponseContext responseContext = getAvailableNetworksResponse.response_context;
                if (list.isEmpty() && responseContext != null) {
                    return new StablecoinNetworksResult.NeedsPlasmaFlow(responseContext);
                }
                List<AvailableNetwork> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                for (AvailableNetwork availableNetwork : list2) {
                    Chain chain = availableNetwork.chain;
                    if (chain == null) {
                        String str3 = str2;
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return str3;
                    }
                    Asset asset = availableNetwork.asset;
                    if (asset == null) {
                        String str4 = str2;
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return str4;
                    }
                    Image image = chain.icon;
                    if (image == null) {
                        String str5 = str2;
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return str5;
                    }
                    Image image2 = asset.icon;
                    String str6 = availableNetwork.destination_address;
                    if (str6 == null) {
                        String str7 = str2;
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return str7;
                    }
                    String str8 = availableNetwork.truncated_address;
                    if (str8 == null) {
                        String str9 = str2;
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return str9;
                    }
                    String str10 = chain.chain;
                    if (str10 == null) {
                        String str11 = str2;
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return str11;
                    }
                    String str12 = chain.display_name;
                    if (str12 == null) {
                        String str13 = str2;
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return str13;
                    }
                    String str14 = asset.asset;
                    if (str14 == null) {
                        String str15 = str2;
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return str15;
                    }
                    String str16 = asset.display_name;
                    String str17 = str2;
                    if (str16 == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return str17;
                    }
                    String str18 = image.light_url;
                    if (str18 == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return str17;
                    }
                    String str19 = image.dark_url;
                    if (str19 == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return str17;
                    }
                    arrayList.add(new StablecoinWithdrawalOption(new StablecoinNetwork(str6, str8, str10, str12, str14, str16, str18, str19, image2 != null ? image2.light_url : str17, image2 != null ? image2.dark_url : str17), availableNetwork.amount, availableNetwork.gas_fee, availableNetwork.gas_fee_in_fiat));
                    str2 = str17;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    String upperCase = ((StablecoinWithdrawalOption) next).network.asset.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    if (this.supportedAssets.contains(upperCase)) {
                        arrayList2.add(next);
                    }
                }
                return new StablecoinNetworksResult.Success(arrayList2);
            }
        }
        realStablecoinNetworkRepo$getWithdrawalOptions$1 = new RealStablecoinNetworkRepo$getWithdrawalOptions$1(this, continuationImpl);
        Object obj2 = realStablecoinNetworkRepo$getWithdrawalOptions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realStablecoinNetworkRepo$getWithdrawalOptions$1.label;
        String str22 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
    }
}

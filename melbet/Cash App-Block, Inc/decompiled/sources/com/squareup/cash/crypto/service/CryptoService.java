package com.squareup.cash.crypto.service;

import app.cash.api.ApiResult;
import com.squareup.cash.cryptonauts.api.SetBtcP2pConversionBpsV2Request;
import com.squareup.cash.cryptonauts.api.SetBtcP2pConversionBpsV2Response;
import com.squareup.cash.cryptonauts.api.StartCryptoOnboardingRequest;
import com.squareup.cash.cryptonauts.api.StartCryptoOnboardingResponse;
import com.squareup.cash.cryptonauts.api.UsdOverLNPaymentPreferenceService;
import com.squareup.cash.cryptowallet.api.v2.ConfirmBitcoinDepositIntentRequest;
import com.squareup.cash.cryptowallet.api.v2.ConfirmBitcoinDepositIntentResponse;
import com.squareup.protos.cash.btcmanabar.api.BtcManaBarService;
import com.squareup.protos.cash.btcmoongate.api.UpdateAutoWithdrawSettingsRequest;
import com.squareup.protos.cash.btcmoongate.api.UpdateAutoWithdrawSettingsResponse;
import com.squareup.protos.cash.btcnetwork.external.BtcNetworkClientService;
import com.squareup.protos.cash.cryptoinvestflow.service.ExchangeRequest;
import com.squareup.protos.cash.cryptoinvestflow.service.ExchangeResponse;
import com.squareup.protos.cash.cryptoinvestflow.service.GetCryptoTaxStatementsClientRequest;
import com.squareup.protos.cash.cryptoinvestflow.service.GetCryptoTaxStatementsResponse;
import com.squareup.protos.cash.cryptosparky.api.CryptoSparkyService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005J(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\rJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0010H§@¢\u0006\u0002\u0010\u0011J(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00072\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\u0014H§@¢\u0006\u0002\u0010\u0015J(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\u0018H§@¢\u0006\u0002\u0010\u0019J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u001cH§@¢\u0006\u0002\u0010\u001dJ\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00072\b\b\u0001\u0010\u000b\u001a\u00020 H§@¢\u0006\u0002\u0010!¨\u0006\"À\u0006\u0003"}, d2 = {"Lcom/squareup/cash/crypto/service/CryptoService;", "Lcom/squareup/protos/cash/btcmanabar/api/BtcManaBarService;", "Lcom/squareup/protos/cash/cryptosparky/api/CryptoSparkyService;", "Lcom/squareup/protos/cash/cryptosparky/api/deposits/CryptoSparkyService;", "Lcom/squareup/protos/cash/btcnetwork/external/BtcNetworkClientService;", "Lcom/squareup/cash/cryptonauts/api/UsdOverLNPaymentPreferenceService;", "initiateCryptoExchange", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/cryptoinvestflow/service/ExchangeResponse;", "flowToken", "", "request", "Lcom/squareup/protos/cash/cryptoinvestflow/service/ExchangeRequest;", "(Ljava/lang/String;Lcom/squareup/protos/cash/cryptoinvestflow/service/ExchangeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCryptoStatements", "Lcom/squareup/protos/cash/cryptoinvestflow/service/GetCryptoTaxStatementsResponse;", "Lcom/squareup/protos/cash/cryptoinvestflow/service/GetCryptoTaxStatementsClientRequest;", "(Lcom/squareup/protos/cash/cryptoinvestflow/service/GetCryptoTaxStatementsClientRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cryptoOnboarding", "Lcom/squareup/cash/cryptonauts/api/StartCryptoOnboardingResponse;", "Lcom/squareup/cash/cryptonauts/api/StartCryptoOnboardingRequest;", "(Ljava/lang/String;Lcom/squareup/cash/cryptonauts/api/StartCryptoOnboardingRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmBitcoinDepositIntent", "Lcom/squareup/cash/cryptowallet/api/v2/ConfirmBitcoinDepositIntentResponse;", "Lcom/squareup/cash/cryptowallet/api/v2/ConfirmBitcoinDepositIntentRequest;", "(Ljava/lang/String;Lcom/squareup/cash/cryptowallet/api/v2/ConfirmBitcoinDepositIntentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setBtcP2pConversionBps", "Lcom/squareup/cash/cryptonauts/api/SetBtcP2pConversionBpsV2Response;", "Lcom/squareup/cash/cryptonauts/api/SetBtcP2pConversionBpsV2Request;", "(Lcom/squareup/cash/cryptonauts/api/SetBtcP2pConversionBpsV2Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAutoWithdrawSettings", "Lcom/squareup/protos/cash/btcmoongate/api/UpdateAutoWithdrawSettingsResponse;", "Lcom/squareup/protos/cash/btcmoongate/api/UpdateAutoWithdrawSettingsRequest;", "(Lcom/squareup/protos/cash/btcmoongate/api/UpdateAutoWithdrawSettingsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CryptoService extends BtcManaBarService, CryptoSparkyService, com.squareup.protos.cash.cryptosparky.api.deposits.CryptoSparkyService, BtcNetworkClientService, UsdOverLNPaymentPreferenceService {
    @POST("/cash-app/crypto-deposits/confirm-onchain-deposit")
    Object confirmBitcoinDepositIntent(@Header("Cash-Flow-Token") String str, @Body ConfirmBitcoinDepositIntentRequest confirmBitcoinDepositIntentRequest, Continuation<? super ApiResult<ConfirmBitcoinDepositIntentResponse>> continuation);

    @POST("cash-app/crypto-onboarding")
    Object cryptoOnboarding(@Header("Cash-Flow-Token") String str, @Body StartCryptoOnboardingRequest startCryptoOnboardingRequest, Continuation<? super ApiResult<StartCryptoOnboardingResponse>> continuation);

    @POST("/cash-app/crypto/invest/get-crypto-tax-statements-external")
    Object getCryptoStatements(@Body GetCryptoTaxStatementsClientRequest getCryptoTaxStatementsClientRequest, Continuation<? super ApiResult<GetCryptoTaxStatementsResponse>> continuation);

    @POST("/cash-app/crypto/invest/exchange")
    Object initiateCryptoExchange(@Header("Cash-Flow-Token") String str, @Body ExchangeRequest exchangeRequest, Continuation<? super ApiResult<ExchangeResponse>> continuation);

    @POST("/cash-app/set-btc-p2p-conversion-bps")
    Object setBtcP2pConversionBps(@Body SetBtcP2pConversionBpsV2Request setBtcP2pConversionBpsV2Request, Continuation<? super ApiResult<SetBtcP2pConversionBpsV2Response>> continuation);

    @POST("/cash-app/crypto-withdrawals/auto-withdraw/update-settings")
    Object updateAutoWithdrawSettings(@Body UpdateAutoWithdrawSettingsRequest updateAutoWithdrawSettingsRequest, Continuation<? super ApiResult<UpdateAutoWithdrawSettingsResponse>> continuation);
}

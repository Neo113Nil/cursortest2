package defpackage;

import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.wallet.PaymentData;
import com.yandex.fintechsdk.core.analytics.impl.internal.a;
import com.yandex.fintechsdk.features.splash.internal.presentation.SplashFragment;
import com.yandex.fintechsdk.features.webview.payment.internal.presentation.WebViewPaymentFragment;
import com.yandex.payment.sdk.cardscanner.CardScannerActivity;
import com.yandex.payment.sdk.core.camerascanner.CardScanData;
import com.yandex.payment.sdk.core.camerascanner.CardScannerError;
import com.yandex.payment.sdk.ui.SplashActivity;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.BindNewCardEvents$BindNewCardResultResult;
import com.ybsdk.feature.kyc.internal.screens.photo.KycPhotoFragment;
import com.ybsdk.feature.kycesia.internal.screens.browser.OpenEsiaFragment;
import com.ybsdk.feature.kycesia.internal.screens.sdk.OpenEsiaSdkFragment;
import com.ybsdk.feature.qr.internal.screens.reader.presentation.QrReaderFragment;
import com.ybsdk.feature.webview.internal.presentation.WebViewFragment;
import java.util.LinkedHashMap;
import kotlin.Pair;
import org.json.JSONException;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes10.dex */
public final /* synthetic */ class v50 implements u40 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v50(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.u40
    public final void a(Object obj) {
        Object za0Var;
        BindNewCardEvents$BindNewCardResultResult bindNewCardEvents$BindNewCardResultResult;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((tls) ((oz40) obj2).getValue()).invoke(obj);
                break;
            case 1:
                r90 r90Var = (r90) obj2;
                ActivityResult activityResult = (ActivityResult) obj;
                AppAnalyticsReporter appAnalyticsReporter = r90Var.c;
                appAnalyticsReporter.f.a.a("bind_new_card.confirm.click", null);
                int resultCode = activityResult.getResultCode();
                ya0 ya0Var = ya0.a;
                xa0 xa0Var = xa0.a;
                if (resultCode != -1) {
                    if (resultCode != 0) {
                        za0Var = ya0Var;
                    }
                    za0Var = xa0Var;
                } else {
                    String c = r90Var.b.c(activityResult.getData());
                    if (c != null) {
                        za0Var = new za0(c);
                    }
                    za0Var = xa0Var;
                }
                em3 em3Var = appAnalyticsReporter.f;
                if (!za0Var.equals(xa0Var)) {
                    if (!za0Var.equals(ya0Var)) {
                        if (!(za0Var instanceof za0)) {
                            w511.b();
                            break;
                        } else {
                            bindNewCardEvents$BindNewCardResultResult = BindNewCardEvents$BindNewCardResultResult.OK;
                        }
                    } else {
                        bindNewCardEvents$BindNewCardResultResult = BindNewCardEvents$BindNewCardResultResult.ERROR;
                    }
                } else {
                    bindNewCardEvents$BindNewCardResultResult = BindNewCardEvents$BindNewCardResultResult.CANCEL;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(2);
                linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, bindNewCardEvents$BindNewCardResultResult.getOriginalValue());
                em3Var.a.a("bind_new_card.result", linkedHashMap);
                r90Var.d.g(za0Var);
                break;
            case 2:
                avt avtVar = (avt) obj2;
                z22 z22Var = avtVar.a;
                ko2 ko2Var = (ko2) obj;
                int statusCode = ko2Var.b.getStatusCode();
                if (statusCode == 0) {
                    PaymentData paymentData = (PaymentData) ko2Var.a;
                    String json2 = paymentData != null ? paymentData.toJson() : null;
                    if (json2 == null) {
                        avtVar.a("Empty info");
                        break;
                    } else {
                        try {
                            ((a) z22Var).a(new keo("google_pay_success", gw00.e(new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Успешно выписан токен Google Pay"))));
                            r1s r1sVar = avtVar.d;
                            if (r1sVar != null) {
                                r1sVar.g(json2);
                                break;
                            }
                        } catch (JSONException e) {
                            avtVar.a(e.getMessage());
                            return;
                        }
                    }
                } else if (statusCode == 16) {
                    ((a) z22Var).a(new keo("google_pay_cancel", g8e.z(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Отмена оплаты Google Pay")));
                    r1s r1sVar2 = avtVar.d;
                    if (r1sVar2 != null) {
                        ((jh5) r1sVar2.w).a.dispatch(((qut) r1sVar2.c).a);
                        break;
                    }
                } else {
                    avtVar.a(ko2Var.b.getStatusMessage());
                    break;
                }
                break;
            case 3:
                KycPhotoFragment.activityResultLauncher$lambda$0((KycPhotoFragment) obj2, (ActivityResult) obj);
                break;
            case 4:
                lg lgVar = (lg) obj2;
                ActivityResult activityResult2 = (ActivityResult) obj;
                vs7 vs7Var = (vs7) lgVar.c;
                if (vs7Var != null) {
                    lgVar.c = null;
                    int resultCode2 = activityResult2.getResultCode();
                    Intent data = activityResult2.getData();
                    if (resultCode2 == -1) {
                        if (data != null) {
                            CardScanData cardScanData = (CardScanData) data.getParcelableExtra(CardScannerActivity.CARD_DATA);
                            if (cardScanData != null) {
                                vs7Var.f(cardScanData);
                                break;
                            }
                        } else {
                            vs7Var.h(CardScannerError.Unknown);
                            break;
                        }
                    } else if (resultCode2 == 0) {
                        vs7Var.onCancel();
                        break;
                    } else if (resultCode2 == 2) {
                        if (data != null) {
                            CardScannerError cardScannerError = (CardScannerError) data.getParcelableExtra(CardScannerActivity.ERROR_TYPE);
                            if (cardScannerError != null) {
                                vs7Var.h(cardScannerError);
                                break;
                            }
                        } else {
                            vs7Var.h(CardScannerError.Unknown);
                            break;
                        }
                    }
                    vs7Var.h(CardScannerError.Unknown);
                    break;
                }
                break;
            case 5:
                OpenEsiaFragment.launchBrowserContract$lambda$0((OpenEsiaFragment) obj2, (Uri) obj);
                break;
            case 6:
                OpenEsiaSdkFragment.resultContractLauncher$lambda$0((OpenEsiaSdkFragment) obj2, (Uri) obj);
                break;
            case 7:
                QrReaderFragment.filePickerLauncher$lambda$1((QrReaderFragment) obj2, (Uri) obj);
                break;
            case 8:
                SplashActivity.activityLauncher$lambda$0((SplashActivity) obj2, (frt0) obj);
                break;
            case 9:
                SplashFragment.initAuthContract$lambda$1((SplashFragment) obj2, (Long) obj);
                break;
            case 10:
                WebViewFragment.chooseFileActivityLauncher$lambda$2((WebViewFragment) obj2, (ActivityResult) obj);
                break;
            default:
                WebViewPaymentFragment.initAuthContract$lambda$6((WebViewPaymentFragment) obj2, (Long) obj);
                break;
        }
    }
}

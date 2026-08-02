package defpackage;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.a;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.ChangePhoneEvents$ChangePhoneResultResult;
import com.ybsdk.core.analytics.generated.delegates.ChangePhoneEvents$ChangePhoneStateChangedState;
import com.ybsdk.core.analytics.generated.delegates.Me2mePullDebitEvents$Me2mePullDebitAutoPullScreenConfirmResultResult;
import com.ybsdk.core.analytics.generated.delegates.Me2mePullDebitEvents$Me2mePullDebitAutoPullScreenLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.Me2mePullDebitEvents$Me2mePullDebitPermissionListChangeResultResult;
import com.ybsdk.core.analytics.generated.delegates.Me2mePullDebitEvents$Me2mePullDebitPermissionListLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.Me2mePullDebitEvents$Me2mePullDebitPermissionStateResultResult;
import com.ybsdk.core.analytics.generated.delegates.Me2mePullDebitEvents$Me2mePullDebitPermissionStateResultState;
import com.ybsdk.core.analytics.generated.delegates.Me2mePullDebitEvents$Me2mePullDebitStateStatusResult;
import com.ybsdk.core.analytics.generated.delegates.PdfEvents$TechPdfParsedErrorBodyType;
import com.ybsdk.core.analytics.generated.delegates.RoundingEvents$RoundingSettingsActivateResultResult;
import com.ybsdk.core.analytics.generated.delegates.RoundingEvents$RoundingSettingsActivateResultStateRounding;
import com.ybsdk.core.analytics.generated.delegates.RoundingEvents$RoundingSettingsActivateResultType;
import com.ybsdk.core.analytics.generated.delegates.RoundingEvents$RoundingSettingsButtonClickButton;
import com.ybsdk.core.analytics.generated.delegates.RoundingEvents$RoundingSettingsButtonClickStateRounding;
import com.ybsdk.core.analytics.generated.delegates.RoundingEvents$RoundingSettingsSaveChangesButtonClickButton;
import com.ybsdk.core.analytics.generated.delegates.RoundingEvents$RoundingSettingsSaveChangesButtonClickStateRounding;
import com.ybsdk.core.analytics.generated.delegates.RoundingEvents$RoundingSettingsSourceSetStateRounding;
import com.ybsdk.core.analytics.generated.delegates.RoundingEvents$RoundingSettingsWidgetShownStateWidget;
import com.ybsdk.core.analytics.generated.delegates.RoundingEvents$RoundingSettingsWidgetShownWidget;
import com.ybsdk.core.analytics.generated.delegates.SecondFactoryAuthEvents$SecondFactorAuthPhoneConfirmationCodeCheckResult;
import com.ybsdk.core.analytics.generated.delegates.SecondFactoryAuthEvents$SecondFactorAuthPhoneConfirmationCodeResendResult;
import com.ybsdk.core.analytics.generated.delegates.SecondFactoryAuthEvents$SecondFactorAuthResultResult;
import com.ybsdk.core.analytics.generated.delegates.TopupEvents$TopupPaymentResultError;
import com.ybsdk.core.analytics.generated.delegates.TopupEvents$TopupPaymentResultResult;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferCrossBorderByPhoneOtherBankLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferCrossBorderByPhoneOtherBankSelectLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferPaymentInitiatedChosenMethod;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferPaymentResultChosenMethod;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferPaymentResultError;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferPaymentResultResult;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferPhoneOtherBankLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferPhoneOtherBankSelectLoadedResult;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.core.transfer.utils.domain.AnalyticsPaymentStatus;
import com.ybsdk.core.transfer.utils.domain.entities.AnalyticsSourceScreen;
import com.ybsdk.feature.autotopup.internal.domain.entities.rounding.RoundingStatusEntity;
import com.ybsdk.feature.autotopup.internal.network.dto.rounding.RoundingStatus;
import com.ybsdk.feature.autotopup.internal.presentation.saver.RoundingParams;
import com.ybsdk.feature.autotopup.internal.presentation.saver.RoundingState;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.Me2MeDebitResultState$WidgetState;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.domain.Me2MeDebitResultEntity$Status;
import com.ybsdk.network.dto.CreateApplicationWithProductJsonAdapter;
import com.ybsdk.screens.registration.codeconfirmation.domain.interactors.CodeConfirmationAnalyticsInteractor$ConfirmationCodeResult;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes3.dex */
public final class us3 implements hxs, c9c {
    public final AppAnalyticsReporter a;

    public /* synthetic */ us3(AppAnalyticsReporter appAnalyticsReporter) {
        this.a = appAnalyticsReporter;
    }

    public void A(Me2MeDebitResultEntity$Status me2MeDebitResultEntity$Status) {
        Me2mePullDebitEvents$Me2mePullDebitStateStatusResult me2mePullDebitEvents$Me2mePullDebitStateStatusResult;
        l0p l0pVar = this.a.I;
        int i = f910.a[me2MeDebitResultEntity$Status.ordinal()];
        if (i == 1) {
            me2mePullDebitEvents$Me2mePullDebitStateStatusResult = Me2mePullDebitEvents$Me2mePullDebitStateStatusResult.PENDING;
        } else if (i == 2) {
            me2mePullDebitEvents$Me2mePullDebitStateStatusResult = Me2mePullDebitEvents$Me2mePullDebitStateStatusResult.ERROR;
        } else if (i == 3) {
            me2mePullDebitEvents$Me2mePullDebitStateStatusResult = Me2mePullDebitEvents$Me2mePullDebitStateStatusResult.OK;
        } else {
            if (i != 4) {
                w511.b();
                return;
            }
            me2mePullDebitEvents$Me2mePullDebitStateStatusResult = Me2mePullDebitEvents$Me2mePullDebitStateStatusResult.UNKNOWN;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, me2mePullDebitEvents$Me2mePullDebitStateStatusResult.getOriginalValue());
        l0pVar.a.a("me2me_pull_debit.state.status", linkedHashMap);
    }

    @Override // defpackage.hxs
    public void a(String str, AnalyticsSourceScreen analyticsSourceScreen, TransferEvents$TransferPaymentInitiatedChosenMethod transferEvents$TransferPaymentInitiatedChosenMethod, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = ixs.a[analyticsSourceScreen.ordinal()];
        AppAnalyticsReporter appAnalyticsReporter = this.a;
        if (i != 1) {
            if (i != 2) {
                w511.b();
                return;
            }
            appAnalyticsReporter.o0.a.a("topup.payment.initiated2", new LinkedHashMap(1));
            return;
        }
        em3 em3Var = appAnalyticsReporter.q0;
        byte[] bArr = y5e.c;
        LinkedHashMap linkedHashMap = new LinkedHashMap(8);
        linkedHashMap.put("chosen_method", transferEvents$TransferPaymentInitiatedChosenMethod.getOriginalValue());
        if (str2 != null) {
            byte[] bArr2 = y5e.w;
            byte[] bArr3 = new byte[17];
            for (int i2 = 0; i2 < 17; i2++) {
                bArr3[i2] = (byte) (bArr2[i2] ^ bArr[i2 % 8]);
            }
            linkedHashMap.put(new String(bArr3, uza.a), str2);
        }
        if (str7 != null) {
            byte[] bArr4 = y5e.m;
            byte[] bArr5 = new byte[17];
            for (int i3 = 0; i3 < 17; i3++) {
                bArr5[i3] = (byte) (bArr4[i3] ^ bArr[i3 % 8]);
            }
            linkedHashMap.put(new String(bArr5, uza.a), str7);
        }
        linkedHashMap.put("transfer_session_id", str3);
        linkedHashMap.put("transfer_direction", str4);
        if (str5 != null) {
            linkedHashMap.put("transfer_scenario", str5);
        }
        if (str != null) {
            linkedHashMap.put(CreateApplicationWithProductJsonAdapter.productKey, str);
        }
        if (str6 != null) {
            linkedHashMap.put("transfer_id", str6);
        }
        em3Var.a.a("transfer.payment.initiated", linkedHashMap);
    }

    @Override // defpackage.hxs
    public void b(String str, AnalyticsPaymentStatus analyticsPaymentStatus, AnalyticsSourceScreen analyticsSourceScreen, String str2, String str3, String str4, String str5, String str6, String str7, TransferEvents$TransferPaymentResultChosenMethod transferEvents$TransferPaymentResultChosenMethod, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        AppAnalyticsReporter appAnalyticsReporter = this.a;
        em3 em3Var = appAnalyticsReporter.q0;
        z94 z94Var = appAnalyticsReporter.o0;
        switch (ixs.b[analyticsPaymentStatus.ordinal()]) {
            case 1:
                int i = ixs.a[analyticsSourceScreen.ordinal()];
                if (i == 1) {
                    em3Var.B(null, str2 != null ? ssa1.b(str2) : null, str3 != null ? ssa1.b(str3) : null, str4 != null ? ssa1.b(str4) : null, str5 != null ? ssa1.b(str5) : null, transferEvents$TransferPaymentResultChosenMethod, str12, str13, str14, str15, str6 != null ? ssa1.b(str6) : null, str7 != null ? ssa1.b(str7) : null, str8, str9, str10, TransferEvents$TransferPaymentResultResult.OK, str, str11);
                    break;
                } else if (i != 2) {
                    w511.b();
                    break;
                } else {
                    z94.z(z94Var, TopupEvents$TopupPaymentResultResult.OK, null, 14);
                    break;
                }
            case 2:
                int i2 = ixs.a[analyticsSourceScreen.ordinal()];
                if (i2 == 1) {
                    em3Var.B(TransferEvents$TransferPaymentResultError.PRODUCT_ERROR, str2 != null ? ssa1.b(str2) : null, str3 != null ? ssa1.b(str3) : null, str4 != null ? ssa1.b(str4) : null, str5 != null ? ssa1.b(str5) : null, transferEvents$TransferPaymentResultChosenMethod, str12, str13, str14, str15, str6 != null ? ssa1.b(str6) : null, str7 != null ? ssa1.b(str7) : null, str8, str9, str10, TransferEvents$TransferPaymentResultResult.ERROR, str, str11);
                    break;
                } else if (i2 != 2) {
                    w511.b();
                    break;
                } else {
                    z94.z(z94Var, TopupEvents$TopupPaymentResultResult.ERROR, TopupEvents$TopupPaymentResultError.PAYMENT_FAILED, 12);
                    break;
                }
            case 3:
                int i3 = ixs.a[analyticsSourceScreen.ordinal()];
                if (i3 == 1) {
                    em3Var.B(null, str2 != null ? ssa1.b(str2) : null, str3 != null ? ssa1.b(str3) : null, str4 != null ? ssa1.b(str4) : null, str5 != null ? ssa1.b(str5) : null, transferEvents$TransferPaymentResultChosenMethod, str12, str13, str14, str15, str6 != null ? ssa1.b(str6) : null, str7 != null ? ssa1.b(str7) : null, str8, str9, str10, TransferEvents$TransferPaymentResultResult.TIMEOUT, str, str11);
                    break;
                } else if (i3 != 2) {
                    w511.b();
                    break;
                } else {
                    z94.z(z94Var, TopupEvents$TopupPaymentResultResult.CANCEL, null, 14);
                    break;
                }
            case 4:
                int i4 = ixs.a[analyticsSourceScreen.ordinal()];
                if (i4 == 1) {
                    em3Var.B(TransferEvents$TransferPaymentResultError.NETWORK_ERROR, str2 != null ? ssa1.b(str2) : null, str3 != null ? ssa1.b(str3) : null, str4 != null ? ssa1.b(str4) : null, str5 != null ? ssa1.b(str5) : null, transferEvents$TransferPaymentResultChosenMethod, str12, str13, str14, str15, str6 != null ? ssa1.b(str6) : null, str7 != null ? ssa1.b(str7) : null, str8, str9, str10, TransferEvents$TransferPaymentResultResult.ERROR, str, str11);
                    break;
                } else if (i4 != 2) {
                    w511.b();
                    break;
                } else {
                    z94.z(z94Var, TopupEvents$TopupPaymentResultResult.ERROR, TopupEvents$TopupPaymentResultError.PAYMENT_FAILED, 12);
                    break;
                }
            case 5:
                int i5 = ixs.a[analyticsSourceScreen.ordinal()];
                if (i5 == 1) {
                    em3Var.B(null, str2 != null ? ssa1.b(str2) : null, str3 != null ? ssa1.b(str3) : null, str4 != null ? ssa1.b(str4) : null, str5 != null ? ssa1.b(str5) : null, transferEvents$TransferPaymentResultChosenMethod, str12, str13, str14, str15, str6 != null ? ssa1.b(str6) : null, str7 != null ? ssa1.b(str7) : null, str8, str9, str10, TransferEvents$TransferPaymentResultResult.ACCEPTED, str, str11);
                    break;
                } else if (i5 != 2) {
                    w511.b();
                    break;
                } else {
                    z94.z(z94Var, TopupEvents$TopupPaymentResultResult.OK, null, 14);
                    break;
                }
            case 6:
                break;
            default:
                w511.b();
                break;
        }
    }

    public void c(Me2mePullDebitEvents$Me2mePullDebitAutoPullScreenConfirmResultResult me2mePullDebitEvents$Me2mePullDebitAutoPullScreenConfirmResultResult) {
        l0p l0pVar = this.a.I;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, me2mePullDebitEvents$Me2mePullDebitAutoPullScreenConfirmResultResult.getOriginalValue());
        l0pVar.a.a("me2me_pull_debit.auto_pull_screen.confirm.result", linkedHashMap);
    }

    public void d(int i, String str, String str2, TransferScenario transferScenario) {
        byte[] bArr = y5e.d;
        byte[] bArr2 = y5e.R;
        em3 em3Var = this.a.q0;
        switch (transferScenario == null ? -1 : ui90.a[transferScenario.ordinal()]) {
            case -1:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                LinkedHashMap linkedHashMap = new LinkedHashMap(3);
                linkedHashMap.put(y5e.o(bArr2), Integer.valueOf(i));
                linkedHashMap.put(y5e.o(bArr), str);
                linkedHashMap.put("transfer_session_id", str2);
                em3Var.a.a(y5e.o(y5e.h), linkedHashMap);
                break;
            case 0:
            default:
                w511.b();
                break;
            case 13:
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(3);
                linkedHashMap2.put(y5e.o(bArr2), Integer.valueOf(i));
                linkedHashMap2.put(y5e.o(bArr), str);
                linkedHashMap2.put("transfer_session_id", str2);
                em3Var.a.a(y5e.o(y5e.O), linkedHashMap2);
                break;
        }
    }

    public void e(PdfEvents$TechPdfParsedErrorBodyType pdfEvents$TechPdfParsedErrorBodyType) {
        em3 em3Var = this.a.Q;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put("type", pdfEvents$TechPdfParsedErrorBodyType.getOriginalValue());
        em3Var.a.a("tech.pdf.parsed_error_body", linkedHashMap);
    }

    public void f(String str, TransferScenario transferScenario) {
        byte[] bArr = y5e.c;
        em3 em3Var = this.a.q0;
        int i = 0;
        switch (transferScenario == null ? -1 : ui90.a[transferScenario.ordinal()]) {
            case -1:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                LinkedHashMap w = g8e.w(1, "transfer_session_id", str);
                a aVar = em3Var.a;
                byte[] bArr2 = y5e.F;
                byte[] bArr3 = new byte[35];
                while (i < 35) {
                    bArr3[i] = (byte) (bArr2[i] ^ bArr[i % 8]);
                    i++;
                }
                aVar.a(new String(bArr3, uza.a), w);
                break;
            case 0:
            default:
                w511.b();
                break;
            case 13:
                LinkedHashMap w2 = g8e.w(1, "transfer_session_id", str);
                a aVar2 = em3Var.a;
                byte[] bArr4 = y5e.G;
                byte[] bArr5 = new byte[51];
                while (i < 51) {
                    bArr5[i] = (byte) (bArr4[i] ^ bArr[i % 8]);
                    i++;
                }
                aVar2.a(new String(bArr5, uza.a), w2);
                break;
        }
    }

    public void g(String str, String str2, TransferScenario transferScenario) {
        em3 em3Var = this.a.q0;
        switch (transferScenario == null ? -1 : ui90.a[transferScenario.ordinal()]) {
            case -1:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                em3Var.G(TransferEvents$TransferPhoneOtherBankLoadedResult.ERROR, str, str2);
                break;
            case 0:
            default:
                w511.b();
                break;
            case 13:
                em3Var.x(TransferEvents$TransferCrossBorderByPhoneOtherBankLoadedResult.ERROR, str, str2);
                break;
        }
    }

    @Override // defpackage.c9c
    public void h() {
        this.a.g0.a.a("second_factor_auth.phone.confirmation_code.enter", null);
    }

    public void i(String str, TransferScenario transferScenario) {
        em3 em3Var = this.a.q0;
        switch (transferScenario == null ? -1 : ui90.a[transferScenario.ordinal()]) {
            case -1:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                em3Var.G(TransferEvents$TransferPhoneOtherBankLoadedResult.OK, null, str);
                break;
            case 0:
            default:
                w511.b();
                break;
            case 13:
                em3Var.x(TransferEvents$TransferCrossBorderByPhoneOtherBankLoadedResult.OK, null, str);
                break;
        }
    }

    public void j(String str, String str2, TransferScenario transferScenario) {
        em3 em3Var = this.a.q0;
        switch (transferScenario == null ? -1 : ui90.a[transferScenario.ordinal()]) {
            case -1:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                em3Var.H(TransferEvents$TransferPhoneOtherBankSelectLoadedResult.ERROR, str, Boolean.FALSE, str2);
                break;
            case 0:
            default:
                w511.b();
                break;
            case 13:
                em3Var.y(TransferEvents$TransferCrossBorderByPhoneOtherBankSelectLoadedResult.ERROR, str, Boolean.FALSE, str2);
                break;
        }
    }

    @Override // defpackage.c9c
    public void k() {
        this.a.g0.a.a("second_factor_auth.phone.confirmation_code.support.open", null);
    }

    public void l(boolean z, String str, TransferScenario transferScenario) {
        em3 em3Var = this.a.q0;
        switch (transferScenario == null ? -1 : ui90.a[transferScenario.ordinal()]) {
            case -1:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                em3Var.H(TransferEvents$TransferPhoneOtherBankSelectLoadedResult.OK, null, Boolean.valueOf(z), str);
                break;
            case 0:
            default:
                w511.b();
                break;
            case 13:
                em3Var.y(TransferEvents$TransferCrossBorderByPhoneOtherBankSelectLoadedResult.OK, null, Boolean.valueOf(z), str);
                break;
        }
    }

    public void m(List list, String str, Me2mePullDebitEvents$Me2mePullDebitPermissionListChangeResultResult me2mePullDebitEvents$Me2mePullDebitPermissionListChangeResultResult) {
        l0p l0pVar = this.a.I;
        String obj = list.toString();
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        linkedHashMap.put(y5e.o(y5e.j), obj);
        linkedHashMap.put(y5e.o(y5e.d), str);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, me2mePullDebitEvents$Me2mePullDebitPermissionListChangeResultResult.getOriginalValue());
        l0pVar.a.a("me2me_pull_debit.permission_list.change.result", linkedHashMap);
    }

    public void n(List list, Me2mePullDebitEvents$Me2mePullDebitPermissionListLoadedResult me2mePullDebitEvents$Me2mePullDebitPermissionListLoadedResult) {
        l0p l0pVar = this.a.I;
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ks3 ks3Var = (ks3) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", ks3Var.a);
            jSONObject.put("title", ks3Var.b);
            jSONObject.put("logo", ks3Var.c);
            jSONObject.put("action_description", ks3Var.d);
            jSONObject.put(ACSPConstants.STATUS, ks3Var.e);
            jSONArray.put(jSONObject);
        }
        String jSONArray2 = jSONArray.toString();
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        byte[] bArr = y5e.j;
        byte[] bArr2 = new byte[10];
        for (int i = 0; i < 10; i++) {
            bArr2[i] = (byte) (bArr[i] ^ y5e.c[i % 8]);
        }
        linkedHashMap.put(new String(bArr2, uza.a), jSONArray2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, me2mePullDebitEvents$Me2mePullDebitPermissionListLoadedResult.getOriginalValue());
        l0pVar.a.a("me2me_pull_debit.permission_list.loaded", linkedHashMap);
    }

    @Override // defpackage.c9c
    public void o(CodeConfirmationAnalyticsInteractor$ConfirmationCodeResult codeConfirmationAnalyticsInteractor$ConfirmationCodeResult) {
        SecondFactoryAuthEvents$SecondFactorAuthResultResult secondFactoryAuthEvents$SecondFactorAuthResultResult;
        rt1 rt1Var = this.a.g0;
        int i = d9c.a[codeConfirmationAnalyticsInteractor$ConfirmationCodeResult.ordinal()];
        if (i == 1) {
            secondFactoryAuthEvents$SecondFactorAuthResultResult = SecondFactoryAuthEvents$SecondFactorAuthResultResult.OK;
        } else if (i == 2) {
            secondFactoryAuthEvents$SecondFactorAuthResultResult = SecondFactoryAuthEvents$SecondFactorAuthResultResult.CANCEL;
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            secondFactoryAuthEvents$SecondFactorAuthResultResult = SecondFactoryAuthEvents$SecondFactorAuthResultResult.ERROR;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, secondFactoryAuthEvents$SecondFactorAuthResultResult.getOriginalValue());
        rt1Var.a.a("second_factor_auth.result", linkedHashMap);
    }

    @Override // defpackage.c9c
    public void p(boolean z) {
        rt1 rt1Var = this.a.g0;
        SecondFactoryAuthEvents$SecondFactorAuthPhoneConfirmationCodeResendResult secondFactoryAuthEvents$SecondFactorAuthPhoneConfirmationCodeResendResult = z ? SecondFactoryAuthEvents$SecondFactorAuthPhoneConfirmationCodeResendResult.OK : SecondFactoryAuthEvents$SecondFactorAuthPhoneConfirmationCodeResendResult.ERROR;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, secondFactoryAuthEvents$SecondFactorAuthPhoneConfirmationCodeResendResult.getOriginalValue());
        rt1Var.a.a("second_factor_auth.phone.confirmation_code.resend", linkedHashMap);
    }

    public void q(Me2MeDebitResultState$WidgetState me2MeDebitResultState$WidgetState, Me2mePullDebitEvents$Me2mePullDebitPermissionStateResultResult me2mePullDebitEvents$Me2mePullDebitPermissionStateResultResult) {
        Me2mePullDebitEvents$Me2mePullDebitPermissionStateResultState me2mePullDebitEvents$Me2mePullDebitPermissionStateResultState;
        l0p l0pVar = this.a.I;
        int i = f910.b[me2MeDebitResultState$WidgetState.ordinal()];
        if (i == 1) {
            me2mePullDebitEvents$Me2mePullDebitPermissionStateResultState = Me2mePullDebitEvents$Me2mePullDebitPermissionStateResultState.OFF;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            me2mePullDebitEvents$Me2mePullDebitPermissionStateResultState = Me2mePullDebitEvents$Me2mePullDebitPermissionStateResultState.ON;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(ClidProvider.STATE, me2mePullDebitEvents$Me2mePullDebitPermissionStateResultState.getOriginalValue());
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, me2mePullDebitEvents$Me2mePullDebitPermissionStateResultResult.getOriginalValue());
        l0pVar.a.a("me2me_pull_debit.permission_state.result", linkedHashMap);
    }

    public void r(RoundingParams roundingParams, RoundingState roundingState, RoundingEvents$RoundingSettingsButtonClickButton roundingEvents$RoundingSettingsButtonClickButton) {
        String id;
        String str;
        dzk0 dzk0Var;
        dzk0 dzk0Var2;
        fa4 fa4Var;
        ea4 ea4Var;
        Money money;
        BigDecimal amount;
        u8j0 u8j0Var = roundingState.e;
        xyk0 xyk0Var = roundingState.c;
        z94 z94Var = this.a.e0;
        String agreementId = roundingParams.getAgreementId();
        h5a0 h5a0Var = roundingState.g;
        String str2 = "";
        if (h5a0Var == null || (id = h5a0Var.getId()) == null) {
            h5a0 h5a0Var2 = roundingState.f;
            id = h5a0Var2 != null ? h5a0Var2.getId() : "";
        }
        RoundingStatus roundingStatus = null;
        Double valueOf = (xyk0Var == null || (money = xyk0Var.c) == null || (amount = money.getAmount()) == null) ? null : Double.valueOf(amount.doubleValue());
        ezk0 ezk0Var = (ezk0) u8j0Var.a();
        String str3 = (ezk0Var == null || (dzk0Var2 = ezk0Var.a) == null || (fa4Var = dzk0Var2.b) == null || (ea4Var = fa4Var.b) == null) ? null : ea4Var.a;
        ezk0 ezk0Var2 = (ezk0) u8j0Var.a();
        if (ezk0Var2 != null && (dzk0Var = ezk0Var2.a) != null) {
            roundingStatus = dzk0Var.a;
        }
        RoundingEvents$RoundingSettingsButtonClickStateRounding roundingEvents$RoundingSettingsButtonClickStateRounding = roundingStatus == RoundingStatus.ENABLED ? RoundingEvents$RoundingSettingsButtonClickStateRounding.CHANGE : RoundingEvents$RoundingSettingsButtonClickStateRounding.NEW;
        if (xyk0Var != null && (str = xyk0Var.a) != null) {
            str2 = str;
        }
        LinkedHashMap t = x4e.t(7, "agreement_id", agreementId, "source_agreement_id", id);
        if (valueOf != null) {
            t.put("amount_predict", valueOf);
        }
        if (str3 != null) {
            t.put("amount_fact", str3);
        }
        t.put("button", roundingEvents$RoundingSettingsButtonClickButton.getOriginalValue());
        t.put("state_rounding", roundingEvents$RoundingSettingsButtonClickStateRounding.getOriginalValue());
        t.put("type_amount", str2);
        z94Var.a.a("rounding.settings.button.click", t);
    }

    @Override // defpackage.c9c
    public void s(int i, Throwable th) {
        rt1 rt1Var = this.a.g0;
        SecondFactoryAuthEvents$SecondFactorAuthPhoneConfirmationCodeCheckResult secondFactoryAuthEvents$SecondFactorAuthPhoneConfirmationCodeCheckResult = SecondFactoryAuthEvents$SecondFactorAuthPhoneConfirmationCodeCheckResult.ERROR;
        String message = th.getMessage();
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, secondFactoryAuthEvents$SecondFactorAuthPhoneConfirmationCodeCheckResult.getOriginalValue());
        if (message != null) {
            linkedHashMap.put("error", message);
        }
        linkedHashMap.put("attempt", Integer.valueOf(i));
        rt1Var.a.a("second_factor_auth.phone.confirmation_code.check", linkedHashMap);
    }

    public void t(RoundingParams roundingParams, RoundingState roundingState, boolean z) {
        dzk0 dzk0Var;
        z94 z94Var = this.a.e0;
        String agreementId = roundingParams.getAgreementId();
        RoundingEvents$RoundingSettingsSaveChangesButtonClickButton roundingEvents$RoundingSettingsSaveChangesButtonClickButton = z ? RoundingEvents$RoundingSettingsSaveChangesButtonClickButton.SELECT_BUTTON : RoundingEvents$RoundingSettingsSaveChangesButtonClickButton.REFUSE_BUTTON;
        ezk0 ezk0Var = (ezk0) roundingState.e.a();
        RoundingEvents$RoundingSettingsSaveChangesButtonClickStateRounding roundingEvents$RoundingSettingsSaveChangesButtonClickStateRounding = ((ezk0Var == null || (dzk0Var = ezk0Var.a) == null) ? null : dzk0Var.a) == RoundingStatus.ENABLED ? RoundingEvents$RoundingSettingsSaveChangesButtonClickStateRounding.CHANGE : RoundingEvents$RoundingSettingsSaveChangesButtonClickStateRounding.NEW;
        LinkedHashMap w = g8e.w(3, "agreement_id", agreementId);
        w.put("button", roundingEvents$RoundingSettingsSaveChangesButtonClickButton.getOriginalValue());
        if (roundingEvents$RoundingSettingsSaveChangesButtonClickStateRounding != null) {
            w.put("state_rounding", roundingEvents$RoundingSettingsSaveChangesButtonClickStateRounding.getOriginalValue());
        }
        z94Var.a.a("rounding.settings.save_changes.button.click", w);
    }

    public void u(RoundingParams roundingParams, RoundingEvents$RoundingSettingsWidgetShownStateWidget roundingEvents$RoundingSettingsWidgetShownStateWidget) {
        z94 z94Var = this.a.e0;
        String agreementId = roundingParams.getAgreementId();
        RoundingEvents$RoundingSettingsWidgetShownWidget roundingEvents$RoundingSettingsWidgetShownWidget = RoundingEvents$RoundingSettingsWidgetShownWidget.FACT_WIDGET;
        LinkedHashMap w = g8e.w(3, "agreement_id", agreementId);
        w.put("widget", roundingEvents$RoundingSettingsWidgetShownWidget.getOriginalValue());
        w.put("state_widget", roundingEvents$RoundingSettingsWidgetShownStateWidget.getOriginalValue());
        z94Var.a.a("rounding.settings.widget.shown", w);
    }

    public void v(RoundingParams roundingParams, RoundingState roundingState, czk0 czk0Var, RoundingEvents$RoundingSettingsActivateResultResult roundingEvents$RoundingSettingsActivateResultResult) {
        dzk0 dzk0Var;
        z94 z94Var = this.a.e0;
        String agreementId = roundingParams.getAgreementId();
        ezk0 ezk0Var = (ezk0) roundingState.e.a();
        RoundingEvents$RoundingSettingsActivateResultStateRounding roundingEvents$RoundingSettingsActivateResultStateRounding = ((ezk0Var == null || (dzk0Var = ezk0Var.a) == null) ? null : dzk0Var.a) == RoundingStatus.ENABLED ? RoundingEvents$RoundingSettingsActivateResultStateRounding.CHANGE : RoundingEvents$RoundingSettingsActivateResultStateRounding.NEW;
        RoundingEvents$RoundingSettingsActivateResultType roundingEvents$RoundingSettingsActivateResultType = czk0Var.a == RoundingStatusEntity.ENABLED ? RoundingEvents$RoundingSettingsActivateResultType.KEEP : RoundingEvents$RoundingSettingsActivateResultType.DEACTIVATE;
        LinkedHashMap w = g8e.w(4, "agreement_id", agreementId);
        w.put(TarifficatorScenarioActivity.RESULT_KEY, roundingEvents$RoundingSettingsActivateResultResult.getOriginalValue());
        w.put("state_rounding", roundingEvents$RoundingSettingsActivateResultStateRounding.getOriginalValue());
        if (roundingEvents$RoundingSettingsActivateResultType != null) {
            w.put("type", roundingEvents$RoundingSettingsActivateResultType.getOriginalValue());
        }
        z94Var.a.a("rounding.settings.activate.result", w);
    }

    public void w(RoundingParams roundingParams, g5a0 g5a0Var, ezk0 ezk0Var) {
        String str;
        dzk0 dzk0Var;
        z94 z94Var = this.a.e0;
        String agreementId = roundingParams.getAgreementId();
        if (g5a0Var == null || (str = g5a0Var.k) == null) {
            str = "";
        }
        RoundingEvents$RoundingSettingsSourceSetStateRounding roundingEvents$RoundingSettingsSourceSetStateRounding = ((ezk0Var == null || (dzk0Var = ezk0Var.a) == null) ? null : dzk0Var.a) == RoundingStatus.ENABLED ? RoundingEvents$RoundingSettingsSourceSetStateRounding.CHANGE : RoundingEvents$RoundingSettingsSourceSetStateRounding.NEW;
        LinkedHashMap t = x4e.t(3, "agreement_id", agreementId, "source_agreement_id", str);
        t.put("state_rounding", roundingEvents$RoundingSettingsSourceSetStateRounding.getOriginalValue());
        z94Var.a.a("rounding.settings.source.set", t);
    }

    public void x(Me2mePullDebitEvents$Me2mePullDebitAutoPullScreenLoadedResult me2mePullDebitEvents$Me2mePullDebitAutoPullScreenLoadedResult, String str) {
        l0p l0pVar = this.a.I;
        String b = str != null ? ssa1.b(str) : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, me2mePullDebitEvents$Me2mePullDebitAutoPullScreenLoadedResult.getOriginalValue());
        if (b != null) {
            linkedHashMap.put("agreement_id", b);
        }
        l0pVar.a.a("me2me_pull_debit.auto_pull_screen.loaded", linkedHashMap);
    }

    public void y(String str, boolean z) {
        this.a.n.l(z ? ChangePhoneEvents$ChangePhoneResultResult.OK : ChangePhoneEvents$ChangePhoneResultResult.ERROR, str);
    }

    public void z(ChangePhoneEvents$ChangePhoneStateChangedState changePhoneEvents$ChangePhoneStateChangedState) {
        rt1 rt1Var = this.a.n;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put(ClidProvider.STATE, changePhoneEvents$ChangePhoneStateChangedState.getOriginalValue());
        rt1Var.a.a("change_phone.state.changed", linkedHashMap);
    }
}

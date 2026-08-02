package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.TechEvents$TechPollerResultStrategy;
import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.PollingConfig;
import com.ybsdk.rconfig.configs.PollingConfigsImpl;
import com.ybsdk.rconfig.configs.YbCommonBackoffPollingStrategyConfig;
import kotlin.time.DurationUnit;

/* loaded from: classes9.dex */
public final class qyd0 implements nyd0 {
    public final b a;
    public final o370 b;
    public final AppAnalyticsReporter c;

    public qyd0(b bVar, o370 o370Var, AppAnalyticsReporter appAnalyticsReporter) {
        this.a = bVar;
        this.b = o370Var;
        this.c = appAnalyticsReporter;
    }

    public final oyd0 a(q1e0 q1e0Var, f8x f8xVar) {
        vy91 syd0Var;
        lyd0 lyd0Var;
        b bVar = this.a;
        bVar.getClass();
        PollingConfig pollingConfig = ((YbCommonBackoffPollingStrategyConfig) bVar.d(fr51.a).getData()).getJsonValues().get(q1e0Var.a());
        oyd0 oyd0Var = null;
        if (pollingConfig == null) {
            x4c.g("Cant match url for new yb_mobile_common_polling_strategy_config", null, g8e.o("got url: ", q1e0Var.a()), null, 10);
        } else {
            boolean z = pollingConfig instanceof PollingConfig.Backoff;
            if (z) {
                o430 o430Var = e3n.b;
                PollingConfig.Backoff backoff = (PollingConfig.Backoff) pollingConfig;
                double base = backoff.getBase();
                DurationUnit durationUnit = DurationUnit.SECONDS;
                syd0Var = new ryd0(new qi4(kp50.T(base, durationUnit), backoff.getFactor(), kp50.T(backoff.getCap(), durationUnit), f8xVar), kp50.T(backoff.getInitialDelay(), durationUnit));
            } else {
                if (!(pollingConfig instanceof PollingConfig.Simple)) {
                    w511.b();
                    return null;
                }
                o430 o430Var2 = e3n.b;
                syd0Var = new syd0(kp50.T(((PollingConfig.Simple) pollingConfig).getBase(), DurationUnit.SECONDS));
            }
            String a = q1e0Var.a();
            if (z) {
                PollingConfig.Backoff backoff2 = (PollingConfig.Backoff) pollingConfig;
                double base2 = backoff2.getBase();
                DurationUnit durationUnit2 = DurationUnit.SECONDS;
                lyd0Var = new lyd0(kp50.T(base2, durationUnit2), backoff2.getFactor(), kp50.T(backoff2.getCap(), durationUnit2), new e3n(kp50.T(backoff2.getInitialDelay(), durationUnit2)), TechEvents$TechPollerResultStrategy.BACKOFF);
            } else {
                if (!(pollingConfig instanceof PollingConfig.Simple)) {
                    w511.b();
                    return null;
                }
                PollingConfig.Simple simple = (PollingConfig.Simple) pollingConfig;
                double base3 = simple.getBase();
                DurationUnit durationUnit3 = DurationUnit.SECONDS;
                lyd0Var = new lyd0(kp50.T(base3, durationUnit3), new e3n(kp50.T(simple.getInitialDelay(), durationUnit3)), TechEvents$TechPollerResultStrategy.SIMPLE, 6);
            }
            oyd0Var = new oyd0(syd0Var, syd0Var, new q6c0(6, a, this.c, lyd0Var), new bzd0(e3n.e(kp50.T(pollingConfig.getMaxDuration(), DurationUnit.SECONDS)), 0));
        }
        return oyd0Var == null ? b(q1e0Var, (PollingConfigsImpl) bVar.d(voc.a).getData(), f8xVar) : oyd0Var;
    }

    public final oyd0 b(q1e0 q1e0Var, PollingConfigsImpl pollingConfigsImpl, f8x f8xVar) {
        int autoTopupStatusIntervalMs;
        int autoTopupDefaultStatusTimeoutMs;
        o430 o430Var = e3n.b;
        if (jl40.l(q1e0Var, lzd0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getCardIssueIntervalMs();
        } else if (jl40.l(q1e0Var, vzd0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getCheckRequiredAppsRegistrationIntervalMs();
        } else if (jl40.l(q1e0Var, uzd0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getCheckRequiredAppsIntervalMs();
        } else if (jl40.l(q1e0Var, u0e0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getRegistrationStatusNewUserIntervalMs();
        } else if (jl40.l(q1e0Var, v0e0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getRegistrationStatusOpenProductIntervalMs();
        } else if (jl40.l(q1e0Var, d1e0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getSimplifiedIdStatusIntervalMs();
        } else if (jl40.l(q1e0Var, m1e0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getUpgradeIntervalMs();
        } else if (jl40.l(q1e0Var, w0e0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getReplenishIntervalMs();
        } else if (jl40.l(q1e0Var, o0e0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getProCardActivationIntervalMs();
        } else if (jl40.l(q1e0Var, tzd0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getChangePhoneAppealHandlingIntervalMs();
        } else if (jl40.l(q1e0Var, ozd0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getCardWidgetInfoIntervalMs();
        } else if (jl40.l(q1e0Var, f0e0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getKycApplicationInfoIntervalMs();
        } else if (jl40.l(q1e0Var, b0e0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getDocumentsVerifyIntervalMs();
        } else if (jl40.l(q1e0Var, l0e0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getPartnerPaymentsSaveStatusIntervalMs();
        } else if (jl40.l(q1e0Var, dzd0.b) || jl40.l(q1e0Var, gzd0.b) || jl40.l(q1e0Var, hzd0.b) || jl40.l(q1e0Var, ezd0.b) || jl40.l(q1e0Var, fzd0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getAutoTopupStatusIntervalMs();
        } else if (jl40.l(q1e0Var, izd0.b) || jl40.l(q1e0Var, czd0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getAutoTopupTestPaymentIntervalMs();
        } else if (jl40.l(q1e0Var, mzd0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getCardLimitIntervalMs();
        } else if (jl40.l(q1e0Var, nzd0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getCardReissueIntervalMs();
        } else if (jl40.l(q1e0Var, yzd0.b) || jl40.l(q1e0Var, wzd0.b) || jl40.l(q1e0Var, jzd0.b) || jl40.l(q1e0Var, i0e0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getCreditDepositProcessingIntervalMs();
        } else if (jl40.l(q1e0Var, n0e0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getPdfDocumentStatusIntervalMs();
        } else if (jl40.l(q1e0Var, e1e0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getSplitContractDraftStatusIntervalMs();
        } else if (jl40.l(q1e0Var, p0e0.b) || jl40.l(q1e0Var, s0e0.b) || jl40.l(q1e0Var, q0e0.b) || jl40.l(q1e0Var, r0e0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getQrPaymentIntervalMs();
        } else if (jl40.l(q1e0Var, t0e0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getRebindPaymentMethodGetStatusIntervalMs();
        } else if (jl40.l(q1e0Var, a1e0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getSavingsAccountCreationInterval();
        } else if (jl40.l(q1e0Var, y0e0.b) || jl40.l(q1e0Var, z0e0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getSavingsDashboardClosingAccountIntervalMs();
        } else if (jl40.l(q1e0Var, b1e0.b) || jl40.l(q1e0Var, c1e0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getDashboardOpeningAccountPollingInterval();
        } else if (jl40.l(q1e0Var, n1e0.b) || jl40.l(q1e0Var, p1e0.b) || jl40.l(q1e0Var, o1e0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getYbCheckIntervalMs();
        } else if (jl40.l(q1e0Var, g1e0.b) || jl40.l(q1e0Var, k1e0.b) || jl40.l(q1e0Var, j1e0.b) || jl40.l(q1e0Var, l1e0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getTransferStatusIntervalMs();
        } else if (jl40.l(q1e0Var, h1e0.b) || jl40.l(q1e0Var, i1e0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getTransferStatusAftIntervalMs();
        } else if (jl40.l(q1e0Var, h0e0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getMkkCashoutGetResultIntervalMS();
        } else if (jl40.l(q1e0Var, g0e0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getMe2meResultIntervalMs();
        } else if (jl40.l(q1e0Var, x0e0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getReplenishPaymentMethodIntervalMs();
        } else if (jl40.l(q1e0Var, kzd0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getBudgetSearchStatusIntervalMs();
        } else if (jl40.l(q1e0Var, xzd0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getCreditPaymentMethodGetStatusIntervalMs();
        } else if (jl40.l(q1e0Var, m0e0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getPaymentMethodsBindingIntervalMs();
        } else if (jl40.l(q1e0Var, j0e0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getNfcRegisterStatusIntervalMs();
        } else if (jl40.l(q1e0Var, k0e0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getNfcSyncWithTokensIntervalMs();
        } else if (q1e0Var instanceof a0e0) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getDivDownloaderInterval();
        } else if (jl40.l(q1e0Var, c0e0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getFundCreationIntervalMs();
        } else if (jl40.l(q1e0Var, e0e0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getFundOperationIntervalMs();
        } else if (jl40.l(q1e0Var, zzd0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getDefaultPaymentMethodUnifiedSetStatusIntervalMs();
        } else if (jl40.l(q1e0Var, d0e0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getFundDocsNoticeIntervalMs();
        } else if (jl40.l(q1e0Var, f1e0.b)) {
            autoTopupStatusIntervalMs = pollingConfigsImpl.getSplitDepositTransactionStatusIntervalMs();
        } else {
            if (!jl40.l(q1e0Var, rzd0.b) && !jl40.l(q1e0Var, qzd0.b) && !jl40.l(q1e0Var, pzd0.b) && !jl40.l(q1e0Var, szd0.b)) {
                w511.b();
                return null;
            }
            autoTopupStatusIntervalMs = pollingConfigsImpl.getCreditDepositProcessingIntervalMs();
        }
        long U = kp50.U(autoTopupStatusIntervalMs, DurationUnit.MILLISECONDS);
        o430 o430Var2 = e3n.b;
        qi4 qi4Var = new qi4(U, 2.0d, kp50.U(15, DurationUnit.SECONDS), f8xVar);
        syd0 syd0Var = new syd0(f8xVar.c(U));
        ryd0 ryd0Var = new ryd0(qi4Var, 0L);
        q6c0 q6c0Var = new q6c0(6, q1e0Var.a(), this.c, new lyd0(f8xVar.c(U), null, TechEvents$TechPollerResultStrategy.SIMPLE, 14));
        if (q1e0Var.equals(lzd0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getCardIssueTimeoutMs();
        } else if (q1e0Var.equals(vzd0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getCheckRequiredAppsRegistrationTimeoutMs();
        } else if (q1e0Var.equals(uzd0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getCheckRequiredAppsTimeoutMs();
        } else if (q1e0Var.equals(u0e0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getRegistrationStatusNewUserTimeoutMs();
        } else if (q1e0Var.equals(v0e0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getRegistrationStatusOpenProductTimeoutMs();
        } else if (q1e0Var.equals(d1e0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getSimplifiedIdStatusTimeoutMs();
        } else if (q1e0Var.equals(m1e0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getUpgradeTimeoutMs();
        } else if (q1e0Var.equals(w0e0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getReplenishTimeoutMs();
        } else if (q1e0Var.equals(o0e0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getProCardActivationTimeoutMs();
        } else if (q1e0Var.equals(tzd0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getChangePhoneAppealHandlingTimeoutMs();
        } else if (q1e0Var.equals(ozd0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getCardWidgetInfoTimeoutMs();
        } else if (q1e0Var.equals(f0e0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getKycApplicationInfoTimeoutMs();
        } else if (q1e0Var.equals(b0e0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getDocumentsVerifyTimeoutMs();
        } else if (q1e0Var.equals(l0e0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getPartnerPaymentsSaveStatusTimeoutMs();
        } else if (q1e0Var.equals(dzd0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getAutoTopupPaymentStatusTimeoutMs();
        } else if (q1e0Var.equals(gzd0.b) || q1e0Var.equals(hzd0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getAutoTopupDefaultStatusTimeoutMs();
        } else if (q1e0Var.equals(ezd0.b) || q1e0Var.equals(fzd0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getAutoTopupStatusTimeoutMs();
        } else if (q1e0Var.equals(izd0.b) || q1e0Var.equals(czd0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getAutoTopupTestPaymentTimeoutMs();
        } else if (q1e0Var.equals(mzd0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getCardLimitTimeoutMs();
        } else if (q1e0Var.equals(nzd0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getCardReissueTimeoutMs();
        } else if (q1e0Var.equals(yzd0.b) || q1e0Var.equals(wzd0.b) || q1e0Var.equals(jzd0.b) || q1e0Var.equals(i0e0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getCreditDepositProcessingTimeoutMs();
        } else if (q1e0Var.equals(n0e0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getPdfDocumentStatusTimeoutMs();
        } else if (q1e0Var.equals(e1e0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getSplitContractDraftStatusTimeoutMs();
        } else if (q1e0Var.equals(p0e0.b) || q1e0Var.equals(s0e0.b) || q1e0Var.equals(q0e0.b) || q1e0Var.equals(r0e0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getQrPaymentTimeoutMs();
        } else if (q1e0Var.equals(t0e0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getRebindPaymentMethodGetStatusTimeoutMs();
        } else if (q1e0Var.equals(a1e0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getSavingsAccountCreationTimeout();
        } else if (q1e0Var.equals(b1e0.b) || q1e0Var.equals(c1e0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getDashboardOpeningAccountPollingTimeout();
        } else if (q1e0Var.equals(y0e0.b) || q1e0Var.equals(z0e0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getSavingsDashboardClosingAccountTimeoutMs();
        } else if (q1e0Var.equals(n1e0.b) || q1e0Var.equals(p1e0.b) || q1e0Var.equals(o1e0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getYbCheckTimeoutMs();
        } else if (q1e0Var.equals(g1e0.b) || q1e0Var.equals(j1e0.b) || q1e0Var.equals(k1e0.b) || q1e0Var.equals(l1e0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getTransferStatusTimeoutMs();
        } else if (q1e0Var.equals(h1e0.b) || q1e0Var.equals(i1e0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getTransferStatusAftTimeoutMs();
        } else if (q1e0Var.equals(h0e0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getMkkCashoutGetResultTimeoutMS();
        } else if (q1e0Var.equals(g0e0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getMe2meResultTimeoutMs();
        } else if (q1e0Var.equals(x0e0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getReplenishPaymentMethodTimeoutMs();
        } else if (q1e0Var.equals(kzd0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getBudgetSearchStatusTimeoutMs();
        } else if (q1e0Var.equals(xzd0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getCreditPaymentMethodGetStatusTimeoutMs();
        } else if (q1e0Var.equals(m0e0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getPaymentMethodsBindingTimeoutMs();
        } else if (q1e0Var.equals(j0e0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getNfcRegisterStatusTimeoutMs();
        } else if (q1e0Var.equals(k0e0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getNfcSyncWithTokensTimeoutMs();
        } else if (q1e0Var instanceof a0e0) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getDivDownloaderTimeoutMs();
        } else if (q1e0Var.equals(c0e0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getFundCreationTimeoutMs();
        } else if (q1e0Var.equals(e0e0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getFundOperationTimeoutMs();
        } else if (q1e0Var.equals(zzd0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getDefaultPaymentMethodUnifiedSetStatusTimeoutMs();
        } else if (q1e0Var.equals(d0e0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getFundDocsNoticeTimeoutMs();
        } else if (q1e0Var.equals(f1e0.b)) {
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getSplitDepositTransactionStatusTimeoutMs();
        } else {
            if (!q1e0Var.equals(rzd0.b) && !q1e0Var.equals(qzd0.b) && !q1e0Var.equals(pzd0.b) && !q1e0Var.equals(szd0.b)) {
                w511.b();
                return null;
            }
            autoTopupDefaultStatusTimeoutMs = pollingConfigsImpl.getCreditDepositProcessingTimeoutMs();
        }
        return new oyd0(syd0Var, ryd0Var, q6c0Var, new bzd0(autoTopupDefaultStatusTimeoutMs, 0));
    }
}

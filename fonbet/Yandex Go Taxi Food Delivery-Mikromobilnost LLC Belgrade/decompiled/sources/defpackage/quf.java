package defpackage;

import android.content.Intent;
import android.os.Bundle;
import androidx.biometric.BiometricViewModel;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.yandex.payment.divkit.cvv_confirm.CvvConfirmFragment;
import com.yandex.payment.divkit.cvv_confirm.CvvScreenArguments;
import com.yandex.payment.divkit.cvv_confirm.a;
import com.yandex.payment.divkit.select.DKSelectFragment;
import com.yandex.payment.divkit.select.IncomingChallengeEvent$OpenCvv$ForceCvv;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.core.data.SbpChallengeInfo;
import com.yandex.payment.sdk.feature.flags.FeatureFlag;
import com.yandex.payment.sdk.ui.BaseActivity;
import com.yandex.payment.sdk.ui.challenger.SbpChallengerActivity;
import io.appmetrica.analytics.AppMetrica;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Signature;
import java.util.concurrent.Executor;
import kotlin.coroutines.Continuation;
import ru.CryptoPro.JCP.JCP;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final class quf implements vpr {
    public final /* synthetic */ DKSelectFragment a;

    public quf(DKSelectFragment dKSelectFragment) {
        this.a = dKSelectFragment;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        raq0 raq0Var;
        raq0 raq0Var2;
        avf viewModel;
        avf viewModel2;
        raq0 raq0Var3;
        raq0 raq0Var4;
        raq0 raq0Var5;
        raq0 raq0Var6;
        raq0 raq0Var7;
        raq0 raq0Var8;
        CvvScreenArguments mapToParams;
        cqv cqvVar = (cqv) obj;
        boolean z = cqvVar instanceof wpv;
        DKSelectFragment dKSelectFragment = this.a;
        if (z || (cqvVar instanceof vpv)) {
            DKSelectFragment.setStateLoading$default(dKSelectFragment, true, false, 2, null);
            raq0Var = dKSelectFragment.callbacks;
            ((zbq0) (raq0Var != null ? raq0Var : null)).K();
            dKSelectFragment.setStateData();
        } else if (cqvVar instanceof xpv) {
            raq0Var7 = dKSelectFragment.callbacks;
            if (raq0Var7 == null) {
                raq0Var7 = null;
            }
            ((zbq0) raq0Var7).L();
            raq0Var8 = dKSelectFragment.callbacks;
            raq0Var6 = raq0Var8 != null ? raq0Var8 : null;
            a aVar = CvvConfirmFragment.Companion;
            mapToParams = dKSelectFragment.mapToParams((xpv) cqvVar);
            aVar.getClass();
            Bundle bundle = new Bundle();
            bundle.putParcelable("paymentsdk_cvv_args_key", mapToParams);
            CvvConfirmFragment cvvConfirmFragment = new CvvConfirmFragment();
            cvvConfirmFragment.setArguments(bundle);
            ((zbq0) raq0Var6).P(cvvConfirmFragment, cqvVar instanceof IncomingChallengeEvent$OpenCvv$ForceCvv);
        } else if (cqvVar instanceof zpv) {
            zpv zpvVar = (zpv) cqvVar;
            dKSelectFragment.showWebView(zpvVar.a, zpvVar.b);
        } else if (cqvVar instanceof aqv) {
            raq0Var5 = dKSelectFragment.callbacks;
            raq0Var6 = raq0Var5 != null ? raq0Var5 : null;
            aqv aqvVar = (aqv) cqvVar;
            SbpChallengeInfo sbpChallengeInfo = aqvVar.a;
            PaymentMethod.SbpToken sbpToken = aqvVar.b;
            zbq0 zbq0Var = (zbq0) raq0Var6;
            BaseActivity baseActivity = zbq0Var.a;
            if (apa1.e(FeatureFlag.DIV_KIT_MASTER_FLAG) && apa1.e(FeatureFlag.DIV_KIT_CHALLENGER_FLAG)) {
                zbq0Var.P(new xsf().b(sbpChallengeInfo, sbpToken), false);
            } else {
                Intent intent = new Intent(baseActivity, (Class<?>) SbpChallengerActivity.class);
                intent.putExtra(SbpChallengerActivity.EXTRA_CHALLENGE_INFO_DATA, sbpChallengeInfo);
                intent.putExtra(SbpChallengerActivity.EXTRA_SBP_TOKEN_DATA, sbpToken);
                intent.putExtra(SbpChallengerActivity.EXTRA_MODULE_DATA, baseActivity.getIntent().getExtras());
                baseActivity.startActivityForResult(intent, 1111);
            }
            dKSelectFragment.setStateData();
        } else if (cqvVar instanceof ypv) {
            dKSelectFragment.openInBrowser(((ypv) cqvVar).a);
        } else {
            if (!(cqvVar instanceof bqv)) {
                w511.b();
                return null;
            }
            raq0Var2 = dKSelectFragment.callbacks;
            if (raq0Var2 == null) {
                raq0Var2 = null;
            }
            ((zbq0) raq0Var2).getClass();
            if (apa1.e(FeatureFlag.ENABLE_BIOMETRY)) {
                viewModel2 = dKSelectFragment.getViewModel();
                bqv bqvVar = (bqv) cqvVar;
                byte[] k = viewModel2.k(bqvVar);
                raq0Var3 = dKSelectFragment.callbacks;
                if (raq0Var3 == null) {
                    raq0Var3 = null;
                }
                raq0Var4 = dKSelectFragment.callbacks;
                if (raq0Var4 == null) {
                    raq0Var4 = null;
                }
                ((zbq0) raq0Var4).getClass();
                boolean e = apa1.e(FeatureFlag.ENABLE_BIOMETRY_WITH_PASSWORD);
                ouj0 resourceProvider = dKSelectFragment.getResourceProvider();
                ((pv5) dKSelectFragment.getResIdProvider()).getClass();
                String string = ((abe) resourceProvider).a.getString(ryh0.paymentsdk_biometry_title);
                ouj0 resourceProvider2 = dKSelectFragment.getResourceProvider();
                ((pv5) dKSelectFragment.getResIdProvider()).getClass();
                String string2 = ((abe) resourceProvider2).a.getString(ryh0.paymentsdk_biometry_negative_button);
                String str = bqvVar.c;
                AppMetrica.getUuid(dKSelectFragment.requireContext());
                dke dkeVar = new dke(9, k, dKSelectFragment);
                fx5 fx5Var = (fx5) ((pwf) ((zbq0) raq0Var3).b).v.get();
                rwo rwoVar = fx5Var.a;
                ((y22) rwoVar).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Начало формирования подписи", "biometry_signature_start"));
                String uuid = AppMetrica.getUuid(dKSelectFragment.requireContext());
                if (uuid == null) {
                    uuid = "";
                }
                String p = g8e.p(str, "-", uuid);
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                PrivateKey privateKey = ((KeyStore.PrivateKeyEntry) keyStore.getEntry(p, null)).getPrivateKey();
                Signature signature = Signature.getInstance(JCP.SIGN_SHA256_ECDSA_NAME);
                signature.initSign(privateKey);
                ay5 ay5Var = new ay5(signature);
                q qVar = new q(23, fx5Var, dkeVar, k);
                l95 l95Var = new l95(22, dkeVar);
                Executor mainExecutor = dKSelectFragment.requireActivity().getMainExecutor();
                tx5 tx5Var = new tx5(rwoVar, l95Var, qVar);
                ey5 ey5Var = new ey5();
                if (mainExecutor == null) {
                    ny61.g("Executor must not be null.");
                    return null;
                }
                FragmentActivity activity = dKSelectFragment.getActivity();
                FragmentManager childFragmentManager = dKSelectFragment.getChildFragmentManager();
                BiometricViewModel biometricViewModel = activity != null ? (BiometricViewModel) new ls31(activity).b(BiometricViewModel.class) : null;
                if (biometricViewModel != null) {
                    dKSelectFragment.getLifecycle().a(new dy5(biometricViewModel));
                }
                ey5Var.a = childFragmentManager;
                if (biometricViewModel != null) {
                    biometricViewModel.b = mainExecutor;
                    biometricViewModel.c = tx5Var;
                }
                by5 by5Var = new by5();
                by5Var.a = string;
                if (e) {
                    by5Var.d = 32783;
                } else {
                    if (e) {
                        w511.b();
                        return null;
                    }
                    by5Var.d = 15;
                    by5Var.b = string2;
                }
                ey5Var.a(by5Var.a(), ay5Var);
            } else {
                viewModel = dKSelectFragment.getViewModel();
                viewModel.s(null, null, false);
            }
        }
        return zy11.a;
    }
}

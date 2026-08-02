package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.yandex.payment.sdk.ui.challenger.SbpChallengerActivity;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ppo extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ SbpChallengerActivity s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ppo(SbpChallengerActivity sbpChallengerActivity, int i) {
        super(0);
        this.r = i;
        this.s = sbpChallengerActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                SbpChallengerActivity sbpChallengerActivity = this.s;
                jyr jyrVar = sbpChallengerActivity.c;
                j27 j27Var = new j27(((p77) jyrVar.getValue()).f(), ((p77) jyrVar.getValue()).c());
                jfu viewModelStore = sbpChallengerActivity.getViewModelStore();
                is6 defaultViewModelCreationExtras = sbpChallengerActivity.getDefaultViewModelCreationExtras();
                viewModelStore.getClass();
                defaultViewModelCreationExtras.getClass();
                bjt bjtVar = new bjt(viewModelStore, j27Var, defaultViewModelCreationExtras);
                lm4 a = ern.a(jqo.class);
                String f = a.f();
                if (f != null) {
                    return (jqo) bjtVar.j(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f));
                }
                xq0.x("Local and anonymous classes can not be ViewModels");
                return null;
            default:
                SbpChallengerActivity sbpChallengerActivity2 = this.s;
                Bundle bundleExtra = sbpChallengerActivity2.getIntent().getBundleExtra("MODULE_DATA");
                sbpChallengerActivity2.b = bundleExtra != null ? (ln) bundleExtra.getParcelable("com.yandex.payment.sdk.ui.extra.ADDITIONAL_SETTINGS") : null;
                jdk jdkVar = bundleExtra != null ? (jdk) bundleExtra.getParcelable("com.yandex.payment.sdk.ui.network.extra.PAYER_DATA") : null;
                jdkVar.getClass();
                Parcelable parcelable = bundleExtra.getParcelable("com.yandex.payment.sdk.ui.network.extra.MERCHANT_DATA");
                parcelable.getClass();
                pyh pyhVar = (pyh) parcelable;
                ln lnVar = sbpChallengerActivity2.b;
                lnVar.getClass();
                Parcelable parcelable2 = bundleExtra.getParcelable("com.yandex.payment.sdk.ui.network.extra.ENVIRONMENT");
                parcelable2.getClass();
                ugk ugkVar = (ugk) parcelable2;
                Parcelable parcelable3 = bundleExtra.getParcelable("com.yandex.payment.sdk.ui.extra.CONSOLE_LOGGING_MODE");
                parcelable3.getClass();
                g86 g86Var = (g86) parcelable3;
                String string = bundleExtra.getString("com.yandex.payment.sdk.ui.network.extra.LOGGER_KEY");
                if (string == null) {
                    string = "";
                }
                return d51.b.d(sbpChallengerActivity2, jdkVar, pyhVar, lnVar, ugkVar, string, g86Var, null);
        }
    }
}

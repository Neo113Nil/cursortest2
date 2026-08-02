package defpackage;

import android.content.Intent;
import android.os.Parcelable;
import com.yandex.payment.sdk.transportcards.ui.TransportCardsActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l9t extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ TransportCardsActivity s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l9t(TransportCardsActivity transportCardsActivity, int i) {
        super(0);
        this.r = i;
        this.s = transportCardsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.r;
        TransportCardsActivity transportCardsActivity = this.s;
        switch (i) {
            case 0:
                TransportCardsActivity transportCardsActivity2 = this.s;
                Intent intent = transportCardsActivity2.getIntent();
                jdk jdkVar = intent != null ? (jdk) intent.getParcelableExtra("com.yandex.payment.sdk.ui.network.extra.PAYER_DATA") : null;
                jdkVar.getClass();
                Parcelable parcelableExtra = intent.getParcelableExtra("com.yandex.payment.sdk.ui.network.extra.MERCHANT_DATA");
                parcelableExtra.getClass();
                pyh pyhVar = (pyh) parcelableExtra;
                Parcelable parcelableExtra2 = intent.getParcelableExtra("com.yandex.payment.sdk.ui.extra.ADDITIONAL_SETTINGS");
                parcelableExtra2.getClass();
                ln lnVar = (ln) parcelableExtra2;
                Parcelable parcelableExtra3 = intent.getParcelableExtra("com.yandex.payment.sdk.ui.network.extra.ENVIRONMENT");
                parcelableExtra3.getClass();
                ugk ugkVar = (ugk) parcelableExtra3;
                Parcelable parcelableExtra4 = intent.getParcelableExtra("com.yandex.payment.sdk.ui.extra.CONSOLE_LOGGING_MODE");
                parcelableExtra4.getClass();
                g86 g86Var = (g86) parcelableExtra4;
                String stringExtra = intent.getStringExtra("com.yandex.payment.sdk.ui.network.extra.LOGGER_KEY");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                return d51.b.d(transportCardsActivity2, jdkVar, pyhVar, lnVar, ugkVar, stringExtra, g86Var, null);
            case 1:
                return transportCardsActivity.getViewModelStore();
            case 2:
                return transportCardsActivity.getDefaultViewModelCreationExtras();
            case 3:
                int i2 = TransportCardsActivity.i;
                return new r77(transportCardsActivity.j().a, new ybl(), new cic());
            default:
                a6p a6pVar = transportCardsActivity.a;
                if (a6pVar != null) {
                    return a6pVar;
                }
                Intrinsics.j("transportCardViewModelFactory");
                throw null;
        }
    }
}

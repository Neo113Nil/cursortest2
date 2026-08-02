package defpackage;

import android.os.Bundle;
import com.yandex.go.address.models.Address;
import com.yandex.go.mainscreen.superapp.impl.fragment.a;
import com.yandex.go.navigation.api.router.FragmentAnimation$TransitionType;
import com.yandex.go.taxi.order.cancel.paid.dialog.CancelPaidFragment;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.porch.PorchFragment;
import io.appmetrica.analytics.rtm.internal.Constants;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;
import ru.yandex.taxi.fragment.BaseFragment;
import ru.yandex.taxi.fragment.common.WebViewFragment;
import ru.yandex.taxi.masstransit.address.ui.MtAddressMapPickerFragment;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes14.dex */
public final class uw7 extends dds {
    public final /* synthetic */ int F;
    public final a G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uw7(a aVar, int i) {
        super(null);
        this.F = i;
        this.G = aVar;
    }

    @Override // defpackage.dds
    public final a P() {
        switch (this.F) {
        }
        return this.G;
    }

    @Override // defpackage.dds
    public void Q(Object obj, BaseFragment baseFragment) {
        switch (this.F) {
            case 0:
                ((CancelPaidFragment) baseFragment).setCallbackListener(new tw7(this));
                break;
            case 2:
                ((PorchFragment) baseFragment).setCallbackListener(new zae0(this));
                break;
        }
    }

    @Override // defpackage.dds
    public xbs S(Object obj) {
        switch (this.F) {
            case 3:
                return new vbs(FragmentAnimation$TransitionType.ENTER);
            default:
                return super.S(obj);
        }
    }

    @Override // defpackage.dds
    public final BaseFragment T(Object obj) {
        switch (this.F) {
            case 0:
                sw7 sw7Var = (sw7) obj;
                rw7 rw7Var = CancelPaidFragment.Companion;
                String str = sw7Var.a;
                String str2 = sw7Var.b;
                rw7Var.getClass();
                CancelPaidFragment cancelPaidFragment = new CancelPaidFragment();
                Bundle bundle = new Bundle();
                bundle.putString("title", str);
                bundle.putString(Constants.KEY_MESSAGE, str2);
                cancelPaidFragment.setArguments(bundle);
                return cancelPaidFragment;
            case 1:
                lc30 lc30Var = (lc30) obj;
                hc30 hc30Var = MtAddressMapPickerFragment.Companion;
                PointType pointType = lc30Var.a;
                pv0 pv0Var = lc30Var.b;
                zzs zzsVar = lc30Var.c;
                hc30Var.getClass();
                MtAddressMapPickerFragment a = hc30.a(pointType, pv0Var, zzsVar);
                a.setCallbackListener(new mc30(this, 0));
                return a;
            case 2:
                TaxiOrder taxiOrder = (TaxiOrder) obj;
                boolean f = taxiOrder.V().f(SimpleBooleanExperiment.ALLOW_LETTER_FOR_PORCH);
                yae0 yae0Var = PorchFragment.Companion;
                String d = taxiOrder.b.d();
                Address u = taxiOrder.u();
                String J1 = u != null ? u.J1() : null;
                yae0Var.getClass();
                return yae0.a(d, J1, f);
            default:
                WebViewFragment.Companion.getClass();
                WebViewFragment webViewFragment = new WebViewFragment();
                webViewFragment.setConfig((UiWebViewConfig) obj);
                return webViewFragment;
        }
    }

    @Override // defpackage.dds
    public xbs U() {
        switch (this.F) {
            case 3:
                return new vbs(FragmentAnimation$TransitionType.RETURN);
            default:
                return super.U();
        }
    }
}

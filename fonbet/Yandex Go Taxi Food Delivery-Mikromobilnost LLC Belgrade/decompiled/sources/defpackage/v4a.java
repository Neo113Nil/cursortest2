package defpackage;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.TouchDelegate;
import android.view.ViewGroup;
import android.widget.Toast;
import com.yandex.go.chargers.design.components.ChargersOrderTabsView;
import com.yandex.go.chargers.misc.popup.ChargersPopupModalView;
import com.yandex.go.chargers.multiorder.select_to_return.ChargersMultiOrderSelectToReturnModalView;
import com.yandex.go.chargers.station.presentation.tariff.ChargersTariffModalView;
import com.yandex.go.payments.shared.business.accountcreation.corp.factory.CorpCreatingLimitExceededModalView;
import com.yandex.go.payments.shared.business.accountcreation.corp.factory.CorpSuccessDraftCreatedModalView;
import com.yandex.go.support.web.CommonSupportWebView;
import com.yandex.messaging.TokenType;
import com.yandex.messaging.core.net.entities.proto.TimestampRange;
import com.yandex.messaging.internal.authorized.sync.PushTokenValidationException;
import com.yandex.messaging.internal.view.chat.ChatInputHeightState;
import com.yandex.messaging.internal.view.timeline.i;
import com.yandex.messaging.ui.statuses.a;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.text.Regex;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.taxi.costcenters.fields.CostCenterFieldsModalView;
import ru.yandex.taxi.costcenters.input.CostCenterInputModalView;
import ru.yandex.taxi.costcenters.selection.b;
import ru.yandex.taxi.preorder.source.domain.s;
import ru.yandex.taxi.preorder.summary.solid.tooltip.ui.CoreCashbackAvailableTooltipPopup;

/* loaded from: classes15.dex */
public final /* synthetic */ class v4a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v4a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a350 a350Var;
        int i = this.a;
        Long[] lArr = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                ChargersMultiOrderSelectToReturnModalView._init_$backClicked((z4a) obj);
                break;
            case 1:
                ChargersOrderTabsView.renderTabs$lambda$1((ChargersOrderTabsView) obj);
                break;
            case 2:
                ChargersPopupModalView._init_$gotItClicked((vma) obj);
                break;
            case 3:
                ChargersTariffModalView._init_$lambda$0((ChargersTariffModalView) obj);
                break;
            case 4:
                ((p0b) obj).h();
                break;
            case 5:
                a aVar = (a) obj;
                ChatInputHeightState chatInputHeightState = aVar.w;
                chatInputHeightState.a.put(ChatInputHeightState.HeightConsumer.DndWarning, Integer.valueOf(aVar.b.x.getHeight()));
                chatInputHeightState.b();
                break;
            case 6:
                ((s3b) obj).q();
                break;
            case 7:
                f5b f5bVar = (f5b) obj;
                rnz rnzVar = f5bVar.x;
                z83.g(null, Looper.myLooper(), f5bVar.c.getLooper());
                rnz rnzVar2 = f5bVar.w;
                z83.c(null, rnzVar2.f() && rnzVar.f());
                f5bVar.y = false;
                boolean f = rnzVar2.f();
                long j = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
                long g = f ? Long.MAX_VALUE : rnzVar2.g(0);
                if (!rnzVar.f()) {
                    j = rnzVar.g(0);
                }
                long min = Long.min(g, j);
                long max = Long.max(rnzVar2.f() ? Long.MIN_VALUE : rnzVar2.g(rnzVar2.j() - 1), rnzVar.f() ? Long.MIN_VALUE : rnzVar.g(rnzVar.j() - 1));
                TimestampRange timestampRange = new TimestampRange();
                timestampRange.min = min;
                timestampRange.max = max;
                if (!rnzVar.f()) {
                    int j2 = rnzVar.j();
                    Long[] lArr2 = new Long[j2];
                    for (int i2 = 0; i2 < j2; i2++) {
                        lArr2[i2] = Long.valueOf(rnzVar.g(i2));
                    }
                    lArr = lArr2;
                }
                if (!jl40.l(f5bVar.A, timestampRange) || !Arrays.equals(lArr, f5bVar.B)) {
                    f5bVar.A = timestampRange;
                    f5bVar.B = lArr;
                    ct21 e = f5bVar.b.a.e(f5bVar.a, new xv10(timestampRange, f5bVar, lArr, f5bVar));
                    qp3 qp3Var = f5bVar.z;
                    kgx kgxVar = f5b.C[0];
                    qp3Var.b(e);
                    break;
                }
                break;
            case 8:
                i iVar = ((obb) obj).a;
                if (iVar != null) {
                    tje.e();
                    iVar.a0 = null;
                    Toast.makeText(iVar.L.getContext(), oyh0.loading_error, 0).show();
                    break;
                }
                break;
            case 9:
                ((i) obj).w();
                break;
            case 10:
                pjb pjbVar = (pjb) obj;
                ViewGroup viewGroup = (ViewGroup) pjbVar.a().getParent();
                Rect rect = new Rect();
                int q = bb1.q(qvg0.pay_sdk_checkout_agreements_checkbox_extra_area_size, pjbVar.a);
                pjbVar.a().getHitRect(rect);
                rect.left -= q;
                rect.top -= q;
                rect.right += q;
                rect.bottom += q;
                viewGroup.setTouchDelegate(new TouchDelegate(rect, pjbVar.a()));
                break;
            case 11:
                ((myb) obj).dismiss();
                break;
            case 12:
                ((s) ((uyb) obj).d).c();
                break;
            case 13:
                ((com.google.android.material.textfield.a) obj).s(true);
                break;
            case 14:
                o7c o7cVar = (o7c) obj;
                Handler handler = o7cVar.a;
                try {
                    com.yandex.messaging.sdk.a aVar2 = o7cVar.b.a;
                    String str = aVar2.c;
                    TokenType tokenType = aVar2.d;
                    o7cVar.z.getClass();
                    Regex regex = f5g0.a;
                    sba1.l(str);
                    c5g0 c5g0Var = new c5g0(str, tokenType);
                    o7cVar.x.h("push_token_request_success", "platform", tokenType.getValue(), "attempt_number", Long.valueOf(o7cVar.D), "last_error", o7cVar.E);
                    handler.post(new l7a(12, o7cVar, c5g0Var));
                    break;
                } catch (PushTokenValidationException | IOException e2) {
                    handler.post(new l7a(13, o7cVar, e2));
                    return;
                }
            case 15:
                ((ru.yandex.taxi.web.calljsinterface.a) obj).a.reload();
                break;
            case 16:
                CommonSupportWebView._init_$lambda$0((CommonSupportWebView) obj);
                break;
            case 17:
                ((sqc) obj).O0.run();
                break;
            case 18:
                super/*android.app.Dialog*/.onBackPressed();
                break;
            case 19:
                ((a350) obj).f();
                break;
            case 20:
                a350Var = ((t3e) obj).a.confirmPaymentViewHolder;
                if (a350Var != null) {
                    a350Var.g();
                    break;
                }
                break;
            case 21:
                ((n3e) obj).f();
                break;
            case 22:
                CoreCashbackAvailableTooltipPopup.showTooltip$tooltipShowed((b29) obj);
                break;
            case 23:
                CorpCreatingLimitExceededModalView.onAttachedToWindow$lambda$0((CorpCreatingLimitExceededModalView) obj);
                break;
            case 24:
                b1 b1Var = (b1) ((com.yandex.go.payments.shared.business.accountcreation.corp.personalaccount.a) obj).e.b;
                b1Var.getClass();
                b1Var.a.a("B2BHome.WebView.DidLoad", new HashMap(), 1, new HashMap());
                break;
            case 25:
                CorpSuccessDraftCreatedModalView.onAttachedToWindow$lambda$0((CorpSuccessDraftCreatedModalView) obj);
                break;
            case 26:
                CostCenterFieldsModalView.onAttachedToWindow$lambda$0((CostCenterFieldsModalView) obj);
                break;
            case 27:
                ((CostCenterInputModalView) obj).closeKeyboard();
                break;
            case 28:
                ((swe) obj).Lg();
                break;
            default:
                ((b) obj).Lg();
                break;
        }
    }
}

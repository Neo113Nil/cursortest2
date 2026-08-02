package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.yandex.go.taxi.order.models.api.response.d;
import com.yandex.go.ui.UserPhotoUploadingModalView;
import com.yandex.payment.sdk.ui.ViewBindingActivityImpl;
import com.ybsdk.core.transfer.utils.TransferCommentView;
import com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation.TopButtonsListView;
import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.TransferMainFragment;
import com.ybsdk.widgets.common.TraceIdErrorView;
import com.ybsdk.widgets.common.WidgetView;
import com.ybsdk.widgets.tooltip.TooltipCommon$DismissReason;
import com.ybsdk.widgets.tooltip.a;
import com.ybsdk.widgets.tooltip.util.TooltipPopupWindow;
import ru.rt.ebs.cryptosdk.presentation.biometry_capturing.videoRecording.VideoRecordingFragment;
import ru.yandex.taxi.combo.ui.TravelCompanionStatusView;
import ru.yandex.taxi.order.state.transporting.TransportingStateView;
import yads.oi3;
import yads.v90;

/* loaded from: classes3.dex */
public final /* synthetic */ class y7z0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y7z0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                z7z0 z7z0Var = (z7z0) obj2;
                z7z0Var.O.a.onSlotItemClicked(z7z0Var.E(), (p7z0) obj);
                break;
            case 1:
                hkz0 hkz0Var = (hkz0) obj2;
                qke.v(view.getContext());
                hkz0Var.P.a = true;
                hkz0Var.O.accept((pkz0) obj);
                break;
            case 2:
                a aVar = (a) obj2;
                TooltipPopupWindow tooltipPopupWindow = (TooltipPopupWindow) obj;
                aVar.g.invoke();
                if (aVar.n) {
                    aVar.B = TooltipCommon$DismissReason.CLICK;
                    tooltipPopupWindow.dismiss();
                    break;
                }
                break;
            case 3:
                TopButtonsListView.bindView$lambda$4$lambda$2((TopButtonsListView) obj2, (jo01) obj, view);
                break;
            case 4:
                TraceIdErrorView._init_$lambda$1((TraceIdErrorView) obj2, (Context) obj, view);
                break;
            case 5:
                TransferCommentView.lambda$7$lambda$6((TransferCommentView) obj2, (m961) obj, view);
                break;
            case 6:
                TransferMainFragment.renderBottomSheet$lambda$57$lambda$56$lambda$54((TransferMainFragment) obj2, (vl01) obj, view);
                break;
            case 7:
                ((vq01) obj2).invoke(Boolean.valueOf(!((wqj0) ((n70) obj).Z()).b));
                break;
            case 8:
                ((dk01) obj2).invoke(((un01) ((n70) obj).Z()).c);
                break;
            case 9:
                TransportingStateView.showQualityQuestionButton$lambda$0((TransportingStateView) obj2, (lgg0) obj, view);
                break;
            case 10:
                TravelCompanionStatusView.setAction$lambda$0((TravelCompanionStatusView) obj2, (d) obj, view);
                break;
            case 11:
                ((tls) ((vp4) obj2).T).invoke(((ez4) obj).a);
                break;
            case 12:
                ((zah) obj2).c.setEnabled(false);
                ((ijf) obj).b.a(new jxl(true));
                break;
            case 13:
                UserPhotoUploadingModalView.updateLinkText$lambda$0((UserPhotoUploadingModalView) obj2, (String) obj, view);
                break;
            case 14:
                VideoRecordingFragment.setVideoCapturingState$lambda$12$lambda$10((VideoRecordingFragment) obj2, (ys11) obj, view);
                break;
            case 15:
                ViewBindingActivityImpl.setupDebugView$lambda$0$2((TextView) obj2, (String) obj, view);
                break;
            case 16:
                vy41 vy41Var = (vy41) obj;
                ez41 ez41Var = ((wy41) obj2).O;
                if (ez41Var != null) {
                    ez41Var.invoke(vy41Var.c);
                    break;
                }
                break;
            case 17:
                WidgetView.updateWidget$lambda$4$lambda$1((d451) obj2, (WidgetView) obj, view);
                break;
            case 18:
                ((uf71) obj2).N.invoke(((se81) obj).c);
                break;
            case 19:
                oi3 oi3Var = (oi3) ((q271) obj2).O;
                ((ho81) obj).getClass();
                oi3Var.invoke(v90.b);
                break;
            default:
                vk81 vk81Var = (vk81) obj2;
                vk81Var.b.a.a((float) (!((CheckBox) obj).isChecked() ? vk81Var.c : 0.0d));
                break;
        }
    }
}

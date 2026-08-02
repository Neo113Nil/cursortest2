package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.SpannedString;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.emoji2.emojipicker.EmojiView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.yandex.go.taxi.order.models.api.objects.FreightageRideItem;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.feedback.CallFeedbackReason;
import com.yandex.messaging.internal.view.input.b;
import com.yandex.messaging.ui.imageviewer.ImageViewerInfo;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.ErrorContentView;
import com.ybsdk.feature.kyc.internal.screens.photo.KycPhotoFragment;
import com.ybsdk.feature.kyc.internal.screens.photov2.KycPhotoV2Fragment;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.keyboard.delegators.KeyboardTextButtonView;
import flex.logger.view.LoggerOverlayView;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.collections.a;
import ru.yandex.taxi.analytics.Events$Zalogin$LinkageContext;
import ru.yandex.taxi.order.view.HorizontalButtonsView;
import ru.yandex.taxi.order.view.LowRatingReasonsView;
import ru.yandex.taxi.zalogin.LinkAccountsViewFactoryImpl$createLinkAccountsView$1;

/* loaded from: classes15.dex */
public final /* synthetic */ class vsn implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vsn(int i, Object obj, Object obj2) {
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
                int i2 = ((wsn) obj2).O;
                n5x0 n5x0Var = ((rtn) ((mum) obj).a).f;
                n5x0Var.e = i2;
                int k = n5x0Var.c.k(i2);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) n5x0Var.a.getLayoutManager();
                if (linearLayoutManager != null) {
                    linearLayoutManager.r(k, 0);
                }
                n5x0Var.b();
                break;
            case 1:
                aun aunVar = (aun) obj2;
                aunVar.g = !aunVar.g;
                aunVar.k();
                aunVar.e.removeViews(1, aunVar.g() - 1);
                aunVar.c();
                ((AppCompatImageView) obj).announceForAccessibility(aunVar.b.getString(d0i0.emoji_bidirectional_switcher_clicked_desc));
                break;
            case 2:
                sun sunVar = (sun) obj2;
                View view2 = (View) obj;
                String valueOf = String.valueOf(((EmojiView) view).getEmoji());
                sunVar.P.invoke(sunVar, valueOf);
                sunVar.O.invoke(sunVar, sun.W(valueOf));
                jeu0 jeu0Var = sunVar.N;
                tun tunVar = sunVar.S;
                if (tunVar == null) {
                    tunVar = null;
                }
                String str = (String) tunVar.b.get(0);
                Map map = (Map) jeu0Var.b.getValue();
                if (str.equals(valueOf)) {
                    map.remove(str);
                } else {
                    map.put(str, valueOf);
                }
                jeu0Var.a.edit().putString("pref_key_sticky_variant", a.X(map.entrySet(), "|", null, null, null, 62)).commit();
                zrm zrmVar = sunVar.T;
                PopupWindow popupWindow = (PopupWindow) (zrmVar != null ? zrmVar : null).c;
                if (popupWindow.isShowing()) {
                    popupWindow.dismiss();
                }
                view2.sendAccessibilityEvent(128);
                break;
            case 3:
                r6o r6oVar = (r6o) obj2;
                ((ClipboardManager) r6oVar.j.getValue()).setPrimaryClip(ClipData.newPlainText(null, r6oVar.a().getText()));
                Toast.makeText(((ErrorContentView) obj).getContext(), zyh0.PlusPay_Error_ErrorCode_Copy_Message, 0).show();
                break;
            case 4:
                Intent intent = (Intent) obj2;
                h7o h7oVar = (h7o) obj;
                if (intent != null) {
                    h7oVar.a.getContext().startActivity(intent);
                    break;
                }
                break;
            case 5:
                ErrorView.setErrorIconClickListener$lambda$12$lambda$11((Throwable) obj2, (h161) obj, view);
                break;
            case 6:
                afi0 afi0Var = (afi0) obj2;
                duq duqVar = (duq) obj;
                afi0Var.a.setSelected(!r12.isSelected());
                duqVar.w.invoke(duqVar.b.get(afi0Var.F()));
                break;
            case 7:
                euq euqVar = (euq) obj2;
                CallFeedbackReason callFeedbackReason = (CallFeedbackReason) obj;
                if (euqVar.y.contains(callFeedbackReason)) {
                    LinkedHashSet linkedHashSet = euqVar.B;
                    if (linkedHashSet.contains(callFeedbackReason)) {
                        linkedHashSet.remove(callFeedbackReason);
                    } else {
                        linkedHashSet.add(callFeedbackReason);
                    }
                } else {
                    LinkedHashSet linkedHashSet2 = euqVar.A;
                    if (linkedHashSet2.contains(callFeedbackReason)) {
                        linkedHashSet2.remove(callFeedbackReason);
                    } else {
                        linkedHashSet2.add(callFeedbackReason);
                    }
                }
                ((View) euqVar.D.get(callFeedbackReason)).setSelected(!r11.isSelected());
                break;
            case 8:
                ((dx3) obj2).invoke(Integer.valueOf(((n70) obj).E()));
                break;
            case 9:
                dxs dxsVar = (dxs) obj2;
                dxsVar.W().setTextIsSelectable(false);
                dxsVar.N.invoke(((izj) obj).toString());
                dxsVar.W().setTextIsSelectable(true);
                break;
            case 10:
                HorizontalButtonsView.renderPaymentState$lambda$0((HorizontalButtonsView) obj2, (v6j) obj, view);
                break;
            case 11:
                ((HorizontalButtonsView) obj2).showFreightageRideDialog((FreightageRideItem) obj);
                break;
            case 12:
                ((fhv) obj2).invoke((LocalMessageRef) obj);
                break;
            case 13:
                ((tls) obj2).invoke((ServerMessageRef) obj);
                break;
            case 14:
                ((fhv) obj2).invoke((ImageViewerInfo) obj);
                break;
            case 15:
                wsv wsvVar = (wsv) obj;
                ClipboardManager clipboardManager = (ClipboardManager) ((View) obj2).getContext().getSystemService(ClipboardManager.class);
                if (clipboardManager != null) {
                    wv5 wv5Var = wsvVar.N;
                    kgx[] kgxVarArr = wsv.P;
                    clipboardManager.setPrimaryClip(ClipData.newPlainText(((TextView) wv5Var.a(kgxVarArr[0])).getText(), ((TextView) wsvVar.O.a(kgxVarArr[1])).getText()));
                    break;
                }
                break;
            case 16:
                b bVar = (b) obj;
                if (((w0w) obj2).d) {
                    SharedPreferences.Editor edit = bVar.a.edit();
                    edit.putBoolean(bVar.b, true);
                    edit.apply();
                }
                bVar.a(true);
                break;
            case 17:
                KeyboardTextButtonView._init_$lambda$3((KeyboardTextButtonView) obj2, (Context) obj, view);
                break;
            case 18:
                KycPhotoFragment.getViewBinding$lambda$10$lambda$9((KycPhotoFragment) obj2, (c761) obj, view);
                break;
            case 19:
                KycPhotoV2Fragment.getViewBinding$lambda$11$lambda$10((KycPhotoV2Fragment) obj2, (e761) obj, view);
                break;
            case 20:
                KycPhotoV2Fragment.showBottomSheet$lambda$22((KycPhotoV2Fragment) obj2, (iox) obj, view);
                break;
            case 21:
                ((zqx) obj2).a(((iqx) obj).d);
                break;
            case 22:
                LinkAccountsViewFactoryImpl$createLinkAccountsView$1.onViewAttachedToWindow$lambda$0((hky) obj2, (Events$Zalogin$LinkageContext) obj, view);
                break;
            case 23:
                n70 n70Var = (n70) obj2;
                sc20 sc20Var = (sc20) obj;
                if (((uty) n70Var.Z()).g) {
                    sc20Var.invoke(n70Var.Z(), Integer.valueOf(n70Var.F()));
                    break;
                }
                break;
            case 24:
                n70 n70Var2 = (n70) obj2;
                but0 but0Var = (but0) obj;
                if (((bry) n70Var2.Z()).g) {
                    but0Var.invoke(n70Var2.Z(), Integer.valueOf(n70Var2.F()));
                    break;
                }
                break;
            case 25:
                LoadableInput.setOnClearIconClickListener$lambda$8((LoadableInput) obj2, (sls) obj, view);
                break;
            case 26:
                LoggerOverlayView.lambda$3$lambda$2((LoggerOverlayView) obj2, (TextView) obj, view);
                break;
            case 27:
                ((klz) obj2).N.invoke(((SpannedString) obj).toString());
                break;
            case 28:
                ((com.yandex.go.lootbox.impl.presentation.recycler.a) obj2).V.a((eqz) obj);
                break;
            default:
                LowRatingReasonsView.setData$lambda$0((LowRatingReasonsView) obj2, (r8i0) obj, view);
                break;
        }
    }
}

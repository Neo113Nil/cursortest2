package ru.yandex.taxi.combo.domain;

import com.yandex.go.taxi.order.models.api.response.Action$ShowFullScreenAction;
import com.yandex.go.taxi.order.models.api.response.Action$ShowOrderPopupAction;
import com.yandex.go.taxi.order.models.api.response.d;
import com.yandex.go.zone.dto.objects.BulletsOrderPopup;
import com.yandex.go.zone.dto.objects.u2;
import defpackage.au6;
import defpackage.bu6;
import defpackage.cu6;
import defpackage.fu6;
import defpackage.hu6;
import defpackage.jl40;
import defpackage.n8e0;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.w030;
import defpackage.w511;
import defpackage.yvf0;
import defpackage.zy11;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.banners.c;
import ru.yandex.taxi.modal.popup.ui.PopupDialogModalView;
import ru.yandex.taxi.orderpopup.analytics.OrderPopupAnalytics$Screen;

/* loaded from: classes14.dex */
public final class a {
    public final c a;
    public final w030 b;
    public final hu6 c;
    public final au6 d;
    public final ru.yandex.taxi.modal.popup.ui.model.a e;
    public final yvf0 f;
    public final tse g;

    public a(c cVar, w030 w030Var, hu6 hu6Var, au6 au6Var, ru.yandex.taxi.modal.popup.ui.model.a aVar, yvf0 yvf0Var, tse tseVar) {
        this.a = cVar;
        this.b = w030Var;
        this.c = hu6Var;
        this.d = au6Var;
        this.e = aVar;
        this.f = yvf0Var;
        this.g = tseVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, cu6 cu6Var, ContinuationImpl continuationImpl) {
        ComboActionConsumer$showBulletsOrderPopup$1 comboActionConsumer$showBulletsOrderPopup$1;
        int i;
        PopupDialogModalView popupDialogModalView;
        aVar.getClass();
        if (continuationImpl instanceof ComboActionConsumer$showBulletsOrderPopup$1) {
            comboActionConsumer$showBulletsOrderPopup$1 = (ComboActionConsumer$showBulletsOrderPopup$1) continuationImpl;
            int i2 = comboActionConsumer$showBulletsOrderPopup$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                comboActionConsumer$showBulletsOrderPopup$1.label = i2 - Integer.MIN_VALUE;
                Object obj = comboActionConsumer$showBulletsOrderPopup$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = comboActionConsumer$showBulletsOrderPopup$1.label;
                if (i != 0) {
                    b.b(obj);
                    PopupDialogModalView popupDialogModalView2 = (PopupDialogModalView) aVar.f.get();
                    ru.yandex.taxi.modal.popup.ui.model.a aVar2 = aVar.e;
                    n8e0 n8e0Var = cu6Var.a;
                    comboActionConsumer$showBulletsOrderPopup$1.L$0 = cu6Var;
                    comboActionConsumer$showBulletsOrderPopup$1.L$1 = popupDialogModalView2;
                    comboActionConsumer$showBulletsOrderPopup$1.label = 1;
                    Object a = aVar2.a(n8e0Var, comboActionConsumer$showBulletsOrderPopup$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    popupDialogModalView = popupDialogModalView2;
                    obj = a;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    PopupDialogModalView popupDialogModalView3 = (PopupDialogModalView) comboActionConsumer$showBulletsOrderPopup$1.L$1;
                    cu6 cu6Var2 = (cu6) comboActionConsumer$showBulletsOrderPopup$1.L$0;
                    b.b(obj);
                    popupDialogModalView = popupDialogModalView3;
                    cu6Var = cu6Var2;
                }
                PopupDialogModalView.prepare$default(popupDialogModalView, (List) obj, new bu6(0, aVar.c.a(OrderPopupAnalytics$Screen.ACTIVE_COMBO_ORDER, cu6Var.a.a), new fu6(popupDialogModalView, null)), false, false, 12, null);
                aVar.b.s(popupDialogModalView, true);
                return zy11.a;
            }
        }
        comboActionConsumer$showBulletsOrderPopup$1 = new ComboActionConsumer$showBulletsOrderPopup$1(aVar, continuationImpl);
        Object obj2 = comboActionConsumer$showBulletsOrderPopup$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = comboActionConsumer$showBulletsOrderPopup$1.label;
        if (i != 0) {
        }
        PopupDialogModalView.prepare$default(popupDialogModalView, (List) obj2, new bu6(0, aVar.c.a(OrderPopupAnalytics$Screen.ACTIVE_COMBO_ORDER, cu6Var.a.a), new fu6(popupDialogModalView, null)), false, false, 12, null);
        aVar.b.s(popupDialogModalView, true);
        return zy11.a;
    }

    public final void a(d dVar) {
        cu6 a;
        if (dVar instanceof Action$ShowFullScreenAction) {
            c.l(this.a, ((Action$ShowFullScreenAction) dVar).a.a, "combo_action", null, null, null, 28);
            return;
        }
        if (!(dVar instanceof Action$ShowOrderPopupAction)) {
            if (jl40.l(dVar, com.yandex.go.taxi.order.models.api.response.c.INSTANCE) || dVar == null) {
                return;
            }
            w511.b();
            return;
        }
        u2 u2Var = ((Action$ShowOrderPopupAction) dVar).a;
        BulletsOrderPopup bulletsOrderPopup = u2Var instanceof BulletsOrderPopup ? (BulletsOrderPopup) u2Var : null;
        if (bulletsOrderPopup == null || (a = this.d.a(bulletsOrderPopup)) == null) {
            return;
        }
        tje.N(this.g, null, null, new ComboActionConsumer$accept$1(this, a, null), 3);
    }
}

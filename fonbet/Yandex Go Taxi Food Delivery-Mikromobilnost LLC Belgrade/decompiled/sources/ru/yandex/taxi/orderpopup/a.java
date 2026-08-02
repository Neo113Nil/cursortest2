package ru.yandex.taxi.orderpopup;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.dto.objects.BulletsOrderPopup;
import com.yandex.go.zone.dto.objects.e3;
import defpackage.au6;
import defpackage.bu6;
import defpackage.cu6;
import defpackage.dld0;
import defpackage.fu6;
import defpackage.hu6;
import defpackage.i130;
import defpackage.iu6;
import defpackage.n8e0;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.u380;
import defpackage.uos0;
import defpackage.wiq0;
import defpackage.zk7;
import defpackage.zy11;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.modal.popup.ui.PopupDialogModalView;
import ru.yandex.taxi.orderpopup.analytics.OrderPopupAnalytics$Screen;

/* loaded from: classes6.dex */
public final class a {
    public final i130 a;
    public final hu6 b;
    public final dld0 c;
    public final ru.yandex.taxi.modal.popup.ui.model.a d;
    public final au6 e;
    public final iu6 f;
    public final u380 g;
    public final uos0 h;
    public final wiq0 i;
    public final tse j;

    public a(i130 i130Var, hu6 hu6Var, dld0 dld0Var, ru.yandex.taxi.modal.popup.ui.model.a aVar, au6 au6Var, iu6 iu6Var, u380 u380Var, uos0 uos0Var, wiq0 wiq0Var, tse tseVar) {
        this.a = i130Var;
        this.b = hu6Var;
        this.c = dld0Var;
        this.d = aVar;
        this.e = au6Var;
        this.f = iu6Var;
        this.g = u380Var;
        this.h = uos0Var;
        this.i = wiq0Var;
        this.j = tseVar;
    }

    public final void a(cu6 cu6Var, zk7 zk7Var) {
        n8e0 n8e0Var = cu6Var.a;
        String str = n8e0Var.a;
        int i = n8e0Var.g;
        int i2 = n8e0Var.h;
        boolean z = cu6Var.c;
        iu6 iu6Var = this.f;
        if (!iu6Var.a(i, str, z, i2)) {
            zk7Var.b(e3.INSTANCE);
            return;
        }
        iu6Var.c = this.g.a(cu6Var);
        tje.N(this.j, null, null, new BulletsOrderPopupRouter$showModalViewIfNeeded$1(this, cu6Var, zk7Var, null), 3);
    }

    public final void b(BulletsOrderPopup bulletsOrderPopup) {
        cu6 a = this.e.a(bulletsOrderPopup);
        if (a == null) {
            return;
        }
        n8e0 n8e0Var = a.a;
        String str = n8e0Var.a;
        int i = n8e0Var.g;
        int i2 = n8e0Var.h;
        BulletsOrderPopup.ShowPolicy showPolicy = bulletsOrderPopup.f;
        BulletsOrderPopup.ShowPolicy.Companion.getClass();
        boolean z = showPolicy == BulletsOrderPopup.ShowPolicy.e;
        iu6 iu6Var = this.f;
        if (iu6Var.a(i, str, z, i2)) {
            iu6Var.c = this.g.a(a);
            tje.N(this.j, null, null, new BulletsOrderPopupRouter$showModalViewIfNeeded$2(this, a, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(cu6 cu6Var, zk7 zk7Var, ContinuationImpl continuationImpl) {
        BulletsOrderPopupRouter$showPopup$1 bulletsOrderPopupRouter$showPopup$1;
        int i;
        PopupDialogModalView popupDialogModalView;
        if (continuationImpl instanceof BulletsOrderPopupRouter$showPopup$1) {
            bulletsOrderPopupRouter$showPopup$1 = (BulletsOrderPopupRouter$showPopup$1) continuationImpl;
            int i2 = bulletsOrderPopupRouter$showPopup$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bulletsOrderPopupRouter$showPopup$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bulletsOrderPopupRouter$showPopup$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bulletsOrderPopupRouter$showPopup$1.label;
                if (i != 0) {
                    b.b(obj);
                    PopupDialogModalView popupDialogModalView2 = (PopupDialogModalView) this.c.get();
                    n8e0 n8e0Var = cu6Var.a;
                    bulletsOrderPopupRouter$showPopup$1.L$0 = cu6Var;
                    bulletsOrderPopupRouter$showPopup$1.L$1 = zk7Var;
                    bulletsOrderPopupRouter$showPopup$1.L$2 = popupDialogModalView2;
                    bulletsOrderPopupRouter$showPopup$1.label = 1;
                    Object a = this.d.a(n8e0Var, bulletsOrderPopupRouter$showPopup$1);
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
                    PopupDialogModalView popupDialogModalView3 = (PopupDialogModalView) bulletsOrderPopupRouter$showPopup$1.L$2;
                    zk7Var = (zk7) bulletsOrderPopupRouter$showPopup$1.L$1;
                    cu6 cu6Var2 = (cu6) bulletsOrderPopupRouter$showPopup$1.L$0;
                    b.b(obj);
                    popupDialogModalView = popupDialogModalView3;
                    cu6Var = cu6Var2;
                }
                PopupDialogModalView.prepare$default(popupDialogModalView, (List) obj, new bu6(0, this.b.a(OrderPopupAnalytics$Screen.SUMMARY, cu6Var.a.a), new fu6(popupDialogModalView, zk7Var)), false, this.h.a(((k) this.i).m()), 4, null);
                this.a.a().k(popupDialogModalView, 2.0f, true);
                return zy11.a;
            }
        }
        bulletsOrderPopupRouter$showPopup$1 = new BulletsOrderPopupRouter$showPopup$1(this, continuationImpl);
        Object obj2 = bulletsOrderPopupRouter$showPopup$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bulletsOrderPopupRouter$showPopup$1.label;
        if (i != 0) {
        }
        PopupDialogModalView.prepare$default(popupDialogModalView, (List) obj2, new bu6(0, this.b.a(OrderPopupAnalytics$Screen.SUMMARY, cu6Var.a.a), new fu6(popupDialogModalView, zk7Var)), false, this.h.a(((k) this.i).m()), 4, null);
        this.a.a().k(popupDialogModalView, 2.0f, true);
        return zy11.a;
    }
}

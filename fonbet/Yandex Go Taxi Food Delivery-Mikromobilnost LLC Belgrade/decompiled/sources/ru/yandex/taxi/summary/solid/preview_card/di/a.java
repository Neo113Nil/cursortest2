package ru.yandex.taxi.summary.solid.preview_card.di;

import com.yandex.go.zone.dto.objects.SummaryCardPromo;
import defpackage.aev0;
import defpackage.dev0;
import defpackage.eev0;
import defpackage.f8e0;
import defpackage.g8e0;
import defpackage.j8e0;
import defpackage.k8e0;
import defpackage.lx4;
import defpackage.n8e0;
import defpackage.ny61;
import defpackage.oy80;
import defpackage.p8e0;
import defpackage.pzm0;
import defpackage.tcc;
import defpackage.w511;
import defpackage.yvf0;
import defpackage.zdv0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.modal.popup.ui.PopupDialogModalView;
import ru.yandex.taxi.modal.popup.ui.model.PopupDialogModalUiState$HeaderType;

/* loaded from: classes6.dex */
public final class a {
    public final yvf0 a;
    public final p8e0 b;
    public final aev0 c;
    public final ru.yandex.taxi.modal.popup.ui.model.a d;

    public a(yvf0 yvf0Var, p8e0 p8e0Var, aev0 aev0Var, ru.yandex.taxi.modal.popup.ui.model.a aVar) {
        this.a = yvf0Var;
        this.b = p8e0Var;
        this.c = aev0Var;
        this.d = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, SummaryCardPromo summaryCardPromo, ContinuationImpl continuationImpl) {
        SummaryCardPromoModalViewFactory$create$1 summaryCardPromoModalViewFactory$create$1;
        int i;
        ArrayList arrayList;
        j8e0 j8e0Var;
        String str2;
        if (continuationImpl instanceof SummaryCardPromoModalViewFactory$create$1) {
            summaryCardPromoModalViewFactory$create$1 = (SummaryCardPromoModalViewFactory$create$1) continuationImpl;
            int i2 = summaryCardPromoModalViewFactory$create$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryCardPromoModalViewFactory$create$1.label = i2 - Integer.MIN_VALUE;
                Object obj = summaryCardPromoModalViewFactory$create$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryCardPromoModalViewFactory$create$1.label;
                if (i != 0) {
                    b.b(obj);
                    this.c.getClass();
                    String str3 = summaryCardPromo.g.a;
                    String str4 = summaryCardPromo.c;
                    String str5 = summaryCardPromo.d;
                    k8e0 k8e0Var = new k8e0(summaryCardPromo.b, 5);
                    List list = summaryCardPromo.f;
                    if (list != null) {
                        List<SummaryCardPromo.Bullet> list2 = list;
                        arrayList = new ArrayList(tcc.n(list2, 10));
                        for (SummaryCardPromo.Bullet bullet : list2) {
                            arrayList.add(new f8e0(bullet.c, bullet.a, bullet.b));
                        }
                    } else {
                        arrayList = new ArrayList();
                    }
                    ArrayList arrayList2 = arrayList;
                    int i3 = summaryCardPromo.g.b;
                    List singletonList = Collections.singletonList(new g8e0(summaryCardPromo.e, ""));
                    int i4 = zdv0.a[summaryCardPromo.h.a.ordinal()];
                    if (i4 == 1) {
                        j8e0Var = new j8e0(PopupDialogModalUiState$HeaderType.DEFAULT, 2);
                    } else {
                        if (i4 != 2) {
                            w511.b();
                            return null;
                        }
                        j8e0Var = new j8e0(PopupDialogModalUiState$HeaderType.PROMINENT, 2);
                    }
                    n8e0 n8e0Var = new n8e0(str3, str4, null, str5, k8e0Var, arrayList2, i3, 0, singletonList, j8e0Var);
                    str2 = str;
                    summaryCardPromoModalViewFactory$create$1.L$0 = str2;
                    summaryCardPromoModalViewFactory$create$1.L$1 = null;
                    summaryCardPromoModalViewFactory$create$1.L$2 = null;
                    summaryCardPromoModalViewFactory$create$1.label = 1;
                    obj = this.d.a(n8e0Var, summaryCardPromoModalViewFactory$create$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) summaryCardPromoModalViewFactory$create$1.L$0;
                    b.b(obj);
                }
                pzm0 pzm0Var = new pzm0(new oy80(23, (lx4) this.b.a.a.get(), str2));
                PopupDialogModalView popupDialogModalView = (PopupDialogModalView) this.a.get();
                PopupDialogModalView.prepare$default(popupDialogModalView, (List) obj, new eev0(pzm0Var, new dev0(popupDialogModalView)), false, false, 12, null);
                return popupDialogModalView;
            }
        }
        summaryCardPromoModalViewFactory$create$1 = new SummaryCardPromoModalViewFactory$create$1(this, continuationImpl);
        Object obj2 = summaryCardPromoModalViewFactory$create$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryCardPromoModalViewFactory$create$1.label;
        if (i != 0) {
        }
        pzm0 pzm0Var2 = new pzm0(new oy80(23, (lx4) this.b.a.a.get(), str2));
        PopupDialogModalView popupDialogModalView2 = (PopupDialogModalView) this.a.get();
        PopupDialogModalView.prepare$default(popupDialogModalView2, (List) obj2, new eev0(pzm0Var2, new dev0(popupDialogModalView2)), false, false, 12, null);
        return popupDialogModalView2;
    }
}

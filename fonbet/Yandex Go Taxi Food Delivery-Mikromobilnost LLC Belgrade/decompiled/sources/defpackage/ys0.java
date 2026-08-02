package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.masstransit.sdk.trains.impl.datepicker.ui.c;
import com.yandex.go.promocodes.base.impl.ui.share.v1.PromocodeSharingView;
import com.yandex.go.taxi.order.models.api.response.RideCardInfoResponse;
import com.yandex.go.taxi.summary.drive.vertical_tariff_selector.VerticalTariffSelectorView;
import com.yandex.messaging.input.voice.reply.a;
import com.ybsdk.feature.dashboard.internal.ui.dashboard.DashboardFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteFragment;
import kotlinx.serialization.SerializationException;
import ru.yandex.taxi.delivery.ui.form.e;
import ru.yandex.taxi.masstransit.ui.route.modal.collapsed.MtCollapsedRoutesView;

/* loaded from: classes5.dex */
public final /* synthetic */ class ys0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ys0(a aVar, View view, int i) {
        this.a = 17;
        this.c = view;
        this.b = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 onViewCreated$lambda$17$lambda$16;
        zy11 initVerticalHeaderAndViewPagerPosition$lambda$0;
        zy11 backgroundImage$lambda$0;
        zy11 scrollToField$lambda$14;
        zy11 initVerticalHeaderAndViewPagerPosition$lambda$02;
        int i = this.a;
        int i2 = 1;
        zy11 zy11Var = zy11.a;
        Object obj = this.c;
        int i3 = this.b;
        switch (i) {
            case 0:
                ((ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.a) obj).a.a(i3);
                return zy11Var;
            case 1:
                onViewCreated$lambda$17$lambda$16 = DashboardFragment.onViewCreated$lambda$17$lambda$16((DashboardFragment) obj, i3);
                return onViewCreated$lambda$17$lambda$16;
            case 2:
                ru.yandex.taxi.delivery.ui.recycler.a aVar = (ru.yandex.taxi.delivery.ui.recycler.a) obj;
                if (aVar.F() != -1) {
                    aVar.c0.b(aVar.F(), aVar.V.d(), "photo_comment");
                    if (i3 >= aVar.b0.q.b) {
                        aVar.a0.a(io.d);
                    } else {
                        aVar.c0();
                        hki hkiVar = aVar.e0;
                        if (hkiVar != null) {
                            ((d1x) ((zo31) aVar.R)).r.showPopupMenu(hkiVar);
                        }
                    }
                }
                return zy11Var;
            case 3:
                e eVar = (e) obj;
                ((pep0) eVar.l0).f((m950) eVar.F.get(), new ewh(new fki(i3), new zai(eVar, i2), 6), hxx.a);
                return zy11Var;
            case 4:
                ((tls) ((oz40) obj).getValue()).invoke(new f3l0(i3));
                return Boolean.TRUE;
            case 5:
                dip dipVar = (dip) obj;
                dipVar.a.invoke(dipVar.b.get(i3));
                return zy11Var;
            case 6:
                ((xh20) obj).a.a(i3);
                return zy11Var;
            case 7:
                initVerticalHeaderAndViewPagerPosition$lambda$0 = MtCollapsedRoutesView.initVerticalHeaderAndViewPagerPosition$lambda$0((MtCollapsedRoutesView) obj, i3);
                return initVerticalHeaderAndViewPagerPosition$lambda$0;
            case 8:
                return new ugh(i3, 0.0f, (sls) obj);
            case 9:
                Drawable t = vng.t(i3, ((avj0) ((zuj0) obj)).a);
                if (t != null) {
                    return u8b1.g(t);
                }
                return null;
            case 10:
                Integer valueOf = ((y3u0) obj).a() ? Integer.valueOf(i3) : null;
                return Integer.valueOf(valueOf != null ? valueOf.intValue() : 0);
            case 11:
                backgroundImage$lambda$0 = PromocodeSharingView.setBackgroundImage$lambda$0((PromocodeSharingView) obj, i3);
                return backgroundImage$lambda$0;
            case 12:
                rik0 rik0Var = (rik0) obj;
                Context context = rik0Var.a;
                try {
                    return (RideCardInfoResponse) ((xnt) rik0Var.b).c(gwk0.w(i3, context), RideCardInfoResponse.Companion.serializer());
                } catch (SerializationException e) {
                    a3y0.k((a3y0) rik0Var.c.getValue(), e, new xc8(context.getResources().getResourceName(i3), 19), 1);
                    return null;
                }
            case 13:
                ((wls) obj).invoke(gyq.a, Integer.valueOf(i3));
                return zy11Var;
            case 14:
                return Integer.valueOf(((dfq0) obj).f.b.d(i3));
            case 15:
                scrollToField$lambda$14 = TransferRequisiteFragment.scrollToField$lambda$14((TransferRequisiteFragment) obj, i3);
                return scrollToField$lambda$14;
            case 16:
                initVerticalHeaderAndViewPagerPosition$lambda$02 = VerticalTariffSelectorView.initVerticalHeaderAndViewPagerPosition$lambda$0((VerticalTariffSelectorView) obj, i3);
                return initVerticalHeaderAndViewPagerPosition$lambda$02;
            case 17:
                View view = (View) obj;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = layoutParams != null ? layoutParams : null;
                if (layoutParams2 != null && layoutParams2.width != i3) {
                    layoutParams2.width = i3;
                    view.setLayoutParams(layoutParams2);
                }
                return zy11Var;
            case 18:
                return Integer.valueOf(((c) obj).b(i3));
            default:
                ((yx40) obj).setIntValue(i3);
                return zy11Var;
        }
    }

    public /* synthetic */ ys0(int i, Object obj, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
    }

    public /* synthetic */ ys0(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}

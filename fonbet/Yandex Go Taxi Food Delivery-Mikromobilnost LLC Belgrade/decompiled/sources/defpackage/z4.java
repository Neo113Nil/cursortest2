package defpackage;

import com.yandex.go.chargers.subscription.presentation.landing.c;
import com.ybsdk.feature.about.internal.presentation.AboutComposeFragment;
import com.yx360.design.view.DsCarouselView;
import com.yx360.design.view.DsSnackbarView;
import com.yx360.design.view.base.DsComposeView;
import ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.ui.smart_camera_screens.ai_camera.a;
import ru.yandex.taxi.masstransit.main.ui.header.compose.MtHeader;

/* loaded from: classes11.dex */
public final /* synthetic */ class z4 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z4(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 Content$lambda$2;
        zy11 ComposeContent$lambda$1;
        zy11 Content$lambda$1;
        zy11 ComposeContent$lambda$12;
        zy11 Content$lambda$12;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                Content$lambda$2 = AboutComposeFragment.Content$lambda$2((AboutComposeFragment) obj3, i2, (fid) obj, ((Integer) obj2).intValue());
                break;
            case 1:
                ((Integer) obj2).intValue();
                j76.a((sh0) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                kma1.a((cj0) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                a.a((w8v) obj3, i2, (fid) obj, vng.O(1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                pkf.b((bo1) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                pkf.c((co1) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                cib1.a((tn9) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                djb1.c((oip0) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                c.h((gta) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).intValue();
                ru.yandex.taxi.logistics.sdk.dashboard.ui.widget.a.a((ome) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                hsb1.d((j690) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).intValue();
                lsb1.a((xxe) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).intValue();
                nsb1.b((iye) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).intValue();
                pj91.a((drl) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 14:
                ComposeContent$lambda$1 = DsCarouselView.ComposeContent$lambda$1((DsCarouselView) obj3, i2, (fid) obj, ((Integer) obj2).intValue());
                break;
            case 15:
                Content$lambda$1 = DsComposeView.Content$lambda$1((DsComposeView) obj3, i2, (fid) obj, ((Integer) obj2).intValue());
                break;
            case 16:
                ((Integer) obj2).getClass();
                mrm.k((kk2) obj3, i2, (fid) obj, vng.O(1));
                break;
            case 17:
                ComposeContent$lambda$12 = DsSnackbarView.ComposeContent$lambda$1((DsSnackbarView) obj3, i2, (fid) obj, ((Integer) obj2).intValue());
                break;
            case 18:
                ((Integer) obj2).intValue();
                ika1.a((uep) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 19:
                androidx.compose.runtime.internal.a aVar = (androidx.compose.runtime.internal.a) obj3;
                fid fidVar = (fid) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    bts btsVar = (bts) fidVar;
                    if (btsVar.E()) {
                        btsVar.Y();
                        break;
                    }
                }
                aVar.invoke(Integer.valueOf(i2 - 1), fidVar, 0);
                break;
            case 20:
                ((Integer) obj2).intValue();
                m4b1.a((qhv) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 21:
                b4y b4yVar = (b4y) obj3;
                fid fidVar2 = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    suw b = b4yVar.b.b.b(i2);
                    ((y3y) b.c).c.invoke(c4y.a, Integer.valueOf(i2 - b.a), btsVar2, 6);
                    break;
                }
            case 22:
                o6y o6yVar = (o6y) obj3;
                fid fidVar3 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    btsVar3.Y();
                    break;
                } else {
                    suw b2 = o6yVar.b.a.b(i2);
                    ((l6y) b2.c).c.invoke(o6yVar.c, Integer.valueOf(i2 - b2.a), btsVar3, 0);
                    break;
                }
            case 23:
                ((Integer) obj2).intValue();
                qfb1.a((v0z) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 24:
                Content$lambda$12 = MtHeader.Content$lambda$1((MtHeader) obj3, i2, (fid) obj, ((Integer) obj2).intValue());
                break;
            case 25:
                ((Integer) obj2).getClass();
                fpb1.b((r740) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                hpb1.b((s740) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 27:
                p890 p890Var = (p890) obj3;
                fid fidVar4 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (!btsVar4.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    btsVar4.Y();
                    break;
                } else {
                    suw b3 = p890Var.b.d().b(i2);
                    ((m890) b3.c).b.invoke(t890.a, Integer.valueOf(i2 - b3.a), btsVar4, 0);
                    break;
                }
            case 28:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.pay_now.a.b((l2a0) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                yn91.e((qor) obj3, (fid) obj, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ z4(Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.c = obj;
        this.b = i;
    }
}

package defpackage;

import android.app.AlertDialog;
import android.graphics.Paint;
import android.view.View;
import com.yandex.go.payments.lpm.domain.e;
import com.yandex.go.places.experiments.map.map_as_main_places.MapAsMainPlacesExperiment;
import com.yandex.go.places.experiments.map.map_as_main_places.b;
import com.yandex.go.preorder.header.g;
import com.yandex.go.user_profile.main_menu.profile.presentation.MainMenuUserProfileView;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.geo.Projection;
import com.yandex.mapkit.road_events_layer.RoadEventsLayer;
import com.yandex.messaging.activity.MessengerActivityBase;
import com.yandex.messaging.internal.entities.MessageTranslation;
import com.yandex.messaging.internal.view.input.mesix.Mesix;
import com.yandex.messaging.internal.view.timeline.translations.c;
import com.ybsdk.api.YBSdkVisualParams;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.Me2MeDebitResultFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.Me2MeDebitResultScreenParams;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.domain.Me2MeDebitResultEntity$Status;
import com.ybsdk.rconfig.configs.YbMobileTabBarConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.maas.api.MaasApi;
import ru.yandex.taxi.maas.impl.ride.metropick.MaasMetroPickModalView;
import ru.yandex.taxi.maas.impl.ride.metropick.a;
import ru.yandex.taxi.maas.impl.ride.metropick.d;
import ru.yandex.taxi.masstransit.experiment.MtMainRedirectExperiment;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.settings.info.modal.MenuInfoModalView;

/* loaded from: classes13.dex */
public final /* synthetic */ class xyz implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xyz(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        View errorView_delegate$lambda$0;
        String statusLabel_delegate$lambda$0;
        zy11 viewBinding$lambda$3$lambda$0;
        View insetsType$lambda$0;
        Paint timerProgressPaint_delegate$lambda$1;
        lt11 a;
        int i = this.a;
        boolean z = true;
        int i2 = 10;
        zy11 zy11Var = zy11.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                e eVar = (e) obj;
                zxz zxzVar = eVar.f;
                Set set = eVar.a.m;
                zxzVar.getClass();
                return new kw90(new ew90(), new fzz(set), new s6h());
            case 1:
                errorView_delegate$lambda$0 = MaasMetroPickModalView.errorView_delegate$lambda$0((MaasMetroPickModalView) obj);
                return errorView_delegate$lambda$0;
            case 2:
                on2 on2Var = ((a) obj).x;
                on2Var.getClass();
                return (MaasApi) on2Var.a(GoApiName.TaxiV4, MaasApi.class);
            case 3:
                ((d) obj).r(new iez(i2));
                return zy11Var;
            case 4:
                return new pdd0((gdd0) ((com.yandex.plus.pay.internal.feature.mailing.a) obj).c.getValue());
            case 5:
                sls slsVar = ((s2v0) obj).b.b;
                if (slsVar != null) {
                    slsVar.invoke();
                }
                return zy11Var;
            case 6:
                statusLabel_delegate$lambda$0 = MainMenuUserProfileView.statusLabel_delegate$lambda$0((MainMenuUserProfileView) obj);
                return statusLabel_delegate$lambda$0;
            case 7:
                return ((g) obj).a.a.getString(fyh0.rida_tariff_unavailable_default);
            case 8:
                vc00.b(((com.yandex.go.mainscreen.superapp.impl.foundation.presentation.sidepager.a) obj).b);
                return zy11Var;
            case 9:
                return ((jbh) ((b) obj).a).e(MapAsMainPlacesExperiment.d);
            case 10:
                wtr wtrVar = (wtr) ((c9v) obj).c;
                int i3 = wtrVar.c - 1;
                wtrVar.c = i3;
                if (i3 == 0) {
                    wtrVar.b.a0(wtrVar.a);
                }
                return zy11Var;
            case 11:
                ((RoadEventsLayer) obj).deselectRoadEvent();
                return zy11Var;
            case 12:
                cm00 cm00Var = (cm00) obj;
                ba20 ba20Var = cm00Var.z;
                if (ba20Var != null) {
                    ba20Var.success(null);
                }
                cm00Var.z = null;
                cm00Var.y = null;
                return zy11Var;
            case 13:
                rqo rqoVar = ((ru.yandex.taxi.masstransit.d) obj).K;
                MtMainRedirectExperiment.Companion.getClass();
                return ((jbh) rqoVar).c(new MtMainRedirectExperiment(0));
            case 14:
                return ((a410) obj).c;
            case 15:
                return ((e410) obj).b;
            case 16:
                viewBinding$lambda$3$lambda$0 = Me2MeDebitResultFragment.getViewBinding$lambda$3$lambda$0((Me2MeDebitResultFragment) obj);
                return viewBinding$lambda$3$lambda$0;
            case 17:
                return new k910(((Me2MeDebitResultScreenParams) obj).getResultLoaderPage(), Me2MeDebitResultEntity$Status.PROCESSING, null, null, HProv.PP_SAME_MEDIA);
            case 18:
                ((zg10) obj).a.getClass();
                try {
                    j320.d().a().newInstance();
                } catch (Exception | NoClassDefFoundError unused) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 19:
                insetsType$lambda$0 = MenuInfoModalView.insetsType$lambda$0((MenuInfoModalView) obj);
                return insetsType$lambda$0;
            case 20:
                return new dn10(new t8j0(), ((YBSdkVisualParams) obj).getShowLogOut(), false, false);
            case 21:
                i3y i3yVar = ((go10) obj).a;
                return Double.valueOf(Math.max((((Projection) i3yVar.getValue()).worldToXY(new Point(0.0d, 1.0d), 0).getX() - ((Projection) i3yVar.getValue()).worldToXY(new Point(0.0d, 0.0d), 0).getX()) * 360.0d, 1.0d));
            case 22:
                List<YbMobileTabBarConfig.TabBarItem> items = ((xo10) ((qp10) obj)).a.q().getItems();
                ArrayList arrayList = new ArrayList(tcc.n(items, 10));
                Iterator<T> it = items.iterator();
                while (it.hasNext()) {
                    arrayList.add(((YbMobileTabBarConfig.TabBarItem) it.next()).toEntity());
                }
                return new nq10(arrayList, null, null, np10.a);
            case 23:
                timerProgressPaint_delegate$lambda$1 = Mesix.timerProgressPaint_delegate$lambda$1((Mesix) obj);
                return timerProgressPaint_delegate$lambda$1;
            case 24:
                sfl0 sfl0Var = ((ps10) obj).u;
                new n4b(b620.d);
                sfl0Var.getClass();
                return zy11Var;
            case 25:
                ((mw10) obj).g();
                return zy11Var;
            case 26:
                ez01 ez01Var = ((c) obj).l;
                ez01Var.getClass();
                new AlertDialog.Builder(ez01Var.a, w0i0.Messaging_AlertDialog).setTitle(oyh0.translator_chat_failed_dialog_title).setMessage(oyh0.translator_chat_failed_dialog_text).setPositiveButton(oyh0.messaging_button_ok_text, new dz2(8)).show();
                return zy11Var;
            case 27:
                List list = ((MessageTranslation.Text) obj).c;
                if (list != null) {
                    return new JSONArray((Collection) list).toString();
                }
                return null;
            case 28:
                a = mt11.a((MessengerActivityBase) obj);
                return a;
            default:
                return (xav) ((com.yandex.messaging.internal.avatar.a) obj).a.get();
        }
    }
}

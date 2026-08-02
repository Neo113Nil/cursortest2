package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.go.chargers.station.presentation.details.components.ChargersStationAboutLocationView;
import com.yandex.go.chargers.station.presentation.details.components.ChargersStationUsageInstructionView;
import com.yandex.go.chargers.subscription.presentation.landing.c;
import com.yandex.go.copter.experiment.CopterOrderFlowExperiment;
import com.yandex.go.design.compose.loading.b;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.mapkit.maps.core.utils.extensions.collections.CollectionExtensionsKt;
import com.yandex.messaging.ui.chatthreadscontainer.ChatThreadsContainerFragment;
import com.yandex.messenger.websdk.api.Cancelable;
import com.ybsdk.widgets.common.CircleButtonsListView;
import com.ybsdk.widgets.common.chip.ChipListView;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringBar;

/* loaded from: classes12.dex */
public final /* synthetic */ class qha implements wls {
    public final /* synthetic */ int a;

    public /* synthetic */ qha(int i) {
        this.a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x01f5, code lost:
    
        if (defpackage.jl40.l(r0, r1 != null ? r1.a : null) != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x025c, code lost:
    
        if (defpackage.jl40.l(r0 != null ? r0.b : null, r1 != null ? r1.b : null) != false) goto L105;
     */
    @Override // defpackage.wls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        zy11 photosAdapter$lambda$0$1;
        zy11 descriptionsAdapter$lambda$0$1;
        zy11 adapter$lambda$0$0;
        zy11 adapter$lambda$0$2;
        n751 onCreateView$lambda$1;
        zo31 chipsAdapterDelegate$lambda$2;
        s061 buttonsAdapterDelegate$lambda$1;
        boolean isSorted$lambda$0;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        boolean z = true;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                zib1.f((fid) obj, vng.O(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                djb1.e((fid) obj, vng.O(1));
                break;
            case 2:
                break;
            case 3:
                photosAdapter$lambda$0$1 = ChargersStationAboutLocationView.photosAdapter$lambda$0$1((ShimmeringBar) obj, (bqa) obj2);
                break;
            case 4:
                descriptionsAdapter$lambda$0$1 = ChargersStationAboutLocationView.descriptionsAdapter$lambda$0$1((ShimmeringBar) obj, (bqa) obj2);
                break;
            case 5:
                adapter$lambda$0$0 = ChargersStationUsageInstructionView.adapter$lambda$0$0((RobotoTextView) obj, (wsa) obj2);
                break;
            case 6:
                adapter$lambda$0$2 = ChargersStationUsageInstructionView.adapter$lambda$0$2((GoLinearLayout) obj, (vsa) obj2);
                break;
            case 7:
                ((Integer) obj2).getClass();
                c.b((fid) obj, vng.O(1));
                break;
            case 8:
                break;
            case 9:
                View inflate = ((LayoutInflater) obj).inflate(yrh0.surge_info_content_chart_item, (ViewGroup) obj2, false);
                if (inflate == null) {
                    ny61.t("rootView");
                    break;
                } else {
                    break;
                }
            case 10:
                ((yn50) ((g9v) obj2)).a();
                break;
            case 11:
                onCreateView$lambda$1 = ChatThreadsContainerFragment.onCreateView$lambda$1((View) obj, (n751) obj2);
                break;
            case 12:
                ((Cancelable) obj2).cancel();
                break;
            case 13:
                ((Integer) obj2).getClass();
                bts btsVar = (bts) ((fid) obj);
                btsVar.e0(308609950);
                byk0 a = ((YandexShapes) btsVar.m(qm51.a)).a();
                btsVar.t(false);
                break;
            case 14:
                ((Integer) obj2).getClass();
                bts btsVar2 = (bts) ((fid) obj);
                btsVar2.e0(617421797);
                byk0 e = ((YandexShapes) btsVar2.m(qm51.a)).e();
                btsVar2.t(false);
                break;
            case 15:
                ((Integer) obj2).intValue();
                bts btsVar3 = (bts) ((fid) obj);
                btsVar3.e0(1348337163);
                byk0 c = cyk0.c(8.0f);
                btsVar3.t(false);
                break;
            case 16:
                ((Integer) obj2).intValue();
                bts btsVar4 = (bts) ((fid) obj);
                btsVar4.e0(63012128);
                byk0 byk0Var = cyk0.a;
                btsVar4.t(false);
                break;
            case 17:
                g4a0 g4a0Var = (g4a0) obj;
                g4a0 g4a0Var2 = (g4a0) obj2;
                if (jl40.l(g4a0Var != null ? g4a0Var.a : null, g4a0Var2 != null ? g4a0Var2.a : null)) {
                    break;
                }
                z = false;
                break;
            case 18:
                ((Integer) obj2).getClass();
                bts btsVar5 = (bts) ((fid) obj);
                btsVar5.e0(-1579923568);
                jer jerVar = new jer(0, 0);
                btsVar5.t(false);
                break;
            case 19:
                chipsAdapterDelegate$lambda$2 = ChipListView.chipsAdapterDelegate$lambda$2((LayoutInflater) obj, (ViewGroup) obj2);
                break;
            case 20:
                buttonsAdapterDelegate$lambda$1 = CircleButtonsListView.buttonsAdapterDelegate$lambda$1((LayoutInflater) obj, (ViewGroup) obj2);
                break;
            case 21:
                CopterOrderFlowExperiment copterOrderFlowExperiment = (CopterOrderFlowExperiment) obj;
                CopterOrderFlowExperiment copterOrderFlowExperiment2 = (CopterOrderFlowExperiment) obj2;
                if (copterOrderFlowExperiment.getB() == copterOrderFlowExperiment2.getB()) {
                    CopterOrderFlowExperiment.CityTourSettings cityTourSettings = copterOrderFlowExperiment.f;
                    String str = cityTourSettings != null ? cityTourSettings.a : null;
                    CopterOrderFlowExperiment.CityTourSettings cityTourSettings2 = copterOrderFlowExperiment2.f;
                    break;
                }
                z = false;
                break;
            case 22:
                isSorted$lambda$0 = CollectionExtensionsKt.isSorted$lambda$0((Comparable) obj, (Comparable) obj2);
                break;
            case 23:
                View inflate2 = ((LayoutInflater) obj).inflate(poh0.ybsdk_communication_full_screen_info_item, (ViewGroup) obj2, false);
                int i2 = fch0.image;
                ImageView imageView = (ImageView) cma1.O(i2, inflate2);
                if (imageView != null) {
                    i2 = fch0.subtitle;
                    TextView textView = (TextView) cma1.O(i2, inflate2);
                    if (textView != null) {
                        i2 = fch0.title;
                        TextView textView2 = (TextView) cma1.O(i2, inflate2);
                        if (textView2 != null) {
                            break;
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i2)));
                break;
            case 24:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                w1d w1dVar = w1d.a;
                bts btsVar6 = (bts) fidVar;
                if (!btsVar6.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar6.Y();
                    break;
                } else {
                    xqb1.b(null, null, btsVar6, 0, 3);
                    break;
                }
            case 25:
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                w1d w1dVar2 = w1d.a;
                bts btsVar7 = (bts) fidVar2;
                if (!btsVar7.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    btsVar7.Y();
                    break;
                } else {
                    yqb1.e(ohb1.e(btsVar7, kyh0.about_title), null, null, xya1.e(btsVar7).g.b, 0, 0, null, null, null, 0, 0, btsVar7, 0, 2038);
                    break;
                }
            case 26:
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                e2d e2dVar = e2d.a;
                bts btsVar8 = (bts) fidVar3;
                if (!btsVar8.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    btsVar8.Y();
                    break;
                } else {
                    o4b1.b(mt71.m(ozg0.ic_open_camera, 0, btsVar8), "", null, null, null, 0.0f, new c36(((el51) btsVar8.m(gl51.a)).j(), 5), btsVar8, 48, 60);
                    break;
                }
            case 27:
                fid fidVar4 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                e2d e2dVar2 = e2d.a;
                bts btsVar9 = (bts) fidVar4;
                if (!btsVar9.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    btsVar9.Y();
                    break;
                } else {
                    o4b1.b(mt71.m(ozg0.ic_open_folder, 0, btsVar9), "", null, null, null, 0.0f, new c36(((el51) btsVar9.m(gl51.a)).j(), 5), btsVar9, 48, 60);
                    break;
                }
            case 28:
                fid fidVar5 = (fid) obj;
                int intValue5 = ((Integer) obj2).intValue();
                f2d f2dVar = f2d.a;
                bts btsVar10 = (bts) fidVar5;
                if (!btsVar10.V(intValue5 & 1, (intValue5 & 3) != 2)) {
                    btsVar10.Y();
                    break;
                } else {
                    dk91.b(0L, 1.0f, 8.0f, btsVar10, 432, 1);
                    break;
                }
            default:
                fid fidVar6 = (fid) obj;
                int intValue6 = ((Integer) obj2).intValue();
                n2d n2dVar = n2d.a;
                bts btsVar11 = (bts) fidVar6;
                if (!btsVar11.V(intValue6 & 1, (intValue6 & 3) != 2)) {
                    btsVar11.Y();
                    break;
                } else {
                    b.a(on70.a(ljs0.c(c530.a, 1.0f), 0.8f), cyk0.c(32.0f), false, null, null, null, false, btsVar11, 6, 252);
                    break;
                }
        }
        return zy11Var;
    }

    public /* synthetic */ qha(int i, int i2) {
        this.a = i2;
    }
}

package defpackage;

import android.graphics.Rect;
import android.net.Uri;
import com.yandex.go.navigator.incidents.IncidentType;
import com.yandex.go.navigator.incidents.dashboard.DashboardEventsModalView;
import com.yandex.go.navigator.incidents.dashboard.a;
import com.yandex.go.navigator.incidents.experiment.IncidentsAvailabilityExperiment;
import com.yandex.go.navigator.incidents.report.IncidentReportType;
import com.yandex.mapkit.geometry.Point;
import java.util.HashMap;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes12.dex */
public final class rig implements vjg {
    public final /* synthetic */ DashboardEventsModalView a;

    public rig(DashboardEventsModalView dashboardEventsModalView) {
        this.a = dashboardEventsModalView;
    }

    @Override // defpackage.vjg
    public final Object awaitFocusRectReady(Continuation continuation) {
        Object prepareStaticFocusRect;
        prepareStaticFocusRect = this.a.prepareStaticFocusRect(continuation);
        return prepareStaticFocusRect;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        bys bysVar;
        final sig sigVar;
        final sig sigVar2;
        final sig sigVar3;
        dkg dkgVar = (dkg) obj;
        DashboardEventsModalView dashboardEventsModalView = this.a;
        uig access$getBinding = DashboardEventsModalView.access$getBinding(dashboardEventsModalView);
        bysVar = dashboardEventsModalView.adapter;
        bysVar.submitList(dkgVar.b, null);
        ListTitleComponent listTitleComponent = access$getBinding.c;
        ButtonComponent buttonComponent = access$getBinding.e;
        listTitleComponent.setTitle(dkgVar.a);
        ListTitleComponent listTitleComponent2 = access$getBinding.c;
        listTitleComponent2.setTitleTypeface(5);
        ButtonComponent buttonComponent2 = (ButtonComponent) listTitleComponent2.getTrailViewAs(ButtonComponent.class);
        final int i = 0;
        if (buttonComponent2 == null) {
            ButtonComponent buttonComponent3 = new ButtonComponent(listTitleComponent2.getContext(), null, 0, 6, null);
            buttonComponent3.setTextSize(13.0f);
            buttonComponent3.setButtonSize(0);
            buttonComponent3.setTextTypeface(3);
            buttonComponent3.setButtonBackground(new bdc(xng0.controlMinor));
            buttonComponent3.setButtonTitleColor(new bdc(xng0.textOnControlMinor));
            listTitleComponent2.setTrailView(buttonComponent3);
            Rect rect = xw31.a;
            c.D(buttonComponent3.getLayoutParams().width, -2, buttonComponent3);
            xw31.F(buttonComponent3, null, null, Integer.valueOf(tje.u(12, buttonComponent3.getContext())), null);
            xw31.F(buttonComponent3, Integer.valueOf(tje.u(8, buttonComponent3.getContext())), null, null, null);
            buttonComponent2 = buttonComponent3;
        }
        buttonComponent2.setText(dashboardEventsModalView.getContext().getString(kyh0.common_edit));
        buttonComponent2.setContentDescription(dashboardEventsModalView.getContext().getString(kyh0.common_edit));
        sigVar = dashboardEventsModalView.presenter;
        buttonComponent2.setDebounceClickListener(new Runnable() { // from class: qig
            @Override // java.lang.Runnable
            public final void run() {
                IncidentReportType incidentReportType;
                ekg ekgVar;
                int i2 = i;
                sig sigVar4 = sigVar;
                switch (i2) {
                    case 0:
                        i650 i650Var = sigVar4.F.a;
                        i650Var.a.a("navigation.reports.road_events.edit_location.click", n.u(i650Var), 1, new HashMap());
                        ((fl5) sigVar4.y.c).r(new suf(9));
                        break;
                    case 1:
                        i650 i650Var2 = sigVar4.F.a;
                        i650Var2.a.a("navigation.reports.road_events.leave_comment.click", n.u(i650Var2), 1, new HashMap());
                        xjg xjgVar = sigVar4.y;
                        wjg wjgVar = (wjg) xjgVar.b;
                        fl5 fl5Var = (fl5) xjgVar.c;
                        hpv a = ipv.a((IncidentsAvailabilityExperiment) ((ipv) fl5Var.K).a.b());
                        Uri uri = a.c;
                        if (uri != null && a.a) {
                            fl5Var.A((m950) ((yvf0) fl5Var.G).get(), new ds11(uri, new js11(wjgVar.a.getLatitude(), wjgVar.a.getLongitude())), new bb0(fl5Var, 25));
                            break;
                        }
                        break;
                    default:
                        i650 i650Var3 = sigVar4.F.a;
                        i650Var3.a.a("navigation.reports.road_events.submit_event.click", n.u(i650Var3), 1, new HashMap());
                        a aVar = sigVar4.A;
                        IncidentType incidentType = (IncidentType) aVar.b.getValue();
                        fkg fkgVar = null;
                        if (incidentType != null && (ekgVar = (ekg) aVar.c.getValue()) != null) {
                            fkgVar = new fkg(incidentType, ekgVar);
                        }
                        if (fkgVar != null) {
                            Point point = fkgVar.b.a;
                            apv apvVar = sigVar4.B;
                            gpv gpvVar = sigVar4.C;
                            IncidentType incidentType2 = fkgVar.a;
                            gpvVar.getClass();
                            int i3 = fpv.c[incidentType2.ordinal()];
                            if (i3 == 1) {
                                incidentReportType = IncidentReportType.Camera;
                            } else if (i3 == 2) {
                                incidentReportType = IncidentReportType.Police;
                            } else if (i3 == 3) {
                                incidentReportType = IncidentReportType.RoadWorks;
                            } else if (i3 != 4) {
                                w511.b();
                                break;
                            } else {
                                incidentReportType = IncidentReportType.Accident;
                            }
                            apvVar.a(incidentReportType, point);
                            ((fl5) sigVar4.y.c).r(new qu(9));
                            break;
                        }
                        break;
                }
            }
        });
        yjg yjgVar = dkgVar.c;
        ButtonComponent buttonComponent4 = access$getBinding.d;
        final int i2 = 1;
        if (yjgVar != null) {
            buttonComponent4.setText(yjgVar.a);
            buttonComponent4.setRippleColor(qje.t(xng0.controlPressed, buttonComponent4.getContext()));
            buttonComponent4.setButtonBackground(new bdc(xng0.bgTransparent));
            buttonComponent4.setButtonTitleColor(new bdc(xng0.textMain));
            buttonComponent4.setTextIcon(v2h0.ic_arrow_in_round);
            sigVar3 = dashboardEventsModalView.presenter;
            buttonComponent4.setDebounceClickListener(new Runnable() { // from class: qig
                @Override // java.lang.Runnable
                public final void run() {
                    IncidentReportType incidentReportType;
                    ekg ekgVar;
                    int i22 = i2;
                    sig sigVar4 = sigVar3;
                    switch (i22) {
                        case 0:
                            i650 i650Var = sigVar4.F.a;
                            i650Var.a.a("navigation.reports.road_events.edit_location.click", n.u(i650Var), 1, new HashMap());
                            ((fl5) sigVar4.y.c).r(new suf(9));
                            break;
                        case 1:
                            i650 i650Var2 = sigVar4.F.a;
                            i650Var2.a.a("navigation.reports.road_events.leave_comment.click", n.u(i650Var2), 1, new HashMap());
                            xjg xjgVar = sigVar4.y;
                            wjg wjgVar = (wjg) xjgVar.b;
                            fl5 fl5Var = (fl5) xjgVar.c;
                            hpv a = ipv.a((IncidentsAvailabilityExperiment) ((ipv) fl5Var.K).a.b());
                            Uri uri = a.c;
                            if (uri != null && a.a) {
                                fl5Var.A((m950) ((yvf0) fl5Var.G).get(), new ds11(uri, new js11(wjgVar.a.getLatitude(), wjgVar.a.getLongitude())), new bb0(fl5Var, 25));
                                break;
                            }
                            break;
                        default:
                            i650 i650Var3 = sigVar4.F.a;
                            i650Var3.a.a("navigation.reports.road_events.submit_event.click", n.u(i650Var3), 1, new HashMap());
                            a aVar = sigVar4.A;
                            IncidentType incidentType = (IncidentType) aVar.b.getValue();
                            fkg fkgVar = null;
                            if (incidentType != null && (ekgVar = (ekg) aVar.c.getValue()) != null) {
                                fkgVar = new fkg(incidentType, ekgVar);
                            }
                            if (fkgVar != null) {
                                Point point = fkgVar.b.a;
                                apv apvVar = sigVar4.B;
                                gpv gpvVar = sigVar4.C;
                                IncidentType incidentType2 = fkgVar.a;
                                gpvVar.getClass();
                                int i3 = fpv.c[incidentType2.ordinal()];
                                if (i3 == 1) {
                                    incidentReportType = IncidentReportType.Camera;
                                } else if (i3 == 2) {
                                    incidentReportType = IncidentReportType.Police;
                                } else if (i3 == 3) {
                                    incidentReportType = IncidentReportType.RoadWorks;
                                } else if (i3 != 4) {
                                    w511.b();
                                    break;
                                } else {
                                    incidentReportType = IncidentReportType.Accident;
                                }
                                apvVar.a(incidentReportType, point);
                                ((fl5) sigVar4.y.c).r(new qu(9));
                                break;
                            }
                            break;
                    }
                }
            });
            buttonComponent4.setVisibility(0);
        } else {
            buttonComponent4.setVisibility(8);
        }
        ckg ckgVar = dkgVar.d;
        if (ckgVar instanceof akg) {
            buttonComponent.setEnabled(false);
            buttonComponent.setText(((akg) ckgVar).a);
            buttonComponent.setButtonBackground(new bdc(xng0.controlMinor));
            buttonComponent.setButtonTitleColor(new bdc(xng0.textOnControlMinor));
            buttonComponent.setDebounceClickListener(null);
            return;
        }
        if (!(ckgVar instanceof bkg)) {
            w511.b();
            return;
        }
        buttonComponent.setEnabled(true);
        buttonComponent.setText(((bkg) ckgVar).a);
        buttonComponent.setButtonBackground(new bdc(xng0.controlMain));
        buttonComponent.setButtonTitleColor(new bdc(xng0.textOnControl));
        sigVar2 = dashboardEventsModalView.presenter;
        final int i3 = 2;
        buttonComponent.setDebounceClickListener(new Runnable() { // from class: qig
            @Override // java.lang.Runnable
            public final void run() {
                IncidentReportType incidentReportType;
                ekg ekgVar;
                int i22 = i3;
                sig sigVar4 = sigVar2;
                switch (i22) {
                    case 0:
                        i650 i650Var = sigVar4.F.a;
                        i650Var.a.a("navigation.reports.road_events.edit_location.click", n.u(i650Var), 1, new HashMap());
                        ((fl5) sigVar4.y.c).r(new suf(9));
                        break;
                    case 1:
                        i650 i650Var2 = sigVar4.F.a;
                        i650Var2.a.a("navigation.reports.road_events.leave_comment.click", n.u(i650Var2), 1, new HashMap());
                        xjg xjgVar = sigVar4.y;
                        wjg wjgVar = (wjg) xjgVar.b;
                        fl5 fl5Var = (fl5) xjgVar.c;
                        hpv a = ipv.a((IncidentsAvailabilityExperiment) ((ipv) fl5Var.K).a.b());
                        Uri uri = a.c;
                        if (uri != null && a.a) {
                            fl5Var.A((m950) ((yvf0) fl5Var.G).get(), new ds11(uri, new js11(wjgVar.a.getLatitude(), wjgVar.a.getLongitude())), new bb0(fl5Var, 25));
                            break;
                        }
                        break;
                    default:
                        i650 i650Var3 = sigVar4.F.a;
                        i650Var3.a.a("navigation.reports.road_events.submit_event.click", n.u(i650Var3), 1, new HashMap());
                        a aVar = sigVar4.A;
                        IncidentType incidentType = (IncidentType) aVar.b.getValue();
                        fkg fkgVar = null;
                        if (incidentType != null && (ekgVar = (ekg) aVar.c.getValue()) != null) {
                            fkgVar = new fkg(incidentType, ekgVar);
                        }
                        if (fkgVar != null) {
                            Point point = fkgVar.b.a;
                            apv apvVar = sigVar4.B;
                            gpv gpvVar = sigVar4.C;
                            IncidentType incidentType2 = fkgVar.a;
                            gpvVar.getClass();
                            int i32 = fpv.c[incidentType2.ordinal()];
                            if (i32 == 1) {
                                incidentReportType = IncidentReportType.Camera;
                            } else if (i32 == 2) {
                                incidentReportType = IncidentReportType.Police;
                            } else if (i32 == 3) {
                                incidentReportType = IncidentReportType.RoadWorks;
                            } else if (i32 != 4) {
                                w511.b();
                                break;
                            } else {
                                incidentReportType = IncidentReportType.Accident;
                            }
                            apvVar.a(incidentReportType, point);
                            ((fl5) sigVar4.y.c).r(new qu(9));
                            break;
                        }
                        break;
                }
            }
        });
    }
}

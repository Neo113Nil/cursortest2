package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.search.router.Origin;
import com.yandex.mapkit.geometry.Point;
import com.yandex.plus.pay.ui.common.internal.error.content.PaymentErrorButtonContent$ClickAction;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.dashboard.internal.ui.dashboard.DashboardFragment;
import com.ybsdk.feature.dashboard.internal.ui.dashboard3.DashboardV3Fragment;
import com.ybsdk.feature.divkit.api.domain.a;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.educations.api.data.EducationDivKitContentDto;
import com.ybsdk.feature.educations.api.data.EducationFullscreenContentDto;
import com.ybsdk.feature.educations.api.data.EducationGlowDto;
import com.ybsdk.feature.educations.api.data.EducationScrollBehaviourDto;
import com.ybsdk.feature.educations.api.data.EducationStepDto;
import com.ybsdk.feature.educations.api.data.EducationTooltipContentDto;
import com.ybsdk.feature.educations.api.data.EducationVideoContentDto;
import com.ybsdk.feature.educations.api.data.EducationsTooltipDto;
import com.ybsdk.feature.educations.api.data.EducationsV2Dto;
import com.ybsdk.feature.educations.api.domain.EducationsTooltipEntity$EducationsTooltipAlignment;
import com.ybsdk.feature.educations.api.domain.EducationsTooltipEntity$EducationsTooltipBehaviour;
import com.ybsdk.widgets.common.YbButtonView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes3.dex */
public final /* synthetic */ class suf implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ suf(f8h f8hVar) {
        this.a = 21;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        YbButtonView.a onViewCreated$lambda$15;
        YbButtonView.a onViewCreated$lambda$14;
        Iterator it;
        Object obj2;
        EducationsTooltipEntity$EducationsTooltipBehaviour educationsTooltipEntity$EducationsTooltipBehaviour;
        EducationsTooltipEntity$EducationsTooltipAlignment educationsTooltipEntity$EducationsTooltipAlignment;
        Object failure;
        Object failure2;
        ColorModel a;
        Object failure3;
        Object failure4;
        boolean z;
        Object failure5;
        int i = this.a;
        c530 c530Var = c530.a;
        int i2 = 0;
        DivDataDto divDataDto = null;
        int i3 = 1;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                ((acx) obj).c = true;
                break;
            case 3:
                ((Float) obj).getClass();
                break;
            case 4:
                ((Float) obj).getClass();
                break;
            case 5:
                float floatValue = ((Float) obj).floatValue();
                if (floatValue <= 0.0d) {
                    gxv.a("invalid weight; must be greater than zero");
                }
                if (floatValue > Float.MAX_VALUE) {
                    floatValue = Float.MAX_VALUE;
                }
                break;
            case 6:
                break;
            case 7:
                onViewCreated$lambda$15 = DashboardFragment.onViewCreated$lambda$15((YbButtonView.a) obj);
                break;
            case 8:
                onViewCreated$lambda$14 = DashboardFragment.onViewCreated$lambda$14((YbButtonView.a) obj);
                break;
            case 9:
                jpv jpvVar = (jpv) obj;
                y4c0 y4c0Var = jpvVar.b;
                wjg wjgVar = jpvVar.a;
                int i4 = kyh0.navigator_specify_point_on_map;
                PointType pointType = PointType.DESTINATION;
                Origin origin = Origin.NAVIGATOR;
                Address address = wjgVar.b;
                pv0 pv0Var = address != null ? new pv0(address, null, null, null, null, null, null, null, 1022) : null;
                Point point = wjgVar.a;
                y4c0Var.E((m950) ((h4g) y4c0Var.H).get(), new m41(i4, "navigator", pointType, origin, pv0Var, new zzs(point.getLatitude(), point.getLongitude(), 0, null, null, 28), true, false, new l41(v2h0.ic_event_traffic_sign, f1h0.ic_error_pin_24, mqg0.component_gray_550, mqg0.component_white), null, null, 523264), new kpv(y4c0Var, wjgVar, i2), hxx.a);
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    EducationsV2Dto educationsV2Dto = (EducationsV2Dto) it2.next();
                    a aVar = new a(divDataDto);
                    String name = educationsV2Dto.getName();
                    String eventId = educationsV2Dto.getEventId();
                    String defaultsGroup = educationsV2Dto.getDefaultsGroup();
                    List<EducationStepDto> steps = educationsV2Dto.getSteps();
                    ArrayList arrayList2 = new ArrayList();
                    for (EducationStepDto educationStepDto : steps) {
                        int i5 = epn.a[educationStepDto.getContentType().ordinal()];
                        if (i5 != i3) {
                            if (i5 == 2) {
                                EducationDivKitContentDto divkitContent = educationStepDto.getDivkitContent();
                                if (divkitContent != null) {
                                    boolean showCross = educationStepDto.getShowCross();
                                    hpn c = com.ybsdk.feature.educations.api.a.c(divkitContent.getShadow());
                                    mon a2 = com.ybsdk.feature.educations.api.a.a(divkitContent.getPosition());
                                    try {
                                        failure2 = aVar.a(divkitContent.getDivkitData());
                                    } catch (Throwable th) {
                                        failure2 = new Result.Failure(th);
                                    }
                                    boolean z2 = failure2 instanceof Result.Failure;
                                    Object obj3 = failure2;
                                    if (z2) {
                                        obj3 = divDataDto;
                                    }
                                    rr51 rr51Var = (rr51) obj3;
                                    EducationGlowDto glow = divkitContent.getGlow();
                                    a = lvy0.a(glow.getColor(), new ColorModel.Attr(ung0.ybColor_fill_color8_300), new xvq(29));
                                    non nonVar = new non(kp50.r(glow.getRadius()), a);
                                    EducationScrollBehaviourDto scrollBehaviour = divkitContent.getScrollBehaviour();
                                    obj2 = new son(showCross, c, a2, rr51Var, nonVar, scrollBehaviour != null ? com.ybsdk.feature.educations.api.a.b(scrollBehaviour) : null);
                                } else {
                                    obj2 = null;
                                }
                            } else if (i5 == 3) {
                                EducationFullscreenContentDto fullscreenContent = educationStepDto.getFullscreenContent();
                                if (fullscreenContent != null) {
                                    boolean showCross2 = educationStepDto.getShowCross();
                                    try {
                                        failure3 = aVar.a(fullscreenContent.getDivkitData());
                                    } catch (Throwable th2) {
                                        failure3 = new Result.Failure(th2);
                                    }
                                    boolean z3 = failure3 instanceof Result.Failure;
                                    Object obj4 = failure3;
                                    if (z3) {
                                        obj4 = divDataDto;
                                    }
                                    obj2 = new ton((rr51) obj4, showCross2);
                                }
                                obj2 = divDataDto;
                            } else if (i5 != 4) {
                                w511.b();
                                break;
                            } else {
                                EducationVideoContentDto videoContent = educationStepDto.getVideoContent();
                                if (videoContent != null) {
                                    boolean showCross3 = educationStepDto.getShowCross();
                                    String url = videoContent.getUrl();
                                    try {
                                        failure4 = aVar.a(videoContent.getDivkitData());
                                    } catch (Throwable th3) {
                                        failure4 = new Result.Failure(th3);
                                    }
                                    boolean z4 = failure4 instanceof Result.Failure;
                                    Object obj5 = failure4;
                                    if (z4) {
                                        obj5 = divDataDto;
                                    }
                                    obj2 = new von(showCross3, url, (rr51) obj5);
                                }
                                obj2 = divDataDto;
                            }
                            it = it2;
                        } else {
                            EducationTooltipContentDto tooltipContent = educationStepDto.getTooltipContent();
                            if (tooltipContent != null) {
                                boolean showCross4 = educationStepDto.getShowCross();
                                hpn c2 = com.ybsdk.feature.educations.api.a.c(tooltipContent.getShadow());
                                EducationsTooltipDto tooltip = tooltipContent.getTooltip();
                                ipn ipnVar = new ipn(tooltip.getAnchor().getViewId());
                                int i6 = epn.d[tooltip.getBehaviour().ordinal()];
                                it = it2;
                                if (i6 == 1) {
                                    educationsTooltipEntity$EducationsTooltipBehaviour = EducationsTooltipEntity$EducationsTooltipBehaviour.ABOVE_ANCHOR;
                                } else if (i6 != 2) {
                                    w511.b();
                                    break;
                                } else {
                                    educationsTooltipEntity$EducationsTooltipBehaviour = EducationsTooltipEntity$EducationsTooltipBehaviour.UNDER_ANCHOR;
                                }
                                EducationsTooltipEntity$EducationsTooltipBehaviour educationsTooltipEntity$EducationsTooltipBehaviour2 = educationsTooltipEntity$EducationsTooltipBehaviour;
                                int i7 = epn.e[tooltip.getAlignment().ordinal()];
                                if (i7 == 1) {
                                    educationsTooltipEntity$EducationsTooltipAlignment = EducationsTooltipEntity$EducationsTooltipAlignment.TOP;
                                } else if (i7 != 2) {
                                    w511.b();
                                    break;
                                } else {
                                    educationsTooltipEntity$EducationsTooltipAlignment = EducationsTooltipEntity$EducationsTooltipAlignment.BOTTOM;
                                }
                                EducationsTooltipEntity$EducationsTooltipAlignment educationsTooltipEntity$EducationsTooltipAlignment2 = educationsTooltipEntity$EducationsTooltipAlignment;
                                try {
                                    failure = aVar.a(tooltip.getDivkitData());
                                } catch (Throwable th4) {
                                    failure = new Result.Failure(th4);
                                }
                                if (failure instanceof Result.Failure) {
                                    failure = null;
                                }
                                jpn jpnVar = new jpn(ipnVar, educationsTooltipEntity$EducationsTooltipBehaviour2, educationsTooltipEntity$EducationsTooltipAlignment2, (rr51) failure, tooltip.getMargin());
                                EducationScrollBehaviourDto scrollBehaviour2 = tooltipContent.getScrollBehaviour();
                                obj2 = new uon(showCross4, c2, jpnVar, scrollBehaviour2 != null ? com.ybsdk.feature.educations.api.a.b(scrollBehaviour2) : null);
                            } else {
                                it = it2;
                                obj2 = null;
                            }
                        }
                        if (obj2 != null) {
                            arrayList2.add(obj2);
                        }
                        it2 = it;
                        divDataDto = null;
                        i3 = 1;
                    }
                    arrayList.add(new kpn(name, eventId, defaultsGroup, arrayList2, educationsV2Dto.getShowingDelay()));
                    divDataDto = null;
                    i3 = 1;
                }
                break;
            case 13:
                z = DashboardV3Fragment.toolbarButtonsMarginDecorator_delegate$lambda$11$lambda$10(((Integer) obj).intValue());
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                try {
                    failure5 = Class.forName((String) obj);
                } catch (Throwable th5) {
                    failure5 = new Result.Failure(th5);
                }
                break;
            case 22:
                acx acxVar = (acx) obj;
                acxVar.c = true;
                acxVar.a = true;
                break;
            case 23:
                List list2 = (List) obj;
                break;
            case 24:
                qz90 qz90Var = (qz90) obj;
                qz90Var.e(zyh0.PlusPay_Error_TimeoutNoSuccess_Title);
                qz90Var.d(zyh0.PlusPay_Error_TimeoutNoSuccess_Subtitle);
                qz90Var.a(PaymentErrorButtonContent$ClickAction.RETRY);
                qz90Var.b("P015");
                break;
            case 25:
                qz90 qz90Var2 = (qz90) obj;
                qz90Var2.e(zyh0.PlusPay_Error_ExpiredCard_Title);
                qz90Var2.d(zyh0.PlusPay_Error_ExpiredCard_Subtitle);
                qz90Var2.a(PaymentErrorButtonContent$ClickAction.CHANGE_PAYMENT_METHOD);
                qz90Var2.b("P006");
                break;
            case 26:
                qz90 qz90Var3 = (qz90) obj;
                qz90Var3.e(zyh0.PlusPay_Error_Fail3ds_Title);
                qz90Var3.d(zyh0.PlusPay_Error_Fail3ds_Subtitle);
                qz90Var3.a(PaymentErrorButtonContent$ClickAction.RETRY);
                qz90Var3.b("P004");
                break;
            case 27:
                qz90 qz90Var4 = (qz90) obj;
                qz90Var4.e(zyh0.PlusPay_Error_OperationCancelled_Title);
                qz90Var4.d(zyh0.PlusPay_Error_OperationCancelled_Subtitle);
                qz90Var4.a(PaymentErrorButtonContent$ClickAction.RETRY);
                qz90Var4.a(PaymentErrorButtonContent$ClickAction.CHANGE_PAYMENT_METHOD);
                qz90Var4.b("P012");
                break;
            case 28:
                qz90 qz90Var5 = (qz90) obj;
                qz90Var5.e(zyh0.PlusPay_Error_Unknown_Title);
                qz90Var5.d(zyh0.PlusPay_Error_Unknown_Subtitle);
                qz90Var5.a(PaymentErrorButtonContent$ClickAction.RETRY);
                qz90Var5.b("P000");
                break;
            default:
                qz90 qz90Var6 = (qz90) obj;
                qz90Var6.e(zyh0.PlusPay_Error_UserCancelled_Title);
                qz90Var6.d(zyh0.PlusPay_Error_UserCancelled_Subtitle);
                qz90Var6.a(PaymentErrorButtonContent$ClickAction.RETRY);
                qz90Var6.b("P007");
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ suf(int i) {
        this.a = i;
    }
}

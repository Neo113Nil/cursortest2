package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.address.models.Address;
import com.yandex.go.due.experiment.EarlyOptionConfigExperiment;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityCommentSuggestSelectorDto;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardActionDto;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardBannerDto;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardButtonsDataDto$Button;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardButtonsDataDto$ButtonAction;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardButtonsDataDto$ButtonStyle;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardButtonsDataDto$ButtonType;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardButtonsDto;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardHeaderDto;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardPopupsDto;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto$AddressSelectorSectionDtoIntercity;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto$CarouselSectionDtoIntercity;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto$CommentSelectorSectionDtoIntercity;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto$DueSelectorSectionDtoIntercity;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto$PreorderDueViewOverrideParam;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto$PreorderDueViewParams;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionShowRule$SelectedTariffShowRule;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionTypeDto;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.SimpleIntercityDashboardButtonsDto;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.i0;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.l;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.l0;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.dashboard.IntercityDashboardResponseDto;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.state.IntercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle;
import com.yandex.go.zone.dto.objects.BulletsOrderPopup;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.sequences.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class zhw {
    public final wrr a;
    public final siw b;
    public final ibw c;

    public zhw(wrr wrrVar, siw siwVar, ibw ibwVar) {
        this.a = wrrVar;
        this.b = siwVar;
        this.c = ibwVar;
    }

    public static BulletsOrderPopup a(IntercityDashboardPopupsDto intercityDashboardPopupsDto, String str) {
        Object obj = null;
        if (str == null) {
            return null;
        }
        List list = intercityDashboardPopupsDto.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof BulletsOrderPopup) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (jl40.l(((BulletsOrderPopup) next).f.a, str)) {
                obj = next;
                break;
            }
        }
        return (BulletsOrderPopup) obj;
    }

    public static ziw c(IntercityDashboardSectionDto$AddressSelectorSectionDtoIntercity.PlaceholderPoint placeholderPoint) {
        String str = placeholderPoint != null ? placeholderPoint.f : null;
        String str2 = str == null ? "" : str;
        String str3 = placeholderPoint != null ? placeholderPoint.c : null;
        String str4 = str3 == null ? "" : str3;
        String str5 = placeholderPoint != null ? placeholderPoint.e : null;
        String str6 = str5 == null ? "" : str5;
        String str7 = placeholderPoint != null ? placeholderPoint.d : null;
        return new ziw(str2, str4, "", str7 == null ? "" : str7, str6);
    }

    public static ziw d(IntercityDashboardSectionDto$AddressSelectorSectionDtoIntercity.PlaceholderPoint placeholderPoint, tgw tgwVar) {
        String str;
        String str2;
        if (tgwVar instanceof sgw) {
            Address address = ((sgw) tgwVar).a;
            str = q5z.F(address);
            String q0 = address.q0();
            if (q0 == null) {
                q0 = "";
            }
            str2 = q0;
        } else {
            String str3 = placeholderPoint != null ? placeholderPoint.c : null;
            str = str3 == null ? "" : str3;
            str2 = "";
        }
        String str4 = str;
        String str5 = placeholderPoint != null ? placeholderPoint.f : null;
        String str6 = str5 == null ? "" : str5;
        String str7 = placeholderPoint != null ? placeholderPoint.e : null;
        String str8 = str7 == null ? "" : str7;
        String str9 = placeholderPoint != null ? placeholderPoint.d : null;
        return new ziw(str6, str4, str2, str9 == null ? "" : str9, str8);
    }

    public static faw e(IntercityDashboardActionDto intercityDashboardActionDto, IntercityDashboardPopupsDto intercityDashboardPopupsDto) {
        IntercityDashboardActionDto.ActionType actionType = intercityDashboardActionDto != null ? intercityDashboardActionDto.a : null;
        switch (actionType == null ? -1 : yhw.d[actionType.ordinal()]) {
            case -1:
            case 6:
                return caw.a;
            case 0:
            default:
                w511.b();
                return null;
            case 1:
                Calendar calendar = intercityDashboardActionDto.b;
                if (calendar != null) {
                    return new baw(wf7.c(calendar, TimeZone.getDefault()));
                }
                ny61.g("Required value was null.");
                return null;
            case 2:
                String str = intercityDashboardActionDto.d;
                if (str == null) {
                    ny61.g("Required value was null.");
                    return null;
                }
                String str2 = intercityDashboardActionDto.c;
                if (str2 != null) {
                    return new aaw(str, str2, intercityDashboardActionDto.e);
                }
                ny61.g("Required value was null.");
                return null;
            case 3:
                String str3 = intercityDashboardActionDto.f;
                if (str3 != null) {
                    return new z9w(str3);
                }
                ny61.g("Required value was null.");
                return null;
            case 4:
                return new daw(a(intercityDashboardPopupsDto, intercityDashboardActionDto.h));
            case 5:
                String str4 = intercityDashboardActionDto.g;
                if (str4 != null) {
                    return new eaw(str4);
                }
                ny61.g("Required value was null.");
                return null;
        }
    }

    public static xy40 f(List list, IntercityDashboardPopupsDto intercityDashboardPopupsDto, IntercityDashboardSectionTypeDto intercityDashboardSectionTypeDto) {
        xy40 xy40Var = new xy40(list.size());
        s5r s5rVar = new s5r(b.g(new h73(1, list), new xhw(intercityDashboardSectionTypeDto, 1)));
        while (s5rVar.hasNext()) {
            IntercityDashboardBannerDto intercityDashboardBannerDto = (IntercityDashboardBannerDto) s5rVar.next();
            String str = intercityDashboardBannerDto.b;
            String str2 = intercityDashboardBannerDto.c;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = intercityDashboardBannerDto.d;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = intercityDashboardBannerDto.g;
            if (str4 == null) {
                str4 = "";
            }
            faw e = e(intercityDashboardBannerDto.h, intercityDashboardPopupsDto);
            kotlinx.serialization.json.b bVar = intercityDashboardBannerDto.i;
            xy40Var.g(new gaw(str, str2, str3, str4, e, bVar != null ? bVar.toString() : null));
        }
        return xy40Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static vaw g(IntercityDashboardButtonsDataDto$Button intercityDashboardButtonsDataDto$Button, String str, String str2) {
        IntercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle intercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle;
        IntercityDashboardButtonsDataDto$ButtonType intercityDashboardButtonsDataDto$ButtonType;
        taw tawVar;
        taw mawVar;
        String str3;
        if (intercityDashboardButtonsDataDto$Button == null) {
            return vaw.g;
        }
        IntercityDashboardButtonsDataDto$ButtonAction intercityDashboardButtonsDataDto$ButtonAction = intercityDashboardButtonsDataDto$Button.d;
        String str4 = intercityDashboardButtonsDataDto$Button.a;
        String str5 = intercityDashboardButtonsDataDto$Button.b;
        IntercityDashboardButtonsDataDto$ButtonStyle intercityDashboardButtonsDataDto$ButtonStyle = intercityDashboardButtonsDataDto$Button.c;
        int i = intercityDashboardButtonsDataDto$ButtonStyle == null ? -1 : yhw.b[intercityDashboardButtonsDataDto$ButtonStyle.ordinal()];
        if (i != -1) {
            if (i == 1) {
                intercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle = IntercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle.MAIN;
            } else if (i == 2) {
                intercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle = IntercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle.MINOR;
            } else if (i != 3) {
                w511.b();
                return null;
            }
            if (intercityDashboardButtonsDataDto$ButtonAction == null) {
                String str6 = intercityDashboardButtonsDataDto$ButtonAction.a;
                switch (str6.hashCode()) {
                    case -1903741957:
                        if (str6.equals("show_flex")) {
                            intercityDashboardButtonsDataDto$ButtonType = IntercityDashboardButtonsDataDto$ButtonType.SHOW_FLEX_SCREEN;
                            break;
                        }
                        intercityDashboardButtonsDataDto$ButtonType = IntercityDashboardButtonsDataDto$ButtonType.UNSUPPORTED;
                        break;
                    case -1655632847:
                        if (str6.equals("select_due")) {
                            intercityDashboardButtonsDataDto$ButtonType = IntercityDashboardButtonsDataDto$ButtonType.SELECT_DUE;
                            break;
                        }
                        intercityDashboardButtonsDataDto$ButtonType = IntercityDashboardButtonsDataDto$ButtonType.UNSUPPORTED;
                        break;
                    case -1350681269:
                        if (str6.equals("select_destination")) {
                            intercityDashboardButtonsDataDto$ButtonType = IntercityDashboardButtonsDataDto$ButtonType.SELECT_DESTINATION;
                            break;
                        }
                        intercityDashboardButtonsDataDto$ButtonType = IntercityDashboardButtonsDataDto$ButtonType.UNSUPPORTED;
                        break;
                    case -1347726272:
                        if (str6.equals("taxi_order_flow")) {
                            intercityDashboardButtonsDataDto$ButtonType = IntercityDashboardButtonsDataDto$ButtonType.TAXI_ORDER_FLOW;
                            break;
                        }
                        intercityDashboardButtonsDataDto$ButtonType = IntercityDashboardButtonsDataDto$ButtonType.UNSUPPORTED;
                        break;
                    case -1140279261:
                        if (str6.equals("select_starting")) {
                            intercityDashboardButtonsDataDto$ButtonType = IntercityDashboardButtonsDataDto$ButtonType.SELECT_STARTING;
                            break;
                        }
                        intercityDashboardButtonsDataDto$ButtonType = IntercityDashboardButtonsDataDto$ButtonType.UNSUPPORTED;
                        break;
                    case 629233382:
                        if (str6.equals(Constants.DEEPLINK)) {
                            intercityDashboardButtonsDataDto$ButtonType = IntercityDashboardButtonsDataDto$ButtonType.DEEPLINK;
                            break;
                        }
                        intercityDashboardButtonsDataDto$ButtonType = IntercityDashboardButtonsDataDto$ButtonType.UNSUPPORTED;
                        break;
                    case 2032198954:
                        if (str6.equals("confirm_preorder")) {
                            intercityDashboardButtonsDataDto$ButtonType = IntercityDashboardButtonsDataDto$ButtonType.CONFIRM_PREORDER;
                            break;
                        }
                        intercityDashboardButtonsDataDto$ButtonType = IntercityDashboardButtonsDataDto$ButtonType.UNSUPPORTED;
                        break;
                    default:
                        intercityDashboardButtonsDataDto$ButtonType = IntercityDashboardButtonsDataDto$ButtonType.UNSUPPORTED;
                        break;
                }
            } else {
                intercityDashboardButtonsDataDto$ButtonType = null;
            }
            switch (intercityDashboardButtonsDataDto$ButtonType != null ? yhw.c[intercityDashboardButtonsDataDto$ButtonType.ordinal()] : -1) {
                case -1:
                case 8:
                    tawVar = saw.a;
                    str3 = intercityDashboardButtonsDataDto$ButtonAction == null ? intercityDashboardButtonsDataDto$ButtonAction.a : null;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str7 = intercityDashboardButtonsDataDto$ButtonAction == null ? intercityDashboardButtonsDataDto$ButtonAction.b : null;
                    return new vaw(str4, str5, intercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle, tawVar, new uaw(str, str2, str3, str7 != null ? str7 : ""), intercityDashboardButtonsDataDto$Button.e);
                case 0:
                default:
                    w511.b();
                    return null;
                case 1:
                    tawVar = law.a;
                    if (intercityDashboardButtonsDataDto$ButtonAction == null) {
                    }
                    if (str3 == null) {
                    }
                    if (intercityDashboardButtonsDataDto$ButtonAction == null) {
                    }
                    return new vaw(str4, str5, intercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle, tawVar, new uaw(str, str2, str3, str7 != null ? str7 : ""), intercityDashboardButtonsDataDto$Button.e);
                case 2:
                    tawVar = oaw.a;
                    if (intercityDashboardButtonsDataDto$ButtonAction == null) {
                    }
                    if (str3 == null) {
                    }
                    if (intercityDashboardButtonsDataDto$ButtonAction == null) {
                    }
                    return new vaw(str4, str5, intercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle, tawVar, new uaw(str, str2, str3, str7 != null ? str7 : ""), intercityDashboardButtonsDataDto$Button.e);
                case 3:
                    tawVar = paw.a;
                    if (intercityDashboardButtonsDataDto$ButtonAction == null) {
                    }
                    if (str3 == null) {
                    }
                    if (intercityDashboardButtonsDataDto$ButtonAction == null) {
                    }
                    return new vaw(str4, str5, intercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle, tawVar, new uaw(str, str2, str3, str7 != null ? str7 : ""), intercityDashboardButtonsDataDto$Button.e);
                case 4:
                    tawVar = qaw.a;
                    if (intercityDashboardButtonsDataDto$ButtonAction == null) {
                    }
                    if (str3 == null) {
                    }
                    if (intercityDashboardButtonsDataDto$ButtonAction == null) {
                    }
                    return new vaw(str4, str5, intercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle, tawVar, new uaw(str, str2, str3, str7 != null ? str7 : ""), intercityDashboardButtonsDataDto$Button.e);
                case 5:
                    String str8 = intercityDashboardButtonsDataDto$ButtonAction.b;
                    if (str8 == null) {
                        ny61.g("Required value was null.");
                        return null;
                    }
                    mawVar = new maw(str8);
                    tawVar = mawVar;
                    if (intercityDashboardButtonsDataDto$ButtonAction == null) {
                    }
                    if (str3 == null) {
                    }
                    if (intercityDashboardButtonsDataDto$ButtonAction == null) {
                    }
                    return new vaw(str4, str5, intercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle, tawVar, new uaw(str, str2, str3, str7 != null ? str7 : ""), intercityDashboardButtonsDataDto$Button.e);
                case 6:
                    String str9 = intercityDashboardButtonsDataDto$ButtonAction.c;
                    if (str9 == null) {
                        ny61.g("Required value was null.");
                        return null;
                    }
                    mawVar = new naw(str9);
                    tawVar = mawVar;
                    if (intercityDashboardButtonsDataDto$ButtonAction == null) {
                    }
                    if (str3 == null) {
                    }
                    if (intercityDashboardButtonsDataDto$ButtonAction == null) {
                    }
                    return new vaw(str4, str5, intercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle, tawVar, new uaw(str, str2, str3, str7 != null ? str7 : ""), intercityDashboardButtonsDataDto$Button.e);
                case 7:
                    tawVar = raw.a;
                    if (intercityDashboardButtonsDataDto$ButtonAction == null) {
                    }
                    if (str3 == null) {
                    }
                    if (intercityDashboardButtonsDataDto$ButtonAction == null) {
                    }
                    return new vaw(str4, str5, intercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle, tawVar, new uaw(str, str2, str3, str7 != null ? str7 : ""), intercityDashboardButtonsDataDto$Button.e);
            }
        }
        intercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle = IntercityDashboardButtons$IntercityDashboardButton$DashboardButtonStyle.UNSUPPORTED;
        if (intercityDashboardButtonsDataDto$ButtonAction == null) {
        }
        switch (intercityDashboardButtonsDataDto$ButtonType != null ? yhw.c[intercityDashboardButtonsDataDto$ButtonType.ordinal()] : -1) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:197:0x0380, code lost:
    
        if (r3 < r15) goto L205;
     */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0393  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final jlw b(yfw yfwVar) {
        Object obj;
        List list;
        Calendar calendar;
        List list2;
        int i;
        String str;
        yew yewVar;
        String str2;
        String str3;
        xfw xfwVar;
        List list3;
        xy40 xy40Var;
        IntercityDashboardPopupsDto intercityDashboardPopupsDto;
        ugw ugwVar;
        Object obj2;
        Object cjwVar;
        IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity.SeatsSelectorTariffRule seatsSelectorTariffRule;
        int intValue;
        fjw fjwVar;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Map f;
        Map f2;
        IntercityDashboardPopupsDto intercityDashboardPopupsDto2;
        hz40 hz40Var;
        String str10;
        IntercityDashboardResponseDto intercityDashboardResponseDto = yfwVar.c;
        if (intercityDashboardResponseDto == null) {
            return ilw.a;
        }
        List list4 = intercityDashboardResponseDto.d;
        Iterator it = list4.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((i0) obj) instanceof IntercityDashboardSectionDto$CommentSelectorSectionDtoIntercity) {
                break;
            }
        }
        if (!(obj instanceof IntercityDashboardSectionDto$CommentSelectorSectionDtoIntercity)) {
            obj = null;
        }
        IntercityDashboardSectionDto$CommentSelectorSectionDtoIntercity intercityDashboardSectionDto$CommentSelectorSectionDtoIntercity = (IntercityDashboardSectionDto$CommentSelectorSectionDtoIntercity) obj;
        l lVar = intercityDashboardSectionDto$CommentSelectorSectionDtoIntercity != null ? intercityDashboardSectionDto$CommentSelectorSectionDtoIntercity.b : null;
        xfw xfwVar2 = yfwVar.a;
        String str11 = (xfwVar2 == null || (str10 = xfwVar2.a) == null) ? null : str10;
        IntercityDashboardHeaderDto intercityDashboardHeaderDto = intercityDashboardResponseDto.c;
        String str12 = intercityDashboardResponseDto.b;
        String str13 = intercityDashboardResponseDto.a;
        IntercityDashboardPopupsDto intercityDashboardPopupsDto3 = intercityDashboardResponseDto.g;
        List list5 = intercityDashboardResponseDto.e;
        String str14 = intercityDashboardHeaderDto != null ? intercityDashboardHeaderDto.a : null;
        String str15 = "";
        if (str14 == null) {
            str14 = "";
        }
        String str16 = intercityDashboardHeaderDto != null ? intercityDashboardHeaderDto.b : null;
        if (str16 == null) {
            str16 = "";
        }
        yew yewVar2 = new yew(str14, str16, f(list5, intercityDashboardPopupsDto3, IntercityDashboardSectionTypeDto.HEADER));
        ugw ugwVar2 = yfwVar.d;
        List list6 = intercityDashboardResponseDto.e;
        IntercityDashboardPopupsDto intercityDashboardPopupsDto4 = intercityDashboardResponseDto.g;
        xfw xfwVar3 = yfwVar.a;
        Calendar calendar2 = yfwVar.e;
        Integer num = yfwVar.j;
        String str17 = yfwVar.f;
        IntercityCommentSuggestSelectorDto intercityCommentSuggestSelectorDto = lVar instanceof IntercityCommentSuggestSelectorDto ? (IntercityCommentSuggestSelectorDto) lVar : null;
        List list7 = intercityCommentSuggestSelectorDto != null ? intercityCommentSuggestSelectorDto.a : null;
        xy40 xy40Var2 = new xy40(list4.size());
        int size = list4.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = size;
            i0 i0Var = (i0) list4.get(i2);
            xy40 xy40Var3 = xy40Var2;
            if (i0Var instanceof IntercityDashboardSectionDto$AddressSelectorSectionDtoIntercity) {
                IntercityDashboardSectionDto$AddressSelectorSectionDtoIntercity intercityDashboardSectionDto$AddressSelectorSectionDtoIntercity = (IntercityDashboardSectionDto$AddressSelectorSectionDtoIntercity) i0Var;
                IntercityDashboardSectionDto$AddressSelectorSectionDtoIntercity.Placeholders placeholders = intercityDashboardSectionDto$AddressSelectorSectionDtoIntercity.b;
                calendar = calendar2;
                IntercityDashboardSectionDto$AddressSelectorSectionDtoIntercity.PlaceholderPoint placeholderPoint = placeholders != null ? placeholders.a : null;
                IntercityDashboardSectionDto$AddressSelectorSectionDtoIntercity.PlaceholderPoint placeholderPoint2 = placeholders != null ? placeholders.b : null;
                list2 = list4;
                i = i2;
                str = str11;
                ajw ajwVar = new ajw(d(placeholderPoint, ugwVar2 != null ? ugwVar2.a : null), d(placeholderPoint2, ugwVar2 != null ? ugwVar2.b : null));
                String str18 = intercityDashboardSectionDto$AddressSelectorSectionDtoIntercity.a;
                xy40 f3 = f(list6, intercityDashboardPopupsDto4, IntercityDashboardSectionTypeDto.ADDRESS_SELECTOR);
                if (placeholderPoint == null || (f = placeholderPoint.g) == null) {
                    f = kotlin.collections.b.f();
                }
                if (placeholderPoint2 == null || (f2 = placeholderPoint2.g) == null) {
                    f2 = kotlin.collections.b.f();
                }
                if (f.isEmpty() && f2.isEmpty()) {
                    hz40Var = cmm0.b;
                    list = list6;
                    intercityDashboardPopupsDto2 = intercityDashboardPopupsDto4;
                    yewVar = yewVar2;
                    str2 = str15;
                } else {
                    list = list6;
                    intercityDashboardPopupsDto2 = intercityDashboardPopupsDto4;
                    LinkedHashSet h = v4r0.h(f.keySet(), f2.keySet());
                    yewVar = yewVar2;
                    int d = gw00.d(tcc.n(h, 10));
                    if (d < 16) {
                        d = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                    Iterator it2 = h.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        Iterator it3 = it2;
                        String str19 = (String) next;
                        linkedHashMap.put(next, new Pair(f.get(str19), f2.get(str19)));
                        it2 = it3;
                        str15 = str15;
                        f2 = f2;
                    }
                    str2 = str15;
                    hz40Var = new hz40(linkedHashMap.size());
                    linkedHashMap.forEach(new th5(9, new s0v(4, hz40Var, this)));
                }
                bjw bjwVar = new bjw(str18, ajwVar, f3, hz40Var);
                str3 = str17;
                obj2 = bjwVar;
                xfwVar = xfwVar3;
                list3 = list7;
                xy40Var = xy40Var3;
                intercityDashboardPopupsDto = intercityDashboardPopupsDto2;
                ugwVar = ugwVar2;
            } else {
                list = list6;
                IntercityDashboardPopupsDto intercityDashboardPopupsDto5 = intercityDashboardPopupsDto4;
                calendar = calendar2;
                list2 = list4;
                i = i2;
                str = str11;
                yewVar = yewVar2;
                str2 = str15;
                if (i0Var instanceof IntercityDashboardSectionDto$DueSelectorSectionDtoIntercity) {
                    str3 = str17;
                    xfwVar = xfwVar3;
                    list3 = list7;
                    xy40Var = xy40Var3;
                    intercityDashboardPopupsDto = intercityDashboardPopupsDto5;
                    obj2 = h((IntercityDashboardSectionDto$DueSelectorSectionDtoIntercity) i0Var, intercityDashboardPopupsDto, list, xfwVar, calendar);
                    ugwVar = ugwVar2;
                } else {
                    str3 = str17;
                    xfwVar = xfwVar3;
                    list3 = list7;
                    xy40Var = xy40Var3;
                    intercityDashboardPopupsDto = intercityDashboardPopupsDto5;
                    if (i0Var instanceof IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity) {
                        IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity intercityDashboardSectionDto$TariffSelectorSectionDtoIntercity = (IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity) i0Var;
                        String str20 = intercityDashboardSectionDto$TariffSelectorSectionDtoIntercity.b;
                        List list8 = intercityDashboardSectionDto$TariffSelectorSectionDtoIntercity.a;
                        if (!list8.isEmpty()) {
                            str20 = null;
                        }
                        if (str20 == null) {
                            str20 = str2;
                        }
                        List list9 = list8;
                        list = list;
                        calendar = calendar;
                        ArrayList arrayList = new ArrayList(tcc.n(list9, 10));
                        Iterator it4 = list9.iterator();
                        while (it4.hasNext()) {
                            IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity.SelectorItemDto selectorItemDto = (IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity.SelectorItemDto) it4.next();
                            Iterator it5 = it4;
                            String str21 = selectorItemDto.a;
                            String str22 = selectorItemDto.b;
                            Boolean bool = selectorItemDto.c;
                            boolean z = bool == null || !bool.booleanValue();
                            ugw ugwVar3 = ugwVar2;
                            boolean l = jl40.l(xfwVar != null ? xfwVar.a : null, selectorItemDto.a);
                            IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity.SelectorItemDto.SelectorItemState selectorItemState = selectorItemDto.d;
                            String str23 = selectorItemState.b;
                            String str24 = selectorItemState.c;
                            String str25 = str24 == null ? str2 : str24;
                            String str26 = intercityDashboardSectionDto$TariffSelectorSectionDtoIntercity.c.b;
                            String str27 = str26 == null ? str2 : str26;
                            String str28 = selectorItemState.a;
                            l76 l76Var = l76.F;
                            okw okwVar = new okw(str23, str25, str27, str28, l76Var);
                            IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity intercityDashboardSectionDto$TariffSelectorSectionDtoIntercity2 = intercityDashboardSectionDto$TariffSelectorSectionDtoIntercity;
                            IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity.SelectorItemDto.OptionalSelectorItemState optionalSelectorItemState = selectorItemDto.e;
                            okw okwVar2 = new okw((optionalSelectorItemState == null || (str9 = optionalSelectorItemState.b) == null) ? str23 : str9, (optionalSelectorItemState == null || (str8 = optionalSelectorItemState.c) == null) ? str24 == null ? str2 : str24 : str8, str26 == null ? str2 : str26, (optionalSelectorItemState == null || (str7 = optionalSelectorItemState.a) == null) ? str28 : str7, l76Var);
                            IntercityDashboardSectionDto$TariffSelectorSectionDtoIntercity.SelectorItemDto.OptionalSelectorItemState optionalSelectorItemState2 = selectorItemDto.f;
                            arrayList.add(new pkw(str21, str22, l, z, okwVar, okwVar2, new okw((optionalSelectorItemState2 == null || (str6 = optionalSelectorItemState2.b) == null) ? str23 : str6, (optionalSelectorItemState2 == null || (str5 = optionalSelectorItemState2.c) == null) ? str24 == null ? str2 : str24 : str5, str26 == null ? str2 : str26, (optionalSelectorItemState2 == null || (str4 = optionalSelectorItemState2.a) == null) ? str28 : str4, l76Var)));
                            it4 = it5;
                            ugwVar2 = ugwVar3;
                            intercityDashboardSectionDto$TariffSelectorSectionDtoIntercity = intercityDashboardSectionDto$TariffSelectorSectionDtoIntercity2;
                        }
                        ugwVar = ugwVar2;
                        obj2 = new gjw(str20, arrayList);
                    } else {
                        list = list;
                        calendar = calendar;
                        ugwVar = ugwVar2;
                        if (i0Var instanceof IntercityDashboardSectionDto$CarouselSectionDtoIntercity) {
                            List s = b.s(new yw01(b.g(new h73(1, list), new xhw(IntercityDashboardSectionTypeDto.CAROUSEL, 0)), new mgu(13, this, intercityDashboardPopupsDto)));
                            cjwVar = !s.isEmpty() ? new ejw(s) : null;
                        } else if (i0Var instanceof IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity) {
                            IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity intercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity = (IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity) i0Var;
                            l0 l0Var = intercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity.c;
                            String str29 = xfwVar != null ? xfwVar.a : null;
                            if (l0Var == null || ((l0Var instanceof IntercityDashboardSectionShowRule$SelectedTariffShowRule) && a.G(((IntercityDashboardSectionShowRule$SelectedTariffShowRule) l0Var).a, str29))) {
                                this.b.getClass();
                                if (xfwVar != null && (seatsSelectorTariffRule = (IntercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity.SeatsSelectorTariffRule) intercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity.b.get(xfwVar.a)) != null) {
                                    int i4 = seatsSelectorTariffRule.c;
                                    int i5 = seatsSelectorTariffRule.b;
                                    if (num != null) {
                                        intValue = num.intValue();
                                        if (intValue > i4) {
                                            intValue = i4;
                                        }
                                        fjwVar = new fjw(intercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity.a, intValue, intValue < i4, intValue > i5);
                                        obj2 = fjwVar;
                                    } else {
                                        Integer num2 = seatsSelectorTariffRule.d;
                                        if (num2 != null) {
                                            intValue = num2.intValue();
                                            fjwVar = new fjw(intercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity.a, intValue, intValue < i4, intValue > i5);
                                            obj2 = fjwVar;
                                        }
                                        intValue = i5;
                                        fjwVar = new fjw(intercityDashboardSectionDto$SeatsSelectorSectionDtoIntercity.a, intValue, intValue < i4, intValue > i5);
                                        obj2 = fjwVar;
                                    }
                                }
                            }
                            fjwVar = null;
                            obj2 = fjwVar;
                        } else if (i0Var instanceof IntercityDashboardSectionDto$CommentSelectorSectionDtoIntercity) {
                            this.c.getClass();
                            cjwVar = new cjw(((IntercityDashboardSectionDto$CommentSelectorSectionDtoIntercity) i0Var).a, list3, str3);
                        } else {
                            obj2 = null;
                        }
                        obj2 = cjwVar;
                    }
                }
            }
            if (obj2 != null) {
                xy40Var.g(obj2);
            }
            xfwVar3 = xfwVar;
            str17 = str3;
            ugwVar2 = ugwVar;
            calendar2 = calendar;
            list4 = list2;
            list6 = list;
            yewVar2 = yewVar;
            str15 = str2;
            intercityDashboardPopupsDto4 = intercityDashboardPopupsDto;
            list7 = list3;
            xy40Var2 = xy40Var;
            str11 = str;
            i2 = i + 1;
            size = i3;
        }
        String str30 = str11;
        yew yewVar3 = yewVar2;
        xy40 xy40Var4 = xy40Var2;
        IntercityDashboardButtonsDto intercityDashboardButtonsDto = intercityDashboardResponseDto.f;
        waw wawVar = new waw(g(intercityDashboardButtonsDto.a, str13, str12), g(intercityDashboardButtonsDto.b, str13, str12));
        Map map = intercityDashboardButtonsDto.c;
        hz40 hz40Var2 = new hz40(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str31 = (String) entry.getKey();
            SimpleIntercityDashboardButtonsDto simpleIntercityDashboardButtonsDto = (SimpleIntercityDashboardButtonsDto) entry.getValue();
            Pair pair = new Pair(new ckw(str31), new waw(g(simpleIntercityDashboardButtonsDto.a, str13, str12), g(simpleIntercityDashboardButtonsDto.b, str13, str12)));
            hz40Var2.o(pair.c(), pair.f());
        }
        return new glw(str30, yewVar3, xy40Var4, new xaw(wawVar, hz40Var2), new vbw(a(intercityDashboardPopupsDto3, intercityDashboardPopupsDto3.a)), new afw(str13, str12), false);
    }

    public final djw h(IntercityDashboardSectionDto$DueSelectorSectionDtoIntercity intercityDashboardSectionDto$DueSelectorSectionDtoIntercity, IntercityDashboardPopupsDto intercityDashboardPopupsDto, List list, xfw xfwVar, Calendar calendar) {
        Object obj;
        String j;
        String p;
        if (xfwVar != null) {
            l0 l0Var = intercityDashboardSectionDto$DueSelectorSectionDtoIntercity.e;
            String str = xfwVar.a;
            if (l0Var == null || ((l0Var instanceof IntercityDashboardSectionShowRule$SelectedTariffShowRule) && a.G(((IntercityDashboardSectionShowRule$SelectedTariffShowRule) l0Var).a, str))) {
                String str2 = intercityDashboardSectionDto$DueSelectorSectionDtoIntercity.a;
                wrr wrrVar = this.a;
                String str3 = intercityDashboardSectionDto$DueSelectorSectionDtoIntercity.b;
                if (str3 == null) {
                    str3 = "";
                }
                EarlyOptionConfigExperiment.TariffRule a = ((jbn) ((ibn) wrrVar.A)).a(xfwVar.b);
                String str4 = a != null ? a.b : null;
                Iterator it = ((dqe0) wrrVar.z).a.x.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (jl40.l(((b580) obj).a, str4)) {
                        break;
                    }
                }
                b580 b580Var = (b580) obj;
                if (b580Var != null) {
                    str3 = b580Var.c;
                } else {
                    TimeZone d = ((dqe0) wrrVar.z).d();
                    if (d == null) {
                        d = TimeZone.getDefault();
                    }
                    if (calendar != null || ((y1s) wrrVar.y).a()) {
                        nf7 nf7Var = (nf7) wrrVar.c;
                        zuj0 zuj0Var = (zuj0) wrrVar.b;
                        if (calendar == null) {
                            p = ((avj0) zuj0Var).h(kyh0.due_chart_ondemand_slot);
                        } else {
                            boolean z = calendar.getTimeZone().getRawOffset() == d.getRawOffset();
                            if (z && nf7Var.c(calendar)) {
                                j = ((avj0) zuj0Var).h(kyh0.date_today);
                            } else if (z && nf7Var.d(calendar)) {
                                j = ((avj0) zuj0Var).h(kyh0.date_tomorrow);
                            } else {
                                String h = ((avj0) zuj0Var).h(kyh0.due_chart_day_selector_date_format);
                                ((j5z) wrrVar.x).getClass();
                                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(h, j5z.e());
                                simpleDateFormat.setTimeZone(d);
                                String format = simpleDateFormat.format(calendar.getTime());
                                j = d6z.j(format != null ? format : "");
                            }
                            DateFormat timeFormat = android.text.format.DateFormat.getTimeFormat(((ole0) wrrVar.w).a);
                            timeFormat.setTimeZone(d);
                            p = g8e.p(j, Extension.FIX_SPACE, timeFormat.format(calendar.getTime()));
                        }
                        str3 = cvu0.v(str3, "$TIME$", p, false);
                    }
                }
                boolean z2 = intercityDashboardSectionDto$DueSelectorSectionDtoIntercity.c;
                xy40 f = f(list, intercityDashboardPopupsDto, IntercityDashboardSectionTypeDto.DUE_SELECTOR);
                hz40 hz40Var = new hz40(intercityDashboardSectionDto$DueSelectorSectionDtoIntercity.f.size());
                for (Map.Entry entry : intercityDashboardSectionDto$DueSelectorSectionDtoIntercity.f.entrySet()) {
                    String str5 = (String) entry.getKey();
                    IntercityDashboardSectionDto$PreorderDueViewParams intercityDashboardSectionDto$PreorderDueViewParams = ((IntercityDashboardSectionDto$PreorderDueViewOverrideParam) entry.getValue()).a;
                    Object obj2 = dom0.a;
                    if (intercityDashboardSectionDto$PreorderDueViewParams == null) {
                        obj2 = null;
                    } else {
                        int i = yhw.a[intercityDashboardSectionDto$PreorderDueViewParams.a.ordinal()];
                        if (i == 1) {
                            obj2 = com0.a;
                        } else if (i != 2) {
                            if (i == 3) {
                                obj2 = eom0.a;
                            } else {
                                if (i != 4) {
                                    w511.b();
                                    return null;
                                }
                                String str6 = intercityDashboardSectionDto$PreorderDueViewParams.b;
                                if (str6 != null && str6.length() != 0) {
                                    obj2 = new bom0(str6);
                                }
                            }
                        }
                    }
                    if (obj2 != null) {
                        Pair pair = new Pair(new ckw(str5), obj2);
                        hz40Var.o(pair.c(), pair.f());
                    }
                }
                return new djw(str2, str3, z2, f, hz40Var);
            }
        }
        return null;
    }
}

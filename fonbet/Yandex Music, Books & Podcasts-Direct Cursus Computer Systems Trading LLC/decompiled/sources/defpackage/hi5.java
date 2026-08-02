package defpackage;

import com.google.gson.Gson;
import com.yandex.music.shared.bdu.trigger.cache.dto.CommunicationTriggerDto$Banner;
import com.yandex.music.shared.bdu.trigger.cache.dto.CommunicationTriggerDto$Deeplink;
import com.yandex.music.shared.bdu.trigger.cache.dto.CommunicationTriggerDto$Div;
import com.yandex.music.shared.bdu.trigger.cache.dto.CommunicationTriggerDto$DynamicOverlaySheet;
import com.yandex.music.shared.bdu.trigger.cache.dto.CommunicationTriggerDto$Meta;
import com.yandex.music.shared.bdu.trigger.cache.dto.CommunicationTriggerDto$Toast;
import com.yandex.music.shared.bdu.trigger.cache.dto.CommunicationTriggerDto$UiType;
import com.yandex.music.shared.bdu.trigger.data.InternalCommunicationTrigger$Banner;
import com.yandex.music.shared.bdu.trigger.data.InternalCommunicationTrigger$Deeplink;
import com.yandex.music.shared.bdu.trigger.data.InternalCommunicationTrigger$Div$WithJson;
import com.yandex.music.shared.bdu.trigger.data.InternalCommunicationTrigger$DynamicOverlaySheet;
import com.yandex.music.shared.bdu.trigger.data.InternalCommunicationTrigger$Meta;
import com.yandex.music.shared.bdu.trigger.data.InternalCommunicationTrigger$Toast;
import com.yandex.music.shared.bdu.trigger.data.InternalCommunicationTrigger$UiType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class hi5 implements fi5 {
    public final Gson a;

    public hi5(Gson gson) {
        this.a = gson;
    }

    public static InternalCommunicationTrigger$DynamicOverlaySheet.Data.ButtonAction a(CommunicationTriggerDto$DynamicOverlaySheet.Data.ButtonAction buttonAction) {
        String str;
        String id;
        String str2;
        String uri = buttonAction.getUri();
        if (uri == null || (str = (String) avf.R(uri)) == null || (id = buttonAction.getId()) == null || (str2 = (String) avf.R(id)) == null) {
            return null;
        }
        return new InternalCommunicationTrigger$DynamicOverlaySheet.Data.ButtonAction(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x03bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList b(List list) {
        Iterator it;
        String feedbackToken;
        CommunicationTriggerDto$Meta meta;
        InternalCommunicationTrigger$Meta c;
        CommunicationTriggerDto$Toast.Data data;
        InternalCommunicationTrigger$Toast.Data data2;
        String title;
        String str;
        InternalCommunicationTrigger$Toast.Data.Action action;
        String str2;
        String id;
        String str3;
        String feedbackToken2;
        CommunicationTriggerDto$Meta meta2;
        InternalCommunicationTrigger$Meta c2;
        CommunicationTriggerDto$DynamicOverlaySheet.Data data3;
        InternalCommunicationTrigger$DynamicOverlaySheet.Data data4;
        String str4;
        String headerColor;
        String str5;
        Boolean bigHeader;
        String str6;
        CommunicationTriggerDto$DynamicOverlaySheet.Data.ButtonAction firstButtonAction;
        InternalCommunicationTrigger$DynamicOverlaySheet.Data.ButtonAction a;
        String firstButtonColor;
        String str7;
        String firstButtonTextColor;
        String str8;
        String str9;
        String str10;
        String backgroundColor;
        String str11;
        String feedbackToken3;
        CommunicationTriggerDto$Meta meta3;
        InternalCommunicationTrigger$Meta c3;
        String div;
        Object obj;
        Object obj2;
        String feedbackToken4;
        CommunicationTriggerDto$Meta meta4;
        InternalCommunicationTrigger$Meta c4;
        String deeplink;
        String feedbackToken5;
        CommunicationTriggerDto$Meta meta5;
        InternalCommunicationTrigger$Meta c5;
        CommunicationTriggerDto$Banner.Data data5;
        InternalCommunicationTrigger$Banner.Data data6;
        String subtitle;
        String imageUrl;
        InternalCommunicationTrigger$Banner.Data.Theme theme;
        InternalCommunicationTrigger$Banner.Data.Action action2;
        InternalCommunicationTrigger$Banner.Data.Adv adv;
        String id2;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ej5 ej5Var = (ej5) it2.next();
            if (ej5Var instanceof CommunicationTriggerDto$Banner) {
                CommunicationTriggerDto$Banner communicationTriggerDto$Banner = (CommunicationTriggerDto$Banner) ej5Var;
                String screenId = communicationTriggerDto$Banner.getScreenId();
                if (screenId == null || (feedbackToken5 = communicationTriggerDto$Banner.getFeedbackToken()) == null || (meta5 = communicationTriggerDto$Banner.getMeta()) == null || (c5 = c(meta5)) == null || (data5 = communicationTriggerDto$Banner.getData()) == null) {
                    it = it2;
                } else {
                    String title2 = data5.getTitle();
                    if (title2 == null || (subtitle = data5.getSubtitle()) == null || (imageUrl = data5.getImageUrl()) == null) {
                        it = it2;
                        data6 = null;
                    } else {
                        CommunicationTriggerDto$Banner.Data.Theme lightTheme = data5.getLightTheme();
                        InternalCommunicationTrigger$Banner.Data.Theme theme2 = lightTheme != null ? new InternalCommunicationTrigger$Banner.Data.Theme(lightTheme.getTitleColor(), lightTheme.getSubtitleColor(), lightTheme.getBgColor(), lightTheme.getBgUrl()) : null;
                        CommunicationTriggerDto$Banner.Data.Theme darkTheme = data5.getDarkTheme();
                        if (darkTheme != null) {
                            it = it2;
                            theme = new InternalCommunicationTrigger$Banner.Data.Theme(darkTheme.getTitleColor(), darkTheme.getSubtitleColor(), darkTheme.getBgColor(), darkTheme.getBgUrl());
                        } else {
                            it = it2;
                            theme = null;
                        }
                        CommunicationTriggerDto$Banner.Data.Action action3 = data5.getAction();
                        if (action3 != null) {
                            String uri = action3.getUri();
                            action2 = (uri == null || (id2 = action3.getId()) == null) ? null : new InternalCommunicationTrigger$Banner.Data.Action(uri, id2);
                        } else {
                            action2 = null;
                        }
                        CommunicationTriggerDto$Banner.Data.Adv adv2 = data5.getAdv();
                        if (adv2 != null) {
                            String text = adv2.getText();
                            adv = text == null ? null : new InternalCommunicationTrigger$Banner.Data.Adv(text);
                        } else {
                            adv = null;
                        }
                        data6 = new InternalCommunicationTrigger$Banner.Data(title2, subtitle, imageUrl, theme2, theme, action2, adv);
                    }
                    if (data6 != null) {
                        obj2 = new InternalCommunicationTrigger$Banner(screenId, feedbackToken5, c5, data6);
                        if (obj2 != null) {
                            arrayList.add(obj2);
                        }
                        it2 = it;
                    }
                }
                obj2 = null;
                if (obj2 != null) {
                }
                it2 = it;
            } else {
                it = it2;
                if (ej5Var instanceof CommunicationTriggerDto$Deeplink) {
                    CommunicationTriggerDto$Deeplink communicationTriggerDto$Deeplink = (CommunicationTriggerDto$Deeplink) ej5Var;
                    String screenId2 = communicationTriggerDto$Deeplink.getScreenId();
                    if (screenId2 != null && (feedbackToken4 = communicationTriggerDto$Deeplink.getFeedbackToken()) != null && (meta4 = communicationTriggerDto$Deeplink.getMeta()) != null && (c4 = c(meta4)) != null && (deeplink = communicationTriggerDto$Deeplink.getDeeplink()) != null) {
                        obj = new InternalCommunicationTrigger$Deeplink(screenId2, feedbackToken4, c4, deeplink);
                        obj2 = obj;
                    }
                    obj2 = null;
                } else if (ej5Var instanceof CommunicationTriggerDto$Div) {
                    CommunicationTriggerDto$Div communicationTriggerDto$Div = (CommunicationTriggerDto$Div) ej5Var;
                    String screenId3 = communicationTriggerDto$Div.getScreenId();
                    if (screenId3 != null && (feedbackToken3 = communicationTriggerDto$Div.getFeedbackToken()) != null && (meta3 = communicationTriggerDto$Div.getMeta()) != null && (c3 = c(meta3)) != null && (div = communicationTriggerDto$Div.getDiv()) != null) {
                        obj = new InternalCommunicationTrigger$Div$WithJson(screenId3, feedbackToken3, c3, div);
                        obj2 = obj;
                    }
                    obj2 = null;
                } else if (ej5Var instanceof CommunicationTriggerDto$DynamicOverlaySheet) {
                    CommunicationTriggerDto$DynamicOverlaySheet communicationTriggerDto$DynamicOverlaySheet = (CommunicationTriggerDto$DynamicOverlaySheet) ej5Var;
                    String screenId4 = communicationTriggerDto$DynamicOverlaySheet.getScreenId();
                    if (screenId4 != null && (feedbackToken2 = communicationTriggerDto$DynamicOverlaySheet.getFeedbackToken()) != null && (meta2 = communicationTriggerDto$DynamicOverlaySheet.getMeta()) != null && (c2 = c(meta2)) != null && (data3 = communicationTriggerDto$DynamicOverlaySheet.getData()) != null) {
                        Boolean canBeOpened = data3.getCanBeOpened();
                        if (canBeOpened != null) {
                            boolean booleanValue = canBeOpened.booleanValue();
                            Boolean isCenterAlign = data3.getIsCenterAlign();
                            if (isCenterAlign != null) {
                                boolean booleanValue2 = isCenterAlign.booleanValue();
                                String headerText = data3.getHeaderText();
                                if (headerText != null && (str4 = (String) avf.R(headerText)) != null && (headerColor = data3.getHeaderColor()) != null && (str5 = (String) avf.R(headerColor)) != null && (bigHeader = data3.getBigHeader()) != null) {
                                    boolean booleanValue3 = bigHeader.booleanValue();
                                    String subtitleText = data3.getSubtitleText();
                                    String str12 = subtitleText != null ? (String) avf.R(subtitleText) : null;
                                    String subtitleColor = data3.getSubtitleColor();
                                    String str13 = subtitleColor != null ? (String) avf.R(subtitleColor) : null;
                                    String firstButtonText = data3.getFirstButtonText();
                                    if (firstButtonText != null && (str6 = (String) avf.R(firstButtonText)) != null && (firstButtonAction = data3.getFirstButtonAction()) != null && (a = a(firstButtonAction)) != null && (firstButtonColor = data3.getFirstButtonColor()) != null && (str7 = (String) avf.R(firstButtonColor)) != null && (firstButtonTextColor = data3.getFirstButtonTextColor()) != null && (str8 = (String) avf.R(firstButtonTextColor)) != null) {
                                        String secondButtonText = data3.getSecondButtonText();
                                        String str14 = secondButtonText != null ? (String) avf.R(secondButtonText) : null;
                                        CommunicationTriggerDto$DynamicOverlaySheet.Data.ButtonAction secondButtonAction = data3.getSecondButtonAction();
                                        InternalCommunicationTrigger$DynamicOverlaySheet.Data.ButtonAction a2 = secondButtonAction != null ? a(secondButtonAction) : null;
                                        String secondButtonColor = data3.getSecondButtonColor();
                                        String str15 = secondButtonColor != null ? (String) avf.R(secondButtonColor) : null;
                                        String secondButtonTextColor = data3.getSecondButtonTextColor();
                                        String str16 = secondButtonTextColor != null ? (String) avf.R(secondButtonTextColor) : null;
                                        String closeButtonColor = data3.getCloseButtonColor();
                                        if (closeButtonColor != null && (str9 = (String) avf.R(closeButtonColor)) != null) {
                                            String eridButtonColor = data3.getEridButtonColor();
                                            String str17 = eridButtonColor != null ? (String) avf.R(eridButtonColor) : null;
                                            String advDisclaimer = data3.getAdvDisclaimer();
                                            String str18 = advDisclaimer != null ? (String) avf.R(advDisclaimer) : null;
                                            String disclaimerText = data3.getDisclaimerText();
                                            String str19 = disclaimerText != null ? (String) avf.R(disclaimerText) : null;
                                            String disclaimerColor = data3.getDisclaimerColor();
                                            String str20 = disclaimerColor != null ? (String) avf.R(disclaimerColor) : null;
                                            String imageUrl2 = data3.getImageUrl();
                                            if (imageUrl2 != null && (str10 = (String) avf.R(imageUrl2)) != null && (backgroundColor = data3.getBackgroundColor()) != null && (str11 = (String) avf.R(backgroundColor)) != null) {
                                                String backgroundImageUrl = data3.getBackgroundImageUrl();
                                                data4 = new InternalCommunicationTrigger$DynamicOverlaySheet.Data(booleanValue, booleanValue2, str4, str5, booleanValue3, str12, str13, str6, a, str7, str8, str14, a2, str15, str16, str9, str17, str18, str19, str20, str10, str11, backgroundImageUrl != null ? (String) avf.R(backgroundImageUrl) : null);
                                                if (data4 != null) {
                                                    obj = new InternalCommunicationTrigger$DynamicOverlaySheet(screenId4, feedbackToken2, c2, data4);
                                                    obj2 = obj;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        data4 = null;
                        if (data4 != null) {
                        }
                    }
                    obj2 = null;
                } else {
                    if (!(ej5Var instanceof CommunicationTriggerDto$Toast)) {
                        b6e.s();
                        return null;
                    }
                    CommunicationTriggerDto$Toast communicationTriggerDto$Toast = (CommunicationTriggerDto$Toast) ej5Var;
                    String screenId5 = communicationTriggerDto$Toast.getScreenId();
                    if (screenId5 != null && (feedbackToken = communicationTriggerDto$Toast.getFeedbackToken()) != null && (meta = communicationTriggerDto$Toast.getMeta()) != null && (c = c(meta)) != null && (data = communicationTriggerDto$Toast.getData()) != null) {
                        CommunicationTriggerDto$Toast.Data.ToastType toastType = data.getToastType();
                        if (toastType != null) {
                            if (gi5.a[toastType.ordinal()] != 1) {
                                b6e.s();
                                return null;
                            }
                            InternalCommunicationTrigger$Toast.Data.ToastType toastType2 = InternalCommunicationTrigger$Toast.Data.ToastType.SIMPLE;
                            if (toastType2 != null && (title = data.getTitle()) != null && (str = (String) avf.R(title)) != null) {
                                String subtitle2 = data.getSubtitle();
                                String str21 = subtitle2 != null ? (String) avf.R(subtitle2) : null;
                                String imageUrl3 = data.getImageUrl();
                                String str22 = imageUrl3 != null ? (String) avf.R(imageUrl3) : null;
                                CommunicationTriggerDto$Toast.Data.Action action4 = data.getAction();
                                if (action4 != null) {
                                    String uri2 = action4.getUri();
                                    action = (uri2 == null || (str2 = (String) avf.R(uri2)) == null || (id = action4.getId()) == null || (str3 = (String) avf.R(id)) == null) ? null : new InternalCommunicationTrigger$Toast.Data.Action(str2, str3);
                                } else {
                                    action = null;
                                }
                                CommunicationTriggerDto$Toast.Data.Timers timers = data.getTimers();
                                data2 = new InternalCommunicationTrigger$Toast.Data(toastType2, str, str21, str22, action, timers != null ? new InternalCommunicationTrigger$Toast.Data.Timers(timers.getDelayBeforeShow(), timers.getDelayBeforeDismiss()) : null);
                                if (data2 != null) {
                                    obj = new InternalCommunicationTrigger$Toast(screenId5, feedbackToken, c, data2);
                                    obj2 = obj;
                                }
                            }
                        }
                        data2 = null;
                        if (data2 != null) {
                        }
                    }
                    obj2 = null;
                }
                if (obj2 != null) {
                }
                it2 = it;
            }
        }
        return arrayList;
    }

    public static InternalCommunicationTrigger$Meta c(CommunicationTriggerDto$Meta communicationTriggerDto$Meta) {
        InternalCommunicationTrigger$UiType internalCommunicationTrigger$UiType;
        CommunicationTriggerDto$UiType uiType = communicationTriggerDto$Meta.getUiType();
        if (uiType == null) {
            return null;
        }
        switch (gi5.b[uiType.ordinal()]) {
            case 1:
                internalCommunicationTrigger$UiType = InternalCommunicationTrigger$UiType.FULLSCREEN;
                break;
            case 2:
                internalCommunicationTrigger$UiType = InternalCommunicationTrigger$UiType.BOTTOMSHEET;
                break;
            case 3:
                internalCommunicationTrigger$UiType = InternalCommunicationTrigger$UiType.BANNER;
                break;
            case 4:
                internalCommunicationTrigger$UiType = InternalCommunicationTrigger$UiType.DEEPLINK;
                break;
            case 5:
                internalCommunicationTrigger$UiType = InternalCommunicationTrigger$UiType.DYNAMIC_OVERLAY_SHEET;
                break;
            case 6:
                internalCommunicationTrigger$UiType = InternalCommunicationTrigger$UiType.TOAST;
                break;
            default:
                b6e.s();
                return null;
        }
        if (internalCommunicationTrigger$UiType == null) {
            return null;
        }
        Boolean hasTabDot = communicationTriggerDto$Meta.getHasTabDot();
        return new InternalCommunicationTrigger$Meta(internalCommunicationTrigger$UiType, hasTabDot != null ? hasTabDot.booleanValue() : false, communicationTriggerDto$Meta.getShowAfter(), communicationTriggerDto$Meta.getShowBefore());
    }
}

package com.knotapi.knot.interfaces;

import com.knotapi.knot.models.Bot;
import com.knotapi.knot.models.CustomEvent;
import com.knotapi.knot.models.ExtraInfo;
import com.knotapi.knot.models.MerchantWebViewData;

/* loaded from: classes4.dex */
public interface MerchantWebViewDelegate {
    void callTimeOutErrorCallback(int i);

    void evaluateJS(String str);

    void onTryAgain(Bot bot);

    void removeFragment(int i, boolean z);

    void sendBotCustomEvent(CustomEvent customEvent);

    void sendFullReverseLoginEvent(String str);

    void sendNativeLogEvent(MerchantWebViewData merchantWebViewData);

    void sendNativeLogEvent(Integer num, String str, String str2, String str3);

    void sendRunningEvent(int i, String str, String str2, ExtraInfo extraInfo, Boolean bool, String str3, String str4);

    void sendUserActionEvent(int i);

    void sendWebMessageToWebApp(MerchantWebViewData merchantWebViewData);

    void setNeedTimeOutCall(boolean z);

    void userCloseMerchantView(int i, int i2);
}

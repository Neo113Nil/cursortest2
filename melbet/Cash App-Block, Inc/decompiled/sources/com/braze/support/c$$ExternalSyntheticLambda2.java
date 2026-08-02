package com.braze.support;

import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.BrazeWebViewActivity;
import com.braze.ui.BrazeWebViewActivity$createWebViewClient$1;
import com.braze.ui.BrazeWebViewClient;
import com.braze.ui.UserJavascriptInterfaceBase;
import com.braze.ui.actions.UriAction;
import com.braze.ui.actions.brazeactions.BrazeActionParser;
import com.braze.ui.actions.brazeactions.steps.BaseBrazeActionStep$Companion$runOnUser$1;
import com.braze.ui.contentcards.BrazeContentCardUtils;
import com.braze.ui.contentcards.ContentCardsFragment;
import com.braze.ui.contentcards.adapters.ContentCardAdapter;
import com.braze.ui.contentcards.managers.BrazeContentCardsManager;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class c$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ c$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String createUriActionFromUrlString$lambda$0;
        String createUriActionFromUrlString$lambda$1;
        String onCreate$lambda$1;
        String onRenderProcessGone$lambda$1;
        String markPageFinished$lambda$0$0;
        String onRenderProcessGone$lambda$0;
        String onPageFinished$lambda$0$0;
        String parseStringArrayFromJsonString$lambda$1;
        String intentArrayWithConfiguredBackStack$lambda$4;
        String openUriWithWebViewActivity$lambda$0;
        String openUriWithWebViewActivityFromPush$lambda$0;
        String intentArrayWithConfiguredBackStack$lambda$0;
        String onError$lambda$0;
        String uriActionForCard$lambda$0;
        String onPause$lambda$0;
        String contentCardsUpdate$lambda$1;
        String contentCardsUpdate$lambda$2;
        String networkUnavailable$lambda$0;
        String markOnScreenCardsAsRead$lambda$0;
        BrazeContentCardsManager instance_delegate$lambda$0;
        String registerInAppMessageManager$lambda$7;
        switch (this.$r8$classId) {
            case 0:
                return c.d();
            case 1:
                return c.b();
            case 2:
                return c.a();
            case 3:
                return f.a();
            case 4:
                return g.c();
            case 5:
                return g.b();
            case 6:
                return i.a();
            case 7:
                return j.a();
            case 8:
                createUriActionFromUrlString$lambda$0 = BrazeDeeplinkHandler.createUriActionFromUrlString$lambda$0();
                return createUriActionFromUrlString$lambda$0;
            case 9:
                createUriActionFromUrlString$lambda$1 = BrazeDeeplinkHandler.createUriActionFromUrlString$lambda$1();
                return createUriActionFromUrlString$lambda$1;
            case 10:
                onCreate$lambda$1 = BrazeWebViewActivity.onCreate$lambda$1();
                return onCreate$lambda$1;
            case 11:
                onRenderProcessGone$lambda$1 = BrazeWebViewActivity$createWebViewClient$1.onRenderProcessGone$lambda$1();
                return onRenderProcessGone$lambda$1;
            case 12:
                markPageFinished$lambda$0$0 = BrazeWebViewClient.markPageFinished$lambda$0$0();
                return markPageFinished$lambda$0$0;
            case 13:
                onRenderProcessGone$lambda$0 = BrazeWebViewClient.onRenderProcessGone$lambda$0();
                return onRenderProcessGone$lambda$0;
            case 14:
                onPageFinished$lambda$0$0 = BrazeWebViewClient.onPageFinished$lambda$0$0();
                return onPageFinished$lambda$0$0;
            case 15:
                parseStringArrayFromJsonString$lambda$1 = UserJavascriptInterfaceBase.parseStringArrayFromJsonString$lambda$1();
                return parseStringArrayFromJsonString$lambda$1;
            case 16:
                intentArrayWithConfiguredBackStack$lambda$4 = UriAction.getIntentArrayWithConfiguredBackStack$lambda$4();
                return intentArrayWithConfiguredBackStack$lambda$4;
            case 17:
                openUriWithWebViewActivity$lambda$0 = UriAction.openUriWithWebViewActivity$lambda$0();
                return openUriWithWebViewActivity$lambda$0;
            case 18:
                openUriWithWebViewActivityFromPush$lambda$0 = UriAction.openUriWithWebViewActivityFromPush$lambda$0();
                return openUriWithWebViewActivityFromPush$lambda$0;
            case 19:
                intentArrayWithConfiguredBackStack$lambda$0 = UriAction.getIntentArrayWithConfiguredBackStack$lambda$0();
                return intentArrayWithConfiguredBackStack$lambda$0;
            case 20:
                return BrazeActionParser.execute$lambda$1();
            case 21:
                onError$lambda$0 = BaseBrazeActionStep$Companion$runOnUser$1.onError$lambda$0();
                return onError$lambda$0;
            case 22:
                uriActionForCard$lambda$0 = BrazeContentCardUtils.getUriActionForCard$lambda$0();
                return uriActionForCard$lambda$0;
            case 23:
                onPause$lambda$0 = ContentCardsFragment.onPause$lambda$0();
                return onPause$lambda$0;
            case 24:
                contentCardsUpdate$lambda$1 = ContentCardsFragment.contentCardsUpdate$lambda$1();
                return contentCardsUpdate$lambda$1;
            case 25:
                contentCardsUpdate$lambda$2 = ContentCardsFragment.contentCardsUpdate$lambda$2();
                return contentCardsUpdate$lambda$2;
            case 26:
                networkUnavailable$lambda$0 = ContentCardsFragment.networkUnavailable$lambda$0();
                return networkUnavailable$lambda$0;
            case 27:
                markOnScreenCardsAsRead$lambda$0 = ContentCardAdapter.markOnScreenCardsAsRead$lambda$0();
                return markOnScreenCardsAsRead$lambda$0;
            case 28:
                instance_delegate$lambda$0 = BrazeContentCardsManager.instance_delegate$lambda$0();
                return instance_delegate$lambda$0;
            default:
                registerInAppMessageManager$lambda$7 = BrazeInAppMessageManager.registerInAppMessageManager$lambda$7();
                return registerInAppMessageManager$lambda$7;
        }
    }
}

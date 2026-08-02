package com.braze.ui.inappmessage.views;

import com.braze.ui.inappmessage.InAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageHtmlFullViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageHtmlViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageModalViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageSlideupViewFactory;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class InAppMessageFullView$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ InAppMessageFullView$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String applyDisplayCutoutMarginsToCloseButton$lambda$0;
        String onBackProgressed$lambda$2;
        String onBackCancelled$lambda$3;
        String onBackStarted$lambda$1;
        String createInAppMessageView$lambda$0;
        String createInAppMessageView$lambda$02;
        String createInAppMessageView$lambda$1$0;
        String createInAppMessageView$lambda$03;
        String afterClosed$lambda$0;
        String onButtonClicked$lambda$0;
        String onDismissed$lambda$0;
        String onClicked$lambda$0;
        String performClickAction$lambda$0;
        String performClickAction$lambda$1;
        String performClickAction$lambda$2;
        String afterOpened$lambda$0;
        String beforeClosed$lambda$0;
        String beforeOpened$lambda$0;
        String onOtherUrlAction$lambda$0;
        String onCloseAction$lambda$0;
        String onCloseAction$lambda$1;
        String onCustomEventAction$lambda$0;
        String onCustomEventAction$lambda$1;
        String onBackStarted$lambda$0;
        String resetMessageMargins$lambda$0$0$0;
        String applyDisplayCutoutMarginsToContentArea$lambda$0;
        String _get_messageWebView_$lambda$0;
        String _get_messageWebView_$lambda$1;
        String _get_messageWebView_$lambda$3;
        String _get_messageWebView_$lambda$4;
        switch (this.$r8$classId) {
            case 0:
                applyDisplayCutoutMarginsToCloseButton$lambda$0 = InAppMessageFullView.applyDisplayCutoutMarginsToCloseButton$lambda$0();
                return applyDisplayCutoutMarginsToCloseButton$lambda$0;
            case 1:
                onBackProgressed$lambda$2 = InAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1.onBackProgressed$lambda$2();
                return onBackProgressed$lambda$2;
            case 2:
                onBackCancelled$lambda$3 = InAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1.onBackCancelled$lambda$3();
                return onBackCancelled$lambda$3;
            case 3:
                onBackStarted$lambda$1 = InAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1.onBackStarted$lambda$1();
                return onBackStarted$lambda$1;
            case 4:
                createInAppMessageView$lambda$0 = DefaultInAppMessageHtmlFullViewFactory.createInAppMessageView$lambda$0();
                return createInAppMessageView$lambda$0;
            case 5:
                createInAppMessageView$lambda$02 = DefaultInAppMessageHtmlViewFactory.createInAppMessageView$lambda$0();
                return createInAppMessageView$lambda$02;
            case 6:
                createInAppMessageView$lambda$1$0 = DefaultInAppMessageModalViewFactory.createInAppMessageView$lambda$1$0();
                return createInAppMessageView$lambda$1$0;
            case 7:
                createInAppMessageView$lambda$03 = DefaultInAppMessageSlideupViewFactory.createInAppMessageView$lambda$0();
                return createInAppMessageView$lambda$03;
            case 8:
                afterClosed$lambda$0 = DefaultInAppMessageViewLifecycleListener.afterClosed$lambda$0();
                return afterClosed$lambda$0;
            case 9:
                onButtonClicked$lambda$0 = DefaultInAppMessageViewLifecycleListener.onButtonClicked$lambda$0();
                return onButtonClicked$lambda$0;
            case 10:
                onDismissed$lambda$0 = DefaultInAppMessageViewLifecycleListener.onDismissed$lambda$0();
                return onDismissed$lambda$0;
            case 11:
                onClicked$lambda$0 = DefaultInAppMessageViewLifecycleListener.onClicked$lambda$0();
                return onClicked$lambda$0;
            case 12:
                performClickAction$lambda$0 = DefaultInAppMessageViewLifecycleListener.performClickAction$lambda$0();
                return performClickAction$lambda$0;
            case 13:
                performClickAction$lambda$1 = DefaultInAppMessageViewLifecycleListener.performClickAction$lambda$1();
                return performClickAction$lambda$1;
            case 14:
                performClickAction$lambda$2 = DefaultInAppMessageViewLifecycleListener.performClickAction$lambda$2();
                return performClickAction$lambda$2;
            case 15:
                afterOpened$lambda$0 = DefaultInAppMessageViewLifecycleListener.afterOpened$lambda$0();
                return afterOpened$lambda$0;
            case 16:
                beforeClosed$lambda$0 = DefaultInAppMessageViewLifecycleListener.beforeClosed$lambda$0();
                return beforeClosed$lambda$0;
            case 17:
                beforeOpened$lambda$0 = DefaultInAppMessageViewLifecycleListener.beforeOpened$lambda$0();
                return beforeOpened$lambda$0;
            case 18:
                onOtherUrlAction$lambda$0 = DefaultInAppMessageWebViewClientListener.onOtherUrlAction$lambda$0();
                return onOtherUrlAction$lambda$0;
            case 19:
                onCloseAction$lambda$0 = DefaultInAppMessageWebViewClientListener.onCloseAction$lambda$0();
                return onCloseAction$lambda$0;
            case 20:
                onCloseAction$lambda$1 = DefaultInAppMessageWebViewClientListener.onCloseAction$lambda$1();
                return onCloseAction$lambda$1;
            case 21:
                onCustomEventAction$lambda$0 = DefaultInAppMessageWebViewClientListener.onCustomEventAction$lambda$0();
                return onCustomEventAction$lambda$0;
            case 22:
                onCustomEventAction$lambda$1 = DefaultInAppMessageWebViewClientListener.onCustomEventAction$lambda$1();
                return onCustomEventAction$lambda$1;
            case 23:
                onBackStarted$lambda$0 = IInAppMessageBackEventListener.onBackStarted$lambda$0();
                return onBackStarted$lambda$0;
            case 24:
                resetMessageMargins$lambda$0$0$0 = InAppMessageFullView.resetMessageMargins$lambda$0$0$0();
                return resetMessageMargins$lambda$0$0$0;
            case 25:
                applyDisplayCutoutMarginsToContentArea$lambda$0 = InAppMessageFullView.applyDisplayCutoutMarginsToContentArea$lambda$0();
                return applyDisplayCutoutMarginsToContentArea$lambda$0;
            case 26:
                _get_messageWebView_$lambda$0 = InAppMessageHtmlBaseView._get_messageWebView_$lambda$0();
                return _get_messageWebView_$lambda$0;
            case 27:
                _get_messageWebView_$lambda$1 = InAppMessageHtmlBaseView._get_messageWebView_$lambda$1();
                return _get_messageWebView_$lambda$1;
            case 28:
                _get_messageWebView_$lambda$3 = InAppMessageHtmlBaseView._get_messageWebView_$lambda$3();
                return _get_messageWebView_$lambda$3;
            default:
                _get_messageWebView_$lambda$4 = InAppMessageHtmlBaseView._get_messageWebView_$lambda$4();
                return _get_messageWebView_$lambda$4;
        }
    }
}

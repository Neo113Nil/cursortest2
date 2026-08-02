package com.braze.ui.inappmessage.listeners;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.Channel;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageHtml;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.models.inappmessage.MessageButton;
import com.braze.support.BrazeFunctionNotImplemented;
import com.braze.support.BrazeLogger;
import com.braze.support.BundleUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.actions.UriAction;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.views.InAppMessageFullView$$ExternalSyntheticLambda1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.JobKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002J*\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\tH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\""}, d2 = {"Lcom/braze/ui/inappmessage/listeners/DefaultInAppMessageViewLifecycleListener;", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;", "<init>", "()V", "inAppMessageManager", "Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "getInAppMessageManager", "()Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "beforeOpened", "", "inAppMessageView", "Landroid/view/View;", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "afterOpened", "beforeClosed", "afterClosed", "onClicked", "onButtonClicked", "messageButton", "Lcom/braze/models/inappmessage/MessageButton;", "inAppMessageImmersive", "Lcom/braze/models/inappmessage/IInAppMessageImmersive;", "onDismissed", "performInAppMessageButtonClicked", "performInAppMessageClicked", "performClickAction", "clickAction", "Lcom/braze/enums/inappmessage/ClickAction;", "clickUri", "Landroid/net/Uri;", "openUriInWebview", "", "startClearHtmlInAppMessageAssetsThread", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public class DefaultInAppMessageViewLifecycleListener implements IInAppMessageViewLifecycleListener {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClickAction.values().length];
            try {
                iArr[ClickAction.URI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClickAction.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String afterClosed$lambda$0() {
        return "IInAppMessageViewLifecycleListener.afterClosed called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String afterOpened$lambda$0() {
        return "IInAppMessageViewLifecycleListener.afterOpened called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String beforeClosed$lambda$0() {
        return "IInAppMessageViewLifecycleListener.beforeClosed called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String beforeOpened$lambda$0() {
        return "IInAppMessageViewLifecycleListener.beforeOpened called.";
    }

    private final BrazeInAppMessageManager getInAppMessageManager() {
        return BrazeInAppMessageManager.INSTANCE.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onButtonClicked$lambda$0() {
        return "IInAppMessageViewLifecycleListener.onButtonClicked called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onClicked$lambda$0() {
        return "IInAppMessageViewLifecycleListener.onClicked called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onDismissed$lambda$0() {
        return "IInAppMessageViewLifecycleListener.onDismissed called.";
    }

    private final void performClickAction(ClickAction clickAction, IInAppMessage inAppMessage, Uri clickUri, boolean openUriInWebview) {
        if (getInAppMessageManager().getActivity() == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new InAppMessageFullView$$ExternalSyntheticLambda1(12), 6, (Object) null);
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[clickAction.ordinal()];
        if (i != 1) {
            if (i == 2) {
                getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(false);
                return;
            } else {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
        }
        inAppMessage.setAnimateOut(false);
        getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(false);
        if (clickUri == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new InAppMessageFullView$$ExternalSyntheticLambda1(13), 7, (Object) null);
            return;
        }
        BrazeDeeplinkHandler.Companion companion = BrazeDeeplinkHandler.INSTANCE;
        UriAction createUriActionFromUri = companion.getInstance().createUriActionFromUri(clickUri, BundleUtils.toBundle(inAppMessage.getExtras()), openUriInWebview, Channel.INAPP_MESSAGE);
        Context mApplicationContext = getInAppMessageManager().getMApplicationContext();
        if (mApplicationContext == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new InAppMessageFullView$$ExternalSyntheticLambda1(14), 7, (Object) null);
        } else {
            companion.getInstance().gotoUri(mApplicationContext, createUriActionFromUri);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String performClickAction$lambda$0() {
        return "Can't perform click action because the cached activity is null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String performClickAction$lambda$1() {
        return "clickUri is null, not performing click action";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String performClickAction$lambda$2() {
        return "appContext is null, not performing click action";
    }

    private final void performInAppMessageButtonClicked(MessageButton messageButton, IInAppMessage inAppMessage) {
        performClickAction(messageButton.getClickAction(), inAppMessage, messageButton.getUri(), messageButton.getOpenUriInWebview());
    }

    private final void performInAppMessageClicked(IInAppMessage inAppMessage) {
        performClickAction(inAppMessage.getInternalClickAction(), inAppMessage, inAppMessage.getInternalUri(), inAppMessage.getOpenUriInWebView());
    }

    private final void startClearHtmlInAppMessageAssetsThread() {
        JobKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new DefaultInAppMessageViewLifecycleListener$startClearHtmlInAppMessageAssetsThread$1(null), 3);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void afterClosed(IInAppMessage inAppMessage) {
        inAppMessage.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new InAppMessageFullView$$ExternalSyntheticLambda1(8), 7, (Object) null);
        getInAppMessageManager().resetAfterInAppMessageClose();
        if (inAppMessage instanceof IInAppMessageHtml) {
            startClearHtmlInAppMessageAssetsThread();
        }
        inAppMessage.onAfterClosed();
        getInAppMessageManager().getInAppMessageManagerListener().afterInAppMessageViewClosed(inAppMessage);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void afterOpened(View inAppMessageView, IInAppMessage inAppMessage) {
        inAppMessageView.getClass();
        inAppMessage.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new InAppMessageFullView$$ExternalSyntheticLambda1(15), 7, (Object) null);
        getInAppMessageManager().getInAppMessageManagerListener().afterInAppMessageViewOpened(inAppMessageView, inAppMessage);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void beforeClosed(View inAppMessageView, IInAppMessage inAppMessage) {
        inAppMessageView.getClass();
        inAppMessage.getClass();
        getInAppMessageManager().getInAppMessageManagerListener().beforeInAppMessageViewClosed(inAppMessageView, inAppMessage);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new InAppMessageFullView$$ExternalSyntheticLambda1(16), 7, (Object) null);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void beforeOpened(View inAppMessageView, IInAppMessage inAppMessage) {
        inAppMessageView.getClass();
        inAppMessage.getClass();
        getInAppMessageManager().getInAppMessageManagerListener().beforeInAppMessageViewOpened(inAppMessageView, inAppMessage);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new InAppMessageFullView$$ExternalSyntheticLambda1(17), 7, (Object) null);
        inAppMessage.logImpression();
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void onButtonClicked(MessageButton messageButton, IInAppMessageImmersive inAppMessageImmersive) {
        boolean onInAppMessageButtonClicked;
        messageButton.getClass();
        inAppMessageImmersive.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new InAppMessageFullView$$ExternalSyntheticLambda1(9), 7, (Object) null);
        inAppMessageImmersive.logButtonClick(messageButton);
        try {
            onInAppMessageButtonClicked = getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageButtonClicked(inAppMessageImmersive, messageButton);
        } catch (BrazeFunctionNotImplemented unused) {
            onInAppMessageButtonClicked = getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageButtonClicked(inAppMessageImmersive, messageButton);
        }
        if (onInAppMessageButtonClicked) {
            return;
        }
        performInAppMessageButtonClicked(messageButton, inAppMessageImmersive);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void onClicked(View inAppMessageView, IInAppMessage inAppMessage) {
        inAppMessageView.getClass();
        inAppMessage.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new InAppMessageFullView$$ExternalSyntheticLambda1(11), 7, (Object) null);
        inAppMessage.logClick();
        if (getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageClicked(inAppMessage)) {
            return;
        }
        performInAppMessageClicked(inAppMessage);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void onDismissed(View inAppMessageView, IInAppMessage inAppMessage) {
        inAppMessageView.getClass();
        inAppMessage.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new InAppMessageFullView$$ExternalSyntheticLambda1(10), 7, (Object) null);
        getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageDismissed(inAppMessage);
    }
}

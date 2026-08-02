package com.braze.ui.inappmessage;

import android.app.Activity;
import android.content.Context;
import com.braze.Braze$$ExternalSyntheticLambda34;
import com.braze.enums.inappmessage.MessageType;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageAnimationFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageFullViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageHtmlFullViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageHtmlViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageModalViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageSlideupViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageViewWrapperFactory;
import com.braze.ui.inappmessage.listeners.DefaultHtmlInAppMessageActionListener;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageManagerListener;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener;
import com.braze.ui.inappmessage.listeners.IHtmlInAppMessageActionListener;
import com.braze.ui.inappmessage.listeners.IInAppMessageManagerListener;
import com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR*\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0013\u001a\u00020\n8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0013\u0010\f\u0012\u0004\b\u0016\u0010\u0003\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R$\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0004@\u0004X\u0085\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001b\u0010\u0003R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0004@\u0004X\u0085\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001f\u0010\u0003R\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010)\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010'R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010'R\u0014\u0010+\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010'R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00105\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010'R\u0018\u00106\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010.R\u0018\u00107\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00101R\u0018\u00108\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00104R\u0018\u00109\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010%R\u0018\u0010:\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00101R\u0014\u0010<\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u0010R\u0014\u0010>\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u0010R\u0016\u0010A\u001a\u0004\u0018\u00010\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0016\u0010D\u001a\u0004\u0018\u00010\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010G\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010FR\u0014\u0010L\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010O\u001a\u0002028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010R\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006S"}, d2 = {"Lcom/braze/ui/inappmessage/InAppMessageManagerBase;", "", "<init>", "()V", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "Lcom/braze/ui/inappmessage/IInAppMessageViewFactory;", "getDefaultInAppMessageViewFactory", "(Lcom/braze/models/inappmessage/IInAppMessage;)Lcom/braze/ui/inappmessage/IInAppMessageViewFactory;", "getInAppMessageViewFactory", "", "doesClickOutsideModalViewDismissInAppMessageViewField", "Z", "shouldSkip", "shouldNextUnregisterBeSkipped", "getShouldNextUnregisterBeSkipped", "()Z", "setShouldNextUnregisterBeSkipped", "(Z)V", "doesBackButtonDismissInAppMessageViewField", "getDoesBackButtonDismissInAppMessageViewField$android_sdk_ui_release", "setDoesBackButtonDismissInAppMessageViewField$android_sdk_ui_release", "getDoesBackButtonDismissInAppMessageViewField$android_sdk_ui_release$annotations", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "mActivity", "Ljava/lang/ref/WeakReference;", "getMActivity$annotations", "Landroid/content/Context;", "mApplicationContext", "Landroid/content/Context;", "getMApplicationContext$annotations", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;", "inAppMessageWebViewClientListener", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;", "Lcom/braze/ui/inappmessage/listeners/IHtmlInAppMessageActionListener;", "defaultHtmlInAppMessageActionListener", "Lcom/braze/ui/inappmessage/listeners/IHtmlInAppMessageActionListener;", "inAppMessageSlideupViewFactory", "Lcom/braze/ui/inappmessage/IInAppMessageViewFactory;", "inAppMessageModalViewFactory", "inAppMessageFullViewFactory", "inAppMessageHtmlFullViewFactory", "inAppMessageHtmlViewFactory", "Lcom/braze/ui/inappmessage/IInAppMessageAnimationFactory;", "inAppMessageAnimationFactoryField", "Lcom/braze/ui/inappmessage/IInAppMessageAnimationFactory;", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageManagerListener;", "defaultInAppMessageManagerListener", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageManagerListener;", "Lcom/braze/ui/inappmessage/IInAppMessageViewWrapperFactory;", "defaultInAppMessageViewWrapperFactory", "Lcom/braze/ui/inappmessage/IInAppMessageViewWrapperFactory;", "customInAppMessageViewFactory", "customInAppMessageAnimationFactory", "customInAppMessageManagerListener", "customInAppMessageViewWrapperFactory", "customHtmlInAppMessageActionListener", "customControlInAppMessageManagerListener", "getDoesClickOutsideModalViewDismissInAppMessageView", "doesClickOutsideModalViewDismissInAppMessageView", "getDoesBackButtonDismissInAppMessageView", "doesBackButtonDismissInAppMessageView", "getActivity", "()Landroid/app/Activity;", "activity", "getApplicationContext", "()Landroid/content/Context;", "applicationContext", "getInAppMessageManagerListener", "()Lcom/braze/ui/inappmessage/listeners/IInAppMessageManagerListener;", "inAppMessageManagerListener", "getControlInAppMessageManagerListener", "controlInAppMessageManagerListener", "getHtmlInAppMessageActionListener", "()Lcom/braze/ui/inappmessage/listeners/IHtmlInAppMessageActionListener;", "htmlInAppMessageActionListener", "getInAppMessageViewWrapperFactory", "()Lcom/braze/ui/inappmessage/IInAppMessageViewWrapperFactory;", "inAppMessageViewWrapperFactory", "getInAppMessageAnimationFactory", "()Lcom/braze/ui/inappmessage/IInAppMessageAnimationFactory;", "inAppMessageAnimationFactory", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class InAppMessageManagerBase {
    private IInAppMessageManagerListener customControlInAppMessageManagerListener;
    private IHtmlInAppMessageActionListener customHtmlInAppMessageActionListener;
    private IInAppMessageAnimationFactory customInAppMessageAnimationFactory;
    private IInAppMessageManagerListener customInAppMessageManagerListener;
    private IInAppMessageViewFactory customInAppMessageViewFactory;
    private IInAppMessageViewWrapperFactory customInAppMessageViewWrapperFactory;
    private final IHtmlInAppMessageActionListener defaultHtmlInAppMessageActionListener;
    private final IInAppMessageManagerListener defaultInAppMessageManagerListener;
    private final IInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory;
    private boolean doesBackButtonDismissInAppMessageViewField = true;
    private boolean doesClickOutsideModalViewDismissInAppMessageViewField;
    private final IInAppMessageAnimationFactory inAppMessageAnimationFactoryField;
    private final IInAppMessageViewFactory inAppMessageFullViewFactory;
    private final IInAppMessageViewFactory inAppMessageHtmlFullViewFactory;
    private final IInAppMessageViewFactory inAppMessageHtmlViewFactory;
    private final IInAppMessageViewFactory inAppMessageModalViewFactory;
    private final IInAppMessageViewFactory inAppMessageSlideupViewFactory;
    private final IInAppMessageWebViewClientListener inAppMessageWebViewClientListener;
    protected WeakReference<Activity> mActivity;
    protected Context mApplicationContext;
    private boolean shouldNextUnregisterBeSkipped;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageType.values().length];
            try {
                iArr[MessageType.SLIDEUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageType.MODAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageType.FULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageType.HTML_FULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MessageType.HTML.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public InAppMessageManagerBase() {
        DefaultInAppMessageWebViewClientListener defaultInAppMessageWebViewClientListener = new DefaultInAppMessageWebViewClientListener();
        this.inAppMessageWebViewClientListener = defaultInAppMessageWebViewClientListener;
        this.defaultHtmlInAppMessageActionListener = new DefaultHtmlInAppMessageActionListener();
        this.inAppMessageSlideupViewFactory = new DefaultInAppMessageSlideupViewFactory();
        this.inAppMessageModalViewFactory = new DefaultInAppMessageModalViewFactory();
        this.inAppMessageFullViewFactory = new DefaultInAppMessageFullViewFactory();
        this.inAppMessageHtmlFullViewFactory = new DefaultInAppMessageHtmlFullViewFactory(defaultInAppMessageWebViewClientListener);
        this.inAppMessageHtmlViewFactory = new DefaultInAppMessageHtmlViewFactory(defaultInAppMessageWebViewClientListener);
        this.inAppMessageAnimationFactoryField = new DefaultInAppMessageAnimationFactory();
        this.defaultInAppMessageManagerListener = new DefaultInAppMessageManagerListener();
        this.defaultInAppMessageViewWrapperFactory = new DefaultInAppMessageViewWrapperFactory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_shouldNextUnregisterBeSkipped_$lambda$0(boolean z) {
        return "Setting setShouldNextUnregisterBeSkipped to " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getDefaultInAppMessageViewFactory$lambda$0(IInAppMessage iInAppMessage) {
        return "Failed to find view factory for in-app message with type: " + iInAppMessage.getMessageType();
    }

    public Activity getActivity() {
        WeakReference<Activity> weakReference = this.mActivity;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: getApplicationContext, reason: from getter */
    public Context getMApplicationContext() {
        return this.mApplicationContext;
    }

    public IInAppMessageManagerListener getControlInAppMessageManagerListener() {
        IInAppMessageManagerListener iInAppMessageManagerListener = this.customControlInAppMessageManagerListener;
        return iInAppMessageManagerListener == null ? this.defaultInAppMessageManagerListener : iInAppMessageManagerListener;
    }

    public IInAppMessageViewFactory getDefaultInAppMessageViewFactory(IInAppMessage inAppMessage) {
        inAppMessage.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[inAppMessage.getMessageType().ordinal()];
        if (i == 1) {
            return this.inAppMessageSlideupViewFactory;
        }
        if (i == 2) {
            return this.inAppMessageModalViewFactory;
        }
        if (i == 3) {
            return this.inAppMessageFullViewFactory;
        }
        if (i == 4) {
            return this.inAppMessageHtmlFullViewFactory;
        }
        if (i == 5) {
            return this.inAppMessageHtmlViewFactory;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new InAppMessageManagerBase$$ExternalSyntheticLambda1(inAppMessage, 0), 6, (Object) null);
        return null;
    }

    /* renamed from: getDoesBackButtonDismissInAppMessageView, reason: from getter */
    public boolean getDoesBackButtonDismissInAppMessageViewField() {
        return this.doesBackButtonDismissInAppMessageViewField;
    }

    /* renamed from: getDoesClickOutsideModalViewDismissInAppMessageView, reason: from getter */
    public boolean getDoesClickOutsideModalViewDismissInAppMessageViewField() {
        return this.doesClickOutsideModalViewDismissInAppMessageViewField;
    }

    public IHtmlInAppMessageActionListener getHtmlInAppMessageActionListener() {
        IHtmlInAppMessageActionListener iHtmlInAppMessageActionListener = this.customHtmlInAppMessageActionListener;
        return iHtmlInAppMessageActionListener == null ? this.defaultHtmlInAppMessageActionListener : iHtmlInAppMessageActionListener;
    }

    public IInAppMessageAnimationFactory getInAppMessageAnimationFactory() {
        IInAppMessageAnimationFactory iInAppMessageAnimationFactory = this.customInAppMessageAnimationFactory;
        return iInAppMessageAnimationFactory == null ? this.inAppMessageAnimationFactoryField : iInAppMessageAnimationFactory;
    }

    public IInAppMessageManagerListener getInAppMessageManagerListener() {
        IInAppMessageManagerListener iInAppMessageManagerListener = this.customInAppMessageManagerListener;
        return iInAppMessageManagerListener == null ? this.defaultInAppMessageManagerListener : iInAppMessageManagerListener;
    }

    public IInAppMessageViewFactory getInAppMessageViewFactory(IInAppMessage inAppMessage) {
        inAppMessage.getClass();
        IInAppMessageViewFactory iInAppMessageViewFactory = this.customInAppMessageViewFactory;
        return iInAppMessageViewFactory == null ? getDefaultInAppMessageViewFactory(inAppMessage) : iInAppMessageViewFactory;
    }

    public IInAppMessageViewWrapperFactory getInAppMessageViewWrapperFactory() {
        IInAppMessageViewWrapperFactory iInAppMessageViewWrapperFactory = this.customInAppMessageViewWrapperFactory;
        return iInAppMessageViewWrapperFactory == null ? this.defaultInAppMessageViewWrapperFactory : iInAppMessageViewWrapperFactory;
    }

    public boolean getShouldNextUnregisterBeSkipped() {
        return this.shouldNextUnregisterBeSkipped;
    }

    public void setShouldNextUnregisterBeSkipped(boolean z) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda34(z, 9), 7, (Object) null);
        this.shouldNextUnregisterBeSkipped = z;
    }
}

package com.braze.ui.inappmessage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.view.animation.Animation;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.d0$$ExternalSyntheticLambda6;
import bo.app.g6$$ExternalSyntheticLambda17;
import bo.app.t7$$ExternalSyntheticLambda4;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.inappmessage.Orientation;
import com.braze.events.BrazeUserChangeEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.InAppMessageEvent;
import com.braze.events.SdkDataWipeEvent;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageHtml;
import com.braze.models.inappmessage.InAppMessageImmersiveBase;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import com.braze.support.PermissionUtils;
import com.braze.support.c$$ExternalSyntheticLambda2;
import com.braze.ui.actions.brazeactions.BrazeActionUtils;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener;
import com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer;
import com.braze.ui.inappmessage.views.IInAppMessageBackEventListener;
import com.braze.ui.inappmessage.views.IInAppMessageImmersiveView;
import com.braze.ui.inappmessage.views.IInAppMessageView;
import com.braze.ui.inappmessage.views.InAppMessageFullView;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView;
import com.braze.ui.support.ViewUtils;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0017\u0018\u0000 X2\u00020\u0001:\u0001XB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0003J \u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b!\u0010\"J#\u0010%\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010$\u001a\u0004\u0018\u00010#H\u0017¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u001cH\u0002¢\u0006\u0004\b(\u0010\u001fR\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010-\u001a\u00020,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u0012\u0004\b/\u0010\u0003R&\u00101\u001a\b\u0012\u0004\u0012\u00020\u000e008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b5\u0010\u0003\u001a\u0004\b3\u00104R#\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020'068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001e\u0010;\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001e\u0010>\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010<R\u001e\u0010?\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010<R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010LR*\u0010M\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bM\u0010N\u0012\u0004\bR\u0010\u0003\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010\u0011R*\u0010S\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bS\u0010N\u0012\u0004\bV\u0010\u0003\u001a\u0004\bT\u0010P\"\u0004\bU\u0010\u0011R\u0011\u0010W\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\bW\u0010\u0014¨\u0006Y"}, d2 = {"Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "Lcom/braze/ui/inappmessage/InAppMessageManagerBase;", "<init>", "()V", "Landroid/content/Context;", "context", "", "ensureSubscribedToInAppMessageEvents", "(Landroid/content/Context;)V", "Landroid/app/Activity;", "activity", "registerInAppMessageManager", "(Landroid/app/Activity;)V", "unregisterInAppMessageManager", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "addInAppMessage", "(Lcom/braze/models/inappmessage/IInAppMessage;)V", "", "requestDisplayInAppMessage", "()Z", "dismissed", "hideCurrentlyDisplayingInAppMessage", "(Z)V", "resetAfterInAppMessageClose", "isCarryOver", "displayInAppMessage", "(Lcom/braze/models/inappmessage/IInAppMessage;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/braze/events/IEventSubscriber;", "Lcom/braze/events/BrazeUserChangeEvent;", "createBrazeUserChangeEventSubscriber$android_sdk_ui_release", "()Lcom/braze/events/IEventSubscriber;", "createBrazeUserChangeEventSubscriber", "verifyOrientationStatus", "(Lcom/braze/models/inappmessage/IInAppMessage;)Z", "", "currentUserId", "isInAppMessageForTheSameUser", "(Lcom/braze/models/inappmessage/IInAppMessage;Ljava/lang/String;)Z", "Lcom/braze/events/InAppMessageEvent;", "createInAppMessageEventSubscriber", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;", "inAppMessageViewLifecycleListener", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "displayingInAppMessage", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getDisplayingInAppMessage$annotations", "Ljava/util/Stack;", "inAppMessageStack", "Ljava/util/Stack;", "getInAppMessageStack", "()Ljava/util/Stack;", "getInAppMessageStack$annotations", "", "inAppMessageEventMap", "Ljava/util/Map;", "getInAppMessageEventMap", "()Ljava/util/Map;", "inAppMessageEventSubscriber", "Lcom/braze/events/IEventSubscriber;", "Lcom/braze/events/SdkDataWipeEvent;", "sdkDataWipeEventSubscriber", "brazeUserChangeEventSubscriber", "", "originalOrientation", "Ljava/lang/Integer;", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "Lcom/braze/ui/inappmessage/IInAppMessageViewWrapper;", "inAppMessageViewWrapper", "Lcom/braze/ui/inappmessage/IInAppMessageViewWrapper;", "Lcom/braze/ui/inappmessage/InAppMessageBackEventHandler;", "currentBackEventHandler", "Lcom/braze/ui/inappmessage/InAppMessageBackEventHandler;", "Ljava/lang/String;", "carryoverInAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "getCarryoverInAppMessage", "()Lcom/braze/models/inappmessage/IInAppMessage;", "setCarryoverInAppMessage", "getCarryoverInAppMessage$annotations", "unregisteredInAppMessage", "getUnregisteredInAppMessage", "setUnregisteredInAppMessage", "getUnregisteredInAppMessage$annotations", "isCurrentlyDisplayingInAppMessage", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public class BrazeInAppMessageManager extends InAppMessageManagerBase {
    private static volatile BrazeInAppMessageManager instance;
    private IEventSubscriber<BrazeUserChangeEvent> brazeUserChangeEventSubscriber;
    private IInAppMessage carryoverInAppMessage;
    private BrazeConfigurationProvider configurationProvider;
    private InAppMessageBackEventHandler currentBackEventHandler;
    private String currentUserId;
    private IEventSubscriber<InAppMessageEvent> inAppMessageEventSubscriber;
    private IInAppMessageViewWrapper inAppMessageViewWrapper;
    private Integer originalOrientation;
    private IEventSubscriber<SdkDataWipeEvent> sdkDataWipeEventSubscriber;
    private IInAppMessage unregisteredInAppMessage;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ReentrantLock instanceLock = new ReentrantLock();
    private final IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener = new DefaultInAppMessageViewLifecycleListener();
    public final AtomicBoolean displayingInAppMessage = new AtomicBoolean(false);
    private final Stack<IInAppMessage> inAppMessageStack = new Stack<>();
    private final Map<IInAppMessage, InAppMessageEvent> inAppMessageEventMap = new LinkedHashMap();

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InAppMessageOperation.values().length];
            try {
                iArr[InAppMessageOperation.DISPLAY_NOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InAppMessageOperation.DISPLAY_LATER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InAppMessageOperation.DISCARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InAppMessageOperation.REENQUEUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createBrazeUserChangeEventSubscriber$lambda$0(BrazeInAppMessageManager brazeInAppMessageManager, BrazeUserChangeEvent brazeUserChangeEvent) {
        brazeUserChangeEvent.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeInAppMessageManager, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new d0$$ExternalSyntheticLambda6(brazeUserChangeEvent, 2), 6, (Object) null);
        String str = brazeInAppMessageManager.currentUserId;
        brazeInAppMessageManager.currentUserId = brazeUserChangeEvent.getCurrentUserId();
        if (str == null || str.equals(brazeUserChangeEvent.getCurrentUserId())) {
            return;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeInAppMessageManager, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new t7$$ExternalSyntheticLambda4(22, str, brazeUserChangeEvent), 7, (Object) null);
        if (brazeInAppMessageManager.displayingInAppMessage.get()) {
            brazeInAppMessageManager.hideCurrentlyDisplayingInAppMessage(false);
        }
        brazeInAppMessageManager.inAppMessageStack.clear();
        brazeInAppMessageManager.inAppMessageEventMap.clear();
        brazeInAppMessageManager.carryoverInAppMessage = null;
        brazeInAppMessageManager.unregisteredInAppMessage = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createBrazeUserChangeEventSubscriber$lambda$0$0(BrazeUserChangeEvent brazeUserChangeEvent) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InAppMessage manager handling user change event. New user id: '", brazeUserChangeEvent.getCurrentUserId(), "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createBrazeUserChangeEventSubscriber$lambda$0$1(String str, BrazeUserChangeEvent brazeUserChangeEvent) {
        return Boxes$$ExternalSyntheticOutline1.m("User changed from '", str, "' to '", brazeUserChangeEvent.getCurrentUserId(), "'. Clearing in-app message state.");
    }

    private final IEventSubscriber<InAppMessageEvent> createInAppMessageEventSubscriber() {
        return new BrazeInAppMessageManager$$ExternalSyntheticLambda40(this, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createInAppMessageEventSubscriber$lambda$0(BrazeInAppMessageManager brazeInAppMessageManager, InAppMessageEvent inAppMessageEvent) {
        inAppMessageEvent.getClass();
        IInAppMessage inAppMessage = inAppMessageEvent.getInAppMessage();
        brazeInAppMessageManager.inAppMessageEventMap.put(inAppMessage, inAppMessageEvent);
        brazeInAppMessageManager.addInAppMessage(inAppMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$0(IInAppMessage iInAppMessage) {
        return Recorder$$ExternalSyntheticOutline2.m("Attempting to display in-app message with payload: ", JsonUtils.getPrettyPrintedString(iInAppMessage.getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$1() {
        return "A in-app message is currently being displayed. Adding in-app message back on the stack.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$10() {
        return "Creating view wrapper for in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$11() {
        return "In-app message view includes HTML. Delaying display until the content has finished loading.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void displayInAppMessage$lambda$12(IInAppMessageViewWrapper iInAppMessageViewWrapper, BrazeInAppMessageManager brazeInAppMessageManager, Activity activity) {
        if (iInAppMessageViewWrapper != null) {
            try {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda4(4), 7, (Object) null);
                iInAppMessageViewWrapper.open(activity);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda4(5), 4, (Object) null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$12$0() {
        return "Page has finished loading. Opening in-app message view wrapper.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$12$1() {
        return "Failed to open view wrapper in page finished listener";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$13(IInAppMessage iInAppMessage) {
        return Recorder$$ExternalSyntheticOutline2.m("Could not display in-app message with payload: ", JsonUtils.getPrettyPrintedString(iInAppMessage.getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$2() {
        return "Expiration timestamp not defined. Continuing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$3() {
        return "Not displaying control in-app message. Logging impression and ending display execution.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$4() {
        return "Cannot show message containing an invalid Braze Action.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$5() {
        return "Attempting to perform any fallback actions.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$6() {
        return "Cannot show message containing a Push Prompt due to existing push prompt status, Android API version, or Target SDK level.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$7() {
        return "Attempting to perform any fallback actions.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$8() {
        return "Creating view wrapper for immersive in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$9() {
        return "Creating view wrapper for base in-app message.";
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:57|(1:58)|(7:111|112|113|114|115|116|117)(4:60|61|62|(5:64|65|66|67|68)(16:92|93|94|95|96|97|98|99|100|70|71|(3:73|74|75)(2:84|(1:86))|76|(1:80)|81|82))|69|70|71|(0)(0)|76|(2:78|80)|81|82) */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0276, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0257 A[Catch: all -> 0x0276, TRY_LEAVE, TryCatch #3 {all -> 0x0276, blocks: (B:71:0x0251, B:73:0x0257), top: B:70:0x0251 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x027a  */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.braze.ui.inappmessage.IInAppMessageViewWrapperFactory] */
    /* JADX WARN: Type inference failed for: r1v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object displayInAppMessage$suspendImpl(BrazeInAppMessageManager brazeInAppMessageManager, IInAppMessage iInAppMessage, boolean z, Continuation<? super Unit> continuation) {
        Throwable th;
        BrazeInAppMessageManager brazeInAppMessageManager2;
        Activity activity;
        BrazeInAppMessageManager brazeInAppMessageManager3;
        BrazeLogger brazeLogger;
        IInAppMessageViewWrapper createInAppMessageViewWrapper;
        View view;
        IInAppMessageViewWrapper iInAppMessageViewWrapper;
        InAppMessageHtmlBaseView inAppMessageHtmlBaseView;
        BrazeInAppMessageManager brazeInAppMessageManager4;
        BrazeInAppMessageManager brazeInAppMessageManager5;
        IInAppMessage iInAppMessage2 = iInAppMessage;
        BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
        BrazeInAppMessageManager brazeInAppMessageManager6 = brazeInAppMessageManager;
        BrazeLogger.brazelog$default(brazeLogger2, (Object) brazeInAppMessageManager6, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new InAppMessageManagerBase$$ExternalSyntheticLambda1(iInAppMessage2, 2), 6, (Object) null);
        if (!brazeInAppMessageManager6.displayingInAppMessage.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(brazeLogger2, (Object) brazeInAppMessageManager6, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda1(13), 7, (Object) null);
            brazeInAppMessageManager6.inAppMessageStack.push(iInAppMessage2);
            return Unit.INSTANCE;
        }
        try {
            WeakReference<Activity> weakReference = brazeInAppMessageManager6.mActivity;
            activity = weakReference != null ? weakReference.get() : null;
        } catch (Throwable th2) {
            th = th2;
        }
        if (activity == null) {
            brazeInAppMessageManager6.carryoverInAppMessage = iInAppMessage2;
            throw new Exception("No Activity is currently registered to receive in-app messages. Registering in-app message as carry-over in-app message. It will automatically be displayed when the next Activity registers to receive in-app messages.");
        }
        long expirationTimestamp = iInAppMessage2.getExpirationTimestamp();
        if (expirationTimestamp > 0) {
            long nowInMilliseconds = DateTimeUtils.nowInMilliseconds();
            if (nowInMilliseconds > expirationTimestamp) {
                throw new Exception("In-app message is expired. Doing nothing. Expiration: " + expirationTimestamp + ". Current time: " + nowInMilliseconds);
            }
        } else {
            BrazeLogger.brazelog$default(brazeLogger2, (Object) brazeInAppMessageManager6, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda1(14), 7, (Object) null);
        }
        if (!brazeInAppMessageManager.verifyOrientationStatus(iInAppMessage)) {
            throw new Exception("Current orientation did not match specified orientation for in-app message. Doing nothing.");
        }
        BrazeConfigurationProvider brazeConfigurationProvider = brazeInAppMessageManager6.configurationProvider;
        if (brazeConfigurationProvider == null) {
            throw new Exception("configurationProvider is null. The in-app message will not be displayed and will not beput back on the stack.");
        }
        if (!brazeInAppMessageManager6.isInAppMessageForTheSameUser(iInAppMessage2, brazeInAppMessageManager6.currentUserId)) {
            String str = brazeInAppMessageManager6.currentUserId;
            InAppMessageEvent inAppMessageEvent = brazeInAppMessageManager6.inAppMessageEventMap.get(iInAppMessage2);
            throw new Exception("The last identified user '" + str + "' does not match the incoming in-app message's user '" + (inAppMessageEvent != null ? inAppMessageEvent.getUserId() : null) + "'. The in-app message will not be displayed and will not be put back on the stack.");
        }
        if (iInAppMessage2.isControl()) {
            BrazeLogger.brazelog$default(brazeLogger2, (Object) brazeInAppMessageManager6, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda1(15), 7, (Object) null);
            iInAppMessage2.logImpression();
            brazeInAppMessageManager6.resetAfterInAppMessageClose();
            return Unit.INSTANCE;
        }
        try {
        } catch (Throwable th3) {
            th = th3;
            brazeInAppMessageManager6 = brazeInAppMessageManager;
        }
        if (BrazeActionUtils.containsInvalidBrazeAction(iInAppMessage2)) {
            InAppMessageEvent inAppMessageEvent2 = brazeInAppMessageManager6.inAppMessageEventMap.get(iInAppMessage2);
            BrazeLogger.Priority priority = BrazeLogger.Priority.I;
            BrazeLogger.brazelog$default(brazeLogger2, (Object) brazeInAppMessageManager6, priority, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda1(16), 6, (Object) null);
            if (inAppMessageEvent2 != null) {
                brazeInAppMessageManager5 = brazeInAppMessageManager;
                BrazeLogger.brazelog$default(brazeLogger2, (Object) brazeInAppMessageManager5, priority, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda1(17), 6, (Object) null);
                Context applicationContext = activity.getApplicationContext();
                applicationContext.getClass();
                BrazeInternal.retryInAppMessage(applicationContext, inAppMessageEvent2);
            } else {
                brazeInAppMessageManager5 = brazeInAppMessageManager;
            }
            brazeInAppMessageManager5.resetAfterInAppMessageClose();
            return Unit.INSTANCE;
        }
        if (INSTANCE.containsPushPermissionPrompt(iInAppMessage2) && !PermissionUtils.wouldPushPermissionPromptDisplay(activity)) {
            InAppMessageEvent inAppMessageEvent3 = brazeInAppMessageManager6.inAppMessageEventMap.get(iInAppMessage2);
            BrazeLogger.Priority priority2 = BrazeLogger.Priority.I;
            BrazeLogger.brazelog$default(brazeLogger2, (Object) brazeInAppMessageManager6, priority2, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda1(18), 6, (Object) null);
            if (inAppMessageEvent3 != null) {
                BrazeLogger.brazelog$default(brazeLogger2, (Object) brazeInAppMessageManager, priority2, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda1(19), 6, (Object) null);
                Context applicationContext2 = activity.getApplicationContext();
                applicationContext2.getClass();
                BrazeInternal.retryInAppMessage(applicationContext2, inAppMessageEvent3);
            }
            brazeInAppMessageManager.resetAfterInAppMessageClose();
            return Unit.INSTANCE;
        }
        IInAppMessageViewFactory inAppMessageViewFactory = brazeInAppMessageManager.getInAppMessageViewFactory(iInAppMessage);
        if (inAppMessageViewFactory == null) {
            throw new Exception("ViewFactory from getInAppMessageViewFactory was null.");
        }
        ?? createInAppMessageView = inAppMessageViewFactory.createInAppMessageView(activity, iInAppMessage2);
        if (createInAppMessageView == 0) {
            throw new Exception("The in-app message view returned from the IInAppMessageViewFactory was null. The in-app message will not be displayed and will not be put back on the stack.");
        }
        if (createInAppMessageView.getParent() != null) {
            throw new Exception("The in-app message view returned from the IInAppMessageViewFactory already has a parent. This is a sign that the view is being reused. The IInAppMessageViewFactory method createInAppMessageViewmust return a new view without a parent. The in-app message will not be displayed and will not be put back on the stack.");
        }
        Animation openingAnimation = brazeInAppMessageManager.getInAppMessageAnimationFactory().getOpeningAnimation(iInAppMessage2);
        Animation closingAnimation = brazeInAppMessageManager.getInAppMessageAnimationFactory().getClosingAnimation(iInAppMessage2);
        ?? inAppMessageViewWrapperFactory = brazeInAppMessageManager.getInAppMessageViewWrapperFactory();
        ?? r1 = createInAppMessageView instanceof IInAppMessageImmersiveView;
        try {
            try {
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            brazeInAppMessageManager6 = r1;
        }
        if (r1 != 0) {
            try {
                BrazeLogger.brazelog$default(brazeLogger2, (Object) brazeInAppMessageManager, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda1(20), 7, (Object) null);
                brazeLogger = brazeLogger2;
                brazeInAppMessageManager3 = brazeInAppMessageManager;
                IInAppMessageImmersiveView iInAppMessageImmersiveView = (IInAppMessageImmersiveView) createInAppMessageView;
                View view2 = createInAppMessageView;
                createInAppMessageViewWrapper = inAppMessageViewWrapperFactory.createInAppMessageViewWrapper(view2, iInAppMessage2, brazeInAppMessageManager3.inAppMessageViewLifecycleListener, brazeConfigurationProvider, openingAnimation, closingAnimation, iInAppMessageImmersiveView.getMessageClickableView(), iInAppMessageImmersiveView.getMessageButtonViews(((InAppMessageImmersiveBase) iInAppMessage2).getMessageButtons().size()), iInAppMessageImmersiveView.getMessageCloseButtonView());
                view = view2;
                r1 = view2;
            } catch (Throwable th6) {
                th = th6;
                brazeInAppMessageManager3 = brazeInAppMessageManager;
                iInAppMessage2 = iInAppMessage;
                th = th;
                brazeInAppMessageManager2 = brazeInAppMessageManager3;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager2, BrazeLogger.Priority.E, th, false, (Function0) new InAppMessageManagerBase$$ExternalSyntheticLambda1(iInAppMessage2, 3), 4, (Object) null);
                brazeInAppMessageManager.resetAfterInAppMessageClose();
                return Unit.INSTANCE;
            }
        } else {
            brazeInAppMessageManager3 = brazeInAppMessageManager;
            brazeLogger = brazeLogger2;
            try {
            } catch (Throwable th7) {
                th = th7;
                iInAppMessage2 = iInAppMessage;
            }
            if (!(createInAppMessageView instanceof IInAppMessageView)) {
                BrazeInAppMessageManager brazeInAppMessageManager7 = brazeInAppMessageManager3;
                try {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) brazeInAppMessageManager7, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda1(11), 7, (Object) null);
                    try {
                        IInAppMessageViewWrapper createInAppMessageViewWrapper2 = inAppMessageViewWrapperFactory.createInAppMessageViewWrapper(createInAppMessageView, iInAppMessage, brazeInAppMessageManager3.inAppMessageViewLifecycleListener, brazeConfigurationProvider, openingAnimation, closingAnimation, createInAppMessageView);
                        inAppMessageHtmlBaseView = createInAppMessageView;
                        iInAppMessage2 = iInAppMessage;
                        iInAppMessageViewWrapper = createInAppMessageViewWrapper2;
                        brazeInAppMessageManager3.inAppMessageViewWrapper = iInAppMessageViewWrapper;
                        if (inAppMessageHtmlBaseView instanceof InAppMessageHtmlBaseView) {
                            brazeInAppMessageManager4 = brazeInAppMessageManager3;
                            if (iInAppMessageViewWrapper != null) {
                                iInAppMessageViewWrapper.open(activity);
                            }
                        } else {
                            brazeInAppMessageManager4 = brazeInAppMessageManager3;
                            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeInAppMessageManager4, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda1(12), 7, (Object) null);
                            inAppMessageHtmlBaseView.setHtmlPageFinishedListener(new PreviewView$1$$ExternalSyntheticLambda2(7, iInAppMessageViewWrapper, brazeInAppMessageManager4, activity));
                        }
                        if ((inAppMessageHtmlBaseView instanceof InAppMessageFullView) && Build.VERSION.SDK_INT >= 34) {
                            brazeInAppMessageManager4.currentBackEventHandler = new InAppMessageBackEventHandler(activity, (IInAppMessageBackEventListener) inAppMessageHtmlBaseView);
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        iInAppMessage2 = iInAppMessage;
                        brazeInAppMessageManager6 = brazeInAppMessageManager3;
                        th = th;
                        brazeInAppMessageManager2 = brazeInAppMessageManager6;
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager2, BrazeLogger.Priority.E, th, false, (Function0) new InAppMessageManagerBase$$ExternalSyntheticLambda1(iInAppMessage2, 3), 4, (Object) null);
                        brazeInAppMessageManager.resetAfterInAppMessageClose();
                        return Unit.INSTANCE;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    brazeInAppMessageManager6 = brazeInAppMessageManager7;
                    iInAppMessage2 = iInAppMessage;
                    th = th;
                    brazeInAppMessageManager2 = brazeInAppMessageManager6;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager2, BrazeLogger.Priority.E, th, false, (Function0) new InAppMessageManagerBase$$ExternalSyntheticLambda1(iInAppMessage2, 3), 4, (Object) null);
                    brazeInAppMessageManager.resetAfterInAppMessageClose();
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeInAppMessageManager3, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda1(21), 7, (Object) null);
            View view3 = createInAppMessageView;
            createInAppMessageViewWrapper = inAppMessageViewWrapperFactory.createInAppMessageViewWrapper(view3, iInAppMessage, brazeInAppMessageManager3.inAppMessageViewLifecycleListener, brazeConfigurationProvider, openingAnimation, closingAnimation, ((IInAppMessageView) createInAppMessageView).getMessageClickableView());
            view = view3;
            r1 = view3;
        }
        iInAppMessageViewWrapper = createInAppMessageViewWrapper;
        inAppMessageHtmlBaseView = view;
        iInAppMessage2 = iInAppMessage;
        brazeInAppMessageManager3.inAppMessageViewWrapper = iInAppMessageViewWrapper;
        if (inAppMessageHtmlBaseView instanceof InAppMessageHtmlBaseView) {
        }
        if (inAppMessageHtmlBaseView instanceof InAppMessageFullView) {
            brazeInAppMessageManager4.currentBackEventHandler = new InAppMessageBackEventHandler(activity, (IInAppMessageBackEventListener) inAppMessageHtmlBaseView);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureSubscribedToInAppMessageEvents$lambda$0() {
        return "Removing existing in-app message event subscriber before subscribing a new one.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureSubscribedToInAppMessageEvents$lambda$1() {
        return "Subscribing in-app message event subscriber";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureSubscribedToInAppMessageEvents$lambda$3() {
        return "Removing existing sdk data wipe event subscriber before subscribing a new one.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureSubscribedToInAppMessageEvents$lambda$4() {
        return "Subscribing sdk data wipe subscriber";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ensureSubscribedToInAppMessageEvents$lambda$5(BrazeInAppMessageManager brazeInAppMessageManager, SdkDataWipeEvent sdkDataWipeEvent) {
        sdkDataWipeEvent.getClass();
        if (brazeInAppMessageManager.displayingInAppMessage.get()) {
            brazeInAppMessageManager.hideCurrentlyDisplayingInAppMessage(false);
        }
        brazeInAppMessageManager.inAppMessageStack.clear();
        brazeInAppMessageManager.carryoverInAppMessage = null;
        brazeInAppMessageManager.unregisteredInAppMessage = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureSubscribedToInAppMessageEvents$lambda$7() {
        return "Removing existing user change event subscriber before subscribing a new one.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$0() {
        return "Null Activity passed to registerInAppMessageManager. Doing nothing";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$1(Activity activity) {
        return Recorder$$ExternalSyntheticOutline2.m("Registering InAppMessageManager with activity: ", activity.getLocalClassName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$2() {
        return "Activity had null applicationContext in registerInAppMessageManager. Doing Nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$4$0() {
        return "Requesting display of carryover in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$5$0() {
        return "Adding previously unregistered in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$7() {
        return "Error while calling attempting to register the InAppMessageManager";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$0() {
        return "No activity is currently registered to receive in-app messages. Saving in-app message as unregistered in-app message. It will automatically be displayed when the next activity registers to receive in-app messages.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$1() {
        return "No activity is currently registered to receive in-app messages and the in-app message stack is empty. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$10() {
        return "Error running requestDisplayInAppMessage";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$2() {
        return "A in-app message is currently being displayed. Ignoring request to display in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$3() {
        return "The in-app message stack is empty. No in-app message will be displayed.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$4() {
        return "Using the control in-app message manager listener.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$5() {
        return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_NOW. The in-app message will be displayed.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$6() {
        return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_LATER. The in-app message will be pushed back onto the stack.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$7() {
        return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISCARD. The in-app message will not be displayed and will not be put back on the stack.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$8() {
        return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned REENQUEUE. The in-app message will not be displayed and will be marked as eligible for next time.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$9(IInAppMessage iInAppMessage) {
        return "An in-app message was requested to be re-enqueued, but it was not found. Discarding instead. In-app message = " + iInAppMessage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resetAfterInAppMessageClose$lambda$0() {
        return "Resetting after in-app message close.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resetAfterInAppMessageClose$lambda$1(Integer num) {
        return "Setting requested orientation to original orientation " + num;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterInAppMessageManager$lambda$0(Activity activity) {
        return Recorder$$ExternalSyntheticOutline2.m("Skipping unregistration due to setShouldNextUnregisterBeSkipped being true. Activity: ", activity != null ? activity.getLocalClassName() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterInAppMessageManager$lambda$1() {
        return "Null Activity passed to unregisterInAppMessageManager.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterInAppMessageManager$lambda$2(Activity activity) {
        return Recorder$$ExternalSyntheticOutline2.m("Unregistering InAppMessageManager from activity: ", activity.getLocalClassName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterInAppMessageManager$lambda$3() {
        return "In-app message view includes HTML. Removing the page finished listener.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterInAppMessageManager$lambda$4() {
        return "Error while calling attempting to unregister the InAppMessageManager";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyOrientationStatus$lambda$0() {
        return "Cannot verify orientation status with null Activity.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyOrientationStatus$lambda$1() {
        return "Running on tablet. In-app message can be displayed in any orientation.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyOrientationStatus$lambda$2() {
        return "Any orientation specified. In-app message can be displayed in any orientation.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyOrientationStatus$lambda$3() {
        return "Requesting orientation lock.";
    }

    public void addInAppMessage(IInAppMessage inAppMessage) {
        if (inAppMessage != null) {
            this.inAppMessageStack.push(inAppMessage);
            requestDisplayInAppMessage();
        }
    }

    public final IEventSubscriber<BrazeUserChangeEvent> createBrazeUserChangeEventSubscriber$android_sdk_ui_release() {
        return new BrazeInAppMessageManager$$ExternalSyntheticLambda40(this, 1);
    }

    public Object displayInAppMessage(IInAppMessage iInAppMessage, boolean z, Continuation<? super Unit> continuation) {
        return displayInAppMessage$suspendImpl(this, iInAppMessage, z, continuation);
    }

    public void ensureSubscribedToInAppMessageEvents(Context context) {
        context.getClass();
        if (this.inAppMessageEventSubscriber != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda1(22), 7, (Object) null);
            Braze.INSTANCE.getInstance(context).removeSingleSubscription(this.inAppMessageEventSubscriber, InAppMessageEvent.class);
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda1(23), 7, (Object) null);
        IEventSubscriber<InAppMessageEvent> createInAppMessageEventSubscriber = createInAppMessageEventSubscriber();
        Braze.Companion companion = Braze.INSTANCE;
        companion.getInstance(context).subscribeToNewInAppMessages(createInAppMessageEventSubscriber);
        this.inAppMessageEventSubscriber = createInAppMessageEventSubscriber;
        if (this.sdkDataWipeEventSubscriber != null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda1(24), 6, (Object) null);
            companion.getInstance(context).removeSingleSubscription(this.sdkDataWipeEventSubscriber, SdkDataWipeEvent.class);
        }
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda1(25), 6, (Object) null);
        BrazeInAppMessageManager$$ExternalSyntheticLambda40 brazeInAppMessageManager$$ExternalSyntheticLambda40 = new BrazeInAppMessageManager$$ExternalSyntheticLambda40(this, 0);
        companion.getInstance(context).addSingleSynchronousSubscription(brazeInAppMessageManager$$ExternalSyntheticLambda40, SdkDataWipeEvent.class);
        this.sdkDataWipeEventSubscriber = brazeInAppMessageManager$$ExternalSyntheticLambda40;
        if (this.brazeUserChangeEventSubscriber != null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda1(27), 6, (Object) null);
            companion.getInstance(context).removeSingleSubscription(this.brazeUserChangeEventSubscriber, BrazeUserChangeEvent.class);
        }
        IEventSubscriber<BrazeUserChangeEvent> createBrazeUserChangeEventSubscriber$android_sdk_ui_release = createBrazeUserChangeEventSubscriber$android_sdk_ui_release();
        companion.getInstance(context).subscribeToChangeUserEvents(createBrazeUserChangeEventSubscriber$android_sdk_ui_release);
        this.brazeUserChangeEventSubscriber = createBrazeUserChangeEventSubscriber$android_sdk_ui_release;
    }

    public void hideCurrentlyDisplayingInAppMessage(boolean dismissed) {
        setShouldNextUnregisterBeSkipped(false);
        IInAppMessageViewWrapper iInAppMessageViewWrapper = this.inAppMessageViewWrapper;
        if (iInAppMessageViewWrapper != null) {
            if (dismissed) {
                this.inAppMessageViewLifecycleListener.onDismissed(iInAppMessageViewWrapper.getInAppMessageView(), iInAppMessageViewWrapper.getInAppMessage());
            }
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                iInAppMessageViewWrapper.close();
                return;
            }
            BrazeCoroutineScope brazeCoroutineScope = BrazeCoroutineScope.INSTANCE;
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            JobKt.launch$default(brazeCoroutineScope, MainDispatcherLoader.dispatcher, null, new BrazeInAppMessageManager$hideCurrentlyDisplayingInAppMessage$1(iInAppMessageViewWrapper, null), 2);
        }
    }

    public final boolean isCurrentlyDisplayingInAppMessage() {
        return this.displayingInAppMessage.get();
    }

    public boolean isInAppMessageForTheSameUser(IInAppMessage inAppMessage, String currentUserId) {
        if (inAppMessage != null && currentUserId != null) {
            InAppMessageEvent inAppMessageEvent = this.inAppMessageEventMap.get(inAppMessage);
            String userId = inAppMessageEvent != null ? inAppMessageEvent.getUserId() : null;
            if (userId != null && !userId.equals(currentUserId)) {
                return false;
            }
        }
        return true;
    }

    public void registerInAppMessageManager(Activity activity) {
        try {
            if (activity == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda4(6), 6, (Object) null);
                return;
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda0(2, activity), 6, (Object) null);
            this.mActivity = new WeakReference<>(activity);
            if (this.mApplicationContext == null) {
                Context applicationContext = activity.getApplicationContext();
                this.mApplicationContext = applicationContext;
                if (applicationContext == null) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda4(7), 6, (Object) null);
                    return;
                }
            }
            if (this.configurationProvider == null) {
                Context context = this.mApplicationContext;
                this.configurationProvider = context != null ? new BrazeConfigurationProvider(context) : null;
            }
            IInAppMessage iInAppMessage = this.carryoverInAppMessage;
            if (iInAppMessage != null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda4(8), 7, (Object) null);
                iInAppMessage.setAnimateIn(false);
                BrazeCoroutineScope brazeCoroutineScope = BrazeCoroutineScope.INSTANCE;
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                JobKt.launch$default(brazeCoroutineScope, MainDispatcherLoader.dispatcher, null, new BrazeInAppMessageManager$registerInAppMessageManager$5$2(this, iInAppMessage, null), 2);
                this.carryoverInAppMessage = null;
            } else {
                IInAppMessage iInAppMessage2 = this.unregisteredInAppMessage;
                if (iInAppMessage2 != null) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda4(9), 7, (Object) null);
                    addInAppMessage(iInAppMessage2);
                    this.unregisteredInAppMessage = null;
                }
            }
            Context context2 = this.mApplicationContext;
            if (context2 != null) {
                ensureSubscribedToInAppMessageEvents(context2);
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new c$$ExternalSyntheticLambda2(29), 4, (Object) null);
        }
    }

    public boolean requestDisplayInAppMessage() {
        InAppMessageOperation beforeInAppMessageDisplayed;
        int i = 2;
        try {
            WeakReference<Activity> weakReference = this.mActivity;
            Activity activity = weakReference != null ? weakReference.get() : null;
            int i2 = 3;
            int i3 = 1;
            if (activity == null) {
                if (this.inAppMessageStack.empty()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda1(i2), 7, (Object) null);
                    return false;
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda1(i3), 6, (Object) null);
                this.unregisteredInAppMessage = this.inAppMessageStack.pop();
                return false;
            }
            int i4 = 4;
            if (this.displayingInAppMessage.get()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda1(i4), 7, (Object) null);
                return false;
            }
            if (this.inAppMessageStack.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda1(5), 7, (Object) null);
                return false;
            }
            IInAppMessage pop = this.inAppMessageStack.pop();
            if (pop.isControl()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda1(6), 7, (Object) null);
                beforeInAppMessageDisplayed = getControlInAppMessageManagerListener().beforeInAppMessageDisplayed(pop);
            } else {
                beforeInAppMessageDisplayed = getInAppMessageManagerListener().beforeInAppMessageDisplayed(pop);
            }
            int i5 = WhenMappings.$EnumSwitchMapping$0[beforeInAppMessageDisplayed.ordinal()];
            if (i5 == 1) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda1(7), 7, (Object) null);
                BackgroundInAppMessagePreparer.prepareInAppMessageForDisplay(pop);
                return true;
            }
            if (i5 == 2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda1(8), 7, (Object) null);
                this.inAppMessageStack.push(pop);
                return false;
            }
            if (i5 == 3) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda1(9), 7, (Object) null);
                return false;
            }
            if (i5 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            InAppMessageEvent inAppMessageEvent = this.inAppMessageEventMap.get(pop);
            if (inAppMessageEvent == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new InAppMessageManagerBase$$ExternalSyntheticLambda1(pop, i3), 7, (Object) null);
                return false;
            }
            BrazeInternal brazeInternal = BrazeInternal.INSTANCE;
            Context applicationContext = activity.getApplicationContext();
            applicationContext.getClass();
            brazeInternal.reenqueueInAppMessage(applicationContext, inAppMessageEvent);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda1(10), 7, (Object) null);
            return false;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda1(i), 4, (Object) null);
            return false;
        }
    }

    public void resetAfterInAppMessageClose() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda1(28), 6, (Object) null);
        InAppMessageBackEventHandler inAppMessageBackEventHandler = this.currentBackEventHandler;
        if (inAppMessageBackEventHandler != null) {
            inAppMessageBackEventHandler.unregister();
        }
        this.currentBackEventHandler = null;
        this.inAppMessageViewWrapper = null;
        WeakReference<Activity> weakReference = this.mActivity;
        Activity activity = weakReference != null ? weakReference.get() : null;
        Integer num = this.originalOrientation;
        this.displayingInAppMessage.set(false);
        if (activity == null || num == null) {
            return;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g6$$ExternalSyntheticLambda17(1, num), 7, (Object) null);
        ViewUtils.setActivityRequestedOrientation(activity, num.intValue());
        this.originalOrientation = null;
    }

    public void unregisterInAppMessageManager(Activity activity) {
        IInAppMessage inAppMessage;
        int i = 0;
        try {
            if (getShouldNextUnregisterBeSkipped()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda0(i, activity), 7, (Object) null);
                setShouldNextUnregisterBeSkipped(false);
                return;
            }
            if (activity == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda1(i), 6, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda0(1, activity), 6, (Object) null);
            }
            IInAppMessageViewWrapper iInAppMessageViewWrapper = this.inAppMessageViewWrapper;
            if (iInAppMessageViewWrapper != null) {
                View inAppMessageView = iInAppMessageViewWrapper.getInAppMessageView();
                if (inAppMessageView instanceof InAppMessageHtmlBaseView) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda1(26), 7, (Object) null);
                    ((InAppMessageHtmlBaseView) inAppMessageView).setHtmlPageFinishedListener(null);
                }
                ViewUtils.removeViewFromParent(inAppMessageView);
                if (iInAppMessageViewWrapper.getIsAnimatingClose()) {
                    this.inAppMessageViewLifecycleListener.afterClosed(iInAppMessageViewWrapper.getInAppMessage());
                    inAppMessage = null;
                } else {
                    inAppMessage = iInAppMessageViewWrapper.getInAppMessage();
                }
                this.carryoverInAppMessage = inAppMessage;
                InAppMessageBackEventHandler inAppMessageBackEventHandler = this.currentBackEventHandler;
                if (inAppMessageBackEventHandler != null) {
                    inAppMessageBackEventHandler.unregister();
                }
                this.currentBackEventHandler = null;
                this.inAppMessageViewWrapper = null;
            } else {
                this.carryoverInAppMessage = null;
            }
            this.mActivity = null;
            this.displayingInAppMessage.set(false);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda4(i), 4, (Object) null);
        }
    }

    public boolean verifyOrientationStatus(IInAppMessage inAppMessage) {
        inAppMessage.getClass();
        WeakReference<Activity> weakReference = this.mActivity;
        Activity activity = weakReference != null ? weakReference.get() : null;
        Orientation orientation = inAppMessage.getOrientation();
        int i = 1;
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda1(29), 6, (Object) null);
        } else if (ViewUtils.isRunningOnTablet(activity)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda4(i), 7, (Object) null);
        } else {
            if (orientation != Orientation.ANY) {
                if (!ViewUtils.isCurrentOrientationValid(activity.getResources().getConfiguration().orientation, orientation)) {
                    return false;
                }
                if (this.originalOrientation == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda4(3), 7, (Object) null);
                    this.originalOrientation = Integer.valueOf(activity.getRequestedOrientation());
                    ViewUtils.setActivityRequestedOrientation(activity, 14);
                }
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeInAppMessageManager$$ExternalSyntheticLambda4(2), 7, (Object) null);
        }
        return true;
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/braze/ui/inappmessage/BrazeInAppMessageManager$Companion;", "", "<init>", "()V", "Lcom/braze/models/inappmessage/IInAppMessage;", "", "containsPushPermissionPrompt", "(Lcom/braze/models/inappmessage/IInAppMessage;)Z", "Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "getInstance", "()Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "Ljava/util/concurrent/locks/ReentrantLock;", "instanceLock", "Ljava/util/concurrent/locks/ReentrantLock;", "instance", "Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean containsPushPermissionPrompt(IInAppMessage iInAppMessage) {
            return iInAppMessage instanceof InAppMessageHtml ? ((InAppMessageHtml) iInAppMessage).isPushPrimer() : BrazeActionUtils.containsAnyPushPermissionBrazeActions(iInAppMessage);
        }

        public final BrazeInAppMessageManager getInstance() {
            if (BrazeInAppMessageManager.instance != null) {
                BrazeInAppMessageManager brazeInAppMessageManager = BrazeInAppMessageManager.instance;
                brazeInAppMessageManager.getClass();
                return brazeInAppMessageManager;
            }
            ReentrantLock reentrantLock = BrazeInAppMessageManager.instanceLock;
            reentrantLock.lock();
            try {
                if (BrazeInAppMessageManager.instance == null) {
                    BrazeInAppMessageManager.instance = new BrazeInAppMessageManager();
                }
                reentrantLock.unlock();
                BrazeInAppMessageManager brazeInAppMessageManager2 = BrazeInAppMessageManager.instance;
                brazeInAppMessageManager2.getClass();
                return brazeInAppMessageManager2;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        private Companion() {
        }
    }
}

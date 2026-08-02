package com.plaid.link;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.Fragment;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.plaid.internal.A1;
import com.plaid.internal.A2;
import com.plaid.internal.C0095a6;
import com.plaid.internal.C0104b5;
import com.plaid.internal.C0114c5;
import com.plaid.internal.C0147d3;
import com.plaid.internal.C0157e4;
import com.plaid.internal.C0230m5;
import com.plaid.internal.C0243o0;
import com.plaid.internal.C0252p0;
import com.plaid.internal.C0266q5;
import com.plaid.internal.C0326x3;
import com.plaid.internal.E2;
import com.plaid.internal.EnumC0203j5;
import com.plaid.internal.F6;
import com.plaid.internal.G6;
import com.plaid.internal.H6;
import com.plaid.internal.I2;
import com.plaid.internal.InterfaceC0092a3;
import com.plaid.internal.J5;
import com.plaid.internal.J6;
import com.plaid.internal.N2;
import com.plaid.internal.N5;
import com.plaid.internal.P;
import com.plaid.internal.Q0;
import com.plaid.internal.S4;
import com.plaid.internal.V3;
import com.plaid.internal.V4;
import com.plaid.internal.W4;
import com.plaid.internal.X4;
import com.plaid.internal.Y6;
import com.plaid.internal.Z2;
import com.plaid.internal.link.LinkActivity;
import com.plaid.link.configuration.LinkLogLevel;
import com.plaid.link.configuration.LinkTokenConfiguration;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.exception.LinkConfigurationMalformedLinkTokenException;
import com.plaid.link.exception.LinkException;
import com.plaid.link.result.LinkExit;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007H\u0000¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bj\u0004\u0018\u0001`\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001a\u0010\u001fJ\u0017\u0010$\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b\"\u0010#J\u0019\u0010)\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010%H\u0000¢\u0006\u0004\b'\u0010(J\u0010\u0010,\u001a\u00020\u0006H\u0080@¢\u0006\u0004\b*\u0010+J\r\u0010-\u001a\u00020\u0006¢\u0006\u0004\b-\u0010\u0003J\u001f\u00102\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010/\u001a\u00020.H\u0000¢\u0006\u0004\b0\u00101J\u000f\u00104\u001a\u00020\u0006H\u0000¢\u0006\u0004\b3\u0010\u0003J'\u0010;\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0000¢\u0006\u0004\b9\u0010:J'\u0010=\u001a\u00020\u00062\u0016\u0010<\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007H\u0007¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0006H\u0007¢\u0006\u0004\b?\u0010\u0003JA\u0010H\u001a\u00020G2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020.2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020.0C2\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\bH\u0010IJG\u0010H\u001a\u00020G2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020.2\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\bH\u0010KJ\u001f\u0010M\u001a\u00020L2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010/\u001a\u00020.H\u0007¢\u0006\u0004\bM\u0010NJ+\u0010M\u001a\u00020L2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010/\u001a\u00020.2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%H\u0007¢\u0006\u0004\bM\u0010OJ\u001f\u0010P\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\bP\u00101J\u0017\u0010Q\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\u0006H\u0002¢\u0006\u0004\bS\u0010\u0003J\u0017\u0010T\u001a\u00020\u00192\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bT\u0010UJ\u0017\u0010W\u001a\u00020V2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\u0006H\u0002¢\u0006\u0004\bY\u0010\u0003J\u001f\u0010]\u001a\u00020\u00192\u0006\u0010Z\u001a\u00020V2\u0006\u0010\\\u001a\u00020[H\u0002¢\u0006\u0004\b]\u0010^J\u0017\u0010a\u001a\u00020\u00062\u0006\u0010`\u001a\u00020_H\u0002¢\u0006\u0004\ba\u0010bJ\u0018\u0010d\u001a\u00020\u00062\u0006\u0010c\u001a\u00020.H\u0082@¢\u0006\u0004\bd\u0010eJ\u0017\u0010f\u001a\u00020\u00192\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bf\u0010UJ\u000f\u0010g\u001a\u00020\u0013H\u0002¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020\u0013H\u0002¢\u0006\u0004\bi\u0010hR\"\u0010k\u001a\u00020j8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR \u0010q\u001a\u00020[8\u0006X\u0087D¢\u0006\u0012\n\u0004\bq\u0010r\u0012\u0004\bu\u0010\u0003\u001a\u0004\bs\u0010tR\u0016\u0010w\u001a\u00020v8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bw\u0010xR\u0018\u0010y\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0018\u0010|\u001a\u0004\u0018\u00010{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R&\u0010<\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010~R-\u0010\u007f\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000bj\u0002`\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001¨\u0006\u0081\u0001"}, d2 = {"Lcom/plaid/link/Plaid;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/plaid/link/event/LinkEvent;", "", "Lcom/plaid/link/event/LinkEventListener;", "getCustomerFacingLinkEventListenerInternal$link_sdk_release", "()Lkotlin/jvm/functions/Function1;", "getCustomerFacingLinkEventListenerInternal", "Lkotlin/Function2;", "Lcom/plaid/internal/I2;", "Lcom/plaid/internal/event/QueueableLinkEventListener;", "getLinkEventListenerInternal$link_sdk_release", "()Lkotlin/jvm/functions/Function2;", "getLinkEventListenerInternal", "Landroid/app/Application;", "application", "Lcom/plaid/internal/a3;", "provideLinkTokenComponent$link_sdk_release", "(Landroid/app/Application;)Lcom/plaid/internal/a3;", "provideLinkTokenComponent", "Landroid/app/Activity;", "activity", "", "openLinkInternal$link_sdk_release", "(Landroid/app/Activity;)Z", "openLinkInternal", "Landroidx/fragment/app/Fragment;", BreadcrumbHelper.Category.FRAGMENT, "(Landroidx/fragment/app/Fragment;)Z", "Lcom/plaid/link/SubmissionData;", "submissionData", "submitInternal$link_sdk_release", "(Lcom/plaid/link/SubmissionData;)V", "submitInternal", "Lcom/plaid/link/OnLoadCallback;", "onLoad", "preloadLink$link_sdk_release", "(Lcom/plaid/link/OnLoadCallback;)V", "preloadLink", "awaitPreload$link_sdk_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitPreload", "destroy", "Lcom/plaid/link/configuration/LinkTokenConfiguration;", "linkTokenConfiguration", "createWithoutPreload$link_sdk_release", "(Landroid/app/Application;Lcom/plaid/link/configuration/LinkTokenConfiguration;)V", "createWithoutPreload", "trackSdkOpen$link_sdk_release", "trackSdkOpen", "", "resultCode", "Landroid/os/Parcelable;", "data", "setLinkResultAndFinish$link_sdk_release", "(Landroid/app/Activity;ILandroid/os/Parcelable;)V", "setLinkResultAndFinish", "linkEventListener", "setLinkEventListener", "(Lkotlin/jvm/functions/Function1;)V", "clearLinkEventListener", "Landroid/content/Context;", "context", "config", "Landroidx/activity/result/ActivityResultLauncher;", "activityResultLauncher", "Lcom/plaid/link/result/LinkExit;", "failureCallback", "Landroid/view/View;", "createLinkEmbeddedView", "(Landroid/content/Context;Lcom/plaid/link/configuration/LinkTokenConfiguration;Landroidx/activity/result/ActivityResultLauncher;Lkotlin/jvm/functions/Function1;)Landroid/view/View;", "successCallback", "(Landroid/content/Context;Lcom/plaid/link/configuration/LinkTokenConfiguration;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroid/view/View;", "Lcom/plaid/link/PlaidHandler;", "create", "(Landroid/app/Application;Lcom/plaid/link/configuration/LinkTokenConfiguration;)Lcom/plaid/link/PlaidHandler;", "(Landroid/app/Application;Lcom/plaid/link/configuration/LinkTokenConfiguration;Lcom/plaid/link/OnLoadCallback;)Lcom/plaid/link/PlaidHandler;", "initializeAndCheckPrerequisites", "initialize", "(Landroid/app/Application;)V", "drainLinkEventQueue", "enforceDeviceHasPortrait", "(Landroid/content/Context;)Z", "Lcom/plaid/internal/j5;", "initializeEnvironmentFromTokenOrCrash", "(Lcom/plaid/link/configuration/LinkTokenConfiguration;)Lcom/plaid/internal/j5;", "maybeSendTestCrash", "plaidEnvironment", "", "packageName", "shouldSendTestCrash", "(Lcom/plaid/internal/j5;Ljava/lang/String;)Z", "Lcom/plaid/internal/V3;", "logLevel", "setPlogLevel", "(Lcom/plaid/internal/V3;)V", BreadcrumbHelper.Category.CONFIGURATION, "setLinkConfiguration", "(Lcom/plaid/link/configuration/LinkTokenConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasPortrait", "getOrCreateTokenComponent", "()Lcom/plaid/internal/a3;", "initializeTokenComponentAndRegisterRemoteLogController", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isCreated", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isCreated$link_sdk_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "setCreated$link_sdk_release", "(Ljava/util/concurrent/atomic/AtomicBoolean;)V", "VERSION_NAME", "Ljava/lang/String;", "getVERSION_NAME", "()Ljava/lang/String;", "getVERSION_NAME$annotations", "Lcom/plaid/internal/X4;", "component", "Lcom/plaid/internal/X4;", "tokenComponent", "Lcom/plaid/internal/a3;", "Lkotlinx/coroutines/Job;", "preloadLinkJob", "Lkotlinx/coroutines/Job;", "Lkotlin/jvm/functions/Function1;", "queueableEventListener", "Lkotlin/jvm/functions/Function2;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Plaid {
    private static X4 component;
    private static Job preloadLinkJob;
    private static volatile InterfaceC0092a3 tokenComponent;
    public static final Plaid INSTANCE = new Plaid();
    private static AtomicBoolean isCreated = new AtomicBoolean(false);
    private static final String VERSION_NAME = BuildConfig.LINK_VERSION_NAME;
    private static Function1<? super LinkEvent, Unit> linkEventListener = new Function1<LinkEvent, Unit>() { // from class: com.plaid.link.Plaid$linkEventListener$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((LinkEvent) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(LinkEvent linkEvent) {
            linkEvent.getClass();
        }
    };
    private static Function2<? super LinkEvent, ? super I2, Unit> queueableEventListener = new Function2<LinkEvent, I2, Unit>() { // from class: com.plaid.link.Plaid$queueableEventListener$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((LinkEvent) obj, (I2) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(LinkEvent linkEvent, I2 i2) {
            linkEvent.getClass();
        }
    };

    private Plaid() {
    }

    public static final void clearLinkEventListener() {
        linkEventListener = new Function1<LinkEvent, Unit>() { // from class: com.plaid.link.Plaid$clearLinkEventListener$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LinkEvent) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(LinkEvent linkEvent) {
                linkEvent.getClass();
            }
        };
    }

    public static final PlaidHandler create(Application application, LinkTokenConfiguration linkTokenConfiguration, OnLoadCallback onLoad) {
        application.getClass();
        linkTokenConfiguration.getClass();
        Plaid plaid = INSTANCE;
        plaid.createWithoutPreload$link_sdk_release(application, linkTokenConfiguration);
        plaid.preloadLink$link_sdk_release(onLoad);
        return new PlaidHandler();
    }

    public static /* synthetic */ PlaidHandler create$default(Application application, LinkTokenConfiguration linkTokenConfiguration, OnLoadCallback onLoadCallback, int i, Object obj) {
        if ((i & 4) != 0) {
            onLoadCallback = null;
        }
        return create(application, linkTokenConfiguration, onLoadCallback);
    }

    public static final View createLinkEmbeddedView(Context context, LinkTokenConfiguration config, ActivityResultLauncher<LinkTokenConfiguration> activityResultLauncher, Function1<? super LinkExit, Unit> failureCallback) {
        context.getClass();
        config.getClass();
        activityResultLauncher.getClass();
        failureCallback.getClass();
        Plaid plaid = INSTANCE;
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        plaid.initializeAndCheckPrerequisites((Application) applicationContext, config);
        Q0 q0 = new Q0(context, config, activityResultLauncher, null, failureCallback);
        q0.a();
        return q0.f;
    }

    private final void drainLinkEventQueue() {
        C0095a6.a.getClass();
        C0095a6.a.a("draining link event queue", true);
        X4 x4 = component;
        if (x4 != null) {
            ((A2) ((C0252p0) x4).j.get()).a(new Function1<LinkEvent, Unit>() { // from class: com.plaid.link.Plaid$drainLinkEventQueue$1
                public final void invoke(LinkEvent linkEvent) {
                    linkEvent.getClass();
                    C0095a6.a.a(C0095a6.a, "draining " + linkEvent);
                    Plaid.INSTANCE.getCustomerFacingLinkEventListenerInternal$link_sdk_release().invoke(linkEvent);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((LinkEvent) obj);
                    return Unit.INSTANCE;
                }
            });
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("component");
            throw null;
        }
    }

    private final boolean enforceDeviceHasPortrait(Context context) {
        if (hasPortrait(context)) {
            return true;
        }
        throw new LinkException("Device does not support portrait mode");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0092a3 getOrCreateTokenComponent() {
        InterfaceC0092a3 interfaceC0092a3 = tokenComponent;
        return interfaceC0092a3 == null ? initializeTokenComponentAndRegisterRemoteLogController() : interfaceC0092a3;
    }

    public static final String getVERSION_NAME() {
        return VERSION_NAME;
    }

    public static /* synthetic */ void getVERSION_NAME$annotations() {
    }

    private final boolean hasPortrait(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.screen.portrait");
    }

    private final synchronized void initialize(Application application) {
        if (isCreated.get()) {
            return;
        }
        application.getClass();
        new C0266q5();
        C0252p0 c0252p0 = new C0252p0(new C0266q5(), application);
        component = c0252p0;
        Y6.a = new J5((C0114c5) c0252p0.n.get());
        isCreated.getAndSet(true);
    }

    private final void initializeAndCheckPrerequisites(Application application, LinkTokenConfiguration linkTokenConfiguration) {
        V3 v3;
        initialize(application);
        enforceDeviceHasPortrait(application);
        initializeEnvironmentFromTokenOrCrash(linkTokenConfiguration);
        LinkLogLevel logLevel = linkTokenConfiguration.getLogLevel();
        logLevel.getClass();
        switch (E2.a[logLevel.ordinal()]) {
            case 1:
                v3 = V3.ASSERT;
                break;
            case 2:
                v3 = V3.DEBUG;
                break;
            case 3:
                v3 = V3.ERROR;
                break;
            case 4:
                v3 = V3.INFO;
                break;
            case 5:
                v3 = V3.VERBOSE;
                break;
            case 6:
                v3 = V3.WARN;
                break;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
        }
        setPlogLevel(v3);
    }

    private final EnumC0203j5 initializeEnvironmentFromTokenOrCrash(LinkTokenConfiguration linkTokenConfiguration) {
        EnumC0203j5.a aVar = EnumC0203j5.Companion;
        String token = linkTokenConfiguration.getToken();
        aVar.getClass();
        token.getClass();
        EnumC0203j5 enumC0203j5 = null;
        for (EnumC0203j5 enumC0203j52 : EnumC0203j5.values()) {
            if (StringsKt.contains((CharSequence) token, (CharSequence) enumC0203j52.getJson(), false)) {
                enumC0203j5 = enumC0203j52;
            }
        }
        if (enumC0203j5 == null) {
            throw LinkConfigurationMalformedLinkTokenException.INSTANCE;
        }
        X4 x4 = component;
        if (x4 != null) {
            ((C0230m5) ((C0252p0) x4).m.get()).a(enumC0203j5);
            return enumC0203j5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("component");
        throw null;
    }

    private final synchronized InterfaceC0092a3 initializeTokenComponentAndRegisterRemoteLogController() {
        C0243o0 c0243o0;
        G6 g6;
        try {
            X4 x4 = component;
            if (x4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("component");
                throw null;
            }
            c0243o0 = new C0243o0(((C0252p0) x4).b, new C0147d3());
            H6 h6 = (H6) c0243o0.m.get();
            h6.getClass();
            WeakReference<G6> weakReference = F6.a;
            if (weakReference != null && (g6 = weakReference.get()) != null) {
                g6.clear();
            }
            F6.a = null;
            C0095a6.a.getClass();
            C0095a6.a.a("RemoteLog: Controller unregistered", true);
            F6.a = new WeakReference<>(h6);
            C0095a6.a.a("RemoteLog: Controller registered", true);
            tokenComponent = c0243o0;
        } catch (Throwable th) {
            throw th;
        }
        return c0243o0;
    }

    private final void maybeSendTestCrash() {
        X4 x4 = component;
        if (x4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("component");
            throw null;
        }
        EnumC0203j5 b = ((C0230m5) ((C0252p0) x4).m.get()).b();
        X4 x42 = component;
        if (x42 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("component");
            throw null;
        }
        String packageName = ((C0252p0) x42).a.getPackageName();
        packageName.getClass();
        if (shouldSendTestCrash(b, packageName)) {
            X4 x43 = component;
            if (x43 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("component");
                throw null;
            }
            C0114c5 c0114c5 = (C0114c5) ((C0252p0) x43).n.get();
            c0114c5.getClass();
            try {
                c0114c5.a.getClass();
                throw new RuntimeException("Proguard crash test");
            } catch (RuntimeException e) {
                JobKt.launch$default(GlobalScope.INSTANCE, null, null, new C0104b5(c0114c5, e, null), 3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a5, code lost:
    
        if (r6 == r8) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a7, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006f, code lost:
    
        if (r1.a(r6, r0) == r8) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setLinkConfiguration(LinkTokenConfiguration linkTokenConfiguration, Continuation<? super Unit> continuation) {
        Plaid$setLinkConfiguration$1 plaid$setLinkConfiguration$1;
        int i;
        X4 x4;
        if (continuation instanceof Plaid$setLinkConfiguration$1) {
            plaid$setLinkConfiguration$1 = (Plaid$setLinkConfiguration$1) continuation;
            int i2 = plaid$setLinkConfiguration$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                plaid$setLinkConfiguration$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = plaid$setLinkConfiguration$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plaid$setLinkConfiguration$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    N2 aVar = linkTokenConfiguration.getEmbeddedSessionInfo() != null ? new N2.a(linkTokenConfiguration.getEmbeddedSessionInfo()) : new N2.b(Boxes$$ExternalSyntheticOutline1.m(), linkTokenConfiguration);
                    X4 x42 = component;
                    if (x42 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("component");
                        throw null;
                    }
                    Z2 z2 = (Z2) ((C0252p0) x42).f.get();
                    plaid$setLinkConfiguration$1.L$0 = linkTokenConfiguration;
                    plaid$setLinkConfiguration$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    linkTokenConfiguration = (LinkTokenConfiguration) plaid$setLinkConfiguration$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                x4 = component;
                if (x4 != null) {
                    Intrinsics.throwUninitializedPropertyAccessException("component");
                    throw null;
                }
                W4 w4 = (W4) ((C0252p0) x4).h.get();
                boolean noLoadingState = linkTokenConfiguration.getNoLoadingState();
                plaid$setLinkConfiguration$1.L$0 = null;
                plaid$setLinkConfiguration$1.label = 2;
                if (w4.b != null) {
                    w4.b = new S4(noLoadingState);
                }
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                Object withContext = JobKt.withContext(DefaultIoScheduler.INSTANCE, new V4(w4, noLoadingState, null), plaid$setLinkConfiguration$1);
                if (withContext != obj2) {
                    withContext = Unit.INSTANCE;
                }
            }
        }
        plaid$setLinkConfiguration$1 = new Plaid$setLinkConfiguration$1(this, continuation);
        Object obj3 = plaid$setLinkConfiguration$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plaid$setLinkConfiguration$1.label;
        if (i != 0) {
        }
        x4 = component;
        if (x4 != null) {
        }
    }

    public static final void setLinkEventListener(final Function1<? super LinkEvent, Unit> linkEventListener2) {
        linkEventListener2.getClass();
        queueableEventListener = new Function2<LinkEvent, I2, Unit>() { // from class: com.plaid.link.Plaid$setLinkEventListener$1
            public final void invoke(LinkEvent linkEvent, I2 i2) {
                X4 x4;
                linkEvent.getClass();
                i2.getClass();
                x4 = Plaid.component;
                if (x4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("component");
                    throw null;
                }
                A2 a2 = (A2) ((C0252p0) x4).j.get();
                if (i2 instanceof I2.a) {
                    a2.a(linkEvent, ((I2.a) i2).a);
                    return;
                }
                if (Intrinsics.areEqual(i2, I2.b.a)) {
                    a2.a(linkEvent);
                    return;
                }
                if (!Intrinsics.areEqual(i2, I2.c.a)) {
                    a2.a(linkEvent, 0);
                    return;
                }
                a2.getClass();
                linkEvent.getClass();
                a2.a(linkEvent);
                a2.b(null);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((LinkEvent) obj, (I2) obj2);
                return Unit.INSTANCE;
            }
        };
        linkEventListener = new Function1<LinkEvent, Unit>() { // from class: com.plaid.link.Plaid$setLinkEventListener$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void invoke(LinkEvent linkEvent) {
                X4 x4;
                linkEvent.getClass();
                x4 = Plaid.component;
                if (x4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("component");
                    throw null;
                }
                ((C0114c5) ((C0252p0) x4).n.get()).a(new C0157e4(linkEvent.getMetadata().toMap(), linkEvent.getEventName().getJson()));
                linkEventListener2.invoke(linkEvent);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LinkEvent) obj);
                return Unit.INSTANCE;
            }
        };
    }

    private final void setPlogLevel(V3 logLevel) {
        C0095a6.a aVar = C0095a6.a;
        Plaid$setPlogLevel$1 plaid$setPlogLevel$1 = new Function3() { // from class: com.plaid.link.Plaid$setPlogLevel$1
            public final void invoke(int i, String str, String str2) {
                X4 x4;
                str2.getClass();
                x4 = Plaid.component;
                if (x4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("component");
                    throw null;
                }
                C0114c5 c0114c5 = (C0114c5) ((C0252p0) x4).n.get();
                if (str == null) {
                    str = "";
                }
                c0114c5.a(new A1(str2, Thread$State$EnumUnboxingLocalUtility.m("tag", str), i));
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke(((Number) obj).intValue(), (String) obj2, (String) obj3);
                return Unit.INSTANCE;
            }
        };
        aVar.getClass();
        logLevel.getClass();
        C0095a6.b = new P(logLevel, plaid$setPlogLevel$1);
    }

    private final boolean shouldSendTestCrash(EnumC0203j5 plaidEnvironment, String packageName) {
        return plaidEnvironment == EnumC0203j5.SANDBOX && StringsKt__StringsJVMKt.startsWith(packageName, "com.plaid.", false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object awaitPreload$link_sdk_release(Continuation<? super Unit> continuation) {
        Plaid$awaitPreload$1 plaid$awaitPreload$1;
        int i;
        if (continuation instanceof Plaid$awaitPreload$1) {
            plaid$awaitPreload$1 = (Plaid$awaitPreload$1) continuation;
            int i2 = plaid$awaitPreload$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                plaid$awaitPreload$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = plaid$awaitPreload$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plaid$awaitPreload$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Job job = preloadLinkJob;
                    if (job != null && !job.isCompleted()) {
                        plaid$awaitPreload$1.L$0 = this;
                        plaid$awaitPreload$1.label = 1;
                        if (job.join(plaid$awaitPreload$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                preloadLinkJob = null;
                return Unit.INSTANCE;
            }
        }
        plaid$awaitPreload$1 = new Plaid$awaitPreload$1(this, continuation);
        Object obj2 = plaid$awaitPreload$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plaid$awaitPreload$1.label;
        if (i != 0) {
        }
        preloadLinkJob = null;
        return Unit.INSTANCE;
    }

    public final void createWithoutPreload$link_sdk_release(Application application, LinkTokenConfiguration linkTokenConfiguration) {
        application.getClass();
        linkTokenConfiguration.getClass();
        initializeAndCheckPrerequisites(application, linkTokenConfiguration);
        initializeTokenComponentAndRegisterRemoteLogController();
        F6.a.a("SDK Create", MapsKt__MapsKt.mapOf(new Pair("linkToken", linkTokenConfiguration.getToken()), new Pair("logLevel", linkTokenConfiguration.getLogLevel().name()), new Pair("noLoadingState", String.valueOf(linkTokenConfiguration.getNoLoadingState()))), J6.INFO);
        JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new Plaid$createWithoutPreload$1(linkTokenConfiguration, null));
        maybeSendTestCrash();
    }

    public final synchronized void destroy() {
        G6 g6;
        try {
            if (isCreated.get()) {
                X4 x4 = component;
                if (x4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("component");
                    throw null;
                }
                ((N5) ((C0252p0) x4).o.get()).a();
                WeakReference<G6> weakReference = F6.a;
                if (weakReference != null && (g6 = weakReference.get()) != null) {
                    g6.clear();
                }
                F6.a = null;
                C0095a6.a.getClass();
                C0095a6.a.a("RemoteLog: Controller unregistered", true);
                tokenComponent = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Function1<LinkEvent, Unit> getCustomerFacingLinkEventListenerInternal$link_sdk_release() {
        return new Function1<LinkEvent, Unit>() { // from class: com.plaid.link.Plaid$getCustomerFacingLinkEventListenerInternal$1
            public final void invoke(LinkEvent linkEvent) {
                Function1 function1;
                linkEvent.getClass();
                F6.a.a("SDK delivering event to listener: " + linkEvent.getEventName());
                function1 = Plaid.linkEventListener;
                function1.invoke(linkEvent);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LinkEvent) obj);
                return Unit.INSTANCE;
            }
        };
    }

    public final Function2<LinkEvent, I2, Unit> getLinkEventListenerInternal$link_sdk_release() {
        return queueableEventListener;
    }

    public final AtomicBoolean isCreated$link_sdk_release() {
        return isCreated;
    }

    public final boolean openLinkInternal$link_sdk_release(Fragment fragment) {
        fragment.getClass();
        int i = LinkActivity.e;
        Context requireContext = fragment.requireContext();
        requireContext.getClass();
        requireContext.getClass();
        INSTANCE.trackSdkOpen$link_sdk_release();
        Intent intent = new Intent(requireContext, (Class<?>) LinkActivity.class);
        intent.setFlags(67108864);
        fragment.startActivityForResult(intent, 3364);
        return true;
    }

    public final void preloadLink$link_sdk_release(OnLoadCallback onLoad) {
        C0095a6.a.getClass();
        C0095a6.a.a("Preload is called", true);
        Job job = preloadLinkJob;
        if (job != null && job.isActive()) {
            C0095a6.a.a("Requesting cancel on previous preload job", true);
            job.cancel(null);
        }
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        preloadLinkJob = JobKt.launch$default(GlobalScope.INSTANCE, DefaultIoScheduler.INSTANCE, null, new Plaid$preloadLink$2(onLoad, null), 2);
    }

    public final InterfaceC0092a3 provideLinkTokenComponent$link_sdk_release(Application application) {
        application.getClass();
        initialize(application);
        return getOrCreateTokenComponent();
    }

    public final void setCreated$link_sdk_release(AtomicBoolean atomicBoolean) {
        atomicBoolean.getClass();
        isCreated = atomicBoolean;
    }

    public final void setLinkResultAndFinish$link_sdk_release(Activity activity, int resultCode, Parcelable data) {
        activity.getClass();
        data.getClass();
        String str = resultCode != 6148 ? resultCode != 96171 ? "UNKNOWN" : "SUCCESS" : "EXIT";
        C0095a6.a.a(C0095a6.a, "link result delivered: ".concat(str));
        F6.a.b(MapsKt__MapsJVMKt.mapOf(new Pair("linkResult", str)), "Link result delivered: ".concat(str));
        drainLinkEventQueue();
        Intent intent = new Intent();
        intent.putExtra("link_result", data);
        activity.setResult(resultCode, intent);
        activity.finish();
        destroy();
    }

    public final void submitInternal$link_sdk_release(SubmissionData submissionData) {
        submissionData.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        JobKt.launch$default(GlobalScope.INSTANCE, MainDispatcherLoader.dispatcher, null, new Plaid$submitInternal$1(submissionData, null), 2);
    }

    public final void trackSdkOpen$link_sdk_release() {
        InterfaceC0092a3 interfaceC0092a3 = tokenComponent;
        C0326x3 c0326x3 = interfaceC0092a3 != null ? (C0326x3) ((C0243o0) interfaceC0092a3).d.get() : null;
        if (c0326x3 == null) {
            C0095a6.a.b(C0095a6.a, "Cannot log open event LinkWorkflowAnalytics is null");
            return;
        }
        GlobalScope globalScope = GlobalScope.INSTANCE;
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        JobKt.launch$default(globalScope, DefaultIoScheduler.INSTANCE, null, new Plaid$trackSdkOpen$1(c0326x3, null), 2);
    }

    public static final PlaidHandler create(Application application, LinkTokenConfiguration linkTokenConfiguration) {
        application.getClass();
        linkTokenConfiguration.getClass();
        return create(application, linkTokenConfiguration, null);
    }

    public final boolean openLinkInternal$link_sdk_release(Activity activity) {
        activity.getClass();
        int i = LinkActivity.e;
        activity.getClass();
        INSTANCE.trackSdkOpen$link_sdk_release();
        Intent intent = new Intent(activity, (Class<?>) LinkActivity.class);
        intent.setFlags(67108864);
        activity.startActivityForResult(intent, 3364);
        return true;
    }

    public static final View createLinkEmbeddedView(Context context, LinkTokenConfiguration config, Function1<? super LinkTokenConfiguration, Unit> successCallback, Function1<? super LinkExit, Unit> failureCallback) {
        context.getClass();
        config.getClass();
        successCallback.getClass();
        failureCallback.getClass();
        Plaid plaid = INSTANCE;
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        plaid.initializeAndCheckPrerequisites((Application) applicationContext, config);
        Q0 q0 = new Q0(context, config, null, successCallback, failureCallback);
        q0.a();
        return q0.f;
    }
}

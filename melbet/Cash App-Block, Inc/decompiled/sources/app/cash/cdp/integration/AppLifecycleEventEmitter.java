package app.cash.cdp.integration;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.CashApp$onCreate$4$1$1;
import com.squareup.cash.android.AndroidModule$Companion$$ExternalSyntheticLambda0;
import com.squareup.cash.appforeground.AppForegroundStateProvider;
import com.squareup.cash.appforeground.RealAppForegroundStateProvider;
import com.squareup.cash.cdf.app.AppLifecycleLaunch;
import com.squareup.cash.data.accessibility.AndroidAccessibilityManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.notifications.AndroidNotificationManager;
import com.squareup.cash.permissions.PermissionChecker;
import com.squareup.cash.permissions.ReadOnlyPermissions;
import com.squareup.cash.util.network.impl.AndroidConnectivityManager;
import com.squareup.cash.worker.ApplicationWorker;
import com.squareup.preferences.KeyValue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.text.StringsKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class AppLifecycleEventEmitter implements ApplicationWorker {
    public final AndroidAccessibilityManager accessibilityManager;
    public final Analytics analytics;
    public final Application application;
    public final AndroidConnectivityManager connectivityManager;
    public final KeyValue contactsPermissionPromptResponded;
    public final String endpoint;
    public final AppForegroundStateProvider foregroundStateProvider;
    public final CoroutineContext ioDispatcher;
    public final AndroidNotificationManager notificationManager;
    public final PermissionChecker permissionChecker;
    public final ReadOnlyPermissions readContactsPermission;

    public AppLifecycleEventEmitter(Application application, AndroidConnectivityManager androidConnectivityManager, String str, AndroidModule$Companion$$ExternalSyntheticLambda0 androidModule$Companion$$ExternalSyntheticLambda0, AndroidAccessibilityManager androidAccessibilityManager, Analytics analytics, AppForegroundStateProvider appForegroundStateProvider, CoroutineContext coroutineContext, AndroidNotificationManager androidNotificationManager, PermissionChecker permissionChecker, ReadOnlyPermissions readOnlyPermissions, KeyValue keyValue) {
        androidConnectivityManager.getClass();
        str.getClass();
        analytics.getClass();
        appForegroundStateProvider.getClass();
        coroutineContext.getClass();
        permissionChecker.getClass();
        readOnlyPermissions.getClass();
        keyValue.getClass();
        this.application = application;
        this.connectivityManager = androidConnectivityManager;
        this.endpoint = str;
        this.accessibilityManager = androidAccessibilityManager;
        this.analytics = analytics;
        this.foregroundStateProvider = appForegroundStateProvider;
        this.ioDispatcher = coroutineContext;
        this.notificationManager = androidNotificationManager;
        this.permissionChecker = permissionChecker;
        this.readContactsPermission = readOnlyPermissions;
        this.contactsPermissionPromptResponded = keyValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void access$logBackgroundEvents(AppLifecycleEventEmitter appLifecycleEventEmitter, ContinuationImpl continuationImpl) {
        AppLifecycleEventEmitter$logBackgroundEvents$1 appLifecycleEventEmitter$logBackgroundEvents$1;
        int i;
        if (continuationImpl instanceof AppLifecycleEventEmitter$logBackgroundEvents$1) {
            appLifecycleEventEmitter$logBackgroundEvents$1 = (AppLifecycleEventEmitter$logBackgroundEvents$1) continuationImpl;
            int i2 = appLifecycleEventEmitter$logBackgroundEvents$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                appLifecycleEventEmitter$logBackgroundEvents$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = appLifecycleEventEmitter$logBackgroundEvents$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = appLifecycleEventEmitter$logBackgroundEvents$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                    ReadonlyStateFlow readonlyStateFlow = ((RealAppForegroundStateProvider) appLifecycleEventEmitter.foregroundStateProvider).appForegroundState;
                    CashCdpConfigProvider$1$2 cashCdpConfigProvider$1$2 = new CashCdpConfigProvider$1$2(5, appLifecycleEventEmitter, ref$BooleanRef);
                    appLifecycleEventEmitter$logBackgroundEvents$1.label = 1;
                    if (readonlyStateFlow.$$delegate_0.collect(cashCdpConfigProvider$1$2, appLifecycleEventEmitter$logBackgroundEvents$1) == coroutineSingletons) {
                        return;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
            }
        }
        appLifecycleEventEmitter$logBackgroundEvents$1 = new AppLifecycleEventEmitter$logBackgroundEvents$1(appLifecycleEventEmitter, continuationImpl);
        Object obj2 = appLifecycleEventEmitter$logBackgroundEvents$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = appLifecycleEventEmitter$logBackgroundEvents$1.label;
        if (i != 0) {
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$1();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(97:0|1|(2:3|(93:5|6|(1:(1:9)(2:209|210))(4:211|(1:(1:(1:215)(1:223))(1:224))(1:225)|216|(76:218|14|(3:199|(3:202|(2:204|205)(1:206)|200)|207)|18|19|(3:190|(3:193|(2:195|196)(1:197)|191)|198)|23|24|(2:27|25)|28|29|30|31|32|33|34|(1:36)(2:164|(1:166)(2:167|(1:169)(2:170|(1:172)(2:173|(1:175)(2:176|(1:178)(2:179|(1:181)(2:182|(1:184)(1:185))))))))|37|38|(3:155|(3:158|(2:160|161)(1:162)|156)|163)|42|43|(3:146|(3:149|(2:151|152)(1:153)|147)|154)|47|48|49|(1:51)(1:144)|52|54|55|(1:57)(1:142)|58|59|60|61|62|63|64|65|(32:67|68|69|70|71|72|(1:74)|75|76|77|78|79|80|81|(1:125)|83|84|85|(1:121)(1:89)|90|(3:112|(3:115|(2:117|118)(1:119)|113)|120)|94|95|96|97|(1:99)(1:110)|100|101|102|(1:104)(1:108)|105|106)|136|68|69|70|71|72|(0)|75|76|77|78|79|80|81|(0)|83|84|85|(0)|121|90|(1:92)|112|(1:113)|120|94|95|96|97|(0)(0)|100|101|102|(0)(0)|105|106)(2:219|(1:221)(1:222)))|10|(1:12)(1:208)|13|14|(1:16)|199|(1:200)|207|18|19|(1:21)|190|(1:191)|198|23|24|(1:25)|28|29|30|31|32|33|34|(0)(0)|37|38|(1:40)|155|(1:156)|163|42|43|(1:45)|146|(1:147)|154|47|48|49|(0)(0)|52|54|55|(0)(0)|58|59|60|61|62|63|64|65|(0)|136|68|69|70|71|72|(0)|75|76|77|78|79|80|81|(0)|83|84|85|(0)|121|90|(0)|112|(1:113)|120|94|95|96|97|(0)(0)|100|101|102|(0)(0)|105|106))|226|6|(0)(0)|10|(0)(0)|13|14|(0)|199|(1:200)|207|18|19|(0)|190|(1:191)|198|23|24|(1:25)|28|29|30|31|32|33|34|(0)(0)|37|38|(0)|155|(1:156)|163|42|43|(0)|146|(1:147)|154|47|48|49|(0)(0)|52|54|55|(0)(0)|58|59|60|61|62|63|64|65|(0)|136|68|69|70|71|72|(0)|75|76|77|78|79|80|81|(0)|83|84|85|(0)|121|90|(0)|112|(1:113)|120|94|95|96|97|(0)(0)|100|101|102|(0)(0)|105|106|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0321, code lost:
    
        r27 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02bc, code lost:
    
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02b7, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02b9, code lost:
    
        r23 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x029f, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x029d, code lost:
    
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0270, code lost:
    
        r26 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0259, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0177, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0167, code lost:
    
        r21 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0135 A[LOOP:0: B:25:0x012f->B:27:0x0135, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0315  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$logLaunch(AppLifecycleEventEmitter appLifecycleEventEmitter, ContinuationImpl continuationImpl) {
        AppLifecycleEventEmitter$logLaunch$1 appLifecycleEventEmitter$logLaunch$1;
        int i;
        DisplayMetrics displayMetrics;
        AppLifecycleLaunch.UserInterfaceStyle userInterfaceStyle;
        DisplayMetrics displayMetrics2;
        String str;
        AppLifecycleLaunch.UserInterfaceStyle userInterfaceStyle2;
        String str2;
        String str3;
        List list;
        Iterator it;
        boolean z;
        List list2;
        Iterator it2;
        boolean z2;
        Iterator it3;
        List list3;
        Iterator it4;
        boolean z3;
        List list4;
        Iterator it5;
        boolean z4;
        boolean z5;
        List list5;
        Iterator it6;
        boolean z6;
        String string2;
        Application application = appLifecycleEventEmitter.application;
        AndroidAccessibilityManager androidAccessibilityManager = appLifecycleEventEmitter.accessibilityManager;
        Context context = androidAccessibilityManager.context;
        if (continuationImpl instanceof AppLifecycleEventEmitter$logLaunch$1) {
            appLifecycleEventEmitter$logLaunch$1 = (AppLifecycleEventEmitter$logLaunch$1) continuationImpl;
            int i2 = appLifecycleEventEmitter$logLaunch$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                appLifecycleEventEmitter$logLaunch$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = appLifecycleEventEmitter$logLaunch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = appLifecycleEventEmitter$logLaunch$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    displayMetrics = application.getResources().getDisplayMetrics();
                    String languageTag = Locale.getDefault().toLanguageTag();
                    int i3 = application.getResources().getConfiguration().uiMode & 48;
                    userInterfaceStyle = i3 != 0 ? i3 != 16 ? i3 != 32 ? AppLifecycleLaunch.UserInterfaceStyle.UNKNOWN : AppLifecycleLaunch.UserInterfaceStyle.DARK : AppLifecycleLaunch.UserInterfaceStyle.LIGHT : AppLifecycleLaunch.UserInterfaceStyle.UNKNOWN;
                    if (appLifecycleEventEmitter.readContactsPermission.check()) {
                        userInterfaceStyle2 = userInterfaceStyle;
                        str2 = "authorized";
                        str3 = languageTag;
                        List enabledAccessibilityServiceList = androidAccessibilityManager.getEnabledAccessibilityServiceList();
                        enabledAccessibilityServiceList.getClass();
                        list = enabledAccessibilityServiceList;
                        if ((list instanceof Collection) || !list.isEmpty()) {
                            it = list.iterator();
                            while (it.hasNext()) {
                                if ((((AccessibilityServiceInfo) it.next()).feedbackType & 4) != 0) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                        z = false;
                        List enabledAccessibilityServiceList2 = androidAccessibilityManager.getEnabledAccessibilityServiceList();
                        enabledAccessibilityServiceList2.getClass();
                        list2 = enabledAccessibilityServiceList2;
                        if ((list2 instanceof Collection) || !list2.isEmpty()) {
                            it2 = list2.iterator();
                            while (it2.hasNext()) {
                                if ((((AccessibilityServiceInfo) it2.next()).feedbackType & 32) != 0) {
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                        z2 = false;
                        boolean isEnabled = ((CaptioningManager) androidAccessibilityManager.captioningManager$delegate.getValue()).isEnabled();
                        List enabledAccessibilityServiceList3 = androidAccessibilityManager.getEnabledAccessibilityServiceList();
                        enabledAccessibilityServiceList3.getClass();
                        List list6 = enabledAccessibilityServiceList3;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
                        it3 = list6.iterator();
                        while (it3.hasNext()) {
                            arrayList.add(((AccessibilityServiceInfo) it3.next()).getId());
                        }
                        String joinToString$default = CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, null, 63);
                        Double d = Double.valueOf(Settings.System.getFloat(context.getContentResolver(), "font_scale"));
                        Double d2 = Double.valueOf(Settings.System.getFloat(context.getContentResolver(), "font_scale"));
                        String str4 = d2 == null ? "Unknown" : d2.doubleValue() < 0.75d ? "XX Small" : d2.doubleValue() < 0.9d ? "X Small" : d2.doubleValue() < 0.95d ? "Small" : d2.doubleValue() < 1.1d ? "Default" : d2.doubleValue() < 1.25d ? "X Large" : d2.doubleValue() < 1.5d ? "XX Large" : d2.doubleValue() < 2.0d ? "XXX Large" : "4X Large";
                        List enabledAccessibilityServiceList4 = androidAccessibilityManager.getEnabledAccessibilityServiceList();
                        enabledAccessibilityServiceList4.getClass();
                        list3 = enabledAccessibilityServiceList4;
                        if ((list3 instanceof Collection) || !list3.isEmpty()) {
                            it4 = list3.iterator();
                            while (it4.hasNext()) {
                                if ((((AccessibilityServiceInfo) it4.next()).feedbackType & 16) != 0) {
                                    z3 = true;
                                    break;
                                }
                            }
                        }
                        z3 = false;
                        List enabledAccessibilityServiceList5 = androidAccessibilityManager.getEnabledAccessibilityServiceList();
                        enabledAccessibilityServiceList5.getClass();
                        list4 = enabledAccessibilityServiceList5;
                        if ((list4 instanceof Collection) || !list4.isEmpty()) {
                            it5 = list4.iterator();
                            while (it5.hasNext()) {
                                if ((((AccessibilityServiceInfo) it5.next()).feedbackType & 2) != 0) {
                                    z4 = true;
                                    break;
                                }
                            }
                        }
                        z4 = false;
                        Boolean bool = Boolean.valueOf(Settings.Secure.getInt(context.getContentResolver(), "high_text_contrast_enabled") == 1);
                        Boolean bool2 = Boolean.valueOf(Settings.Secure.getInt(context.getContentResolver(), "accessibility_display_inversion_enabled") == 1);
                        if (Settings.Secure.getInt(context.getContentResolver(), "accessibility_display_magnification_enabled") == 1) {
                            z5 = true;
                            boolean z7 = z3;
                            string2 = Settings.Secure.getString(context.getContentResolver(), "accessibility_button_targets");
                            if (string2 == null) {
                                string2 = "";
                            }
                            boolean z8 = StringsKt.contains((CharSequence) string2, (CharSequence) "com.android.server.accessibility.MagnificationController", false);
                            boolean z9 = z;
                            String string3 = Settings.Secure.getString(context.getContentResolver(), "accessibility_shortcut_target_service");
                            String str5 = string3 != null ? string3 : "";
                            boolean z10 = false;
                            boolean z11 = StringsKt.contains((CharSequence) str5, (CharSequence) "com.android.server.accessibility.MagnificationController", false);
                            boolean z12 = (!z5 || z8 || z11) ? true : z10;
                            boolean isSpokenServiceEnabled = androidAccessibilityManager.isSpokenServiceEnabled();
                            List enabledAccessibilityServiceList6 = androidAccessibilityManager.getEnabledAccessibilityServiceList();
                            enabledAccessibilityServiceList6.getClass();
                            list5 = enabledAccessibilityServiceList6;
                            if ((list5 instanceof Collection) || !list5.isEmpty()) {
                                it6 = list5.iterator();
                                while (it6.hasNext()) {
                                    if ((((AccessibilityServiceInfo) it6.next()).feedbackType & 8) != 0) {
                                        z6 = true;
                                        break;
                                    }
                                }
                            }
                            z6 = z10;
                            boolean isTouchExplorationEnabled = ((AccessibilityManager) androidAccessibilityManager.accessibilityManager$delegate.getValue()).isTouchExplorationEnabled();
                            Boolean bool3 = Boolean.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale") == RecyclerView.DECELERATION_RATE ? true : z10);
                            boolean areNotificationsEnabled = appLifecycleEventEmitter.notificationManager.notificationManagerCompat.areNotificationsEnabled();
                            ConnectivityManager connectivityManager = appLifecycleEventEmitter.connectivityManager.connectivityManager;
                            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                            boolean hasTransport = networkCapabilities != null ? networkCapabilities.hasTransport(4) : z10;
                            String str6 = appLifecycleEventEmitter.endpoint;
                            String str7 = Build.MODEL;
                            float f = displayMetrics.widthPixels;
                            float f2 = displayMetrics.density;
                            appLifecycleEventEmitter.analytics.track(new AppLifecycleLaunch(str3, userInterfaceStyle2, str2, Boolean.valueOf(z9), Boolean.valueOf(z2), Boolean.valueOf(isEnabled), joinToString$default, d, str4, Boolean.valueOf(z7), Boolean.valueOf(z4), bool, bool2, bool3, Boolean.valueOf(z12), Boolean.valueOf(isSpokenServiceEnabled), Boolean.valueOf(z6), Boolean.valueOf(isTouchExplorationEnabled), Boolean.valueOf(areNotificationsEnabled), Boolean.valueOf(hasTransport), str6, new Integer((int) (f / f2)), new Integer((int) (displayMetrics.heightPixels / f2)), new Double(f2), Boolean.valueOf(appLifecycleEventEmitter.permissionChecker.create("android.permission.CAMERA").check())), new Long(System.currentTimeMillis()));
                            return Unit.INSTANCE;
                        }
                        z5 = false;
                        boolean z72 = z3;
                        string2 = Settings.Secure.getString(context.getContentResolver(), "accessibility_button_targets");
                        if (string2 == null) {
                        }
                        boolean z82 = StringsKt.contains((CharSequence) string2, (CharSequence) "com.android.server.accessibility.MagnificationController", false);
                        boolean z92 = z;
                        String string32 = Settings.Secure.getString(context.getContentResolver(), "accessibility_shortcut_target_service");
                        if (string32 != null) {
                        }
                        boolean z102 = false;
                        boolean z112 = StringsKt.contains((CharSequence) str5, (CharSequence) "com.android.server.accessibility.MagnificationController", false);
                        if (z5) {
                        }
                        boolean isSpokenServiceEnabled2 = androidAccessibilityManager.isSpokenServiceEnabled();
                        List enabledAccessibilityServiceList62 = androidAccessibilityManager.getEnabledAccessibilityServiceList();
                        enabledAccessibilityServiceList62.getClass();
                        list5 = enabledAccessibilityServiceList62;
                        if (list5 instanceof Collection) {
                        }
                        it6 = list5.iterator();
                        while (it6.hasNext()) {
                        }
                        z6 = z102;
                        boolean isTouchExplorationEnabled2 = ((AccessibilityManager) androidAccessibilityManager.accessibilityManager$delegate.getValue()).isTouchExplorationEnabled();
                        Boolean bool32 = Boolean.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale") == RecyclerView.DECELERATION_RATE ? true : z102);
                        boolean areNotificationsEnabled2 = appLifecycleEventEmitter.notificationManager.notificationManagerCompat.areNotificationsEnabled();
                        ConnectivityManager connectivityManager2 = appLifecycleEventEmitter.connectivityManager.connectivityManager;
                        NetworkCapabilities networkCapabilities2 = connectivityManager2.getNetworkCapabilities(connectivityManager2.getActiveNetwork());
                        if (networkCapabilities2 != null) {
                        }
                        String str62 = appLifecycleEventEmitter.endpoint;
                        String str72 = Build.MODEL;
                        float f3 = displayMetrics.widthPixels;
                        float f22 = displayMetrics.density;
                        appLifecycleEventEmitter.analytics.track(new AppLifecycleLaunch(str3, userInterfaceStyle2, str2, Boolean.valueOf(z92), Boolean.valueOf(z2), Boolean.valueOf(isEnabled), joinToString$default, d, str4, Boolean.valueOf(z72), Boolean.valueOf(z4), bool, bool2, bool32, Boolean.valueOf(z12), Boolean.valueOf(isSpokenServiceEnabled2), Boolean.valueOf(z6), Boolean.valueOf(isTouchExplorationEnabled2), Boolean.valueOf(areNotificationsEnabled2), Boolean.valueOf(hasTransport), str62, new Integer((int) (f3 / f22)), new Integer((int) (displayMetrics.heightPixels / f22)), new Double(f22), Boolean.valueOf(appLifecycleEventEmitter.permissionChecker.create("android.permission.CAMERA").check())), new Long(System.currentTimeMillis()));
                        return Unit.INSTANCE;
                    }
                    KeyValue keyValue = appLifecycleEventEmitter.contactsPermissionPromptResponded;
                    appLifecycleEventEmitter$logLaunch$1.L$0 = displayMetrics;
                    appLifecycleEventEmitter$logLaunch$1.L$1 = languageTag;
                    appLifecycleEventEmitter$logLaunch$1.L$2 = userInterfaceStyle;
                    appLifecycleEventEmitter$logLaunch$1.label = 1;
                    Object obj2 = keyValue.get(appLifecycleEventEmitter$logLaunch$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    displayMetrics2 = displayMetrics;
                    obj = obj2;
                    str = languageTag;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    userInterfaceStyle = appLifecycleEventEmitter$logLaunch$1.L$2;
                    str = appLifecycleEventEmitter$logLaunch$1.L$1;
                    displayMetrics2 = appLifecycleEventEmitter$logLaunch$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                str2 = ((Boolean) obj).booleanValue() ? "not_determined" : "denied";
                userInterfaceStyle2 = userInterfaceStyle;
                displayMetrics = displayMetrics2;
                str3 = str;
                List enabledAccessibilityServiceList7 = androidAccessibilityManager.getEnabledAccessibilityServiceList();
                enabledAccessibilityServiceList7.getClass();
                list = enabledAccessibilityServiceList7;
                if (list instanceof Collection) {
                }
                it = list.iterator();
                while (it.hasNext()) {
                }
                z = false;
                List enabledAccessibilityServiceList22 = androidAccessibilityManager.getEnabledAccessibilityServiceList();
                enabledAccessibilityServiceList22.getClass();
                list2 = enabledAccessibilityServiceList22;
                if (list2 instanceof Collection) {
                }
                it2 = list2.iterator();
                while (it2.hasNext()) {
                }
                z2 = false;
                boolean isEnabled2 = ((CaptioningManager) androidAccessibilityManager.captioningManager$delegate.getValue()).isEnabled();
                List enabledAccessibilityServiceList32 = androidAccessibilityManager.getEnabledAccessibilityServiceList();
                enabledAccessibilityServiceList32.getClass();
                List list62 = enabledAccessibilityServiceList32;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list62, 10));
                it3 = list62.iterator();
                while (it3.hasNext()) {
                }
                String joinToString$default2 = CollectionsKt.joinToString$default(arrayList2, null, null, null, 0, null, null, 63);
                Double d3 = Double.valueOf(Settings.System.getFloat(context.getContentResolver(), "font_scale"));
                Double d22 = Double.valueOf(Settings.System.getFloat(context.getContentResolver(), "font_scale"));
                String str42 = d22 == null ? "Unknown" : d22.doubleValue() < 0.75d ? "XX Small" : d22.doubleValue() < 0.9d ? "X Small" : d22.doubleValue() < 0.95d ? "Small" : d22.doubleValue() < 1.1d ? "Default" : d22.doubleValue() < 1.25d ? "X Large" : d22.doubleValue() < 1.5d ? "XX Large" : d22.doubleValue() < 2.0d ? "XXX Large" : "4X Large";
                List enabledAccessibilityServiceList42 = androidAccessibilityManager.getEnabledAccessibilityServiceList();
                enabledAccessibilityServiceList42.getClass();
                list3 = enabledAccessibilityServiceList42;
                if (list3 instanceof Collection) {
                }
                it4 = list3.iterator();
                while (it4.hasNext()) {
                }
                z3 = false;
                List enabledAccessibilityServiceList52 = androidAccessibilityManager.getEnabledAccessibilityServiceList();
                enabledAccessibilityServiceList52.getClass();
                list4 = enabledAccessibilityServiceList52;
                if (list4 instanceof Collection) {
                }
                it5 = list4.iterator();
                while (it5.hasNext()) {
                }
                z4 = false;
                Boolean bool4 = Boolean.valueOf(Settings.Secure.getInt(context.getContentResolver(), "high_text_contrast_enabled") == 1);
                Boolean bool22 = Boolean.valueOf(Settings.Secure.getInt(context.getContentResolver(), "accessibility_display_inversion_enabled") == 1);
                if (Settings.Secure.getInt(context.getContentResolver(), "accessibility_display_magnification_enabled") == 1) {
                }
                z5 = false;
                boolean z722 = z3;
                string2 = Settings.Secure.getString(context.getContentResolver(), "accessibility_button_targets");
                if (string2 == null) {
                }
                boolean z822 = StringsKt.contains((CharSequence) string2, (CharSequence) "com.android.server.accessibility.MagnificationController", false);
                boolean z922 = z;
                String string322 = Settings.Secure.getString(context.getContentResolver(), "accessibility_shortcut_target_service");
                if (string322 != null) {
                }
                boolean z1022 = false;
                boolean z1122 = StringsKt.contains((CharSequence) str5, (CharSequence) "com.android.server.accessibility.MagnificationController", false);
                if (z5) {
                }
                boolean isSpokenServiceEnabled22 = androidAccessibilityManager.isSpokenServiceEnabled();
                List enabledAccessibilityServiceList622 = androidAccessibilityManager.getEnabledAccessibilityServiceList();
                enabledAccessibilityServiceList622.getClass();
                list5 = enabledAccessibilityServiceList622;
                if (list5 instanceof Collection) {
                }
                it6 = list5.iterator();
                while (it6.hasNext()) {
                }
                z6 = z1022;
                boolean isTouchExplorationEnabled22 = ((AccessibilityManager) androidAccessibilityManager.accessibilityManager$delegate.getValue()).isTouchExplorationEnabled();
                Boolean bool322 = Boolean.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale") == RecyclerView.DECELERATION_RATE ? true : z1022);
                boolean areNotificationsEnabled22 = appLifecycleEventEmitter.notificationManager.notificationManagerCompat.areNotificationsEnabled();
                ConnectivityManager connectivityManager22 = appLifecycleEventEmitter.connectivityManager.connectivityManager;
                NetworkCapabilities networkCapabilities22 = connectivityManager22.getNetworkCapabilities(connectivityManager22.getActiveNetwork());
                if (networkCapabilities22 != null) {
                }
                String str622 = appLifecycleEventEmitter.endpoint;
                String str722 = Build.MODEL;
                float f32 = displayMetrics.widthPixels;
                float f222 = displayMetrics.density;
                appLifecycleEventEmitter.analytics.track(new AppLifecycleLaunch(str3, userInterfaceStyle2, str2, Boolean.valueOf(z922), Boolean.valueOf(z2), Boolean.valueOf(isEnabled2), joinToString$default2, d3, str42, Boolean.valueOf(z722), Boolean.valueOf(z4), bool4, bool22, bool322, Boolean.valueOf(z12), Boolean.valueOf(isSpokenServiceEnabled22), Boolean.valueOf(z6), Boolean.valueOf(isTouchExplorationEnabled22), Boolean.valueOf(areNotificationsEnabled22), Boolean.valueOf(hasTransport), str622, new Integer((int) (f32 / f222)), new Integer((int) (displayMetrics.heightPixels / f222)), new Double(f222), Boolean.valueOf(appLifecycleEventEmitter.permissionChecker.create("android.permission.CAMERA").check())), new Long(System.currentTimeMillis()));
                return Unit.INSTANCE;
            }
        }
        appLifecycleEventEmitter$logLaunch$1 = new AppLifecycleEventEmitter$logLaunch$1(appLifecycleEventEmitter, continuationImpl);
        Object obj3 = appLifecycleEventEmitter$logLaunch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = appLifecycleEventEmitter$logLaunch$1.label;
        if (i != 0) {
        }
        str2 = ((Boolean) obj3).booleanValue() ? "not_determined" : "denied";
        userInterfaceStyle2 = userInterfaceStyle;
        displayMetrics = displayMetrics2;
        str3 = str;
        List enabledAccessibilityServiceList72 = androidAccessibilityManager.getEnabledAccessibilityServiceList();
        enabledAccessibilityServiceList72.getClass();
        list = enabledAccessibilityServiceList72;
        if (list instanceof Collection) {
        }
        it = list.iterator();
        while (it.hasNext()) {
        }
        z = false;
        List enabledAccessibilityServiceList222 = androidAccessibilityManager.getEnabledAccessibilityServiceList();
        enabledAccessibilityServiceList222.getClass();
        list2 = enabledAccessibilityServiceList222;
        if (list2 instanceof Collection) {
        }
        it2 = list2.iterator();
        while (it2.hasNext()) {
        }
        z2 = false;
        boolean isEnabled22 = ((CaptioningManager) androidAccessibilityManager.captioningManager$delegate.getValue()).isEnabled();
        List enabledAccessibilityServiceList322 = androidAccessibilityManager.getEnabledAccessibilityServiceList();
        enabledAccessibilityServiceList322.getClass();
        List list622 = enabledAccessibilityServiceList322;
        ArrayList arrayList22 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list622, 10));
        it3 = list622.iterator();
        while (it3.hasNext()) {
        }
        String joinToString$default22 = CollectionsKt.joinToString$default(arrayList22, null, null, null, 0, null, null, 63);
        Double d32 = Double.valueOf(Settings.System.getFloat(context.getContentResolver(), "font_scale"));
        Double d222 = Double.valueOf(Settings.System.getFloat(context.getContentResolver(), "font_scale"));
        String str422 = d222 == null ? "Unknown" : d222.doubleValue() < 0.75d ? "XX Small" : d222.doubleValue() < 0.9d ? "X Small" : d222.doubleValue() < 0.95d ? "Small" : d222.doubleValue() < 1.1d ? "Default" : d222.doubleValue() < 1.25d ? "X Large" : d222.doubleValue() < 1.5d ? "XX Large" : d222.doubleValue() < 2.0d ? "XXX Large" : "4X Large";
        List enabledAccessibilityServiceList422 = androidAccessibilityManager.getEnabledAccessibilityServiceList();
        enabledAccessibilityServiceList422.getClass();
        list3 = enabledAccessibilityServiceList422;
        if (list3 instanceof Collection) {
        }
        it4 = list3.iterator();
        while (it4.hasNext()) {
        }
        z3 = false;
        List enabledAccessibilityServiceList522 = androidAccessibilityManager.getEnabledAccessibilityServiceList();
        enabledAccessibilityServiceList522.getClass();
        list4 = enabledAccessibilityServiceList522;
        if (list4 instanceof Collection) {
        }
        it5 = list4.iterator();
        while (it5.hasNext()) {
        }
        z4 = false;
        Boolean bool42 = Boolean.valueOf(Settings.Secure.getInt(context.getContentResolver(), "high_text_contrast_enabled") == 1);
        Boolean bool222 = Boolean.valueOf(Settings.Secure.getInt(context.getContentResolver(), "accessibility_display_inversion_enabled") == 1);
        if (Settings.Secure.getInt(context.getContentResolver(), "accessibility_display_magnification_enabled") == 1) {
        }
        z5 = false;
        boolean z7222 = z3;
        string2 = Settings.Secure.getString(context.getContentResolver(), "accessibility_button_targets");
        if (string2 == null) {
        }
        boolean z8222 = StringsKt.contains((CharSequence) string2, (CharSequence) "com.android.server.accessibility.MagnificationController", false);
        boolean z9222 = z;
        String string3222 = Settings.Secure.getString(context.getContentResolver(), "accessibility_shortcut_target_service");
        if (string3222 != null) {
        }
        boolean z10222 = false;
        boolean z11222 = StringsKt.contains((CharSequence) str5, (CharSequence) "com.android.server.accessibility.MagnificationController", false);
        if (z5) {
        }
        boolean isSpokenServiceEnabled222 = androidAccessibilityManager.isSpokenServiceEnabled();
        List enabledAccessibilityServiceList6222 = androidAccessibilityManager.getEnabledAccessibilityServiceList();
        enabledAccessibilityServiceList6222.getClass();
        list5 = enabledAccessibilityServiceList6222;
        if (list5 instanceof Collection) {
        }
        it6 = list5.iterator();
        while (it6.hasNext()) {
        }
        z6 = z10222;
        boolean isTouchExplorationEnabled222 = ((AccessibilityManager) androidAccessibilityManager.accessibilityManager$delegate.getValue()).isTouchExplorationEnabled();
        Boolean bool3222 = Boolean.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale") == RecyclerView.DECELERATION_RATE ? true : z10222);
        boolean areNotificationsEnabled222 = appLifecycleEventEmitter.notificationManager.notificationManagerCompat.areNotificationsEnabled();
        ConnectivityManager connectivityManager222 = appLifecycleEventEmitter.connectivityManager.connectivityManager;
        NetworkCapabilities networkCapabilities222 = connectivityManager222.getNetworkCapabilities(connectivityManager222.getActiveNetwork());
        if (networkCapabilities222 != null) {
        }
        String str6222 = appLifecycleEventEmitter.endpoint;
        String str7222 = Build.MODEL;
        float f322 = displayMetrics.widthPixels;
        float f2222 = displayMetrics.density;
        appLifecycleEventEmitter.analytics.track(new AppLifecycleLaunch(str3, userInterfaceStyle2, str2, Boolean.valueOf(z9222), Boolean.valueOf(z2), Boolean.valueOf(isEnabled22), joinToString$default22, d32, str422, Boolean.valueOf(z7222), Boolean.valueOf(z4), bool42, bool222, bool3222, Boolean.valueOf(z12), Boolean.valueOf(isSpokenServiceEnabled222), Boolean.valueOf(z6), Boolean.valueOf(isTouchExplorationEnabled222), Boolean.valueOf(areNotificationsEnabled222), Boolean.valueOf(hasTransport), str6222, new Integer((int) (f322 / f2222)), new Integer((int) (displayMetrics.heightPixels / f2222)), new Double(f2222), Boolean.valueOf(appLifecycleEventEmitter.permissionChecker.create("android.permission.CAMERA").check())), new Long(System.currentTimeMillis()));
        return Unit.INSTANCE;
    }

    @Override // com.squareup.cash.worker.ApplicationWorker
    public final Object work(Continuation continuation) {
        Object withContext = JobKt.withContext(this.ioDispatcher, new CashApp$onCreate$4$1$1(this, null, 9), continuation);
        return withContext == CoroutineSingletons.COROUTINE_SUSPENDED ? withContext : Unit.INSTANCE;
    }
}

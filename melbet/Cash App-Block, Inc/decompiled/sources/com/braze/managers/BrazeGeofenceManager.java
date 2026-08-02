package com.braze.managers;

import android.app.PendingIntent;
import android.content.Context;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import bo.app.a2;
import bo.app.a9;
import bo.app.c2;
import bo.app.m9;
import bo.app.n$$ExternalSyntheticLambda2;
import bo.app.o8$$ExternalSyntheticLambda2;
import bo.app.re;
import bo.app.u1;
import bo.app.ue;
import bo.app.y1;
import com.braze.Braze$$ExternalSyntheticLambda34;
import com.braze.BrazeUser$$ExternalSyntheticLambda9;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.models.Banner$$ExternalSyntheticLambda0;
import com.braze.models.BrazeGeofence;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.GeofenceDataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import com.braze.support.PermissionUtils;
import com.braze.support.g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.json.Json;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 h2\u00020\u00012\u00020\u0001:\u0001hB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u0016J\u0017\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010$\u001a\u00020\u00142\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0014H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0014H\u0007¢\u0006\u0004\b(\u0010'J%\u0010)\u001a\u00020\u00142\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b)\u0010*J\u0013\u0010+\u001a\b\u0012\u0004\u0012\u00020\"0!¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00101R\u0017\u00103\u001a\u0002028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R \u00108\u001a\u0002078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b<\u0010'\u001a\u0004\b:\u0010;R \u0010>\u001a\u00020=8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b>\u0010?\u0012\u0004\bB\u0010'\u001a\u0004\b@\u0010AR\u001c\u0010D\u001a\n C*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR&\u0010J\u001a\b\u0012\u0004\u0012\u00020\"0I8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bJ\u0010K\u0012\u0004\bM\u0010'\u001a\u0004\bL\u0010,R\"\u0010N\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bN\u0010O\u0012\u0004\bR\u0010'\u001a\u0004\bP\u0010QR(\u0010T\u001a\u00020S8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bT\u0010U\u0012\u0004\bZ\u0010'\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR(\u0010[\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b[\u0010\\\u0012\u0004\b_\u0010'\u001a\u0004\b[\u0010]\"\u0004\b^\u0010\u0016R(\u0010a\u001a\u00020`8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\ba\u0010b\u0012\u0004\bg\u0010'\u001a\u0004\bc\u0010d\"\u0004\be\u0010f¨\u0006i"}, d2 = {"Lcom/braze/managers/BrazeGeofenceManager;", "", "Landroid/content/Context;", "context", "", "apiKey", "Lbo/app/a9;", "brazeManager", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "Lbo/app/ue;", "serverConfigStorageProvider", "Lbo/app/m9;", "internalIEventMessenger", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lbo/app/a9;Lcom/braze/configuration/BrazeConfigurationProvider;Lbo/app/ue;Lbo/app/m9;)V", "", "isGeofencesEnabledFromEnvironment", "(Landroid/content/Context;)Z", "reRegisterGeofences", "", "setUpGeofences", "(Z)V", "Landroid/app/PendingIntent;", "geofenceRequestIntent", "tearDownGeofences", "(Landroid/app/PendingIntent;)V", "ignoreRateLimit", "requestGeofenceRefresh", "Lbo/app/re;", "serverConfig", "configureFromServerConfig", "(Lbo/app/re;)V", "", "Lcom/braze/models/BrazeGeofence;", "geofenceList", "registerGeofences", "(Ljava/util/List;)V", "unregisterGeofences", "()V", "requestSingleLocationUpdateFromGooglePlay", "registerGeofencesWithGooglePlay", "(Ljava/util/List;Landroid/app/PendingIntent;)V", "retrieveBrazeGeofencesFromLocalStorage", "()Ljava/util/List;", "Lbo/app/a9;", "getBrazeManager", "()Lbo/app/a9;", "Lcom/braze/configuration/BrazeConfigurationProvider;", "Lbo/app/ue;", "Lcom/braze/storage/GeofenceDataStoreProvider;", "geofenceDataStoreProvider", "Lcom/braze/storage/GeofenceDataStoreProvider;", "getGeofenceDataStoreProvider", "()Lcom/braze/storage/GeofenceDataStoreProvider;", "Lbo/app/u1;", "brazeGeofenceApi", "Lbo/app/u1;", "getBrazeGeofenceApi", "()Lbo/app/u1;", "getBrazeGeofenceApi$annotations", "Lbo/app/a2;", "brazeLocationApi", "Lbo/app/a2;", "getBrazeLocationApi", "()Lbo/app/a2;", "getBrazeLocationApi$annotations", "kotlin.jvm.PlatformType", "applicationContext", "Landroid/content/Context;", "Ljava/util/concurrent/locks/ReentrantLock;", "geofenceListLock", "Ljava/util/concurrent/locks/ReentrantLock;", "", "brazeGeofences", "Ljava/util/List;", "getBrazeGeofences", "getBrazeGeofences$annotations", "geofenceTransitionPendingIntent", "Landroid/app/PendingIntent;", "getGeofenceTransitionPendingIntent", "()Landroid/app/PendingIntent;", "getGeofenceTransitionPendingIntent$annotations", "Lbo/app/y1;", "brazeGeofenceReEligibilityManager", "Lbo/app/y1;", "getBrazeGeofenceReEligibilityManager", "()Lbo/app/y1;", "setBrazeGeofenceReEligibilityManager", "(Lbo/app/y1;)V", "getBrazeGeofenceReEligibilityManager$annotations", "isGeofencesEnabled", "Z", "()Z", "setGeofencesEnabled", "isGeofencesEnabled$annotations", "", "maxNumToRegister", "I", "getMaxNumToRegister", "()I", "setMaxNumToRegister", "(I)V", "getMaxNumToRegister$annotations", "Companion", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BrazeGeofenceManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Context applicationContext;
    private final u1 brazeGeofenceApi;
    private y1 brazeGeofenceReEligibilityManager;
    private final List<BrazeGeofence> brazeGeofences;
    private final a2 brazeLocationApi;
    private final a9 brazeManager;
    private final BrazeConfigurationProvider configurationProvider;
    private final GeofenceDataStoreProvider geofenceDataStoreProvider;
    private final ReentrantLock geofenceListLock;
    private final PendingIntent geofenceTransitionPendingIntent;
    private boolean isGeofencesEnabled;
    private int maxNumToRegister;
    private final ue serverConfigStorageProvider;

    public BrazeGeofenceManager(Context context, String str, a9 a9Var, BrazeConfigurationProvider brazeConfigurationProvider, ue ueVar, m9 m9Var) {
        context.getClass();
        str.getClass();
        a9Var.getClass();
        brazeConfigurationProvider.getClass();
        ueVar.getClass();
        m9Var.getClass();
        this.brazeManager = a9Var;
        this.configurationProvider = brazeConfigurationProvider;
        this.serverConfigStorageProvider = ueVar;
        GeofenceDataStoreProvider geofenceDataStoreProvider = new GeofenceDataStoreProvider(context, str);
        this.geofenceDataStoreProvider = geofenceDataStoreProvider;
        this.brazeGeofenceApi = new u1(geofenceDataStoreProvider);
        this.brazeLocationApi = new a2(context, c2.d.a(brazeConfigurationProvider), brazeConfigurationProvider);
        this.applicationContext = context.getApplicationContext();
        this.geofenceListLock = new ReentrantLock();
        this.brazeGeofences = CollectionsKt.toMutableList((Collection) retrieveBrazeGeofencesFromLocalStorage());
        this.geofenceTransitionPendingIntent = null;
        this.brazeGeofenceReEligibilityManager = new y1(ueVar, m9Var, geofenceDataStoreProvider);
        Companion companion = INSTANCE;
        if (companion.getGeofencesEnabledFromServerConfig(ueVar)) {
            isGeofencesEnabledFromEnvironment(context);
        }
        this.isGeofencesEnabled = false;
        this.maxNumToRegister = companion.getMaxNumToRegister(ueVar);
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Banner$$ExternalSyntheticLambda0(4), 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Banner$$ExternalSyntheticLambda0(5), 6, (Object) null);
        setUpGeofences(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0() {
        return "***Geofence API not found. Please include the android-sdk-location module***";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$1() {
        return "Calling setUpGeofences on geofence manager init";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String configureFromServerConfig$lambda$0(boolean z) {
        return Fragment$5$$ExternalSyntheticOutline0.m("Geofences enabled server config value ", " received.", z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String configureFromServerConfig$lambda$1(BrazeGeofenceManager brazeGeofenceManager) {
        return Fragment$5$$ExternalSyntheticOutline0.m("Geofences enabled status newly set to ", " during server config update.", brazeGeofenceManager.isGeofencesEnabled);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String configureFromServerConfig$lambda$2(boolean z) {
        return Fragment$5$$ExternalSyntheticOutline0.m("Geofences enabled status of `", "` was unchanged during server config update.", z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String configureFromServerConfig$lambda$3(BrazeGeofenceManager brazeGeofenceManager) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(brazeGeofenceManager.maxNumToRegister, "Max number to register newly set to ", " via server config.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$0() {
        return "Braze Geofences disabled or Braze location collection disabled in local configuration. Geofences not enabled.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$1() {
        return "Fine grained location permissions not found. Geofences not enabled.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$2() {
        return "Background location access permission not found. Geofences not enabled.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$3() {
        return "Google Play Services not available. Geofences not enabled.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$4() {
        return "Braze Geofence API is not available";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofences$lambda$0() {
        return "Braze geofences not enabled. Not adding new geofences to local storage.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofences$lambda$2$0(List list) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(list.size(), "Received new geofence list of size: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofences$lambda$2$1(BrazeGeofenceManager brazeGeofenceManager) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(brazeGeofenceManager.maxNumToRegister, "Reached maximum number of new geofences: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofences$lambda$2$2(BrazeGeofence brazeGeofence) {
        return "Adding new geofence to local storage: " + brazeGeofence;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofences$lambda$2$3(BrazeGeofenceManager brazeGeofenceManager) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(brazeGeofenceManager.brazeGeofences.size(), "Added ", " new geofences to local storage.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofenceRefresh$lambda$2() {
        return "Braze geofences not enabled. Not requesting geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String retrieveBrazeGeofencesFromLocalStorage$lambda$0() {
        return "Did not find stored geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setUpGeofences$lambda$0() {
        return "Braze geofences not enabled. Geofences not set up.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setUpGeofences$lambda$1(boolean z) {
        return "Setting up geofences in setUpGeofences with reRegisterGeofences: " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setUpGeofences$lambda$2() {
        return "Could not get pending intent to setup geofences";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String tearDownGeofences$lambda$0() {
        return "Tearing down geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String tearDownGeofences$lambda$1() {
        return "Unregistering any Braze geofences from Google Play Services.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String tearDownGeofences$lambda$2$0() {
        return "Deleting locally stored geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterGeofences$lambda$0() {
        return "Braze geofences not enabled. Not un-registering geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterGeofences$lambda$1() {
        return "Tearing down all geofences.";
    }

    public void configureFromServerConfig(re serverConfig) {
        serverConfig.getClass();
        boolean z = serverConfig.i;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda34(z, 8), 7, (Object) null);
        if (z) {
            Context context = this.applicationContext;
            context.getClass();
            if (isGeofencesEnabledFromEnvironment(context)) {
                this.brazeGeofenceApi.getClass();
            }
        }
        int i = 1;
        if (this.isGeofencesEnabled) {
            this.isGeofencesEnabled = false;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new BrazeGeofenceManager$$ExternalSyntheticLambda17(this, 0), 6, (Object) null);
            if (this.isGeofencesEnabled) {
                setUpGeofences(false);
                if (this.configurationProvider.isAutomaticGeofenceRequestsEnabled()) {
                    requestGeofenceRefresh(true);
                }
            } else {
                tearDownGeofences(this.geofenceTransitionPendingIntent);
            }
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda9(29), 7, (Object) null);
        }
        int i2 = serverConfig.g;
        if (i2 >= 0) {
            this.maxNumToRegister = i2;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new BrazeGeofenceManager$$ExternalSyntheticLambda17(this, i), 6, (Object) null);
        }
        this.brazeGeofenceReEligibilityManager.a(serverConfig);
    }

    public final boolean isGeofencesEnabledFromEnvironment(Context context) {
        context.getClass();
        if (!INSTANCE.getGeofencesEnabledFromConfiguration(this.configurationProvider)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Banner$$ExternalSyntheticLambda0(9), 7, (Object) null);
            return false;
        }
        if (!PermissionUtils.hasPermission(context, "android.permission.ACCESS_FINE_LOCATION")) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Banner$$ExternalSyntheticLambda0(10), 6, (Object) null);
            return false;
        }
        if (!PermissionUtils.hasPermission(context, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Banner$$ExternalSyntheticLambda0(11), 6, (Object) null);
            return false;
        }
        if (!g.a(context)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda9(24), 7, (Object) null);
            return false;
        }
        this.brazeGeofenceApi.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda9(25), 7, (Object) null);
        return false;
    }

    public void registerGeofences(List<BrazeGeofence> geofenceList) {
        String str;
        geofenceList.getClass();
        ArrayList arrayList = new ArrayList(geofenceList);
        int i = 2;
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Banner$$ExternalSyntheticLambda0(i), 6, (Object) null);
            return;
        }
        ReentrantLock reentrantLock = this.geofenceListLock;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new n$$ExternalSyntheticLambda2(6, arrayList), 7, (Object) null);
            this.geofenceDataStoreProvider.clearData(DataStoreKey.GEOFENCES);
            this.brazeGeofences.clear();
            Iterator it = arrayList.iterator();
            int i2 = 0;
            while (true) {
                int i3 = 1;
                if (!it.hasNext()) {
                    break;
                }
                BrazeGeofence brazeGeofence = (BrazeGeofence) it.next();
                if (i2 == this.maxNumToRegister) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeGeofenceManager$$ExternalSyntheticLambda17(this, i), 7, (Object) null);
                    break;
                } else {
                    this.brazeGeofences.add(brazeGeofence);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o8$$ExternalSyntheticLambda2(brazeGeofence, i3), 7, (Object) null);
                    i2++;
                }
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeGeofenceManager$$ExternalSyntheticLambda17(this, 3), 7, (Object) null);
            GeofenceDataStoreProvider geofenceDataStoreProvider = this.geofenceDataStoreProvider;
            DataStoreKey dataStoreKey = DataStoreKey.GEOFENCES;
            List<BrazeGeofence> list = this.brazeGeofences;
            if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    try {
                        Json.Default r0 = Json.Default;
                        r0.getClass();
                        str = r0.encodeToString(new HashSetSerializer(BrazeGeofence.Companion.serializer(), 1), list);
                    } catch (Exception e) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                        str = (!(list instanceof Map) && (list instanceof List)) ? "[]" : "{}";
                    }
                    geofenceDataStoreProvider.writeData(dataStoreKey, str);
                } catch (Exception e2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
                }
            }
            reentrantLock.unlock();
            this.brazeGeofenceReEligibilityManager.a(arrayList);
            setUpGeofences(true);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void registerGeofencesWithGooglePlay(List<BrazeGeofence> geofenceList, PendingIntent geofenceRequestIntent) {
        geofenceList.getClass();
        geofenceRequestIntent.getClass();
        u1 u1Var = this.brazeGeofenceApi;
        Context context = this.applicationContext;
        context.getClass();
        u1Var.getClass();
        context.getClass();
        geofenceList.getClass();
        geofenceRequestIntent.getClass();
    }

    public void requestGeofenceRefresh(boolean ignoreRateLimit) {
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Banner$$ExternalSyntheticLambda0(3), 7, (Object) null);
        } else if (this.brazeGeofenceReEligibilityManager.a(ignoreRateLimit, DateTimeUtils.nowInSeconds())) {
            requestSingleLocationUpdateFromGooglePlay();
        }
    }

    public final void requestSingleLocationUpdateFromGooglePlay() {
        this.brazeLocationApi.getClass();
    }

    public final List<BrazeGeofence> retrieveBrazeGeofencesFromLocalStorage() {
        ArrayList arrayList;
        Collection collection;
        GeofenceDataStoreProvider geofenceDataStoreProvider = this.geofenceDataStoreProvider;
        DataStoreKey dataStoreKey = DataStoreKey.GEOFENCES;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.i(dataStoreKey), 12, (Object) null);
            arrayList = new ArrayList();
        } else {
            try {
                Object readData = geofenceDataStoreProvider.readData(dataStoreKey, "");
                readData.getClass();
                String str = (String) readData;
                if (StringsKt.isBlank(str)) {
                    arrayList = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (StringsKt.isBlank(str)) {
                        collection = EmptyList.INSTANCE;
                    } else if (Intrinsics.areEqual(StringsKt.trim(str).toString(), "null")) {
                        collection = EmptyList.INSTANCE;
                    } else {
                        try {
                            Json.Default r0 = Json.Default;
                            r0.getClass();
                            collection = (List) r0.decodeFromString(str, new HashSetSerializer(BrazeGeofence.Companion.serializer(), 1));
                        } catch (Exception e) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new DataStoreUtils.a(str), 4, (Object) null);
                            collection = EmptyList.INSTANCE;
                        }
                    }
                    arrayList = CollectionsKt.toMutableList(collection);
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreProvider.j(dataStoreKey), 8, (Object) null);
                arrayList = new ArrayList();
            }
        }
        if (arrayList.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda9(26), 7, (Object) null);
        }
        return arrayList;
    }

    public final void setUpGeofences(boolean reRegisterGeofences) {
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda9(27), 7, (Object) null);
            return;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Braze$$ExternalSyntheticLambda34(reRegisterGeofences, 7), 6, (Object) null);
        PendingIntent pendingIntent = this.geofenceTransitionPendingIntent;
        if (pendingIntent == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda9(28), 7, (Object) null);
            return;
        }
        if (reRegisterGeofences) {
            ReentrantLock reentrantLock = this.geofenceListLock;
            reentrantLock.lock();
            try {
                registerGeofencesWithGooglePlay(this.brazeGeofences, pendingIntent);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void tearDownGeofences(PendingIntent geofenceRequestIntent) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Banner$$ExternalSyntheticLambda0(6), 7, (Object) null);
        if (geofenceRequestIntent != null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Banner$$ExternalSyntheticLambda0(7), 7, (Object) null);
            u1 u1Var = this.brazeGeofenceApi;
            Context context = this.applicationContext;
            context.getClass();
            u1Var.getClass();
            context.getClass();
        }
        ReentrantLock reentrantLock = this.geofenceListLock;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Banner$$ExternalSyntheticLambda0(8), 7, (Object) null);
            this.geofenceDataStoreProvider.clearData(DataStoreKey.GEOFENCES);
            this.brazeGeofences.clear();
        } finally {
            reentrantLock.unlock();
        }
    }

    public void unregisterGeofences() {
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeUser$$ExternalSyntheticLambda9(23), 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Banner$$ExternalSyntheticLambda0(1), 7, (Object) null);
            tearDownGeofences(this.geofenceTransitionPendingIntent);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/braze/managers/BrazeGeofenceManager$Companion;", "", "<init>", "()V", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "", "getGeofencesEnabledFromConfiguration", "(Lcom/braze/configuration/BrazeConfigurationProvider;)Z", "Lbo/app/ue;", "serverConfigStorageProvider", "getGeofencesEnabledFromServerConfig", "(Lbo/app/ue;)Z", "", "getMaxNumToRegister", "(Lbo/app/ue;)I", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getGeofencesEnabledFromServerConfig$lambda$0() {
            return "Geofences enabled in server configuration.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getGeofencesEnabledFromServerConfig$lambda$1() {
            return "Geofences explicitly disabled via server configuration.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getGeofencesEnabledFromServerConfig$lambda$2() {
            return "Geofences implicitly disabled via server configuration.";
        }

        public final boolean getGeofencesEnabledFromConfiguration(BrazeConfigurationProvider configurationProvider) {
            configurationProvider.getClass();
            return configurationProvider.isGeofencesEnabled();
        }

        public final boolean getGeofencesEnabledFromServerConfig(ue serverConfigStorageProvider) {
            serverConfigStorageProvider.getClass();
            if (!serverConfigStorageProvider.K()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Banner$$ExternalSyntheticLambda0(14), 6, (Object) null);
                return false;
            }
            if (serverConfigStorageProvider.J()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Banner$$ExternalSyntheticLambda0(12), 6, (Object) null);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Banner$$ExternalSyntheticLambda0(13), 6, (Object) null);
            return false;
        }

        public final int getMaxNumToRegister(ue serverConfigStorageProvider) {
            serverConfigStorageProvider.getClass();
            if (serverConfigStorageProvider.r() > 0) {
                return serverConfigStorageProvider.r();
            }
            return 20;
        }

        private Companion() {
        }
    }
}

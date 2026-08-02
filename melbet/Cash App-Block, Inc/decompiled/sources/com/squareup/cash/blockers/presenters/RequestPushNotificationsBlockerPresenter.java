package com.squareup.cash.blockers.presenters;

import android.os.Build;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Utils_androidKt;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.api.ContextKt;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.RequestPushNotificationsBlockerViewModel;
import com.squareup.cash.cdf.notificationsoptin.NotificationPromptEntryPoint;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.clientsync.EntitySyncerKt$hasSyncedFlow$1;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.TemporaryStorage$getDir$2;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.profile.RealProfileNotificationsRepository;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.protos.cash.notificationsettings.api.v1.CategoryPreferenceUpdate;
import com.squareup.protos.cash.notificationsettings.clientsync.v1.UiCategoryNotificationPreference;
import com.squareup.protos.cash.notificationsettings.clientsync.v1.UiNotificationSettings;
import com.squareup.protos.cash.notificationsettings.common.v1.ClientChannelState;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategory;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategoryExtraConfig;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.PushNotificationToggle;
import com.squareup.protos.franklin.api.RequestPushNotificationsScreen;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.RequestPushNotificationsRequest;
import com.squareup.protos.franklin.app.SubmitBlockerRequest;
import com.squareup.protos.franklin.app.SubmitBlockerRequest$Request$Request$RequestPushNotificationsRequest;
import com.squareup.protos.franklin.app.SubmitBlockerResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.util.coroutines.TickerKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final class RequestPushNotificationsBlockerPresenter implements MoleculePresenter {
    public static final List ACCOUNT_HOLDER_LEVEL_CATEGORIES = CollectionsKt__CollectionsKt.listOf((Object[]) new NotificationCategory[]{NotificationCategory.NOTIFICATION_CATEGORY_ACCOUNT_SECURITY, NotificationCategory.NOTIFICATION_CATEGORY_ACCOUNT_NOTICES, NotificationCategory.NOTIFICATION_CATEGORY_ACCOUNT_CHANGES});
    public static final List ACCOUNT_LEVEL_CATEGORIES = CollectionsKt__CollectionsJVMKt.listOf(NotificationCategory.NOTIFICATION_CATEGORY_ACTIVITY_TRANSACTIONS);
    public static final List MARKETING_CATEGORIES = CollectionsKt__CollectionsKt.listOf((Object[]) new NotificationCategory[]{NotificationCategory.NOTIFICATION_CATEGORY_MARKETING_CASH_APP_NEWS, NotificationCategory.NOTIFICATION_CATEGORY_MARKETING_OFFERS, NotificationCategory.NOTIFICATION_CATEGORY_MARKETING_EXCLUSIVES});
    public final Analytics analytics;
    public final AppService appService;
    public final BlockersScreens.RequestPushNotificationsBlockerScreen args;
    public final BlockersDataNavigator blockersDataNavigator;
    public final BetterNavigator.ScreenNavigator navigator;
    public final AndroidPermissionManager permissionManager;
    public final RealProfileNotificationsRepository profileNotificationsRepository;
    public final SessionManager sessionManager;
    public final AndroidStringManager stringManager;

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RequestPushNotificationsScreen.EntryPoint.values().length];
            try {
                iArr[RequestPushNotificationsScreen.EntryPoint.POST_SIGN_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RequestPushNotificationsScreen.EntryPoint.P2P_SEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RequestPushNotificationsScreen.EntryPoint.P2P_RECEIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RequestPushNotificationsScreen.EntryPoint.CARD_ORDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RequestPushNotificationsScreen.EntryPoint.COLD_OPEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RequestPushNotificationsBlockerPresenter(BlockersDataNavigator blockersDataNavigator, AndroidStringManager androidStringManager, BlockersScreens.RequestPushNotificationsBlockerScreen requestPushNotificationsBlockerScreen, BetterNavigator.ScreenNavigator screenNavigator, AndroidPermissionManager androidPermissionManager, Analytics analytics, AppService appService, RealProfileNotificationsRepository realProfileNotificationsRepository, SessionManager sessionManager) {
        this.blockersDataNavigator = blockersDataNavigator;
        this.stringManager = androidStringManager;
        this.args = requestPushNotificationsBlockerScreen;
        this.navigator = screenNavigator;
        this.permissionManager = androidPermissionManager;
        this.analytics = analytics;
        this.appService = appService;
        this.profileNotificationsRepository = realProfileNotificationsRepository;
        this.sessionManager = sessionManager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e7, code lost:
    
        if (r9.saveNotificationPreferences(r11, r0) != r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f2, code lost:
    
        if (r9.progressToNextScreen(r0) != r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        if (r9.requestOsNotificationPermission(r0) == r1) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$checkAndRequestNotificationPermissions(RequestPushNotificationsBlockerPresenter requestPushNotificationsBlockerPresenter, Map map, ContinuationImpl continuationImpl) {
        RequestPushNotificationsBlockerPresenter$checkAndRequestNotificationPermissions$1 requestPushNotificationsBlockerPresenter$checkAndRequestNotificationPermissions$1;
        int i;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        if (continuationImpl instanceof RequestPushNotificationsBlockerPresenter$checkAndRequestNotificationPermissions$1) {
            requestPushNotificationsBlockerPresenter$checkAndRequestNotificationPermissions$1 = (RequestPushNotificationsBlockerPresenter$checkAndRequestNotificationPermissions$1) continuationImpl;
            int i2 = requestPushNotificationsBlockerPresenter$checkAndRequestNotificationPermissions$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                requestPushNotificationsBlockerPresenter$checkAndRequestNotificationPermissions$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = requestPushNotificationsBlockerPresenter$checkAndRequestNotificationPermissions$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requestPushNotificationsBlockerPresenter$checkAndRequestNotificationPermissions$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (map.isEmpty()) {
                        requestPushNotificationsBlockerPresenter$checkAndRequestNotificationPermissions$1.label = 1;
                    } else {
                        linkedHashMap = new LinkedHashMap();
                        Boolean bool = (Boolean) map.get(com.squareup.protos.franklin.api.NotificationCategory.ACCOUNT_AND_TRANSACTION_ACTIVITY);
                        if (bool != null) {
                            Iterator it = CollectionsKt.plus((Iterable) ACCOUNT_LEVEL_CATEGORIES, (Collection) ACCOUNT_HOLDER_LEVEL_CATEGORIES).iterator();
                            while (it.hasNext()) {
                                linkedHashMap.put((NotificationCategory) it.next(), bool);
                            }
                        }
                        Boolean bool2 = (Boolean) map.get(com.squareup.protos.franklin.api.NotificationCategory.MARKETING_OFFERS);
                        if (bool2 != null) {
                            Iterator it2 = MARKETING_CATEGORIES.iterator();
                            while (it2.hasNext()) {
                                linkedHashMap.put((NotificationCategory) it2.next(), bool2);
                            }
                        }
                        Collection values = linkedHashMap.values();
                        if (!(values instanceof Collection) || !values.isEmpty()) {
                            Iterator it3 = values.iterator();
                            while (it3.hasNext()) {
                                if (((Boolean) it3.next()).booleanValue()) {
                                    requestPushNotificationsBlockerPresenter$checkAndRequestNotificationPermissions$1.L$1 = linkedHashMap;
                                    requestPushNotificationsBlockerPresenter$checkAndRequestNotificationPermissions$1.label = 2;
                                    if (requestPushNotificationsBlockerPresenter.requestOsNotificationPermission(requestPushNotificationsBlockerPresenter$checkAndRequestNotificationPermissions$1) != obj2) {
                                        linkedHashMap2 = linkedHashMap;
                                        linkedHashMap = linkedHashMap2;
                                    }
                                }
                            }
                        }
                        requestPushNotificationsBlockerPresenter$checkAndRequestNotificationPermissions$1.L$1 = null;
                        requestPushNotificationsBlockerPresenter$checkAndRequestNotificationPermissions$1.label = 3;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i == 2) {
                        linkedHashMap2 = requestPushNotificationsBlockerPresenter$checkAndRequestNotificationPermissions$1.L$1;
                        SafeTrace.throwOnFailure(obj);
                        linkedHashMap = linkedHashMap2;
                        requestPushNotificationsBlockerPresenter$checkAndRequestNotificationPermissions$1.L$1 = null;
                        requestPushNotificationsBlockerPresenter$checkAndRequestNotificationPermissions$1.label = 3;
                    } else if (i != 3) {
                        if (i == 4) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                SafeTrace.throwOnFailure(obj);
                requestPushNotificationsBlockerPresenter$checkAndRequestNotificationPermissions$1.L$1 = null;
                requestPushNotificationsBlockerPresenter$checkAndRequestNotificationPermissions$1.label = 4;
            }
        }
        requestPushNotificationsBlockerPresenter$checkAndRequestNotificationPermissions$1 = new RequestPushNotificationsBlockerPresenter$checkAndRequestNotificationPermissions$1(requestPushNotificationsBlockerPresenter, continuationImpl);
        Object obj3 = requestPushNotificationsBlockerPresenter$checkAndRequestNotificationPermissions$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requestPushNotificationsBlockerPresenter$checkAndRequestNotificationPermissions$1.label;
        if (i != 0) {
        }
        requestPushNotificationsBlockerPresenter$checkAndRequestNotificationPermissions$1.L$1 = null;
        requestPushNotificationsBlockerPresenter$checkAndRequestNotificationPermissions$1.label = 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable fetchCategoryVersions(ContinuationImpl continuationImpl) {
        RequestPushNotificationsBlockerPresenter$fetchCategoryVersions$1 requestPushNotificationsBlockerPresenter$fetchCategoryVersions$1;
        int i;
        UiNotificationSettings uiNotificationSettings;
        List list;
        if (continuationImpl instanceof RequestPushNotificationsBlockerPresenter$fetchCategoryVersions$1) {
            requestPushNotificationsBlockerPresenter$fetchCategoryVersions$1 = (RequestPushNotificationsBlockerPresenter$fetchCategoryVersions$1) continuationImpl;
            int i2 = requestPushNotificationsBlockerPresenter$fetchCategoryVersions$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                requestPushNotificationsBlockerPresenter$fetchCategoryVersions$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = requestPushNotificationsBlockerPresenter$fetchCategoryVersions$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requestPushNotificationsBlockerPresenter$fetchCategoryVersions$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChannelFlowTransformLatest notificationSettings = this.profileNotificationsRepository.getNotificationSettings();
                    requestPushNotificationsBlockerPresenter$fetchCategoryVersions$1.label = 1;
                    obj = FlowKt.firstOrNull(notificationSettings, requestPushNotificationsBlockerPresenter$fetchCategoryVersions$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                uiNotificationSettings = (UiNotificationSettings) obj;
                if (uiNotificationSettings != null || (list = uiNotificationSettings.category_preferences) == null) {
                    EmptyMap emptyMap = EmptyMap.INSTANCE;
                    emptyMap.getClass();
                    return emptyMap;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((UiCategoryNotificationPreference) obj2).category != null) {
                        arrayList.add(obj2);
                    }
                }
                int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                if (mapCapacity < 16) {
                    mapCapacity = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    UiCategoryNotificationPreference uiCategoryNotificationPreference = (UiCategoryNotificationPreference) it.next();
                    NotificationCategory notificationCategory = uiCategoryNotificationPreference.category;
                    notificationCategory.getClass();
                    linkedHashMap.put(notificationCategory, uiCategoryNotificationPreference.version);
                }
                return linkedHashMap;
            }
        }
        requestPushNotificationsBlockerPresenter$fetchCategoryVersions$1 = new RequestPushNotificationsBlockerPresenter$fetchCategoryVersions$1(this, continuationImpl);
        Object obj3 = requestPushNotificationsBlockerPresenter$fetchCategoryVersions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requestPushNotificationsBlockerPresenter$fetchCategoryVersions$1.label;
        if (i != 0) {
        }
        uiNotificationSettings = (UiNotificationSettings) obj3;
        if (uiNotificationSettings != null) {
        }
        EmptyMap emptyMap2 = EmptyMap.INSTANCE;
        emptyMap2.getClass();
        return emptyMap2;
    }

    public final NotificationPromptEntryPoint mapEntryPoint() {
        RequestPushNotificationsScreen requestPushNotificationsScreen = this.args.blocker;
        RequestPushNotificationsScreen.EntryPoint entryPoint = requestPushNotificationsScreen != null ? requestPushNotificationsScreen.entry_point : null;
        int i = entryPoint == null ? -1 : WhenMappings.$EnumSwitchMapping$0[entryPoint.ordinal()];
        if (i == 1) {
            return NotificationPromptEntryPoint.POST_SIGN_IN;
        }
        if (i == 2) {
            return NotificationPromptEntryPoint.P2P_SEND;
        }
        if (i == 3) {
            return NotificationPromptEntryPoint.P2P_RECEIVE;
        }
        if (i == 4) {
            return NotificationPromptEntryPoint.CARD_ORDER;
        }
        if (i != 5) {
            return null;
        }
        return NotificationPromptEntryPoint.COLD_OPEN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fb, code lost:
    
        if (r2 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0116, code lost:
    
        if (r2 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0140, code lost:
    
        if (r2 == null) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-372847987);
        RequestPushNotificationsScreen requestPushNotificationsScreen = this.args.blocker;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        List<PushNotificationToggle> list = requestPushNotificationsScreen != null ? requestPushNotificationsScreen.notification_toggles : null;
        if (list == null) {
            list = EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((PushNotificationToggle) obj).category != null) {
                arrayList.add(obj);
            }
        }
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            if (mapCapacity < 16) {
                mapCapacity = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.squareup.protos.franklin.api.NotificationCategory notificationCategory = ((PushNotificationToggle) it.next()).category;
                notificationCategory.getClass();
                linkedHashMap.put(notificationCategory, Boolean.TRUE);
            }
            rememberedValue = Updater.mutableStateOf$default(linkedHashMap);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new TemporaryStorage$getDir$2(this, objArr == true ? 1 : 0, 2);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
        Updater.LaunchedEffect(gapComposer, flow, new SetNamePresenter$models$1$1$1(25, mutableState, (MoleculePresenter) this, (Object) flow, (Continuation) (objArr2 == true ? 1 : 0)));
        Map map = (Map) mutableState.getValue();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (true) {
            boolean z = true;
            if (!it2.hasNext()) {
                break;
            }
            PushNotificationToggle pushNotificationToggle = (PushNotificationToggle) it2.next();
            com.squareup.protos.franklin.api.NotificationCategory notificationCategory2 = pushNotificationToggle.category;
            notificationCategory2.getClass();
            String str5 = pushNotificationToggle.category_title;
            if (str5 == null) {
                str5 = "";
            }
            Icon icon = pushNotificationToggle.icon;
            Boolean bool = (Boolean) map.get(pushNotificationToggle.category);
            if (bool != null) {
                z = bool.booleanValue();
            }
            arrayList2.add(new RequestPushNotificationsBlockerViewModel.NotificationToggle(notificationCategory2, str5, icon, z));
        }
        AndroidStringManager androidStringManager = this.stringManager;
        if (requestPushNotificationsScreen != null && (str = requestPushNotificationsScreen.title) != null) {
            if (str.length() <= 0) {
                str = null;
            }
        }
        str = androidStringManager.get(R.string.blockers_push_notifications_title);
        String str6 = str;
        if (requestPushNotificationsScreen != null && (str2 = requestPushNotificationsScreen.subtitle) != null) {
            if (str2.length() <= 0) {
                str2 = null;
            }
        }
        str2 = androidStringManager.get(R.string.blockers_push_notifications_subtitle);
        String str7 = str2;
        String str8 = (requestPushNotificationsScreen == null || (str4 = requestPushNotificationsScreen.skip_button_text) == null || str4.length() <= 0) ? null : str4;
        if (requestPushNotificationsScreen != null && (str3 = requestPushNotificationsScreen.primary_button_text) != null) {
            if (str3.length() <= 0) {
                str3 = null;
            }
        }
        str3 = androidStringManager.get(R.string.blockers_push_notifications_primary_button);
        RequestPushNotificationsBlockerViewModel requestPushNotificationsBlockerViewModel = new RequestPushNotificationsBlockerViewModel(str3, str6, str7, requestPushNotificationsScreen != null ? requestPushNotificationsScreen.arcade_icon : null, str8, !arrayList2.isEmpty(), arrayList2);
        gapComposer.end(false);
        return requestPushNotificationsBlockerViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object progressToNextScreen(ContinuationImpl continuationImpl) {
        RequestPushNotificationsBlockerPresenter$progressToNextScreen$1 requestPushNotificationsBlockerPresenter$progressToNextScreen$1;
        int i;
        Object obj;
        boolean z;
        BlockersScreens.RequestPushNotificationsBlockerScreen requestPushNotificationsBlockerScreen = this.args;
        BlockersData blockersData = requestPushNotificationsBlockerScreen.blockersData;
        if (continuationImpl instanceof RequestPushNotificationsBlockerPresenter$progressToNextScreen$1) {
            requestPushNotificationsBlockerPresenter$progressToNextScreen$1 = (RequestPushNotificationsBlockerPresenter$progressToNextScreen$1) continuationImpl;
            int i2 = requestPushNotificationsBlockerPresenter$progressToNextScreen$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                requestPushNotificationsBlockerPresenter$progressToNextScreen$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = requestPushNotificationsBlockerPresenter$progressToNextScreen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requestPushNotificationsBlockerPresenter$progressToNextScreen$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    ClientScenario clientScenario = blockersData.clientScenario;
                    clientScenario.getClass();
                    String str = blockersData.flowToken;
                    SubmitBlockerRequest.Request.Builder builder = new SubmitBlockerRequest.Request.Builder();
                    String str2 = blockersData.blockerId;
                    str2.getClass();
                    builder.blocker_descriptor_id = str2;
                    builder.request = new SubmitBlockerRequest$Request$Request$RequestPushNotificationsRequest(new RequestPushNotificationsRequest(null, ByteString.EMPTY));
                    SubmitBlockerRequest submitBlockerRequest = new SubmitBlockerRequest(null, CollectionsKt__CollectionsJVMKt.listOf(builder.build()), 11);
                    requestPushNotificationsBlockerPresenter$progressToNextScreen$1.label = 1;
                    obj2 = this.appService.submitBlocker(clientScenario, str, submitBlockerRequest, requestPushNotificationsBlockerPresenter$progressToNextScreen$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                }
                obj = (ApiResult) obj2;
                if (!(obj instanceof ApiResult.Success)) {
                    SubmitBlockerResponse submitBlockerResponse = (SubmitBlockerResponse) ((ApiResult.Success) obj).response;
                    ResponseContext mergeResponseContexts = ContextKt.mergeResponseContexts(submitBlockerResponse.app_response_context, submitBlockerResponse.blocker_response_context, submitBlockerResponse.flow_response_context);
                    obj = Matcher$$ExternalSyntheticOutline0.m(mergeResponseContexts, mergeResponseContexts);
                } else if (!(obj instanceof ApiResult.Failure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                z = obj instanceof ApiResult.Success;
                BetterNavigator.ScreenNavigator screenNavigator = this.navigator;
                if (!z) {
                    ResponseContext responseContext = (ResponseContext) ((ApiResult.Success) obj).response;
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    screenNavigator.goTo(this.blockersDataNavigator.getNext(requestPushNotificationsBlockerScreen, blockersData.updateFromResponseContext(responseContext, false)));
                } else {
                    if (!(obj instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator.goTo(TickerKt.toMessageScreen$default((ApiResult.Failure) obj, requestPushNotificationsBlockerScreen, this.stringManager));
                }
                return Unit.INSTANCE;
            }
        }
        requestPushNotificationsBlockerPresenter$progressToNextScreen$1 = new RequestPushNotificationsBlockerPresenter$progressToNextScreen$1(this, continuationImpl);
        Object obj22 = requestPushNotificationsBlockerPresenter$progressToNextScreen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requestPushNotificationsBlockerPresenter$progressToNextScreen$1.label;
        if (i != 0) {
        }
        obj = (ApiResult) obj22;
        if (!(obj instanceof ApiResult.Success)) {
        }
        z = obj instanceof ApiResult.Success;
        BetterNavigator.ScreenNavigator screenNavigator2 = this.navigator;
        if (!z) {
        }
        return Unit.INSTANCE;
    }

    public final Object requestOsNotificationPermission(RequestPushNotificationsBlockerPresenter$checkAndRequestNotificationPermissions$1 requestPushNotificationsBlockerPresenter$checkAndRequestNotificationPermissions$1) {
        Object requestNotificationPermissionWithAnalytics;
        return (Build.VERSION.SDK_INT <= 32 || (requestNotificationPermissionWithAnalytics = Utils_androidKt.requestNotificationPermissionWithAnalytics(this.permissionManager.create("android.permission.POST_NOTIFICATIONS"), this.analytics, mapEntryPoint(), requestPushNotificationsBlockerPresenter$checkAndRequestNotificationPermissions$1)) != CoroutineSingletons.COROUTINE_SUSPENDED) ? Unit.INSTANCE : requestNotificationPermissionWithAnalytics;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d7, code lost:
    
        if (r1 != r3) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object saveNotificationPreferences(Map map, ContinuationImpl continuationImpl) {
        RequestPushNotificationsBlockerPresenter$saveNotificationPreferences$1 requestPushNotificationsBlockerPresenter$saveNotificationPreferences$1;
        int i;
        Map map2;
        if (continuationImpl instanceof RequestPushNotificationsBlockerPresenter$saveNotificationPreferences$1) {
            requestPushNotificationsBlockerPresenter$saveNotificationPreferences$1 = (RequestPushNotificationsBlockerPresenter$saveNotificationPreferences$1) continuationImpl;
            int i2 = requestPushNotificationsBlockerPresenter$saveNotificationPreferences$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                requestPushNotificationsBlockerPresenter$saveNotificationPreferences$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = requestPushNotificationsBlockerPresenter$saveNotificationPreferences$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requestPushNotificationsBlockerPresenter$saveNotificationPreferences$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (map.isEmpty()) {
                        return Unit.INSTANCE;
                    }
                    requestPushNotificationsBlockerPresenter$saveNotificationPreferences$1.L$0 = map;
                    requestPushNotificationsBlockerPresenter$saveNotificationPreferences$1.label = 1;
                    obj = fetchCategoryVersions(requestPushNotificationsBlockerPresenter$saveNotificationPreferences$1);
                    if (obj != obj2) {
                        map2 = map;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Map map3 = requestPushNotificationsBlockerPresenter$saveNotificationPreferences$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    ApiResult apiResult = (ApiResult) obj;
                    if (apiResult instanceof ApiResult.Success) {
                        Timber.Forest forest = Timber.Forest;
                        forest.tag("RequestPushNotificationsBlockerPresenter");
                        forest.d("Notification preferences saved successfully", new Object[0]);
                    } else {
                        if (!(apiResult instanceof ApiResult.Failure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        Timber.Forest forest2 = Timber.Forest;
                        forest2.tag("RequestPushNotificationsBlockerPresenter");
                        forest2.e("Failed to save notification preferences: " + apiResult, new Object[0]);
                    }
                    return Unit.INSTANCE;
                }
                map2 = requestPushNotificationsBlockerPresenter$saveNotificationPreferences$1.L$0;
                SafeTrace.throwOnFailure(obj);
                Map map4 = (Map) obj;
                String activeAccountTokenOrNull = PlatformKt.activeAccountTokenOrNull(this.sessionManager);
                ArrayList arrayList = new ArrayList(map2.size());
                for (Map.Entry entry : map2.entrySet()) {
                    NotificationCategory notificationCategory = (NotificationCategory) entry.getKey();
                    arrayList.add(new CategoryPreferenceUpdate(ACCOUNT_LEVEL_CATEGORIES.contains(notificationCategory) ? activeAccountTokenOrNull : null, notificationCategory, (ClientChannelState) null, ((Boolean) entry.getValue()).booleanValue() ? ClientChannelState.CLIENT_CHANNEL_STATE_SWITCHED_ON_ENABLED : ClientChannelState.CLIENT_CHANNEL_STATE_SWITCHED_OFF_ENABLED, (ClientChannelState) null, (Long) map4.get(notificationCategory), (NotificationCategoryExtraConfig) null, (Boolean) null, 468));
                }
                requestPushNotificationsBlockerPresenter$saveNotificationPreferences$1.L$0 = null;
                requestPushNotificationsBlockerPresenter$saveNotificationPreferences$1.label = 2;
                RealProfileNotificationsRepository realProfileNotificationsRepository = this.profileNotificationsRepository;
                obj = JobKt.withContext(realProfileNotificationsRepository.ioDispatcher, new EntitySyncerKt$hasSyncedFlow$1(realProfileNotificationsRepository, arrayList, continuation, 21), requestPushNotificationsBlockerPresenter$saveNotificationPreferences$1);
            }
        }
        requestPushNotificationsBlockerPresenter$saveNotificationPreferences$1 = new RequestPushNotificationsBlockerPresenter$saveNotificationPreferences$1(this, continuationImpl);
        Object obj3 = requestPushNotificationsBlockerPresenter$saveNotificationPreferences$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requestPushNotificationsBlockerPresenter$saveNotificationPreferences$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        Map map42 = (Map) obj3;
        String activeAccountTokenOrNull2 = PlatformKt.activeAccountTokenOrNull(this.sessionManager);
        ArrayList arrayList2 = new ArrayList(map2.size());
        while (r4.hasNext()) {
        }
        requestPushNotificationsBlockerPresenter$saveNotificationPreferences$1.L$0 = null;
        requestPushNotificationsBlockerPresenter$saveNotificationPreferences$1.label = 2;
        RealProfileNotificationsRepository realProfileNotificationsRepository2 = this.profileNotificationsRepository;
        obj3 = JobKt.withContext(realProfileNotificationsRepository2.ioDispatcher, new EntitySyncerKt$hasSyncedFlow$1(realProfileNotificationsRepository2, arrayList2, continuation2, 21), requestPushNotificationsBlockerPresenter$saveNotificationPreferences$1);
    }
}

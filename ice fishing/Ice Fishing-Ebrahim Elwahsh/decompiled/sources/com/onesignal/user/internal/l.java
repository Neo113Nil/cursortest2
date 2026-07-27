package com.onesignal.user.internal;

import E7.p;
import android.content.Context;
import com.onesignal.common.AndroidUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class l {
    private final AndroidUtils androidUtils;
    private final E7.a appContextProvider;
    private final String carrierName;
    private final com.onesignal.core.internal.config.b configModel;
    private final String deviceOS;
    private final com.onesignal.common.d idManager;
    private final Q5.b identityModelStore;
    private final com.onesignal.common.h oneSignalUtils;
    private final D4.f operationRepo;
    private final F4.b preferencesService;
    private final com.onesignal.user.internal.properties.b propertiesModelStore;
    private final r4.d services;
    private final V5.e subscriptionModelStore;

    public l(F4.b preferencesService, D4.f operationRepo, r4.d services, com.onesignal.common.d idManager, Q5.b identityModelStore, com.onesignal.user.internal.properties.b propertiesModelStore, V5.e subscriptionModelStore, com.onesignal.core.internal.config.b configModel, com.onesignal.common.h oneSignalUtils, String str, String str2, AndroidUtils androidUtils, E7.a appContextProvider) {
        kotlin.jvm.internal.h.e(preferencesService, "preferencesService");
        kotlin.jvm.internal.h.e(operationRepo, "operationRepo");
        kotlin.jvm.internal.h.e(services, "services");
        kotlin.jvm.internal.h.e(idManager, "idManager");
        kotlin.jvm.internal.h.e(identityModelStore, "identityModelStore");
        kotlin.jvm.internal.h.e(propertiesModelStore, "propertiesModelStore");
        kotlin.jvm.internal.h.e(subscriptionModelStore, "subscriptionModelStore");
        kotlin.jvm.internal.h.e(configModel, "configModel");
        kotlin.jvm.internal.h.e(oneSignalUtils, "oneSignalUtils");
        kotlin.jvm.internal.h.e(androidUtils, "androidUtils");
        kotlin.jvm.internal.h.e(appContextProvider, "appContextProvider");
        this.preferencesService = preferencesService;
        this.operationRepo = operationRepo;
        this.services = services;
        this.idManager = idManager;
        this.identityModelStore = identityModelStore;
        this.propertiesModelStore = propertiesModelStore;
        this.subscriptionModelStore = subscriptionModelStore;
        this.configModel = configModel;
        this.oneSignalUtils = oneSignalUtils;
        this.carrierName = str;
        this.deviceOS = str2;
        this.androidUtils = androidUtils;
        this.appContextProvider = appContextProvider;
    }

    public static /* synthetic */ void createAndSwitchToNewUser$default(l lVar, boolean z8, p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = false;
        }
        if ((i & 2) != 0) {
            pVar = null;
        }
        lVar.createAndSwitchToNewUser(z8, pVar);
    }

    private final void createNewUser() {
        com.onesignal.debug.internal.logging.b.debug$default("initWithContext: creating new device-scoped user", null, 2, null);
        createAndSwitchToNewUser$default(this, false, null, 3, null);
        D4.e.enqueue$default(this.operationRepo, new R5.f(this.configModel.getAppId(), ((Q5.a) this.identityModelStore.getModel()).getOnesignalId(), ((Q5.a) this.identityModelStore.getModel()).getExternalId(), null, 8, null), false, 2, null);
    }

    private final void migrateFromLegacyUser(String str) {
        l lVar;
        String str2;
        boolean z8;
        com.onesignal.debug.internal.logging.b.debug$default("initWithContext: creating user linked to subscription " + str, null, 2, null);
        String legacyUserSyncValues = F4.d.getLegacyUserSyncValues(this.preferencesService);
        if (legacyUserSyncValues != null) {
            lVar = this;
            str2 = str;
            lVar.createPushSubscriptionFromLegacySync(str2, new JSONObject(legacyUserSyncValues), this.configModel, this.subscriptionModelStore, ((t4.f) this.services.getService(t4.f.class)).getAppContext());
            z8 = true;
        } else {
            lVar = this;
            str2 = str;
            z8 = false;
        }
        createAndSwitchToNewUser$default(this, z8, null, 2, null);
        D4.e.enqueue$default(lVar.operationRepo, new R5.e(lVar.configModel.getAppId(), ((Q5.a) lVar.identityModelStore.getModel()).getOnesignalId(), ((Q5.a) lVar.identityModelStore.getModel()).getExternalId(), str2), false, 2, null);
        F4.d.clearLegacyPlayerId(lVar.preferencesService);
    }

    public final void createAndSwitchToNewUser(boolean z8, p pVar) {
        Object obj;
        String createLocalId;
        String str;
        V5.f fVar;
        com.onesignal.debug.internal.logging.b.debug$default("createAndSwitchToNewUser()", null, 2, null);
        String createLocalId2 = this.idManager.createLocalId();
        Q5.a aVar = new Q5.a();
        aVar.setOnesignalId(createLocalId2);
        com.onesignal.user.internal.properties.a aVar2 = new com.onesignal.user.internal.properties.a();
        aVar2.setOnesignalId(createLocalId2);
        if (pVar != null) {
            pVar.invoke(aVar, aVar2);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.subscriptionModelStore.list().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.h.a(((V5.d) obj).getId(), this.configModel.getPushSubscriptionId())) {
                    break;
                }
            }
        }
        V5.d dVar = (V5.d) obj;
        V5.d dVar2 = new V5.d();
        if (dVar == null || (createLocalId = dVar.getId()) == null) {
            createLocalId = this.idManager.createLocalId();
        }
        dVar2.setId(createLocalId);
        dVar2.setType(V5.g.PUSH);
        dVar2.setOptedIn(dVar != null ? dVar.getOptedIn() : true);
        if (dVar == null || (str = dVar.getAddress()) == null) {
            str = "";
        }
        dVar2.setAddress(str);
        if (dVar == null || (fVar = dVar.getStatus()) == null) {
            fVar = V5.f.NO_PERMISSION;
        }
        dVar2.setStatus(fVar);
        dVar2.setSdk(this.oneSignalUtils.getSdkVersion());
        String str2 = this.deviceOS;
        if (str2 == null) {
            str2 = "";
        }
        dVar2.setDeviceOS(str2);
        String str3 = this.carrierName;
        if (str3 == null) {
            str3 = "";
        }
        dVar2.setCarrier(str3);
        String appVersion = this.androidUtils.getAppVersion((Context) this.appContextProvider.invoke());
        dVar2.setAppVersion(appVersion != null ? appVersion : "");
        this.configModel.setPushSubscriptionId(dVar2.getId());
        arrayList.add(dVar2);
        this.subscriptionModelStore.clear("NO_PROPOGATE");
        com.onesignal.common.modeling.e.replace$default(this.identityModelStore, aVar, null, 2, null);
        com.onesignal.common.modeling.e.replace$default(this.propertiesModelStore, aVar2, null, 2, null);
        if (z8) {
            this.subscriptionModelStore.replaceAll(arrayList, "NO_PROPOGATE");
        } else {
            com.onesignal.common.modeling.b.replaceAll$default(this.subscriptionModelStore, arrayList, null, 2, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006b, code lost:
    
        if (r7 == null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean createPushSubscriptionFromLegacySync(String legacyPlayerId, JSONObject legacyUserSyncJSON, com.onesignal.core.internal.config.b configModel, V5.e subscriptionModelStore, Context appContext) {
        boolean z8;
        String safeString;
        V5.f fVar;
        String str;
        String str2;
        kotlin.jvm.internal.h.e(legacyPlayerId, "legacyPlayerId");
        kotlin.jvm.internal.h.e(legacyUserSyncJSON, "legacyUserSyncJSON");
        kotlin.jvm.internal.h.e(configModel, "configModel");
        kotlin.jvm.internal.h.e(subscriptionModelStore, "subscriptionModelStore");
        kotlin.jvm.internal.h.e(appContext, "appContext");
        Integer safeInt = com.onesignal.common.e.safeInt(legacyUserSyncJSON, "notification_types");
        V5.d dVar = new V5.d();
        dVar.setId(legacyPlayerId);
        dVar.setType(V5.g.PUSH);
        int value = V5.f.NO_PERMISSION.getValue();
        if (safeInt == null || safeInt.intValue() != value) {
            int value2 = V5.f.UNSUBSCRIBE.getValue();
            if (safeInt == null || safeInt.intValue() != value2) {
                z8 = true;
                dVar.setOptedIn(z8);
                safeString = com.onesignal.common.e.safeString(legacyUserSyncJSON, "identifier");
                if (safeString == null) {
                    safeString = "";
                }
                dVar.setAddress(safeString);
                if (safeInt != null) {
                    fVar = V5.f.Companion.fromInt(safeInt.intValue());
                }
                fVar = V5.f.SUBSCRIBED;
                dVar.setStatus(fVar);
                dVar.setSdk(com.onesignal.common.h.INSTANCE.getSdkVersion());
                str = this.deviceOS;
                if (str == null) {
                    str = "";
                }
                dVar.setDeviceOS(str);
                str2 = this.carrierName;
                if (str2 == null) {
                    str2 = "";
                }
                dVar.setCarrier(str2);
                String appVersion = AndroidUtils.INSTANCE.getAppVersion(appContext);
                dVar.setAppVersion(appVersion != null ? appVersion : "");
                configModel.setPushSubscriptionId(legacyPlayerId);
                subscriptionModelStore.add(dVar, "NO_PROPOGATE");
                return true;
            }
        }
        z8 = false;
        dVar.setOptedIn(z8);
        safeString = com.onesignal.common.e.safeString(legacyUserSyncJSON, "identifier");
        if (safeString == null) {
        }
        dVar.setAddress(safeString);
        if (safeInt != null) {
        }
        fVar = V5.f.SUBSCRIBED;
        dVar.setStatus(fVar);
        dVar.setSdk(com.onesignal.common.h.INSTANCE.getSdkVersion());
        str = this.deviceOS;
        if (str == null) {
        }
        dVar.setDeviceOS(str);
        str2 = this.carrierName;
        if (str2 == null) {
        }
        dVar.setCarrier(str2);
        String appVersion2 = AndroidUtils.INSTANCE.getAppVersion(appContext);
        dVar.setAppVersion(appVersion2 != null ? appVersion2 : "");
        configModel.setPushSubscriptionId(legacyPlayerId);
        subscriptionModelStore.add(dVar, "NO_PROPOGATE");
        return true;
    }

    public final void initUser(boolean z8) {
        if (!z8 && Q5.c.hasOneSignalId(this.identityModelStore)) {
            com.onesignal.debug.internal.logging.b.debug$default("initWithContext: using cached user " + ((Q5.a) this.identityModelStore.getModel()).getOnesignalId(), null, 2, null);
        } else {
            String legacyPlayerId = F4.d.getLegacyPlayerId(this.preferencesService);
            if (legacyPlayerId == null) {
                createNewUser();
            } else {
                migrateFromLegacyUser(legacyPlayerId);
            }
        }
    }

    public /* synthetic */ l(F4.b bVar, D4.f fVar, r4.d dVar, com.onesignal.common.d dVar2, Q5.b bVar2, com.onesignal.user.internal.properties.b bVar3, V5.e eVar, com.onesignal.core.internal.config.b bVar4, com.onesignal.common.h hVar, String str, String str2, AndroidUtils androidUtils, E7.a aVar, int i, kotlin.jvm.internal.e eVar2) {
        this(bVar, fVar, dVar, (i & 8) != 0 ? com.onesignal.common.d.INSTANCE : dVar2, bVar2, bVar3, eVar, bVar4, (i & 256) != 0 ? com.onesignal.common.h.INSTANCE : hVar, (i & 512) != 0 ? null : str, (i & 1024) != 0 ? null : str2, (i & 2048) != 0 ? AndroidUtils.INSTANCE : androidUtils, aVar);
    }
}

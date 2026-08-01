package com.icewinter.flow.winter.icecatch.data.cpp;

import com.google.android.datatransport.WinterFlowArrayHelper;
import com.google.android.datatransport.WinterFlowCloudCache;
import com.google.android.datatransport.WinterFlowDataSourceUtility;
import com.google.android.datatransport.WinterFlowRendererNode;
import com.google.android.datatransport.WinterFlowServerPlatform;
import com.icewinter.flow.winter.icecatch.data.cpp.gaming.AppAdjustId;
import com.icewinter.flow.winter.icecatch.data.cpp.gaming.AppAdjustSdkInfo;
import com.icewinter.flow.winter.icecatch.data.cpp.gaming.AppConnectionData;
import com.icewinter.flow.winter.icecatch.data.cpp.gaming.AppFirebaseId;
import com.icewinter.flow.winter.icecatch.data.cpp.gaming.AppGoogleBlankId;
import com.icewinter.flow.winter.icecatch.data.cpp.gaming.AppGoogleId;
import com.icewinter.flow.winter.icecatch.data.cpp.gaming.AppGoogleReferId;
import com.icewinter.flow.winter.icecatch.data.cpp.gaming.AppSecureKey;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class StaticIdProvider {
    public static final int $stable = 0;
    public static final StaticIdProvider INSTANCE = new StaticIdProvider();
    private static final WinterFlowCloudCache map$delegate = new WinterFlowRendererNode(new WinterFlowArrayHelper(7));

    private StaticIdProvider() {
    }

    private final Map<ID, String> getMap() {
        return (Map) map$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map map_delegate$lambda$0() {
        return WinterFlowDataSourceUtility.WinterFlowOrchestrationConfiguration(new WinterFlowServerPlatform(ID.APP_ADJUST_ID, AppAdjustId.INSTANCE.readAdjustId()), new WinterFlowServerPlatform(ID.APP_ADJUST_SDK_INFO, AppAdjustSdkInfo.INSTANCE.readSdkInfo()), new WinterFlowServerPlatform(ID.APP_CONNECTION_DATA, AppConnectionData.INSTANCE.readConnectionData()), new WinterFlowServerPlatform(ID.APP_FIREBASE_ID, AppFirebaseId.INSTANCE.readFirebaseId()), new WinterFlowServerPlatform(ID.APP_GOOGLE_BLANK_ID, AppGoogleBlankId.INSTANCE.readGoogleBlankId()), new WinterFlowServerPlatform(ID.APP_GOOGLE_ID, AppGoogleId.INSTANCE.readGoogleId()), new WinterFlowServerPlatform(ID.APP_GOOGLE_REFER_ID, AppGoogleReferId.INSTANCE.readGoogleReferId()), new WinterFlowServerPlatform(ID.APP_SECURE_KEY, AppSecureKey.INSTANCE.readSecureKey()));
    }

    public final String provide(ID id) {
        id.getClass();
        String str = getMap().get(id);
        return str == null ? "" : str;
    }
}

package com.datadog.android.core.internal.user;

import com.datadog.android.api.context.UserInfo;
import java.util.Map;
import kotlin.collections.MapsKt__MapsKt;

/* loaded from: classes4.dex */
public final class DatadogUserInfoProvider implements MutableUserInfoProvider {
    public volatile UserInfo internalUserInfo;

    @Override // com.datadog.android.core.internal.user.MutableUserInfoProvider
    public final UserInfo getUserInfo() {
        return this.internalUserInfo;
    }

    @Override // com.datadog.android.core.internal.user.MutableUserInfoProvider
    public final void setAnonymousId(String str) {
        this.internalUserInfo = UserInfo.copy$default(this.internalUserInfo, str, null, null, 30);
    }

    @Override // com.datadog.android.core.internal.user.MutableUserInfoProvider
    public final void setUserInfo(String str, Map map) {
        map.getClass();
        this.internalUserInfo = UserInfo.copy$default(this.internalUserInfo, null, str, MapsKt__MapsKt.toMap(map), 1);
    }
}

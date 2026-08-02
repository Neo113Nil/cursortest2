package com.datadog.android.core.internal.user;

import com.datadog.android.api.context.UserInfo;
import java.util.Map;

/* loaded from: classes4.dex */
public interface MutableUserInfoProvider {
    UserInfo getUserInfo();

    void setAnonymousId(String str);

    void setUserInfo(String str, Map map);
}

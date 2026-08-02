package org.chromium.support_lib_boundary;

import java.util.Set;

/* loaded from: classes2.dex */
public interface ServiceWorkerWebSettingsBoundaryInterface {
    boolean getAllowContentAccess();

    boolean getAllowFileAccess();

    boolean getBlockNetworkLoads();

    int getCacheMode();

    Set<String> getRequestedWithHeaderOriginAllowList();

    void setAllowContentAccess(boolean z6);

    void setAllowFileAccess(boolean z6);

    void setBlockNetworkLoads(boolean z6);

    void setCacheMode(int i);

    void setRequestedWithHeaderOriginAllowList(Set<String> set);
}

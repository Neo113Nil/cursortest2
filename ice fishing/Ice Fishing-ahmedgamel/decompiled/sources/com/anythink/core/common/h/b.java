package com.anythink.core.common.h;

import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATRequestingInfo;
import java.util.List;

/* loaded from: classes.dex */
public final class b extends ATRequestingInfo {

    /* renamed from: a, reason: collision with root package name */
    protected List<ATAdInfo> f14389a;

    /* renamed from: b, reason: collision with root package name */
    protected List<ATAdInfo> f14390b;

    public b(List<ATAdInfo> list, List<ATAdInfo> list2) {
        this.f14389a = list;
        this.f14390b = list2;
    }

    @Override // com.anythink.core.api.ATRequestingInfo
    public final List<ATAdInfo> getBiddingAttemptAdInfoList() {
        return this.f14390b;
    }

    @Override // com.anythink.core.api.ATRequestingInfo
    public final List<ATAdInfo> getLoadingAdInfoList() {
        return this.f14389a;
    }
}

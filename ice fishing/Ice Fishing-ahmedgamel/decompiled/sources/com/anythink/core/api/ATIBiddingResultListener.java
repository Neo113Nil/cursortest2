package com.anythink.core.api;

import java.util.Map;

/* loaded from: classes.dex */
public abstract class ATIBiddingResultListener {
    private boolean isNeedWait = false;

    public final boolean isNeedWait() {
        return this.isNeedWait;
    }

    public abstract void reportFailed(int i, String str, Map<String, Object> map);

    public abstract void reportSuccess(Map<String, Object> map);

    public final void setNeedWait(boolean z6) {
        this.isNeedWait = z6;
    }
}

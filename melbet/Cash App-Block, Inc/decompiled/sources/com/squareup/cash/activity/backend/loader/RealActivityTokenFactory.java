package com.squareup.cash.activity.backend.loader;

import app.cash.molecule.PlatformKt;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;

/* loaded from: classes.dex */
public final class RealActivityTokenFactory {
    public final SessionManager sessionManager;

    public RealActivityTokenFactory(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }

    public static ActivityToken create$default(RealActivityTokenFactory realActivityTokenFactory, ActivityTokenType activityTokenType) {
        realActivityTokenFactory.getClass();
        activityTokenType.getClass();
        return new ActivityToken(activityTokenType, "##placeholder##".equals("##placeholder##") ? PlatformKt.activeAccountToken(realActivityTokenFactory.sessionManager) : "##placeholder##", (String) null, 8);
    }
}

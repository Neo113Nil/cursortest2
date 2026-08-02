package com.squareup.cash.data.profile;

import com.squareup.cash.session.backend.SessionState;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class RealProfileSyncSetupTeardown$setup$1$1 implements Function1 {
    public static final RealProfileSyncSetupTeardown$setup$1$1 INSTANCE = new RealProfileSyncSetupTeardown$setup$1$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SessionState sessionState = (SessionState) obj;
        sessionState.getClass();
        return Boolean.valueOf(sessionState instanceof SessionState.Authenticated);
    }
}

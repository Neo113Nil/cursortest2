package com.squareup.cash.session.backend;

/* loaded from: classes.dex */
public interface SessionState {

    public interface Authenticated extends Initiated {
    }

    public interface Initiated extends SessionState {
        String getAppToken();

        String getSessionToken();
    }
}

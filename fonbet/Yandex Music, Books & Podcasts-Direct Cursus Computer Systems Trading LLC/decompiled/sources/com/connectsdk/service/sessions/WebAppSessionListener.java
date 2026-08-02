package com.connectsdk.service.sessions;

/* loaded from: classes.dex */
public interface WebAppSessionListener {
    void onReceiveMessage(WebAppSession webAppSession, Object obj);

    void onWebAppSessionDisconnect(WebAppSession webAppSession);
}

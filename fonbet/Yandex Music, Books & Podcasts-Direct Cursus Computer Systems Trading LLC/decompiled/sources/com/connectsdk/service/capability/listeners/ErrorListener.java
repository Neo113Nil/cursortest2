package com.connectsdk.service.capability.listeners;

import com.connectsdk.service.command.ServiceCommandError;

/* loaded from: classes.dex */
public interface ErrorListener {
    void onError(ServiceCommandError serviceCommandError);
}

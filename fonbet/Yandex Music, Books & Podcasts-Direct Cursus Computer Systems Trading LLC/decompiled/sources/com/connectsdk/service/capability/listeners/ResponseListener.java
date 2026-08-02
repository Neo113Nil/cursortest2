package com.connectsdk.service.capability.listeners;

/* loaded from: classes.dex */
public interface ResponseListener<T> extends ErrorListener {
    void onSuccess(T t);
}

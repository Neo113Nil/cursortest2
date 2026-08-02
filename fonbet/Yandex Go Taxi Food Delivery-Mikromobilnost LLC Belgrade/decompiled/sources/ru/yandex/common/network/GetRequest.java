package ru.yandex.common.network;

import org.apache.http.HttpEntity;

/* loaded from: classes4.dex */
public abstract class GetRequest extends Request {
    @Override // ru.yandex.common.network.Request
    public final HttpEntity getEntity() {
        return null;
    }
}

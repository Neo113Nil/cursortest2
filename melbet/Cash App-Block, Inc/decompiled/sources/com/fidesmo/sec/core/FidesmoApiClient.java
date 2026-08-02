package com.fidesmo.sec.core;

import com.google.gson.JsonObject;
import io.reactivex.rxjava3.core.Observable;

/* loaded from: classes4.dex */
public interface FidesmoApiClient {

    public enum HttpMethod {
        GET,
        POST
    }

    Observable<JsonObject> send(String str, HttpMethod httpMethod, String str2, JsonObject jsonObject);
}

package com.nimbusds.jose.util;

import com.nimbusds.jose.shaded.gson.GsonBuilder;

/* loaded from: classes5.dex */
public abstract class JSONArrayUtils {
    public static final /* synthetic */ int $r8$clinit = 0;

    static {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.strictness = 3;
        gsonBuilder.serializeNulls = true;
        gsonBuilder.objectToNumberStrategy = 3;
        gsonBuilder.escapeHtmlChars = false;
        gsonBuilder.create();
    }
}

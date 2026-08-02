package com.plaid.internal.core.crashreporting.internal.models;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/CrashContextTypeAdapter;", "Lcom/google/gson/JsonSerializer;", "Lcom/plaid/internal/core/crashreporting/internal/models/CrashContext;", "()V", "serialize", "Lcom/google/gson/JsonElement;", "src", "typeOfSrc", "Ljava/lang/reflect/Type;", "context", "Lcom/google/gson/JsonSerializationContext;", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CrashContextTypeAdapter implements JsonSerializer<CrashContext> {
    @Override // com.google.gson.JsonSerializer
    public JsonElement serialize(CrashContext src, Type typeOfSrc, JsonSerializationContext context) {
        if (src == null) {
            return new JsonObject();
        }
        Map<String, String> tags$crash_reporting_release = src.getTags$crash_reporting_release();
        if (tags$crash_reporting_release == null) {
            new JsonObject();
        }
        JsonObject jsonObject = new JsonObject();
        tags$crash_reporting_release.getClass();
        for (Map.Entry<String, String> entry : tags$crash_reporting_release.entrySet()) {
            jsonObject.addProperty(entry.getKey(), entry.getValue());
        }
        return jsonObject;
    }
}

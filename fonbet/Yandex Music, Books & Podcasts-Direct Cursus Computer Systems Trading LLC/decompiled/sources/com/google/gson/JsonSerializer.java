package com.google.gson;

import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public interface JsonSerializer<T> {
    JsonElement b(Object obj, Type type, JsonSerializationContext jsonSerializationContext);
}

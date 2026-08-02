package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import com.bugsnag.android.internal.DateUtils;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.collections.SetsKt__SetsJVMKt;

/* loaded from: classes.dex */
public final class ObjectJsonStreamer {
    public static final Set DEFAULT_REDACTED_KEYS = SetsKt__SetsJVMKt.setOf(Pattern.compile(".*password.*", 2));
    public Set redactedKeys = DEFAULT_REDACTED_KEYS;

    public final void objectToStream(Object obj, JsonStream jsonStream, boolean z) {
        if (obj == null) {
            jsonStream.nullValue();
            return;
        }
        if (obj instanceof String) {
            jsonStream.value((String) obj);
            return;
        }
        if (obj instanceof Number) {
            jsonStream.value((Number) obj);
            return;
        }
        if (obj instanceof Boolean) {
            jsonStream.value(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof JsonStream.Streamable) {
            ((JsonStream.Streamable) obj).toStream(jsonStream);
            return;
        }
        if (obj instanceof Date) {
            jsonStream.value(DateUtils.toIso8601((Date) obj));
            return;
        }
        if (!(obj instanceof Map)) {
            if (obj instanceof Collection) {
                jsonStream.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    objectToStream(it.next(), jsonStream, false);
                }
                jsonStream.endArray();
                return;
            }
            if (!obj.getClass().isArray()) {
                jsonStream.value("[OBJECT]");
                return;
            }
            jsonStream.beginArray();
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                objectToStream(Array.get(obj, i), jsonStream, false);
            }
            jsonStream.endArray();
            return;
        }
        jsonStream.beginObject();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            if (key instanceof String) {
                String str = (String) key;
                jsonStream.name(str);
                if (z) {
                    Set set = this.redactedKeys;
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        Iterator it2 = set.iterator();
                        while (it2.hasNext()) {
                            if (((Pattern) it2.next()).matcher(str).matches()) {
                                jsonStream.value("[REDACTED]");
                                break;
                            }
                        }
                    }
                }
                objectToStream(entry.getValue(), jsonStream, z);
            }
        }
        jsonStream.endObject();
    }
}

package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class zzcaj {
    public static final Logger zza = Logger.getLogger(zzcaj.class.getName());

    private zzcaj() {
    }

    public static Object zza(String str) {
        JsonReader jsonReader = new JsonReader(new StringReader(str));
        try {
            Object zzb = zzb(jsonReader);
            try {
                jsonReader.close();
                return zzb;
            } catch (IOException e) {
                zza.logp(Level.WARNING, "io.grpc.internal.JsonParser", "parse", "Failed to close", (Throwable) e);
                return zzb;
            }
        } finally {
        }
    }

    public static Object zzb(JsonReader jsonReader) {
        Trace.checkState("unexpected end of JSON", jsonReader.hasNext());
        switch (zzcai.zza[jsonReader.peek().ordinal()]) {
            case 1:
                jsonReader.beginArray();
                ArrayList arrayList = new ArrayList();
                while (jsonReader.hasNext()) {
                    arrayList.add(zzb(jsonReader));
                }
                Trace.checkState("Bad token: ".concat(String.valueOf(jsonReader.getPath())), jsonReader.peek() == JsonToken.END_ARRAY);
                jsonReader.endArray();
                break;
            case 2:
                jsonReader.beginObject();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    Trace.checkArgument("Duplicate key found: %s", nextName, !linkedHashMap.containsKey(nextName));
                    linkedHashMap.put(nextName, zzb(jsonReader));
                }
                Trace.checkState("Bad token: ".concat(String.valueOf(jsonReader.getPath())), jsonReader.peek() == JsonToken.END_OBJECT);
                jsonReader.endObject();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                jsonReader.nextNull();
                break;
            default:
                a$$ExternalSyntheticBUOutline0.m$1("Bad token: ".concat(String.valueOf(jsonReader.getPath())));
                break;
        }
        return null;
    }
}

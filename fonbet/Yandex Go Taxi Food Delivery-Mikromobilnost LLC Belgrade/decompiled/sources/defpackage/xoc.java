package defpackage;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonEncodingException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.ybsdk.rconfig.configs.PollingConfig;
import com.ybsdk.rconfig.configs.YbCommonBackoffPollingStrategyConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Result;

/* loaded from: classes9.dex */
public final class xoc extends JsonAdapter {
    public final JsonAdapter a;

    public xoc(JsonAdapter jsonAdapter) {
        this.a = jsonAdapter;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        Object failure;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            JsonReader.Token peek = jsonReader.peek();
            if ((peek == null ? -1 : woc.a[peek.ordinal()]) == 1) {
                try {
                    failure = (PollingConfig) this.a.fromJsonValue(jsonReader.readJsonValue());
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    if (!(a instanceof JsonDataException) && !(a instanceof JsonEncodingException)) {
                        throw a;
                    }
                    trp0 trp0Var = trp0.a;
                    trp0.e(new qqp0(a));
                    failure = null;
                }
                PollingConfig pollingConfig = (PollingConfig) failure;
                if (pollingConfig != null) {
                    linkedHashMap.put(nextName, pollingConfig);
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return new YbCommonBackoffPollingStrategyConfig(linkedHashMap);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        Map<String, PollingConfig> jsonValues;
        Set<Map.Entry<String, PollingConfig>> entrySet;
        YbCommonBackoffPollingStrategyConfig ybCommonBackoffPollingStrategyConfig = (YbCommonBackoffPollingStrategyConfig) obj;
        jsonWriter.beginObject();
        if (ybCommonBackoffPollingStrategyConfig == null || (jsonValues = ybCommonBackoffPollingStrategyConfig.getJsonValues()) == null || (entrySet = jsonValues.entrySet()) == null) {
            jsonWriter.nullValue();
        } else {
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                jsonWriter.name((String) entry.getKey());
                this.a.toJson(jsonWriter, (JsonWriter) entry.getValue());
            }
        }
        jsonWriter.endObject();
    }
}

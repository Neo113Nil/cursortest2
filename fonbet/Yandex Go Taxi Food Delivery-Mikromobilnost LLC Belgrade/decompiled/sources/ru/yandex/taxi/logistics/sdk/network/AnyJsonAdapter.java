package ru.yandex.taxi.logistics.sdk.network;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.yci0;
import defpackage.yl2;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007R\u001e\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\n¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/logistics/sdk/network/AnyJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/Moshi;", "", "listJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "mapAdapter", "", "stringAdapter", "", "longAdapter", "", "doubleAdapter", "Ljava/math/BigDecimal;", "bigDecimalAdapter", "", "booleanAdapter", "sdk-core-impl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AnyJsonAdapter extends JsonAdapter<Object> {
    private final JsonAdapter<BigDecimal> bigDecimalAdapter;
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Double> doubleAdapter;
    private final JsonAdapter<List<?>> listJsonAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Map<?, ?>> mapAdapter;
    private final Moshi moshi;
    private final JsonAdapter<String> stringAdapter;

    public AnyJsonAdapter(Moshi moshi) {
        this.moshi = moshi;
        this.listJsonAdapter = moshi.adapter(List.class);
        this.mapAdapter = moshi.adapter(Map.class);
        this.stringAdapter = moshi.adapter(String.class);
        this.longAdapter = moshi.adapter(Long.TYPE);
        this.doubleAdapter = moshi.adapter(Double.TYPE);
        this.bigDecimalAdapter = moshi.adapter(BigDecimal.class);
        this.booleanAdapter = moshi.adapter(Boolean.TYPE);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        JsonReader.Token peek = jsonReader.peek();
        switch (peek == null ? -1 : yl2.a[peek.ordinal()]) {
            case 1:
                return this.listJsonAdapter.fromJson(jsonReader);
            case 2:
                return this.mapAdapter.fromJson(jsonReader);
            case 3:
                return this.stringAdapter.fromJson(jsonReader);
            case 4:
                try {
                    try {
                        return this.longAdapter.fromJson(jsonReader);
                    } catch (Exception unused) {
                        return this.bigDecimalAdapter.fromJson(jsonReader);
                    }
                } catch (Exception unused2) {
                    return this.doubleAdapter.fromJson(jsonReader);
                }
            case 5:
                return this.booleanAdapter.fromJson(jsonReader);
            case 6:
                return jsonReader.nextNull();
            default:
                yci0.o("Expected a value but was ", jsonReader.peek(), " at path ", jsonReader.getPath());
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        if (r1.isAssignableFrom(r0) != false) goto L11;
     */
    @Override // com.squareup.moshi.JsonAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls.equals(Object.class)) {
            jsonWriter.beginObject();
            jsonWriter.endObject();
            return;
        }
        Moshi moshi = this.moshi;
        Class<?> cls2 = Map.class;
        if (!cls2.isAssignableFrom(cls)) {
            cls2 = Collection.class;
        }
        cls = cls2;
        moshi.adapter(cls, Util.NO_ANNOTATIONS).toJson(jsonWriter, (JsonWriter) obj);
    }

    public final String toString() {
        return "JsonAdapter(Any)";
    }
}

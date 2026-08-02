package com.nimbusds.jose.shaded.gson.internal.bind;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.shaded.gson.Gson;
import com.nimbusds.jose.shaded.gson.TypeAdapter;
import com.nimbusds.jose.shaded.gson.TypeAdapterFactory;
import com.nimbusds.jose.shaded.gson.internal.LinkedTreeMap;
import com.nimbusds.jose.shaded.gson.reflect.TypeToken;
import com.nimbusds.jose.shaded.gson.stream.JsonReader;
import com.nimbusds.jose.shaded.gson.stream.JsonWriter;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class ObjectTypeAdapter extends TypeAdapter {
    public static final AnonymousClass1 DOUBLE_FACTORY = new AnonymousClass1(1);
    public final Gson gson;
    public final int toNumberStrategy;

    /* renamed from: com.nimbusds.jose.shaded.gson.internal.bind.ObjectTypeAdapter$1, reason: invalid class name */
    public final class AnonymousClass1 implements TypeAdapterFactory {
        public final /* synthetic */ int val$toNumberStrategy;

        public AnonymousClass1(int i) {
            this.val$toNumberStrategy = i;
        }

        @Override // com.nimbusds.jose.shaded.gson.TypeAdapterFactory
        public final TypeAdapter create(Gson gson, TypeToken typeToken) {
            if (typeToken.rawType == Object.class) {
                return new ObjectTypeAdapter(gson, this.val$toNumberStrategy);
            }
            return null;
        }
    }

    public ObjectTypeAdapter(Gson gson, int i) {
        this.gson = gson;
        this.toNumberStrategy = i;
    }

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) {
        Object arrayList;
        Serializable arrayList2;
        int peek = jsonReader.peek();
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(peek);
        if (ordinal == 0) {
            jsonReader.beginArray();
            arrayList = new ArrayList();
        } else if (ordinal != 2) {
            arrayList = null;
        } else {
            jsonReader.beginObject();
            arrayList = new LinkedTreeMap(true);
        }
        if (arrayList == null) {
            return readTerminal(peek, jsonReader);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (jsonReader.hasNext()) {
                String nextName = arrayList instanceof Map ? jsonReader.nextName() : null;
                int peek2 = jsonReader.peek();
                int ordinal2 = CameraSelector$$ExternalSyntheticOutline0.ordinal(peek2);
                if (ordinal2 == 0) {
                    jsonReader.beginArray();
                    arrayList2 = new ArrayList();
                } else if (ordinal2 != 2) {
                    arrayList2 = null;
                } else {
                    jsonReader.beginObject();
                    arrayList2 = new LinkedTreeMap(true);
                }
                boolean z = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = readTerminal(peek2, jsonReader);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(nextName, arrayList2);
                }
                if (z) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    jsonReader.endArray();
                } else {
                    jsonReader.endObject();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    public final Serializable readTerminal(int i, JsonReader jsonReader) {
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i);
        if (ordinal == 5) {
            return jsonReader.nextString();
        }
        if (ordinal == 6) {
            return SVG$Unit$EnumUnboxingLocalUtility._dispatch_readNumber(this.toNumberStrategy, jsonReader);
        }
        if (ordinal == 7) {
            return Boolean.valueOf(jsonReader.nextBoolean());
        }
        if (ordinal == 8) {
            jsonReader.nextNull();
            return null;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Unexpected token: ".concat(SVG$Unit$EnumUnboxingLocalUtility.stringValueOf(i)));
        return null;
    }

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        Class<?> cls = obj.getClass();
        Gson gson = this.gson;
        gson.getClass();
        TypeAdapter adapter = gson.getAdapter(new TypeToken(cls));
        if (!(adapter instanceof ObjectTypeAdapter)) {
            adapter.write(jsonWriter, obj);
        } else {
            jsonWriter.beginObject();
            jsonWriter.endObject();
        }
    }
}

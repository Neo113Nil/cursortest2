package com.google.firebase.encoders.json;

import android.util.Base64;
import android.util.JsonWriter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class JsonValueObjectEncoderContext implements ObjectEncoderContext, ValueEncoderContext {
    public final boolean active = true;
    public final ObjectEncoder fallbackEncoder;
    public final boolean ignoreNullValues;
    public final JsonWriter jsonWriter;
    public final Map objectEncoders;
    public final Map valueEncoders;

    public JsonValueObjectEncoderContext(Writer writer, Map map, Map map2, ObjectEncoder objectEncoder, boolean z) {
        this.jsonWriter = new JsonWriter(writer);
        this.objectEncoders = map;
        this.valueEncoders = map2;
        this.fallbackEncoder = objectEncoder;
        this.ignoreNullValues = z;
    }

    public final JsonValueObjectEncoderContext add(Object obj) {
        JsonWriter jsonWriter = this.jsonWriter;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    add(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        add(entry.getValue(), (String) key);
                    } catch (ClassCastException e) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            ObjectEncoder objectEncoder = (ObjectEncoder) this.objectEncoders.get(obj.getClass());
            if (objectEncoder != null) {
                jsonWriter.beginObject();
                objectEncoder.encode(obj, this);
                jsonWriter.endObject();
                return this;
            }
            ValueEncoder valueEncoder = (ValueEncoder) this.valueEncoders.get(obj.getClass());
            if (valueEncoder != null) {
                valueEncoder.encode(obj, this);
                return this;
            }
            if (obj instanceof Enum) {
                String name = ((Enum) obj).name();
                maybeUnNest();
                jsonWriter.value(name);
                return this;
            }
            jsonWriter.beginObject();
            this.fallbackEncoder.encode(obj, this);
            jsonWriter.endObject();
            return this;
        }
        if (obj instanceof byte[]) {
            maybeUnNest();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i = 0;
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i < length) {
                jsonWriter.value(r6[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                maybeUnNest();
                jsonWriter.value(j);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                add(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                add(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final void maybeUnNest() {
        if (this.active) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, long j) {
        String str = fieldDescriptor.name;
        maybeUnNest();
        JsonWriter jsonWriter = this.jsonWriter;
        jsonWriter.name(str);
        maybeUnNest();
        jsonWriter.value(j);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, Object obj) {
        add(obj, fieldDescriptor.name);
        return this;
    }

    public final JsonValueObjectEncoderContext add(Object obj, String str) {
        boolean z = this.ignoreNullValues;
        JsonWriter jsonWriter = this.jsonWriter;
        if (z) {
            if (obj == null) {
                return this;
            }
            maybeUnNest();
            jsonWriter.name(str);
            add(obj);
            return this;
        }
        maybeUnNest();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        add(obj);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(String str) {
        maybeUnNest();
        this.jsonWriter.value(str);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(boolean z) {
        maybeUnNest();
        this.jsonWriter.value(z);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, int i) {
        String str = fieldDescriptor.name;
        maybeUnNest();
        JsonWriter jsonWriter = this.jsonWriter;
        jsonWriter.name(str);
        maybeUnNest();
        jsonWriter.value(i);
        return this;
    }
}

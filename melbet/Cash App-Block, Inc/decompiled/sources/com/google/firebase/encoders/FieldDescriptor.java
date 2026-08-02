package com.google.firebase.encoders;

import com.google.zxing.Result;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes4.dex */
public final class FieldDescriptor {
    public final String name;
    public final Map properties;

    public FieldDescriptor(String str, Map map) {
        this.name = str;
        this.properties = map;
    }

    public static Result builder(String str) {
        return new Result(str, 13);
    }

    public static FieldDescriptor of(String str) {
        return new FieldDescriptor(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FieldDescriptor)) {
            return false;
        }
        FieldDescriptor fieldDescriptor = (FieldDescriptor) obj;
        return this.name.equals(fieldDescriptor.name) && this.properties.equals(fieldDescriptor.properties);
    }

    public final Annotation getProperty(Class cls) {
        return (Annotation) this.properties.get(cls);
    }

    public final int hashCode() {
        return this.properties.hashCode() + (this.name.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.name + ", properties=" + this.properties.values() + "}";
    }
}

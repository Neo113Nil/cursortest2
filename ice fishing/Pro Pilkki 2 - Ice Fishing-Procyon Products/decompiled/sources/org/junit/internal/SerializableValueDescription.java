package org.junit.internal;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
class SerializableValueDescription implements Serializable {
    private final String value;

    private SerializableValueDescription(Object obj) {
        this.value = String.valueOf(obj);
    }

    static Object asSerializableValue(Object obj) {
        return (obj == null || (obj instanceof Serializable)) ? obj : new SerializableValueDescription(obj);
    }

    public String toString() {
        return this.value;
    }
}

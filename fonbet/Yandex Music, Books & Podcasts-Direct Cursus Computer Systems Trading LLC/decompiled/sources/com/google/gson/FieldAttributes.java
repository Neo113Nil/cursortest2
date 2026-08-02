package com.google.gson;

import java.lang.reflect.Field;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class FieldAttributes {
    public final Field a;

    public FieldAttributes(Field field) {
        Objects.requireNonNull(field);
        this.a = field;
    }

    public final String toString() {
        return this.a.toString();
    }
}

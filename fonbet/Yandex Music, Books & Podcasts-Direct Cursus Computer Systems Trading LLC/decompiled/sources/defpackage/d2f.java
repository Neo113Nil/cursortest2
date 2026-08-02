package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public enum d2f {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(nn3.class, nn3.b),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    public final Object a;

    d2f(Class cls, Serializable serializable) {
        this.a = serializable;
    }
}

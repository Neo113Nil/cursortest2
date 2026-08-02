package defpackage;

import androidx.datastore.preferences.protobuf.g;
import java.io.Serializable;

/* loaded from: classes.dex */
public enum e2f {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(g.class, g.b),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    public final Object a;

    e2f(Class cls, Serializable serializable) {
        this.a = serializable;
    }
}

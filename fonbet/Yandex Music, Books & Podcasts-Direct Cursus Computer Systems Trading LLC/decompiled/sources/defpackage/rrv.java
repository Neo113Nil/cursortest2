package defpackage;

import androidx.datastore.preferences.protobuf.g;
import java.io.Serializable;

/* loaded from: classes.dex */
public enum rrv {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(g.b),
    ENUM(null),
    MESSAGE(null);

    public final Object a;

    rrv(Serializable serializable) {
        this.a = serializable;
    }
}

package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public enum qrv {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(nn3.b),
    ENUM(null),
    MESSAGE(null);

    public final Object a;

    qrv(Serializable serializable) {
        this.a = serializable;
    }
}

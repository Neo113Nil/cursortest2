package androidx.datastore.preferences.protobuf;

import com.yandex.varioqub.config.model.ConfigValue;
import java.io.Serializable;

/* loaded from: classes.dex */
public enum B {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(C0107g.class, C0107g.f2387c),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    B(Class cls, Serializable serializable) {
    }
}

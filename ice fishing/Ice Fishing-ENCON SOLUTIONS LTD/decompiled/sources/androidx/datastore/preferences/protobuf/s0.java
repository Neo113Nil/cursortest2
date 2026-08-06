package androidx.datastore.preferences.protobuf;

import com.yandex.varioqub.config.model.ConfigValue;
import java.io.Serializable;

/* loaded from: classes.dex */
public enum s0 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(C0107g.f2387c),
    ENUM(null),
    MESSAGE(null);

    s0(Serializable serializable) {
    }
}

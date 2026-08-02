package androidx.datastore.preferences.protobuf;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;

/* loaded from: classes.dex */
public enum WireFormat$JavaType {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(RecyclerView.DECELERATION_RATE)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(ByteString$LiteralByteString.EMPTY),
    ENUM(null),
    MESSAGE(null);

    public final Object defaultDefault;

    WireFormat$JavaType(Serializable serializable) {
        this.defaultDefault = serializable;
    }
}

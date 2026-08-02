package androidx.glance.appwidget.protobuf;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;

/* loaded from: classes3.dex */
public enum JavaType {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(RecyclerView.DECELERATION_RATE)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(ByteString$LiteralByteString.class, ByteString$LiteralByteString.EMPTY),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    public final Object defaultDefault;

    JavaType(Class cls, Serializable serializable) {
        this.defaultDefault = serializable;
    }
}

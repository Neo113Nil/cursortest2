package androidx.glance.appwidget.proto;

import androidx.glance.appwidget.protobuf.Internal;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public enum LayoutProto$DimensionType implements Internal.EnumLite {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_DIMENSION_TYPE(0),
    EXACT(1),
    WRAP(2),
    FILL(3),
    EXPAND(4),
    UNRECOGNIZED(-1);

    public final int value;

    LayoutProto$DimensionType(int i) {
        this.value = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
        return 0;
    }
}

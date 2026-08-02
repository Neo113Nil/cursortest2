package androidx.glance.appwidget.proto;

import androidx.glance.appwidget.protobuf.Internal;

/* loaded from: classes3.dex */
public enum LayoutProto$ContentScale implements Internal.EnumLite {
    /* JADX INFO: Fake field, exist only in values array */
    UNSPECIFIED_CONTENT_SCALE(0),
    FIT(1),
    CROP(2),
    FILL_BOUNDS(3),
    UNRECOGNIZED(-1);

    public final int value;

    LayoutProto$ContentScale(int i) {
        this.value = i;
    }
}

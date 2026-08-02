package androidx.glance.appwidget;

import androidx.glance.appwidget.proto.LayoutProto$DimensionType;
import androidx.glance.unit.Dimension;

/* loaded from: classes3.dex */
public final class WidgetLayoutImpl31 {
    public static final WidgetLayoutImpl31 INSTANCE = new WidgetLayoutImpl31();

    public final LayoutProto$DimensionType toProto(Dimension dimension) {
        return dimension instanceof Dimension.Expand ? LayoutProto$DimensionType.EXPAND : LayoutProto$DimensionType.WRAP;
    }
}

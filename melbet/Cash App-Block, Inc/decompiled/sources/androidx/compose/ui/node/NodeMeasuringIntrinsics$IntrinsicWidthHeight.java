package androidx.compose.ui.node;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class NodeMeasuringIntrinsics$IntrinsicWidthHeight {
    public static final /* synthetic */ NodeMeasuringIntrinsics$IntrinsicWidthHeight[] $VALUES;
    public static final NodeMeasuringIntrinsics$IntrinsicWidthHeight Height;
    public static final NodeMeasuringIntrinsics$IntrinsicWidthHeight Width;

    static {
        NodeMeasuringIntrinsics$IntrinsicWidthHeight nodeMeasuringIntrinsics$IntrinsicWidthHeight = new NodeMeasuringIntrinsics$IntrinsicWidthHeight("Width", 0);
        Width = nodeMeasuringIntrinsics$IntrinsicWidthHeight;
        NodeMeasuringIntrinsics$IntrinsicWidthHeight nodeMeasuringIntrinsics$IntrinsicWidthHeight2 = new NodeMeasuringIntrinsics$IntrinsicWidthHeight("Height", 1);
        Height = nodeMeasuringIntrinsics$IntrinsicWidthHeight2;
        $VALUES = new NodeMeasuringIntrinsics$IntrinsicWidthHeight[]{nodeMeasuringIntrinsics$IntrinsicWidthHeight, nodeMeasuringIntrinsics$IntrinsicWidthHeight2};
    }

    public static NodeMeasuringIntrinsics$IntrinsicWidthHeight valueOf(String str) {
        return (NodeMeasuringIntrinsics$IntrinsicWidthHeight) Enum.valueOf(NodeMeasuringIntrinsics$IntrinsicWidthHeight.class, str);
    }

    public static NodeMeasuringIntrinsics$IntrinsicWidthHeight[] values() {
        return (NodeMeasuringIntrinsics$IntrinsicWidthHeight[]) $VALUES.clone();
    }
}

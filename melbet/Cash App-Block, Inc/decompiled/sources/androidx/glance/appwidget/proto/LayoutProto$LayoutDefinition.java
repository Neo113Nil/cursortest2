package androidx.glance.appwidget.proto;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.glance.appwidget.protobuf.GeneratedMessageLite;
import androidx.glance.appwidget.protobuf.Parser;
import androidx.glance.appwidget.protobuf.RawMessageInfo;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;

/* loaded from: classes3.dex */
public final class LayoutProto$LayoutDefinition extends GeneratedMessageLite {
    private static final LayoutProto$LayoutDefinition DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int LAYOUT_INDEX_FIELD_NUMBER = 2;
    private static volatile Parser PARSER;
    private int bitField0_;
    private int layoutIndex_;
    private LayoutProto$LayoutNode layout_;

    public final class Builder extends GeneratedMessageLite.Builder {
    }

    static {
        LayoutProto$LayoutDefinition layoutProto$LayoutDefinition = new LayoutProto$LayoutDefinition();
        DEFAULT_INSTANCE = layoutProto$LayoutDefinition;
        GeneratedMessageLite.registerDefaultInstance(LayoutProto$LayoutDefinition.class, layoutProto$LayoutDefinition);
    }

    public static void access$1100(LayoutProto$LayoutDefinition layoutProto$LayoutDefinition, LayoutProto$LayoutNode layoutProto$LayoutNode) {
        layoutProto$LayoutDefinition.getClass();
        layoutProto$LayoutNode.getClass();
        layoutProto$LayoutDefinition.layout_ = layoutProto$LayoutNode;
        layoutProto$LayoutDefinition.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) ((GeneratedMessageLite.Builder) DEFAULT_INSTANCE.dynamicMethod(5));
    }

    @Override // androidx.glance.appwidget.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(int i) {
        Parser parser;
        switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"bitField0_", "layout_", "layoutIndex_"});
            case 3:
                return new LayoutProto$LayoutDefinition();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (LayoutProto$LayoutDefinition.class) {
                    try {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser();
                            PARSER = parser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return parser;
            default:
                OptionalProvider$$ExternalSyntheticLambda0.m();
                return null;
        }
    }

    public final LayoutProto$LayoutNode getLayout() {
        LayoutProto$LayoutNode layoutProto$LayoutNode = this.layout_;
        return layoutProto$LayoutNode == null ? LayoutProto$LayoutNode.getDefaultInstance() : layoutProto$LayoutNode;
    }

    public final int getLayoutIndex() {
        return this.layoutIndex_;
    }
}

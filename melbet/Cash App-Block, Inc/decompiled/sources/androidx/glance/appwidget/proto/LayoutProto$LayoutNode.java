package androidx.glance.appwidget.proto;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.glance.appwidget.protobuf.AbstractProtobufList;
import androidx.glance.appwidget.protobuf.GeneratedMessageLite;
import androidx.glance.appwidget.protobuf.Internal;
import androidx.glance.appwidget.protobuf.Parser;
import androidx.glance.appwidget.protobuf.ProtobufArrayList;
import androidx.glance.appwidget.protobuf.RawMessageInfo;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class LayoutProto$LayoutNode extends GeneratedMessageLite {
    public static final int CHILDREN_FIELD_NUMBER = 7;
    private static final LayoutProto$LayoutNode DEFAULT_INSTANCE;
    public static final int HASACTION_FIELD_NUMBER = 9;
    public static final int HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER = 11;
    public static final int HAS_IMAGE_DESCRIPTION_FIELD_NUMBER = 10;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    public static final int HORIZONTAL_ALIGNMENT_FIELD_NUMBER = 4;
    public static final int IDENTITY_FIELD_NUMBER = 8;
    public static final int IMAGE_SCALE_FIELD_NUMBER = 6;
    private static volatile Parser PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VERTICAL_ALIGNMENT_FIELD_NUMBER = 5;
    public static final int WIDTH_FIELD_NUMBER = 2;
    private Internal.ProtobufList children_ = ProtobufArrayList.EMPTY_LIST;
    private boolean hasAction_;
    private boolean hasImageColorFilter_;
    private boolean hasImageDescription_;
    private int height_;
    private int horizontalAlignment_;
    private int identity_;
    private int imageScale_;
    private int type_;
    private int verticalAlignment_;
    private int width_;

    public final class Builder extends GeneratedMessageLite.Builder {
    }

    static {
        LayoutProto$LayoutNode layoutProto$LayoutNode = new LayoutProto$LayoutNode();
        DEFAULT_INSTANCE = layoutProto$LayoutNode;
        GeneratedMessageLite.registerDefaultInstance(LayoutProto$LayoutNode.class, layoutProto$LayoutNode);
    }

    public static void access$1900(LayoutProto$LayoutNode layoutProto$LayoutNode, LayoutProto$LayoutType layoutProto$LayoutType) {
        layoutProto$LayoutNode.getClass();
        if (layoutProto$LayoutType != LayoutProto$LayoutType.UNRECOGNIZED) {
            layoutProto$LayoutNode.type_ = layoutProto$LayoutType.value;
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
        }
    }

    public static void access$2200(LayoutProto$LayoutNode layoutProto$LayoutNode, LayoutProto$DimensionType layoutProto$DimensionType) {
        layoutProto$LayoutNode.getClass();
        layoutProto$LayoutNode.width_ = layoutProto$DimensionType.getNumber();
    }

    public static void access$2500(LayoutProto$LayoutNode layoutProto$LayoutNode, LayoutProto$DimensionType layoutProto$DimensionType) {
        layoutProto$LayoutNode.getClass();
        layoutProto$LayoutNode.height_ = layoutProto$DimensionType.getNumber();
    }

    public static void access$2800(LayoutProto$LayoutNode layoutProto$LayoutNode, LayoutProto$HorizontalAlignment layoutProto$HorizontalAlignment) {
        layoutProto$LayoutNode.getClass();
        if (layoutProto$HorizontalAlignment != LayoutProto$HorizontalAlignment.UNRECOGNIZED) {
            layoutProto$LayoutNode.horizontalAlignment_ = layoutProto$HorizontalAlignment.value;
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
        }
    }

    public static void access$3100(LayoutProto$LayoutNode layoutProto$LayoutNode, LayoutProto$VerticalAlignment layoutProto$VerticalAlignment) {
        layoutProto$LayoutNode.getClass();
        if (layoutProto$VerticalAlignment != LayoutProto$VerticalAlignment.UNRECOGNIZED) {
            layoutProto$LayoutNode.verticalAlignment_ = layoutProto$VerticalAlignment.value;
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
        }
    }

    public static void access$3400(LayoutProto$LayoutNode layoutProto$LayoutNode, LayoutProto$ContentScale layoutProto$ContentScale) {
        layoutProto$LayoutNode.getClass();
        if (layoutProto$ContentScale != LayoutProto$ContentScale.UNRECOGNIZED) {
            layoutProto$LayoutNode.imageScale_ = layoutProto$ContentScale.value;
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
        }
    }

    public static void access$3700(LayoutProto$LayoutNode layoutProto$LayoutNode) {
        layoutProto$LayoutNode.getClass();
        layoutProto$LayoutNode.identity_ = 1;
    }

    public static void access$4400(LayoutProto$LayoutNode layoutProto$LayoutNode, ArrayList arrayList) {
        Internal.ProtobufList protobufList = layoutProto$LayoutNode.children_;
        if (!((AbstractProtobufList) protobufList).isMutable) {
            int size = protobufList.size();
            layoutProto$LayoutNode.children_ = ((ProtobufArrayList) protobufList).mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        }
        List list = layoutProto$LayoutNode.children_;
        Charset charset = Internal.UTF_8;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(arrayList.size() + list.size());
        }
        int size2 = list.size();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next == null) {
                String str = "Element at index " + (list.size() - size2) + " is null.";
                for (int size3 = list.size() - 1; size3 >= size2; size3--) {
                    list.remove(size3);
                }
                a$$ExternalSyntheticBUOutline0.m$2(str);
                return;
            }
            list.add(next);
        }
    }

    public static LayoutProto$LayoutNode getDefaultInstance() {
        return DEFAULT_INSTANCE;
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
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0001\u0000\u0001\f\u0002\f\u0003\f\u0004\f\u0005\f\u0006\f\u0007\u001b\b\f\t\u0007\n\u0007\u000b\u0007", new Object[]{"type_", "width_", "height_", "horizontalAlignment_", "verticalAlignment_", "imageScale_", "children_", LayoutProto$LayoutNode.class, "identity_", "hasAction_", "hasImageDescription_", "hasImageColorFilter_"});
            case 3:
                return new LayoutProto$LayoutNode();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (LayoutProto$LayoutNode.class) {
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
}

package app.cash.redwood.yoga.internal;

import androidx.recyclerview.widget.RecyclerView;
import app.cash.redwood.yoga.internal.detail.CompactValue;
import app.cash.redwood.yoga.internal.detail.GlobalMembers;
import app.cash.redwood.yoga.internal.detail.StyleEnumFlagsKey;
import app.cash.redwood.yoga.internal.detail.Values;
import app.cash.redwood.yoga.internal.enums.YGAlign;
import app.cash.redwood.yoga.internal.enums.YGDirection;
import app.cash.redwood.yoga.internal.enums.YGDisplay;
import app.cash.redwood.yoga.internal.enums.YGFlexDirection;
import app.cash.redwood.yoga.internal.enums.YGJustify;
import app.cash.redwood.yoga.internal.enums.YGOverflow;
import app.cash.redwood.yoga.internal.enums.YGPositionType;
import app.cash.redwood.yoga.internal.enums.YGUnit;
import app.cash.redwood.yoga.internal.enums.YGWrap;
import com.squareup.cash.androidsvg.SVGAndroidRenderer;
import java.util.LinkedHashMap;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;

/* loaded from: classes3.dex */
public final class YGStyle {
    public static final int alignContentOffset;
    public static final int alignItemsOffset;
    public static final int alignSelfOffset;
    public static final int displayOffset;
    public static final int flexWrapOffset;
    public static final int flexdirectionOffset;
    public static final int justifyContentOffset;
    public static final int overflowOffset;
    public static final int positionTypeOffset;
    public final float aspectRatio;
    public final Values dimensions;
    public final LinkedHashMap flags;
    public final float flex;
    public CompactValue flexBasis;
    public float flexGrow;
    public float flexShrink;
    public final Values maxDimensions;
    public final Values minDimensions;
    public final Values margin = new Values();
    public final Values position = new Values();
    public final Values padding = new Values();
    public final Values border = new Values();

    public final class BitfieldRef {
        public final Enum[] enumValues;
        public final int offset;
        public final YGStyle style;

        public BitfieldRef(YGStyle yGStyle, int i, Enum[] enumArr) {
            yGStyle.getClass();
            enumArr.getClass();
            this.style = yGStyle;
            this.offset = i;
            this.enumValues = enumArr;
        }
    }

    static {
        int bitWidthFn = GlobalMembers.bitWidthFn(YGDirection.values());
        flexdirectionOffset = bitWidthFn;
        int bitWidthFn2 = GlobalMembers.bitWidthFn(YGFlexDirection.values()) + bitWidthFn;
        justifyContentOffset = bitWidthFn2;
        int bitWidthFn3 = GlobalMembers.bitWidthFn(YGJustify.values()) + bitWidthFn2;
        alignContentOffset = bitWidthFn3;
        int bitWidthFn4 = GlobalMembers.bitWidthFn(YGAlign.values()) + bitWidthFn3;
        alignItemsOffset = bitWidthFn4;
        int bitWidthFn5 = GlobalMembers.bitWidthFn(YGAlign.values()) + bitWidthFn4;
        alignSelfOffset = bitWidthFn5;
        int bitWidthFn6 = GlobalMembers.bitWidthFn(YGAlign.values()) + bitWidthFn5;
        positionTypeOffset = bitWidthFn6;
        int bitWidthFn7 = GlobalMembers.bitWidthFn(YGPositionType.values()) + bitWidthFn6;
        flexWrapOffset = bitWidthFn7;
        int bitWidthFn8 = GlobalMembers.bitWidthFn(YGWrap.values()) + bitWidthFn7;
        overflowOffset = bitWidthFn8;
        displayOffset = GlobalMembers.bitWidthFn(YGOverflow.values()) + bitWidthFn8;
    }

    public YGStyle() {
        YGUnit yGUnit = YGUnit.YGUnitAuto;
        float f = RecyclerView.DECELERATION_RATE;
        this.dimensions = new Values(new YGValue(RecyclerView.DECELERATION_RATE, yGUnit));
        this.minDimensions = new Values();
        this.maxDimensions = new Values();
        this.aspectRatio = Float.NaN;
        this.flex = Float.NaN;
        this.flexGrow = Float.NaN;
        this.flexShrink = Float.NaN;
        this.flexBasis = new CompactValue(new SVGAndroidRenderer(f, yGUnit));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.flags = linkedHashMap;
        ReflectionFactory reflectionFactory = Reflection.factory;
        KClass orCreateKotlinClass = reflectionFactory.getOrCreateKotlinClass(YGAlign.class);
        linkedHashMap.put(new StyleEnumFlagsKey(alignContentOffset, orCreateKotlinClass), YGAlign.YGAlignFlexStart);
        KClass orCreateKotlinClass2 = reflectionFactory.getOrCreateKotlinClass(YGAlign.class);
        linkedHashMap.put(new StyleEnumFlagsKey(alignItemsOffset, orCreateKotlinClass2), YGAlign.YGAlignStretch);
    }

    public final YGAlign alignContent() {
        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(YGAlign.class);
        YGAlign[] values = YGAlign.values();
        values.getClass();
        LinkedHashMap linkedHashMap = this.flags;
        linkedHashMap.getClass();
        Object obj = linkedHashMap.get(new StyleEnumFlagsKey(alignContentOffset, orCreateKotlinClass));
        if (obj == null) {
            obj = ArraysKt___ArraysKt.first(values);
        }
        obj.getClass();
        return (YGAlign) ((Enum) obj);
    }

    public final YGAlign alignItems() {
        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(YGAlign.class);
        YGAlign[] values = YGAlign.values();
        values.getClass();
        LinkedHashMap linkedHashMap = this.flags;
        linkedHashMap.getClass();
        Object obj = linkedHashMap.get(new StyleEnumFlagsKey(alignItemsOffset, orCreateKotlinClass));
        if (obj == null) {
            obj = ArraysKt___ArraysKt.first(values);
        }
        obj.getClass();
        return (YGAlign) ((Enum) obj);
    }

    public final YGAlign alignSelf() {
        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(YGAlign.class);
        YGAlign[] values = YGAlign.values();
        values.getClass();
        LinkedHashMap linkedHashMap = this.flags;
        linkedHashMap.getClass();
        Object obj = linkedHashMap.get(new StyleEnumFlagsKey(alignSelfOffset, orCreateKotlinClass));
        if (obj == null) {
            obj = ArraysKt___ArraysKt.first(values);
        }
        obj.getClass();
        return (YGAlign) ((Enum) obj);
    }

    public final YGDirection direction() {
        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(YGDirection.class);
        YGDirection[] values = YGDirection.values();
        values.getClass();
        LinkedHashMap linkedHashMap = this.flags;
        linkedHashMap.getClass();
        Object obj = linkedHashMap.get(new StyleEnumFlagsKey(0, orCreateKotlinClass));
        if (obj == null) {
            obj = ArraysKt___ArraysKt.first(values);
        }
        obj.getClass();
        return (YGDirection) ((Enum) obj);
    }

    public final YGDisplay display() {
        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(YGDisplay.class);
        YGDisplay[] values = YGDisplay.values();
        values.getClass();
        LinkedHashMap linkedHashMap = this.flags;
        linkedHashMap.getClass();
        Object obj = linkedHashMap.get(new StyleEnumFlagsKey(displayOffset, orCreateKotlinClass));
        if (obj == null) {
            obj = ArraysKt___ArraysKt.first(values);
        }
        obj.getClass();
        return (YGDisplay) ((Enum) obj);
    }

    public final YGFlexDirection flexDirection() {
        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(YGFlexDirection.class);
        YGFlexDirection[] values = YGFlexDirection.values();
        values.getClass();
        LinkedHashMap linkedHashMap = this.flags;
        linkedHashMap.getClass();
        Object obj = linkedHashMap.get(new StyleEnumFlagsKey(flexdirectionOffset, orCreateKotlinClass));
        if (obj == null) {
            obj = ArraysKt___ArraysKt.first(values);
        }
        obj.getClass();
        return (YGFlexDirection) ((Enum) obj);
    }

    public final YGWrap flexWrap() {
        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(YGWrap.class);
        YGWrap[] values = YGWrap.values();
        values.getClass();
        LinkedHashMap linkedHashMap = this.flags;
        linkedHashMap.getClass();
        Object obj = linkedHashMap.get(new StyleEnumFlagsKey(flexWrapOffset, orCreateKotlinClass));
        if (obj == null) {
            obj = ArraysKt___ArraysKt.first(values);
        }
        obj.getClass();
        return (YGWrap) ((Enum) obj);
    }

    public final YGJustify justifyContent() {
        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(YGJustify.class);
        YGJustify[] values = YGJustify.values();
        values.getClass();
        LinkedHashMap linkedHashMap = this.flags;
        linkedHashMap.getClass();
        Object obj = linkedHashMap.get(new StyleEnumFlagsKey(justifyContentOffset, orCreateKotlinClass));
        if (obj == null) {
            obj = ArraysKt___ArraysKt.first(values);
        }
        obj.getClass();
        return (YGJustify) ((Enum) obj);
    }

    public final YGOverflow overflow() {
        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(YGOverflow.class);
        YGOverflow[] values = YGOverflow.values();
        values.getClass();
        LinkedHashMap linkedHashMap = this.flags;
        linkedHashMap.getClass();
        Object obj = linkedHashMap.get(new StyleEnumFlagsKey(overflowOffset, orCreateKotlinClass));
        if (obj == null) {
            obj = ArraysKt___ArraysKt.first(values);
        }
        obj.getClass();
        return (YGOverflow) ((Enum) obj);
    }

    public final YGPositionType positionType() {
        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(YGPositionType.class);
        YGPositionType[] values = YGPositionType.values();
        values.getClass();
        LinkedHashMap linkedHashMap = this.flags;
        linkedHashMap.getClass();
        Object obj = linkedHashMap.get(new StyleEnumFlagsKey(positionTypeOffset, orCreateKotlinClass));
        if (obj == null) {
            obj = ArraysKt___ArraysKt.first(values);
        }
        obj.getClass();
        return (YGPositionType) ((Enum) obj);
    }
}
